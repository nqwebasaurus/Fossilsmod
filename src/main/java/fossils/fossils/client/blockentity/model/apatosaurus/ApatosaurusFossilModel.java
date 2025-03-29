package fossils.fossils.client.blockentity.model.apatosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ApatosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hip;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;

	public ApatosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hip = this.root.getChild("hip");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.0F, 10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition hip = root.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 4.0F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(179, 159).mirror().addBox(-2.0876F, -3.3808F, 0.4277F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1488F, 5.5499F, -17.815F, -2.4732F, -0.287F, -0.0553F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(127, 127).mirror().addBox(-3.0802F, 0.3984F, 4.4012F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.5243F, -1.5324F, -5.3202F, -2.4038F, -0.4874F, -0.2379F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 171).mirror().addBox(-1.9F, -2.1F, -3.5F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3017F, -11.2146F, -19.1105F, -1.6941F, -0.0509F, -0.1177F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4513F, 0.7546F, -2.5173F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-7.3242F, -7.6241F, -10.8464F, -1.9635F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 108).mirror().addBox(-1.4757F, -1.5641F, -8.7789F, 2.0F, 10.0F, 13.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.5243F, -1.5324F, -5.3202F, -1.7017F, -0.2182F, 0.0F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 175).mirror().addBox(-1.0F, -3.7F, -3.4F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 175).addBox(17.0F, -3.7F, -3.4F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -2.3359F, -4.3914F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 185).mirror().addBox(-1.0F, -1.5F, -5.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(145, 108).mirror().addBox(-1.0F, -4.5F, -5.5F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(145, 108).addBox(17.0F, -4.5F, -5.5F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.003F))
				.texOffs(62, 185).addBox(17.0F, -1.5F, -5.5F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-9.0F, -3.1636F, -3.0442F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 105).mirror().addBox(-1.0F, -4.1283F, 1.6947F, 2.0F, 6.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-9.0F, 3.9073F, 1.3819F, -2.7549F, 0.0865F, 0.1314F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 183).mirror().addBox(-1.0F, 0.1621F, -0.069F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-9.0F, 3.9073F, 1.3819F, -1.8648F, 0.0865F, 0.1314F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-1.0F, -3.4394F, -1.1675F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0F, 3.9073F, 1.3819F, -2.4529F, 0.1143F, 0.0976F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(145, 108).mirror().addBox(-1.0F, -2.8399F, -4.4604F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(123, 39).mirror().addBox(-1.0F, -4.8399F, -7.4604F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0F, -4.4785F, 5.4554F, -1.1345F, 0.0F, -0.1484F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(172, 147).mirror().addBox(-1.0F, 0.7615F, -8.9249F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-9.0F, -4.4785F, 5.4554F, -1.789F, 0.0F, -0.1484F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(176, 180).mirror().addBox(-1.0F, -4.2916F, -2.5912F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0F, -4.4785F, 5.4554F, -1.3963F, 0.0F, -0.1484F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 151).mirror().addBox(-10.0F, -8.0702F, 9.5596F, 2.0F, 10.0F, 8.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(19, 151).addBox(8.0F, -8.0702F, 9.5596F, 2.0F, 10.0F, 8.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 27).addBox(-2.0F, -1.0702F, -0.4404F, 4.0F, 4.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.484F, 5.1554F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(127, 92).mirror().addBox(-1.0F, -4.0429F, -6.8662F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 92).addBox(17.0F, -4.0429F, -6.8662F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 4.5073F, -0.3181F, -2.4609F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hip.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(105, 111).mirror().addBox(-4.7F, -1.0F, 0.9F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7001F, -0.4889F, 0.9703F, -1.8976F, 0.0565F, -0.2477F));

		PartDefinition cube_r17 = hip.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(168, 174).mirror().addBox(-5.0F, -1.0F, -4.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1958F, -4.761F, 2.3857F, -1.8374F, 0.1994F, 0.2148F));

		PartDefinition cube_r18 = hip.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-3.0F, 0.5F, -5.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.9295F, 3.0523F, -1.8787F, 0.1248F, -0.0396F));

		PartDefinition cube_r19 = hip.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, -3.4394F, -1.1675F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 3.9073F, 1.3819F, -2.4529F, -0.1143F, -0.0976F));

		PartDefinition cube_r20 = hip.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 105).addBox(-1.0F, -4.1283F, 1.6947F, 2.0F, 6.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.0F, 3.9073F, 1.3819F, -2.7549F, -0.0865F, -0.1314F));

		PartDefinition cube_r21 = hip.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 183).addBox(-1.0F, 0.1621F, -0.069F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(9.0F, 3.9073F, 1.3819F, -1.8648F, -0.0865F, -0.1314F));

		PartDefinition cube_r22 = hip.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(67, 171).addBox(-0.1F, -2.1F, -3.5F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3017F, -11.2146F, -19.1105F, -1.6941F, 0.0509F, 0.1177F));

		PartDefinition cube_r23 = hip.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5487F, 0.7546F, -2.5173F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.3242F, -7.6241F, -10.8464F, -1.9635F, 0.7854F, 0.0F));

		PartDefinition cube_r24 = hip.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(179, 159).addBox(0.0876F, -3.3808F, 0.4277F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1488F, 5.5499F, -17.815F, -2.4732F, 0.287F, 0.0553F));

		PartDefinition cube_r25 = hip.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(127, 127).addBox(1.0802F, 0.3984F, 4.4012F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.5243F, -1.5324F, -5.3202F, -2.4038F, 0.4874F, 0.2379F));

		PartDefinition cube_r26 = hip.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(87, 108).addBox(-0.5243F, -1.5641F, -8.7789F, 2.0F, 10.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.5243F, -1.5324F, -5.3202F, -1.7017F, 0.2182F, 0.0F));

		PartDefinition cube_r27 = hip.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(145, 108).addBox(-1.0F, -2.8399F, -4.4604F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F))
				.texOffs(123, 39).addBox(-1.0F, -4.8399F, -7.4604F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -4.4785F, 5.4554F, -1.1345F, 0.0F, 0.1484F));

		PartDefinition cube_r28 = hip.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(176, 180).addBox(-1.0F, -4.2916F, -2.5912F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -4.4785F, 5.4554F, -1.3963F, 0.0F, 0.1484F));

		PartDefinition cube_r29 = hip.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(172, 147).addBox(-1.0F, 0.7615F, -8.9249F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(9.0F, -4.4785F, 5.4554F, -1.789F, 0.0F, 0.1484F));

		PartDefinition cube_r30 = hip.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(168, 174).addBox(-3.0F, -1.0F, -4.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.1958F, -4.761F, 2.3857F, -1.8374F, -0.1994F, -0.2148F));

		PartDefinition cube_r31 = hip.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(105, 111).addBox(-2.3F, -1.0F, 0.9F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.7001F, -0.4889F, 0.9703F, -1.8976F, -0.0565F, 0.2477F));

		PartDefinition cube_r32 = hip.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(128, 0).addBox(-4.0F, 0.5F, -5.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.0F, -1.9295F, 3.0523F, -1.8787F, -0.1248F, 0.0396F));

		PartDefinition cube_r33 = hip.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(182, 18).mirror().addBox(-12.5433F, -2.7939F, -1.1002F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -9.9307F, 3.8995F, -2.2753F, -0.7018F, 0.4408F));

		PartDefinition cube_r34 = hip.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(184, 114).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -9.9307F, 3.7995F, -2.1422F, -0.3744F, 0.1857F));

		PartDefinition cube_r35 = hip.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(189, 159).mirror().addBox(-13.0482F, -10.4645F, -1.1002F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -13.9307F, 4.5995F, -2.8944F, -1.2165F, 1.2516F));

		PartDefinition cube_r36 = hip.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(182, 18).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -13.9307F, 4.5995F, -2.0559F, -0.7648F, 0.2935F));

		PartDefinition cube_r37 = hip.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(184, 114).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -13.9307F, 4.4995F, -1.9558F, -0.4007F, 0.115F));

		PartDefinition cube_r38 = hip.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(188, 117).mirror().addBox(-0.421F, -1.8126F, -3.5693F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -12.6939F, 5.331F, -1.9873F, 1.2143F, -2.0158F));

		PartDefinition cube_r39 = hip.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(182, 18).addBox(5.5433F, -2.7939F, -1.1002F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -9.9307F, 3.8995F, -2.2753F, 0.7018F, -0.4408F));

		PartDefinition cube_r40 = hip.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(184, 114).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -9.9307F, 3.7995F, -2.1422F, 0.3744F, -0.1857F));

		PartDefinition cube_r41 = hip.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(184, 114).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.9307F, 4.4995F, -1.9558F, 0.4007F, -0.115F));

		PartDefinition cube_r42 = hip.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(182, 18).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -13.9307F, 4.5995F, -2.0559F, 0.7648F, -0.2935F));

		PartDefinition cube_r43 = hip.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(189, 159).addBox(9.0482F, -10.4645F, -1.1002F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -13.9307F, 4.5995F, -2.8944F, 1.2165F, -1.2516F));

		PartDefinition cube_r44 = hip.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 105).addBox(-1.5F, 8.0F, -9.3F, 3.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(75, 38).addBox(-1.5F, -1.0F, -9.3F, 3.0F, 7.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3464F, 10.23F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hip.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(81, 88).addBox(-1.5F, -1.0F, -8.5F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5261F, 11.2315F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hip.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(99, 32).addBox(-2.7194F, 2.7407F, -0.8223F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(24, 101).addBox(-2.7194F, -1.2593F, -0.8223F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -12.6939F, 5.331F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hip.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(188, 117).addBox(-0.579F, -1.8126F, -3.5693F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -12.6939F, 5.331F, -1.9873F, -1.2143F, 2.0158F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 60).addBox(-5.6F, -0.75F, -21.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -3.25F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(173, 132).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 140).addBox(-4.6F, -2.0F, -11.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(169, 43).addBox(-2.5F, -3.5F, -2.1F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(183, 8).addBox(0.7F, 1.0997F, -1.0179F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.7348F, -27.6514F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(23, 105).addBox(-2.5F, -2.8721F, 2.542F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 2.1718F, -3.5599F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 0).addBox(-2.5F, -2.6F, -7.5F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 3.5182F, -7.9137F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 106).addBox(-0.5F, -0.9155F, -5.7283F, 3.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 3.5F, -10.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(127, 72).addBox(-5.5F, -5.3142F, -6.131F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -15.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(163, 123).addBox(-4.5F, -2.5F, -1.2F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9245F, -0.6418F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(142, 61).addBox(-5.5F, -2.7F, 2.1F, 11.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -6.3142F, -8.231F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(45, 55).addBox(1.6F, -0.75F, -21.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -3.25F, -6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(142, 170).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 27).addBox(2.6F, -2.0F, -11.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(166, 16).addBox(-2.5F, -3.5F, -2.1F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(136, 182).addBox(-3.7F, 1.0997F, -1.0179F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.7348F, -27.6514F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(81, 85).addBox(-1.5F, -2.8721F, 2.542F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 2.1718F, -3.5599F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(103, 52).addBox(-1.5F, -2.6F, -7.5F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 3.5182F, -7.9137F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(105, 72).addBox(-2.5F, -0.9155F, -5.7283F, 3.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 3.5F, -10.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(29, 60).addBox(-5.5F, -5.3142F, -6.131F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -15.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(162, 34).addBox(-3.5F, -2.5F, -1.2F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9245F, -0.6418F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(80, 0).addBox(-5.5F, -2.7F, 2.1F, 11.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -6.3142F, -8.231F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.8F, -4.1F, -0.4737F, -0.0803F, -0.1551F));

		PartDefinition cube_r62 = tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(173, 93).addBox(0.0F, -3.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.5211F, 0.5995F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 43).addBox(0.0F, -3.5F, -0.8F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.8995F, 0.4683F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 65).addBox(0.0F, -3.5F, -1.2F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0307F, -0.3126F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(11, 159).addBox(0.0F, -3.5F, -1.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.8362F, -1.4681F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(161, 106).addBox(0.0F, -2.6F, -1.9F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3533F, -2.2984F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(113, 150).addBox(-1.5F, 6.5F, -2.8F, 3.0F, 20.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -6.929F, -1.156F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(161, 106).addBox(-0.5F, 14.6F, -5.4F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(147, 123).addBox(-1.0F, 10.6F, -5.4F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(127, 39).addBox(-1.0F, 6.6F, -6.4F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(127, 92).addBox(-1.0F, 2.6F, -6.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(106, 92).addBox(-1.0F, -1.4F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.589F, 7.8241F, 0.1833F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(59, 126).addBox(-1.5F, -0.0482F, -1.9932F, 3.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.171F, 5.044F, 0.1705F, 0.0376F, -0.215F));

		PartDefinition cube_r69 = tail2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(105, 92).addBox(0.0F, 15.0F, 0.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 159).addBox(0.0F, 11.0F, -0.5F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(185, 174).addBox(0.0F, 7.0F, -1.9F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 187).addBox(0.0F, 3.0F, -1.9F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(99, 38).addBox(-0.5F, -1.0F, -2.8F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0959F, 4.1217F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 184).addBox(0.0F, 3.9F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 184).addBox(0.0F, 2.7F, 8.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 178).addBox(0.0F, 0.9F, 5.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 178).addBox(0.0F, -0.4F, 2.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 178).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.8427F, -3.1935F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(16, 159).addBox(0.0F, -2.7F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.72F, -3.6918F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(166, 106).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5831F, -3.793F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(171, 0).addBox(0.0F, -2.9F, -1.9F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4695F, -3.5639F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(12, 170).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1258F, 4.6091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(160, 93).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1532F, 5.4832F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.9518F, 0.2068F, 0.1719F, 0.0302F, -0.1719F));

		PartDefinition cube_r76 = tail3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(91, 132).addBox(-1.5F, -1.6F, -1.5F, 3.0F, 28.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0679F, 0.096F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(142, 61).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 25.489F, 0.8397F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(142, 155).addBox(0.0F, 3.0F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(154, 155).addBox(0.0F, -1.0F, -0.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.4612F, 0.6294F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(74, 38).addBox(0.0F, 14.6F, 37.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 38).addBox(0.0F, 13.6F, 33.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 149).addBox(0.0F, 11.6F, 29.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 170).addBox(0.0F, 10.6F, 26.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 173).addBox(0.0F, 9.1F, 23.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 132).addBox(0.0F, 8.1F, 20.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 182).addBox(0.0F, 6.9F, 17.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 184).addBox(0.0F, 5.0F, 14.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.7769F, -3.6043F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(166, 0).addBox(0.0F, 31.0F, 1.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(166, 16).addBox(0.0F, 27.0F, 1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 105).addBox(0.0F, 23.0F, 0.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 105).addBox(0.0F, 19.0F, 0.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.5237F, 3.7109F, -0.1658F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 26.3321F, -0.604F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition cube_r81 = tail4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 149).addBox(-1.0F, 1.0F, -0.7F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6241F, -0.7911F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(115, 72).addBox(0.0F, 23.0F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 39).addBox(0.0F, 19.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(127, 72).addBox(0.0F, 15.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(131, 26).addBox(0.0F, 11.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 132).addBox(0.0F, 7.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 39).addBox(0.0F, 3.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 137).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5376F, 1.5003F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(123, 141).addBox(0.0F, -0.5F, 15.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(144, 135).addBox(0.0F, -0.5F, 12.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 175).addBox(0.0F, -0.5F, 9.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(176, 93).addBox(0.0F, -0.5F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(176, 97).addBox(0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(178, 12).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4919F, -2.2992F, -1.3963F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.1759F, 2.8089F, 0.0859F, 0.0151F, -0.1739F));

		PartDefinition cube_r84 = tail5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1864F, -0.2971F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(16, 27).addBox(0.0F, 38.0F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 27).addBox(0.0F, 34.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 27).addBox(0.0F, 30.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 38).addBox(0.0F, 26.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.5247F, -1.5058F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(75, 190).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.3136F, 0.7029F, 0.0F, 0.0F, -0.3491F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(189, 183).addBox(-0.5F, 0.0216F, -0.4443F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 12.8F, 0.05F, -0.0832F, -0.0262F, -0.3043F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.3216F, -0.4443F, -0.1278F, -0.0283F, -0.2164F));

		PartDefinition cube_r86 = tail8.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(164, 185).addBox(0.0F, -0.1F, -0.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5077F, 0.6175F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1923F, 1.3175F, -0.1278F, 0.0283F, 0.2164F));

		PartDefinition cube_r87 = tail9.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 186).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2146F, 0.2974F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(107, 190).addBox(-0.5F, -0.7026F, -0.3608F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9854F, 0.6974F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(169, 185).addBox(-0.5F, -0.3166F, -0.3485F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 10.1974F, -0.1608F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(46, 183).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 13.6834F, 0.1515F, -0.3271F, 0.2213F, 0.5742F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.5F, 5.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 85).addBox(-2.7194F, -1.2593F, -0.8223F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -1.6939F, 1.431F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(104, 23).mirror().addBox(-22.0482F, -10.4645F, -1.1002F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.4307F, 0.5995F, -2.3689F, -1.3298F, 0.7536F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 156).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.4307F, 0.5995F, -1.8028F, -0.7329F, 0.1268F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(46, 126).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.4307F, 0.4995F, -1.7629F, -0.3455F, 0.0506F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(125, 113).mirror().addBox(-0.421F, -1.8126F, -3.5693F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -1.6939F, 1.431F, -1.9873F, 1.2143F, -2.0158F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(143, 13).mirror().addBox(-24.0482F, -10.4645F, -1.1002F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -6.2307F, 0.9995F, -1.9649F, -1.3466F, 0.3586F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(172, 119).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -6.2307F, 0.9995F, -1.6832F, -0.7056F, 0.0465F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(128, 12).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -6.2307F, 0.8995F, -1.6694F, -0.3137F, 0.0188F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 185).mirror().addBox(2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -5.6939F, 5.031F, -2.1996F, 1.3192F, -2.2187F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(127, 58).mirror().addBox(-28.0482F, -10.4645F, -1.1002F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -10.2307F, 2.0995F, -1.7817F, -1.3221F, 0.1786F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(179, 0).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -10.2307F, 2.0995F, -1.6367F, -0.6718F, 0.0151F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(165, 159).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -10.2307F, 1.9995F, -1.6325F, -0.2792F, 0.0062F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(151, 185).mirror().addBox(2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -10.6939F, 6.131F, -2.1996F, 1.3192F, -2.2187F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-29.0482F, -10.4645F, -1.1002F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -15.0307F, 3.0995F, -1.4703F, -1.3064F, -0.1289F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(179, 3).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -15.0307F, 3.0995F, -1.5378F, -0.6529F, -0.0519F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(183, 34).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -15.0307F, 2.9995F, -1.5514F, -0.2611F, -0.0216F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(28, 186).mirror().addBox(2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -14.6939F, 6.531F, -2.1996F, 1.3192F, -2.2187F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-30.0482F, -10.4645F, -1.1002F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -20.1307F, 3.7995F, -1.0473F, -1.3048F, -0.5449F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(180, 144).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -20.1307F, 3.7995F, -1.4013F, -0.6775F, -0.1436F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(183, 102).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -20.1307F, 3.6995F, -1.4415F, -0.2918F, -0.059F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(186, 88).mirror().addBox(1.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -19.6939F, 6.531F, -2.1996F, 1.3192F, -2.2187F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(125, 113).addBox(-0.579F, -1.8126F, -3.5693F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -1.6939F, 1.431F, -1.9873F, -1.2143F, 2.0158F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(94, 185).addBox(-3.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -5.6939F, 5.031F, -2.1996F, -1.3192F, 2.2187F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 85).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -5.6939F, 5.031F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(151, 185).addBox(-3.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -10.6939F, 6.131F, -2.1996F, -1.3192F, 2.2187F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(104, 118).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -10.6939F, 6.131F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(28, 186).addBox(-3.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -14.6939F, 6.531F, -2.1996F, -1.3192F, 2.2187F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 124).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -14.6939F, 6.531F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(125, 111).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -19.6939F, 6.531F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(186, 88).addBox(-2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -19.6939F, 6.531F, -2.1996F, -1.3192F, 2.2187F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 126).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.4307F, 0.4995F, -1.7629F, 0.3455F, -0.0506F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 156).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.4307F, 0.5995F, -1.8028F, 0.7329F, -0.1268F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 23).addBox(9.0482F, -10.4645F, -1.1002F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.4307F, 0.5995F, -2.3689F, 1.3298F, -0.7536F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(172, 119).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -6.2307F, 0.9995F, -1.6832F, 0.7056F, -0.0465F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(128, 12).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -6.2307F, 0.8995F, -1.6694F, 0.3137F, -0.0188F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(143, 13).addBox(9.0482F, -10.4645F, -1.1002F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -6.2307F, 0.9995F, -1.9649F, 1.3466F, -0.3586F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(165, 159).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.2307F, 1.9995F, -1.6325F, 0.2792F, -0.0062F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(179, 0).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -10.2307F, 2.0995F, -1.6367F, 0.6718F, -0.0151F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(127, 58).addBox(9.0482F, -10.4645F, -1.1002F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -10.2307F, 2.0995F, -1.7817F, 1.3221F, -0.1786F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(183, 34).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -15.0307F, 2.9995F, -1.5514F, 0.2611F, 0.0216F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(179, 3).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -15.0307F, 3.0995F, -1.5378F, 0.6529F, 0.0519F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(69, 35).addBox(9.0482F, -10.4645F, -1.1002F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -15.0307F, 3.0995F, -1.4703F, 1.3064F, 0.1289F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(180, 144).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -20.1307F, 3.7995F, -1.4013F, 0.6775F, 0.1436F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(69, 32).addBox(9.0482F, -10.4645F, -1.1002F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -20.1307F, 3.7995F, -1.0473F, 1.3048F, 0.5449F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(183, 102).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -20.1307F, 3.6995F, -1.4415F, 0.2918F, 0.059F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -5.5F, -7.5F, 32.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3724F, -24.4661F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(37, 27).addBox(-2.0F, -1.8186F, 0.2757F, 4.0F, 4.0F, 23.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -23.2718F, 3.015F, -1.7191F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.8F, 3.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-31.0482F, -10.4645F, -1.1002F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.3307F, 1.8995F, -0.6872F, -1.2613F, -0.8942F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(127, 84).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.3307F, 1.8995F, -1.26F, -0.692F, -0.2367F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.3307F, 1.7995F, -1.3292F, -0.3185F, -0.0964F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(123, 26).mirror().addBox(1.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -1.8939F, 4.531F, -2.1996F, 1.3192F, -2.2187F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(144, 84).mirror().addBox(1.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2194F, -6.2939F, 4.231F, -2.4829F, 1.3815F, -2.4954F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(127, 55).mirror().addBox(-28.0482F, -10.4645F, -1.1002F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -7.0307F, 1.8995F, -0.5768F, -1.2432F, -0.9994F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(143, 16).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -7.0307F, 1.8995F, -1.2103F, -0.7001F, -0.2689F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -7.0307F, 1.7995F, -1.2907F, -0.3323F, -0.109F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(81, 98).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.3307F, 1.7995F, -1.3292F, 0.3185F, 0.0964F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(127, 84).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.3307F, 1.8995F, -1.26F, 0.692F, 0.2367F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(104, 20).addBox(9.0482F, -10.4645F, -1.1002F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.3307F, 1.8995F, -0.6872F, 1.2613F, 0.8942F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(127, 55).addBox(9.0482F, -10.4645F, -1.1002F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -7.0307F, 1.8995F, -0.5768F, 1.2432F, 0.9994F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(143, 16).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -7.0307F, 1.8995F, -1.2103F, 0.7001F, 0.2689F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 99).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -7.0307F, 1.7995F, -1.2907F, 0.3323F, 0.109F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(29, 72).mirror().addBox(-24.0482F, -10.4645F, -1.1002F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -11.4307F, 1.8995F, -0.2634F, -1.1956F, -1.2906F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(145, 47).mirror().addBox(-13.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -11.4307F, 1.8995F, -1.0671F, -0.7479F, -0.3604F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(99, 52).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -11.4307F, 1.7995F, -1.1875F, -0.3993F, -0.1425F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(113, 92).mirror().addBox(-0.7161F, -0.6638F, -2.4866F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -12.3004F, 2.5987F, -2.9383F, 1.4236F, -3.0322F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(53, 162).mirror().addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7686F, -11.3962F, 6.1287F, 0.0166F, -0.1308F, 0.0073F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(29, 72).addBox(9.0482F, -10.4645F, -1.1002F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -11.4307F, 1.8995F, -0.2634F, 1.1956F, 1.2906F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(145, 47).addBox(5.5433F, -2.7939F, -1.1002F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -11.4307F, 1.8995F, -1.0671F, 0.7479F, 0.3604F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(99, 52).addBox(0.0F, -0.5F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -11.4307F, 1.7995F, -1.1875F, 0.3993F, 0.1425F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(150, 1).mirror().addBox(-0.5F, 0.1087F, 0.1383F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -4.0932F, -29.9117F, -1.8562F, 0.3942F, 0.4718F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(144, 142).mirror().addBox(-0.7982F, 0.0325F, -0.3539F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.0694F, 4.7744F, -32.925F, -0.8391F, 0.1529F, 0.8061F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(1.9595F, 8.6332F, 5.2964F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -3.7932F, -29.9117F, -0.6514F, 0.271F, 0.9679F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -3.7932F, -29.9117F, -1.7013F, 0.5639F, 0.6657F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(173, 93).mirror().addBox(-0.6259F, 0.2342F, -0.1034F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -3.7932F, -29.9117F, -1.6091F, 0.6359F, 0.84F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(119, 169).mirror().addBox(-1.47F, 0.1501F, -9.045F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.5773F, 6.8251F, -25.2497F, -0.8975F, 0.3847F, 1.0323F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(170, 56).mirror().addBox(-0.7957F, 0.1248F, -0.9231F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0714F, -3.2098F, -30.1257F, -1.4136F, 0.7217F, 1.0155F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(20, 124).mirror().addBox(0.1669F, 3.8178F, 5.0513F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0714F, -3.2098F, -30.1257F, -0.718F, 0.4439F, 1.1571F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(145, 34).mirror().addBox(-0.5F, 0.1087F, 0.1383F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, -4.0932F, -29.9117F, -0.8738F, 0.1478F, 1.259F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(144, 127).mirror().addBox(0.0F, -1.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 83).mirror().addBox(-3.0F, -1.0F, -2.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -6.132F, -29.1848F, -1.9551F, 0.0829F, 0.202F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(133, 111).mirror().addBox(-0.5F, -5.7857F, 0.7918F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -19.7817F, -16.0556F, -0.7798F, -1.1535F, -0.8782F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-1.5391F, -4.7066F, -1.1151F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.806F, -12.6556F, -21.9595F, -1.6408F, -0.3427F, 0.8467F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(161, 137).mirror().addBox(-1.0F, -4.2F, -4.5F, 2.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9433F, -13.8372F, -21.4371F, -1.6961F, -0.3254F, 1.4014F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-2.2339F, -5.1704F, 0.5525F, 2.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.2131F, -12.6579F, -18.6105F, 0.0F, -0.0785F, 0.7679F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(145, 84).mirror().addBox(-2.3284F, 0.2997F, -3.3165F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.5339F, -11.5309F, -18.6105F, -0.0873F, -0.0785F, 0.4363F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(128, 154).mirror().addBox(-1.0F, -3.4823F, -1.1588F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.5F, -5.422F, -12.8239F, -0.48F, 0.0436F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(151, 155).mirror().addBox(-3.5792F, -2.2459F, 7.0451F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.5F, -5.422F, -12.8239F, -0.3391F, 0.3513F, -0.169F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 85).addBox(-0.4609F, -4.7066F, -1.1151F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.806F, -12.6556F, -21.9595F, -1.6408F, 0.3427F, -0.8467F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(161, 137).addBox(-1.0F, -4.2F, -4.5F, 2.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9433F, -13.8372F, -21.4371F, -1.6961F, 0.3254F, -1.4014F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(145, 84).addBox(0.3284F, 0.2997F, -3.3165F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.5339F, -11.5309F, -18.6105F, -0.0873F, 0.0785F, -0.4363F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 60).addBox(0.2339F, -5.1704F, 0.5525F, 2.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2131F, -12.6579F, -18.6105F, 0.0F, 0.0785F, -0.7679F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(128, 154).addBox(-1.0F, -3.4823F, -1.1588F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.5F, -5.422F, -12.8239F, -0.48F, -0.0436F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(151, 155).addBox(1.5792F, -2.2459F, 7.0451F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.5F, -5.422F, -12.8239F, -0.3391F, -0.3513F, 0.169F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.0F, -2.2789F, -5.9583F, -0.5059F, 0.3082F, -0.1665F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(69, 38).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -2.2789F, -5.9583F, -0.5059F, -0.3082F, 0.1665F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(77, 63).addBox(-2.0F, -1.5638F, -1.0095F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.333F, 0.9079F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(133, 111).addBox(-0.5F, -5.7857F, 0.7918F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.7817F, -16.0556F, -0.7798F, 1.1535F, 0.8782F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(48, 101).addBox(-3.1426F, 0.0F, 1.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6426F, -20.6667F, -16.5841F, -1.242F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 108).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -1.8939F, 4.531F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(123, 26).addBox(-2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -1.8939F, 4.531F, -2.1996F, -1.3192F, 2.2187F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(42, 149).addBox(-2.7194F, -1.0327F, -3.4124F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -6.2939F, 4.231F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(144, 84).addBox(-2.0972F, -1.2892F, -3.1886F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2194F, -6.2939F, 4.231F, -2.4829F, -1.3815F, 2.4954F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 162).addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7686F, -11.3962F, 6.1287F, 0.0166F, 0.1308F, -0.0073F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(113, 92).addBox(-0.2839F, -0.6638F, -2.4866F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -12.3004F, 2.5987F, -2.9383F, -1.4236F, 3.0322F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(170, 56).addBox(-1.2043F, 0.1248F, -0.9231F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0714F, -3.2098F, -30.1257F, -1.4136F, -0.7217F, -1.0155F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(20, 124).addBox(-2.1669F, 3.8178F, 5.0513F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0714F, -3.2098F, -30.1257F, -0.718F, -0.4439F, -1.1571F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(173, 93).addBox(-1.3741F, 0.2342F, -0.1034F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -3.7932F, -29.9117F, -1.6091F, -0.6359F, -0.84F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(119, 169).addBox(-0.53F, 0.1501F, -9.045F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5773F, 6.8251F, -25.2497F, -0.8975F, -0.3847F, -1.0323F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(24, 85).addBox(-3.9595F, 8.6332F, 5.2964F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -3.7932F, -29.9117F, -0.6514F, -0.271F, -0.9679F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 43).addBox(-1.3741F, 0.2342F, -0.1034F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -3.7932F, -29.9117F, -1.7013F, -0.5639F, -0.6657F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(144, 142).addBox(-1.2018F, 0.0325F, -0.3539F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0694F, 4.7744F, -32.925F, -0.8391F, -0.1529F, -0.8061F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(150, 1).addBox(-1.5F, 0.1087F, 0.1383F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -4.0932F, -29.9117F, -1.8562F, -0.3942F, -0.4718F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(145, 34).addBox(-1.5F, 0.1087F, 0.1383F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -4.0932F, -29.9117F, -0.8738F, -0.1478F, -1.259F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(144, 127).addBox(-3.0F, -1.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(160, 83).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -6.132F, -29.1848F, -1.9551F, -0.0829F, -0.202F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(160, 71).addBox(-1.5F, -3.7832F, -13.0477F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(185, 147).addBox(-1.5F, -4.7832F, -16.0477F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -8.95F, -24.5F));

		PartDefinition cube_r201 = leftArm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(142, 155).addBox(-3.4F, -1.0F, -2.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.1613F, -0.1496F, -0.6003F, -0.484F, 0.3084F));

		PartDefinition cube_r202 = leftArm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(23, 137).addBox(-1.0F, 1.4F, -4.5F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -3.2832F, -1.0477F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftArm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(93, 172).addBox(-0.5F, -3.2562F, -2.7981F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.0939F, -2.5898F, -0.912F, 0.2224F, 0.2139F));

		PartDefinition cube_r204 = leftArm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(180, 78).addBox(0.3281F, -0.1161F, -5.0912F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.2F, -5.0939F, -2.5898F, 0.2836F, 0.2224F, 0.2139F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(33, 80).addBox(-1.0F, 1.1142F, -14.6226F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(123, 23).addBox(-0.5F, -2.1858F, -13.6226F, 3.0F, 2.0F, 13.0F, new CubeDeformation(-0.12F))
				.texOffs(125, 127).addBox(-1.2F, -2.1858F, -0.9226F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.5F, -4.3855F, -17.0197F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(25, 175).addBox(-4.5F, 1.1552F, -7.9205F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(125, 143).addBox(-3.5F, -0.8448F, -7.9205F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(166, 162).addBox(2.5F, 1.1552F, -7.9205F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5111F, -13.9829F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftArm3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(129, 179).addBox(-0.017F, -0.4889F, -3.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 1.6552F, -3.9205F, 0.0F, 0.3491F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(66, 158).addBox(-2.5F, -3.7832F, -13.0477F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(185, 40).addBox(-2.5F, -4.7832F, -16.0477F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, -8.95F, -24.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightArm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(103, 72).addBox(0.4F, -1.0F, -2.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1613F, -0.1496F, -0.6003F, 0.484F, -0.3084F));

		PartDefinition cube_r207 = rightArm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(104, 135).addBox(-3.0F, 1.4F, -4.5F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -3.2832F, -1.0477F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightArm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 63).addBox(-0.5F, -3.2562F, -2.7981F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -1.0939F, -2.5898F, -0.912F, -0.2224F, -0.2139F));

		PartDefinition cube_r209 = rightArm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(42, 137).addBox(-1.3281F, -0.1161F, -5.0912F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.2F, -5.0939F, -2.5898F, 0.2836F, -0.2224F, -0.2139F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(79, 11).addBox(-3.0F, 1.1142F, -14.6226F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(26, 121).addBox(-2.5F, -2.1858F, -13.6226F, 3.0F, 2.0F, 13.0F, new CubeDeformation(-0.12F))
				.texOffs(104, 10).addBox(-2.8F, -2.1858F, -0.9226F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.5F, -4.3855F, -17.0197F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(155, 174).addBox(2.5F, 1.1552F, -7.9205F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(143, 23).addBox(-3.5F, -0.8448F, -7.9205F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(166, 0).addBox(-4.5F, 1.1552F, -7.9205F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5111F, -13.9829F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightArm3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(92, 164).addBox(-0.983F, -0.4889F, -3.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.6552F, -3.9205F, 0.0F, -0.3491F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.7F, 0.95F, -0.3747F, 0.0747F, 0.2995F));

		PartDefinition cube_r211 = neck1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(37, 27).addBox(-2.0F, -11.9529F, -2.4544F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -5.2961F, -0.0567F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(59, 105).addBox(-0.7641F, -4.5206F, -0.8069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.6004F, 2.2487F, -0.6793F, -0.5176F, 0.5631F));

		PartDefinition cube_r213 = neck1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(7, 27).mirror().addBox(0.6436F, 0.3216F, -9.7648F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5771F, -2.1004F, 2.4487F, 0.3591F, 0.4957F, -0.0093F));

		PartDefinition cube_r214 = neck1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(46, 121).mirror().addBox(0.6436F, 0.5889F, -9.153F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5771F, -2.1004F, 2.4487F, 0.01F, 0.4957F, -0.0093F));

		PartDefinition cube_r215 = neck1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(185, 65).mirror().addBox(-4.4722F, -0.6909F, -5.1434F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.1004F, 2.2487F, -0.1217F, -0.3647F, 0.1592F));

		PartDefinition cube_r216 = neck1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(190, 52).mirror().addBox(-8.8026F, -3.2484F, -3.4631F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.1004F, 2.2487F, 0.2302F, -0.6972F, -0.4874F));

		PartDefinition cube_r217 = neck1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(189, 78).mirror().addBox(-8.9665F, -1.3699F, 2.1251F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.1004F, 2.2487F, 0.6799F, -1.2116F, -0.6274F));

		PartDefinition cube_r218 = neck1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(193, 155).mirror().addBox(-4.6887F, 0.7709F, 1.0452F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.1004F, 2.2487F, -0.5228F, -0.9622F, 0.5869F));

		PartDefinition cube_r219 = neck1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(160, 83).mirror().addBox(-2.0577F, -0.7452F, 0.712F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.1004F, 2.2487F, -0.0941F, -0.9902F, -0.3383F));

		PartDefinition cube_r220 = neck1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(104, 135).mirror().addBox(-1.5161F, -2.0638F, -1.3866F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.6004F, 2.2487F, 0.071F, 0.6229F, -0.0515F));

		PartDefinition cube_r221 = neck1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 160).mirror().addBox(0.9725F, -0.1967F, -1.9793F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -2.6004F, 2.2487F, 0.2762F, -0.1761F, 0.018F));

		PartDefinition cube_r222 = neck1.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(7, 27).addBox(-0.6436F, 0.3216F, -9.7648F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5771F, -2.1004F, 2.4487F, 0.3591F, -0.4957F, 0.0093F));

		PartDefinition cube_r223 = neck1.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(46, 121).addBox(-0.6436F, 0.5889F, -9.153F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5771F, -2.1004F, 2.4487F, 0.01F, -0.4957F, 0.0093F));

		PartDefinition cube_r224 = neck1.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(185, 65).addBox(-0.5278F, -0.6909F, -5.1434F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.1004F, 2.2487F, -0.1217F, 0.3647F, -0.1592F));

		PartDefinition cube_r225 = neck1.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(190, 52).addBox(4.8026F, -3.2484F, -3.4631F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.1004F, 2.2487F, 0.2302F, 0.6972F, 0.4874F));

		PartDefinition cube_r226 = neck1.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(189, 78).addBox(3.9665F, -1.3699F, 2.1251F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.1004F, 2.2487F, 0.6799F, 1.2116F, 0.6274F));

		PartDefinition cube_r227 = neck1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(160, 83).addBox(0.0577F, -0.7452F, 0.712F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.1004F, 2.2487F, -0.0941F, 0.9902F, 0.3383F));

		PartDefinition cube_r228 = neck1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(193, 155).addBox(1.6887F, 0.7709F, 1.0452F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.1004F, 2.2487F, -0.5228F, 0.9622F, -0.5869F));

		PartDefinition cube_r229 = neck1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(104, 135).addBox(0.5161F, -2.0638F, -1.3866F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.6004F, 2.2487F, 0.071F, -0.6229F, 0.0515F));

		PartDefinition cube_r230 = neck1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 160).addBox(-0.9725F, -0.1967F, -1.9793F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -2.6004F, 2.2487F, 0.2762F, 0.1761F, -0.018F));

		PartDefinition cube_r231 = neck1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(170, 60).mirror().addBox(0.8364F, 0.5827F, -7.3253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, 0.1418F, 0.484F, -0.1118F));

		PartDefinition cube_r232 = neck1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(0.8364F, 0.1367F, -7.1473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, -0.2072F, 0.484F, -0.1118F));

		PartDefinition cube_r233 = neck1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(186, 97).mirror().addBox(-2.2776F, -1.5394F, -4.8048F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, -0.322F, -0.3277F, 0.2274F));

		PartDefinition cube_r234 = neck1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 191).mirror().addBox(-6.5079F, -2.8437F, -3.9335F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, -0.0077F, -0.7737F, -0.3273F));

		PartDefinition cube_r235 = neck1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(189, 81).mirror().addBox(-7.1801F, -1.6248F, 0.5777F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, 0.1085F, -1.2812F, -0.084F));

		PartDefinition cube_r236 = neck1.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(194, 6).mirror().addBox(-2.9149F, -0.312F, -0.1086F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.8489F, 0.8317F, -0.7633F, -0.8405F, 0.7761F));

		PartDefinition cube_r237 = neck1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(160, 86).mirror().addBox(-0.1108F, -0.3136F, -0.3682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -6.9489F, 1.0317F, -0.4492F, -1.0265F, -0.037F));

		PartDefinition cube_r238 = neck1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 164).mirror().addBox(0.0F, -2.0F, -4.6F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.686F, -6.2615F, 5.1799F, 0.1714F, -0.2163F, 0.0289F));

		PartDefinition cube_r239 = neck1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.7099F, -1.9986F, -2.5293F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -7.6004F, 3.5487F, -0.057F, 0.6137F, -0.1257F));

		PartDefinition cube_r240 = neck1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(113, 4).mirror().addBox(0.3851F, -3.6399F, -1.7006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -7.6004F, 3.5487F, -0.7781F, 0.4596F, -0.6096F));

		PartDefinition cube_r241 = neck1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(113, 4).addBox(-1.3851F, -3.6399F, -1.7006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -7.6004F, 3.5487F, -0.7781F, -0.4596F, 0.6096F));

		PartDefinition cube_r242 = neck1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(160, 86).addBox(-1.8892F, -0.3136F, -0.3682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.9489F, 1.0317F, -0.4492F, 1.0265F, 0.037F));

		PartDefinition cube_r243 = neck1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(82, 164).addBox(0.0F, -2.0F, -4.6F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.686F, -6.2615F, 5.1799F, 0.1714F, 0.2163F, -0.0289F));

		PartDefinition cube_r244 = neck1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 140).addBox(-0.2901F, -1.9986F, -2.5293F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -7.6004F, 3.5487F, -0.057F, -0.6137F, 0.1257F));

		PartDefinition cube_r245 = neck1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(189, 81).addBox(2.1801F, -1.6248F, 0.5777F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, 0.1085F, 1.2812F, 0.084F));

		PartDefinition cube_r246 = neck1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(194, 6).addBox(-0.0851F, -0.312F, -0.1086F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, -0.7633F, 0.8405F, -0.7761F));

		PartDefinition cube_r247 = neck1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(170, 60).addBox(-1.8364F, 0.5827F, -7.3253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, 0.1418F, -0.484F, 0.1118F));

		PartDefinition cube_r248 = neck1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(58, 80).addBox(-1.8364F, 0.1367F, -7.1473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, -0.2072F, -0.484F, 0.1118F));

		PartDefinition cube_r249 = neck1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(186, 97).addBox(-2.7224F, -1.5394F, -4.8048F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, -0.322F, 0.3277F, -0.2274F));

		PartDefinition cube_r250 = neck1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 191).addBox(2.5079F, -2.8437F, -3.9335F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -6.8489F, 0.8317F, -0.0077F, 0.7737F, 0.3273F));

		PartDefinition cube_r251 = neck1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(158, 170).mirror().addBox(0.3851F, -3.6399F, -1.7006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -13.6004F, 3.5487F, -0.7781F, 0.4596F, -0.6096F));

		PartDefinition cube_r252 = neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(158, 170).addBox(-1.3851F, -3.6399F, -1.7006F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -13.6004F, 3.5487F, -0.7781F, -0.4596F, 0.6096F));

		PartDefinition cube_r253 = neck1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(174, 29).mirror().addBox(-0.5F, 0.0736F, -0.7445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6174F, -12.4441F, -6.1795F, -0.0517F, 0.4568F, -0.1997F));

		PartDefinition cube_r254 = neck1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(99, 38).mirror().addBox(-0.5F, -2.5925F, -1.1374F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6174F, -12.4441F, -6.1795F, -0.4007F, 0.4568F, -0.1997F));

		PartDefinition cube_r255 = neck1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(187, 170).mirror().addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0961F, -15.2276F, -2.8948F, -0.4991F, -0.2837F, 0.2808F));

		PartDefinition cube_r256 = neck1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(192, 72).mirror().addBox(-2.4384F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.731F, -15.1152F, -5.7962F, -0.2499F, -0.8155F, -0.154F));

		PartDefinition cube_r257 = neck1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(189, 132).mirror().addBox(-7.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -12.9489F, 1.0317F, -0.466F, -1.2467F, 0.4651F));

		PartDefinition cube_r258 = neck1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(13, 194).mirror().addBox(-3.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -12.9489F, 1.0317F, -0.9276F, -0.7109F, 0.8915F));

		PartDefinition cube_r259 = neck1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(194, 9).mirror().addBox(-1.1108F, -0.3136F, -0.3682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9737F, -12.9489F, 1.0317F, -0.4492F, -1.0265F, -0.037F));

		PartDefinition cube_r260 = neck1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(121, 179).mirror().addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4374F, -14.7957F, 4.3826F, 0.0841F, -0.2163F, 0.0289F));

		PartDefinition cube_r261 = neck1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(72, 105).mirror().addBox(-0.7099F, -2.9986F, -2.5293F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9771F, -13.6004F, 3.5487F, -0.057F, 0.6137F, -0.1257F));

		PartDefinition cube_r262 = neck1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(121, 179).addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4374F, -14.7957F, 4.3826F, 0.0841F, 0.2163F, -0.0289F));

		PartDefinition cube_r263 = neck1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(72, 105).addBox(-0.2901F, -2.9986F, -2.5293F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9771F, -13.6004F, 3.5487F, -0.057F, -0.6137F, 0.1257F));

		PartDefinition cube_r264 = neck1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(194, 9).addBox(-1.8892F, -0.3136F, -0.3682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -12.9489F, 1.0317F, -0.4492F, 1.0265F, 0.037F));

		PartDefinition cube_r265 = neck1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(13, 194).addBox(0.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -12.9489F, 1.0317F, -0.9276F, 0.7109F, -0.8915F));

		PartDefinition cube_r266 = neck1.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(187, 170).addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0961F, -15.2276F, -2.8948F, -0.4991F, 0.2837F, -0.2808F));

		PartDefinition cube_r267 = neck1.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(192, 72).addBox(-1.5616F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.731F, -15.1152F, -5.7962F, -0.2499F, 0.8155F, 0.154F));

		PartDefinition cube_r268 = neck1.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(189, 132).addBox(2.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9737F, -12.9489F, 1.0317F, -0.466F, 1.2467F, -0.4651F));

		PartDefinition cube_r269 = neck1.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(99, 38).addBox(-0.5F, -2.5925F, -1.1374F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6174F, -12.4441F, -6.1795F, -0.4007F, -0.4568F, 0.1997F));

		PartDefinition cube_r270 = neck1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(174, 29).addBox(-0.5F, 0.0736F, -0.7445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6174F, -12.4441F, -6.1795F, -0.0517F, -0.4568F, 0.1997F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.3067F, -0.5158F, -0.1711F, -0.0914F, 0.2372F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(83, 162).mirror().addBox(-0.5F, 0.0864F, -0.7213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7194F, -3.1753F, -5.0706F, 0.1466F, -0.1392F, -0.3207F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(29, 60).mirror().addBox(-0.5F, -2.5884F, -0.7113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7194F, -3.1753F, -5.0706F, -0.2461F, -0.1392F, -0.3207F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(133, 169).mirror().addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0961F, -5.9432F, -1.9646F, -0.4991F, -0.2837F, 0.2808F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(156, 137).mirror().addBox(-2.4384F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.731F, -5.8308F, -4.866F, -0.2499F, -0.8155F, -0.154F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(188, 24).mirror().addBox(-7.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -3.6646F, 1.9619F, -0.466F, -1.2467F, 0.4651F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(24, 174).mirror().addBox(-3.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -3.6646F, 1.9619F, -0.9276F, -0.7109F, 0.8915F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(12, 175).mirror().addBox(-0.7108F, -0.6136F, -0.7682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -3.6646F, 1.9619F, -0.2882F, -0.6584F, -0.2487F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(177, 65).mirror().addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4374F, -5.5114F, 5.3128F, 0.0841F, -0.2163F, 0.0289F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(165, 155).mirror().addBox(0.0757F, -2.5065F, -0.6277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3374F, -5.8352F, 4.6698F, -0.7781F, 0.4596F, -0.5659F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(89, 108).mirror().addBox(-0.4555F, -1.4922F, -2.0847F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3374F, -5.8352F, 4.6698F, -0.0263F, 0.6155F, -0.0287F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(83, 162).addBox(-0.5F, 0.0864F, -0.7213F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7194F, -3.1753F, -5.0706F, 0.1466F, 0.1392F, 0.3207F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(29, 60).addBox(-0.5F, -2.5884F, -0.7113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7194F, -3.1753F, -5.0706F, -0.2461F, 0.1392F, 0.3207F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(133, 169).addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0961F, -5.9432F, -1.9646F, -0.4991F, 0.2837F, -0.2808F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(156, 137).addBox(-1.5616F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.731F, -5.8308F, -4.866F, -0.2499F, 0.8155F, 0.154F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(188, 24).addBox(2.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -3.6646F, 1.9619F, -0.466F, 1.2467F, -0.4651F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(24, 174).addBox(0.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -3.6646F, 1.9619F, -0.9276F, 0.7109F, -0.8915F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(12, 175).addBox(-2.2892F, -0.6136F, -0.7682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -3.6646F, 1.9619F, -0.2882F, 0.6584F, 0.2487F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(99, 164).mirror().addBox(-0.5F, 0.0325F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7149F, -11.21F, -3.9494F, -0.2785F, -0.2391F, -0.3519F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5F, -2.5567F, -0.2652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7149F, -11.21F, -3.9494F, 0.2451F, -0.2391F, -0.3519F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(158, 50).mirror().addBox(-2.4384F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.731F, -13.7308F, -4.066F, -0.2499F, -0.8155F, -0.154F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(188, 126).mirror().addBox(-7.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -11.5646F, 2.7619F, -0.466F, -1.2467F, 0.4651F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(175, 68).mirror().addBox(-0.7108F, -0.6136F, -0.7682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -11.5646F, 2.7619F, -0.2882F, -0.6584F, -0.2487F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(175, 65).mirror().addBox(-3.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -11.5646F, 2.7619F, -0.9276F, -0.7109F, 0.8915F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(24, 170).mirror().addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0961F, -13.8432F, -1.1646F, -0.4991F, -0.2837F, 0.2808F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(106, 177).mirror().addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4374F, -12.2114F, 5.4128F, 0.0841F, -0.2163F, 0.0289F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.4073F, -1.3674F, -2.2887F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2593F, -12.6455F, 4.9729F, -0.0876F, 0.6105F, -0.0916F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(0.0581F, -2.9972F, -0.9519F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2593F, -12.6455F, 4.9729F, -0.7781F, 0.4596F, -0.5223F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -2.5567F, -0.2652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7149F, -11.21F, -3.9494F, 0.2451F, 0.2391F, 0.3519F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(99, 164).addBox(-0.5F, 0.0325F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7149F, -11.21F, -3.9494F, -0.2785F, 0.2391F, 0.3519F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(24, 170).addBox(-2.5F, -0.8F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0961F, -13.8432F, -1.1646F, -0.4991F, 0.2837F, -0.2808F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(158, 50).addBox(-1.5616F, -1.9476F, 1.0603F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.731F, -13.7308F, -4.066F, -0.2499F, 0.8155F, 0.154F));

		PartDefinition cube_r302 = neck2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(188, 126).addBox(2.8437F, -1.5246F, 0.3785F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -11.5646F, 2.7619F, -0.466F, 1.2467F, -0.4651F));

		PartDefinition cube_r303 = neck2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(175, 65).addBox(0.3716F, 0.1124F, -0.4268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -11.5646F, 2.7619F, -0.9276F, 0.7109F, -0.8915F));

		PartDefinition cube_r304 = neck2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(175, 68).addBox(-2.2892F, -0.6136F, -0.7682F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -11.5646F, 2.7619F, -0.2882F, 0.6584F, 0.2487F));

		PartDefinition cube_r305 = neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(166, 5).mirror().addBox(-0.3F, 0.767F, -0.6401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6969F, -18.6318F, -3.6866F, -0.291F, 0.1232F, -0.0275F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.5F, -3.25F, -0.75F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6969F, -18.6318F, -3.6866F, -0.2228F, 0.0583F, -0.2367F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(190, 48).mirror().addBox(-7.2244F, -1.8422F, -4.1736F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -19.3646F, 3.1619F, -0.5316F, -0.8253F, 0.0527F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(188, 129).mirror().addBox(-7.7987F, -1.33F, 0.3878F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -19.3646F, 3.1619F, -0.6825F, -1.1996F, 0.6687F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(114, 179).mirror().addBox(-2.333F, -0.5105F, -5.1609F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -19.3646F, 3.1619F, -0.6604F, -0.3078F, 0.2227F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(192, 174).mirror().addBox(-1.2344F, -0.0388F, -0.8739F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -19.3646F, 3.1619F, -0.117F, -0.5975F, -0.4396F));

		PartDefinition cube_r311 = neck2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(192, 177).mirror().addBox(-3.2428F, 0.2579F, -0.3794F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9737F, -19.3646F, 3.1619F, -0.996F, -0.6418F, 0.9344F));

		PartDefinition cube_r312 = neck2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(79, 178).mirror().addBox(0.0F, -0.3F, -4.2F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.608F, -19.7573F, 7.1821F, 0.0841F, -0.2163F, 0.0289F));

		PartDefinition cube_r313 = neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(16, 27).mirror().addBox(-0.7099F, -2.9986F, -2.5293F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -18.5161F, 5.2789F, -0.0876F, 0.6105F, -0.048F));

		PartDefinition cube_r314 = neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(32, 124).mirror().addBox(0.3851F, -6.3399F, -1.9006F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -18.5161F, 5.2789F, -0.7781F, 0.4596F, -0.4787F));

		PartDefinition cube_r315 = neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(192, 174).addBox(-2.7656F, -0.0388F, -0.8739F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -19.3646F, 3.1619F, -0.117F, 0.5975F, 0.4396F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(192, 177).addBox(0.2428F, 0.2579F, -0.3794F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -19.3646F, 3.1619F, -0.996F, 0.6418F, -0.9344F));

		PartDefinition cube_r317 = neck2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(114, 179).addBox(-2.667F, -0.5105F, -5.1609F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -19.3646F, 3.1619F, -0.6604F, 0.3078F, -0.2227F));

		PartDefinition cube_r318 = neck2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(190, 48).addBox(3.2244F, -1.8422F, -4.1736F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -19.3646F, 3.1619F, -0.5316F, 0.8253F, -0.0527F));

		PartDefinition cube_r319 = neck2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(188, 129).addBox(2.7987F, -1.33F, 0.3878F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9737F, -19.3646F, 3.1619F, -0.6825F, 1.1996F, -0.6687F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(166, 5).addBox(-0.7F, 0.767F, -0.6401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6969F, -18.6318F, -3.6866F, -0.291F, -0.1232F, 0.0275F));

		PartDefinition cube_r321 = neck2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -3.25F, -0.75F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6969F, -18.6318F, -3.6866F, -0.2228F, -0.0583F, 0.2367F));

		PartDefinition cube_r322 = neck2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(74, 128).addBox(-2.0F, -0.7F, -3.4F, 4.0F, 25.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.5632F, 4.1558F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(177, 65).addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4374F, -5.5114F, 5.3128F, 0.0841F, 0.2163F, -0.0289F));

		PartDefinition cube_r324 = neck2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(165, 155).addBox(-1.0757F, -2.5065F, -0.6277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3374F, -5.8352F, 4.6698F, -0.7781F, -0.4596F, 0.5659F));

		PartDefinition cube_r325 = neck2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(89, 108).addBox(-0.5445F, -1.4922F, -2.0847F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3374F, -5.8352F, 4.6698F, -0.0263F, -0.6155F, 0.0287F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 177).addBox(0.0F, 0.1F, -3.9F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4374F, -12.2114F, 5.4128F, 0.0841F, 0.2163F, -0.0289F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5927F, -1.3674F, -2.2887F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2593F, -12.6455F, 4.9729F, -0.0876F, -0.6105F, 0.0916F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(103, 72).addBox(-1.0581F, -2.9972F, -0.9519F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2593F, -12.6455F, 4.9729F, -0.7781F, -0.4596F, 0.5223F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(32, 124).addBox(-1.3851F, -6.3399F, -1.9006F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -18.5161F, 5.2789F, -0.7781F, -0.4596F, 0.4787F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(16, 27).addBox(-0.2901F, -2.9986F, -2.5293F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -18.5161F, 5.2789F, -0.0876F, -0.6105F, 0.048F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(79, 178).addBox(0.0F, -0.3F, -4.2F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.608F, -19.7573F, 7.1821F, 0.0841F, 0.2163F, -0.0289F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.2377F, 3.1173F, -0.1765F, -0.2633F, 0.2678F));

		PartDefinition cube_r332 = neck3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(40, 162).addBox(-1.5F, -0.1522F, -1.8013F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0374F, 2.8717F, -0.1309F, 0.0F, -0.0175F));

		PartDefinition cube_r333 = neck3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(148, 147).mirror().addBox(-0.5F, -0.1172F, -1.9316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-6.8697F, -2.6276F, -5.2629F, 0.8996F, -0.2391F, -0.2384F));

		PartDefinition cube_r334 = neck3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-0.5F, -2.4827F, -0.2792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8697F, -2.6276F, -5.2629F, -0.0603F, -0.2391F, -0.2384F));

		PartDefinition cube_r335 = neck3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(134, 192).mirror().addBox(-2.0F, -0.3F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8049F, -4.6025F, -3.1475F, -0.9709F, -1.0438F, 1.0486F));

		PartDefinition cube_r336 = neck3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(133, 173).mirror().addBox(-2.5037F, -0.0471F, -0.7797F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7294F, -4.0083F, 0.472F, -0.2108F, -1.0553F, 0.0906F));

		PartDefinition cube_r337 = neck3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-0.6877F, -1.1074F, -0.3745F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1371F, -4.8973F, -5.2174F, -0.1506F, -0.8024F, -0.2433F));

		PartDefinition cube_r338 = neck3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(103, 63).mirror().addBox(-0.5638F, -0.8423F, -0.3331F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8353F, -5.5781F, -2.9067F, -0.4198F, -0.515F, 0.1917F));

		PartDefinition cube_r339 = neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(185, 69).mirror().addBox(-0.2718F, 0.1755F, -0.8371F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.572F, -4.1483F, 0.9777F, -0.1987F, -0.4521F, -0.2642F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(0.0F, 5.1867F, -0.8205F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.7812F, 3.2379F, -0.134F, -0.2163F, 0.0115F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(0.6333F, -4.2309F, -1.5627F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -3.1158F, 3.5333F, -0.8461F, 0.4265F, -0.5253F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(24, 85).mirror().addBox(-0.3684F, -2.9139F, -2.0154F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -3.1158F, 3.5333F, -0.1724F, 0.6055F, -0.1139F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -2.4827F, -0.2792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8697F, -2.6276F, -5.2629F, -0.0603F, 0.2391F, 0.221F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(148, 147).addBox(-0.5F, -0.1172F, -1.9316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(6.8697F, -2.6276F, -5.2629F, 0.8996F, 0.2391F, 0.221F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(66, 80).addBox(-3.3123F, -1.1074F, -0.3745F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1371F, -4.8973F, -5.2174F, -0.1506F, 0.8024F, 0.2259F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(103, 63).addBox(-5.4362F, -0.8423F, -0.3331F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8353F, -5.5781F, -2.9067F, -0.4198F, 0.515F, -0.2092F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(134, 192).addBox(-2.0F, -0.3F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8049F, -4.6025F, -3.1475F, -0.9709F, 1.0438F, -1.066F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(133, 173).addBox(-0.4963F, -0.0471F, -0.7797F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7294F, -4.0083F, 0.472F, -0.2108F, 1.0553F, -0.1081F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(185, 69).addBox(-4.7282F, 0.1755F, -0.8371F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.572F, -4.1483F, 0.9777F, -0.1987F, 0.4521F, 0.2468F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(6, 43).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7843F, -13.9652F, 5.4057F, -0.8124F, 0.4433F, -0.4936F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(105, 92).mirror().addBox(0.0F, -2.0F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.515F, -10.2843F, 5.6473F, 0.0841F, -0.2163F, 0.0289F));

		PartDefinition cube_r352 = neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(83, 158).mirror().addBox(-0.5F, 0.0261F, -2.1364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.7739F, -10.0969F, -2.2302F, 1.0343F, -0.2367F, -0.2091F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(11, 85).mirror().addBox(-0.5F, -3.2327F, -0.2792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7739F, -10.0969F, -2.2302F, 0.0744F, -0.2367F, -0.2091F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-3.4584F, -0.8546F, -4.1717F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9171F, -12.1834F, 1.6483F, 0.044F, -0.7586F, -0.3735F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(187, 37).mirror().addBox(-4.8798F, -0.4726F, -1.0801F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9171F, -12.1834F, 1.6483F, -0.5777F, -1.2176F, 0.5179F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-1.1264F, -0.3441F, -2.4916F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, -13.0003F, 1.3498F, -0.2218F, -0.6441F, -0.1168F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(188, 21).mirror().addBox(-4.7683F, -1.0644F, 0.2577F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -12.1003F, 3.1498F, -0.2217F, -0.5566F, -0.0343F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-0.3506F, -3.2122F, -2.0419F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -10.2158F, 4.4333F, -0.1301F, 0.6084F, -0.0723F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(24, 96).addBox(-1.8736F, -0.3441F, -2.4916F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -13.0003F, 1.3498F, -0.2218F, 0.6441F, 0.1168F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5416F, -0.8546F, -4.1717F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9171F, -12.1834F, 1.6483F, 0.044F, 0.7586F, 0.3735F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(83, 158).addBox(-0.5F, 0.0261F, -2.1364F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.7739F, -10.0969F, -2.2302F, 1.0343F, 0.2367F, 0.2091F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 105).addBox(0.0F, 5.1867F, -0.8205F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7812F, 3.2379F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(105, 92).addBox(0.0F, -2.0F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.515F, -10.2843F, 5.6473F, 0.0841F, 0.2163F, -0.0289F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 43).addBox(-1.6333F, -4.2309F, -1.5627F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -3.1158F, 3.5333F, -0.8461F, -0.4265F, 0.5079F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(24, 85).addBox(-0.6316F, -2.9139F, -2.0154F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -3.1158F, 3.5333F, -0.1724F, -0.6055F, 0.0965F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(6, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7843F, -13.9652F, 5.4057F, -0.8124F, -0.4433F, 0.4936F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(39, 85).addBox(-0.6494F, -3.2122F, -2.0419F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -10.2158F, 4.4333F, -0.1301F, -0.6084F, 0.0723F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(11, 85).addBox(-0.5F, -3.2327F, -0.2792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7739F, -10.0969F, -2.2302F, 0.0744F, 0.2367F, 0.2091F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(187, 37).addBox(-0.1202F, -0.4726F, -1.0801F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9171F, -12.1834F, 1.6483F, -0.5777F, 1.2176F, -0.5179F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(188, 21).addBox(-0.2317F, -1.0644F, 0.2577F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -12.1003F, 3.1498F, -0.2217F, 0.5566F, 0.0343F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.2374F, 3.4217F, 0.1344F, -0.1793F, 0.373F));

		PartDefinition cube_r371 = neck4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(53, 175).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2683F, 0.9599F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r372 = neck4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(5, 159).mirror().addBox(0.8628F, -3.9966F, 0.373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -9.5914F, 2.3306F, -0.0427F, 0.5127F, -0.4204F));

		PartDefinition cube_r373 = neck4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(180, 22).mirror().addBox(0.0F, -1.8F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6694F, -8.9721F, 3.698F, 0.0391F, -0.2595F, 0.035F));

		PartDefinition cube_r374 = neck4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(128, 154).mirror().addBox(-0.0062F, -2.5997F, -0.792F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -9.5914F, 2.3306F, 0.0616F, 0.6111F, 0.0377F));

		PartDefinition cube_r375 = neck4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(169, 57).mirror().addBox(-1.5F, -0.3F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(92, 170).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0401F, -12.7447F, -3.2156F, -0.1999F, -0.8096F, -0.1903F));

		PartDefinition cube_r376 = neck4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(148, 143).mirror().addBox(-0.5F, -0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.9657F, -9.218F, -3.0008F, 0.9639F, -0.2094F, -0.1164F));

		PartDefinition cube_r377 = neck4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(192, 105).mirror().addBox(-5.1497F, -0.5492F, 0.5306F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -11.2646F, 0.002F, -0.8607F, -1.1436F, 0.7758F));

		PartDefinition cube_r378 = neck4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(109, 38).mirror().addBox(-0.6818F, -0.9285F, 0.0395F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8408F, -12.4685F, -4.4869F, 0.4403F, -0.2094F, -0.1164F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 166).mirror().addBox(-0.211F, -0.2192F, -0.7466F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(53, 168).mirror().addBox(-0.211F, -0.6192F, -0.7466F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.208F, -12.7361F, -2.0436F, -0.5666F, -0.6413F, 0.3529F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(112, 192).mirror().addBox(-2.9844F, -0.1593F, -0.0696F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -11.2646F, 0.802F, -0.4454F, -0.7429F, 0.3123F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 166).addBox(-2.789F, -0.2192F, -0.7466F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(53, 168).addBox(-2.789F, -0.6192F, -0.7466F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.208F, -12.7361F, -2.0436F, -0.5666F, 0.6413F, -0.3529F));

		PartDefinition cube_r382 = neck4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(16, 147).mirror().addBox(-0.1264F, -0.6441F, -2.3916F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, -4.9646F, -1.398F, -0.515F, -0.6558F, 0.3217F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(143, 27).mirror().addBox(-0.4974F, 0.8372F, -3.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.7199F, -3.5786F, -4.9819F, 1.2134F, -0.227F, -0.0758F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(155, 71).mirror().addBox(-3.3584F, -0.9546F, -4.1717F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9171F, -4.1477F, -1.0996F, 0.0267F, -0.765F, -0.3512F));

		PartDefinition cube_r385 = neck4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.4974F, -1.7128F, -0.3532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7199F, -3.5786F, -4.9819F, 0.2534F, -0.227F, -0.0758F));

		PartDefinition cube_r386 = neck4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(50, 162).mirror().addBox(-4.8798F, -0.4726F, -1.0801F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9171F, -4.1477F, -1.0996F, -0.6143F, -1.2117F, 0.5626F));

		PartDefinition cube_r387 = neck4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(62, 175).mirror().addBox(-3.9683F, 0.0356F, 0.0577F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -4.0646F, 0.402F, -0.3426F, -0.6087F, 0.2012F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(0.0F, -2.7741F, -1.418F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5248F, 0.7064F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition cube_r389 = neck4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(152, 0).mirror().addBox(-0.3447F, -3.4119F, -1.051F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -1.7801F, 1.6855F, -0.0663F, 0.6112F, -0.0358F));

		PartDefinition cube_r390 = neck4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(155, 71).addBox(-1.6416F, -0.9546F, -4.1717F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9171F, -4.1477F, -1.0996F, 0.0267F, 0.765F, 0.3512F));

		PartDefinition cube_r391 = neck4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(50, 162).addBox(-0.1202F, -0.4726F, -1.0801F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9171F, -4.1477F, -1.0996F, -0.6143F, 1.2117F, -0.5626F));

		PartDefinition cube_r392 = neck4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(143, 27).addBox(-0.5026F, 0.8372F, -3.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.7199F, -3.5786F, -4.9819F, 1.2134F, 0.227F, 0.0758F));

		PartDefinition cube_r393 = neck4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5026F, -1.7128F, -0.3532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7199F, -3.5786F, -4.9819F, 0.2534F, 0.227F, 0.0758F));

		PartDefinition cube_r394 = neck4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(16, 147).addBox(-1.8736F, -0.6441F, -2.3916F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -4.9646F, -1.398F, -0.515F, 0.6558F, -0.3217F));

		PartDefinition cube_r395 = neck4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(62, 175).addBox(-0.0317F, 0.0356F, 0.0577F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -4.0646F, 0.402F, -0.3426F, 0.6087F, -0.2012F));

		PartDefinition cube_r396 = neck4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(169, 57).addBox(-1.5F, -0.3F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(92, 170).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0401F, -12.7447F, -3.2156F, -0.1999F, 0.8096F, 0.1903F));

		PartDefinition cube_r397 = neck4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(148, 143).addBox(-0.5F, -0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.9657F, -9.218F, -3.0008F, 0.9639F, 0.2094F, 0.1164F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(109, 38).addBox(-0.3182F, -0.9285F, 0.0395F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8408F, -12.4685F, -4.4869F, 0.4403F, 0.2094F, 0.1164F));

		PartDefinition cube_r399 = neck4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(192, 105).addBox(1.1497F, -0.5492F, 0.5306F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -11.2646F, 0.002F, -0.8607F, 1.1436F, -0.7758F));

		PartDefinition cube_r400 = neck4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(112, 192).addBox(-1.0156F, -0.1593F, -0.0696F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -11.2646F, 0.802F, -0.4454F, 0.7429F, -0.3123F));

		PartDefinition cube_r401 = neck4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(0.0F, -1.6F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3661F, -16.2558F, 3.5411F, 0.1231F, -0.2048F, 0.0757F));

		PartDefinition cube_r402 = neck4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(0.0F, -2.4F, -0.8F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -16.7914F, 2.3306F, 0.0616F, 0.6111F, 0.0377F));

		PartDefinition cube_r403 = neck4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(114, 175).mirror().addBox(-1.1185F, -1.2537F, -0.9187F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -17.5646F, -2.498F, -0.3253F, -0.7362F, 0.078F));

		PartDefinition cube_r404 = neck4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(20, 124).mirror().addBox(-0.6707F, -1.2481F, -0.194F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8937F, -17.7594F, -3.4541F, -0.0385F, -0.1985F, -0.1343F));

		PartDefinition cube_r405 = neck4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(123, 192).mirror().addBox(-4.9633F, -0.5953F, 0.5866F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -17.2646F, 1.002F, -0.6882F, -1.1998F, 0.6168F));

		PartDefinition cube_r406 = neck4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(160, 75).mirror().addBox(-1.8857F, -0.6059F, -0.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -17.2646F, 1.002F, -0.3172F, -0.725F, 0.2143F));

		PartDefinition cube_r407 = neck4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(20, 124).addBox(-0.3293F, -1.2481F, -0.194F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8937F, -17.7594F, -3.4541F, -0.0385F, 0.1985F, 0.1343F));

		PartDefinition cube_r408 = neck4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(58, 80).addBox(0.0F, -2.7741F, -1.418F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5248F, 0.7064F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r409 = neck4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(124, 111).mirror().addBox(0.0804F, -1.9712F, 0.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -18.7914F, 2.3306F, -0.0427F, 0.5127F, -0.4204F));

		PartDefinition cube_r410 = neck4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(124, 111).addBox(-1.0804F, -1.9712F, 0.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -18.7914F, 2.3306F, -0.0427F, -0.5127F, 0.4204F));

		PartDefinition cube_r411 = neck4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(128, 0).addBox(-1.0F, -2.4F, -0.8F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -16.7914F, 2.3306F, 0.0616F, -0.6111F, -0.0377F));

		PartDefinition cube_r412 = neck4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(152, 39).mirror().addBox(0.8427F, -4.829F, -0.8259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8771F, -1.7801F, 1.6855F, -0.4989F, 0.4676F, -0.4709F));

		PartDefinition cube_r413 = neck4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(152, 39).addBox(-1.8427F, -4.829F, -0.8259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -1.7801F, 1.6855F, -0.4989F, -0.4676F, 0.4709F));

		PartDefinition cube_r414 = neck4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(152, 0).addBox(-0.6553F, -3.4119F, -1.051F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8771F, -1.7801F, 1.6855F, -0.0663F, -0.6112F, 0.0358F));

		PartDefinition cube_r415 = neck4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(5, 159).addBox(-1.8628F, -3.9966F, 0.373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -9.5914F, 2.3306F, -0.0427F, -0.5127F, 0.4204F));

		PartDefinition cube_r416 = neck4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(128, 154).addBox(-0.9938F, -2.5997F, -0.792F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -9.5914F, 2.3306F, 0.0616F, -0.6111F, -0.0377F));

		PartDefinition cube_r417 = neck4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(180, 22).addBox(0.0F, -1.8F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6694F, -8.9721F, 3.698F, 0.0391F, 0.2595F, -0.035F));

		PartDefinition cube_r418 = neck4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -1.6F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3661F, -16.2558F, 3.5411F, 0.1231F, 0.2048F, -0.0757F));

		PartDefinition cube_r419 = neck4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(114, 175).addBox(-3.8815F, -1.2537F, -0.9187F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -17.5646F, -2.498F, -0.3253F, 0.7362F, -0.078F));

		PartDefinition cube_r420 = neck4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(123, 192).addBox(0.9633F, -0.5953F, 0.5866F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -17.2646F, 1.002F, -0.6882F, 1.1998F, -0.6168F));

		PartDefinition cube_r421 = neck4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(160, 75).addBox(-0.1143F, -0.6059F, -0.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -17.2646F, 1.002F, -0.3172F, 0.725F, -0.2143F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.3343F, 1.326F, 0.1701F, -0.3248F, 0.3434F));

		PartDefinition cube_r422 = neck5.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(69, 38).addBox(0.0F, -1.9F, -2.4F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7525F, 3.271F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r423 = neck5.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(0.0F, -2.4F, -0.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -4.3515F, 1.5104F, 0.0616F, 0.6111F, 0.0377F));

		PartDefinition cube_r424 = neck5.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(53, 165).mirror().addBox(-3.951F, -0.396F, 0.5979F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -5.5248F, 0.4817F, -0.252F, -1.264F, 0.2045F));

		PartDefinition cube_r425 = neck5.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-1.6777F, -0.4066F, -0.2885F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -5.5248F, 0.4817F, -0.0964F, -0.6174F, 0.0559F));

		PartDefinition cube_r426 = neck5.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4341F, -0.5F, -0.8284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2119F, -4.7833F, -2.318F, -0.055F, -0.1751F, -0.1637F));

		PartDefinition cube_r427 = neck5.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(79, 170).mirror().addBox(-1.5104F, -1.5F, -0.4677F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2119F, -4.7833F, -2.318F, -0.061F, -0.48F, -0.1451F));

		PartDefinition cube_r428 = neck5.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(79, 170).addBox(-2.4896F, -1.5F, -0.4677F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2119F, -4.7833F, -2.318F, -0.061F, 0.48F, 0.1451F));

		PartDefinition cube_r429 = neck5.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 0).addBox(0.4341F, -0.5F, -0.8284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2119F, -4.7833F, -2.318F, -0.055F, 0.1751F, 0.1637F));

		PartDefinition cube_r430 = neck5.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(53, 165).addBox(0.951F, -0.396F, 0.5979F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -5.5248F, 0.4817F, -0.252F, 1.264F, -0.2045F));

		PartDefinition cube_r431 = neck5.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(66, 84).addBox(-0.3223F, -0.4066F, -0.2885F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -5.5248F, 0.4817F, -0.0964F, 0.6174F, -0.0559F));

		PartDefinition cube_r432 = neck5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(36, 105).addBox(-1.0804F, -1.9712F, 0.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -6.3515F, 1.5104F, -0.0427F, -0.5127F, 0.4204F));

		PartDefinition cube_r433 = neck5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(74, 63).addBox(-1.0F, -2.4F, -0.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -4.3515F, 1.5104F, 0.0616F, -0.6111F, -0.0377F));

		PartDefinition cube_r434 = neck5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(16, 43).addBox(-1.0F, -0.1608F, -2.5326F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.5945F, 2.0058F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(69, 27).addBox(-1.0F, -5.9922F, -1.1568F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(85, 63).addBox(-1.0F, -3.9922F, -1.1568F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3445F, 0.6558F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r435 = neck6.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(162, 43).mirror().addBox(-0.7717F, -0.5F, -0.8897F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 46).mirror().addBox(-0.7717F, 0.5F, -0.8897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -3.0922F, -1.9568F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r436 = neck6.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(69, 159).mirror().addBox(-0.9094F, -0.5F, -0.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -3.0922F, 0.4432F, 0.0F, -0.5323F, 0.0F));

		PartDefinition cube_r437 = neck6.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(64, 162).mirror().addBox(-3.5773F, -0.5F, -0.1636F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -3.0922F, 0.4432F, 0.0F, -1.0996F, 0.0F));

		PartDefinition cube_r438 = neck6.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(0.0F, -1.3F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4922F, 2.8432F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r439 = neck6.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(0.0062F, -1.2003F, -0.808F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -2.219F, 1.2718F, -0.045F, 0.6118F, -0.0236F));

		PartDefinition cube_r440 = neck6.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(161, 141).mirror().addBox(0.7206F, -1.6284F, 0.3085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -2.219F, 1.2718F, -0.1324F, 0.4754F, -0.463F));

		PartDefinition cube_r441 = neck6.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(0.0F, -0.2085F, -0.8755F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 60).addBox(0.0F, -0.2085F, -0.8755F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1507F, 1.5517F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r442 = neck6.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.0922F, -0.6568F, -0.4608F, 0.1393F, 0.2727F));

		PartDefinition cube_r443 = neck6.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(162, 43).addBox(-3.2283F, -0.5F, -0.8897F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 46).addBox(-0.2283F, 0.5F, -0.8897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.0922F, -1.9568F, 0.0F, 0.4276F, 0.0F));

		PartDefinition cube_r444 = neck6.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(64, 162).addBox(0.5773F, -0.5F, -0.1636F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.0922F, 0.4432F, 0.0F, 1.0996F, 0.0F));

		PartDefinition cube_r445 = neck6.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(69, 159).addBox(-0.0906F, -0.5F, -0.5423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.0922F, 0.4432F, 0.0F, 0.5323F, 0.0F));

		PartDefinition cube_r446 = neck6.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.0922F, -0.6568F, -0.4608F, -0.1393F, -0.2727F));

		PartDefinition cube_r447 = neck6.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(161, 141).addBox(-1.7206F, -1.6284F, 0.3085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -2.219F, 1.2718F, -0.1324F, -0.4754F, 0.463F));

		PartDefinition cube_r448 = neck6.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(12, 60).addBox(-1.0062F, -1.2003F, -0.808F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3012F, -2.219F, 1.2718F, -0.045F, -0.6118F, 0.0236F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.8692F, -0.7612F, -0.0269F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 118).addBox(-2.0F, -2.85F, -0.4F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(145, 116).addBox(-1.5F, -3.85F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.5F, -2.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(105, 118).addBox(-2.0F, -0.0166F, -1.0325F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -9.1F, -2.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(123, 135).addBox(-2.0F, -0.0532F, -1.1811F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(123, 135).addBox(-2.0F, -0.0532F, -0.9811F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -7.6F, -1.65F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(145, 101).addBox(-2.0F, -3.1F, 0.7F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -5.6F, -2.45F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(127, 61).addBox(-2.5F, -0.0123F, -1.9686F, 5.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -2.7531F, 3.1316F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(80, 10).addBox(-2.5F, -0.0587F, -2.0051F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -3.5531F, 2.8316F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(183, 56).addBox(-2.0F, 0.2F, 0.1F, 5.0F, 5.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, -5.6F, -2.45F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(32, 151).addBox(-3.0F, 1.8101F, 0.5907F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(21, 156).mirror().addBox(-2.93F, 2.1804F, 3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(143, 108).mirror().addBox(-3.25F, 2.1804F, 3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(143, 108).addBox(3.25F, 2.1804F, 3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 156).addBox(2.93F, 2.1804F, 3.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(174, 106).addBox(-3.0F, 1.85F, 2.3F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -5.5F, -2.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(143, 108).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(143, 108).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(143, 108).addBox(3.6F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 108).addBox(3.6F, -1.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.05F, -4.5191F, 0.2713F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(143, 108).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(143, 108).addBox(4.0F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.25F, -6.7196F, -1.8282F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(153, 19).addBox(-2.0F, -4.2753F, 0.0002F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(29, 75).addBox(-2.5F, -3.0753F, 0.0002F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -5.2F, -2.3F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(16, 140).addBox(-2.5F, -2.9985F, 0.0347F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.3F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.35F, -1.05F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(58, 93).addBox(-3.5F, -1.0095F, 0.0179F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 85).addBox(-3.0F, -1.0095F, -0.9321F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -7.2516F, -2.7525F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(46, 129).addBox(-3.5F, -0.5231F, -1.0439F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(23, 27).mirror().addBox(-3.5F, -0.5231F, -0.1439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(23, 27).addBox(0.5F, -0.5231F, -0.1439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5F, -7.2516F, -2.7525F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(51, 137).mirror().addBox(-3.0F, -0.0647F, -1.9906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(51, 137).addBox(2.0F, -0.0647F, -1.9906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -5.0461F, -1.6132F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(95, 108).mirror().addBox(-3.0F, -0.0145F, -0.8564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 108).addBox(2.0F, -0.0145F, -0.8564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.1113F, -0.7381F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-3.0F, 1.2F, 0.03F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(143, 23).addBox(2.0F, 1.2F, 0.03F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -5.4461F, -0.4132F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(120, 26).mirror().addBox(-3.0F, -0.0609F, -2.1368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 26).addBox(2.0F, -0.0609F, -2.1368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.7113F, -1.1381F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(70, 126).mirror().addBox(-3.5F, -0.8288F, -2.0009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(70, 126).addBox(2.5F, -0.8288F, -2.0009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.4113F, -1.2381F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(6, 140).mirror().addBox(-3.5F, -0.0581F, -1.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 140).addBox(2.5F, -0.0581F, -1.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2113F, -0.1381F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(145, 39).mirror().addBox(-0.5F, -1.6744F, 0.0654F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(145, 39).addBox(5.5F, -1.6744F, 0.0654F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.5F, -3.0882F, -2.7884F, -1.2654F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -8.0461F, -4.2632F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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