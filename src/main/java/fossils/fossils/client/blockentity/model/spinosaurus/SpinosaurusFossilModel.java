package fossils.fossils.client.blockentity.model.spinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpinosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart rightupperarm;
	private final ModelPart rightlowerarm;
	private final ModelPart righthand;
	private final ModelPart rightouterfingers;
	private final ModelPart rightthumb;
	private final ModelPart rightthumbclaw;
	private final ModelPart leftupperarm;
	private final ModelPart leftlowerarm;
	private final ModelPart lefthand;
	private final ModelPart leftouterfingers;
	private final ModelPart leftthumb;
	private final ModelPart leftthumbclaw;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;
	private final ModelPart rightAngularSurangular;
	private final ModelPart rightDentary;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public SpinosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.rightupperarm = this.chest.getChild("rightupperarm");
		this.rightlowerarm = this.rightupperarm.getChild("rightlowerarm");
		this.righthand = this.rightlowerarm.getChild("righthand");
		this.rightouterfingers = this.righthand.getChild("rightouterfingers");
		this.rightthumb = this.righthand.getChild("rightthumb");
		this.rightthumbclaw = this.rightthumb.getChild("rightthumbclaw");
		this.leftupperarm = this.chest.getChild("leftupperarm");
		this.leftlowerarm = this.leftupperarm.getChild("leftlowerarm");
		this.lefthand = this.leftlowerarm.getChild("lefthand");
		this.leftouterfingers = this.lefthand.getChild("leftouterfingers");
		this.leftthumb = this.lefthand.getChild("leftthumb");
		this.leftthumbclaw = this.leftthumb.getChild("leftthumbclaw");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
		this.rightAngularSurangular = this.jaw.getChild("rightAngularSurangular");
		this.rightDentary = this.rightAngularSurangular.getChild("rightDentary");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(91, 107).addBox(2.1F, -5.4583F, 0.1702F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(91, 107).mirror().addBox(-3.1F, -5.4583F, 0.1702F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -30.9F, -2.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(136, 7).mirror().addBox(0.3367F, 6.1109F, -1.8093F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8438F, 1.947F, 4.2489F, 0.6576F, -0.013F, -0.1093F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(136, 26).mirror().addBox(-0.2058F, 5.5782F, 2.4604F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0408F, 1.8782F, 1.256F, -0.9582F, 0.0273F, -0.0656F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(127, 6).mirror().addBox(-0.2058F, 6.3902F, -4.8322F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0408F, 1.8782F, 1.256F, 0.0453F, 0.0273F, -0.0656F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(98, 143).mirror().addBox(-0.5214F, 2.3211F, -0.5198F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8438F, 1.947F, 4.2489F, 0.4545F, 0.0617F, -0.2061F));

		PartDefinition hips_r5 = hips.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(153, 132).mirror().addBox(-0.365F, -0.8812F, -0.854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(148, 72).mirror().addBox(-0.365F, -1.0812F, -1.454F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8438F, 1.947F, 4.2489F, 0.7664F, -0.0295F, -0.2104F));

		PartDefinition hips_r6 = hips.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(133, 80).mirror().addBox(-0.5F, -2.0F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1133F, 0.0759F, 0.4219F, 0.0914F, -0.0315F, -0.2599F));

		PartDefinition hips_r7 = hips.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(112, 75).mirror().addBox(0.2319F, -3.0417F, -4.3011F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, 0.5907F, 0.2256F, -0.0241F));

		PartDefinition hips_r8 = hips.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(67, 114).mirror().addBox(0.0522F, -2.2966F, 3.1719F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, -0.1921F, -0.0434F, 0.0046F));

		PartDefinition hips_r9 = hips.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-0.0519F, -0.0847F, 0.0525F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -5.38F, 4.1F, -0.3143F, -0.0434F, 0.0046F));

		PartDefinition hips_r10 = hips.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(88, 137).mirror().addBox(0.0522F, -6.6503F, 2.6841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, -0.8204F, -0.0434F, 0.0046F));

		PartDefinition hips_r11 = hips.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(56, 121).mirror().addBox(0.2319F, -5.4597F, -4.5353F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, 0.547F, 0.2256F, -0.0241F));

		PartDefinition hips_r12 = hips.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(124, 82).mirror().addBox(0.2319F, -3.8573F, -4.1112F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, -0.0202F, 0.2256F, -0.0241F));

		PartDefinition hips_r13 = hips.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(70, 58).mirror().addBox(0.9F, -0.4F, -5.6F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 58).addBox(4.1F, -0.4F, -5.6F, 3.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.18F, 1.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r14 = hips.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(70, 106).mirror().addBox(-0.1F, -2.0015F, -1.5756F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 106).addBox(5.1F, -2.0015F, -1.5756F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.58F, 1.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition hips_r15 = hips.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-0.5F, -2.2F, -2.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0996F, 0.3838F, 2.5087F, -0.0482F, -0.0315F, -0.2599F));

		PartDefinition hips_r16 = hips.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(129, 12).mirror().addBox(-1.1059F, -1.085F, -1.1708F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0408F, 1.8782F, 1.256F, -0.3385F, -0.035F, -0.169F));

		PartDefinition hips_r17 = hips.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(146, 96).mirror().addBox(-1.1473F, 2.3021F, 0.8888F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0408F, 1.8782F, 1.256F, -0.7307F, -0.039F, -0.1681F));

		PartDefinition hips_r18 = hips.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(88, 142).mirror().addBox(-1.1473F, 2.9017F, -0.694F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0408F, 1.8782F, 1.256F, -0.4864F, -0.039F, -0.1681F));

		PartDefinition hips_r19 = hips.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(150, 6).mirror().addBox(-0.365F, -0.2466F, 0.2164F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8438F, 1.947F, 4.2489F, 0.2253F, -0.0295F, -0.2104F));

		PartDefinition hips_r20 = hips.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(108, 143).mirror().addBox(-0.5214F, 2.3161F, -0.4214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8438F, 1.947F, 4.2489F, 0.5243F, 0.0617F, -0.2061F));

		PartDefinition hips_r21 = hips.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(112, 75).addBox(-1.2319F, -3.0417F, -4.3011F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, -1.58F, 1.3F, 0.5907F, -0.2256F, 0.0241F));

		PartDefinition hips_r22 = hips.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(67, 114).addBox(-1.0522F, -2.2966F, 3.1719F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, -1.58F, 1.3F, -0.1921F, 0.0434F, -0.0046F));

		PartDefinition hips_r23 = hips.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(109, 0).addBox(-0.9481F, -0.0847F, 0.0525F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -5.38F, 4.1F, -0.3143F, 0.0434F, -0.0046F));

		PartDefinition hips_r24 = hips.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(88, 137).addBox(-1.0522F, -6.6503F, 2.6841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0F, -1.58F, 1.3F, -0.8204F, 0.0434F, -0.0046F));

		PartDefinition hips_r25 = hips.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(56, 121).addBox(-1.2319F, -5.4597F, -4.5353F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.58F, 1.3F, 0.547F, -0.2256F, 0.0241F));

		PartDefinition hips_r26 = hips.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(124, 82).addBox(-1.2319F, -3.8573F, -4.1112F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0F, -1.58F, 1.3F, -0.0202F, -0.2256F, 0.0241F));

		PartDefinition hips_r27 = hips.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(133, 80).addBox(-0.5F, -2.0F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1133F, 0.0759F, 0.4219F, 0.0914F, 0.0315F, 0.2599F));

		PartDefinition hips_r28 = hips.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(103, 21).addBox(-0.5F, -2.2F, -2.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0996F, 0.3838F, 2.5087F, -0.0482F, 0.0315F, 0.2599F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 152).addBox(0.006F, -5.2789F, 0.6613F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.2894F, 9.5613F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(110, 158).addBox(0.003F, -3.0225F, 0.5992F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.4894F, 9.0613F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(147, 128).addBox(0.003F, -2.9658F, -1.9849F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.4894F, 8.6613F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(158, 102).addBox(0.0F, -2.5F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -5.6184F, 8.8885F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 154).addBox(0.006F, -8.3347F, -2.581F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.7894F, 6.5613F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(104, 154).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, -8.1334F, 9.6537F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(151, 146).addBox(0.0F, -4.9386F, -1.3365F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.7894F, 6.5613F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 161).addBox(0.006F, -9.7116F, 0.5871F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.7894F, 6.9613F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 161).addBox(0.006F, -3.1874F, 0.5938F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.7894F, 6.5613F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 161).addBox(0.006F, -0.0312F, 0.0656F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.1894F, 3.9613F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(85, 132).addBox(0.006F, -8.9584F, -1.0377F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -9.6894F, 8.3613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 146).addBox(0.0F, -4.3F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -14.4626F, 9.1919F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 153).addBox(0.0F, -5.6514F, -1.2276F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.3894F, 3.5613F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(96, 154).addBox(0.009F, -3.893F, -1.0391F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.1894F, 6.7613F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(157, 67).addBox(0.006F, -2.8832F, -0.0941F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.9894F, 4.9613F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(145, 79).addBox(0.0F, -3.0F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -10.1139F, 7.6373F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(152, 21).addBox(0.006F, -5.7971F, -0.0658F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -1.3894F, 3.5613F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 143).addBox(0.003F, -3.8766F, -0.1381F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.0894F, 3.8613F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(68, 143).addBox(0.003F, -3.8766F, -0.1381F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.3894F, 1.1613F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(152, 26).addBox(0.006F, -0.4144F, -1.8787F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -7.4894F, 3.6613F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(65, 135).addBox(0.001F, -7.9008F, -0.1103F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.9894F, 2.9613F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(127, 49).addBox(0.006F, -0.3087F, -0.3303F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.8894F, 3.2613F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 139).addBox(0.009F, -7.0357F, -0.8914F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -7.4894F, 3.7613F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(153, 77).addBox(0.0F, -2.0374F, -0.0533F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.1894F, 1.1613F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 136).addBox(0.0F, -7.0593F, -0.2062F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -14.4894F, 5.2613F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 139).addBox(0.006F, -7.1745F, -0.9352F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -13.8894F, 6.2613F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(132, 59).addBox(-0.003F, -5.8532F, -1.9452F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -20.6894F, 8.6613F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(160, 97).addBox(0.006F, -3.8276F, 0.4988F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.3894F, 1.1613F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 160).addBox(0.006F, -3.6779F, 0.2042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.7894F, -1.0387F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 114).addBox(-0.003F, -10.1764F, -0.0233F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -23.7894F, 3.1613F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 129).addBox(0.006F, -8.9377F, -0.9335F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -14.8894F, 2.9613F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(100, 123).addBox(0.0F, -9.0941F, -1.347F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -14.8894F, 2.9613F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(153, 72).addBox(0.0F, -5.3086F, -1.6709F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.7894F, -1.0387F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 139).addBox(0.009F, -12.657F, -0.241F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.7894F, -1.0387F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 160).addBox(0.006F, -6.2943F, -3.5478F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.7894F, -1.0387F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 143).addBox(0.001F, -6.2309F, -0.2324F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -9.0894F, 0.1613F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(96, 160).addBox(0.006F, -0.0516F, -0.8591F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.3894F, 0.9613F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(37, 143).addBox(0.003F, -3.8678F, -0.3389F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -2.7894F, -1.0387F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(127, 59).addBox(-0.003F, -32.9865F, -1.3736F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.0894F, -2.5387F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 109).addBox(0.006F, -14.1656F, -0.9843F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -15.1894F, -0.4387F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(88, 106).addBox(0.0F, -14.7169F, -0.2171F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -14.8894F, -1.6387F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(152, 127).addBox(0.0F, -0.1446F, 0.0079F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.5894F, -4.0387F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 139).addBox(0.009F, -0.0509F, -0.9168F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -15.2894F, -0.4387F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(160, 82).addBox(0.006F, 0.0427F, -0.0085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.8894F, -4.5387F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(160, 66).addBox(0.006F, -1.8961F, 0.0778F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.8894F, -4.0387F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 143).addBox(0.001F, -0.4487F, 0.1045F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -15.1894F, -1.8387F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(152, 98).addBox(0.006F, -1.9265F, -1.9414F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.9894F, -2.0387F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(19, 143).addBox(0.003F, 1.8114F, -2.2997F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.6894F, -1.5387F, -0.0785F, 0.0F, 0.0F));

		PartDefinition hips_r29 = hips.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(129, 12).addBox(0.1059F, -1.085F, -1.1708F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0408F, 1.8782F, 1.256F, -0.3385F, 0.035F, 0.169F));

		PartDefinition hips_r30 = hips.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(146, 96).addBox(0.1473F, 2.3021F, 0.8888F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0408F, 1.8782F, 1.256F, -0.7307F, 0.039F, 0.1681F));

		PartDefinition hips_r31 = hips.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(88, 142).addBox(0.1473F, 2.9017F, -0.694F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0408F, 1.8782F, 1.256F, -0.4864F, 0.039F, 0.1681F));

		PartDefinition hips_r32 = hips.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(127, 6).addBox(-0.7942F, 6.3902F, -4.8322F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0408F, 1.8782F, 1.256F, 0.0453F, -0.0273F, 0.0656F));

		PartDefinition hips_r33 = hips.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(136, 26).addBox(-0.7942F, 5.5782F, 2.4604F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0408F, 1.8782F, 1.256F, -0.9582F, -0.0273F, 0.0656F));

		PartDefinition hips_r34 = hips.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(136, 7).addBox(-1.3367F, 6.1109F, -1.8093F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8438F, 1.947F, 4.2489F, 0.6576F, 0.013F, 0.1093F));

		PartDefinition hips_r35 = hips.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(150, 6).addBox(-0.635F, -0.2466F, 0.2164F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8438F, 1.947F, 4.2489F, 0.2253F, 0.0295F, 0.2104F));

		PartDefinition hips_r36 = hips.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(153, 132).addBox(-0.635F, -0.8812F, -0.854F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(148, 72).addBox(-0.635F, -1.0812F, -1.454F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8438F, 1.947F, 4.2489F, 0.7664F, 0.0295F, 0.2104F));

		PartDefinition hips_r37 = hips.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(98, 143).addBox(-0.4786F, 2.3211F, -0.5198F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8438F, 1.947F, 4.2489F, 0.4545F, -0.0617F, 0.2061F));

		PartDefinition hips_r38 = hips.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(108, 143).addBox(-0.4786F, 2.3161F, -0.4214F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8438F, 1.947F, 4.2489F, 0.5243F, -0.0617F, 0.2061F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2564F, -0.152F, 2.436F, -0.4897F, -0.011F, -0.041F));

		PartDefinition rightthigh_r1 = rightthigh.addOrReplaceChild("rightthigh_r1", CubeListBuilder.create().texOffs(113, 82).addBox(-1.0F, 2.5331F, -0.1938F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 125).addBox(-1.0F, -0.1669F, -0.1938F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6896F, 6.0017F, -1.9346F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightthigh_r2 = rightthigh.addOrReplaceChild("rightthigh_r2", CubeListBuilder.create().texOffs(108, 120).addBox(-2.0F, -1.9F, -0.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6877F, 0.5639F, -0.1101F, -0.218F, -0.0092F, -0.0003F));

		PartDefinition rightthigh_r3 = rightthigh.addOrReplaceChild("rightthigh_r3", CubeListBuilder.create().texOffs(39, 131).addBox(-0.6057F, -0.8616F, -0.7311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7934F, 2.1053F, -0.3963F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightthigh_r4 = rightthigh.addOrReplaceChild("rightthigh_r4", CubeListBuilder.create().texOffs(129, 116).addBox(-1.1057F, -0.0655F, -0.0856F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.164F)), PartPose.offsetAndRotation(0.7934F, 3.9053F, -1.9963F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightthigh_r5 = rightthigh.addOrReplaceChild("rightthigh_r5", CubeListBuilder.create().texOffs(122, 122).addBox(-1.1057F, -0.1016F, -0.2458F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.7934F, 0.3053F, -1.2963F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightthigh_r6 = rightthigh.addOrReplaceChild("rightthigh_r6", CubeListBuilder.create().texOffs(118, 8).addBox(-1.1057F, -0.7642F, -0.914F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.7934F, 2.1053F, -0.3963F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create().texOffs(48, 123).addBox(-1.4328F, 3.7572F, -0.1204F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3473F, 10.5461F, -0.9976F, 0.735F, 0.0F, 0.0424F));

		PartDefinition rightshin_r1 = rightshin.addOrReplaceChild("rightshin_r1", CubeListBuilder.create().texOffs(34, 102).addBox(0.4019F, -5.0022F, -0.5049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4653F, 6.7215F, -0.0683F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightshin_r2 = rightshin.addOrReplaceChild("rightshin_r2", CubeListBuilder.create().texOffs(86, 12).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.4328F, 2.2252F, 0.1624F, -0.192F, 0.0F, 0.0F));

		PartDefinition rightshin_r3 = rightshin.addOrReplaceChild("rightshin_r3", CubeListBuilder.create().texOffs(129, 129).addBox(-1.0F, -1.8F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4328F, 3.2573F, -0.4765F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightshin_r4 = rightshin.addOrReplaceChild("rightshin_r4", CubeListBuilder.create().texOffs(40, 90).addBox(-1.8981F, -0.1026F, 0.0282F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 2.2215F, -1.8683F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightshin_r5 = rightshin.addOrReplaceChild("rightshin_r5", CubeListBuilder.create().texOffs(122, 104).addBox(-1.8981F, -0.1873F, -1.765F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 3.8215F, 0.7317F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightshin_r6 = rightshin.addOrReplaceChild("rightshin_r6", CubeListBuilder.create().texOffs(129, 102).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4328F, 13.1592F, -0.3374F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightshin_r7 = rightshin.addOrReplaceChild("rightshin_r7", CubeListBuilder.create().texOffs(55, 129).addBox(-1.8981F, 6.8954F, -0.2512F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4653F, 3.8215F, 0.7317F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create().texOffs(118, 37).addBox(-1.471F, 0.0843F, -0.3824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 117).addBox(-1.471F, 0.0843F, -0.9824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0282F, 15.7806F, -0.12F, -0.2438F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 99).addBox(-1.971F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.1747F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(50, 87).addBox(-2.471F, -0.8557F, -6.0231F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2564F, -0.152F, 2.436F, 0.4702F, 0.011F, 0.041F));

		PartDefinition leftthigh_r1 = leftthigh.addOrReplaceChild("leftthigh_r1", CubeListBuilder.create().texOffs(113, 89).addBox(-1.0F, 2.5331F, -0.1938F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(125, 69).addBox(-1.0F, -0.1669F, -0.1938F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6896F, 6.0017F, -1.9346F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftthigh_r2 = leftthigh.addOrReplaceChild("leftthigh_r2", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0F, -1.9F, -0.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6877F, 0.5639F, -0.1101F, -0.218F, 0.0092F, 0.0003F));

		PartDefinition leftthigh_r3 = leftthigh.addOrReplaceChild("leftthigh_r3", CubeListBuilder.create().texOffs(131, 49).addBox(-0.3943F, -0.8616F, -0.7311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7934F, 2.1053F, -0.3963F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftthigh_r4 = leftthigh.addOrReplaceChild("leftthigh_r4", CubeListBuilder.create().texOffs(23, 131).addBox(-0.8943F, -0.0655F, -0.0856F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.164F)), PartPose.offsetAndRotation(-0.7934F, 3.9053F, -1.9963F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftthigh_r5 = leftthigh.addOrReplaceChild("leftthigh_r5", CubeListBuilder.create().texOffs(123, 75).addBox(-0.8943F, -0.1016F, -0.2458F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.7934F, 0.3053F, -1.2963F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftthigh_r6 = leftthigh.addOrReplaceChild("leftthigh_r6", CubeListBuilder.create().texOffs(118, 29).addBox(-0.8943F, -0.7642F, -0.914F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.7934F, 2.1053F, -0.3963F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create().texOffs(83, 123).addBox(-0.5672F, 3.7572F, -0.1204F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3473F, 10.5461F, -0.9976F, 0.4732F, 0.0F, -0.0424F));

		PartDefinition leftshin_r1 = leftshin.addOrReplaceChild("leftshin_r1", CubeListBuilder.create().texOffs(83, 106).addBox(-1.4019F, -5.0022F, -0.5049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4653F, 6.7215F, -0.0683F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftshin_r2 = leftshin.addOrReplaceChild("leftshin_r2", CubeListBuilder.create().texOffs(89, 35).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.4328F, 2.2252F, 0.1624F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftshin_r3 = leftshin.addOrReplaceChild("leftshin_r3", CubeListBuilder.create().texOffs(131, 0).addBox(-1.0F, -1.8F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4328F, 3.2573F, -0.4765F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftshin_r4 = leftshin.addOrReplaceChild("leftshin_r4", CubeListBuilder.create().texOffs(125, 21).addBox(-0.1019F, -0.1026F, 0.0282F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, 2.2215F, -1.8683F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftshin_r5 = leftshin.addOrReplaceChild("leftshin_r5", CubeListBuilder.create().texOffs(122, 113).addBox(-0.1019F, -0.1873F, -1.765F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, 3.8215F, 0.7317F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftshin_r6 = leftshin.addOrReplaceChild("leftshin_r6", CubeListBuilder.create().texOffs(122, 129).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4328F, 13.1592F, -0.3374F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftshin_r7 = leftshin.addOrReplaceChild("leftshin_r7", CubeListBuilder.create().texOffs(129, 109).addBox(-0.1019F, 6.8954F, -0.2512F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, 3.8215F, 0.7317F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create().texOffs(118, 45).addBox(-1.529F, 0.0843F, -0.3824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 96).addBox(-1.529F, 0.0843F, -0.9824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0282F, 15.7806F, -0.12F, -0.6802F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(17, 102).addBox(-2.029F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.7856F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(73, 87).addBox(-2.529F, -0.8557F, -6.0231F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.829F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -4.2F, -0.01F, -0.1751F, -0.0412F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 59).addBox(-4.0F, -4.1759F, -9.8724F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7547F, -16.8428F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.252F, -14.8842F, 8.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.3547F, -1.8428F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = body.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-9.8986F, -3.0846F, -0.7069F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2281F, -16.801F, 0.0039F, 0.2873F, -1.4575F));

		PartDefinition bodymiddle_r2 = body.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(153, 82).mirror().addBox(-2.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2281F, -16.801F, 0.2309F, 0.1638F, -0.5235F));

		PartDefinition bodymiddle_r3 = body.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(143, 87).mirror().addBox(-4.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2281F, -16.801F, 0.15F, 0.246F, -0.9159F));

		PartDefinition bodymiddle_r4 = body.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-10.8986F, -3.0846F, -0.7069F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0719F, -19.801F, 0.0039F, 0.2873F, -1.4575F));

		PartDefinition bodymiddle_r5 = body.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(153, 63).mirror().addBox(-2.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0719F, -19.801F, 0.2309F, 0.1638F, -0.5235F));

		PartDefinition bodymiddle_r6 = body.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(143, 28).mirror().addBox(-4.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0719F, -19.801F, 0.15F, 0.246F, -0.9159F));

		PartDefinition bodymiddle_r7 = body.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(142, 109).mirror().addBox(-4.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2719F, -23.801F, 0.1832F, 0.2874F, -0.9072F));

		PartDefinition bodymiddle_r8 = body.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-10.8986F, -3.0846F, -0.7069F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2719F, -23.801F, 0.0102F, 0.3393F, -1.4556F));

		PartDefinition bodymiddle_r9 = body.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(152, 50).mirror().addBox(-2.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2719F, -23.801F, 0.2771F, 0.1898F, -0.5154F));

		PartDefinition bodymiddle_r10 = body.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(141, 46).mirror().addBox(-4.9654F, -0.6946F, -0.0924F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -2.8588F, 0.0085F, -0.0165F, -1.0703F));

		PartDefinition bodymiddle_r11 = body.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(152, 48).mirror().addBox(-2.0789F, 0.1098F, -0.0784F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -2.8588F, 0.0002F, -0.0252F, -0.6776F));

		PartDefinition bodymiddle_r12 = body.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-4.887F, -0.7443F, -0.4815F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.046F, -6.2588F, -0.0095F, -0.0056F, -0.9855F));

		PartDefinition bodymiddle_r13 = body.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(145, 23).mirror().addBox(-2.028F, 0.0343F, -0.4679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.046F, -6.2588F, -0.0123F, -0.0082F, -0.5928F));

		PartDefinition bodymiddle_r14 = body.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(21, 88).mirror().addBox(-4.8601F, -3.0881F, -0.4815F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.046F, -6.2588F, -0.0054F, -0.0097F, -1.5091F));

		PartDefinition bodymiddle_r15 = body.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(137, 64).mirror().addBox(-4.8757F, -0.7506F, -0.6856F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.8588F, 0.0419F, 0.0861F, -0.9498F));

		PartDefinition bodymiddle_r16 = body.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(120, 6).mirror().addBox(-2.0214F, 0.0244F, -0.6721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.8588F, 0.0703F, 0.0568F, -0.5571F));

		PartDefinition bodymiddle_r17 = body.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(137, 66).mirror().addBox(-6.8472F, -3.0879F, -0.6856F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.8588F, -0.0068F, 0.0955F, -1.4755F));

		PartDefinition bodymiddle_r18 = body.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(138, 130).mirror().addBox(-4.9362F, -0.711F, -0.6063F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.354F, -13.3588F, 0.0665F, 0.133F, -0.9311F));

		PartDefinition bodymiddle_r19 = body.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(120, 59).mirror().addBox(-2.0616F, 0.0841F, -0.5924F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.354F, -13.3588F, 0.111F, 0.0908F, -0.5381F));

		PartDefinition bodymiddle_r20 = body.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(-8.9194F, -3.0838F, -0.6063F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.354F, -13.3588F, -0.0093F, 0.1483F, -1.4598F));

		PartDefinition bodymiddle_r21 = body.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(72, 39).addBox(3.8986F, -3.0846F, -0.7069F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2281F, -16.801F, 0.0039F, -0.2873F, 1.4575F));

		PartDefinition bodymiddle_r22 = body.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(143, 87).addBox(1.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2281F, -16.801F, 0.15F, -0.246F, 0.9159F));

		PartDefinition bodymiddle_r23 = body.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(153, 82).addBox(0.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2281F, -16.801F, 0.2309F, -0.1638F, 0.5235F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(35, 41).addBox(-1.0F, -0.3443F, -6.1957F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r24 = body.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(141, 46).addBox(1.9654F, -0.6946F, -0.0924F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -2.8588F, 0.0085F, 0.0165F, 1.0703F));

		PartDefinition bodymiddle_r25 = body.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(152, 48).addBox(0.0789F, 0.1098F, -0.0784F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -2.8588F, 0.0002F, 0.0252F, 0.6776F));

		PartDefinition bodymiddle_r26 = body.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(138, 132).addBox(1.887F, -0.7443F, -0.4815F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.046F, -6.2588F, -0.0095F, 0.0056F, 0.9855F));

		PartDefinition bodymiddle_r27 = body.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(145, 23).addBox(0.028F, 0.0343F, -0.4679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.046F, -6.2588F, -0.0123F, 0.0082F, 0.5928F));

		PartDefinition bodymiddle_r28 = body.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(21, 88).addBox(3.8601F, -3.0881F, -0.4815F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.046F, -6.2588F, -0.0054F, 0.0097F, 1.5091F));

		PartDefinition bodymiddle_r29 = body.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(137, 64).addBox(1.8757F, -0.7506F, -0.6856F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.8588F, 0.0419F, -0.0861F, 0.9498F));

		PartDefinition bodymiddle_r30 = body.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(120, 6).addBox(0.0214F, 0.0244F, -0.6721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.8588F, 0.0703F, -0.0568F, 0.5571F));

		PartDefinition bodymiddle_r31 = body.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(137, 66).addBox(3.8472F, -3.0879F, -0.6856F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.8588F, -0.0068F, -0.0955F, 1.4755F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(27, 147).addBox(-0.002F, -5.5948F, -0.8917F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -26.4894F, -0.5387F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(6, 148).addBox(-0.003F, -5.6227F, 0.0081F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -26.4894F, -2.1387F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(73, 136).addBox(0.006F, -4.8293F, -0.1503F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.4894F, -3.4387F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(105, 113).addBox(0.0F, -12.9757F, -0.9964F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -13.493F, -0.7447F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(13, 106).addBox(0.0F, 0.0421F, 0.0441F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -26.6894F, -2.1387F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(121, 152).addBox(0.0F, -1.0F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.7945F, -3.3992F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 145).addBox(0.009F, -13.1359F, -1.3898F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.4894F, -2.9387F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(87, 158).addBox(0.006F, -7.912F, -4.2097F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.4894F, -2.9387F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(8, 139).addBox(0.0F, -3.5F, -0.4F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -9.5725F, -2.6996F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(152, 84).addBox(0.006F, -1.8487F, -1.9983F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.8894F, -1.5387F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(129, 134).addBox(0.003F, -0.1442F, -1.9985F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.7894F, -1.5387F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 160).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.497F, -2.2885F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(160, 62).addBox(0.003F, -7.3149F, 3.6092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -5.9387F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(108, 134).addBox(0.003F, -5.0817F, -1.0892F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -5.9387F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(73, 152).addBox(0.006F, -6.7306F, 0.0299F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -5.9387F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 139).addBox(0.001F, -4.5093F, -1.4108F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.3894F, -5.9387F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(84, 158).addBox(0.006F, -7.55F, -4.3183F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -5.9387F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(129, 151).addBox(0.009F, -4.2723F, -0.6326F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -8.3894F, -5.9387F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(152, 110).addBox(0.0F, -0.0355F, -0.0236F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -6.7894F, -8.1387F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(102, 107).addBox(0.0F, -14.0968F, -1.3502F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -12.6894F, -5.1387F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(27, 109).addBox(0.006F, -13.9355F, -1.0317F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -12.6894F, -5.1387F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(14, 139).addBox(0.006F, -0.1201F, -0.027F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.7894F, -8.2387F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(142, 102).addBox(-0.002F, -3.631F, -1.8149F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -26.4894F, -5.9387F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(138, 123).addBox(-0.002F, 1.9127F, -1.5541F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -31.8894F, -12.3387F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(116, 151).addBox(0.009F, -3.592F, 1.8865F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 107).addBox(0.006F, -25.3763F, 1.9734F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(53, 107).addBox(0.0F, -25.3646F, 2.2496F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(152, 31).addBox(0.0F, -6.0567F, -0.2782F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(126, 151).addBox(0.009F, -11.6077F, 0.776F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(158, 77).addBox(0.006F, -7.8514F, -3.6865F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(103, 144).addBox(0.001F, -11.9395F, -0.6469F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(152, 67).addBox(0.006F, -6.6392F, 0.7239F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 134).addBox(0.003F, -5.1366F, -0.3914F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 160).addBox(0.003F, -6.9491F, 4.206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -10.6387F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(47, 160).addBox(0.003F, -6.8882F, 4.2853F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -14.1387F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(103, 128).addBox(0.003F, -5.134F, -0.2914F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -14.1387F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(150, 122).addBox(0.006F, -6.6159F, 0.8212F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.9894F, -14.1387F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(73, 144).addBox(0.0F, -2.5F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -10.4084F, -14.6618F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(158, 72).addBox(0.0F, -1.9F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -7.5296F, -14.6788F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(151, 56).addBox(0.009F, -4.6698F, -0.1598F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -7.9894F, -14.1387F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(151, 93).addBox(0.006F, -0.0497F, -0.006F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.7894F, -15.3387F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(151, 43).addBox(0.0F, -7.4797F, 0.2066F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, 0.5106F, -14.1387F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(119, 104).addBox(0.0F, 0.0142F, -0.0888F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -23.9894F, -18.8387F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(119, 118).addBox(0.006F, -11.9271F, -0.8843F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -12.7894F, -14.1387F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(127, 39).addBox(-0.002F, -6.9664F, -0.1168F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -23.8894F, -18.7387F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(138, 116).addBox(-0.002F, -2.4F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -24.8894F, -24.5387F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(36, 118).addBox(-0.003F, -12.175F, 0.0314F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.1741F, -19.7423F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(33, 118).addBox(0.003F, -11.8651F, -0.9297F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.7741F, -18.8423F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(52, 144).addBox(-0.003F, -0.1262F, -0.0885F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4741F, -19.1423F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(44, 160).addBox(0.0F, 0.0444F, -1.0106F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -8.1929F, -16.8407F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(160, 27).addBox(-0.003F, -1.1F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -8.8929F, -17.3407F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(41, 158).addBox(0.003F, -3.0262F, -0.0885F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4741F, -19.1423F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(42, 151).addBox(-0.002F, -0.3788F, -1.1417F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(151, 36).addBox(0.006F, -0.0788F, -0.9417F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.5741F, -18.7423F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(133, 87).addBox(0.0F, -5.2197F, 0.0218F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8741F, -17.8423F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(136, 150).addBox(-0.003F, -0.0225F, -0.549F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.5741F, -29.1423F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(3, 144).addBox(0.003F, -0.0611F, -0.9721F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.7741F, -25.1423F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(157, 155).addBox(0.0F, 4.8231F, -1.2521F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.5741F, -29.1423F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(23, 151).addBox(0.006F, -4.9331F, -1.0208F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8741F, -20.7423F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(23, 158).addBox(0.003F, -5.952F, -0.692F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3741F, -21.7423F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(3, 127).addBox(0.0F, -6.1929F, -0.8603F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5741F, -20.1423F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(146, 146).addBox(0.0F, -3.0929F, -0.8603F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2741F, -24.1423F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 156).addBox(0.003F, -3.9999F, -0.003F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6741F, -26.2423F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(130, 143).addBox(0.003F, -0.0237F, -1.0008F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -8.6535F, -25.9574F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(135, 157).addBox(-0.003F, -2.074F, -0.4699F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0741F, -24.8423F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(133, 150).addBox(0.0F, -4.9951F, -0.8936F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5741F, -26.0423F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(28, 138).addBox(-0.003F, -6.9437F, 0.1008F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.2741F, -29.6423F, 0.4276F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r32 = body.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(138, 130).addBox(1.9362F, -0.711F, -0.6063F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.354F, -13.3588F, 0.0665F, -0.133F, 0.9311F));

		PartDefinition bodymiddle_r33 = body.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(143, 28).addBox(1.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0719F, -19.801F, 0.15F, -0.246F, 0.9159F));

		PartDefinition bodymiddle_r34 = body.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(153, 63).addBox(0.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0719F, -19.801F, 0.2309F, -0.1638F, 0.5235F));

		PartDefinition bodymiddle_r35 = body.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(72, 35).addBox(3.8986F, -3.0846F, -0.7069F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0719F, -19.801F, 0.0039F, -0.2873F, 1.4575F));

		PartDefinition bodymiddle_r36 = body.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(142, 109).addBox(1.9186F, -0.7221F, -0.7069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2719F, -23.801F, 0.1832F, -0.2874F, 0.9072F));

		PartDefinition bodymiddle_r37 = body.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(51, 18).addBox(3.8986F, -3.0846F, -0.7069F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2719F, -23.801F, 0.0102F, -0.3393F, 1.4556F));

		PartDefinition bodymiddle_r38 = body.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(152, 50).addBox(0.0502F, 0.0673F, -0.6931F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2719F, -23.801F, 0.2771F, -0.1898F, 0.5154F));

		PartDefinition bodymiddle_r39 = body.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(120, 59).addBox(0.0616F, 0.0841F, -0.5924F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.354F, -13.3588F, 0.111F, -0.0908F, 0.5381F));

		PartDefinition bodymiddle_r40 = body.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(97, 83).addBox(3.9194F, -3.0838F, -0.6063F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.354F, -13.3588F, -0.0093F, -0.1483F, 1.4598F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 73).addBox(-1.0F, -0.3338F, -10.8959F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -15.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2929F, -25.9522F, -0.1523F, -0.1349F, -0.0288F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(154, 155).addBox(0.003F, -6.9357F, 0.305F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.067F, -1.5901F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(81, 150).addBox(0.0F, -15.6675F, 2.0425F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.067F, -1.5901F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 156).addBox(0.0F, -10.8109F, 1.4818F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.067F, -1.5901F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(6, 156).addBox(-0.003F, -6.5365F, 2.3969F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.067F, -1.5901F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(138, 87).addBox(0.0F, -4.0929F, -0.8603F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.067F, -1.5901F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(155, 117).addBox(-0.002F, -0.0373F, -0.0113F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.167F, -7.7901F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(95, 128).addBox(0.002F, 0.0155F, -0.4186F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.967F, -10.8901F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(155, 103).addBox(-0.003F, -3.9751F, -1.0426F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.267F, -4.1901F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(3, 137).addBox(0.0F, -4.2631F, -0.0771F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.133F, -5.8901F, 0.0611F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = chest.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(11, 123).mirror().addBox(-0.0025F, -0.1883F, -0.5786F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1089F, 10.9336F, -2.3613F, 2.035F, 0.2183F, -1.5872F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(118, 61).mirror().addBox(-0.8957F, -2.2266F, -1.1635F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3045F, 9.5669F, -9.5282F, 0.7472F, -0.4058F, -1.1256F));

		PartDefinition bodyfront_r3 = chest.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(-1.2934F, -2.4492F, -2.0013F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6913F, 8.435F, -8.3392F, 0.4607F, -0.352F, -0.5639F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(132, 44).mirror().addBox(-5.0F, -0.3F, -3.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(132, 44).addBox(6.2F, -0.3F, -3.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 4.6916F, -6.7371F, 0.7941F, 0.0F, 0.0F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(103, 12).mirror().addBox(-0.9962F, 0.0294F, -0.0022F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 3.0916F, -6.0371F, 0.7087F, 0.0663F, 0.0568F));

		PartDefinition bodymiddle_r41 = chest.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(153, 65).mirror().addBox(-2.0041F, 0.0486F, -0.5316F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3791F, -9.4489F, 0.5153F, 0.315F, -0.6472F));

		PartDefinition bodymiddle_r42 = chest.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(135, 100).mirror().addBox(-7.8566F, -3.0601F, -0.5451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3791F, -9.4489F, 0.0433F, 0.5998F, -1.6322F));

		PartDefinition bodymiddle_r43 = chest.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(143, 30).mirror().addBox(-4.8699F, -0.7219F, -0.5451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.3791F, -9.4489F, 0.363F, 0.4904F, -1.0302F));

		PartDefinition bodymiddle_r44 = chest.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(143, 26).mirror().addBox(-4.8699F, -0.7219F, -0.5451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8791F, -7.2489F, 0.3235F, 0.4302F, -1.0478F));

		PartDefinition bodymiddle_r45 = chest.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(97, 85).mirror().addBox(-8.8566F, -3.0601F, -0.5451F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8791F, -7.2489F, 0.0483F, 0.5302F, -1.6295F));

		PartDefinition bodymiddle_r46 = chest.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(152, 115).mirror().addBox(-2.0041F, 0.0486F, -0.5316F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8791F, -7.2489F, 0.4574F, 0.2724F, -0.664F));

		PartDefinition bodymiddle_r47 = chest.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(143, 21).mirror().addBox(-4.8159F, -0.7781F, -0.6222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2791F, -4.6489F, 0.3134F, 0.4362F, -0.9654F));

		PartDefinition bodymiddle_r48 = chest.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-9.7816F, -3.0818F, -0.6222F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2791F, -4.6489F, 0.0356F, 0.5301F, -1.5493F));

		PartDefinition bodymiddle_r49 = chest.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(152, 91).mirror().addBox(-1.9762F, -0.0239F, -0.609F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2791F, -4.6489F, 0.4509F, 0.2814F, -0.5791F));

		PartDefinition bodymiddle_r50 = chest.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(143, 19).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3791F, -0.7489F, 0.2755F, 0.3966F, -0.9286F));

		PartDefinition bodymiddle_r51 = chest.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-10.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3791F, -0.7489F, 0.0272F, 0.478F, -1.5013F));

		PartDefinition bodymiddle_r52 = chest.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(152, 89).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3791F, -0.7489F, 0.4021F, 0.2578F, -0.54F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-5.0F, -0.3F, -3.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 106).addBox(6.2F, -0.3F, -3.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, 4.6916F, -6.7371F, 0.9687F, 0.0F, 0.0F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(124, 89).mirror().addBox(-1.0934F, -1.5F, -1.3912F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.1544F, 8.2085F, -8.1835F, 1.0716F, -0.352F, -0.5639F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(108, 126).mirror().addBox(-0.8957F, -2.4936F, 0.4316F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3045F, 9.5669F, -9.5282F, 1.4017F, -0.4058F, -1.1256F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(78, 136).mirror().addBox(-0.0894F, -0.0493F, -0.4073F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1089F, 10.9336F, -3.1613F, 2.1365F, 0.187F, -1.6031F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(101, 152).mirror().addBox(0.0817F, 0.3646F, -1.0405F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7089F, 11.2336F, -4.1613F, 2.3707F, 0.2431F, -1.4659F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(60, 156).mirror().addBox(0.0773F, -0.4272F, -0.4298F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7089F, 11.2336F, -4.1613F, 2.7175F, 0.4017F, -1.2882F));

		PartDefinition bodymiddle_r53 = chest.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(143, 30).addBox(1.8699F, -0.7219F, -0.5451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3791F, -9.4489F, 0.363F, -0.4904F, 1.0302F));

		PartDefinition bodymiddle_r54 = chest.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(135, 100).addBox(3.8566F, -3.0601F, -0.5451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3791F, -9.4489F, 0.0433F, -0.5998F, 1.6322F));

		PartDefinition bodymiddle_r55 = chest.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(153, 65).addBox(0.0041F, 0.0486F, -0.5316F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3791F, -9.4489F, 0.5153F, -0.315F, 0.6472F));

		PartDefinition bodymiddle_r56 = chest.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(143, 26).addBox(1.8699F, -0.7219F, -0.5451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8791F, -7.2489F, 0.3235F, -0.4302F, 1.0478F));

		PartDefinition bodymiddle_r57 = chest.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(97, 85).addBox(3.8566F, -3.0601F, -0.5451F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8791F, -7.2489F, 0.0483F, -0.5302F, 1.6295F));

		PartDefinition bodymiddle_r58 = chest.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(152, 115).addBox(0.0041F, 0.0486F, -0.5316F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8791F, -7.2489F, 0.4574F, -0.2724F, 0.664F));

		PartDefinition bodymiddle_r59 = chest.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(143, 21).addBox(1.8159F, -0.7781F, -0.6222F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2791F, -4.6489F, 0.3134F, -0.4362F, 0.9654F));

		PartDefinition bodymiddle_r60 = chest.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(72, 37).addBox(3.7816F, -3.0818F, -0.6222F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2791F, -4.6489F, 0.0356F, -0.5301F, 1.5493F));

		PartDefinition bodymiddle_r61 = chest.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(152, 91).addBox(-0.0238F, -0.0239F, -0.609F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2791F, -4.6489F, 0.4509F, -0.2814F, 0.5791F));

		PartDefinition bodymiddle_r62 = chest.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(143, 19).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3791F, -0.7489F, 0.2755F, -0.3966F, 0.9286F));

		PartDefinition bodymiddle_r63 = chest.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(51, 20).addBox(3.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3791F, -0.7489F, 0.0272F, -0.478F, 1.5013F));

		PartDefinition bodymiddle_r64 = chest.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(152, 89).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3791F, -0.7489F, 0.4021F, -0.2578F, 0.54F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(132, 157).addBox(0.0F, -2.9893F, -0.9799F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.433F, -8.8901F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(70, 150).addBox(-0.002F, -3.0326F, -1.0487F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.167F, -7.3901F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(160, 23).addBox(0.002F, -1.4718F, -0.9754F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.933F, -6.8901F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 154).addBox(0.0F, -3.1718F, -0.9754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.933F, -6.8901F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bodyfront_r12 = chest.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(103, 12).addBox(-0.0038F, 0.0294F, -0.0022F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1F, 3.0916F, -6.0371F, 0.7087F, -0.0663F, -0.0568F));

		PartDefinition bodyfront_r13 = chest.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(126, 96).addBox(0.2934F, -2.4492F, -2.0013F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6913F, 8.435F, -8.3392F, 0.4607F, 0.352F, 0.5639F));

		PartDefinition bodyfront_r14 = chest.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(124, 89).addBox(0.0934F, -1.5F, -1.3912F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.1544F, 8.2085F, -8.1835F, 1.0716F, 0.352F, 0.5639F));

		PartDefinition bodyfront_r15 = chest.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(118, 61).addBox(-0.1043F, -2.2266F, -1.1635F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3045F, 9.5669F, -9.5282F, 0.7472F, 0.4058F, 1.1256F));

		PartDefinition bodyfront_r16 = chest.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(108, 126).addBox(-0.1043F, -2.4936F, 0.4316F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3045F, 9.5669F, -9.5282F, 1.4017F, 0.4058F, 1.1256F));

		PartDefinition bodyfront_r17 = chest.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(11, 123).addBox(0.0025F, -0.1883F, -0.5786F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1089F, 10.9336F, -2.3613F, 2.035F, -0.2183F, 1.5872F));

		PartDefinition bodyfront_r18 = chest.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(78, 136).addBox(0.0894F, -0.0493F, -0.4073F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1089F, 10.9336F, -3.1613F, 2.1365F, -0.187F, 1.6031F));

		PartDefinition bodyfront_r19 = chest.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(101, 152).addBox(-0.0817F, 0.3646F, -1.0405F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7089F, 11.2336F, -4.1613F, 2.3707F, -0.2431F, 1.4659F));

		PartDefinition bodyfront_r20 = chest.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(60, 156).addBox(-0.0773F, -0.4272F, -0.4298F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7089F, 11.2336F, -4.1613F, 2.7175F, -0.4017F, 1.2882F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(132, 75).addBox(-0.5F, 0.4F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(112, 69).addBox(-1.0F, 0.4F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 10.3188F, -5.3643F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -0.029F, -2.2955F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.333F, -8.5901F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperarm = chest.addOrReplaceChild("rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.241F, 9.5951F, -6.5735F, 0.3783F, -0.2537F, -0.6675F));

		PartDefinition rightupperarm_r1 = rightupperarm.addOrReplaceChild("rightupperarm_r1", CubeListBuilder.create().texOffs(157, 11).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7074F, 2.8545F, -0.9067F, 1.117F, -0.5411F, 0.0F));

		PartDefinition rightupperarm_r2 = rightupperarm.addOrReplaceChild("rightupperarm_r2", CubeListBuilder.create().texOffs(131, 121).addBox(-0.5F, -1.8025F, -0.9687F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2799F, 1.2807F, -0.1953F, -0.1571F, -0.5411F, 0.0F));

		PartDefinition rightupperarm_r3 = rightupperarm.addOrReplaceChild("rightupperarm_r3", CubeListBuilder.create().texOffs(134, 136).addBox(-0.5F, 1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(121, 146).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2799F, 6.4389F, 0.2866F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightupperarm_r4 = rightupperarm.addOrReplaceChild("rightupperarm_r4", CubeListBuilder.create().texOffs(147, 0).addBox(-0.5F, -2.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2799F, 6.4389F, 0.2866F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightlowerarm = rightupperarm.addOrReplaceChild("rightlowerarm", CubeListBuilder.create().texOffs(139, 154).addBox(-0.996F, 1.3782F, -1.4129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(86, 149).addBox(-0.996F, -0.3218F, 0.2871F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 59).addBox(-0.996F, 2.6782F, -0.1129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3221F, 10.4607F, -0.8235F, -0.9986F, -0.4156F, 0.3079F));

		PartDefinition rightlowerarm_r1 = rightlowerarm.addOrReplaceChild("rightlowerarm_r1", CubeListBuilder.create().texOffs(146, 134).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.496F, -0.8218F, 1.2871F, 0.7679F, 0.0F, 0.0F));

		PartDefinition rightlowerarm_r2 = rightlowerarm.addOrReplaceChild("rightlowerarm_r2", CubeListBuilder.create().texOffs(145, 32).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.496F, -0.8218F, 1.2871F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightlowerarm_r3 = rightlowerarm.addOrReplaceChild("rightlowerarm_r3", CubeListBuilder.create().texOffs(156, 146).addBox(-1.0293F, -1.8247F, -0.8759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0332F, 1.3317F, -0.5358F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightlowerarm_r4 = rightlowerarm.addOrReplaceChild("rightlowerarm_r4", CubeListBuilder.create().texOffs(116, 156).addBox(12.7707F, -2.3536F, 0.7228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.7668F, 2.0317F, -2.0358F, 0.1745F, 0.0F, 0.0F));

		PartDefinition righthand = rightlowerarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(68, 121).addBox(-1.2068F, 0.2228F, -1.3144F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1483F, 3.6598F, -0.1985F, 0.0F, 0.0F, 0.1698F));

		PartDefinition rightouterfingers = righthand.addOrReplaceChild("rightouterfingers", CubeListBuilder.create().texOffs(116, 21).addBox(-1.2339F, 0.0216F, -1.5144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0166F, 3.167F, 0.2F, 0.0F, 0.0F, 0.3821F));

		PartDefinition rightthumb = righthand.addOrReplaceChild("rightthumb", CubeListBuilder.create().texOffs(106, 149).addBox(-0.8319F, -0.0409F, -0.4248F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5907F, 0.2958F, -1.1037F, -0.5308F, 0.0F, 0.2122F));

		PartDefinition rightthumbclaw = rightthumb.addOrReplaceChild("rightthumbclaw", CubeListBuilder.create().texOffs(39, 138).addBox(-1.5722F, 1.3754F, -6.6728F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6055F, 1.5369F, 6.2759F, -0.0213F, 0.0F, 0.6793F));

		PartDefinition leftupperarm = chest.addOrReplaceChild("leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.241F, 9.5951F, -6.5735F, 0.0219F, 0.5959F, 0.6709F));

		PartDefinition leftupperarm_r1 = leftupperarm.addOrReplaceChild("leftupperarm_r1", CubeListBuilder.create().texOffs(15, 157).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7074F, 2.8545F, -0.9067F, 1.117F, 0.5411F, 0.0F));

		PartDefinition leftupperarm_r2 = leftupperarm.addOrReplaceChild("leftupperarm_r2", CubeListBuilder.create().texOffs(14, 132).addBox(-0.5F, -1.8025F, -0.9687F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2799F, 1.2807F, -0.1953F, -0.1571F, 0.5411F, 0.0F));

		PartDefinition leftupperarm_r3 = leftupperarm.addOrReplaceChild("leftupperarm_r3", CubeListBuilder.create().texOffs(137, 59).addBox(-0.5F, 1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(147, 12).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2799F, 6.4389F, 0.2866F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftupperarm_r4 = leftupperarm.addOrReplaceChild("leftupperarm_r4", CubeListBuilder.create().texOffs(147, 102).addBox(-0.5F, -2.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2799F, 6.4389F, 0.2866F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftlowerarm = leftupperarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create().texOffs(156, 43).addBox(-0.004F, 1.3782F, -1.4129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(96, 149).addBox(-0.004F, -0.3218F, 0.2871F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 63).addBox(-0.004F, 2.6782F, -0.1129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3221F, 10.4607F, -0.8235F, -0.8949F, 0.2491F, -0.1345F));

		PartDefinition leftlowerarm_r1 = leftlowerarm.addOrReplaceChild("leftlowerarm_r1", CubeListBuilder.create().texOffs(146, 142).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.496F, -0.8218F, 1.2871F, 0.7679F, 0.0F, 0.0F));

		PartDefinition leftlowerarm_r2 = leftlowerarm.addOrReplaceChild("leftlowerarm_r2", CubeListBuilder.create().texOffs(145, 111).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.496F, -0.8218F, 1.2871F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftlowerarm_r3 = leftlowerarm.addOrReplaceChild("leftlowerarm_r3", CubeListBuilder.create().texOffs(157, 0).addBox(0.0293F, -1.8247F, -0.8759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0332F, 1.3317F, -0.5358F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftlowerarm_r4 = leftlowerarm.addOrReplaceChild("leftlowerarm_r4", CubeListBuilder.create().texOffs(156, 137).addBox(-13.7707F, -2.3536F, 0.7228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.7668F, 2.0317F, -2.0358F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lefthand = leftlowerarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(91, 121).addBox(0.2068F, 0.2228F, -1.3144F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1483F, 3.6598F, -0.1985F, 0.0F, 0.0F, -0.1698F));

		PartDefinition leftouterfingers = lefthand.addOrReplaceChild("leftouterfingers", CubeListBuilder.create().texOffs(39, 116).addBox(0.2339F, 0.0216F, -1.5144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0166F, 3.167F, 0.2F, 0.0F, 0.0F, -0.3821F));

		PartDefinition leftthumb = lefthand.addOrReplaceChild("leftthumb", CubeListBuilder.create().texOffs(140, 149).addBox(-0.1681F, -0.0409F, -0.4248F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5907F, 0.2958F, -1.1037F, -0.5308F, 0.0F, -0.2122F));

		PartDefinition leftthumbclaw = leftthumb.addOrReplaceChild("leftthumbclaw", CubeListBuilder.create().texOffs(134, 141).addBox(-0.4278F, 1.3754F, -6.6728F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6055F, 1.5369F, 6.2759F, -0.0213F, 0.0F, -0.6793F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.633F, -10.4901F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r135 = neck5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(157, 127).addBox(-0.5F, -2.8186F, -0.8148F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, 0.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(121, 157).addBox(-0.5F, -2.5008F, -0.7786F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -1.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 157).addBox(-0.5F, -2.5286F, 0.8866F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(-1.5F, -0.1286F, -2.1134F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, -5.3F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r138 = neck5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 157).addBox(-0.5F, -2.3663F, -0.0265F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5F, -6.3F, -0.4538F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r65 = neck5.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(143, 116).mirror().addBox(-4.0694F, -0.865F, -0.5011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.354F, -6.2088F, 0.4005F, 0.4756F, -1.2721F));

		PartDefinition bodymiddle_r66 = neck5.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(154, 60).mirror().addBox(-1.319F, -0.39F, -0.4929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.354F, -6.2088F, 0.5418F, 0.289F, -0.8986F));

		PartDefinition bodymiddle_r67 = neck5.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(154, 58).mirror().addBox(-5.0917F, -2.7838F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.354F, -6.2088F, 0.0868F, 0.6063F, -1.8668F));

		PartDefinition bodymiddle_r68 = neck5.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(154, 56).mirror().addBox(-1.319F, -0.39F, -0.4929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.754F, -4.2088F, 0.5193F, 0.2616F, -0.9047F));

		PartDefinition bodymiddle_r69 = neck5.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(143, 91).mirror().addBox(-4.0694F, -0.865F, -0.5011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.754F, -4.2088F, 0.3891F, 0.4422F, -1.2771F));

		PartDefinition bodymiddle_r70 = neck5.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(154, 41).mirror().addBox(-5.0917F, -2.7838F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.754F, -4.2088F, 0.0989F, 0.5729F, -1.8601F));

		PartDefinition bodymiddle_r71 = neck5.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(153, 144).mirror().addBox(-1.5929F, -0.3427F, -0.3231F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.254F, -2.4088F, 0.5465F, 0.3337F, -0.6895F));

		PartDefinition bodymiddle_r72 = neck5.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(143, 89).mirror().addBox(-6.2968F, -2.9731F, -0.3332F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.254F, -2.4088F, 0.0441F, 0.6349F, -1.684F));

		PartDefinition bodymiddle_r73 = neck5.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(138, 94).mirror().addBox(-4.3417F, -0.9263F, -0.3332F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.254F, -2.4088F, 0.3864F, 0.5189F, -1.0711F));

		PartDefinition bodymiddle_r74 = neck5.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(154, 58).addBox(3.0917F, -2.7838F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.354F, -6.2088F, 0.0868F, -0.6063F, 1.8668F));

		PartDefinition bodymiddle_r75 = neck5.addOrReplaceChild("bodymiddle_r75", CubeListBuilder.create().texOffs(154, 60).addBox(-0.681F, -0.39F, -0.4929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.354F, -6.2088F, 0.5418F, -0.289F, 0.8986F));

		PartDefinition bodymiddle_r76 = neck5.addOrReplaceChild("bodymiddle_r76", CubeListBuilder.create().texOffs(143, 116).addBox(1.0694F, -0.865F, -0.5011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.354F, -6.2088F, 0.4005F, -0.4756F, 1.2721F));

		PartDefinition bodymiddle_r77 = neck5.addOrReplaceChild("bodymiddle_r77", CubeListBuilder.create().texOffs(154, 56).addBox(-0.681F, -0.39F, -0.4929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.754F, -4.2088F, 0.5193F, -0.2616F, 0.9047F));

		PartDefinition bodymiddle_r78 = neck5.addOrReplaceChild("bodymiddle_r78", CubeListBuilder.create().texOffs(143, 91).addBox(1.0694F, -0.865F, -0.5011F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.754F, -4.2088F, 0.3891F, -0.4422F, 1.2771F));

		PartDefinition bodymiddle_r79 = neck5.addOrReplaceChild("bodymiddle_r79", CubeListBuilder.create().texOffs(154, 41).addBox(3.0917F, -2.7838F, -0.5011F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.754F, -4.2088F, 0.0989F, -0.5729F, 1.8601F));

		PartDefinition bodymiddle_r80 = neck5.addOrReplaceChild("bodymiddle_r80", CubeListBuilder.create().texOffs(153, 144).addBox(-0.4071F, -0.3427F, -0.3231F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.254F, -2.4088F, 0.5465F, -0.3337F, 0.6895F));

		PartDefinition bodymiddle_r81 = neck5.addOrReplaceChild("bodymiddle_r81", CubeListBuilder.create().texOffs(143, 89).addBox(3.2968F, -2.9731F, -0.3332F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.254F, -2.4088F, 0.0441F, -0.6349F, 1.684F));

		PartDefinition bodymiddle_r82 = neck5.addOrReplaceChild("bodymiddle_r82", CubeListBuilder.create().texOffs(138, 94).addBox(1.3417F, -0.9263F, -0.3332F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.254F, -2.4088F, 0.3864F, -0.5189F, 1.0711F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4796F, -7.2215F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r139 = neck4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(157, 109).addBox(-0.5F, -3.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(148, 159).addBox(-0.5F, -2.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 31).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.6202F, -2.8267F, -0.733F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r83 = neck4.addOrReplaceChild("bodymiddle_r83", CubeListBuilder.create().texOffs(136, 5).mirror().addBox(-5.0495F, -0.8363F, -0.5251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.7742F, -2.8355F, 0.2304F, 0.3267F, -1.4072F));

		PartDefinition bodymiddle_r84 = neck4.addOrReplaceChild("bodymiddle_r84", CubeListBuilder.create().texOffs(158, 107).mirror().addBox(-1.2898F, -0.3711F, -0.517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.7742F, -2.8355F, 0.3347F, 0.2092F, -1.0182F));

		PartDefinition bodymiddle_r85 = neck4.addOrReplaceChild("bodymiddle_r85", CubeListBuilder.create().texOffs(135, 98).mirror().addBox(-5.0495F, -0.8363F, -0.5251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0742F, -1.1355F, 0.2557F, 0.4644F, -1.3974F));

		PartDefinition bodymiddle_r86 = neck4.addOrReplaceChild("bodymiddle_r86", CubeListBuilder.create().texOffs(129, 19).mirror().addBox(-1.2898F, -0.3711F, -0.517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0742F, -1.1355F, 0.412F, 0.3273F, -0.9977F));

		PartDefinition bodymiddle_r87 = neck4.addOrReplaceChild("bodymiddle_r87", CubeListBuilder.create().texOffs(158, 107).addBox(0.2898F, -0.3711F, -0.517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7742F, -2.8355F, 0.3347F, -0.2092F, 1.0182F));

		PartDefinition bodymiddle_r88 = neck4.addOrReplaceChild("bodymiddle_r88", CubeListBuilder.create().texOffs(136, 5).addBox(1.0495F, -0.8363F, -0.5251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7742F, -2.8355F, 0.2304F, -0.3267F, 1.4072F));

		PartDefinition bodymiddle_r89 = neck4.addOrReplaceChild("bodymiddle_r89", CubeListBuilder.create().texOffs(135, 98).addBox(1.0495F, -0.8363F, -0.5251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0742F, -1.1355F, 0.2557F, -0.4644F, 1.3974F));

		PartDefinition bodymiddle_r90 = neck4.addOrReplaceChild("bodymiddle_r90", CubeListBuilder.create().texOffs(129, 19).addBox(0.2898F, -0.3711F, -0.517F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0742F, -1.1355F, 0.412F, -0.3273F, 0.9977F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0255F, -3.3525F, -0.2921F, -0.1564F, 0.0982F));

		PartDefinition cube_r140 = neck3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(157, 97).addBox(-0.5F, -2.0657F, 2.0647F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 157).addBox(-0.5F, -2.7657F, 0.0647F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.7103F, -1.8155F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r141 = neck3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(103, 137).addBox(-0.5F, -3.9713F, -0.1053F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.8103F, -3.7155F, -0.9425F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r91 = neck3.addOrReplaceChild("bodymiddle_r91", CubeListBuilder.create().texOffs(158, 135).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3487F, -1.183F, 0.3922F, 0.2979F, -1.0038F));

		PartDefinition bodymiddle_r92 = neck3.addOrReplaceChild("bodymiddle_r92", CubeListBuilder.create().texOffs(159, 39).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8487F, -2.383F, 0.3254F, 0.1943F, -1.02F));

		PartDefinition bodymiddle_r93 = neck3.addOrReplaceChild("bodymiddle_r93", CubeListBuilder.create().texOffs(159, 50).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.8487F, -3.983F, 0.3069F, 0.1645F, -1.0233F));

		PartDefinition bodymiddle_r94 = neck3.addOrReplaceChild("bodymiddle_r94", CubeListBuilder.create().texOffs(143, 159).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.9487F, -5.783F, 0.3441F, 0.224F, -1.0162F));

		PartDefinition bodymiddle_r95 = neck3.addOrReplaceChild("bodymiddle_r95", CubeListBuilder.create().texOffs(136, 13).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.9487F, -5.783F, 0.2334F, 0.344F, -1.4062F));

		PartDefinition bodymiddle_r96 = neck3.addOrReplaceChild("bodymiddle_r96", CubeListBuilder.create().texOffs(21, 136).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.8487F, -3.983F, 0.2215F, 0.2751F, -1.4098F));

		PartDefinition bodymiddle_r97 = neck3.addOrReplaceChild("bodymiddle_r97", CubeListBuilder.create().texOffs(136, 17).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8487F, -2.383F, 0.2274F, 0.3095F, -1.4081F));

		PartDefinition bodymiddle_r98 = neck3.addOrReplaceChild("bodymiddle_r98", CubeListBuilder.create().texOffs(136, 15).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3487F, -1.183F, 0.2491F, 0.43F, -1.4002F));

		PartDefinition bodymiddle_r99 = neck3.addOrReplaceChild("bodymiddle_r99", CubeListBuilder.create().texOffs(136, 13).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.9487F, -5.783F, 0.2334F, -0.344F, 1.4062F));

		PartDefinition bodymiddle_r100 = neck3.addOrReplaceChild("bodymiddle_r100", CubeListBuilder.create().texOffs(143, 159).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.9487F, -5.783F, 0.3441F, -0.224F, 1.0162F));

		PartDefinition bodymiddle_r101 = neck3.addOrReplaceChild("bodymiddle_r101", CubeListBuilder.create().texOffs(21, 136).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.8487F, -3.983F, 0.2215F, -0.2751F, 1.4098F));

		PartDefinition bodymiddle_r102 = neck3.addOrReplaceChild("bodymiddle_r102", CubeListBuilder.create().texOffs(159, 50).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.8487F, -3.983F, 0.3069F, -0.1645F, 1.0233F));

		PartDefinition bodymiddle_r103 = neck3.addOrReplaceChild("bodymiddle_r103", CubeListBuilder.create().texOffs(136, 17).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8487F, -2.383F, 0.2274F, -0.3095F, 1.4081F));

		PartDefinition bodymiddle_r104 = neck3.addOrReplaceChild("bodymiddle_r104", CubeListBuilder.create().texOffs(159, 39).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8487F, -2.383F, 0.3254F, -0.1943F, 1.02F));

		PartDefinition bodymiddle_r105 = neck3.addOrReplaceChild("bodymiddle_r105", CubeListBuilder.create().texOffs(158, 135).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3487F, -1.183F, 0.3922F, -0.2979F, 1.0038F));

		PartDefinition bodymiddle_r106 = neck3.addOrReplaceChild("bodymiddle_r106", CubeListBuilder.create().texOffs(136, 15).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3487F, -1.183F, 0.2491F, -0.43F, 1.4002F));

		PartDefinition cube_r142 = neck3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 136).addBox(-0.5F, -4.1293F, -4.9121F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 77).addBox(-1.0F, 0.3707F, -4.9121F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.7103F, -2.2155F, -0.8727F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.6103F, -5.9155F, -0.2325F, -0.2008F, -0.0831F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 128).addBox(0.0F, -5.2803F, 0.0283F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2106F, -2.7426F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 127).addBox(0.0F, -5.3517F, -2.1501F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4106F, -3.5426F, -0.3316F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r107 = neck2.addOrReplaceChild("bodymiddle_r107", CubeListBuilder.create().texOffs(159, 150).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1385F, -1.8675F, 0.4956F, 0.4435F, -0.9661F));

		PartDefinition bodymiddle_r108 = neck2.addOrReplaceChild("bodymiddle_r108", CubeListBuilder.create().texOffs(159, 152).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9385F, -4.8675F, 0.6015F, 0.5705F, -0.9146F));

		PartDefinition bodymiddle_r109 = neck2.addOrReplaceChild("bodymiddle_r109", CubeListBuilder.create().texOffs(134, 24).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9385F, -4.8675F, 0.3251F, 0.7557F, -1.3572F));

		PartDefinition bodymiddle_r110 = neck2.addOrReplaceChild("bodymiddle_r110", CubeListBuilder.create().texOffs(135, 96).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1385F, -1.8675F, 0.2848F, 0.6018F, -1.3825F));

		PartDefinition bodymiddle_r111 = neck2.addOrReplaceChild("bodymiddle_r111", CubeListBuilder.create().texOffs(134, 24).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9385F, -4.8675F, 0.3251F, -0.7557F, 1.3572F));

		PartDefinition bodymiddle_r112 = neck2.addOrReplaceChild("bodymiddle_r112", CubeListBuilder.create().texOffs(159, 152).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9385F, -4.8675F, 0.6015F, -0.5705F, 0.9146F));

		PartDefinition bodymiddle_r113 = neck2.addOrReplaceChild("bodymiddle_r113", CubeListBuilder.create().texOffs(135, 96).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1385F, -1.8675F, 0.2848F, -0.6018F, 1.3825F));

		PartDefinition bodymiddle_r114 = neck2.addOrReplaceChild("bodymiddle_r114", CubeListBuilder.create().texOffs(159, 150).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1385F, -1.8675F, 0.4956F, -0.4435F, 0.9661F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 77).addBox(-1.0F, -0.1F, -3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.4F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -6.6F, 0.2474F, -0.0849F, -0.0275F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(98, 135).addBox(0.0F, -4.8592F, -0.4606F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5578F, -1.3884F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(20, 150).addBox(0.0F, -4.0936F, -0.3868F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5578F, -3.5884F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r148 = neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(105, 61).addBox(-0.5F, -0.4168F, -1.0513F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0993F, -3.8738F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r115 = neck.addOrReplaceChild("bodymiddle_r115", CubeListBuilder.create().texOffs(160, 31).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0378F, -1.1413F, 0.6961F, 0.6653F, -0.8597F));

		PartDefinition bodymiddle_r116 = neck.addOrReplaceChild("bodymiddle_r116", CubeListBuilder.create().texOffs(160, 70).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2622F, -3.5413F, 0.8227F, 0.7674F, -0.7764F));

		PartDefinition bodymiddle_r117 = neck.addOrReplaceChild("bodymiddle_r117", CubeListBuilder.create().texOffs(160, 86).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7622F, -5.5413F, 0.9754F, 0.8597F, -0.6652F));

		PartDefinition bodymiddle_r118 = neck.addOrReplaceChild("bodymiddle_r118", CubeListBuilder.create().texOffs(160, 109).mirror().addBox(-1.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1622F, -8.0413F, 1.4164F, 1.0016F, -0.3086F));

		PartDefinition bodymiddle_r119 = neck.addOrReplaceChild("bodymiddle_r119", CubeListBuilder.create().texOffs(134, 134).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1622F, -8.0413F, 1.1468F, 1.3836F, -0.5932F));

		PartDefinition bodymiddle_r120 = neck.addOrReplaceChild("bodymiddle_r120", CubeListBuilder.create().texOffs(134, 70).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7622F, -5.5413F, 0.5254F, 1.1413F, -1.1912F));

		PartDefinition bodymiddle_r121 = neck.addOrReplaceChild("bodymiddle_r121", CubeListBuilder.create().texOffs(134, 68).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2622F, -3.5413F, 0.4283F, 1.0094F, -1.2768F));

		PartDefinition bodymiddle_r122 = neck.addOrReplaceChild("bodymiddle_r122", CubeListBuilder.create().texOffs(134, 72).mirror().addBox(-4.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0378F, -1.1413F, 0.3654F, 0.8747F, -1.3278F));

		PartDefinition bodymiddle_r123 = neck.addOrReplaceChild("bodymiddle_r123", CubeListBuilder.create().texOffs(134, 134).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1622F, -8.0413F, 1.1468F, -1.3836F, 0.5932F));

		PartDefinition bodymiddle_r124 = neck.addOrReplaceChild("bodymiddle_r124", CubeListBuilder.create().texOffs(160, 109).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1622F, -8.0413F, 1.4164F, -1.0016F, 0.3086F));

		PartDefinition bodymiddle_r125 = neck.addOrReplaceChild("bodymiddle_r125", CubeListBuilder.create().texOffs(134, 70).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7622F, -5.5413F, 0.5254F, -1.1413F, 1.1912F));

		PartDefinition bodymiddle_r126 = neck.addOrReplaceChild("bodymiddle_r126", CubeListBuilder.create().texOffs(160, 86).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7622F, -5.5413F, 0.9754F, -0.8597F, 0.6652F));

		PartDefinition bodymiddle_r127 = neck.addOrReplaceChild("bodymiddle_r127", CubeListBuilder.create().texOffs(134, 68).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2622F, -3.5413F, 0.4283F, -1.0094F, 1.2768F));

		PartDefinition bodymiddle_r128 = neck.addOrReplaceChild("bodymiddle_r128", CubeListBuilder.create().texOffs(160, 70).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2622F, -3.5413F, 0.8227F, -0.7674F, 0.7764F));

		PartDefinition bodymiddle_r129 = neck.addOrReplaceChild("bodymiddle_r129", CubeListBuilder.create().texOffs(134, 72).addBox(0.9723F, -0.3501F, -0.6123F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0378F, -1.1413F, 0.3654F, -0.8747F, 1.3278F));

		PartDefinition bodymiddle_r130 = neck.addOrReplaceChild("bodymiddle_r130", CubeListBuilder.create().texOffs(160, 31).addBox(0.033F, 0.0488F, -0.6053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0378F, -1.1413F, 0.6961F, -0.6653F, 0.8597F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(74, 96).addBox(-1.0F, -1.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5628F, -4.5376F, 0.7174F, 0.0736F, 0.0466F));

		PartDefinition cube_r149 = neck6.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(141, 143).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1343F, -3.5212F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r150 = neck6.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(113, 138).addBox(-0.5F, -3.7F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4085F, -5.949F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(109, 8).addBox(-1.5F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.7951F, -19.4513F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(136, 112).addBox(-2.0F, 0.0107F, -0.1286F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 15.7F, -19.9F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(103, 47).addBox(-1.0F, -1.0626F, -0.0082F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5F, -14.7F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 54).addBox(-1.0F, 0.056F, -0.0592F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 11.7F, -16.8F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(136, 32).addBox(-1.0F, -0.8749F, -0.823F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.5F, -15.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(145, 48).addBox(-1.0F, 0.0336F, 0.0164F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 96).addBox(-0.5F, -2.059F, -0.0474F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, -9.2F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(39, 124).addBox(-0.5F, 0.0256F, 0.0678F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1F, -12.9F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(103, 39).addBox(-0.5F, 0.0256F, -5.9322F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1F, -12.9F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(141, 41).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.015F, -7.047F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(127, 27).addBox(-0.5F, -0.1348F, -2.6022F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(154, 151).addBox(-0.5F, -1.0959F, -0.8316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(138, 49).addBox(-0.5F, -0.0706F, 0.136F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6F, -7.3F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(138, 158).addBox(-0.98F, -4.8832F, -4.594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.5F, -12.9F, -1.4583F, 0.1736F, -0.1063F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(27, 74).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 56).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7F, -3.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(39, 107).addBox(-1.0F, -0.0536F, -0.8884F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.5F, -2.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(145, 68).addBox(-1.2483F, -0.7212F, -0.7659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -1.5709F, -1.6803F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(124, 158).addBox(-1.2483F, -0.5662F, -1.1336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -1.5709F, -1.6803F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(118, 16).addBox(-1.7483F, 0.085F, -1.5083F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -1.5709F, -1.6803F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 97).addBox(-1.0F, 0.0F, -2.9F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 0.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(97, 73).addBox(-1.0F, 0.0F, -2.9F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7483F, -1.5709F, -1.6803F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(141, 36).addBox(-0.9261F, -0.6298F, -1.5769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8174F, 0.7368F, 0.1245F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(149, 52).addBox(1.7F, -0.0119F, -2.0654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7483F, 0.8709F, 1.6803F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(108, 113).addBox(-3.0F, -8.2624F, 7.5057F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, 0.0339F, 0.1736F, -0.1063F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(159, 89).addBox(-0.5822F, -0.233F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, -0.4887F, 0.3142F, -0.0873F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(50, 157).addBox(-0.5822F, -0.1053F, -1.291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, 0.2094F, 0.3142F, -0.0873F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(91, 156).addBox(-0.5822F, -1.8685F, -1.1103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, -0.8203F, 0.3142F, -0.0873F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(156, 141).addBox(-0.5822F, -0.6841F, 0.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 36).addBox(-0.3622F, -0.6841F, 0.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, 0.7418F, 0.3142F, -0.0873F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(148, 78).addBox(-0.5822F, -1.7299F, 0.1908F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, -0.4712F, 0.3142F, -0.0873F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(152, 16).addBox(-0.5923F, -1.9389F, -0.3297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6439F, 2.7846F, -2.7781F, -0.5934F, 0.3142F, -0.0873F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(152, 11).addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1517F, 3.8748F, -1.6131F, -0.4523F, 0.0382F, 0.0785F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(152, 0).addBox(-1.0F, -0.0012F, -0.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6517F, 0.0819F, -1.1995F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(158, 120).addBox(-0.6F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3494F, 0.5779F, -1.9696F, 0.194F, -0.1452F, -0.0317F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(158, 117).addBox(-0.1856F, -0.4958F, -1.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1465F, 0.5083F, -1.6263F, 0.5275F, 0.5213F, 0.1565F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(21, 90).addBox(-0.5F, -2.0F, -5.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3352F, 4.8369F, -4.0393F, 0.8106F, 0.1736F, -0.1063F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 114).addBox(-2.0F, -3.8589F, 6.6306F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, 0.4179F, 0.1736F, -0.1063F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(158, 132).addBox(-0.98F, -4.8832F, -5.094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, -1.4583F, 0.1736F, -0.1063F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 146).addBox(-0.98F, -10.3428F, -0.8612F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, -0.6729F, 0.1736F, -0.1063F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(141, 136).addBox(-0.98F, -10.1465F, 1.3542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, -0.4548F, 0.1736F, -0.1063F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(96, 87).addBox(-1.0F, -1.9377F, 0.095F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, 0.6972F, 0.1736F, -0.1063F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(157, 33).addBox(-0.88F, -3.6448F, -1.9838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, -0.8475F, 0.1736F, -0.1063F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(57, 96).addBox(-1.0F, -1.9399F, 0.0121F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3517F, 12.0709F, -11.2197F, 0.575F, 0.1736F, -0.1063F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(134, 19).addBox(-1.0F, -0.0232F, -2.9596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2483F, 12.7709F, -15.4197F, 0.7183F, -0.079F, -0.0688F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(146, 138).addBox(-1.0F, -0.142F, -2.0604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1517F, 14.3709F, -16.3197F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(133, 146).addBox(-1.0F, -0.9852F, -1.9941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1517F, 14.1709F, -14.2197F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(159, 114).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4483F, 15.2924F, -17.5124F, 0.8906F, -0.0275F, -0.0339F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(161, 75).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1483F, 17.634F, -16.7561F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(160, 15).addBox(0.012F, -1.1403F, -0.5136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0513F, 16.6567F, -16.1563F, 0.7225F, 0.0488F, -0.0724F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 99).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, 15.1753F, -15.8589F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(147, 93).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, 14.1466F, -13.9089F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(68, 18).addBox(0.2F, -0.5739F, 0.4503F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, 14.6451F, -13.5801F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(26, 161).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.456F, 9.6827F, -7.6322F, 0.6278F, 0.0298F, -0.0319F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(148, 84).addBox(-0.0332F, 0.3604F, 1.2659F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 83).addBox(-0.2332F, -0.4396F, -0.7341F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4517F, 11.6213F, -10.9736F, 0.75F, 0.0298F, -0.0319F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(14, 125).addBox(-0.803F, 0.112F, -2.9907F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, -0.3091F, 0.1245F, -0.0838F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(140, 0).addBox(-0.703F, -2.9448F, 2.3565F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, -2.578F, 0.1245F, -0.0838F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(154, 36).addBox(-0.703F, 0.3706F, -2.1467F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, 0.2494F, 0.1245F, -0.0838F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(143, 118).addBox(-0.703F, 0.115F, -1.4568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, -0.4575F, 0.1245F, -0.0838F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(45, 156).addBox(-0.703F, 1.4753F, 2.8468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, -1.2254F, 0.1245F, -0.0838F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(140, 80).addBox(-0.803F, -0.2771F, -0.9496F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, 0.1796F, 0.1245F, -0.0838F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(99, 159).addBox(-0.803F, 3.2051F, 2.9911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(105, 69).addBox(-0.803F, -0.8591F, -0.3426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, -0.6233F, 0.1245F, -0.0838F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 97).addBox(-0.803F, 1.3816F, -3.7443F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2517F, 1.77F, 1.5327F, 0.04F, 0.1245F, -0.0838F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(160, 4).addBox(-0.1332F, -0.3396F, -0.1341F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2517F, 13.0535F, -12.5095F, 0.75F, 0.0298F, -0.0319F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7483F, -1.5709F, -1.6803F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(141, 36).mirror().addBox(-0.0739F, -0.6298F, -1.5769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8174F, -0.7368F, -0.1245F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(149, 52).mirror().addBox(-2.7F, -0.0119F, -2.0654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7483F, 0.8709F, 1.6803F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(108, 113).mirror().addBox(0.0F, -8.2624F, 7.5057F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, 0.0339F, -0.1736F, 0.1063F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(159, 89).mirror().addBox(-0.4178F, -0.233F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, -0.4887F, -0.3142F, 0.0873F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(50, 157).mirror().addBox(-0.4178F, -0.1053F, -1.291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, 0.2094F, -0.3142F, 0.0873F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(91, 156).mirror().addBox(-0.4178F, -1.8685F, -1.1103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, -0.8203F, -0.3142F, 0.0873F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(156, 141).mirror().addBox(-0.4178F, -0.6841F, 0.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 36).mirror().addBox(-0.6378F, -0.6841F, 0.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, 0.7418F, -0.3142F, 0.0873F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(148, 78).mirror().addBox(-0.4178F, -1.7299F, 0.1908F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, -0.4712F, -0.3142F, 0.0873F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(152, 16).mirror().addBox(-0.4077F, -1.9389F, -0.3297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6439F, 2.7846F, -2.7781F, -0.5934F, -0.3142F, 0.0873F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(152, 11).mirror().addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1517F, 3.8748F, -1.6131F, -0.4523F, -0.0382F, -0.0785F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(152, 0).mirror().addBox(0.0F, -0.0012F, -0.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6517F, 0.0819F, -1.1995F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(158, 120).mirror().addBox(-0.4F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3494F, 0.5779F, -1.9696F, 0.194F, 0.1452F, 0.0317F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(158, 117).mirror().addBox(-0.8144F, -0.4958F, -1.0415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1465F, 0.5083F, -1.6263F, 0.5275F, -0.5213F, -0.1565F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(21, 90).mirror().addBox(-0.5F, -2.0F, -5.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3352F, 4.8369F, -4.0393F, 0.8106F, -0.1736F, 0.1063F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(0.0F, -3.8589F, 6.6306F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, 0.4179F, -0.1736F, 0.1063F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(158, 132).mirror().addBox(-0.02F, -4.8832F, -5.094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, -1.4583F, -0.1736F, 0.1063F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(76, 146).mirror().addBox(-0.02F, -10.3428F, -0.8612F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, -0.6729F, -0.1736F, 0.1063F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(141, 136).mirror().addBox(-0.02F, -10.1465F, 1.3542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, -0.4548F, -0.1736F, 0.1063F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(0.0F, -1.9377F, 0.095F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, 0.6972F, -0.1736F, 0.1063F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(157, 33).mirror().addBox(-0.12F, -3.6448F, -1.9838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, -0.8475F, -0.1736F, 0.1063F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(57, 96).mirror().addBox(0.0F, -1.9399F, 0.0121F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3517F, 12.0709F, -11.2197F, 0.575F, -0.1736F, 0.1063F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(134, 19).mirror().addBox(0.0F, -0.0232F, -2.9596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2483F, 12.7709F, -15.4197F, 0.7183F, 0.079F, 0.0688F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(146, 138).mirror().addBox(0.0F, -0.142F, -2.0604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1517F, 14.3709F, -16.3197F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(133, 146).mirror().addBox(0.0F, -0.9852F, -1.9941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1517F, 14.1709F, -14.2197F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(159, 114).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4483F, 15.2924F, -17.5124F, 0.8906F, 0.0275F, 0.0339F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(161, 75).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1483F, 17.634F, -16.7561F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(160, 15).mirror().addBox(-0.012F, -1.1403F, -0.5136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0513F, 16.6567F, -16.1563F, 0.7225F, -0.0488F, 0.0724F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(17, 99).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0483F, 15.1753F, -15.8589F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(147, 93).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0483F, 14.1466F, -13.9089F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.2F, -0.5739F, 0.4503F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0483F, 14.6451F, -13.5801F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(26, 161).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.456F, 9.6827F, -7.6322F, 0.6278F, -0.0298F, 0.0319F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(148, 84).mirror().addBox(0.0332F, 0.3604F, 1.2659F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 83).mirror().addBox(0.2332F, -0.4396F, -0.7341F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4517F, 11.6213F, -10.9736F, 0.75F, -0.0298F, 0.0319F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(14, 125).mirror().addBox(-0.197F, 0.112F, -2.9907F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, -0.3091F, -0.1245F, 0.0838F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-0.297F, -2.9448F, 2.3565F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, -2.578F, -0.1245F, 0.0838F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(154, 36).mirror().addBox(-0.297F, 0.3706F, -2.1467F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, 0.2494F, -0.1245F, 0.0838F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(143, 118).mirror().addBox(-0.297F, 0.115F, -1.4568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, -0.4575F, -0.1245F, 0.0838F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(45, 156).mirror().addBox(-0.297F, 1.4753F, 2.8468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, -1.2254F, -0.1245F, 0.0838F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(140, 80).mirror().addBox(-0.197F, -0.2771F, -0.9496F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, 0.1796F, -0.1245F, 0.0838F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(99, 159).mirror().addBox(-0.197F, 3.2051F, 2.9911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(105, 69).mirror().addBox(-0.197F, -0.8591F, -0.3426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, -0.6233F, -0.1245F, 0.0838F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(106, 97).mirror().addBox(-0.197F, 1.3816F, -3.7443F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2517F, 1.77F, 1.5327F, 0.04F, -0.1245F, 0.0838F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(160, 4).mirror().addBox(0.1332F, -0.3396F, -0.1341F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2517F, 13.0535F, -12.5095F, 0.75F, -0.0298F, 0.0319F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.8392F, 0.7026F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(143, 7).mirror().addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5973F, -2.1914F, 0.5889F, -0.2564F, -0.1678F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(155, 5).mirror().addBox(-0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5973F, -2.1914F, 0.9006F, -0.0971F, 0.0434F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(155, 5).addBox(0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5973F, -2.1914F, 0.9006F, 0.0971F, -0.0434F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(143, 7).addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5973F, -2.1914F, 0.5889F, 0.2564F, 0.1678F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, 0.3F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftAngularSurangular.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 106).addBox(-0.8F, -0.226F, -4.4282F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.1761F, 0.1193F, 0.0266F));

		PartDefinition cube_r259 = leftAngularSurangular.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(56, 114).addBox(-0.8F, -1.5877F, -5.7265F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.9266F, 0.1193F, 0.0266F));

		PartDefinition cube_r260 = leftAngularSurangular.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(32, 132).addBox(-0.8F, -1.4631F, -6.0576F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.4554F, 0.1193F, 0.0266F));

		PartDefinition cube_r261 = leftAngularSurangular.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(148, 118).addBox(-0.8F, -0.0399F, -2.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.5601F, 0.1193F, 0.0266F));

		PartDefinition cube_r262 = leftAngularSurangular.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(66, 157).addBox(-0.77F, 4.8935F, 0.064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, -0.9147F, 0.1193F, 0.0266F));

		PartDefinition cube_r263 = leftAngularSurangular.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(68, 128).addBox(-1.0F, 2.4254F, -2.5774F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8424F, -5.215F, 0.5949F, 0.1155F, 0.0436F));

		PartDefinition cube_r264 = leftAngularSurangular.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(46, 132).addBox(-1.0F, -0.0721F, -1.9385F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 0.8424F, -5.215F, 0.5425F, 0.1155F, 0.0436F));

		PartDefinition cube_r265 = leftAngularSurangular.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(21, 138).addBox(-0.8F, -0.7989F, -4.1413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.4379F, 0.1193F, 0.0266F));

		PartDefinition cube_r266 = leftAngularSurangular.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(132, 39).addBox(-0.8F, -0.0404F, -2.2228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8F, -0.5F, 0.7F, 0.6299F, 0.1193F, 0.0266F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftDentary.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(159, 47).addBox(-0.7F, -0.0394F, -1.0106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -4.4F, -12.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftDentary.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(159, 36).addBox(-0.7F, -0.056F, -0.9538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.7F, -3.9F, -11.8F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftDentary.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(50, 161).addBox(0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8185F, -3.5344F, -11.319F, -0.194F, 0.0516F, 0.2568F));

		PartDefinition cube_r270 = leftDentary.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(157, 160).addBox(0.2F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5338F, -5.0367F, -12.3782F, -0.3296F, 0.0865F, 0.2474F));

		PartDefinition cube_r271 = leftDentary.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(160, 154).addBox(0.1F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5597F, -4.8064F, -13.7625F, 0.0927F, -0.0248F, 0.2606F));

		PartDefinition cube_r272 = leftDentary.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(161, 44).addBox(0.1F, -0.5F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5597F, -4.5161F, -14.3995F, 0.4147F, -0.1075F, 0.2392F));

		PartDefinition cube_r273 = leftDentary.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(141, 74).addBox(-0.5F, -1.8304F, -0.1073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9F, -3.6878F, -15.0479F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftDentary.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(143, 124).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, -3.4878F, -14.1479F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftDentary.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(142, 54).addBox(-0.7F, -1.9117F, -9.9844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7F, -1.7F, -3.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftDentary.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(16, 109).addBox(-1.0F, 1.475F, -3.3962F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, -2.8576F, -1.315F, -0.5478F, 0.1212F, -0.0717F));

		PartDefinition cube_r277 = leftDentary.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(127, 33).addBox(-0.1263F, 0.4141F, -1.9119F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7581F, -2.9901F, -5.7876F, -0.3535F, 0.101F, -0.0119F));

		PartDefinition cube_r278 = leftDentary.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(120, 53).addBox(-0.1886F, 0.336F, -6.158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(120, 0).addBox(-0.1886F, 1.036F, -6.158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7581F, -2.9901F, -5.7876F, -0.1617F, 0.0595F, 0.02F));

		PartDefinition cube_r279 = leftDentary.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(161, 59).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -3.4206F, -3.8597F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition cube_r280 = leftDentary.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(161, 56).addBox(-0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -3.7808F, -5.8295F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftDentary.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(160, 158).addBox(-0.3F, 3.1302F, -4.205F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(161, 41).addBox(-0.4F, 3.7302F, -6.205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.4F, -3.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftDentary.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(91, 115).addBox(-0.1263F, -0.4428F, -4.2466F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7581F, -2.9901F, -5.7876F, 0.013F, 0.101F, -0.0119F));

		PartDefinition cube_r283 = leftDentary.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(57, 106).addBox(-1.0F, -0.0327F, -4.9019F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, -2.8576F, -1.315F, -0.129F, 0.1212F, -0.0717F));

		PartDefinition rightAngularSurangular = jaw.addOrReplaceChild("rightAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 0.3F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightAngularSurangular.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(106, 106).mirror().addBox(-0.2F, -0.226F, -4.4282F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.1761F, -0.1193F, -0.0266F));

		PartDefinition cube_r285 = rightAngularSurangular.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(56, 114).mirror().addBox(-0.2F, -1.5877F, -5.7265F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.9266F, -0.1193F, -0.0266F));

		PartDefinition cube_r286 = rightAngularSurangular.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(32, 132).mirror().addBox(-0.2F, -1.4631F, -6.0576F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.4554F, -0.1193F, -0.0266F));

		PartDefinition cube_r287 = rightAngularSurangular.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(148, 118).mirror().addBox(-0.2F, -0.0399F, -2.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.5601F, -0.1193F, -0.0266F));

		PartDefinition cube_r288 = rightAngularSurangular.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(66, 157).mirror().addBox(-0.23F, 4.8935F, 0.064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, -0.9147F, -0.1193F, -0.0266F));

		PartDefinition cube_r289 = rightAngularSurangular.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(68, 128).mirror().addBox(0.0F, 2.4254F, -2.5774F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8424F, -5.215F, 0.5949F, -0.1155F, -0.0436F));

		PartDefinition cube_r290 = rightAngularSurangular.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(46, 132).mirror().addBox(0.0F, -0.0721F, -1.9385F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8424F, -5.215F, 0.5425F, -0.1155F, -0.0436F));

		PartDefinition cube_r291 = rightAngularSurangular.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(21, 138).mirror().addBox(-0.2F, -0.7989F, -4.1413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.4379F, -0.1193F, -0.0266F));

		PartDefinition cube_r292 = rightAngularSurangular.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(132, 39).mirror().addBox(-0.2F, -0.0404F, -2.2228F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 0.7F, 0.6299F, -0.1193F, -0.0266F));

		PartDefinition rightDentary = rightAngularSurangular.addOrReplaceChild("rightDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightDentary.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(159, 47).mirror().addBox(-0.3F, -0.0394F, -1.0106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -4.4F, -12.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightDentary.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(159, 36).mirror().addBox(-0.3F, -0.056F, -0.9538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.7F, -3.9F, -11.8F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightDentary.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(50, 161).mirror().addBox(-0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8185F, -3.5344F, -11.319F, -0.194F, -0.0516F, -0.2568F));

		PartDefinition cube_r296 = rightDentary.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(157, 160).mirror().addBox(-0.2F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5338F, -5.0367F, -12.3782F, -0.3296F, -0.0865F, -0.2474F));

		PartDefinition cube_r297 = rightDentary.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(160, 154).mirror().addBox(-0.1F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5597F, -4.8064F, -13.7625F, 0.0927F, 0.0248F, -0.2606F));

		PartDefinition cube_r298 = rightDentary.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(161, 44).mirror().addBox(-0.1F, -0.5F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5597F, -4.5161F, -14.3995F, 0.4147F, 0.1075F, -0.2392F));

		PartDefinition cube_r299 = rightDentary.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(141, 74).mirror().addBox(-0.5F, -1.8304F, -0.1073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.9F, -3.6878F, -15.0479F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightDentary.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(143, 124).mirror().addBox(-0.5F, 0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9F, -3.4878F, -14.1479F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightDentary.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(142, 54).mirror().addBox(-0.3F, -1.9117F, -9.9844F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.7F, -1.7F, -3.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightDentary.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(16, 109).mirror().addBox(0.0F, 1.475F, -3.3962F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, -2.8576F, -1.315F, -0.5478F, -0.1212F, 0.0717F));

		PartDefinition cube_r303 = rightDentary.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(127, 33).mirror().addBox(-0.8737F, 0.4141F, -1.9119F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7581F, -2.9901F, -5.7876F, -0.3535F, -0.101F, 0.0119F));

		PartDefinition cube_r304 = rightDentary.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(120, 53).mirror().addBox(-0.8114F, 0.336F, -6.158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 0).mirror().addBox(-0.8114F, 1.036F, -6.158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7581F, -2.9901F, -5.7876F, -0.1617F, -0.0595F, -0.02F));

		PartDefinition cube_r305 = rightDentary.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(161, 59).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, -3.4206F, -3.8597F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r306 = rightDentary.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(161, 56).mirror().addBox(0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.7808F, -5.8295F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightDentary.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(160, 158).mirror().addBox(0.3F, 3.1302F, -4.205F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(161, 41).mirror().addBox(0.4F, 3.7302F, -6.205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.4F, -3.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightDentary.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(91, 115).mirror().addBox(-0.8737F, -0.4428F, -4.2466F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7581F, -2.9901F, -5.7876F, 0.013F, -0.101F, 0.0119F));

		PartDefinition cube_r309 = rightDentary.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(0.0F, -0.0327F, -4.9019F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, -2.8576F, -1.315F, -0.129F, -0.1212F, 0.0717F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.003F))
				.texOffs(155, 9).addBox(1.0F, 0.2437F, 0.0149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 123).addBox(0.8F, 0.1219F, 3.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 154).addBox(0.7F, 0.1219F, 7.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 125).addBox(0.7F, 0.1219F, 11.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(155, 9).mirror().addBox(-3.0F, 0.2437F, 0.0149F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(155, 123).mirror().addBox(-2.8F, 0.1219F, 3.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 154).mirror().addBox(-2.7F, 0.1219F, 7.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(155, 125).mirror().addBox(-2.7F, 0.1219F, 11.0075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2582F, 10.3978F, -0.2608F, 0.3464F, -0.0443F));

		PartDefinition cube_r310 = tail.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(20, 157).addBox(-0.003F, -7.8383F, -1.0263F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9763F, 14.1185F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(35, 157).addBox(0.0F, -3.9897F, -0.1458F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9763F, 14.1185F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r312 = tail.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(157, 15).addBox(-0.003F, -7.8383F, -1.0263F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9763F, 10.1185F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r313 = tail.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(157, 27).addBox(0.0F, -3.9897F, -0.1458F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9763F, 10.1185F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(32, 156).addBox(-0.003F, -4.0728F, -0.0785F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8569F, 6.5932F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(26, 155).addBox(0.0F, -3.8403F, -0.5745F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0569F, 6.5932F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r316 = tail.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 148).addBox(0.0F, 4.7313F, 10.1825F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 150).addBox(0.0F, 2.4313F, 6.1825F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 19).addBox(0.0F, 0.7464F, 2.4418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.895F, -0.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r317 = tail.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(67, 77).addBox(0.0F, -7.6747F, -0.7263F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8257F, 2.7076F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.9476F, -0.0007F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(156, 52).addBox(0.6F, 0.0785F, -0.0003F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 54).addBox(0.5F, 0.0785F, 3.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 95).addBox(0.3F, 0.0785F, 7.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 156).addBox(0.1F, 0.0785F, 11.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 52).mirror().addBox(-2.6F, 0.0785F, -0.0003F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(156, 54).mirror().addBox(-2.5F, 0.0785F, 3.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(156, 95).mirror().addBox(-2.3F, 0.0785F, 7.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 156).mirror().addBox(-2.1F, 0.0785F, 11.9997F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0951F, 14.8991F, 0.2011F, 0.3549F, -0.0577F));

		PartDefinition cube_r318 = tail2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(63, 153).addBox(0.0F, 1.9998F, 3.7765F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(152, 103).addBox(0.0F, -0.0002F, -0.1235F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.995F, 9.9827F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(30, 148).addBox(-0.003F, -8.8383F, -0.8263F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 15.2194F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r320 = tail2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(3, 159).addBox(0.0F, -2.9897F, -0.1458F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 15.2194F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(151, 158).addBox(0.0F, -2.9897F, -0.1458F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 11.2194F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(148, 152).addBox(-0.003F, -7.8383F, -0.8263F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 11.2194F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(145, 152).addBox(-0.003F, -7.8383F, -0.8263F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 7.2194F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(77, 159).addBox(0.0F, -2.9897F, -0.1458F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 7.2194F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r325 = tail2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(38, 157).addBox(0.0F, -3.9897F, -0.1458F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 3.2194F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(157, 21).addBox(-0.003F, -7.8383F, -1.0263F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8812F, 3.2194F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r327 = tail2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(51, 150).addBox(0.0F, -0.0857F, -0.0595F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.895F, 4.9827F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(39, 150).addBox(0.0F, -0.0884F, -0.0729F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.095F, 0.2827F, 0.5149F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(37, 22).addBox(-0.5F, -0.865F, 0.0084F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.003F))
				.texOffs(156, 93).addBox(-0.1F, 0.1263F, 0.0085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 111).addBox(0.5F, 0.1263F, 4.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 160).addBox(0.4F, 0.1263F, 8.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 127).addBox(0.2F, 0.1263F, 12.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(160, 129).addBox(-0.1F, 0.1263F, 16.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 93).mirror().addBox(-1.9F, 0.1263F, 0.0085F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 111).mirror().addBox(-1.5F, 0.1263F, 4.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 160).mirror().addBox(-1.4F, 0.1263F, 8.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 127).mirror().addBox(-1.2F, 0.1263F, 12.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(160, 129).mirror().addBox(-0.9F, 0.1263F, 16.0085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1698F, 15.9994F, -0.2707F, 0.5527F, -0.3378F));

		PartDefinition cube_r329 = tail3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(17, 150).addBox(0.0F, 19.9848F, 30.3407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.995F, -23.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r330 = tail3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(67, 150).addBox(0.0F, -0.0778F, -1.0407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.795F, 8.6827F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r331 = tail3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(33, 148).addBox(0.0F, -11.4795F, 0.5033F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 15.32F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r332 = tail3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(148, 36).addBox(-0.003F, -5.6476F, -0.2464F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 15.32F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r333 = tail3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(65, 121).addBox(-0.003F, -11.5895F, -0.3316F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 11.42F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r334 = tail3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(8, 127).addBox(-0.003F, -9.6143F, -0.3574F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 7.52F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(161, 72).addBox(0.0F, -0.6089F, -0.4849F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 3.52F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 132).addBox(-0.003F, -9.3977F, -0.5654F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8114F, 3.52F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(54, 150).addBox(0.0F, -0.3063F, -0.9149F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.095F, 3.8827F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(37, 59).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1501F, 16.0196F, -0.1333F, 0.3891F, -0.2391F));

		PartDefinition cube_r338 = tail4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(14, 146).addBox(0.0F, 24.6848F, 38.9407F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 143).addBox(0.0F, 22.3848F, 34.9407F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 143).addBox(0.0F, 19.3848F, 30.9407F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.095F, -35.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r339 = tail4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(113, 145).addBox(-0.003F, -5.8031F, -0.1205F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 11.2004F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r340 = tail4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(124, 136).addBox(0.0F, -13.6159F, 0.6496F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 11.2004F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r341 = tail4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(48, 148).addBox(-0.003F, -5.8031F, -0.1205F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 7.2004F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(121, 136).addBox(0.0F, -13.6159F, 0.6496F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 7.2004F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(45, 148).addBox(-0.003F, -5.8031F, -0.1205F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 3.2004F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(136, 102).addBox(0.0F, -13.6159F, 0.6496F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6612F, 3.2004F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(72, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1798F, 15.0112F, -0.2241F, 0.3926F, -0.2959F));

		PartDefinition cube_r345 = tail5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(99, 12).addBox(0.0F, -0.8411F, -0.9324F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2536F, 11.87F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(153, 137).addBox(0.0F, 28.0848F, 43.9407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.295F, -46.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r347 = tail5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(151, 151).addBox(-0.003F, -4.8031F, -0.1205F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3815F, 12.1892F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r348 = tail5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 148).addBox(0.0F, -10.6159F, 0.5496F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3815F, 12.1892F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r349 = tail5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(95, 139).addBox(-0.003F, -6.8031F, -0.1205F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 8.2892F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r350 = tail5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(12, 154).addBox(0.0F, -11.6159F, 0.8496F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 8.2892F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r351 = tail5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(11, 136).addBox(-0.003F, -7.8031F, -0.1205F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4815F, 4.1892F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r352 = tail5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(9, 154).addBox(0.0F, -12.6159F, 0.9496F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4815F, 4.1892F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r353 = tail5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(61, 140).addBox(0.0F, -12.6159F, 0.6496F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4815F, 0.1892F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r354 = tail5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(11, 146).addBox(-0.003F, -5.8031F, -0.1205F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4815F, 0.1892F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r355 = tail5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(60, 149).addBox(0.0F, -0.5434F, -0.0705F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.495F, 1.2827F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(70, 41).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0562F, 13.9047F, -0.2316F, 0.0625F, -0.1848F));

		PartDefinition cube_r356 = tail6.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(113, 158).addBox(0.0F, 0.1F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 84).addBox(0.0F, -0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.693F, 7.027F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r357 = tail6.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(129, 158).addBox(0.0F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8872F, 2.9941F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r358 = tail6.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(82, 132).addBox(-0.003F, -10.1445F, 1.3709F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3253F, 8.9845F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail6.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 127).addBox(-0.003F, -9.782F, -0.3658F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3253F, 7.2845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail6.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(115, 126).addBox(-0.003F, -9.8031F, -0.1205F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3253F, 2.9845F, -0.7156F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(86, 0).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0749F, 14.8146F, -0.4012F, 0.0542F, -0.211F));

		PartDefinition cube_r361 = tail7.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(139, 102).addBox(-0.003F, -7.2217F, -0.1049F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2503F, -0.0301F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r362 = tail7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(104, 160).addBox(-0.003F, -2.9846F, 1.4194F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5503F, 6.0699F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r363 = tail7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(107, 160).addBox(0.0F, 1.6842F, 3.6547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 161).addBox(0.0F, 0.3842F, -0.3453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3679F, 0.2124F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r364 = tail7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(3, 152).addBox(-0.003F, -4.3739F, -0.0419F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5503F, 4.0699F, -0.7679F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 166, 166);
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