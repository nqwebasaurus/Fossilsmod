package fossils.fossils.client.blockentity.model.jinyunpelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JinyunpeltaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms12;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart body;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms11;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms10;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms9;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms15;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms13;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms14;
	private final ModelPart tail3;
	private final ModelPart osteoderms8;
	private final ModelPart leftClub;
	private final ModelPart rightClub;

	public JinyunpeltaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.osteoderms12 = this.hips.getChild("osteoderms12");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.body = this.hips.getChild("body");
		this.osteoderms4 = this.body.getChild("osteoderms4");
		this.osteoderms11 = this.body.getChild("osteoderms11");
		this.chest = this.body.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms10 = this.chest.getChild("osteoderms10");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.osteoderms9 = this.neck.getChild("osteoderms9");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms15 = this.neck2.getChild("osteoderms15");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms13 = this.tail.getChild("osteoderms13");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms14 = this.tail2.getChild("osteoderms14");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
		this.leftClub = this.osteoderms8.getChild("leftClub");
		this.rightClub = this.osteoderms8.getChild("rightClub");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -8.339F, 5.1542F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 19).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3681F, 2.7633F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 8).addBox(0.0F, -1.4978F, 1.9074F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 30).addBox(-0.5F, -0.0978F, 0.9074F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-1.3093F, 2.4708F, -2.0975F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.4974F, 0.0F, -0.5585F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-1.3093F, -0.3576F, -2.5162F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.6545F, 0.0F, -0.5585F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-1.2026F, 4.0197F, 0.6529F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.1745F, 0.0F, -0.5236F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 79).mirror().addBox(-0.6F, 1.228F, -1.4871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.7243F, 0.0F, -0.1571F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.2026F, 1.3981F, -0.1586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.3403F, 0.0F, -0.5236F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 46).mirror().addBox(-0.6F, -0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2407F, -0.3595F, 0.4661F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 19).mirror().addBox(-3.5F, -0.5F, -1.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4407F, -0.3595F, 0.6661F, -0.1304F, -0.0114F, -0.0865F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 40).mirror().addBox(-0.086F, 0.3424F, 0.0638F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.9698F, -0.7595F, 1.3127F, -0.3724F, 0.4554F, -0.4451F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-0.4249F, -0.1476F, -0.2245F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 40).mirror().addBox(0.5751F, -0.1476F, -0.2245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -0.7595F, 0.9127F, -0.335F, 0.1111F, -0.3135F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 32).mirror().addBox(-1.4772F, -0.1476F, -2.8179F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -0.7595F, 0.9127F, -0.0983F, 0.148F, -0.2753F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(0.2442F, -0.3783F, -4.6473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4698F, -0.7595F, -1.2873F, 0.1659F, 0.7413F, -0.1489F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(0.3698F, -0.1476F, -3.7055F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -0.7595F, 0.9127F, -0.0972F, 0.009F, -0.2616F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.1966F, -0.3783F, -2.4187F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4698F, -0.7595F, -1.2873F, 0.2397F, 1.0322F, -0.0547F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 33).mirror().addBox(0.1751F, 0.0497F, -4.9626F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4698F, -0.7595F, -0.5873F, 0.1263F, 0.2576F, -0.2292F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 33).addBox(-1.1751F, 0.0497F, -4.9626F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4698F, -0.7595F, -0.5873F, 0.1263F, -0.2576F, 0.2292F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 44).addBox(-1.8034F, -0.3783F, -2.4187F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4698F, -0.7595F, -1.2873F, 0.2397F, -1.0322F, 0.0547F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 32).addBox(-1.2442F, -0.3783F, -4.6473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.4698F, -0.7595F, -1.2873F, 0.1659F, -0.7413F, 0.1489F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 25).addBox(-1.3698F, -0.1476F, -3.7055F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5698F, -0.7595F, 0.9127F, -0.0972F, -0.009F, 0.2616F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 40).addBox(-1.5751F, -0.1476F, -0.2245F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 40).addBox(-1.5751F, -0.1476F, -0.2245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.5698F, -0.7595F, 0.9127F, -0.335F, -0.1111F, 0.3135F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(29, 40).addBox(-0.914F, 0.3424F, 0.0638F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.9698F, -0.7595F, 1.3127F, -0.3724F, -0.4554F, 0.4451F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 65).addBox(0.2026F, 4.0197F, 0.6529F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.1745F, 0.0F, 0.5236F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 79).addBox(-0.4F, 1.228F, -1.4871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.7243F, 0.0F, 0.1571F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 38).addBox(0.2026F, 1.3981F, -0.1586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.3403F, 0.0F, 0.5236F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 22).mirror().addBox(-5.5418F, -6.0402F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.507F, -0.9521F, -2.1542F, -0.0343F, -0.1533F, -1.4722F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.9521F, -2.1542F, -0.1298F, -0.0887F, -0.7185F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 25).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.9521F, -2.1542F, -0.1561F, 0.0177F, -0.0101F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 22).addBox(2.5418F, -6.0402F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.507F, -0.9521F, -2.1542F, -0.0343F, 0.1533F, 1.4722F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 33).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.9521F, -2.1542F, -0.1298F, 0.0887F, 0.7185F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 25).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.9521F, -2.1542F, -0.1561F, -0.0177F, 0.0101F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(21, 66).addBox(0.3093F, 2.4708F, -2.0975F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.4974F, 0.0F, 0.5585F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 77).addBox(0.3093F, -0.3576F, -2.5162F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.6545F, 0.0F, 0.5585F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 19).addBox(-0.5F, -0.5F, -1.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4407F, -0.3595F, 0.6661F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(8, 46).addBox(-0.4F, -0.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2407F, -0.3595F, 0.4661F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 32).addBox(-1.5228F, -0.1476F, -2.8179F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.5698F, -0.7595F, 0.9127F, -0.0983F, -0.148F, 0.2753F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.6838F, -0.785F, 2.1713F));

		PartDefinition cube_r37 = osteoderms5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 66).addBox(-0.2488F, -0.6816F, 1.1583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.3142F, -0.3701F, 0.2154F));

		PartDefinition cube_r38 = osteoderms5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(66, 55).addBox(-1.9559F, -0.6816F, 0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.3024F, 0.2555F, 0.0197F));

		PartDefinition cube_r39 = osteoderms5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 61).addBox(-0.0955F, -0.5522F, -1.4938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F))
				.texOffs(61, 33).addBox(0.6045F, -0.5522F, -1.6938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.3196F, 0.9309F, -0.1762F));

		PartDefinition cube_r40 = osteoderms5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 61).addBox(0.212F, -0.5522F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.1894F, 0.0814F, 0.0677F));

		PartDefinition cube_r41 = osteoderms5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 61).addBox(1.883F, -0.5522F, -0.8966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.4588F, 1.1333F, -0.3374F));

		PartDefinition cube_r42 = osteoderms5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(26, 77).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-4.0632F, -0.6913F, 0.853F, 0.893F, -0.1118F, -0.0047F));

		PartDefinition cube_r43 = osteoderms5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 25).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.0632F, -0.6913F, 0.853F, 0.4567F, -0.1118F, -0.0047F));

		PartDefinition cube_r44 = osteoderms5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 77).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.6632F, -0.9913F, -1.147F, 1.1007F, -0.0947F, 0.0085F));

		PartDefinition cube_r45 = osteoderms5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(77, 30).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.6632F, -0.9913F, -1.147F, 0.6644F, -0.0947F, 0.0085F));

		PartDefinition cube_r46 = osteoderms5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.3632F, -1.2913F, -3.147F, 1.1894F, 0.0614F, 0.0139F));

		PartDefinition cube_r47 = osteoderms5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.3632F, -1.2913F, -3.147F, 0.7531F, 0.0614F, 0.0139F));

		PartDefinition cube_r48 = osteoderms5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 71).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.4632F, 0.3087F, 0.853F, 1.004F, 0.0665F, 0.8111F));

		PartDefinition cube_r49 = osteoderms5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(12, 71).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4632F, 0.3087F, 0.853F, 0.5677F, 0.0665F, 0.8111F));

		PartDefinition cube_r50 = osteoderms5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(74, 48).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7632F, -0.1913F, -1.147F, 1.0641F, 0.0031F, 0.8132F));

		PartDefinition cube_r51 = osteoderms5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 65).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7632F, -0.1913F, -1.147F, 0.6277F, 0.0031F, 0.8132F));

		PartDefinition cube_r52 = osteoderms5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(74, 71).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3632F, -0.3913F, -3.147F, 1.1542F, -0.0918F, 0.8092F));

		PartDefinition cube_r53 = osteoderms5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(19, 72).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3632F, -0.3913F, -3.147F, 0.7179F, -0.0918F, 0.8092F));

		PartDefinition cube_r54 = osteoderms5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 65).addBox(-1.0684F, -0.6816F, -0.5732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1965F, 1.2584F, 0.0934F, -0.2993F, 0.2139F, 0.033F));

		PartDefinition osteoderms12 = hips.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(-5.6838F, -0.785F, 2.1713F));

		PartDefinition cube_r55 = osteoderms12.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 66).mirror().addBox(-0.7512F, -0.6816F, 1.1583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.3142F, 0.3701F, -0.2154F));

		PartDefinition cube_r56 = osteoderms12.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(0.9559F, -0.6816F, 0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.3024F, -0.2555F, -0.0197F));

		PartDefinition cube_r57 = osteoderms12.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.9045F, -0.5522F, -1.4938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(61, 33).mirror().addBox(-1.6045F, -0.5522F, -1.6938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.3196F, -0.9309F, 0.1762F));

		PartDefinition cube_r58 = osteoderms12.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(-1.212F, -0.5522F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.1894F, -0.0814F, -0.0677F));

		PartDefinition cube_r59 = osteoderms12.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(-2.883F, -0.5522F, -0.8966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.4588F, -1.1333F, 0.3374F));

		PartDefinition cube_r60 = osteoderms12.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(4.0632F, -0.6913F, 0.853F, 0.893F, 0.1118F, 0.0047F));

		PartDefinition cube_r61 = osteoderms12.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.0632F, -0.6913F, 0.853F, 0.4567F, 0.1118F, 0.0047F));

		PartDefinition cube_r62 = osteoderms12.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.6632F, -0.9913F, -1.147F, 1.1007F, 0.0947F, -0.0085F));

		PartDefinition cube_r63 = osteoderms12.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.6632F, -0.9913F, -1.147F, 0.6644F, 0.0947F, -0.0085F));

		PartDefinition cube_r64 = osteoderms12.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.3632F, -1.2913F, -3.147F, 1.1894F, -0.0614F, -0.0139F));

		PartDefinition cube_r65 = osteoderms12.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.3632F, -1.2913F, -3.147F, 0.7531F, -0.0614F, -0.0139F));

		PartDefinition cube_r66 = osteoderms12.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.4632F, 0.3087F, 0.853F, 1.004F, -0.0665F, -0.8111F));

		PartDefinition cube_r67 = osteoderms12.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(12, 71).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4632F, 0.3087F, 0.853F, 0.5677F, -0.0665F, -0.8111F));

		PartDefinition cube_r68 = osteoderms12.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.7632F, -0.1913F, -1.147F, 1.0641F, -0.0031F, -0.8132F));

		PartDefinition cube_r69 = osteoderms12.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7632F, -0.1913F, -1.147F, 0.6277F, -0.0031F, -0.8132F));

		PartDefinition cube_r70 = osteoderms12.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.3632F, -0.3913F, -3.147F, 1.1542F, 0.0918F, -0.8092F));

		PartDefinition cube_r71 = osteoderms12.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 72).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3632F, -0.3913F, -3.147F, 0.7179F, 0.0918F, -0.8092F));

		PartDefinition cube_r72 = osteoderms12.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 65).mirror().addBox(0.0684F, -0.6816F, -0.5732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 1.2584F, 0.0934F, -0.2993F, -0.2139F, -0.033F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, 4.6943F, -3.2481F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.2F, 1.1423F, 0.3664F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 71).addBox(-1.5F, -2.1695F, -2.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 82).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7206F, 4.9814F, 0.3579F, 0.6251F, 0.3522F, 1.5633F));

		PartDefinition cube_r74 = leftleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 73).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(2.7206F, 2.9814F, 0.3579F, 1.0615F, 0.3522F, 1.5633F));

		PartDefinition cube_r75 = leftleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7206F, 2.9814F, 0.3579F, 0.6251F, 0.3522F, 1.5633F));

		PartDefinition cube_r76 = leftleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 43).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(2.7206F, 0.9814F, -0.3421F, 1.0641F, 0.0031F, 1.5637F));

		PartDefinition cube_r77 = leftleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 57).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7206F, 0.9814F, -0.3421F, 0.6277F, 0.0031F, 1.5637F));

		PartDefinition cube_r78 = leftleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 45).addBox(0.0F, -4.1F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 3.0019F, -1.9153F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.5F, -2.9764F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 54).addBox(-0.6F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 57).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(46, 51).addBox(-1.601F, -1.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftleg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(55, 25).addBox(-1.602F, -0.5F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(37, 13).addBox(-2.499F, -0.5693F, -2.2197F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(56, 18).addBox(-1.5F, 4.6943F, -3.2481F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.2F, 1.1423F, 0.3664F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 81).addBox(0.5F, -2.1695F, -2.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 58).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.7206F, 4.9814F, 0.3579F, 0.6251F, -0.3522F, -1.5633F));

		PartDefinition cube_r84 = rightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 73).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.7206F, 2.9814F, 0.3579F, 1.0615F, -0.3522F, -1.5633F));

		PartDefinition cube_r85 = rightleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.7206F, 2.9814F, 0.3579F, 0.6251F, -0.3522F, -1.5633F));

		PartDefinition cube_r86 = rightleg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 73).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.7206F, 0.9814F, -0.3421F, 1.0641F, -0.0031F, -1.5637F));

		PartDefinition cube_r87 = rightleg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 33).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.7206F, 0.9814F, -0.3421F, 0.6277F, -0.0031F, -1.5637F));

		PartDefinition cube_r88 = rightleg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 19).addBox(-2.0F, -4.1F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 3.0019F, -1.9153F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.5F, -2.9764F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(41, 53).addBox(-0.4F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightleg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 55).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightleg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 0).addBox(-0.399F, -1.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightleg3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(53, 51).addBox(-1.398F, -0.5F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(34, 5).addBox(-1.501F, -0.5693F, -2.2197F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.55F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(37, 83).addBox(0.0F, -1.95F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 83).addBox(0.0F, -1.95F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.161F, -2.6542F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(31, 83).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.95F, -1.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -1.5F, -0.0189F, -0.0852F, -1.4216F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(61, 50).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -1.5F, -0.072F, -0.0494F, -0.6702F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(63, 4).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -1.5F, -0.0867F, 0.0099F, 0.0432F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(63, 17).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, 0.1134F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 13).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, -0.6021F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(20, 13).mirror().addBox(-8.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, -1.3526F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(20, 15).mirror().addBox(-8.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -5.5F, 0.0113F, 0.0511F, -1.3523F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -5.5F, 0.0432F, 0.0296F, -0.6015F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -5.5F, 0.052F, -0.0059F, 0.1133F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(63, 4).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -1.5F, -0.0867F, -0.0099F, -0.0432F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 50).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -1.5F, -0.072F, 0.0494F, 0.6702F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(44, 23).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -1.5F, -0.0189F, 0.0852F, 1.4216F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(63, 17).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, -0.1134F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(63, 13).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, 0.6021F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 13).addBox(2.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -3.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 6).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -5.5F, 0.052F, 0.0059F, -0.1133F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 37).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -5.5F, 0.0432F, -0.0296F, 0.6015F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 15).addBox(2.5418F, -5.0402F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -5.5F, 0.0113F, -0.0511F, 1.3523F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(6.05F, 0.25F, -2.5F));

		PartDefinition cube_r112 = osteoderms4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(72, 28).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6706F, 2.7347F, 3.1785F, 0.823F, 0.0603F, 1.5889F));

		PartDefinition cube_r113 = osteoderms4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(12, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6706F, 2.7347F, 3.1785F, 1.2594F, 0.0603F, 1.5889F));

		PartDefinition cube_r114 = osteoderms4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(48, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.0706F, 2.7347F, 1.1785F, 1.3118F, 0.0592F, 1.5921F));

		PartDefinition cube_r115 = osteoderms4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(73, 6).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0706F, 2.7347F, 1.1785F, 0.8755F, 0.0592F, 1.5921F));

		PartDefinition cube_r116 = osteoderms4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(75, 21).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, 2.1785F, 1.1542F, -0.0918F, 0.8092F));

		PartDefinition cube_r117 = osteoderms4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(72, 52).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, 2.1785F, 0.7179F, -0.0918F, 0.8092F));

		PartDefinition cube_r118 = osteoderms4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, 0.1785F, 1.1542F, -0.0918F, 0.8092F));

		PartDefinition cube_r119 = osteoderms4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, 0.1785F, 0.7179F, -0.0918F, 0.8092F));

		PartDefinition cube_r120 = osteoderms4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.7294F, -1.5653F, 2.1785F, 1.1894F, 0.0614F, 0.0139F));

		PartDefinition cube_r121 = osteoderms4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 63).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.7294F, -1.5653F, 2.1785F, 0.7531F, 0.0614F, 0.0139F));

		PartDefinition cube_r122 = osteoderms4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 67).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.7294F, -1.8653F, 0.1785F, 1.3118F, 0.0592F, 0.0213F));

		PartDefinition cube_r123 = osteoderms4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(76, 39).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.7294F, -1.8653F, 0.1785F, 0.8755F, 0.0592F, 0.0213F));

		PartDefinition cube_r124 = osteoderms4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.7294F, -1.8653F, -1.8215F, 1.3118F, 0.0592F, 0.0213F));

		PartDefinition cube_r125 = osteoderms4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 59).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.7294F, -1.8653F, -1.8215F, 0.8755F, 0.0592F, 0.0213F));

		PartDefinition cube_r126 = osteoderms4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(38, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, -1.8215F, 1.3118F, 0.0592F, 0.8067F));

		PartDefinition cube_r127 = osteoderms4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 2).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7294F, -0.2653F, -1.8215F, 0.8755F, 0.0592F, 0.8067F));

		PartDefinition cube_r128 = osteoderms4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.3706F, 2.7347F, -0.8215F, 1.3118F, 0.0592F, 1.5921F));

		PartDefinition cube_r129 = osteoderms4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(7, 73).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3706F, 2.7347F, -0.8215F, 0.8755F, 0.0592F, 1.5921F));

		PartDefinition osteoderms11 = body.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offset(-6.05F, 0.25F, -2.5F));

		PartDefinition cube_r130 = osteoderms11.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6706F, 2.7347F, 3.1785F, 0.823F, -0.0603F, -1.5889F));

		PartDefinition cube_r131 = osteoderms11.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(12, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.6706F, 2.7347F, 3.1785F, 1.2594F, -0.0603F, -1.5889F));

		PartDefinition cube_r132 = osteoderms11.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(48, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.0706F, 2.7347F, 1.1785F, 1.3118F, -0.0592F, -1.5921F));

		PartDefinition cube_r133 = osteoderms11.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0706F, 2.7347F, 1.1785F, 0.8755F, -0.0592F, -1.5921F));

		PartDefinition cube_r134 = osteoderms11.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, 2.1785F, 1.1542F, 0.0918F, -0.8092F));

		PartDefinition cube_r135 = osteoderms11.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, 2.1785F, 0.7179F, 0.0918F, -0.8092F));

		PartDefinition cube_r136 = osteoderms11.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, 0.1785F, 1.1542F, 0.0918F, -0.8092F));

		PartDefinition cube_r137 = osteoderms11.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, 0.1785F, 0.7179F, 0.0918F, -0.8092F));

		PartDefinition cube_r138 = osteoderms11.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.5653F, 2.1785F, 1.1894F, -0.0614F, -0.0139F));

		PartDefinition cube_r139 = osteoderms11.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(76, 63).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.5653F, 2.1785F, 0.7531F, -0.0614F, -0.0139F));

		PartDefinition cube_r140 = osteoderms11.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(76, 67).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.8653F, 0.1785F, 1.3118F, -0.0592F, -0.0213F));

		PartDefinition cube_r141 = osteoderms11.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.8653F, 0.1785F, 0.8755F, -0.0592F, -0.0213F));

		PartDefinition cube_r142 = osteoderms11.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.8653F, -1.8215F, 1.3118F, -0.0592F, -0.0213F));

		PartDefinition cube_r143 = osteoderms11.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.7294F, -1.8653F, -1.8215F, 0.8755F, -0.0592F, -0.0213F));

		PartDefinition cube_r144 = osteoderms11.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, -1.8215F, 1.3118F, -0.0592F, -0.8067F));

		PartDefinition cube_r145 = osteoderms11.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7294F, -0.2653F, -1.8215F, 0.8755F, -0.0592F, -0.8067F));

		PartDefinition cube_r146 = osteoderms11.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.3706F, 2.7347F, -0.8215F, 1.3118F, -0.0592F, -1.5921F));

		PartDefinition cube_r147 = osteoderms11.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3706F, 2.7347F, -0.8215F, 0.8755F, -0.0592F, -1.5921F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.229F, -5.9756F, 0.2096F, 0.0433F, 0.0053F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2201F, 0.0574F, -0.0807F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4354F, 6.7324F, -4.5382F, -0.4467F, -0.6882F, 0.5083F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 25).mirror().addBox(-0.6629F, 0.094F, -1.4047F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1354F, 6.8324F, -3.6382F, -0.5148F, -0.8921F, 0.6517F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.1432F, -0.1056F, -1.7683F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1354F, 6.8324F, -3.6382F, -0.7033F, -1.0302F, 0.8399F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-1.5402F, 0.4719F, -2.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 0).mirror().addBox(-1.5402F, 0.4719F, -1.5635F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3293F, 2.8795F, -4.2069F, 0.0336F, -0.6333F, -0.7819F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-0.9707F, -1.0739F, -1.4357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3293F, 2.8795F, -4.2069F, 1.375F, -0.3141F, 0.0359F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(-0.8043F, -1.2524F, -1.8474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3293F, 2.8795F, -4.2069F, 0.6769F, -0.2268F, 0.0356F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-0.9322F, -1.6967F, 0.3568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3293F, 2.8795F, -4.2069F, 0.1551F, -0.0965F, 0.0916F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 0).addBox(-0.7799F, 0.0574F, -0.0807F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4354F, 6.7324F, -4.5382F, -0.4467F, 0.6882F, -0.5083F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 25).addBox(-0.3371F, 0.094F, -1.4047F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1354F, 6.8324F, -3.6382F, -0.5148F, 0.8921F, -0.6517F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 38).addBox(0.1432F, -0.1056F, -1.7683F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1354F, 6.8324F, -3.6382F, -0.7033F, 1.0302F, -0.8399F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(34, 0).addBox(-5.1354F, -0.2789F, -2.3723F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1354F, 6.8324F, -3.6382F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(20, 83).addBox(0.0F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 40).addBox(0.0F, -1.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2183F, -4.7956F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(14, 79).addBox(0.5402F, 0.4719F, -2.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(0.5402F, 0.4719F, -1.5635F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3293F, 2.8795F, -4.2069F, 0.0336F, 0.6333F, 0.7819F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(45, 65).addBox(-0.0293F, -1.0739F, -1.4357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3293F, 2.8795F, -4.2069F, 1.375F, 0.3141F, -0.0359F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.4378F, -1.2244F, -0.0038F, -0.017F, -1.3526F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.4378F, -1.2244F, -0.0144F, -0.0099F, -0.6021F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.4378F, -1.2244F, -0.0173F, 0.002F, 0.1134F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 15).mirror().addBox(-6.411F, -4.0488F, -0.5061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6378F, -3.2244F, 0.0151F, 0.0682F, -1.2998F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-4.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6378F, -3.2244F, 0.0576F, 0.0395F, -0.5486F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-2.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6378F, -3.2244F, 0.0694F, -0.0079F, 0.1655F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-4.7378F, -1.1259F, -0.6095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6378F, -5.2244F, 0.2468F, 0.1664F, -0.8258F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-2.0405F, 0.2926F, -0.6095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.6378F, -5.2244F, 0.2949F, -0.0331F, -0.1358F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(15, 61).addBox(0.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6378F, -3.2244F, 0.0694F, 0.0079F, -0.1655F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(55, 15).addBox(2.411F, -4.0488F, -0.5061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6378F, -3.2244F, 0.0151F, -0.0682F, 1.2998F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(68, 21).addBox(1.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6378F, -3.2244F, 0.0576F, -0.0395F, 0.5486F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(44, 37).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.4378F, -1.2244F, -0.0038F, 0.017F, 1.3526F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 52).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.4378F, -1.2244F, -0.0144F, 0.0099F, 0.6021F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 19).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.4378F, -1.2244F, -0.0173F, -0.002F, -0.1134F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(49, 27).addBox(-0.1957F, -1.2524F, -1.8474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3293F, 2.8795F, -4.2069F, 0.6769F, 0.2268F, -0.0356F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(23, 50).addBox(-0.0678F, -1.6967F, 0.3568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3293F, 2.8795F, -4.2069F, 0.1551F, 0.0965F, -0.0916F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(66, 15).addBox(1.7378F, -1.1259F, -0.6095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6378F, -5.2244F, 0.2468F, -0.1664F, 0.8258F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(56, 9).addBox(0.0405F, 0.2926F, -0.6095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.6378F, -5.2244F, 0.2949F, 0.0331F, 0.1358F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(84, 4).addBox(1.0F, -0.7611F, 0.0073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 84).addBox(1.0F, -1.0611F, 2.0073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 50).addBox(0.5F, -0.0611F, 0.0073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.929F, -7.7244F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(4.9F, 0.9346F, -6.1149F));

		PartDefinition cube_r181 = osteoderms3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 35).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3206F, -0.6209F, 5.5691F, 1.3234F, -0.2378F, 1.1957F));

		PartDefinition cube_r182 = osteoderms3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 73).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3206F, -0.6209F, 5.5691F, 0.887F, -0.2378F, 1.1957F));

		PartDefinition cube_r183 = osteoderms3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(69, 46).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1794F, -0.3209F, 3.3691F, 1.3234F, -0.2378F, 1.1957F));

		PartDefinition cube_r184 = osteoderms3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1794F, -0.3209F, 3.3691F, 0.887F, -0.2378F, 1.1957F));

		PartDefinition cube_r185 = osteoderms3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 75).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.9206F, 2.2791F, 5.7691F, 1.3118F, 0.0592F, 1.5921F));

		PartDefinition cube_r186 = osteoderms3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 10).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9206F, 2.2791F, 5.7691F, 0.8755F, 0.0592F, 1.5921F));

		PartDefinition cube_r187 = osteoderms3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(19, 76).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.7206F, 2.1791F, 3.7691F, 1.3954F, 0.0409F, 1.5714F));

		PartDefinition cube_r188 = osteoderms3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 15).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7206F, 2.1791F, 3.7691F, 0.9591F, 0.0409F, 1.5714F));

		PartDefinition cube_r189 = osteoderms3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(43, 69).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7206F, 2.0791F, 1.4691F, 1.5777F, 0.0972F, 1.5261F));

		PartDefinition cube_r190 = osteoderms3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(68, 8).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7206F, 2.0791F, 1.4691F, 1.1414F, 0.0972F, 1.5261F));

		PartDefinition cube_r191 = osteoderms3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6794F, 0.6791F, 0.9691F, 1.7398F, -0.047F, 1.0118F));

		PartDefinition cube_r192 = osteoderms3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6794F, 0.6791F, 0.9691F, 1.3035F, -0.047F, 1.0118F));

		PartDefinition cube_r193 = osteoderms3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(26, 69).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3794F, -1.1209F, 1.2691F, 1.3028F, 0.0086F, 0.1959F));

		PartDefinition cube_r194 = osteoderms3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 69).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.3794F, -1.1209F, 1.2691F, 1.7392F, 0.0086F, 0.1959F));

		PartDefinition cube_r195 = osteoderms3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(7, 69).addBox(-0.4935F, 0.0436F, -0.4999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.35F, -1.8706F, 5.2124F, 1.3908F, -0.0145F, 0.1969F));

		PartDefinition cube_r196 = osteoderms3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(61, 0).addBox(-0.4935F, -0.5578F, -0.4186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.35F, -1.8706F, 5.2124F, 0.9545F, -0.0145F, 0.1969F));

		PartDefinition cube_r197 = osteoderms3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(69, 41).addBox(-0.4852F, -0.2152F, -1.8721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.15F, -2.8706F, 3.7124F, 1.3908F, -0.0145F, 0.1969F));

		PartDefinition cube_r198 = osteoderms3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(61, 9).addBox(-0.4852F, -0.2123F, -1.7716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.15F, -2.8706F, 3.7124F, 0.9545F, -0.0145F, 0.1969F));

		PartDefinition osteoderms10 = chest.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offset(-4.9F, 0.9346F, -6.1149F));

		PartDefinition cube_r199 = osteoderms10.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3206F, -0.6209F, 5.5691F, 1.3234F, 0.2378F, -1.1957F));

		PartDefinition cube_r200 = osteoderms10.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3206F, -0.6209F, 5.5691F, 0.887F, 0.2378F, -1.1957F));

		PartDefinition cube_r201 = osteoderms10.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1794F, -0.3209F, 3.3691F, 1.3234F, 0.2378F, -1.1957F));

		PartDefinition cube_r202 = osteoderms10.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1794F, -0.3209F, 3.3691F, 0.887F, 0.2378F, -1.1957F));

		PartDefinition cube_r203 = osteoderms10.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 75).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.9206F, 2.2791F, 5.7691F, 1.3118F, -0.0592F, -1.5921F));

		PartDefinition cube_r204 = osteoderms10.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9206F, 2.2791F, 5.7691F, 0.8755F, -0.0592F, -1.5921F));

		PartDefinition cube_r205 = osteoderms10.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(19, 76).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.7206F, 2.1791F, 3.7691F, 1.3954F, -0.0409F, -1.5714F));

		PartDefinition cube_r206 = osteoderms10.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(73, 15).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7206F, 2.1791F, 3.7691F, 0.9591F, -0.0409F, -1.5714F));

		PartDefinition cube_r207 = osteoderms10.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.7206F, 2.0791F, 1.4691F, 1.5777F, -0.0972F, -1.5261F));

		PartDefinition cube_r208 = osteoderms10.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7206F, 2.0791F, 1.4691F, 1.1414F, -0.0972F, -1.5261F));

		PartDefinition cube_r209 = osteoderms10.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6794F, 0.6791F, 0.9691F, 1.7398F, 0.047F, -1.0118F));

		PartDefinition cube_r210 = osteoderms10.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6794F, 0.6791F, 0.9691F, 1.3035F, 0.047F, -1.0118F));

		PartDefinition cube_r211 = osteoderms10.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3794F, -1.1209F, 1.2691F, 1.3028F, -0.0086F, -0.1959F));

		PartDefinition cube_r212 = osteoderms10.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.3794F, -1.1209F, 1.2691F, 1.7392F, -0.0086F, -0.1959F));

		PartDefinition cube_r213 = osteoderms10.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.5065F, 0.0436F, -0.4999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.35F, -1.8706F, 5.2124F, 1.3908F, 0.0145F, -0.1969F));

		PartDefinition cube_r214 = osteoderms10.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.5065F, -0.5578F, -0.4186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.35F, -1.8706F, 5.2124F, 0.9545F, 0.0145F, -0.1969F));

		PartDefinition cube_r215 = osteoderms10.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-0.5148F, -0.2152F, -1.8721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.15F, -2.8706F, 3.7124F, 1.3908F, 0.0145F, -0.1969F));

		PartDefinition cube_r216 = osteoderms10.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(-0.5148F, -0.2123F, -1.7716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.15F, -2.8706F, 3.7124F, 0.9545F, 0.0145F, -0.1969F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 4.4941F, -4.6684F, 0.3971F, 0.0338F, -0.0021F));

		PartDefinition cube_r217 = leftarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 78).addBox(-0.2906F, -2.8552F, -0.8092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0016F, 2.3149F, 0.9277F, 0.9908F, -1.0706F, -0.8438F));

		PartDefinition cube_r218 = leftarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 81).addBox(-0.2906F, -1.0857F, -0.1436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0016F, 2.3149F, 0.9277F, 1.6715F, -1.0706F, -0.8438F));

		PartDefinition cube_r219 = leftarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(33, 65).addBox(0.0F, -3.6481F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 2.6425F, 1.9228F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(15, 53).addBox(-1.0F, -1.1F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2329F, 5.0828F, 2.8173F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 24).addBox(-0.5F, -0.1695F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8877F, 4.0815F, 2.6361F, 0.9048F, 0.3465F, 1.6768F));

		PartDefinition cube_r222 = leftarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(50, 70).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8877F, 2.0815F, 1.6361F, 0.9048F, 0.3465F, 1.6768F));

		PartDefinition cube_r223 = leftarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 61).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.8877F, 2.0815F, 1.6361F, 1.3412F, 0.3465F, 1.6768F));

		PartDefinition cube_r224 = leftarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(7, 25).addBox(0.0F, 2.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 1.3425F, 0.1228F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2329F, 5.0076F, 2.9787F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(23, 59).addBox(-0.601F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 59).addBox(0.499F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(39, 25).addBox(-1.499F, -0.4895F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 4.4941F, -4.6684F, 0.0917F, -0.0338F, 0.0021F));

		PartDefinition cube_r226 = rightarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(30, 32).addBox(-0.7094F, -2.8552F, -0.8092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0016F, 2.3149F, 0.9277F, 0.9908F, 1.0706F, 0.8438F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(19, 80).addBox(-0.7094F, -1.0857F, -0.1436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0016F, 2.3149F, 0.9277F, 1.6715F, 1.0706F, 0.8438F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -3.6481F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 2.6425F, 1.9228F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(52, 44).addBox(-1.0F, -1.1F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2329F, 5.0828F, 2.8173F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 21).addBox(-0.5F, -0.1695F, -1.0508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8877F, 4.0815F, 2.6361F, 0.9048F, -0.3465F, -1.6768F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 69).addBox(-0.5F, -0.6695F, -1.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8877F, 2.0815F, 1.6361F, 0.9048F, -0.3465F, -1.6768F));

		PartDefinition cube_r232 = rightarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(71, 37).addBox(-0.5F, -0.3249F, -1.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.8877F, 2.0815F, 1.6361F, 1.3412F, -0.3465F, -1.6768F));

		PartDefinition cube_r233 = rightarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(7, 19).addBox(-1.0F, 2.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 1.3425F, 0.1228F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2329F, 5.0076F, 2.9787F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(46, 58).addBox(-0.399F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 59).addBox(-1.499F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(20, 38).addBox(-1.501F, -0.4895F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, 1.2654F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4324F, -7.4065F, 0.2366F, 0.1436F, 0.1062F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -1.4F, 3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0773F, -4.6661F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(54, 11).addBox(-1.1F, -1.0565F, -0.0354F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 3.0686F, -3.0334F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(49, 15).addBox(0.5F, -1.1F, 1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0773F, -4.6661F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6213F, 1.1779F, -1.0912F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r238 = osteoderms2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(48, 39).addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.85F, 0.0F, 0.48F, 0.0F, 1.8675F));

		PartDefinition cube_r239 = osteoderms2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(79, 75).addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.85F, 0.0F, -0.3927F, 0.0F, 1.8675F));

		PartDefinition cube_r240 = osteoderms2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.85F, 0.0F, -0.5236F, 0.0F, 1.8675F));

		PartDefinition cube_r241 = osteoderms2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(26, 65).addBox(0.0F, -1.8075F, 2.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.7213F, -3.2474F, -2.4877F, -0.5236F, 0.0F, 0.2182F));

		PartDefinition cube_r242 = osteoderms2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 59).addBox(0.0F, -0.7F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7793F, -2.9857F, 0.5915F, 0.5672F, 0.0F, 0.2182F));

		PartDefinition osteoderms9 = neck.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6213F, 1.1779F, -1.0912F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r243 = osteoderms9.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.85F, 0.0F, 0.48F, 0.0F, -1.8675F));

		PartDefinition cube_r244 = osteoderms9.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.85F, 0.0F, -0.3927F, 0.0F, -1.8675F));

		PartDefinition cube_r245 = osteoderms9.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.85F, 0.0F, -0.5236F, 0.0F, -1.8675F));

		PartDefinition cube_r246 = osteoderms9.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(26, 65).mirror().addBox(-1.0F, -1.8075F, 2.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.7213F, -3.2474F, -2.4877F, -0.5236F, 0.0F, -0.2182F));

		PartDefinition cube_r247 = osteoderms9.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-1.0F, -0.7F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7793F, -2.9857F, 0.5915F, 0.5672F, 0.0F, -0.2182F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4774F, -2.6205F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, -1.5F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(0.0F, -1.0F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, -1.0456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(17, 48).addBox(-1.1F, -2.0914F, -0.0357F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0015F)), PartPose.offsetAndRotation(0.1F, 3.546F, -2.413F, -0.0175F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.8319F, -0.5879F));

		PartDefinition cube_r250 = osteoderms.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(60, 79).addBox(-1.0F, -0.3075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.0205F, -0.3239F, 0.0294F, -0.1924F, -0.017F, 1.6203F));

		PartDefinition cube_r251 = osteoderms.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(58, 82).addBox(-1.0F, -1.1384F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0205F, -0.3239F, 0.0294F, 1.6838F, -0.017F, 1.6203F));

		PartDefinition cube_r252 = osteoderms.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 38).addBox(-1.0F, -0.9384F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, 0.8727F, 0.0F, 0.2182F));

		PartDefinition cube_r253 = osteoderms.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(27, 81).addBox(-1.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, 0.4363F, 0.0F, 0.2182F));

		PartDefinition cube_r254 = osteoderms.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 34).addBox(-1.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, -0.5236F, 0.0F, 0.2182F));

		PartDefinition osteoderms15 = neck2.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.8319F, -0.5879F));

		PartDefinition cube_r255 = osteoderms15.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(0.0F, -0.3075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0205F, -0.3239F, 0.0294F, -0.1924F, 0.017F, -1.6203F));

		PartDefinition cube_r256 = osteoderms15.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(0.0F, -1.1384F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0205F, -0.3239F, 0.0294F, 1.6838F, 0.017F, -1.6203F));

		PartDefinition cube_r257 = osteoderms15.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(0.0F, -0.9384F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, 0.8727F, 0.0F, -0.2182F));

		PartDefinition cube_r258 = osteoderms15.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(0.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, 0.4363F, 0.0F, -0.2182F));

		PartDefinition cube_r259 = osteoderms15.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(0.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, -0.5236F, 0.0F, -0.2182F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0003F, -1.9904F, -0.1507F, 0.1637F, -0.2429F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(31, 57).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.8333F, -2.6604F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.147F, -4.9319F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-0.1F, 0.4646F, -0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7714F, -5.5084F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.1F, -1.0385F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.8714F, -4.2084F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(82, 29).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7998F, 0.676F, -3.8931F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(40, 18).mirror().addBox(-0.1291F, -0.0736F, -2.7887F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4873F, -0.1051F, -2.6706F, 0.1902F, -0.4005F, -0.0154F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(17, 43).mirror().addBox(-0.0291F, -0.7736F, -2.7887F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.1051F, -2.6706F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(79, 5).mirror().addBox(-0.605F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 8).mirror().addBox(-0.6F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.024F, -1.5978F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-0.5F, -1.1F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4663F, 0.624F, -0.8424F, 0.3815F, 0.0921F, -1.892F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(0.0F, -1.1F, -2.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5478F, -0.9008F, -0.4177F, 0.3743F, 0.3136F, -1.2496F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5F, -1.1F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4663F, 0.624F, -0.8424F, 0.3815F, -0.0921F, 1.892F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(46, 45).addBox(-1.0F, -1.1F, -2.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5478F, -0.9008F, -0.4177F, 0.3743F, -0.3136F, 1.2496F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(55, 5).addBox(-2.2F, -2.881F, -0.0312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -0.7406F, -3.424F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(24, 55).addBox(-1.7F, -1.881F, -0.1312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -0.7406F, -3.424F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(14, 67).addBox(-1.2F, -1.9193F, -0.1113F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -0.0406F, -5.124F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(78, 0).addBox(-1.7F, -0.0787F, -0.1261F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, -0.1406F, -5.024F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(66, 31).addBox(-1.3F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0101F, 0.076F, -0.6879F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(38, 79).addBox(-0.3F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8231F, 0.176F, -2.1689F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 29).mirror().addBox(-0.4F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2948F, 0.676F, -5.2026F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 29).addBox(-0.6F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2948F, 0.676F, -5.2026F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 29).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7998F, 0.676F, -3.8931F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(79, 5).addBox(-0.395F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 8).addBox(-1.4F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.075F, -0.024F, -1.5978F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3213F, -0.9719F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(79, 9).addBox(-1.0F, 0.7771F, -0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.1406F, -5.024F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(79, 18).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0025F)), PartPose.offsetAndRotation(0.2F, 1.147F, -4.9319F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 13).addBox(-0.9F, 0.4646F, -0.014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.9F, 0.7714F, -5.5084F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(79, 47).addBox(-0.9F, -1.0385F, -0.0835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9F, 1.8714F, -4.2084F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 18).addBox(-1.8709F, -0.0736F, -2.7887F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4873F, -0.1051F, -2.6706F, 0.1902F, 0.4005F, 0.0154F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(17, 43).addBox(-1.9709F, -0.7736F, -2.7887F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.1051F, -2.6706F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(26, 46).addBox(-3.0F, -0.75F, 1.95F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.7629F, -3.7173F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0117F, -0.1904F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-1.0F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 20).addBox(-0.2F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 1.4446F, -3.4656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(29, 50).mirror().addBox(-1.0F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(29, 50).addBox(-0.2F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 1.4446F, -3.8656F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(8, 40).mirror().addBox(-0.036F, -0.5896F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.1605F, -2.1978F, 0.283F, -0.2425F, -0.0304F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(12, 52).mirror().addBox(-0.036F, -0.7805F, -0.8959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.1605F, -2.1978F, 0.4575F, -0.2425F, -0.0304F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-0.036F, -0.8713F, -1.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.1605F, -2.1978F, 0.5709F, -0.2425F, -0.0304F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 79).mirror().addBox(-2.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(72, 79).addBox(-0.2F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6F, 0.5399F, -0.611F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-2.0F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(38, 67).addBox(-0.2F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 1.5399F, -0.611F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(6, 52).mirror().addBox(-2.0F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 52).addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8387F, -0.5848F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(49, 32).addBox(-0.964F, -0.8713F, -1.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.2F, 1.1605F, -2.1978F, 0.5709F, 0.2425F, 0.0304F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 49).addBox(-0.6F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 1.8972F, -1.6442F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(12, 52).addBox(-0.964F, -0.7805F, -0.8959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 1.1605F, -2.1978F, 0.4575F, 0.2425F, 0.0304F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(8, 40).addBox(-0.964F, -0.5896F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.3F, 1.1605F, -2.1978F, 0.283F, 0.2425F, 0.0304F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4585F, 3.0952F, -0.1656F, -0.2182F, -0.0019F));

		PartDefinition cube_r302 = tail.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(82, 83).addBox(0.5F, -1.1025F, 6.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(0.5F, -1.3025F, 4.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 84).addBox(0.5F, -1.3025F, 2.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(0.5F, -1.5025F, 0.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 19).addBox(0.0F, -0.3025F, -0.0872F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1016F, 0.0506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r303 = tail.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 0.2F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(0.0F, -0.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 80).addBox(0.0F, -1.3F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 79).addBox(0.0F, -1.8F, 0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6635F, 0.8173F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r304 = tail.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3995F, 5.2549F, -0.2383F, -0.0544F, -0.2204F));

		PartDefinition cube_r305 = tail.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9157F, 3.3143F, -0.2421F, -0.0337F, -0.1355F));

		PartDefinition cube_r306 = tail.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(33, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4318F, 1.3737F, -0.2408F, -0.042F, -0.1694F));

		PartDefinition cube_r307 = tail.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(74, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3995F, 5.2549F, -0.2383F, 0.0544F, 0.2204F));

		PartDefinition cube_r308 = tail.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9157F, 3.3143F, -0.2421F, 0.0337F, 0.1355F));

		PartDefinition cube_r309 = tail.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(33, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4318F, 1.3737F, -0.2408F, 0.042F, 0.1694F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5526F, 1.929F));

		PartDefinition cube_r310 = osteoderms6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(68, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r311 = osteoderms6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(40, 63).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.4182F, -0.5427F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r312 = osteoderms6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(64, 39).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.4182F, 0.8573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r313 = osteoderms6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(73, 82).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.5F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r314 = osteoderms6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(64, 44).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 3.0182F, 1.4573F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r315 = osteoderms6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(3, 61).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 3.0182F, 2.8573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r316 = osteoderms6.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.1F, 0.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r317 = osteoderms6.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 82).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.5F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r318 = osteoderms6.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(58, 29).addBox(-0.5272F, -1.2277F, -1.6477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 3.6182F, 5.2573F, -0.3031F, 0.6736F, -0.2027F));

		PartDefinition cube_r319 = osteoderms6.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(61, 57).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 3.6182F, 5.4573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r320 = osteoderms6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(82, 81).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.5F, 2.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition osteoderms13 = tail.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5526F, 1.929F));

		PartDefinition cube_r321 = osteoderms13.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r322 = osteoderms13.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4182F, -0.5427F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r323 = osteoderms13.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4182F, 0.8573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r324 = osteoderms13.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(73, 82).mirror().addBox(-0.5F, -0.5F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.5F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r325 = osteoderms13.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.0182F, 1.4573F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r326 = osteoderms13.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(3, 61).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.0182F, 2.8573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r327 = osteoderms13.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-0.5F, -0.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.1F, 0.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r328 = osteoderms13.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1F, 0.5F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r329 = osteoderms13.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(58, 29).mirror().addBox(-0.4728F, -1.2277F, -1.6477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 3.6182F, 5.2573F, -0.3031F, -0.6736F, 0.2027F));

		PartDefinition cube_r330 = osteoderms13.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(61, 57).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 3.6182F, 5.4573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r331 = osteoderms13.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.5F, 2.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.247F, 8.5411F, -0.1003F, -0.2948F, 0.1283F));

		PartDefinition cube_r332 = tail2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(84, 9).addBox(0.0F, -0.226F, 9.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(0.0F, -0.226F, 7.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(0.0F, -0.226F, 5.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 83).addBox(0.0F, -0.226F, 3.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 83).addBox(0.0F, -0.326F, 1.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 77).addBox(0.0F, -0.526F, -0.4254F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(-0.5F, 0.074F, -0.4254F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(13, 8).addBox(0.0F, 2.7F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(0.0F, 2.4F, 13.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 5).addBox(0.0F, 2.1F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 8).addBox(0.0F, 1.8F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(0.0F, 0.5F, 7.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4165F, -7.7238F, 0.1484F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r334 = osteoderms7.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(59, 46).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r335 = osteoderms7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(80, 3).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5629F, -2.4111F, -4.5341F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r336 = osteoderms7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(63, 22).addBox(-0.7766F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1326F, 1.3783F, -0.9657F));

		PartDefinition cube_r337 = osteoderms7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(80, 12).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.696F, 1.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r338 = osteoderms7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 42).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.4F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r339 = osteoderms7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(61, 61).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5043F, 0.2079F, 2.369F, -3.0268F, -0.0654F, -2.9962F));

		PartDefinition cube_r340 = osteoderms7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(15, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1043F, 0.3079F, 2.969F, -2.8814F, 1.2098F, -2.6797F));

		PartDefinition cube_r341 = osteoderms7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(40, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.596F, 2.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r342 = osteoderms7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.496F, 4.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r343 = osteoderms7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(60, 53).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5F, 5.0F, -0.3557F, 0.8439F, -0.2391F));

		PartDefinition cube_r344 = osteoderms7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(63, 27).addBox(-0.7766F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5F, 5.0F, -1.1326F, 1.3783F, -0.9657F));

		PartDefinition cube_r345 = osteoderms7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, -0.296F, 5.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r346 = osteoderms7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(43, 81).addBox(-0.4466F, -0.5011F, -0.5638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7061F, 0.9842F, 9.2273F, 0.0288F, 0.6079F, 0.0197F));

		PartDefinition cube_r347 = osteoderms7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(82, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, 0.104F, 9.9465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r348 = osteoderms7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(15, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8629F, 0.004F, 8.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r349 = osteoderms7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, -0.196F, 7.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r350 = osteoderms7.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 81).addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7135F, 0.7941F, 7.3096F, -2.8566F, 0.9562F, -2.9212F));

		PartDefinition osteoderms14 = tail2.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r351 = osteoderms14.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r352 = osteoderms14.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5629F, -2.4111F, -4.5341F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r353 = osteoderms14.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-0.2234F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1326F, -1.3783F, 0.9657F));

		PartDefinition cube_r354 = osteoderms14.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.696F, 1.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r355 = osteoderms14.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(59, 42).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 2.4F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r356 = osteoderms14.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5043F, 0.2079F, 2.369F, -3.0268F, 0.0654F, 2.9962F));

		PartDefinition cube_r357 = osteoderms14.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1043F, 0.3079F, 2.969F, -2.8814F, -1.2098F, 2.6797F));

		PartDefinition cube_r358 = osteoderms14.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.596F, 2.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r359 = osteoderms14.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.496F, 4.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r360 = osteoderms14.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5F, 5.0F, -0.3557F, -0.8439F, 0.2391F));

		PartDefinition cube_r361 = osteoderms14.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(-0.2234F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5F, 5.0F, -1.1326F, -1.3783F, 0.9657F));

		PartDefinition cube_r362 = osteoderms14.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, -0.296F, 5.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r363 = osteoderms14.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(43, 81).mirror().addBox(-0.5534F, -0.5011F, -0.5638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7061F, 0.9842F, 9.2273F, 0.0288F, -0.6079F, -0.0197F));

		PartDefinition cube_r364 = osteoderms14.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, 0.104F, 9.9465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r365 = osteoderms14.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8629F, 0.004F, 8.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r366 = osteoderms14.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, -0.196F, 7.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r367 = osteoderms14.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7135F, 0.7941F, 7.3096F, -2.8566F, -0.9562F, 2.9212F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0755F, 10.539F, -0.1218F, -0.5561F, 0.2931F));

		PartDefinition cube_r368 = tail3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.2174F, 0.0593F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9838F, 0.0975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5647F, -0.7F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0647F, 0.1181F, 7.215F, 0.1047F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5162F, 11.4975F));

		PartDefinition cube_r370 = osteoderms8.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(18, 35).addBox(1.0F, -1.25F, -10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r371 = osteoderms8.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(39, 25).addBox(0.0F, -1.25F, -10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, 1.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r372 = osteoderms8.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(39, 32).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1627F, -6.1311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r373 = osteoderms8.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(40, 18).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2627F, -4.6311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r374 = osteoderms8.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(25, 43).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3627F, -3.0311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r375 = osteoderms8.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4627F, -1.4311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r376 = osteoderms8.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(14, 46).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5627F, 0.1689F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r377 = osteoderms8.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(46, 45).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6627F, 1.7689F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r378 = osteoderms8.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(4.6325F, -0.1937F, 4.6875F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 25).mirror().addBox(2.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 33).mirror().addBox(0.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9112F, -7.9702F, 0.15F, -0.7332F, -0.1033F));

		PartDefinition cube_r379 = osteoderms8.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-0.5115F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9373F, -9.47F, 0.1383F, -0.8214F, -0.1034F));

		PartDefinition cube_r380 = osteoderms8.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(55, 49).addBox(-5.6325F, -0.1937F, 4.6875F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 25).addBox(-3.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 33).addBox(-1.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9112F, -7.9702F, 0.15F, 0.7332F, 0.1033F));

		PartDefinition cube_r381 = osteoderms8.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(83, 7).addBox(-0.4885F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9373F, -9.47F, 0.1383F, 0.8214F, 0.1034F));

		PartDefinition leftClub = osteoderms8.addOrReplaceChild("leftClub", CubeListBuilder.create(), PartPose.offset(1.9731F, -1.6211F, 1.2527F));

		PartDefinition cube_r382 = leftClub.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(80, 51).addBox(2.8431F, 0.8292F, 2.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 43).addBox(2.8431F, 0.8292F, 2.2482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1614F, -0.808F, -0.1147F));

		PartDefinition cube_r383 = leftClub.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(36, 40).addBox(0.1003F, 0.8292F, 2.9235F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1155F, -0.2718F, -0.0287F));

		PartDefinition cube_r384 = leftClub.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(51, 39).addBox(-1.1684F, 0.7941F, -0.9818F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1251F, 0.4738F, 0.0598F));

		PartDefinition cube_r385 = leftClub.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(82, 62).addBox(-0.8205F, 0.8292F, 1.9945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(78, 14).addBox(-1.8205F, 0.8292F, 2.5945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1165F, 0.3005F, 0.0371F));

		PartDefinition cube_r386 = leftClub.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(0, 19).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4376F, 0.7606F, 3.3239F, 0.1117F, -0.081F, -0.0066F));

		PartDefinition rightClub = osteoderms8.addOrReplaceChild("rightClub", CubeListBuilder.create(), PartPose.offset(0.0269F, -1.6211F, 1.2527F));

		PartDefinition cube_r387 = rightClub.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-3.8431F, 0.8292F, 2.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 43).mirror().addBox(-3.8431F, 0.8292F, 2.2482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1614F, 0.808F, 0.1147F));

		PartDefinition cube_r388 = rightClub.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-2.1003F, 0.8292F, 2.9235F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1155F, 0.2718F, 0.0287F));

		PartDefinition cube_r389 = rightClub.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(51, 39).mirror().addBox(0.1684F, 0.7941F, -0.9818F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1251F, -0.4738F, -0.0598F));

		PartDefinition cube_r390 = rightClub.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.1795F, 0.8292F, 1.9945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(78, 14).mirror().addBox(-0.1795F, 0.8292F, 2.5945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1165F, -0.3005F, -0.0371F));

		PartDefinition cube_r391 = rightClub.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 19).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4376F, 0.7606F, 3.3239F, 0.1117F, 0.081F, 0.0066F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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