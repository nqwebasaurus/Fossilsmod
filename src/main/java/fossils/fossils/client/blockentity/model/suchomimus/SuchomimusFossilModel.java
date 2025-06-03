package fossils.fossils.client.blockentity.model.suchomimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuchomimusFossilModel extends SkullModelBase {
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart leftfingers;
	private final ModelPart leftclaw;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart rightfingers;
	private final ModelPart rightclaw;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;

	public SuchomimusFossilModel(ModelPart root) {
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.leftfingers = this.lefthand.getChild("leftfingers");
		this.leftclaw = this.lefthand.getChild("leftclaw");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.rightfingers = this.righthand.getChild("rightfingers");
		this.rightclaw = this.righthand.getChild("rightclaw");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.1882F, 0.6534F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = hips.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(51, 112).mirror().addBox(-4.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.099F, -0.0939F, -1.4919F));

		PartDefinition bodymiddle_r2 = hips.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(123, 92).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.1325F, -0.032F, -0.9709F));

		PartDefinition bodymiddle_r3 = hips.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(130, 65).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.136F, 0.0143F, -0.5809F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(132, 50).mirror().addBox(-1.5063F, -6.9776F, 6.6916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(55, 132).mirror().addBox(-1.5063F, -6.5776F, 6.6916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.2446F, -0.0415F, 0.188F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(112, 31).mirror().addBox(-1.5196F, -11.0857F, -3.8347F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -1.1173F, -0.0407F, 0.1902F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-1.4348F, -11.5414F, -2.8867F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.5936F, -0.043F, 0.1821F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(59, 96).mirror().addBox(-1.5592F, -9.6395F, -1.6791F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.1222F, 0.0F, 0.1745F));

		PartDefinition hips_r5 = hips.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(110, 94).mirror().addBox(-1.5592F, -11.6611F, -1.6123F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.1396F, 0.0F, 0.1745F));

		PartDefinition hips_r6 = hips.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(-0.3918F, -11.8046F, -2.8218F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.0103F, 0.2174F, 0.1091F));

		PartDefinition hips_r7 = hips.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-1.624F, -7.4092F, 2.5808F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.8235F, 0.2252F, 0.2027F));

		PartDefinition hips_r8 = hips.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(126, 18).mirror().addBox(-1.8855F, -8.8151F, -7.0209F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.0641F, 0.221F, 0.2264F));

		PartDefinition hips_r9 = hips.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-1.2846F, -11.2825F, 0.4967F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.6366F, 0.2269F, 0.1705F));

		PartDefinition hips_r10 = hips.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(1.6958F, 12.5736F, 0.0728F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.728F, -0.0089F, 0.0756F));

		PartDefinition hips_r11 = hips.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(38, 105).mirror().addBox(0.6793F, 3.8681F, -1.1015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 102).mirror().addBox(0.6793F, -2.1319F, -1.1015F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 1.0107F, -0.0512F, -0.149F));

		PartDefinition hips_r12 = hips.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(-0.5028F, -0.3507F, -0.1397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(59, 90).mirror().addBox(-0.5028F, -2.3507F, -1.0397F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2987F, 10.6509F, 6.1613F, 0.452F, -0.033F, -0.0522F));

		PartDefinition hips_r13 = hips.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(112, 111).mirror().addBox(-1.8855F, -8.9701F, -1.5101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.6515F, 0.221F, 0.2264F));

		PartDefinition hips_r14 = hips.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(0.4811F, -7.5829F, -5.5373F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.4497F, -0.0315F, -0.0854F));

		PartDefinition hips_r15 = hips.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(126, 12).mirror().addBox(0.4747F, -1.3331F, -1.9473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.8331F, -0.0449F, -0.081F));

		PartDefinition hips_r16 = hips.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(126, 117).mirror().addBox(0.3318F, 2.3786F, -1.6555F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.4966F, -0.09F, -0.0159F));

		PartDefinition hips_r17 = hips.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(30, 130).mirror().addBox(0.3445F, 0.3714F, -2.594F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.2725F, -0.0598F, -0.0784F));

		PartDefinition hips_r18 = hips.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(57, 126).mirror().addBox(0.356F, -0.1918F, -1.0267F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.969F, -0.0782F, -0.0202F));

		PartDefinition hips_r19 = hips.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-1.518F, -8.4135F, 2.1524F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.0352F, -0.041F, 0.1895F));

		PartDefinition hips_r20 = hips.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(112, 38).mirror().addBox(-1.5063F, -9.4877F, 0.0661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, -0.838F, -0.0415F, 0.188F));

		PartDefinition hips_r21 = hips.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(133, 17).mirror().addBox(0.6793F, -1.7966F, 2.4793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.0159F, -0.0512F, -0.149F));

		PartDefinition hips_r22 = hips.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(79, 127).mirror().addBox(0.6793F, 0.6501F, 1.4129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 5.9018F, 0.5184F, 0.5918F, -0.0512F, -0.149F));

		PartDefinition hips_r23 = hips.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(111, 129).mirror().addBox(-0.5028F, -1.9782F, -0.0333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2987F, 10.6509F, 6.1613F, 0.8883F, -0.033F, -0.0522F));

		PartDefinition hips_r24 = hips.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(25, 124).mirror().addBox(0.3318F, 6.5379F, -0.3218F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.6711F, -0.09F, -0.0159F));

		PartDefinition hips_r25 = hips.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(0.3066F, 1.1352F, 1.7625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -1.8685F, -0.1577F, 0.0182F));

		PartDefinition hips_r26 = hips.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(112, 118).mirror().addBox(0.3318F, 4.5339F, 1.1369F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, 4.4018F, -0.6816F, -0.7584F, -0.09F, -0.0159F));

		PartDefinition hips_r27 = hips.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(82, 0).addBox(-1.4811F, -7.5829F, -5.5373F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.4497F, 0.0315F, 0.0854F));

		PartDefinition hips_r28 = hips.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(126, 12).addBox(-1.4747F, -1.3331F, -1.9473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.8331F, 0.0449F, 0.081F));

		PartDefinition hips_r29 = hips.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(126, 117).addBox(-1.3318F, 2.3786F, -1.6555F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.4966F, 0.09F, 0.0159F));

		PartDefinition hips_r30 = hips.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(112, 111).addBox(0.8855F, -8.9701F, -1.5101F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.6515F, -0.221F, -0.2264F));

		PartDefinition hips_r31 = hips.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(126, 18).addBox(0.8855F, -8.8151F, -7.0209F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.0641F, -0.221F, -0.2264F));

		PartDefinition hips_r32 = hips.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(0, 98).addBox(0.624F, -7.4092F, 2.5808F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.8235F, -0.2252F, -0.2027F));

		PartDefinition hips_r33 = hips.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(103, 45).addBox(0.2846F, -11.2825F, 0.4967F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.6366F, -0.2269F, -0.1705F));

		PartDefinition hips_r34 = hips.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(74, 116).addBox(-0.6082F, -11.8046F, -2.8218F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.0103F, -0.2174F, -0.1091F));

		PartDefinition hips_r35 = hips.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(110, 94).addBox(0.5592F, -11.6611F, -1.6123F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.1396F, 0.0F, -0.1745F));

		PartDefinition hips_r36 = hips.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(30, 130).addBox(-1.3445F, 0.3714F, -2.594F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.2725F, 0.0598F, 0.0784F));

		PartDefinition hips_r37 = hips.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(57, 126).addBox(-1.356F, -0.1918F, -1.0267F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.969F, 0.0782F, 0.0202F));

		PartDefinition hips_r38 = hips.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(93, 72).addBox(0.518F, -8.4135F, 2.1524F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.0352F, 0.041F, -0.1895F));

		PartDefinition hips_r39 = hips.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(55, 132).addBox(0.5063F, -6.5776F, 6.6916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(132, 50).addBox(0.5063F, -6.9776F, 6.6916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.2446F, 0.0415F, -0.188F));

		PartDefinition hips_r40 = hips.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(112, 38).addBox(0.5063F, -9.4877F, 0.0661F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.838F, 0.0415F, -0.188F));

		PartDefinition hips_r41 = hips.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(112, 31).addBox(0.5196F, -11.0857F, -3.8347F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -1.1173F, 0.0407F, -0.1902F));

		PartDefinition hips_r42 = hips.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(95, 16).addBox(0.4348F, -11.5414F, -2.8867F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.5936F, 0.043F, -0.1821F));

		PartDefinition hips_r43 = hips.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(59, 96).addBox(0.5592F, -9.6395F, -1.6791F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, -0.1222F, 0.0F, -0.1745F));

		PartDefinition hips_r44 = hips.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(38, 105).addBox(-1.6793F, 3.8681F, -1.1015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 102).addBox(-1.6793F, -2.1319F, -1.1015F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 1.0107F, 0.0512F, 0.149F));

		PartDefinition bodymiddle_r4 = hips.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(51, 112).addBox(3.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.099F, 0.0939F, 1.4919F));

		PartDefinition bodymiddle_r5 = hips.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(123, 92).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.1325F, 0.032F, 0.9709F));

		PartDefinition bodymiddle_r6 = hips.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(130, 65).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.136F, -0.0143F, 0.5809F));

		PartDefinition hips_r45 = hips.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(133, 17).addBox(-1.6793F, -1.7966F, 2.4793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.0159F, 0.0512F, 0.149F));

		PartDefinition hips_r46 = hips.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(79, 127).addBox(-1.6793F, 0.6501F, 1.4129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7408F, 5.9018F, 0.5184F, 0.5918F, 0.0512F, 0.149F));

		PartDefinition hips_r47 = hips.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(101, 68).addBox(-0.4972F, -0.3507F, -0.1397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(59, 90).addBox(-0.4972F, -2.3507F, -1.0397F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2987F, 10.6509F, 6.1613F, 0.452F, 0.033F, 0.0522F));

		PartDefinition hips_r48 = hips.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(111, 129).addBox(-0.4972F, -1.9782F, -0.0333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2987F, 10.6509F, 6.1613F, 0.8883F, 0.033F, 0.0522F));

		PartDefinition hips_r49 = hips.addOrReplaceChild("hips_r49", CubeListBuilder.create().texOffs(25, 124).addBox(-1.3318F, 6.5379F, -0.3218F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.6711F, 0.09F, 0.0159F));

		PartDefinition hips_r50 = hips.addOrReplaceChild("hips_r50", CubeListBuilder.create().texOffs(0, 106).addBox(-1.3066F, 1.1352F, 1.7625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -1.8685F, 0.1577F, -0.0182F));

		PartDefinition hips_r51 = hips.addOrReplaceChild("hips_r51", CubeListBuilder.create().texOffs(112, 118).addBox(-1.3318F, 4.5339F, 1.1369F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.7584F, 0.09F, 0.0159F));

		PartDefinition hips_r52 = hips.addOrReplaceChild("hips_r52", CubeListBuilder.create().texOffs(84, 128).addBox(-2.6958F, 12.5736F, 0.0728F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, 4.4018F, -0.6816F, -0.728F, 0.0089F, -0.0756F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 19).addBox(-2.0F, -0.4F, -0.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -6.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 112).addBox(-1.0F, -9.2214F, 0.2864F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 7.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 78).addBox(-1.004F, -0.0433F, -7.9953F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.4F, 3.6F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 16).addBox(-1.0F, -9.1713F, -5.2469F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, 7.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 115).addBox(-1.0F, -8.0F, -0.1F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -6.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0779F, 4.1816F, 1.0286F, -0.6117F, -0.0243F, -0.0347F));

		PartDefinition rightthigh_r1 = rightthigh.addOrReplaceChild("rightthigh_r1", CubeListBuilder.create().texOffs(30, 97).addBox(-1.0F, 5.0634F, -2.0978F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightthigh_r2 = rightthigh.addOrReplaceChild("rightthigh_r2", CubeListBuilder.create().texOffs(101, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0117F, -0.8658F, -0.5091F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightthigh_r3 = rightthigh.addOrReplaceChild("rightthigh_r3", CubeListBuilder.create().texOffs(123, 29).addBox(-0.6057F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightthigh_r4 = rightthigh.addOrReplaceChild("rightthigh_r4", CubeListBuilder.create().texOffs(0, 113).addBox(-1.0212F, -0.1448F, -0.2115F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0098F, 6.8721F, -2.3336F, -0.1485F, 0.0092F, 0.0003F));

		PartDefinition rightthigh_r5 = rightthigh.addOrReplaceChild("rightthigh_r5", CubeListBuilder.create().texOffs(94, 102).addBox(-1.0971F, -1.3977F, -1.5327F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0941F, 0.8756F, 0.5047F, -0.2533F, 0.0092F, 0.0003F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create().texOffs(72, 96).addBox(-1.5134F, 3.0449F, 0.1212F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 23).addBox(-1.5134F, 12.0449F, -0.8788F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(101, 60).addBox(-1.5134F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3439F, 15.8243F, -2.7602F, 0.796F, 0.0F, 0.0424F));

		PartDefinition rightshin_r1 = rightshin.addOrReplaceChild("rightshin_r1", CubeListBuilder.create().texOffs(48, 122).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightshin_r2 = rightshin.addOrReplaceChild("rightshin_r2", CubeListBuilder.create().texOffs(70, 128).addBox(-0.5F, -8.2F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 97).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2866F, 8.6265F, 1.5784F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create().texOffs(103, 102).addBox(-1.471F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0524F, 16.5383F, 0.1517F, -0.5056F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(82, 87).addBox(-1.971F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.2358F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(82, 38).addBox(-2.471F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0779F, 4.1816F, 1.0286F, 0.1301F, 0.0243F, 0.0347F));

		PartDefinition leftthigh_r1 = leftthigh.addOrReplaceChild("leftthigh_r1", CubeListBuilder.create().texOffs(97, 94).addBox(-1.0F, 5.0634F, -2.0978F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftthigh_r2 = leftthigh.addOrReplaceChild("leftthigh_r2", CubeListBuilder.create().texOffs(101, 8).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0117F, -0.8658F, -0.5091F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftthigh_r3 = leftthigh.addOrReplaceChild("leftthigh_r3", CubeListBuilder.create().texOffs(123, 36).addBox(-0.3943F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftthigh_r4 = leftthigh.addOrReplaceChild("leftthigh_r4", CubeListBuilder.create().texOffs(92, 113).addBox(-0.9788F, -0.1448F, -0.2115F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0098F, 6.8721F, -2.3336F, -0.1485F, -0.0092F, -0.0003F));

		PartDefinition leftthigh_r5 = leftthigh.addOrReplaceChild("leftthigh_r5", CubeListBuilder.create().texOffs(103, 34).addBox(-0.9029F, -1.3977F, -1.5327F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0941F, 0.8756F, 0.5047F, -0.2533F, -0.0092F, -0.0003F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create().texOffs(43, 97).addBox(-0.4866F, 3.0449F, 0.1212F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 108).addBox(-0.4866F, 12.0449F, -0.8788F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 102).addBox(-0.4866F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3439F, 15.8243F, -2.7602F, 0.5342F, 0.0F, -0.0424F));

		PartDefinition leftshin_r1 = leftshin.addOrReplaceChild("leftshin_r1", CubeListBuilder.create().texOffs(88, 122).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftshin_r2 = leftshin.addOrReplaceChild("leftshin_r2", CubeListBuilder.create().texOffs(128, 75).addBox(-0.5F, -8.2F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(33, 105).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2866F, 8.6265F, 1.5784F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create().texOffs(57, 105).addBox(-1.529F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0524F, 16.5383F, 0.1517F, -0.9856F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(42, 90).addBox(-2.029F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.2358F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(82, 46).addBox(-2.529F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5559F, 9.5933F, 0.1625F, 0.2585F, 0.0419F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(104, 136).addBox(0.0F, 2.5727F, 3.8126F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 134).addBox(0.0F, 1.2727F, 1.8126F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 113).addBox(0.0F, -0.2273F, -0.1874F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0646F, 0.4663F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 114).addBox(0.0F, -8.237F, 0.0944F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6515F, 7.5448F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 112).addBox(0.0F, -8.602F, 0.0109F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2515F, 4.8448F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(0.0F, -3.7F, 6.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 107).mirror().addBox(0.0F, -3.7F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 107).mirror().addBox(0.0F, -3.9F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6239F, 1.9114F, -0.0873F, -0.2094F, -1.5708F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 107).addBox(0.0F, -3.7F, 6.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 107).addBox(0.0F, -3.7F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 107).addBox(0.0F, -3.9F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6239F, 1.9114F, -0.0873F, 0.2094F, 1.5708F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(13, 105).addBox(0.0F, -8.9419F, 0.2064F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6485F, 0.5448F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, 2.7F, 1.5F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6485F, -1.2552F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6822F, 9.2232F, -0.062F, -0.1742F, 0.0108F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(21, 125).addBox(0.0F, -6.9465F, 4.6813F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 112).addBox(0.0F, -6.6465F, 2.7813F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 120).addBox(0.0F, -6.3465F, 0.0813F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1694F, 10.0704F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(119, 67).addBox(0.0F, -7.0522F, 0.1015F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0694F, 6.9704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 116).addBox(0.0F, -7.3164F, 0.0063F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3306F, 4.0704F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(39, 116).mirror().addBox(0.0F, -1.0F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 116).mirror().addBox(0.0F, -1.3F, 2.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 116).mirror().addBox(0.0F, -1.5F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3692F, 0.5384F, 2.2038F, -0.0786F, -0.1585F, -1.6F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(39, 116).addBox(0.0F, -1.0F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 116).addBox(0.0F, -1.3F, 2.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 116).addBox(0.0F, -1.5F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3692F, 0.5384F, 2.2038F, -0.0786F, 0.1585F, 1.6F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 115).addBox(0.0F, -7.8772F, -0.1149F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6306F, 1.1704F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(137, 98).addBox(0.0F, 0.6082F, -0.2685F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 13.9168F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 131).addBox(0.0F, -0.1051F, -0.5572F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 11.9168F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(88, 116).addBox(0.0F, 0.2422F, -0.5876F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 9.9168F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(135, 59).addBox(0.0F, 0.2895F, -0.618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 7.9168F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 135).addBox(0.0F, 0.0368F, -0.6484F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 5.9168F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(107, 130).addBox(0.0F, -0.3662F, -0.6251F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9487F, 3.8168F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 98).addBox(0.0F, -0.3488F, -0.384F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9487F, 1.5168F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 115).addBox(0.0F, 0.0596F, -0.6783F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4319F, -0.5087F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -0.2F, -9.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2694F, 8.9704F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3577F, 15.7924F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 136).addBox(0.5F, -4.3198F, 3.8845F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 136).addBox(0.5F, -4.0198F, 1.8845F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 135).addBox(0.5F, -3.7198F, -0.2155F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3328F, 12.9964F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 135).addBox(0.5F, -7.0035F, 10.3864F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 133).addBox(0.5F, -6.6553F, 8.5796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 133).addBox(0.5F, -6.2601F, 6.7184F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 133).addBox(0.5F, -5.8894F, 4.8409F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 132).addBox(0.5F, -5.5153F, 2.9375F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 131).addBox(0.5F, -5.1153F, 0.9375F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(141, 18).addBox(0.0F, 0.9639F, 1.6555F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 138).addBox(0.0F, -0.1361F, -0.3445F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 13.0161F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(138, 17).addBox(0.0F, 0.4111F, -0.3749F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 11.0161F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(17, 138).addBox(0.0F, 0.3584F, -0.4053F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 9.0161F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(138, 12).addBox(0.0F, 0.6057F, -0.4357F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 7.0161F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 140).addBox(0.0F, 0.553F, -0.466F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 5.0161F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 135).addBox(0.0F, 0.1003F, -0.4964F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 3.0161F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 135).addBox(0.0F, 0.0476F, -0.5268F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, 1.0161F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.21F, 18.1275F, 0.1806F, 0.2577F, 0.0465F));

		PartDefinition cube_r37 = tail4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(139, 87).addBox(0.0F, -4.0311F, 7.9031F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 46).addBox(0.0F, -3.601F, 5.9306F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 41).addBox(0.0F, -3.3709F, 3.958F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 141).addBox(0.0F, -3.0408F, 1.9854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 141).addBox(0.0F, -2.7107F, 0.0129F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1317F, 8.7654F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(138, 113).addBox(0.0F, -2.696F, 0.0143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0683F, 6.7654F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 138).addBox(0.0F, -2.7622F, -0.0825F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2683F, 4.8654F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(69, 138).addBox(0.0F, -2.9648F, -0.002F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3683F, 2.7654F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(138, 58).addBox(0.0F, -2.95F, -0.0006F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5683F, 0.7654F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(135, 140).addBox(0.0F, 0.8F, 5.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 140).addBox(0.0F, -0.1F, 3.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 140).addBox(0.0F, -1.1F, 1.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 138).addBox(0.0F, -1.9F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0905F, 10.6063F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 138).addBox(0.0F, -1.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3545F, 8.4457F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 138).addBox(0.0F, -0.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6185F, 6.2851F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(107, 137).addBox(0.0F, -1.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0643F, 4.3328F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 138).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1161F, 2.3111F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(23, 138).addBox(0.0F, -1.0F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6756F, 0.2026F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 40).addBox(0.5F, -5.0F, -9.4F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.1974F, 8.7124F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4663F, 18.8959F, -0.0037F, -0.5265F, 0.1204F));

		PartDefinition cube_r49 = tail5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(142, 36).addBox(0.5F, -1.5161F, -0.0185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.5904F, 13.5196F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 142).addBox(0.5F, -1.6585F, 0.0207F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1904F, 11.5196F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(141, 113).addBox(0.0F, -1.7866F, -0.1095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8132F, 9.6881F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(142, 90).addBox(0.5F, -1.9975F, -0.1179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4904F, 7.7196F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(142, 0).addBox(0.5F, -2.0663F, 0.0622F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8904F, 5.6196F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(141, 129).addBox(0.5F, -2.0894F, 0.0254F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3904F, 3.7196F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(126, 138).addBox(0.5F, -2.4077F, -0.0547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0904F, 1.8196F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(142, 82).addBox(0.0F, 10.7368F, 45.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 78).addBox(0.0F, 10.1368F, 43.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 125).addBox(0.0F, 9.4368F, 41.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 121).addBox(0.0F, 8.5368F, 39.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 117).addBox(0.0F, 7.8368F, 37.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 141).addBox(0.0F, 6.5368F, 33.6516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 141).addBox(0.0F, 7.1368F, 35.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0696F, -34.8142F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(138, 118).addBox(0.5F, -2.2308F, -0.0915F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4096F, -0.0804F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 61).addBox(0.0F, -2.0F, -12.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0904F, 11.1196F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4718F, 14.0564F, -0.0567F, -0.3921F, 0.0217F));

		PartDefinition cube_r59 = tail6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(142, 104).addBox(0.0F, -0.8305F, 0.074F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3282F, 12.335F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(104, 142).addBox(0.0F, -0.9802F, 0.0432F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5282F, 10.535F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(142, 48).addBox(0.0F, -1.0223F, -0.026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8282F, 8.735F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 142).addBox(0.0F, -1.4103F, 0.0356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0282F, 6.835F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 142).addBox(0.0F, -1.4142F, -0.126F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3282F, 5.135F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(142, 44).addBox(0.0F, -1.5022F, -0.0645F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5282F, 3.235F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(142, 110).addBox(0.0F, 15.4368F, 53.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 107).addBox(0.0F, 14.4368F, 51.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 142).addBox(0.0F, 13.4368F, 49.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(142, 86).addBox(0.0F, 11.5368F, 47.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4022F, -48.8706F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(142, 40).addBox(0.0F, -1.6284F, 0.0894F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2718F, 1.235F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.4F, -5.7F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8282F, 5.135F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0501F, -6.5075F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(121, 15).addBox(0.0F, -6.548F, 0.0009F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4499F, -5.6925F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(106, 120).addBox(0.0F, -6.8231F, -0.0008F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5499F, -2.6925F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 120).addBox(0.0F, -6.1647F, 0.0084F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -8.6925F, 0.0611F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r7 = body.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(99, 134).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9122F, -16.4925F, 0.2693F, 0.205F, -0.4135F));

		PartDefinition bodymiddle_r8 = body.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9122F, -16.4925F, 0.1698F, 0.2984F, -0.8077F));

		PartDefinition bodymiddle_r9 = body.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-13.8588F, -3.0866F, -0.7988F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9122F, -16.4925F, -0.0076F, 0.342F, -1.3582F));

		PartDefinition bodymiddle_r10 = body.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-12.8588F, -3.0866F, -0.7988F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2122F, -18.7925F, -0.0037F, 0.3591F, -1.3568F));

		PartDefinition bodymiddle_r11 = body.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(130, 34).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2122F, -18.7925F, 0.1825F, 0.311F, -0.8039F));

		PartDefinition bodymiddle_r12 = body.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(77, 134).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2122F, -18.7925F, 0.2856F, 0.212F, -0.4101F));

		PartDefinition bodymiddle_r13 = body.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(130, 38).mirror().addBox(-6.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.0781F, 0.0087F, -1.3707F));

		PartDefinition bodymiddle_r14 = body.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(130, 26).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.0633F, 0.0466F, -0.8482F));

		PartDefinition bodymiddle_r15 = body.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(134, 67).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.042F, 0.0606F, -0.4552F));

		PartDefinition bodymiddle_r16 = body.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(133, 22).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, 0.0684F, 0.1138F, -0.4455F));

		PartDefinition bodymiddle_r17 = body.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(105, 54).mirror().addBox(-8.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, -0.0537F, 0.1285F, -1.369F));

		PartDefinition bodymiddle_r18 = body.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(130, 24).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, 0.0182F, 0.138F, -0.8407F));

		PartDefinition bodymiddle_r19 = body.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(132, 92).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, 0.1321F, 0.1437F, -0.4374F));

		PartDefinition bodymiddle_r20 = body.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(128, 80).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, 0.0656F, 0.1898F, -0.8329F));

		PartDefinition bodymiddle_r21 = body.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-11.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, -0.0394F, 0.1968F, -1.3667F));

		PartDefinition bodymiddle_r22 = body.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(105, 32).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.6047F, 0.1721F, 0.162F, -0.4313F));

		PartDefinition bodymiddle_r23 = body.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.6047F, 0.0956F, 0.222F, -0.8268F));

		PartDefinition bodymiddle_r24 = body.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-11.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.6047F, -0.0303F, 0.2396F, -1.3647F));

		PartDefinition bodymiddle_r25 = body.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-13.8588F, -3.0866F, -0.7988F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6843F, -13.5047F, -0.0266F, 0.2566F, -1.3638F));

		PartDefinition bodymiddle_r26 = body.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(125, 4).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6843F, -13.5047F, 0.1078F, 0.2348F, -0.824F));

		PartDefinition bodymiddle_r27 = body.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(131, 122).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6843F, -13.5047F, 0.1882F, 0.1693F, -0.4286F));

		PartDefinition bodymiddle_r28 = body.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(130, 38).addBox(3.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.0781F, -0.0087F, 1.3707F));

		PartDefinition bodymiddle_r29 = body.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(130, 26).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.0633F, -0.0466F, 0.8482F));

		PartDefinition bodymiddle_r30 = body.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(134, 67).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.042F, -0.0606F, 0.4552F));

		PartDefinition bodymiddle_r31 = body.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(133, 22).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, 0.0684F, -0.1138F, 0.4455F));

		PartDefinition bodymiddle_r32 = body.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(105, 54).addBox(3.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, -0.0537F, -0.1285F, 1.369F));

		PartDefinition bodymiddle_r33 = body.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(130, 24).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, 0.0182F, -0.138F, 0.8407F));

		PartDefinition bodymiddle_r34 = body.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(132, 92).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, 0.1321F, -0.1437F, 0.4374F));

		PartDefinition bodymiddle_r35 = body.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(128, 80).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, 0.0656F, -0.1898F, 0.8329F));

		PartDefinition bodymiddle_r36 = body.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(84, 36).addBox(3.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, -0.0394F, -0.1968F, 1.3667F));

		PartDefinition bodymiddle_r37 = body.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(105, 32).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.6047F, 0.1721F, -0.162F, 0.4313F));

		PartDefinition bodymiddle_r38 = body.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(70, 38).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.6047F, 0.0956F, -0.222F, 0.8268F));

		PartDefinition bodymiddle_r39 = body.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(84, 34).addBox(3.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.6047F, -0.0303F, -0.2396F, 1.3647F));

		PartDefinition bodymiddle_r40 = body.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(47, 38).addBox(3.8588F, -3.0866F, -0.7988F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6843F, -13.5047F, -0.0266F, -0.2566F, 1.3638F));

		PartDefinition bodymiddle_r41 = body.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(125, 4).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6843F, -13.5047F, 0.1078F, -0.2348F, 0.824F));

		PartDefinition bodymiddle_r42 = body.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(131, 122).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6843F, -13.5047F, 0.1882F, -0.1693F, 0.4286F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 123).addBox(0.0F, -5.4815F, 0.0028F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -11.6925F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(122, 124).addBox(0.0F, -4.7594F, -1.001F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(66, 61).addBox(-5.0F, -3.0495F, -6.9767F, 10.0F, 3.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 15.5616F, -15.7491F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 23).addBox(-5.0F, -2.0869F, -13.7431F, 10.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5616F, -1.9491F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(16, 125).addBox(0.0F, -4.682F, 2.0193F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 136).addBox(0.0F, -3.782F, 0.0193F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5501F, -19.6925F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r43 = body.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(82, 54).addBox(3.8588F, -3.0866F, -0.7988F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9122F, -16.4925F, -0.0076F, -0.342F, 1.3582F));

		PartDefinition bodymiddle_r44 = body.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(130, 36).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9122F, -16.4925F, 0.1698F, -0.2984F, 0.8077F));

		PartDefinition bodymiddle_r45 = body.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(99, 134).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9122F, -16.4925F, 0.2693F, -0.205F, 0.4135F));

		PartDefinition bodymiddle_r46 = body.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(77, 134).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2122F, -18.7925F, 0.2856F, -0.212F, 0.4101F));

		PartDefinition bodymiddle_r47 = body.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(130, 34).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2122F, -18.7925F, 0.1825F, -0.311F, 0.8039F));

		PartDefinition bodymiddle_r48 = body.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(82, 58).addBox(3.8588F, -3.0866F, -0.7988F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2122F, -18.7925F, -0.0037F, -0.3591F, 1.3568F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(65, 87).addBox(-1.0F, -0.0594F, -6.001F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.0594F, -0.001F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1662F, -19.6337F, 0.0349F, 0.0436F, 0.0015F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(29, 136).addBox(1.0F, -3.2704F, -0.106F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3F, -1.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(141, 66).addBox(1.0F, -2.6382F, 0.0151F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(139, 0).addBox(1.0F, -5.5F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 78).addBox(0.0F, -3.1F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.1F, -4.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(141, 54).addBox(1.0F, -2.4038F, 0.0753F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7F, -8.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = chest.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(103, 111).mirror().addBox(0.1422F, -0.9779F, -3.6793F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1544F, 6.6754F, -8.6933F, 0.8346F, -0.4833F, -0.6023F));

		PartDefinition bodymiddle_r49 = chest.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(134, 124).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.4459F, 0.2554F, -0.6319F));

		PartDefinition bodymiddle_r50 = chest.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(130, 32).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.3192F, 0.4103F, -1.0145F));

		PartDefinition bodymiddle_r51 = chest.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(103, 58).mirror().addBox(-10.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.0571F, 0.5113F, -1.5901F));

		PartDefinition bodymiddle_r52 = chest.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(134, 73).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.3742F, 0.2347F, -0.5288F));

		PartDefinition bodymiddle_r53 = chest.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(123, 50).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.2579F, 0.365F, -0.9172F));

		PartDefinition bodymiddle_r54 = chest.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(103, 56).mirror().addBox(-10.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.0308F, 0.4425F, -1.4817F));

		PartDefinition bodymiddle_r55 = chest.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(134, 71).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.2879F, 0.207F, -0.4618F));

		PartDefinition bodymiddle_r56 = chest.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(130, 30).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.1866F, 0.3073F, -0.8548F));

		PartDefinition bodymiddle_r57 = chest.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-11.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.0021F, 0.358F, -1.407F));

		PartDefinition bodymiddle_r58 = chest.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(-12.8588F, -3.0866F, -0.7988F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, -0.0115F, 0.3249F, -1.3595F));

		PartDefinition bodymiddle_r59 = chest.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(130, 28).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, 0.1572F, 0.2858F, -0.8113F));

		PartDefinition bodymiddle_r60 = chest.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(134, 69).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, 0.253F, 0.1979F, -0.4168F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(66, 72).mirror().addBox(-4.0F, -0.2584F, -0.2592F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 72).addBox(5.2F, -0.2584F, -0.2592F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 6.2586F, -8.947F, 0.829F, 0.0F, 0.0F));

		PartDefinition bodyfront_r3 = chest.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(114, 7).mirror().addBox(0.1422F, -2.1035F, -3.0664F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1544F, 6.6754F, -8.6933F, 1.1662F, -0.4833F, -0.6023F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(9, 123).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 11.7282F, -5.8732F, 1.2721F, -0.4842F, -1.02F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(35, 120).mirror().addBox(0.0844F, 0.0627F, -0.4729F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 12.7005F, -4.7712F, 2.2738F, 0.0775F, -1.3292F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(97, 122).mirror().addBox(0.0299F, -0.0861F, 0.0716F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 12.7005F, -4.7712F, 2.2988F, 0.1179F, -1.1906F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(131, 133).mirror().addBox(-0.0254F, -0.0296F, 0.019F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 12.7005F, -4.7712F, 2.3093F, 0.2609F, -1.1279F));

		PartDefinition bodymiddle_r61 = chest.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(134, 124).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.4459F, -0.2554F, 0.6319F));

		PartDefinition bodymiddle_r62 = chest.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(130, 32).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.3192F, -0.4103F, 1.0145F));

		PartDefinition bodymiddle_r63 = chest.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(103, 58).addBox(3.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.0571F, -0.5113F, 1.5901F));

		PartDefinition bodymiddle_r64 = chest.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(134, 73).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.3742F, -0.2347F, 0.5288F));

		PartDefinition bodymiddle_r65 = chest.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(123, 50).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.2579F, -0.365F, 0.9172F));

		PartDefinition bodymiddle_r66 = chest.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(103, 56).addBox(3.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.0308F, -0.4425F, 1.4817F));

		PartDefinition bodymiddle_r67 = chest.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(134, 71).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.2879F, -0.207F, 0.4618F));

		PartDefinition bodymiddle_r68 = chest.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(130, 30).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.1866F, -0.3073F, 0.8548F));

		PartDefinition bodymiddle_r69 = chest.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(93, 83).addBox(3.8588F, -3.0866F, -0.7988F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.0021F, -0.358F, 1.407F));

		PartDefinition bodymiddle_r70 = chest.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(82, 56).addBox(3.8588F, -3.0866F, -0.7988F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, -0.0115F, -0.3249F, 1.3595F));

		PartDefinition bodymiddle_r71 = chest.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(130, 28).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, 0.1572F, -0.2858F, 0.8113F));

		PartDefinition bodymiddle_r72 = chest.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(134, 69).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, 0.253F, -0.1979F, 0.4168F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(103, 111).addBox(-1.1422F, -0.9779F, -3.6793F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.1544F, 6.6754F, -8.6933F, 0.8346F, 0.4833F, 0.6023F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(114, 7).addBox(-1.1422F, -2.1035F, -3.0664F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1544F, 6.6754F, -8.6933F, 1.1662F, 0.4833F, 0.6023F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(9, 123).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 11.7282F, -5.8732F, 1.2721F, 0.4842F, 1.02F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(35, 120).addBox(-0.0844F, 0.0627F, -0.4729F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 12.7005F, -4.7712F, 2.2738F, -0.0775F, 1.3292F));

		PartDefinition bodyfront_r12 = chest.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(97, 122).addBox(-0.0299F, -0.0861F, 0.0716F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 12.7005F, -4.7712F, 2.2988F, -0.1179F, 1.1906F));

		PartDefinition bodyfront_r13 = chest.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(131, 133).addBox(0.0254F, -0.0296F, 0.019F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 12.7005F, -4.7712F, 2.3093F, -0.2609F, 1.1279F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5432F, 10.2151F, -7.4352F, -1.133F, 0.1966F, -0.2699F));

		PartDefinition cube_r82 = leftarm.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(19, 133).addBox(-0.7399F, 0.0255F, -0.2487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 2.0924F, 1.1316F, 1.3958F, 0.0357F, -0.025F));

		PartDefinition cube_r83 = leftarm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(133, 12).addBox(-0.8532F, -0.2766F, -0.1556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0076F, -0.5684F, 0.6453F, 0.0357F, -0.025F));

		PartDefinition cube_r84 = leftarm.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 91).addBox(3.9285F, -1.4857F, 0.0409F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.4261F, 1.0797F, 0.3519F, 0.8199F, 0.0357F, -0.025F));

		PartDefinition cube_r85 = leftarm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(43, 126).addBox(4.1251F, -3.3643F, -1.1075F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4261F, 2.0797F, 5.1519F, 1.2736F, 0.0357F, -0.025F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2598F, 3.8898F, 8.0395F, 0.1329F, -0.4386F, -0.8718F));

		PartDefinition cube_r86 = leftarm2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(91, 128).addBox(3.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(124, 67).addBox(3.5F, -2.6F, -1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9727F, 4.9738F, -0.9538F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r87 = lefthand.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(123, 43).addBox(-1.3F, -2.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7727F, 2.0462F, -1.3604F, -0.1265F, 0.0338F, 0.2597F));

		PartDefinition leftfingers = lefthand.addOrReplaceChild("leftfingers", CubeListBuilder.create(), PartPose.offset(-0.2273F, 4.0462F, -0.3604F));

		PartDefinition cube_r88 = leftfingers.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(114, 45).addBox(-1.6452F, 0.8431F, -0.3825F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4096F, -1.1247F, -0.7294F, -0.1106F, 0.0702F, 0.5633F));

		PartDefinition leftclaw = lefthand.addOrReplaceChild("leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6951F, 0.3403F, -1.4667F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftclaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(48, 133).addBox(-0.3F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5723F, 1.8839F, -1.6548F, -0.453F, 0.0969F, 0.4691F));

		PartDefinition cube_r90 = leftclaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(114, 60).addBox(-3.1419F, -0.04F, -0.3231F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7723F, 2.2839F, -1.1548F, -0.398F, 0.2422F, 0.7914F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5432F, 10.2151F, -7.4352F, -0.9148F, -0.1966F, 0.2699F));

		PartDefinition cube_r91 = rightarm.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 133).addBox(-0.2601F, 0.0255F, -0.2487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, 2.0924F, 1.1316F, 1.3958F, -0.0357F, 0.025F));

		PartDefinition cube_r92 = rightarm.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(14, 133).addBox(-0.1468F, -0.2766F, -0.1556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.0076F, -0.5684F, 0.6453F, -0.0357F, 0.025F));

		PartDefinition cube_r93 = rightarm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(123, 111).addBox(-4.9285F, -1.4857F, 0.0409F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.4261F, 1.0797F, 0.3519F, 0.8199F, -0.0357F, 0.025F));

		PartDefinition cube_r94 = rightarm.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(38, 127).addBox(-5.1251F, -3.3643F, -1.1075F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4261F, 2.0797F, 5.1519F, 1.2736F, -0.0357F, 0.025F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2598F, 3.8898F, 8.0395F, 0.0946F, 0.1827F, 0.9256F));

		PartDefinition cube_r95 = rightarm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(129, 67).addBox(-4.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(117, 124).addBox(-4.5F, -2.6F, -1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9727F, 4.9738F, -0.9538F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r96 = righthand.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(123, 60).addBox(0.3F, -2.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7727F, 2.0462F, -1.3604F, -0.1265F, -0.0338F, -0.2597F));

		PartDefinition rightfingers = righthand.addOrReplaceChild("rightfingers", CubeListBuilder.create(), PartPose.offset(0.2273F, 4.0462F, -0.3604F));

		PartDefinition cube_r97 = rightfingers.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 114).addBox(-0.3548F, 0.8431F, -0.3825F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4096F, -1.1247F, -0.7294F, -0.1106F, -0.0702F, -0.5633F));

		PartDefinition rightclaw = righthand.addOrReplaceChild("rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6951F, 0.3403F, -1.4667F, -0.1302F, 0.1304F, 0.0115F));

		PartDefinition cube_r98 = rightclaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(69, 133).addBox(-0.7F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5723F, 1.8839F, -1.6548F, -0.453F, -0.0969F, -0.4691F));

		PartDefinition cube_r99 = rightclaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 116).addBox(0.1419F, -0.04F, -0.3231F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7723F, 2.2839F, -1.1548F, -0.398F, -0.2422F, -0.7914F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4391F, -8.8957F, 0.2705F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r73 = neck.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(134, 126).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4905F, -2.2131F, 0.4429F, 0.1649F, -1.0082F));

		PartDefinition bodymiddle_r74 = neck.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-9.7693F, -0.819F, -1.0651F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4905F, -2.2131F, 0.3519F, 0.325F, -1.3783F));

		PartDefinition bodymiddle_r75 = neck.addOrReplaceChild("bodymiddle_r75", CubeListBuilder.create().texOffs(134, 134).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4905F, -0.3131F, 0.4322F, 0.151F, -0.9226F));

		PartDefinition bodymiddle_r76 = neck.addOrReplaceChild("bodymiddle_r76", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-10.7693F, -0.819F, -1.0651F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4905F, -0.3131F, 0.3468F, 0.3083F, -1.2927F));

		PartDefinition bodymiddle_r77 = neck.addOrReplaceChild("bodymiddle_r77", CubeListBuilder.create().texOffs(134, 126).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4905F, -2.2131F, 0.4429F, -0.1649F, 1.0082F));

		PartDefinition bodymiddle_r78 = neck.addOrReplaceChild("bodymiddle_r78", CubeListBuilder.create().texOffs(93, 85).addBox(1.7693F, -0.819F, -1.0651F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4905F, -2.2131F, 0.3519F, -0.325F, 1.3783F));

		PartDefinition bodymiddle_r79 = neck.addOrReplaceChild("bodymiddle_r79", CubeListBuilder.create().texOffs(134, 134).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4905F, -0.3131F, 0.4322F, -0.151F, 0.9226F));

		PartDefinition bodymiddle_r80 = neck.addOrReplaceChild("bodymiddle_r80", CubeListBuilder.create().texOffs(84, 32).addBox(1.7693F, -0.819F, -1.0651F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4905F, -0.3131F, 0.3468F, -0.3083F, 1.2927F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(106, 68).addBox(-0.5F, -0.8974F, 0.0222F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7814F, -3.933F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(90, 141).addBox(0.0F, -2.0369F, -0.1161F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9814F, -0.733F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(142, 4).addBox(0.0F, -1.6922F, -0.0178F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9814F, -2.633F, -0.6981F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0115F, -3.733F, -0.0947F, -0.2555F, 0.0579F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(142, 8).addBox(-0.5F, -1.4842F, -0.2891F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.55F, -0.1938F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(142, 94).addBox(-0.5F, -1.7821F, 1.9454F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 75).addBox(-1.0F, 0.0179F, 0.9454F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.25F, -2.3938F, -1.0297F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r81 = neck2.addOrReplaceChild("bodymiddle_r81", CubeListBuilder.create().texOffs(130, 40).mirror().addBox(-2.2873F, -0.464F, -1.069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.279F, -0.9801F, 0.3912F, 0.2643F, -1.1871F));

		PartDefinition bodymiddle_r82 = neck2.addOrReplaceChild("bodymiddle_r82", CubeListBuilder.create().texOffs(118, 53).mirror().addBox(-4.0654F, -0.4961F, -1.2533F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.579F, 0.2199F, 0.433F, 0.3611F, -1.1742F));

		PartDefinition bodymiddle_r83 = neck2.addOrReplaceChild("bodymiddle_r83", CubeListBuilder.create().texOffs(130, 40).addBox(-0.7127F, -0.464F, -1.069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.279F, -0.9801F, 0.3912F, -0.2643F, 1.1871F));

		PartDefinition bodymiddle_r84 = neck2.addOrReplaceChild("bodymiddle_r84", CubeListBuilder.create().texOffs(118, 53).addBox(-0.9346F, -0.4961F, -1.2533F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.579F, 0.2199F, 0.433F, -0.3611F, 1.1742F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.1855F, -2.2293F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r105 = neck3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(132, 82).addBox(-0.5F, -2.6F, -0.9787F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 94).addBox(-1.0F, -0.2F, -1.9787F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2293F, -2.4464F, -0.8901F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r85 = neck3.addOrReplaceChild("bodymiddle_r85", CubeListBuilder.create().texOffs(130, 44).mirror().addBox(-2.1391F, -0.4754F, -1.2322F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4935F, -1.8508F, 0.4043F, 0.3608F, -1.1445F));

		PartDefinition bodymiddle_r86 = neck3.addOrReplaceChild("bodymiddle_r86", CubeListBuilder.create().texOffs(130, 42).mirror().addBox(-2.1174F, -0.5127F, -1.3615F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3935F, -0.3508F, 0.3971F, 0.3126F, -1.1662F));

		PartDefinition bodymiddle_r87 = neck3.addOrReplaceChild("bodymiddle_r87", CubeListBuilder.create().texOffs(130, 44).addBox(-0.8609F, -0.4754F, -1.2322F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4935F, -1.8508F, 0.4043F, -0.3608F, 1.1445F));

		PartDefinition bodymiddle_r88 = neck3.addOrReplaceChild("bodymiddle_r88", CubeListBuilder.create().texOffs(130, 42).addBox(-0.8826F, -0.5127F, -1.3615F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3935F, -0.3508F, 0.3971F, -0.3126F, 1.1662F));

		PartDefinition cube_r106 = neck3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(5, 139).addBox(-0.5F, -1.9561F, -1.1025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8293F, -0.4464F, -1.0123F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4459F, -3.7399F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(132, 6).addBox(-0.5F, -2.6888F, 1.9513F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(130, 59).addBox(-0.5F, -2.6888F, -1.0487F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(95, 25).addBox(-1.0F, -0.1888F, -1.0487F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.509F, -3.6302F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r89 = neck4.addOrReplaceChild("bodymiddle_r89", CubeListBuilder.create().texOffs(130, 48).mirror().addBox(-2.9552F, -0.0572F, -0.5491F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1476F, -1.1108F, 0.2959F, 0.5809F, -1.2504F));

		PartDefinition bodymiddle_r90 = neck4.addOrReplaceChild("bodymiddle_r90", CubeListBuilder.create().texOffs(130, 46).mirror().addBox(-1.4486F, -0.5443F, -1.566F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8476F, -2.0108F, 0.369F, 0.8287F, -1.1385F));

		PartDefinition bodymiddle_r91 = neck4.addOrReplaceChild("bodymiddle_r91", CubeListBuilder.create().texOffs(130, 48).addBox(-0.0448F, -0.0572F, -0.5491F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1476F, -1.1108F, 0.2959F, -0.5809F, 1.2504F));

		PartDefinition bodymiddle_r92 = neck4.addOrReplaceChild("bodymiddle_r92", CubeListBuilder.create().texOffs(130, 46).addBox(-1.5514F, -0.5443F, -1.566F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8476F, -2.0108F, 0.369F, -0.8287F, 1.1385F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7472F, -4.6625F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(139, 36).addBox(1.0F, -3.201F, 0.9248F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 139).addBox(1.0F, -2.0716F, -0.8951F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.4F, -2.85F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r93 = neck5.addOrReplaceChild("bodymiddle_r93", CubeListBuilder.create().texOffs(134, 132).mirror().addBox(-1.0147F, -0.1176F, -1.4721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 130).mirror().addBox(-2.844F, 0.1579F, -0.6549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2004F, -2.4484F, 0.335F, 1.1385F, -1.0997F));

		PartDefinition bodymiddle_r94 = neck5.addOrReplaceChild("bodymiddle_r94", CubeListBuilder.create().texOffs(134, 130).addBox(0.844F, 0.1579F, -0.6549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 132).addBox(-0.9853F, -0.1176F, -1.4721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2004F, -2.4484F, 0.335F, -1.1385F, 1.0997F));

		PartDefinition cube_r109 = neck5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(99, 87).addBox(0.5F, -0.4776F, -1.4687F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.45F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2756F, -5.2684F, -0.6649F, -0.2721F, 0.2382F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 141).addBox(0.3F, -4.6557F, -5.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 5.7752F, -9.0889F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(137, 94).addBox(-1.4F, -1.523F, -1.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(137, 83).addBox(-1.2F, -1.523F, -1.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 9.8752F, -13.9889F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(141, 71).mirror().addBox(-1.4F, 2.119F, -7.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(141, 71).addBox(-1.2F, 2.119F, -7.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 5.7752F, -9.0889F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(123, 12).mirror().addBox(-0.003F, -0.9F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 105).mirror().addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 12).addBox(1.003F, -0.9F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 105).addBox(1.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.6535F, -14.068F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(112, 82).mirror().addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5968F, 6.8775F, -8.694F, 0.6715F, -0.0266F, 0.0346F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(135, 75).mirror().addBox(0.1877F, -1.026F, 0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8312F, 9.5938F, -10.4818F, 0.8286F, -0.0266F, 0.0346F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(57, 122).mirror().addBox(0.2F, -1.2F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9219F, 9.5538F, -11.2648F, 0.5231F, -0.0266F, 0.0346F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(29, 142).mirror().addBox(0.2661F, -0.5916F, -0.0315F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9219F, 9.2538F, -13.3648F, 0.3835F, -0.0266F, 0.0346F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 130).mirror().addBox(-1.6F, -0.9819F, -2.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 130).addBox(-1.0F, -0.9819F, -2.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 9.4752F, -12.2889F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(137, 9).mirror().addBox(-1.6F, -0.8795F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(137, 9).addBox(-1.0F, -0.8795F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 9.1752F, -11.3889F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(123, 7).mirror().addBox(-1.6F, -0.9692F, -3.0432F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(123, 7).addBox(-1.0F, -0.9692F, -3.0432F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8F, 7.0752F, -9.1889F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(121, 106).mirror().addBox(-1.6F, -0.9224F, -2.6235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(121, 106).addBox(-1.0F, -0.9224F, -2.6235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8F, 5.5752F, -7.0889F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(116, 140).mirror().addBox(-0.5F, -0.4437F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(140, 101).mirror().addBox(-0.5F, -0.4437F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 140).addBox(1.3F, -0.4437F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(140, 101).addBox(1.3F, -0.4437F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.5589F, -1.0086F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-1.52F, 0.3364F, -0.9878F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(141, 59).mirror().addBox(-1.52F, 0.1364F, -0.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(141, 59).addBox(-1.08F, 0.1364F, -0.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(134, 0).addBox(-1.08F, 0.3364F, -0.9878F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 6.4752F, -9.7889F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(7, 134).mirror().addBox(-1.52F, -2.9376F, -0.2461F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.8F, 7.4752F, -12.7889F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(137, 5).mirror().addBox(-0.25F, -0.1616F, 0.0305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(137, 5).addBox(0.79F, -0.1616F, 0.0305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.77F, 3.26F, -6.4088F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(126, 133).mirror().addBox(-0.25F, -1.5663F, -0.8481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 133).addBox(0.79F, -1.5663F, -0.8481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.77F, 4.26F, -5.9088F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(134, 136).mirror().addBox(-0.75F, -1.2413F, -0.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(134, 136).addBox(0.29F, -1.2413F, -0.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.27F, 3.46F, -5.6088F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-0.75F, -0.0794F, -0.0351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 137).addBox(0.29F, -0.0794F, -0.0351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.27F, 2.06F, -4.8088F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(137, 79).mirror().addBox(-0.75F, -2.4794F, -0.066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(137, 79).addBox(0.29F, -2.4794F, -0.066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.27F, 3.46F, -5.6088F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 136).mirror().addBox(-2.01F, -0.3267F, -0.8861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 136).addBox(0.01F, -0.3267F, -0.8861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3574F, -0.5699F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(136, 54).mirror().addBox(-2.01F, -0.1901F, 0.0129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(136, 54).addBox(0.01F, -0.1901F, 0.0129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.3574F, -1.2699F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(99, 136).mirror().addBox(-2.01F, -1.677F, 0.0285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(99, 136).addBox(0.01F, -1.677F, 0.0285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.2426F, 0.4301F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(140, 75).mirror().addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(77, 140).mirror().addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 140).addBox(1.54F, -0.7F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(140, 75).addBox(1.54F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.02F, 1.6608F, -2.436F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(41, 140).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(138, 63).mirror().addBox(-0.66F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(138, 63).addBox(2.02F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 140).addBox(1.91F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.18F, 1.0922F, -2.5498F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(139, 139).mirror().addBox(-0.34F, 0.0068F, -0.9122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 140).mirror().addBox(-0.34F, 0.0068F, -1.6122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(82, 140).addBox(1.7F, 0.0068F, -1.6122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(139, 139).addBox(1.7F, 0.0068F, -0.9122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.18F, 0.6922F, -3.2498F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(121, 139).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(121, 139).addBox(1.54F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.02F, 1.8541F, -2.8001F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(139, 136).mirror().addBox(-1.92F, 0.5582F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(139, 136).addBox(0.12F, 0.5582F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4F, 1.4656F, -2.7513F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(141, 15).addBox(0.3F, 1.0099F, -0.9219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 87).addBox(0.3F, 0.0099F, -2.9219F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 7.0752F, -12.8889F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(79, 110).addBox(-0.2F, -0.8956F, -3.8517F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8F, 3.6752F, -3.7889F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(29, 142).addBox(-0.2661F, -0.5916F, -0.0315F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9219F, 9.2538F, -13.3648F, 0.3835F, 0.0266F, -0.0346F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(57, 122).addBox(-0.2F, -1.2F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9219F, 9.5538F, -11.2648F, 0.5231F, 0.0266F, -0.0346F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(112, 82).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5968F, 6.8775F, -8.694F, 0.6715F, 0.0266F, -0.0346F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(135, 75).addBox(-0.1877F, -1.026F, 0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8312F, 9.5938F, -10.4818F, 0.8286F, 0.0266F, -0.0346F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(117, 118).addBox(0.3F, -0.0639F, -2.8886F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 3.5752F, -8.0889F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(121, 94).addBox(0.3F, -0.0601F, -2.9712F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8F, 5.2752F, -10.4889F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(130, 102).addBox(-0.5F, 0.0462F, 0.0291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.147F, -4.3432F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(100, 130).addBox(-0.5F, 0.0061F, -1.9592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.047F, -4.3432F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(139, 27).addBox(-1.5F, 1.9231F, 0.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 24).addBox(-0.5F, 1.9231F, 0.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.553F, -5.2432F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 128).addBox(0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8221F, -3.4998F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(114, 0).addBox(0.0F, -0.033F, -3.9642F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.153F, -4.9432F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 134).addBox(0.52F, -2.9376F, -0.2461F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8F, 7.4752F, -12.7889F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(119, 25).addBox(-0.5F, -1.0325F, -2.0065F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.853F, -1.9432F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(38, 109).addBox(0.0F, -1.9951F, -2.969F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 1.553F, 0.6568F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(70, 123).mirror().addBox(-1.1F, -0.3F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2478F, -3.1849F, 0.3853F, 0.1511F, 0.0075F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(70, 123).addBox(0.1F, -0.3F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.2478F, -3.1849F, 0.3853F, -0.1511F, -0.0075F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(9, 118).addBox(0.0F, 0.3364F, -2.0109F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.947F, -2.1432F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(125, 0).addBox(-1.0F, -0.0051F, -0.5391F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.7384F, -1.7025F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(130, 98).addBox(-0.5F, -0.0051F, -0.6391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7384F, -1.7025F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(72, 140).mirror().addBox(-2.5F, -0.6153F, -1.9058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(72, 140).addBox(-0.5F, -0.6153F, -1.9058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.653F, 2.0568F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(139, 51).mirror().addBox(-2.5F, 0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(139, 51).addBox(-0.5F, 0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.647F, -0.0432F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(130, 94).mirror().addBox(-3.0F, -1.4812F, -1.1176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(130, 94).addBox(-1.0F, -1.4812F, -1.1176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5F, 1.553F, 0.6568F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(112, 89).addBox(0.0F, -0.0169F, -0.0201F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -0.647F, -1.9432F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4321F, 2.0731F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(127, 124).mirror().addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 0.7654F, -0.2236F, -0.2099F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(53, 136).mirror().addBox(-0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 1.0759F, -0.1031F, 0.0259F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(53, 136).addBox(0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 1.0759F, 0.1031F, -0.0259F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(127, 124).addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 0.7654F, 0.2236F, 0.2099F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1091F, -0.4042F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftAngularSurangular.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(130, 110).mirror().addBox(-1.0F, -0.2152F, 1.647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 110).addBox(1.0F, -0.2152F, 1.647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.1021F, -0.4121F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftAngularSurangular.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(64, 140).mirror().addBox(-1.0F, -0.191F, -1.0859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 140).addBox(1.0F, -0.191F, -1.0859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.1F, 0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftAngularSurangular.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(52, 140).mirror().addBox(-1.0F, -1.0468F, -0.9591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 140).addBox(1.0F, -1.0468F, -0.9591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.7021F, 0.2879F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftAngularSurangular.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(116, 136).mirror().addBox(-1.0F, -0.0952F, -0.8901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(116, 136).addBox(1.0F, -0.0952F, -0.8901F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, 0.1F, -0.8F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftAngularSurangular.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(140, 98).mirror().addBox(-1.0F, -1.0211F, -1.0054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(140, 98).addBox(1.0F, -1.0211F, -1.0054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.8021F, 0.8879F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftAngularSurangular.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(77, 136).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 136).addBox(1.56F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.53F, 4.2191F, -3.7859F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftAngularSurangular.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(121, 100).mirror().addBox(-1.0F, 0.0274F, -3.0267F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(121, 100).addBox(1.0F, 0.0274F, -3.0267F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.6F, -3.1F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftAngularSurangular.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(130, 106).mirror().addBox(-1.0F, -0.953F, -2.1848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(130, 106).addBox(1.0F, -0.953F, -2.1848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 2.2021F, -0.3121F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftAngularSurangular.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(123, 82).mirror().addBox(-1.5F, -0.7952F, -2.889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(123, 82).addBox(0.5F, -0.7952F, -2.889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.6F, -2.0F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftAngularSurangular.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(48, 128).mirror().addBox(-1.0F, -0.0496F, -2.0617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -1.5F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftAngularSurangular.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(48, 128).addBox(0.0F, -0.0496F, -2.0617F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -1.5F, 0.6807F, 0.0F, 0.0F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.1F, -4.9F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftDentary.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(137, 104).addBox(-0.7984F, 1.4647F, -2.6451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftDentary.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 123).mirror().addBox(0.0719F, -1.9213F, -2.3532F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(141, 133).mirror().addBox(0.1719F, -2.0213F, -3.4532F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 0.3886F, -8.4859F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r180 = leftDentary.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 133).mirror().addBox(-0.7016F, -0.2522F, 0.9502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 0.3886F, -8.4859F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftDentary.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(17, 97).mirror().addBox(-0.1707F, -1.0184F, -0.9658F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 0.3886F, -8.4859F, -0.009F, -0.0307F, 0.0167F));

		PartDefinition cube_r182 = leftDentary.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(131, 118).mirror().addBox(-0.7016F, -1.0365F, 0.0285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 1.7886F, -1.5859F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftDentary.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(99, 140).mirror().addBox(-0.7016F, -1.4767F, 0.2923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(131, 114).mirror().addBox(-0.7016F, -0.9767F, -0.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 1.2886F, -3.4859F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftDentary.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 16).mirror().addBox(-0.7016F, -0.1641F, 0.8072F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 0.3886F, -8.4859F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftDentary.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-0.7016F, -0.0294F, -0.0072F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, -0.5114F, -2.2859F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftDentary.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(20, 105).mirror().addBox(-0.7016F, -0.2764F, 1.2529F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2984F, 0.3886F, -8.4859F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftDentary.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(79, 123).addBox(-0.0719F, -1.9213F, -2.3532F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 133).addBox(-0.1719F, -2.0213F, -3.4532F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r188 = leftDentary.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(139, 30).addBox(-0.7984F, 0.2867F, -2.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftDentary.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(11, 141).addBox(-0.7984F, -0.9249F, -3.6457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftDentary.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(137, 110).addBox(-0.7984F, 0.6485F, -2.724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftDentary.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(129, 55).addBox(-0.7984F, 0.1214F, -2.9409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftDentary.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(119, 77).addBox(-0.7984F, -0.1864F, -2.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftDentary.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 133).addBox(-0.2984F, -0.2522F, 0.9502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftDentary.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(17, 97).addBox(0.1707F, -1.0184F, -0.9658F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.009F, 0.0307F, -0.0167F));

		PartDefinition cube_r195 = leftDentary.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(132, 88).addBox(-0.7984F, -0.2821F, -0.6701F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftDentary.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(131, 118).addBox(-0.2984F, -1.0365F, 0.0285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7016F, 1.7886F, -1.5859F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftDentary.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 140).addBox(-0.2984F, -1.4767F, 0.2923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(131, 114).addBox(-0.2984F, -0.9767F, -0.0077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7016F, 1.2886F, -3.4859F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftDentary.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(108, 16).addBox(-0.2984F, -0.1641F, 0.8072F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftDentary.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 122).addBox(-0.2984F, -0.0294F, -0.0072F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7016F, -0.5114F, -2.2859F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftDentary.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 105).addBox(-0.2984F, -0.2764F, 1.2529F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7016F, 0.3886F, -8.4859F, 0.1047F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 147, 147);
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