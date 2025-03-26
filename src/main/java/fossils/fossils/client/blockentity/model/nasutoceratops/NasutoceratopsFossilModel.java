package fossils.fossils.client.blockentity.model.nasutoceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NasutoceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart browHorn;
	private final ModelPart rightFace;
	private final ModelPart browHorn2;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;

	public NasutoceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.browHorn = this.leftFace.getChild("browHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.browHorn2 = this.rightFace.getChild("browHorn2");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5695F, -4.6874F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -25.2F, 9.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 26).addBox(0.0F, -2.4F, -8.8F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3574F, 3.046F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(117, 72).mirror().addBox(-0.5F, -2.9457F, -0.002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(117, 72).addBox(6.5F, -2.9457F, -0.002F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-3.5F, -3.0581F, -4.1218F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-0.6474F, -1.9746F, 0.0403F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, 0.5155F, -3.958F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-0.3167F, 0.0133F, -3.5238F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.643F, 6.8942F, 0.0446F, 0.2092F, 0.0093F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(0.0666F, 0.131F, -0.1877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -4.643F, 4.1942F, 0.0504F, 0.523F, 0.0252F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 73).mirror().addBox(-0.0248F, 0.0017F, 0.0395F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6F, -2.6581F, -9.3218F, 0.526F, 0.1185F, 0.0564F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-0.0248F, 0.0017F, 0.0395F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, -2.6581F, -9.3218F, 0.5223F, -0.0327F, -0.0309F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(113, 54).mirror().addBox(-0.1121F, -0.1296F, 1.8422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 0).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -5.4154F, -4.414F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 114).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(9, 114).addBox(6.5F, -0.4F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-3.5F, -3.7994F, 6.4747F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-2.4121F, -0.1296F, -0.0578F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -5.4154F, -4.414F, 0.1733F, -0.0448F, -0.0293F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-0.3048F, -0.0862F, -6.0568F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -5.4581F, -4.3218F, 0.5435F, 0.2687F, 0.147F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-6.0F, -0.5383F, -4.0482F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 57).addBox(3.0F, -0.5383F, -4.0482F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -4.5F, 2.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(121, 16).mirror().addBox(-0.5716F, 5.5841F, 5.113F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -1.2752F, 0.5219F, 0.2011F, 0.1741F, -0.1301F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 87).mirror().addBox(-0.5716F, -2.0338F, 4.0273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -1.2752F, 0.5219F, -0.785F, 0.1741F, -0.1301F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 113).mirror().addBox(-0.5628F, -1.0315F, 1.3875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -1.2752F, 0.5219F, -0.5585F, 0.1742F, -0.1393F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(113, 32).mirror().addBox(-0.5273F, -1.3585F, -1.4206F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -1.2752F, 0.5219F, -0.8182F, 0.1694F, -0.0892F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(29, 113).mirror().addBox(-0.5273F, -0.0835F, -0.3451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -1.2752F, 0.5219F, -0.2597F, 0.1694F, -0.0892F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(-0.8168F, -1.4036F, 0.6108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, 0.5155F, -3.958F, -0.1139F, 0.2538F, 0.0647F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-0.7137F, -0.6441F, -1.2601F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, -0.3845F, -4.058F, 1.0915F, 0.0434F, 0.0293F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(131, 2).mirror().addBox(-0.7137F, -2.6425F, -3.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, -0.3845F, -4.058F, 1.5278F, 0.0434F, 0.0293F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(118, 130).mirror().addBox(-0.7137F, -2.2654F, -3.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, -0.3845F, -4.058F, 1.266F, 0.0434F, 0.0293F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(120, 80).mirror().addBox(-0.7137F, -0.4707F, -5.2888F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(28, 90).mirror().addBox(-0.7137F, -0.0707F, -3.3888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3738F, -0.3845F, -4.058F, 0.6551F, 0.0434F, 0.0293F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.2F, -2.0F, -1.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4116F, -2.1675F, -1.8159F, -0.3276F, 0.0404F, -0.1367F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-1.0F, 0.1219F, -6.9079F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.6532F, 0.5342F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-0.5F, 2.4434F, -0.3054F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(19, 34).addBox(6.5F, 2.4434F, -0.3054F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, -5.4581F, -4.3218F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.5F, 0.1223F, -0.3902F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 0).addBox(6.5F, 0.1223F, -0.3902F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -4.643F, 4.3942F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-0.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(75, 11).addBox(6.5F, -0.4157F, -2.8006F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -3.5439F, 2.9247F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(113, 54).addBox(-0.8879F, -0.1296F, 1.8422F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 0).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -5.4154F, -4.414F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(75, 19).addBox(-0.5879F, -0.1296F, -0.0578F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -5.4154F, -4.414F, 0.1733F, 0.0448F, 0.0293F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 73).addBox(-0.9752F, 0.0017F, 0.0395F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, -2.6581F, -9.3218F, 0.526F, -0.1185F, -0.0564F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 24).addBox(-0.9752F, 0.0017F, 0.0395F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -2.6581F, -9.3218F, 0.5223F, 0.0327F, 0.0309F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 54).addBox(-0.6952F, -0.0862F, -6.0568F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -5.4581F, -4.3218F, 0.5435F, -0.2687F, -0.147F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(121, 16).addBox(-0.4284F, 5.5841F, 5.113F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -1.2752F, 0.5219F, 0.2011F, -0.1741F, 0.1301F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 87).addBox(-0.4284F, -2.0338F, 4.0273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, -1.2752F, 0.5219F, -0.785F, -0.1741F, 0.1301F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 113).addBox(-0.4372F, -1.0315F, 1.3875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -1.2752F, 0.5219F, -0.5585F, -0.1742F, 0.1393F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(113, 32).addBox(-0.4727F, -1.3585F, -1.4206F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, -1.2752F, 0.5219F, -0.8182F, -0.1694F, 0.0892F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(29, 113).addBox(-0.4727F, -0.0835F, -0.3451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -1.2752F, 0.5219F, -0.2597F, -0.1694F, 0.0892F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 7).addBox(-0.1832F, -1.4036F, 0.6108F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3738F, 0.5155F, -3.958F, -0.1139F, -0.2538F, -0.0647F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(103, 6).addBox(-0.3526F, -1.9746F, 0.0403F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3738F, 0.5155F, -3.958F, -0.0179F, -0.2181F, 0.0039F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 115).addBox(-0.2863F, -0.6441F, -1.2601F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3738F, -0.3845F, -4.058F, 1.0915F, -0.0434F, -0.0293F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(131, 2).addBox(-0.2863F, -2.6425F, -3.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3738F, -0.3845F, -4.058F, 1.5278F, -0.0434F, -0.0293F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(118, 130).addBox(-0.2863F, -2.2654F, -3.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3738F, -0.3845F, -4.058F, 1.266F, -0.0434F, -0.0293F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(120, 80).addBox(-0.2863F, -0.4707F, -5.2888F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(28, 90).addBox(-0.2863F, -0.0707F, -3.3888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.3738F, -0.3845F, -4.058F, 0.6551F, -0.0434F, -0.0293F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 81).addBox(-0.8F, -2.0F, -1.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4116F, -2.1675F, -1.8159F, -0.3276F, -0.0404F, 0.1367F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, 0.1219F, -6.9079F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.6532F, 0.5342F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 26).addBox(-0.6833F, 0.0133F, -3.5238F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.0F, -4.643F, 6.8942F, 0.0446F, -0.2092F, -0.0093F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(103, 0).addBox(-1.0666F, 0.131F, -0.1877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -4.643F, 4.1942F, 0.0504F, -0.523F, -0.0252F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 43).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(130, 10).addBox(1.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 124).addBox(0.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 129).addBox(0.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 129).addBox(0.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 10).mirror().addBox(-3.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 124).mirror().addBox(-2.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 129).mirror().addBox(-2.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 129).mirror().addBox(-2.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.407F, 7.1771F, -0.5522F, 0.1222F, -0.0484F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 133).addBox(0.0F, -1.5485F, -0.0901F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1699F, 8.0938F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(133, 26).addBox(0.0F, -2.6783F, -0.4185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(126, 130).addBox(0.0F, -0.1F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 130).addBox(0.0F, -1.1F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3972F, 7.4282F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(132, 129).addBox(0.0F, -2.5271F, 0.8135F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5035F, 4.8702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 130).addBox(0.0F, -1.7473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(92, 133).addBox(0.0F, -1.8701F, -0.0758F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 2.1245F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(133, 16).addBox(0.0F, -1.4962F, -0.5764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 0.4245F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 13).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(129, 33).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 129).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 71).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 81).addBox(0.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 33).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 129).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 71).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 81).mirror().addBox(-1.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, 0.3319F, 0.0413F, 0.0142F));

		PartDefinition cube_r55 = tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(113, 133).addBox(0.0F, -1.2275F, -0.3379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2209F, 9.3414F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(132, 63).addBox(0.0F, -4.1544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 106).addBox(0.0F, -3.7544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 50).addBox(0.0F, -3.5544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 133).addBox(0.0F, 4.2024F, 10.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 94).addBox(0.0F, 3.4024F, 8.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 118).addBox(0.0F, 2.3024F, 6.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 130).addBox(0.0F, 0.0024F, 4.8767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(49, 133).addBox(0.0F, -1.7547F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(54, 13).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9271F, 9.6761F, 0.6047F, -0.2909F, -0.1957F));

		PartDefinition cube_r59 = tail3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(132, 133).addBox(0.0F, 9.0423F, 17.0451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 133).addBox(0.0F, 7.3423F, 15.4451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 133).addBox(0.0F, 6.1424F, 13.8451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 133).addBox(0.0F, 5.144F, 12.3552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 134).addBox(0.0F, -2.9976F, 5.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 134).addBox(0.0F, -2.8976F, 3.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 134).addBox(0.0F, -2.9976F, 1.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 133).addBox(0.0F, -2.8976F, -0.8767F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.4687F, -0.1314F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2587F, 8.9301F, -0.204F, -0.3424F, 0.0693F));

		PartDefinition cube_r61 = tail4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 119).addBox(0.0F, 8.1206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 133).addBox(0.0F, 10.3574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 118).addBox(0.0F, 9.239F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2856F, -17.6018F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(133, 118).addBox(0.0F, 0.0F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6712F, 0.3294F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 82).addBox(-1.5F, 12.1807F, -5.4436F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.9F, -1.4832F, -1.5527F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(104, 45).addBox(-1.5F, -0.0044F, 0.0549F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.845F, -2.8227F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 18).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 12.045F, -4.1227F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 90).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1872F, 0.0746F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(47, 76).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.1087F, 0.513F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5F, -9.9056F, -0.6199F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 10.8087F, -4.087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4081F, -4.3221F, 0.06F, -0.004F, 0.0088F));

		PartDefinition cube_r68 = leftleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(116, 112).addBox(-0.1F, -1.1382F, -0.6279F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(75, 100).addBox(-0.1F, 0.8618F, -0.1279F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 1.6767F, 1.9116F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(88, 19).addBox(-1.5F, -1.5773F, -0.5107F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.0271F, 0.5442F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(107, 112).addBox(-1.601F, 6.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 106).addBox(-1.101F, -1.7989F, 0.9208F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 4.686F, 1.271F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(36, 97).addBox(-1.5F, -5.8767F, 1.1507F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 8.039F, 3.4726F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(47, 116).addBox(-1.5F, -3.8883F, -0.9316F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, 5.339F, 4.4726F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(61, 110).addBox(-0.601F, -4.1194F, 0.0347F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.499F, 6.286F, 3.171F, 0.7679F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3793F, 6.8355F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftleg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(100, 107).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(25, 118).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftfoot.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(118, 108).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(0, 34).addBox(-1.999F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(82, 39).addBox(-1.5F, 12.1807F, -5.4436F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.9F, -1.4832F, -1.5527F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(105, 12).addBox(-1.5F, -0.0044F, 0.0549F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.845F, -2.8227F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(98, 101).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 12.045F, -4.1227F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 93).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1872F, 0.0746F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(56, 76).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.1087F, 0.513F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 94).addBox(-1.5F, -9.9056F, -0.6199F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 10.8087F, -4.087F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4081F, -4.3221F, 0.1926F, 0.0005F, 0.0072F));

		PartDefinition cube_r81 = rightleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(18, 117).addBox(-0.9F, -1.1382F, -0.6279F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(9, 102).addBox(-0.9F, 0.8618F, -0.1279F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 1.6767F, 1.9116F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 54).addBox(-0.5F, -1.5773F, -0.5107F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 3.0271F, 0.5442F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(114, 7).addBox(-0.399F, 6.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 106).addBox(0.101F, -1.7989F, 0.9208F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 4.686F, 1.271F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(97, 39).addBox(-0.5F, -5.8767F, 1.1507F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 8.039F, 3.4726F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 116).addBox(-0.5F, -3.8883F, -0.9316F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 5.339F, 4.4726F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(101, 121).addBox(-0.399F, -4.1194F, 0.0347F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.499F, 6.286F, 3.171F, 0.7679F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3793F, 6.8355F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightleg3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 108).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(34, 118).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightfoot.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 120).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(19, 64).addBox(-2.001F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9194F, -4.923F, 0.2979F, -0.0822F, -0.0292F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(68, 129).addBox(0.0F, -3.3264F, -0.0306F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4815F, -2.3961F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(107, 127).addBox(0.0F, -3.5324F, -0.0931F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -4.3961F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 122).addBox(0.0F, -4.331F, -0.9447F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3184F, -12.8961F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 81).addBox(0.0F, -4.5677F, -1.0496F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0185F, -10.7961F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(118, 123).addBox(0.0F, -3.7782F, -0.1495F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2815F, -7.6961F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(12, 124).addBox(0.0F, -4.1694F, -1.1443F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6816F, -8.6961F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 129).addBox(0.0F, -3.6766F, -0.0331F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5816F, -6.1961F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-5.0F, 0.522F, 4.0672F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 14).addBox(1.0F, 0.522F, 4.0672F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-1.0F, 0.022F, 0.0672F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6816F, -6.2961F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-1.0F, -1.0F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 73).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3851F, -0.0269F, -11.3594F, 0.429F, -0.1843F, 0.5459F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(122, 35).mirror().addBox(-2.8717F, -0.0441F, 0.0073F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8F, 9.0185F, -4.6961F, 0.0551F, 0.7669F, -1.3474F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-10.267F, 1.9375F, -2.1266F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8F, -0.7815F, -9.1961F, 0.049F, 0.6274F, -1.3568F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(-5.612F, 1.9459F, -0.8007F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8F, -0.7815F, -9.1961F, 0.0428F, 0.3833F, -1.3696F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(100, 127).mirror().addBox(-0.5051F, 2.5385F, -0.5715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8F, -0.7815F, -9.1961F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(127, 98).mirror().addBox(2.5915F, 1.3923F, -0.6717F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8F, -0.7815F, -9.1961F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(129, 67).mirror().addBox(-12.133F, -3.7752F, -5.4176F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0517F, 0.8723F, -1.3448F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(129, 71).mirror().addBox(-2.8413F, -0.6493F, -0.4989F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.4724F, 0.1224F, -0.2899F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(129, 69).mirror().addBox(-4.094F, -2.0258F, -0.5762F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.3087F, 0.3423F, -0.8033F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-6.4887F, -3.8014F, -0.7915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.0923F, 0.5182F, -1.3533F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-15.3749F, -3.7803F, -1.5147F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.0987F, 0.6225F, -1.3414F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(128, 122).mirror().addBox(-2.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(128, 77).mirror().addBox(-4.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 41).mirror().addBox(-17.8804F, -3.7351F, -0.4699F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(127, 104).mirror().addBox(-2.897F, -0.4693F, -0.4062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.2215F, 0.0445F, -0.3109F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(127, 102).mirror().addBox(-4.2346F, -1.9047F, -0.4779F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.126F, 0.1493F, -0.8481F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(111, 68).mirror().addBox(-11.2317F, -3.7752F, -2.4345F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0401F, 0.5933F, -1.3619F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-6.6225F, -3.7668F, -0.8661F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0353F, 0.3491F, -1.3723F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(120, 90).mirror().addBox(-5.2718F, -3.8034F, -1.3392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6816F, -3.9961F, -0.0161F, 0.1794F, -1.385F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(130, 116).mirror().addBox(-5.0438F, -3.8059F, -3.7268F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6816F, -3.9961F, -0.0078F, 0.6846F, -1.3865F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(129, 39).mirror().addBox(-4.1246F, -1.9998F, -0.4778F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6816F, -3.9961F, -0.1386F, -0.1535F, -0.8476F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(129, 37).mirror().addBox(-2.8614F, -0.5765F, -0.3734F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6816F, -3.9961F, -0.2446F, -0.1044F, -0.2967F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-10.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.0044F, 0.5091F, -1.3794F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(53, 123).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.004F, 0.2822F, -1.3804F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(127, 100).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.0223F, 0.0309F, -0.8575F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(23, 126).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -1.2563F, -3.8056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(126, 19).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.3562F, -5.7056F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(124, 42).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -1.1109F, -7.4714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 126).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.238F, -0.6109F, -9.2714F, 0.3417F, -0.1843F, 0.5459F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(129, 56).mirror().addBox(-2.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, -0.0111F, -0.0307F, -0.3125F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(127, 98).addBox(-4.5915F, 1.3923F, -0.6717F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.7815F, -9.1961F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(100, 127).addBox(-1.4949F, 2.5385F, -0.5715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.7815F, -9.1961F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(54, 90).addBox(1.612F, 1.9459F, -0.8007F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.7815F, -9.1961F, 0.0428F, -0.3833F, 1.3696F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(111, 70).addBox(5.2671F, 1.9375F, -2.1266F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, -0.7815F, -9.1961F, 0.049F, -0.6274F, 1.3568F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(122, 35).addBox(-0.1283F, -0.0441F, 0.0073F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8F, 9.0185F, -4.6961F, 0.0551F, -0.7669F, 1.3474F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(127, 104).addBox(0.897F, -0.4693F, -0.4062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.2215F, -0.0445F, 0.3109F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(127, 102).addBox(2.2346F, -1.9047F, -0.4779F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.126F, -0.1493F, 0.8481F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(129, 67).addBox(10.133F, -3.7752F, -5.4176F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0517F, -0.8723F, 1.3448F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(111, 68).addBox(6.2317F, -3.7752F, -2.4345F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0401F, -0.5933F, 1.3619F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(79, 8).addBox(2.6225F, -3.7668F, -0.8661F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1816F, -7.5961F, 0.0353F, -0.3491F, 1.3723F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(58, 9).addBox(6.3749F, -3.7803F, -1.5147F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.0987F, -0.6225F, 1.3414F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(117, 78).addBox(2.4887F, -3.8014F, -0.7915F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.0923F, -0.5182F, 1.3533F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(129, 69).addBox(2.094F, -2.0258F, -0.5762F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.3087F, -0.3423F, 0.8033F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(129, 71).addBox(0.8413F, -0.6493F, -0.4989F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1816F, -11.2961F, 0.4724F, -0.1224F, 0.2899F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 41).addBox(2.8804F, -3.7351F, -0.4699F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 77).addBox(2.362F, -1.7945F, -0.4699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(128, 122).addBox(0.9488F, -0.3088F, -0.4031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0185F, -13.3961F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(120, 90).addBox(2.2718F, -3.8034F, -1.3392F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6816F, -3.9961F, -0.0161F, -0.1794F, 1.385F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(130, 116).addBox(4.0438F, -3.8059F, -3.7268F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6816F, -3.9961F, -0.0078F, -0.6846F, 1.3865F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(129, 39).addBox(2.1246F, -1.9998F, -0.4778F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6816F, -3.9961F, -0.1386F, 0.1535F, 0.8476F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(129, 37).addBox(0.8614F, -0.5765F, -0.3734F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6816F, -3.9961F, -0.2446F, 0.1044F, 0.2967F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 11).addBox(5.1153F, -3.7578F, -2.4801F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.0044F, -0.5091F, 1.3794F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(53, 123).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.004F, -0.2822F, 1.3804F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(127, 100).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, 0.0223F, -0.0309F, 0.8575F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 126).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -1.2563F, -3.8056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(126, 19).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.3562F, -5.7056F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(124, 42).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -1.1109F, -7.4714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 126).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.238F, -0.6109F, -9.2714F, 0.3417F, 0.1843F, -0.5459F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(67, 54).addBox(-1.0F, -1.0F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 73).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3851F, -0.0269F, -11.3594F, 0.429F, 0.1843F, -0.5459F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(129, 56).addBox(0.929F, -0.3767F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6816F, -5.6961F, -0.0111F, 0.0307F, 0.3125F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(52, 26).addBox(-1.0F, -1.0745F, -7.9424F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5816F, -5.8961F, 0.2531F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6952F, -13.1049F, 0.1664F, 0.0884F, 0.0134F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(128, 2).addBox(0.0F, -3.4287F, -0.8216F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9667F, -4.9016F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(127, 82).addBox(0.0F, -4.0202F, 0.034F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3333F, -2.3016F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(97, 125).addBox(0.0F, -3.8343F, -0.9504F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3667F, -3.1016F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(110, 127).addBox(0.0F, -3.1591F, -0.8934F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0667F, -6.5016F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(74, 124).addBox(0.0F, -2.5922F, -0.2116F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5667F, -8.9016F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(52, 110).mirror().addBox(-0.3782F, 0.0789F, -2.9255F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0056F)).mirror(false), PartPose.offsetAndRotation(-5.8339F, -2.0606F, 0.3957F, 0.3904F, -0.0507F, 0.0917F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(0.0215F, -0.4313F, 5.1891F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(65, 76).mirror().addBox(0.0215F, -0.4313F, 0.1891F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.5F, 6.3132F, -9.5244F, 0.7394F, -0.0507F, 0.0917F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(0.0354F, -2.0279F, -5.029F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.5F, 2.6132F, -3.1244F, 1.2107F, -0.0507F, 0.0917F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(125, 64).mirror().addBox(-0.8F, -1.2F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 61).mirror().addBox(-0.8F, -1.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 1.6989F, -5.1066F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(127, 92).mirror().addBox(-1.8824F, -0.0354F, -0.4615F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1667F, -3.7016F, 0.6079F, 0.1611F, -0.2707F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(129, 58).mirror().addBox(-3.5917F, -1.0063F, -0.4981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1667F, -3.7016F, 0.4158F, 0.4409F, -0.7624F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-16.6073F, -2.6673F, -0.4981F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1667F, -3.7016F, 0.1238F, 0.585F, -1.3431F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(127, 88).mirror().addBox(-1.8824F, -0.0354F, -0.4614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.9333F, -2.0016F, 0.5739F, 0.1517F, -0.276F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(128, 8).mirror().addBox(-3.5917F, -1.0063F, -0.4981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.9333F, -2.0016F, 0.3882F, 0.4166F, -0.7739F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-17.6073F, -2.6673F, -0.4981F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.9333F, -2.0016F, 0.1146F, 0.551F, -1.3481F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.6593F, 0.2442F, -0.2912F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 55).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.4212F, 0.538F, -0.7907F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(-10.7642F, -3.7644F, -0.2185F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.061F, 0.6678F, -1.4108F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(129, 54).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.6595F, 0.1737F, -0.2969F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(129, 31).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.4593F, 0.4758F, -0.778F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(52, 38).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.14F, 0.6357F, -1.3687F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-2.9431F, -0.3358F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.6249F, 0.1657F, -0.2679F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-15.8566F, -3.7393F, -0.5813F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.1286F, 0.602F, -1.3404F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(127, 80).mirror().addBox(-4.3435F, -1.8101F, -0.5813F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.4298F, 0.4529F, -0.7563F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(1.7312F, -2.2843F, -3.4867F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 11.0132F, -7.9244F, 1.4408F, -0.1533F, -0.8627F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(1.7973F, -2.5843F, 0.1697F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 11.0132F, -7.9244F, 1.3964F, -0.0998F, -0.5149F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(55, 67).mirror().addBox(0.0215F, 0.8002F, 6.7791F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5F, 6.3132F, -9.5244F, 0.914F, -0.0507F, 0.0917F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-0.4503F, -0.0036F, -1.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 12.9931F, 1.6868F, 0.6547F, -1.1555F, -0.7286F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.3058F, -0.1007F, -0.2057F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1737F, 13.5261F, 2.0417F, 0.1883F, -1.1072F, -0.1325F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(104, 40).mirror().addBox(-0.6822F, -0.1832F, -0.1535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1737F, 13.0737F, 0.4706F, 1.6394F, -1.2592F, -1.2974F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.0263F, -0.2206F, -6.1576F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(15, 79).addBox(2.3737F, -0.2206F, -6.1576F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 13.2957F, 2.9652F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-0.0263F, -1.0376F, 0.1417F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 55).addBox(2.3737F, -1.0376F, 0.1417F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 11.7957F, -10.1348F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(29, 106).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.6593F, -0.2442F, 0.2912F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(38, 55).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.4212F, -0.538F, 0.7907F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(54, 24).addBox(2.7642F, -3.7644F, -0.2185F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6039F, -8.9509F, 0.061F, -0.6678F, 1.4108F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(129, 54).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.6595F, -0.1737F, 0.2969F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(129, 31).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.4593F, -0.4758F, 0.778F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(52, 38).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0759F, -6.9099F, 0.14F, -0.6357F, 1.3687F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(128, 0).addBox(0.9431F, -0.3358F, -0.5137F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.6249F, -0.1657F, 0.2679F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 32).addBox(2.8566F, -3.7393F, -0.5813F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.1286F, -0.602F, 1.3404F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(127, 80).addBox(2.3435F, -1.8101F, -0.5813F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0667F, -5.2016F, 0.4298F, -0.4529F, 0.7563F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(46, 43).addBox(2.6073F, -2.6673F, -0.4981F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1667F, -3.7016F, 0.1238F, -0.585F, 1.3431F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(129, 58).addBox(1.5917F, -1.0063F, -0.4981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1667F, -3.7016F, 0.4158F, -0.4409F, 0.7624F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(127, 92).addBox(-0.1176F, -0.0354F, -0.4615F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1667F, -3.7016F, 0.6079F, -0.1611F, 0.2707F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 41).addBox(2.6073F, -2.6673F, -0.4981F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.9333F, -2.0016F, 0.1146F, -0.551F, 1.3481F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(128, 8).addBox(1.5917F, -1.0063F, -0.4981F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.9333F, -2.0016F, 0.3882F, -0.4166F, 0.7739F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(127, 88).addBox(-0.1176F, -0.0354F, -0.4614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.9333F, -2.0016F, 0.5739F, -0.1517F, 0.276F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(43, 97).addBox(-2.7312F, -2.2843F, -3.4867F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0F, 11.0132F, -7.9244F, 1.4408F, 0.1533F, 0.8627F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(78, 83).addBox(-2.7973F, -2.5843F, 0.1697F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 11.0132F, -7.9244F, 1.3964F, 0.0998F, 0.5149F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(52, 110).addBox(-0.6218F, 0.0789F, -2.9255F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(5.8339F, -2.0606F, 0.3957F, 0.3904F, 0.0507F, -0.0917F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(55, 67).addBox(-1.0215F, 0.8002F, 6.7791F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.3132F, -9.5244F, 0.914F, 0.0507F, -0.0917F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0354F, -2.0279F, -5.029F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.5F, 2.6132F, -3.1244F, 1.2107F, 0.0507F, -0.0917F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(57, 57).addBox(-1.0215F, -0.4313F, 5.1891F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(65, 76).addBox(-1.0215F, -0.4313F, 0.1891F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.5F, 6.3132F, -9.5244F, 0.7394F, 0.0507F, -0.0917F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(75, 32).addBox(-0.5497F, -0.0036F, -1.1659F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 12.9931F, 1.6868F, 0.6547F, 1.1555F, 0.7286F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 66).addBox(-0.6942F, -0.1007F, -0.2057F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1737F, 13.5261F, 2.0417F, 0.1883F, 1.1072F, 0.1325F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(104, 40).addBox(-0.3178F, -0.1832F, -0.1535F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1737F, 13.0737F, 0.4706F, 1.6394F, 1.2592F, 1.2974F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(123, 23).addBox(-1.9737F, -0.2206F, -2.0576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1737F, 13.2957F, 2.9652F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(125, 64).addBox(-1.2F, -1.2F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 61).addBox(-1.2F, -1.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 1.6989F, -5.1066F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(123, 115).mirror().addBox(-0.7F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5989F, -5.0066F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(123, 115).addBox(-1.3F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5989F, -5.0066F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.907F, -1.4667F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3667F, -8.9016F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1006F, 9.4675F, -6.6224F, -0.2531F, 0.0F, -0.1745F));

		PartDefinition cube_r219 = leftarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(111, 60).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0278F, -0.5672F, -0.0056F));

		PartDefinition cube_r220 = leftarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(124, 67).addBox(-0.1791F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0288F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r221 = leftarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(103, 24).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(85, 70).addBox(-2.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(98, 93).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5043F, 6.7362F, 3.7131F, -1.1444F, -0.7991F, 1.6517F));

		PartDefinition cube_r224 = leftarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 100).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 89).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8476F, 4.5142F, -2.3648F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7995F, 7.4704F, -2.5839F, 2.0909F, 0.6331F, -0.3409F));

		PartDefinition cube_r225 = lefthand.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(109, 84).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r226 = lefthand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(98, 61).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r227 = lefthand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(118, 92).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r228 = lefthand.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(115, 41).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1006F, 9.4675F, -6.6224F, -0.0785F, 0.0F, 0.1745F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(111, 104).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0278F, 0.5672F, 0.0056F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(53, 125).addBox(-0.8209F, -1.8311F, -1.0052F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0288F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(104, 32).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(90, 33).addBox(-1.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 100).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5043F, 6.7362F, 3.7131F, 0.6727F, 1.244F, 0.0807F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 100).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 83).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8476F, 4.5142F, -2.3648F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7995F, 7.4704F, -2.5839F, 2.0116F, -0.7174F, 0.537F));

		PartDefinition cube_r235 = righthand.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(109, 88).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r236 = righthand.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(98, 66).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r237 = righthand.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(118, 96).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r238 = righthand.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(115, 45).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3801F, -10.1607F, 0.2177F, 0.1176F, 0.191F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(30, 131).addBox(0.0F, -2.5703F, -0.1462F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.8F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(89, 129).addBox(0.0F, -2.725F, -0.2316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.7F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(40, 108).addBox(0.0F, -2.4805F, 0.0742F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(15, 127).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -4.4754F, 0.6377F, 0.5993F, -0.7128F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -2.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -2.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -0.4754F, 0.7854F, 0.4555F, -0.2831F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(82, 129).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -0.4754F, 0.4182F, 0.78F, -0.828F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(118, 59).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -0.4754F, -0.1552F, 0.8532F, -1.5963F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 127).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -4.4754F, 0.6377F, -0.5993F, 0.7128F));

		PartDefinition cube_r249 = neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(77, 43).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -2.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r250 = neck2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(126, 52).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -2.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r251 = neck2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(129, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -0.4754F, 0.7854F, -0.4555F, 0.2831F));

		PartDefinition cube_r252 = neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 129).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -0.4754F, 0.4182F, -0.78F, 0.828F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(118, 59).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -0.4754F, -0.1552F, -0.8532F, 1.5963F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.4119F, 0.1747F, -0.0029F));

		PartDefinition cube_r255 = neck.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(69, 124).addBox(0.0F, -3.4F, -3.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 0).addBox(-1.0F, -1.4F, -5.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(100, 129).mirror().addBox(-1.8479F, -0.0535F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(100, 129).addBox(-0.1521F, -0.0535F, -0.3655F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(46, 45).addBox(-2.5F, -3.7799F, -4.1581F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.1487F, -5.8739F, 0.7186F, -0.1504F, -0.0672F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(82, 46).addBox(-1.5F, -1.197F, -0.1502F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0346F, -1.8277F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(121, 122).addBox(-1.0F, -0.0071F, 2.7367F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(98, 117).addBox(-1.0F, -2.067F, 3.1406F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7567F, -9.3625F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 106).addBox(-1.0F, -2.657F, -0.1332F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.1433F, -5.9625F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 119).addBox(-1.0F, 0.0722F, 0.0209F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.0433F, -11.2625F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(122, 54).addBox(-1.0F, -0.0899F, -0.0233F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.3433F, -10.5625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(118, 61).addBox(-0.5F, -0.1983F, -0.3174F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.4433F, -8.7625F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 129).addBox(-0.5F, -1.7218F, -1.865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 122).addBox(-1.0F, -1.7218F, -0.865F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4103F, -6.4921F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(20, 131).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1731F, -8.3052F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(126, 16).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.6148F, -7.4939F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(123, 5).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.1152F, -6.8671F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 102).addBox(-0.5F, -1.5F, -2.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.2973F, -7.1335F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(119, 49).addBox(-0.5F, -0.7F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1643F, -5.7982F, 2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5F, -1.0371F, -2.1124F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.4973F, -4.8335F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(63, 117).addBox(-0.5F, -1.0034F, -1.9776F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7973F, -6.1335F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(112, 17).addBox(-0.5F, -0.7169F, -3.9007F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2433F, -7.6625F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5F, 1.838F, -0.0333F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.8433F, -10.5625F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(124, 45).addBox(-1.0F, 2.4276F, 0.8452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2433F, -8.7625F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 62).addBox(-1.5F, -0.0145F, -3.0517F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6567F, -5.8625F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(67, 93).addBox(-2.0F, -0.0697F, -1.9209F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8567F, -5.8625F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(38, 65).addBox(-1.5F, -0.3889F, -4.9507F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.5346F, -0.9277F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 85).addBox(-2.0F, -7.8F, 1.1F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 76).addBox(-2.5F, -6.8F, 3.1F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0433F, -2.4625F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(3.26F, 0.0838F, 0.1911F, -1.3458F, 0.1033F, 0.1865F));

		PartDefinition cube_r279 = leftCheek.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(94, 121).addBox(-0.1154F, 0.6465F, -2.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(121, 27).addBox(-0.1154F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.526F, -0.8982F, 2.637F, 0.2579F, 0.6816F, 0.4262F));

		PartDefinition cube_r280 = leftCheek.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(25, 131).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0263F, -0.8397F, 2.6179F, 0.764F, 0.6816F, 0.4262F));

		PartDefinition cube_r281 = leftCheek.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(32, 122).addBox(-0.8737F, -0.9717F, -1.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.3306F, 0.6867F, 0.4214F));

		PartDefinition cube_r282 = leftCheek.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 67).addBox(-0.7481F, -0.6827F, -3.9869F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3086F, 4.08F, 2.2699F, 2.5818F, 0.0553F, 0.4258F));

		PartDefinition cube_r283 = leftCheek.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(80, 110).addBox(-1.086F, -0.2515F, -3.0219F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.826F, 1.0018F, 0.937F, 1.6243F, 0.2759F, 0.2824F));

		PartDefinition cube_r284 = leftCheek.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(9, 94).addBox(-1.0613F, -3.5353F, -3.4434F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.426F, 1.9018F, 2.437F, 0.8603F, 0.483F, 0.0795F));

		PartDefinition cube_r285 = leftCheek.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 108).addBox(-1.642F, -2.1953F, -2.5305F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 1.3018F, 0.437F, 0.4223F, 0.6025F, 0.3802F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.26F, 0.0838F, 0.1911F, -1.3458F, -0.1033F, -0.1865F));

		PartDefinition cube_r286 = rightCheek.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(94, 121).mirror().addBox(-0.8846F, 0.6465F, -2.6507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(121, 27).mirror().addBox(-0.8846F, -0.3535F, -2.1507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.526F, -0.8982F, 2.637F, 0.2579F, -0.6816F, -0.4262F));

		PartDefinition cube_r287 = rightCheek.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(25, 131).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0263F, -0.8397F, 2.6179F, 0.764F, -0.6816F, -0.4262F));

		PartDefinition cube_r288 = rightCheek.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(32, 122).mirror().addBox(-0.1263F, -0.9717F, -1.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.3306F, -0.6867F, -0.4214F));

		PartDefinition cube_r289 = rightCheek.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-0.2519F, -0.6827F, -3.9869F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3086F, 4.08F, 2.2699F, 2.5818F, -0.0553F, -0.4258F));

		PartDefinition cube_r290 = rightCheek.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(0.086F, -0.2515F, -3.0219F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.826F, 1.0018F, 0.937F, 1.6243F, -0.2759F, -0.2824F));

		PartDefinition cube_r291 = rightCheek.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(0.0613F, -3.5353F, -3.4434F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.426F, 1.9018F, 2.437F, 0.8603F, -0.483F, -0.0795F));

		PartDefinition cube_r292 = rightCheek.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(0.642F, -2.1953F, -2.5305F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.726F, 1.3018F, 0.437F, 0.4223F, -0.6025F, -0.3802F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7296F, 8.1386F, -10.9243F, 0.2791F, -0.0096F, 0.0336F));

		PartDefinition cube_r293 = leftBeak.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(126, 126).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3894F, 2.6374F, 2.2176F, -0.6058F, 0.0699F, 0.0695F));

		PartDefinition cube_r294 = leftBeak.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(127, 106).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2202F, 2.2827F, 3.3105F, -1.3544F, 0.0914F, -0.0727F));

		PartDefinition cube_r295 = leftBeak.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(10, 131).addBox(-1.4306F, 0.0185F, -0.1165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3704F, 1.8679F, 0.394F, 0.3978F, 0.0699F, 0.0695F));

		PartDefinition cube_r296 = leftBeak.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(128, 27).addBox(-1.5347F, -3.0504F, 0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3704F, 2.9679F, -0.006F, 0.0662F, 0.0699F, 0.0695F));

		PartDefinition cube_r297 = leftBeak.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(127, 94).addBox(-1.2738F, -1.7863F, -0.2197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3704F, 2.6679F, 1.994F, 0.8428F, 0.0699F, 0.0695F));

		PartDefinition cube_r298 = leftBeak.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 130).addBox(-0.4137F, 0.9981F, 0.0972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5875F, 1.9825F, -0.0164F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7296F, 8.1386F, -10.9243F, 0.2791F, 0.0096F, -0.0336F));

		PartDefinition cube_r299 = rightBeak.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(126, 126).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3894F, 2.6374F, 2.2176F, -0.6058F, -0.0699F, -0.0695F));

		PartDefinition cube_r300 = rightBeak.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(127, 106).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2202F, 2.2827F, 3.3105F, -1.3544F, -0.0914F, 0.0727F));

		PartDefinition cube_r301 = rightBeak.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(0.4306F, 0.0185F, -0.1165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3704F, 1.8679F, 0.394F, 0.3978F, -0.0699F, -0.0695F));

		PartDefinition cube_r302 = rightBeak.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(128, 27).mirror().addBox(0.5347F, -3.0504F, 0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3704F, 2.9679F, -0.006F, 0.0662F, -0.0699F, -0.0695F));

		PartDefinition cube_r303 = rightBeak.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(127, 94).mirror().addBox(0.2738F, -1.7863F, -0.2197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3704F, 2.6679F, 1.994F, 0.8428F, -0.0699F, -0.0695F));

		PartDefinition cube_r304 = rightBeak.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-0.5863F, 0.9981F, 0.0972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5875F, 1.9825F, -0.0164F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(67, 45).addBox(-1.7F, -2.9F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2127F, -1.8412F, 3.3394F, 0.6539F, 0.1622F, 0.1262F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(17, 71).addBox(-2.1803F, -2.1038F, -0.1159F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2336F, 1.3812F, 2.7172F, 0.6949F, 0.4564F, 0.1388F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(118, 104).addBox(-2.0F, -1.0082F, -1.9769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1227F, -8.2919F, 0.88F, 2.9665F, 0.2598F, -0.2667F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(121, 118).addBox(-2.0F, 0.0035F, -0.984F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1227F, -9.0919F, 2.58F, 0.1978F, 0.0676F, -0.3249F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(77, 126).addBox(-1.0F, -0.0172F, -1.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1228F, -9.0919F, 2.68F, 0.2088F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(39, 122).addBox(-2.0F, -0.0592F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1227F, -8.7919F, 1.58F, 0.7047F, 0.2195F, -0.2506F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(112, 27).addBox(-1.155F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 62).addBox(-1.515F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(98, 112).addBox(-0.845F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5533F, -6.3372F, 2.3222F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(89, 112).addBox(-0.223F, 0.2239F, -0.4775F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2336F, 1.3812F, 2.7172F, 0.6793F, 0.5027F, 0.0412F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 127).addBox(-0.5F, -0.9805F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.6F, 2.5F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(113, 123).addBox(-0.9F, -3.9609F, -0.1821F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.6F, 2.2F, 1.7279F, 0.0175F, -0.0006F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(132, 60).addBox(-0.4102F, -0.9515F, -0.0663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9336F, 4.3266F, -1.6621F, 1.1718F, 0.2343F, -0.052F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(130, 12).addBox(-0.6625F, -1.9219F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9336F, 3.9266F, -2.6621F, 1.0496F, 0.2343F, -0.052F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(123, 111).addBox(-1.0634F, -0.6872F, 2.7946F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2336F, 1.3812F, 2.7172F, 0.5519F, 0.4951F, 0.0731F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(98, 81).addBox(-1.0634F, -0.2251F, -0.6756F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2336F, 1.3812F, 2.7172F, 0.709F, 0.4951F, 0.0731F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(27, 97).addBox(-0.8F, -1.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5311F, -8.4327F, 5.1069F, 0.1177F, 0.2548F, 0.2586F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(98, 71).addBox(-4.3305F, -0.1323F, -0.3346F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -9.7497F, 3.2393F, 0.1015F, 0.513F, -0.0706F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(108, 50).addBox(-2.9159F, -0.1184F, -2.1515F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4338F, -9.6281F, 3.5814F, 0.6633F, 0.1179F, -0.1826F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(115, 37).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2051F, -8.7591F, 3.3045F, 0.7845F, 0.3333F, 0.0117F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(102, 54).addBox(-2.8137F, -0.1659F, 1.8939F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -9.7497F, 3.2393F, -0.1089F, 0.9206F, -0.575F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(54, 116).addBox(-2.2847F, -0.3219F, 1.6229F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -9.7497F, 3.2393F, -0.1075F, 0.3978F, -0.4473F));

		PartDefinition browHorn = leftFace.addOrReplaceChild("browHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5452F, -8.5015F, 1.9825F, -0.001F, -0.4617F, 1.1609F));

		PartDefinition cube_r325 = browHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(107, 93).addBox(-0.5F, -0.445F, -1.5177F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1362F, -0.2327F, -0.9849F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r326 = browHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(7, 124).addBox(1.2734F, -5.0895F, -0.9846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1639F, -3.6327F, -6.1849F, 2.0049F, 0.5921F, 0.3713F));

		PartDefinition cube_r327 = browHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 125).addBox(0.4512F, -2.8111F, -1.1008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1639F, -3.6327F, -6.1849F, 1.9052F, 0.2827F, 0.1941F));

		PartDefinition cube_r328 = browHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(124, 37).addBox(0.0888F, -2.9754F, -0.9846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1639F, -3.6327F, -6.1849F, 1.9314F, 0.148F, 0.1737F));

		PartDefinition cube_r329 = browHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(125, 11).addBox(0.8696F, -2.8242F, -1.0981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0362F, -3.6327F, -3.3849F, 1.5451F, 0.0642F, 0.0827F));

		PartDefinition cube_r330 = browHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(87, 124).addBox(-0.0005F, -3.0724F, -1.0981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0362F, -3.6327F, -3.3849F, 1.545F, -0.0929F, 0.0868F));

		PartDefinition cube_r331 = browHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, -2.9965F, -1.0128F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1362F, -2.1327F, -0.7849F, 1.0638F, -0.1717F, 0.1045F));

		PartDefinition cube_r332 = browHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(124, 72).addBox(-0.5F, -1.2099F, -1.3643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1362F, -1.1327F, 0.2151F, 0.6452F, 0.0F, 0.0F));

		PartDefinition cube_r333 = browHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(107, 117).addBox(-0.5F, -1.5099F, -0.9643F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1362F, -1.1327F, 0.2151F, 0.8197F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-0.3F, -2.9F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2127F, -1.8412F, 3.3394F, 0.6539F, -0.1622F, -0.1262F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(0.1803F, -2.1038F, -0.1159F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2336F, 1.3812F, 2.7172F, 0.6949F, -0.4564F, -0.1388F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 104).mirror().addBox(0.0F, -1.0082F, -1.9769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -8.2919F, 0.88F, 2.9665F, -0.2598F, 0.2667F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(121, 118).mirror().addBox(0.0F, 0.0035F, -0.984F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -9.0919F, 2.58F, 0.1978F, -0.0676F, 0.3249F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(77, 126).mirror().addBox(0.0F, -0.0172F, -1.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1228F, -9.0919F, 2.68F, 0.2088F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(39, 122).mirror().addBox(0.0F, -0.0592F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1227F, -8.7919F, 1.58F, 0.7047F, -0.2195F, 0.2506F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(112, 27).mirror().addBox(-0.845F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 62).mirror().addBox(-1.485F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(98, 112).mirror().addBox(-1.155F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5533F, -6.3372F, 2.3222F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 112).mirror().addBox(0.223F, 0.2239F, -0.4775F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2336F, 1.3812F, 2.7172F, 0.6793F, -0.5027F, -0.0412F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(63, 127).mirror().addBox(-0.5F, -0.9805F, -0.0262F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 2.6F, 2.5F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(113, 123).mirror().addBox(-0.1F, -3.9609F, -0.1821F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 3.6F, 2.2F, 1.7279F, -0.0175F, 0.0006F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(132, 60).mirror().addBox(-0.5898F, -0.9515F, -0.0663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9336F, 4.3266F, -1.6621F, 1.1718F, -0.2343F, 0.052F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(130, 12).mirror().addBox(-0.3375F, -1.9219F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9336F, 3.9266F, -2.6621F, 1.0496F, -0.2343F, 0.052F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(123, 111).mirror().addBox(0.0634F, -0.6872F, 2.7946F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2336F, 1.3812F, 2.7172F, 0.5519F, -0.4951F, -0.0731F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(98, 81).mirror().addBox(0.0634F, -0.2251F, -0.6756F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2336F, 1.3812F, 2.7172F, 0.709F, -0.4951F, -0.0731F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(27, 97).mirror().addBox(-0.2F, -1.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5311F, -8.4327F, 5.1069F, 0.1177F, -0.2548F, -0.2586F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(98, 71).mirror().addBox(0.3306F, -0.1323F, -0.3346F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -9.7497F, 3.2393F, 0.1015F, -0.513F, 0.0706F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-0.0841F, -0.1184F, -2.1515F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4338F, -9.6281F, 3.5814F, 0.6633F, -0.1179F, 0.1826F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(115, 37).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2051F, -8.7591F, 3.3045F, 0.7845F, -0.3333F, -0.0117F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(102, 54).mirror().addBox(1.8137F, -0.1659F, 1.8939F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -9.7497F, 3.2393F, -0.1089F, -0.9206F, 0.575F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(54, 116).mirror().addBox(0.2847F, -0.3219F, 1.6229F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -9.7497F, 3.2393F, -0.1075F, -0.3978F, 0.4473F));

		PartDefinition browHorn2 = rightFace.addOrReplaceChild("browHorn2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5452F, -8.5015F, 1.9825F, -0.001F, 0.4617F, -1.1609F));

		PartDefinition cube_r354 = browHorn2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(107, 93).mirror().addBox(-1.5F, -0.445F, -1.5177F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1362F, -0.2327F, -0.9849F, 1.7796F, 0.0F, 0.0F));

		PartDefinition cube_r355 = browHorn2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(7, 124).mirror().addBox(-2.2734F, -5.0895F, -0.9846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1639F, -3.6327F, -6.1849F, 2.0049F, -0.5921F, -0.3713F));

		PartDefinition cube_r356 = browHorn2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 125).mirror().addBox(-1.4512F, -2.8111F, -1.1008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1639F, -3.6327F, -6.1849F, 1.9052F, -0.2827F, -0.1941F));

		PartDefinition cube_r357 = browHorn2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(124, 37).mirror().addBox(-1.0888F, -2.9754F, -0.9846F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1639F, -3.6327F, -6.1849F, 1.9314F, -0.148F, -0.1737F));

		PartDefinition cube_r358 = browHorn2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(125, 11).mirror().addBox(-1.8696F, -2.8242F, -1.0981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0362F, -3.6327F, -3.3849F, 1.5451F, -0.0642F, -0.0827F));

		PartDefinition cube_r359 = browHorn2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(87, 124).mirror().addBox(-0.9995F, -3.0724F, -1.0981F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0362F, -3.6327F, -3.3849F, 1.545F, 0.0929F, -0.0868F));

		PartDefinition cube_r360 = browHorn2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-1.5F, -2.9965F, -1.0128F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1362F, -2.1327F, -0.7849F, 1.0638F, 0.1717F, -0.1045F));

		PartDefinition cube_r361 = browHorn2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(124, 72).mirror().addBox(-0.5F, -1.2099F, -1.3643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1362F, -1.1327F, 0.2151F, 0.6452F, 0.0F, 0.0F));

		PartDefinition cube_r362 = browHorn2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(107, 117).mirror().addBox(-1.5F, -1.5099F, -0.9643F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1362F, -1.1327F, 0.2151F, 0.8197F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 2.9517F, -0.4895F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(110, 133).mirror().addBox(0.5858F, 2.9721F, -1.8587F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.5968F, -0.1397F, -0.2088F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(43, 131).mirror().addBox(0.3029F, 0.3258F, -1.3273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.7612F, -0.1912F, -0.2628F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(130, 22).mirror().addBox(0.1029F, 3.5165F, -1.7758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.4053F, -0.1752F, -0.2668F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(47, 126).mirror().addBox(0.1029F, 3.4706F, 0.28F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.9638F, -0.1752F, -0.2668F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(129, 73).mirror().addBox(0.1029F, 3.8289F, -0.4715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.5188F, -0.1752F, -0.2668F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(42, 126).mirror().addBox(0.4177F, 2.1367F, -1.1407F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.6861F, -0.1215F, -0.1973F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(73, 112).mirror().addBox(0.1361F, 0.1976F, -0.8359F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.6592F, -0.173F, -0.251F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(114, 118).mirror().addBox(0.1777F, 0.5052F, -0.9895F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.7447F, -0.1413F, -0.283F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(130, 110).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1338F, 1.6227F, 2.976F, -1.1555F, -0.0711F, -0.1836F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(130, 113).mirror().addBox(-0.255F, -3.265F, -0.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9164F, 3.8989F, 2.3606F, -0.4923F, -0.0711F, -0.1836F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(9, 119).mirror().addBox(-0.4172F, -0.0146F, -0.7256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 1.3989F, 2.6606F, -0.568F, -0.1898F, -0.2397F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(87, 118).mirror().addBox(0.1376F, -1.8372F, -1.0795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.2164F, 2.9989F, 1.8606F, -0.4882F, -0.0962F, -0.3381F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(131, 44).mirror().addBox(-0.7488F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9164F, 0.4989F, 0.9606F, -0.1392F, -0.0855F, -0.1974F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(92, 125).mirror().addBox(-0.2481F, -2.3896F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.2456F, 1.8399F, 1.306F, 0.5757F, 0.0608F, -0.2496F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(30, 126).mirror().addBox(-0.2481F, -2.2715F, 0.2872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2456F, 1.8399F, 1.306F, 0.9422F, 0.0608F, -0.2496F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(110, 133).addBox(-0.5858F, 2.9721F, -1.8587F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.5968F, 0.1397F, 0.2088F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(43, 131).addBox(-0.3029F, 0.3258F, -1.3273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.7612F, 0.1912F, 0.2628F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(130, 22).addBox(-1.1029F, 3.5165F, -1.7758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.4053F, 0.1752F, 0.2668F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(47, 126).addBox(-1.1029F, 3.4706F, 0.28F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.9638F, 0.1752F, 0.2668F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(129, 73).addBox(-1.1029F, 3.8289F, -0.4715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.5188F, 0.1752F, 0.2668F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(42, 126).addBox(-1.4177F, 2.1367F, -1.1407F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.6861F, 0.1215F, 0.1973F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(73, 112).addBox(-1.1361F, 0.1976F, -0.8359F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.6592F, 0.173F, 0.251F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(114, 118).addBox(-1.1777F, 0.5052F, -0.9895F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.7447F, 0.1413F, 0.283F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(130, 110).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9339F, 1.6227F, 2.976F, -1.1555F, 0.0711F, 0.1836F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(130, 113).addBox(-0.745F, -3.265F, -0.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7165F, 3.8989F, 2.3606F, -0.4923F, 0.0711F, 0.1836F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(9, 119).addBox(-0.5828F, -0.0146F, -0.7256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0165F, 1.3989F, 2.6606F, -0.568F, 0.1898F, 0.2397F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(87, 118).addBox(-1.1376F, -1.8372F, -1.0795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0165F, 2.9989F, 1.8606F, -0.4882F, 0.0962F, 0.3381F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(131, 44).addBox(-0.2512F, -0.3961F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7165F, 0.4989F, 0.9606F, -0.1392F, 0.0855F, 0.1974F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(92, 125).addBox(-0.752F, -2.3896F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0457F, 1.8399F, 1.306F, 0.5757F, -0.0608F, 0.2496F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(30, 126).addBox(-0.752F, -2.2715F, 0.2872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0457F, 1.8399F, 1.306F, 0.9422F, -0.0608F, 0.2496F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9033F, 7.6041F, -1.8655F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r393 = leftLowerbeak.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(9, 89).addBox(-1.0F, -1.0953F, -1.3971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.2741F, 0.0873F, 0.0F));

		PartDefinition cube_r394 = leftLowerbeak.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(126, 48).addBox(-1.0F, 0.8203F, -1.192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.3875F, 0.0873F, 0.0F));

		PartDefinition cube_r395 = leftLowerbeak.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(113, 129).addBox(-1.2527F, -0.1928F, -0.6981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, 0.3214F, -2.9682F, -2.4267F, 0.0857F, -0.0167F));

		PartDefinition cube_r396 = leftLowerbeak.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(121, 126).addBox(-1.2527F, -0.7521F, -1.467F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, 0.3214F, -2.9682F, -1.781F, 0.0857F, -0.0167F));

		PartDefinition cube_r397 = leftLowerbeak.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(58, 127).addBox(-1.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.8326F, 0.0873F, 0.0F));

		PartDefinition cube_r398 = leftLowerbeak.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(120, 85).addBox(-1.09F, -0.7301F, -0.9274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2967F, 7.6041F, -1.8655F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r399 = rightLowerbeak.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(9, 89).mirror().addBox(0.0F, -1.0953F, -1.3971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.2741F, -0.0873F, 0.0F));

		PartDefinition cube_r400 = rightLowerbeak.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(126, 48).mirror().addBox(0.0F, 0.8203F, -1.192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.3875F, -0.0873F, 0.0F));

		PartDefinition cube_r401 = rightLowerbeak.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(113, 129).mirror().addBox(0.2527F, -0.1928F, -0.6981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 0.3214F, -2.9682F, -2.4267F, -0.0857F, 0.0167F));

		PartDefinition cube_r402 = rightLowerbeak.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(121, 126).mirror().addBox(0.2527F, -0.7521F, -1.467F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, 0.3214F, -2.9682F, -1.781F, -0.0857F, 0.0167F));

		PartDefinition cube_r403 = rightLowerbeak.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(58, 127).mirror().addBox(0.0F, 0.7515F, 0.4517F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.8326F, -0.0873F, 0.0F));

		PartDefinition cube_r404 = rightLowerbeak.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(0.09F, -0.7301F, -0.9274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r405 = frill.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(15, 131).addBox(-0.5F, -2.6648F, -3.7544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(131, 5).addBox(-0.5F, -1.8648F, -2.9544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 130).addBox(-0.5F, -0.8648F, -2.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 113).addBox(-0.5F, -0.2648F, -1.4544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.1778F, 1.3348F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r406 = frill.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(111, 72).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.3234F, -0.0112F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r407 = frill.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(14, 102).addBox(-0.5F, -9.0793F, -1.129F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 100).addBox(-1.5F, -2.847F, -0.8392F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(66, 108).addBox(-1.0F, -9.547F, -0.8392F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1778F, 1.3348F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r408 = frill.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(57, 131).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5F, -13.0383F, 5.3669F, -0.4523F, -0.1369F, -0.2739F));

		PartDefinition cube_r409 = frill.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(131, 47).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -13.0383F, 5.3669F, -0.4523F, 0.1369F, 0.2739F));

		PartDefinition cube_r410 = frill.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(122, 31).addBox(-2.0627F, 0.002F, 0.0343F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8364F, -13.1904F, 5.5425F, -0.4126F, -0.3448F, -1.3611F));

		PartDefinition cube_r411 = frill.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(25, 122).addBox(0.0627F, 0.002F, 0.0343F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8364F, -13.1904F, 5.5425F, -0.4126F, 0.3448F, 1.3611F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8451F, -7.3786F, 4.0313F, -0.0975F, -0.0527F, 0.1038F));

		PartDefinition cube_r412 = leftFrill.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(109, 98).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2571F, 2.1991F, -1.5903F, -0.4438F, 0.0652F, 0.3584F));

		PartDefinition cube_r413 = leftFrill.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(89, 107).addBox(-1.3173F, -2.1246F, -0.5215F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4188F, 6.7661F, -1.6722F, 0.0676F, -0.112F, -1.3968F));

		PartDefinition cube_r414 = leftFrill.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(93, 76).addBox(-6.5637F, -1.51F, -0.2259F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3952F, 2.5126F, -0.4079F, -0.2466F, -0.3083F, -0.1685F));

		PartDefinition cube_r415 = leftFrill.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 123).addBox(-0.1133F, -0.1065F, -0.241F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.3952F, 2.5126F, -0.4079F, -0.3108F, 0.3453F, 1.7314F));

		PartDefinition cube_r416 = leftFrill.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 130).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.9879F, -0.1001F, 0.4463F, -0.3174F, 0.2352F, 1.2974F));

		PartDefinition cube_r417 = leftFrill.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(130, 85).addBox(0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(130, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.5163F, -2.278F, 1.0246F, -0.3214F, 0.2297F, 1.2804F));

		PartDefinition cube_r418 = leftFrill.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(112, 23).addBox(-2.0F, -0.9F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0591F, -0.9808F, 0.4878F, -0.3051F, 0.2512F, 1.3488F));

		PartDefinition cube_r419 = leftFrill.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(62, 131).addBox(-2.05F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.6149F, 2.6675F, -0.1392F, -0.3245F, 0.2182F, 1.4437F));

		PartDefinition cube_r420 = leftFrill.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(131, 41).addBox(0.9501F, -1.3521F, -0.4002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3952F, 2.5126F, -0.4079F, -0.1709F, 0.3902F, 2.3507F));

		PartDefinition cube_r421 = leftFrill.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(38, 131).addBox(0.1244F, -0.5544F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3952F, 2.5126F, -0.4079F, -0.2585F, 0.2939F, 1.7901F));

		PartDefinition cube_r422 = leftFrill.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(33, 131).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3694F, 2.242F, -0.104F, -0.2964F, 0.2556F, 1.5634F));

		PartDefinition cube_r423 = leftFrill.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(62, 123).addBox(-0.0687F, -0.3445F, -0.1186F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0541F, 0.5205F, -0.1611F, -0.3245F, 0.2182F, 1.4437F));

		PartDefinition cube_r424 = leftFrill.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(74, 130).addBox(2.012F, -0.389F, 0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 130).addBox(0.712F, -0.389F, 0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.5542F, -5.1795F, 0.9388F, -0.4838F, 0.0634F, 0.8008F));

		PartDefinition cube_r425 = leftFrill.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(118, 100).addBox(-0.0903F, 0.0177F, 0.0117F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5542F, -5.1795F, 0.9388F, -0.3976F, 0.0955F, 0.7873F));

		PartDefinition cube_r426 = leftFrill.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(97, 131).addBox(-0.7332F, -0.5918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.7795F, -5.218F, 1.3359F, -0.4549F, 0.0025F, 0.2994F));

		PartDefinition cube_r427 = leftFrill.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(82, 131).addBox(-0.2598F, -0.5712F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7795F, -5.218F, 1.3359F, -0.3664F, 0.2759F, 0.9117F));

		PartDefinition cube_r428 = leftFrill.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(131, 126).addBox(-0.7332F, -0.5918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.1795F, -5.618F, 1.3359F, -0.3603F, -0.0615F, -0.1529F));

		PartDefinition cube_r429 = leftFrill.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(102, 131).addBox(-0.2598F, -0.5712F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1795F, -5.618F, 1.3359F, -0.3254F, 0.169F, 0.4713F));

		PartDefinition cube_r430 = leftFrill.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(46, 122).addBox(0.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4542F, -5.8795F, 0.9388F, -0.3802F, 0.0047F, 0.3566F));

		PartDefinition cube_r431 = leftFrill.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(16, 123).addBox(-1.0F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(4.2396F, 0.8552F, -0.3406F, -0.0525F, -0.43F, -0.9387F));

		PartDefinition cube_r432 = leftFrill.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(106, 75).addBox(-1.7F, -1.5F, -0.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.898F, 2.112F, -1.2596F, -0.3953F, -0.1815F, 0.0985F));

		PartDefinition cube_r433 = leftFrill.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(66, 40).addBox(-3.0F, 0.2F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(3.7819F, -0.0621F, -0.2572F, 0.1193F, -0.3906F, -1.4938F));

		PartDefinition cube_r434 = leftFrill.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(116, 12).addBox(-4.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7971F, -1.1815F, -0.043F, 0.1264F, -0.2996F, -2.1305F));

		PartDefinition cube_r435 = leftFrill.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(95, 50).addBox(-5.1F, -1.7F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.113F, -3.5754F, 0.7059F, -0.0311F, -0.323F, -1.6264F));

		PartDefinition cube_r436 = leftFrill.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(109, 80).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5165F, -3.3995F, 0.6267F, -0.3234F, -0.0261F, -0.231F));

		PartDefinition cube_r437 = leftFrill.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(128, 118).addBox(1.0642F, -0.3081F, -0.0864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5615F, -5.5945F, 0.9846F, -0.3318F, 0.033F, -0.0114F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8451F, -7.3786F, 4.0313F, -0.0975F, 0.0527F, -0.1038F));

		PartDefinition cube_r438 = rightFrill.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(109, 98).mirror().addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2571F, 2.1991F, -1.5903F, -0.4438F, -0.0652F, -0.3584F));

		PartDefinition cube_r439 = rightFrill.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(89, 107).mirror().addBox(-2.6827F, -2.1246F, -0.5215F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4188F, 6.7661F, -1.6722F, 0.0676F, 0.112F, 1.3968F));

		PartDefinition cube_r440 = rightFrill.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(93, 76).mirror().addBox(1.5637F, -1.51F, -0.2259F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3952F, 2.5126F, -0.4079F, -0.2466F, 0.3083F, 0.1685F));

		PartDefinition cube_r441 = rightFrill.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(106, 123).mirror().addBox(-1.8867F, -0.1065F, -0.241F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3952F, 2.5126F, -0.4079F, -0.3108F, -0.3453F, -1.7314F));

		PartDefinition cube_r442 = rightFrill.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(92, 130).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.9879F, -0.1001F, 0.4463F, -0.3174F, -0.2352F, -1.2974F));

		PartDefinition cube_r443 = rightFrill.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(130, 85).mirror().addBox(-1.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(130, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.5163F, -2.278F, 1.0246F, -0.3214F, -0.2297F, -1.2804F));

		PartDefinition cube_r444 = rightFrill.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-2.0F, -0.9F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0591F, -0.9808F, 0.4878F, -0.3051F, -0.2512F, -1.3488F));

		PartDefinition cube_r445 = rightFrill.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(62, 131).mirror().addBox(1.05F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.6149F, 2.6675F, -0.1392F, -0.3245F, -0.2182F, -1.4437F));

		PartDefinition cube_r446 = rightFrill.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(131, 41).mirror().addBox(-1.9501F, -1.3521F, -0.4002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3952F, 2.5126F, -0.4079F, -0.1709F, -0.3902F, -2.3507F));

		PartDefinition cube_r447 = rightFrill.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(38, 131).mirror().addBox(-1.1244F, -0.5544F, -0.2773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3952F, 2.5126F, -0.4079F, -0.2585F, -0.2939F, -1.7901F));

		PartDefinition cube_r448 = rightFrill.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(33, 131).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3694F, 2.242F, -0.104F, -0.2964F, -0.2556F, -1.5634F));

		PartDefinition cube_r449 = rightFrill.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(62, 123).mirror().addBox(-1.9313F, -0.3445F, -0.1186F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0541F, 0.5205F, -0.1611F, -0.3245F, -0.2182F, -1.4437F));

		PartDefinition cube_r450 = rightFrill.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(74, 130).mirror().addBox(-3.012F, -0.389F, 0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(52, 130).mirror().addBox(-1.712F, -0.389F, 0.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5542F, -5.1795F, 0.9388F, -0.4838F, -0.0634F, -0.8008F));

		PartDefinition cube_r451 = rightFrill.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(118, 100).mirror().addBox(-2.9097F, 0.0177F, 0.0117F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5542F, -5.1795F, 0.9388F, -0.3976F, -0.0955F, -0.7873F));

		PartDefinition cube_r452 = rightFrill.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(97, 131).mirror().addBox(-0.2668F, -0.5918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.7795F, -5.218F, 1.3359F, -0.4549F, -0.0025F, -0.2994F));

		PartDefinition cube_r453 = rightFrill.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(82, 131).mirror().addBox(-0.7402F, -0.5712F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7795F, -5.218F, 1.3359F, -0.3664F, -0.2759F, -0.9117F));

		PartDefinition cube_r454 = rightFrill.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(131, 126).mirror().addBox(-0.2668F, -0.5918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.1795F, -5.618F, 1.3359F, -0.3603F, 0.0615F, 0.1529F));

		PartDefinition cube_r455 = rightFrill.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(102, 131).mirror().addBox(-0.7402F, -0.5712F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1795F, -5.618F, 1.3359F, -0.3254F, -0.169F, -0.4713F));

		PartDefinition cube_r456 = rightFrill.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(46, 122).mirror().addBox(-2.0786F, -0.0605F, -0.0207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4542F, -5.8795F, 0.9388F, -0.3802F, -0.0047F, -0.3566F));

		PartDefinition cube_r457 = rightFrill.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(16, 123).mirror().addBox(-1.0F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-4.2396F, 0.8552F, -0.3406F, -0.0525F, 0.43F, 0.9387F));

		PartDefinition cube_r458 = rightFrill.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(106, 75).mirror().addBox(-2.3F, -1.5F, -0.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.898F, 2.112F, -1.2596F, -0.3953F, 0.1815F, -0.0985F));

		PartDefinition cube_r459 = rightFrill.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-3.0F, 0.2F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-3.7819F, -0.0621F, -0.2572F, 0.1193F, 0.3906F, 1.4938F));

		PartDefinition cube_r460 = rightFrill.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(116, 12).mirror().addBox(1.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7971F, -1.1815F, -0.043F, 0.1264F, 0.2996F, 2.1305F));

		PartDefinition cube_r461 = rightFrill.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(0.1F, -1.7F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.113F, -3.5754F, 0.7059F, -0.0311F, 0.323F, 1.6264F));

		PartDefinition cube_r462 = rightFrill.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(109, 80).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5165F, -3.3995F, 0.6267F, -0.3234F, 0.0261F, 0.231F));

		PartDefinition cube_r463 = rightFrill.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(128, 118).mirror().addBox(-2.0642F, -0.3081F, -0.0864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5615F, -5.5945F, 0.9846F, -0.3318F, -0.033F, 0.0114F));

		return LayerDefinition.create(meshdefinition, 137, 140);
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