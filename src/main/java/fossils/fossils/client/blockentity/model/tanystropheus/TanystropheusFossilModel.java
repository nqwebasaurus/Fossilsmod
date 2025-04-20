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
	private final ModelPart body;
	private final ModelPart neckbase;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
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
	private final ModelPart tail4;
	private final ModelPart tail5;

	public TanystropheusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.body = this.body2.getChild("body");
		this.neckbase = this.body.getChild("neckbase");
		this.frontLeftLeg = this.neckbase.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.neckbase.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.neck = this.neckbase.getChild("neck");
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
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.8F, 3.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 135).addBox(0.0F, -2.5F, 3.6F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 101).addBox(-1.0F, -1.1F, -0.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(131, 106).addBox(0.0F, -1.875F, -1.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2889F, 5.4345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(134, 38).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.3926F, 0.9914F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(132, 67).addBox(0.0F, -1.9F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.2661F, -1.9058F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 134).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.1309F, -5.0029F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 134).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(105, 145).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.0666F, -0.2002F, -1.655F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(137, 67).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.1605F, -0.1373F, -1.1096F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 145).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, 7.5732F, -0.2108F, -0.0735F, -0.6399F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(145, 97).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.1315F, -0.0368F, -0.5047F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(136, 101).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.0556F, -0.1136F, -1.5171F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(136, 113).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.7745F, 4.5732F, -0.1062F, -0.0687F, -0.9755F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(124, 100).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.6745F, 2.0731F, -0.047F, -0.0443F, -1.4479F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(145, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.6745F, 2.0731F, -0.0682F, -0.0074F, -0.4363F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(136, 103).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.6745F, 2.0731F, -0.0631F, -0.0138F, -0.9075F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(143, 140).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -0.9268F, -0.0054F, 0.0232F, -0.366F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -0.9268F, -0.0397F, 0.0252F, -1.3783F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(136, 24).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -0.9268F, -0.021F, 0.042F, -0.8371F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 19).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -3.9268F, -0.0449F, -0.027F, -1.3433F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(136, 4).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -3.9268F, -0.0524F, 0.0F, -0.8029F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(129, 115).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.5745F, -3.9268F, -0.0524F, 0.0F, -0.3316F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(134, 120).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.4745F, -6.9268F, -0.0309F, 0.0275F, -0.7327F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-10.2446F, -1.8776F, -0.5238F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.4745F, -6.9268F, -0.0406F, 0.0077F, -1.2735F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(129, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.4745F, -6.9268F, -0.0207F, 0.0147F, -0.2616F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(100, 145).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.2108F, 0.0735F, 0.6399F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(137, 67).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.1605F, 0.1373F, 1.1096F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(105, 145).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, 7.5732F, -0.0666F, 0.2002F, 1.655F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(136, 113).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.1062F, 0.0687F, 0.9755F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(136, 101).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.0556F, 0.1136F, 1.5171F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(145, 97).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.7745F, 4.5732F, -0.1315F, 0.0368F, 0.5047F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(136, 103).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.6745F, 2.0731F, -0.0631F, 0.0138F, 0.9075F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(145, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.6745F, 2.0731F, -0.0682F, 0.0074F, 0.4363F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(124, 100).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.6745F, 2.0731F, -0.047F, 0.0443F, 1.4479F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(136, 24).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -0.9268F, -0.021F, -0.042F, 0.8371F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 83).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -0.9268F, -0.0397F, -0.0252F, 1.3783F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(143, 140).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -0.9268F, -0.0054F, -0.0232F, 0.366F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(129, 115).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -3.9268F, -0.0524F, 0.0F, 0.3316F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(136, 4).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -3.9268F, -0.0524F, 0.0F, 0.8029F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(60, 19).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.5745F, -3.9268F, -0.0449F, 0.027F, 1.3433F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(129, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.4745F, -6.9268F, -0.0207F, -0.0147F, 0.2616F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(41, 19).addBox(2.2446F, -1.8776F, -0.5238F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.4745F, -6.9268F, -0.0406F, -0.0077F, 1.2735F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(134, 120).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -3.4745F, -6.9268F, -0.0309F, -0.0275F, 0.7327F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(23, 100).addBox(-3.0F, -3.1F, 0.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 6.4378F, -2.6022F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 14).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 5.8165F, 1.3505F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(105, 95).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.0904F, -7.5594F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(66, 72).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -7.5F, -0.0004F, -0.1308F, 0.0057F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, -2.069F, 4.3268F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 133).addBox(0.0F, -2.069F, 1.3268F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 39).addBox(-1.0F, -0.869F, 0.3268F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, -8.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(95, 145).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0255F, -5.7268F, 0.0426F, 0.0442F, -0.2073F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(136, 107).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0255F, -5.7268F, 0.0123F, 0.0825F, -0.678F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-11.2446F, -1.8776F, -0.5238F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0255F, -5.7268F, -0.0321F, 0.077F, -1.2208F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-10.2446F, -1.8776F, -0.5238F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -2.7268F, -0.0342F, 0.0597F, -1.2733F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(136, 105).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -2.7268F, 0.0015F, 0.0687F, -0.7312F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(145, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4745F, -2.7268F, 0.0268F, 0.0368F, -0.2603F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(41, 17).addBox(2.2446F, -1.8776F, -0.5238F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0255F, -5.7268F, -0.0321F, -0.077F, 1.2208F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(136, 107).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0255F, -5.7268F, 0.0123F, -0.0825F, 0.678F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 145).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0255F, -5.7268F, 0.0426F, -0.0442F, 0.2073F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(145, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -2.7268F, 0.0268F, -0.0368F, 0.2603F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(136, 105).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -2.7268F, 0.0015F, -0.0687F, 0.7312F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(68, 54).addBox(2.2446F, -1.8776F, -0.5238F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.4745F, -2.7268F, -0.0342F, -0.0597F, 1.2733F));

		PartDefinition neckbase = body.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.15F, -7.7F, 0.0691F, -0.1744F, 0.0077F));

		PartDefinition cube_r60 = neckbase.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(118, 133).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4063F, -1.9773F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r61 = neckbase.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(113, 133).addBox(0.0F, -1.8F, 0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.396F, -4.9717F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r62 = neckbase.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 133).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1466F, -7.7729F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r63 = neckbase.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(103, 133).addBox(0.0F, -2.2F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.9937F, -10.5482F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r64 = neckbase.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-7.0F, 0.0F, -0.4F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 9.1848F, 2.8786F, -0.0599F, 0.8614F, 0.3121F));

		PartDefinition cube_r65 = neckbase.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9086F, 8.9518F, 2.1843F, -0.0989F, 0.6485F, 0.2636F));

		PartDefinition cube_r66 = neckbase.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(124, 18).mirror().addBox(-3.9F, 0.0F, -0.8F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5368F, 8.6949F, 0.3956F, 0.0937F, -0.0292F, 0.4412F));

		PartDefinition cube_r67 = neckbase.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-4.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3427F, 8.7173F, 1.0678F, -0.043F, 0.3147F, -0.0397F));

		PartDefinition cube_r68 = neckbase.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(116, 51).mirror().addBox(-1.5F, -1.5F, 2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(116, 46).mirror().addBox(-1.5F, -1.5F, -0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(118, 112).addBox(-1.0F, -1.5F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(116, 51).addBox(-1.5F, -1.5F, 2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(116, 46).addBox(-1.5F, -1.5F, -0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 8.6133F, -3.184F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r69 = neckbase.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 26).mirror().addBox(-2.3946F, -0.9893F, -1.4753F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.2539F, -2.5523F, -0.2746F, 0.3031F, -0.0839F));

		PartDefinition cube_r70 = neckbase.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(-2.3761F, -0.9893F, -2.6931F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.2539F, -2.5523F, -0.3486F, -0.711F, 0.2329F));

		PartDefinition cube_r71 = neckbase.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(96, 113).mirror().addBox(0.1F, -0.1045F, -2.8842F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.1002F, 4.7283F, -2.717F, 0.1163F, -0.053F, -0.5846F));

		PartDefinition cube_r72 = neckbase.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(83, 113).mirror().addBox(-0.5F, -2.4345F, -4.7183F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 4.0015F, -2.6795F, 0.3013F, -0.1215F, 0.2451F));

		PartDefinition cube_r73 = neckbase.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 108).mirror().addBox(-0.5F, -1.1045F, -5.1842F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 4.0015F, -2.6795F, 0.0395F, -0.1215F, 0.2451F));

		PartDefinition cube_r74 = neckbase.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(116, 39).mirror().addBox(-0.5F, -1.2294F, 0.6116F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 4.0015F, -2.6795F, -0.135F, -0.1215F, 0.2451F));

		PartDefinition cube_r75 = neckbase.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 115).mirror().addBox(-0.5F, -3.0631F, -0.3401F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 4.0015F, -2.6795F, -0.5713F, -0.1215F, 0.2451F));

		PartDefinition cube_r76 = neckbase.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(60, 115).mirror().addBox(-0.5F, -2.9525F, -3.1162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.3F, 4.0015F, -2.6795F, -0.1699F, -0.1215F, 0.2451F));

		PartDefinition cube_r77 = neckbase.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(127, 65).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6755F, -9.5269F, 0.0391F, 0.5787F, -1.424F));

		PartDefinition cube_r78 = neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(139, 58).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6755F, -9.5269F, 0.3547F, 0.469F, -0.8091F));

		PartDefinition cube_r79 = neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(127, 145).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6755F, -9.5269F, 0.5131F, 0.2448F, -0.3649F));

		PartDefinition cube_r80 = neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(124, 98).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9755F, -6.8269F, -0.0008F, 0.3194F, -1.2146F));

		PartDefinition cube_r81 = neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(137, 69).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9755F, -6.8269F, 0.1681F, 0.2729F, -0.6503F));

		PartDefinition cube_r82 = neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(115, 145).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.9755F, -6.8269F, 0.2663F, 0.1451F, -0.1861F));

		PartDefinition cube_r83 = neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(123, 92).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1755F, -3.9268F, -0.0168F, 0.1982F, -1.1663F));

		PartDefinition cube_r84 = neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(136, 111).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1755F, -3.9268F, 0.0888F, 0.1782F, -0.6157F));

		PartDefinition cube_r85 = neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(110, 145).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.1755F, -3.9268F, 0.1539F, 0.0952F, -0.1472F));

		PartDefinition cube_r86 = neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(145, 95).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0268F, 0.0743F, 0.0589F, -0.1708F));

		PartDefinition cube_r87 = neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(136, 109).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0268F, 0.034F, 0.1099F, -0.641F));

		PartDefinition cube_r88 = neckbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6245F, -1.0268F, -0.0277F, 0.1116F, -1.1855F));

		PartDefinition cube_r89 = neckbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(127, 145).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6755F, -9.5269F, 0.5131F, -0.2448F, 0.3649F));

		PartDefinition cube_r90 = neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(139, 58).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6755F, -9.5269F, 0.3547F, -0.469F, 0.8091F));

		PartDefinition cube_r91 = neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(127, 65).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.6755F, -9.5269F, 0.0391F, -0.5787F, 1.424F));

		PartDefinition cube_r92 = neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(115, 145).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9755F, -6.8269F, 0.2663F, -0.1451F, 0.1861F));

		PartDefinition cube_r93 = neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(137, 69).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9755F, -6.8269F, 0.1681F, -0.2729F, 0.6503F));

		PartDefinition cube_r94 = neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(124, 98).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9755F, -6.8269F, -0.0008F, -0.3194F, 1.2146F));

		PartDefinition cube_r95 = neckbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(110, 145).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1755F, -3.9268F, 0.1539F, -0.0952F, 0.1472F));

		PartDefinition cube_r96 = neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(136, 111).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1755F, -3.9268F, 0.0888F, -0.1782F, 0.6157F));

		PartDefinition cube_r97 = neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(123, 92).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.1755F, -3.9268F, -0.0168F, -0.1982F, 1.1663F));

		PartDefinition cube_r98 = neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(145, 95).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0268F, 0.0743F, -0.0589F, 0.1708F));

		PartDefinition cube_r99 = neckbase.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(136, 109).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0268F, 0.034F, -0.1099F, 0.641F));

		PartDefinition cube_r100 = neckbase.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(101, 35).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6245F, -1.0268F, -0.0277F, -0.1116F, 1.1855F));

		PartDefinition cube_r101 = neckbase.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 113).addBox(-0.5F, -2.4345F, -4.7183F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.3F, 4.0015F, -2.6795F, 0.3013F, 0.1215F, -0.2451F));

		PartDefinition cube_r102 = neckbase.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 113).addBox(-1.1F, -0.1045F, -2.8842F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.1002F, 4.7283F, -2.717F, 0.1163F, 0.053F, 0.5846F));

		PartDefinition cube_r103 = neckbase.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 108).addBox(-0.5F, -1.1045F, -5.1842F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 4.0015F, -2.6795F, 0.0395F, 0.1215F, -0.2451F));

		PartDefinition cube_r104 = neckbase.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(116, 39).addBox(-0.5F, -1.2294F, 0.6116F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.3F, 4.0015F, -2.6795F, -0.135F, 0.1215F, -0.2451F));

		PartDefinition cube_r105 = neckbase.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(71, 115).addBox(-0.5F, -3.0631F, -0.3401F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.3F, 4.0015F, -2.6795F, -0.5713F, 0.1215F, -0.2451F));

		PartDefinition cube_r106 = neckbase.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(60, 115).addBox(-0.5F, -2.9525F, -3.1162F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.3F, 4.0015F, -2.6795F, -0.1699F, 0.1215F, -0.2451F));

		PartDefinition cube_r107 = neckbase.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(124, 18).addBox(-0.1F, 0.0F, -0.8F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5368F, 8.6949F, 0.3956F, 0.0937F, 0.0292F, -0.4412F));

		PartDefinition cube_r108 = neckbase.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(101, 37).addBox(0.0F, 0.0F, -0.4F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3856F, 9.1848F, 2.8786F, -0.0599F, -0.8614F, -0.3121F));

		PartDefinition cube_r109 = neckbase.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(62, 17).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9086F, 8.9518F, 2.1843F, -0.0989F, -0.6485F, -0.2636F));

		PartDefinition cube_r110 = neckbase.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 120).addBox(-0.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3427F, 8.7173F, 1.0678F, -0.043F, -0.3147F, 0.0397F));

		PartDefinition cube_r111 = neckbase.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(101, 26).addBox(0.3946F, -0.9893F, -1.4753F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 8.2539F, -2.5523F, -0.2746F, -0.3031F, 0.0839F));

		PartDefinition cube_r112 = neckbase.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(114, 76).addBox(0.3761F, -0.9893F, -2.6931F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 8.2539F, -2.5523F, -0.3486F, 0.711F, -0.2329F));

		PartDefinition cube_r113 = neckbase.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(68, 40).addBox(-1.0F, -0.5F, -3.9F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3F, -6.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = neckbase.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create().texOffs(123, 82).addBox(-1.4061F, -1.2135F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 123).addBox(-1.4061F, 6.7865F, -1.3464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4507F, 6.8422F, -2.678F, 0.9414F, -0.0153F, -0.541F));

		PartDefinition cube_r114 = frontLeftLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 132).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4061F, 3.5485F, -1.452F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r115 = frontLeftLeg.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(129, 44).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4061F, 3.5485F, -1.452F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r116 = frontLeftLeg.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(67, 135).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4061F, 1.2865F, -0.2464F, -0.1309F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.115F, 9.237F, -1.1784F, -0.6736F, 0.2289F, 0.4007F));

		PartDefinition cube_r117 = frontLeftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(122, 21).addBox(-1.5F, -1.9F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0731F, 1.0027F, 1.3438F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r118 = frontLeftLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(20, 136).addBox(-0.5F, -1.9F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2269F, 2.7893F, 1.1245F, -0.2925F, -0.0508F, -0.1671F));

		PartDefinition cube_r119 = frontLeftLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 126).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2269F, 3.2514F, 0.4128F, -0.1217F, 0.0106F, 0.0866F));

		PartDefinition cube_r120 = frontLeftLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(131, 20).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4555F, 3.3725F, -0.5003F, 0.0087F, 0.0004F, -0.0436F));

		PartDefinition cube_r121 = frontLeftLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 135).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4555F, 3.3725F, -0.5003F, 0.0087F, -0.0008F, 0.0873F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(26, 117).addBox(-3.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2697F, 7.1544F, -0.0233F, 0.5503F, -0.3883F, 0.2493F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create().texOffs(49, 109).addBox(1.5F, -0.6F, -3.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.5F, 0.1F, -1.3F, -0.6545F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = neckbase.addOrReplaceChild("frontRightLeg", CubeListBuilder.create().texOffs(123, 87).addBox(-0.5939F, -1.2135F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(123, 123).addBox(-0.5939F, 6.7865F, -1.3464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4507F, 6.8422F, -2.678F, 0.1466F, -0.1608F, 0.6704F));

		PartDefinition cube_r122 = frontRightLeg.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 132).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4061F, 3.5485F, -1.452F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r123 = frontRightLeg.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(129, 51).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4061F, 3.5485F, -1.452F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r124 = frontRightLeg.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(72, 135).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4061F, 1.2865F, -0.2464F, -0.1309F, 0.0F, 0.0F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.115F, 9.237F, -1.1784F, -0.8918F, -0.2289F, -0.4007F));

		PartDefinition cube_r125 = frontRightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(48, 122).addBox(-0.5F, -1.9F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0731F, 1.0027F, 1.3438F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = frontRightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(136, 20).addBox(-0.5F, -1.9F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2269F, 2.7893F, 1.1245F, -0.2925F, 0.0508F, 0.1671F));

		PartDefinition cube_r127 = frontRightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 126).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2269F, 3.2514F, 0.4128F, -0.1217F, -0.0106F, -0.0866F));

		PartDefinition cube_r128 = frontRightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(5, 132).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4555F, 3.3725F, -0.5003F, 0.0087F, -0.0004F, 0.0436F));

		PartDefinition cube_r129 = frontRightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(62, 135).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4555F, 3.3725F, -0.5003F, 0.0087F, 0.0008F, -0.0873F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(118, 35).addBox(-1.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2697F, 7.1544F, -0.0233F, 0.524F, 0.2539F, -0.0563F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create().texOffs(66, 109).addBox(-5.5F, -0.6F, -3.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offset(4.5F, 0.1F, -1.3F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(34, 109).addBox(-1.0F, -1.2F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(86, 134).addBox(0.0F, -3.1F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9792F, -9.902F, 0.0435F, -0.436F, -0.0184F));

		PartDefinition cube_r130 = neck.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(139, 42).mirror().addBox(0.0F, 0.4735F, 3.4223F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6359F, -4.8332F, 0.0F, -0.1309F, 0.1745F));

		PartDefinition cube_r131 = neck.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(139, 38).mirror().addBox(0.0F, -0.1366F, 1.6315F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6359F, -4.8332F, -0.1745F, -0.1309F, 0.1745F));

		PartDefinition cube_r132 = neck.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(139, 71).mirror().addBox(0.0F, -0.8516F, -0.1565F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6359F, -4.8332F, -0.5672F, -0.1309F, 0.1745F));

		PartDefinition cube_r133 = neck.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-0.0012F, -0.8997F, 0.0857F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3117F, -12.083F, -0.1582F, -0.1207F, 0.0192F));

		PartDefinition cube_r134 = neck.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(31, 74).addBox(0.0012F, -0.8997F, 0.0857F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3117F, -12.083F, -0.1582F, 0.1207F, -0.0192F));

		PartDefinition cube_r135 = neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 98).addBox(-1.0F, -2.0F, -6.9F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, -1.875F, -5.9F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0954F, -4.9675F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(139, 42).addBox(0.0F, 0.4735F, 3.4223F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6359F, -4.8332F, 0.0F, 0.1309F, -0.1745F));

		PartDefinition cube_r138 = neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(139, 38).addBox(0.0F, -0.1366F, 1.6315F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6359F, -4.8332F, -0.1745F, 0.1309F, -0.1745F));

		PartDefinition cube_r139 = neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(139, 71).addBox(0.0F, -0.8516F, -0.1565F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6359F, -4.8332F, -0.5672F, 0.1309F, -0.1745F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, -1.3F, -13.9F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.4201F, -11.699F, -0.1454F, -0.389F, 0.0555F));

		PartDefinition cube_r140 = neck2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(105, 112).addBox(0.0F, -1.125F, -6.1F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -0.1F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r141 = neck2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.1971F, -0.6893F, -0.0245F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1794F, 0.4093F, -13.9809F, -0.0704F, -0.0862F, 0.0137F));

		PartDefinition cube_r142 = neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 40).addBox(1.1971F, -0.6893F, -0.0245F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1794F, 0.4093F, -13.9809F, -0.0704F, 0.0862F, -0.0137F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(35, 40).addBox(-1.0F, -1.3F, -13.4F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0378F, -13.9646F, -0.124F, -0.3466F, 0.0423F));

		PartDefinition cube_r143 = neck3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(125, 68).addBox(0.0F, -0.9F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-2.3362F, -0.7077F, 0.181F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3349F, 0.6087F, -13.4148F, -0.0704F, -0.0862F, 0.0137F));

		PartDefinition cube_r145 = neck3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 59).addBox(2.3362F, -0.7077F, 0.181F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3349F, 0.6087F, -13.4148F, -0.0704F, 0.0862F, -0.0137F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1302F, -13.6535F, -0.0757F, -0.2176F, 0.0164F));

		PartDefinition cube_r146 = neck4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 74).addBox(0.0F, -0.7F, -1.8F, 0.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3062F, -2.0945F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-3.2922F, -0.6235F, 0.0816F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2712F, 0.2185F, -10.5141F, -0.0355F, -0.0862F, 0.0137F));

		PartDefinition cube_r148 = neck4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 57).addBox(3.2922F, -0.6235F, 0.0816F, 0.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2712F, 0.2185F, -10.5141F, -0.0355F, 0.0862F, -0.0137F));

		PartDefinition cube_r149 = neck4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(66, 57).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 2.0F, 12.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.4062F, -10.8945F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2062F, -10.7945F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r150 = neck5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(114, 68).addBox(0.0F, -2.1F, -5.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.309F, -0.9511F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-4.0663F, -1.1494F, 0.4624F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0851F, -1.5897F, -8.8196F, -0.306F, -0.0862F, 0.0137F));

		PartDefinition cube_r152 = neck5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 26).addBox(4.0663F, -1.1494F, 0.4624F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0851F, -1.5897F, -8.8196F, -0.306F, 0.0862F, -0.0137F));

		PartDefinition cube_r153 = neck5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 86).addBox(-1.0F, -1.7F, -0.2F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3389F, -8.4929F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -8.5F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r154 = neck6.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(39, 117).addBox(0.0F, -2.0F, -3.8F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4769F, -0.7632F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck6.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-4.8108F, -0.7234F, 0.3804F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7467F, -4.1417F, -7.128F, -0.6245F, -0.0862F, 0.0137F));

		PartDefinition cube_r156 = neck6.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(95, 61).addBox(4.8108F, -0.7234F, 0.3804F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7467F, -4.1417F, -7.128F, -0.6245F, 0.0862F, -0.0137F));

		PartDefinition cube_r157 = neck6.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 88).addBox(-1.0F, -0.275F, -0.25F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -5.2225F, -6.3764F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4F, -7.4F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r158 = neck7.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(134, 115).addBox(0.0F, -1.9F, -3.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r159 = neck7.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(48, 98).mirror().addBox(-5.4978F, -1.3683F, 0.3611F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5018F, -3.9513F, -7.8002F, -0.6376F, -0.0862F, 0.0137F));

		PartDefinition cube_r160 = neck7.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 98).addBox(5.4978F, -1.3683F, 0.3611F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5018F, -3.9513F, -7.8002F, -0.6376F, 0.0862F, -0.0137F));

		PartDefinition cube_r161 = neck7.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, -0.5F, -0.175F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.8346F, -7.2615F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.8F, -7.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r162 = neck8.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 139).addBox(0.0F, -1.9F, -2.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neck8.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -0.2296F, -0.1799F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -4.1708F, -7.7288F, -0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r164 = neck8.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(67, 98).mirror().addBox(-6.2279F, -1.3231F, 0.6362F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2673F, -2.2519F, -8.6674F, -0.4107F, -0.0862F, 0.0137F));

		PartDefinition cube_r165 = neck8.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 98).addBox(6.2279F, -1.3231F, 0.6362F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2673F, -2.2519F, -8.6674F, -0.4107F, 0.0862F, -0.0137F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -8.2F, -0.1855F, -0.3435F, 0.0631F));

		PartDefinition cube_r166 = neck9.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(102, 95).addBox(0.0F, -1.9F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck9.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(105, 103).mirror().addBox(-6.8278F, -0.6835F, 0.9784F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.8769F, 0.8282F, -7.5185F, -0.018F, -0.0862F, 0.0137F));

		PartDefinition cube_r168 = neck9.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(105, 103).addBox(6.8278F, -0.6835F, 0.9784F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8769F, 0.8282F, -7.5185F, -0.018F, 0.0862F, -0.0137F));

		PartDefinition cube_r169 = neck9.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 50).addBox(-1.0F, -0.3028F, -0.1107F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6371F, -7.2058F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -7.2F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r170 = neck10.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(19, 105).addBox(0.0F, -1.4F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 61).addBox(-1.0F, -0.7981F, -2.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck10.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(118, 117).mirror().addBox(-7.0713F, -0.3988F, 0.717F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0974F, 1.2698F, -2.9408F, 0.0256F, -0.0862F, 0.0137F));

		PartDefinition cube_r172 = neck10.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(118, 117).addBox(7.0713F, -0.3988F, 0.717F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0974F, 1.2698F, -2.9408F, 0.0256F, 0.0862F, -0.0137F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.581F, -2.1427F, 0.3529F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.9F, -0.6F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r173 = lowerjaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(144, 130).mirror().addBox(-0.4201F, -0.8633F, -0.4062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(144, 127).mirror().addBox(-0.4201F, -0.8633F, -0.8062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(144, 124).mirror().addBox(-0.4201F, -0.8633F, -1.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, 0.0113F, -0.3182F, 0.0064F));

		PartDefinition cube_r174 = lowerjaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(75, 145).mirror().addBox(-0.4201F, -1.1415F, -3.0499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(55, 145).mirror().addBox(-0.4201F, -1.1415F, -2.5499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(145, 12).mirror().addBox(-0.4201F, -1.1415F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(131, 10).mirror().addBox(-0.4201F, -0.9415F, -2.5499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, 0.1029F, -0.3182F, 0.0064F));

		PartDefinition cube_r175 = lowerjaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(144, 81).mirror().addBox(-0.5F, -0.45F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9346F, -0.5292F, -2.9769F, -0.0367F, -0.3182F, 0.0064F));

		PartDefinition cube_r176 = lowerjaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(144, 78).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8725F, -0.5083F, -3.1659F, 0.0593F, -0.3182F, 0.0064F));

		PartDefinition cube_r177 = lowerjaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(10, 145).mirror().addBox(-0.3748F, -4.0871F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 145).mirror().addBox(-0.3748F, -3.8871F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, 1.295F, -0.3013F, -0.0442F));

		PartDefinition cube_r178 = lowerjaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(144, 84).mirror().addBox(-0.4201F, -1.8473F, -3.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, 0.4171F, -0.3182F, 0.0064F));

		PartDefinition cube_r179 = lowerjaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(131, 6).mirror().addBox(-0.4201F, -0.9652F, -3.9418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, 0.116F, -0.3182F, 0.0064F));

		PartDefinition cube_r180 = lowerjaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(144, 60).mirror().addBox(-0.425F, -0.5F, -0.6625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(144, 66).mirror().addBox(-0.425F, -0.5F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0182F, -0.2704F, -6.316F, 0.1718F, -0.6408F, -1.838F));

		PartDefinition cube_r181 = lowerjaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(144, 51).mirror().addBox(-0.55F, -0.45F, -0.5875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(144, 54).mirror().addBox(-0.55F, -0.45F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0828F, -0.3344F, -6.0909F, -1.1091F, -0.4107F, -0.634F));

		PartDefinition cube_r182 = lowerjaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(144, 45).mirror().addBox(-0.475F, -0.6F, -0.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(144, 48).mirror().addBox(-0.475F, -0.6F, -0.6125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1079F, -0.1897F, -5.8478F, -1.187F, -0.2823F, -0.546F));

		PartDefinition cube_r183 = lowerjaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(144, 39).mirror().addBox(-0.5F, -0.5F, -0.5875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(144, 42).mirror().addBox(-0.5F, -0.5F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2767F, -0.3891F, -5.4848F, -1.4395F, -0.2F, -0.4168F));

		PartDefinition cube_r184 = lowerjaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-0.4201F, -0.4747F, -2.6362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.0611F, -2.5143F, -0.1022F, -0.3182F, 0.0064F));

		PartDefinition cube_r185 = lowerjaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(131, 26).mirror().addBox(-0.5F, -0.2066F, -2.8457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.1004F, -0.2618F, 0.0F));

		PartDefinition cube_r186 = lowerjaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(144, 87).mirror().addBox(-0.5F, -0.383F, 0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(139, 81).mirror().addBox(-0.5F, -0.2841F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(139, 60).mirror().addBox(-0.5F, -0.5341F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.1833F, -0.2618F, 0.0F));

		PartDefinition cube_r187 = lowerjaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(144, 75).mirror().addBox(-0.5F, -0.4665F, -0.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.4102F, -0.2618F, 0.0F));

		PartDefinition cube_r188 = lowerjaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(77, 139).mirror().addBox(-0.5F, -0.4756F, -0.6965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(139, 75).mirror().addBox(-0.5F, -0.4756F, -1.0965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.2574F, -0.2618F, 0.0F));

		PartDefinition cube_r189 = lowerjaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(16, 130).mirror().addBox(-0.5F, -0.3363F, -2.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(129, 111).mirror().addBox(-0.5F, -0.6363F, -2.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.096F, -0.2618F, 0.0F));

		PartDefinition cube_r190 = lowerjaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(120, 30).mirror().addBox(-0.5F, -0.2264F, -1.4544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.775F, 0.0611F, -0.0143F, -0.0829F, -0.2618F, 0.0F));

		PartDefinition cube_r191 = lowerjaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(144, 130).addBox(-0.5799F, -0.8633F, -0.4062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(144, 127).addBox(-0.5799F, -0.8633F, -0.8062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(144, 124).addBox(-0.5799F, -0.8633F, -1.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, 0.0113F, 0.3182F, -0.0064F));

		PartDefinition cube_r192 = lowerjaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 145).addBox(-0.5799F, -1.1415F, -3.0499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 145).addBox(-0.5799F, -1.1415F, -2.5499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(145, 12).addBox(-0.5799F, -1.1415F, -1.9499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(131, 10).addBox(-0.5799F, -0.9415F, -2.5499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, 0.1029F, 0.3182F, -0.0064F));

		PartDefinition cube_r193 = lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(144, 81).addBox(-0.5F, -0.45F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1346F, -0.5292F, -2.9769F, -0.0367F, 0.3182F, -0.0064F));

		PartDefinition cube_r194 = lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(144, 78).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0725F, -0.5083F, -3.1659F, 0.0593F, 0.3182F, -0.0064F));

		PartDefinition cube_r195 = lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 145).addBox(-0.6252F, -4.0871F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 145).addBox(-0.6252F, -3.8871F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, 1.295F, 0.3013F, 0.0442F));

		PartDefinition cube_r196 = lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(144, 84).addBox(-0.5799F, -1.8473F, -3.5242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, 0.4171F, 0.3182F, -0.0064F));

		PartDefinition cube_r197 = lowerjaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(131, 6).addBox(-0.5799F, -0.9652F, -3.9418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, 0.116F, 0.3182F, -0.0064F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(144, 60).addBox(-0.575F, -0.5F, -0.6625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(144, 66).addBox(-0.575F, -0.5F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1818F, -0.2704F, -6.316F, 0.1718F, 0.6408F, 1.838F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(144, 51).addBox(-0.45F, -0.45F, -0.5875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(144, 54).addBox(-0.45F, -0.45F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2828F, -0.3344F, -6.0909F, -1.1091F, 0.4107F, 0.634F));

		PartDefinition cube_r200 = lowerjaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(144, 45).addBox(-0.525F, -0.6F, -0.7875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(144, 48).addBox(-0.525F, -0.6F, -0.6125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3079F, -0.1897F, -5.8478F, -1.187F, 0.2823F, 0.546F));

		PartDefinition cube_r201 = lowerjaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(144, 39).addBox(-0.5F, -0.5F, -0.5875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(144, 42).addBox(-0.5F, -0.5F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4767F, -0.3891F, -5.4848F, -1.4395F, 0.2F, 0.4168F));

		PartDefinition cube_r202 = lowerjaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(56, 81).addBox(-0.5799F, -0.4747F, -2.6362F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.375F, 0.0611F, -2.5143F, -0.1022F, 0.3182F, -0.0064F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(131, 26).addBox(-0.5F, -0.2066F, -2.8457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.1004F, 0.2618F, 0.0F));

		PartDefinition cube_r204 = lowerjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(144, 87).addBox(-0.5F, -0.383F, 0.0807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(139, 81).addBox(-0.5F, -0.2841F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(139, 60).addBox(-0.5F, -0.5341F, -1.4813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.1833F, 0.2618F, 0.0F));

		PartDefinition cube_r205 = lowerjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(144, 75).addBox(-0.5F, -0.4665F, -0.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.4102F, 0.2618F, 0.0F));

		PartDefinition cube_r206 = lowerjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(77, 139).addBox(-0.5F, -0.4756F, -0.6965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(139, 75).addBox(-0.5F, -0.4756F, -1.0965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.2574F, 0.2618F, 0.0F));

		PartDefinition cube_r207 = lowerjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(16, 130).addBox(-0.5F, -0.3363F, -2.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(129, 111).addBox(-0.5F, -0.6363F, -2.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.096F, 0.2618F, 0.0F));

		PartDefinition cube_r208 = lowerjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(120, 30).addBox(-0.5F, -0.2264F, -1.4544F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.975F, 0.0611F, -0.0143F, -0.0829F, 0.2618F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition cube_r209 = upperjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(120, 108).addBox(-2.0F, -0.8194F, -0.207F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0358F, -0.827F, -2.1598F, 0.0F, 0.0F));

		PartDefinition cube_r210 = upperjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(48, 95).addBox(-0.5F, -0.3283F, -0.8219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.1419F, -4.1308F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r211 = upperjaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(64, 127).addBox(-0.5F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.4419F, -3.8058F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r212 = upperjaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(131, 35).addBox(-0.5F, -0.7905F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.2608F, -4.6521F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r213 = upperjaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 142).addBox(-1.0F, -0.4934F, -0.6409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(144, 114).addBox(-1.0F, -0.6934F, -0.6409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.0858F, -6.827F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r214 = upperjaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(144, 121).addBox(-1.0F, -0.715F, -0.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.0108F, -6.452F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r215 = upperjaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 142).addBox(-1.0F, -0.2974F, -0.2866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.5858F, -6.602F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r216 = upperjaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(75, 142).addBox(-1.0F, -0.3096F, -0.7044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.2358F, -6.1521F, -1.4094F, 0.0F, 0.0F));

		PartDefinition cube_r217 = upperjaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(55, 142).addBox(-1.0F, -0.2152F, -0.7976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.2358F, -5.5271F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r218 = upperjaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(142, 17).addBox(-1.0F, -0.1977F, -0.7963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.4608F, -4.952F, -1.1999F, 0.0F, 0.0F));

		PartDefinition cube_r219 = upperjaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(10, 142).addBox(-0.5F, -0.213F, -0.1849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.2608F, -4.677F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r220 = upperjaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(87, 54).addBox(-0.5F, -0.1865F, -0.2095F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.5108F, -4.102F, -1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r221 = upperjaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(38, 124).addBox(-0.5F, 0.4139F, -0.2226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(120, 26).addBox(-1.0F, -0.1861F, -0.2226F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -2.1358F, -3.077F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r222 = upperjaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(120, 4).addBox(-2.0F, -0.2057F, -0.1875F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -2.3858F, -2.552F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r223 = upperjaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(120, 0).addBox(-2.0F, -0.2079F, -0.2398F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -2.3858F, -1.952F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r224 = upperjaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(13, 117).addBox(-2.0F, -0.2008F, -0.2023F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.2858F, -1.352F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r225 = upperjaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(116, 56).addBox(-2.0F, -0.8008F, -0.2023F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -2.2858F, -1.352F, -2.0071F, 0.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5212F, -0.8079F, -5.5428F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(138, 138).addBox(-0.55F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2704F, 0.2428F, -0.0276F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(132, 72).addBox(-1.625F, -0.55F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(111, 128).addBox(-0.55F, -1.05F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0776F, -0.4043F, 3.0603F, 0.2401F, 0.3011F, -0.0087F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(144, 36).addBox(-0.45F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2019F, -1.219F, 4.105F, 0.0F, -0.2094F, -1.5708F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(144, 36).addBox(-0.5006F, 0.5798F, -0.6144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, 2.4959F, 0.3011F, -0.0087F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(133, 138).addBox(-0.5006F, -0.4873F, -0.1963F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, 1.8152F, 0.3011F, -0.0087F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(121, 138).addBox(-0.5006F, -0.5656F, -0.3087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, 1.5011F, 0.3011F, -0.0087F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(116, 138).addBox(-0.5006F, -0.707F, -0.1858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(111, 138).addBox(-0.5006F, -0.707F, -0.6858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, 0.9556F, 0.3011F, -0.0087F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(143, 137).addBox(-0.5006F, 0.3421F, -0.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, 0.3928F, 0.3011F, -0.0087F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 138).addBox(-0.5006F, -0.6507F, -0.4424F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, -0.1439F, 0.3011F, -0.0087F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(143, 111).addBox(-0.5006F, 0.3427F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, -0.4973F, 0.3011F, -0.0087F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(143, 108).addBox(-0.5006F, 0.2182F, -0.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, -1.8325F, 0.3011F, -0.0087F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(143, 105).addBox(-0.5006F, 0.2277F, -0.2955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(129, 102).addBox(-0.5006F, -0.0916F, -0.8491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, -1.6231F, 0.3011F, -0.0087F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(143, 102).addBox(-0.5006F, 0.3184F, -0.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9227F, -0.4352F, 2.9819F, -1.1431F, 0.3011F, -0.0087F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(25, 140).addBox(-0.5F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6907F, -1.3329F, 2.4862F, -0.8692F, 0.3381F, 0.0122F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(20, 140).addBox(-0.5F, -0.3F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.8634F, -1.4584F, 3.047F, -1.3367F, 0.2811F, 0.0815F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(140, 14).addBox(-0.7763F, -1.9459F, -1.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(127, 117).addBox(-0.7763F, -1.7459F, -1.1613F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(139, 87).addBox(-0.7763F, -0.7459F, -0.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8038F, 0.021F, 1.8902F, -1.6232F, 0.2923F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(143, 99).addBox(-0.2935F, -0.3641F, -0.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6948F, -0.6568F, 1.9958F, 0.0594F, 0.2515F, 1.0973F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(90, 143).addBox(-0.3652F, -0.3677F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7969F, -0.5372F, 1.7272F, -0.3838F, 0.4765F, 0.909F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(139, 131).addBox(-0.5913F, -0.4875F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 143).addBox(-0.3913F, -0.4875F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.7969F, -0.5372F, 1.7272F, -0.5205F, 0.3185F, 0.56F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(96, 133).addBox(-1.1669F, -0.4392F, -0.6199F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6699F, -0.6568F, 1.9708F, -0.4169F, 0.1885F, 0.3056F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(133, 94).addBox(-1.1848F, -0.4705F, -0.6199F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.6948F, -0.6568F, 1.9958F, -0.1968F, 0.1684F, -0.0089F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(23, 133).addBox(-1.1848F, -0.6011F, -0.6309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6948F, -0.6568F, 1.9958F, -0.5022F, 0.1684F, -0.0089F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(133, 14).addBox(-0.9691F, -0.7474F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.6948F, -0.6568F, 1.9958F, -0.8592F, -0.3352F, -0.419F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(132, 131).addBox(-1.1848F, -0.6974F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F))
				.texOffs(132, 128).addBox(-1.1848F, -0.8974F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6948F, -0.6568F, 1.9958F, -0.8949F, 0.1684F, -0.0089F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(65, 143).addBox(-0.4996F, -1.1641F, -0.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 143).addBox(-0.4996F, -1.0641F, -0.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.2824F, -1.3877F, 3.0359F, -1.6883F, 0.0812F, -0.0525F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(132, 125).addBox(-1.4996F, -0.8891F, -0.665F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2824F, -1.3877F, 3.0359F, -1.601F, 0.0812F, -0.0525F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(132, 122).addBox(-1.4996F, -0.7231F, -0.6222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.2824F, -1.3877F, 3.0359F, -1.4614F, 0.0812F, -0.0525F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(132, 87).addBox(-1.4996F, -0.5346F, -0.6155F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2824F, -1.3877F, 3.0359F, -1.409F, 0.0812F, -0.0525F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(132, 84).addBox(-1.6073F, -0.4472F, -0.6021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.3824F, -1.3877F, 2.9359F, -1.313F, 0.2773F, -0.0016F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(132, 81).addBox(-1.6073F, -0.2589F, -0.6104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3824F, -1.3877F, 2.9359F, -1.2563F, 0.2773F, -0.0016F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(132, 78).addBox(-1.6073F, -0.0828F, -0.6449F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(1.3824F, -1.3877F, 2.9359F, -1.1516F, 0.2773F, -0.0016F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(132, 75).addBox(-1.5573F, -0.397F, -0.401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.1783F, -1.4009F, 2.4015F, -1.0458F, 0.6209F, 0.1768F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(50, 143).addBox(-0.5983F, -0.3594F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(141, 30).addBox(-0.4983F, -0.3594F, -0.0798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -0.9249F, 0.0349F, -0.0014F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(85, 145).addBox(-0.7714F, 0.3213F, -1.5988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 4.4928F, -2.4697F, 0.1222F, -0.0014F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(101, 138).addBox(-0.7868F, -0.2021F, -0.1525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6788F, -0.9381F, 5.2012F, -1.7752F, 0.2248F, -0.0228F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(55, 138).addBox(-0.8884F, -1.511F, -1.8008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(138, 26).addBox(-0.8884F, -1.511F, -1.2008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.6288F, 0.8079F, 4.2428F, -0.6504F, 0.2792F, -0.0015F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(139, 128).addBox(-0.8F, -1.3406F, -0.3404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5038F, 0.021F, 0.8902F, -1.5533F, 0.3142F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(45, 143).addBox(-0.5337F, -0.6011F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 143).addBox(-0.5337F, -0.6011F, -0.2375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5242F, 0.7589F, -1.4413F, -2.9498F, 0.6443F, -1.5884F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(35, 143).addBox(-0.5394F, -0.3924F, -0.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(143, 33).addBox(-0.5394F, -0.3924F, -0.4056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2672F, 0.7533F, -1.2388F, -2.056F, 0.4159F, -0.6769F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(30, 143).addBox(-0.6195F, -0.4537F, -0.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(143, 26).addBox(-0.6195F, -0.4537F, -0.4143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0922F, 0.7533F, -1.0639F, -1.8076F, 0.2985F, -0.493F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(25, 143).addBox(-0.6356F, -0.4276F, -0.276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(143, 23).addBox(-0.6356F, -0.4276F, -0.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0172F, 0.7533F, -0.6889F, -1.7184F, 0.3465F, -0.2403F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(20, 143).addBox(-0.5168F, -0.4993F, -0.2519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 143).addBox(-0.5168F, -0.4993F, -0.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0172F, 0.7533F, -0.3388F, -1.6442F, 0.3465F, -0.2403F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(143, 9).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0849F, 0.7492F, 0.1557F, -1.5642F, 0.3538F, -0.0081F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(143, 6).addBox(-0.7992F, -0.7615F, -0.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2288F, 0.7471F, -0.0343F, -1.5886F, 0.3491F, -0.001F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(143, 3).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5138F, 0.7026F, 1.8916F, -1.5621F, 0.3142F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 143).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1446F, 0.8176F, 0.7556F, -1.4772F, 0.2229F, -0.009F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(141, 142).addBox(-0.725F, -0.7858F, 0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 139).addBox(-0.8F, -0.7858F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5038F, 0.021F, 0.8902F, -1.4748F, 0.3142F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(139, 125).addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(139, 122).addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.4761F, -0.3839F, 1.7757F, -1.2479F, 0.3142F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(62, 132).addBox(-1.8F, -0.7905F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2788F, -0.4529F, 0.9657F, -1.0759F, 0.3548F, 0.1579F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(124, 94).addBox(-1.8F, -1.3854F, -0.1301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2788F, -0.4529F, 0.9657F, -0.9668F, 0.3548F, 0.1579F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(136, 142).addBox(-0.8368F, -0.2756F, -0.1835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3038F, -0.4279F, 0.8657F, -1.1034F, 0.1893F, 0.1245F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(131, 142).addBox(-0.8368F, 0.286F, -0.1528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3038F, -0.4279F, 0.8657F, -1.1645F, 0.1893F, 0.1245F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(117, 142).addBox(-0.8368F, 0.8477F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3038F, -0.4279F, 0.8657F, -1.2212F, 0.1893F, 0.1245F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(139, 115).addBox(-0.8F, -1.3687F, -0.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5038F, 0.021F, 0.8902F, -1.6406F, 0.3142F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(139, 84).addBox(-0.8F, -0.8055F, -0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5038F, 0.021F, 0.8902F, -1.5403F, 0.3142F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(82, 139).addBox(-0.7763F, -1.0812F, -0.1874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8038F, 0.021F, 1.8902F, -1.8413F, 0.2923F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(122, 144).addBox(-0.7F, -0.6996F, -0.5157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(112, 142).addBox(-0.7F, -0.8996F, -0.5157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3212F, 0.5862F, -1.4837F, -1.6319F, 0.5402F, -0.0314F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(107, 142).addBox(-0.525F, -0.5508F, -0.4042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.169F, 0.4919F, -0.8081F, -1.4826F, 0.1611F, 0.0077F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 142).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.181F, 0.4076F, 0.833F, -1.43F, 0.2103F, -0.0128F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(97, 142).addBox(-0.8F, -0.7923F, -0.794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0538F, 0.7471F, -0.6093F, -1.5403F, 0.2967F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(144, 72).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7788F, 0.5432F, 2.9166F, -1.5617F, 0.2792F, 0.0025F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(138, 34).addBox(-0.8F, -1.5621F, -0.8317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.3788F, 0.8079F, 3.3428F, -0.3188F, 0.2792F, -0.0015F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 142).addBox(-0.606F, -0.2192F, -0.4997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.6788F, 0.8079F, 5.0928F, -1.248F, 0.192F, -0.0014F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(126, 141).addBox(-0.506F, -0.255F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -0.5237F, 0.192F, -0.0014F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(141, 118).addBox(-0.4983F, -0.2457F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -0.5235F, 0.0349F, -0.0014F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(141, 90).addBox(-0.4983F, -0.525F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(141, 63).addBox(-0.4983F, -0.525F, -0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -1.3612F, 0.0349F, -0.0014F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(141, 20).addBox(-0.6983F, -0.3908F, -0.7246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -1.7059F, 0.0349F, -0.0014F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(141, 0).addBox(-0.6983F, -0.4146F, -1.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -1.6623F, 0.0349F, -0.0014F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(140, 134).addBox(-0.6983F, -0.2348F, -1.1669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -2.0419F, 0.0349F, -0.0014F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(80, 145).addBox(-0.6983F, 0.0755F, -1.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 5.0928F, -2.3779F, 0.0349F, -0.0014F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(140, 96).addBox(-0.5519F, 0.1567F, -1.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2788F, 0.8079F, 4.2428F, -2.5048F, 0.2792F, -0.0015F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(139, 78).addBox(-0.8884F, 0.0706F, -1.1671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.6288F, 0.8079F, 4.2428F, -2.1514F, 0.2792F, -0.0015F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(140, 93).addBox(-0.8F, -1.2372F, -0.8191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.2788F, 0.8079F, 3.3428F, -1.126F, 0.2792F, -0.0015F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(92, 140).addBox(-0.7714F, -0.0613F, -1.8849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5788F, 0.8079F, 4.4928F, -2.378F, 0.1222F, -0.0014F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(70, 140).addBox(-0.8F, -0.6929F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.3788F, 0.8079F, 3.3428F, -0.1311F, 0.2792F, -0.0015F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(138, 10).addBox(-0.8F, -1.5888F, -0.4514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3788F, 0.8079F, 3.3428F, -0.1442F, 0.2792F, -0.0015F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(65, 140).addBox(-0.8F, -0.5288F, -0.0839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(60, 140).addBox(-0.7F, -0.4288F, 0.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 140).addBox(-0.7F, -0.4288F, 0.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3788F, 0.8079F, 3.3428F, 0.1219F, 0.2792F, -0.0015F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 139).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5212F, 0.411F, 0.1251F, -1.5172F, 0.2179F, 0.0116F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(35, 140).addBox(-0.4519F, -0.534F, -0.3427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.3788F, 0.8079F, 4.2428F, 0.1219F, 0.2792F, -0.0015F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5212F, -0.8079F, -5.5428F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(138, 138).mirror().addBox(-0.45F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2704F, -0.2428F, 0.0276F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(132, 72).mirror().addBox(-0.375F, -0.55F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(111, 128).mirror().addBox(-0.45F, -1.05F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0776F, -0.4043F, 3.0603F, 0.2401F, -0.3011F, 0.0087F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(144, 36).mirror().addBox(-0.4994F, 0.5798F, -0.6144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, 2.4959F, -0.3011F, 0.0087F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(133, 138).mirror().addBox(-0.4994F, -0.4873F, -0.1963F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, 1.8152F, -0.3011F, 0.0087F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(121, 138).mirror().addBox(-0.4994F, -0.5656F, -0.3087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, 1.5011F, -0.3011F, 0.0087F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(116, 138).mirror().addBox(-0.4994F, -0.707F, -0.1858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(111, 138).mirror().addBox(-0.4994F, -0.707F, -0.6858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, 0.9556F, -0.3011F, 0.0087F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(143, 137).mirror().addBox(-0.4994F, 0.3421F, -0.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, 0.3928F, -0.3011F, 0.0087F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(106, 138).mirror().addBox(-0.4994F, -0.6507F, -0.4424F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, -0.1439F, -0.3011F, 0.0087F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(143, 111).mirror().addBox(-0.4994F, 0.3427F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, -0.4973F, -0.3011F, 0.0087F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(143, 108).mirror().addBox(-0.4994F, 0.2182F, -0.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, -1.8325F, -0.3011F, 0.0087F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(143, 105).mirror().addBox(-0.4994F, 0.2277F, -0.2955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(129, 102).mirror().addBox(-0.4994F, -0.0916F, -0.8491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, -1.6231F, -0.3011F, 0.0087F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(143, 102).mirror().addBox(-0.4994F, 0.3184F, -0.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9227F, -0.4352F, 2.9819F, -1.1431F, -0.3011F, 0.0087F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(25, 140).mirror().addBox(-0.5F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6907F, -1.3329F, 2.4862F, -0.8692F, -0.3381F, -0.0122F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(20, 140).mirror().addBox(-0.5F, -0.3F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.8634F, -1.4584F, 3.047F, -1.3367F, -0.2811F, -0.0815F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(140, 14).mirror().addBox(-0.2237F, -1.9459F, -1.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(127, 117).mirror().addBox(-0.2237F, -1.7459F, -1.1613F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(139, 87).mirror().addBox(-0.2237F, -0.7459F, -0.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8038F, 0.021F, 1.8902F, -1.6232F, -0.2923F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(143, 99).mirror().addBox(-0.7065F, -0.3641F, -0.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, -0.6568F, 1.9958F, 0.0594F, -0.2515F, -1.0973F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(90, 143).mirror().addBox(-0.6348F, -0.3677F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7969F, -0.5372F, 1.7272F, -0.3838F, -0.4765F, -0.909F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(139, 131).mirror().addBox(-0.4086F, -0.4875F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 143).mirror().addBox(-0.6087F, -0.4875F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-0.7969F, -0.5372F, 1.7272F, -0.5205F, -0.3185F, -0.56F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(96, 133).mirror().addBox(-0.8331F, -0.4392F, -0.6199F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6699F, -0.6568F, 1.9708F, -0.4169F, -0.1885F, -0.3056F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(133, 94).mirror().addBox(-0.8152F, -0.4705F, -0.6199F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, -0.6568F, 1.9958F, -0.1968F, -0.1684F, 0.0089F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(23, 133).mirror().addBox(-0.8152F, -0.6011F, -0.6309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, -0.6568F, 1.9958F, -0.5022F, -0.1684F, 0.0089F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(133, 14).mirror().addBox(-1.0309F, -0.7474F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, -0.6568F, 1.9958F, -0.8592F, 0.3352F, 0.419F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(132, 131).mirror().addBox(-0.8152F, -0.6974F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false)
				.texOffs(132, 128).mirror().addBox(-0.8152F, -0.8974F, -0.6903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6948F, -0.6568F, 1.9958F, -0.8949F, -0.1684F, 0.0089F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(65, 143).mirror().addBox(-0.5004F, -1.1641F, -0.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 143).mirror().addBox(-0.5004F, -1.0641F, -0.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, -1.3877F, 3.0359F, -1.6883F, -0.0812F, 0.0525F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(132, 125).mirror().addBox(-0.5004F, -0.8891F, -0.665F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, -1.3877F, 3.0359F, -1.601F, -0.0812F, 0.0525F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(132, 122).mirror().addBox(-0.5004F, -0.7231F, -0.6222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, -1.3877F, 3.0359F, -1.4614F, -0.0812F, 0.0525F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(132, 87).mirror().addBox(-0.5004F, -0.5346F, -0.6155F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, -1.3877F, 3.0359F, -1.409F, -0.0812F, 0.0525F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(132, 84).mirror().addBox(-0.3927F, -0.4472F, -0.6021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.3824F, -1.3877F, 2.9359F, -1.313F, -0.2773F, 0.0016F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(132, 81).mirror().addBox(-0.3927F, -0.2589F, -0.6104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3824F, -1.3877F, 2.9359F, -1.2563F, -0.2773F, 0.0016F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(132, 78).mirror().addBox(-0.3927F, -0.0828F, -0.6449F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(-1.3824F, -1.3877F, 2.9359F, -1.1516F, -0.2773F, 0.0016F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(132, 75).mirror().addBox(-0.4427F, -0.397F, -0.401F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1783F, -1.4009F, 2.4015F, -1.0458F, -0.6209F, -0.1768F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(50, 143).mirror().addBox(-0.4017F, -0.3594F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(141, 30).mirror().addBox(-0.5017F, -0.3594F, -0.0798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -0.9249F, -0.0349F, 0.0014F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 145).mirror().addBox(-0.2286F, 0.3213F, -1.5988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 4.4928F, -2.4697F, -0.1222F, 0.0014F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 138).mirror().addBox(-0.2132F, -0.2021F, -0.1525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6788F, -0.9381F, 5.2012F, -1.7752F, -0.2248F, 0.0228F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(55, 138).mirror().addBox(-0.1116F, -1.511F, -1.8008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(138, 26).mirror().addBox(-0.1116F, -1.511F, -1.2008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.6288F, 0.8079F, 4.2428F, -0.6504F, -0.2792F, 0.0015F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(139, 128).mirror().addBox(-0.2F, -1.3406F, -0.3404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.5038F, 0.021F, 0.8902F, -1.5533F, -0.3142F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(45, 143).mirror().addBox(-0.4663F, -0.6011F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 143).mirror().addBox(-0.4663F, -0.6011F, -0.2375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5242F, 0.7589F, -1.4413F, -2.9498F, -0.6443F, 1.5884F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(35, 143).mirror().addBox(-0.4606F, -0.3924F, -0.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(143, 33).mirror().addBox(-0.4606F, -0.3924F, -0.4056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2672F, 0.7533F, -1.2388F, -2.056F, -0.4159F, 0.6769F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(30, 143).mirror().addBox(-0.3805F, -0.4537F, -0.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(143, 26).mirror().addBox(-0.3805F, -0.4537F, -0.4143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0922F, 0.7533F, -1.0639F, -1.8076F, -0.2985F, 0.493F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(25, 143).mirror().addBox(-0.3644F, -0.4276F, -0.276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(143, 23).mirror().addBox(-0.3644F, -0.4276F, -0.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0172F, 0.7533F, -0.6889F, -1.7184F, -0.3465F, 0.2403F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(20, 143).mirror().addBox(-0.4832F, -0.4993F, -0.2519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 143).mirror().addBox(-0.4832F, -0.4993F, -0.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0172F, 0.7533F, -0.3388F, -1.6442F, -0.3465F, 0.2403F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(143, 9).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0849F, 0.7492F, 0.1557F, -1.5642F, -0.3538F, 0.0081F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(143, 6).mirror().addBox(-0.2008F, -0.7615F, -0.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2288F, 0.7471F, -0.0343F, -1.5886F, -0.3491F, 0.001F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(143, 3).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5138F, 0.7026F, 1.8916F, -1.5621F, -0.3142F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 143).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1446F, 0.8176F, 0.7556F, -1.4772F, -0.2229F, 0.009F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(141, 142).mirror().addBox(-0.275F, -0.7858F, 0.27F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 139).mirror().addBox(-0.2F, -0.7858F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.5038F, 0.021F, 0.8902F, -1.4748F, -0.3142F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(139, 125).mirror().addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(139, 122).mirror().addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.4761F, -0.3839F, 1.7757F, -1.2479F, -0.3142F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(62, 132).mirror().addBox(-0.2F, -0.7905F, -0.1957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2788F, -0.4529F, 0.9657F, -1.0759F, -0.3548F, -0.1579F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(124, 94).mirror().addBox(-0.2F, -1.3854F, -0.1301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2788F, -0.4529F, 0.9657F, -0.9668F, -0.3548F, -0.1579F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(136, 142).mirror().addBox(-0.1632F, -0.2756F, -0.1835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3038F, -0.4279F, 0.8657F, -1.1034F, -0.1893F, -0.1245F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(131, 142).mirror().addBox(-0.1632F, 0.286F, -0.1528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3038F, -0.4279F, 0.8657F, -1.1645F, -0.1893F, -0.1245F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(117, 142).mirror().addBox(-0.1632F, 0.8477F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3038F, -0.4279F, 0.8657F, -1.2212F, -0.1893F, -0.1245F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(139, 115).mirror().addBox(-0.2F, -1.3687F, -0.215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5038F, 0.021F, 0.8902F, -1.6406F, -0.3142F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(139, 84).mirror().addBox(-0.2F, -0.8055F, -0.6695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5038F, 0.021F, 0.8902F, -1.5403F, -0.3142F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(82, 139).mirror().addBox(-0.2237F, -1.0812F, -0.1874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8038F, 0.021F, 1.8902F, -1.8413F, -0.2923F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(122, 144).mirror().addBox(-0.3F, -0.6996F, -0.5157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(112, 142).mirror().addBox(-0.3F, -0.8996F, -0.5157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3212F, 0.5862F, -1.4837F, -1.6319F, -0.5402F, 0.0314F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(107, 142).mirror().addBox(-0.475F, -0.5508F, -0.4042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.169F, 0.4919F, -0.8081F, -1.4826F, -0.1611F, -0.0077F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(102, 142).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.181F, 0.4076F, 0.833F, -1.43F, -0.2103F, 0.0128F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(97, 142).mirror().addBox(-0.2F, -0.7923F, -0.794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0538F, 0.7471F, -0.6093F, -1.5403F, -0.2967F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(144, 72).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7788F, 0.5432F, 2.9166F, -1.5617F, -0.2792F, -0.0025F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(138, 34).mirror().addBox(-0.2F, -1.5621F, -0.8317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.8079F, 3.3428F, -0.3188F, -0.2792F, 0.0015F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(5, 142).mirror().addBox(-0.394F, -0.2192F, -0.4997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.6788F, 0.8079F, 5.0928F, -1.248F, -0.192F, 0.0014F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(126, 141).mirror().addBox(-0.494F, -0.255F, -0.5584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -0.5237F, -0.192F, 0.0014F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(141, 118).mirror().addBox(-0.5017F, -0.2457F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -0.5235F, -0.0349F, 0.0014F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(141, 90).mirror().addBox(-0.5017F, -0.525F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(141, 63).mirror().addBox(-0.5017F, -0.525F, -0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -1.3612F, -0.0349F, 0.0014F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(141, 20).mirror().addBox(-0.3017F, -0.3908F, -0.7246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -1.7059F, -0.0349F, 0.0014F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-0.3017F, -0.4146F, -1.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -1.6623F, -0.0349F, 0.0014F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.3017F, -0.2348F, -1.1669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -2.0419F, -0.0349F, 0.0014F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(80, 145).mirror().addBox(-0.3017F, 0.0755F, -1.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 5.0928F, -2.3779F, -0.0349F, 0.0014F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(140, 96).mirror().addBox(-0.4481F, 0.1567F, -1.2399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2788F, 0.8079F, 4.2428F, -2.5048F, -0.2792F, 0.0015F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(139, 78).mirror().addBox(-0.1116F, 0.0706F, -1.1671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.6288F, 0.8079F, 4.2428F, -2.1514F, -0.2792F, 0.0015F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(140, 93).mirror().addBox(-0.2F, -1.2372F, -0.8191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.2788F, 0.8079F, 3.3428F, -1.126F, -0.2792F, 0.0015F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(92, 140).mirror().addBox(-0.2286F, -0.0613F, -1.8849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5788F, 0.8079F, 4.4928F, -2.378F, -0.1222F, 0.0014F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(70, 140).mirror().addBox(-0.2F, -0.6929F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.8079F, 3.3428F, -0.1311F, -0.2792F, 0.0015F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(138, 10).mirror().addBox(-0.2F, -1.5888F, -0.4514F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.8079F, 3.3428F, -0.1442F, -0.2792F, 0.0015F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(65, 140).mirror().addBox(-0.2F, -0.5288F, -0.0839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(60, 140).mirror().addBox(-0.3F, -0.4288F, 0.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 140).mirror().addBox(-0.3F, -0.4288F, 0.3161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.8079F, 3.3428F, 0.1219F, -0.2792F, 0.0015F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.5212F, 0.411F, 0.1251F, -1.5172F, -0.2179F, -0.0116F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(35, 140).mirror().addBox(-0.5481F, -0.534F, -0.3427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.8079F, 4.2428F, 0.1219F, -0.2792F, 0.0015F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7263F, 9.6045F, 0.0694F, 0.1308F, -0.0057F));

		PartDefinition cube_r383 = body3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(45, 134).addBox(0.0F, -1.65F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9432F, 5.8495F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r384 = body3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(25, 83).addBox(0.0F, -1.9F, -2.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.781F, 4.8577F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r385 = body3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(134, 43).addBox(0.0F, -0.8F, -7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(101, 0).mirror().addBox(-2.0F, 1.4F, -7.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 0).addBox(1.0F, 1.4F, -7.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(93, 72).addBox(-1.0F, 0.5F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 6.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r386 = body3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(82, 121).mirror().addBox(0.0F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -0.1496F, 4.0609F, -0.2016F, 0.3082F, -0.0619F));

		PartDefinition cube_r387 = body3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(81, 130).mirror().addBox(-1.0F, 1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(124, 14).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(81, 130).addBox(4.0F, 1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(124, 14).addBox(4.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -0.8253F, 2.4885F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r388 = body3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(57, 122).mirror().addBox(0.0F, -2.2271F, 0.8787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4373F, 1.18F, -2.058F, 0.2069F, -0.4005F));

		PartDefinition cube_r389 = body3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(31, 121).mirror().addBox(0.0F, -3.5732F, 2.4358F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4373F, 1.18F, -1.6653F, 0.2069F, -0.4005F));

		PartDefinition cube_r390 = body3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(127, 39).mirror().addBox(0.0F, -0.8988F, 3.5885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4373F, 1.18F, -0.7926F, 0.2069F, -0.4005F));

		PartDefinition cube_r391 = body3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(49, 115).mirror().addBox(0.0F, 0.4691F, 1.0934F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4373F, 1.18F, -0.1818F, 0.2069F, -0.4005F));

		PartDefinition cube_r392 = body3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(139, 46).mirror().addBox(-0.2F, -1.7447F, 2.5831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -2.1251F, -0.1329F, -0.3907F));

		PartDefinition cube_r393 = body3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(127, 60).mirror().addBox(-0.2F, -0.6937F, 3.3497F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -1.8284F, -0.1329F, -0.3907F));

		PartDefinition cube_r394 = body3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(129, 30).mirror().addBox(-0.2F, 1.3277F, 2.2587F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -1.043F, -0.1329F, -0.3907F));

		PartDefinition cube_r395 = body3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(118, 128).mirror().addBox(-0.2F, -0.7883F, 1.055F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -1.7411F, -0.1329F, -0.3907F));

		PartDefinition cube_r396 = body3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(45, 139).mirror().addBox(-0.2F, -1.0897F, 0.3344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -2.0029F, -0.1329F, -0.3907F));

		PartDefinition cube_r397 = body3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(144, 69).mirror().addBox(-0.2F, -0.0456F, -0.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 2.3626F, -1.1304F, -1.5404F, -0.1329F, -0.3907F));

		PartDefinition cube_r398 = body3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(96, 120).mirror().addBox(-1.0F, 0.0F, -0.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(96, 120).addBox(4.0F, 0.0F, -0.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 1.6815F, -0.9572F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r399 = body3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(57, 127).mirror().addBox(0.0F, -1.3869F, -0.1937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.4373F, 1.18F, -1.0544F, 0.2069F, -0.4005F));

		PartDefinition cube_r400 = body3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(66, 122).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(66, 122).addBox(4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 1.1755F, 5.6371F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r401 = body3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(48, 88).mirror().addBox(-1.0F, -2.5F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(48, 88).addBox(4.0F, -2.5F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.0F, 2.2295F, 1.2043F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r402 = body3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(9, 126).mirror().addBox(-1.0F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(9, 126).addBox(4.0F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 1.4373F, 0.68F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r403 = body3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(135, 17).mirror().addBox(-2.0F, -0.65F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(135, 17).addBox(4.0F, -0.65F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 0.1998F, 0.7094F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r404 = body3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(128, 134).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(128, 134).addBox(4.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -1.0502F, 1.5142F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r405 = body3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(22, 121).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(22, 121).addBox(4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 0.8511F, 3.9683F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r406 = body3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(134, 90).mirror().addBox(-2.0F, -0.1F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(134, 90).addBox(4.0F, -0.1F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, -0.9753F, 1.3942F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r407 = body3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(82, 121).addBox(-1.0F, 0.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, -0.1496F, 4.0609F, -0.2016F, -0.3082F, 0.0619F));

		PartDefinition cube_r408 = body3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(57, 127).addBox(-1.0F, -1.3869F, -0.1937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 3.4373F, 1.18F, -1.0544F, -0.2069F, 0.4005F));

		PartDefinition cube_r409 = body3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(139, 46).addBox(-0.8F, -1.7447F, 2.5831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -2.1251F, 0.1329F, 0.3907F));

		PartDefinition cube_r410 = body3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(127, 60).addBox(-0.8F, -0.6937F, 3.3497F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -1.8284F, 0.1329F, 0.3907F));

		PartDefinition cube_r411 = body3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(57, 122).addBox(-1.0F, -2.2271F, 0.8787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, 3.4373F, 1.18F, -2.058F, -0.2069F, 0.4005F));

		PartDefinition cube_r412 = body3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(31, 121).addBox(-1.0F, -3.5732F, 2.4358F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, 3.4373F, 1.18F, -1.6653F, -0.2069F, 0.4005F));

		PartDefinition cube_r413 = body3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(127, 39).addBox(-1.0F, -0.8988F, 3.5885F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, 3.4373F, 1.18F, -0.7926F, -0.2069F, 0.4005F));

		PartDefinition cube_r414 = body3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(49, 115).addBox(-1.0F, 0.4691F, 1.0934F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 3.4373F, 1.18F, -0.1818F, -0.2069F, 0.4005F));

		PartDefinition cube_r415 = body3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(129, 30).addBox(-0.8F, 1.3277F, 2.2587F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -1.043F, 0.1329F, 0.3907F));

		PartDefinition cube_r416 = body3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(118, 128).addBox(-0.8F, -0.7883F, 1.055F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -1.7411F, 0.1329F, 0.3907F));

		PartDefinition cube_r417 = body3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(45, 139).addBox(-0.8F, -1.0897F, 0.3344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -2.0029F, 0.1329F, 0.3907F));

		PartDefinition cube_r418 = body3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(144, 69).addBox(-0.8F, -0.0456F, -0.1001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.8F, 2.3626F, -1.1304F, -1.5404F, 0.1329F, 0.3907F));

		PartDefinition backLeftLeg = body3.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4792F, 2.2409F, 0.9468F, -0.2885F, -0.1956F, -0.321F));

		PartDefinition cube_r419 = backLeftLeg.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(75, 122).addBox(-0.3035F, 0.2361F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r420 = backLeftLeg.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(105, 121).addBox(-0.3035F, -1.264F, -1.4095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r421 = backLeftLeg.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(120, 103).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7933F, 12.5487F, 3.1223F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r422 = backLeftLeg.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(25, 76).addBox(-0.3035F, -0.1258F, -0.8982F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6053F, 4.1398F, 1.6151F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r423 = backLeftLeg.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(135, 134).addBox(-0.3035F, 0.1051F, 0.569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(138, 6).addBox(-0.3035F, 0.1051F, -0.031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6053F, 10.8938F, 1.1669F, 0.5636F, 0.0401F, 0.0063F));

		PartDefinition cube_r424 = backLeftLeg.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(91, 135).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8018F, 9.653F, 1.9593F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r425 = backLeftLeg.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(128, 137).addBox(-0.3035F, 0.1051F, -0.031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6053F, 9.0144F, 0.4829F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r426 = backLeftLeg.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(101, 126).addBox(-0.3035F, 0.105F, -0.031F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6053F, 4.0572F, -0.1698F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0166F, 13.4311F, 3.8331F, 1.5973F, -0.26F, 0.1973F));

		PartDefinition cube_r427 = backLeftLeg2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(136, 63).addBox(-0.6077F, -0.1517F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8851F, 6.7518F, 0.2285F, -1.6598F, 1.1811F, -1.5681F));

		PartDefinition cube_r428 = backLeftLeg2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(25, 136).addBox(-0.6155F, -1.8473F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.8851F, 6.7518F, 0.2285F, -1.8326F, 1.4399F, -1.7453F));

		PartDefinition cube_r429 = backLeftLeg2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 127).addBox(-0.669F, -2.5111F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.123F, 2.7561F, 0.8142F, -1.6233F, 1.3963F, -1.5882F));

		PartDefinition cube_r430 = backLeftLeg2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(47, 127).addBox(-0.331F, -2.5111F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.123F, 2.7561F, 0.8142F, -1.778F, 1.5265F, -1.7435F));

		PartDefinition cube_r431 = backLeftLeg2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(16, 126).addBox(-1.9988F, 1.4118F, -1.5805F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 50).addBox(-0.9988F, 0.0118F, -1.0805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1793F, 6.7448F, 0.0339F, -1.5659F, 1.0908F, -1.5837F));

		PartDefinition cube_r432 = backLeftLeg2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(13, 111).addBox(-0.9988F, 0.0118F, -1.0805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2142F, 4.7527F, 0.2082F, -1.5447F, 1.4835F, -1.5621F));

		PartDefinition cube_r433 = backLeftLeg2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(127, 74).addBox(-0.4308F, -2.4917F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6102F, 2.5591F, 0.5885F, 2.0323F, 1.5199F, 2.1176F));

		PartDefinition cube_r434 = backLeftLeg2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(40, 128).addBox(-0.0677F, -2.5054F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6102F, 2.5591F, 0.5885F, 1.6743F, 1.3495F, 1.7576F));

		PartDefinition cube_r435 = backLeftLeg2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(76, 128).addBox(-0.908F, -2.5428F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6102F, 2.5591F, 0.5885F, -1.7453F, 1.4399F, -1.6581F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(102, 83).addBox(-3.0987F, -0.0124F, -3.9766F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0514F, 8.8797F, 0.7468F, 0.1507F, 0.0871F, 0.0055F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create().texOffs(103, 21).addBox(-3.0981F, -0.496F, -2.9564F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0007F, 0.4836F, -3.7202F, -0.6545F, 0.0F, 0.0F));

		PartDefinition backLeftLeg5 = backLeftLeg4.addOrReplaceChild("backLeftLeg5", CubeListBuilder.create().texOffs(103, 9).addBox(-3.0981F, -0.496F, -3.9564F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0005F, -2.9856F, -0.829F, 0.0F, 0.0F));

		PartDefinition backRightLeg = body3.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4792F, 2.2409F, 0.9468F, -1.0303F, 0.1956F, 0.321F));

		PartDefinition cube_r436 = backRightLeg.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(124, 8).addBox(-0.6965F, 0.2361F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r437 = backRightLeg.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(0, 122).addBox(-1.6965F, -1.264F, -1.4095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r438 = backRightLeg.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(13, 121).addBox(-1.0F, -1.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7933F, 12.5487F, 3.1223F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r439 = backRightLeg.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(91, 121).addBox(-0.6965F, -0.1258F, -0.8982F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6053F, 4.1398F, 1.6151F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r440 = backRightLeg.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(136, 0).addBox(-0.6965F, 0.1051F, 0.569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(10, 138).addBox(-0.6965F, 0.1051F, -0.031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6053F, 10.8938F, 1.1669F, 0.5636F, -0.0401F, -0.0063F));

		PartDefinition cube_r441 = backRightLeg.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(135, 97).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8018F, 9.653F, 1.9593F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r442 = backRightLeg.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(5, 138).addBox(-0.6965F, 0.1051F, -0.031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6053F, 9.0144F, 0.4829F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r443 = backRightLeg.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(106, 126).addBox(-0.6965F, 0.105F, -0.031F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6053F, 4.0572F, -0.1698F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0166F, 13.4311F, 3.8331F, 1.2046F, 0.26F, -0.1973F));

		PartDefinition cube_r444 = backRightLeg2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(96, 136).addBox(-0.3923F, -0.1517F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8851F, 6.7518F, 0.2285F, -1.6598F, -1.1811F, 1.5681F));

		PartDefinition cube_r445 = backRightLeg2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(136, 30).addBox(-0.3845F, -1.8473F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.8851F, 6.7518F, 0.2285F, -1.8326F, -1.4399F, 1.7453F));

		PartDefinition cube_r446 = backRightLeg2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(30, 127).addBox(-0.331F, -2.5111F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.123F, 2.7561F, 0.8142F, -1.6233F, -1.3963F, 1.5882F));

		PartDefinition cube_r447 = backRightLeg2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(52, 127).addBox(-0.669F, -2.5111F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.123F, 2.7561F, 0.8142F, -1.778F, -1.5265F, 1.7435F));

		PartDefinition cube_r448 = backRightLeg2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(82, 126).addBox(-0.0012F, 1.4118F, -1.5805F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 54).addBox(-0.0012F, 0.0118F, -1.0805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1793F, 6.7448F, 0.0339F, -1.5659F, -1.0908F, 1.5837F));

		PartDefinition cube_r449 = backRightLeg2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(131, 0).addBox(-0.0012F, 0.0118F, -1.0805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2142F, 4.7527F, 0.2082F, -1.5447F, -1.4835F, 1.5621F));

		PartDefinition cube_r450 = backRightLeg2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(35, 128).addBox(-0.5692F, -2.4917F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6102F, 2.5591F, 0.5885F, 2.0323F, -1.5199F, -2.1176F));

		PartDefinition cube_r451 = backRightLeg2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(71, 128).addBox(-0.9323F, -2.5054F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6102F, 2.5591F, 0.5885F, 1.6743F, -1.3495F, -1.7576F));

		PartDefinition cube_r452 = backRightLeg2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(91, 128).addBox(-0.092F, -2.5428F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6102F, 2.5591F, 0.5885F, -1.7453F, -1.4399F, 1.6581F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(102, 89).addBox(-2.9012F, -0.0124F, -3.9766F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0514F, 8.8797F, 0.7468F, 0.1504F, 0.0026F, -0.0173F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create().texOffs(86, 108).addBox(-2.9019F, -0.496F, -2.9564F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0007F, 0.4836F, -3.7202F, -0.4276F, 0.0F, 0.0F));

		PartDefinition backRightLeg5 = backRightLeg4.addOrReplaceChild("backRightLeg5", CubeListBuilder.create().texOffs(103, 15).addBox(-2.9019F, -0.496F, -3.9564F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0005F, -2.9856F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1306F, 7.6266F, -0.3452F, 0.2057F, -0.0733F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(134, 53).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3689F, 6.6956F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(5, 127).addBox(0.007F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3029F, 11.414F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(50, 139).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0189F, 10.4552F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(75, 14).addBox(0.004F, -1.3F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7973F, 9.9677F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(31, 59).addBox(-0.003F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3074F, 9.4382F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(9, 122).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.237F, 7.4046F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(83, 109).addBox(-0.003F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5694F, 5.5193F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(144, 145).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8656F, 5.4515F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r461 = tail.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(145, 133).addBox(0.0F, -4.9272F, 1.1496F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7223F, 2.9494F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r462 = tail.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(132, 145).addBox(-0.003F, -4.4734F, -1.18F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7223F, 2.9494F, -2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r463 = tail.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(77, 135).addBox(0.0F, -3.8176F, 0.5664F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7223F, 2.9494F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(125, 128).addBox(-0.003F, -1.2105F, -0.4937F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7223F, 2.9494F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r465 = tail.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(50, 134).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1074F, 3.7071F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r466 = tail.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(134, 48).addBox(0.0F, -2.1F, 1.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 86).addBox(-1.0F, -0.5F, 0.8F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3109F, -1.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9941F, 8.6901F, -0.2022F, 0.2139F, -0.0435F));

		PartDefinition cube_r467 = tail2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(15, 139).addBox(0.0F, -1.15F, 7.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(74, 0).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2206F, -0.0782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r468 = tail2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(88, 130).addBox(0.0F, 1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 101).addBox(0.0F, 0.7F, -4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 100).addBox(0.0F, 1.3F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6752F, 7.884F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r469 = tail2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(81, 134).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5693F, 3.9066F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r470 = tail2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(134, 58).addBox(0.0F, -1.625F, -0.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3252F, 1.1173F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(1, 21).addBox(-0.5F, -1.1769F, -0.2034F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6901F, 11.0216F, 0.0219F, 0.1309F, 0.0029F));

		PartDefinition cube_r471 = tail3.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(141, 145).addBox(0.0F, -7.0F, -4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 145).addBox(0.0F, -5.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 145).addBox(0.0F, -3.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 70).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3005F, 6.5132F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r472 = tail3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(31, 66).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3252F, 3.6849F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r473 = tail3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(44, 104).addBox(0.0F, 0.1F, -6.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3459F, -3.2378F, -2.6529F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5F, -0.4382F, 0.0697F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.7057F, 16.6901F, 0.1312F, -0.2596F, -0.0339F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3328F, -0.0141F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.072F, 16.9386F, 0.2291F, -0.5553F, -0.1223F));

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