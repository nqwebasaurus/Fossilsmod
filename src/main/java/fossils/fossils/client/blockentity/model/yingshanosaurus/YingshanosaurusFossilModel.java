package fossils.fossils.client.blockentity.model.yingshanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YingshanosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart body;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart parascapularSpine;
	private final ModelPart parascapularSpine2;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart neck4;
	private final ModelPart leftPlate24;
	private final ModelPart rightPlate24;
	private final ModelPart neck3;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart neck2;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart neck;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart tail2;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart tail3;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart tail4;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart leftPlate20;
	private final ModelPart rightPlate20;
	private final ModelPart tail5;
	private final ModelPart lefttailSpike;
	private final ModelPart righttailSpike3;
	private final ModelPart lefttailSpike2;
	private final ModelPart righttailSpike2;

	public YingshanosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.leftPlate11 = this.hips.getChild("leftPlate11");
		this.rightPlate11 = this.hips.getChild("rightPlate11");
		this.leftPlate12 = this.hips.getChild("leftPlate12");
		this.rightPlate12 = this.hips.getChild("rightPlate12");
		this.leftPlate13 = this.hips.getChild("leftPlate13");
		this.rightPlate13 = this.hips.getChild("rightPlate13");
		this.body = this.hips.getChild("body");
		this.leftPlate9 = this.body.getChild("leftPlate9");
		this.rightPlate9 = this.body.getChild("rightPlate9");
		this.leftPlate10 = this.body.getChild("leftPlate10");
		this.rightPlate10 = this.body.getChild("rightPlate10");
		this.chest = this.body.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.parascapularSpine = this.chest.getChild("parascapularSpine");
		this.parascapularSpine2 = this.chest.getChild("parascapularSpine2");
		this.leftPlate2 = this.chest.getChild("leftPlate2");
		this.rightPlate2 = this.chest.getChild("rightPlate2");
		this.leftPlate3 = this.chest.getChild("leftPlate3");
		this.rightPlate3 = this.chest.getChild("rightPlate3");
		this.leftPlate8 = this.chest.getChild("leftPlate8");
		this.rightPlate8 = this.chest.getChild("rightPlate8");
		this.neck4 = this.chest.getChild("neck4");
		this.leftPlate24 = this.neck4.getChild("leftPlate24");
		this.rightPlate24 = this.neck4.getChild("rightPlate24");
		this.neck3 = this.neck4.getChild("neck3");
		this.leftPlate4 = this.neck3.getChild("leftPlate4");
		this.rightPlate4 = this.neck3.getChild("rightPlate4");
		this.neck2 = this.neck3.getChild("neck2");
		this.leftPlate5 = this.neck2.getChild("leftPlate5");
		this.rightPlate5 = this.neck2.getChild("rightPlate5");
		this.leftPlate6 = this.neck2.getChild("leftPlate6");
		this.rightPlate6 = this.neck2.getChild("rightPlate6");
		this.neck = this.neck2.getChild("neck");
		this.leftPlate7 = this.neck.getChild("leftPlate7");
		this.rightPlate7 = this.neck.getChild("rightPlate7");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.leftPlate14 = this.tail.getChild("leftPlate14");
		this.rightPlate14 = this.tail.getChild("rightPlate14");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate15 = this.tail2.getChild("leftPlate15");
		this.rightPlate15 = this.tail2.getChild("rightPlate15");
		this.leftPlate16 = this.tail2.getChild("leftPlate16");
		this.rightPlate16 = this.tail2.getChild("rightPlate16");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate17 = this.tail3.getChild("leftPlate17");
		this.rightPlate17 = this.tail3.getChild("rightPlate17");
		this.leftPlate18 = this.tail3.getChild("leftPlate18");
		this.rightPlate18 = this.tail3.getChild("rightPlate18");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate19 = this.tail4.getChild("leftPlate19");
		this.rightPlate19 = this.tail4.getChild("rightPlate19");
		this.leftPlate20 = this.tail4.getChild("leftPlate20");
		this.rightPlate20 = this.tail4.getChild("rightPlate20");
		this.tail5 = this.tail4.getChild("tail5");
		this.lefttailSpike = this.tail5.getChild("lefttailSpike");
		this.righttailSpike3 = this.tail5.getChild("righttailSpike3");
		this.lefttailSpike2 = this.tail5.getChild("lefttailSpike2");
		this.righttailSpike2 = this.tail5.getChild("righttailSpike2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(21, 10).addBox(0.0F, -3.4506F, -4.7987F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 87).addBox(-0.5F, -3.2599F, -0.0293F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 2.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(102, 74).addBox(0.0F, 0.0444F, -0.0386F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.7F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, -0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 55).addBox(1.0F, -0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -5.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-0.6762F, -0.5125F, -0.2899F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 5.3F, 1.4F, -1.2625F, 0.2012F, -0.0333F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-0.6796F, -0.1638F, -0.3929F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.0F, 1.0F, -1.2636F, 0.2818F, -0.3275F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 83).mirror().addBox(-0.2F, -0.3483F, -0.1451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.1F, -0.2F, -0.7923F, 0.2818F, -0.3275F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 90).mirror().addBox(0.0F, -1.9747F, -0.0176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 90).addBox(4.0F, -1.9747F, -0.0176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 2.4F, 1.0F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(0.0F, -2.0074F, 0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(87, 50).addBox(4.0F, -2.0074F, 0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.5F, 2.2F, -1.3F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.1935F, -0.2632F, -1.8256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.5F, -1.6F, 0.2616F, 0.5663F, 0.0869F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(0.0F, -0.3592F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.2F, -0.8F, 0.4887F, 0.2443F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-0.9967F, -0.0285F, -0.5344F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 4.0F, 2.7F, 0.311F, -0.1169F, -0.2103F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(3, 87).mirror().addBox(0.0F, 0.0046F, -0.5557F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.2F, 1.5F, 0.4189F, 0.0F, -0.5585F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(0.0F, 1.0147F, 1.5955F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(62, 95).mirror().addBox(0.0F, 3.0147F, 3.5955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(60, 28).mirror().addBox(-1.0F, 0.0147F, -0.0045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 63).addBox(4.0F, 1.0147F, 1.5955F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(62, 95).addBox(4.0F, 3.0147F, 3.5955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(60, 28).addBox(4.0F, 0.0147F, -0.0045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -2.0F, -2.1F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 83).mirror().addBox(0.0F, -1.0105F, -1.9629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 83).addBox(4.0F, -1.0105F, -1.9629F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2F, -0.8F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(0.0F, -0.8947F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 95).addBox(4.0F, -0.8947F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5F, 0.4F, 3.1F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(0.0F, -0.0227F, -2.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 83).addBox(4.0F, -0.0227F, -2.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.4F, 5.4F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 87).mirror().addBox(0.0F, -1.9596F, -0.9005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 87).addBox(4.0F, -1.9596F, -0.9005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.5F, 2.0F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-1.0F, -1.089F, -4.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.5F, -2.1F, 0.3491F, 0.3054F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 82).mirror().addBox(-3.2015F, -1.089F, -3.2671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.5F, -2.1F, 0.3416F, -0.2299F, -0.1899F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-2.0F, -0.4805F, -2.9349F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.5F, -2.1F, 0.1396F, 0.3054F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 5).mirror().addBox(0.0F, -0.0511F, 0.0602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 5).addBox(4.0F, -0.0511F, 0.0602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.8F, 3.7F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(0.0F, -0.0511F, 0.0602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.8F, 3.7F, -0.698F, 0.4164F, -0.3272F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, -0.0289F, 0.0684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 61).addBox(4.0F, -0.0289F, 0.0684F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.6F, 0.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(81, 67).addBox(-1.0F, -0.0511F, 0.0602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, -0.8F, 3.7F, -0.698F, -0.4164F, 0.3272F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(49, 82).addBox(0.0F, -1.089F, -4.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.5F, -2.1F, 0.3491F, -0.3054F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 82).addBox(2.2015F, -1.089F, -3.2671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, -1.5F, -2.1F, 0.3416F, 0.2299F, 0.1899F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 60).addBox(0.0F, -0.4805F, -2.9349F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.5F, -2.1F, 0.1396F, -0.3054F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 85).addBox(-0.8065F, -0.2632F, -1.8256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.5F, -1.6F, 0.2616F, -0.5663F, -0.0869F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 45).addBox(-0.3238F, -0.5125F, -0.2899F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 5.3F, 1.4F, -1.2625F, -0.2012F, 0.0333F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(69, 38).addBox(-0.3204F, -0.1638F, -0.3929F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.1F, 3.0F, 1.0F, -1.2636F, -0.2818F, 0.3275F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(28, 83).addBox(-0.8F, -0.3483F, -0.1451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 2.1F, -0.2F, -0.7923F, -0.2818F, 0.3275F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(96, 0).addBox(-1.0F, -0.3592F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.2F, -0.8F, 0.4887F, -0.2443F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 65).addBox(-0.0033F, -0.0285F, -0.5344F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 4.0F, 2.7F, 0.311F, 0.1169F, 0.2103F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(3, 87).addBox(-1.0F, 0.0046F, -0.5557F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.2F, 1.5F, 0.4189F, 0.0F, 0.5585F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, 0.5487F, -1.0449F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.9706F, 0.6276F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r35 = backleftleg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 30).addBox(0.25F, -5.9F, 2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r36 = backleftleg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 22).addBox(0.25F, -3.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(46, 58).addBox(-0.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 10.1238F, 0.2346F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r37 = backleftleg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 63).addBox(-0.4255F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, -0.3027F, 0.5696F, 0.0697F, -0.003F, 0.0435F));

		PartDefinition cube_r38 = backleftleg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 36).addBox(-1.0F, -0.0241F, -0.9383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 1.9696F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r39 = backleftleg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 71).addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r40 = backleftleg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(67, 33).addBox(-1.0F, 1.6F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(65, 63).addBox(-1.0F, -3.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0119F, 7.4271F, 0.1844F, -0.0426F, -0.0084F, -0.0044F));

		PartDefinition cube_r41 = backleftleg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(55, 73).addBox(0.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create().texOffs(36, 17).addBox(-2.0F, -0.3778F, -2.733F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5237F, 1.3722F, -0.0022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(32, 41).addBox(-2.0F, 0.5487F, -1.0449F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.9706F, 0.6276F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = backrightleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(9, 49).addBox(-3.25F, -5.9F, 2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r43 = backrightleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 8).addBox(-3.25F, -3.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(57, 58).addBox(-1.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 10.1238F, 0.2346F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r44 = backrightleg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 63).addBox(-0.5745F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, -0.3027F, 0.5696F, 0.0697F, 0.003F, -0.0435F));

		PartDefinition cube_r45 = backrightleg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 74).addBox(-1.0F, -0.0241F, -0.9383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 1.9696F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r46 = backrightleg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 72).addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r47 = backrightleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 0).addBox(-1.0F, 1.6F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(0, 66).addBox(-1.0F, -3.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0119F, 7.4271F, 0.1844F, -0.2607F, 0.0084F, 0.0044F));

		PartDefinition cube_r48 = backrightleg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 74).addBox(-3.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(15, 38).addBox(-3.0F, -0.3778F, -2.733F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5237F, 1.3722F, -0.0022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = hips.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3333F, -3.9803F, -4.8359F, 0.0326F, -0.0355F, 0.1711F));

		PartDefinition cube_r49 = leftPlate11.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 60).addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(98, 57).addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftPlate11.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(89, 4).addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftPlate11.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 77).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftPlate11.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(99, 89).addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftPlate11.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 99).addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftPlate11.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(34, 99).addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftPlate11.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate11 = hips.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3333F, -3.9803F, -4.8359F, 0.0326F, 0.0355F, -0.1711F));

		PartDefinition cube_r56 = rightPlate11.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(98, 60).mirror().addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(98, 57).mirror().addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightPlate11.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightPlate11.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightPlate11.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightPlate11.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(39, 99).mirror().addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightPlate11.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightPlate11.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = hips.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2144F, -4.1469F, -0.7415F, 0.1373F, -0.0355F, 0.1711F));

		PartDefinition cube_r63 = leftPlate12.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(98, 63).addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(62, 98).addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftPlate12.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(88, 66).addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftPlate12.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftPlate12.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(99, 98).addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftPlate12.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(99, 95).addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftPlate12.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(99, 92).addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftPlate12.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 15).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate12 = hips.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2144F, -4.1469F, -0.7415F, 0.1373F, 0.0355F, -0.1711F));

		PartDefinition cube_r70 = rightPlate12.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(62, 98).mirror().addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightPlate12.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 66).mirror().addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightPlate12.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightPlate12.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(99, 98).mirror().addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightPlate12.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 95).mirror().addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightPlate12.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(99, 92).mirror().addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightPlate12.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = hips.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0595F, -4.1362F, 3.5F, 0.05F, -0.0355F, 0.1711F));

		PartDefinition cube_r77 = leftPlate13.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(88, 62).addBox(-0.5F, -1.7626F, -0.8132F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.9509F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftPlate13.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 37).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftPlate13.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 100).addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftPlate13.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 100).addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftPlate13.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(101, 0).addBox(-0.5F, -0.2096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftPlate13.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(28, 78).addBox(-0.5F, -0.6164F, -0.1409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0107F, -0.9825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = hips.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0595F, -4.1362F, 3.5F, 0.05F, 0.0355F, -0.1711F));

		PartDefinition cube_r83 = rightPlate13.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 62).mirror().addBox(-0.5F, -1.7626F, -0.8132F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.9509F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightPlate13.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightPlate13.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(72, 100).mirror().addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightPlate13.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 100).mirror().addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightPlate13.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.5F, -0.2096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightPlate13.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(28, 78).mirror().addBox(-0.5F, -0.6164F, -0.1409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0107F, -0.9825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.1F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(95, 25).addBox(-0.5F, -2.6574F, 2.0022F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 22).addBox(-1.0F, -0.0574F, 0.0022F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 20).addBox(-0.5F, -2.4671F, -0.008F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 95).addBox(-0.5F, -2.3574F, 0.0022F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -1.8948F, -0.0674F, 0.1958F, 0.2415F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(77, 102).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -1.8948F, 0.1582F, 0.1024F, 1.6107F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.9506F, -9.6948F, 0.0622F, -0.3174F, 2.0036F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.9506F, -9.6948F, 0.3232F, 0.0093F, 0.6646F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(84, 50).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.9506F, -9.6948F, 0.2909F, 0.1432F, 0.2478F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4506F, -7.6948F, 0.1072F, -0.2221F, 1.9567F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 87).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4506F, -7.6948F, 0.2406F, 0.0738F, 0.6263F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.4506F, -7.6948F, 0.1879F, 0.1681F, 0.1969F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(102, 101).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, 0.1853F, -0.0463F, 1.8241F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(8, 87).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, 0.0866F, 0.1904F, 0.4837F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, -0.0031F, 0.2089F, 0.0388F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.0667F, 0.1949F, 0.1401F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.1432F, 0.1484F, 0.5805F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.1573F, -0.1103F, 1.9135F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(28, 97).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, -0.0031F, -0.2089F, -0.0388F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(8, 87).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, 0.0866F, -0.1904F, -0.4837F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(102, 101).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, 0.1853F, 0.0463F, -1.8241F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 50).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.9506F, -9.6948F, 0.2909F, -0.1432F, -0.2478F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 89).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.9506F, -9.6948F, 0.3232F, -0.0093F, -0.6646F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 10).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.9506F, -9.6948F, 0.0622F, 0.3174F, -2.0036F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 87).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4506F, -7.6948F, 0.1879F, -0.1681F, -0.1969F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 87).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4506F, -7.6948F, 0.2406F, -0.0738F, -0.6263F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(103, 6).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.4506F, -7.6948F, 0.1072F, 0.2221F, -1.9567F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 82).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.1573F, 0.1103F, -1.9135F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(7, 66).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.1432F, -0.1484F, -0.5805F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(14, 88).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.0667F, -0.1949F, -0.1401F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 102).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -1.8948F, 0.1582F, -0.1024F, -1.6107F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(59, 95).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -1.8948F, -0.0674F, -0.1958F, -0.2415F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(34, 102).addBox(-0.5F, -2.0673F, 1.9582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 102).addBox(-0.5F, -2.0673F, -0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 0).addBox(-1.0F, -0.0673F, -0.0418F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -9.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4544F, -2.5551F, -7.5281F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition cube_r121 = leftPlate9.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(88, 40).addBox(-0.5F, -1.5929F, -0.1104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftPlate9.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 78).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftPlate9.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(23, 99).addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftPlate9.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(8, 99).addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftPlate9.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 3).addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftPlate9.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(42, 85).addBox(-0.5F, 1.1762F, -2.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftPlate9.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(89, 97).addBox(-0.5F, -1.3475F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(97, 86).addBox(-0.5F, -0.7475F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.5056F, -1.0002F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightPlate9 = body.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4544F, -2.5551F, -7.5281F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition cube_r128 = rightPlate9.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-0.5F, -1.5929F, -0.1104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightPlate9.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightPlate9.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(23, 99).mirror().addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightPlate9.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(8, 99).mirror().addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightPlate9.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightPlate9.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.5F, 1.1762F, -2.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightPlate9.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(89, 97).mirror().addBox(-0.5F, -1.3475F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(97, 86).mirror().addBox(-0.5F, -0.7475F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5056F, -1.0002F, -1.1345F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = body.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4623F, -3.372F, -3.8324F, 0.242F, -0.0355F, 0.1711F));

		PartDefinition cube_r135 = leftPlate10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(94, 97).addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftPlate10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(88, 58).addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftPlate10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(77, 49).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftPlate10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(77, 99).addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftPlate10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(99, 44).addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftPlate10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(99, 41).addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftPlate10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(78, 10).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = body.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4623F, -3.372F, -3.8324F, 0.242F, 0.0355F, -0.1711F));

		PartDefinition cube_r142 = rightPlate10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5F, -1.4438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(94, 97).mirror().addBox(-0.5F, -0.8438F, -0.758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 1.4509F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightPlate10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-0.5F, -1.8321F, -0.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.2509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightPlate10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightPlate10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-0.5F, -0.8712F, -0.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8992F, -1.4491F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightPlate10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(99, 44).mirror().addBox(-0.5F, -0.8096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightPlate10.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(99, 41).mirror().addBox(-0.5F, -0.7025F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.5491F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightPlate10.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0107F, -0.0825F, 0.5672F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -9.7F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 102).addBox(-0.5F, -2.7F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 101).addBox(-0.5F, -2.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 100).addBox(-0.5F, -2.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 76).mirror().addBox(-5.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(32, 61).addBox(-0.5F, -2.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 76).addBox(3.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(21, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9F, -7.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(-0.7F, 0.0233F, -0.0805F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 8.7795F, -1.209F, -1.6214F, -1.4378F, 2.1776F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(17, 22).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 8.7795F, -1.209F, -0.0113F, -0.7039F, 0.4278F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 8.7795F, -1.209F, -0.0726F, -0.8607F, 0.4403F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 8.7795F, -1.209F, -0.248F, -1.031F, 0.5057F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(0.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(81, 63).addBox(3.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 9.0F, -3.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(0.0F, -0.9268F, -0.0556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 10).addBox(3.0F, -0.9268F, -0.0556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 7.7F, -5.9F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(0.0F, -3.3009F, -4.0531F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.9673F, -3.7751F, 1.6869F, -0.3734F, -0.3951F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(22, 43).mirror().addBox(0.0F, -0.8368F, -2.5268F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.9673F, -3.7751F, 0.4651F, -0.3734F, -0.3951F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-3.0F, -1.0199F, -0.0688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(68, 55).addBox(5.0F, -1.0199F, -0.0688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, 4.6F, -3.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-3.0F, -0.1256F, -3.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(69, 15).addBox(5.0F, -0.1256F, -3.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.3F, -2.7F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-3.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 76).addBox(5.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.2F, -1.3F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.9506F, -7.4948F, -0.1475F, -0.7983F, 1.5642F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(76, 91).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.9506F, -7.4948F, 0.7724F, -0.243F, 0.0569F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(19, 103).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.3506F, -5.5948F, -0.0657F, -0.5524F, 1.8136F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(91, 44).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.3506F, -5.5948F, 0.5308F, -0.1512F, 0.4055F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.3506F, -5.5948F, 0.5453F, 0.0751F, 0.0313F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(16, 103).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6506F, -3.6948F, -0.0286F, -0.4904F, 1.9871F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6506F, -3.6948F, 0.4749F, -0.1087F, 0.6047F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.6506F, -3.6948F, 0.4778F, 0.0939F, 0.2176F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(13, 103).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -1.8948F, 0.0226F, -0.3964F, 2.0175F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -1.8948F, 0.3919F, -0.0445F, 0.6634F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -1.8948F, 0.3761F, 0.1213F, 0.259F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(76, 91).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.9506F, -7.4948F, 0.7724F, 0.243F, -0.0569F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(103, 19).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.9506F, -7.4948F, -0.1475F, 0.7983F, -1.5642F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(17, 88).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.3506F, -5.5948F, 0.5453F, -0.0751F, -0.0313F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(91, 44).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.3506F, -5.5948F, 0.5308F, 0.1512F, -0.4055F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(19, 103).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.3506F, -5.5948F, -0.0657F, 0.5524F, -1.8136F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(85, 9).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6506F, -3.6948F, 0.4778F, -0.0939F, -0.2176F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 91).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6506F, -3.6948F, 0.4749F, 0.1087F, -0.6047F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(16, 103).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.6506F, -3.6948F, -0.0286F, 0.4904F, -1.9871F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(13, 103).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -1.8948F, 0.0226F, 0.3964F, -2.0175F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(25, 90).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -1.8948F, 0.3919F, 0.0445F, -0.6634F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(84, 83).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -1.8948F, 0.3761F, -0.1213F, -0.259F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 52).addBox(-1.0F, -3.3009F, -4.0531F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 3.9673F, -3.7751F, 1.6869F, 0.3734F, 0.3951F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(22, 43).addBox(-1.0F, -0.8368F, -2.5268F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 3.9673F, -3.7751F, 0.4651F, 0.3734F, 0.3951F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(17, 22).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.7795F, -1.209F, -0.0113F, 0.7039F, -0.4278F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(36, 10).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.7795F, -1.209F, -0.0726F, 0.8607F, -0.4403F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 28).addBox(-0.3F, 0.0233F, -0.0805F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.7795F, -1.209F, -1.6214F, 1.4378F, -2.1776F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, 0.0233F, -0.4805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.7795F, -1.209F, -0.248F, 1.031F, -0.5057F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.85F, 6.7808F, -3.7984F, -0.0404F, -0.0552F, -0.1188F));

		PartDefinition cube_r189 = frontleftleg2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(72, 60).addBox(-1.0F, 0.0603F, -1.7828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.7991F, 0.9926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r190 = frontleftleg2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -3.0F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2991F, -1.0074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r191 = frontleftleg2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(32, 70).addBox(-1.0F, -0.0367F, 0.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3009F, 0.6926F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r192 = frontleftleg2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(87, 54).addBox(0.0F, -4.0842F, 0.178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.3991F, -2.6074F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r193 = frontleftleg2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(8, 96).addBox(0.0F, 1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(56, 83).addBox(0.0F, 1.9F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -0.1009F, -0.4074F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create().texOffs(41, 69).addBox(-1.3351F, 0.3441F, -1.2153F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1143F, 5.6151F, 0.1147F, -0.9222F, 0.07F, 0.1047F));

		PartDefinition cube_r194 = frontleftleg3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 33).addBox(0.4996F, -1.9987F, -0.3689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r195 = frontleftleg3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(21, 86).addBox(-1.0F, -2.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3351F, 1.0441F, 1.1847F, -0.1203F, 0.0208F, 0.0042F));

		PartDefinition cube_r196 = frontleftleg3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(14, 74).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3351F, 3.0385F, 0.5673F, -0.0676F, 0.0238F, 0.0046F));

		PartDefinition cube_r197 = frontleftleg3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(85, 75).addBox(0.4996F, -0.8987F, -1.5689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create().texOffs(0, 50).addBox(-1.418F, 0.0265F, -0.9537F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 68).addBox(0.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 74).addBox(-2.4078F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0618F, 5.4986F, -0.6715F, 0.807F, -0.0562F, -0.0206F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.85F, 6.7808F, -3.7984F, 0.7887F, 0.0552F, 0.1188F));

		PartDefinition cube_r198 = frontrightleg2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 64).addBox(-1.0F, 0.0603F, -1.7828F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.7991F, 0.9926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r199 = frontrightleg2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(73, 20).addBox(-1.0F, -3.0F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.2991F, -1.0074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r200 = frontrightleg2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(65, 70).addBox(-1.0F, -0.0367F, 0.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3009F, 0.6926F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r201 = frontrightleg2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(56, 87).addBox(-1.0F, -4.0842F, 0.178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.3991F, -2.6074F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r202 = frontrightleg2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(23, 96).addBox(-1.0F, 1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(63, 83).addBox(-1.0F, 1.9F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -0.1009F, -0.4074F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(48, 69).addBox(-0.6649F, 0.3441F, -1.2153F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1143F, 5.6151F, 0.1147F, -1.1404F, -0.07F, -0.1047F));

		PartDefinition cube_r203 = frontrightleg3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 17).addBox(-2.4996F, -1.9987F, -0.3689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r204 = frontrightleg3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(49, 86).addBox(-1.0F, -2.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3351F, 1.0441F, 1.1847F, -0.1203F, -0.0208F, -0.0042F));

		PartDefinition cube_r205 = frontrightleg3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(74, 43).addBox(-1.0F, -2.0F, -0.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3351F, 3.0385F, 0.5673F, -0.0676F, -0.0238F, -0.0046F));

		PartDefinition cube_r206 = frontrightleg3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(85, 79).addBox(-2.4996F, -0.8987F, -1.5689F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create().texOffs(32, 65).addBox(-0.582F, 0.0265F, -0.9537F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 5).addBox(-1.582F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 32).addBox(1.4078F, 0.0265F, -0.4537F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0618F, 5.4986F, -0.6715F, 0.3271F, 0.0562F, 0.0206F));

		PartDefinition parascapularSpine = chest.addOrReplaceChild("parascapularSpine", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1991F, 1.8906F, -1.1343F, -0.7538F, 0.6778F, -1.4074F));

		PartDefinition cube_r207 = parascapularSpine.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(83, 32).addBox(-0.5014F, -0.4979F, -0.2874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.0F, -5.4F, 9.0F, 2.2708F, 0.7775F, -2.6837F));

		PartDefinition cube_r208 = parascapularSpine.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(14, 84).addBox(-0.2185F, -0.2954F, -1.7362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.7F, -4.1F, 8.8F, 1.9542F, 0.9425F, -3.0975F));

		PartDefinition cube_r209 = parascapularSpine.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(11, 55).addBox(-0.0451F, -0.6835F, -4.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.7F, -0.4F, 7.2F, 2.2574F, 0.7886F, -2.7026F));

		PartDefinition cube_r210 = parascapularSpine.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(46, 52).addBox(-0.9506F, -0.4365F, -0.0712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.3F, 8.2F, 2.4165F, 0.606F, -2.4566F));

		PartDefinition cube_r211 = parascapularSpine.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 79).addBox(-0.9731F, -0.1866F, -1.9344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2F, -1.4F, 3.4F, 2.1522F, -0.8602F, -1.1327F));

		PartDefinition cube_r212 = parascapularSpine.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(16, 61).addBox(-0.1722F, -0.5394F, -1.9267F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.3F, 3.0F, 2.557F, -0.1564F, -1.8865F));

		PartDefinition cube_r213 = parascapularSpine.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(9, 43).addBox(0.1161F, -0.0224F, -3.9519F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7F, 2.3F, 4.3F, 2.4596F, 0.5261F, -2.3764F));

		PartDefinition cube_r214 = parascapularSpine.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(56, 42).addBox(-0.1575F, -0.2072F, -1.252F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, 2.0F, -2.2F, 2.3535F, -0.6938F, -1.4178F));

		PartDefinition cube_r215 = parascapularSpine.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(32, 38).addBox(-1.3F, -0.1256F, -3.1263F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 0.0F, -1.1F, 1.3931F, -0.9838F, -0.206F));

		PartDefinition cube_r216 = parascapularSpine.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(62, 24).addBox(-3.5992F, -1.1273F, -2.16F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.9F, 1.3F, 2.4172F, -0.6048F, -1.5231F));

		PartDefinition cube_r217 = parascapularSpine.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 3).addBox(-3.8992F, -1.1273F, -3.16F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -0.9F, 1.3F, 2.5554F, -0.1709F, -1.8767F));

		PartDefinition parascapularSpine2 = chest.addOrReplaceChild("parascapularSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1991F, 1.8906F, -1.1343F, -0.7538F, -0.6778F, 1.4074F));

		PartDefinition cube_r218 = parascapularSpine2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(70, 83).addBox(-0.4986F, -0.4979F, -0.2874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.0F, -5.4F, 9.0F, 2.2708F, -0.7775F, 2.6837F));

		PartDefinition cube_r219 = parascapularSpine2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(84, 46).addBox(-0.7815F, -0.2954F, -1.7362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.7F, -4.1F, 8.8F, 1.9542F, -0.9425F, 3.0975F));

		PartDefinition cube_r220 = parascapularSpine2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(56, 36).addBox(-0.9549F, -0.6835F, -4.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.7F, -0.4F, 7.2F, 2.2574F, -0.7886F, 2.7026F));

		PartDefinition cube_r221 = parascapularSpine2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(53, 14).addBox(-0.0494F, -0.4365F, -0.0712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.3F, 8.2F, 2.4165F, -0.606F, 2.4566F));

		PartDefinition cube_r222 = parascapularSpine2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(58, 79).addBox(-0.0269F, -0.1866F, -1.9344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.2F, -1.4F, 3.4F, 2.1522F, 0.8602F, 1.1327F));

		PartDefinition cube_r223 = parascapularSpine2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(62, 20).addBox(-2.8278F, -0.5394F, -1.9267F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, 2.3F, 3.0F, 2.557F, 0.1564F, 1.8865F));

		PartDefinition cube_r224 = parascapularSpine2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(41, 46).addBox(-2.1161F, -0.0224F, -3.9519F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, 2.3F, 4.3F, 2.4596F, -0.5261F, 2.3764F));

		PartDefinition cube_r225 = parascapularSpine2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(22, 58).addBox(-4.8425F, -0.2072F, -1.252F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, 2.0F, -2.2F, 2.3535F, 0.6938F, 1.4178F));

		PartDefinition cube_r226 = parascapularSpine2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 0).addBox(-5.7F, -0.1256F, -3.1263F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.0F, -1.1F, 1.3931F, 0.9838F, 0.206F));

		PartDefinition cube_r227 = parascapularSpine2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(64, 6).addBox(0.5992F, -1.1273F, -2.16F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.9F, 1.3F, 2.4172F, 0.6048F, 1.5231F));

		PartDefinition cube_r228 = parascapularSpine2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(41, 41).addBox(-0.1008F, -1.1273F, -3.16F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, -0.9F, 1.3F, 2.5554F, 0.1709F, 1.8767F));

		PartDefinition leftPlate2 = chest.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7554F, -0.2502F, -7.3927F, 0.3128F, 0.0762F, 0.2206F));

		PartDefinition cube_r229 = leftPlate2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(87, 87).addBox(-0.5F, -1.7929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftPlate2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(51, 90).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(87, 83).addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(76, 87).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftPlate2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(97, 83).addBox(-0.5F, 1.0762F, -1.4023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftPlate2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(84, 97).addBox(-0.5F, -1.3842F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(97, 80).addBox(-0.5F, -0.8842F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.3056F, -1.0002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = chest.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7554F, -0.2502F, -7.3927F, 0.3128F, -0.0762F, -0.2206F));

		PartDefinition cube_r233 = rightPlate2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-0.5F, -1.7929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightPlate2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(51, 90).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(87, 83).mirror().addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(76, 87).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightPlate2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(-0.5F, 1.0762F, -1.4023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightPlate2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(84, 97).mirror().addBox(-0.5F, -1.3842F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(97, 80).mirror().addBox(-0.5F, -0.8842F, -0.3273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3056F, -1.0002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = chest.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2674F, -1.4948F, -4.4153F, 0.5397F, 0.0762F, 0.2206F));

		PartDefinition cube_r237 = leftPlate3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -1.6929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftPlate3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(9, 39).addBox(-0.5F, -1.2F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftPlate3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(77, 83).addBox(-0.5F, 1.1762F, -2.4023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftPlate3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, -1.3842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(3, 92).addBox(-0.5F, -0.7842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.3056F, -1.0002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = chest.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2674F, -1.4948F, -4.4153F, 0.5397F, -0.0762F, -0.2206F));

		PartDefinition cube_r241 = rightPlate3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.5F, -1.6929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightPlate3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(9, 39).mirror().addBox(-0.5F, -1.2F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightPlate3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-0.5F, 1.1762F, -2.4023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightPlate3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.5F, -1.3842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(3, 92).mirror().addBox(-0.5F, -0.7842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3056F, -1.0002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = chest.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3096F, -2.9139F, -1.4757F, 0.5396F, -0.0736F, 0.131F));

		PartDefinition cube_r245 = leftPlate8.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 13).addBox(-0.5F, -1.5929F, -0.1104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftPlate8.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(21, 77).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftPlate8.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(41, 65).addBox(-0.5F, -1.8025F, -0.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.5491F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftPlate8.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, 1.1762F, -2.4023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, 0.1998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftPlate8.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(92, 50).addBox(-0.5F, -1.3842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(92, 36).addBox(-0.5F, -0.7842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.3056F, -0.8002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = chest.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3096F, -2.9139F, -1.4757F, 0.5396F, 0.0736F, -0.131F));

		PartDefinition cube_r250 = rightPlate8.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(88, 13).mirror().addBox(-0.5F, -1.5929F, -0.1104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightPlate8.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightPlate8.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(41, 65).mirror().addBox(-0.5F, -1.8025F, -0.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.5491F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightPlate8.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5F, 1.1762F, -2.4023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, 0.1998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightPlate8.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-0.5F, -1.3842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(92, 36).mirror().addBox(-0.5F, -0.7842F, -0.4273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3056F, -0.8002F, -0.9425F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5F, -7.5F, -0.0436F, 0.2182F, 0.0F));

		PartDefinition cube_r255 = neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(46, 103).addBox(-0.5F, -1.105F, -0.9697F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(102, 86).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 52).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -3.9F, -0.3358F, -0.3017F, 0.1184F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.9F, -0.3777F, -0.5346F, 0.1995F));

		PartDefinition cube_r259 = neck4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(56, 91).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -3.9F, -0.3358F, 0.3017F, -0.1184F));

		PartDefinition cube_r260 = neck4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(91, 0).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.9F, -0.3777F, 0.5346F, -0.1995F));

		PartDefinition leftPlate24 = neck4.addOrReplaceChild("leftPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4472F, -2.2999F, -2.5402F, 0.051F, 0.0762F, 0.2206F));

		PartDefinition cube_r261 = leftPlate24.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(66, 87).addBox(-0.5F, -1.8929F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftPlate24.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(71, 87).addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(61, 87).addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftPlate24.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(97, 77).addBox(-0.5F, 0.8762F, -1.7023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftPlate24.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(97, 74).addBox(-0.5F, -0.4485F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate24 = neck4.addOrReplaceChild("rightPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4472F, -2.2999F, -2.5402F, 0.051F, -0.0762F, -0.2206F));

		PartDefinition cube_r265 = rightPlate24.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(66, 87).mirror().addBox(-0.5F, -1.8929F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightPlate24.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(71, 87).mirror().addBox(-0.5F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(61, 87).mirror().addBox(-0.5F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightPlate24.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(97, 77).mirror().addBox(-0.5F, 0.8762F, -1.7023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightPlate24.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(-0.5F, -0.4485F, 0.0377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.8F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r269 = neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(102, 51).addBox(-0.5F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 50).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(86, 103).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -2.0F, -0.684F, -0.2613F, 0.0837F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(86, 103).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.0F, -0.684F, 0.2613F, -0.0837F));

		PartDefinition leftPlate4 = neck3.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2768F, -2.7121F, -1.2398F, -0.2108F, 0.0762F, 0.2206F));

		PartDefinition cube_r272 = leftPlate4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(39, 96).addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftPlate4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(97, 17).addBox(-0.5F, -1.398F, -0.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(79, 96).addBox(-0.5F, -0.798F, -0.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.8491F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftPlate4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(13, 97).addBox(-0.5F, -0.7833F, -0.8216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0056F, -0.0002F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftPlate4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(34, 96).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.4056F, 0.1998F, 0.3403F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = neck3.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2768F, -2.7121F, -1.2398F, -0.2108F, -0.0762F, -0.2206F));

		PartDefinition cube_r276 = rightPlate4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(39, 96).mirror().addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightPlate4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-0.5F, -1.398F, -0.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(79, 96).mirror().addBox(-0.5F, -0.798F, -0.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.8491F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightPlate4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-0.5F, -0.7833F, -0.8216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0056F, -0.0002F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightPlate4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(34, 96).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4056F, 0.1998F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, 0.1308F, 0.1716F, 0.0453F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(81, 46).addBox(-0.5F, -0.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 71).addBox(-0.5F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 46).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2F, -3.3F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(92, 103).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9F, -2.9F, -0.684F, -0.2613F, 0.0837F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, -0.684F, -0.2613F, 0.0837F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(92, 103).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -2.9F, -0.684F, 0.2613F, -0.0837F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(89, 103).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, -0.684F, 0.2613F, -0.0837F));

		PartDefinition leftPlate5 = neck2.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2694F, -2.4364F, -0.3247F, -0.3329F, 0.0762F, 0.2206F));

		PartDefinition cube_r285 = leftPlate5.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(44, 97).addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftPlate5.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(97, 35).addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftPlate5.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(18, 97).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = neck2.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2694F, -2.4364F, -0.3247F, -0.3329F, -0.0762F, -0.2206F));

		PartDefinition cube_r288 = rightPlate5.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(44, 97).mirror().addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightPlate5.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(97, 35).mirror().addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightPlate5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(18, 97).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = neck2.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2254F, -2.8219F, -1.9919F, -0.3329F, 0.0762F, 0.2206F));

		PartDefinition cube_r291 = leftPlate6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(97, 51).addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftPlate6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(49, 97).addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftPlate6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(97, 48).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = neck2.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2254F, -2.8219F, -1.9919F, -0.3329F, -0.0762F, -0.2206F));

		PartDefinition cube_r294 = rightPlate6.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightPlate6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(49, 97).mirror().addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightPlate6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(97, 48).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -3.4F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r297 = neck.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(68, 60).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r298 = neck.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.1F, -0.5531F, -0.2613F, 0.0837F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.1F, -0.5531F, 0.2613F, -0.0837F));

		PartDefinition leftPlate7 = neck.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.5075F, -0.259F, -0.2457F, 0.0762F, 0.2206F));

		PartDefinition cube_r300 = leftPlate7.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(72, 97).addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftPlate7.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(97, 71).addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftPlate7.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(97, 68).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate7 = neck.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.5075F, -0.259F, -0.2457F, -0.0762F, -0.2206F));

		PartDefinition cube_r303 = rightPlate7.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(72, 97).mirror().addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightPlate7.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightPlate7.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(65, 79).addBox(-0.2F, -0.6F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(93, 11).addBox(-0.09F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(41, 93).addBox(0.07F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 56).addBox(0.18F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 79).addBox(0.0F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(41, 93).mirror().addBox(-1.07F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 56).mirror().addBox(-1.18F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(93, 11).mirror().addBox(-0.91F, -0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 79).mirror().addBox(-0.8F, -0.6F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(72, 79).mirror().addBox(-1.0F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, -1.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(93, 59).addBox(-0.8F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 0.5F, -0.5F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.1F, -0.22F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 80).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 95).addBox(0.7F, -0.22F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 80).addBox(0.6F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.8F, -1.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-0.46F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(36, 93).mirror().addBox(-0.46F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 39).mirror().addBox(-0.41F, -0.2F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(93, 39).addBox(0.61F, -0.2F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(36, 93).addBox(0.66F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 14).addBox(0.66F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.6F, -0.1F, -0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(93, 8).addBox(-1.0F, -0.701F, -0.7163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5F, 0.9F, -3.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(80, 24).addBox(-1.0F, -0.6749F, -1.6762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(92, 73).addBox(-1.0F, -0.8446F, -0.8979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.3F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(92, 70).addBox(-1.0F, -0.19F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.8F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(8, 93).addBox(-1.0F, -0.6682F, -0.7276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.5F, 1.1F, -3.7F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(92, 82).addBox(-1.0F, -0.6512F, 0.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.4F, -3.9F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(92, 88).addBox(-1.0F, -0.331F, -0.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 0.6F, -4.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(92, 85).addBox(-1.0F, -0.35F, -0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, 1.0F, -4.2F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(92, 79).addBox(-1.0F, -0.3307F, -0.6512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 1.0F, -4.2F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(80, 20).addBox(-1.0F, -0.7871F, -0.9254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.7F, -2.9F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 54).addBox(-1.0F, -0.2078F, -0.7735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, 0.1F, -3.4F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(0.0F, -0.8537F, -0.0992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, -2.4F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(0.0F, -0.1233F, -0.8805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.6F, -2.1F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(92, 76).addBox(-1.0F, -0.1233F, -0.8805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.7F, -0.6F, -2.1F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(92, 53).addBox(-1.0F, -0.8537F, -0.0992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.5F, -2.4F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.46F, -0.6764F, -0.4022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 91).addBox(-0.34F, -0.6764F, -0.4022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1F, 0.6987F, -3.9004F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 91).mirror().addBox(-0.46F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false)
				.texOffs(84, 91).addBox(-0.34F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.1F, 0.8987F, -4.0004F, -0.4538F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 42).addBox(-0.1F, -0.7106F, -0.6664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.4F, 1.7F, -2.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(81, 42).mirror().addBox(-1.0F, -0.7106F, -0.2664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(81, 42).addBox(-0.8F, -0.7106F, -0.2664F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.4F, 1.7F, -2.9F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-1.0F, -0.3325F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(89, 94).addBox(-0.8F, -0.3325F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.4F, 0.9F, -2.8F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(46, 94).mirror().addBox(-1.0F, -0.2881F, -1.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(94, 45).mirror().addBox(-1.0F, -0.2881F, -0.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(46, 94).addBox(-0.8F, -0.2881F, -1.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(94, 45).addBox(-0.8F, -0.2881F, -0.7026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.4F, 0.3F, -2.2F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(84, 94).mirror().addBox(-1.0F, -0.3149F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(84, 94).addBox(-0.2F, -0.3149F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.1F, 0.1F, -1.8F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-1.0F, -0.2881F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(51, 94).addBox(-0.2F, -0.2881F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.1F, 0.3F, -2.2F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-1.0F, -0.329F, -1.7149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 81).addBox(-0.8F, -0.329F, -1.7149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.4F, -2.1F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(18, 94).mirror().addBox(-1.0F, -0.3372F, -0.6753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(18, 94).addBox(-0.2F, -0.3372F, -0.6753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.1F, 0.2F, -1.8F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-1.0F, -0.3484F, -0.7224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(13, 94).addBox(-0.2F, -0.3484F, -0.7224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.1F, 0.0F, -1.4F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-1.0F, -0.2815F, -0.6767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(94, 4).addBox(0.0F, -0.2815F, -0.6767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.1F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-1.01F, 0.0475F, -0.988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(94, 91).mirror().addBox(-1.0F, 0.0475F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(79, 93).mirror().addBox(-1.0F, -0.2525F, -0.688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 94).addBox(0.01F, 0.0475F, -0.988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(94, 91).addBox(0.0F, 0.0475F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(79, 93).addBox(0.0F, -0.2525F, -0.688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-1.0F, -0.2804F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(93, 65).addBox(0.0F, -0.2804F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-1.0F, -0.31F, -0.7103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 62).addBox(0.0F, -0.31F, -0.7103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-1.0F, -0.3249F, -1.6858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 81).addBox(-0.2F, -0.3249F, -1.6858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 0.2F, -0.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-1.0F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(80, 28).addBox(0.0F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.2269F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, 0.1186F, -0.3039F, -0.028F));

		PartDefinition cube_r341 = tail.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(95, 30).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(87, 26).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(102, 78).addBox(0.0F, 1.2055F, 1.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 70).addBox(0.0F, 0.0055F, -0.1045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(87, 20).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftPlate14 = tail.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8772F, -4.2346F, 3.4096F, -0.0373F, -0.0355F, 0.1711F));

		PartDefinition cube_r345 = leftPlate14.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(36, 89).addBox(-0.5F, -1.8757F, -0.8135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.6509F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r346 = leftPlate14.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5F, -1.856F, -0.2008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, -1.2491F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r347 = leftPlate14.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(97, 101).addBox(-0.5F, -0.2096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.6491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r348 = leftPlate14.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(98, 10).addBox(-0.5F, -0.2512F, -1.0965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(98, 7).addBox(-0.5F, -0.2512F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.2107F, -1.2825F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r349 = leftPlate14.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(85, 36).addBox(-0.5F, -0.1733F, -1.7894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1549F, -1.7107F, 0.3175F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r350 = leftPlate14.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 71).addBox(-0.5F, -0.2734F, -1.7775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -2.1107F, 0.0175F, 0.6196F, 0.0F, 0.0F));

		PartDefinition rightPlate14 = tail.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8772F, -4.2346F, 3.4096F, -0.0373F, 0.0355F, -0.1711F));

		PartDefinition cube_r351 = rightPlate14.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(-0.5F, -1.8757F, -0.8135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.6509F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightPlate14.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-0.5F, -1.856F, -0.2008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, -1.2491F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightPlate14.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(97, 101).mirror().addBox(-0.5F, -0.2096F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.6491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightPlate14.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 10).mirror().addBox(-0.5F, -0.2512F, -1.0965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(98, 7).mirror().addBox(-0.5F, -0.2512F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.2107F, -1.2825F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightPlate14.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-0.5F, -0.1733F, -1.7894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7107F, 0.3175F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightPlate14.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-0.5F, -0.2734F, -1.7775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.1107F, 0.0175F, 0.6196F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.0893F, -0.3051F, -0.008F));

		PartDefinition cube_r357 = tail2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(37, 102).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r358 = tail2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(56, 95).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(31, 95).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(103, 31).addBox(0.0F, 3.7055F, 7.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 27).addBox(0.0F, 3.1055F, 5.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 23).addBox(0.0F, 2.4055F, 3.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5174F, -4.9015F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate15 = tail2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6692F, -3.7191F, 0.8887F, 0.0326F, -0.0355F, 0.1711F));

		PartDefinition cube_r361 = leftPlate15.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(98, 13).addBox(-0.5F, -2.3574F, -0.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(20, 90).addBox(-0.5F, -1.9574F, -0.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r362 = leftPlate15.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 100).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(13, 100).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.0993F, -0.8845F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r363 = leftPlate15.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(41, 89).addBox(-0.5F, -1.7775F, -0.7977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, -0.2491F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r364 = leftPlate15.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(87, 100).addBox(-0.5F, -2.2395F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 91).addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r365 = leftPlate15.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(82, 100).addBox(-0.5F, -0.8189F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.7491F, -0.4276F, 0.0F, 0.0F));

		PartDefinition rightPlate15 = tail2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6692F, -3.7191F, 0.8887F, 0.0326F, 0.0355F, -0.1711F));

		PartDefinition cube_r366 = rightPlate15.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(98, 13).mirror().addBox(-0.5F, -2.3574F, -0.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(20, 90).mirror().addBox(-0.5F, -1.9574F, -0.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightPlate15.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(18, 100).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(13, 100).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0993F, -0.8845F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightPlate15.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 89).mirror().addBox(-0.5F, -1.7775F, -0.7977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, -0.2491F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightPlate15.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(87, 100).mirror().addBox(-0.5F, -2.2395F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 91).mirror().addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightPlate15.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(82, 100).mirror().addBox(-0.5F, -0.8189F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.7491F, -0.4276F, 0.0F, 0.0F));

		PartDefinition leftPlate16 = tail2.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4519F, -3.277F, 4.7949F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition cube_r371 = leftPlate16.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(67, 98).addBox(-0.5F, -2.3574F, -0.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(90, 32).addBox(-0.5F, -1.9574F, -0.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r372 = leftPlate16.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(49, 100).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(44, 100).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.0993F, -0.8845F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r373 = leftPlate16.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(90, 28).addBox(-0.5F, -1.7775F, -0.7977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, -0.2491F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r374 = leftPlate16.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(64, 101).addBox(-0.5F, -2.2395F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 91).addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r375 = leftPlate16.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(59, 101).addBox(-0.5F, -0.8189F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1008F, -1.7491F, -0.4276F, 0.0F, 0.0F));

		PartDefinition rightPlate16 = tail2.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4519F, -3.277F, 4.7949F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition cube_r376 = rightPlate16.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(67, 98).mirror().addBox(-0.5F, -2.3574F, -0.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(90, 32).mirror().addBox(-0.5F, -1.9574F, -0.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightPlate16.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(49, 100).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(44, 100).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0993F, -0.8845F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightPlate16.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-0.5F, -1.7775F, -0.7977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, -0.2491F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightPlate16.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 101).mirror().addBox(-0.5F, -2.2395F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 91).mirror().addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r380 = rightPlate16.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(59, 101).mirror().addBox(-0.5F, -0.8189F, -0.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1008F, -1.7491F, -0.4276F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0148F, 5.9011F, 0.1227F, -0.39F, -0.0469F));

		PartDefinition cube_r381 = tail3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(49, 103).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(102, 66).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r383 = tail3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(102, 47).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r384 = tail3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(40, 102).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(103, 63).addBox(0.0F, 8.3055F, 15.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 60).addBox(0.0F, 7.4055F, 13.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 103).addBox(0.0F, 5.6055F, 11.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 35).addBox(0.0F, 4.6055F, 9.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5321F, -10.8026F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = tail3.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2076F, -2.6772F, 2.8635F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition cube_r386 = leftPlate17.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(90, 24).addBox(-0.5F, -1.9574F, -1.214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r387 = leftPlate17.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(90, 20).addBox(-0.5F, -1.8416F, -0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, -1.1491F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftPlate17.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(66, 91).addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r389 = leftPlate17.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(92, 100).addBox(-0.5F, -0.2969F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.4491F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightPlate17 = tail3.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2076F, -2.6772F, 2.8635F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition cube_r390 = rightPlate17.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-0.5F, -1.9574F, -1.214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r391 = rightPlate17.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-0.5F, -1.8416F, -0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, -1.1491F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r392 = rightPlate17.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(66, 91).mirror().addBox(-0.5F, -1.8395F, -0.2848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.4491F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r393 = rightPlate17.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(92, 100).mirror().addBox(-0.5F, -0.2969F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.4491F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftPlate18 = tail3.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1602F, -2.0581F, 6.8402F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition cube_r394 = leftPlate18.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(98, 38).addBox(-0.5F, -1.4574F, -1.314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(98, 26).addBox(-0.5F, -1.1574F, -1.314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r395 = leftPlate18.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(98, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -0.1658F, -0.7514F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftPlate18.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(98, 32).addBox(-0.5F, -1.2692F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 29).addBox(-0.5F, -0.8692F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.4992F, -1.3491F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r397 = leftPlate18.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(98, 20).addBox(-0.5F, -0.3969F, -0.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3992F, -1.4491F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightPlate18 = tail3.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1602F, -2.0581F, 6.8402F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition cube_r398 = rightPlate18.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.5F, -1.4574F, -1.314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(98, 26).mirror().addBox(-0.5F, -1.1574F, -1.314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r399 = rightPlate18.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.1658F, -0.7514F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightPlate18.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(98, 32).mirror().addBox(-0.5F, -1.2692F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 29).mirror().addBox(-0.5F, -0.8692F, -0.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4992F, -1.3491F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r401 = rightPlate18.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-0.5F, -0.3969F, -0.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3992F, -1.4491F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(55, 103).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.4512F, -0.2665F, -0.2625F));

		PartDefinition cube_r402 = tail4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(103, 54).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r403 = tail4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(52, 103).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r404 = tail4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(83, 103).addBox(0.0F, 11.1055F, 21.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 103).addBox(0.0F, 10.2055F, 19.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 103).addBox(0.0F, 9.2055F, 17.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5321F, -19.8026F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = tail4.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1981F, -1.4076F, 2.1199F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition cube_r405 = leftPlate19.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.9842F, -0.1897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, 0.2342F, -1.3514F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftPlate19.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(23, 102).addBox(-0.5F, -1.0574F, -1.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r407 = leftPlate19.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, -0.8251F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -0.4658F, -1.0514F, -1.0036F, 0.0F, 0.0F));

		PartDefinition rightPlate19 = tail4.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1981F, -1.4076F, 2.1199F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition cube_r408 = rightPlate19.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.5F, -0.9842F, -0.1897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2342F, -1.3514F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightPlate19.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(-0.5F, -1.0574F, -1.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.5008F, 0.3509F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightPlate19.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.5F, -0.8251F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4658F, -1.0514F, -1.0036F, 0.0F, 0.0F));

		PartDefinition leftPlate20 = tail4.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2065F, -1.0093F, 5.6086F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition cube_r411 = leftPlate20.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(102, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, 0.0134F, -0.5978F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightPlate20 = tail4.addOrReplaceChild("rightPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2065F, -1.0093F, 5.6086F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition cube_r412 = rightPlate20.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(102, 16).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.0134F, -0.5978F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(103, 57).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1241F, -0.2467F, -0.1578F));

		PartDefinition lefttailSpike = tail5.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7955F, -0.3743F, 2.9945F, -0.0166F, -0.0263F, 0.8605F));

		PartDefinition cube_r413 = lefttailSpike.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(16, 65).addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0886F, -11.1639F, 9.0179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r414 = lefttailSpike.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(64, 10).addBox(-0.5F, -10.5878F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0886F, 2.5648F, -1.9176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike3 = tail5.addOrReplaceChild("righttailSpike3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7955F, -0.3743F, 2.9945F, -0.0166F, 0.0263F, -0.8605F));

		PartDefinition cube_r415 = righttailSpike3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -11.1639F, 9.0179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r416 = righttailSpike3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.5F, -10.5878F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0886F, 2.5648F, -1.9176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition lefttailSpike2 = tail5.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9752F, -0.7432F, 5.6585F, -0.2166F, -0.0267F, 0.9162F));

		PartDefinition cube_r417 = lefttailSpike2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1242F, -11.4035F, 9.284F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r418 = lefttailSpike2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, -10.5878F, -0.6862F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1242F, 2.3252F, -1.6514F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike2 = tail5.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9752F, -0.7432F, 5.6585F, -0.2166F, 0.0267F, -0.9162F));

		PartDefinition cube_r419 = righttailSpike2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1242F, -11.4035F, 9.284F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r420 = righttailSpike2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-0.5F, -10.5878F, -0.6862F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1242F, 2.3252F, -1.6514F, -0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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