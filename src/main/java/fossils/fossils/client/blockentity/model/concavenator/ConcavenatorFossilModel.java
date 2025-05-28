package fossils.fossils.client.blockentity.model.concavenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConcavenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart HEADPART;
	private final ModelPart HEADPART2;
	private final ModelPart HEADPART3;
	private final ModelPart HEADPART5;
	private final ModelPart HEADPART6;
	private final ModelPart HEADPART7;
	private final ModelPart HEADPART8;
	private final ModelPart HEADPART4;
	private final ModelPart HEADPART9;
	private final ModelPart HEADPART10;
	private final ModelPart HEADPART12;
	private final ModelPart jaw;
	private final ModelPart JAWPART;
	private final ModelPart throat;
	private final ModelPart throatpouch;
	private final ModelPart throat2;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;

	public ConcavenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.HEADPART = this.head.getChild("HEADPART");
		this.HEADPART2 = this.HEADPART.getChild("HEADPART2");
		this.HEADPART3 = this.HEADPART2.getChild("HEADPART3");
		this.HEADPART5 = this.head.getChild("HEADPART5");
		this.HEADPART6 = this.HEADPART5.getChild("HEADPART6");
		this.HEADPART7 = this.HEADPART6.getChild("HEADPART7");
		this.HEADPART8 = this.HEADPART7.getChild("HEADPART8");
		this.HEADPART4 = this.HEADPART5.getChild("HEADPART4");
		this.HEADPART9 = this.HEADPART4.getChild("HEADPART9");
		this.HEADPART10 = this.HEADPART9.getChild("HEADPART10");
		this.HEADPART12 = this.HEADPART5.getChild("HEADPART12");
		this.jaw = this.head.getChild("jaw");
		this.JAWPART = this.jaw.getChild("JAWPART");
		this.throat = this.jaw.getChild("throat");
		this.throatpouch = this.throat.getChild("throatpouch");
		this.throat2 = this.throat.getChild("throat2");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2F, -2.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 52).addBox(0.0F, -0.0674F, 0.0383F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -3.55F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.096F, -2.9755F, -3.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.2241F, 0.1709F, -0.0788F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 72).mirror().addBox(-0.7151F, -2.5535F, -2.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.1944F, 0.085F, -0.42F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-0.7151F, -2.031F, -2.2316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.1896F, 0.085F, -0.42F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.9339F, 4.8698F, -0.6329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.338F, 0.0406F, -0.1069F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.9339F, 2.796F, -4.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.5172F, 0.0406F, -0.1069F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-0.8268F, -0.0119F, -2.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.0406F, 0.0413F, -0.0895F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-0.9339F, 3.7783F, -4.69F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.3951F, 0.0406F, -0.1069F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.1758F, 4.6273F, -1.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2364F, 0.7708F, -0.313F, 0.9904F, -0.0145F, -0.142F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.1758F, 5.6472F, -1.4208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2364F, 0.7708F, -0.313F, 0.7722F, -0.0145F, -0.142F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-0.1758F, -0.1162F, -0.6742F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2364F, 0.7708F, -0.313F, 0.781F, -0.0145F, -0.142F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 49).mirror().addBox(-0.1758F, -0.1318F, 0.4075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2364F, 0.7708F, -0.313F, 0.1526F, -0.0145F, -0.142F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-0.417F, -0.7111F, -0.5361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2364F, 0.7708F, -0.313F, 0.4631F, 0.131F, -0.0543F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.6383F, -4.1784F, -2.0393F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.0323F, 0.0357F, 0.0149F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-1.8488F, -5.7641F, 0.0408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.2941F, -0.1793F, 0.1714F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-1.8488F, -4.3568F, 0.5919F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.0375F, -0.1793F, 0.1714F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(-1.8488F, -3.9476F, 1.8399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.1248F, -0.1793F, 0.1714F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 59).mirror().addBox(-1.4965F, -5.412F, -1.8727F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.6136F, 0.3356F, 0.1728F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-1.4965F, -5.7286F, -3.8634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.0671F, 0.3356F, 0.1728F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(3, 65).mirror().addBox(-1.4965F, -6.807F, -3.1263F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, 0.3693F, 0.3356F, 0.1728F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 52).mirror().addBox(-2.256F, -5.6471F, -3.1111F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2364F, 2.2708F, -0.313F, -0.1021F, 0.0302F, 0.1719F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(69, 69).addBox(0.8488F, -5.7641F, 0.0408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.2941F, 0.1793F, -0.1714F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(61, 53).addBox(0.8488F, -4.3568F, 0.5919F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.0375F, 0.1793F, -0.1714F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 40).addBox(0.8488F, -3.9476F, 1.8399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.1248F, 0.1793F, -0.1714F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 59).addBox(0.4965F, -5.412F, -1.8727F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.6136F, -0.3356F, -0.1728F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 24).addBox(0.4965F, -5.7286F, -3.8634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.0671F, -0.3356F, -0.1728F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(3, 65).addBox(0.4965F, -6.807F, -3.1263F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.3693F, -0.3356F, -0.1728F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 38).addBox(-0.0661F, 3.7783F, -4.69F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.3951F, -0.0406F, 0.1069F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 75).addBox(-0.0661F, 4.8698F, -0.6329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.338F, -0.0406F, 0.1069F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 63).addBox(-0.0661F, 2.796F, -4.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.5172F, -0.0406F, 0.1069F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 0).addBox(0.096F, -2.9755F, -3.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.2241F, -0.1709F, 0.0788F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(21, 75).addBox(-0.2849F, -2.031F, -2.2316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.1896F, -0.085F, 0.42F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 72).addBox(-0.2849F, -2.5535F, -2.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.1944F, -0.085F, 0.42F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(75, 4).addBox(-0.8242F, 4.6273F, -1.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2364F, 0.7708F, -0.313F, 0.9904F, 0.0145F, 0.142F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 0).addBox(-0.8242F, 5.6472F, -1.4208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2364F, 0.7708F, -0.313F, 0.7722F, 0.0145F, 0.142F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 49).addBox(-0.8242F, -0.1318F, 0.4075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2364F, 0.7708F, -0.313F, 0.1526F, 0.0145F, 0.142F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 64).addBox(-0.8242F, -0.1162F, -0.6742F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2364F, 0.7708F, -0.313F, 0.781F, 0.0145F, 0.142F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 49).addBox(-0.583F, -0.7111F, -0.5361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2364F, 0.7708F, -0.313F, 0.4631F, -0.131F, 0.0543F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 64).addBox(-0.1732F, -0.0119F, -2.1836F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.0406F, -0.0413F, 0.0895F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(50, 80).addBox(-0.002F, -2.0002F, -1.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5522F, -3.77F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(80, 55).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5522F, -3.77F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 52).addBox(1.256F, -5.6471F, -3.1111F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, -0.1021F, -0.0302F, -0.1719F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0).addBox(0.6383F, -4.1784F, -2.0393F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2364F, 2.2708F, -0.313F, 0.0323F, -0.0357F, -0.0149F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.45F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 17).addBox(-1.0F, -0.0746F, 4.9057F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 2.3F, 0.1339F, 0.1209F, 0.0503F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 38).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 15.9057F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(80, 24).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 13.9057F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 28).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 11.9057F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(29, 80).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 9.9057F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 80).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 7.9057F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(47, 80).addBox(0.0F, 3.5F, 8.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 78).addBox(0.0F, 1.6F, 6.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 78).addBox(0.0F, 0.6F, 4.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 78).addBox(0.0F, -0.4F, 2.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 76).addBox(0.0F, -4.8F, -3.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 76).addBox(0.0F, -3.3F, -1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 78).addBox(0.0F, -1.7F, 0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9514F, 4.7035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(80, 43).addBox(0.0F, -1.6264F, 0.0152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 5.9057F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(-2.1735F, -0.0436F, 8.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 73).mirror().addBox(-2.1735F, -0.0436F, 6.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 74).mirror().addBox(-2.1735F, -0.0436F, 4.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 13).mirror().addBox(-2.1735F, -0.0436F, 2.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 15).mirror().addBox(-2.1735F, -0.0436F, 0.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 40).mirror().addBox(-1.8612F, 0.0349F, -0.7871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 28).mirror().addBox(-1.5142F, 0.1221F, -2.7548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 46).mirror().addBox(-1.1673F, 0.2094F, -4.7226F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9254F, 4.9057F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r53 = tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 73).addBox(0.1735F, -0.0436F, 8.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 73).addBox(0.1735F, -0.0436F, 6.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 74).addBox(0.1735F, -0.0436F, 4.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 13).addBox(0.1735F, -0.0436F, 2.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 40).addBox(-0.1388F, 0.0349F, -0.7871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 46).addBox(-0.8327F, 0.2094F, -4.7226F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 28).addBox(-0.4858F, 0.1221F, -2.7548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 15).addBox(0.1735F, -0.0436F, 0.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9254F, 4.9057F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r54 = tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(51, 75).addBox(0.0F, -2.2578F, -0.8203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(79, 6).addBox(0.0F, -2.0325F, -2.7588F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(17, 79).addBox(0.0F, -0.7329F, -4.8061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(14, 44).addBox(-1.0F, -0.4467F, -4.7922F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 2).addBox(-0.5F, -0.55F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(58, 0).addBox(0.0F, -0.85F, 6.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5254F, 16.9057F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 57).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 8.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(22, 59).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 4.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(59, 35).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 2.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(45, 25).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, 9.9F, 18.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 10).addBox(0.0F, 7.7F, 16.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 16).addBox(0.0F, 6.6F, 14.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 20).addBox(0.0F, 5.6F, 12.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(0.0F, 4.4F, 10.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4261F, -12.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F))
				.texOffs(47, 15).addBox(0.0F, -0.95F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 43).addBox(0.0F, -0.95F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 11.0F, -0.2657F, -0.1685F, 0.0456F));

		PartDefinition cube_r63 = tail3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 8).addBox(0.0F, 12.2F, 22.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(0.0F, 11.0F, 20.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1761F, -23.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(14, 32).addBox(-0.5F, -0.3465F, -0.2277F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 9.9F, -0.2946F, -0.209F, 0.0629F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -0.2674F, -0.1872F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0465F, 8.8723F, -0.3878F, -0.325F, 0.1297F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.2F, 0.2657F, 0.1685F, 0.0456F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(69, 78).addBox(0.002F, 0.0282F, -0.9778F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3571F, 0.6277F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 78).addBox(0.0F, -1.5F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8571F, 0.1277F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 79).addBox(0.002F, -2.0435F, -0.0943F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9102F, -0.4697F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 71).addBox(-0.002F, -3.1445F, -0.2566F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8102F, -0.5697F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 65).addBox(-0.002F, -3.9684F, 0.2707F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8875F, -2.2839F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(11, 76).addBox(0.002F, -6.4737F, -0.7277F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8875F, -2.2839F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(32, 70).addBox(0.0F, -3.5327F, -0.2379F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8875F, -2.2839F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(26, 32).addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5709F, -2.9121F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 79).addBox(0.002F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 79).addBox(-0.002F, -1.2F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6875F, -3.0839F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(44, 62).addBox(0.002F, -1.9F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2661F, -4.7023F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0268F, -0.0445F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4102F, -5.4697F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(41, 15).addBox(-0.002F, -1.17F, -0.7468F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2102F, -4.8697F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(13, 29).addBox(0.0F, -0.9864F, -0.0332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2597F, -6.5636F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 77).addBox(-0.002F, -0.8F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1597F, -6.3636F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, -1.4F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 80).addBox(0.002F, -2.4F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 75).addBox(0.0F, -2.8F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 43).addBox(0.0F, -2.7F, -5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 80).addBox(0.0F, -2.4F, -7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.0F, -1.0F, -7.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1102F, -5.4697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.1066F, -0.0282F, -0.5665F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0852F, -0.0515F, -1.09F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-3.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0518F, -0.085F, -1.5699F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-4.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0457F, -0.0155F, -1.5353F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0477F, 0.0074F, -1.0559F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0446F, 0.004F, -0.5323F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(36, 25).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0426F, 0.0193F, -1.5004F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(47, 49).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0289F, 0.0368F, -1.0206F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0137F, 0.0201F, -0.497F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, 0.0173F, 0.0362F, -0.4612F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0101F, 0.0662F, -0.9847F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(32, 32).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0396F, 0.0541F, -1.4654F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, -0.0365F, 0.0888F, -1.4477F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0088F, 0.0956F, -0.9657F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0484F, 0.0523F, -0.4424F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0794F, 0.0683F, -0.4231F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0278F, 0.125F, -0.9462F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(27, 15).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, -0.0334F, 0.1236F, -1.43F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, -0.0271F, 0.1931F, -1.4464F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.0662F, 0.1836F, -0.9577F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.1418F, 0.1001F, -0.4353F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(49, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.1066F, 0.0282F, 0.5665F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 65).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0852F, 0.0515F, 1.09F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(53, 44).addBox(2.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0518F, 0.085F, 1.5699F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0446F, -0.004F, 0.5323F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(72, 57).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0477F, -0.0074F, 1.0559F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(73, 9).addBox(2.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0457F, 0.0155F, 1.5353F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(36, 25).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0426F, -0.0193F, 1.5004F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(47, 49).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0289F, -0.0368F, 1.0206F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0137F, -0.0201F, 0.497F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 32).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0396F, -0.0541F, 1.4654F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(43, 73).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0101F, -0.0662F, 0.9847F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, 0.0173F, -0.0362F, 0.4612F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0484F, -0.0523F, 0.4424F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 73).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0088F, -0.0956F, 0.9657F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 23).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, -0.0365F, -0.0888F, 1.4477F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(74, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0794F, -0.0683F, 0.4231F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(73, 61).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0278F, -0.125F, 0.9462F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(27, 15).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, -0.0334F, -0.1236F, 1.43F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(36, 0).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, -0.0271F, -0.1931F, 1.4464F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 51).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.0662F, -0.1836F, 0.9577F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(74, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.1418F, -0.1001F, 0.4353F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.8121F, -9.9129F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5815F, -1.3989F, -0.192F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(43, 41).addBox(-1.0F, -1.1236F, -4.7348F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2602F, -12.9697F, 0.1578F, 0.1507F, -0.1075F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(23, 79).addBox(0.0F, -2.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 79).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1236F, -5.7348F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-0.7144F, -0.0928F, -1.0229F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8263F, -1.5386F, -0.6162F, -0.653F, 0.6399F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-0.5568F, 0.1671F, 0.4109F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0107F, -2.397F, -0.6598F, -0.6777F, 0.7559F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(-0.5281F, 0.1695F, -0.571F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9175F, -2.7453F, -0.7049F, -1.0178F, 0.9299F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(36, 17).mirror().addBox(0.0F, -1.4141F, -1.9676F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.9127F, -3.1977F, 0.5742F, -0.4356F, -0.2665F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(-0.5F, -1.805F, -1.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 75).addBox(6.5F, -1.805F, -1.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.9127F, -1.9977F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(39, 49).mirror().addBox(-0.5F, -0.711F, -0.2866F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 49).addBox(6.5F, -0.711F, -0.2866F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.0127F, -2.5977F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, 0.0018F, 0.0282F, -0.4792F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0195F, 0.0515F, -1.0027F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 38).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0411F, 0.0367F, -1.4829F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(-3.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, -0.0342F, 0.1761F, -1.5347F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, 0.0518F, 0.1718F, -1.0472F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, 0.1236F, 0.097F, -0.524F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(70, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, 0.1236F, -0.097F, 0.524F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(70, 55).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, 0.0518F, -0.1718F, 1.0472F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(9, 41).addBox(2.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, -0.0342F, -0.1761F, 1.5347F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 32).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0195F, -0.0515F, 1.0027F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(45, 38).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0411F, -0.0367F, 1.4829F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(71, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, 0.0018F, -0.0282F, 0.4792F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 17).addBox(-1.0F, -1.4141F, -1.9676F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.9127F, -3.1977F, 0.5742F, 0.4356F, 0.2665F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 36).addBox(-1.5F, -3.935F, 0.0569F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.8764F, -8.0348F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(40, 0).addBox(-0.2856F, -0.0928F, -1.0229F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8263F, -1.5386F, -0.6162F, 0.653F, -0.6399F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(52, 8).addBox(-0.4432F, 0.1671F, 0.4109F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0107F, -2.397F, -0.6598F, 0.6777F, -0.7559F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 51).addBox(-0.4719F, 0.1695F, -0.571F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9175F, -2.7453F, -0.7049F, 1.0178F, -0.9299F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 45).addBox(-0.5F, -2.5656F, -0.3485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3764F, -5.7348F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 25).addBox(-3.0F, -4.9203F, -0.9697F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0482F, -2.2485F, -0.6283F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.8264F, -3.5348F, -0.4391F, 0.3468F, -0.0594F));

		PartDefinition cube_r148 = leftarm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(39, 77).addBox(-0.5F, -2.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(61, 66).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(66, 31).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(18, 15).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5F, 0.8F, 0.0F, 0.0F, 0.5672F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(44, 67).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.8264F, -3.5348F, 0.6081F, -0.3468F, 0.0594F));

		PartDefinition cube_r149 = rightarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -2.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(28, 64).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -1.1781F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5F, 0.8F, 0.0F, 0.0F, -0.6109F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8736F, -4.6848F, -1.032F, 0.2024F, -0.0809F));

		PartDefinition cube_r150 = neck.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 27).addBox(0.0F, -2.3114F, -0.0398F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3055F, -1.5243F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-4.7321F, -0.9986F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7392F, -1.3647F, 1.3595F, 1.2457F, -0.231F));

		PartDefinition cube_r152 = neck.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7392F, -1.3647F, 1.4509F, 0.7248F, -0.1252F));

		PartDefinition cube_r153 = neck.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(64, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7392F, -1.3647F, 1.4509F, -0.7248F, 0.1252F));

		PartDefinition cube_r154 = neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 41).addBox(1.7321F, -0.9986F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7392F, -1.3647F, 1.3595F, -1.2457F, 0.231F));

		PartDefinition cube_r155 = neck.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(30, 53).addBox(-0.5F, -0.8295F, -3.942F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3055F, 0.4757F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0555F, -3.0243F, -0.2272F, 0.1386F, 0.1227F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(-2.9912F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4736F, -0.8643F, 1.0788F, 1.0363F, -0.4018F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-2.9912F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4736F, -2.8643F, 1.0788F, 1.0363F, -0.4018F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(36, 27).addBox(-0.0088F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4736F, -0.8643F, 1.0788F, -1.0363F, 0.4018F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(31, 76).addBox(0.0F, -3.4F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 1.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(18, 15).addBox(0.0F, -1.7964F, -0.0446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1876F, -2.924F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(26, 38).addBox(-0.0088F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4736F, -2.8643F, 1.0788F, -1.0363F, 0.4018F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 0.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5F, -0.5128F, -2.0845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.3624F, -2.774F, 0.1694F, 0.4448F, 0.1897F));

		PartDefinition cube_r163 = neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -1.8264F, 0.0152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5128F, -2.0845F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-1.0619F, -0.4148F, -0.8583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3035F, -0.8335F, 0.6856F, 1.0826F, -0.8511F));

		PartDefinition cube_r165 = neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 30).addBox(-0.9381F, -0.4148F, -0.8583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3035F, -0.8335F, 0.6856F, -1.0826F, 0.8511F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, -0.566F, -2.7794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0872F, -2.0345F, 0.1713F, -0.0552F, 0.1188F));

		PartDefinition cube_r166 = neck4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -1.7794F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(18, 13).mirror().addBox(-1.9468F, -0.1344F, -0.8566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2023F, -1.5007F, 0.5182F, 0.8958F, -1.0833F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(18, 13).addBox(-0.0532F, -0.1344F, -0.8566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2023F, -1.5007F, 0.5182F, -0.8958F, 1.0833F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.2419F, -2.6576F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(39, 47).addBox(1.5F, -0.0419F, -1.9845F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3235F, 0.4291F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 3).mirror().addBox(-2.1F, -0.3641F, -1.9205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(65, 3).addBox(-0.1F, -0.3641F, -1.9205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1F, 1.0235F, 1.1291F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(-2.0F, 0.3863F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(47, 51).addBox(-0.2F, 0.3863F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -1.7765F, 0.4291F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.043F, -1.054F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.9765F, -0.7709F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(27, 7).addBox(-1.5F, -0.0674F, -0.9481F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.5765F, 0.0291F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(55, 20).addBox(-1.5F, -1.9488F, -1.9789F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3235F, -0.8709F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(13, 35).addBox(-1.5F, -2.0F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.3235F, -0.4709F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create().texOffs(61, 44).addBox(-1.5F, 0.55F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F))
				.texOffs(55, 51).addBox(-2.0F, 0.55F, -0.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.5265F, -1.9709F, 0.1833F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r176 = HEADPART2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 7).addBox(-1.5F, -0.0496F, -0.0175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.1F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r177 = HEADPART2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(64, 17).addBox(-0.7F, -0.0499F, -0.007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r178 = HEADPART3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(27, 71).mirror().addBox(-0.3F, 0.3957F, -0.0544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false)
				.texOffs(27, 71).addBox(0.3F, 0.3957F, -0.0544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -0.1F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r179 = HEADPART3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(-0.2F, -0.0704F, -0.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false)
				.texOffs(43, 75).addBox(0.2F, -0.0704F, -0.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 0.9F, -1.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r180 = HEADPART3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.2F, -0.0165F, -0.0597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(0, 49).addBox(0.2F, -0.0165F, -0.0597F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.032F)), PartPose.offsetAndRotation(-1.0F, 0.9F, -0.8F, -0.192F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9235F, -9.9209F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = HEADPART5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-1.1F, -1.0004F, -0.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(76, 69).addBox(0.1F, -1.0004F, -0.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.55F, 3.55F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r182 = HEADPART5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(69, 51).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.05F, 1.85F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r183 = HEADPART5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(40, 8).addBox(0.9F, -0.6F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0882F, 2.9675F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r184 = HEADPART5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.461F, 1.4891F, 0.0349F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create().texOffs(69, 47).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.15F, 1.65F, 0.5677F, 0.0021F, 0.198F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create().texOffs(38, 56).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create().texOffs(22, 71).addBox(-1.0F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 2.4F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.15F, 1.65F, 0.5677F, -0.0021F, -0.198F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create().texOffs(38, 56).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(0.0F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, 2.4F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create().texOffs(55, 30).addBox(-2.0F, -3.3F, 3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r185 = HEADPART12.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(26, 53).addBox(-1.5F, -1.6F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -0.05F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r186 = HEADPART12.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(67, 62).addBox(-1.5F, -1.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -0.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r187 = HEADPART12.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(78, 32).mirror().addBox(-0.43F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 78).mirror().addBox(-0.43F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 32).addBox(1.63F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(64, 78).addBox(1.63F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -1.8F, 3.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r188 = HEADPART12.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(54, 78).mirror().addBox(-0.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(54, 78).addBox(1.64F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, -1.411F, 5.2392F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r189 = HEADPART12.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.44F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 18).addBox(1.64F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -2.2153F, 5.2067F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r190 = HEADPART12.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.43F, -1.4148F, 0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 75).mirror().addBox(-0.66F, -1.5148F, 0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(54, 75).mirror().addBox(-0.79F, -1.5148F, 0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(54, 75).addBox(1.99F, -1.5148F, 0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(59, 75).addBox(1.86F, -1.5148F, 0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(78, 66).addBox(1.63F, -1.4148F, 0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6F, -2.5F, 2.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r191 = HEADPART12.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2427F, -2.7297F, -1.256F, 0.3429F, -0.1504F, -0.099F));

		PartDefinition cube_r192 = HEADPART12.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(59, 78).mirror().addBox(-0.36F, 0.1727F, -1.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(59, 78).addBox(1.76F, 0.1727F, -1.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.7F, -2.8254F, 0.9114F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r193 = HEADPART12.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-0.5F, -0.6104F, -0.8937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(78, 72).addBox(0.92F, -0.6104F, -0.8937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.21F, -2.628F, 1.8138F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r194 = HEADPART12.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(26, 75).mirror().addBox(-0.5F, -1.0453F, -0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 75).addBox(0.92F, -1.0453F, -0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.21F, -2.628F, 1.8138F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r195 = HEADPART12.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(-0.5F, -0.0239F, -0.0722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(69, 75).addBox(0.92F, -0.0239F, -0.0722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.21F, -3.228F, 1.1138F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r196 = HEADPART12.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(75, 23).addBox(0.92F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.21F, -2.3782F, 1.5171F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r197 = HEADPART12.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-1.2F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 49).addBox(0.2F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, 3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r198 = HEADPART12.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2427F, -2.7297F, -1.256F, 0.3429F, 0.1504F, 0.099F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, -0.0413F, -4.2619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F))
				.texOffs(76, 38).addBox(0.0F, -0.4196F, -4.1208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(50, 0).mirror().addBox(-2.0F, -0.0413F, -4.2619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(76, 38).mirror().addBox(-2.0F, -0.4196F, -4.1208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9735F, 1.3291F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(-0.6736F, -0.3807F, 1.7768F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, 0.1346F, -0.0137F, 0.1221F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(0.0289F, -1.0724F, 0.058F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, -0.2053F, -0.3595F, 0.0731F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(29, 47).addBox(0.6736F, -0.3807F, 1.7768F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, 0.1346F, 0.0137F, -0.1221F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(35, 70).addBox(-0.0289F, -1.0724F, 0.058F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, -0.2053F, 0.3595F, -0.0731F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(67, 58).addBox(2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0F, 0.8348F, -4.7117F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-1.0F, -0.9918F, -1.9429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(49, 67).addBox(1.0F, -0.9918F, -1.9429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 1.8587F, -1.6619F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(-0.1F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(17, 71).addBox(2.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.1F, 1.0816F, -3.5178F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(68, 10).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, -0.0413F, -1.1619F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-1.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(70, 5).addBox(1.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, 0.8587F, 0.1381F, 0.4625F, 0.0F, 0.0F));

		PartDefinition JAWPART = jaw.addOrReplaceChild("JAWPART", CubeListBuilder.create().texOffs(24, 46).addBox(-1.5F, 0.1886F, -2.1995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4413F, -4.0619F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r208 = JAWPART.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-0.7F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(69, 42).addBox(0.7F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -2.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r209 = JAWPART.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.7F, -0.916F, -2.0165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(69, 36).addBox(0.7F, -0.916F, -2.0165F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 1.5F, -2.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r210 = JAWPART.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-0.7F, -0.9889F, -1.7759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(69, 15).addBox(0.7F, -0.9889F, -1.7759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 1.6F, -1.2F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r211 = JAWPART.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-0.7F, 0.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(60, 35).addBox(0.7F, 0.0F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r212 = JAWPART.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 48).addBox(-0.8F, -0.9964F, -1.0187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.8F, -4.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r213 = JAWPART.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(47, 20).addBox(-1.5F, -0.4F, 1.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -6.15F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r214 = JAWPART.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(76, 53).addBox(-1.0F, -0.2F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.05F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r215 = JAWPART.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-0.7F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(69, 20).addBox(-0.3F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.9968F, -4.8119F, 0.0349F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5587F, -4.2619F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(39, 62).addBox(0.0F, -1.061F, -0.5527F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -1.3F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftleg.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 60).addBox(-1.0F, -1.6F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 8.2375F, 0.7095F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftleg.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(16, 75).addBox(-0.5F, -0.0874F, -0.0347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.939F, -0.5027F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftleg.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(56, 67).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.0288F, 0.4795F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftleg.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 64).addBox(-1.0F, -3.5F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.439F, 0.5473F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(47, 57).addBox(-1.0F, 2.2627F, 0.1756F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 32).addBox(-1.0F, 0.2627F, -0.8244F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.939F, 0.1973F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftleg2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(40, 38).addBox(-0.5F, -9.4451F, -1.9849F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 9.9627F, 1.0756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftleg2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, -7.6094F, -0.9311F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.9627F, 1.0756F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.03F, -1.0919F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 10.6627F, 1.1756F, -0.7767F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(47, 15).addBox(-2.5F, -0.1585F, -3.0612F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.97F, -0.4419F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(0, 43).addBox(-2.5F, 0.0F, -3.8F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -0.1585F, -2.2612F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(34, 61).addBox(-1.0F, -1.061F, -0.5527F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.3F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightleg.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 59).addBox(-1.0F, -1.6F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 8.2375F, 0.7095F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightleg.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(35, 74).addBox(-0.5F, -0.0874F, -0.0347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.939F, -0.5027F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightleg.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(66, 65).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.0288F, 0.4795F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightleg.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(62, 58).addBox(0.0F, -3.5F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 2.439F, 0.5473F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, 2.2627F, 0.1756F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 29).addBox(0.0F, 0.2627F, -0.8244F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.939F, 0.1973F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightleg2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 2).addBox(-0.5F, -9.4451F, -1.9849F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 9.9627F, 1.0756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightleg2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(52, 57).addBox(-0.5F, -7.6094F, -0.9311F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.9627F, 1.0756F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, -0.03F, -1.0919F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 10.6627F, 1.1756F, -0.7767F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(40, 8).addBox(-2.5F, -0.1585F, -3.0612F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.97F, -0.4419F, 0.3927F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(40, 32).addBox(-2.5F, 0.0F, -3.8F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -0.1585F, -2.2612F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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