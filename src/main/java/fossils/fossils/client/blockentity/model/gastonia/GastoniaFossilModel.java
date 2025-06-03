package fossils.fossils.client.blockentity.model.gastonia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GastoniaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms17;
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
	private final ModelPart backPlates3;
	private final ModelPart backPlates4;
	private final ModelPart body;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms16;
	private final ModelPart chest;
	private final ModelPart backPlates;
	private final ModelPart backPlates6;
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
	private final ModelPart osteoderms13;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms14;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart backPlates2;
	private final ModelPart backPlates5;
	private final ModelPart tail;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms22;
	private final ModelPart osteoderms7;
	private final ModelPart tail2;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms18;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms19;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms20;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms21;

	public GastoniaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms6 = this.hips.getChild("osteoderms6");
		this.osteoderms17 = this.hips.getChild("osteoderms17");
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
		this.backPlates3 = this.hips.getChild("backPlates3");
		this.backPlates4 = this.hips.getChild("backPlates4");
		this.body = this.hips.getChild("body");
		this.osteoderms5 = this.body.getChild("osteoderms5");
		this.osteoderms16 = this.body.getChild("osteoderms16");
		this.chest = this.body.getChild("chest");
		this.backPlates = this.chest.getChild("backPlates");
		this.backPlates6 = this.chest.getChild("backPlates6");
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
		this.osteoderms13 = this.neck3.getChild("osteoderms13");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms14 = this.neck2.getChild("osteoderms14");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.backPlates5 = this.body.getChild("backPlates5");
		this.tail = this.hips.getChild("tail");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms22 = this.tail.getChild("osteoderms22");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms18 = this.tail2.getChild("osteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms19 = this.tail3.getChild("osteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms20 = this.tail4.getChild("osteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms21 = this.tail5.getChild("osteoderms21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -19.9F, 6.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 88).addBox(0.5F, -1.9106F, -5.0576F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.1F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -0.0338F, -7.0284F, 13.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 19).addBox(-6.0F, -0.1303F, -0.0543F, 13.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.8F, -1.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 71).addBox(0.0F, 0.0199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.0809F, -3.6405F, -1.3386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.3435F, 0.697F, -0.6542F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 79).mirror().addBox(0.9189F, -4.2568F, 0.3365F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.6805F, -0.2751F, -0.1576F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(-0.908F, -3.8069F, -4.7978F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1872F, 0.2273F, -0.5419F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 39).mirror().addBox(-2.3769F, -3.7813F, -7.7721F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1826F, 0.0557F, -0.5095F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 113).mirror().addBox(0.798F, -3.653F, -6.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.1966F, 0.3815F, -0.5733F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 80).mirror().addBox(-2.6775F, -3.794F, -0.6057F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.418F, 0.0474F, -0.35F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 99).mirror().addBox(-2.7869F, -4.2568F, 0.5627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.684F, 0.2897F, -0.603F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 103).mirror().addBox(-1.3997F, -4.2568F, 1.1152F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1631F, 2.8274F, 0.0403F, -0.6504F, 0.0005F, -0.3745F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 27).mirror().addBox(-0.9584F, 1.1072F, 2.0987F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.4499F, 0.0397F, -0.8241F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 61).mirror().addBox(-0.5564F, -2.7896F, 0.7617F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, -0.3291F, -0.0553F, -0.1911F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-2.804F, -0.0347F, 1.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 59).mirror().addBox(-6.9871F, 0.2176F, -0.4376F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4871F, 0.5236F, -0.0968F, -0.2965F, 0.0071F, 0.1301F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(-5.996F, 0.0347F, -2.4997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4871F, 0.5236F, -0.0968F, -0.2966F, 0.002F, 0.1134F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-8.0023F, 0.0417F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -3.7F, -0.0174F, 0.0012F, 0.0698F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-9.0023F, 0.0417F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.2911F, -5.7F, -0.0174F, 0.0012F, 0.0698F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-0.6404F, 0.6027F, 1.4915F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.6488F, -0.0021F, -0.4599F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.8773F, 2.8685F, 4.3121F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, -0.0388F, 0.0397F, -0.8241F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 27).mirror().addBox(-0.1257F, 1.4115F, 1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.2652F, -0.1565F, -0.8636F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.1257F, -0.9123F, 0.7533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.3631F, 2.4274F, -1.9597F, 0.4223F, -0.1565F, -0.8636F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 79).addBox(-2.9189F, -4.2568F, 0.3365F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.6805F, 0.2751F, 0.1576F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(103, 0).addBox(-1.9191F, -3.6405F, -1.3386F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.3435F, -0.697F, 0.6542F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(24, 59).addBox(-1.092F, -3.8069F, -4.7978F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1872F, -0.2273F, 0.5419F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(39, 39).addBox(0.3769F, -3.7813F, -7.7721F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1826F, -0.0557F, 0.5095F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 113).addBox(-1.798F, -3.653F, -6.3704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.1966F, -0.3815F, 0.5733F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 80).addBox(-2.3225F, -3.794F, -0.6057F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.418F, -0.0474F, 0.35F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(9, 99).addBox(1.7869F, -4.2568F, 0.5627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.684F, -0.2897F, 0.603F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 103).addBox(-0.6003F, -4.2568F, 1.1152F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1631F, 2.8274F, 0.0403F, -0.6504F, -0.0005F, 0.3745F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 27).addBox(-0.0416F, 1.1072F, 2.0987F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.4499F, -0.0397F, 0.8241F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 61).addBox(-0.4436F, -2.7896F, 0.7617F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, -0.3291F, 0.0553F, 0.1911F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(103, 45).addBox(-2.196F, -0.0347F, 1.4997F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 59).addBox(-0.0129F, 0.2176F, -0.4376F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4871F, 0.5236F, -0.0968F, -0.2965F, -0.0071F, -0.1301F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 54).addBox(-2.004F, 0.0347F, -2.4997F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4871F, 0.5236F, -0.0968F, -0.2966F, -0.002F, -0.1134F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(81, 75).addBox(0.0023F, 0.0417F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -3.7F, -0.0174F, -0.0012F, -0.0698F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 41).addBox(0.0023F, 0.0417F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.2911F, -5.7F, -0.0174F, -0.0012F, -0.0698F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 5).addBox(-0.3596F, 0.6027F, 1.4915F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.6488F, 0.0021F, 0.4599F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 19).addBox(-0.1227F, 2.8685F, 4.3121F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, -0.0388F, -0.0397F, 0.8241F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 27).addBox(-0.8743F, 1.4115F, 1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.2652F, 0.1565F, 0.8636F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 59).addBox(-0.8743F, -0.9123F, 0.7533F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.3631F, 2.4274F, -1.9597F, 0.4223F, 0.1565F, 0.8636F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(73, 98).addBox(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(74, 89).addBox(0.48F, -1.717F, -0.192F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -6.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = hips.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, -14.066F, -8.4611F, -0.3499F, -0.0656F, 0.0239F));

		PartDefinition cube_r45 = osteoderms6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(109, 118).addBox(6.9122F, 10.1367F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(117, 78).addBox(6.9122F, 9.8367F, 1.4064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0822F, 0.0131F, 1.281F, 0.2392F, -0.2776F, 0.5931F));

		PartDefinition cube_r46 = osteoderms6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 99).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7062F, 10.7059F, 5.4762F, 0.3166F, -0.1268F, 0.4399F));

		PartDefinition cube_r47 = osteoderms6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 41).addBox(-2.3245F, 0.5781F, -1.9968F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(3.7595F, 12.0737F, 9.8584F, 0.2952F, 0.0627F, -0.0947F));

		PartDefinition cube_r48 = osteoderms6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 29).addBox(-2.2671F, 0.6002F, -0.2475F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(3.7595F, 12.0737F, 9.8584F, 0.2975F, 0.1378F, -0.0716F));

		PartDefinition cube_r49 = osteoderms6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(83, 97).addBox(-1.5168F, 0.6002F, -1.0903F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(3.7595F, 12.0737F, 9.8584F, 0.2972F, -0.1294F, -0.1532F));

		PartDefinition cube_r50 = osteoderms6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 32).addBox(-2.6674F, 0.6002F, -1.8639F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.7595F, 12.0737F, 9.8584F, 0.2673F, -0.3209F, -0.2148F));

		PartDefinition cube_r51 = osteoderms6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(73, 45).addBox(-2.6358F, -0.4847F, -2.0377F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.5595F, 12.0737F, 14.8584F, 0.2024F, -0.3415F, -0.1794F));

		PartDefinition cube_r52 = osteoderms6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 98).addBox(-1.4512F, -0.4847F, -1.2543F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(3.5595F, 12.0737F, 14.8584F, 0.1926F, -0.1446F, -0.1389F));

		PartDefinition cube_r53 = osteoderms6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 82).addBox(-2.1589F, -0.4847F, -0.3871F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(3.5595F, 12.0737F, 14.8584F, 0.1922F, 0.1295F, -0.0857F));

		PartDefinition cube_r54 = osteoderms6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(85, 91).addBox(-2.2275F, -0.5067F, -2.1444F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(3.5595F, 12.0737F, 14.8584F, 0.1908F, 0.0524F, -0.1007F));

		PartDefinition cube_r55 = osteoderms6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(73, 37).addBox(-2.7581F, -0.4562F, -4.078F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.6791F, 11.0613F, 21.1822F, 0.2889F, -0.6884F, -0.0892F));

		PartDefinition cube_r56 = osteoderms6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(99, 27).addBox(-2.1459F, -0.4342F, -1.0306F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.6791F, 11.0613F, 21.1822F, 0.7053F, -1.2244F, -0.5778F));

		PartDefinition cube_r57 = osteoderms6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 67).addBox(-1.3856F, -0.4342F, 0.2603F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.6791F, 11.0613F, 21.1822F, 0.5544F, -1.1396F, -0.415F));

		PartDefinition cube_r58 = osteoderms6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 25).addBox(-4.0841F, -0.4342F, -1.7179F, 10.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6791F, 11.0613F, 21.1822F, 1.7344F, -1.3459F, -1.6412F));

		PartDefinition cube_r59 = osteoderms6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(112, 14).addBox(4.3194F, 11.1647F, -0.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 112).addBox(1.3194F, 11.6647F, -0.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4366F, -1.4303F, 1.1587F, 0.3262F, 0.0331F, 0.1932F));

		PartDefinition osteoderms17 = hips.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, -14.066F, -8.4611F, -0.3499F, 0.0656F, -0.0239F));

		PartDefinition cube_r60 = osteoderms17.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(109, 118).mirror().addBox(-7.9122F, 10.1367F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(117, 78).mirror().addBox(-7.9122F, 9.8367F, 1.4064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0822F, 0.0131F, 1.281F, 0.2392F, 0.2776F, -0.5931F));

		PartDefinition cube_r61 = osteoderms17.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(52, 99).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7062F, 10.7059F, 5.4762F, 0.3166F, 0.1268F, -0.4399F));

		PartDefinition cube_r62 = osteoderms17.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 41).mirror().addBox(0.3245F, 0.5781F, -1.9968F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-3.7595F, 12.0737F, 9.8584F, 0.2952F, -0.0627F, 0.0947F));

		PartDefinition cube_r63 = osteoderms17.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 29).mirror().addBox(-3.7329F, 0.6002F, -0.2475F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-3.7595F, 12.0737F, 9.8584F, 0.2975F, -0.1378F, 0.0716F));

		PartDefinition cube_r64 = osteoderms17.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-2.4832F, 0.6002F, -1.0903F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-3.7595F, 12.0737F, 9.8584F, 0.2972F, 0.1294F, 0.1532F));

		PartDefinition cube_r65 = osteoderms17.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 32).mirror().addBox(-4.3326F, 0.6002F, -1.8639F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.7595F, 12.0737F, 9.8584F, 0.2673F, 0.3209F, 0.2148F));

		PartDefinition cube_r66 = osteoderms17.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-4.3642F, -0.4847F, -2.0377F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.5595F, 12.0737F, 14.8584F, 0.2024F, 0.3415F, 0.1794F));

		PartDefinition cube_r67 = osteoderms17.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 98).mirror().addBox(-2.5488F, -0.4847F, -1.2543F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-3.5595F, 12.0737F, 14.8584F, 0.1926F, 0.1446F, 0.1389F));

		PartDefinition cube_r68 = osteoderms17.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-3.8411F, -0.4847F, -0.3871F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-3.5595F, 12.0737F, 14.8584F, 0.1922F, -0.1295F, 0.0857F));

		PartDefinition cube_r69 = osteoderms17.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(0.2275F, -0.5067F, -2.1444F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-3.5595F, 12.0737F, 14.8584F, 0.1908F, -0.0524F, 0.1007F));

		PartDefinition cube_r70 = osteoderms17.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(73, 37).mirror().addBox(0.7581F, -0.4562F, -4.078F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 11.0613F, 21.1822F, 0.2889F, 0.6884F, 0.0892F));

		PartDefinition cube_r71 = osteoderms17.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(-1.8541F, -0.4342F, -1.0306F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 11.0613F, 21.1822F, 0.7053F, 1.2244F, 0.5778F));

		PartDefinition cube_r72 = osteoderms17.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-4.6144F, -0.4342F, 0.2603F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 11.0613F, 21.1822F, 0.5544F, 1.1396F, 0.415F));

		PartDefinition cube_r73 = osteoderms17.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 25).mirror().addBox(-5.9159F, -0.4342F, -1.7179F, 10.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 11.0613F, 21.1822F, 1.7344F, 1.3459F, 1.6412F));

		PartDefinition cube_r74 = osteoderms17.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-5.3194F, 11.1647F, -0.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 112).mirror().addBox(-2.3194F, 11.6647F, -0.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.4366F, -1.4303F, 1.1587F, 0.3262F, -0.0331F, -0.1932F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(20, 92).addBox(-1.5F, 8.175F, -3.9828F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.4F, 1.4999F, -0.1448F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 20).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(65, 52).addBox(-0.1F, 0.1146F, -0.8774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 70).addBox(-0.1F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 99).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(97, 107).addBox(-1.0F, -1.5069F, -1.3912F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 5.2861F, 3.3792F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(68, 5).addBox(-1.5F, -5.8767F, 0.9507F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(28, 48).addBox(-0.601F, -1.7989F, 0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftleg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(103, 52).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(41, 6).addBox(-1.102F, -1.4938F, 0.1431F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(88, 0).addBox(-1.999F, -0.5853F, -2.8254F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftleg4 = hips.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-1.5F, 8.175F, -3.9828F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.4F, 1.4999F, -0.1448F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftleg4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(96, 20).mirror().addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftleg4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1012F, -3.5118F, 0.0874F, 0.0049F, 0.0016F));

		PartDefinition cube_r86 = leftleg5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-0.9F, 0.1146F, -0.8774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.8503F, 2.8988F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftleg5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-0.9F, -0.2383F, 0.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 0.6988F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftleg5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftleg5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-1.0F, -1.5069F, -1.3912F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 5.2861F, 3.3792F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftleg5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-0.5F, -5.8767F, 0.9507F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftleg5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-0.399F, -1.7989F, 0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftleg6 = leftleg5.addOrReplaceChild("leftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.6678F, 2.5803F, -0.358F, -0.0075F, -0.002F));

		PartDefinition cube_r92 = leftleg6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(41, 6).mirror().addBox(-1.898F, -1.4938F, 0.1431F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot3 = leftleg6.addOrReplaceChild("leftfoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot4 = leftfoot3.addOrReplaceChild("leftfoot4", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-2.001F, -0.5853F, -2.8254F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4752F, 0.5373F, 0.4712F, 0.0F, 0.0F));

		PartDefinition backPlates3 = hips.addOrReplaceChild("backPlates3", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1F, -14.7511F, -8.4674F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r93 = backPlates3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(59, 70).addBox(-3.2643F, -0.022F, -2.7714F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8882F, 18.7308F, 12.673F, -0.3088F, 0.1049F, 1.2146F));

		PartDefinition cube_r94 = backPlates3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(23, 39).addBox(-4.3654F, -0.6378F, -3.5574F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1408F, 16.1839F, 12.6565F, -0.3696F, 0.0037F, 0.5103F));

		PartDefinition cube_r95 = backPlates3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 49).addBox(-4.6868F, -0.7398F, -0.0558F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5484F, 19.2331F, 7.1321F, -0.0313F, 0.0492F, 1.392F));

		PartDefinition cube_r96 = backPlates3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 27).addBox(-4.5725F, -0.9528F, -10.9478F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5484F, 19.2331F, 10.1321F, 0.1994F, 0.0381F, 1.4787F));

		PartDefinition cube_r97 = backPlates3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(75, 19).addBox(-0.2047F, 0.0206F, -0.1805F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2123F, 11.9228F, 7.1697F, -0.1684F, 0.1849F, 0.5588F));

		PartDefinition cube_r98 = backPlates3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(55, 43).addBox(-0.013F, -0.2578F, -3.5799F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.796F, 11.9419F, 3.6967F, 0.1348F, 0.1822F, 0.5942F));

		PartDefinition backPlates4 = hips.addOrReplaceChild("backPlates4", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1F, -14.7511F, -8.4674F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r99 = backPlates4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(0.2643F, -0.022F, -2.7714F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8882F, 18.7308F, 12.673F, -0.3088F, -0.1049F, -1.2146F));

		PartDefinition cube_r100 = backPlates4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(23, 39).mirror().addBox(-0.6346F, -0.6378F, -3.5574F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1408F, 16.1839F, 12.6565F, -0.3696F, -0.0037F, -0.5103F));

		PartDefinition cube_r101 = backPlates4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-0.3132F, -0.7398F, -0.0558F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5484F, 19.2331F, 7.1321F, -0.0313F, -0.0492F, -1.392F));

		PartDefinition cube_r102 = backPlates4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.4275F, -0.9528F, -10.9478F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5484F, 19.2331F, 10.1321F, 0.1994F, -0.0381F, -1.4787F));

		PartDefinition cube_r103 = backPlates4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-4.7953F, 0.0206F, -0.1805F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2123F, 11.9228F, 7.1697F, -0.1684F, -0.1849F, -0.5588F));

		PartDefinition cube_r104 = backPlates4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-4.987F, -0.2578F, -3.5799F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.796F, 11.9419F, 3.6967F, 0.1348F, -0.1822F, -0.5942F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -9.3F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(56, 84).addBox(0.5F, -1.9278F, -0.0823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(37, 86).addBox(0.5F, -2.1248F, 3.8203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(80, 98).addBox(0.5F, -1.9918F, 1.8215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 100).addBox(0.5F, -1.8918F, -0.1785F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 37).addBox(0.0F, 0.0082F, -0.1785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 10).addBox(-6.0F, -0.1414F, 0.1585F, 13.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4998F, -6.0586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-6.7777F, 0.355F, 5.9009F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.052F, 0.0059F, 0.1133F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-8.3667F, -4.1794F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0432F, -0.0296F, -0.6015F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-5.2623F, -8.7655F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, -0.0113F, -0.0511F, -1.3523F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 73).mirror().addBox(-6.719F, 0.8698F, 3.8747F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0347F, -0.004F, 0.1134F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 36).mirror().addBox(-8.6603F, -3.7522F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0288F, 0.0198F, -0.6019F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(107, 56).mirror().addBox(-7.7684F, -8.6533F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0076F, 0.0341F, -1.3525F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(99, 37).mirror().addBox(-6.6867F, 1.1538F, 1.7833F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1734F, -0.0197F, 0.1117F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-8.8233F, -3.5151F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.1443F, 0.0985F, -0.595F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-10.0493F, -8.5911F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0381F, 0.1704F, -1.3494F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-6.683F, 1.1039F, -0.3359F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.295F, -0.0325F, 0.126F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-8.7897F, -3.5476F, -0.3033F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.2465F, 0.1669F, -0.5641F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(95, 83).mirror().addBox(-10.0025F, -8.5919F, -0.3033F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4F, -4.9F, 0.0655F, 0.2896F, -1.3257F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(99, 43).addBox(0.7777F, 0.355F, 5.9009F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.052F, -0.0059F, -0.1133F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(84, 41).addBox(5.3667F, -4.1794F, 5.8992F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0432F, 0.0296F, 0.6015F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(104, 89).addBox(3.2623F, -8.7655F, 5.8992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, -0.0113F, 0.0511F, 1.3523F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(98, 73).addBox(0.719F, 0.8698F, 3.8747F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0347F, 0.004F, -0.1134F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 36).addBox(5.6603F, -3.7522F, 3.8817F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0288F, -0.0198F, 0.6019F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(107, 56).addBox(3.7684F, -8.6533F, 3.8817F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0076F, -0.0341F, 1.3525F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 37).addBox(0.6867F, 1.1538F, 1.7833F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1734F, 0.0197F, -0.1117F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(22, 78).addBox(5.8233F, -3.5151F, 1.8041F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.1443F, -0.0985F, 0.595F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(94, 91).addBox(4.0493F, -8.5911F, 1.8041F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0381F, -0.1704F, 1.3494F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(98, 9).addBox(0.683F, 1.1039F, -0.3359F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.295F, 0.0325F, -0.126F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 71).addBox(5.7897F, -3.5476F, -0.3033F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.2465F, -0.1669F, 0.5641F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(95, 83).addBox(4.0025F, -8.5919F, -0.3033F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4F, -4.9F, 0.0655F, -0.2896F, 1.3257F));

		PartDefinition osteoderms5 = body.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -11.9308F, -4.1488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r133 = osteoderms5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(106, 112).addBox(0.9695F, 10.1786F, 7.6337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4214F, 0.5283F, -4.6971F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r134 = osteoderms5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(37, 50).addBox(1.2695F, 11.6816F, -2.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.206F, -1.2082F, 0.6851F, 0.2215F, 0.0331F, 0.1932F));

		PartDefinition cube_r135 = osteoderms5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(117, 117).addBox(11.1855F, 1.8737F, 2.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(83, 118).addBox(11.1855F, 1.8737F, 0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 108).addBox(11.1855F, 1.8737F, -1.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7234F, 2.6424F, 0.5212F, 0.3008F, -0.1132F, 1.1907F));

		PartDefinition cube_r136 = osteoderms5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 102).addBox(-3.306F, -0.3661F, -1.3749F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.6608F, 16.3002F, 3.2812F, 0.2278F, 0.0461F, 0.0834F));

		PartDefinition cube_r137 = osteoderms5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(96, 69).addBox(-2.8429F, -0.3441F, -0.2161F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(9.6608F, 16.3002F, 3.2812F, 0.2252F, 0.0049F, 0.0291F));

		PartDefinition cube_r138 = osteoderms5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(104, 75).addBox(-0.3573F, -0.4282F, -1.6671F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(6.6654F, 16.4946F, 2.4439F, 0.3094F, -0.7474F, -0.186F));

		PartDefinition cube_r139 = osteoderms5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(29, 78).addBox(-3.7F, -0.5F, 0.3F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.8412F, 16.6232F, 2.7144F, 0.2688F, -0.5716F, -0.12F));

		PartDefinition cube_r140 = osteoderms5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(84, 37).addBox(-4.0F, -0.5F, -0.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(11.4412F, 15.6232F, 7.0144F, 0.2688F, -0.5716F, -0.12F));

		PartDefinition cube_r141 = osteoderms5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(72, 85).addBox(-3.2F, -0.5F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(10.3654F, 15.4946F, 7.4439F, 0.241F, -0.3605F, -0.0585F));

		PartDefinition cube_r142 = osteoderms5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(118, 114).addBox(-0.4886F, -0.5943F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9506F, 10.284F, 4.5211F, 0.9197F, 0.1675F, 0.3211F));

		PartDefinition cube_r143 = osteoderms5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(119, 91).addBox(-0.5531F, -0.5111F, -0.2021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9506F, 10.284F, 4.5211F, -0.3282F, 0.1675F, 0.3211F));

		PartDefinition cube_r144 = osteoderms5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 117).addBox(-0.5105F, -0.7281F, 0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9506F, 10.284F, 4.5211F, 0.4421F, 0.1888F, 0.3002F));

		PartDefinition cube_r145 = osteoderms5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(117, 24).addBox(-0.5535F, -0.4857F, -0.198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.9597F, 9.96F, 2.119F, -0.0793F, 0.0806F, 0.352F));

		PartDefinition cube_r146 = osteoderms5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(114, 52).addBox(-0.489F, -0.5823F, -1.6137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9597F, 9.96F, 2.119F, 1.1686F, 0.0806F, 0.352F));

		PartDefinition cube_r147 = osteoderms5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 117).addBox(-0.5113F, -0.7071F, 0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9597F, 9.96F, 2.119F, 0.6934F, 0.1063F, 0.3374F));

		PartDefinition cube_r148 = osteoderms5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(33, 21).addBox(-3.2429F, -0.3441F, -0.6161F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(10.2608F, 15.3002F, 7.5812F, 0.2273F, 0.1325F, 0.0585F));

		PartDefinition cube_r149 = osteoderms5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(90, 14).addBox(-3.306F, -0.3661F, -2.3749F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(10.2608F, 15.3002F, 7.5812F, 0.2278F, 0.0461F, 0.0834F));

		PartDefinition cube_r150 = osteoderms5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 112).addBox(6.7022F, 9.6412F, 0.8873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 90).addBox(6.7022F, 9.6412F, -2.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1532F, -0.1216F, 0.89F, 0.2274F, 0.0093F, 0.4715F));

		PartDefinition cube_r151 = osteoderms5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(116, 88).addBox(8.3859F, 7.9407F, 0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(59, 73).addBox(8.3859F, 8.0407F, -1.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(85, 0).addBox(8.3859F, 8.1407F, -3.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.0373F, 0.7641F, 2.4118F, 0.23F, -0.0229F, 0.6545F));

		PartDefinition osteoderms16 = body.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -11.9308F, -4.1488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r152 = osteoderms16.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(106, 112).mirror().addBox(-1.9695F, 10.1786F, 7.6337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4214F, 0.5283F, -4.6971F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r153 = osteoderms16.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(37, 50).mirror().addBox(-2.2695F, 11.6816F, -2.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.206F, -1.2082F, 0.6851F, 0.2215F, -0.0331F, -0.1932F));

		PartDefinition cube_r154 = osteoderms16.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(117, 117).mirror().addBox(-12.1855F, 1.8737F, 2.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(83, 118).mirror().addBox(-12.1855F, 1.8737F, 0.9504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(37, 108).mirror().addBox(-12.1855F, 1.8737F, -1.0496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7234F, 2.6424F, 0.5212F, 0.3008F, 0.1132F, -1.1907F));

		PartDefinition cube_r155 = osteoderms16.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(1.306F, -0.3661F, -1.3749F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-9.6608F, 16.3002F, 3.2812F, 0.2278F, -0.0461F, -0.0834F));

		PartDefinition cube_r156 = osteoderms16.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 69).mirror().addBox(-1.1571F, -0.3441F, -0.2161F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-9.6608F, 16.3002F, 3.2812F, 0.2252F, -0.0049F, -0.0291F));

		PartDefinition cube_r157 = osteoderms16.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(104, 75).mirror().addBox(-2.6427F, -0.4282F, -1.6671F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-6.6654F, 16.4946F, 2.4439F, 0.3094F, 0.7474F, 0.186F));

		PartDefinition cube_r158 = osteoderms16.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(29, 78).mirror().addBox(-3.3F, -0.5F, 0.3F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-10.8412F, 16.6232F, 2.7144F, 0.2688F, 0.5716F, 0.12F));

		PartDefinition cube_r159 = osteoderms16.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-2.0F, -0.5F, -0.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-11.4412F, 15.6232F, 7.0144F, 0.2688F, 0.5716F, 0.12F));

		PartDefinition cube_r160 = osteoderms16.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-2.8F, -0.5F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-10.3654F, 15.4946F, 7.4439F, 0.241F, 0.3605F, 0.0585F));

		PartDefinition cube_r161 = osteoderms16.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(118, 114).mirror().addBox(-0.5114F, -0.5943F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9506F, 10.284F, 4.5211F, 0.9197F, -0.1675F, -0.3211F));

		PartDefinition cube_r162 = osteoderms16.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(119, 91).mirror().addBox(-0.4469F, -0.5111F, -0.2021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9506F, 10.284F, 4.5211F, -0.3282F, -0.1675F, -0.3211F));

		PartDefinition cube_r163 = osteoderms16.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(67, 117).mirror().addBox(-0.4895F, -0.7281F, 0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9506F, 10.284F, 4.5211F, 0.4421F, -0.1888F, -0.3002F));

		PartDefinition cube_r164 = osteoderms16.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(117, 24).mirror().addBox(-0.4465F, -0.4857F, -0.198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9597F, 9.96F, 2.119F, -0.0793F, -0.0806F, -0.352F));

		PartDefinition cube_r165 = osteoderms16.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(114, 52).mirror().addBox(-0.511F, -0.5823F, -1.6137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9597F, 9.96F, 2.119F, 1.1686F, -0.0806F, -0.352F));

		PartDefinition cube_r166 = osteoderms16.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 117).mirror().addBox(-0.4887F, -0.7071F, 0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9597F, 9.96F, 2.119F, 0.6934F, -0.1063F, -0.3374F));

		PartDefinition cube_r167 = osteoderms16.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 21).mirror().addBox(-1.7571F, -0.3441F, -0.6161F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-10.2608F, 15.3002F, 7.5812F, 0.2273F, -0.1325F, -0.0585F));

		PartDefinition cube_r168 = osteoderms16.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(1.306F, -0.3661F, -2.3749F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-10.2608F, 15.3002F, 7.5812F, 0.2278F, -0.0461F, -0.0834F));

		PartDefinition cube_r169 = osteoderms16.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(77, 112).mirror().addBox(-7.7022F, 9.6412F, 0.8873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 90).mirror().addBox(-7.7022F, 9.6412F, -2.1127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1532F, -0.1216F, 0.89F, 0.2274F, -0.0093F, -0.4715F));

		PartDefinition cube_r170 = osteoderms16.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(116, 88).mirror().addBox(-9.3859F, 7.9407F, 0.4364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(59, 73).mirror().addBox(-9.3859F, 8.0407F, -1.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(85, 0).mirror().addBox(-9.3859F, 8.1407F, -3.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.0373F, 0.7641F, 2.4118F, 0.23F, 0.0229F, -0.6545F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -6.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 94).addBox(-2.0354F, -2.8566F, 1.7649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0354F, -2.3047F, -0.1939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 63).mirror().addBox(-2.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -1.1535F, -0.1122F, 0.0715F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-2.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -0.6124F, -0.1122F, 0.0715F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(112, 27).mirror().addBox(-2.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 1.5447F, -2.7231F, 0.3999F, -0.1122F, 0.0715F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(55, 52).mirror().addBox(-2.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.0035F, -3.7138F, 1.2594F, -0.2286F, -0.0214F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(23, 39).mirror().addBox(-2.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.9278F, -0.2286F, -0.0214F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-2.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, -0.5812F, -0.3034F, -0.0377F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(20, 116).mirror().addBox(-3.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.6482F, -0.5705F, -0.8236F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(99, 116).mirror().addBox(-3.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-3.3634F, 0.1949F, 0.1506F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0354F, 3.6035F, -3.7138F, 0.1071F, -0.5705F, -0.8236F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(6.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8017F, -1.2264F, -0.6264F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(5.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.8769F, -1.2497F, -0.706F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 63).mirror().addBox(4.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.9129F, -1.2152F, -0.6561F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(3.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 1.208F, -1.2599F, -0.8819F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-3.2189F, 1.404F, 5.6007F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5023F, -0.0624F, 0.1863F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-6.3563F, -1.0603F, 5.6007F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.4323F, 0.2715F, -0.4533F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(96, 59).mirror().addBox(-9.9193F, -5.1133F, 5.6007F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.1277F, 0.4909F, -1.2317F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(113, 18).mirror().addBox(-3.9084F, -0.5405F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7942F, 0.4558F, -0.4082F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-5.4835F, -3.0636F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.2612F, 0.8614F, -1.2321F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-1.0304F, 0.1903F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.887F, -0.0881F, 0.0716F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(107, 97).mirror().addBox(-1.9415F, 1.0275F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.7124F, -0.0743F, 0.0858F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(63, 86).mirror().addBox(-5.1452F, -0.5064F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.6216F, 0.3807F, -0.4785F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(109, 5).mirror().addBox(-7.4113F, -3.8822F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.186F, 0.6952F, -1.2851F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-3.12F, 1.2845F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5904F, -0.0633F, 0.0942F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(90, 5).mirror().addBox(-6.2032F, -1.0856F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.5073F, 0.3223F, -0.5179F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-8.7901F, -5.0273F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0354F, 3.6035F, -6.5138F, 0.145F, 0.5775F, -1.3095F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 63).addBox(1.7043F, -4.8381F, -0.4411F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -1.1535F, 0.1122F, -0.0715F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 101).addBox(1.7043F, -4.3789F, 1.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -0.6124F, 0.1122F, -0.0715F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(112, 27).addBox(1.7001F, 0.0534F, 0.3712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0354F, 1.5447F, -2.7231F, 0.3999F, 0.1122F, -0.0715F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 52).addBox(1.3666F, 0.3768F, -1.7126F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.0354F, 3.0035F, -3.7138F, 1.2594F, 0.2286F, 0.0214F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(23, 39).addBox(1.3541F, -0.073F, 0.8467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.9278F, 0.2286F, 0.0214F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(38, 96).addBox(1.3739F, 0.2042F, -0.5938F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, -0.5812F, 0.3034F, 0.0377F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(20, 116).addBox(2.3634F, 1.3972F, -1.8767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.6482F, 0.5705F, 0.8236F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(99, 116).addBox(2.3634F, 0.1949F, -0.8494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(2.3634F, 0.1949F, 0.1506F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0354F, 3.6035F, -3.7138F, 0.1071F, 0.5705F, 0.8236F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(19, 27).addBox(-3.0354F, 5.9843F, 5.2655F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(46, 13).addBox(-4.0354F, 3.4041F, 3.5793F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 62).addBox(-7.5214F, 7.3637F, -0.5281F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8017F, 1.2264F, 0.6264F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(32, 59).addBox(-6.6459F, 7.2215F, -0.7667F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.8769F, 1.2497F, 0.706F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 63).addBox(-5.2018F, 7.1786F, -2.0664F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.9129F, 1.2152F, 0.6561F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 69).addBox(-4.1992F, 6.8582F, -2.9819F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 1.208F, 1.2599F, 0.8819F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(53, 43).addBox(-2.5354F, -0.4162F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 101).addBox(-2.0354F, -3.0507F, 5.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 118).addBox(-2.0354F, -2.9507F, 3.7582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(65, 59).addBox(-1.7811F, 1.404F, 5.6007F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5023F, 0.0624F, -0.1863F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(56, 70).addBox(3.3563F, -1.0603F, 5.6007F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.4323F, -0.2715F, 0.4533F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(96, 59).addBox(3.9193F, -5.1133F, 5.6007F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.1277F, -0.4909F, 1.2317F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(113, 18).addBox(0.9084F, -0.5405F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7942F, -0.4558F, 0.4082F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(90, 20).addBox(2.4835F, -3.0636F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2612F, -0.8614F, 1.2321F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(45, 96).addBox(-1.9696F, 0.1903F, -0.2884F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.887F, 0.0881F, -0.0716F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(107, 97).addBox(-2.0585F, 1.0275F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.7124F, 0.0743F, -0.0858F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(63, 86).addBox(2.1452F, -0.5064F, 1.6847F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.6216F, -0.3807F, 0.4785F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(109, 5).addBox(3.4113F, -3.8822F, 1.6847F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.186F, -0.6952F, 1.2851F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(101, 99).addBox(-1.88F, 1.2845F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5904F, 0.0633F, -0.0942F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(90, 5).addBox(3.2032F, -1.0856F, 3.7551F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.5073F, -0.3223F, 0.5179F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(104, 79).addBox(3.7901F, -5.0273F, 3.7551F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.145F, -0.5775F, 1.3095F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(46, 6).addBox(-4.0F, -0.8F, -2.6F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1508F, -5.6461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(34, 0).addBox(-4.5F, -17.4704F, 7.1306F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 18.1605F, -6.8752F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 87).addBox(-2.5354F, -0.6794F, 2.8144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0354F, 3.6035F, -6.5138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition backPlates = chest.addOrReplaceChild("backPlates", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4293F, -7.1716F, -5.8763F, 0.0F, 0.0349F, -0.0015F));

		PartDefinition cube_r228 = backPlates.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(71, 29).addBox(9.3874F, 2.6648F, 0.5138F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, 0.2884F, 1.4373F));

		PartDefinition cube_r229 = backPlates.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(45, 84).addBox(10.8819F, 2.784F, -8.0968F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -4.0F, 2.8F, 0.4869F, -0.1591F, 1.1984F));

		PartDefinition cube_r230 = backPlates.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(26, 86).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8609F, 8.0679F, 0.9688F, 0.489F, 0.1521F, 0.6303F));

		PartDefinition cube_r231 = backPlates.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 80).addBox(6.526F, 7.4602F, -9.0205F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -3.5759F, 8.3825F, 0.3747F, 0.0416F, 0.7897F));

		PartDefinition cube_r232 = backPlates.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(65, 52).addBox(8.9565F, 1.2813F, -8.6406F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4707F, -1.0759F, 8.8825F, 0.372F, -0.117F, 1.2992F));

		PartDefinition cube_r233 = backPlates.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 5).addBox(6.6326F, 9.4954F, -8.2676F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5293F, -6.4759F, 7.3825F, 0.1869F, -0.1294F, 0.5987F));

		PartDefinition backPlates6 = chest.addOrReplaceChild("backPlates6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4293F, -7.1716F, -5.8763F, 0.0F, -0.0349F, 0.0015F));

		PartDefinition cube_r234 = backPlates6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-12.3874F, 2.6648F, 0.5138F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4679F, -0.2884F, -1.4373F));

		PartDefinition cube_r235 = backPlates6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-13.8819F, 2.784F, -8.0968F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -4.0F, 2.8F, 0.4869F, 0.1591F, -1.1984F));

		PartDefinition cube_r236 = backPlates6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(26, 86).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8609F, 8.0679F, 0.9688F, 0.489F, -0.1521F, -0.6303F));

		PartDefinition cube_r237 = backPlates6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-8.526F, 7.4602F, -9.0205F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -3.5759F, 8.3825F, 0.3747F, -0.0416F, -0.7897F));

		PartDefinition cube_r238 = backPlates6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-13.9565F, 1.2813F, -8.6406F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4707F, -1.0759F, 8.8825F, 0.372F, 0.117F, -1.2992F));

		PartDefinition cube_r239 = backPlates6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-9.6326F, 9.4954F, -8.2676F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5293F, -6.4759F, 7.3825F, 0.1869F, 0.1294F, -0.5987F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -11.3828F, -5.6469F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r240 = osteoderms4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(119, 81).addBox(-0.9904F, -0.4531F, -0.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.5899F, 11.6997F, -2.185F, -1.2358F, 0.0331F, 0.1932F));

		PartDefinition cube_r241 = osteoderms4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(41, 25).addBox(1.3441F, 11.1471F, -1.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 7).addBox(1.3441F, 11.0471F, -4.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4214F, -0.5026F, 2.5861F, 0.0819F, 0.0331F, 0.1932F));

		PartDefinition cube_r242 = osteoderms4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(99, 112).addBox(4.8457F, 10.0733F, -4.4535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4314F, 0.0087F, 5.4981F, 0.0878F, 0.0093F, 0.4715F));

		PartDefinition cube_r243 = osteoderms4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(112, 63).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2872F, 11.9461F, -0.0874F, 0.1755F, 0.0046F, 0.5237F));

		PartDefinition cube_r244 = osteoderms4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, -0.3681F, -2.5258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(10.4123F, 18.2442F, 0.6324F, 1.1566F, 0.003F, 1.8624F));

		PartDefinition cube_r245 = osteoderms4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(14, 108).addBox(-0.5F, -0.634F, -2.4905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.4123F, 18.2442F, 0.6324F, 1.0345F, 0.003F, 1.8624F));

		PartDefinition cube_r246 = osteoderms4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(24, 59).addBox(-0.4975F, -3.4249F, 0.0761F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8748F, 17.474F, 0.2176F, 3.035F, -0.042F, 1.8595F));

		PartDefinition cube_r247 = osteoderms4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(55, 86).addBox(-0.4984F, -0.3694F, -2.9857F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.8748F, 17.474F, 0.2176F, 1.4642F, -0.042F, 1.8595F));

		PartDefinition cube_r248 = osteoderms4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(28, 48).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.973F, 16.9594F, -2.0483F, 1.0977F, -0.042F, 1.8595F));

		PartDefinition cube_r249 = osteoderms4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(112, 37).addBox(-0.5F, -2.6F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9406F, 15.8942F, -4.1633F, -1.6774F, -0.042F, 1.8595F));

		PartDefinition cube_r250 = osteoderms4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(96, 52).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.282F, 16.4332F, -0.5972F, -2.55F, -0.042F, 1.8595F));

		PartDefinition cube_r251 = osteoderms4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 80).addBox(-0.4826F, -2.948F, -0.2561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3069F, 17.4685F, 3.8898F, 2.8678F, 0.008F, 1.8624F));

		PartDefinition cube_r252 = osteoderms4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 101).addBox(-0.4836F, -0.3372F, -3.0088F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(9.3069F, 17.4685F, 3.8898F, 1.297F, 0.008F, 1.8624F));

		PartDefinition cube_r253 = osteoderms4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 108).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.9999F, 17.0314F, 2.5537F, 1.1923F, 0.008F, 1.8624F));

		PartDefinition cube_r254 = osteoderms4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(31, 108).addBox(-0.5322F, -0.5959F, 1.184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(7.9069F, 17.0685F, 3.3898F, 1.1399F, 0.008F, 1.8624F));

		PartDefinition cube_r255 = osteoderms4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(80, 101).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.0872F, 17.693F, 3.8357F, 0.8956F, 0.008F, 1.8624F));

		PartDefinition cube_r256 = osteoderms4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 112).addBox(-0.4942F, -4.8088F, -0.4528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.3069F, 17.4685F, 3.8898F, 2.9114F, 0.008F, 1.8624F));

		PartDefinition cube_r257 = osteoderms4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(119, 39).addBox(10.112F, -2.3983F, -5.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 2.134F, 0.2905F, 1.1092F));

		PartDefinition cube_r258 = osteoderms4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 80).addBox(-0.5269F, -1.1277F, -1.9754F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0321F, 10.0726F, 3.7062F, 1.0115F, 0.0806F, 0.5702F));

		PartDefinition cube_r259 = osteoderms4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(113, 20).addBox(-0.5294F, -0.153F, -1.6666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0321F, 10.0726F, 3.7062F, 0.6934F, 0.1063F, 0.5556F));

		PartDefinition cube_r260 = osteoderms4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(6, 116).addBox(-0.4913F, -1.8611F, -0.1007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0321F, 10.0726F, 3.7062F, -0.0793F, 0.0806F, 0.5702F));

		PartDefinition cube_r261 = osteoderms4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(30, 117).addBox(7.9495F, 7.619F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.8783F, -1.713F, 2.6017F, -0.1198F, 0.0032F, 0.7256F));

		PartDefinition cube_r262 = osteoderms4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0659F, 9.8914F, 0.3671F, 0.9711F, 0.0032F, 0.7256F));

		PartDefinition cube_r263 = osteoderms4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(117, 49).addBox(7.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8783F, -1.713F, 2.6017F, 0.2774F, 0.0103F, 0.6512F));

		PartDefinition cube_r264 = osteoderms4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(94, 105).addBox(7.4802F, 7.952F, -3.2733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.5851F, 1.1934F, 6.2458F, 0.1581F, 0.143F, 0.7867F));

		PartDefinition cube_r265 = osteoderms4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(16, 119).addBox(10.9833F, 2.3228F, 0.069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(118, 108).addBox(11.0833F, 2.5228F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.7641F, 2.5177F, 5.338F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r266 = osteoderms4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(20, 108).addBox(11.0833F, 2.4228F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.6194F, 2.1467F, 2.5881F, 0.3077F, 0.2368F, 1.3001F));

		PartDefinition cube_r267 = osteoderms4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(72, 118).addBox(10.112F, 4.646F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.2F, 2.0F, -0.6F, 0.2577F, 0.2905F, 1.1092F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -11.3828F, -5.6469F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r268 = osteoderms15.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(119, 81).mirror().addBox(-0.0096F, -0.4531F, -0.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.5899F, 11.6997F, -2.185F, -1.2358F, -0.0331F, -0.1932F));

		PartDefinition cube_r269 = osteoderms15.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(41, 25).mirror().addBox(-2.3441F, 11.1471F, -1.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 7).mirror().addBox(-2.3441F, 11.0471F, -4.4776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4214F, -0.5026F, 2.5861F, 0.0819F, -0.0331F, -0.1932F));

		PartDefinition cube_r270 = osteoderms15.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(99, 112).mirror().addBox(-5.8457F, 10.0733F, -4.4535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4314F, 0.0087F, 5.4981F, 0.0878F, -0.0093F, -0.4715F));

		PartDefinition cube_r271 = osteoderms15.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(112, 63).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2872F, 11.9461F, -0.0874F, 0.1755F, -0.0046F, -0.5237F));

		PartDefinition cube_r272 = osteoderms15.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.5F, -0.3681F, -2.5258F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-10.4123F, 18.2442F, 0.6324F, 1.1566F, -0.003F, -1.8624F));

		PartDefinition cube_r273 = osteoderms15.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-0.5F, -0.634F, -2.4905F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.4123F, 18.2442F, 0.6324F, 1.0345F, -0.003F, -1.8624F));

		PartDefinition cube_r274 = osteoderms15.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(-0.5025F, -3.4249F, 0.0761F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.8748F, 17.474F, 0.2176F, 3.035F, 0.042F, -1.8595F));

		PartDefinition cube_r275 = osteoderms15.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-0.5016F, -0.3694F, -2.9857F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.8748F, 17.474F, 0.2176F, 1.4642F, 0.042F, -1.8595F));

		PartDefinition cube_r276 = osteoderms15.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.973F, 16.9594F, -2.0483F, 1.0977F, 0.042F, -1.8595F));

		PartDefinition cube_r277 = osteoderms15.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(112, 37).mirror().addBox(-0.5F, -2.6F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9406F, 15.8942F, -4.1633F, -1.6774F, 0.042F, -1.8595F));

		PartDefinition cube_r278 = osteoderms15.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-0.5F, -1.0F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.282F, 16.4332F, -0.5972F, -2.55F, 0.042F, -1.8595F));

		PartDefinition cube_r279 = osteoderms15.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5174F, -2.948F, -0.2561F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.3069F, 17.4685F, 3.8898F, 2.8678F, -0.008F, -1.8624F));

		PartDefinition cube_r280 = osteoderms15.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.5164F, -0.3372F, -3.0088F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-9.3069F, 17.4685F, 3.8898F, 1.297F, -0.008F, -1.8624F));

		PartDefinition cube_r281 = osteoderms15.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(40, 108).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.9999F, 17.0314F, 2.5537F, 1.1923F, -0.008F, -1.8624F));

		PartDefinition cube_r282 = osteoderms15.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(31, 108).mirror().addBox(-0.4678F, -0.5959F, 1.184F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-7.9069F, 17.0685F, 3.3898F, 1.1399F, -0.008F, -1.8624F));

		PartDefinition cube_r283 = osteoderms15.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(80, 101).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.0872F, 17.693F, 3.8357F, 0.8956F, -0.008F, -1.8624F));

		PartDefinition cube_r284 = osteoderms15.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(65, 112).mirror().addBox(-0.5058F, -4.8088F, -0.4528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-9.3069F, 17.4685F, 3.8898F, 2.9114F, -0.008F, -1.8624F));

		PartDefinition cube_r285 = osteoderms15.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(119, 39).mirror().addBox(-11.112F, -2.3983F, -5.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 2.134F, -0.2905F, -1.1092F));

		PartDefinition cube_r286 = osteoderms15.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-0.4731F, -1.1277F, -1.9754F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0321F, 10.0726F, 3.7062F, 1.0115F, -0.0806F, -0.5702F));

		PartDefinition cube_r287 = osteoderms15.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(113, 20).mirror().addBox(-0.4706F, -0.153F, -1.6666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0321F, 10.0726F, 3.7062F, 0.6934F, -0.1063F, -0.5556F));

		PartDefinition cube_r288 = osteoderms15.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(6, 116).mirror().addBox(-0.5087F, -1.8611F, -0.1007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0321F, 10.0726F, 3.7062F, -0.0793F, -0.0806F, -0.5702F));

		PartDefinition cube_r289 = osteoderms15.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(30, 117).mirror().addBox(-8.9495F, 7.619F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.8783F, -1.713F, 2.6017F, -0.1198F, -0.0032F, -0.7256F));

		PartDefinition cube_r290 = osteoderms15.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0659F, 9.8914F, 0.3671F, 0.9711F, -0.0032F, -0.7256F));

		PartDefinition cube_r291 = osteoderms15.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(117, 49).mirror().addBox(-8.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8783F, -1.713F, 2.6017F, 0.2774F, -0.0103F, -0.6512F));

		PartDefinition cube_r292 = osteoderms15.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(94, 105).mirror().addBox(-8.4802F, 7.952F, -3.2733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.5851F, 1.1934F, 6.2458F, 0.1581F, -0.143F, -0.7867F));

		PartDefinition cube_r293 = osteoderms15.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(16, 119).mirror().addBox(-11.9833F, 2.3228F, 0.069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(118, 108).mirror().addBox(-12.0833F, 2.5228F, -1.931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7641F, 2.5177F, 5.338F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r294 = osteoderms15.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(20, 108).mirror().addBox(-12.0833F, 2.4228F, -1.331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.6194F, 2.1467F, 2.5881F, 0.3077F, -0.2368F, -1.3001F));

		PartDefinition cube_r295 = osteoderms15.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 118).mirror().addBox(-11.112F, 4.646F, -0.0585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.0F, -0.6F, 0.2577F, -0.2905F, -1.1092F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 8.0973F, -3.0537F, 0.4561F, 0.1025F, -0.1907F));

		PartDefinition cube_r296 = leftarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(7, 110).addBox(-0.0544F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r297 = leftarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 87).addBox(-0.1791F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r298 = leftarm.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(44, 61).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftarm.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(103, 31).addBox(-2.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r300 = leftarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(28, 113).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7469F, 4.0838F, 2.1587F, 0.4985F, -0.0121F, 0.0003F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.0571F, 2.3001F, -0.4968F, -0.9643F, 0.997F));

		PartDefinition cube_r301 = leftarm2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5933F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.67F, 0.5245F, -2.7163F, -0.305F, -0.0157F, -0.0499F));

		PartDefinition cube_r302 = leftarm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 49).addBox(0.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 1.0401F, 0.6496F, -0.633F));

		PartDefinition cube_r303 = lefthand.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(46, 105).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r304 = lefthand.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(64, 97).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r305 = lefthand.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(69, 89).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r306 = lefthand.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 110).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 8.0973F, -3.0537F, -0.3141F, 0.0008F, 0.2182F));

		PartDefinition cube_r307 = rightarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(-0.9456F, -5.224F, -1.9389F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r308 = rightarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.8209F, -1.8311F, 0.3948F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r309 = rightarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(44, 61).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-1.0F, -3.6F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(-1.0F, -2.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7469F, 4.0838F, 2.1587F, 0.4985F, 0.0121F, -0.0003F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.0571F, 2.3001F, -0.3129F, 1.0161F, -0.7774F));

		PartDefinition cube_r312 = rightarm2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.4067F, -0.2582F, 1.6628F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.67F, 0.5245F, -2.7163F, -0.305F, 0.0157F, 0.0499F));

		PartDefinition cube_r313 = rightarm2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-2.1067F, -6.3546F, 0.3397F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.17F, 4.9245F, -2.7163F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 1.1054F, -0.6437F, 0.5477F));

		PartDefinition cube_r314 = righthand.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(46, 105).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r315 = righthand.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(64, 97).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r316 = righthand.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(69, 89).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r317 = righthand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 110).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -6.8F, 0.1418F, -0.1728F, -0.0245F));

		PartDefinition cube_r318 = neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(4, 120).addBox(0.5F, -2.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 101).addBox(0.0F, -0.6F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(119, 97).addBox(0.5F, -1.6346F, -0.0211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r320 = neck3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.5833F, 0.412F, -0.142F));

		PartDefinition cube_r321 = neck3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.2089F, -3.2F, 0.1534F, 0.6858F, -0.9281F));

		PartDefinition cube_r322 = neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-1.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.6573F, 0.2332F, -0.1185F));

		PartDefinition cube_r323 = neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(116, 11).mirror().addBox(-2.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, 0.0089F, -1.2F, 0.368F, 0.5997F, -0.7989F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(74, 61).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.5833F, -0.412F, 0.142F));

		PartDefinition cube_r325 = neck3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(116, 58).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.2089F, -3.2F, 0.1534F, -0.6858F, 0.9281F));

		PartDefinition cube_r326 = neck3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(74, 41).addBox(0.0151F, -0.1848F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.6573F, -0.2332F, 0.1185F));

		PartDefinition cube_r327 = neck3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(116, 11).addBox(0.6508F, -0.8135F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, 0.0089F, -1.2F, 0.368F, -0.5997F, 0.7989F));

		PartDefinition cube_r328 = neck3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 72).addBox(-2.0F, -0.2831F, -0.8623F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2343F, -3.9679F, 0.0611F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -14.7653F, -1.791F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r329 = osteoderms3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(12, 49).addBox(-5.6276F, 8.0007F, -2.2023F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.1891F, 0.3979F, -0.5522F));

		PartDefinition cube_r330 = osteoderms3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(9, 90).addBox(-5.5933F, 6.7731F, 2.9027F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.766F, -0.6389F, -0.5692F, 0.3832F, -0.542F));

		PartDefinition cube_r331 = osteoderms3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(45, 117).addBox(-0.5406F, -0.144F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5333F, 11.1871F, 2.3822F, 0.2774F, 0.0103F, 0.4243F));

		PartDefinition cube_r332 = osteoderms3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(25, 117).addBox(-0.4825F, -1.3472F, -0.1862F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5333F, 11.1871F, 2.3822F, -0.1198F, 0.0032F, 0.4987F));

		PartDefinition cube_r333 = osteoderms3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(72, 114).addBox(-0.518F, -0.6712F, -1.2726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5333F, 11.1871F, 2.3822F, 0.8838F, 0.0032F, 0.4987F));

		PartDefinition cube_r334 = osteoderms3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(114, 93).addBox(7.9139F, 2.9018F, -9.6275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5783F, 0.0695F, 1.5458F, 0.8838F, 0.0032F, 0.7256F));

		PartDefinition cube_r335 = osteoderms3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1794F, 15.2207F, -2.6208F, 1.927F, 0.0822F, 1.8509F));

		PartDefinition cube_r336 = osteoderms3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(27, 100).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8265F, 15.7752F, -2.2732F, 0.9933F, 0.0822F, 1.8509F));

		PartDefinition cube_r337 = osteoderms3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(104, 116).addBox(-0.522F, -0.5169F, -0.1955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6582F, 15.4728F, -2.1586F, 2.6513F, 0.0822F, 1.8509F));

		PartDefinition cube_r338 = osteoderms3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(56, 99).addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.6873F, 15.7955F, -1.5702F, 1.4383F, 0.0822F, 1.8509F));

		PartDefinition cube_r339 = osteoderms3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(8, 87).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4656F, 15.4655F, 0.5358F, 3.0699F, -0.042F, 1.8595F));

		PartDefinition cube_r340 = osteoderms3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(72, 104).addBox(-0.5F, -1.2F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.082F, 15.0157F, 1.1469F, -2.0264F, -0.042F, 1.8595F));

		PartDefinition cube_r341 = osteoderms3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(22, 71).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6214F, 14.8917F, -0.0487F, 1.9617F, -0.042F, 1.8595F));

		PartDefinition cube_r342 = osteoderms3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(88, 56).addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.905F, 15.615F, 0.0807F, 1.4642F, -0.042F, 1.8595F));

		PartDefinition cube_r343 = osteoderms3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(90, 7).addBox(-0.5F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(5.0977F, 15.9391F, 0.768F, 1.7173F, -0.042F, 1.8595F));

		PartDefinition cube_r344 = osteoderms3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(117, 62).addBox(7.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5783F, 0.0695F, 1.5458F, 0.2774F, 0.0103F, 0.6512F));

		PartDefinition cube_r345 = osteoderms3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(35, 117).addBox(7.9495F, 7.619F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5783F, 0.0695F, 1.5458F, -0.1198F, 0.0032F, 0.7256F));

		PartDefinition osteoderms13 = neck3.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -14.7653F, -1.791F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r346 = osteoderms13.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(12, 49).mirror().addBox(4.6276F, 8.0007F, -2.2023F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.1891F, -0.3979F, 0.5522F));

		PartDefinition cube_r347 = osteoderms13.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(9, 90).mirror().addBox(4.5933F, 6.7731F, 2.9027F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.766F, -0.6389F, -0.5692F, -0.3832F, 0.542F));

		PartDefinition cube_r348 = osteoderms13.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(45, 117).mirror().addBox(-0.4594F, -0.144F, -0.6366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, 11.1871F, 2.3822F, 0.2774F, -0.0103F, -0.4243F));

		PartDefinition cube_r349 = osteoderms13.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(25, 117).mirror().addBox(-0.5175F, -1.3472F, -0.1862F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, 11.1871F, 2.3822F, -0.1198F, -0.0032F, -0.4987F));

		PartDefinition cube_r350 = osteoderms13.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(-0.482F, -0.6712F, -1.2726F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5333F, 11.1871F, 2.3822F, 0.8838F, -0.0032F, -0.4987F));

		PartDefinition cube_r351 = osteoderms13.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(-8.9139F, 2.9018F, -9.6275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5783F, 0.0695F, 1.5458F, 0.8838F, -0.0032F, -0.7256F));

		PartDefinition cube_r352 = osteoderms13.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1794F, 15.2207F, -2.6208F, 1.927F, -0.0822F, -1.8509F));

		PartDefinition cube_r353 = osteoderms13.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(27, 100).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8265F, 15.7752F, -2.2732F, 0.9933F, -0.0822F, -1.8509F));

		PartDefinition cube_r354 = osteoderms13.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(104, 116).mirror().addBox(-0.478F, -0.5169F, -0.1955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6582F, 15.4728F, -2.1586F, 2.6513F, -0.0822F, -1.8509F));

		PartDefinition cube_r355 = osteoderms13.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(56, 99).mirror().addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.6873F, 15.7955F, -1.5702F, 1.4383F, -0.0822F, -1.8509F));

		PartDefinition cube_r356 = osteoderms13.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(8, 87).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4656F, 15.4655F, 0.5358F, 3.0699F, 0.042F, -1.8595F));

		PartDefinition cube_r357 = osteoderms13.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(72, 104).mirror().addBox(-0.5F, -1.2F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.082F, 15.0157F, 1.1469F, -2.0264F, 0.042F, -1.8595F));

		PartDefinition cube_r358 = osteoderms13.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6214F, 14.8917F, -0.0487F, 1.9617F, 0.042F, -1.8595F));

		PartDefinition cube_r359 = osteoderms13.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.905F, 15.615F, 0.0807F, 1.4642F, 0.042F, -1.8595F));

		PartDefinition cube_r360 = osteoderms13.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-0.5F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-5.0977F, 15.9391F, 0.768F, 1.7173F, 0.042F, -1.8595F));

		PartDefinition cube_r361 = osteoderms13.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-8.2371F, 8.1473F, -5.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5783F, 0.0695F, 1.5458F, 0.2774F, -0.0103F, -0.6512F));

		PartDefinition cube_r362 = osteoderms13.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(35, 117).mirror().addBox(-8.9495F, 7.619F, -1.6619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5783F, 0.0695F, 1.5458F, -0.1198F, -0.0032F, -0.7256F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r363 = neck2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(34, 10).addBox(0.5F, -1.5F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 43).addBox(0.5F, -1.3F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 87).addBox(0.0F, -0.6F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -0.4911F, -1.5F, 0.3529F, 0.5783F, -0.9417F));

		PartDefinition cube_r365 = neck2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(38, 94).mirror().addBox(-2.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.393F, -1.1911F, -3.5F, 0.391F, 0.7084F, -0.8783F));

		PartDefinition cube_r366 = neck2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(84, 33).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -0.4911F, -1.5F, 0.3529F, -0.5783F, 0.9417F));

		PartDefinition cube_r367 = neck2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(38, 94).addBox(0.0151F, -0.0848F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.393F, -1.1911F, -3.5F, 0.391F, -0.7084F, 0.8783F));

		PartDefinition cube_r368 = neck2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(75, 59).addBox(-1.0F, -0.0752F, -4.0018F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.4039F, -0.689F, -0.1134F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -14.7653F, -1.9866F));

		PartDefinition cube_r369 = osteoderms2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 117).addBox(-0.4822F, -1.0426F, -0.1977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.4571F, 12.254F, -0.542F, -0.1793F, 0.0398F, 0.7243F));

		PartDefinition cube_r370 = osteoderms2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(111, 114).addBox(-0.5178F, -0.7321F, -1.1983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4571F, 12.254F, -0.542F, 0.8243F, 0.0398F, 0.7243F));

		PartDefinition cube_r371 = osteoderms2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(90, 7).addBox(11.0449F, -3.5962F, -1.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 2.7539F, 0.7949F, 0.2153F, 0.0423F, 1.8102F));

		PartDefinition cube_r372 = osteoderms2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(113, 110).addBox(10.7996F, -4.0527F, 1.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3493F, 2.8555F, 0.6085F, 0.8243F, 0.0398F, 1.885F));

		PartDefinition cube_r373 = osteoderms2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(11, 117).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5216F, 14.7941F, -0.475F, 0.3007F, 0.0398F, 1.885F));

		PartDefinition osteoderms14 = neck2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-2.0F, -14.7653F, -1.9866F));

		PartDefinition cube_r374 = osteoderms14.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-0.5178F, -1.0426F, -0.1977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.4571F, 12.254F, -0.542F, -0.1793F, -0.0398F, -0.7243F));

		PartDefinition cube_r375 = osteoderms14.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(111, 114).mirror().addBox(-0.4822F, -0.7321F, -1.1983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4571F, 12.254F, -0.542F, 0.8243F, -0.0398F, -0.7243F));

		PartDefinition cube_r376 = osteoderms14.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-12.0449F, -3.5962F, -1.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0053F, 2.7539F, 0.7949F, 0.2153F, -0.0423F, -1.8102F));

		PartDefinition cube_r377 = osteoderms14.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(113, 110).mirror().addBox(-11.7996F, -4.0527F, 1.1955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3493F, 2.8555F, 0.6085F, 0.8243F, -0.0398F, -1.885F));

		PartDefinition cube_r378 = osteoderms14.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(11, 117).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5216F, 14.7941F, -0.475F, 0.3007F, -0.0398F, -1.885F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8781F, -4.2801F, 0.1227F, -0.39F, -0.0469F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(115, 85).addBox(-1.0F, -0.8727F, -0.1398F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.379F, -3.401F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(115, 75).addBox(-1.0F, -0.6F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.079F, -3.301F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(86, 56).addBox(-1.0F, -0.9836F, -0.0186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 2.1631F, -3.3287F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(69, 80).addBox(-1.0F, -0.9781F, 0.0254F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 2.4631F, -4.3287F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(64, 29).addBox(-3.2F, -0.9824F, 0.1894F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -1.2124F, -0.8416F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(103, 11).addBox(-3.2F, -1.1968F, -0.2796F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(88, 77).addBox(-2.7F, -0.8968F, -0.2796F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)), PartPose.offsetAndRotation(0.7F, -0.6124F, -2.0416F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(95, 47).addBox(-2.7F, -1.8633F, -0.1454F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, -0.0124F, -3.6416F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3543F, 0.9389F, -3.8956F, -1.1677F, 0.8642F, -1.1157F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(59, 13).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3543F, 0.9389F, -3.8956F, -1.1677F, -0.8642F, 1.1157F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(110, 81).addBox(-1.7F, -1.8182F, -0.1379F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2F, 1.2876F, -4.7416F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(113, 71).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5931F, -0.6895F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(56, 115).addBox(-1.5F, -1.2167F, 0.5066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0027F)), PartPose.offsetAndRotation(0.5F, 1.4752F, -5.8496F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(114, 42).addBox(-1.5F, -0.8709F, 0.5851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0029F)), PartPose.offsetAndRotation(0.5F, 2.2752F, -6.1496F, -0.384F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, 0.2042F, -1.419F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.9876F, -5.2416F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(119, 28).addBox(-0.8F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 1.612F, 0.8156F, 1.0472F, -0.1455F, -0.2799F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(119, 6).addBox(-0.9F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.7F, 2.412F, 0.2156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(78, 117).addBox(-0.27F, -0.7739F, 0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(35, 113).addBox(-0.8709F, -0.0736F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2873F, -0.3645F, 2.8533F, 0.1902F, 0.4005F, 0.0154F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(80, 89).addBox(-1.0709F, -0.3736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3873F, -0.3645F, 2.8533F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(78, 107).addBox(-0.545F, 0.0137F, -1.6297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 2.1753F, -0.2421F, 2.1494F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 107).addBox(-0.545F, -1.0114F, -1.6623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 1.3376F, -0.2421F, 2.1494F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(107, 22).addBox(-0.545F, -0.4524F, -1.3334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1595F, 0.2814F, 3.3437F, 1.8088F, -0.2421F, 2.1494F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(89, 116).addBox(0.1045F, -0.4416F, -0.7021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(1.3362F, -1.3831F, 3.6169F, -0.9588F, 0.5164F, 0.2324F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(116, 67).addBox(0.008F, -0.6615F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7092F, -1.6752F, 5.4516F, -0.7252F, 1.4059F, 0.7146F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(55, 118).addBox(-0.196F, -0.4735F, -0.5441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(2.1092F, -1.6752F, 5.0516F, -1.4455F, 0.5512F, 0.0812F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(94, 116).addBox(0.0592F, -1.663F, -0.6829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3362F, -1.3831F, 3.5169F, -1.4627F, 0.1611F, 0.0327F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(117, 103).addBox(-0.6064F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0764F, -0.2834F, 3.2226F, -0.5934F, 0.0349F, 0.0F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(114, 45).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4562F, -0.3676F, 5.6824F, -0.9039F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(114, 0).addBox(-1.2741F, 0.0608F, -0.2689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5823F, -1.6834F, 5.3167F, -0.9039F, -0.2431F, 0.2032F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(14, 113).addBox(-0.9826F, -0.0903F, -0.9827F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4927F, -0.7834F, 4.9399F, -0.6109F, 0.0349F, 0.0F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(49, 113).addBox(-1.4F, -1.2F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.875F, -0.2834F, 3.9262F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(117, 13).addBox(-0.6099F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(117, 36).addBox(-0.4999F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2899F, -0.2834F, 3.2152F, -0.2007F, 0.0349F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.9876F, -5.2416F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(0.5F, 0.3375F, -0.2062F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.312F, -0.7844F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(-0.2F, -0.8584F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.612F, 0.8156F, 1.0472F, 0.1455F, 0.2799F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-0.1F, -1.013F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.412F, 0.2156F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(78, 117).mirror().addBox(-0.73F, -0.7739F, 0.6102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5877F, -0.708F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(35, 113).mirror().addBox(-0.1291F, -0.0736F, -1.7887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2873F, -0.3645F, 2.8533F, 0.1902F, -0.4005F, -0.0154F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(0.0709F, -0.3736F, -2.7887F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3873F, -0.3645F, 2.8533F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(78, 107).mirror().addBox(-0.455F, 0.0137F, -1.6297F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 2.1753F, 0.2421F, -2.1494F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.455F, -1.0114F, -1.6623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 1.3376F, 0.2421F, -2.1494F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(107, 22).mirror().addBox(-0.455F, -0.4524F, -1.3334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1595F, 0.2814F, 3.3437F, 1.8088F, 0.2421F, -2.1494F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(89, 116).mirror().addBox(-1.1045F, -0.4416F, -0.7021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-1.3362F, -1.3831F, 3.6169F, -0.9588F, -0.5164F, -0.2324F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(116, 67).mirror().addBox(-1.008F, -0.6615F, -0.5237F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, -1.6752F, 5.4516F, -0.7252F, -1.4059F, -0.7146F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(55, 118).mirror().addBox(-0.804F, -0.4735F, -0.5441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.1092F, -1.6752F, 5.0516F, -1.4455F, -0.5512F, -0.0812F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(94, 116).mirror().addBox(-1.0592F, -1.663F, -0.6829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3362F, -1.3831F, 3.5169F, -1.4627F, -0.1611F, -0.0327F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(117, 103).mirror().addBox(-0.3936F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0764F, -0.2834F, 3.2226F, -0.5934F, -0.0349F, 0.0F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(114, 45).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4562F, -0.3676F, 5.6824F, -0.9039F, 0.0F, 0.0F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-0.7259F, 0.0608F, -0.2689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5823F, -1.6834F, 5.3167F, -0.9039F, 0.2431F, -0.2032F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(14, 113).mirror().addBox(-1.0174F, -0.0903F, -0.9827F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4927F, -0.7834F, 4.9399F, -0.6109F, -0.0349F, 0.0F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(49, 113).mirror().addBox(-0.6F, -1.2F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.875F, -0.2834F, 3.9262F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(117, 13).mirror().addBox(-0.3901F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(117, 36).mirror().addBox(-0.5001F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2899F, -0.2834F, 3.2152F, -0.2007F, -0.0349F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 2.0399F, -0.908F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3923F, 0.7273F, -2.7134F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(107, 22).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6879F, 0.613F, -1.7851F, 0.0902F, -0.3121F, 0.0362F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.1046F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.3648F, -1.2049F, 0.3052F, -0.0694F, 0.0073F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(82, 114).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8523F, 1.3762F, -3.3167F, 0.375F, -0.0694F, 0.0073F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(112, 105).mirror().addBox(-0.5F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(112, 105).addBox(1.9F, -0.6F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.4236F, 0.3472F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(115, 32).mirror().addBox(-0.5F, -0.3114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 32).addBox(1.9F, -0.3114F, -1.9698F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5237F, -0.7371F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(114, 99).addBox(1.9F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 0.1763F, 0.1629F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(0.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.5648F, -3.1049F, 0.6467F, -0.0506F, -0.0512F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(63, 88).mirror().addBox(-0.2309F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 0.1648F, -2.2049F, 0.3346F, -0.3121F, 0.0362F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(62, 117).mirror().addBox(-0.5758F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.2648F, -1.2049F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.5758F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3954F, 1.2648F, -1.2049F, 0.0379F, -0.3121F, 0.0362F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7923F, 0.7273F, -2.7134F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(107, 22).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0879F, 0.613F, -1.7851F, 0.0902F, 0.3121F, -0.0362F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(71, 32).addBox(-0.8954F, -1.0957F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7954F, 1.3648F, -1.2049F, 0.3052F, 0.0694F, -0.0073F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(82, 114).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2523F, 1.3762F, -3.3167F, 0.375F, 0.0694F, -0.0073F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(46, 77).addBox(-1.0317F, 0.0379F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.5648F, -3.1049F, 0.6467F, 0.0506F, 0.0512F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(63, 88).addBox(-0.7691F, 0.0327F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 0.1648F, -2.2049F, 0.3346F, 0.3121F, -0.0362F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(62, 117).addBox(-0.4242F, -1.1013F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7954F, 1.2648F, -1.2049F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(100, 0).addBox(-0.4242F, -0.9561F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7954F, 1.2648F, -1.2049F, 0.0379F, 0.3121F, -0.0362F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(11.7F, -7.4885F, 1.4256F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition cube_r448 = backPlates2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(37, 50).addBox(-2.5F, -0.7F, -3.5F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8214F, 12.3021F, -2.6344F, -0.2008F, -0.2181F, 1.5113F));

		PartDefinition cube_r449 = backPlates2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(53, 32).addBox(-0.5575F, 0.1576F, -3.0978F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2871F, 7.2191F, -4.8803F, -0.0672F, -0.3208F, 0.6572F));

		PartDefinition backPlates5 = body.addOrReplaceChild("backPlates5", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.7F, -7.4885F, 1.4256F, -0.1586F, -0.4921F, 0.0754F));

		PartDefinition cube_r450 = backPlates5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(37, 50).mirror().addBox(-2.5F, -0.7F, -3.5F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8214F, 12.3021F, -2.6344F, -0.2008F, 0.2181F, -1.5113F));

		PartDefinition cube_r451 = backPlates5.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-4.4425F, 0.1576F, -3.0978F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2871F, 7.2191F, -4.8803F, -0.0672F, 0.3208F, -0.6572F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 73).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(35, 69).addBox(0.5F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 19).addBox(0.1F, 0.0F, 2.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 35).addBox(-0.4F, 0.0F, 4.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 82).addBox(0.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 69).mirror().addBox(-6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 19).mirror().addBox(-4.1F, 0.0F, 2.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 35).mirror().addBox(-3.6F, 0.0F, 4.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 82).mirror().addBox(-2.4F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 80).addBox(0.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 9).addBox(0.0F, -2.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 72).addBox(0.0F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 119).addBox(0.0F, -2.2F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.4018F, 0.0402F, -0.0171F));

		PartDefinition cube_r452 = tail.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(0, 107).addBox(0.0F, 1.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 107).addBox(0.0F, 0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 43).addBox(0.0F, 0.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(63, 0).addBox(-4.5F, 0.1177F, -7.0456F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 63).addBox(-3.5F, 0.1177F, -4.0456F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3943F, 6.8737F, -0.0698F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -0.9664F, 7.9473F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r454 = osteoderms12.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5444F, 0.1174F, -1.8427F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5264F, 0.6449F, -1.2464F, -2.0462F, -0.2833F, -1.3548F));

		PartDefinition cube_r455 = osteoderms12.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(34, 10).addBox(-0.8172F, -2.8617F, -0.0436F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0633F, -1.0921F, -0.0307F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms22 = tail.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -0.9664F, 7.9473F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r456 = osteoderms22.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(-0.4556F, 0.1174F, -1.8427F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5264F, 0.6449F, -1.2464F, -2.0462F, 0.2833F, 1.3548F));

		PartDefinition cube_r457 = osteoderms22.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(-0.1828F, -2.8617F, -0.0436F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0633F, -1.0921F, -0.0307F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -30.5928F, -8.6771F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(67, 5).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.3F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 19).addBox(-0.1F, 0.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 71).addBox(0.5F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 9).addBox(0.3F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).mirror().addBox(-2.3F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 19).mirror().addBox(-1.9F, 0.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 71).mirror().addBox(-1.5F, 0.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 9).mirror().addBox(-1.3F, 0.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 72).addBox(0.0F, -2.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 63).addBox(0.0F, -1.9F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 49).addBox(0.0F, -1.8F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 49).addBox(0.0F, -1.8F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0723F, 0.2611F, 0.0187F));

		PartDefinition cube_r458 = tail2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(30, 92).addBox(0.0F, 4.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 61).addBox(0.0F, 3.6F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 105).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 105).addBox(0.0F, 2.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(41, 21).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(56, 13).addBox(0.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3846F, -2.3586F, -0.0591F, -3.0703F, 0.2108F, 0.4547F));

		PartDefinition cube_r461 = tail2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(13, 59).addBox(-1.3172F, -2.8617F, -8.0436F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3846F, -2.3586F, -0.0591F, -3.0703F, -0.2108F, -0.4547F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -33.9489F, -4.8011F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r462 = osteoderms8.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(103, 93).addBox(-0.3851F, -0.7516F, -1.7151F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(107, 67).addBox(-1.6851F, -0.7516F, -0.4151F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(94, 93).addBox(-1.6851F, -0.7516F, -3.1151F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.2518F, 27.9356F, 23.0371F, 0.3472F, -0.1325F, -0.1018F));

		PartDefinition cube_r463 = osteoderms8.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(35, 73).addBox(-0.5597F, -1.5523F, -0.8191F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.4518F, 29.446F, 21.1719F, 0.4149F, -0.5794F, -0.2907F));

		PartDefinition cube_r464 = osteoderms8.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(87, 87).addBox(-0.7046F, -0.7516F, -0.5503F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(4.2518F, 27.9356F, 23.0371F, 0.3512F, -0.1981F, -0.126F));

		PartDefinition cube_r465 = osteoderms8.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(99, 39).addBox(-2.0F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(5.9768F, 29.5684F, 18.0488F, 0.4138F, -0.5713F, -0.1862F));

		PartDefinition cube_r466 = osteoderms8.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(107, 101).addBox(-1.2432F, -1.5666F, -1.9029F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 77).addBox(-1.2432F, -1.5666F, -4.6029F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.4597F, 29.8422F, 20.1779F, 0.3451F, -0.0176F, 0.0406F));

		PartDefinition cube_r467 = osteoderms8.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(67, 15).addBox(-3.8128F, -1.7982F, -2.048F, 9.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.1597F, 30.4715F, 19.4007F, 0.5341F, -0.844F, -0.3692F));

		PartDefinition cube_r468 = osteoderms8.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(81, 25).addBox(-1.9222F, -1.7982F, -0.3329F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(6.1597F, 30.4715F, 19.4007F, 0.3902F, -0.4749F, -0.139F));

		PartDefinition cube_r469 = osteoderms8.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(35, 103).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7447F, 26.1567F, 21.3851F, 0.2814F, -0.1777F, 0.2122F));

		PartDefinition cube_r470 = osteoderms8.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.9699F, 27.8422F, 15.941F, 0.2867F, -0.0626F, 0.1912F));

		PartDefinition osteoderms18 = tail2.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -33.9489F, -4.8011F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r471 = osteoderms18.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-2.6149F, -0.7516F, -1.7151F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(107, 67).mirror().addBox(-0.3149F, -0.7516F, -0.4151F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 93).mirror().addBox(-0.3149F, -0.7516F, -3.1151F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-4.2518F, 27.9356F, 23.0371F, 0.3472F, 0.1325F, 0.1018F));

		PartDefinition cube_r472 = osteoderms18.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-7.4403F, -1.5523F, -0.8191F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.4518F, 29.446F, 21.1719F, 0.4149F, 0.5794F, 0.2907F));

		PartDefinition cube_r473 = osteoderms18.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-5.2954F, -0.7516F, -0.5503F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-4.2518F, 27.9356F, 23.0371F, 0.3512F, 0.1981F, 0.126F));

		PartDefinition cube_r474 = osteoderms18.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-2.0F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-5.9768F, 29.5684F, 18.0488F, 0.4138F, 0.5713F, 0.1862F));

		PartDefinition cube_r475 = osteoderms18.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(107, 101).mirror().addBox(-0.7568F, -1.5666F, -1.9029F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 77).mirror().addBox(-0.7568F, -1.5666F, -4.6029F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-4.4597F, 29.8422F, 20.1779F, 0.3451F, 0.0176F, -0.0406F));

		PartDefinition cube_r476 = osteoderms18.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(67, 15).mirror().addBox(-5.1872F, -1.7982F, -2.048F, 9.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-6.1597F, 30.4715F, 19.4007F, 0.5341F, 0.844F, 0.3692F));

		PartDefinition cube_r477 = osteoderms18.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(81, 25).mirror().addBox(-4.0778F, -1.7982F, -0.3329F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-6.1597F, 30.4715F, 19.4007F, 0.3902F, 0.4749F, 0.139F));

		PartDefinition cube_r478 = osteoderms18.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(35, 103).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7447F, 26.1567F, 21.3851F, 0.2814F, 0.1777F, -0.2122F));

		PartDefinition cube_r479 = osteoderms18.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.9699F, 27.8422F, 15.941F, 0.2867F, 0.0626F, -0.1912F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(46, 13).addBox(0.0F, -1.7F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 71).addBox(0.0F, -1.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 69).addBox(0.0F, -1.4F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 61).addBox(0.0F, -1.4F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.1929F, 0.3085F, 0.1764F));

		PartDefinition cube_r480 = tail3.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(80, 49).addBox(0.0F, 6.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 12).addBox(0.0F, 6.1F, 16.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 80).addBox(0.0F, 5.4F, 14.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 89).addBox(0.0F, 4.8F, 12.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -12.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r481 = tail3.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(27, 27).addBox(-1.0F, -1.5F, 10.9F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -11.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1089F, 0.397F, 10.2053F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r482 = osteoderms9.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(109, 89).addBox(-1.1268F, -0.5249F, -1.468F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(49, 109).addBox(-2.4268F, -0.5249F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 90).addBox(-2.4268F, -0.5249F, -2.868F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.509F, -0.1631F, -6.1764F, -0.0517F, -0.0539F, -0.0294F));

		PartDefinition cube_r483 = osteoderms9.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(32, 82).addBox(-2.4377F, -0.5249F, -2.0121F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.509F, -0.1631F, -6.1764F, -0.0635F, -0.6203F, 0.0048F));

		PartDefinition cube_r484 = osteoderms9.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(13, 86).addBox(-1.4272F, -0.5249F, -0.252F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.509F, -0.1631F, -6.1764F, -0.052F, -0.1237F, -0.0258F));

		PartDefinition cube_r485 = osteoderms9.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(70, 110).addBox(-1.3095F, -0.5389F, -1.3866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(94, 63).addBox(-2.2095F, -0.5389F, -2.7866F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F))
				.texOffs(109, 59).addBox(-2.2095F, -0.5389F, -0.0866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0969F, -0.7389F, -1.5681F, 0.1404F, -0.0473F, -0.0391F));

		PartDefinition cube_r486 = osteoderms9.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(108, 47).addBox(0.7582F, 0.5888F, -2.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4587F, -2.9755F, -2.1296F, 0.0598F, -0.0503F, 0.2392F));

		PartDefinition cube_r487 = osteoderms9.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(25, 106).addBox(0.4679F, -0.6301F, -1.6015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.3481F, -1.6415F, -6.5917F, -0.0447F, -0.0939F, 0.2366F));

		PartDefinition cube_r488 = osteoderms9.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(102, 85).addBox(-1.3605F, -0.5389F, -0.5951F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0969F, -0.7389F, -1.5681F, 0.1405F, 0.0564F, -0.0245F));

		PartDefinition cube_r489 = osteoderms9.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(81, 71).addBox(-2.2108F, -0.5389F, -2.0602F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0969F, -0.7389F, -1.5681F, 0.1712F, -0.6081F, -0.1309F));

		PartDefinition osteoderms19 = tail3.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1089F, 0.397F, 10.2053F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r490 = osteoderms19.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(109, 89).mirror().addBox(-0.8732F, -0.5249F, -1.468F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(49, 109).mirror().addBox(0.4268F, -0.5249F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 90).mirror().addBox(0.4268F, -0.5249F, -2.868F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.509F, -0.1631F, -6.1764F, -0.0517F, 0.0539F, 0.0294F));

		PartDefinition cube_r491 = osteoderms19.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-3.5623F, -0.5249F, -2.0121F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.509F, -0.1631F, -6.1764F, -0.0635F, 0.6203F, -0.0048F));

		PartDefinition cube_r492 = osteoderms19.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(-4.5728F, -0.5249F, -0.252F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.509F, -0.1631F, -6.1764F, -0.052F, 0.1237F, 0.0258F));

		PartDefinition cube_r493 = osteoderms19.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(70, 110).mirror().addBox(-0.6905F, -0.5389F, -1.3866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(94, 63).mirror().addBox(0.2095F, -0.5389F, -2.7866F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(109, 59).mirror().addBox(0.2095F, -0.5389F, -0.0866F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0969F, -0.7389F, -1.5681F, 0.1404F, 0.0473F, 0.0391F));

		PartDefinition cube_r494 = osteoderms19.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(108, 47).mirror().addBox(-1.7582F, 0.5888F, -2.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4587F, -2.9755F, -2.1296F, 0.0598F, 0.0503F, -0.2392F));

		PartDefinition cube_r495 = osteoderms19.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(25, 106).mirror().addBox(-1.4679F, -0.6301F, -1.6015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.3481F, -1.6415F, -6.5917F, -0.0447F, 0.0939F, -0.2366F));

		PartDefinition cube_r496 = osteoderms19.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(102, 85).mirror().addBox(-2.6395F, -0.5389F, -0.5951F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.0969F, -0.7389F, -1.5681F, 0.1405F, -0.0564F, 0.0245F));

		PartDefinition cube_r497 = osteoderms19.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-3.7892F, -0.5389F, -2.0602F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0969F, -0.7389F, -1.5681F, 0.1712F, 0.6081F, 0.1309F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(53, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(111, 0).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 47).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 107).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 107).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.2292F, 0.35F, 0.1639F));

		PartDefinition cube_r498 = tail4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(14, 48).addBox(-1.0F, -1.7F, 10.7F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(6, 61).addBox(0.0F, 8.8F, 24.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 61).addBox(0.0F, 8.0F, 22.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 106).addBox(0.0F, 7.2F, 20.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -21.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -12.7721F, 1.1034F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r500 = osteoderms10.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(90, 33).addBox(-2.8876F, 0.1553F, -3.139F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.4003F, -0.6748F, -0.288F));

		PartDefinition cube_r501 = osteoderms10.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(98, 5).addBox(-1.4884F, 0.1553F, -2.3022F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.3193F, -0.2488F, -0.1109F));

		PartDefinition cube_r502 = osteoderms10.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(54, 93).addBox(-1.9216F, 0.1553F, -4.1992F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.3092F, -0.0163F, -0.0348F));

		PartDefinition cube_r503 = osteoderms10.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(99, 14).addBox(-0.8152F, -0.0108F, -0.3504F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.4846F, -0.6532F, -0.34F));

		PartDefinition cube_r504 = osteoderms10.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(104, 18).addBox(-1.1264F, -0.0108F, 1.0691F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 94).addBox(-2.1264F, -0.0108F, -0.7309F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(5.4739F, 9.1915F, 8.875F, 0.379F, -0.0138F, -0.0359F));

		PartDefinition cube_r505 = osteoderms10.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(88, 105).addBox(-0.2091F, 0.7629F, -1.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3839F, 7.3671F, 9.5558F, 0.3228F, -0.0895F, 0.2141F));

		PartDefinition cube_r506 = osteoderms10.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(63, 107).addBox(-0.2622F, 0.4643F, -1.3843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4839F, 8.8978F, 5.8603F, 0.3066F, -0.1335F, 0.2128F));

		PartDefinition osteoderms20 = tail4.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -12.7721F, 1.1034F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r507 = osteoderms20.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-2.1124F, 0.1553F, -3.139F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.4003F, 0.6748F, 0.288F));

		PartDefinition cube_r508 = osteoderms20.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(98, 5).mirror().addBox(-2.5116F, 0.1553F, -2.3022F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.3193F, 0.2488F, 0.1109F));

		PartDefinition cube_r509 = osteoderms20.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(54, 93).mirror().addBox(-0.0784F, 0.1553F, -4.1992F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.3092F, 0.0163F, 0.0348F));

		PartDefinition cube_r510 = osteoderms20.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(99, 14).mirror().addBox(-3.1848F, -0.0108F, -0.3504F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.4846F, 0.6532F, 0.34F));

		PartDefinition cube_r511 = osteoderms20.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-1.8736F, -0.0108F, 1.0691F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 94).mirror().addBox(0.1264F, -0.0108F, -0.7309F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-5.4739F, 9.1915F, 8.875F, 0.379F, 0.0138F, 0.0359F));

		PartDefinition cube_r512 = osteoderms20.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(88, 105).mirror().addBox(-0.7909F, 0.7629F, -1.3983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3839F, 7.3671F, 9.5558F, 0.3228F, 0.0895F, -0.2141F));

		PartDefinition cube_r513 = osteoderms20.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(63, 107).mirror().addBox(-0.7378F, 0.4643F, -1.3843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4839F, 8.8978F, 5.8603F, 0.3066F, 0.1335F, -0.2128F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.7421F, -0.1865F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2262F, 8.9999F, 0.1579F, 0.4384F, 0.1503F));

		PartDefinition cube_r514 = tail5.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(33, 9).addBox(-0.5F, -2.1998F, 10.8061F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -11.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -12.7662F, -1.0275F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition cube_r515 = osteoderms11.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(88, 14).addBox(-0.3043F, -0.7398F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2029F, 5.7419F, 15.0756F, 2.3706F, -0.5324F, 1.5731F));

		PartDefinition cube_r516 = osteoderms11.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(58, 110).addBox(0.4609F, -1.6825F, -0.1761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.802F, 7.3189F, 10.599F, -2.4988F, -0.5414F, 1.5814F));

		PartDefinition cube_r517 = osteoderms11.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(0, 10).addBox(-0.3713F, -2.3062F, -0.3332F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(3.102F, 8.9189F, 9.199F, -3.0923F, -0.5324F, 1.5731F));

		PartDefinition cube_r518 = osteoderms11.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(13, 37).addBox(-0.3068F, -0.294F, -1.7467F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.702F, 10.0189F, 7.199F, 2.7371F, -0.5324F, 1.5731F));

		PartDefinition cube_r519 = osteoderms11.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(103, 61).addBox(-0.498F, -1.8058F, 3.2916F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.802F, 7.1189F, 12.499F, 3.1385F, -0.5324F, 1.5731F));

		PartDefinition cube_r520 = osteoderms11.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(41, 39).addBox(-0.3005F, -2.7057F, -0.2771F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.802F, 7.3189F, 12.099F, 3.1212F, -0.5414F, 1.5814F));

		PartDefinition cube_r521 = osteoderms11.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(0, 112).addBox(-0.3022F, -1.0216F, -0.9798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.802F, 7.3189F, 12.099F, 2.3531F, -0.5324F, 1.5731F));

		PartDefinition cube_r522 = osteoderms11.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(8, 105).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0483F, 7.4032F, 11.3226F, 0.5028F, -0.1661F, 0.172F));

		PartDefinition cube_r523 = osteoderms11.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(57, 105).addBox(-0.1078F, 1.6354F, -3.454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2242F, 5.9792F, 8.9444F, 0.4997F, -0.1279F, 0.1931F));

		PartDefinition cube_r524 = osteoderms11.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(21, 111).addBox(-0.1022F, -0.2909F, -1.7266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7013F, 6.5435F, 13.0853F, 1.6986F, -0.5324F, 1.5731F));

		PartDefinition cube_r525 = osteoderms11.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(50, 117).addBox(-0.2047F, -0.4707F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2013F, 6.5435F, 13.2853F, 2.3095F, -0.5324F, 1.5731F));

		PartDefinition osteoderms21 = tail5.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -12.7662F, -1.0275F, -0.5062F, -0.0153F, 0.0085F));

		PartDefinition cube_r526 = osteoderms21.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(88, 14).mirror().addBox(-0.6957F, -0.7398F, -0.6849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2029F, 5.7419F, 15.0756F, 2.3706F, 0.5324F, -1.5731F));

		PartDefinition cube_r527 = osteoderms21.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(58, 110).mirror().addBox(-1.4609F, -1.6825F, -0.1761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 7.3189F, 10.599F, -2.4988F, 0.5414F, -1.5814F));

		PartDefinition cube_r528 = osteoderms21.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.6287F, -2.3062F, -0.3332F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-3.102F, 8.9189F, 9.199F, -3.0923F, 0.5324F, -1.5731F));

		PartDefinition cube_r529 = osteoderms21.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(13, 37).mirror().addBox(-0.6932F, -0.294F, -1.7467F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.702F, 10.0189F, 7.199F, 2.7371F, 0.5324F, -1.5731F));

		PartDefinition cube_r530 = osteoderms21.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(103, 61).mirror().addBox(-0.502F, -1.8058F, 3.2916F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 7.1189F, 12.499F, 3.1385F, 0.5324F, -1.5731F));

		PartDefinition cube_r531 = osteoderms21.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(41, 39).mirror().addBox(-0.6995F, -2.7057F, -0.2771F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.802F, 7.3189F, 12.099F, 3.1212F, 0.5414F, -1.5814F));

		PartDefinition cube_r532 = osteoderms21.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.6978F, -1.0216F, -0.9798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.802F, 7.3189F, 12.099F, 2.3531F, 0.5324F, -1.5731F));

		PartDefinition cube_r533 = osteoderms21.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(8, 105).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0483F, 7.4032F, 11.3226F, 0.5028F, 0.1661F, -0.172F));

		PartDefinition cube_r534 = osteoderms21.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(57, 105).mirror().addBox(-0.8922F, 1.6354F, -3.454F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2242F, 5.9792F, 8.9444F, 0.4997F, 0.1279F, -0.1931F));

		PartDefinition cube_r535 = osteoderms21.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(21, 111).mirror().addBox(-0.8978F, -0.2909F, -1.7266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7013F, 6.5435F, 13.0853F, 1.6986F, 0.5324F, -1.5731F));

		PartDefinition cube_r536 = osteoderms21.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(50, 117).mirror().addBox(-0.7953F, -0.4707F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2013F, 6.5435F, 13.2853F, 2.3095F, 0.5324F, -1.5731F));

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