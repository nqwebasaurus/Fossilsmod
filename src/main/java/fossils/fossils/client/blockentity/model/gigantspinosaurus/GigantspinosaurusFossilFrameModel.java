package fossils.fossils.client.blockentity.model.gigantspinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GigantspinosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart parascapularSpine;
	private final ModelPart parascapularSpine2;
	private final ModelPart neck4;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart tail;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate20;
	private final ModelPart tail2;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart tail3;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart tail4;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart tail5;
	private final ModelPart lefttailSpike2;
	private final ModelPart righttailSpike2;
	private final ModelPart lefttailSpike;
	private final ModelPart righttailSpike;

	public GigantspinosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftPlate12 = this.hips.getChild("leftPlate12");
		this.rightPlate12 = this.hips.getChild("rightPlate12");
		this.leftPlate11 = this.hips.getChild("leftPlate11");
		this.rightPlate11 = this.hips.getChild("rightPlate11");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.leftPlate9 = this.body2.getChild("leftPlate9");
		this.rightPlate9 = this.body2.getChild("rightPlate9");
		this.chest = this.body2.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.leftPlate5 = this.chest.getChild("leftPlate5");
		this.rightPlate5 = this.chest.getChild("rightPlate5");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.parascapularSpine = this.chest.getChild("parascapularSpine");
		this.parascapularSpine2 = this.chest.getChild("parascapularSpine2");
		this.neck4 = this.chest.getChild("neck4");
		this.leftPlate3 = this.neck4.getChild("leftPlate3");
		this.rightPlate3 = this.neck4.getChild("rightPlate3");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.leftPlate4 = this.neck2.getChild("leftPlate4");
		this.rightPlate4 = this.neck2.getChild("rightPlate4");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.head.getChild("rightFace");
		this.bone4 = this.rightFace.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.leftPlate2 = this.neck5.getChild("leftPlate2");
		this.rightPlate2 = this.neck5.getChild("rightPlate2");
		this.leftPlate7 = this.neck.getChild("leftPlate7");
		this.rightPlate7 = this.neck.getChild("rightPlate7");
		this.leftPlate10 = this.body.getChild("leftPlate10");
		this.rightPlate10 = this.body.getChild("rightPlate10");
		this.leftPlate8 = this.body.getChild("leftPlate8");
		this.rightPlate8 = this.body.getChild("rightPlate8");
		this.leftPlate6 = this.body.getChild("leftPlate6");
		this.rightPlate6 = this.body.getChild("rightPlate6");
		this.tail = this.hips.getChild("tail");
		this.leftPlate14 = this.tail.getChild("leftPlate14");
		this.rightPlate14 = this.tail.getChild("rightPlate14");
		this.rightPlate13 = this.tail.getChild("rightPlate13");
		this.leftPlate20 = this.tail.getChild("leftPlate20");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate16 = this.tail2.getChild("leftPlate16");
		this.rightPlate16 = this.tail2.getChild("rightPlate16");
		this.leftPlate15 = this.tail2.getChild("leftPlate15");
		this.rightPlate15 = this.tail2.getChild("rightPlate15");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate17 = this.tail3.getChild("leftPlate17");
		this.rightPlate17 = this.tail3.getChild("rightPlate17");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate19 = this.tail4.getChild("leftPlate19");
		this.rightPlate19 = this.tail4.getChild("rightPlate19");
		this.leftPlate18 = this.tail4.getChild("leftPlate18");
		this.rightPlate18 = this.tail4.getChild("rightPlate18");
		this.tail5 = this.tail4.getChild("tail5");
		this.lefttailSpike2 = this.tail5.getChild("lefttailSpike2");
		this.righttailSpike2 = this.tail5.getChild("righttailSpike2");
		this.lefttailSpike = this.tail5.getChild("lefttailSpike");
		this.righttailSpike = this.tail5.getChild("righttailSpike");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -19.0F, 5.3F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -2.95F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.1F, -13.05F, -12.1F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.45F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1F, -13.05F, -12.1F, 0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(2.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -15.0F, 5.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.4F, 5.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.7F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9F, -5.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = hips.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0431F, -3.5067F, 0.9237F, -0.6294F, -0.0206F, 0.1736F));

		PartDefinition rightPlate12 = hips.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0431F, -3.5067F, 0.9237F, -0.6294F, 0.0206F, -0.1736F));

		PartDefinition leftPlate11 = hips.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1844F, -3.7084F, -2.0121F, -0.3252F, -0.0355F, 0.1711F));

		PartDefinition rightPlate11 = hips.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1844F, -3.7084F, -2.0121F, -0.3252F, 0.0355F, -0.1711F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.1561F, -0.8054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.1561F, -0.8054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.9301F, -0.1776F, 0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 9.9433F, 0.1485F, 0.3752F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0081F, 7.2086F, -0.3815F, -0.6534F, -0.0084F, -0.0044F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5237F, 1.3722F, -0.0022F, 0.2182F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.9301F, -0.1776F, -0.4363F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 9.9433F, 0.1485F, 0.5061F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0081F, 7.2086F, -0.3815F, -0.2607F, 0.0084F, 0.0044F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5237F, 1.3722F, -0.0022F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.1F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, 0.7426F, 5.4022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 29).addBox(-1.0F, 0.7426F, -0.2978F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 11).addBox(-1.0F, 0.7327F, -0.2418F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body2.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8301F, -2.6892F, -2.2713F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition rightPlate9 = body2.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8301F, -2.6892F, -2.2713F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.8F, -3.8F, 0.0431F, -0.1727F, -0.0504F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 52).addBox(-1.0F, -0.2F, 4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.3F, -7.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0332F, 5.8569F, -3.092F, 0.4832F, -0.0552F, -0.1188F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1463F, 6.6482F, 1.1997F, -0.355F, 0.07F, 0.1047F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0928F, 4.7846F, -0.4947F, -0.2825F, 0.1606F, 0.0032F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0332F, 5.8569F, -3.092F, -0.6076F, 0.0552F, 0.1188F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1463F, 6.6482F, 1.1997F, -0.0932F, -0.07F, -0.1047F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0928F, 4.7846F, -0.4947F, 0.6338F, -0.1606F, -0.0032F));

		PartDefinition leftPlate5 = chest.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0454F, -2.3691F, -1.5753F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition rightPlate5 = chest.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0454F, -2.3691F, -1.5753F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 2.6449F, -6.2018F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 2.6449F, -6.2018F));

		PartDefinition parascapularSpine = chest.addOrReplaceChild("parascapularSpine", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9711F, 1.3023F, -0.7851F, -0.6744F, 0.5565F, -1.3133F));

		PartDefinition parascapularSpine2 = chest.addOrReplaceChild("parascapularSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9711F, 1.3023F, -0.7851F, -0.6744F, -0.5565F, 1.3133F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -3.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 89).addBox(-1.0F, -0.3F, 2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck4.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8445F, -2.9389F, -0.2526F, 0.2517F, 0.0762F, 0.2206F));

		PartDefinition rightPlate3 = neck4.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8445F, -2.9389F, -0.2526F, 0.2517F, -0.0762F, -0.2206F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1504F, -1.8065F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 12).addBox(-1.0F, -0.2F, 2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(90, 12).addBox(-1.0F, -0.2F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4577F, -1.9099F, -0.1463F, -0.3024F, 0.0439F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 39).addBox(-1.0F, 0.7F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 38).addBox(-1.0F, 0.7F, 1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.8F, -4.1F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = neck2.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2768F, -1.7871F, 0.5102F, -0.3417F, 0.0762F, 0.2206F));

		PartDefinition rightPlate4 = neck2.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2768F, -1.7871F, 0.5102F, -0.3417F, -0.0762F, -0.2206F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -2.4F, -0.5444F, -0.2635F, 0.1564F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(86, 38).addBox(-0.5F, 0.7F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(85, 37).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.875F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(86, 74).addBox(-0.5F, 0.7F, 0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0554F, -1.4455F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1637F, -0.6406F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.3858F, -0.0327F, 0.5157F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.1637F, -0.6406F));

		PartDefinition bone4 = rightFace.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.3858F, -0.0327F, 0.5157F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, 0.7469F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck5.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.1075F, 0.441F, -0.2457F, 0.0762F, 0.2206F));

		PartDefinition rightPlate2 = neck5.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.1075F, 0.441F, -0.2457F, -0.0762F, -0.2206F));

		PartDefinition leftPlate7 = neck.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.2075F, 0.441F, -0.1604F, 0.0568F, 0.2263F));

		PartDefinition rightPlate7 = neck.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.2075F, 0.441F, -0.1604F, -0.0568F, -0.2263F));

		PartDefinition leftPlate10 = body.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3138F, -3.226F, -0.4144F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate10 = body.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3138F, -3.226F, -0.4144F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition leftPlate8 = body.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3889F, -3.1598F, -2.8144F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate8 = body.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3889F, -3.1598F, -2.8144F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition leftPlate6 = body.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4052F, -2.7535F, -5.2133F, 0.3293F, -0.0355F, 0.1711F));

		PartDefinition rightPlate6 = body.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4052F, -2.7535F, -5.2133F, 0.3293F, 0.0355F, -0.1711F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, -0.1072F, 0.217F, -0.0232F));

		PartDefinition leftPlate14 = tail.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.677F, -2.7562F, 5.103F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition rightPlate14 = tail.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.677F, -2.7562F, 5.103F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition rightPlate13 = tail.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8981F, -3.5753F, 1.3875F, -0.0709F, 0.0206F, -0.1736F));

		PartDefinition leftPlate20 = tail.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8981F, -3.5753F, 1.3875F, -0.0709F, -0.0206F, 0.1736F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 42).addBox(-0.5F, 0.3F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, -0.0894F, 0.2173F, -0.0193F));

		PartDefinition leftPlate16 = tail2.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4054F, -1.9157F, 5.2996F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition rightPlate16 = tail2.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4054F, -1.9157F, 5.2996F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition leftPlate15 = tail2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.519F, -2.2172F, 2.3899F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition rightPlate15 = tail2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.519F, -2.2172F, 2.3899F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 41).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0148F, 5.9011F, -0.0983F, 0.2171F, -0.0212F));

		PartDefinition leftPlate17 = tail3.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3142F, -1.7186F, 2.2354F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition rightPlate17 = tail3.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3142F, -1.7186F, 2.2354F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.925F, -0.1715F, 0.2581F, -0.0442F));

		PartDefinition leftPlate19 = tail4.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1157F, -1.1676F, 2.1936F, -0.4636F, -0.0206F, 0.1736F));

		PartDefinition rightPlate19 = tail4.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1157F, -1.1676F, 2.1936F, -0.4636F, 0.0206F, -0.1736F));

		PartDefinition leftPlate18 = tail4.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1866F, -1.2965F, -0.1194F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition rightPlate18 = tail4.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1866F, -1.2965F, -0.1194F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 10).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition lefttailSpike2 = tail5.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2471F, 0.03F, 4.0314F, -0.2025F, -0.0293F, 0.6423F));

		PartDefinition righttailSpike2 = tail5.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2471F, 0.03F, 4.0314F, -0.2025F, 0.0293F, -0.6423F));

		PartDefinition lefttailSpike = tail5.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7276F, -0.9782F, 1.2682F, -0.0455F, -0.0293F, 0.6423F));

		PartDefinition righttailSpike = tail5.addOrReplaceChild("righttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7276F, -0.9782F, 1.2682F, -0.0455F, 0.0293F, -0.6423F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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