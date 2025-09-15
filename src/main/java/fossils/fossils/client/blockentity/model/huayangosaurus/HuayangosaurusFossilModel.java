package fossils.fossils.client.blockentity.model.huayangosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HuayangosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart tail;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail2;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart tail4;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart tail5;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart tail6;
	private final ModelPart lefttailSpike;
	private final ModelPart righttailSpike;
	private final ModelPart tail7;
	private final ModelPart lefttailSpike2;
	private final ModelPart righttailSpike2;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart neck;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck3;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;

	public HuayangosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.bone = this.body.getChild("bone");
		this.bone6 = this.body.getChild("bone6");
		this.leftPlate9 = this.body.getChild("leftPlate9");
		this.rightPlate9 = this.body.getChild("rightPlate9");
		this.leftPlate18 = this.body.getChild("leftPlate18");
		this.rightPlate18 = this.body.getChild("rightPlate18");
		this.tail = this.body.getChild("tail");
		this.leftPlate10 = this.tail.getChild("leftPlate10");
		this.rightPlate10 = this.tail.getChild("rightPlate10");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate11 = this.tail2.getChild("leftPlate11");
		this.rightPlate11 = this.tail2.getChild("rightPlate11");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate13 = this.tail4.getChild("leftPlate13");
		this.rightPlate13 = this.tail4.getChild("rightPlate13");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftPlate14 = this.tail5.getChild("leftPlate14");
		this.rightPlate14 = this.tail5.getChild("rightPlate14");
		this.leftPlate19 = this.tail5.getChild("leftPlate19");
		this.rightPlate19 = this.tail5.getChild("rightPlate19");
		this.tail6 = this.tail5.getChild("tail6");
		this.lefttailSpike = this.tail6.getChild("lefttailSpike");
		this.righttailSpike = this.tail6.getChild("righttailSpike");
		this.tail7 = this.tail6.getChild("tail7");
		this.lefttailSpike2 = this.tail7.getChild("lefttailSpike2");
		this.righttailSpike2 = this.tail7.getChild("righttailSpike2");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.leftPlate6 = this.upperbody.getChild("leftPlate6");
		this.rightPlate6 = this.upperbody.getChild("rightPlate6");
		this.neck = this.upperbody.getChild("neck");
		this.leftPlate3 = this.neck.getChild("leftPlate3");
		this.rightPlate3 = this.neck.getChild("rightPlate3");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate17 = this.neck4.getChild("leftPlate17");
		this.rightPlate17 = this.neck4.getChild("rightPlate17");
		this.neck3 = this.neck4.getChild("neck3");
		this.leftPlate2 = this.neck3.getChild("leftPlate2");
		this.rightPlate2 = this.neck3.getChild("rightPlate2");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.frontleftleg2 = this.upperbody.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.upperbody.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.bone3 = this.upperbody.getChild("bone3");
		this.bone4 = this.upperbody.getChild("bone4");
		this.leftPlate4 = this.upperbody.getChild("leftPlate4");
		this.rightPlate4 = this.upperbody.getChild("rightPlate4");
		this.bone2 = this.upperbody.getChild("bone2");
		this.bone5 = this.upperbody.getChild("bone5");
		this.leftPlate7 = this.body3.getChild("leftPlate7");
		this.rightPlate7 = this.body3.getChild("rightPlate7");
		this.leftPlate8 = this.body2.getChild("leftPlate8");
		this.rightPlate8 = this.body2.getChild("rightPlate8");
		this.leftPlate5 = this.body2.getChild("leftPlate5");
		this.rightPlate5 = this.body2.getChild("rightPlate5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.9983F, 6.1197F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 103).addBox(-0.5F, -2.1227F, 0.0371F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9376F, 3.8941F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 21).addBox(-0.5F, -0.0227F, -0.1129F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8899F, -2.0891F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(106, 74).addBox(-0.5F, -1.6227F, -1.0129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1822F, -3.048F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 104).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.875F, 3.2203F, 2.1874F, 0.2561F, 0.159F, 0.4579F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 83).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3158F, 3.5468F, -0.8588F, 0.2528F, -0.0099F, 0.4139F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.4156F, 4.1466F, -4.0099F, 0.2096F, -0.0086F, 0.4083F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 60).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -1.0494F, -3.8948F, 0.1984F, 0.0049F, 1.7897F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -1.0494F, -3.8948F, 0.0386F, 0.2146F, 0.44F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-2.3F, -0.5563F, -3.1816F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 12).addBox(0.7F, -0.5563F, -3.1816F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 1.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 60).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -1.0494F, -3.8948F, 0.1984F, -0.0049F, -1.7897F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(98, 70).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -1.0494F, -3.8948F, 0.0386F, -0.2146F, -0.44F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(87, 79).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.4156F, 4.1466F, -4.0099F, 0.2096F, 0.0086F, -0.4083F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(87, 83).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3158F, 3.5468F, -0.8588F, 0.2528F, 0.0099F, -0.4139F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.875F, 3.2203F, 2.1874F, 0.2561F, -0.159F, -0.4579F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.0F, 0.25F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(13, 44).addBox(0.0F, 0.5487F, -1.0449F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.8344F, 1.3098F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r16 = backleftleg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 46).addBox(0.25F, -6.5F, 2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r17 = backleftleg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 6).addBox(0.25F, -3.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(33, 54).addBox(-0.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 9.5823F, -0.0237F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r18 = backleftleg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(63, 36).addBox(-0.4255F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, -0.3027F, 0.5696F, 0.0697F, -0.003F, 0.0435F));

		PartDefinition cube_r19 = backleftleg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 42).addBox(-1.0F, -0.0241F, -0.9383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 1.9696F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r20 = backleftleg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.475F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r21 = backleftleg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 48).addBox(-1.0F, 2.5F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r22 = backleftleg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 64).addBox(-1.0F, -3.2F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(23, 60).addBox(-1.0F, -3.2F, -0.4F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, -0.0087F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0037F, 8.2974F, -0.3292F, -0.6971F, -0.0084F, -0.0044F));

		PartDefinition cube_r23 = backleftleg3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 61).addBox(0.0F, 1.7783F, -1.7449F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create().texOffs(45, 29).addBox(-1.5F, -0.3778F, -2.733F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5237F, 2.1273F, -0.2018F, 0.4363F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.5487F, -1.0449F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.8344F, 1.3098F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r24 = backrightleg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 0).addBox(-3.25F, -6.5F, 2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r25 = backrightleg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 12).addBox(-3.25F, -3.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.6487F, -2.0449F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(9, 55).addBox(-1.5F, -0.3527F, -0.9304F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 9.5823F, -0.0237F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r26 = backrightleg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(63, 46).addBox(-0.5745F, -0.2538F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, -0.3027F, 0.5696F, 0.0697F, 0.003F, -0.0435F));

		PartDefinition cube_r27 = backrightleg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(77, 70).addBox(-1.0F, -0.0241F, -0.9383F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 1.9696F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r28 = backrightleg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 76).addBox(-1.0F, -5.388F, 0.2393F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r29 = backrightleg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(5, 69).addBox(-1.0F, 2.5F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r30 = backrightleg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(61, 64).addBox(-1.0F, -3.2F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(60, 28).addBox(-1.0F, -3.2F, -0.4F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, -0.0087F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0037F, 8.2974F, -0.3292F, -0.6971F, 0.0084F, 0.0044F));

		PartDefinition cube_r31 = backrightleg3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 17).addBox(-3.0F, 1.7783F, -1.7449F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(45, 34).addBox(-2.5F, -0.3778F, -2.733F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5237F, 2.1273F, -0.2018F, 0.7418F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.0823F, 0.5253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 23).addBox(1.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(39, 46).addBox(1.3F, -0.7911F, -1.1495F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(0, 99).addBox(1.3F, 1.2089F, 0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 99).addBox(-0.4239F, 0.4647F, -1.4581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, 4.4F, 0.2033F, 0.0829F, 0.2257F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 21).addBox(-0.4639F, -0.1407F, -0.0724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.9F, 2.3F, 0.5175F, 0.0829F, 0.2257F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 91).addBox(-0.4168F, -2.1869F, -0.3567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.8F, 2.6F, 0.5175F, 0.0829F, 0.2257F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(82, 4).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0276F, 7.4065F, 2.695F, -1.2556F, -0.2009F, -0.035F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 12).addBox(-0.4012F, -0.1864F, -0.3539F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 4.6F, 1.5F, -0.9882F, -0.2176F, -0.047F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(14, 67).addBox(0.5031F, 0.0176F, -0.7118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.9F, -0.1F, -0.797F, -0.3956F, 0.1697F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 54).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0445F, 2.9729F, 1.769F, 0.0184F, -0.0916F, 0.5584F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 16).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1356F, 2.9236F, 1.148F, 0.4651F, -0.083F, 0.553F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(80, 81).addBox(1.099F, -0.2503F, -1.0551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.1F, -1.3F, -0.6529F, -0.324F, 0.2859F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 81).addBox(-0.6659F, -0.3793F, -0.153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1274F, 2.029F, -1.8973F, -0.0895F, -0.2384F, -0.0539F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(71, 99).addBox(-0.6659F, -0.3749F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1274F, 2.029F, -1.8973F, 0.7133F, -0.2384F, -0.0539F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 80).addBox(-0.7172F, -0.3466F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1274F, 2.029F, -1.8973F, 0.5146F, -0.5328F, -0.2196F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(99, 0).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.8F, 1.7332F, -1.9182F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(21, 92).addBox(-0.8274F, -1.999F, -0.4919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1274F, 2.029F, -1.8973F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 98).addBox(1.3F, 0.6726F, 2.2652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 81).addBox(1.3F, -1.7009F, 1.7518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 81).addBox(2.6562F, -2.4471F, -0.2072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7518F, -0.3991F, 0.3485F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(13, 39).addBox(1.3F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(52, 81).addBox(1.3F, -2.4471F, 1.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(33, 59).addBox(-2.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, -1.5927F, 0.0028F, -0.2537F, 0.6772F, -0.1883F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(52, 39).addBox(-0.15F, -1.0F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.404F, -0.3814F, -3.8744F, 0.1743F, -0.5355F, 0.0807F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(58, 18).addBox(0.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -2.1F, -3.1F, 0.0536F, -0.6214F, 0.0621F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 80).addBox(-0.4338F, 0.0173F, -1.724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0171F, -1.9141F, -4.8833F, 0.3419F, -0.3378F, 0.1742F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 76).addBox(-0.5F, -2.075F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.9518F, 1.1085F, -5.8369F, -0.1069F, -0.7629F, 0.0594F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0765F, 0.0173F, -2.3386F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0171F, -1.9141F, -4.8833F, 0.3818F, -0.7629F, 0.0594F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(54, 76).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, -1.2717F, -2.138F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(35, 74).addBox(1.3F, -1.2296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4625F, 0.0F, 0.0F));

		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.0823F, 0.5253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-3.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 46).mirror().addBox(-2.3F, -0.7911F, -1.1495F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 99).mirror().addBox(-2.3F, 1.2089F, 0.2505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 99).addBox(-0.4239F, 0.4647F, -1.4581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 6.5F, 4.4F, 0.2033F, 0.0829F, 0.2257F));

		PartDefinition cube_r62 = bone6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.5761F, 0.4647F, -1.4581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5F, 4.4F, 0.2033F, -0.0829F, -0.2257F));

		PartDefinition cube_r63 = bone6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-0.5361F, -0.1407F, -0.0724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9F, 2.3F, 0.5175F, -0.0829F, -0.2257F));

		PartDefinition cube_r64 = bone6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-0.5832F, -2.1869F, -0.3567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8F, 2.6F, 0.5175F, -0.0829F, -0.2257F));

		PartDefinition cube_r65 = bone6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0276F, 7.4065F, 2.695F, -1.2556F, 0.2009F, 0.035F));

		PartDefinition cube_r66 = bone6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(64, 12).mirror().addBox(-0.5988F, -0.1864F, -0.3539F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6F, 1.5F, -0.9882F, 0.2176F, 0.047F));

		PartDefinition cube_r67 = bone6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-1.5031F, 0.0176F, -0.7118F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9F, -0.1F, -0.797F, 0.3956F, -0.1697F));

		PartDefinition cube_r68 = bone6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 54).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0445F, 2.9729F, 1.769F, 0.0184F, 0.0916F, -0.5584F));

		PartDefinition cube_r69 = bone6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1356F, 2.9236F, 1.148F, 0.4651F, 0.083F, -0.553F));

		PartDefinition cube_r70 = bone6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-2.099F, -0.2503F, -1.0551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -1.3F, -0.6529F, 0.324F, -0.2859F));

		PartDefinition cube_r71 = bone6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 81).mirror().addBox(-0.3341F, -0.3793F, -0.153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 2.029F, -1.8973F, -0.0895F, 0.2384F, 0.0539F));

		PartDefinition cube_r72 = bone6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(71, 99).mirror().addBox(-0.3341F, -0.3749F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 2.029F, -1.8973F, 0.7133F, 0.2384F, 0.0539F));

		PartDefinition cube_r73 = bone6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.2828F, -0.3466F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 2.029F, -1.8973F, 0.5146F, 0.5328F, 0.2196F));

		PartDefinition cube_r74 = bone6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.7332F, -1.9182F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 92).mirror().addBox(-0.1726F, -1.999F, -0.4919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 2.029F, -1.8973F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-2.3F, 0.6726F, 2.2652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone6.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 81).mirror().addBox(-2.3F, -1.7009F, 1.7518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-3.6562F, -2.4471F, -0.2072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7518F, 0.3991F, -0.3485F));

		PartDefinition cube_r79 = bone6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(-5.3F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 81).mirror().addBox(-2.3F, -2.4471F, 1.6567F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(0.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, -1.5927F, 0.0028F, -0.2537F, -0.6772F, 0.1883F));

		PartDefinition cube_r82 = bone6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-0.85F, -1.0F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.404F, -0.3814F, -3.8744F, 0.1743F, 0.5355F, -0.0807F));

		PartDefinition cube_r83 = bone6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(-2.0318F, -0.2338F, -2.8678F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.1F, -3.1F, 0.0536F, 0.6214F, -0.0621F));

		PartDefinition cube_r84 = bone6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-0.5662F, 0.0173F, -1.724F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0171F, -1.9141F, -4.8833F, 0.3419F, 0.3378F, -0.1742F));

		PartDefinition cube_r85 = bone6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(-0.5F, -2.075F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9518F, 1.1085F, -5.8369F, -0.1069F, 0.7629F, -0.0594F));

		PartDefinition cube_r86 = bone6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(0.0765F, 0.0173F, -2.3386F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0171F, -1.9141F, -4.8833F, 0.3818F, 0.7629F, -0.0594F));

		PartDefinition cube_r87 = bone6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 76).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -1.2717F, -2.138F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-2.3F, -1.2296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4625F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3935F, -3.4729F, -2.5975F, 0.019F, 0.1095F, 0.2063F));

		PartDefinition cube_r89 = leftPlate9.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 56).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, 0.0128F, 0.5256F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftPlate9.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(43, 93).addBox(-0.5F, -1.025F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.4672F, 1.3724F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftPlate9.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 91).addBox(-0.5F, -1.7017F, -1.0475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.6943F, 0.7046F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftPlate9.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 79).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftPlate9.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(63, 72).addBox(-0.5F, -0.8603F, -0.0867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftPlate9.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(93, 25).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.3964F, 0.2347F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftPlate9.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(104, 0).addBox(-0.475F, -1.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 75).addBox(-0.475F, -1.375F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1012F, -2.202F, 1.4097F, -0.6873F, 0.0147F, -0.0112F));

		PartDefinition rightPlate9 = body.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3935F, -3.4729F, -2.5975F, 0.019F, -0.1095F, -0.2063F));

		PartDefinition cube_r96 = rightPlate9.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0128F, 0.5256F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightPlate9.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 93).mirror().addBox(-0.5F, -1.025F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.4672F, 1.3724F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightPlate9.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(97, 91).mirror().addBox(-0.5F, -1.7017F, -1.0475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.6943F, 0.7046F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightPlate9.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.4564F, 0.0078F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightPlate9.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 72).mirror().addBox(-0.5F, -0.8603F, -0.0867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightPlate9.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 25).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.3964F, 0.2347F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightPlate9.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-0.525F, -1.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 75).mirror().addBox(-0.525F, -1.375F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1012F, -2.202F, 1.4097F, -0.6873F, -0.0147F, 0.0112F));

		PartDefinition leftPlate18 = body.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2379F, -3.679F, 1.1173F, 0.0189F, 0.0659F, 0.2055F));

		PartDefinition cube_r103 = leftPlate18.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 90).addBox(-0.5F, -0.025F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, 0.0128F, 0.5256F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftPlate18.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(28, 84).addBox(-0.5F, -1.55F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.4672F, 1.3724F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftPlate18.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(33, 104).addBox(-0.5F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.3036F, 0.5987F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftPlate18.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(22, 44).addBox(-0.5F, -0.8603F, -0.1117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftPlate18.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(91, 41).addBox(-0.5F, -3.2F, -0.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftPlate18.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(31, 96).addBox(-0.475F, -1.85F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1018F, -2.1503F, 1.5915F, -0.7746F, 0.0147F, -0.0112F));

		PartDefinition rightPlate18 = body.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2379F, -3.679F, 1.1173F, 0.0189F, -0.0659F, -0.2055F));

		PartDefinition cube_r109 = rightPlate18.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-0.5F, -0.025F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0128F, 0.5256F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightPlate18.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(28, 84).mirror().addBox(-0.5F, -1.55F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.4672F, 1.3724F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightPlate18.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(33, 104).mirror().addBox(-0.5F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.3036F, 0.5987F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightPlate18.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.5F, -0.8603F, -0.1117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightPlate18.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-0.5F, -3.2F, -0.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightPlate18.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(-0.525F, -1.85F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1018F, -2.1503F, 1.5915F, -0.7746F, -0.0147F, 0.0112F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1278F, 4.9992F, 0.0915F, -0.1778F, 0.0272F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 99).addBox(0.0F, -2.1696F, -0.0743F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5888F, 2.9729F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(99, 82).addBox(0.0F, -2.227F, 0.0345F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9767F, 0.9413F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-0.85F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.2979F, 2.3383F, -0.1223F, 0.0433F, -0.0053F));

		PartDefinition cube_r118 = tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 8).addBox(-1.15F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.2979F, 2.3383F, -0.1223F, -0.0433F, 0.0053F));

		PartDefinition cube_r119 = tail.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 52).addBox(-0.5F, -1.0422F, 0.9173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(3, 108).addBox(0.0F, 1.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 108).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4848F, 0.6972F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = tail.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3741F, -3.7863F, 1.2089F, -0.0246F, 0.1095F, 0.2063F));

		PartDefinition cube_r121 = leftPlate10.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 45).addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -1.0764F, 0.5388F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftPlate10.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(85, 20).addBox(-0.5F, -0.125F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftPlate10.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(91, 46).addBox(-0.5F, -2.8767F, -0.7725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.6943F, 0.7046F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftPlate10.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(96, 41).addBox(-0.5F, -0.8603F, -0.0617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftPlate10.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(96, 37).addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftPlate10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(96, 33).addBox(-0.5F, -0.05F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0704F, -2.1712F, 2.045F, -0.6219F, 0.0147F, -0.0112F));

		PartDefinition rightPlate10 = tail.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3741F, -3.7863F, 1.2089F, -0.0246F, -0.1095F, -0.2063F));

		PartDefinition cube_r127 = rightPlate10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 45).mirror().addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.0764F, 0.5388F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightPlate10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-0.5F, -0.125F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightPlate10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(91, 46).mirror().addBox(-0.5F, -2.8767F, -0.7725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.6943F, 0.7046F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightPlate10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 41).mirror().addBox(-0.5F, -0.8603F, -0.0617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightPlate10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightPlate10.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-0.5F, -0.05F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0704F, -2.1712F, 2.045F, -0.6219F, -0.0147F, 0.0112F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3361F, 3.8737F, 0.0774F, 0.0836F, 0.0501F));

		PartDefinition cube_r133 = tail2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(106, 96).addBox(0.0F, -1.0782F, -0.0176F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6702F, 4.7913F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(93, 99).addBox(0.0F, -1.5227F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7702F, 2.7913F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 106).addBox(0.0F, -1.8068F, -0.13F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8702F, 0.8913F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-1.525F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.198F, 0.7827F, -0.035F, 0.0698F, -0.0024F));

		PartDefinition cube_r137 = tail2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(36, 15).addBox(-0.475F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.198F, 0.7827F, -0.035F, -0.0698F, 0.0024F));

		PartDefinition cube_r138 = tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(17, 22).addBox(-0.5F, -0.8894F, -0.5203F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0708F, 0.3071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(6, 108).addBox(0.0F, 0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 104).addBox(0.0F, -1.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9055F, 2.0845F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail2.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2848F, -2.8299F, 3.3974F, -0.1119F, 0.1095F, 0.2063F));

		PartDefinition cube_r140 = leftPlate11.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(38, 104).addBox(-0.5F, -0.775F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -1.0764F, 0.5388F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftPlate11.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(52, 85).addBox(-0.5F, -0.15F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftPlate11.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(96, 57).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.0739F, -1.2247F, 1.4217F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftPlate11.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(96, 53).addBox(-0.5F, -1.9767F, -0.8225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.6943F, 0.7046F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftPlate11.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(96, 49).addBox(-0.5F, -1.625F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.9338F, 0.0F, 0.0F));

		PartDefinition rightPlate11 = tail2.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2848F, -2.8299F, 3.3974F, -0.1119F, -0.1095F, -0.2063F));

		PartDefinition cube_r145 = rightPlate11.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 104).mirror().addBox(-0.5F, -0.775F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.0764F, 0.5388F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightPlate11.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(52, 85).mirror().addBox(-0.5F, -0.15F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightPlate11.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(96, 57).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2247F, 1.4217F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightPlate11.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-0.5F, -1.9767F, -0.8225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.6943F, 0.7046F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightPlate11.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-0.5F, -1.625F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.9338F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.292F, 5.6763F, -0.1632F, -0.0861F, 0.0142F));

		PartDefinition cube_r150 = tail3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(106, 104).addBox(0.0F, -1.514F, 0.0169F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7974F, 2.9771F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(106, 100).addBox(0.0F, -1.4562F, 0.0776F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5938F, 0.8758F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.9455F, -0.8252F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(12, 108).addBox(0.0F, 0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 108).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2366F, 0.7381F, 0.6632F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2848F, -2.9311F, 2.3357F, 0.1274F, 0.084F, 0.424F));

		PartDefinition cube_r154 = leftPlate12.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(59, 85).addBox(-0.5F, -0.125F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftPlate12.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(91, 56).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.2247F, 1.4217F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftPlate12.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 104).addBox(-0.5F, -0.325F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftPlate12.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(91, 51).addBox(-0.5F, -2.625F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.8203F, 0.0F, 0.0F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2848F, -2.9311F, 2.3357F, 0.1274F, -0.084F, -0.424F));

		PartDefinition cube_r158 = rightPlate12.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.5F, -0.125F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0128F, 0.5256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r159 = rightPlate12.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.5F, -0.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2247F, 1.4217F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightPlate12.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(43, 104).mirror().addBox(-0.5F, -0.325F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightPlate12.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(91, 51).mirror().addBox(-0.5F, -2.625F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.8203F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8153F, 4.8009F, -0.0345F, -0.1731F, 0.0465F));

		PartDefinition cube_r162 = tail4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(102, 107).addBox(0.0F, -1.2055F, 0.039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.3689F, 2.0003F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 36).addBox(0.0F, -0.9306F, 0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.334F, 6.0001F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(15, 109).addBox(0.0F, 4.8F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 8).addBox(0.0F, 2.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 24).addBox(0.0F, 1.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0519F, -4.0629F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(81, 108).addBox(0.0F, -1.0055F, 0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.3514F, 4.0002F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(99, 107).addBox(0.0F, -1.3056F, -0.061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.3855F, 0.1003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.5055F, 0.139F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail4.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1833F, -1.9916F, 3.2925F, -0.0471F, 0.084F, 0.424F));

		PartDefinition cube_r168 = leftPlate13.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(96, 61).addBox(-0.5F, 0.225F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.2246F, 1.4217F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftPlate13.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(48, 104).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftPlate13.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 61).addBox(-0.5F, -2.625F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = tail4.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1833F, -1.9916F, 3.2925F, -0.0471F, -0.084F, -0.424F));

		PartDefinition cube_r171 = rightPlate13.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-0.5F, 0.225F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2246F, 1.4217F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightPlate13.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(48, 104).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightPlate13.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-0.5F, -2.625F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.6632F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(93, 108).addBox(0.0F, -1.2534F, 0.8667F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0443F, 7.0318F, -0.1374F, 0.1573F, -0.1506F));

		PartDefinition cube_r174 = tail5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(105, 108).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2784F, 4.8667F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(96, 108).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3784F, 2.8667F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(24, 109).addBox(0.0F, 8.9F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 109).addBox(0.0F, 7.5F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 109).addBox(0.0F, 6.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0076F, -11.0947F, 0.6632F, 0.0F, 0.0F));

		PartDefinition leftPlate14 = tail5.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2311F, -1.8403F, 0.982F, -0.1344F, 0.084F, 0.424F));

		PartDefinition cube_r177 = leftPlate14.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(97, 16).addBox(-0.5F, -0.675F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -0.8503F, 0.5612F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftPlate14.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(106, 53).addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftPlate14.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(96, 75).addBox(-0.5F, -1.625F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.4451F, 0.0F, 0.0F));

		PartDefinition rightPlate14 = tail5.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2311F, -1.8403F, 0.982F, -0.1344F, -0.084F, -0.424F));

		PartDefinition cube_r180 = rightPlate14.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(97, 16).mirror().addBox(-0.5F, -0.675F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.8503F, 0.5612F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightPlate14.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(106, 53).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.2083F, -0.2707F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightPlate14.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(96, 75).mirror().addBox(-0.5F, -1.625F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = tail5.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.079F, -1.6294F, 5.712F, -0.2548F, 0.1371F, 0.4107F));

		PartDefinition cube_r183 = leftPlate19.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(104, 62).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0739F, 0.1754F, 0.1697F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftPlate19.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(58, 104).addBox(-0.5F, -0.65F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0739F, 0.2083F, -0.2707F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftPlate19.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(53, 104).addBox(-0.5F, -0.825F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, 0.0545F, -0.3791F, -0.637F, 0.0F, 0.0F));

		PartDefinition rightPlate19 = tail5.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.079F, -1.6294F, 5.712F, -0.2548F, -0.1371F, -0.4107F));

		PartDefinition cube_r186 = rightPlate19.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(104, 62).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1754F, 0.1697F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightPlate19.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(58, 104).mirror().addBox(-0.5F, -0.65F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.2083F, -0.2707F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightPlate19.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(53, 104).mirror().addBox(-0.5F, -0.825F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0545F, -0.3791F, -0.637F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(30, 31).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0414F, 5.9303F, -0.0874F, 0.3478F, -0.0299F));

		PartDefinition cube_r189 = tail6.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(109, 0).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 108).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2784F, 0.8667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail6.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(109, 62).addBox(0.0F, 11.5F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 109).addBox(0.0F, 10.3F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9661F, -17.025F, 0.6632F, 0.0F, 0.0F));

		PartDefinition lefttailSpike = tail6.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7955F, -0.8082F, 3.7744F, -0.0166F, -0.0263F, 0.8605F));

		PartDefinition cube_r191 = lefttailSpike.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(66, 85).addBox(-0.5F, 0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0886F, -0.6563F, 0.3662F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r192 = lefttailSpike.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.7601F, -0.8202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0886F, -5.0401F, 4.1611F, -0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r193 = lefttailSpike.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(30, 64).addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0886F, 2.5648F, -1.9176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike = tail6.addOrReplaceChild("righttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7955F, -0.8082F, 3.7744F, -0.0166F, 0.0263F, -0.8605F));

		PartDefinition cube_r194 = righttailSpike.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-0.5F, 0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -0.6563F, 0.3662F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r195 = righttailSpike.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -0.7601F, -0.8202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -5.0401F, 4.1611F, -0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r196 = righttailSpike.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0886F, 2.5648F, -1.9176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(39, 39).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0142F, 5.9211F, -0.2148F, 0.1279F, -0.0278F));

		PartDefinition lefttailSpike2 = tail7.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1744F, -0.2872F, 0.4704F, -0.2348F, -0.0263F, 0.8605F));

		PartDefinition cube_r197 = lefttailSpike2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(73, 85).addBox(-0.5F, 0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0886F, -0.6563F, 0.3662F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r198 = lefttailSpike2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(23, 68).addBox(-0.5F, -0.7601F, -0.8202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0886F, -5.0401F, 4.1611F, -0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r199 = lefttailSpike2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(35, 64).addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0886F, 2.5648F, -1.9175F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike2 = tail7.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1744F, -0.2872F, 0.4704F, -0.2348F, 0.0263F, -0.8605F));

		PartDefinition cube_r200 = righttailSpike2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-0.5F, 0.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -0.6563F, 0.3662F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r201 = righttailSpike2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-0.5F, -0.7601F, -0.8202F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -5.0401F, 4.1611F, -0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r202 = righttailSpike2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0886F, 2.5648F, -1.9175F, -0.6545F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3607F, -4.1864F, 0.0788F, -0.087F, -0.0069F));

		PartDefinition cube_r203 = body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(19, 12).addBox(-1.0F, -1.8893F, 4.3355F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.9369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(-1.4F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.7935F, 4.8496F, -3.7785F, 0.1294F, -0.0044F, 0.4241F));

		PartDefinition cube_r205 = body2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(57, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -0.4276F, -1.6453F, 0.2305F, 0.0861F, 1.9482F));

		PartDefinition cube_r206 = body2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 94).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -0.4276F, -1.6453F, -0.0361F, 0.2631F, 0.5794F));

		PartDefinition cube_r207 = body2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, -0.4276F, -1.6453F, -0.1456F, 0.2228F, 0.1315F));

		PartDefinition cube_r208 = body2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(54, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, -0.3276F, -3.6453F, 0.1598F, -0.0925F, 1.9485F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(79, 93).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, -0.3276F, -3.6453F, 0.1262F, 0.155F, 0.6132F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, -0.3276F, -3.6453F, 0.0484F, 0.1937F, 0.1717F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1276F, -5.5453F, 0.1072F, -0.2221F, 1.9567F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 93).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1276F, -5.5453F, 0.2406F, 0.0738F, 0.6263F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(28, 90).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.1276F, -5.5453F, 0.1879F, 0.1681F, 0.1969F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(57, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.4276F, -1.6453F, 0.2305F, -0.0861F, -1.9482F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(7, 94).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.4276F, -1.6453F, -0.0361F, -0.2631F, -0.5794F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(43, 90).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.4276F, -1.6453F, -0.1456F, -0.2228F, -0.1315F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(54, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, -0.3276F, -3.6453F, 0.1598F, 0.0925F, -1.9485F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(79, 93).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, -0.3276F, -3.6453F, 0.1262F, -0.155F, -0.6132F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(15, 100).addBox(3.4467F, 3.1438F, -0.2288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, -0.3276F, -3.6453F, 0.0484F, -0.1937F, -0.1717F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(51, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1276F, -5.5453F, 0.1072F, 0.2221F, -1.9567F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(76, 93).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1276F, -5.5453F, 0.2406F, -0.0738F, -0.6263F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(28, 90).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.1276F, -5.5453F, 0.1879F, -0.1681F, -0.1969F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -2.2227F, -0.2378F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2218F, -1.6505F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(42, 107).addBox(-0.5F, -1.8227F, -0.1129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0782F, -3.6505F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(39, 107).addBox(-0.5F, -1.7227F, -0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0782F, -5.6505F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(33, 87).addBox(0.4F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.7935F, 4.8496F, -3.7785F, 0.1294F, 0.0044F, -0.4241F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6218F, -6.7505F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r227 = body3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(33, 107).addBox(-0.5F, -1.7227F, -0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.8F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(90, 107).addBox(-0.5F, -1.8227F, -0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4329F, -0.8474F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.7512F, 4.6275F, -0.2203F, 0.1458F, -0.4191F, 0.367F));

		PartDefinition cube_r230 = body3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.6494F, -0.6948F, 0.2226F, 0.1611F, 0.2026F));

		PartDefinition cube_r231 = body3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 108).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.6494F, -0.6948F, 0.0936F, -0.2544F, 1.9599F));

		PartDefinition cube_r232 = body3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.6494F, -0.6948F, 0.2689F, 0.0533F, 0.6281F));

		PartDefinition cube_r233 = body3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.0494F, -2.6948F, 0.2917F, 0.1467F, 0.2132F));

		PartDefinition cube_r234 = body3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(73, 93).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.0494F, -2.6948F, 0.3254F, 0.0123F, 0.6299F));

		PartDefinition cube_r235 = body3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.0494F, -2.6948F, 0.0657F, -0.3189F, 1.9678F));

		PartDefinition cube_r236 = body3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -4.6948F, 0.0366F, -0.3831F, 1.9778F));

		PartDefinition cube_r237 = body3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(36, 91).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -4.6948F, 0.3818F, -0.0289F, 0.6294F));

		PartDefinition cube_r238 = body3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 89).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -4.6948F, 0.3606F, 0.1316F, 0.2227F));

		PartDefinition cube_r239 = body3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(28, 97).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.6494F, -0.6948F, 0.2689F, -0.0533F, -0.6281F));

		PartDefinition cube_r240 = body3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(69, 108).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.6494F, -0.6948F, 0.0936F, 0.2544F, -1.9599F));

		PartDefinition cube_r241 = body3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(49, 78).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.6494F, -0.6948F, 0.2226F, -0.1611F, -0.2026F));

		PartDefinition cube_r242 = body3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(9, 46).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.0494F, -2.6948F, 0.2917F, -0.1467F, -0.2132F));

		PartDefinition cube_r243 = body3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 93).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.0494F, -2.6948F, 0.3254F, -0.0123F, -0.6299F));

		PartDefinition cube_r244 = body3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(48, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.0494F, -2.6948F, 0.0657F, 0.3189F, -1.9678F));

		PartDefinition cube_r245 = body3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(45, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -4.6948F, 0.0366F, 0.3831F, -1.9778F));

		PartDefinition cube_r246 = body3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(36, 91).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -4.6948F, 0.3818F, 0.0289F, -0.6294F));

		PartDefinition cube_r247 = body3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(82, 89).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -4.6948F, 0.3606F, -0.1316F, -0.2227F));

		PartDefinition cube_r248 = body3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.7512F, 4.6275F, -0.2203F, 0.1458F, 0.4191F, -0.367F));

		PartDefinition cube_r249 = body3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -1.1006F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4075F, -4.1864F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r250 = body3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(36, 107).addBox(-0.5F, -1.9227F, -0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.0656F, -4.667F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r251 = upperbody.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(107, 88).addBox(-0.5F, -1.5863F, -0.2769F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6164F, -3.6176F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r252 = upperbody.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 62).addBox(-0.5F, -1.8574F, -0.3413F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1164F, -1.6176F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r253 = upperbody.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(87, 107).addBox(-0.5F, -1.9053F, 2.4204F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5164F, -7.9176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r254 = upperbody.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 4.0057F, 1.4867F, 0.03F, -0.3749F, 0.4145F));

		PartDefinition cube_r255 = upperbody.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, 0.0233F, -0.0805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.3959F, -0.8267F, -0.0633F, -0.5824F, 0.4138F));

		PartDefinition cube_r256 = upperbody.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(0.0F, -0.9268F, -0.0556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 33).addBox(3.0F, -0.9268F, -0.0556F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 8.3164F, -5.5176F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r257 = upperbody.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 63).mirror().addBox(0.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(84, 63).addBox(3.0F, -1.0569F, 0.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 9.6164F, -2.9176F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r258 = upperbody.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.5F, 0.0233F, -0.7805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.3959F, -0.8267F, 0.1518F, -1.3044F, 0.521F));

		PartDefinition cube_r259 = upperbody.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(36, 8).mirror().addBox(-0.8F, -0.1017F, -0.8555F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.3959F, -0.8267F, 0.0202F, -0.9519F, 0.5738F));

		PartDefinition cube_r260 = upperbody.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-0.5F, 0.0233F, -0.0805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.3959F, -0.8267F, 0.0665F, -0.7914F, 0.4023F));

		PartDefinition cube_r261 = upperbody.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.033F, -1.6125F, 0.3059F, 0.13F, 0.1983F));

		PartDefinition cube_r262 = upperbody.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.033F, -1.6125F, 0.3315F, -0.0087F, 0.6131F));

		PartDefinition cube_r263 = upperbody.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(84, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.033F, -1.6125F, 0.0457F, -0.3296F, 1.9574F));

		PartDefinition cube_r264 = upperbody.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-3.4467F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, 0.667F, -3.7125F, 0.4435F, 0.1014F, 0.2142F));

		PartDefinition cube_r265 = upperbody.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(35, 48).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, 0.667F, -3.7125F, 0.446F, -0.0888F, 0.6075F));

		PartDefinition cube_r266 = upperbody.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(66, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, 0.667F, -3.7125F, -0.0129F, -0.4584F, 1.98F));

		PartDefinition cube_r267 = upperbody.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 1.492F, -5.6125F, 0.5632F, 0.0747F, 0.2248F));

		PartDefinition cube_r268 = upperbody.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 97).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 1.492F, -5.6125F, 0.5475F, -0.158F, 0.595F));

		PartDefinition cube_r269 = upperbody.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(60, 107).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 1.492F, -5.6125F, -0.0705F, -0.5698F, 2.0083F));

		PartDefinition cube_r270 = upperbody.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(22, 48).addBox(-0.5F, 0.0233F, -0.7805F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.3959F, -0.8267F, 0.1518F, 1.3044F, -0.521F));

		PartDefinition cube_r271 = upperbody.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(36, 8).addBox(-0.2F, -0.1017F, -0.8555F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.3959F, -0.8267F, 0.0202F, 0.9519F, -0.5738F));

		PartDefinition cube_r272 = upperbody.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, 0.0233F, -0.0805F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.3959F, -0.8267F, -0.0633F, 0.5824F, -0.4138F));

		PartDefinition cube_r273 = upperbody.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(32, 22).addBox(-0.5F, 0.0233F, -0.0805F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.3959F, -0.8267F, 0.0665F, 0.7914F, -0.4023F));

		PartDefinition cube_r274 = upperbody.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(40, 90).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.033F, -1.6125F, 0.3059F, -0.13F, -0.1983F));

		PartDefinition cube_r275 = upperbody.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(15, 94).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.033F, -1.6125F, 0.3315F, 0.0087F, -0.6131F));

		PartDefinition cube_r276 = upperbody.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(84, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.033F, -1.6125F, 0.0457F, 0.3296F, -1.9574F));

		PartDefinition cube_r277 = upperbody.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(90, 24).addBox(3.4467F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.667F, -3.7125F, 0.4435F, -0.1014F, -0.2142F));

		PartDefinition cube_r278 = upperbody.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(35, 48).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.667F, -3.7125F, 0.446F, 0.0888F, -0.6075F));

		PartDefinition cube_r279 = upperbody.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(66, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.667F, -3.7125F, -0.0129F, 0.4584F, -1.98F));

		PartDefinition cube_r280 = upperbody.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(98, 20).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 1.492F, -5.6125F, 0.5632F, -0.0747F, -0.2248F));

		PartDefinition cube_r281 = upperbody.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(82, 97).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 1.492F, -5.6125F, 0.5475F, 0.158F, -0.595F));

		PartDefinition cube_r282 = upperbody.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(60, 107).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 1.492F, -5.6125F, -0.0705F, 0.5698F, -2.0083F));

		PartDefinition cube_r283 = upperbody.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.7053F, 1.6204F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 2.3164F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r284 = upperbody.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(42, 78).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.1F, 4.0057F, 1.4867F, 0.03F, 0.3749F, -0.4145F));

		PartDefinition leftPlate6 = upperbody.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8673F, -1.1875F, -4.1764F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition cube_r285 = leftPlate6.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.1549F, -1.3886F, 0.8407F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftPlate6.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, -0.1F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(0.1549F, -1.909F, 0.4946F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftPlate6.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -0.2857F, -1.5539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -1.1053F, 1.0098F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftPlate6.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(7, 82).addBox(-0.5F, -0.325F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftPlate6.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5F, -0.275F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.1549F, -1.5566F, -0.7897F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftPlate6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(18, 100).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.6001F, 0.18F, -1.1868F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = upperbody.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8673F, -1.1875F, -4.1764F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition cube_r291 = rightPlate6.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3886F, 0.8407F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightPlate6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5F, -0.1F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.909F, 0.4946F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightPlate6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(68, 76).mirror().addBox(-0.5F, -0.2857F, -1.5539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.1053F, 1.0098F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightPlate6.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.5F, -0.325F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightPlate6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.5F, -0.275F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5566F, -0.7897F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightPlate6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(18, 100).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.6001F, 0.18F, -1.1868F, 0.0F, 0.0F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1633F, -5.5959F, 0.0149F, 0.0878F, -0.0422F));

		PartDefinition cube_r297 = neck.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(72, 108).addBox(0.5F, -1.6318F, 1.8436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 78).addBox(0.0F, -0.5318F, 1.8436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r298 = neck.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1482F, 0.7604F, -0.652F, 0.8648F, -0.2371F, 0.3971F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(98, 65).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1482F, 0.7604F, -0.652F, 0.8648F, 0.2371F, -0.3971F));

		PartDefinition cube_r300 = neck.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(107, 15).addBox(0.5F, -0.975F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -0.1805F, -3.9607F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r301 = neck.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(82, 12).addBox(0.0F, -0.475F, 1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 0.3671F, -5.7014F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5104F, -1.9885F, -1.7278F, -0.1148F, 0.0762F, 0.2206F));

		PartDefinition cube_r302 = leftPlate3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -1.3557F, 0.1515F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftPlate3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(101, 98).addBox(-0.5F, -0.9286F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1549F, -0.0762F, 0.6309F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftPlate3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(85, 101).addBox(-0.5F, -0.9286F, -0.4311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, 0.2722F, 0.1424F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftPlate3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(94, 83).addBox(-0.5F, -1.8536F, -0.5061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3536F, -0.3568F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftPlate3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(101, 101).addBox(-0.5F, -0.2228F, -0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.7488F, -0.7584F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftPlate3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 94).addBox(-0.5F, -1.9228F, -0.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.652F, -0.7835F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftPlate3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(91, 31).addBox(-0.5F, -2.6228F, 0.1209F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, -0.248F, -0.8934F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = neck.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5104F, -1.9885F, -1.7278F, -0.1148F, -0.0762F, -0.2206F));

		PartDefinition cube_r309 = rightPlate3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(14, 90).mirror().addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3557F, 0.1515F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightPlate3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(101, 98).mirror().addBox(-0.5F, -0.9286F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.0762F, 0.6309F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightPlate3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(-0.5F, -0.9286F, -0.4311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2722F, 0.1424F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightPlate3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-0.5F, -1.8536F, -0.5061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3536F, -0.3568F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightPlate3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(101, 101).mirror().addBox(-0.5F, -0.2228F, -0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7488F, -0.7584F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightPlate3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(85, 94).mirror().addBox(-0.5F, -1.9228F, -0.2291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.652F, -0.7835F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightPlate3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-0.5F, -2.6228F, 0.1209F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.248F, -0.8934F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0825F, -3.542F, -0.2565F, 0.2536F, -0.0657F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(75, 108).addBox(0.5F, -1.067F, 0.958F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 82).addBox(0.0F, -0.467F, 0.958F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1976F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.1976F, -1.8519F, -0.0584F, 0.2164F, -0.0139F));

		PartDefinition cube_r317 = neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(107, 82).addBox(0.5F, -1.05F, 1.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(14, 82).addBox(0.0F, -0.65F, 1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = neck4.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(1.061F, -1.9248F, 0.1856F, 0.147F, 0.0762F, 0.2206F));

		PartDefinition cube_r318 = leftPlate17.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(68, 38).addBox(-0.5F, -0.3536F, -0.2811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.1549F, -2.417F, 0.0505F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftPlate17.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(94, 79).addBox(-0.5F, -1.9286F, -0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3536F, -0.3568F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftPlate17.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5F, -2.4228F, 0.0459F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.248F, -0.8934F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightPlate17 = neck4.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.061F, -1.9248F, 0.1856F, 0.147F, -0.0762F, -0.2206F));

		PartDefinition cube_r321 = rightPlate17.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-0.5F, -0.3536F, -0.2811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.417F, 0.0505F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightPlate17.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-0.5F, -1.9286F, -0.0561F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3536F, -0.3568F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r323 = rightPlate17.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(31, 91).mirror().addBox(-0.5F, -2.4228F, 0.0459F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.248F, -0.8934F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.9169F, 0.1201F, 0.26F, 0.031F));

		PartDefinition cube_r324 = neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(78, 108).addBox(0.5F, -0.95F, -0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 28).addBox(0.0F, -0.65F, -1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck3.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7005F, -2.0154F, 0.0308F, 0.0161F, 0.0762F, 0.2206F));

		PartDefinition cube_r325 = leftPlate2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(101, 70).addBox(-0.5F, -0.9286F, -0.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4508F, 0.1509F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftPlate2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(104, 79).addBox(-0.5F, 0.1272F, -0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(101, 76).addBox(-0.5F, -0.2728F, -0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(66, 104).addBox(-0.5F, 0.1272F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1549F, 0.2508F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftPlate2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(101, 67).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.4657F, -0.6572F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftPlate2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(101, 73).addBox(-0.5F, -0.8157F, -1.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 101).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2556F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = neck3.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7005F, -2.0154F, 0.0308F, 0.0161F, -0.0762F, -0.2206F));

		PartDefinition cube_r329 = rightPlate2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(101, 70).mirror().addBox(-0.5F, -0.9286F, -0.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4508F, 0.1509F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightPlate2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.5F, 0.1272F, -0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(101, 76).mirror().addBox(-0.5F, -0.2728F, -0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(66, 104).mirror().addBox(-0.5F, 0.1272F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2508F, -0.5491F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightPlate2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(101, 67).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4657F, -0.6572F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightPlate2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-0.5F, -0.8157F, -1.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 101).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2556F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2639F, -2.7457F, 0.025F, 0.2656F, 0.1576F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(89, 8).addBox(-0.5588F, -0.125F, 0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.0588F, 1.0109F, -4.5077F, 0.697F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(89, 4).addBox(-0.5588F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -0.7207F, -2.6062F, 0.7493F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(75, 57).addBox(-1.5588F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -1.3343F, -0.9141F, -0.1321F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(73, 6).addBox(-1.0588F, -0.7F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -0.5998F, -1.1796F, 0.3479F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1637F, -0.6406F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(101, 104).addBox(-0.45F, -0.8314F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, -0.1019F, 0.5362F, -0.6196F, -0.3054F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5358F, -1.1597F, -0.4991F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.854F, -0.0707F, 0.6502F, 0.3901F, -0.3193F, -0.276F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(10, 105).addBox(-0.5F, -0.325F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.3F, 0.3417F, -1.0649F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(46, 97).addBox(-0.2756F, -1.0949F, -0.5835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.6006F, -0.1494F, -0.5094F, 1.757F, 0.2602F, 0.1129F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 75).addBox(-0.8588F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3588F, -0.557F, -1.9656F, 0.77F, 0.1275F, 0.1195F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(106, 32).addBox(-0.65F, -0.7706F, -0.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.083F, -0.2397F, 0.153F, 1.2909F, 0.0778F, 0.0724F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 105).addBox(-0.45F, -0.8705F, -0.7142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.7F, -0.1019F, 0.5362F, 1.2915F, -0.3054F, 0.0F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(36, 97).addBox(-0.5358F, -1.3016F, -0.7896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.904F, -0.0707F, 0.6502F, 0.7156F, -0.1134F, 0.0F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(89, 104).addBox(-0.5F, -0.6875F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.8826F, 0.481F, 0.9609F, 1.2828F, 0.0175F, 0.0F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(41, 101).addBox(-0.5F, -0.3125F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.8826F, 0.481F, 0.9609F, 1.1519F, 0.0175F, 0.0F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(98, 26).addBox(-0.525F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(47, 86).addBox(-0.525F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.3416F, 2.2792F, -3.2909F, 0.7351F, 0.1658F, 0.103F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(47, 89).addBox(-0.375F, -0.475F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.2847F, 1.5447F, -2.6208F, 0.7115F, 0.2352F, 0.1573F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(33, 83).addBox(-0.4615F, -0.2207F, -0.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.144F, 0.8153F, -1.8999F, 0.3538F, 0.336F, 0.2048F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(20, 106).addBox(-0.4966F, -0.7219F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(101, 38).addBox(-0.4966F, -0.7219F, -0.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2082F, 1.2504F, -3.0207F, 0.7619F, 0.2206F, 0.1482F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(76, 105).addBox(-0.675F, -0.3634F, -0.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(71, 105).addBox(-0.675F, -0.3634F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.05F, 1.7469F, -3.3778F, -0.0121F, 0.0691F, 0.14F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(106, 71).addBox(-0.675F, -0.1655F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 1.7469F, -3.3778F, 0.6424F, 0.0691F, 0.14F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(106, 18).addBox(-0.675F, -0.1713F, -1.0034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(36, 101).addBox(-0.675F, -0.1713F, -0.7784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(-0.05F, 1.7469F, -3.3778F, 0.734F, 0.0691F, 0.14F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(101, 35).addBox(-0.675F, -0.3075F, -0.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.0456F, 1.4816F, -3.8491F, 1.6175F, 0.0006F, 0.1402F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(105, 93).addBox(-0.675F, -0.7749F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(101, 32).addBox(-0.675F, -0.7749F, -0.9756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 1.7469F, -3.3778F, 1.7114F, 0.0691F, 0.14F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(15, 106).addBox(-0.45F, -0.3457F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.45F, 1.185F, -3.846F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(106, 12).addBox(-0.45F, -0.3457F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.45F, 1.4511F, -3.9845F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(106, 9).addBox(-0.45F, -0.3457F, -0.2562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(106, 6).addBox(-0.45F, -0.3457F, -0.3562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.45F, 1.8467F, -3.9254F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(106, 3).addBox(-0.45F, -0.3457F, -0.0562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(94, 105).addBox(-0.45F, -0.3457F, -0.3562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.45F, 2.4301F, -3.7853F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(101, 29).addBox(-0.45F, -0.6457F, -0.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.45F, 2.1767F, -3.6081F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5243F, -0.2845F, -0.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2082F, 1.2504F, -3.0207F, 0.6651F, 0.1554F, 0.1025F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(101, 23).addBox(-0.525F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2834F, 1.3727F, -3.4314F, 1.0483F, 0.032F, 0.0218F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(83, 27).addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1724F, 0.3234F, -2.0689F, 0.5861F, 0.2304F, 0.2219F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(106, 59).addBox(-0.425F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4783F, -0.3297F, -1.1467F, -0.9719F, 0.3295F, 0.1215F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(51, 97).addBox(-0.4294F, -0.8825F, -0.7695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6006F, -0.1494F, -0.5094F, -0.2738F, 0.3295F, 0.1215F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(82, 75).addBox(-0.5551F, -0.4672F, -0.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.144F, 0.8153F, -1.8999F, 0.327F, 0.3072F, 0.1723F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(56, 97).addBox(-0.5F, -1.45F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5628F, -0.5044F, -1.0906F, -2.9588F, 0.7402F, 1.5637F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 97).addBox(-0.775F, -1.7904F, -0.7553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3F, -1.0409F, -1.2569F, 2.4745F, 0.5199F, 0.3743F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(91, 69).addBox(-1.0F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F))
				.texOffs(91, 66).addBox(-1.0F, -0.5F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5626F, -0.8869F, -0.7079F, -2.7078F, 0.0934F, -0.1476F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(66, 97).addBox(-0.5F, -1.0464F, -0.6174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.3921F, -0.6045F, -0.8229F, -2.6205F, 0.0934F, -0.0167F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(61, 97).addBox(-0.5F, -0.9965F, -0.3738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3921F, -0.6045F, -0.8229F, -2.9696F, 0.0934F, -0.0167F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(68, 53).addBox(-1.8F, -0.2654F, -0.2303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3F, -1.3128F, -0.0756F, -1.7427F, -0.0302F, -0.1719F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(5, 105).addBox(-0.8F, -0.8154F, -0.2303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3F, -1.3263F, -0.0967F, -2.1054F, -0.6734F, 0.0452F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(101, 20).addBox(-0.55F, -0.4198F, -1.1648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, -0.1019F, 0.5362F, -1.5708F, -0.3054F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(101, 12).addBox(-0.55F, -0.0908F, -1.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7F, -0.1019F, 0.5362F, -1.309F, -0.3054F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(101, 9).addBox(-0.55F, -0.8472F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.7F, -0.1019F, 0.5362F, -1.0472F, -0.3054F, 0.0F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(101, 6).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1192F, 1.4237F, -3.5093F, -0.1846F, 0.0297F, 0.0696F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5152F, -0.3806F, -0.5089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.1398F, 1.5655F, -3.5294F, -0.0774F, 0.0425F, 0.1383F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(106, 21).addBox(-0.5F, -0.3571F, -0.489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F))
				.texOffs(100, 95).addBox(-0.5F, -0.6571F, -0.464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)), PartPose.offsetAndRotation(0.978F, -0.3776F, 0.2816F, 0.2111F, -0.1912F, -0.0889F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(31, 100).addBox(-0.5F, -0.752F, -0.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.978F, -0.3776F, 0.2816F, 0.9529F, -0.1912F, -0.0889F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(106, 29).addBox(-0.5F, -0.2082F, -0.6578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.978F, -0.3776F, 0.2816F, 0.8656F, -0.1912F, -0.0889F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(25, 106).addBox(-0.5F, -0.3678F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(23, 100).addBox(-0.5F, -0.6678F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.978F, -0.3776F, 0.2816F, 0.342F, -0.1912F, -0.0889F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(106, 50).addBox(-0.3902F, -0.389F, -0.4592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(106, 47).addBox(-0.5152F, -0.389F, -0.4592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8774F, -0.3365F, -0.6946F, 1.9319F, 0.2275F, 0.1643F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(106, 44).addBox(-0.5402F, -0.2021F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(106, 41).addBox(-0.5402F, -0.4021F, -0.2159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(106, 41).addBox(-0.5402F, -0.2021F, -0.2159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.8774F, -0.3365F, -0.6946F, 1.7573F, 0.2275F, 0.1643F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(106, 38).addBox(-0.5402F, -0.6907F, -0.4186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(106, 35).addBox(-0.5402F, -0.6907F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8774F, -0.3365F, -0.6946F, 1.1465F, 0.2275F, 0.1643F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(54, 89).addBox(-0.4402F, -0.2019F, -1.0882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.8774F, -0.3365F, -0.6946F, 0.3262F, 0.2275F, 0.1643F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.1637F, -0.6406F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(101, 104).mirror().addBox(-0.55F, -0.8314F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1019F, 0.5362F, -0.6196F, 0.3054F, 0.0F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.4642F, -1.1597F, -0.4991F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.854F, -0.0707F, 0.6502F, 0.3901F, 0.3193F, 0.276F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-0.5F, -0.325F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3417F, -1.0649F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(46, 97).mirror().addBox(-0.7244F, -1.0949F, -0.5835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.6006F, -0.1494F, -0.5094F, 1.757F, -0.2602F, -0.1129F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(-0.1412F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.3588F, -0.557F, -1.9656F, 0.77F, -0.1275F, -0.1195F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(106, 32).mirror().addBox(-0.35F, -0.7706F, -0.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.083F, -0.2397F, 0.153F, 1.2909F, -0.0778F, -0.0724F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.55F, -0.8705F, -0.7142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1019F, 0.5362F, 1.2915F, 0.3054F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(36, 97).mirror().addBox(-0.4642F, -1.3016F, -0.7896F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.904F, -0.0707F, 0.6502F, 0.7156F, 0.1134F, 0.0F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(89, 104).mirror().addBox(-0.5F, -0.6875F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.8826F, 0.481F, 0.9609F, 1.2828F, -0.0175F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(41, 101).mirror().addBox(-0.5F, -0.3125F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.8826F, 0.481F, 0.9609F, 1.1519F, -0.0175F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-0.475F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(47, 86).mirror().addBox(-0.475F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.3416F, 2.2792F, -3.2909F, 0.7351F, -0.1658F, -0.103F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-0.625F, -0.475F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.2847F, 1.5447F, -2.6208F, 0.7115F, -0.2352F, -0.1573F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(33, 83).mirror().addBox(-0.5385F, -0.2207F, -0.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.144F, 0.8153F, -1.8999F, 0.3538F, -0.336F, -0.2048F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(20, 106).mirror().addBox(-0.5034F, -0.7219F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(101, 38).mirror().addBox(-0.5034F, -0.7219F, -0.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2082F, 1.2504F, -3.0207F, 0.7619F, -0.2206F, -0.1482F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(76, 105).mirror().addBox(-0.325F, -0.3634F, -0.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(71, 105).mirror().addBox(-0.325F, -0.3634F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7469F, -3.3778F, -0.0121F, -0.0691F, -0.14F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-0.325F, -0.1655F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7469F, -3.3778F, 0.6424F, -0.0691F, -0.14F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(106, 18).mirror().addBox(-0.325F, -0.1713F, -1.0034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(36, 101).mirror().addBox(-0.325F, -0.1713F, -0.7784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7469F, -3.3778F, 0.734F, -0.0691F, -0.14F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-0.325F, -0.3075F, -0.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0456F, 1.4816F, -3.8491F, 1.6175F, -0.0006F, -0.1402F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-0.325F, -0.7749F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(101, 32).mirror().addBox(-0.325F, -0.7749F, -0.9756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7469F, -3.3778F, 1.7114F, -0.0691F, -0.14F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-0.55F, -0.3457F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.45F, 1.185F, -3.846F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(-0.55F, -0.3457F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.45F, 1.4511F, -3.9845F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-0.55F, -0.3457F, -0.2562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(106, 6).mirror().addBox(-0.55F, -0.3457F, -0.3562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.45F, 1.8467F, -3.9254F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(106, 3).mirror().addBox(-0.55F, -0.3457F, -0.0562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(94, 105).mirror().addBox(-0.55F, -0.3457F, -0.3562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.45F, 2.4301F, -3.7853F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.55F, -0.6457F, -0.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.45F, 2.1767F, -3.6081F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-0.4757F, -0.2845F, -0.6607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2082F, 1.2504F, -3.0207F, 0.6651F, -0.1554F, -0.1025F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2834F, 1.3727F, -3.4314F, 1.0483F, -0.032F, -0.0218F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1724F, 0.3234F, -2.0689F, 0.5861F, -0.2304F, -0.2219F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(106, 59).mirror().addBox(-0.575F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4783F, -0.3297F, -1.1467F, -0.9719F, -0.3295F, -0.1215F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(51, 97).mirror().addBox(-0.5706F, -0.8825F, -0.7695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6006F, -0.1494F, -0.5094F, -0.2738F, -0.3295F, -0.1215F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.4449F, -0.4672F, -0.7163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.144F, 0.8153F, -1.8999F, 0.327F, -0.3072F, -0.1723F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(-0.5F, -1.45F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5628F, -0.5044F, -1.0906F, -2.9588F, -0.7402F, -1.5637F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(41, 97).mirror().addBox(-0.225F, -1.7904F, -0.7553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.0409F, -1.2569F, 2.4745F, -0.5199F, -0.3743F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-1.0F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false)
				.texOffs(91, 66).mirror().addBox(-1.0F, -0.5F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5626F, -0.8869F, -0.7079F, -2.7078F, -0.0934F, 0.1476F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(66, 97).mirror().addBox(-0.5F, -1.0464F, -0.6174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.3921F, -0.6045F, -0.8229F, -2.6205F, -0.0934F, 0.0167F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(61, 97).mirror().addBox(-0.5F, -0.9965F, -0.3738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3921F, -0.6045F, -0.8229F, -2.9696F, -0.0934F, 0.0167F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-0.2F, -0.2654F, -0.2303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.3128F, -0.0756F, -1.7427F, 0.0302F, 0.1719F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-0.2F, -0.8154F, -0.2303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.3263F, -0.0967F, -2.1054F, 0.6734F, -0.0452F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(101, 20).mirror().addBox(-0.45F, -0.4198F, -1.1648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1019F, 0.5362F, -1.5708F, 0.3054F, 0.0F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-0.45F, -0.0908F, -1.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1019F, 0.5362F, -1.309F, 0.3054F, 0.0F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(-0.45F, -0.8472F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1019F, 0.5362F, -1.0472F, 0.3054F, 0.0F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.1192F, 1.4237F, -3.5093F, -0.1846F, -0.0297F, -0.0696F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(-0.4848F, -0.3806F, -0.5089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(0.1398F, 1.5655F, -3.5294F, -0.0774F, -0.0425F, -0.1383F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(-0.5F, -0.3571F, -0.489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F)).mirror(false)
				.texOffs(100, 95).mirror().addBox(-0.5F, -0.6571F, -0.464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(-0.978F, -0.3776F, 0.2816F, 0.2111F, 0.1912F, 0.0889F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(31, 100).mirror().addBox(-0.5F, -0.752F, -0.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.978F, -0.3776F, 0.2816F, 0.9529F, 0.1912F, 0.0889F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-0.5F, -0.2082F, -0.6578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.978F, -0.3776F, 0.2816F, 0.8656F, 0.1912F, 0.0889F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(25, 106).mirror().addBox(-0.5F, -0.3678F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(23, 100).mirror().addBox(-0.5F, -0.6678F, -0.5497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.978F, -0.3776F, 0.2816F, 0.342F, 0.1912F, 0.0889F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(106, 50).mirror().addBox(-0.6098F, -0.389F, -0.4592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(106, 47).mirror().addBox(-0.4848F, -0.389F, -0.4592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8774F, -0.3365F, -0.6946F, 1.9319F, -0.2275F, -0.1643F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(106, 44).mirror().addBox(-0.4598F, -0.2021F, -0.5159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(106, 41).mirror().addBox(-0.4598F, -0.4021F, -0.2159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(106, 41).mirror().addBox(-0.4598F, -0.2021F, -0.2159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.8774F, -0.3365F, -0.6946F, 1.7573F, -0.2275F, -0.1643F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(106, 38).mirror().addBox(-0.4598F, -0.6907F, -0.4186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(106, 35).mirror().addBox(-0.4598F, -0.6907F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8774F, -0.3365F, -0.6946F, 1.1465F, -0.2275F, -0.1643F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(54, 89).mirror().addBox(-0.5598F, -0.2019F, -1.0882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.8774F, -0.3365F, -0.6946F, 0.3262F, -0.2275F, -0.1643F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3576F, 0.4906F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(85, 24).addBox(-0.5547F, -0.3226F, -0.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(0.0548F, 1.7054F, -3.9925F, 1.1295F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(106, 68).addBox(-0.5547F, -0.4475F, -0.3753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0548F, 1.7054F, -3.9925F, -0.1969F, 0.0F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(61, 101).addBox(-0.5547F, -0.4416F, -0.6796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0548F, 1.7054F, -3.9925F, -0.5111F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-0.2893F, -0.6625F, -3.1262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.5885F, -0.3502F, -0.1356F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.2893F, -1.3951F, -2.3425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.8241F, -0.3502F, -0.1356F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-0.2417F, -0.6507F, -1.7933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.3549F, -0.319F, -0.1116F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(-0.2893F, -1.0386F, -2.0783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.6234F, -0.3502F, -0.1356F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.2893F, -0.9441F, -3.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.6583F, -0.3502F, -0.1356F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(56, 101).mirror().addBox(-0.2417F, -0.6882F, -1.8289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.4771F, -0.319F, -0.1116F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.2461F, -0.6674F, -1.4549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.5678F, -0.3137F, -0.1448F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-0.3F, -1.5607F, -1.9673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.6632F, -0.0436F, 0.0F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(51, 101).mirror().addBox(-0.3F, -1.5063F, -1.6474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.6196F, -0.0436F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-0.3F, -0.1936F, -1.8903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, -0.2618F, -0.0436F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(101, 50).mirror().addBox(-0.3F, -0.4728F, -1.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.0175F, -0.0436F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(101, 47).mirror().addBox(-0.3F, -0.1452F, -0.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, -0.4974F, -0.0436F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(46, 101).mirror().addBox(-0.2419F, -0.3224F, -1.7619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.3584F, -0.3137F, -0.1448F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-0.2461F, -0.2261F, -1.365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.2711F, -0.3137F, -0.1448F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.1442F, 0.3091F, -1.1653F, 0.1745F, -0.0436F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-0.3F, -0.087F, -2.1947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.1047F, -0.0436F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-0.2461F, -0.4872F, -1.5039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 0.4868F, -1.8924F, 0.3147F, -0.3137F, -0.1448F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(101, 44).mirror().addBox(-0.3F, -0.4F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(101, 41).mirror().addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.5934F, -0.0436F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.3F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.0868F, 0.1076F, 0.2269F, -0.0436F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(84, 59).addBox(-0.7107F, -0.6625F, -3.1262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.5885F, 0.3502F, 0.1356F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(101, 59).addBox(-0.7107F, -1.3951F, -2.3425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.8241F, 0.3502F, 0.1356F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(84, 55).addBox(-0.7583F, -0.6507F, -1.7933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.3549F, 0.319F, 0.1116F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(101, 56).addBox(-0.7107F, -1.0386F, -2.0783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.6234F, 0.3502F, 0.1356F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(84, 51).addBox(-0.7107F, -0.9441F, -3.1241F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.6583F, 0.3502F, 0.1356F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(56, 101).addBox(-0.7583F, -0.6882F, -1.8289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.4771F, 0.319F, 0.1116F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(84, 47).addBox(-0.7539F, -0.6674F, -1.4549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.5678F, 0.3137F, 0.1448F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(101, 53).addBox(-0.7F, -1.5607F, -1.9673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.6632F, 0.0436F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(51, 101).addBox(-0.7F, -1.5063F, -1.6474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.6196F, 0.0436F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(84, 43).addBox(-0.7F, -0.1936F, -1.8903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, -0.2618F, 0.0436F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(101, 50).addBox(-0.7F, -0.4728F, -1.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.0175F, 0.0436F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(101, 47).addBox(-0.7F, -0.1452F, -0.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, -0.4974F, 0.0436F, 0.0F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(46, 101).addBox(-0.7581F, -0.3224F, -1.7619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.3584F, 0.3137F, 0.1448F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(84, 39).addBox(-0.7539F, -0.2261F, -1.365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.2711F, 0.3137F, 0.1448F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(84, 35).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.1442F, 0.3091F, -1.1653F, 0.1745F, 0.0436F, 0.0F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(84, 31).addBox(-0.7F, -0.087F, -2.1947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.1047F, 0.0436F, 0.0F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(21, 84).addBox(-0.7539F, -0.4872F, -1.5039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.325F, 0.4868F, -1.8924F, 0.3147F, 0.3137F, 0.1448F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(101, 44).addBox(-0.7F, -0.4F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(101, 41).addBox(-0.7F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.5934F, 0.0436F, 0.0F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(0, 84).addBox(-0.7F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4F, 0.0868F, 0.1076F, 0.2269F, 0.0436F, 0.0F));

		PartDefinition frontleftleg2 = upperbody.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5884F, 6.6516F, -2.4877F, 0.2214F, -0.0552F, -0.1188F));

		PartDefinition cube_r478 = frontleftleg2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(68, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 6.8855F, 0.3488F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r479 = frontleftleg2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(47, 72).addBox(-1.0F, -2.4F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 2.8275F, 0.2109F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r480 = frontleftleg2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -3.5F, 0.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2991F, -1.0074F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r481 = frontleftleg2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(14, 72).addBox(-1.0F, -0.0367F, 0.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3009F, 0.6926F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r482 = frontleftleg2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(77, 32).addBox(0.0F, -1.8842F, -0.022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7117F, -1.1817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r483 = frontleftleg2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(19, 77).addBox(0.0F, 1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -0.1009F, -0.4074F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2756F, 7.9757F, 1.3448F, -0.3986F, 0.07F, 0.1047F));

		PartDefinition cube_r484 = frontleftleg3.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(44, 59).addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3351F, 3.3441F, -0.7153F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r485 = frontleftleg3.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, -2.8F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3351F, 3.3441F, -0.7153F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r486 = frontleftleg3.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(87, 87).addBox(0.4996F, -2.6815F, -0.2927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 2.6428F, 0.4536F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r487 = frontleftleg3.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(54, 72).addBox(0.4803F, -0.49F, -2.052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8049F, -0.4152F, 1.0647F, 0.4382F, 0.0204F, 0.0057F));

		PartDefinition cube_r488 = frontleftleg3.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(78, 17).addBox(-1.0F, -1.7F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3407F, 1.1317F, 0.6919F, -0.1464F, 0.0204F, 0.0057F));

		PartDefinition cube_r489 = frontleftleg3.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(40, 72).addBox(0.5016F, -0.9239F, -0.4773F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8348F, 2.6428F, 0.4536F, 0.0022F, 0.0234F, 0.0063F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0704F, 6.0949F, -0.6064F, 0.1102F, 0.1606F, 0.0032F));

		PartDefinition cube_r490 = frontleftleg4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(77, 37).addBox(-0.2F, -1.0F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9078F, 1.0265F, 0.5463F, -0.2618F, -0.4363F, 0.0F));

		PartDefinition cube_r491 = frontleftleg4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(104, 85).addBox(-1.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.082F, 1.0265F, 0.5463F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r492 = frontleftleg4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(21, 88).addBox(-0.8F, -1.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3179F, 1.6268F, -1.1068F, -1.0401F, 0.422F, 0.2359F));

		PartDefinition cube_r493 = frontleftleg4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(85, 91).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, 0.0463F, -1.0893F, -0.0774F, -0.0404F));

		PartDefinition cube_r494 = frontleftleg4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, -0.4537F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = upperbody.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5884F, 6.6516F, -2.4877F, -0.2149F, 0.0552F, 0.1188F));

		PartDefinition cube_r495 = frontrightleg2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(68, 66).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 6.8855F, 0.3488F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r496 = frontrightleg2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(5, 74).addBox(-1.0F, -2.4F, -0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 2.8275F, 0.2109F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r497 = frontrightleg2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(7, 60).addBox(-1.0F, -3.5F, 0.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.2991F, -1.0074F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r498 = frontrightleg2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(73, 10).addBox(-1.0F, -0.0367F, 0.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3009F, 0.6926F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r499 = frontrightleg2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(77, 60).addBox(-1.0F, -1.8842F, -0.022F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.7117F, -1.1817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r500 = frontrightleg2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(77, 47).addBox(-1.0F, 1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.1009F, -0.4074F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2756F, 7.9757F, 1.3448F, -0.7477F, 0.0609F, -0.1055F));

		PartDefinition cube_r501 = frontrightleg3.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(55, 59).addBox(-1.0F, -0.4F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3351F, 3.3441F, -0.7153F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r502 = frontrightleg3.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(54, 64).addBox(-1.0F, -2.8F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3351F, 3.3441F, -0.7153F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r503 = frontrightleg3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(61, 89).addBox(-2.4996F, -2.6815F, -0.2927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 2.6428F, 0.4536F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r504 = frontrightleg3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(75, 53).addBox(-2.4803F, -0.49F, -2.052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8049F, -0.4152F, 1.0647F, 0.4382F, -0.0204F, -0.0057F));

		PartDefinition cube_r505 = frontrightleg3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(78, 22).addBox(-1.0F, -1.7F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3407F, 1.1317F, 0.6919F, -0.1464F, -0.0204F, -0.0057F));

		PartDefinition cube_r506 = frontrightleg3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(28, 74).addBox(-2.5016F, -0.9239F, -0.4773F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8348F, 2.6428F, 0.4536F, 0.0022F, -0.0234F, -0.0063F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0704F, 6.0949F, -0.6064F, 0.8519F, -0.1606F, -0.0032F));

		PartDefinition cube_r507 = frontrightleg4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(77, 65).addBox(-0.8F, -1.0F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9078F, 1.0265F, 0.5463F, -0.2618F, 0.4363F, 0.0F));

		PartDefinition cube_r508 = frontrightleg4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(106, 56).addBox(0.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.082F, 1.0265F, 0.5463F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r509 = frontrightleg4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(75, 89).addBox(-1.2F, -1.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3179F, 1.6268F, -1.1068F, -1.0401F, -0.422F, -0.2359F));

		PartDefinition cube_r510 = frontrightleg4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, 0.0463F, -1.0893F, 0.0774F, 0.0404F));

		PartDefinition cube_r511 = frontrightleg4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(68, 89).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, -0.4537F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4882F, 3.4262F, -2.3171F, -0.6821F, 0.3387F, -0.9907F));

		PartDefinition cube_r512 = bone3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(14, 86).addBox(-0.5518F, -0.4392F, -1.7948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.8149F, -0.6439F, 5.6917F, 2.9776F, 0.6515F, -2.0215F));

		PartDefinition cube_r513 = bone3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(68, 71).addBox(-0.5278F, -0.4398F, -0.2599F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8149F, -0.6939F, 5.7417F, 2.8082F, 0.4847F, -2.0946F));

		PartDefinition cube_r514 = bone3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(69, 22).addBox(-0.6756F, -0.4398F, -0.2391F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8149F, -0.6939F, 5.7417F, 2.8002F, 0.5259F, -2.1111F));

		PartDefinition cube_r515 = bone3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(22, 54).addBox(-0.6692F, -0.4392F, -3.7866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8149F, -0.6439F, 5.6917F, 2.9667F, 0.7289F, -2.0386F));

		PartDefinition cube_r516 = bone3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(40, 86).addBox(-0.4169F, -0.5F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4823F, 0.734F, 3.7165F, 2.7586F, 0.1982F, -2.0248F));

		PartDefinition cube_r517 = bone3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5831F, -0.5F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4823F, 0.734F, 3.7165F, 2.7394F, 0.3595F, -2.0942F));

		PartDefinition cube_r518 = bone3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(80, 85).addBox(0.0F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3071F, 1.8808F, 1.1174F, 2.5276F, -0.3295F, -1.765F));

		PartDefinition cube_r519 = bone3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(66, 56).addBox(0.05F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2737F, 1.5701F, 2.6699F, 2.5638F, -0.0615F, -1.9491F));

		PartDefinition cube_r520 = bone3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(80, 0).addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2737F, 1.5701F, 2.6699F, 2.565F, 0.0116F, -1.9968F));

		PartDefinition cube_r521 = bone3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(51, 18).addBox(-0.0521F, -0.162F, -0.4754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2F, 2.0F, -1.05F, 2.1522F, -0.8602F, -1.1327F));

		PartDefinition cube_r522 = bone3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(73, 14).addBox(-1.3F, -0.1256F, -2.4263F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.05F, 1.3931F, -0.9838F, -0.206F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4882F, 3.4262F, -2.3171F, -0.6821F, -0.3387F, 0.9907F));

		PartDefinition cube_r523 = bone4.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(-0.4482F, -0.4392F, -1.7948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.8149F, -0.6439F, 5.6917F, 2.9776F, -0.6515F, 2.0215F));

		PartDefinition cube_r524 = bone4.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(68, 71).mirror().addBox(-0.4722F, -0.4398F, -0.2599F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8149F, -0.6939F, 5.7417F, 2.8082F, -0.4847F, 2.0946F));

		PartDefinition cube_r525 = bone4.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-0.3244F, -0.4398F, -0.2391F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8149F, -0.6939F, 5.7417F, 2.8002F, -0.5259F, 2.1111F));

		PartDefinition cube_r526 = bone4.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(22, 54).mirror().addBox(-0.3308F, -0.4392F, -3.7866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8149F, -0.6439F, 5.6917F, 2.9667F, -0.7289F, 2.0386F));

		PartDefinition cube_r527 = bone4.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.5831F, -0.5F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4823F, 0.734F, 3.7165F, 2.7586F, -0.1982F, 2.0248F));

		PartDefinition cube_r528 = bone4.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(7, 86).mirror().addBox(-0.4169F, -0.5F, -0.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4823F, 0.734F, 3.7165F, 2.7394F, -0.3595F, 2.0942F));

		PartDefinition cube_r529 = bone4.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-1.0F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3071F, 1.8808F, 1.1174F, 2.5276F, 0.3295F, 1.765F));

		PartDefinition cube_r530 = bone4.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(66, 56).mirror().addBox(-1.05F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2737F, 1.5701F, 2.6699F, 2.5638F, 0.0615F, 1.9491F));

		PartDefinition cube_r531 = bone4.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2737F, 1.5701F, 2.6699F, 2.565F, -0.0116F, 1.9968F));

		PartDefinition cube_r532 = bone4.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-1.9479F, -0.162F, -0.4754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0F, -1.05F, 2.1522F, 0.8602F, 1.1327F));

		PartDefinition cube_r533 = bone4.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-1.7F, -0.1256F, -2.4263F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.05F, 1.3931F, 0.9838F, 0.206F));

		PartDefinition leftPlate4 = upperbody.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8194F, -2.7353F, -0.2477F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition cube_r534 = leftPlate4.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(95, 95).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)), PartPose.offsetAndRotation(0.1549F, -1.3886F, 0.8407F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r535 = leftPlate4.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(90, 95).addBox(-0.5F, -0.4F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.1549F, -1.3886F, 0.8407F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftPlate4.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(85, 16).addBox(-0.5F, 0.375F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.1549F, -1.3886F, 0.8407F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r537 = leftPlate4.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(102, 15).addBox(-0.5F, -0.325F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F))
				.texOffs(8, 102).addBox(-0.5F, 0.25F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(0.1549F, -1.909F, 0.4946F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r538 = leftPlate4.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -0.4357F, -1.0039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -1.1053F, 1.0098F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftPlate4.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(94, 87).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.1549F, 0.0508F, 0.3771F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r540 = leftPlate4.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(84, 71).addBox(-0.5F, 1.6134F, -0.2349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -2.6492F, -0.5241F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftPlate4.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.1549F, -0.6753F, -0.1605F, -0.5585F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = upperbody.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8194F, -2.7353F, -0.2477F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition cube_r542 = rightPlate4.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.5F, -0.325F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3886F, 0.8407F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r543 = rightPlate4.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-0.5F, -0.4F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3886F, 0.8407F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r544 = rightPlate4.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(-0.5F, 0.375F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3886F, 0.8407F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r545 = rightPlate4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(102, 15).mirror().addBox(-0.5F, -0.325F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false)
				.texOffs(8, 102).mirror().addBox(-0.5F, 0.25F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.909F, 0.4946F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r546 = rightPlate4.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -0.4357F, -1.0039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.1053F, 1.0098F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r547 = rightPlate4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(94, 87).mirror().addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.0508F, 0.3771F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r548 = rightPlate4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-0.5F, 1.6134F, -0.2349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -2.6492F, -0.5241F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r549 = rightPlate4.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6753F, -0.1605F, -0.5585F, 0.0F, 0.0F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 3.7164F, -6.4176F));

		PartDefinition cube_r550 = bone2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(28, 39).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1829F, 2.7451F, 2.3632F, 1.268F, 0.3734F, 0.3951F));

		PartDefinition cube_r551 = bone2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(14, 60).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1621F, 1.2134F, 3.1651F, 0.3779F, 0.3734F, 0.3951F));

		PartDefinition cube_r552 = bone2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(64, 6).addBox(2.0F, -0.4256F, -2.9263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.6F, 4.7F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r553 = bone2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(75, 76).addBox(2.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, 6.1F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r554 = bone2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(76, 27).addBox(2.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition bone5 = upperbody.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 3.7164F, -6.4176F));

		PartDefinition cube_r555 = bone5.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(28, 39).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1829F, 2.7451F, 2.3632F, 1.268F, -0.3734F, -0.3951F));

		PartDefinition cube_r556 = bone5.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1621F, 1.2134F, 3.1651F, 0.3779F, -0.3734F, -0.3951F));

		PartDefinition cube_r557 = bone5.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-3.0F, -0.4256F, -2.9263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6F, 4.7F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r558 = bone5.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-3.0F, -0.0549F, -2.0769F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1F, 6.1F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r559 = bone5.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-3.0F, -1.0F, 6.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = body3.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9677F, -2.1115F, -2.2723F, 0.3826F, 0.0762F, 0.2206F));

		PartDefinition cube_r560 = leftPlate7.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(96, 99).addBox(-0.5F, -0.8857F, -1.6289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r561 = leftPlate7.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(63, 93).addBox(-0.5F, 0.3F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -1.8268F, 1.3065F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r562 = leftPlate7.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(58, 93).addBox(-0.5F, -1.35F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -1.2106F, 1.4097F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r563 = leftPlate7.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(53, 93).addBox(-0.5F, -1.7902F, -0.6691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.0739F, 0.0943F, 0.5046F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r564 = leftPlate7.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(76, 102).addBox(-0.5F, -0.625F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.184F)), PartPose.offsetAndRotation(-0.0739F, 0.043F, 0.6377F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r565 = leftPlate7.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(48, 93).addBox(-0.5F, -1.1603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.4996F, 0.0457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r566 = leftPlate7.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(91, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.0739F, -2.2766F, 1.429F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r567 = leftPlate7.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(99, 87).addBox(-0.5F, 0.3446F, 0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -3.3698F, 1.3314F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r568 = leftPlate7.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(71, 102).addBox(-0.5F, -0.4365F, -0.105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(106, 65).addBox(-0.5F, -0.1365F, -0.105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightPlate7 = body3.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9677F, -2.1115F, -2.2723F, 0.3826F, -0.0762F, -0.2206F));

		PartDefinition cube_r569 = rightPlate7.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-0.5F, -0.8857F, -1.6289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2057F, 2.2046F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r570 = rightPlate7.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(63, 93).mirror().addBox(-0.5F, 0.3F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.8268F, 1.3065F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r571 = rightPlate7.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(58, 93).mirror().addBox(-0.5F, -1.35F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2106F, 1.4097F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r572 = rightPlate7.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-0.5F, -1.7902F, -0.6691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.0943F, 0.5046F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r573 = rightPlate7.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-0.5F, -0.625F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.184F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.043F, 0.6377F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r574 = rightPlate7.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(48, 93).mirror().addBox(-0.5F, -1.1603F, -0.2117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4996F, 0.0457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r575 = rightPlate7.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2766F, 1.429F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r576 = rightPlate7.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-0.5F, 0.3446F, 0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -3.3698F, 1.3314F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r577 = rightPlate7.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(-0.5F, -0.4365F, -0.105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(106, 65).mirror().addBox(-0.5F, -0.1365F, -0.105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.0698F, 0.4314F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = body2.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3296F, -2.6263F, -5.6124F, 0.3157F, 0.1095F, 0.2063F));

		PartDefinition cube_r578 = leftPlate8.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(96, 8).addBox(-0.5F, -1.6857F, -1.3289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -0.2057F, 1.7045F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r579 = leftPlate8.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(96, 4).addBox(-0.5F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, -0.0399F, 0.6584F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r580 = leftPlate8.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(68, 93).addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.0739F, -2.1392F, 1.7256F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r581 = leftPlate8.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(10, 98).addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -0.4246F, 0.1755F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = body2.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3296F, -2.6263F, -5.6124F, 0.3157F, -0.1095F, -0.2063F));

		PartDefinition cube_r582 = rightPlate8.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-0.5F, -1.6857F, -1.3289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.2057F, 1.7045F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r583 = rightPlate8.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-0.5F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.0399F, 0.6584F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r584 = rightPlate8.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-0.5F, -0.075F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.1392F, 1.7256F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r585 = rightPlate8.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.5F, -0.925F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.4246F, 0.1755F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = body2.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6513F, -3.1211F, -1.7411F, 0.0992F, 0.1354F, 0.1905F));

		PartDefinition cube_r586 = leftPlate5.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(96, 29).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.0739F, -0.9971F, 0.9994F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r587 = leftPlate5.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(23, 96).addBox(-0.5F, 0.25F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r588 = leftPlate5.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(103, 26).addBox(-0.5F, -0.625F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0739F, 0.5539F, 0.3988F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r589 = leftPlate5.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(23, 103).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.0739F, 0.1772F, 0.7506F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r590 = leftPlate5.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(18, 103).addBox(-0.5F, -0.9F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.0399F, 0.6584F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r591 = leftPlate5.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(28, 103).addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.176F))
				.texOffs(96, 102).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.798F, -0.164F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r592 = leftPlate5.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(102, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.0739F, 0.5056F, -0.5383F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r593 = leftPlate5.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(18, 96).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0739F, -0.0192F, -0.1254F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r594 = leftPlate5.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(96, 12).addBox(-0.5F, 0.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0739F, -2.2892F, 1.8256F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r595 = leftPlate5.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(102, 82).addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.0739F, -0.8018F, -0.1184F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = body2.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6513F, -3.1211F, -1.7411F, 0.0992F, -0.1354F, -0.1905F));

		PartDefinition cube_r596 = rightPlate5.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.9971F, 0.9994F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r597 = rightPlate5.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-0.5F, 0.25F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -1.2612F, 1.1062F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r598 = rightPlate5.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-0.5F, -0.625F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.5539F, 0.3988F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r599 = rightPlate5.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(23, 103).mirror().addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.1772F, 0.7506F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r600 = rightPlate5.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(18, 103).mirror().addBox(-0.5F, -0.9F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.0399F, 0.6584F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r601 = rightPlate5.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(28, 103).mirror().addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.176F)).mirror(false)
				.texOffs(96, 102).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.798F, -0.164F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r602 = rightPlate5.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(102, 90).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.0739F, 0.5056F, -0.5383F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r603 = rightPlate5.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(18, 96).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.0192F, -0.1254F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r604 = rightPlate5.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(96, 12).mirror().addBox(-0.5F, 0.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -2.2892F, 1.8256F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r605 = rightPlate5.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0739F, -0.8018F, -0.1184F, -0.6632F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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