package fossils.fossils.client.blockentity.model.neovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NeovenatorFossilModel extends SkullModelBase {
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

	public NeovenatorFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4318F, -2.5073F, -0.1744F, 0.0076F, 0.043F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 91).addBox(0.0F, -2.8857F, -0.712F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -4.15F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 31).addBox(0.0F, 0.0051F, -0.0678F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, -3.65F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(1.247F, -3.1283F, -5.0134F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, 0.3665F, 0.3054F, 0.384F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(1.247F, -2.2991F, -4.5938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, 0.6109F, 0.3054F, 0.384F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(1.1907F, -3.7274F, -4.5923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, 0.4946F, 0.3031F, 0.4224F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(1.3733F, -2.4297F, -2.1454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, -0.0698F, 0.3054F, 0.384F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(0.9877F, -0.956F, -1.4715F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.766F, -0.9371F, -0.3582F, 0.0055F, -0.157F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(1.3643F, -0.2539F, 0.2402F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, 0.0865F, -0.2093F, 0.3914F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(1.3643F, -2.5113F, 0.8326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, -0.3324F, -0.2093F, 0.3914F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(1.3643F, -1.0234F, 0.2816F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, -0.0008F, -0.2093F, 0.3914F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(0.9272F, -2.3127F, -2.2056F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, -0.1047F, 0.0F, 0.384F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(1.1176F, -3.062F, -3.3764F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.8F, 0.35F, 0.2495F, 0.2909F, 0.4785F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(80, 47).addBox(-2.3643F, -2.5113F, 0.8326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, -0.3324F, 0.2093F, -0.3914F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(75, 22).addBox(-2.3643F, -1.0234F, 0.2816F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, -0.0008F, 0.2093F, -0.3914F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(75, 10).addBox(-2.3643F, -0.2539F, 0.2402F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, 0.0865F, 0.2093F, -0.3914F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 59).addBox(-2.247F, -2.2991F, -4.5938F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, 0.6109F, -0.3054F, -0.384F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 86).addBox(-2.1176F, -3.062F, -3.3764F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, 0.2495F, -0.2909F, -0.4785F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 92).addBox(-2.3733F, -2.4297F, -2.1454F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, -0.0698F, -0.3054F, -0.384F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(86, 9).addBox(-2.1907F, -3.7274F, -4.5923F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, 0.4946F, -0.3031F, -0.4224F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 0).addBox(-2.247F, -3.1283F, -5.0134F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, 0.3665F, -0.3054F, -0.384F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-0.0606F, -0.0969F, -1.0809F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3753F, -1.1448F, 0.1636F, 0.4714F, -0.1064F, -0.0945F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-0.1829F, 0.3902F, -0.0084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3753F, -1.1448F, 0.1636F, 0.0879F, 0.0798F, -0.1132F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(0.1758F, -0.267F, 0.7354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7417F, -1.5361F, -3.4563F, -0.1666F, 0.0793F, -0.1386F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-0.0179F, 0.2535F, -0.4244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7417F, -1.5361F, -3.4563F, 0.2091F, 0.0585F, -0.2593F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.7961F, -0.0153F, -0.5901F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0573F, 2.4875F, 3.2723F, 0.9273F, 0.0449F, -0.0869F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.1829F, -0.1124F, -1.8071F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3753F, -1.1448F, 0.1636F, 0.9431F, 0.0798F, -0.1132F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-0.237F, 5.5335F, -5.5189F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5417F, 2.1639F, -2.3563F, 0.5405F, 0.0109F, -0.0343F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.237F, 6.3111F, 0.992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5417F, 2.1639F, -2.3563F, -0.3322F, 0.0109F, -0.0343F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-0.237F, 4.9679F, -4.2202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5417F, 2.1639F, -2.3563F, 0.523F, 0.0109F, -0.0343F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(-0.0976F, -0.1481F, -0.6238F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5417F, 2.1639F, -2.3563F, -0.0876F, 0.0115F, -0.0169F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 28).addBox(-0.763F, 5.5335F, -5.5189F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5417F, 2.1639F, -2.3563F, 0.5405F, -0.0109F, 0.0343F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 97).addBox(-0.763F, 6.3111F, 0.992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5417F, 2.1639F, -2.3563F, -0.3322F, -0.0109F, 0.0343F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 39).addBox(-0.763F, 4.9679F, -4.2202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5417F, 2.1639F, -2.3563F, 0.523F, -0.0109F, 0.0343F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 96).addBox(-1.1758F, -0.267F, 0.7354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7417F, -1.5361F, -3.4563F, -0.1666F, -0.0793F, 0.1386F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(52, 90).addBox(-0.9821F, 0.2535F, -0.4244F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7417F, -1.5361F, -3.4563F, 0.2091F, -0.0585F, 0.2593F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 55).addBox(-0.8171F, -0.1124F, -1.8071F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3753F, -1.1448F, 0.1636F, 0.9431F, -0.0798F, 0.1132F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 91).addBox(-0.2039F, -0.0153F, -0.5901F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0573F, 2.4875F, 3.2723F, 0.9273F, -0.0449F, 0.0869F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(91, 60).addBox(-0.8171F, 0.3902F, -0.0084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3753F, -1.1448F, 0.1636F, 0.0879F, -0.0798F, 0.1132F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(86, 24).addBox(-0.9394F, -0.0969F, -1.0809F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3753F, -1.1448F, 0.1636F, 0.4714F, 0.1064F, 0.0945F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 81).addBox(-0.9024F, -0.1481F, -0.6238F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5417F, 2.1639F, -2.3563F, -0.0876F, -0.0115F, 0.0169F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(52, 70).addBox(-1.9272F, -2.3127F, -2.2056F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0F, -3.8F, 0.35F, -0.1047F, 0.0F, -0.384F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 69).addBox(-1.9877F, -0.956F, -1.4715F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.766F, -0.9371F, -0.3582F, -0.0055F, 0.157F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 44).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.45F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 16).addBox(-1.0F, -0.0746F, 4.9057F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 2.3F, 0.1262F, -0.1354F, 0.0265F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(97, 100).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 15.9057F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 101).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 13.9057F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 101).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 11.9057F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 101).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 9.9057F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 101).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 7.9057F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(101, 81).addBox(0.0F, 4.2F, 8.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 97).addBox(0.0F, 2.4F, 6.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 100).addBox(0.0F, 1.3F, 4.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 91).addBox(0.0F, -0.4F, 2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 100).addBox(0.0F, -4.8F, -3.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 96).addBox(0.0F, -3.3F, -1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 96).addBox(0.0F, -1.3F, 0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9514F, 4.7035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(3, 100).addBox(0.0F, -2.4264F, 0.0152F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0746F, 5.9057F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-2.1735F, -0.0436F, 8.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 11).mirror().addBox(-2.1735F, -0.0436F, 6.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 31).mirror().addBox(-2.1735F, -0.0436F, 4.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 72).mirror().addBox(-2.1735F, -0.0436F, 2.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 93).mirror().addBox(-1.8612F, 0.0349F, -0.7871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 2).mirror().addBox(-1.1673F, 0.2094F, -4.7226F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 4).mirror().addBox(-1.5142F, 0.1221F, -2.7548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 96).mirror().addBox(-2.1735F, -0.0436F, 0.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9254F, 4.9057F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r52 = tail.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(93, 13).addBox(0.1735F, -0.0436F, 8.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 11).addBox(0.1735F, -0.0436F, 6.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 31).addBox(0.1735F, -0.0436F, 4.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 72).addBox(0.1735F, -0.0436F, 2.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 93).addBox(-0.1388F, 0.0349F, -0.7871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 2).addBox(-1.8175F, 0.2094F, -4.5489F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 4).addBox(-0.4858F, 0.1221F, -2.7548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 96).addBox(0.1735F, -0.0436F, 0.9839F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9254F, 4.9057F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r53 = tail.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 62).addBox(0.0F, -3.0578F, -0.8203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(45, 98).addBox(0.0F, -3.0325F, -2.7588F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(21, 45).addBox(0.0F, -2.7329F, -4.8061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 61).addBox(-1.0F, -0.4467F, -4.7922F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 31).addBox(-0.5F, -0.55F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(101, 52).addBox(0.0F, -1.65F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5254F, 16.9057F, 0.0785F, -0.0034F, 0.0435F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(102, 64).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 8.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(41, 101).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 4.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 101).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 2.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 100).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(35, 101).addBox(0.0F, 9.4F, 18.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 102).addBox(0.0F, 8.3F, 16.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 101).addBox(0.0F, 7.3F, 14.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 77).addBox(0.0F, 6.2F, 12.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 100).addBox(0.0F, 5.1F, 10.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4261F, -12.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F))
				.texOffs(80, 102).addBox(0.0F, -1.65F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 83).addBox(0.0F, -1.55F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 39).addBox(0.0F, -1.45F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 102).addBox(0.0F, -1.35F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 102).addBox(0.0F, -1.25F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 11.0F, -0.0447F, -0.218F, 0.0097F));

		PartDefinition cube_r62 = tail3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(63, 102).addBox(0.0F, 15.6984F, 27.7448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 92).addBox(0.0F, 14.5656F, 26.0965F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 102).addBox(0.0F, 13.6328F, 24.4483F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 102).addBox(0.0F, 12.7F, 22.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 71).addBox(0.0F, 11.4F, 20.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1761F, -23.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.3465F, -0.2277F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(101, 46).addBox(0.0F, -0.7465F, -0.2277F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 102).addBox(0.0F, -0.7465F, 1.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 102).addBox(0.0F, -0.7465F, 3.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 102).addBox(0.0F, -0.7465F, 5.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 102).addBox(0.0F, -0.6465F, 7.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 9.9F, -0.2803F, -0.5065F, 0.1388F));

		PartDefinition cube_r63 = tail4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(102, 95).addBox(0.0F, 16.7312F, 29.393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5261F, -33.1022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.2674F, -0.1872F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0465F, 8.8723F, -0.3374F, -0.2892F, 0.0997F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.2F, 0.2454F, -0.2446F, -0.1039F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(100, 19).addBox(0.0F, -3.6F, 4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 100).addBox(0.0F, -3.5F, 2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 100).addBox(0.0F, -3.4F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 14).addBox(0.0F, -3.3F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 9).addBox(0.0F, -3.3F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 97).addBox(0.0F, -3.1F, -5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 102).addBox(0.0F, -2.8F, -7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-1.0F, -1.0F, -7.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1102F, -5.4697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.1066F, -0.0282F, -0.5665F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 25).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0852F, -0.0515F, -1.09F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(100, 24).mirror().addBox(-3.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0518F, -0.085F, -1.5699F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0446F, 0.004F, -0.5323F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0477F, 0.0074F, -1.0559F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(93, 19).mirror().addBox(-4.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0457F, -0.0155F, -1.5353F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0426F, 0.0193F, -1.5004F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0289F, 0.0368F, -1.0206F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0137F, 0.0201F, -0.497F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0396F, 0.0541F, -1.4654F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0101F, 0.0662F, -0.9847F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, 0.0173F, 0.0362F, -0.4612F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0484F, 0.0523F, -0.4424F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 17).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0088F, 0.0956F, -0.9657F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(41, 14).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, -0.0365F, 0.0888F, -1.4477F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0794F, 0.0683F, -0.4231F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0278F, 0.125F, -0.9462F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(41, 12).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, -0.0334F, 0.1236F, -1.43F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(77, 7).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, -0.0249F, 0.2105F, -1.446F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.0764F, 0.1978F, -0.9558F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.1577F, 0.1075F, -0.4337F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.1066F, 0.0282F, 0.5665F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 25).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0852F, 0.0515F, 1.09F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(100, 24).addBox(2.8493F, -2.6091F, -0.5523F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0518F, 0.085F, 1.5699F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(93, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0446F, -0.004F, 0.5323F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 21).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0477F, -0.0074F, 1.0559F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(93, 19).addBox(2.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0457F, 0.0155F, 1.5353F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(56, 42).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0426F, -0.0193F, 1.5004F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(92, 77).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0289F, -0.0368F, 1.0206F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0137F, -0.0201F, 0.497F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(82, 44).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0396F, -0.0541F, 1.4654F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(96, 35).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0101F, -0.0662F, 0.9847F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(96, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, 0.0173F, -0.0362F, 0.4612F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0484F, -0.0523F, 0.4424F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(93, 17).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0088F, -0.0956F, 0.9657F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 14).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, -0.0365F, -0.0888F, 1.4477F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(89, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0794F, -0.0683F, 0.4231F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(93, 15).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0278F, -0.125F, 0.9462F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 12).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, -0.0334F, -0.1236F, 1.43F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(77, 7).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, -0.0249F, -0.2105F, 1.446F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(96, 37).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.0764F, -0.1978F, 0.9558F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(36, 96).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.1577F, -0.1075F, 0.4337F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.2276F, -11.6903F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5815F, -1.3989F, -0.192F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(60, 12).addBox(-1.0F, -1.1236F, -4.7348F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2602F, -12.9697F, 0.1625F, -0.2585F, -0.0419F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 102).addBox(0.0F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 102).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1236F, -5.7348F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-0.584F, 0.1466F, 4.8781F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 70).mirror().addBox(-0.584F, 0.1466F, -0.1219F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.2107F, -2.697F, -0.4504F, -0.7748F, 0.8086F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(-0.5F, -0.4323F, -0.1527F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 62).addBox(6.5F, -0.4323F, -0.1527F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.0127F, -2.5977F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-0.5F, -0.4323F, -0.1527F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 62).addBox(6.5F, -0.4323F, -0.1527F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, 2.0127F, -2.5977F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(24, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, 0.1388F, 0.1057F, -0.5225F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(17, 94).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, 0.0607F, 0.1869F, -1.0456F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(86, 5).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, -0.0336F, 0.1935F, -1.5345F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(93, 70).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0007F, 0.0809F, -1.0015F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.038F, 0.0715F, -1.4828F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(93, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, 0.0328F, 0.0443F, -0.4781F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-0.9134F, -0.9446F, -3.6154F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.9127F, -3.1977F, 0.5742F, -0.4356F, -0.2665F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 58).addBox(6.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.6772F, -4.6862F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-0.5F, -0.4323F, -2.1527F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(46, 44).addBox(6.5F, -0.4323F, -2.1527F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, 2.0127F, -2.5977F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(-0.3652F, 0.0924F, -0.4746F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.6263F, -2.1386F, -0.3265F, -0.7537F, 0.6777F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(64, 69).mirror().addBox(-0.8072F, 0.2462F, 0.1085F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1175F, -2.7453F, -0.4257F, -1.0178F, 0.9299F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(24, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, 0.1388F, -0.1057F, 0.5225F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(17, 94).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, 0.0607F, -0.1869F, 1.0456F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 5).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, -0.0336F, -0.1935F, 1.5345F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(93, 70).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0007F, -0.0809F, 1.0015F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 10).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.038F, -0.0715F, 1.4828F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, 0.0328F, -0.0443F, 0.4781F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(82, 32).addBox(-0.0866F, -0.9446F, -3.6154F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.9127F, -3.1977F, 0.5742F, 0.4356F, 0.2665F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 28).addBox(-1.5F, -0.1381F, -2.1909F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1523F, -4.3808F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 54).addBox(-0.6348F, 0.0924F, -0.4746F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6263F, -2.1386F, -0.3265F, 0.7537F, -0.6777F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(42, 73).addBox(-0.416F, 0.1466F, 4.8781F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 70).addBox(-0.416F, 0.1466F, -0.1219F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2107F, -2.697F, -0.4504F, 0.7748F, -0.8086F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 69).addBox(-0.1928F, 0.2462F, 0.1085F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1175F, -2.7453F, -0.4257F, 1.0178F, -0.9299F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(63, 75).addBox(-0.5F, -0.4834F, -1.3733F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1523F, -4.3808F, -0.5847F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(84, 86).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6569F, 6.1023F, -4.7122F, 0.5021F, 0.342F, 0.0834F));

		PartDefinition cube_r135 = leftarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(96, 83).addBox(-0.5F, -2.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(57, 90).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(62, 90).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -1.0554F, -1.0446F, -0.508F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8007F, 3.5463F, 0.8F, 0.0F, 0.0F, 0.3054F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6569F, 6.1023F, -4.7122F, 0.3275F, -0.342F, -0.0834F));

		PartDefinition cube_r136 = rightarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 96).addBox(-0.5F, -2.3F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(67, 90).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(72, 90).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -1.1195F, 0.9672F, 0.4322F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(64, 54).addBox(0.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8007F, 3.5463F, 0.8F, 0.0F, 0.0F, -0.3054F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8067F, -4.7591F, -0.7984F, -0.0916F, 0.0936F));

		PartDefinition cube_r137 = neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(101, 56).addBox(0.0F, -1.5114F, -0.0398F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3055F, -1.5243F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r138 = neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7392F, -1.3647F, 1.4509F, 0.7248F, -0.1252F));

		PartDefinition cube_r139 = neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(86, 73).mirror().addBox(-4.7321F, -0.9986F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.7392F, -1.3647F, 1.3595F, 1.2457F, -0.231F));

		PartDefinition cube_r140 = neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(93, 9).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7392F, -1.3647F, 1.4509F, -0.7248F, 0.1252F));

		PartDefinition cube_r141 = neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 73).addBox(1.7321F, -0.9986F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.7392F, -1.3647F, 1.3595F, -1.2457F, 0.231F));

		PartDefinition cube_r142 = neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 16).addBox(-0.5F, -0.8295F, -3.942F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3055F, 0.4757F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0555F, -3.0243F, 0.1099F, -0.3335F, -0.1677F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 7).mirror().addBox(0.2649F, -1.7903F, -1.6598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 7).mirror().addBox(-1.4616F, -0.8921F, -1.1011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 7).mirror().addBox(-2.9912F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4736F, -2.8643F, 1.0788F, 1.0363F, -0.4018F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-2.9912F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4736F, -0.8643F, 1.0788F, 1.0363F, -0.4018F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(89, 50).addBox(-0.0088F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4736F, -0.8643F, 1.0788F, -1.0363F, 0.4018F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(101, 60).addBox(0.0F, -2.7F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 1.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(100, 67).addBox(0.0F, -1.9055F, -0.0556F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1876F, -4.924F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r148 = neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(100, 42).addBox(0.0F, -1.8964F, -0.0446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1876F, -2.924F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r149 = neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(90, 7).addBox(-3.2649F, -1.7903F, -1.6598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 7).addBox(-1.5384F, -0.8921F, -1.1011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 7).addBox(-0.0088F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4736F, -2.8643F, 1.0788F, -1.0363F, 0.4018F));

		PartDefinition cube_r150 = neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(60, 20).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 0.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(90, 64).addBox(-0.5F, -0.5128F, -2.0845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.4247F, -5.78F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(21, 51).addBox(0.0F, -1.7264F, 1.0152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5128F, -2.0845F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 94).mirror().addBox(-1.0619F, -0.4148F, -0.8583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3035F, -0.8335F, 0.6856F, 1.0826F, -0.8511F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(36, 94).addBox(-0.9381F, -0.4148F, -0.8583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3035F, -0.8335F, 0.6856F, -1.0826F, 0.8511F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(79, 81).addBox(-0.5F, -0.566F, -2.7794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0872F, -2.0345F, 0.4498F, -0.2368F, -0.1128F));

		PartDefinition cube_r154 = neck4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -1.5819F, -0.0014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -2.7794F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(60, 77).addBox(0.0F, -2.4806F, 0.8203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -1.7794F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-2.6431F, 0.163F, -0.2033F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2023F, -1.5007F, 0.5182F, 0.8958F, -1.0833F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(93, 0).addBox(0.6431F, 0.163F, -0.2033F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2023F, -1.5007F, 0.5182F, -0.8958F, 1.0833F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.3418F, -2.9517F, 0.287F, -0.2421F, -0.287F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(86, 69).mirror().addBox(-0.35F, -0.1227F, -1.8998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1499F)).mirror(false)
				.texOffs(86, 69).addBox(1.95F, -0.1227F, -1.8998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1499F)), PartPose.offsetAndRotation(-1.8F, 1.1915F, 1.323F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(61, 96).mirror().addBox(0.0F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 96).addBox(2.0F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.923F, 0.0882F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-1.5F, -0.0419F, -0.9845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(70, 86).addBox(0.5F, -0.0419F, -0.9845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.3235F, 0.4291F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-2.0F, -0.1149F, -0.1078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.9765F, 0.4291F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(52, 86).addBox(1.0F, -0.1149F, -0.1078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8F, -0.9765F, 0.4291F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(89, 46).addBox(-1.0F, -0.1361F, -0.1558F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.9765F, -1.4709F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(82, 28).addBox(-1.0F, 0.0395F, -1.9543F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.9765F, -1.2709F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(26, 76).addBox(-1.5F, -0.045F, -0.0431F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.8765F, -1.2709F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(26, 70).addBox(-1.5F, -2.0243F, -2.946F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2235F, -0.8709F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 83).addBox(-1.5F, -1.9501F, -0.9646F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 2.0235F, 0.1291F, 0.1571F, 0.0F, 0.0F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create().texOffs(77, 69).addBox(-1.2F, 0.65F, -3.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.016F))
				.texOffs(77, 69).mirror().addBox(-1.8F, 0.65F, -3.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5265F, -1.9709F, 0.1833F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create().texOffs(82, 38).addBox(-0.7F, 0.4516F, -3.3517F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(82, 38).mirror().addBox(-1.3F, 0.4516F, -3.3517F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r168 = HEADPART2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 14).addBox(-1.0F, -0.0394F, -2.0904F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.6F, -0.2094F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r169 = HEADPART3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-0.2F, -0.1873F, -0.869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(96, 52).addBox(0.2F, -0.1873F, -0.869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.3F, -3.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r170 = HEADPART3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(96, 46).mirror().addBox(-0.2F, -0.0489F, -0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.037F)).mirror(false)
				.texOffs(96, 46).addBox(0.2F, -0.0489F, -0.9746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.035F)), PartPose.offsetAndRotation(-1.0F, 0.2F, -2.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r171 = HEADPART3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(-0.2F, -0.0548F, -0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.033F)).mirror(false)
				.texOffs(91, 52).addBox(0.2F, -0.0548F, -0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 0.2F, -1.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r172 = HEADPART3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.2F, -0.0408F, -0.1074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.034F)).mirror(false)
				.texOffs(54, 12).addBox(0.2F, -0.0408F, -0.1074F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.032F)), PartPose.offsetAndRotation(-1.0F, 0.2F, -2.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r173 = HEADPART3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(51, 96).addBox(-0.8F, -0.0543F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.1F, 0.9774F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9235F, -9.9209F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r174 = HEADPART5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-1.1F, -0.9811F, 0.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(97, 97).addBox(0.1F, -0.9811F, 0.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.05F, 0.95F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r175 = HEADPART5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(83, 102).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2967F, 1.4764F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r176 = HEADPART5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 102).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2967F, 1.4764F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r177 = HEADPART5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(97, 94).addBox(-0.5F, -0.2422F, -2.123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.461F, 1.4891F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r178 = HEADPART5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(97, 64).addBox(-0.3F, -0.9973F, -0.9356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.05F, 0.95F, -0.2793F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8448F, 1.0526F, 0.5849F, 0.0876F, 0.1996F));

		PartDefinition cube_r179 = HEADPART6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(5, 87).addBox(-0.8755F, -0.553F, -1.8986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.5F, 3.3F, -0.1796F, -0.0094F, 0.0015F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r180 = HEADPART7.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(29, 87).addBox(1.0F, -0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 0.2F, 2.1F, 0.0342F, -0.0064F, 0.0026F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1181F, -0.2647F, 2.1783F, 1.0396F, 0.2305F, 0.3008F));

		PartDefinition cube_r181 = HEADPART8.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 49).addBox(-0.5031F, -0.1985F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6159F, 0.8684F, 0.005F, 0.1591F, -0.2398F, -0.0565F));

		PartDefinition cube_r182 = HEADPART8.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(40, 98).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6159F, 0.7684F, 0.005F, 0.2426F, -0.2806F, -0.0086F));

		PartDefinition cube_r183 = HEADPART8.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(77, 98).addBox(-0.7F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2432F, 3.0257F, -0.6519F, 0.271F, -0.1599F, 0.0886F));

		PartDefinition cube_r184 = HEADPART8.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(25, 98).addBox(-0.5344F, 0.7671F, -0.7886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6159F, 0.8684F, 0.005F, -0.1686F, -0.2147F, -0.1217F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.8448F, 1.0526F, 0.5849F, -0.0876F, -0.1996F));

		PartDefinition cube_r185 = HEADPART4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.1245F, -0.553F, -1.8986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.5F, 3.3F, -0.1796F, 0.0094F, -0.0015F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r186 = HEADPART9.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(29, 87).mirror().addBox(-2.0F, -0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.2F, 2.1F, 0.0342F, 0.0064F, -0.0026F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1181F, -0.2647F, 2.1783F, 1.0396F, -0.2305F, -0.3008F));

		PartDefinition cube_r187 = HEADPART10.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-0.4969F, -0.1985F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6159F, 0.8684F, 0.005F, 0.1591F, 0.2398F, 0.0565F));

		PartDefinition cube_r188 = HEADPART10.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6159F, 0.7684F, 0.005F, 0.2426F, 0.2806F, 0.0086F));

		PartDefinition cube_r189 = HEADPART10.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(77, 98).mirror().addBox(-0.3F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2432F, 3.0257F, -0.6519F, 0.271F, 0.1599F, -0.0886F));

		PartDefinition cube_r190 = HEADPART10.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(25, 98).mirror().addBox(-0.4656F, 0.7671F, -0.7886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6159F, 0.8684F, 0.005F, -0.1686F, 0.2147F, 0.1217F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create().texOffs(0, 70).addBox(-2.0F, -3.3F, 2.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r191 = HEADPART12.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(26, 91).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3369F, -0.1309F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r192 = HEADPART12.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(19, 91).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2591F, -1.609F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r193 = HEADPART12.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.1F, -0.787F, -5.4224F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.4F, 2.8F, -0.0351F, -0.052F, 0.0064F));

		PartDefinition cube_r194 = HEADPART12.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.5112F, -0.581F, -1.7336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 79).addBox(0.4663F, -0.581F, -1.7336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9775F, -2.4197F, -2.7804F, 0.4306F, 0.0F, 0.0F));

		PartDefinition cube_r195 = HEADPART12.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(82, 96).mirror().addBox(-0.51F, -0.4262F, 0.3114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 96).mirror().addBox(-0.51F, -0.4262F, -0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 96).addBox(0.4651F, -0.4262F, 0.3114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 96).addBox(0.4651F, -0.4262F, -0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9775F, -2.4197F, -2.7804F, 0.5704F, 0.0F, 0.0F));

		PartDefinition cube_r196 = HEADPART12.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(77, 86).mirror().addBox(-0.4972F, -0.3926F, -1.8077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 86).addBox(0.4523F, -0.3926F, -1.8077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9775F, -2.4197F, -2.7804F, 0.3429F, 0.0F, 0.0F));

		PartDefinition cube_r197 = HEADPART12.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(87, 96).mirror().addBox(0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.56F, -1.6891F, -1.9154F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r198 = HEADPART12.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 99).mirror().addBox(-0.3033F, 0.1747F, -1.3196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, 1.6038F, -0.0562F, -0.0281F));

		PartDefinition cube_r199 = HEADPART12.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.3033F, -0.0839F, -0.8153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 99).mirror().addBox(-0.3033F, 0.6161F, -0.8153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, -1.119F, -0.0562F, -0.0281F));

		PartDefinition cube_r200 = HEADPART12.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.3033F, -1.5302F, -1.2382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, 1.3769F, -0.0562F, -0.0281F));

		PartDefinition cube_r201 = HEADPART12.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(56, 99).mirror().addBox(-0.3033F, -0.4711F, -0.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, -0.8746F, -0.0562F, -0.0281F));

		PartDefinition cube_r202 = HEADPART12.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-0.3033F, -1.9658F, -0.8187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, -1.2586F, -0.0562F, -0.0281F));

		PartDefinition cube_r203 = HEADPART12.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.3033F, -1.2793F, 0.5048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -2.2062F, 0.2278F, -0.4383F, -0.0562F, -0.0281F));

		PartDefinition cube_r204 = HEADPART12.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(99, 74).mirror().addBox(-0.44F, -0.553F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(15, 96).mirror().addBox(-0.44F, -0.153F, -0.5124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 74).addBox(1.64F, -0.553F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(15, 96).addBox(1.64F, -0.153F, -0.5124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -2.2153F, 5.2067F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r205 = HEADPART12.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(61, 99).mirror().addBox(-0.44F, -0.2439F, -1.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(61, 99).addBox(1.64F, -0.2439F, -1.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, -1.411F, 5.2392F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r206 = HEADPART12.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-0.5F, -0.288F, -0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(51, 99).mirror().addBox(-0.5F, 0.112F, -0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.53F, -1.8228F, 3.1031F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r207 = HEADPART12.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(99, 86).mirror().addBox(-0.32F, -0.5752F, -0.3106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(72, 99).mirror().addBox(-0.32F, -0.2752F, -0.3106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(96, 55).mirror().addBox(-0.55F, -0.5752F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(56, 96).mirror().addBox(-0.68F, -0.5752F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false), PartPose.offsetAndRotation(-1.71F, -2.6648F, 3.1945F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r208 = HEADPART12.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(56, 96).addBox(-0.32F, -0.5752F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(96, 55).addBox(-0.45F, -0.5752F, -0.4106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(99, 86).addBox(-0.68F, -0.5752F, -0.3106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(72, 99).addBox(-0.68F, -0.2752F, -0.3106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.71F, -2.6648F, 3.1945F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r209 = HEADPART12.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 96).addBox(-0.6967F, -1.5302F, -1.2382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, 1.3769F, 0.0562F, 0.0281F));

		PartDefinition cube_r210 = HEADPART12.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(87, 99).addBox(-0.6967F, 0.1747F, -1.3196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, 1.6038F, 0.0562F, 0.0281F));

		PartDefinition cube_r211 = HEADPART12.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(56, 99).addBox(-0.6967F, -0.4711F, -0.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, -0.8746F, 0.0562F, 0.0281F));

		PartDefinition cube_r212 = HEADPART12.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(87, 96).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.56F, -1.6891F, -1.9154F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r213 = HEADPART12.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(92, 99).addBox(-0.6967F, 0.6161F, -0.8153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 89).addBox(-0.6967F, -0.0839F, -0.8153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, -1.119F, 0.0562F, 0.0281F));

		PartDefinition cube_r214 = HEADPART12.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(95, 79).addBox(-0.6967F, -1.9658F, -0.8187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, -1.2586F, 0.0562F, 0.0281F));

		PartDefinition cube_r215 = HEADPART12.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(10, 95).addBox(-0.6967F, -1.2793F, 0.5048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -2.2062F, 0.2278F, -0.4383F, 0.0562F, 0.0281F));

		PartDefinition cube_r216 = HEADPART12.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(96, 61).addBox(-0.5F, -0.288F, -0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(51, 99).addBox(-0.5F, 0.112F, -0.4288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.53F, -1.8228F, 3.1031F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r217 = HEADPART12.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 62).addBox(-0.9F, -0.787F, -5.4224F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.4F, 2.8F, -0.0351F, 0.052F, -0.0064F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(69, 35).addBox(0.0F, -0.0413F, -4.1619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F))
				.texOffs(69, 35).mirror().addBox(-2.0F, -0.0413F, -4.1619F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8274F, 1.3581F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.5F, 0.1324F, -0.1826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(99, 6).mirror().addBox(-0.5F, -0.1676F, -0.1826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(10, 99).addBox(1.9F, 0.1324F, -0.1826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 6).addBox(1.9F, -0.1676F, -0.1826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-1.7F, 1.6568F, -3.1292F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(-1.0F, -1.9918F, -0.9429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(94, 88).addBox(1.0F, -1.9918F, -0.9429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, 1.8587F, -1.6619F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.6209F, 0.0803F, 3.2552F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, 0.1346F, -0.0137F, 0.1221F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(77, 94).mirror().addBox(0.584F, -1.1081F, 1.5042F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, -0.2053F, -0.3595F, 0.0731F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(86, 19).mirror().addBox(0.0F, -1.9804F, -1.9947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(86, 19).addBox(2.0F, -1.9804F, -1.9947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0F, 2.0348F, -3.5117F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(-1.0F, -1.9601F, -1.0215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(43, 94).addBox(1.0F, -1.9601F, -1.0215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 2.0587F, -2.5619F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(77, 90).mirror().addBox(-1.0F, -0.9554F, -1.9105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(77, 90).addBox(1.0F, -0.9554F, -1.9105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, 0.8587F, 0.0381F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-1.0F, -0.0398F, -1.9589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(89, 40).addBox(1.0F, -0.0398F, -1.9589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, -0.3413F, -3.1619F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(89, 36).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, -0.0413F, -1.1619F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 93).addBox(1.9F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7F, 1.2568F, -3.9292F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(91, 56).addBox(0.6209F, 0.0803F, 3.2552F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, 0.1346F, 0.0137F, -0.1221F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(77, 94).addBox(-0.584F, -1.1081F, 1.5042F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8587F, -4.2619F, -0.2053F, 0.3595F, -0.0731F));

		PartDefinition JAWPART = jaw.addOrReplaceChild("JAWPART", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4413F, -4.0619F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r230 = JAWPART.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.85F, 0.0232F, -3.9682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(74, 75).addBox(0.55F, 0.0232F, -3.9682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.85F, -0.1097F, -1.0278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r231 = JAWPART.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.85F, -0.412F, -1.3091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(88, 80).addBox(0.55F, -0.412F, -1.3091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.85F, 0.4903F, -5.2278F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r232 = JAWPART.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-0.35F, -0.3748F, -1.7438F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false)
				.texOffs(12, 89).addBox(0.05F, -0.3748F, -1.7438F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.85F, 0.4903F, -5.2278F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r233 = JAWPART.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(24, 81).mirror().addBox(-0.85F, -0.9763F, -1.9196F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(24, 81).addBox(0.55F, -0.9763F, -1.9196F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.85F, 1.1903F, -3.1278F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r234 = JAWPART.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.85F, -0.9763F, -0.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.036F)).mirror(false)
				.texOffs(89, 84).addBox(0.55F, -0.9763F, -0.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.036F)), PartPose.offsetAndRotation(-0.85F, 1.1903F, -3.1278F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r235 = JAWPART.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-0.85F, -0.9491F, -0.9198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(82, 99).addBox(0.55F, -0.9491F, -0.9198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.85F, 1.9903F, -1.3278F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r236 = JAWPART.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(35, 98).mirror().addBox(-0.35F, -0.0527F, -2.5143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(35, 98).addBox(0.05F, -0.0527F, -2.5143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(91, 28).addBox(-0.65F, -0.7333F, -1.0125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.85F, 0.4903F, -5.2278F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r237 = JAWPART.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-0.35F, -0.3488F, -2.5834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(89, 32).addBox(0.05F, -0.3488F, -2.5834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.85F, 0.4903F, -5.2278F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r238 = JAWPART.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(41, 91).addBox(-1.35F, -0.8017F, 1.0283F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 0.4903F, -5.2278F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r239 = JAWPART.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(98, 27).addBox(-0.85F, -1.0977F, -2.442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 0.4903F, -5.2278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5587F, -4.2619F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -1.8936F, -1.1868F, 0.1482F, 0.0064F, -0.0432F));

		PartDefinition cube_r240 = leftleg.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(81, 64).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 9.1126F, 0.4994F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftleg.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(36, 87).addBox(-0.5F, 5.7752F, -1.6564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.5141F, 0.2872F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftleg.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(86, 52).addBox(-0.5F, 3.2023F, 0.8302F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.5141F, 0.2872F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftleg.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(42, 83).addBox(-1.5F, -1.0139F, -0.4323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(42, 83).addBox(-0.5F, -1.0139F, -0.4323F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.5141F, 0.2872F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftleg.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(55, 77).addBox(-0.5F, -1.0F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5141F, 0.2872F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(25, 32).addBox(-1.0F, 2.2627F, 0.1756F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 77).addBox(-1.0F, 0.2627F, -0.8244F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7374F, 0.0771F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftleg2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -9.4451F, -1.9849F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 9.9627F, 1.0756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftleg2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -7.6094F, -0.9311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.9627F, 1.0756F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(37, 76).addBox(-1.5F, -0.2762F, -0.6567F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 11.6094F, 0.7265F, -0.8203F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(64, 64).addBox(-2.5F, -0.1585F, -3.0612F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7238F, -0.0067F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(21, 55).addBox(-2.5F, 0.0F, -3.8F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1585F, -2.2612F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -1.8936F, -1.1868F, -0.8618F, 0.1902F, 0.0525F));

		PartDefinition cube_r247 = rightleg.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(70, 81).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 9.1126F, 0.4994F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightleg.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(89, 88).addBox(-0.5F, 5.7752F, -1.6564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5141F, 0.2872F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightleg.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(86, 58).addBox(-0.5F, 3.2023F, 0.8302F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.5141F, 0.2872F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightleg.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 83).addBox(0.5F, -1.0139F, -0.4323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(47, 83).addBox(-0.5F, -1.0139F, -0.4323F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5141F, 0.2872F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightleg.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(60, 81).addBox(-0.5F, -1.0F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5141F, 0.2872F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(5, 76).addBox(0.0F, 2.2627F, 0.1756F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 53).addBox(0.0F, 0.2627F, -0.8244F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7374F, 0.0771F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightleg2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(85, 75).addBox(-0.5F, -9.4451F, -1.9849F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 9.9627F, 1.0756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightleg2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, -7.6094F, -0.9311F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.9627F, 1.0756F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(77, 0).addBox(-1.5F, -0.2762F, -0.6567F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 11.6094F, 0.7265F, -1.0821F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(65, 42).addBox(-2.5F, -0.1585F, -3.0612F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7238F, -0.0067F, 1.0036F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(0, 56).addBox(-2.5F, 0.0F, -3.8F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1585F, -2.2612F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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