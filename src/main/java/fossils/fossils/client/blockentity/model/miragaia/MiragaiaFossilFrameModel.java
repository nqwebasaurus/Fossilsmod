package fossils.fossils.client.blockentity.model.miragaia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MiragaiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart leftPlate33;
	private final ModelPart rightPlate33;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart tail2;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart tail4;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart leftPlate31;
	private final ModelPart rightPlate31;
	private final ModelPart body4;
	private final ModelPart leftPlate30;
	private final ModelPart rightPlate30;
	private final ModelPart leftPlate20;
	private final ModelPart rightPlate20;
	private final ModelPart upperbody;
	private final ModelPart leftPlate21;
	private final ModelPart rightPlate21;
	private final ModelPart leftPlate29;
	private final ModelPart rightPlate29;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftPlate23;
	private final ModelPart rightPlate23;
	private final ModelPart leftPlate28;
	private final ModelPart rightPlate28;
	private final ModelPart leftPlate22;
	private final ModelPart rightPlate22;
	private final ModelPart neck;
	private final ModelPart leftPlate26;
	private final ModelPart rightPlate26;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate34;
	private final ModelPart rightPlate34;
	private final ModelPart neck3;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck5;
	private final ModelPart leftPlate35;
	private final ModelPart rightPlate35;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck6;
	private final ModelPart leftPlate36;
	private final ModelPart rightPlate36;
	private final ModelPart neck7;
	private final ModelPart leftPlate37;
	private final ModelPart rightPlate37;
	private final ModelPart leftPlate38;
	private final ModelPart rightPlate38;
	private final ModelPart neck8;
	private final ModelPart leftPlate39;
	private final ModelPart rightPlate39;
	private final ModelPart leftPlate40;
	private final ModelPart rightPlate40;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart leftPlate25;
	private final ModelPart rightPlate25;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;

	public MiragaiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.leftPlate33 = this.body.getChild("leftPlate33");
		this.rightPlate33 = this.body.getChild("rightPlate33");
		this.leftPlate7 = this.body.getChild("leftPlate7");
		this.rightPlate7 = this.body.getChild("rightPlate7");
		this.leftPlate6 = this.body.getChild("leftPlate6");
		this.rightPlate6 = this.body.getChild("rightPlate6");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.leftPlate11 = this.tail.getChild("leftPlate11");
		this.rightPlate11 = this.tail.getChild("rightPlate11");
		this.leftPlate8 = this.tail.getChild("leftPlate8");
		this.rightPlate8 = this.tail.getChild("rightPlate8");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate9 = this.tail2.getChild("leftPlate9");
		this.rightPlate9 = this.tail2.getChild("rightPlate9");
		this.leftPlate10 = this.tail2.getChild("leftPlate10");
		this.rightPlate10 = this.tail2.getChild("rightPlate10");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.leftPlate14 = this.tail3.getChild("leftPlate14");
		this.rightPlate14 = this.tail3.getChild("rightPlate14");
		this.leftPlate4 = this.tail3.getChild("leftPlate4");
		this.rightPlate4 = this.tail3.getChild("rightPlate4");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate5 = this.tail4.getChild("leftPlate5");
		this.rightPlate5 = this.tail4.getChild("rightPlate5");
		this.leftPlate16 = this.tail4.getChild("leftPlate16");
		this.rightPlate16 = this.tail4.getChild("rightPlate16");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftPlate13 = this.tail5.getChild("leftPlate13");
		this.rightPlate13 = this.tail5.getChild("rightPlate13");
		this.leftPlate18 = this.tail5.getChild("leftPlate18");
		this.rightPlate18 = this.tail5.getChild("rightPlate18");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.leftPlate19 = this.body3.getChild("leftPlate19");
		this.rightPlate19 = this.body3.getChild("rightPlate19");
		this.leftPlate31 = this.body3.getChild("leftPlate31");
		this.rightPlate31 = this.body3.getChild("rightPlate31");
		this.body4 = this.body3.getChild("body4");
		this.leftPlate30 = this.body4.getChild("leftPlate30");
		this.rightPlate30 = this.body4.getChild("rightPlate30");
		this.leftPlate20 = this.body4.getChild("leftPlate20");
		this.rightPlate20 = this.body4.getChild("rightPlate20");
		this.upperbody = this.body4.getChild("upperbody");
		this.leftPlate21 = this.upperbody.getChild("leftPlate21");
		this.rightPlate21 = this.upperbody.getChild("rightPlate21");
		this.leftPlate29 = this.upperbody.getChild("leftPlate29");
		this.rightPlate29 = this.upperbody.getChild("rightPlate29");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftPlate23 = this.chest.getChild("leftPlate23");
		this.rightPlate23 = this.chest.getChild("rightPlate23");
		this.leftPlate28 = this.chest.getChild("leftPlate28");
		this.rightPlate28 = this.chest.getChild("rightPlate28");
		this.leftPlate22 = this.chest.getChild("leftPlate22");
		this.rightPlate22 = this.chest.getChild("rightPlate22");
		this.neck = this.chest.getChild("neck");
		this.leftPlate26 = this.neck.getChild("leftPlate26");
		this.rightPlate26 = this.neck.getChild("rightPlate26");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate2 = this.neck4.getChild("leftPlate2");
		this.rightPlate2 = this.neck4.getChild("rightPlate2");
		this.leftPlate34 = this.neck4.getChild("leftPlate34");
		this.rightPlate34 = this.neck4.getChild("rightPlate34");
		this.neck3 = this.neck4.getChild("neck3");
		this.leftPlate3 = this.neck3.getChild("leftPlate3");
		this.rightPlate3 = this.neck3.getChild("rightPlate3");
		this.neck5 = this.neck3.getChild("neck5");
		this.leftPlate35 = this.neck5.getChild("leftPlate35");
		this.rightPlate35 = this.neck5.getChild("rightPlate35");
		this.leftPlate17 = this.neck5.getChild("leftPlate17");
		this.rightPlate17 = this.neck5.getChild("rightPlate17");
		this.neck6 = this.neck5.getChild("neck6");
		this.leftPlate36 = this.neck6.getChild("leftPlate36");
		this.rightPlate36 = this.neck6.getChild("rightPlate36");
		this.neck7 = this.neck6.getChild("neck7");
		this.leftPlate37 = this.neck7.getChild("leftPlate37");
		this.rightPlate37 = this.neck7.getChild("rightPlate37");
		this.leftPlate38 = this.neck7.getChild("leftPlate38");
		this.rightPlate38 = this.neck7.getChild("rightPlate38");
		this.neck8 = this.neck7.getChild("neck8");
		this.leftPlate39 = this.neck8.getChild("leftPlate39");
		this.rightPlate39 = this.neck8.getChild("rightPlate39");
		this.leftPlate40 = this.neck8.getChild("leftPlate40");
		this.rightPlate40 = this.neck8.getChild("rightPlate40");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.leftPlate25 = this.neck2.getChild("leftPlate25");
		this.rightPlate25 = this.neck2.getChild("rightPlate25");
		this.leftPlate15 = this.body2.getChild("leftPlate15");
		this.rightPlate15 = this.body2.getChild("rightPlate15");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -33.0F, 3.3F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -34.0F, -25.7F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 23.0F, 2.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.7F, -7.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(6.8F, -6.5F, 28.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -25.5F, -25.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0651F, 4.9699F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 2.0F, -2.8F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftPlate33 = body.addOrReplaceChild("leftPlate33", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4186F, -4.5932F, 0.1757F, -0.3896F, 0.2325F, 0.1827F));

		PartDefinition rightPlate33 = body.addOrReplaceChild("rightPlate33", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4186F, -4.5932F, 0.1757F, -0.3896F, -0.2325F, -0.1827F));

		PartDefinition leftPlate7 = body.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8205F, -4.6445F, 5.2774F, -0.4769F, 0.2325F, 0.1827F));

		PartDefinition rightPlate7 = body.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8205F, -4.6445F, 5.2774F, -0.4769F, -0.2325F, -0.1827F));

		PartDefinition leftPlate6 = body.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1395F, -5.1213F, -4.6871F, -0.2965F, 0.2424F, 0.2076F));

		PartDefinition rightPlate6 = body.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1395F, -5.1213F, -4.6871F, -0.2965F, -0.2424F, -0.2076F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -1.5073F, 2.7299F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -1.5073F, 2.7299F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 0.8454F, -0.8971F, 0.2182F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 20.7896F, 1.857F, 0.6021F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0105F, 10.9975F, -0.0325F, -0.3916F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5119F, 2.2296F, -1.7566F, -0.3054F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 0.8454F, -0.8971F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 20.7896F, 1.857F, 0.5585F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0105F, 10.9975F, -0.0325F, 0.2192F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5119F, 2.2296F, -1.7566F, -0.8727F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.259F, 6.9347F, 0.2627F, -0.287F, 0.0546F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 40).addBox(-0.5F, -0.0422F, 10.0173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 31).addBox(-0.5F, -0.0422F, 0.3173F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2046F, -2.6694F, 3.4247F, -0.7266F, 0.1439F, 0.2875F));

		PartDefinition rightPlate11 = tail.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2046F, -2.6694F, 3.4247F, -0.7266F, -0.1439F, -0.2875F));

		PartDefinition leftPlate8 = tail.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4786F, -2.6943F, 9.9572F, -0.8216F, 0.2796F, 0.2348F));

		PartDefinition rightPlate8 = tail.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4786F, -2.6943F, 9.9572F, -0.8216F, -0.2796F, -0.2348F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0004F, 9.6553F, -0.2565F, -0.0955F, -0.0199F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 14).addBox(-0.5F, 0.1106F, -0.5203F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0707F, 0.5071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = tail2.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9648F, -1.8632F, 3.1244F, -0.6263F, 0.3195F, 0.3072F));

		PartDefinition rightPlate9 = tail2.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9648F, -1.8632F, 3.1244F, -0.6263F, -0.3195F, -0.3072F));

		PartDefinition leftPlate10 = tail2.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7798F, -2.1919F, 8.1514F, -0.7482F, 0.3625F, 0.3295F));

		PartDefinition rightPlate10 = tail2.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7798F, -2.1919F, 8.1514F, -0.7482F, -0.3625F, -0.3295F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5165F, 9.9012F, -0.3002F, -0.2087F, 0.0641F));

		PartDefinition cube_r5 = tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, 0.0545F, -0.8252F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4777F, -1.0368F, 1.3305F, -0.5147F, 0.2428F, 0.5578F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4777F, -1.0368F, 1.3305F, -0.5147F, -0.2428F, -0.5578F));

		PartDefinition leftPlate14 = tail3.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4777F, -0.3915F, 5.8331F, -0.5048F, 0.2641F, 0.5971F));

		PartDefinition rightPlate14 = tail3.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4777F, -0.3915F, 5.8331F, -0.5048F, -0.2641F, -0.5971F));

		PartDefinition leftPlate4 = tail3.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.626F, -1.0249F, 10.9199F, -0.4973F, 0.3095F, 0.6853F));

		PartDefinition rightPlate4 = tail3.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.626F, -1.0249F, 10.9199F, -0.4973F, -0.3095F, -0.6853F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0749F, 10.8635F, -0.0786F, 0.087F, -0.0068F));

		PartDefinition cube_r6 = tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, 0.3194F, -0.061F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.153F))
				.texOffs(56, 0).addBox(-0.5F, 0.6944F, -0.061F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = tail4.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.426F, -0.068F, 4.7079F, -0.4346F, 0.3244F, 0.7185F));

		PartDefinition rightPlate5 = tail4.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.426F, -0.068F, 4.7079F, -0.4346F, -0.3244F, -0.7185F));

		PartDefinition leftPlate16 = tail4.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(2.126F, 0.1473F, 8.1682F, -0.3907F, 0.3769F, 0.8462F));

		PartDefinition rightPlate16 = tail4.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.126F, 0.1473F, 8.1682F, -0.3907F, -0.3769F, -0.8462F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(96, 12).addBox(-0.5F, 0.3216F, -0.9333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(100, 16).addBox(-0.5F, 0.3216F, 4.2667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0449F, 9.0715F, 0.234F, 0.167F, 0.0552F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 46).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1793F, 5.7177F, 0.2531F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(18, 118).addBox(-0.5F, 0.2F, -0.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0092F, 7.8474F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail5.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2263F, -0.2592F, 3.9083F, -0.4945F, -0.3232F, 1.1345F));

		PartDefinition rightPlate13 = tail5.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2263F, -0.2592F, 3.9083F, -0.4945F, 0.3232F, -1.1345F));

		PartDefinition leftPlate18 = tail5.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2092F, -0.9643F, 9.4739F, -0.8733F, -0.2303F, 1.2428F));

		PartDefinition rightPlate18 = tail5.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2092F, -0.9643F, 9.4739F, -0.8733F, 0.2303F, -1.2428F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7594F, -6.9171F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 24).addBox(-1.0F, -0.8893F, 2.3354F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -8.2369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6544F, -5.9869F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(103, 32).addBox(-1.0F, -0.1007F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6F, -4.2F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = body3.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -5.647F, -4.5847F, -0.0161F, 0.3258F, 0.1807F));

		PartDefinition rightPlate19 = body3.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, -5.647F, -4.5847F, -0.0161F, -0.3258F, -0.1807F));

		PartDefinition leftPlate31 = body3.addOrReplaceChild("leftPlate31", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5198F, -7.2435F, -0.4459F, -0.1033F, 0.3258F, 0.1807F));

		PartDefinition rightPlate31 = body3.addOrReplaceChild("rightPlate31", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5198F, -7.2435F, -0.4459F, -0.1033F, -0.3258F, -0.1807F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5974F, -4.5501F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 83).addBox(-1.0F, -0.1007F, -1.1096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 77).addBox(-1.0F, -0.1007F, -7.8096F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftPlate30 = body4.addOrReplaceChild("leftPlate30", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -6.0589F, -6.7511F, 0.2021F, 0.3258F, 0.1807F));

		PartDefinition rightPlate30 = body4.addOrReplaceChild("rightPlate30", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -6.0589F, -6.7511F, 0.2021F, -0.3258F, -0.1807F));

		PartDefinition leftPlate20 = body4.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -5.393F, -3.3826F, 0.045F, 0.3258F, 0.1807F));

		PartDefinition rightPlate20 = body4.addOrReplaceChild("rightPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, -5.393F, -3.3826F, 0.045F, -0.3258F, -0.1807F));

		PartDefinition upperbody = body4.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.8059F, -6.692F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r10 = upperbody.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 41).addBox(-1.0F, 0.2947F, 1.1954F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.0165F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftPlate21 = upperbody.addOrReplaceChild("leftPlate21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -3.679F, -5.8388F, 0.1847F, 0.3258F, 0.1807F));

		PartDefinition rightPlate21 = upperbody.addOrReplaceChild("rightPlate21", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -3.679F, -5.8388F, 0.1847F, -0.3258F, -0.1807F));

		PartDefinition leftPlate29 = upperbody.addOrReplaceChild("leftPlate29", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -5.9384F, -3.107F, 0.0538F, 0.3258F, 0.1807F));

		PartDefinition rightPlate29 = upperbody.addOrReplaceChild("rightPlate29", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -5.9384F, -3.107F, 0.0538F, -0.3258F, -0.1807F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3936F, 2.0346F, -5.1865F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 66).addBox(-1.0F, 0.2947F, -6.8546F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8936F, -0.1506F, -1.7052F, 0.3054F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2335F, 8.6259F, -2.5178F, 0.396F, -0.0552F, -0.1188F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2103F, 15.055F, -3.5134F, -1.1404F, 0.07F, 0.1047F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.312F, 12.3645F, 0.9587F, 0.2435F, -0.2124F, -0.0884F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4463F, 8.6259F, -2.5178F, 0.8759F, 0.0552F, 0.1188F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2103F, 15.055F, -3.5134F, -0.9659F, -0.07F, -0.1047F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.312F, 12.3645F, 0.9587F, 0.5053F, 0.2124F, 0.0884F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4391F, -1.3177F, 2.3661F, -0.2161F, -0.0301F, -0.1364F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.652F, -1.3177F, 2.3661F, -0.2161F, 0.0301F, 0.1364F));

		PartDefinition leftPlate23 = chest.addOrReplaceChild("leftPlate23", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3125F, -4.4156F, -7.6038F, 0.2411F, 0.4443F, 0.2922F));

		PartDefinition rightPlate23 = chest.addOrReplaceChild("rightPlate23", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5253F, -4.4156F, -7.6038F, 0.2411F, -0.4443F, -0.2922F));

		PartDefinition leftPlate28 = chest.addOrReplaceChild("leftPlate28", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6936F, -5.0685F, -4.7122F, 0.1579F, 0.3628F, 0.2583F));

		PartDefinition rightPlate28 = chest.addOrReplaceChild("rightPlate28", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9064F, -5.0685F, -4.7122F, 0.1579F, -0.3628F, -0.2583F));

		PartDefinition leftPlate22 = chest.addOrReplaceChild("leftPlate22", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9936F, -6.9258F, -2.0347F, 0.1061F, 0.3258F, 0.1807F));

		PartDefinition rightPlate22 = chest.addOrReplaceChild("rightPlate22", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2064F, -6.9258F, -2.0347F, 0.1061F, -0.3258F, -0.1807F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3936F, 1.6927F, -7.7892F, -0.1373F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 118).addBox(-0.5683F, -0.5842F, 3.6557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 116).addBox(-0.5683F, -0.5842F, -0.0443F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5218F, -4.0612F, 0.1571F, 0.0171F, 0.0036F));

		PartDefinition leftPlate26 = neck.addOrReplaceChild("leftPlate26", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2292F, -4.3797F, -2.9124F, 0.2411F, 0.4443F, 0.2922F));

		PartDefinition rightPlate26 = neck.addOrReplaceChild("rightPlate26", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2292F, -4.3797F, -2.9124F, 0.2411F, -0.4443F, -0.2922F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6196F, -3.4561F, -0.14F, 0.1059F, 0.1206F));

		PartDefinition cube_r13 = neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, -0.843F, -0.0041F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3555F, -5.907F, 0.0524F, 0.0174F, 0.0009F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.3984F, -5.7008F, -0.1063F, 0.1736F, -0.0184F));

		PartDefinition cube_r14 = neck4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 111).addBox(0.0F, 0.05F, 2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 111).addBox(0.0F, 0.75F, 2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 107).addBox(0.0F, 0.05F, -1.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 107).addBox(0.0F, 0.75F, -1.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck4.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5068F, -4.3397F, -4.6964F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition rightPlate2 = neck4.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5068F, -4.3397F, -4.6964F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition leftPlate34 = neck4.addOrReplaceChild("leftPlate34", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5925F, -4.1685F, -1.403F, 0.061F, 0.2803F, 0.4136F));

		PartDefinition rightPlate34 = neck4.addOrReplaceChild("rightPlate34", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5925F, -4.1685F, -1.403F, 0.061F, -0.2803F, -0.4136F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3702F, -4.806F, -0.0415F, 0.1425F, 0.1181F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(123, 60).addBox(-1.0F, 0.05F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(123, 60).addBox(-1.0F, 0.45F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(120, 57).addBox(-1.0F, 0.05F, -2.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F))
				.texOffs(120, 57).addBox(-1.0F, 0.45F, -2.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck3.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8236F, -3.959F, -2.8094F, -0.1734F, 0.2446F, 0.4739F));

		PartDefinition rightPlate3 = neck3.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8236F, -3.959F, -2.8094F, -0.1734F, -0.2446F, -0.4739F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4582F, -3.9543F, -0.0612F, 0.0863F, 0.0467F));

		PartDefinition cube_r16 = neck5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(123, 3).addBox(-0.5F, -0.2849F, -0.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(120, 0).addBox(-0.5F, -0.2849F, -3.8878F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6161F, -0.7499F, -0.1135F, 0.039F, -0.0044F));

		PartDefinition leftPlate35 = neck5.addOrReplaceChild("leftPlate35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -4.0634F, -4.083F, -0.1711F, 0.3226F, 0.4129F));

		PartDefinition rightPlate35 = neck5.addOrReplaceChild("rightPlate35", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -4.0634F, -4.083F, -0.1711F, -0.3226F, -0.4129F));

		PartDefinition leftPlate17 = neck5.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -3.6432F, -1.5318F, -0.1886F, 0.3226F, 0.4129F));

		PartDefinition rightPlate17 = neck5.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -3.6432F, -1.5318F, -0.1886F, -0.3226F, -0.4129F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4437F, -3.8827F, -0.0313F, 0.0156F, 0.13F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(120, 63).addBox(-1.0F, 0.05F, -2.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate36 = neck6.addOrReplaceChild("leftPlate36", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -3.5906F, -2.7962F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition rightPlate36 = neck6.addOrReplaceChild("rightPlate36", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -3.5906F, -2.7962F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4783F, -3.9616F, 0.0552F, 0.0871F, 0.0048F));

		PartDefinition cube_r18 = neck7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(88, 120).addBox(-1.0F, 0.05F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate37 = neck7.addOrReplaceChild("leftPlate37", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7635F, -3.0232F, -3.1251F, 0.0034F, 0.3226F, 0.4129F));

		PartDefinition rightPlate37 = neck7.addOrReplaceChild("rightPlate37", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7635F, -3.0232F, -3.1251F, 0.0034F, -0.3226F, -0.4129F));

		PartDefinition leftPlate38 = neck7.addOrReplaceChild("leftPlate38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7927F, -3.0324F, -0.9055F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition rightPlate38 = neck7.addOrReplaceChild("rightPlate38", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7927F, -3.0324F, -0.9055F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4695F, -3.9185F, 0.099F, 0.0868F, 0.0086F));

		PartDefinition cube_r19 = neck8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 83).addBox(-1.0F, 0.05F, -3.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate39 = neck8.addOrReplaceChild("leftPlate39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7544F, -2.6832F, -1.031F, -0.2147F, 0.3226F, 0.4129F));

		PartDefinition rightPlate39 = neck8.addOrReplaceChild("rightPlate39", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7544F, -2.6832F, -1.031F, -0.2147F, -0.3226F, -0.4129F));

		PartDefinition leftPlate40 = neck8.addOrReplaceChild("leftPlate40", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9774F, -2.9893F, -3.2537F, -0.1275F, 0.3226F, 0.4129F));

		PartDefinition rightPlate40 = neck8.addOrReplaceChild("rightPlate40", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9774F, -2.9893F, -3.2537F, -0.1275F, -0.3226F, -0.4129F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1332F, -4.8009F, -0.381F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.6028F, -1.0518F, -2.7607F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.6028F, -1.0518F, -2.7607F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0308F, -0.1672F, -2.2107F, -0.1708F, 0.1865F, 0.0028F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0308F, -0.1672F, -2.2107F, -0.1708F, -0.1865F, -0.0028F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0293F, 0.5345F, 0.8072F, 0.0F, 0.0F));

		PartDefinition leftPlate25 = neck2.addOrReplaceChild("leftPlate25", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2168F, -4.5488F, -3.2818F, 0.1768F, 0.3632F, 0.333F));

		PartDefinition rightPlate25 = neck2.addOrReplaceChild("rightPlate25", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2168F, -4.5488F, -3.2818F, 0.1768F, -0.3632F, -0.333F));

		PartDefinition leftPlate15 = body2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6486F, -7.0545F, -1.249F, -0.208F, 0.3258F, 0.1807F));

		PartDefinition rightPlate15 = body2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6486F, -7.0545F, -1.249F, -0.208F, -0.3258F, -0.1807F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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