package fossils.fossils.client.blockentity.model.polacanthus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PolacanthusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms17;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg4;
	private final ModelPart rightleg5;
	private final ModelPart rightleg6;
	private final ModelPart rightfoot3;
	private final ModelPart rightfoot4;
	private final ModelPart backPlates3;
	private final ModelPart backPlates6;
	private final ModelPart body;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms16;
	private final ModelPart chest;
	private final ModelPart backPlates;
	private final ModelPart backPlates4;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms15;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms14;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
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
	private final ModelPart osteoderms18;
	private final ModelPart osteoderms7;
	private final ModelPart tail2;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms19;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms20;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms21;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms22;

	public PolacanthusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms6 = this.hips.getChild("osteoderms6");
		this.osteoderms17 = this.hips.getChild("osteoderms17");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg4 = this.hips.getChild("rightleg4");
		this.rightleg5 = this.rightleg4.getChild("rightleg5");
		this.rightleg6 = this.rightleg5.getChild("rightleg6");
		this.rightfoot3 = this.rightleg6.getChild("rightfoot3");
		this.rightfoot4 = this.rightfoot3.getChild("rightfoot4");
		this.backPlates3 = this.hips.getChild("backPlates3");
		this.backPlates6 = this.hips.getChild("backPlates6");
		this.body = this.hips.getChild("body");
		this.osteoderms5 = this.body.getChild("osteoderms5");
		this.osteoderms16 = this.body.getChild("osteoderms16");
		this.chest = this.body.getChild("chest");
		this.backPlates = this.chest.getChild("backPlates");
		this.backPlates4 = this.chest.getChild("backPlates4");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms14 = this.neck3.getChild("osteoderms14");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms13 = this.neck2.getChild("osteoderms13");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms18 = this.tail.getChild("osteoderms18");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms19 = this.tail2.getChild("osteoderms19");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms20 = this.tail3.getChild("osteoderms20");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms21 = this.tail4.getChild("osteoderms21");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms22 = this.tail5.getChild("osteoderms22");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -10.9F, 6.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 84).addBox(0.5F, -1.9106F, -5.0576F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -0.5338F, -7.0284F, 13.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 19).addBox(-6.0F, -0.6303F, -0.0543F, 13.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.8F, -1.5F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 68).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 78).mirror().addBox(0.9189F, -4.2568F, 0.3365F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.6805F, -0.2751F, -0.1576F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 100).mirror().addBox(-0.0809F, -3.6405F, -1.3386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.3435F, 0.697F, -0.6542F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 72).mirror().addBox(-0.908F, -3.8069F, -4.7978F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1872F, 0.2273F, -0.5419F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-2.3769F, -3.7813F, -7.7721F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1826F, 0.0557F, -0.5095F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(106, 112).mirror().addBox(0.798F, -3.653F, -6.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1966F, 0.3815F, -0.5733F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-2.6775F, -3.794F, -0.6057F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.418F, 0.0474F, -0.35F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-2.7869F, -4.2568F, 0.5627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.684F, 0.2897F, -0.603F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-1.3997F, -4.2568F, 1.1152F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.6504F, 0.0005F, -0.3745F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 71).mirror().addBox(-0.9584F, 1.1072F, 2.0987F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.4499F, 0.0397F, -0.8241F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5564F, -2.7896F, 0.7617F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, -0.3291F, -0.0553F, -0.1911F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 88).mirror().addBox(-2.804F, -0.0347F, 1.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(-6.9871F, 0.2176F, -0.4376F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4871F, 0.5236F, -0.0968F, -0.2965F, 0.0071F, 0.1301F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-5.996F, 0.0347F, -2.4997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 16).mirror().addBox(-8.0023F, 0.0417F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0174F, 0.0012F, 0.0698F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-9.0023F, 0.0417F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0174F, 0.0012F, 0.0698F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(116, 41).mirror().addBox(-0.6404F, 0.6027F, 1.4915F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.6488F, -0.0021F, -0.4599F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.8773F, 2.8685F, 4.3121F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, -0.0388F, 0.0397F, -0.8241F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 68).mirror().addBox(-0.1257F, 1.4115F, 1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.2652F, -0.1565F, -0.8636F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.1257F, -0.9123F, 0.7533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.4223F, -0.1565F, -0.8636F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 78).addBox(-2.9189F, -4.2568F, 0.3365F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.6805F, 0.2751F, 0.1576F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 100).addBox(-1.9191F, -3.6405F, -1.3386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.3435F, -0.697F, 0.6542F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(23, 72).addBox(-1.092F, -3.8069F, -4.7978F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1872F, -0.2273F, 0.5419F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(27, 39).addBox(0.3769F, -3.7813F, -7.7721F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1826F, -0.0557F, 0.5095F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(106, 112).addBox(-1.798F, -3.653F, -6.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1966F, -0.3815F, 0.5733F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 45).addBox(-2.3225F, -3.794F, -0.6057F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.418F, -0.0474F, 0.35F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 98).addBox(1.7869F, -4.2568F, 0.5627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.684F, -0.2897F, 0.603F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 102).addBox(-0.6003F, -4.2568F, 1.1152F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.6504F, -0.0005F, 0.3745F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 71).addBox(-0.0416F, 1.1072F, 2.0987F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.4499F, -0.0397F, 0.8241F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 54).addBox(-0.4436F, -2.7896F, 0.7617F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, -0.3291F, 0.0553F, 0.1911F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 88).addBox(-2.196F, -0.0347F, 1.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 45).addBox(-0.0129F, 0.2176F, -0.4376F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4871F, 0.5236F, -0.0968F, -0.2965F, -0.0071F, -0.1301F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 41).addBox(-2.004F, 0.0347F, -2.4997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 16).addBox(0.0023F, 0.0417F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0174F, -0.0012F, -0.0698F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 39).addBox(0.0023F, 0.0417F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0174F, -0.0012F, -0.0698F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(116, 41).addBox(-0.3596F, 0.6027F, 1.4915F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.6488F, 0.0021F, 0.4599F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 19).addBox(-0.1227F, 2.8685F, 4.3121F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, -0.0388F, -0.0397F, 0.8241F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 68).addBox(-0.8743F, 1.4115F, 1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.2652F, 0.1565F, 0.8636F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(34, 0).addBox(-0.8743F, -0.9123F, 0.7533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.4223F, 0.1565F, 0.8636F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(82, 96).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(8, 85).addBox(0.48F, -1.717F, -0.192F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = hips.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, -14.066F, -8.4611F, -0.3499F, -0.0656F, 0.0239F));

		PartDefinition cube_r45 = osteoderms6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 63).addBox(-1.6208F, -0.4681F, -0.8163F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.83F, 10.751F, 16.3039F, 0.2122F, 0.5912F, -0.0152F));

		PartDefinition cube_r46 = osteoderms6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(104, 69).addBox(-1.4446F, -0.4559F, -0.1748F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.83F, 10.751F, 16.3039F, 0.134F, -0.2264F, -0.1328F));

		PartDefinition cube_r47 = osteoderms6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 55).addBox(-1.3948F, -0.4559F, -1.0504F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.83F, 10.751F, 16.3039F, 0.1563F, -0.5805F, -0.1888F));

		PartDefinition cube_r48 = osteoderms6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(102, 102).addBox(-0.6602F, -0.4204F, -1.8733F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.83F, 10.751F, 16.3039F, 0.088F, 0.4978F, -0.0187F));

		PartDefinition cube_r49 = osteoderms6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(87, 78).addBox(-1.9283F, -0.5517F, -2.1629F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.83F, 10.751F, 16.3039F, 0.1329F, -0.2616F, -0.1349F));

		PartDefinition cube_r50 = osteoderms6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(83, 87).addBox(-1.8474F, -0.5526F, -2.2045F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(3.0653F, 12.6621F, 9.5263F, 0.3823F, 0.0707F, -0.0191F));

		PartDefinition cube_r51 = osteoderms6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(102, 16).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(3.0984F, 12.9202F, 9.0354F, 0.4872F, 0.7611F, 0.3605F));

		PartDefinition cube_r52 = osteoderms6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(105, 5).addBox(-1.3313F, -0.4566F, -1.1155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.0653F, 12.6621F, 9.5263F, 0.3933F, -0.2273F, -0.1437F));

		PartDefinition cube_r53 = osteoderms6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(104, 97).addBox(-1.3623F, -0.4566F, -0.2136F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0653F, 12.6621F, 9.5263F, 0.3849F, 0.1043F, -0.0083F));

		PartDefinition cube_r54 = osteoderms6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 58).addBox(-1.5365F, -0.4669F, -0.7822F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(3.0653F, 12.6621F, 9.5263F, 0.6519F, 0.8453F, 0.4192F));

		PartDefinition cube_r55 = osteoderms6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 25).addBox(-1.6441F, -0.5645F, -1.6886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.7266F, 11.604F, 12.7764F, 0.2778F, 0.061F, -0.0958F));

		PartDefinition cube_r56 = osteoderms6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 39).addBox(-1.2861F, -0.5406F, -0.5906F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.7266F, 11.604F, 12.7764F, 0.3515F, 0.4757F, 0.0035F));

		PartDefinition cube_r57 = osteoderms6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(105, 43).addBox(-1.1667F, -0.4676F, 0.0094F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7266F, 11.604F, 12.7764F, 0.28F, 0.0956F, -0.0886F));

		PartDefinition cube_r58 = osteoderms6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 21).addBox(-1.0699F, -0.4676F, -0.9752F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.7266F, 11.604F, 12.7764F, 0.2877F, -0.2482F, -0.1886F));

		PartDefinition cube_r59 = osteoderms6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 82).addBox(-0.8994F, -0.5406F, -1.593F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.7266F, 11.604F, 12.7764F, 0.3563F, 0.5003F, 0.0137F));

		PartDefinition cube_r60 = osteoderms6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 73).addBox(-1.6214F, -0.3597F, -3.8949F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.2466F, 10.4305F, 20.7198F, 0.0399F, -0.6902F, 0.0696F));

		PartDefinition cube_r61 = osteoderms6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(96, 28).addBox(-0.7793F, -0.3002F, -0.9203F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.2466F, 10.4305F, 20.7198F, 0.1024F, -1.2651F, -0.0026F));

		PartDefinition cube_r62 = osteoderms6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(96, 8).addBox(-2.8078F, -0.3345F, -0.2683F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.2466F, 10.4305F, 20.7198F, 0.0313F, -0.1757F, 0.0896F));

		PartDefinition cube_r63 = osteoderms6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(19, 89).addBox(-3.784F, -0.3376F, -1.5344F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2466F, 10.4305F, 20.7198F, 3.0477F, -1.2366F, -2.9578F));

		PartDefinition osteoderms17 = hips.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -14.066F, -8.4611F, -0.3499F, 0.0656F, -0.0239F));

		PartDefinition cube_r64 = osteoderms17.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-0.3792F, -0.4681F, -0.8163F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.83F, 10.751F, 16.3039F, 0.2122F, -0.5912F, 0.0152F));

		PartDefinition cube_r65 = osteoderms17.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(104, 69).mirror().addBox(-2.5554F, -0.4559F, -0.1748F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.83F, 10.751F, 16.3039F, 0.134F, 0.2264F, 0.1328F));

		PartDefinition cube_r66 = osteoderms17.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-2.6052F, -0.4559F, -1.0504F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.83F, 10.751F, 16.3039F, 0.1563F, 0.5805F, 0.1888F));

		PartDefinition cube_r67 = osteoderms17.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 102).mirror().addBox(-1.3398F, -0.4204F, -1.8733F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.83F, 10.751F, 16.3039F, 0.088F, -0.4978F, 0.0187F));

		PartDefinition cube_r68 = osteoderms17.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(87, 78).mirror().addBox(-0.0717F, -0.5517F, -2.1629F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.83F, 10.751F, 16.3039F, 0.1329F, 0.2616F, 0.1349F));

		PartDefinition cube_r69 = osteoderms17.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.1526F, -0.5526F, -2.2045F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-3.0653F, 12.6621F, 9.5263F, 0.3823F, -0.0707F, 0.0191F));

		PartDefinition cube_r70 = osteoderms17.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(102, 16).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-3.0984F, 12.9202F, 9.0354F, 0.4872F, -0.7611F, -0.3605F));

		PartDefinition cube_r71 = osteoderms17.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(105, 5).mirror().addBox(-2.6687F, -0.4566F, -1.1155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.0653F, 12.6621F, 9.5263F, 0.3933F, 0.2273F, 0.1437F));

		PartDefinition cube_r72 = osteoderms17.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(104, 97).mirror().addBox(-2.6377F, -0.4566F, -0.2136F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0653F, 12.6621F, 9.5263F, 0.3849F, -0.1043F, 0.0083F));

		PartDefinition cube_r73 = osteoderms17.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.4635F, -0.4669F, -0.7822F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-3.0653F, 12.6621F, 9.5263F, 0.6519F, -0.8453F, -0.4192F));

		PartDefinition cube_r74 = osteoderms17.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 25).mirror().addBox(-0.3559F, -0.5645F, -1.6886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.7266F, 11.604F, 12.7764F, 0.2778F, -0.061F, 0.0958F));

		PartDefinition cube_r75 = osteoderms17.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-0.7139F, -0.5406F, -0.5906F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.7266F, 11.604F, 12.7764F, 0.3515F, -0.4757F, -0.0035F));

		PartDefinition cube_r76 = osteoderms17.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(-2.8333F, -0.4676F, 0.0094F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7266F, 11.604F, 12.7764F, 0.28F, -0.0956F, 0.0886F));

		PartDefinition cube_r77 = osteoderms17.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(105, 21).mirror().addBox(-2.9301F, -0.4676F, -0.9752F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7266F, 11.604F, 12.7764F, 0.2877F, 0.2482F, 0.1886F));

		PartDefinition cube_r78 = osteoderms17.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(100, 82).mirror().addBox(-1.1006F, -0.5406F, -1.593F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.7266F, 11.604F, 12.7764F, 0.3563F, -0.5003F, -0.0137F));

		PartDefinition cube_r79 = osteoderms17.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 73).mirror().addBox(-0.3786F, -0.3597F, -3.8949F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.2466F, 10.4305F, 20.7198F, 0.0399F, 0.6902F, -0.0696F));

		PartDefinition cube_r80 = osteoderms17.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-3.2207F, -0.3002F, -0.9203F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.2466F, 10.4305F, 20.7198F, 0.1024F, 1.2651F, 0.0026F));

		PartDefinition cube_r81 = osteoderms17.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-1.1922F, -0.3345F, -0.2683F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.2466F, 10.4305F, 20.7198F, 0.0313F, 0.1757F, -0.0896F));

		PartDefinition cube_r82 = osteoderms17.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-1.216F, -0.3376F, -1.5344F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2466F, 10.4305F, 20.7198F, 3.0477F, 1.2366F, 2.9578F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(31, 90).addBox(-1.5F, 8.175F, -3.9828F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.4F, 1.4999F, -0.1448F, -0.9556F, -0.443F, 0.0576F));

		PartDefinition cube_r83 = leftleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 84).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 82).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(13, 116).addBox(-0.1F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(99, 51).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(77, 107).addBox(-1.0F, -1.5069F, -1.3912F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 5.2861F, 3.3792F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(57, 42).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftleg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(113, 114).addBox(-0.601F, -1.7989F, 0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftleg3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(103, 93).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(14, 33).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(84, 50).addBox(-1.999F, -0.5853F, -2.8254F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 1.3439F, 0.0F, 0.0F));

		PartDefinition rightleg4 = hips.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(31, 90).mirror().addBox(-1.5F, 8.175F, -3.9828F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 1.4999F, -0.1448F, -0.8568F, 0.6498F, 0.2463F));

		PartDefinition cube_r92 = rightleg4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightleg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightleg5 = rightleg4.addOrReplaceChild("rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 0.8555F, -0.1996F, 0.1706F));

		PartDefinition cube_r94 = rightleg5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 82).mirror().addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightleg5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(13, 116).mirror().addBox(-0.9F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightleg5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightleg5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(-1.0F, -1.5069F, -1.3912F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 5.2861F, 3.3792F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightleg5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightleg5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(113, 114).mirror().addBox(-0.399F, -1.7989F, 0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightleg6 = rightleg5.addOrReplaceChild("rightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -1.111F, 0.2613F, -0.4072F));

		PartDefinition cube_r100 = rightleg6.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(14, 33).mirror().addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot3 = rightleg6.addOrReplaceChild("rightfoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot4 = rightfoot3.addOrReplaceChild("rightfoot4", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-2.001F, -0.5853F, -2.8254F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 1.3439F, 0.0F, 0.0F));

		PartDefinition backPlates3 = hips.addOrReplaceChild("backPlates3", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1F, -14.7511F, -8.4674F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r101 = backPlates3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 22).addBox(-1.0F, -0.2F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0656F, 16.6593F, 13.1332F, -0.3139F, 0.2046F, 1.1821F));

		PartDefinition cube_r102 = backPlates3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(79, 60).addBox(-3.9654F, -1.0378F, -1.4574F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1408F, 16.1839F, 12.6565F, -0.4414F, 0.1343F, 0.6608F));

		PartDefinition cube_r103 = backPlates3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(80, 102).addBox(-4.6868F, -1.1398F, -0.0558F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5484F, 19.2331F, 7.1321F, -0.0313F, 0.0492F, 1.392F));

		PartDefinition cube_r104 = backPlates3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 54).addBox(-4.5725F, -1.2528F, -10.9478F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5484F, 19.2331F, 10.1321F, 0.1994F, 0.0381F, 1.4787F));

		PartDefinition cube_r105 = backPlates3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(64, 0).addBox(-0.2047F, -0.5794F, -0.1805F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2123F, 11.9228F, 7.1697F, -0.0986F, 0.1849F, 0.5588F));

		PartDefinition cube_r106 = backPlates3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(46, 7).addBox(-0.013F, -0.7578F, -3.5799F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.796F, 11.9419F, 3.6967F, 0.1348F, 0.1822F, 0.5942F));

		PartDefinition backPlates6 = hips.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1F, -14.7511F, -8.4674F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r107 = backPlates6.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-1.0F, -0.2F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0656F, 16.6593F, 13.1332F, -0.3139F, -0.2046F, -1.1821F));

		PartDefinition cube_r108 = backPlates6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(-0.0346F, -1.0378F, -1.4574F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1408F, 16.1839F, 12.6565F, -0.4414F, -0.1343F, -0.6608F));

		PartDefinition cube_r109 = backPlates6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 102).mirror().addBox(2.6868F, -1.1398F, -0.0558F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5484F, 19.2331F, 7.1321F, -0.0313F, -0.0492F, -1.392F));

		PartDefinition cube_r110 = backPlates6.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(2.5725F, -1.2528F, -10.9478F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5484F, 19.2331F, 10.1321F, 0.1994F, -0.0381F, -1.4787F));

		PartDefinition cube_r111 = backPlates6.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-4.7953F, -0.5794F, -0.1805F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2123F, 11.9228F, 7.1697F, -0.0986F, -0.1849F, -0.5588F));

		PartDefinition cube_r112 = backPlates6.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-4.987F, -0.7578F, -3.5799F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.796F, 11.9419F, 3.6967F, 0.1348F, -0.1822F, -0.5942F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -9.3F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 78).addBox(0.5F, -1.9278F, -0.0823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 89).addBox(0.5F, -2.1248F, 3.8203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 90).addBox(0.5F, -1.9918F, 1.8215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 34).addBox(0.5F, -1.8918F, -0.1785F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 43).addBox(0.0F, 0.0082F, -0.1785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 10).addBox(-6.0F, -0.1414F, 0.1585F, 13.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4998F, -6.0586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(-6.7777F, 0.355F, 5.9009F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.052F, 0.0059F, 0.1133F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-8.3667F, -4.1794F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0432F, -0.0296F, -0.6015F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(68, 48).mirror().addBox(-5.2623F, -8.7655F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0113F, -0.0511F, -1.3523F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-6.719F, 0.8698F, 3.8747F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0347F, -0.004F, 0.1134F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 46).mirror().addBox(-8.6603F, -3.7522F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0288F, 0.0198F, -0.6019F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-7.7684F, -8.6533F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0076F, 0.0341F, -1.3525F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 80).mirror().addBox(-6.6867F, 1.1538F, 1.7833F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1734F, -0.0197F, 0.1117F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(-8.8233F, -3.5151F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1443F, 0.0985F, -0.595F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-10.0493F, -8.5911F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0381F, 0.1704F, -1.3494F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-6.683F, 1.1039F, -0.3359F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.295F, -0.0325F, 0.126F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(12, 61).mirror().addBox(-8.7897F, -3.5476F, -0.3033F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.2465F, 0.1669F, -0.5641F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(-10.0025F, -8.5919F, -0.3033F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0655F, 0.2896F, -1.3257F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(99, 57).addBox(0.7777F, 0.355F, 5.9009F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.052F, -0.0059F, -0.1133F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 60).addBox(5.3667F, -4.1794F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0432F, 0.0296F, 0.6015F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 48).addBox(3.2623F, -8.7655F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0113F, 0.0511F, 1.3523F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 63).addBox(0.719F, 0.8698F, 3.8747F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0347F, 0.004F, -0.1134F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 46).addBox(5.6603F, -3.7522F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0288F, -0.0198F, 0.6019F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(106, 34).addBox(3.7684F, -8.6533F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0076F, -0.0341F, 1.3525F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(96, 80).addBox(0.6867F, 1.1538F, 1.7833F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1734F, 0.0197F, -0.1117F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 70).addBox(5.8233F, -3.5151F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1443F, -0.0985F, 0.595F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 65).addBox(4.0493F, -8.5911F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0381F, -0.1704F, 1.3494F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 0).addBox(0.683F, 1.1039F, -0.3359F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.295F, 0.0325F, -0.126F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(12, 61).addBox(5.7897F, -3.5476F, -0.3033F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.2465F, -0.1669F, 0.5641F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(68, 20).addBox(4.0025F, -8.5919F, -0.3033F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0655F, -0.2896F, 1.3257F));

		PartDefinition osteoderms5 = body.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -11.9308F, -4.1488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r141 = osteoderms5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(112, 57).addBox(0.9695F, 10.1786F, 7.6337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4214F, 0.5283F, -4.6971F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r142 = osteoderms5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(59, 71).addBox(1.2695F, 11.6816F, -2.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.206F, -1.2082F, 0.6851F, 0.2215F, 0.0331F, 0.1932F));

		PartDefinition cube_r143 = osteoderms5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(118, 6).addBox(11.1855F, 1.8737F, 2.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(118, 60).addBox(11.1855F, 1.8737F, 0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(100, 16).addBox(11.1855F, 1.8737F, -1.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7234F, 2.6424F, 0.5212F, 0.3008F, -0.1132F, 1.1907F));

		PartDefinition cube_r144 = osteoderms5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 0).addBox(-3.406F, -0.3661F, -2.0749F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.6608F, 16.3002F, 4.4812F, 0.2278F, 0.0461F, 0.0834F));

		PartDefinition cube_r145 = osteoderms5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(96, 76).addBox(-2.0F, -0.5F, -1.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(8.8228F, 16.2527F, 5.2842F, 0.2482F, 0.4294F, 0.1331F));

		PartDefinition cube_r146 = osteoderms5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(89, 66).addBox(-4.5F, -0.5F, -0.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.8412F, 16.6232F, 3.9144F, 0.2688F, -0.5716F, -0.12F));

		PartDefinition cube_r147 = osteoderms5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(96, 47).addBox(-3.7F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(10.6654F, 14.7946F, 7.8439F, 0.241F, -0.3605F, -0.0585F));

		PartDefinition cube_r148 = osteoderms5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(99, 102).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.8952F, 9.9998F, 5.9148F, 0.1255F, 0.1675F, 0.3211F));

		PartDefinition cube_r149 = osteoderms5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(92, 107).addBox(-0.9047F, -0.263F, 0.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9506F, 10.484F, 5.1211F, 0.4421F, 0.1888F, 0.3002F));

		PartDefinition cube_r150 = osteoderms5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(99, 112).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5455F, 10.1683F, 3.8464F, 0.1389F, 0.0806F, 0.352F));

		PartDefinition cube_r151 = osteoderms5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(27, 118).addBox(-0.6113F, -0.0071F, -1.4165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9597F, 9.26F, 4.119F, 0.6934F, 0.1063F, 0.3374F));

		PartDefinition cube_r152 = osteoderms5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(103, 59).addBox(-1.5F, -0.5F, -1.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(8.8862F, 14.5676F, 8.6169F, 0.2661F, 0.5561F, 0.1709F));

		PartDefinition cube_r153 = osteoderms5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(34, 73).addBox(-3.606F, -0.3661F, -1.8749F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(10.5608F, 14.7002F, 7.9812F, 0.2278F, 0.0461F, 0.0834F));

		PartDefinition cube_r154 = osteoderms5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(111, 105).addBox(6.7022F, 9.6412F, 0.8873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 100).addBox(6.7022F, 9.6412F, -2.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1532F, -0.1216F, 0.89F, 0.2274F, 0.0093F, 0.4715F));

		PartDefinition cube_r155 = osteoderms5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 87).addBox(-0.5093F, -0.2745F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.977F, 12.1803F, 1.0261F, 0.6987F, 0.0093F, 0.4715F));

		PartDefinition osteoderms16 = body.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -11.9308F, -4.1488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r156 = osteoderms16.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(-1.9695F, 10.1786F, 7.6337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4214F, 0.5283F, -4.6971F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r157 = osteoderms16.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-2.2695F, 11.6816F, -2.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.206F, -1.2082F, 0.6851F, 0.2215F, -0.0331F, -0.1932F));

		PartDefinition cube_r158 = osteoderms16.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(118, 6).mirror().addBox(-12.1855F, 1.8737F, 2.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(118, 60).mirror().addBox(-12.1855F, 1.8737F, 0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(100, 16).mirror().addBox(-12.1855F, 1.8737F, -1.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7234F, 2.6424F, 0.5212F, 0.3008F, 0.1132F, -1.1907F));

		PartDefinition cube_r159 = osteoderms16.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(0.406F, -0.3661F, -2.0749F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-9.6608F, 16.3002F, 4.4812F, 0.2278F, -0.0461F, -0.0834F));

		PartDefinition cube_r160 = osteoderms16.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(96, 76).mirror().addBox(-2.0F, -0.5F, -1.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-8.8228F, 16.2527F, 5.2842F, 0.2482F, -0.4294F, -0.1331F));

		PartDefinition cube_r161 = osteoderms16.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-0.5F, -0.5F, -0.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-10.8412F, 16.6232F, 3.9144F, 0.2688F, 0.5716F, 0.12F));

		PartDefinition cube_r162 = osteoderms16.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(96, 47).mirror().addBox(-0.3F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-10.6654F, 14.7946F, 7.8439F, 0.241F, 0.3605F, 0.0585F));

		PartDefinition cube_r163 = osteoderms16.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(99, 102).mirror().addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8952F, 9.9998F, 5.9148F, 0.1255F, -0.1675F, -0.3211F));

		PartDefinition cube_r164 = osteoderms16.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(92, 107).mirror().addBox(-0.0953F, -0.263F, 0.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9506F, 10.484F, 5.1211F, 0.4421F, -0.1888F, -0.3002F));

		PartDefinition cube_r165 = osteoderms16.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(99, 112).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5455F, 10.1683F, 3.8464F, 0.1389F, -0.0806F, -0.352F));

		PartDefinition cube_r166 = osteoderms16.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(27, 118).mirror().addBox(-0.3887F, -0.0071F, -1.4165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9597F, 9.26F, 4.119F, 0.6934F, -0.1063F, -0.3374F));

		PartDefinition cube_r167 = osteoderms16.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(103, 59).mirror().addBox(-1.5F, -0.5F, -1.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-8.8862F, 14.5676F, 8.6169F, 0.2661F, -0.5561F, -0.1709F));

		PartDefinition cube_r168 = osteoderms16.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(1.606F, -0.3661F, -1.8749F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-10.5608F, 14.7002F, 7.9812F, 0.2278F, -0.0461F, -0.0834F));

		PartDefinition cube_r169 = osteoderms16.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(111, 105).mirror().addBox(-7.7022F, 9.6412F, 0.8873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 100).mirror().addBox(-7.7022F, 9.6412F, -2.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1532F, -0.1216F, 0.89F, 0.2274F, -0.0093F, -0.4715F));

		PartDefinition cube_r170 = osteoderms16.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 87).mirror().addBox(-0.4907F, -0.2745F, -0.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.977F, 12.1803F, 1.0261F, 0.6987F, -0.0093F, -0.4715F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -6.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 32).addBox(-2.0354F, -2.8566F, 1.7649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(26, 33).addBox(-2.0354F, -2.3047F, -0.1939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(94, 116).mirror().addBox(-2.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -1.1535F, -0.1122F, 0.0715F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(99, 116).mirror().addBox(-2.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -0.6124F, -0.1122F, 0.0715F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(25, 110).mirror().addBox(-2.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 1.5447F, -2.7231F, 0.3999F, -0.1122F, 0.0715F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-2.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.0035F, -3.7138F, 1.2594F, -0.2286F, -0.0214F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(-2.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.9278F, -0.2286F, -0.0214F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-2.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -0.5812F, -0.3034F, -0.0377F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(104, 116).mirror().addBox(-3.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.6482F, -0.5705F, -0.8236F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(117, 86).mirror().addBox(-3.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 27).mirror().addBox(-3.3634F, 0.1949F, 0.1506F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.1071F, -0.5705F, -0.8236F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(1.0354F, 5.9843F, 5.2655F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 71).addBox(1.0354F, 5.9843F, 5.2655F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(6.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8017F, -1.2264F, -0.6264F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(56, 44).mirror().addBox(5.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8769F, -1.2497F, -0.706F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(4.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.9129F, -1.2152F, -0.6561F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(3.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 1.208F, -1.2599F, -0.8819F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-3.2189F, 1.404F, 5.6007F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5023F, -0.0624F, 0.1863F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-6.3563F, -1.0603F, 5.6007F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.4323F, 0.2715F, -0.4533F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-9.9193F, -5.1133F, 5.6007F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.1277F, 0.4909F, -1.2317F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-3.9084F, -0.5405F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7942F, 0.4558F, -0.4082F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(22, 93).mirror().addBox(-5.4835F, -3.0636F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.2612F, 0.8614F, -1.2321F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(44, 93).mirror().addBox(-1.0304F, 0.1903F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.887F, -0.0881F, 0.0716F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(106, 100).mirror().addBox(-1.9415F, 1.0275F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7124F, -0.0743F, 0.0858F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(-5.1452F, -0.5064F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.6216F, 0.3807F, -0.4785F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-7.4113F, -3.8822F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.186F, 0.6952F, -1.2851F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 31).mirror().addBox(-3.12F, 1.2845F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5904F, -0.0633F, 0.0942F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(8, 78).mirror().addBox(-6.2032F, -1.0856F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5073F, 0.3223F, -0.5179F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-8.7901F, -5.0273F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.145F, 0.5775F, -1.3095F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(94, 116).addBox(1.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -1.1535F, 0.1122F, -0.0715F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 116).addBox(1.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -0.6124F, 0.1122F, -0.0715F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 110).addBox(1.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0354F, 1.5447F, -2.7231F, 0.3999F, 0.1122F, -0.0715F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(64, 33).addBox(1.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.0354F, 3.0035F, -3.7138F, 1.2594F, 0.2286F, 0.0214F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(18, 47).addBox(1.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.9278F, 0.2286F, 0.0214F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(62, 92).addBox(1.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -0.5812F, 0.3034F, 0.0377F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(104, 116).addBox(2.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.6482F, 0.5705F, 0.8236F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(117, 86).addBox(2.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(2.3634F, 0.1949F, 0.1506F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.1071F, 0.5705F, 0.8236F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(51, 79).addBox(-4.0354F, 3.4041F, 3.5793F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(12, 58).addBox(-7.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8017F, 1.2264F, 0.6264F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(56, 44).addBox(-6.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8769F, 1.2497F, 0.706F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(24, 59).addBox(-5.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.9129F, 1.2152F, 0.6561F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(37, 64).addBox(-4.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 1.208F, 1.2599F, 0.8819F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(30, 105).addBox(-2.5354F, -0.4162F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(62, 92).addBox(-2.0354F, -3.0507F, 5.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 95).addBox(-2.0354F, -2.9507F, 3.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(57, 28).addBox(-1.7811F, 1.404F, 5.6007F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5023F, 0.0624F, -0.1863F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 60).addBox(3.3563F, -1.0603F, 5.6007F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.4323F, -0.2715F, 0.4533F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(22, 69).addBox(3.9193F, -5.1133F, 5.6007F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.1277F, -0.4909F, 1.2317F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(9, 94).addBox(0.9084F, -0.5405F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7942F, -0.4558F, 0.4082F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(22, 93).addBox(2.4835F, -3.0636F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2612F, -0.8614F, 1.2321F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 93).addBox(-1.9696F, 0.1903F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.887F, 0.0881F, -0.0716F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(106, 100).addBox(-2.0585F, 1.0275F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7124F, 0.0743F, -0.0858F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(74, 38).addBox(2.1452F, -0.5064F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.6216F, -0.3807F, 0.4785F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(107, 0).addBox(3.4113F, -3.8822F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.186F, -0.6952F, 1.2851F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(65, 31).addBox(-1.88F, 1.2845F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5904F, 0.0633F, -0.0942F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(8, 78).addBox(3.2032F, -1.0856F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5073F, -0.3223F, 0.5179F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(83, 93).addBox(3.7901F, -5.0273F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.145F, -0.5775F, 1.3095F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(34, 0).addBox(-4.0F, -0.8F, -2.6F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, -5.6461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(26, 33).addBox(-4.5F, -17.4704F, 7.1306F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 18.1605F, -6.8752F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(36, 82).addBox(-2.5354F, -0.6794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition backPlates = chest.addOrReplaceChild("backPlates", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4293F, -7.1716F, -5.8763F, 0.0F, 0.0349F, -0.0015F));

		PartDefinition cube_r228 = backPlates.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 68).addBox(9.3874F, 2.6648F, 0.5138F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, 0.2884F, 1.4373F));

		PartDefinition cube_r229 = backPlates.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(81, 0).addBox(10.8819F, 2.784F, -8.0968F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -4.0F, 2.8F, 0.4869F, -0.1591F, 1.1984F));

		PartDefinition cube_r230 = backPlates.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(76, 81).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8609F, 8.0679F, 0.9688F, 0.489F, 0.1521F, 0.6303F));

		PartDefinition cube_r231 = backPlates.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(79, 66).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7167F, 8.5665F, 4.9172F, 0.2567F, -0.1007F, 1.0066F));

		PartDefinition cube_r232 = backPlates.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(63, 64).addBox(8.9565F, 1.2813F, -8.6406F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -1.0759F, 8.8825F, 0.372F, -0.117F, 1.2992F));

		PartDefinition cube_r233 = backPlates.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 38).addBox(6.6326F, 9.4954F, -8.2676F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5293F, -6.4759F, 7.3825F, 0.1869F, -0.1294F, 0.5987F));

		PartDefinition backPlates4 = chest.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4293F, -7.1716F, -5.8763F, 0.0F, -0.0349F, 0.0015F));

		PartDefinition cube_r234 = backPlates4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-12.3874F, 2.6648F, 0.5138F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, -0.2884F, -1.4373F));

		PartDefinition cube_r235 = backPlates4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-13.8819F, 2.784F, -8.0968F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.0F, 2.8F, 0.4869F, 0.1591F, -1.1984F));

		PartDefinition cube_r236 = backPlates4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8609F, 8.0679F, 0.9688F, 0.489F, -0.1521F, -0.6303F));

		PartDefinition cube_r237 = backPlates4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7167F, 8.5665F, 4.9172F, 0.2567F, 0.1007F, -1.0066F));

		PartDefinition cube_r238 = backPlates4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-13.9565F, 1.2813F, -8.6406F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -1.0759F, 8.8825F, 0.372F, 0.117F, -1.2992F));

		PartDefinition cube_r239 = backPlates4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-9.6326F, 9.4954F, -8.2676F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5293F, -6.4759F, 7.3825F, 0.1869F, 0.1294F, -0.5987F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -11.3828F, -5.6469F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r240 = osteoderms4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(118, 112).addBox(-0.9904F, -0.4531F, -0.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.5899F, 11.6997F, -2.185F, -1.2358F, 0.0331F, 0.1932F));

		PartDefinition cube_r241 = osteoderms4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(48, 68).addBox(1.3441F, 11.1471F, -1.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 61).addBox(1.3441F, 11.0471F, -4.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4214F, -0.5026F, 2.5861F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r242 = osteoderms4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(111, 110).addBox(-0.5141F, -0.0377F, -0.5585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.3833F, 11.4145F, 3.1134F, 1.6609F, 0.2266F, 0.7877F));

		PartDefinition cube_r243 = osteoderms4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(16, 112).addBox(-0.5141F, -0.9096F, -0.9266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3833F, 11.4145F, 3.1134F, 0.8755F, 0.2266F, 0.7877F));

		PartDefinition cube_r244 = osteoderms4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(46, 112).addBox(-0.5141F, 0.007F, -1.2377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3833F, 11.4145F, 3.1134F, 0.0901F, 0.2266F, 0.7877F));

		PartDefinition cube_r245 = osteoderms4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(110, 53).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4138F, 12.6F, -3.0937F, 1.4872F, 0.2701F, 0.9094F));

		PartDefinition cube_r246 = osteoderms4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(32, 110).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6488F, 12.3665F, -3.2174F, 2.2726F, 0.2701F, 0.9094F));

		PartDefinition cube_r247 = osteoderms4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(64, 110).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5488F, 11.6665F, -0.2174F, 1.9343F, 0.1786F, 0.856F));

		PartDefinition cube_r248 = osteoderms4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(71, 110).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.3138F, 11.9F, -0.0937F, 1.1489F, 0.1786F, 0.856F));

		PartDefinition cube_r249 = osteoderms4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(39, 111).addBox(-0.5F, -0.1499F, -1.0492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3138F, 11.9F, -0.0937F, 0.5031F, 0.1786F, 0.856F));

		PartDefinition cube_r250 = osteoderms4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(9.0644F, 17.7477F, 0.16F, 1.8111F, 0.003F, 1.8624F));

		PartDefinition cube_r251 = osteoderms4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(115, 12).addBox(-0.5F, -1.134F, -2.4905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.7123F, 18.2442F, 0.7324F, 1.0345F, 0.003F, 1.8624F));

		PartDefinition cube_r252 = osteoderms4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 67).addBox(-0.4975F, -3.5249F, 0.3761F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1748F, 17.474F, 0.3176F, 3.035F, -0.042F, 1.8595F));

		PartDefinition cube_r253 = osteoderms4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(63, 80).addBox(-0.5F, -1.5F, -3.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.6991F, 17.3309F, 0.3959F, 1.8133F, -0.042F, 1.8595F));

		PartDefinition cube_r254 = osteoderms4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(40, 73).addBox(-0.9206F, 0.1097F, -0.3572F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.573F, 16.9594F, -3.4483F, 1.185F, -0.042F, 1.8595F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(117, 34).addBox(-0.5F, -2.6F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2406F, 15.8942F, -4.0633F, -1.6774F, -0.042F, 1.8595F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(12, 55).addBox(-0.5F, -0.7F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.582F, 16.4332F, -0.4972F, -2.55F, -0.042F, 1.8595F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(117, 98).addBox(-0.6392F, -1.1765F, -0.4722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0381F, 16.8538F, 3.009F, 2.9932F, -0.0296F, 1.861F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.7759F, 16.6127F, 3.5421F, 1.6406F, -0.0296F, 1.861F));

		PartDefinition cube_r259 = osteoderms4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(115, 17).addBox(-0.6888F, -1.0042F, -1.4686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.0381F, 16.8538F, 3.009F, 1.3177F, -0.0296F, 1.861F));

		PartDefinition cube_r260 = osteoderms4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(114, 94).addBox(-0.356F, -0.1443F, 0.4953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.0381F, 16.5538F, 3.009F, 1.5472F, -0.0764F, 1.8604F));

		PartDefinition cube_r261 = osteoderms4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(104, 107).addBox(-0.356F, -1.0515F, -0.3158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.0381F, 16.5538F, 3.009F, 1.172F, -0.0764F, 1.8604F));

		PartDefinition cube_r262 = osteoderms4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(115, 65).addBox(-0.6533F, -1.9722F, -0.9996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.0381F, 16.8538F, 3.009F, 3.0368F, -0.0296F, 1.861F));

		PartDefinition cube_r263 = osteoderms4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(118, 82).addBox(10.112F, -2.3983F, -5.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 2.134F, 0.2905F, 1.1092F));

		PartDefinition cube_r264 = osteoderms4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(114, 27).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.348F, 9.3924F, 5.4554F, 0.5839F, 0.0806F, 0.5702F));

		PartDefinition cube_r265 = osteoderms4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(86, 107).addBox(-0.5F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.348F, 9.3924F, 5.4554F, 0.7934F, 0.0806F, 0.5702F));

		PartDefinition cube_r266 = osteoderms4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(92, 112).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4486F, 10.6296F, 5.4201F, 0.257F, 0.1063F, 0.5556F));

		PartDefinition cube_r267 = osteoderms4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(117, 108).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0904F, 10.2373F, 6.0913F, -0.2974F, 0.0806F, 0.5702F));

		PartDefinition cube_r268 = osteoderms4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 105).addBox(7.9495F, 5.619F, -0.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(57, 18).addBox(7.9495F, 6.619F, -1.0619F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.8783F, -1.713F, 3.4017F, -0.1198F, 0.0032F, 0.7256F));

		PartDefinition cube_r269 = osteoderms4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(39, 106).addBox(-0.5F, 0.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3369F, 7.3412F, 3.2597F, 0.6394F, 0.0032F, 0.7256F));

		PartDefinition cube_r270 = osteoderms4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 93).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0659F, 9.8914F, 1.1671F, 0.9711F, 0.0032F, 0.7256F));

		PartDefinition cube_r271 = osteoderms4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(106, 29).addBox(-0.5F, 0.1F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4555F, 10.4701F, 1.7663F, 0.0156F, 0.0103F, 0.6512F));

		PartDefinition cube_r272 = osteoderms4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(118, 69).addBox(10.9833F, 2.3228F, 0.069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(64, 118).addBox(11.0833F, 2.5228F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7641F, 2.5177F, 5.338F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r273 = osteoderms4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(91, 8).addBox(11.0833F, 2.4228F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.6194F, 2.1467F, 2.5881F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r274 = osteoderms4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(118, 38).addBox(10.112F, 4.646F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 0.2577F, 0.2905F, 1.1092F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -11.3828F, -5.6469F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r275 = osteoderms15.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(118, 112).mirror().addBox(-0.0096F, -0.4531F, -0.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.5899F, 11.6997F, -2.185F, -1.2358F, -0.0331F, -0.1932F));

		PartDefinition cube_r276 = osteoderms15.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-2.3441F, 11.1471F, -1.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 61).mirror().addBox(-2.3441F, 11.0471F, -4.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4214F, -0.5026F, 2.5861F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r277 = osteoderms15.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(111, 110).mirror().addBox(-0.4859F, -0.0377F, -0.5585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3833F, 11.4145F, 3.1134F, 1.6609F, -0.2266F, -0.7877F));

		PartDefinition cube_r278 = osteoderms15.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(16, 112).mirror().addBox(-0.4859F, -0.9096F, -0.9266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3833F, 11.4145F, 3.1134F, 0.8755F, -0.2266F, -0.7877F));

		PartDefinition cube_r279 = osteoderms15.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 112).mirror().addBox(-0.4859F, 0.007F, -1.2377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3833F, 11.4145F, 3.1134F, 0.0901F, -0.2266F, -0.7877F));

		PartDefinition cube_r280 = osteoderms15.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(110, 53).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4138F, 12.6F, -3.0937F, 1.4872F, -0.2701F, -0.9094F));

		PartDefinition cube_r281 = osteoderms15.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(32, 110).mirror().addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6488F, 12.3665F, -3.2174F, 2.2726F, -0.2701F, -0.9094F));

		PartDefinition cube_r282 = osteoderms15.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(64, 110).mirror().addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5488F, 11.6665F, -0.2174F, 1.9343F, -0.1786F, -0.856F));

		PartDefinition cube_r283 = osteoderms15.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(71, 110).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3138F, 11.9F, -0.0937F, 1.1489F, -0.1786F, -0.856F));

		PartDefinition cube_r284 = osteoderms15.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(-0.5F, -0.1499F, -1.0492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3138F, 11.9F, -0.0937F, 0.5031F, -0.1786F, -0.856F));

		PartDefinition cube_r285 = osteoderms15.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(24, 58).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-9.0644F, 17.7477F, 0.16F, 1.8111F, -0.003F, -1.8624F));

		PartDefinition cube_r286 = osteoderms15.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(115, 12).mirror().addBox(-0.5F, -1.134F, -2.4905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.7123F, 18.2442F, 0.7324F, 1.0345F, -0.003F, -1.8624F));

		PartDefinition cube_r287 = osteoderms15.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5025F, -3.5249F, 0.3761F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1748F, 17.474F, 0.3176F, 3.035F, 0.042F, -1.8595F));

		PartDefinition cube_r288 = osteoderms15.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-0.5F, -1.5F, -3.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.6991F, 17.3309F, 0.3959F, 1.8133F, 0.042F, -1.8595F));

		PartDefinition cube_r289 = osteoderms15.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.0794F, 0.1097F, -0.3572F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.573F, 16.9594F, -3.4483F, 1.185F, 0.042F, -1.8595F));

		PartDefinition cube_r290 = osteoderms15.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(117, 34).mirror().addBox(-0.5F, -2.6F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2406F, 15.8942F, -4.0633F, -1.6774F, 0.042F, -1.8595F));

		PartDefinition cube_r291 = osteoderms15.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(-0.5F, -0.7F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.582F, 16.4332F, -0.4972F, -2.55F, 0.042F, -1.8595F));

		PartDefinition cube_r292 = osteoderms15.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(117, 98).mirror().addBox(-0.3608F, -1.1765F, -0.4722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0381F, 16.8538F, 3.009F, 2.9932F, 0.0296F, -1.861F));

		PartDefinition cube_r293 = osteoderms15.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.7759F, 16.6127F, 3.5421F, 1.6406F, 0.0296F, -1.861F));

		PartDefinition cube_r294 = osteoderms15.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(115, 17).mirror().addBox(-0.3112F, -1.0042F, -1.4686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.0381F, 16.8538F, 3.009F, 1.3177F, 0.0296F, -1.861F));

		PartDefinition cube_r295 = osteoderms15.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(114, 94).mirror().addBox(-0.644F, -0.1443F, 0.4953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.0381F, 16.5538F, 3.009F, 1.5472F, 0.0764F, -1.8604F));

		PartDefinition cube_r296 = osteoderms15.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-0.644F, -1.0515F, -0.3158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.0381F, 16.5538F, 3.009F, 1.172F, 0.0764F, -1.8604F));

		PartDefinition cube_r297 = osteoderms15.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(115, 65).mirror().addBox(-0.3467F, -1.9722F, -0.9996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.0381F, 16.8538F, 3.009F, 3.0368F, 0.0296F, -1.861F));

		PartDefinition cube_r298 = osteoderms15.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(118, 82).mirror().addBox(-11.112F, -2.3983F, -5.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 2.134F, -0.2905F, -1.1092F));

		PartDefinition cube_r299 = osteoderms15.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(114, 27).mirror().addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.348F, 9.3924F, 5.4554F, 0.5839F, -0.0806F, -0.5702F));

		PartDefinition cube_r300 = osteoderms15.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(86, 107).mirror().addBox(-0.5F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.348F, 9.3924F, 5.4554F, 0.7934F, -0.0806F, -0.5702F));

		PartDefinition cube_r301 = osteoderms15.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(92, 112).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4486F, 10.6296F, 5.4201F, 0.257F, -0.1063F, -0.5556F));

		PartDefinition cube_r302 = osteoderms15.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(117, 108).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0904F, 10.2373F, 6.0913F, -0.2974F, -0.0806F, -0.5702F));

		PartDefinition cube_r303 = osteoderms15.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(74, 105).mirror().addBox(-8.9495F, 5.619F, -0.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(57, 18).mirror().addBox(-8.9495F, 6.619F, -1.0619F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.8783F, -1.713F, 3.4017F, -0.1198F, -0.0032F, -0.7256F));

		PartDefinition cube_r304 = osteoderms15.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(39, 106).mirror().addBox(-0.5F, 0.2F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3369F, 7.3412F, 3.2597F, 0.6394F, -0.0032F, -0.7256F));

		PartDefinition cube_r305 = osteoderms15.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 93).mirror().addBox(-0.5F, -0.7F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0659F, 9.8914F, 1.1671F, 0.9711F, -0.0032F, -0.7256F));

		PartDefinition cube_r306 = osteoderms15.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-0.5F, 0.1F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4555F, 10.4701F, 1.7663F, 0.0156F, -0.0103F, -0.6512F));

		PartDefinition cube_r307 = osteoderms15.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(118, 69).mirror().addBox(-11.9833F, 2.3228F, 0.069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(64, 118).mirror().addBox(-12.0833F, 2.5228F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7641F, 2.5177F, 5.338F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r308 = osteoderms15.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(91, 8).mirror().addBox(-12.0833F, 2.4228F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.6194F, 2.1467F, 2.5881F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r309 = osteoderms15.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(118, 38).mirror().addBox(-11.112F, 4.646F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 0.2577F, -0.2905F, -1.1092F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 8.0973F, -3.0537F, 1.096F, 0.4718F, -0.3786F));

		PartDefinition cube_r310 = leftarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(60, 56).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r311 = leftarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(79, 116).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r312 = leftarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(41, 39).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(60, 103).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(85, 112).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.0571F, 2.3001F, -1.4032F, 0.7796F, 2.1577F));

		PartDefinition cube_r315 = leftarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.67F, 0.5245F, -2.7163F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r316 = leftarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(53, 92).addBox(0.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 1.3484F, 0.6166F, -1.0891F));

		PartDefinition cube_r317 = lefthand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(104, 65).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r318 = lefthand.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(94, 70).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r319 = lefthand.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(36, 64).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r320 = lefthand.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(109, 80).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 8.0973F, -3.0537F, 0.0037F, -1.228F, 1.2737F));

		PartDefinition cube_r321 = rightarm.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r322 = rightarm.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(79, 116).mirror().addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r323 = rightarm.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(41, 39).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightarm.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(60, 103).mirror().addBox(-1.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightarm.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(85, 112).mirror().addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.0571F, 2.3001F, -2.0135F, -0.7491F, -2.6739F));

		PartDefinition cube_r326 = rightarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.67F, 0.5245F, -2.7163F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r327 = rightarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(53, 92).mirror().addBox(-2.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 1.2611F, -0.6166F, 1.0891F));

		PartDefinition cube_r328 = righthand.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(104, 65).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r329 = righthand.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r330 = righthand.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r331 = righthand.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(109, 80).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -6.8F, -0.117F, 0.1293F, 0.0413F));

		PartDefinition cube_r332 = neck3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(18, 116).addBox(0.5F, -2.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 100).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(100, 32).addBox(0.5F, -1.6346F, -0.0211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r334 = neck3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.5833F, 0.412F, -0.142F));

		PartDefinition cube_r335 = neck3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.1534F, 0.6858F, -0.9281F));

		PartDefinition cube_r336 = neck3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(36, 85).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.6573F, 0.2332F, -0.1185F));

		PartDefinition cube_r337 = neck3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(49, 73).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.368F, 0.5997F, -0.7989F));

		PartDefinition cube_r338 = neck3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 90).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.5833F, -0.412F, 0.142F));

		PartDefinition cube_r339 = neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 23).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.1534F, -0.6858F, 0.9281F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(36, 85).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.6573F, -0.2332F, 0.1185F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(49, 73).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.368F, -0.5997F, 0.7989F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(68, 12).addBox(-2.0F, -0.2831F, -0.8623F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2343F, -3.9679F, 0.0611F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -14.7653F, -1.791F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r343 = osteoderms3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(92, 55).addBox(-5.6276F, 8.0007F, -2.2023F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.1891F, 0.3979F, -0.5522F));

		PartDefinition cube_r344 = osteoderms3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(72, 87).addBox(-5.5933F, 6.7731F, 2.9027F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.5692F, 0.3832F, -0.542F));

		PartDefinition cube_r345 = osteoderms3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(31, 80).addBox(-0.5406F, -0.144F, -1.1366F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5333F, 11.1871F, 2.3822F, 0.2774F, 0.0103F, 0.4243F));

		PartDefinition cube_r346 = osteoderms3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(84, 116).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.2199F, 9.9724F, 3.7766F, 0.0897F, 0.0032F, 0.4987F));

		PartDefinition cube_r347 = osteoderms3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(30, 114).addBox(-0.518F, -0.2712F, -0.1726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(99, 32).addBox(-0.518F, -0.9712F, -1.2726F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5333F, 11.1871F, 2.3822F, 0.9711F, 0.0032F, 0.4987F));

		PartDefinition cube_r348 = osteoderms3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(72, 114).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1487F, 12.2509F, -1.323F, 0.5347F, 0.0032F, 0.7256F));

		PartDefinition cube_r349 = osteoderms3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1794F, 15.2207F, -1.5208F, 1.927F, 0.0822F, 1.8509F));

		PartDefinition cube_r350 = osteoderms3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(21, 115).addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8265F, 15.7752F, -1.1732F, 0.9933F, 0.0822F, 1.8509F));

		PartDefinition cube_r351 = osteoderms3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(114, 75).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.4974F, 15.7386F, -0.4965F, 2.2237F, 0.0822F, 1.8509F));

		PartDefinition cube_r352 = osteoderms3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(60, 113).addBox(-0.922F, -0.1169F, 0.2045F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2582F, 16.3728F, 1.4414F, -3.0031F, -0.1028F, 1.8442F));

		PartDefinition cube_r353 = osteoderms3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(48, 56).addBox(-0.7F, -1.5F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1275F, 15.931F, 2.2789F, -1.7116F, -0.1028F, 1.8442F));

		PartDefinition cube_r354 = osteoderms3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(23, 80).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4618F, 15.57F, 0.1055F, 1.7267F, -0.1028F, 1.8442F));

		PartDefinition cube_r355 = osteoderms3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(55, 85).addBox(0.5302F, -0.5624F, -4.4698F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.0582F, 16.3728F, -0.1586F, 1.6046F, -0.1028F, 1.8442F));

		PartDefinition cube_r356 = osteoderms3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(81, 20).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(5.694F, 15.9592F, 2.3173F, 2.2241F, -0.1028F, 1.8442F));

		PartDefinition cube_r357 = osteoderms3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(99, 87).addBox(0.5468F, -0.5944F, -3.3639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(10.1582F, 16.3728F, -0.0586F, 2.0671F, -0.1028F, 1.8442F));

		PartDefinition cube_r358 = osteoderms3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(63, 107).addBox(7.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5783F, 0.0695F, 1.5458F, 0.2774F, 0.0103F, 0.6512F));

		PartDefinition osteoderms14 = neck3.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -14.7653F, -1.791F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r359 = osteoderms14.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(4.6276F, 8.0007F, -2.2023F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.1891F, -0.3979F, 0.5522F));

		PartDefinition cube_r360 = osteoderms14.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(4.5933F, 6.7731F, 2.9027F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.5692F, -0.3832F, 0.542F));

		PartDefinition cube_r361 = osteoderms14.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-0.4594F, -0.144F, -1.1366F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, 11.1871F, 2.3822F, 0.2774F, -0.0103F, -0.4243F));

		PartDefinition cube_r362 = osteoderms14.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 116).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2199F, 9.9724F, 3.7766F, 0.0897F, -0.0032F, -0.4987F));

		PartDefinition cube_r363 = osteoderms14.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(30, 114).mirror().addBox(-0.482F, -0.2712F, -0.1726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(99, 32).mirror().addBox(-0.482F, -0.9712F, -1.2726F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, 11.1871F, 2.3822F, 0.9711F, -0.0032F, -0.4987F));

		PartDefinition cube_r364 = osteoderms14.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1487F, 12.2509F, -1.323F, 0.5347F, -0.0032F, -0.7256F));

		PartDefinition cube_r365 = osteoderms14.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1794F, 15.2207F, -1.5208F, 1.927F, -0.0822F, -1.8509F));

		PartDefinition cube_r366 = osteoderms14.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(21, 115).mirror().addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8265F, 15.7752F, -1.1732F, 0.9933F, -0.0822F, -1.8509F));

		PartDefinition cube_r367 = osteoderms14.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(114, 75).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4974F, 15.7386F, -0.4965F, 2.2237F, -0.0822F, -1.8509F));

		PartDefinition cube_r368 = osteoderms14.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(60, 113).mirror().addBox(-0.078F, -0.1169F, 0.2045F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2582F, 16.3728F, 1.4414F, -3.0031F, 0.1028F, -1.8442F));

		PartDefinition cube_r369 = osteoderms14.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.3F, -1.5F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1275F, 15.931F, 2.2789F, -1.7116F, 0.1028F, -1.8442F));

		PartDefinition cube_r370 = osteoderms14.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(23, 80).mirror().addBox(-0.5F, -0.2F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4618F, 15.57F, 0.1055F, 1.7267F, 0.1028F, -1.8442F));

		PartDefinition cube_r371 = osteoderms14.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-1.5302F, -0.5624F, -4.4698F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.0582F, 16.3728F, -0.1586F, 1.6046F, 0.1028F, -1.8442F));

		PartDefinition cube_r372 = osteoderms14.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(81, 20).mirror().addBox(-0.5F, -1.2F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.694F, 15.9592F, 2.3173F, 2.2241F, 0.1028F, -1.8442F));

		PartDefinition cube_r373 = osteoderms14.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-1.5468F, -0.5944F, -3.3639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-10.1582F, 16.3728F, -0.0586F, 2.0671F, 0.1028F, -1.8442F));

		PartDefinition cube_r374 = osteoderms14.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(63, 107).mirror().addBox(-8.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5783F, 0.0695F, 1.5458F, 0.2774F, -0.0103F, -0.6512F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, -0.2409F, 0.428F, 0.0348F));

		PartDefinition cube_r375 = neck2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 27).addBox(0.5F, -1.5F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 27).addBox(0.5F, -1.3F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 6).addBox(0.0F, -0.6F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(64, 12).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.3529F, 0.5783F, -0.9417F));

		PartDefinition cube_r377 = neck2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r378 = neck2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(64, 12).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.3529F, -0.5783F, 0.9417F));

		PartDefinition cube_r379 = neck2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(68, 22).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition cube_r380 = neck2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(74, 30).addBox(-1.0F, -0.0752F, -4.0018F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.4039F, -0.689F, -0.1134F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -14.7653F, -1.9866F));

		PartDefinition cube_r381 = osteoderms2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(113, 70).addBox(-0.4822F, -0.0426F, -1.1977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.4571F, 12.254F, -0.542F, -0.1793F, 0.0398F, 0.7243F));

		PartDefinition cube_r382 = osteoderms2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(37, 115).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4715F, 12.2252F, -0.8461F, 0.2134F, 0.0398F, 0.7243F));

		PartDefinition cube_r383 = osteoderms2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(6, 108).addBox(11.0449F, -3.5962F, -0.963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 1.9539F, 0.3949F, 0.2153F, 0.0423F, 1.8102F));

		PartDefinition cube_r384 = osteoderms2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(101, 107).addBox(10.7996F, -3.9527F, 1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2493F, 2.0555F, 0.2085F, 0.8243F, 0.0398F, 1.885F));

		PartDefinition cube_r385 = osteoderms2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(81, 22).addBox(11.0449F, -3.5962F, -1.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3947F, 2.7539F, 2.1949F, 0.2153F, 0.0423F, 1.8102F));

		PartDefinition cube_r386 = osteoderms2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(113, 8).addBox(10.7996F, -4.0527F, 1.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7493F, 2.8555F, 2.0085F, 0.8243F, 0.0398F, 1.885F));

		PartDefinition cube_r387 = osteoderms2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(117, 102).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9216F, 14.7941F, 0.925F, 0.3007F, 0.0398F, 1.885F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.0F, -14.7653F, -1.9866F));

		PartDefinition cube_r388 = osteoderms13.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(113, 70).mirror().addBox(-0.5178F, -0.0426F, -1.1977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.4571F, 12.254F, -0.542F, -0.1793F, -0.0398F, -0.7243F));

		PartDefinition cube_r389 = osteoderms13.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(37, 115).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4715F, 12.2252F, -0.8461F, 0.2134F, -0.0398F, -0.7243F));

		PartDefinition cube_r390 = osteoderms13.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(6, 108).mirror().addBox(-12.0449F, -3.5962F, -0.963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1053F, 1.9539F, 0.3949F, 0.2153F, -0.0423F, -1.8102F));

		PartDefinition cube_r391 = osteoderms13.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(101, 107).mirror().addBox(-11.7996F, -3.9527F, 1.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2493F, 2.0555F, 0.2085F, 0.8243F, -0.0398F, -1.885F));

		PartDefinition cube_r392 = osteoderms13.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-12.0449F, -3.5962F, -1.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3947F, 2.7539F, 2.1949F, 0.2153F, -0.0423F, -1.8102F));

		PartDefinition cube_r393 = osteoderms13.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(113, 8).mirror().addBox(-11.7996F, -4.0527F, 1.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7493F, 2.8555F, 2.0085F, 0.8243F, -0.0398F, -1.885F));

		PartDefinition cube_r394 = osteoderms13.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(117, 102).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9216F, 14.7941F, 0.925F, 0.3007F, -0.0398F, -1.885F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8781F, -4.2801F, -0.2028F, 0.4303F, 0.2134F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(51, 116).addBox(-1.0F, -0.8727F, -0.1398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.379F, -3.401F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(44, 116).addBox(-1.0F, -0.6F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.079F, -3.301F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(110, 102).addBox(-1.0F, -0.9836F, -0.0186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 2.1631F, -3.3287F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(83, 13).addBox(-1.0F, -0.9781F, 0.0254F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 2.4631F, -4.3287F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 87).addBox(-3.2F, -0.9824F, 0.1894F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.2124F, -0.8416F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(101, 2).addBox(-3.2F, -1.1968F, -0.2796F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(106, 87).addBox(-2.7F, -0.8968F, -0.2796F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(0.7F, -0.6124F, -2.0416F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(94, 23).addBox(-2.7F, -1.8633F, -0.1454F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.0124F, -3.6416F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(73, 54).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3543F, 0.9389F, -3.8956F, -1.1677F, 0.8642F, -1.1157F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(89, 116).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3543F, 0.9389F, -3.8956F, -1.1677F, -0.8642F, 1.1157F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(109, 37).addBox(-1.7F, -1.8182F, -0.1379F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2F, 1.2876F, -4.7416F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(7, 113).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5931F, -0.6895F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(115, 31).addBox(-1.5F, -1.2167F, 0.5066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.5F, 1.4752F, -5.8496F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(111, 84).addBox(-1.5F, -0.8709F, 0.5851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0029F)), PartPose.offsetAndRotation(0.5F, 2.2752F, -6.1496F, -0.384F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, 0.2042F, -1.419F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.9876F, -5.2416F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(74, 118).addBox(-0.8F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 1.612F, 0.8156F, 1.0472F, -0.1455F, -0.2799F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 126).addBox(-2.2F, -1.013F, -0.3925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(69, 118).addBox(-0.9F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.7F, 2.412F, 0.2156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(109, 77).addBox(-0.27F, -0.7739F, 0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(112, 90).addBox(-0.8709F, -0.0736F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1902F, 0.4005F, 0.0154F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(68, 105).addBox(-1.0709F, -0.3736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3873F, -0.3645F, 2.8533F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(95, 107).addBox(-0.545F, 0.0137F, -1.6297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 2.1753F, -0.2421F, 2.1494F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(107, 48).addBox(-0.545F, -1.0114F, -1.6623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 1.3376F, -0.2421F, 2.1494F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(57, 107).addBox(-0.545F, -0.4524F, -1.3334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 1.8088F, -0.2421F, 2.1494F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 117).addBox(0.1045F, -0.4416F, -0.7021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.3362F, -1.3831F, 3.6169F, -0.9588F, 0.5164F, 0.2324F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(5, 117).addBox(0.008F, -0.6615F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7092F, -1.6752F, 5.4516F, -0.7252F, 1.4059F, 0.7146F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(32, 118).addBox(-0.196F, -0.4735F, -0.5441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(2.1092F, -1.6752F, 5.0516F, -1.4455F, 0.5512F, 0.0812F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(117, 55).addBox(0.0592F, -1.663F, -0.6829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3362F, -1.3831F, 3.5169F, -1.4627F, 0.1611F, 0.0327F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(116, 79).addBox(-0.6064F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0764F, -0.2834F, 3.2226F, -0.5934F, 0.0349F, 0.0F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(114, 22).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4562F, -0.3676F, 5.6824F, -0.9039F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(113, 46).addBox(-1.2741F, 0.0608F, -0.2689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5823F, -1.6834F, 5.3167F, -0.9039F, -0.2431F, 0.2032F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(78, 112).addBox(-0.9826F, -0.0903F, -0.9827F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4927F, -0.7834F, 4.9399F, -0.6109F, 0.0349F, 0.0F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(0, 113).addBox(-1.4F, -1.2F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(57, 102).addBox(-0.6099F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 102).addBox(-0.4999F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2899F, -0.2834F, 3.2152F, -0.2007F, 0.0349F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.9876F, -5.2416F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(74, 118).mirror().addBox(-0.2F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.612F, 0.8156F, 1.0472F, 0.1455F, 0.2799F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(69, 118).mirror().addBox(-0.1F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.412F, 0.2156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(109, 77).mirror().addBox(-0.73F, -0.7739F, 0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(112, 90).mirror().addBox(-0.1291F, -0.0736F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1902F, -0.4005F, -0.0154F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(68, 105).mirror().addBox(0.0709F, -0.3736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3873F, -0.3645F, 2.8533F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(95, 107).mirror().addBox(-0.455F, 0.0137F, -1.6297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 2.1753F, 0.2421F, -2.1494F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(107, 48).mirror().addBox(-0.455F, -1.0114F, -1.6623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 1.3376F, 0.2421F, -2.1494F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(57, 107).mirror().addBox(-0.455F, -0.4524F, -1.3334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 1.8088F, 0.2421F, -2.1494F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-1.1045F, -0.4416F, -0.7021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.3362F, -1.3831F, 3.6169F, -0.9588F, -0.5164F, -0.2324F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(5, 117).mirror().addBox(-1.008F, -0.6615F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, -1.6752F, 5.4516F, -0.7252F, -1.4059F, -0.7146F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(32, 118).mirror().addBox(-0.804F, -0.4735F, -0.5441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.1092F, -1.6752F, 5.0516F, -1.4455F, -0.5512F, -0.0812F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(117, 55).mirror().addBox(-1.0592F, -1.663F, -0.6829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3362F, -1.3831F, 3.5169F, -1.4627F, -0.1611F, -0.0327F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(116, 79).mirror().addBox(-0.3936F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0764F, -0.2834F, 3.2226F, -0.5934F, -0.0349F, 0.0F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(114, 22).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4562F, -0.3676F, 5.6824F, -0.9039F, 0.0F, 0.0F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(113, 46).mirror().addBox(-0.7259F, 0.0608F, -0.2689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5823F, -1.6834F, 5.3167F, -0.9039F, 0.2431F, -0.2032F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(78, 112).mirror().addBox(-1.0174F, -0.0903F, -0.9827F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4927F, -0.7834F, 4.9399F, -0.6109F, -0.0349F, 0.0F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.6F, -1.2F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(-0.3901F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 102).mirror().addBox(-0.5001F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2899F, -0.2834F, 3.2152F, -0.2007F, -0.0349F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 2.0399F, -0.908F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3923F, 0.7273F, -2.7134F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6879F, 0.613F, -1.7851F, 0.0902F, -0.3121F, 0.0362F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-0.1046F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3648F, -1.2049F, 0.3052F, -0.0694F, 0.0073F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(65, 114).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8523F, 1.3762F, -3.3167F, 0.375F, -0.0694F, 0.0073F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(53, 112).mirror().addBox(-0.5F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(53, 112).addBox(1.9F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.4236F, 0.3472F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(115, 51).mirror().addBox(-0.5F, -0.3114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 51).addBox(1.9F, -0.3114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5237F, -0.7371F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(115, 2).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(115, 2).addBox(1.9F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.1763F, 0.1629F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(0.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.5648F, -3.1049F, 0.6467F, -0.0506F, -0.0512F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(23, 80).mirror().addBox(-0.2309F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.1648F, -2.2049F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(54, 107).mirror().addBox(-0.5758F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.2648F, -1.2049F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.5758F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.2648F, -1.2049F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(34, 10).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7923F, 0.7273F, -2.7134F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(82, 73).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0879F, 0.613F, -1.7851F, 0.0902F, 0.3121F, -0.0362F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(79, 66).addBox(-0.8954F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7954F, 1.3648F, -1.2049F, 0.3052F, 0.0694F, -0.0073F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(65, 114).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2523F, 1.3762F, -3.3167F, 0.375F, 0.0694F, -0.0073F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(13, 80).addBox(-1.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.5648F, -3.1049F, 0.6467F, 0.0506F, 0.0512F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(23, 80).addBox(-0.7691F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.1648F, -2.2049F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(54, 107).addBox(-0.4242F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 1.2648F, -1.2049F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(90, 40).addBox(-0.4242F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.2648F, -1.2049F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(11.7F, -7.4885F, 1.4256F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition cube_r463 = backPlates2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(48, 32).addBox(-2.5F, -0.7F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8214F, 12.3021F, -2.6344F, -0.2008F, -0.2181F, 1.5113F));

		PartDefinition cube_r464 = backPlates2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5575F, 0.1576F, -3.0978F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2871F, 7.2191F, -4.8803F, -0.0672F, -0.3208F, 0.6572F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.7F, -7.4885F, 1.4256F, -0.1586F, -0.4921F, 0.0754F));

		PartDefinition cube_r465 = backPlates5.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(48, 32).mirror().addBox(-1.5F, -0.7F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8214F, 12.3021F, -2.6344F, -0.2008F, 0.2181F, -1.5113F));

		PartDefinition cube_r466 = backPlates5.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-4.4425F, 0.1576F, -3.0978F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2871F, 7.2191F, -4.8803F, -0.0672F, 0.3208F, -0.6572F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 69).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(48, 54).addBox(0.5F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 8).addBox(0.1F, 0.0F, 2.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 77).addBox(-0.4F, 0.0F, 4.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 48).addBox(0.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 54).mirror().addBox(-6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 8).mirror().addBox(-4.1F, 0.0F, 2.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 77).mirror().addBox(-3.6F, 0.0F, 4.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 48).mirror().addBox(-2.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 28).addBox(0.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 9).addBox(0.0F, -2.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 0).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 96).addBox(0.0F, -2.2F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.1897F, -0.2253F, 0.0444F));

		PartDefinition cube_r467 = tail.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(37, 80).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 84).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 27).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r468 = tail.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(14, 27).addBox(-5.5F, -0.0747F, -0.144F, 11.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0943F, -0.1263F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(20, 50).addBox(-3.5F, -0.0823F, -4.3456F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3943F, 6.8737F, -0.288F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -0.9664F, 7.9473F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r470 = osteoderms12.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5444F, 0.1174F, -1.8427F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5264F, 0.6449F, -1.2464F, -2.0878F, -0.4754F, -1.2431F));

		PartDefinition cube_r471 = osteoderms12.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(34, 10).addBox(-0.8172F, -2.8617F, -0.0436F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0633F, -1.0921F, -0.0307F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms18 = tail.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -0.9664F, 7.9473F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r472 = osteoderms18.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.4556F, 0.1174F, -1.8427F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5264F, 0.6449F, -1.2464F, -2.0878F, 0.4754F, 1.2431F));

		PartDefinition cube_r473 = osteoderms18.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(-0.1828F, -2.8617F, -0.0436F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0633F, -1.0921F, -0.0307F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -30.5928F, -8.6771F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 33).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(5, 43).addBox(0.3F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 7).addBox(-0.1F, 0.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 65).addBox(0.5F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 53).addBox(0.3F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 43).mirror().addBox(-2.3F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 7).mirror().addBox(-1.9F, 0.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 65).mirror().addBox(-1.5F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 53).mirror().addBox(-1.3F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 79).addBox(0.0F, -2.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 71).addBox(0.0F, -1.9F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 54).addBox(0.0F, -1.8F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 54).addBox(0.0F, -1.8F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0743F, -0.3482F, -0.0254F));

		PartDefinition cube_r474 = tail2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(66, 0).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 68).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 73).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 45).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r475 = tail2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(42, 42).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r476 = tail2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(57, 16).mirror().addBox(0.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3846F, -2.3586F, -0.0591F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition cube_r477 = tail2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(57, 16).addBox(-1.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3846F, -2.3586F, -0.0591F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -33.9489F, -4.8011F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r478 = osteoderms8.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(11, 104).addBox(-0.3822F, -0.1859F, -1.2151F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(14, 85).addBox(-1.6822F, -0.1859F, 0.3849F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8518F, 26.9356F, 23.0371F, 0.3472F, -0.1325F, -0.1018F));

		PartDefinition cube_r479 = osteoderms8.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(96, 12).addBox(-1.9229F, 0.0657F, -0.2072F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(6.8215F, 26.2991F, 23.618F, 0.7984F, -1.0804F, -0.7898F));

		PartDefinition cube_r480 = osteoderms8.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(26, 96).addBox(-1.1303F, -0.9866F, -0.9667F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0518F, 28.446F, 21.1719F, 0.4882F, -0.7681F, -0.4075F));

		PartDefinition cube_r481 = osteoderms8.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(29, 100).addBox(-3.0145F, 0.0657F, -1.2005F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.8339F, 26.0825F, 24.3703F, 0.3445F, -0.0504F, -0.0721F));

		PartDefinition cube_r482 = osteoderms8.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(87, 28).addBox(-0.3135F, -0.2159F, -3.5185F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.4518F, 26.9356F, 23.3371F, 0.3569F, -0.2636F, -0.1508F));

		PartDefinition cube_r483 = osteoderms8.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(82, 73).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(5.9768F, 29.5684F, 18.0488F, 0.4138F, -0.5713F, -0.1862F));

		PartDefinition cube_r484 = osteoderms8.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(39, 96).addBox(-0.0612F, 0.3441F, -0.1399F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.8124F, 29.0055F, 17.3571F, 0.8761F, -1.1149F, -0.7758F));

		PartDefinition cube_r485 = osteoderms8.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(89, 19).addBox(-4.6128F, -1.7982F, -2.248F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.1597F, 30.4715F, 19.4007F, 0.5341F, -0.844F, -0.3692F));

		PartDefinition cube_r486 = osteoderms8.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(64, 8).addBox(-0.1412F, -0.6766F, -1.3551F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.8518F, 28.9062F, 20.0031F, 0.3451F, -0.0012F, 0.0465F));

		PartDefinition cube_r487 = osteoderms8.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(91, 102).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7447F, 26.1567F, 21.3851F, 0.2814F, -0.1777F, 0.2122F));

		PartDefinition cube_r488 = osteoderms8.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(92, 41).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.9699F, 27.8422F, 15.941F, 0.2867F, -0.0626F, 0.1912F));

		PartDefinition cube_r489 = osteoderms8.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(73, 52).addBox(-1.4F, -0.5F, -3.75F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.2689F, 29.4234F, 18.1635F, 0.3597F, -0.2799F, -0.0566F));

		PartDefinition osteoderms19 = tail2.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -33.9489F, -4.8011F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r490 = osteoderms19.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(11, 104).mirror().addBox(-2.6178F, -0.1859F, -1.2151F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(14, 85).mirror().addBox(-0.3178F, -0.1859F, 0.3849F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8518F, 26.9356F, 23.0371F, 0.3472F, 0.1325F, 0.1018F));

		PartDefinition cube_r491 = osteoderms19.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(96, 12).mirror().addBox(-2.0771F, 0.0657F, -0.2072F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(-6.8215F, 26.2991F, 23.618F, 0.7984F, 1.0804F, 0.7898F));

		PartDefinition cube_r492 = osteoderms19.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(26, 96).mirror().addBox(-2.8697F, -0.9866F, -0.9667F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.0518F, 28.446F, 21.1719F, 0.4882F, 0.7681F, 0.4075F));

		PartDefinition cube_r493 = osteoderms19.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(29, 100).mirror().addBox(-0.9855F, 0.0657F, -1.2005F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-5.8339F, 26.0825F, 24.3703F, 0.3445F, 0.0504F, 0.0721F));

		PartDefinition cube_r494 = osteoderms19.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(87, 28).mirror().addBox(-1.6865F, -0.2159F, -3.5185F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.4518F, 26.9356F, 23.3371F, 0.3569F, 0.2636F, 0.1508F));

		PartDefinition cube_r495 = osteoderms19.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-5.9768F, 29.5684F, 18.0488F, 0.4138F, 0.5713F, 0.1862F));

		PartDefinition cube_r496 = osteoderms19.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(39, 96).mirror().addBox(-3.9388F, 0.3441F, -0.1399F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-7.8124F, 29.0055F, 17.3571F, 0.8761F, 1.1149F, 0.7758F));

		PartDefinition cube_r497 = osteoderms19.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-0.3872F, -1.7982F, -2.248F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-6.1597F, 30.4715F, 19.4007F, 0.5341F, 0.844F, 0.3692F));

		PartDefinition cube_r498 = osteoderms19.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(64, 8).mirror().addBox(-4.8588F, -0.6766F, -1.3551F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.8518F, 28.9062F, 20.0031F, 0.3451F, 0.0012F, -0.0465F));

		PartDefinition cube_r499 = osteoderms19.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(91, 102).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7447F, 26.1567F, 21.3851F, 0.2814F, 0.1777F, -0.2122F));

		PartDefinition cube_r500 = osteoderms19.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.9699F, 27.8422F, 15.941F, 0.2867F, 0.0626F, -0.1912F));

		PartDefinition cube_r501 = osteoderms19.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-0.6F, -0.5F, -3.75F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-4.2689F, 29.4234F, 18.1635F, 0.3597F, 0.2799F, 0.0566F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(49, 24).addBox(0.0F, -1.7F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 0).addBox(0.0F, -1.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 54).addBox(0.0F, -1.4F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(0.0F, -1.4F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.4316F, -0.3876F, -0.0647F));

		PartDefinition cube_r502 = tail3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(48, 56).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 56).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 58).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 58).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r503 = tail3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -1.5F, 10.9F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -11.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1089F, 0.397F, 10.2053F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r504 = osteoderms9.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(50, 85).addBox(-1.1268F, -0.5249F, -1.468F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(71, 81).addBox(-2.4268F, -0.5249F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 13).addBox(-2.4268F, -0.5249F, -2.868F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.309F, -0.1631F, -5.3764F, -0.0517F, -0.0539F, -0.0294F));

		PartDefinition cube_r505 = osteoderms9.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(33, 21).addBox(-0.7382F, -0.6398F, -0.7489F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.291F, -0.1631F, -7.9764F, -0.089F, -0.951F, 0.0403F));

		PartDefinition cube_r506 = osteoderms9.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(62, 99).addBox(-3.5F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.7774F, -0.1869F, -4.4398F, -0.054F, 0.2947F, -0.0479F));

		PartDefinition cube_r507 = osteoderms9.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(90, 34).addBox(-2.2095F, -0.5389F, -2.4866F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0969F, -0.7389F, -1.1681F, 0.1404F, -0.0473F, -0.0391F));

		PartDefinition cube_r508 = osteoderms9.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(9, 108).addBox(0.7582F, 0.5888F, -2.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4587F, -2.9755F, -2.1296F, 0.0598F, -0.0503F, 0.2392F));

		PartDefinition cube_r509 = osteoderms9.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(48, 107).addBox(0.4679F, -0.6301F, -1.6015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.3481F, -1.6415F, -6.5917F, -0.0447F, -0.0939F, 0.2366F));

		PartDefinition cube_r510 = osteoderms9.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(16, 100).addBox(-1.7605F, -0.5389F, -0.5951F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0969F, -0.7389F, -1.1681F, 0.1405F, 0.0564F, -0.0245F));

		PartDefinition cube_r511 = osteoderms9.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(93, 98).addBox(-0.3293F, -0.2582F, 0.1327F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4606F, -0.6537F, -3.6514F, 0.1755F, -0.6425F, -0.1383F));

		PartDefinition osteoderms20 = tail3.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1089F, 0.397F, 10.2053F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r512 = osteoderms20.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(-0.8732F, -0.5249F, -1.468F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(71, 81).mirror().addBox(0.4268F, -0.5249F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 13).mirror().addBox(0.4268F, -0.5249F, -2.868F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.309F, -0.1631F, -5.3764F, -0.0517F, 0.0539F, 0.0294F));

		PartDefinition cube_r513 = osteoderms20.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-5.2618F, -0.6398F, -0.7489F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.291F, -0.1631F, -7.9764F, -0.0695F, 0.7335F, -0.0144F));

		PartDefinition cube_r514 = osteoderms20.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(62, 99).mirror().addBox(-0.5F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.7774F, -0.1869F, -4.4398F, -0.054F, -0.2947F, 0.0479F));

		PartDefinition cube_r515 = osteoderms20.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(0.2095F, -0.5389F, -2.4866F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0969F, -0.7389F, -1.1681F, 0.1404F, 0.0473F, 0.0391F));

		PartDefinition cube_r516 = osteoderms20.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(9, 108).mirror().addBox(-1.7582F, 0.5888F, -2.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4587F, -2.9755F, -2.1296F, 0.0598F, 0.0503F, -0.2392F));

		PartDefinition cube_r517 = osteoderms20.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-1.4679F, -0.6301F, -1.6015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.3481F, -1.6415F, -6.5917F, -0.0447F, 0.0939F, -0.2366F));

		PartDefinition cube_r518 = osteoderms20.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(16, 100).mirror().addBox(-2.2395F, -0.5389F, -0.5951F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.0969F, -0.7389F, -1.1681F, 0.1405F, -0.0564F, 0.0245F));

		PartDefinition cube_r519 = osteoderms20.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(93, 98).mirror().addBox(-3.6707F, -0.2582F, 0.1327F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4606F, -0.6537F, -3.6514F, 0.1755F, 0.6425F, 0.1383F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(100, 82).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 51).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 95).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 70).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.4161F, -0.3858F, -0.0753F));

		PartDefinition cube_r520 = tail4.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(43, 21).addBox(-1.0F, -1.7F, 10.7F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail4.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(20, 40).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 25).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 80).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -12.7721F, 1.1034F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r522 = osteoderms10.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(22, 104).addBox(-3.1871F, 0.144F, -2.874F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.4003F, -0.6748F, -0.288F));

		PartDefinition cube_r523 = osteoderms10.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(18, 108).addBox(-1.5F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.3678F, 10.4844F, 7.2109F, 0.3318F, 0.3652F, 0.0928F));

		PartDefinition cube_r524 = osteoderms10.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(101, 38).addBox(-2.3213F, 0.144F, -4.0888F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.3092F, -0.0163F, -0.0348F));

		PartDefinition cube_r525 = osteoderms10.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(73, 96).addBox(-0.3917F, -0.0065F, -0.3245F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.1739F, 9.3063F, 8.5978F, 0.7719F, -1.0118F, -0.7203F));

		PartDefinition cube_r526 = osteoderms10.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(0, 104).addBox(-0.2987F, 0.0512F, -1.6532F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.6739F, 8.0817F, 11.5542F, 0.4166F, -0.4171F, -0.2078F));

		PartDefinition cube_r527 = osteoderms10.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(107, 24).addBox(-0.2091F, 0.7629F, -1.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3839F, 7.3671F, 9.5558F, 0.3228F, -0.0895F, 0.2141F));

		PartDefinition cube_r528 = osteoderms10.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(107, 72).addBox(-0.2622F, 0.4643F, -1.3843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4839F, 8.8978F, 5.8603F, 0.3066F, -0.1335F, 0.2128F));

		PartDefinition cube_r529 = osteoderms10.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(92, 2).addBox(-2.1264F, -0.0108F, -0.7309F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.379F, -0.0138F, -0.0359F));

		PartDefinition osteoderms21 = tail4.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -12.7721F, 1.1034F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r530 = osteoderms21.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(22, 104).mirror().addBox(0.1871F, 0.144F, -2.874F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.4003F, 0.6748F, 0.288F));

		PartDefinition cube_r531 = osteoderms21.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(18, 108).mirror().addBox(-0.5F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-5.3678F, 10.4844F, 7.2109F, 0.3318F, -0.3652F, -0.0928F));

		PartDefinition cube_r532 = osteoderms21.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(0.3213F, 0.144F, -4.0888F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.3092F, 0.0163F, 0.0348F));

		PartDefinition cube_r533 = osteoderms21.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(73, 96).mirror().addBox(-3.6083F, -0.0065F, -0.3245F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-5.1739F, 9.3063F, 8.5978F, 0.7719F, 1.0118F, 0.7203F));

		PartDefinition cube_r534 = osteoderms21.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-2.7013F, 0.0512F, -1.6532F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6739F, 8.0817F, 11.5542F, 0.4166F, 0.4171F, 0.2078F));

		PartDefinition cube_r535 = osteoderms21.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(107, 24).mirror().addBox(-0.7909F, 0.7629F, -1.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3839F, 7.3671F, 9.5558F, 0.3228F, 0.0895F, -0.2141F));

		PartDefinition cube_r536 = osteoderms21.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(107, 72).mirror().addBox(-0.7378F, 0.4643F, -1.3843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4839F, 8.8978F, 5.8603F, 0.3066F, 0.1335F, -0.2128F));

		PartDefinition cube_r537 = osteoderms21.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(92, 2).mirror().addBox(0.1264F, -0.0108F, -0.7309F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.379F, 0.0138F, 0.0359F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.7421F, -0.1865F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2262F, 8.9999F, 0.349F, -0.5199F, -0.0653F));

		PartDefinition cube_r538 = tail5.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(33, 9).addBox(-0.5F, -2.1998F, 10.8061F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -11.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -12.7662F, -1.0275F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition cube_r539 = osteoderms11.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(68, 43).addBox(-0.0329F, -1.7308F, -0.2379F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.802F, 7.3189F, 11.599F, -2.4988F, -0.5414F, 1.5814F));

		PartDefinition cube_r540 = osteoderms11.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(0, 76).addBox(-0.3713F, -3.0062F, -1.6332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.802F, 8.9189F, 9.199F, -3.0923F, -0.5324F, 1.5731F));

		PartDefinition cube_r541 = osteoderms11.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3068F, -0.294F, -1.7467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.402F, 10.0189F, 7.199F, 1.9168F, -0.5324F, 1.5731F));

		PartDefinition cube_r542 = osteoderms11.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(92, 91).addBox(-0.498F, -1.8058F, 2.2916F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.502F, 7.1189F, 12.499F, 3.1385F, -0.5324F, 1.5731F));

		PartDefinition cube_r543 = osteoderms11.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(46, 7).addBox(-0.7943F, -2.7058F, -0.3555F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.802F, 7.3189F, 13.099F, 3.1212F, -0.5414F, 1.5814F));

		PartDefinition cube_r544 = osteoderms11.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(22, 71).addBox(-0.7967F, -0.9676F, -1.0303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.802F, 7.3189F, 13.099F, 2.3531F, -0.5324F, 1.5731F));

		PartDefinition cube_r545 = osteoderms11.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(107, 9).addBox(-0.1078F, 1.6354F, -3.454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2242F, 5.9792F, 8.9444F, 0.4997F, -0.1279F, 0.1931F));

		PartDefinition cube_r546 = osteoderms11.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(110, 14).addBox(-0.1022F, -0.2909F, -1.7266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7013F, 6.1435F, 13.8853F, 1.6986F, -0.5324F, 1.5731F));

		PartDefinition cube_r547 = osteoderms11.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(45, 106).addBox(-0.2047F, -0.4707F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2013F, 6.1435F, 14.0853F, 2.3095F, -0.5324F, 1.5731F));

		PartDefinition osteoderms22 = tail5.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -12.7662F, -1.0275F, -0.5062F, -0.0153F, 0.0085F));

		PartDefinition cube_r548 = osteoderms22.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-0.9671F, -1.7308F, -0.2379F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 7.3189F, 11.599F, -2.4988F, 0.5414F, -1.5814F));

		PartDefinition cube_r549 = osteoderms22.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.6287F, -3.0062F, -1.6332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.802F, 8.9189F, 9.199F, -3.0923F, 0.5324F, -1.5731F));

		PartDefinition cube_r550 = osteoderms22.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.6932F, -0.294F, -1.7467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.402F, 10.0189F, 7.199F, 1.9168F, 0.5324F, -1.5731F));

		PartDefinition cube_r551 = osteoderms22.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-0.502F, -1.8058F, 2.2916F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.502F, 7.1189F, 12.499F, 3.1385F, 0.5324F, -1.5731F));

		PartDefinition cube_r552 = osteoderms22.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-0.2057F, -2.7058F, -0.3555F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 7.3189F, 13.099F, 3.1212F, 0.5414F, -1.5814F));

		PartDefinition cube_r553 = osteoderms22.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(-0.2033F, -0.9676F, -1.0303F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.802F, 7.3189F, 13.099F, 2.3531F, 0.5324F, -1.5731F));

		PartDefinition cube_r554 = osteoderms22.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(107, 9).mirror().addBox(-0.8922F, 1.6354F, -3.454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2242F, 5.9792F, 8.9444F, 0.4997F, 0.1279F, -0.1931F));

		PartDefinition cube_r555 = osteoderms22.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(110, 14).mirror().addBox(-0.8978F, -0.2909F, -1.7266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7013F, 6.1435F, 13.8853F, 1.6986F, 0.5324F, -1.5731F));

		PartDefinition cube_r556 = osteoderms22.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.7953F, -0.4707F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2013F, 6.1435F, 14.0853F, 2.3095F, 0.5324F, -1.5731F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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