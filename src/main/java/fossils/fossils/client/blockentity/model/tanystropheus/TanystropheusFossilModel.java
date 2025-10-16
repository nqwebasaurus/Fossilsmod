package fossils.fossils.client.blockentity.model.tanystropheus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TanystropheusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body2;
	private final ModelPart body4;
	private final ModelPart body;
	private final ModelPart neckbase;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart chest;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart body3;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backLeftLeg5;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart backRightLeg5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail6;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public TanystropheusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.body4 = this.body2.getChild("body4");
		this.body = this.body4.getChild("body");
		this.neckbase = this.body.getChild("neckbase");
		this.bone2 = this.neckbase.getChild("bone2");
		this.bone3 = this.neckbase.getChild("bone3");
		this.frontLeftLeg = this.neckbase.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.neckbase.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.chest = this.neckbase.getChild("chest");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.head = this.neck10.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.body3 = this.body2.getChild("body3");
		this.bone = this.body3.getChild("bone");
		this.bone4 = this.body3.getChild("bone4");
		this.backLeftLeg = this.body3.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backLeftLeg5 = this.backLeftLeg4.getChild("backLeftLeg5");
		this.backRightLeg = this.body3.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.backRightLeg5 = this.backRightLeg4.getChild("backRightLeg5");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail6 = this.tail3.getChild("tail6");
		this.tail4 = this.tail6.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.0F, 3.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 130).addBox(0.0F, -2.0F, 3.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 24).addBox(-1.0F, -1.1F, -0.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(127, 117).addBox(0.0F, -1.475F, -1.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2889F, 5.4345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(144, 42).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.0696F, -0.1654F, -1.6544F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(132, 54).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.1449F, -0.106F, -1.1115F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(144, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.1828F, -0.0526F, -0.6417F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 144).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.1315F, -0.0368F, -0.5047F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.0556F, -0.1136F, -1.5171F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(132, 35).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.1062F, -0.0687F, -0.9755F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(144, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.1828F, 0.0526F, 0.6417F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(132, 54).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.1449F, 0.106F, 1.1115F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(144, 42).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.0696F, 0.1654F, 1.6544F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(132, 35).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.1062F, 0.0687F, 0.9755F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(123, 19).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.0556F, 0.1136F, 1.5171F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 144).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.1315F, 0.0368F, 0.5047F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 51).addBox(-2.5F, -2.6107F, 1.653F, 5.0F, 3.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 3.7165F, 1.3505F, 0.1833F, 0.0F, 0.0F));

		PartDefinition body4 = body2.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, 2.7F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r16 = body4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(130, 14).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3926F, -1.7086F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(123, 4).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6745F, -0.6269F, -0.0428F, -0.0096F, -1.4481F));

		PartDefinition cube_r18 = body4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(144, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6745F, -0.6269F, -0.0365F, 0.0074F, -0.4363F));

		PartDefinition cube_r19 = body4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(132, 19).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6745F, -0.6269F, -0.0416F, 0.0138F, -0.9075F));

		PartDefinition cube_r20 = body4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(143, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -3.6268F, 0.0436F, 0.0419F, -0.3644F));

		PartDefinition cube_r21 = body4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(106, 120).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -3.6268F, -0.0296F, 0.0766F, -1.3777F));

		PartDefinition cube_r22 = body4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(132, 11).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -3.6268F, 0.0141F, 0.0809F, -0.835F));

		PartDefinition cube_r23 = body4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(112, 38).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -6.6269F, -0.0331F, 0.0241F, -1.3433F));

		PartDefinition cube_r24 = body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(130, 92).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -6.6269F, -0.016F, 0.0377F, -0.8022F));

		PartDefinition cube_r25 = body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(142, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.5745F, -6.6269F, -0.0028F, 0.017F, -0.3312F));

		PartDefinition cube_r26 = body4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(132, 64).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -9.6268F, 0.0081F, 0.0625F, -0.731F));

		PartDefinition cube_r27 = body4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(83, 72).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -9.6268F, -0.0253F, 0.0577F, -1.273F));

		PartDefinition cube_r28 = body4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 124).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -9.6268F, 0.0299F, 0.0283F, -0.2605F));

		PartDefinition cube_r29 = body4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(132, 19).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6745F, -0.6269F, -0.0416F, -0.0138F, 0.9075F));

		PartDefinition cube_r30 = body4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(144, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6745F, -0.6269F, -0.0365F, -0.0074F, 0.4363F));

		PartDefinition cube_r31 = body4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(123, 4).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6745F, -0.6269F, -0.0428F, 0.0096F, 1.4481F));

		PartDefinition cube_r32 = body4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 33).addBox(-2.5F, -2.0662F, -9.9906F, 5.0F, 2.0F, 10.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 6.8378F, 0.3978F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(143, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -3.6268F, 0.0436F, -0.0419F, 0.3644F));

		PartDefinition cube_r34 = body4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(106, 120).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -3.6268F, -0.0296F, -0.0766F, 1.3777F));

		PartDefinition cube_r35 = body4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 124).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -9.6268F, 0.0299F, -0.0283F, 0.2605F));

		PartDefinition cube_r36 = body4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 72).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -9.6268F, -0.0253F, -0.0577F, 1.273F));

		PartDefinition cube_r37 = body4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(132, 64).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -9.6268F, 0.0081F, -0.0625F, 0.731F));

		PartDefinition cube_r38 = body4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(132, 11).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -3.6268F, 0.0141F, -0.0809F, 0.835F));

		PartDefinition cube_r39 = body4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(112, 38).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -6.6269F, -0.0331F, -0.0241F, 1.3433F));

		PartDefinition cube_r40 = body4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(130, 92).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -6.6269F, -0.016F, -0.0377F, 0.8022F));

		PartDefinition cube_r41 = body4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(142, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5745F, -6.6269F, -0.0028F, -0.017F, 0.3312F));

		PartDefinition cube_r42 = body4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(129, 99).addBox(0.0F, -1.4F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.2661F, -4.6058F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(129, 94).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1309F, -7.7029F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 129).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 60).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = body4.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -10.2F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(127, 112).addBox(0.0F, -1.469F, 4.3268F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.95F, -7.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 130).addBox(0.0F, -1.469F, 1.3268F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, -7.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(79, 107).addBox(-1.5F, -1.9616F, 0.1112F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.55F, -4.1F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(91, 14).addBox(-1.0F, -0.869F, 1.0268F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, -8.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(144, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2255F, -5.1268F, 0.2999F, 0.096F, -0.1892F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(132, 31).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2255F, -5.1268F, 0.2215F, 0.2438F, -0.6438F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(117, 80).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2255F, -5.1268F, 0.0616F, 0.3222F, -1.2021F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3745F, -2.0268F, -0.0084F, 0.1431F, -1.2707F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(132, 21).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3745F, -2.0268F, 0.0669F, 0.1268F, -0.7248F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(144, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3745F, -2.0268F, 0.1112F, 0.0591F, -0.2563F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(117, 80).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2255F, -5.1268F, 0.0616F, -0.3222F, 1.2021F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(132, 31).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2255F, -5.1268F, 0.2215F, -0.2438F, 0.6438F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(144, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.2255F, -5.1268F, 0.2999F, -0.096F, 0.1892F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(144, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3745F, -2.0268F, 0.1112F, -0.0591F, 0.2563F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(132, 21).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3745F, -2.0268F, 0.0669F, -0.1268F, 0.7248F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(117, 78).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.3745F, -2.0268F, -0.0084F, -0.1431F, 1.2707F));

		PartDefinition neckbase = body.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0151F, -7.3006F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r62 = neckbase.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(118, 128).addBox(0.0F, -0.6F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4063F, -1.9773F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r63 = neckbase.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(85, 130).addBox(0.0F, -0.6F, 0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.396F, -4.9717F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r64 = neckbase.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(112, 7).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9558F, 6.4797F, 3.0125F, 0.2194F, 0.8324F, 0.5824F));

		PartDefinition cube_r65 = neckbase.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(120, 106).mirror().addBox(-3.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6077F, 6.1793F, 2.5289F, 0.0916F, 0.6048F, 0.418F));

		PartDefinition cube_r66 = neckbase.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(123, 32).mirror().addBox(-3.0F, 0.2F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8234F, 5.9466F, 1.1857F, 0.248F, 0.3117F, 0.5613F));

		PartDefinition cube_r67 = neckbase.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 15).mirror().addBox(-3.9793F, -1.1862F, 0.1659F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2133F, -2.184F, -0.1376F, 0.3114F, -0.0424F));

		PartDefinition cube_r68 = neckbase.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-2.7328F, -0.9904F, -1.6021F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2133F, -0.684F, -0.2921F, -0.7203F, 0.1958F));

		PartDefinition cube_r69 = neckbase.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(121, 21).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4755F, -3.9268F, 0.2595F, 0.7005F, -1.2164F));

		PartDefinition cube_r70 = neckbase.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(133, 75).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4755F, -3.9268F, 0.595F, 0.4685F, -0.6245F));

		PartDefinition cube_r71 = neckbase.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 144).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4755F, -3.9268F, 0.7135F, 0.1587F, -0.249F));

		PartDefinition cube_r72 = neckbase.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(35, 144).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0269F, 0.4726F, 0.1207F, -0.1346F));

		PartDefinition cube_r73 = neckbase.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(132, 33).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0269F, 0.3725F, 0.3397F, -0.5644F));

		PartDefinition cube_r74 = neckbase.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(117, 92).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0269F, 0.1386F, 0.4807F, -1.136F));

		PartDefinition cube_r75 = neckbase.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 144).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4755F, -3.9268F, 0.7135F, -0.1587F, 0.249F));

		PartDefinition cube_r76 = neckbase.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(133, 75).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4755F, -3.9268F, 0.595F, -0.4685F, 0.6245F));

		PartDefinition cube_r77 = neckbase.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(121, 21).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4755F, -3.9268F, 0.2595F, -0.7005F, 1.2164F));

		PartDefinition cube_r78 = neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 144).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0269F, 0.4726F, -0.1207F, 0.1346F));

		PartDefinition cube_r79 = neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(132, 33).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0269F, 0.3725F, -0.3397F, 0.5644F));

		PartDefinition cube_r80 = neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(117, 92).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0269F, 0.1386F, -0.4807F, 1.136F));

		PartDefinition cube_r81 = neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(112, 7).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9558F, 6.4797F, 3.0125F, 0.2194F, -0.8324F, -0.5824F));

		PartDefinition cube_r82 = neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(120, 106).addBox(-0.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6077F, 6.1793F, 2.5289F, 0.0916F, -0.6048F, -0.418F));

		PartDefinition cube_r83 = neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(123, 32).addBox(0.0F, 0.2F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8234F, 5.9466F, 1.1857F, 0.248F, -0.3117F, -0.5613F));

		PartDefinition cube_r84 = neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(110, 15).addBox(1.9793F, -1.1862F, 0.1659F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2133F, -2.184F, -0.1376F, -0.3114F, 0.0424F));

		PartDefinition cube_r85 = neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 111).addBox(0.7328F, -0.9904F, -1.6021F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.2133F, -0.684F, -0.2921F, 0.7203F, -0.1958F));

		PartDefinition cube_r86 = neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(31, 116).addBox(-1.0F, -0.9904F, -3.0537F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.2133F, -0.684F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(106, 55).addBox(-2.5F, -1.1862F, 1.4335F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 6.2133F, -2.184F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r88 = neckbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -0.5F, 1.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3F, -6.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone2 = neckbase.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1002F, 4.7778F, -0.2698F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(113, 124).addBox(-0.5F, -2.9525F, -1.1162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8002F, -0.7268F, 0.0374F, -0.1699F, 0.1215F, -0.2451F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(120, 124).addBox(-0.5F, 0.0369F, 0.1599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.351F, -3.5558F, 1.2839F, -0.7982F, 0.1215F, -0.2451F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(17, 109).addBox(-0.5F, -1.5045F, -2.3842F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8002F, -0.7268F, 0.0374F, -0.0914F, 0.1215F, -0.2451F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(79, 114).addBox(-0.5F, -0.35F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.3372F, -2.4638F, -0.7769F, 0.0395F, 0.1215F, -0.2451F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(125, 6).addBox(-0.5F, 0.0905F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6414F, -3.7582F, -0.6209F, 0.5108F, 0.1215F, -0.2451F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(118, 113).addBox(-1.1F, -0.0045F, -2.4842F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8328F, -0.5511F, 0.053F, -0.1314F, 0.082F, 0.7925F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(118, 119).addBox(-2.1F, -0.8045F, -2.4842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1163F, 0.053F, 0.5846F));

		PartDefinition bone3 = neckbase.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1002F, 4.7778F, -0.2698F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(113, 124).mirror().addBox(-0.5F, -2.9525F, -1.1162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8002F, -0.7268F, 0.0374F, -0.1699F, -0.1215F, 0.2451F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(120, 124).mirror().addBox(-0.5F, 0.0369F, 0.1599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.351F, -3.5558F, 1.2839F, -0.7982F, -0.1215F, 0.2451F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(17, 109).mirror().addBox(-0.5F, -1.5045F, -2.3842F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8002F, -0.7268F, 0.0374F, -0.0914F, -0.1215F, 0.2451F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(79, 114).mirror().addBox(-0.5F, -0.35F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.3372F, -2.4638F, -0.7769F, 0.0395F, -0.1215F, 0.2451F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.5F, 0.0905F, -1.9433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.6414F, -3.7582F, -0.6209F, 0.5108F, -0.1215F, 0.2451F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(118, 113).mirror().addBox(0.1F, -0.0045F, -2.4842F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.8328F, -0.5511F, 0.053F, -0.1314F, -0.082F, -0.7925F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(118, 119).mirror().addBox(1.1F, -0.8045F, -2.4842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1163F, -0.053F, -0.5846F));

		PartDefinition frontLeftLeg = neckbase.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0342F, 5.1901F, -0.6552F, 0.4641F, 0.2073F, -0.2819F));

		PartDefinition cube_r103 = frontLeftLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(130, 78).addBox(-1.0F, -1.175F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0939F, -0.2135F, 0.1536F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = frontLeftLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, 1.9F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4061F, 3.5485F, -1.452F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r105 = frontLeftLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(105, 134).addBox(-0.5F, 1.5F, 1.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4061F, 3.5485F, -1.452F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r106 = frontLeftLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 87).addBox(-0.5F, -2.6F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4061F, 1.2865F, -0.2464F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.115F, 6.6807F, 1.1667F, -0.6999F, 0.149F, 0.3069F));

		PartDefinition cube_r107 = frontLeftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(95, 134).addBox(-0.5F, -2.5F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2269F, 2.7893F, 1.1245F, 0.0566F, -0.0508F, -0.1671F));

		PartDefinition cube_r108 = frontLeftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 130).addBox(-0.6F, -0.225F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2966F, 2.4604F, 0.51F, -0.0519F, 0.0106F, 0.0866F));

		PartDefinition cube_r109 = frontLeftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 130).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4555F, 3.3725F, -0.5003F, -0.0785F, 0.0004F, -0.0436F));

		PartDefinition cube_r110 = frontLeftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 130).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4555F, 3.3725F, -0.5003F, 0.0087F, -0.0008F, 0.0873F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(113, 82).addBox(-3.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2697F, 6.4295F, -0.3617F, 0.3918F, 0.0334F, -0.0806F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create().texOffs(66, 40).addBox(1.5F, -0.6F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.5F, 0.1F, -1.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = neckbase.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0342F, 5.1901F, -0.6552F, 0.1109F, -0.0232F, 0.5095F));

		PartDefinition cube_r111 = frontRightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(90, 130).addBox(0.0F, -1.175F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0939F, -0.2135F, 0.1536F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r112 = frontRightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(135, 13).addBox(-0.5F, 1.9F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4061F, 3.5485F, -1.452F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r113 = frontRightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(10, 135).addBox(-0.5F, 1.5F, 1.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4061F, 3.5485F, -1.452F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r114 = frontRightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(63, 98).addBox(-0.5F, -2.6F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4061F, 1.2865F, -0.2464F, 0.0873F, 0.0F, 0.0F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.115F, 6.6807F, 1.1667F, -0.7606F, -0.0055F, -0.0871F));

		PartDefinition cube_r115 = frontRightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(134, 98).addBox(-0.5F, -2.5F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2269F, 2.7893F, 1.1245F, 0.0566F, 0.0508F, 0.1671F));

		PartDefinition cube_r116 = frontRightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(80, 130).addBox(-0.4F, -0.225F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2966F, 2.4604F, 0.51F, -0.0519F, -0.0106F, -0.0866F));

		PartDefinition cube_r117 = frontRightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(75, 130).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4555F, 3.3725F, -0.5003F, -0.0785F, -0.0004F, 0.0436F));

		PartDefinition cube_r118 = frontRightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(130, 66).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4555F, 3.3725F, -0.5003F, 0.0087F, 0.0008F, -0.0873F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(90, 115).addBox(-1.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2697F, 6.4295F, -0.3617F, 1.1591F, 0.0805F, -0.4737F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create().texOffs(110, 10).addBox(-5.5F, -0.6F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.5F, 0.1F, -1.3F, -0.6545F, 0.0F, 0.0F));

		PartDefinition chest = neckbase.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4422F, -5.7078F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 115).addBox(-1.0F, -0.5918F, -2.8353F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(55, 144).mirror().addBox(-0.1132F, -0.0304F, -1.1355F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5966F, 0.5734F, 1.9121F, 0.313F, 0.236F, -0.6576F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(144, 62).mirror().addBox(-1.072F, -0.0748F, -1.1379F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5966F, 0.5734F, 1.9121F, 0.168F, 0.3747F, -1.1307F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(113, 122).mirror().addBox(-1.3965F, -0.0663F, -1.7026F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5966F, 0.5734F, 1.9121F, 0.1563F, 0.0301F, -1.1879F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 144).mirror().addBox(-0.9925F, -0.0679F, -0.428F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5966F, 0.5734F, 1.9121F, 0.1966F, 0.6494F, -1.0728F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(129, 108).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1596F, 2.8351F, -1.0871F, 0.1279F, 0.1442F, -1.2589F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 144).mirror().addBox(0.0F, 0.0069F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9736F, 2.9514F, -2.0627F, 0.2133F, 0.059F, -1.2776F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(45, 144).mirror().addBox(0.0F, 0.0085F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7153F, 2.7998F, -3.0168F, 0.2511F, -0.5536F, -1.4244F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(144, 38).mirror().addBox(-1.7084F, -0.5079F, -0.5732F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4F, -2.0F, 0.218F, -0.2139F, -1.3373F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(144, 36).mirror().addBox(-0.8632F, -0.1311F, -0.5534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4F, -2.0F, 0.0912F, -0.3127F, -0.8595F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(65, 144).addBox(-0.0075F, -0.0679F, -0.428F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5966F, 0.5734F, 1.9121F, 0.1966F, -0.6494F, 1.0728F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(113, 122).addBox(0.3965F, -0.0663F, -1.7026F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5966F, 0.5734F, 1.9121F, 0.1563F, -0.0301F, 1.1879F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(144, 62).addBox(0.072F, -0.0748F, -1.1379F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5966F, 0.5734F, 1.9121F, 0.168F, -0.3747F, 1.1307F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 144).addBox(-0.8868F, -0.0304F, -1.1355F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5966F, 0.5734F, 1.9121F, 0.313F, -0.236F, 0.6576F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(45, 144).addBox(-1.0F, 0.0085F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7153F, 2.7998F, -3.0168F, 0.2511F, 0.5536F, 1.4244F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(129, 108).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1596F, 2.8351F, -1.0871F, 0.1279F, -0.1442F, 1.2589F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 144).addBox(-1.0F, 0.0069F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9736F, 2.9514F, -2.0627F, 0.2133F, -0.059F, 1.2776F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(144, 38).addBox(0.7084F, -0.5079F, -0.5732F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4F, -2.0F, 0.218F, 0.2139F, 1.3373F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(144, 36).addBox(-0.1368F, -0.1311F, -0.5534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4F, -2.0F, 0.0912F, 0.3127F, 0.8595F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(113, 128).addBox(0.0F, -1.4396F, -1.8218F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(83, 61).addBox(-1.0F, -1.2F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8801F, -2.4363F, -0.0134F, -0.2618F, 0.0035F));

		PartDefinition cube_r139 = neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 113).mirror().addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3098F, 1.2324F, -6.1028F, -0.0873F, -0.1309F, 0.1745F));

		PartDefinition cube_r140 = neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(107, 113).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3098F, 1.2324F, -6.1028F, -0.0873F, 0.1309F, -0.1745F));

		PartDefinition cube_r141 = neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(132, 7).addBox(0.0F, -0.8516F, -0.1565F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6359F, -7.6332F, -0.5672F, 0.1309F, -0.1745F));

		PartDefinition cube_r142 = neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(132, 119).addBox(-0.005F, -0.5F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8433F, -5.1611F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(42, 116).addBox(0.0F, -0.5F, -4.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -1.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(35, 17).addBox(-1.0F, -1.3F, -12.9F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0799F, -7.799F, -0.1548F, -0.1802F, -0.0232F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(107, 105).addBox(0.0F, -0.225F, 0.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1506F, -12.0393F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(66, 107).addBox(0.0F, -0.225F, -5.9F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -0.1F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(100, 72).mirror().addBox(-1.0709F, -1.0152F, 0.1258F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8645F, 1.6975F, 0.2097F, 0.0605F, -0.0862F, 0.0137F));

		PartDefinition cube_r147 = neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(29, 46).mirror().addBox(-1.0709F, -0.7152F, 1.4259F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3794F, 0.4093F, -13.9809F, -0.0704F, -0.0862F, 0.0137F));

		PartDefinition cube_r148 = neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(100, 72).addBox(1.0709F, -1.0152F, 0.1258F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8645F, 1.6975F, 0.2097F, 0.0605F, 0.0862F, -0.0137F));

		PartDefinition cube_r149 = neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(29, 46).addBox(1.0709F, -0.7152F, 1.4259F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3794F, 0.4093F, -13.9809F, -0.0704F, 0.0862F, -0.0137F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.3F, -14.4F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0306F, -12.9228F, -0.1276F, -0.1749F, -0.0865F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(107, 97).addBox(0.0F, -0.4F, -5.9F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8791F, -7.0888F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(94, 107).addBox(0.0F, -0.4F, -4.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.1491F, -1.0909F, 0.0671F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3349F, 0.6087F, -13.4148F, -0.0704F, -0.0862F, 0.0137F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 0).addBox(2.1491F, -1.0909F, 0.0671F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3349F, 0.6087F, -13.4148F, -0.0704F, 0.0862F, -0.0137F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(19, 99).addBox(0.0F, -1.3812F, -6.8945F, 0.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0475F, -14.4804F, 0.0454F, -0.2579F, -0.0454F));

		PartDefinition cube_r154 = neck4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-2.9819F, -0.7087F, 0.3743F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2107F, 0.2426F, -9.8171F, -0.0791F, -0.0862F, 0.0137F));

		PartDefinition cube_r155 = neck4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(35, 0).addBox(2.9819F, -0.7087F, 0.3743F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2107F, 0.2426F, -9.8171F, -0.0791F, 0.0862F, -0.0137F));

		PartDefinition cube_r156 = neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 46).addBox(-1.0F, -0.3F, 0.7F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.4062F, -10.8945F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2611F, -9.6959F, 0.1756F, -0.3653F, -0.1474F));

		PartDefinition cube_r157 = neck5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(110, 21).addBox(0.0F, -1.8F, -5.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.309F, -0.9511F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-3.8913F, -1.5494F, -0.2376F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0851F, -1.5898F, -8.8196F, -0.3497F, -0.0862F, 0.0137F));

		PartDefinition cube_r159 = neck5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 52).addBox(3.8913F, -1.5494F, -0.2376F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0851F, -1.5898F, -8.8196F, -0.3497F, 0.0862F, -0.0137F));

		PartDefinition cube_r160 = neck5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 14).addBox(-1.0F, -1.7F, -1.2F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3389F, -8.4929F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0785F, -9.2715F, 0.3374F, -0.2892F, -0.0997F));

		PartDefinition cube_r161 = neck6.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(22, 116).addBox(0.0F, -1.5F, -2.9F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5972F, -1.1447F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r162 = neck6.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(-4.5608F, -0.7234F, -0.4196F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7467F, -4.262F, -7.5095F, -0.6245F, -0.0862F, 0.0137F));

		PartDefinition cube_r163 = neck6.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(54, 74).addBox(4.5608F, -0.7234F, -0.4196F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7467F, -4.262F, -7.5095F, -0.6245F, 0.0862F, -0.0137F));

		PartDefinition cube_r164 = neck6.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(66, 27).addBox(-1.0F, -0.275F, -1.25F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -5.3428F, -6.7579F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.3174F, -7.8831F, 0.1021F, -0.3474F, -0.0349F));

		PartDefinition cube_r165 = neck7.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, -1.6F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3183F, -0.6471F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck7.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-5.2978F, -1.3683F, 0.3611F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5018F, -3.633F, -8.4472F, -0.594F, -0.0862F, 0.0137F));

		PartDefinition cube_r167 = neck7.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(25, 75).addBox(5.2978F, -1.3683F, 0.3611F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5018F, -3.633F, -8.4472F, -0.594F, 0.0862F, -0.0137F));

		PartDefinition cube_r168 = neck7.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -0.5F, -0.175F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.5163F, -7.9086F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4817F, -8.1471F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r169 = neck8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(132, 3).addBox(0.0F, -1.6F, -2.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(77, 74).addBox(-1.0F, -0.2296F, -0.1799F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -4.1708F, -7.7288F, -0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-6.0279F, -1.3231F, 0.6362F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2673F, -2.2519F, -8.6674F, -0.3671F, -0.0862F, 0.0137F));

		PartDefinition cube_r172 = neck8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 91).addBox(6.0279F, -1.3231F, 0.6362F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2673F, -2.2519F, -8.6674F, -0.3671F, 0.0862F, -0.0137F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2811F, -7.9392F, -0.1913F, -0.3794F, 0.1003F));

		PartDefinition cube_r173 = neck9.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(74, 94).addBox(0.0F, -1.4F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1504F, -0.4769F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r174 = neck9.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(36, 107).mirror().addBox(-6.6278F, -0.6835F, 0.9784F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.8769F, 0.9785F, -7.9954F, -0.018F, -0.0862F, 0.0137F));

		PartDefinition cube_r175 = neck9.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(36, 107).addBox(6.6278F, -0.6835F, 0.9784F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8769F, 0.9785F, -7.9954F, -0.018F, 0.0862F, -0.0137F));

		PartDefinition cube_r176 = neck9.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(48, 87).addBox(-1.0F, -0.3028F, -0.1107F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4868F, -7.6827F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1504F, -7.4769F, 0.3119F, -0.3488F, 0.0127F));

		PartDefinition cube_r177 = neck10.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(110, 130).addBox(0.0F, -0.9F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 107).addBox(-1.0F, -0.7981F, -3.8F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck10.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(117, 72).mirror().addBox(-6.8713F, -0.3988F, 0.717F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0974F, 1.2698F, -3.1408F, 0.0256F, -0.0862F, 0.0137F));

		PartDefinition cube_r179 = neck10.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(117, 72).addBox(6.8713F, -0.3988F, 0.717F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0974F, 1.2698F, -3.1408F, 0.0256F, 0.0862F, -0.0137F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8982F, -3.3768F, 0.4358F, 0.0F, -0.0346F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.9F, -0.6F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r180 = lowerjaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(106, 126).mirror().addBox(-0.2689F, -0.2237F, -2.1718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.0044F, -0.1047F, 0.0F));

		PartDefinition cube_r181 = lowerjaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(137, 56).mirror().addBox(-0.2588F, -0.8605F, -0.9041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -0.0983F, -0.8418F, 0.0092F));

		PartDefinition cube_r182 = lowerjaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(137, 27).mirror().addBox(-0.3316F, -0.6781F, -0.8107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(137, 3).mirror().addBox(-0.3316F, -0.6781F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.225F, -0.3639F, -6.7143F, -0.1807F, -0.3182F, 0.0064F));

		PartDefinition cube_r183 = lowerjaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(25, 141).mirror().addBox(-0.2917F, -1.0607F, -0.4442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(20, 141).mirror().addBox(-0.2917F, -0.7607F, -0.6442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(139, 62).mirror().addBox(-0.2917F, -1.0607F, -0.9442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 138).mirror().addBox(-0.2917F, -0.7607F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.2389F, -6.2143F, -0.0928F, -0.2135F, 0.0063F));

		PartDefinition cube_r184 = lowerjaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(15, 141).mirror().addBox(-0.334F, -0.5849F, -2.1592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(140, 138).mirror().addBox(-0.334F, -0.5849F, -1.7592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.0925F, -0.1786F, 0.0062F));

		PartDefinition cube_r185 = lowerjaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(93, 126).mirror().addBox(-0.3376F, -0.4642F, -1.669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, -0.0832F, -0.0739F, 0.0061F));

		PartDefinition cube_r186 = lowerjaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(115, 140).mirror().addBox(-0.334F, -0.5802F, -0.5702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(110, 140).mirror().addBox(-0.334F, -0.5802F, -0.9702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(110, 137).mirror().addBox(-0.334F, -0.5802F, -1.3702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.0838F, -0.1786F, 0.0062F));

		PartDefinition cube_r187 = lowerjaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(143, 81).mirror().addBox(-0.1602F, 0.7378F, -1.3878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(143, 78).mirror().addBox(-0.1602F, 0.7378F, -1.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.7242F, -0.8063F, -0.4221F));

		PartDefinition cube_r188 = lowerjaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(140, 89).mirror().addBox(-0.1602F, 0.6562F, -1.1465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.602F, -0.8063F, -0.4221F));

		PartDefinition cube_r189 = lowerjaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(140, 86).mirror().addBox(-0.1244F, 0.5404F, -1.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.42F, -0.7804F, -0.432F));

		PartDefinition cube_r190 = lowerjaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(140, 75).mirror().addBox(-0.1244F, 0.4559F, -1.117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.2891F, -0.7804F, -0.432F));

		PartDefinition cube_r191 = lowerjaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(143, 71).mirror().addBox(-0.2631F, 0.5373F, -1.4226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(143, 68).mirror().addBox(-0.2631F, 0.5373F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(0, 143).mirror().addBox(-0.2631F, 0.5373F, -1.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -2.1964F, -0.8288F, -0.2554F));

		PartDefinition cube_r192 = lowerjaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(140, 65).mirror().addBox(-0.2084F, 0.2044F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.4909F, -0.8398F, -0.373F));

		PartDefinition cube_r193 = lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(140, 51).mirror().addBox(-0.2084F, 0.28F, -1.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.6218F, -0.8398F, -0.373F));

		PartDefinition cube_r194 = lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-0.2631F, 0.4773F, -0.9581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -2.0742F, -0.8288F, -0.2554F));

		PartDefinition cube_r195 = lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(142, 125).mirror().addBox(-0.1862F, 0.2514F, -1.4816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(125, 142).mirror().addBox(-0.1862F, 0.2514F, -1.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -2.0808F, -0.799F, -0.4165F));

		PartDefinition cube_r196 = lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(140, 48).mirror().addBox(-0.1862F, 0.162F, -1.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.9586F, -0.799F, -0.4165F));

		PartDefinition cube_r197 = lowerjaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(142, 122).mirror().addBox(-0.1862F, -0.192F, -1.2665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.4787F, -0.799F, -0.4165F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(120, 142).mirror().addBox(-0.1862F, -0.2843F, -1.1282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -1.3478F, -0.799F, -0.4165F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(142, 119).mirror().addBox(-0.2391F, -0.3673F, -1.0502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.125F, -0.4639F, -7.1643F, -1.5384F, -0.3911F, -0.256F));

		PartDefinition cube_r200 = lowerjaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(142, 116).mirror().addBox(-0.2591F, -0.4203F, -1.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.225F, -0.3639F, -6.7143F, -1.387F, -0.3066F, -0.2481F));

		PartDefinition cube_r201 = lowerjaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(142, 113).mirror().addBox(-0.189F, -0.3149F, -1.338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.2389F, -6.2143F, -1.4132F, -0.205F, -0.2414F));

		PartDefinition cube_r202 = lowerjaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(140, 45).mirror().addBox(-0.2588F, -0.7071F, -1.29F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -0.3601F, -0.8418F, 0.0092F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(140, 12).mirror().addBox(-0.4517F, -0.7399F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(85, 141).addBox(-0.2517F, -0.7399F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(140, 12).addBox(0.1483F, -0.7399F, -0.5658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.2483F, -0.7284F, -7.8323F, 0.2508F, 0.0F, 0.0F));

		PartDefinition cube_r204 = lowerjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.4517F, -0.4494F, -0.4752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(90, 141).addBox(-0.2517F, -0.4494F, -0.4752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(0, 140).addBox(0.1483F, -0.4494F, -0.4752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2483F, -0.7284F, -7.8323F, -1.2328F, 0.0F, 0.0F));

		PartDefinition cube_r205 = lowerjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(135, 66).mirror().addBox(-0.2088F, -0.6566F, -1.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 135).mirror().addBox(-0.2088F, -0.6566F, -0.7413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, 0.2551F, -0.8957F, -0.1974F));

		PartDefinition cube_r206 = lowerjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(125, 139).mirror().addBox(-0.4517F, -0.3676F, -0.2894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(80, 141).addBox(-0.2517F, -0.3676F, -0.2894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(125, 139).addBox(0.1483F, -0.3676F, -0.2894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.2483F, -0.7284F, -7.8323F, -0.491F, 0.0F, 0.0F));

		PartDefinition cube_r207 = lowerjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(137, 6).mirror().addBox(-0.2852F, -0.6766F, -0.6818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.125F, -0.4639F, -7.1643F, 0.1241F, -0.4055F, 0.0067F));

		PartDefinition cube_r208 = lowerjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(120, 139).mirror().addBox(-0.2588F, -0.884F, -0.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -0.4639F, -7.4643F, -0.0547F, -0.8418F, 0.0092F));

		PartDefinition cube_r209 = lowerjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(100, 139).mirror().addBox(-0.2852F, -0.8688F, -0.6544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.125F, -0.4639F, -7.1643F, -0.0504F, -0.4055F, 0.0067F));

		PartDefinition cube_r210 = lowerjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(139, 98).mirror().addBox(-0.3316F, -0.9802F, -0.678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.225F, -0.3639F, -6.7143F, 0.0374F, -0.3182F, 0.0064F));

		PartDefinition cube_r211 = lowerjaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(139, 95).mirror().addBox(-0.334F, -0.7699F, -1.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.2758F, -0.1786F, 0.0062F));

		PartDefinition cube_r212 = lowerjaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(139, 92).mirror().addBox(-0.334F, -0.9694F, -2.0588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.1362F, -0.1786F, 0.0062F));

		PartDefinition cube_r213 = lowerjaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-0.2879F, -1.172F, -0.3793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.2389F, -6.2143F, 0.0733F, -0.2136F, 0.0007F));

		PartDefinition cube_r214 = lowerjaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 137).mirror().addBox(-0.2917F, -1.1807F, -0.6874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.2389F, -6.2143F, 0.169F, -0.2135F, 0.0063F));

		PartDefinition cube_r215 = lowerjaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(125, 136).mirror().addBox(-0.3376F, -0.791F, -1.743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, -0.0744F, -0.0739F, 0.0061F));

		PartDefinition cube_r216 = lowerjaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(120, 136).mirror().addBox(-0.334F, -0.8756F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.3762F, -0.1786F, 0.0062F));

		PartDefinition cube_r217 = lowerjaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(86, 126).mirror().addBox(-0.3376F, -0.3011F, -1.7329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, -0.2228F, -0.0739F, 0.0061F));

		PartDefinition cube_r218 = lowerjaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(133, 71).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7217F, -0.5233F, -1.9165F, -1.4486F, -0.1047F, 0.0F));

		PartDefinition cube_r219 = lowerjaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(141, 107).mirror().addBox(-0.189F, -0.635F, -1.3184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.2389F, -6.2143F, -1.5005F, -0.205F, -0.2414F));

		PartDefinition cube_r220 = lowerjaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(65, 138).mirror().addBox(-0.3402F, -1.2239F, -1.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.1144F, -0.1786F, 0.0062F));

		PartDefinition cube_r221 = lowerjaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(83, 135).mirror().addBox(-0.334F, -1.1909F, -1.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(78, 135).mirror().addBox(-0.334F, -1.1909F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(123, 67).mirror().addBox(-0.334F, -0.9909F, -1.9585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.2389F, -4.3143F, -0.0707F, -0.1786F, 0.0062F));

		PartDefinition cube_r222 = lowerjaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(60, 138).mirror().addBox(-0.3376F, -0.9185F, -0.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, -0.0352F, -0.0739F, 0.0061F));

		PartDefinition cube_r223 = lowerjaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(55, 138).mirror().addBox(-0.3376F, -1.0962F, -1.4102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, 0.0608F, -0.0739F, 0.0061F));

		PartDefinition cube_r224 = lowerjaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(28, 124).mirror().addBox(-0.3376F, -0.7312F, -1.385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.775F, -0.2389F, -2.9143F, -0.1181F, -0.0739F, 0.0061F));

		PartDefinition cube_r225 = lowerjaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(123, 50).mirror().addBox(-0.2689F, -0.5316F, -3.5374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r226 = lowerjaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(45, 138).mirror().addBox(-0.2689F, -0.1597F, -2.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(40, 138).mirror().addBox(-0.2689F, -0.2585F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.1833F, -0.1047F, 0.0F));

		PartDefinition cube_r227 = lowerjaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(35, 138).mirror().addBox(-0.2689F, -0.1941F, -0.9491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.4102F, -0.1047F, 0.0F));

		PartDefinition cube_r228 = lowerjaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(123, 46).mirror().addBox(-0.2689F, -0.3017F, -2.3571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.2574F, -0.1047F, 0.0F));

		PartDefinition cube_r229 = lowerjaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(123, 28).mirror().addBox(-0.2689F, -0.1238F, -3.5442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.0567F, -0.1047F, 0.0F));

		PartDefinition cube_r230 = lowerjaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(119, 86).mirror().addBox(-0.2689F, -0.1699F, -2.1352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.175F, -0.2389F, 0.1857F, -0.0829F, -0.1047F, 0.0F));

		PartDefinition cube_r231 = lowerjaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(28, 124).addBox(-0.6624F, -0.7312F, -1.385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, -0.1181F, 0.0739F, -0.0061F));

		PartDefinition cube_r232 = lowerjaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(125, 136).addBox(-0.6624F, -0.791F, -1.743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, -0.0744F, 0.0739F, -0.0061F));

		PartDefinition cube_r233 = lowerjaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(65, 138).addBox(-0.6598F, -1.2239F, -1.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.1144F, 0.1786F, -0.0062F));

		PartDefinition cube_r234 = lowerjaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(83, 135).addBox(-0.666F, -1.1909F, -1.3585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(78, 135).addBox(-0.666F, -1.1909F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(123, 67).addBox(-0.666F, -0.9909F, -1.9585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.0707F, 0.1786F, -0.0062F));

		PartDefinition cube_r235 = lowerjaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 138).addBox(-0.6624F, -0.9185F, -0.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, -0.0352F, 0.0739F, -0.0061F));

		PartDefinition cube_r236 = lowerjaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(55, 138).addBox(-0.6624F, -1.0962F, -1.4102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, 0.0608F, 0.0739F, -0.0061F));

		PartDefinition cube_r237 = lowerjaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(120, 136).addBox(-0.666F, -0.8756F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.3762F, 0.1786F, -0.0062F));

		PartDefinition cube_r238 = lowerjaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(139, 95).addBox(-0.666F, -0.7699F, -1.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.2758F, 0.1786F, -0.0062F));

		PartDefinition cube_r239 = lowerjaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(139, 92).addBox(-0.666F, -0.9694F, -2.0588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.1362F, 0.1786F, -0.0062F));

		PartDefinition cube_r240 = lowerjaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(137, 0).addBox(-0.7121F, -1.172F, -0.3793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.575F, -0.2389F, -6.2143F, 0.0733F, 0.2136F, -0.0007F));

		PartDefinition cube_r241 = lowerjaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(120, 139).addBox(-0.7412F, -0.884F, -0.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -0.0547F, 0.8418F, -0.0092F));

		PartDefinition cube_r242 = lowerjaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(100, 139).addBox(-0.7148F, -0.8688F, -0.6544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.325F, -0.4639F, -7.1643F, -0.0504F, 0.4055F, -0.0067F));

		PartDefinition cube_r243 = lowerjaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(139, 98).addBox(-0.6684F, -0.9802F, -0.678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.425F, -0.3639F, -6.7143F, 0.0374F, 0.3182F, -0.0064F));

		PartDefinition cube_r244 = lowerjaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 137).addBox(-0.7083F, -1.1807F, -0.6874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(1.575F, -0.2389F, -6.2143F, 0.169F, 0.2135F, -0.0063F));

		PartDefinition cube_r245 = lowerjaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(25, 141).addBox(-0.7083F, -1.0607F, -0.4442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(139, 62).addBox(-0.7083F, -1.0607F, -0.9442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 141).addBox(-0.7083F, -0.7607F, -0.6442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(50, 138).addBox(-0.7083F, -0.7607F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.575F, -0.2389F, -6.2143F, -0.0928F, 0.2135F, -0.0063F));

		PartDefinition cube_r246 = lowerjaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(15, 141).addBox(-0.666F, -0.5849F, -2.1592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(140, 138).addBox(-0.666F, -0.5849F, -1.7592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.0925F, 0.1786F, -0.0062F));

		PartDefinition cube_r247 = lowerjaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(140, 45).addBox(-0.7412F, -0.7071F, -1.29F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -0.3601F, 0.8418F, -0.0092F));

		PartDefinition cube_r248 = lowerjaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(137, 56).addBox(-0.7412F, -0.8605F, -0.9041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -0.0983F, 0.8418F, -0.0092F));

		PartDefinition cube_r249 = lowerjaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(135, 66).addBox(-0.7912F, -0.6566F, -1.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 135).addBox(-0.7912F, -0.6566F, -0.7413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, 0.2551F, 0.8957F, 0.1974F));

		PartDefinition cube_r250 = lowerjaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(137, 6).addBox(-0.7148F, -0.6766F, -0.6818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.325F, -0.4639F, -7.1643F, 0.1241F, 0.4055F, -0.0067F));

		PartDefinition cube_r251 = lowerjaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(137, 27).addBox(-0.6684F, -0.6781F, -0.8107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(137, 3).addBox(-0.6684F, -0.6781F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.425F, -0.3639F, -6.7143F, -0.1807F, 0.3182F, -0.0064F));

		PartDefinition cube_r252 = lowerjaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(140, 75).addBox(-0.8756F, 0.4559F, -1.117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.2891F, 0.7804F, 0.432F));

		PartDefinition cube_r253 = lowerjaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(140, 86).addBox(-0.8756F, 0.5404F, -1.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.42F, 0.7804F, 0.432F));

		PartDefinition cube_r254 = lowerjaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(143, 81).addBox(-0.8398F, 0.7378F, -1.3878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(143, 78).addBox(-0.8398F, 0.7378F, -1.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.7242F, 0.8063F, 0.4221F));

		PartDefinition cube_r255 = lowerjaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(140, 89).addBox(-0.8398F, 0.6562F, -1.1465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.602F, 0.8063F, 0.4221F));

		PartDefinition cube_r256 = lowerjaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(143, 71).addBox(-0.7369F, 0.5373F, -1.4226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 143).addBox(-0.7369F, 0.5373F, -1.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(143, 68).addBox(-0.7369F, 0.5373F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -2.1964F, 0.8288F, 0.2554F));

		PartDefinition cube_r257 = lowerjaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(143, 23).addBox(-0.7369F, 0.4773F, -0.9581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -2.0742F, 0.8288F, 0.2554F));

		PartDefinition cube_r258 = lowerjaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(140, 51).addBox(-0.7916F, 0.28F, -1.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.6218F, 0.8398F, 0.373F));

		PartDefinition cube_r259 = lowerjaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(140, 65).addBox(-0.7916F, 0.2044F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.4909F, 0.8398F, 0.373F));

		PartDefinition cube_r260 = lowerjaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(140, 48).addBox(-0.8138F, 0.162F, -1.1802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.9586F, 0.799F, 0.4165F));

		PartDefinition cube_r261 = lowerjaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(142, 125).addBox(-0.8138F, 0.2514F, -1.4816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(125, 142).addBox(-0.8138F, 0.2514F, -1.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -2.0808F, 0.799F, 0.4165F));

		PartDefinition cube_r262 = lowerjaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(142, 122).addBox(-0.8138F, -0.192F, -1.2665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.4787F, 0.799F, 0.4165F));

		PartDefinition cube_r263 = lowerjaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(120, 142).addBox(-0.8138F, -0.2843F, -1.1282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(1.225F, -0.4639F, -7.4643F, -1.3478F, 0.799F, 0.4165F));

		PartDefinition cube_r264 = lowerjaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(142, 119).addBox(-0.7609F, -0.3673F, -1.0502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.325F, -0.4639F, -7.1643F, -1.5384F, 0.3911F, 0.256F));

		PartDefinition cube_r265 = lowerjaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(142, 116).addBox(-0.7409F, -0.4203F, -1.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.425F, -0.3639F, -6.7143F, -1.387F, 0.3066F, 0.2481F));

		PartDefinition cube_r266 = lowerjaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(142, 113).addBox(-0.811F, -0.3149F, -1.338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.575F, -0.2389F, -6.2143F, -1.4132F, 0.205F, 0.2414F));

		PartDefinition cube_r267 = lowerjaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(141, 107).addBox(-0.811F, -0.635F, -1.3184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.575F, -0.2389F, -6.2143F, -1.5005F, 0.205F, 0.2414F));

		PartDefinition cube_r268 = lowerjaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(86, 126).addBox(-0.6624F, -0.3011F, -1.7329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, -0.2228F, 0.0739F, -0.0061F));

		PartDefinition cube_r269 = lowerjaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 126).addBox(-0.6624F, -0.4642F, -1.669F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.975F, -0.2389F, -2.9143F, -0.0832F, 0.0739F, -0.0061F));

		PartDefinition cube_r270 = lowerjaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(115, 140).addBox(-0.666F, -0.5802F, -0.5702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(110, 140).addBox(-0.666F, -0.5802F, -0.9702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(110, 137).addBox(-0.666F, -0.5802F, -1.3702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.875F, -0.2389F, -4.3143F, -0.0838F, 0.1786F, -0.0062F));

		PartDefinition cube_r271 = lowerjaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(106, 126).addBox(-0.7311F, -0.2237F, -2.1718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.0044F, 0.1047F, 0.0F));

		PartDefinition cube_r272 = lowerjaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(123, 28).addBox(-0.7311F, -0.1238F, -3.5442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.0567F, 0.1047F, 0.0F));

		PartDefinition cube_r273 = lowerjaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(40, 138).addBox(-0.7311F, -0.2585F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 138).addBox(-0.7311F, -0.1597F, -2.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.1833F, 0.1047F, 0.0F));

		PartDefinition cube_r274 = lowerjaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(35, 138).addBox(-0.7311F, -0.1941F, -0.9491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.4102F, 0.1047F, 0.0F));

		PartDefinition cube_r275 = lowerjaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 46).addBox(-0.7311F, -0.3017F, -2.3571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.2574F, 0.1047F, 0.0F));

		PartDefinition cube_r276 = lowerjaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(123, 50).addBox(-0.7311F, -0.5316F, -3.5374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r277 = lowerjaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(133, 71).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9217F, -0.5233F, -1.9165F, -1.4486F, 0.1047F, 0.0F));

		PartDefinition cube_r278 = lowerjaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(119, 86).addBox(-0.7311F, -0.1699F, -2.1352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.375F, -0.2389F, 0.1857F, -0.0829F, 0.1047F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6622F, -0.4282F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r279 = upperjaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(117, 94).addBox(-2.0F, -0.6193F, -0.307F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0358F, -0.827F, -1.8108F, 0.0F, 0.0F));

		PartDefinition cube_r280 = upperjaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(65, 121).addBox(-0.5F, -0.7283F, -0.5719F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.5F, -0.1305F, -5.4529F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r281 = upperjaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(13, 116).addBox(-1.0F, -0.8283F, -0.6969F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5F, -0.305F, -1.4567F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r282 = upperjaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(127, 42).addBox(-0.5F, -0.2331F, 0.0374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.3358F, -4.1021F, -1.4879F, 0.0F, 0.0F));

		PartDefinition cube_r283 = upperjaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(130, 28).addBox(-1.0F, -0.575F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1013F, -7.6335F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r284 = upperjaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(123, 132).addBox(0.0F, -1.4017F, -0.4084F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5F, 0.0337F, -8.2758F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r285 = upperjaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(139, 42).addBox(-0.1F, -0.2017F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(138, 72).addBox(0.1F, -0.2017F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(139, 33).addBox(-0.1F, -0.4017F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 138).addBox(0.1F, -0.4017F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5F, -0.1531F, -8.041F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r286 = upperjaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(139, 39).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.3772F, 0.0082F, -8.0383F, -0.8933F, 0.225F, 0.4211F));

		PartDefinition cube_r287 = upperjaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(139, 36).addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, -0.0985F, -8.1232F, -0.9079F, -0.1191F, 0.151F));

		PartDefinition cube_r288 = upperjaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(139, 30).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -0.2567F, -7.8678F, -1.0811F, -0.0912F, 0.1692F));

		PartDefinition cube_r289 = upperjaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(20, 138).addBox(0.0F, -0.3017F, -0.3084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.5F, -0.344F, -7.6895F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r290 = upperjaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(15, 138).addBox(-0.5F, -0.6632F, -0.3102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.3545F, -7.6576F, -1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r291 = upperjaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(133, 23).addBox(0.4F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.8057F, -5.5737F, -1.4334F, -0.0432F, 0.3025F));

		PartDefinition cube_r292 = upperjaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(128, 23).addBox(0.0F, -2.5026F, -0.1945F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8108F, -5.577F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r293 = upperjaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(31, 121).addBox(-1.0F, -0.2126F, -0.208F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0358F, -4.6521F, -1.2261F, 0.0F, 0.0F));

		PartDefinition cube_r294 = upperjaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(120, 102).addBox(-1.0F, -1.1865F, -0.2095F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.3358F, -4.1021F, -1.069F, 0.0F, 0.0F));

		PartDefinition cube_r295 = upperjaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(90, 119).addBox(-2.5F, -0.1834F, -0.2138F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.6738F, -3.6607F, -0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r296 = upperjaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(112, 34).addBox(-2.5F, -0.1834F, -0.2138F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5F, -1.9392F, -3.1226F, -1.1126F, 0.0F, 0.0F));

		PartDefinition cube_r297 = upperjaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(100, 82).addBox(-2.5F, -0.2056F, -0.1875F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -2.1358F, -2.577F, -1.2697F, 0.0F, 0.0F));

		PartDefinition cube_r298 = upperjaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(110, 29).addBox(-2.0F, -0.6008F, -0.2023F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -2.1396F, -1.3858F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r299 = upperjaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(95, 141).addBox(-0.5F, -0.2008F, -0.2273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -2.1773F, -0.972F, -1.4181F, 0.0F, 0.0F));

		PartDefinition cube_r300 = upperjaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(93, 10).addBox(-2.0F, -0.2008F, -0.2023F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -2.1773F, -0.972F, -1.4748F, 0.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5212F, -0.5079F, -5.5428F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(136, 105).addBox(-0.55F, -0.0238F, -0.7125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, -0.1745F, 0.1222F, 0.0175F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(136, 108).addBox(-0.275F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(135, 89).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.0353F, -0.703F, 3.0435F, 0.0873F, 0.1222F, 0.0175F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(25, 135).addBox(-0.45F, -0.0405F, 0.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, -1.9023F, 0.1222F, 0.0175F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(20, 135).addBox(-0.45F, 0.3799F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, -1.1518F, 0.1222F, 0.0175F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(30, 135).addBox(-0.45F, -0.2795F, -1.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, -0.4013F, 0.1222F, 0.0175F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(136, 102).addBox(-0.55F, -1.1575F, 0.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(100, 136).addBox(-0.55F, -0.6075F, 0.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, -0.2617F, 0.1222F, 0.0175F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 135).addBox(-0.55F, -0.0041F, 0.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(135, 86).addBox(-0.55F, -0.0041F, -0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1978F, -0.6919F, 2.9325F, 0.0175F, 0.1222F, 0.0175F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(135, 77).addBox(0.0227F, 0.0629F, -1.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -0.0947F, 0.2701F, 1.0522F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 138).addBox(0.2691F, 0.3612F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -0.5515F, 0.4641F, 0.8275F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(73, 135).addBox(-0.2525F, 0.4173F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -0.6637F, 0.258F, 0.5139F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(21, 123).addBox(-1.6134F, -0.4006F, -0.5937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.5218F, -1.1934F, 2.1683F, -0.7642F, 0.2044F, 0.0038F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(123, 15).addBox(-1.6F, -1.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.8694F, -1.639F, 3.4748F, -1.8135F, -0.1671F, -0.0456F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(128, 86).addBox(-1.0029F, -1.2836F, -0.9738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -1.5415F, -0.0457F, -0.0592F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(26, 128).addBox(-1.0029F, -1.1127F, -0.9372F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -1.4892F, -0.0457F, -0.0592F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(49, 126).addBox(-1.2701F, -1.2068F, -0.7772F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3426F, -1.1069F, 2.5931F, -1.2253F, 0.36F, -0.0103F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(132, 123).addBox(-0.6811F, -0.7917F, -0.7054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -2.6266F, 0.0261F, 0.0032F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(125, 54).addBox(-0.6811F, -1.0595F, -1.128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -1.3612F, 0.0261F, 0.0032F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(25, 138).addBox(-0.6811F, -0.8642F, 0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -1.0121F, 0.0261F, 0.0032F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(115, 133).addBox(-0.525F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3664F, -1.2908F, 4.2815F, -1.5988F, 0.06F, 0.0058F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(138, 80).addBox(-0.2077F, -0.703F, -1.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7643F, 0.5183F, 2.1644F, -0.9724F, 0.0456F, 0.0377F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(72, 125).addBox(-0.5088F, -0.2189F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.1384F, -1.3219F, 2.1734F, -0.9698F, 0.1154F, 0.0379F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(125, 62).addBox(-0.5088F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.211F, -1.5189F, 2.7355F, -1.2316F, 0.1154F, 0.0379F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(125, 58).addBox(-0.5088F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2816F, -1.5627F, 3.3297F, -1.4934F, 0.1154F, 0.0379F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(14, 123).addBox(-0.5088F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.3522F, -1.6064F, 3.9239F, -1.4934F, 0.1154F, 0.0379F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(132, 127).addBox(-0.2077F, -0.8714F, -1.3873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 133).addBox(-0.2077F, -0.8714F, -0.8623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.7643F, 0.5183F, 2.1644F, -1.5397F, 0.0456F, 0.0377F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(128, 132).addBox(-0.8477F, -0.2925F, -0.2577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3922F, -0.5541F, 1.1682F, -1.1675F, 0.1689F, 0.0535F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(138, 135).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4541F, 0.2746F, -1.1066F, -1.218F, 0.2282F, 0.0482F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(130, 138).addBox(-0.8519F, 0.3217F, -1.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1643F, 0.6183F, -0.2356F, -1.22F, 0.1849F, 0.0434F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(115, 143).addBox(-0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4567F, 0.1445F, -0.5791F, -1.4282F, 0.2281F, 0.0498F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(138, 129).addBox(-0.8519F, -0.0956F, -1.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1643F, 0.6183F, -0.2356F, -1.4295F, 0.1849F, 0.0434F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(5, 139).addBox(-0.525F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.3502F, 0.4038F, -1.4642F, -1.3864F, 0.6337F, 0.11F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(25, 144).addBox(-0.775F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3088F, 0.2325F, -2.0092F, -1.0728F, 1.2209F, 0.4218F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(105, 138).addBox(-0.761F, -0.2482F, -0.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8643F, 0.8683F, -1.2856F, -1.416F, 0.2895F, 0.0446F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(35, 126).addBox(-1.8477F, -0.1636F, -1.0784F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3643F, 0.5183F, 1.2644F, -1.4491F, 0.1328F, 0.038F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(5, 142).addBox(-0.4915F, -0.4856F, -0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4909F, 0.1831F, -1.8611F, -1.3471F, 0.7108F, 0.0787F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(140, 141).addBox(-0.6983F, -0.2911F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.738F, 0.795F, -1.8508F, -1.6365F, 0.7079F, 0.0562F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(142, 3).addBox(-0.1733F, -0.0587F, -0.6194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(142, 0).addBox(-0.1733F, -0.2587F, -0.6194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.3052F, 0.7585F, -2.3168F, -1.545F, 0.8823F, 0.0621F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(42, 126).addBox(-1.525F, -1.475F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(-0.1249F, 0.6512F, -2.5973F, -1.5493F, 0.7079F, 0.0562F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(133, 131).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.1734F, 0.4575F, -2.2235F, -1.3136F, 0.7079F, 0.0562F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(142, 26).addBox(-0.7F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 142).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(-0.2965F, 0.5963F, -2.741F, -1.4403F, 0.8823F, 0.0621F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(10, 139).addBox(-0.854F, 0.0242F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(139, 9).addBox(-0.554F, 0.0242F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4944F, 0.2085F, -2.1613F, -0.9406F, 0.913F, 0.2159F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(110, 143).addBox(-0.6483F, -0.3087F, -0.6694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2503F, 0.7837F, -2.4205F, -1.5419F, 0.9696F, 0.0661F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(142, 6).addBox(-0.6915F, -0.3118F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4944F, 0.2085F, -2.1613F, -1.2598F, 0.7108F, 0.0787F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(135, 141).addBox(-0.6983F, 0.0913F, -0.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.738F, 0.795F, -1.8508F, -1.5493F, 0.7079F, 0.0562F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(135, 138).addBox(-0.761F, -0.2053F, -0.7862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.8643F, 0.8683F, -1.2856F, -1.6778F, 0.2895F, 0.0446F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(135, 45).addBox(-0.5F, -0.4809F, -0.2316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 135).addBox(-0.5F, -0.4809F, -0.4316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1716F, 1.1075F, -2.7531F, -1.463F, 0.3132F, -0.2813F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(40, 135).addBox(-0.5F, -0.4746F, -0.6004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(-0.1716F, 1.1075F, -2.7531F, -1.5939F, 0.3132F, -0.2813F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(45, 135).addBox(-0.5F, -0.426F, -0.7599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1716F, 1.1075F, -2.7531F, -1.8557F, 0.3132F, -0.2813F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(135, 48).addBox(-0.5F, -0.4539F, -0.2715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(50, 135).addBox(-0.5F, -0.4539F, -0.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1881F, 1.0692F, -2.443F, -1.1883F, 0.6462F, -0.3907F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(135, 51).addBox(-0.5F, -0.4642F, -0.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.1881F, 1.0692F, -2.443F, -1.4501F, 0.6462F, -0.3907F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(55, 135).addBox(-0.5F, -0.4257F, -0.721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1881F, 1.0692F, -2.443F, -1.7119F, 0.6462F, -0.3907F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(15, 144).addBox(-0.5051F, -0.4305F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.619F, 1.0949F, -1.9233F, -1.6789F, 0.5378F, -0.1972F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(144, 15).addBox(-0.5051F, -0.4692F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.619F, 1.0949F, -1.9233F, -1.4171F, 0.5378F, -0.1972F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(20, 144).addBox(-0.5051F, -0.4587F, -0.2702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(144, 18).addBox(-0.5051F, -0.4587F, -0.3952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.619F, 1.0949F, -1.9233F, -1.1553F, 0.5378F, -0.1972F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(142, 57).addBox(-0.5F, -0.4779F, -0.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(142, 110).addBox(-0.5F, -0.4779F, -0.5351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.785F, 1.0226F, -1.6108F, -1.0776F, 0.1888F, -0.2991F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(100, 142).addBox(-0.5F, -0.4261F, -0.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.785F, 1.0226F, -1.6108F, -1.671F, 0.1888F, -0.2991F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(144, 9).addBox(-0.5F, -0.4865F, -0.319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(143, 134).addBox(-0.5F, -0.4865F, -0.519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.871F, 1.0871F, -1.2659F, -1.0707F, 0.2572F, -0.1787F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(142, 54).addBox(-0.5F, -0.4539F, -0.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.871F, 1.0871F, -1.2659F, -1.4023F, 0.2572F, -0.1787F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(139, 20).addBox(-0.4977F, -1.4095F, -0.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1454F, 0.3972F, 2.0122F, -1.2326F, 0.0977F, 0.0429F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(126, 82).addBox(-0.4977F, -1.0581F, -1.2273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1454F, 0.3972F, 2.0122F, -1.538F, 0.0977F, 0.0429F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(79, 126).addBox(-0.4977F, -0.3772F, -1.2083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(126, 71).addBox(-0.4977F, 0.3478F, -1.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1454F, 0.3972F, 2.0122F, -1.4507F, 0.0977F, 0.0429F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(63, 126).addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(56, 126).addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.9411F, 0.5106F, 0.2785F, -1.5485F, 0.2546F, 0.0441F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(55, 141).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 141).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0619F, 0.418F, -1.3867F, -1.4464F, 0.5493F, 0.0816F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(60, 141).addBox(-0.575F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 141).addBox(-0.575F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2157F, 0.3778F, -0.966F, -1.4543F, 0.428F, 0.065F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(65, 141).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 141).addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 141).addBox(-0.4F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 141).addBox(-0.4F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 141).addBox(-0.4F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 141).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2365F, 0.6697F, 0.0753F, -1.464F, 0.1245F, 0.0298F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(139, 17).addBox(-0.5373F, -0.5479F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7547F, 0.7747F, -0.5403F, -1.3304F, 0.2546F, 0.0441F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(143, 131).addBox(-0.5F, -0.4864F, -0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.9091F, 0.9991F, -0.988F, -0.9988F, 0.2546F, -0.1653F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(143, 128).addBox(-0.5F, -0.4864F, -0.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9091F, 0.9991F, -0.988F, -1.3304F, 0.2546F, -0.1653F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(138, 132).addBox(-0.8519F, 0.3163F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(95, 138).addBox(-0.8519F, -0.1837F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.1643F, 0.6183F, -0.2356F, -1.3335F, 0.1849F, 0.0434F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 138).addBox(-0.8477F, 0.8226F, -0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3643F, 0.5183F, 1.2644F, -1.4665F, 0.1328F, 0.038F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(85, 138).addBox(-0.8477F, 0.3005F, -0.6793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.3643F, 0.5183F, 1.2644F, -1.6062F, 0.1328F, 0.038F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(138, 83).addBox(-0.8477F, -0.2882F, -0.8205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3643F, 0.5183F, 1.2644F, -1.3095F, 0.1328F, 0.038F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(138, 23).addBox(-0.5088F, 1.1365F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.3418F, -1.6243F, 0.1154F, 0.0379F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(137, 126).addBox(-0.5128F, 0.8175F, -0.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.3418F, -1.2144F, 0.1021F, 0.0386F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(80, 138).addBox(-0.7582F, -0.4747F, 0.5545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -0.7397F, 0.1818F, 0.0239F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(137, 123).addBox(-0.7582F, -0.3153F, 0.7258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -0.6F, 0.1818F, 0.0239F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(105, 141).addBox(-0.6306F, -1.0276F, 0.5824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -1.0776F, 0.0261F, 0.0032F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(130, 141).addBox(-0.6309F, -1.1828F, 0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F))
				.texOffs(141, 104).addBox(-0.6309F, -1.1828F, 0.6633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.394F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -1.2303F, 0.0261F, 0.0032F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(137, 120).addBox(-0.7811F, -0.9452F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -1.5314F, 0.0261F, 0.0032F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(110, 133).addBox(-0.5013F, -0.7967F, -1.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, -2.0215F, 0.1026F, 0.0348F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(137, 117).addBox(-0.5013F, -0.6871F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, -0.8652F, 0.1026F, 0.0348F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(141, 101).addBox(-0.7937F, 0.0048F, -1.1575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6543F, -0.3843F, 4.6418F, -2.6397F, 0.0602F, 0.0145F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(115, 137).addBox(-0.4052F, -0.0681F, -0.2949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, 0.1296F, 0.1026F, 0.0348F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(121, 23).addBox(-0.4052F, -0.9483F, -1.3552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, -0.0144F, 0.1026F, 0.0348F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(137, 114).addBox(-0.3052F, 0.1679F, -0.1139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, 0.0423F, 0.1026F, 0.0348F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(125, 34).addBox(-0.3052F, -0.1498F, -0.7236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.396F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, -0.3067F, 0.1026F, 0.0348F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(130, 0).addBox(-1.5F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5111F, 0.3454F, -0.6662F, -1.0026F, 1.3137F, 0.8616F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(137, 111).addBox(-0.3052F, 0.2169F, -0.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 138).addBox(-0.3052F, 0.2169F, 0.3309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(137, 59).addBox(-0.3052F, 0.2169F, 0.1809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3543F, -0.3843F, 4.1918F, 0.1732F, 0.1026F, 0.0348F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5212F, -0.5079F, -5.5428F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(136, 105).mirror().addBox(-0.45F, -0.0238F, -0.7125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, -0.1745F, -0.1222F, -0.0175F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(136, 108).mirror().addBox(-0.725F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(135, 89).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-1.0353F, -0.703F, 3.0435F, 0.0873F, -0.1222F, -0.0175F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(25, 135).mirror().addBox(-0.55F, -0.0405F, 0.1155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, -1.9023F, -0.1222F, -0.0175F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(20, 135).mirror().addBox(-0.55F, 0.3799F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, -1.1518F, -0.1222F, -0.0175F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(30, 135).mirror().addBox(-0.55F, -0.2795F, -1.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, -0.4013F, -0.1222F, -0.0175F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(136, 102).mirror().addBox(-0.45F, -1.1575F, 0.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(100, 136).mirror().addBox(-0.45F, -0.6075F, 0.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, -0.2617F, -0.1222F, -0.0175F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(133, 135).mirror().addBox(-0.45F, -0.0041F, 0.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(135, 86).mirror().addBox(-0.45F, -0.0041F, -0.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1978F, -0.6919F, 2.9325F, 0.0175F, -0.1222F, -0.0175F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(135, 77).mirror().addBox(-1.0227F, 0.0629F, -1.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -0.0947F, -0.2701F, -1.0522F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(30, 138).mirror().addBox(-1.2691F, 0.3612F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -0.5515F, -0.4641F, -0.8275F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(73, 135).mirror().addBox(-0.7475F, 0.4173F, -0.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -0.6637F, -0.258F, -0.5139F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(21, 123).mirror().addBox(-0.3866F, -0.4006F, -0.5937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.5218F, -1.1934F, 2.1683F, -0.7642F, -0.2044F, -0.0038F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-0.4F, -1.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8694F, -1.639F, 3.4748F, -1.8135F, 0.1671F, 0.0456F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(128, 86).mirror().addBox(-0.9971F, -1.2836F, -0.9738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -1.5415F, 0.0457F, 0.0592F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(-0.9971F, -1.1127F, -0.9372F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -1.4892F, 0.0457F, 0.0592F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(49, 126).mirror().addBox(-0.7299F, -1.2068F, -0.7772F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3426F, -1.1069F, 2.5931F, -1.2253F, -0.36F, 0.0103F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(132, 123).mirror().addBox(-0.3189F, -0.7917F, -0.7054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -2.6266F, -0.0261F, -0.0032F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(125, 54).mirror().addBox(-0.3189F, -1.0595F, -1.128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -1.3612F, -0.0261F, -0.0032F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(25, 138).mirror().addBox(-0.3189F, -0.8642F, 0.3536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -1.0121F, -0.0261F, -0.0032F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(115, 133).mirror().addBox(-0.475F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3664F, -1.2908F, 4.2815F, -1.5988F, -0.06F, -0.0058F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(138, 80).mirror().addBox(-0.7923F, -0.703F, -1.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 0.5183F, 2.1644F, -0.9724F, -0.0456F, -0.0377F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 125).mirror().addBox(-0.4912F, -0.2189F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.1384F, -1.3219F, 2.1734F, -0.9698F, -0.1154F, -0.0379F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-0.4912F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.211F, -1.5189F, 2.7355F, -1.2316F, -0.1154F, -0.0379F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(125, 58).mirror().addBox(-0.4912F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2816F, -1.5627F, 3.3297F, -1.4934F, -0.1154F, -0.0379F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(14, 123).mirror().addBox(-0.4912F, -0.219F, -0.1972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.3522F, -1.6064F, 3.9239F, -1.4934F, -0.1154F, -0.0379F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(132, 127).mirror().addBox(-0.7923F, -0.8714F, -1.3873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 133).mirror().addBox(-0.7923F, -0.8714F, -0.8623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.7643F, 0.5183F, 2.1644F, -1.5397F, -0.0456F, -0.0377F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(128, 132).mirror().addBox(-0.1523F, -0.2925F, -0.2577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3922F, -0.5541F, 1.1682F, -1.1675F, -0.1689F, -0.0535F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(138, 135).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4541F, 0.2746F, -1.1066F, -1.218F, -0.2282F, -0.0482F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(130, 138).mirror().addBox(-0.1481F, 0.3217F, -1.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1643F, 0.6183F, -0.2356F, -1.22F, -0.1849F, -0.0434F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(115, 143).mirror().addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4567F, 0.1445F, -0.5791F, -1.4282F, -0.2281F, -0.0498F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(138, 129).mirror().addBox(-0.1481F, -0.0956F, -1.0046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1643F, 0.6183F, -0.2356F, -1.4295F, -0.1849F, -0.0434F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(5, 139).mirror().addBox(-0.475F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.3502F, 0.4038F, -1.4642F, -1.3864F, -0.6337F, -0.11F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(25, 144).mirror().addBox(-0.225F, -0.2F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3088F, 0.2325F, -2.0092F, -1.0728F, -1.2209F, -0.4218F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(105, 138).mirror().addBox(-0.239F, -0.2482F, -0.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8643F, 0.8683F, -1.2856F, -1.416F, -0.2895F, -0.0446F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(35, 126).mirror().addBox(-0.1523F, -0.1636F, -1.0784F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, 0.5183F, 1.2644F, -1.4491F, -0.1328F, -0.038F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(5, 142).mirror().addBox(-0.5085F, -0.4856F, -0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4909F, 0.1831F, -1.8611F, -1.3471F, -0.7108F, -0.0787F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(140, 141).mirror().addBox(-0.3017F, -0.2911F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.738F, 0.795F, -1.8508F, -1.6365F, -0.7079F, -0.0562F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(142, 3).mirror().addBox(-0.8267F, -0.0587F, -0.6194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(142, 0).mirror().addBox(-0.8267F, -0.2587F, -0.6194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.3052F, 0.7585F, -2.3168F, -1.545F, -0.8823F, -0.0621F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(42, 126).mirror().addBox(-0.475F, -1.475F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(0.1249F, 0.6512F, -2.5973F, -1.5493F, -0.7079F, -0.0562F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(133, 131).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.1734F, 0.4575F, -2.2235F, -1.3136F, -0.7079F, -0.0562F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(142, 26).mirror().addBox(-0.3F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 142).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(0.2965F, 0.5963F, -2.741F, -1.4403F, -0.8823F, -0.0621F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(10, 139).mirror().addBox(-0.146F, 0.0242F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(139, 9).mirror().addBox(-0.446F, 0.0242F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4944F, 0.2085F, -2.1613F, -0.9406F, -0.913F, -0.2159F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(110, 143).mirror().addBox(-0.3517F, -0.3087F, -0.6694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2503F, 0.7837F, -2.4205F, -1.5419F, -0.9696F, -0.0661F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(142, 6).mirror().addBox(-0.3085F, -0.3118F, -0.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4944F, 0.2085F, -2.1613F, -1.2598F, -0.7108F, -0.0787F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(135, 141).mirror().addBox(-0.3017F, 0.0913F, -0.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.738F, 0.795F, -1.8508F, -1.5493F, -0.7079F, -0.0562F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(135, 138).mirror().addBox(-0.239F, -0.2053F, -0.7862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.8643F, 0.8683F, -1.2856F, -1.6778F, -0.2895F, -0.0446F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(135, 45).mirror().addBox(-0.5F, -0.4809F, -0.2316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 135).mirror().addBox(-0.5F, -0.4809F, -0.4316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1716F, 1.1075F, -2.7531F, -1.463F, -0.3132F, 0.2813F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(40, 135).mirror().addBox(-0.5F, -0.4746F, -0.6004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(0.1716F, 1.1075F, -2.7531F, -1.5939F, -0.3132F, 0.2813F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(45, 135).mirror().addBox(-0.5F, -0.426F, -0.7599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1716F, 1.1075F, -2.7531F, -1.8557F, -0.3132F, 0.2813F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(135, 48).mirror().addBox(-0.5F, -0.4539F, -0.2715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(50, 135).mirror().addBox(-0.5F, -0.4539F, -0.3965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1881F, 1.0692F, -2.443F, -1.1883F, -0.6462F, 0.3907F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(135, 51).mirror().addBox(-0.5F, -0.4642F, -0.563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.1881F, 1.0692F, -2.443F, -1.4501F, -0.6462F, 0.3907F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(55, 135).mirror().addBox(-0.5F, -0.4257F, -0.721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1881F, 1.0692F, -2.443F, -1.7119F, -0.6462F, 0.3907F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(15, 144).mirror().addBox(-0.4949F, -0.4305F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.619F, 1.0949F, -1.9233F, -1.6789F, -0.5378F, 0.1972F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(144, 15).mirror().addBox(-0.4949F, -0.4692F, -0.5629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.619F, 1.0949F, -1.9233F, -1.4171F, -0.5378F, 0.1972F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 144).mirror().addBox(-0.4949F, -0.4587F, -0.2702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(144, 18).mirror().addBox(-0.4949F, -0.4587F, -0.3952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.619F, 1.0949F, -1.9233F, -1.1553F, -0.5378F, 0.1972F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(142, 57).mirror().addBox(-0.5F, -0.4779F, -0.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(142, 110).mirror().addBox(-0.5F, -0.4779F, -0.5351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.785F, 1.0226F, -1.6108F, -1.0776F, -0.1888F, 0.2991F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(100, 142).mirror().addBox(-0.5F, -0.4261F, -0.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.785F, 1.0226F, -1.6108F, -1.671F, -0.1888F, 0.2991F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(144, 9).mirror().addBox(-0.5F, -0.4865F, -0.319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(143, 134).mirror().addBox(-0.5F, -0.4865F, -0.519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.871F, 1.0871F, -1.2659F, -1.0707F, -0.2572F, 0.1787F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(142, 54).mirror().addBox(-0.5F, -0.4539F, -0.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.871F, 1.0871F, -1.2659F, -1.4023F, -0.2572F, 0.1787F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(139, 20).mirror().addBox(-0.5023F, -1.4095F, -0.1321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1454F, 0.3972F, 2.0122F, -1.2326F, -0.0977F, -0.0429F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(126, 82).mirror().addBox(-0.5023F, -1.0581F, -1.2273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1454F, 0.3972F, 2.0122F, -1.538F, -0.0977F, -0.0429F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(79, 126).mirror().addBox(-0.5023F, -0.3772F, -1.2083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(126, 71).mirror().addBox(-0.5023F, 0.3478F, -1.1083F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1454F, 0.3972F, 2.0122F, -1.4507F, -0.0977F, -0.0429F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(63, 126).mirror().addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(56, 126).mirror().addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9411F, 0.5106F, 0.2785F, -1.5485F, -0.2546F, -0.0441F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(55, 141).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 141).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0619F, 0.418F, -1.3867F, -1.4464F, -0.5493F, -0.0816F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(60, 141).mirror().addBox(-0.425F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 141).mirror().addBox(-0.425F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2157F, 0.3778F, -0.966F, -1.4543F, -0.428F, -0.065F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(65, 141).mirror().addBox(-0.6F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 141).mirror().addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 141).mirror().addBox(-0.6F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 141).mirror().addBox(-0.6F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 141).mirror().addBox(-0.6F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 141).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2365F, 0.6697F, 0.0753F, -1.464F, -0.1245F, -0.0298F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(139, 17).mirror().addBox(-0.4627F, -0.5479F, -0.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7547F, 0.7747F, -0.5403F, -1.3304F, -0.2546F, -0.0441F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(143, 131).mirror().addBox(-0.5F, -0.4864F, -0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.9091F, 0.9991F, -0.988F, -0.9988F, -0.2546F, 0.1653F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(143, 128).mirror().addBox(-0.5F, -0.4864F, -0.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9091F, 0.9991F, -0.988F, -1.3304F, -0.2546F, 0.1653F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-0.1481F, 0.3163F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(95, 138).mirror().addBox(-0.1481F, -0.1837F, -0.7849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.1643F, 0.6183F, -0.2356F, -1.3335F, -0.1849F, -0.0434F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(90, 138).mirror().addBox(-0.1523F, 0.8226F, -0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, 0.5183F, 1.2644F, -1.4665F, -0.1328F, -0.038F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(85, 138).mirror().addBox(-0.1523F, 0.3005F, -0.6793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, 0.5183F, 1.2644F, -1.6062F, -0.1328F, -0.038F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(138, 83).mirror().addBox(-0.1523F, -0.2882F, -0.8205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3643F, 0.5183F, 1.2644F, -1.3095F, -0.1328F, -0.038F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(138, 23).mirror().addBox(-0.4912F, 1.1365F, 0.1588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.3418F, -1.6243F, -0.1154F, -0.0379F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(137, 126).mirror().addBox(-0.4872F, 0.8175F, -0.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.3418F, -1.2144F, -0.1021F, -0.0386F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(80, 138).mirror().addBox(-0.2418F, -0.4747F, 0.5545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -0.7397F, -0.1818F, -0.0239F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(137, 123).mirror().addBox(-0.2418F, -0.3153F, 0.7258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -0.6F, -0.1818F, -0.0239F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(105, 141).mirror().addBox(-0.3694F, -1.0276F, 0.5824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -1.0776F, -0.0261F, -0.0032F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(130, 141).mirror().addBox(-0.3691F, -1.1828F, 0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)).mirror(false)
				.texOffs(141, 104).mirror().addBox(-0.3691F, -1.1828F, 0.6633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.394F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -1.2303F, -0.0261F, -0.0032F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(137, 120).mirror().addBox(-0.2189F, -0.9452F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -1.5314F, -0.0261F, -0.0032F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(110, 133).mirror().addBox(-0.4987F, -0.7967F, -1.0125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, -2.0215F, -0.1026F, -0.0348F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(137, 117).mirror().addBox(-0.4987F, -0.6871F, -0.3617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, -0.8652F, -0.1026F, -0.0348F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(141, 101).mirror().addBox(-0.2063F, 0.0048F, -1.1575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6543F, -0.3843F, 4.6418F, -2.6397F, -0.0602F, -0.0145F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(115, 137).mirror().addBox(-0.5948F, -0.0681F, -0.2949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, 0.1296F, -0.1026F, -0.0348F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(121, 23).mirror().addBox(-0.5948F, -0.9483F, -1.3552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, -0.0144F, -0.1026F, -0.0348F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(137, 114).mirror().addBox(-0.6948F, 0.1679F, -0.1139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, 0.0423F, -0.1026F, -0.0348F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(125, 34).mirror().addBox(-0.6948F, -0.1498F, -0.7236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.396F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, -0.3067F, -0.1026F, -0.0348F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-0.5F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5111F, 0.3454F, -0.6662F, -1.0026F, -1.3137F, -0.8616F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(137, 111).mirror().addBox(-0.6948F, 0.2169F, -0.0191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 138).mirror().addBox(-0.6948F, 0.2169F, 0.3309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(137, 59).mirror().addBox(-0.6948F, 0.2169F, 0.1809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3543F, -0.3843F, 4.1918F, 0.1732F, -0.1026F, -0.0348F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7263F, 9.6045F, 0.0694F, 0.1308F, -0.0057F));

		PartDefinition cube_r477 = body3.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(43, 130).addBox(0.0F, -0.75F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9432F, 5.8495F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r478 = body3.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(100, 127).addBox(0.0F, -1.1F, -2.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.781F, 4.8577F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r479 = body3.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(38, 130).addBox(0.0F, -0.2F, -7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(44, 98).mirror().addBox(-2.0F, 1.4F, -7.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 98).addBox(1.0F, 1.4F, -7.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(77, 86).addBox(-1.0F, 0.5F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 6.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = body3.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8F, 2.6374F, 0.68F));

		PartDefinition cube_r480 = bone.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(126, 75).addBox(0.0F, -0.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.4126F, 0.7143F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r481 = bone.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(132, 111).addBox(0.0F, -1.425F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.2376F, 0.0295F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r482 = bone.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(128, 89).addBox(0.0F, -0.175F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.4876F, 0.8342F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r483 = bone.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(120, 108).addBox(0.0F, -0.175F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2626F, 1.8086F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r484 = bone.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(12, 127).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4417F, -1.4061F, 4.3113F, -0.341F, -0.5068F, 0.1705F));

		PartDefinition cube_r485 = bone.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(40, 122).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3355F, 2.5307F, 1.3301F, -2.3634F, -0.2069F, 0.4005F));

		PartDefinition cube_r486 = bone.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(132, 115).addBox(-1.0F, -1.9982F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3532F, 3.1212F, 2.7448F, -1.0021F, -0.2069F, 0.4005F));

		PartDefinition cube_r487 = bone.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(5, 131).addBox(-1.0F, -1.9982F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0526F, 3.4599F, 0.7968F, -1.4733F, -0.2069F, 0.4005F));

		PartDefinition cube_r488 = bone.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(120, 97).addBox(-0.5F, -0.55F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2544F, 1.4284F, 3.0221F, -0.0945F, -0.2069F, 0.4005F));

		PartDefinition cube_r489 = bone.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(73, 116).addBox(-0.4641F, -0.5855F, -0.9246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4564F, 2.127F, -0.9938F, -2.2069F, 0.1657F, 0.3785F));

		PartDefinition cube_r490 = bone.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(138, 69).addBox(-0.4641F, 0.3394F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4564F, 2.127F, -0.9938F, -1.7793F, 0.1657F, 0.3785F));

		PartDefinition cube_r491 = bone.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(30, 144).addBox(-0.4641F, -0.1002F, -1.3867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4564F, 2.127F, -0.9938F, -0.0776F, 0.1657F, 0.3785F));

		PartDefinition cube_r492 = bone.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(144, 29).addBox(-0.4641F, -0.2252F, -0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4564F, 2.127F, -0.9938F, -1.1248F, 0.1657F, 0.3785F));

		PartDefinition cube_r493 = bone.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(125, 10).addBox(-0.8F, -0.0897F, 0.3344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8F, 0.1252F, -0.3103F, -2.0029F, 0.1329F, 0.3907F));

		PartDefinition cube_r494 = bone.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(73, 120).addBox(0.0F, -1.075F, 0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2442F, -1.6372F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r495 = bone.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(134, 94).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3683F, 0.7962F, 1.4645F, -1.1891F, -0.1137F, 0.1526F));

		PartDefinition cube_r496 = bone.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, -1.3869F, 0.8063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.5F, 0.8F, -1.0544F, -0.2069F, 0.4005F));

		PartDefinition cube_r497 = bone.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(5, 127).addBox(-1.4417F, 0.0F, -1.1478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4417F, -1.4061F, 4.3113F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r498 = bone.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(51, 121).addBox(0.0F, -2.5F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.7922F, 0.5243F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r499 = bone.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(82, 120).addBox(0.0F, -2.0F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3788F, 0.0F, 0.0F));

		PartDefinition bone4 = body3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8F, 2.6374F, 0.68F));

		PartDefinition cube_r500 = bone4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(126, 75).mirror().addBox(-2.0F, -0.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4126F, 0.7143F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r501 = bone4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(132, 111).mirror().addBox(-1.0F, -1.425F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2376F, 0.0295F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r502 = bone4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(128, 89).mirror().addBox(-2.0F, -0.175F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4876F, 0.8342F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r503 = bone4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(120, 108).mirror().addBox(-2.0F, -0.175F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2626F, 1.8086F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r504 = bone4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(12, 127).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4417F, -1.4061F, 4.3113F, -0.341F, 0.5068F, -0.1705F));

		PartDefinition cube_r505 = bone4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(40, 122).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.3355F, 2.5307F, 1.3301F, -2.3634F, 0.2069F, -0.4005F));

		PartDefinition cube_r506 = bone4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(132, 115).mirror().addBox(0.0F, -1.9982F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3532F, 3.1212F, 2.7448F, -1.0021F, 0.2069F, -0.4005F));

		PartDefinition cube_r507 = bone4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(0.0F, -1.9982F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0526F, 3.4599F, 0.7968F, -1.4733F, 0.2069F, -0.4005F));

		PartDefinition cube_r508 = bone4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(120, 97).mirror().addBox(-0.5F, -0.55F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2544F, 1.4284F, 3.0221F, -0.0945F, 0.2069F, -0.4005F));

		PartDefinition cube_r509 = bone4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(73, 116).mirror().addBox(-0.5359F, -0.5855F, -0.9246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4564F, 2.127F, -0.9938F, -2.2069F, -0.1657F, -0.3785F));

		PartDefinition cube_r510 = bone4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(138, 69).mirror().addBox(-0.5359F, 0.3394F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4564F, 2.127F, -0.9938F, -1.7793F, -0.1657F, -0.3785F));

		PartDefinition cube_r511 = bone4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(30, 144).mirror().addBox(-0.5359F, -0.1002F, -1.3867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4564F, 2.127F, -0.9938F, -0.0776F, -0.1657F, -0.3785F));

		PartDefinition cube_r512 = bone4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(144, 29).mirror().addBox(-0.5359F, -0.2252F, -0.4116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4564F, 2.127F, -0.9938F, -1.1248F, -0.1657F, -0.3785F));

		PartDefinition cube_r513 = bone4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(125, 10).mirror().addBox(-0.2F, -0.0897F, 0.3344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1252F, -0.3103F, -2.0029F, -0.1329F, -0.3907F));

		PartDefinition cube_r514 = bone4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(73, 120).mirror().addBox(-1.0F, -1.075F, 0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2442F, -1.6372F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r515 = bone4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(134, 94).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3683F, 0.7962F, 1.4645F, -1.1891F, 0.1137F, -0.1526F));

		PartDefinition cube_r516 = bone4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(0.0F, -1.3869F, 0.8063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5F, 0.8F, -1.0544F, 0.2069F, -0.4005F));

		PartDefinition cube_r517 = bone4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(5, 127).mirror().addBox(0.4417F, 0.0F, -1.1478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.4417F, -1.4061F, 4.3113F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r518 = bone4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(51, 121).mirror().addBox(-1.0F, -2.5F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7922F, 0.5243F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r519 = bone4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(82, 120).mirror().addBox(-1.0F, -2.0F, -0.95F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3788F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = body3.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5341F, 2.4296F, 0.9841F, -0.3786F, 0.033F, -0.1714F));

		PartDefinition cube_r520 = backLeftLeg.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(127, 122).addBox(-0.3035F, 0.2361F, -0.8908F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r521 = backLeftLeg.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(106, 122).addBox(-0.3035F, -1.189F, -0.6595F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1053F, 0.6385F, 0.7758F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r522 = backLeftLeg.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(89, 122).addBox(-0.3035F, -1.264F, -0.4095F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r523 = backLeftLeg.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(134, 41).addBox(-0.3035F, -0.2508F, 0.0768F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6053F, 8.0924F, 0.4416F, -0.0807F, -0.0378F, 0.0319F));

		PartDefinition cube_r524 = backLeftLeg.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(134, 37).addBox(-0.3035F, -0.1258F, 0.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6053F, 8.0924F, 0.4416F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r525 = backLeftLeg.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(30, 109).addBox(-0.3035F, -0.1258F, -0.8482F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6053F, 4.1398F, 1.6151F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r526 = backLeftLeg.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(19, 127).addBox(-0.5F, -0.4981F, -1.3016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8018F, 9.3573F, 1.6553F, 0.6981F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2906F, 10.0992F, 1.6968F, 1.8196F, -0.0384F, 0.0206F));

		PartDefinition cube_r527 = backLeftLeg2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(62, 116).addBox(-1.2394F, 0.3689F, -2.4546F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8852F, 8.0518F, -0.4715F, -1.7316F, 1.4158F, -1.6415F));

		PartDefinition cube_r528 = backLeftLeg2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(96, 122).addBox(-0.3894F, -1.6811F, -0.5546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8852F, 8.0518F, -0.4715F, -1.6588F, 1.2858F, -1.5671F));

		PartDefinition cube_r529 = backLeftLeg2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(29, 37).addBox(-0.5535F, -4.9788F, -0.4657F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.0019F, 4.7618F, -0.2422F, 1.8704F, 1.5523F, 1.9054F));

		PartDefinition cube_r530 = backLeftLeg2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(95, 130).addBox(-1.4488F, -0.3632F, -1.2555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1793F, 6.7448F, 0.0339F, -1.5641F, 1.2217F, -1.5818F));

		PartDefinition cube_r531 = backLeftLeg2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(36, 99).addBox(-0.4308F, 0.0083F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4873F, 1.0774F, 0.3898F, 1.7652F, 1.4532F, 1.8497F));

		PartDefinition cube_r532 = backLeftLeg2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(48, 84).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4619F, 0.6585F, -0.0759F, -1.7453F, 1.4399F, -1.6581F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(91, 34).addBox(-3.0987F, -0.0124F, -3.9766F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0514F, 8.799F, 0.6879F, 0.0208F, 0.1294F, 0.0197F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create().texOffs(98, 92).addBox(-3.0981F, -0.496F, -2.9564F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0007F, 0.4836F, -3.7202F, -0.8727F, 0.0F, 0.0F));

		PartDefinition backLeftLeg5 = backLeftLeg4.addOrReplaceChild("backLeftLeg5", CubeListBuilder.create().texOffs(104, 61).addBox(-3.0981F, -0.496F, -3.9564F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0005F, -2.9856F, -0.5672F, 0.0F, 0.0F));

		PartDefinition backRightLeg = body3.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5341F, 2.4296F, 0.9841F, -1.1311F, 0.1844F, 0.1568F));

		PartDefinition cube_r533 = backRightLeg.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(127, 127).addBox(-0.6965F, 0.2361F, -0.8908F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r534 = backRightLeg.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(7, 123).addBox(-1.6965F, -1.189F, -0.6595F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1053F, 0.6385F, 0.7758F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r535 = backRightLeg.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(123, 0).addBox(-1.6965F, -1.264F, -0.4095F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r536 = backRightLeg.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(90, 134).addBox(-0.6965F, -0.2508F, 0.0768F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6053F, 8.0924F, 0.4416F, -0.0807F, 0.0378F, -0.0319F));

		PartDefinition cube_r537 = backRightLeg.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(68, 134).addBox(-0.6965F, -0.1258F, 0.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6053F, 8.0924F, 0.4416F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r538 = backRightLeg.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(0, 127).addBox(-0.6965F, -0.1258F, -0.8482F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6053F, 4.1398F, 1.6151F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r539 = backRightLeg.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(127, 38).addBox(-0.5F, -0.4981F, -1.3016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8018F, 9.3573F, 1.6553F, 0.6981F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2906F, 10.0992F, 1.6968F, 1.2087F, 0.0384F, -0.0206F));

		PartDefinition cube_r540 = backRightLeg2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(0, 117).addBox(-0.7606F, 0.3689F, -2.4546F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8852F, 8.0518F, -0.4715F, -1.7316F, -1.4158F, 1.6415F));

		PartDefinition cube_r541 = backRightLeg2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(130, 50).addBox(-0.6106F, -1.6811F, -0.5546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8852F, 8.0518F, -0.4715F, -1.6588F, -1.2858F, 1.5671F));

		PartDefinition cube_r542 = backRightLeg2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(48, 75).addBox(-0.4465F, -4.9788F, -0.4657F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0019F, 4.7618F, -0.2422F, 1.8704F, -1.5523F, -1.9054F));

		PartDefinition cube_r543 = backRightLeg2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(105, 130).addBox(0.4488F, -0.3632F, -1.2555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1793F, 6.7448F, 0.0339F, -1.5641F, -1.2217F, 1.5818F));

		PartDefinition cube_r544 = backRightLeg2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(101, 119).addBox(-0.5692F, 0.0083F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4873F, 1.0774F, 0.3898F, 1.7652F, -1.4532F, -1.8497F));

		PartDefinition cube_r545 = backRightLeg2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(15, 135).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4619F, 0.6585F, -0.0759F, -1.7453F, -1.4399F, 1.6581F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(98, 86).addBox(-2.9013F, -0.0124F, -3.9766F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0514F, 8.799F, 0.6879F, 0.0635F, -0.0102F, -0.1088F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create().texOffs(104, 67).addBox(-2.9019F, -0.496F, -2.9564F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0007F, 0.4836F, -3.7202F, -0.1309F, 0.0F, 0.0F));

		PartDefinition backRightLeg5 = backRightLeg4.addOrReplaceChild("backRightLeg5", CubeListBuilder.create().texOffs(106, 40).addBox(-2.9019F, -0.496F, -3.9564F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0005F, -2.9856F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0098F, 7.6586F, -0.3452F, 0.2057F, -0.0733F));

		PartDefinition cube_r546 = tail.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(15, 131).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3689F, 6.6956F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r547 = tail.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(65, 135).addBox(0.007F, -3.254F, 1.4357F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.337F, 4.0046F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(74, 87).addBox(0.004F, -1.3943F, -1.0712F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8712F, 7.4432F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(30, 131).addBox(0.0F, -1.9351F, -0.3064F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.637F, 2.0046F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(44, 88).addBox(-0.003F, -2.0914F, -0.7858F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.637F, 0.0046F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(120, 133).addBox(0.0F, -0.725F, -0.45F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7096F, 3.6965F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r552 = tail.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(123, 128).addBox(0.0F, 1.0633F, 3.2251F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 111).addBox(0.0F, 0.0633F, 1.2251F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 10).addBox(0.0F, -0.9367F, -0.7749F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5414F, 5.3618F, -2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r553 = tail.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(41, 103).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5414F, 7.8618F, -2.714F, 0.0F, 0.0F));

		PartDefinition cube_r554 = tail.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(133, 82).addBox(0.0F, -0.1483F, -0.0038F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8223F, 1.9494F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r555 = tail.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(58, 121).addBox(-0.003F, -1.2105F, -0.4937F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1223F, -0.4506F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r556 = tail.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(10, 131).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1074F, 3.7071F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(130, 45).addBox(0.0F, -1.0F, 1.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 40).addBox(-1.0F, 0.0F, 0.8F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.005F))
				.texOffs(0, 80).addBox(-1.0F, -0.5F, 0.8F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3109F, -1.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9941F, 8.6901F, -0.2022F, 0.2139F, -0.0435F));

		PartDefinition cube_r558 = tail2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(132, 56).addBox(0.0F, -1.15F, 10.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(131, 104).addBox(0.0F, -1.15F, 7.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(27, 61).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2206F, -0.0782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(41, 99).addBox(0.0F, -0.4026F, 0.8692F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 95).addBox(0.0F, -2.0026F, -1.1307F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1248F, 2.884F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(19, 91).addBox(0.0F, 3.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 144).addBox(0.0F, 2.0F, -4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 92).addBox(0.0F, 2.5F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6752F, 7.884F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(25, 131).addBox(0.0F, -1.15F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5692F, 3.9066F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(20, 131).addBox(0.0F, -1.125F, -0.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3252F, 1.1173F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(106, 46).addBox(-0.5F, -1.1769F, 0.7966F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(132, 60).addBox(0.0F, -1.5769F, 1.7966F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 132).addBox(0.0F, -1.5769F, 4.7966F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6901F, 11.0216F, 0.0219F, 0.1309F, 0.0029F));

		PartDefinition cube_r563 = tail3.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(47, 122).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3005F, 6.5132F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail3.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(103, 115).addBox(0.0F, -0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3252F, 3.6849F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail3.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(73, 144).addBox(0.0F, 1.1F, -6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3459F, -3.2378F, -2.6529F, 0.0F, 0.0F));

		PartDefinition tail6 = tail3.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(23, 88).addBox(-0.5F, -0.3774F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7995F, 7.8132F, 0.0781F, -0.2618F, -0.1308F));

		PartDefinition cube_r566 = tail6.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(85, 144).addBox(0.0F, -1.863F, -2.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 144).addBox(0.0F, -0.4629F, -0.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 4.7F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail6.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(79, 144).addBox(0.0F, -0.6905F, -0.957F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 2.2F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail6.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(76, 144).addBox(0.0F, -0.6725F, -0.865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.2F, -2.6093F, 0.0F, 0.0F));

		PartDefinition tail4 = tail6.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.4382F, 0.0697F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0938F, 8.8769F, 0.3496F, -0.369F, 0.1336F));

		PartDefinition cube_r569 = tail4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(94, 144).addBox(0.0F, -5.763F, -8.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 144).addBox(0.0F, -9.263F, -14.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 95).addBox(0.0F, -8.1629F, -12.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 92).addBox(0.0F, -6.9629F, -10.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 144).addBox(0.0F, -4.363F, -6.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 144).addBox(0.0F, -2.9629F, -4.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0062F, -4.1769F, -2.5656F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, -0.3328F, -0.0141F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.072F, 12.9386F, 0.0796F, -0.3014F, -0.05F));

		PartDefinition cube_r570 = tail5.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(130, 144).addBox(0.0F, -13.063F, -20.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 144).addBox(0.0F, -11.9629F, -18.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(144, 98).addBox(0.0F, -10.6629F, -16.9221F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0783F, -17.1155F, -2.5656F, 0.0F, 0.0F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(69, 97).addBox(-0.5F, -0.3328F, -0.0141F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0473F, -0.2609F, -0.0216F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(88, 97).addBox(-0.5F, -0.3328F, -0.0141F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, 0.0714F, -0.4789F, -0.0329F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -0.3328F, -0.0141F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.026F, -0.5208F, -0.0566F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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