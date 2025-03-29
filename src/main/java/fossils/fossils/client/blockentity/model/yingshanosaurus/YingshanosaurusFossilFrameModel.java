package fossils.fossils.client.blockentity.model.yingshanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YingshanosaurusFossilFrameModel extends SkullModelBase {
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

	public YingshanosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -19.8F, 6.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-3.2F, -1.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -14.5F, -12.6F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(4.0F, -2.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.5F, -12.6F, 0.3403F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.0F, 6.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9F, -5.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.9706F, 0.6276F, -0.3927F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 10.1238F, 0.2346F, 0.4451F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0119F, 7.4271F, 0.1844F, -0.0426F, -0.0084F, -0.0044F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5237F, 1.3722F, -0.0022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.9706F, 0.6276F, -0.2182F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 10.1238F, 0.2346F, 0.4887F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0119F, 7.4271F, 0.1844F, -0.2607F, 0.0084F, 0.0044F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5237F, 1.3722F, -0.0022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = hips.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3333F, -3.9803F, -4.8359F, 0.0326F, -0.0355F, 0.1711F));

		PartDefinition rightPlate11 = hips.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3333F, -3.9803F, -4.8359F, 0.0326F, 0.0355F, -0.1711F));

		PartDefinition leftPlate12 = hips.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2144F, -4.1469F, -0.7415F, 0.1373F, -0.0355F, 0.1711F));

		PartDefinition rightPlate12 = hips.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2144F, -4.1469F, -0.7415F, 0.1373F, 0.0355F, -0.1711F));

		PartDefinition leftPlate13 = hips.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0595F, -4.1362F, 3.5F, 0.05F, -0.0355F, 0.1711F));

		PartDefinition rightPlate13 = hips.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0595F, -4.1362F, 3.5F, 0.05F, 0.0355F, -0.1711F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.1F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 22).addBox(-1.0F, 0.5426F, 0.0022F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, 0.5327F, 0.0582F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.0F, -9.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4544F, -2.5551F, -7.5281F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition rightPlate9 = body.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4544F, -2.5551F, -7.5281F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition leftPlate10 = body.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4623F, -3.372F, -3.8324F, 0.242F, -0.0355F, 0.1711F));

		PartDefinition rightPlate10 = body.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4623F, -3.372F, -3.8324F, 0.242F, 0.0355F, -0.1711F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -9.7F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, -1).addBox(-1.0F, -0.4F, -0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.9F, -7.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.85F, 6.7808F, -3.7984F, -0.0404F, -0.0552F, -0.1188F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1143F, 5.6151F, 0.1147F, -0.9222F, 0.07F, 0.1047F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0618F, 5.4986F, -0.6715F, 0.807F, -0.0562F, -0.0206F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.85F, 6.7808F, -3.7984F, 0.7887F, 0.0552F, 0.1188F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1143F, 5.6151F, 0.1147F, -1.1404F, -0.07F, -0.1047F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0618F, 5.4986F, -0.6715F, 0.3271F, 0.0562F, 0.0206F));

		PartDefinition parascapularSpine = chest.addOrReplaceChild("parascapularSpine", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1991F, 1.8906F, -1.1343F, -0.7538F, 0.6778F, -1.4074F));

		PartDefinition parascapularSpine2 = chest.addOrReplaceChild("parascapularSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1991F, 1.8906F, -1.1343F, -0.7538F, -0.6778F, 1.4074F));

		PartDefinition leftPlate2 = chest.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7554F, -0.2502F, -7.3927F, 0.3128F, 0.0762F, 0.2206F));

		PartDefinition rightPlate2 = chest.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7554F, -0.2502F, -7.3927F, 0.3128F, -0.0762F, -0.2206F));

		PartDefinition leftPlate3 = chest.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2674F, -1.4948F, -4.4153F, 0.5397F, 0.0762F, 0.2206F));

		PartDefinition rightPlate3 = chest.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2674F, -1.4948F, -4.4153F, 0.5397F, -0.0762F, -0.2206F));

		PartDefinition leftPlate8 = chest.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3096F, -2.9139F, -1.4757F, 0.5396F, -0.0736F, 0.131F));

		PartDefinition rightPlate8 = chest.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3096F, -2.9139F, -1.4757F, 0.5396F, 0.0736F, -0.131F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5F, -7.5F, -0.0436F, 0.2182F, 0.0F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 52).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftPlate24 = neck4.addOrReplaceChild("leftPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4472F, -2.2999F, -2.5402F, 0.051F, 0.0762F, 0.2206F));

		PartDefinition rightPlate24 = neck4.addOrReplaceChild("rightPlate24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4472F, -2.2999F, -2.5402F, 0.051F, -0.0762F, -0.2206F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.8F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 52).addBox(-1.0F, -0.4F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 50).addBox(-1.0F, -0.4F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = neck3.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2768F, -2.7121F, -1.2398F, -0.2108F, 0.0762F, 0.2206F));

		PartDefinition rightPlate4 = neck3.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2768F, -2.7121F, -1.2398F, -0.2108F, -0.0762F, -0.2206F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, 0.1308F, 0.1716F, 0.0453F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 46).addBox(-1.0F, 0.6F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.2F, -3.3F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = neck2.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2694F, -2.4364F, -0.3247F, -0.3329F, 0.0762F, 0.2206F));

		PartDefinition rightPlate5 = neck2.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2694F, -2.4364F, -0.3247F, -0.3329F, -0.0762F, -0.2206F));

		PartDefinition leftPlate6 = neck2.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2254F, -2.8219F, -1.9919F, -0.3329F, 0.0762F, 0.2206F));

		PartDefinition rightPlate6 = neck2.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2254F, -2.8219F, -1.9919F, -0.3329F, -0.0762F, -0.2206F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -3.4F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 59).addBox(-0.5F, 0.6F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = neck.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.5075F, -0.259F, -0.2457F, 0.0762F, 0.2206F));

		PartDefinition rightPlate7 = neck.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.5075F, -0.259F, -0.2457F, -0.0762F, -0.2206F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, 0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 35).addBox(-0.5F, 0.1F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, 0.1186F, -0.3039F, -0.028F));

		PartDefinition leftPlate14 = tail.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8772F, -4.2346F, 3.4096F, -0.0373F, -0.0355F, 0.1711F));

		PartDefinition rightPlate14 = tail.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8772F, -4.2346F, 3.4096F, -0.0373F, 0.0355F, -0.1711F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.0893F, -0.3051F, -0.008F));

		PartDefinition leftPlate15 = tail2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6692F, -3.7191F, 0.8887F, 0.0326F, -0.0355F, 0.1711F));

		PartDefinition rightPlate15 = tail2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6692F, -3.7191F, 0.8887F, 0.0326F, 0.0355F, -0.1711F));

		PartDefinition leftPlate16 = tail2.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4519F, -3.277F, 4.7949F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition rightPlate16 = tail2.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4519F, -3.277F, 4.7949F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 10).addBox(-0.5F, 0.1F, -0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0148F, 5.9011F, 0.1227F, -0.39F, -0.0469F));

		PartDefinition leftPlate17 = tail3.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2076F, -2.6772F, 2.8635F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition rightPlate17 = tail3.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2076F, -2.6772F, 2.8635F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition leftPlate18 = tail3.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1602F, -2.0581F, 6.8402F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition rightPlate18 = tail3.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1602F, -2.0581F, 6.8402F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(16, 29).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.4512F, -0.2665F, -0.2625F));

		PartDefinition leftPlate19 = tail4.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1981F, -1.4076F, 2.1199F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition rightPlate19 = tail4.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1981F, -1.4076F, 2.1199F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition leftPlate20 = tail4.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2065F, -1.0093F, 5.6086F, -0.0547F, -0.0355F, 0.1711F));

		PartDefinition rightPlate20 = tail4.addOrReplaceChild("rightPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2065F, -1.0093F, 5.6086F, -0.0547F, 0.0355F, -0.1711F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1241F, -0.2467F, -0.1578F));

		PartDefinition lefttailSpike = tail5.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7955F, -0.3743F, 2.9945F, -0.0166F, -0.0263F, 0.8605F));

		PartDefinition righttailSpike3 = tail5.addOrReplaceChild("righttailSpike3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7955F, -0.3743F, 2.9945F, -0.0166F, 0.0263F, -0.8605F));

		PartDefinition lefttailSpike2 = tail5.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9752F, -0.7432F, 5.6585F, -0.2166F, -0.0267F, 0.9162F));

		PartDefinition righttailSpike2 = tail5.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9752F, -0.7432F, 5.6585F, -0.2166F, 0.0267F, -0.9162F));

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