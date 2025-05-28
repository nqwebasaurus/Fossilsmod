package fossils.fossils.client.blockentity.model.klamelisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KlamelisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck7;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public KlamelisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck7 = this.chest.getChild("neck7");
		this.neck6 = this.neck7.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, -40.0F, 14.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 46.0F, 6.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(124, 178).addBox(-0.5F, -5.4F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 182).addBox(-0.5F, -6.3F, 3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.6042F, 8.0227F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 177).addBox(-0.5F, -10.616F, 7.8494F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 67).addBox(-0.5F, -10.116F, -0.1506F, 2.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.7F, -6.0F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 29).mirror().addBox(-3.0F, 0.2F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 29).addBox(6.0F, 0.2F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -5.7698F, 0.6311F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(171, 46).mirror().addBox(-1.0F, 4.8847F, -1.6817F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 125).mirror().addBox(-1.0F, -5.1153F, -0.6817F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0326F, 13.15F, -7.4203F, -0.7376F, 0.4253F, -0.5017F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(101, 142).mirror().addBox(-1.0F, -1.5F, -6.5F, 2.0F, 3.0F, 12.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4707F, 11.0259F, 11.0648F, -0.5678F, -0.0179F, -0.4829F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.8579F, -10.2607F, -0.8691F, 2.0F, 10.0F, 9.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0326F, 12.25F, -6.1203F, -0.045F, 0.2161F, -0.4914F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 82).mirror().addBox(-1.0F, -1.6F, -4.5F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3351F, 5.3475F, 5.4969F, -1.2398F, -0.0179F, -0.4829F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(172, 131).mirror().addBox(-9.5F, 0.0147F, 0.0231F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(172, 131).addBox(7.5F, 0.0147F, 0.0231F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -13.476F, -6.5224F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(177, 141).mirror().addBox(-9.5F, 0.0331F, -3.9943F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(177, 141).addBox(7.5F, 0.0331F, -3.9943F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.976F, -9.4224F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(177, 60).mirror().addBox(-9.5F, -0.1163F, -3.9966F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(177, 60).addBox(7.5F, -0.1163F, -3.9966F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -10.976F, -9.6224F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-9.5F, -0.1231F, -2.9965F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(93, 40).addBox(7.5F, -0.1231F, -2.9965F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -12.776F, -7.2224F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -2.1F, -9.8F, 2.0F, 5.0F, 15.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 0).addBox(16.0F, -2.1F, -9.8F, 2.0F, 5.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-8.5F, -5.3568F, 2.7214F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(152, 52).mirror().addBox(-9.5F, -0.1214F, 0.1255F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(152, 52).addBox(7.5F, -0.1214F, 0.1255F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.476F, -2.6224F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(168, 159).mirror().addBox(-1.0F, -2.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(168, 159).addBox(16.0F, -2.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, -4.5153F, 7.2531F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, 169).mirror().addBox(-9.5F, -0.1579F, -0.0515F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 169).addBox(7.5F, -0.1579F, -0.0515F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -10.276F, 3.5776F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(136, 60).mirror().addBox(0.5F, -5.3F, -5.5F, 2.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.5F, 2.0842F, -0.2318F, -0.3286F, -0.0452F, -0.2615F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(136, 60).addBox(-2.5F, -5.3F, -5.5F, 2.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, 2.0842F, -0.2318F, -0.3286F, 0.0452F, 0.2615F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 82).addBox(-1.0F, -1.6F, -4.5F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3351F, 5.3475F, 5.4969F, -1.2398F, 0.0179F, 0.4829F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(101, 142).addBox(-1.0F, -1.5F, -6.5F, 2.0F, 3.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4707F, 11.0259F, 11.0648F, -0.5678F, 0.0179F, 0.4829F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 67).addBox(-1.1421F, -10.2607F, -0.8691F, 2.0F, 10.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.0326F, 12.25F, -6.1203F, -0.045F, -0.2161F, 0.4914F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(97, 125).addBox(-1.0F, -5.1153F, -0.6817F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(171, 46).addBox(-1.0F, 4.8847F, -1.6817F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0326F, 13.15F, -7.4203F, -0.7376F, -0.4253F, 0.5017F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 107).addBox(-2.5F, -5.2F, 0.2F, 5.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -7.4F, -0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(136, 92).addBox(-6.5F, 3.0159F, -1.677F, 5.0F, 23.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(104, 160).addBox(-6.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.5F, -1.3F, 0.0F, -0.1061F, 0.1107F, 0.4039F));

		PartDefinition cube_r23 = leftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(150, 136).addBox(-7.5F, -0.9F, 0.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(127, 155).addBox(3.0F, 1.6327F, 0.5969F, 2.0F, 19.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(144, 21).addBox(-3.5F, 5.6327F, 0.1969F, 5.0F, 15.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 152).addBox(-3.5F, -0.3673F, -0.8031F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 31.5159F, -0.177F, 0.7732F, -0.1576F, 0.1514F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(113, 128).addBox(-7.0F, 1.0F, -7.0F, 13.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.1765F, 1.4434F, 0.0436F, -0.0015F, 0.0349F));

		PartDefinition cube_r24 = leftFoot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(147, 128).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r25 = leftFoot2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(118, 142).addBox(-4.8F, -2.5F, -0.5F, 11.0F, 6.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.5F, -2.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(46, 0).addBox(1.5F, 3.0159F, -1.677F, 5.0F, 23.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(157, 0).addBox(1.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5F, -1.3F, 0.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(149, 114).addBox(0.5F, -0.9F, 0.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(65, 0).addBox(-5.0F, 1.6327F, 0.5969F, 2.0F, 19.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 107).addBox(-1.5F, 5.6327F, 0.1969F, 5.0F, 15.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(151, 83).addBox(-1.5F, -0.3673F, -0.8031F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 31.5159F, -0.177F, 1.4221F, -0.0403F, 0.0167F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(116, 46).addBox(-6.0F, 1.0F, -7.0F, 13.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 21.1765F, 1.4434F, 0.0051F, 0.3237F, 0.305F));

		PartDefinition cube_r27 = rightFoot.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 67).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r28 = rightFoot2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 62).addBox(-6.2F, -2.5F, -0.5F, 11.0F, 6.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.5F, -2.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.7F, -7.4F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 41).addBox(-9.5F, -5.9413F, -14.0281F, 19.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 26.1F, -20.9F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(43, 96).addBox(-7.5F, -6.1438F, -14.5226F, 15.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 25.7F, -6.3F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -32.0F, 5.0F, 5.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(122, 29).addBox(-1.0F, -5.0F, 3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(67, 141).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.2107F, -2.6265F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(88, 96).addBox(-1.5F, -5.2F, -1.5F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.9845F, -5.9433F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 133).addBox(-1.5F, -5.4F, 6.1F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 0).addBox(-1.5F, -5.2F, 2.6F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(97, 171).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.4945F, -16.4908F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(136, 83).mirror().addBox(-13.4134F, -2.4328F, -1.3665F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -1.3292F, -1.5693F, -0.1242F, -0.4079F, -1.3064F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(116, 15).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -1.3292F, -1.5693F, -0.2797F, -0.3451F, -0.889F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(176, 120).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -2.6292F, -4.0693F, -0.2328F, -0.3169F, -0.799F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(173, 128).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -4.3292F, -7.8693F, -0.1498F, -0.249F, -0.7174F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(178, 68).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -5.7292F, -11.8693F, -0.0789F, -0.1957F, -0.6982F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(178, 102).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -6.9292F, -14.8693F, -0.051F, -0.1742F, -0.6684F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(179, 159).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -7.9292F, -18.4693F, -0.0095F, -0.1416F, -0.6749F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(179, 162).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -9.9292F, -22.4693F, 0.0316F, -0.1088F, -0.6801F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(180, 105).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -11.7292F, -26.4693F, 0.0589F, -0.0868F, -0.6827F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(155, 109).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -11.7292F, -26.4693F, 0.0842F, -0.0411F, -1.0736F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(155, 106).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -9.9292F, -22.4693F, 0.0675F, -0.0717F, -1.0727F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(152, 66).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -7.9292F, -18.4693F, 0.0423F, -0.1177F, -1.0703F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(150, 49).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -6.9292F, -14.8693F, 0.0168F, -0.1636F, -1.0667F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(150, 46).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -5.7292F, -11.8693F, -0.0003F, -0.1942F, -1.0986F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(150, 147).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -2.6292F, -4.0693F, -0.0927F, -0.3643F, -1.213F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 144).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -4.3292F, -7.8693F, -0.0443F, -0.2702F, -1.1234F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 119).mirror().addBox(-17.2964F, -8.4456F, -1.3665F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -2.6292F, -4.0693F, 0.0572F, -0.3712F, -1.6248F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(182, 31).mirror().addBox(-20.2964F, -8.4456F, -1.3665F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -4.3292F, -7.8693F, 0.0627F, -0.2666F, -1.5218F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-24.2964F, -8.4456F, -1.3665F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -5.7292F, -11.8693F, 0.0732F, -0.18F, -1.4892F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(20, 133).mirror().addBox(-26.2964F, -8.4456F, -1.3665F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -6.9292F, -14.8693F, 0.0773F, -0.1453F, -1.4549F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(144, 41).mirror().addBox(-28.2964F, -8.4456F, -1.3665F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -7.9292F, -18.4693F, 0.0834F, -0.0933F, -1.4557F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(33, 78).mirror().addBox(-30.2964F, -8.4456F, -1.3665F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -9.9292F, -22.4693F, 0.0894F, -0.0413F, -1.4561F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-32.2964F, -8.4456F, -1.3665F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -11.7292F, -26.4693F, 0.0934F, -0.0066F, -1.4562F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(116, 15).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -1.3292F, -1.5693F, -0.2797F, 0.3451F, 0.889F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(136, 83).addBox(5.4134F, -2.4328F, -1.3665F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -1.3292F, -1.5693F, -0.1242F, 0.4079F, 1.3064F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 119).addBox(14.2964F, -8.4456F, -1.3665F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -2.6292F, -4.0693F, 0.0572F, 0.3712F, 1.6248F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(150, 147).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -2.6292F, -4.0693F, -0.0927F, 0.3643F, 1.213F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(176, 120).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -2.6292F, -4.0693F, -0.2328F, 0.3169F, 0.799F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(182, 31).addBox(14.2964F, -8.4456F, -1.3665F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -4.3292F, -7.8693F, 0.0627F, 0.2666F, 1.5218F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 144).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -4.3292F, -7.8693F, -0.0443F, 0.2702F, 1.1234F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(173, 128).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -4.3292F, -7.8693F, -0.1498F, 0.249F, 0.7174F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 91).addBox(14.2964F, -8.4456F, -1.3665F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -5.7292F, -11.8693F, 0.0732F, 0.18F, 1.4892F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(150, 46).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -5.7292F, -11.8693F, -0.0003F, 0.1942F, 1.0986F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(178, 68).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -5.7292F, -11.8693F, -0.0789F, 0.1957F, 0.6982F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(178, 102).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -6.9292F, -14.8693F, -0.051F, 0.1742F, 0.6684F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(150, 49).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -6.9292F, -14.8693F, 0.0168F, 0.1636F, 1.0667F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 133).addBox(14.2964F, -8.4456F, -1.3665F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -6.9292F, -14.8693F, 0.0773F, 0.1453F, 1.4549F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(179, 159).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -7.9292F, -18.4693F, -0.0095F, 0.1416F, 0.6749F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(152, 66).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -7.9292F, -18.4693F, 0.0423F, 0.1177F, 1.0703F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(144, 41).addBox(14.2964F, -8.4456F, -1.3665F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -7.9292F, -18.4693F, 0.0834F, 0.0933F, 1.4557F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(179, 162).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -9.9292F, -22.4693F, 0.0316F, 0.1088F, 0.6801F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(155, 106).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -9.9292F, -22.4693F, 0.0675F, 0.0717F, 1.0727F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(33, 78).addBox(14.2964F, -8.4456F, -1.3665F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -9.9292F, -22.4693F, 0.0894F, 0.0413F, 1.4561F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 34).addBox(14.2964F, -8.4456F, -1.3665F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -11.7292F, -26.4693F, 0.0934F, 0.0066F, 1.4562F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(155, 109).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -11.7292F, -26.4693F, 0.0842F, 0.0411F, 1.0736F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(180, 105).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -11.7292F, -26.4693F, 0.0589F, 0.0868F, 0.6827F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(108, 171).addBox(-1.5F, -5.1F, -0.4F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.237F, -20.7492F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(168, 171).addBox(-1.5F, -4.8F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.4516F, -23.5375F, -0.576F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.3F, -31.6F, 0.0154F, 0.1739F, -0.1296F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 175).addBox(-1.5F, -9.6879F, 0.4179F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(138, 175).addBox(-1.5F, -8.3332F, 0.0154F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -3.3F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(179, 171).addBox(-1.5F, -6.8834F, -0.618F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -7.4F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 180).addBox(-1.5F, -6.3019F, -0.3452F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7F, -12.5F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(154, 181).addBox(-1.5F, -6.1918F, -0.0998F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5F, -17.0F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(180, 108).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, 0.0708F, 0.7307F, 0.0995F, -0.0537F, -0.6856F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(181, 131).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -1.3292F, -3.2693F, 0.1254F, -0.0302F, -0.7041F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(158, 125).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -1.3292F, -3.2693F, 0.1241F, 0.0365F, -1.0912F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(157, 16).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, 0.0708F, 0.7307F, 0.1091F, 0.005F, -1.0741F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-32.2964F, -8.4456F, -1.3665F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, 0.0708F, 0.7307F, 0.0994F, 0.0454F, -1.456F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(114, 88).mirror().addBox(-30.2964F, -8.4456F, -1.3665F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3079F, -1.3292F, -3.2693F, 0.1016F, 0.0802F, -1.4734F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(136, 80).mirror().addBox(-29.2964F, -8.4456F, -1.3665F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -3.5292F, -7.8693F, 0.1027F, 0.0977F, -1.5082F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(159, 22).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -3.5292F, -7.8693F, 0.1317F, 0.0522F, -1.1258F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(175, 25).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -3.5292F, -7.8693F, 0.1383F, -0.0184F, -0.7394F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(161, 153).mirror().addBox(-25.2964F, -8.4456F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -5.5292F, -12.5693F, 0.0623F, 0.1258F, -1.5984F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(161, 150).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -5.5292F, -12.5693F, 0.1049F, 0.0934F, -1.2135F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(175, 28).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, -5.5292F, -12.5693F, 0.1291F, 0.0298F, -0.8251F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(182, 46).mirror().addBox(-20.2964F, -8.4456F, -1.3665F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -6.0292F, -16.8693F, 0.3279F, 0.348F, -1.7135F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(159, 19).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -6.0292F, -16.8693F, 0.4302F, 0.2042F, -1.3429F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(179, 181).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2079F, -6.0292F, -16.8693F, 0.469F, 0.0163F, -0.9953F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(81, 37).addBox(14.2964F, -8.4456F, -1.3665F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, 0.0708F, 0.7307F, 0.0994F, -0.0454F, 1.456F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(157, 16).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, 0.0708F, 0.7307F, 0.1091F, -0.005F, 1.0741F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(180, 108).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, 0.0708F, 0.7307F, 0.0995F, 0.0537F, 0.6856F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(114, 88).addBox(14.2964F, -8.4456F, -1.3665F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -1.3292F, -3.2693F, 0.1016F, -0.0802F, 1.4734F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(158, 125).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -1.3292F, -3.2693F, 0.1241F, -0.0365F, 1.0912F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(181, 131).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3079F, -1.3292F, -3.2693F, 0.1254F, 0.0302F, 0.7041F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(175, 25).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -3.5292F, -7.8693F, 0.1383F, 0.0184F, 0.7394F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(159, 22).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -3.5292F, -7.8693F, 0.1317F, -0.0522F, 1.1258F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(136, 80).addBox(14.2964F, -8.4456F, -1.3665F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -3.5292F, -7.8693F, 0.1027F, -0.0977F, 1.5082F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(175, 28).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -5.5292F, -12.5693F, 0.1291F, -0.0298F, 0.8251F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(161, 150).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -5.5292F, -12.5693F, 0.1049F, -0.0934F, 1.2135F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(161, 153).addBox(14.2964F, -8.4456F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, -5.5292F, -12.5693F, 0.0623F, -0.1258F, 1.5984F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(179, 181).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2079F, -6.0292F, -16.8693F, 0.469F, -0.0163F, 0.9953F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(159, 19).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2079F, -6.0292F, -16.8693F, 0.4302F, -0.2042F, 1.3429F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(182, 46).addBox(14.2964F, -8.4456F, -1.3665F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2079F, -6.0292F, -16.8693F, 0.3279F, -0.348F, 1.7135F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 28).mirror().addBox(-20.143F, 3.6009F, -1.5569F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.314F, 31.6353F, -8.2938F, 0.3059F, 1.241F, 0.4998F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(-17.0161F, 3.8544F, -1.2254F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.614F, 31.1353F, -8.3938F, 0.1738F, 1.1628F, 0.3603F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(165, 57).mirror().addBox(-8.0414F, -0.2422F, -0.9009F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.614F, 31.1353F, -8.3938F, -0.818F, 0.9412F, -0.679F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(161, 156).mirror().addBox(-8.0356F, -0.507F, -1.2476F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.314F, 31.6353F, -8.2938F, -0.9094F, 1.0172F, -0.7387F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(163, 35).mirror().addBox(-8.5146F, 0.3107F, -0.476F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.614F, 30.7353F, -8.9938F, -0.6105F, 0.9278F, -0.575F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(171, 99).mirror().addBox(-14.7223F, 4.3171F, -1.7961F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.714F, 30.7353F, -8.7938F, 0.2154F, 1.0844F, 0.3642F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(31, 124).mirror().addBox(-14.1451F, 4.5982F, -0.8506F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.614F, 30.7353F, -8.9938F, 0.295F, 1.0512F, 0.4056F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(31, 107).mirror().addBox(-8.9078F, -0.1745F, -1.4331F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.714F, 30.7353F, -8.7938F, -0.6914F, 0.9145F, -0.6111F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(170, 11).mirror().addBox(-7.882F, -0.0295F, -1.5463F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.414F, 30.6353F, -9.0938F, -0.4852F, 0.9273F, -0.4302F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(182, 14).mirror().addBox(-12.7648F, 3.9129F, -1.8739F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.414F, 30.6353F, -9.0938F, 0.376F, 0.9891F, 0.5192F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 52).mirror().addBox(-11.6354F, 3.5087F, -1.811F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.214F, 31.9353F, -9.5938F, 0.0072F, 0.8677F, 0.8372F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(33, 99).mirror().addBox(-8.423F, -0.8236F, -1.503F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.214F, 31.9353F, -9.5938F, -0.5714F, 0.6837F, 0.1221F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 84).mirror().addBox(-9.8492F, -0.1873F, -1.3959F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.414F, 31.0353F, -11.0938F, 0.169F, 0.56F, 0.8246F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(174, 87).mirror().addBox(-6.9966F, -0.1426F, -4.2968F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.747F, 16.9685F, -25.4458F, -1.083F, 0.5333F, 0.4523F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(187, 82).mirror().addBox(-1.0805F, -0.3573F, -4.2968F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.747F, 16.9685F, -25.4458F, -1.1287F, 0.3381F, 0.3445F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(3.8096F, 1.4982F, -11.6623F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.814F, 28.6353F, -6.2938F, -0.4147F, 0.1075F, 0.2392F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(155, 96).mirror().addBox(4.468F, -3.5088F, -7.2878F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.814F, 28.6353F, -18.7938F, -0.6416F, 0.1075F, 0.2392F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-4.8389F, -10.0511F, -15.7457F, 3.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, 13.1915F, -9.731F, 0.959F, -0.401F, -0.4631F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.8275F, -12.0511F, -7.3469F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-12.0F, 13.1915F, -9.731F, 0.8619F, -0.1193F, -0.0933F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-1.5F, -2.5F, -6.5F, 3.0F, 5.0F, 22.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 97).addBox(23.3F, -2.5F, -6.5F, 3.0F, 5.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.4F, 8.7915F, -6.331F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 133).mirror().addBox(-1.5F, 0.0765F, -0.0659F, 3.0F, 5.0F, 13.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 133).addBox(23.3F, 0.0765F, -0.0659F, 3.0F, 5.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-12.4F, 5.7915F, -6.631F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(171, 38).addBox(-4.247F, 0.3322F, -3.0507F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.747F, 16.9685F, -25.4458F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(32, 183).addBox(-3.747F, 1.1508F, 2.3162F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.747F, 16.9685F, -25.4458F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(187, 82).addBox(-0.9195F, -0.3573F, -4.2968F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.747F, 16.9685F, -25.4458F, -1.1287F, -0.3381F, -0.3445F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(174, 87).addBox(0.9966F, -0.1426F, -4.2968F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.747F, 16.9685F, -25.4458F, -1.083F, -0.5333F, -0.4523F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(155, 96).addBox(-8.468F, -3.5088F, -7.2878F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.814F, 28.6353F, -18.7938F, -0.6416F, -0.1075F, -0.2392F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 21).addBox(-9.8096F, 1.4982F, -11.6623F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.814F, 28.6353F, -6.2938F, -0.4147F, -0.1075F, -0.2392F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 84).addBox(-0.1508F, -0.1873F, -1.3959F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.414F, 31.0353F, -11.0938F, 0.169F, -0.56F, -0.8246F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(33, 99).addBox(-0.577F, -0.8236F, -1.503F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.214F, 31.9353F, -9.5938F, -0.5714F, -0.6837F, -0.1221F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(170, 11).addBox(-1.118F, -0.0295F, -1.5463F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.414F, 30.6353F, -9.0938F, -0.4852F, -0.9273F, 0.4302F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(165, 57).addBox(-0.9586F, -0.2422F, -0.9009F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.614F, 31.1353F, -8.3938F, -0.818F, -0.9412F, 0.679F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(163, 35).addBox(-0.4854F, 0.3107F, -0.476F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.614F, 30.7353F, -8.9938F, -0.6105F, -0.9278F, 0.575F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(161, 156).addBox(-0.9644F, -0.507F, -1.2476F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.314F, 31.6353F, -8.2938F, -0.9094F, -1.0172F, 0.7387F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(46, 28).addBox(7.143F, 3.6009F, -1.5569F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.314F, 31.6353F, -8.2938F, 0.3059F, -1.241F, -0.4998F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(47, 81).addBox(7.0161F, 3.8544F, -1.2254F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.614F, 31.1353F, -8.3938F, 0.1738F, -1.1628F, -0.3603F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(171, 99).addBox(7.7223F, 4.3171F, -1.7961F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.714F, 30.7353F, -8.7938F, 0.2154F, -1.0844F, -0.3642F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(31, 124).addBox(7.1451F, 4.5982F, -0.8506F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.614F, 30.7353F, -8.9938F, 0.295F, -1.0512F, -0.4056F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(182, 14).addBox(6.7648F, 3.9129F, -1.8739F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.414F, 30.6353F, -9.0938F, 0.376F, -0.9891F, -0.5192F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(93, 52).addBox(7.6354F, 3.5087F, -1.811F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.214F, 31.9353F, -9.5938F, 0.0072F, -0.8677F, -0.8372F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(31, 107).addBox(-0.0922F, -0.1745F, -1.4331F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.714F, 30.7353F, -8.7938F, -0.6914F, -0.9145F, 0.6111F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 41).addBox(1.8389F, -10.0511F, -15.7457F, 3.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 13.1915F, -9.731F, 0.959F, 0.401F, 0.4631F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 78).addBox(-1.1725F, -12.0511F, -7.3469F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(12.0F, 13.1915F, -9.731F, 0.8619F, 0.1193F, 0.0933F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(82, 0).addBox(-2.5F, -2.0F, -22.0F, 5.0F, 5.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(170, 112).addBox(-2.0F, 21.9487F, -3.3832F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 24.45F, -18.5F, 0.3458F, -0.0521F, 0.8345F));

		PartDefinition cube_r161 = leftArm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(178, 0).addBox(-3.3125F, -0.1008F, -1.1586F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1F, 10.0487F, -2.5832F, 0.1712F, 0.7453F, 0.4211F));

		PartDefinition cube_r162 = leftArm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 41).addBox(-0.7F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.4487F, -0.2832F, -0.1719F, 0.7703F, -0.2444F));

		PartDefinition cube_r163 = leftArm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(50, 141).addBox(-2.0F, -12.0F, -1.8F, 5.0F, 24.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9487F, -0.2832F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 24.9487F, 0.2168F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftArm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 165).addBox(-2.0F, -9.05F, -3.2F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 96).addBox(-3.0F, -10.45F, 0.2F, 6.0F, 16.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 10.7463F, -1.4258F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(33, 167).addBox(-6.0F, -0.0979F, -1.1388F, 2.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(67, 161).addBox(-4.0F, -0.0979F, -2.1388F, 6.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 160).addBox(2.0F, -0.0979F, -1.1388F, 2.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 15.8963F, -2.6258F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftHand.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 81).addBox(-0.4F, -5.05F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(168, 79).addBox(-3.0F, 21.9487F, -3.3832F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 23.45F, -18.5F, 0.3049F, -0.0663F, 0.5286F));

		PartDefinition cube_r166 = rightArm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(24, 21).addBox(0.3125F, -0.1008F, -1.1586F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 10.0487F, -2.5832F, 0.1712F, -0.7453F, -0.4211F));

		PartDefinition cube_r167 = rightArm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 0).addBox(-2.3F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 7.4487F, -0.2832F, -0.1719F, -0.7703F, 0.2444F));

		PartDefinition cube_r168 = rightArm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(33, 139).addBox(-3.0F, -12.0F, -1.8F, 5.0F, 24.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9487F, -0.2832F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 24.9487F, 0.2168F, -1.414F, -0.08F, -0.1306F));

		PartDefinition cube_r169 = rightArm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 165).addBox(-2.0F, -9.05F, -3.2F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 0).addBox(-3.0F, -10.45F, 0.2F, 6.0F, 16.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 10.7463F, -1.4258F, 0.0F, -1.5708F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(155, 165).addBox(4.0F, -0.0979F, -1.1388F, 2.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(75, 125).addBox(-2.0F, -0.0979F, -2.1388F, 6.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 119).addBox(-4.0F, -0.0979F, -1.1388F, 2.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 15.8963F, -2.6258F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightHand.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 41).addBox(-1.6F, -5.05F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, -0.48F));

		PartDefinition neck7 = chest.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, -18.0F, -0.0718F, 0.12F, -0.2253F));

		PartDefinition cube_r171 = neck7.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(85, 40).addBox(-2.0F, -0.2031F, -1.65F, 4.0F, 4.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.1F, -15.2F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck7.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 0).addBox(-2.578F, -8.8137F, -5.1116F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.578F, -2.4585F, -5.8563F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck7.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(163, 38).mirror().addBox(-2.5131F, -2.9515F, -1.641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -1.6585F, -4.8563F, 0.8963F, -0.376F, -0.3813F));

		PartDefinition cube_r174 = neck7.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(157, 191).mirror().addBox(-1.2337F, -0.2784F, -0.2796F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, 4.9198F, -4.0403F, 0.4368F, -0.1077F, 0.023F));

		PartDefinition cube_r175 = neck7.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(89, 193).mirror().addBox(-0.7892F, -1.2483F, 0.0516F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, 0.5198F, -7.2403F, 0.5589F, -0.1077F, 0.023F));

		PartDefinition cube_r176 = neck7.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(196, 110).mirror().addBox(-0.7892F, -0.2118F, -0.3316F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, 0.5198F, -7.2403F, 0.6287F, -0.1077F, 0.023F));

		PartDefinition cube_r177 = neck7.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(186, 184).mirror().addBox(-0.6051F, -3.9258F, -0.7173F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, -1.6802F, -8.8403F, 0.7694F, -0.1101F, 0.0038F));

		PartDefinition cube_r178 = neck7.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 23).mirror().addBox(-3.4588F, -0.9165F, -1.5127F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, -4.5802F, -6.1403F, 1.4239F, -0.6551F, -1.1959F));

		PartDefinition cube_r179 = neck7.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(3.7383F, -9.0498F, 0.9011F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8396F, 3.6198F, -1.9403F, 1.2048F, -0.5118F, -0.9068F));

		PartDefinition cube_r180 = neck7.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(200, 66).mirror().addBox(-1.0745F, -9.2224F, 4.5237F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -2.4585F, -5.8563F, 0.9747F, 0.6167F, 0.4372F));

		PartDefinition cube_r181 = neck7.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(9, 184).mirror().addBox(-2.3327F, -5.6865F, 3.1755F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -2.4585F, -5.8563F, 0.9668F, 0.4348F, 0.5945F));

		PartDefinition cube_r182 = neck7.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(62, 188).mirror().addBox(-1.0574F, -0.2357F, -0.4349F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.597F, 1.9737F, -7.014F, 0.5421F, -0.1095F, 0.0115F));

		PartDefinition cube_r183 = neck7.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(57, 180).mirror().addBox(-0.0348F, -0.3014F, -0.3338F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.597F, -7.1263F, -15.414F, 0.7341F, -0.1095F, 0.0115F));

		PartDefinition cube_r184 = neck7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(112, 196).mirror().addBox(-0.5047F, -5.7163F, -0.663F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.597F, -3.3263F, -11.514F, 0.6643F, -0.1095F, 0.0115F));

		PartDefinition cube_r185 = neck7.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(138, 187).mirror().addBox(0.0934F, -4.1379F, -1.3248F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.597F, -9.7263F, -16.314F, 0.6992F, -0.1095F, 0.0115F));

		PartDefinition cube_r186 = neck7.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(147, 165).mirror().addBox(-2.5131F, -6.9515F, -1.641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -6.8585F, -10.8563F, 0.8963F, -0.376F, -0.3813F));

		PartDefinition cube_r187 = neck7.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(190, 41).mirror().addBox(-3.4416F, -6.5593F, 0.578F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -6.8585F, -10.8563F, 1.2881F, -0.9868F, -1.0664F));

		PartDefinition cube_r188 = neck7.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(139, 21).mirror().addBox(0.9387F, -6.5024F, 0.6134F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -6.8585F, -10.8563F, 1.0993F, -0.6194F, -0.8501F));

		PartDefinition cube_r189 = neck7.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(200, 98).mirror().addBox(-1.0745F, -9.2224F, 4.5237F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -7.6585F, -11.8563F, 0.9747F, 0.6167F, 0.4372F));

		PartDefinition cube_r190 = neck7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(165, 184).mirror().addBox(-2.3327F, -5.6865F, 3.1755F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.578F, -7.6585F, -11.8563F, 0.9668F, 0.4348F, 0.5945F));

		PartDefinition cube_r191 = neck7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(200, 66).addBox(0.0745F, -9.2224F, 4.5237F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.578F, -2.4585F, -5.8563F, 0.9747F, -0.6167F, -0.4372F));

		PartDefinition cube_r192 = neck7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(9, 184).addBox(1.3327F, -5.6865F, 3.1755F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.578F, -2.4585F, -5.8563F, 0.9668F, -0.4348F, -0.5945F));

		PartDefinition cube_r193 = neck7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(157, 191).addBox(0.2337F, -0.2784F, -0.2796F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8396F, 4.9198F, -4.0403F, 0.4368F, 0.1077F, -0.023F));

		PartDefinition cube_r194 = neck7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(89, 193).addBox(-0.2108F, -1.2483F, 0.0516F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8396F, 0.5198F, -7.2403F, 0.5589F, 0.1077F, -0.023F));

		PartDefinition cube_r195 = neck7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(196, 110).addBox(-0.2108F, -0.2118F, -0.3316F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8396F, 0.5198F, -7.2403F, 0.6287F, 0.1077F, -0.023F));

		PartDefinition cube_r196 = neck7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(186, 184).addBox(-0.3949F, -3.9258F, -0.7173F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8396F, -1.6802F, -8.8403F, 0.7694F, 0.1101F, -0.0038F));

		PartDefinition cube_r197 = neck7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(65, 23).addBox(-0.5412F, -0.9165F, -1.5127F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8396F, -4.5802F, -6.1403F, 1.4239F, 0.6551F, 1.1959F));

		PartDefinition cube_r198 = neck7.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(126, 96).addBox(-6.7383F, -9.0498F, 0.9011F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8396F, 3.6198F, -1.9403F, 1.2048F, 0.5118F, 0.9068F));

		PartDefinition cube_r199 = neck7.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(163, 38).addBox(-1.4869F, -2.9515F, -1.641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.578F, -1.6585F, -4.8563F, 0.8963F, 0.376F, 0.3813F));

		PartDefinition cube_r200 = neck7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 21).addBox(-2.578F, -7.8137F, -5.1116F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.578F, -7.6585F, -11.8563F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r201 = neck7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(200, 98).addBox(0.0745F, -9.2224F, 4.5237F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.578F, -7.6585F, -11.8563F, 0.9747F, -0.6167F, -0.4372F));

		PartDefinition cube_r202 = neck7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(165, 184).addBox(1.3327F, -5.6865F, 3.1755F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.578F, -7.6585F, -11.8563F, 0.9668F, -0.4348F, -0.5945F));

		PartDefinition cube_r203 = neck7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(62, 188).addBox(0.0574F, -0.2357F, -0.4349F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.597F, 1.9737F, -7.014F, 0.5421F, 0.1095F, -0.0115F));

		PartDefinition cube_r204 = neck7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(139, 21).addBox(-3.9387F, -6.5024F, 0.6134F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.578F, -6.8585F, -10.8563F, 1.0993F, 0.6194F, 0.8501F));

		PartDefinition cube_r205 = neck7.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(190, 41).addBox(-0.5584F, -6.5593F, 0.578F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.578F, -6.8585F, -10.8563F, 1.2881F, 0.9868F, 1.0664F));

		PartDefinition cube_r206 = neck7.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(147, 165).addBox(-1.4869F, -6.9515F, -1.641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.578F, -6.8585F, -10.8563F, 0.8963F, 0.376F, 0.3813F));

		PartDefinition cube_r207 = neck7.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(112, 196).addBox(-0.4953F, -5.7163F, -0.663F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.597F, -3.3263F, -11.514F, 0.6643F, 0.1095F, -0.0115F));

		PartDefinition cube_r208 = neck7.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(57, 180).addBox(-0.9652F, -0.3014F, -0.3338F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.597F, -7.1263F, -15.414F, 0.7341F, 0.1095F, -0.0115F));

		PartDefinition cube_r209 = neck7.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(138, 187).addBox(-1.0934F, -4.1379F, -1.3248F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.597F, -9.7263F, -16.314F, 0.6992F, 0.1095F, -0.0115F));

		PartDefinition neck6 = neck7.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0F, -17.0F, -0.0296F, 0.1275F, -0.2288F));

		PartDefinition cube_r210 = neck6.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(82, 68).addBox(-2.0F, -0.3755F, -0.5866F, 4.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, -8.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck6.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(133, 178).mirror().addBox(-2.1636F, -0.1726F, -0.2856F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.8596F, 0.7279F, -4.0572F, 0.6367F, -0.1032F, 0.0387F));

		PartDefinition cube_r212 = neck6.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(138, 160).mirror().addBox(-1.5918F, -1.9071F, -0.3124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.8596F, -6.3721F, -6.9572F, 0.34F, -0.1032F, 0.0387F));

		PartDefinition cube_r213 = neck6.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-1.5918F, -3.9105F, -0.7443F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.8596F, -6.3721F, -6.9572F, 0.4447F, -0.1032F, 0.0387F));

		PartDefinition cube_r214 = neck6.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(188, 127).mirror().addBox(-1.1F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.0054F, -7.7199F, -7.129F, 0.5203F, -0.4839F, -0.2228F));

		PartDefinition cube_r215 = neck6.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(183, 123).mirror().addBox(-4.488F, -0.4946F, -0.64F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8596F, -8.7721F, -3.6572F, 0.7121F, -1.2548F, -0.5406F));

		PartDefinition cube_r216 = neck6.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(88, 154).mirror().addBox(2.011F, -2.0245F, 0.2512F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4596F, -6.3721F, -5.3572F, 0.7371F, -0.8603F, -0.6027F));

		PartDefinition cube_r217 = neck6.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(172, 184).mirror().addBox(-2.3515F, -7.9111F, 3.2167F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6596F, -0.6721F, -1.7572F, 0.6051F, 0.6095F, 0.4119F));

		PartDefinition cube_r218 = neck6.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(58, 199).mirror().addBox(-0.5924F, -11.3823F, 4.7541F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6596F, -0.6721F, -1.7572F, 0.5372F, 0.7245F, 0.1623F));

		PartDefinition cube_r219 = neck6.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(53, 194).mirror().addBox(-2.7619F, -0.0591F, -0.0714F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7082F, -2.3953F, -6.9856F, 0.5486F, -0.0918F, 0.0609F));

		PartDefinition cube_r220 = neck6.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(78, 192).mirror().addBox(-2.1112F, -0.2089F, -0.1771F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7082F, -9.1953F, -9.5856F, 0.3741F, -0.0918F, 0.0609F));

		PartDefinition cube_r221 = neck6.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(98, 184).mirror().addBox(-0.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8917F, -14.8145F, -10.6116F, 0.217F, -0.0918F, 0.0609F));

		PartDefinition cube_r222 = neck6.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(194, 23).mirror().addBox(-1.5042F, -0.7992F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.7082F, -17.9953F, -10.3856F, 0.1123F, -0.0918F, 0.0609F));

		PartDefinition cube_r223 = neck6.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(194, 57).mirror().addBox(-1.5F, -0.5F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.3599F, -18.4408F, -9.9693F, 0.3958F, -0.2186F, -0.0539F));

		PartDefinition cube_r224 = neck6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(190, 63).mirror().addBox(-2.0F, -1.2F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3843F, -17.689F, -9.5079F, 0.0007F, -1.3203F, 0.1789F));

		PartDefinition cube_r225 = neck6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(188, 49).mirror().addBox(-1.1456F, -8.5397F, -0.5432F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7082F, -11.1953F, -5.1856F, 0.6448F, -0.8978F, -0.5316F));

		PartDefinition cube_r226 = neck6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(179, 184).mirror().addBox(-0.2819F, -0.9563F, -0.9506F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2531F, -18.6141F, -5.8352F, 0.5256F, 0.636F, 0.3655F));

		PartDefinition cube_r227 = neck6.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(199, 187).mirror().addBox(-0.1403F, -4.531F, -0.0286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2531F, -18.6141F, -5.8352F, 0.4444F, 0.7336F, 0.1004F));

		PartDefinition cube_r228 = neck6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(188, 127).addBox(-2.9F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.0054F, -7.7199F, -7.129F, 0.5203F, 0.4839F, 0.2228F));

		PartDefinition cube_r229 = neck6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(139, 143).addBox(-2.6596F, -8.7477F, -10.3341F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6596F, -0.6721F, -1.7572F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck6.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(58, 199).addBox(-0.4076F, -11.3823F, 4.7541F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6596F, -0.6721F, -1.7572F, 0.5372F, -0.7245F, -0.1623F));

		PartDefinition cube_r231 = neck6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(172, 184).addBox(1.3515F, -7.9111F, 3.2167F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6596F, -0.6721F, -1.7572F, 0.6051F, -0.6095F, -0.4119F));

		PartDefinition cube_r232 = neck6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(133, 178).addBox(1.1636F, -0.1726F, -0.2856F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8596F, 0.7279F, -4.0572F, 0.6367F, 0.1032F, -0.0387F));

		PartDefinition cube_r233 = neck6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(80, 62).addBox(0.5918F, -3.9105F, -0.7443F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8596F, -6.3721F, -6.9572F, 0.4447F, 0.1032F, -0.0387F));

		PartDefinition cube_r234 = neck6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(138, 160).addBox(0.5918F, -1.9071F, -0.3124F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.8596F, -6.3721F, -6.9572F, 0.34F, 0.1032F, -0.0387F));

		PartDefinition cube_r235 = neck6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(183, 123).addBox(-0.512F, -0.4946F, -0.64F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8596F, -8.7721F, -3.6572F, 0.7121F, 1.2548F, 0.5406F));

		PartDefinition cube_r236 = neck6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(88, 154).addBox(-5.011F, -2.0245F, 0.2512F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4596F, -6.3721F, -5.3572F, 0.7371F, 0.8603F, 0.6027F));

		PartDefinition cube_r237 = neck6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(53, 194).addBox(1.7619F, -0.0591F, -0.0714F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7082F, -2.3953F, -6.9856F, 0.5486F, 0.0918F, -0.0609F));

		PartDefinition cube_r238 = neck6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(78, 192).addBox(1.1112F, -0.2089F, -0.1771F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7082F, -9.1953F, -9.5856F, 0.3741F, 0.0918F, -0.0609F));

		PartDefinition cube_r239 = neck6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(194, 57).addBox(-1.5F, -0.5F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.3599F, -18.4408F, -9.9693F, 0.3958F, 0.2186F, 0.0539F));

		PartDefinition cube_r240 = neck6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(194, 23).addBox(0.5042F, -0.7992F, -0.7854F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.7082F, -17.9953F, -10.3856F, 0.1123F, 0.0918F, -0.0609F));

		PartDefinition cube_r241 = neck6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(98, 184).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8917F, -14.8145F, -10.6116F, 0.217F, 0.0918F, -0.0609F));

		PartDefinition cube_r242 = neck6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(190, 63).addBox(-2.0F, -1.2F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3843F, -17.689F, -9.5079F, 0.0007F, 1.3203F, -0.1789F));

		PartDefinition cube_r243 = neck6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(188, 49).addBox(-2.8544F, -8.5397F, -0.5432F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7082F, -11.1953F, -5.1856F, 0.6448F, 0.8978F, 0.5316F));

		PartDefinition cube_r244 = neck6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(179, 184).addBox(-0.7181F, -0.9563F, -0.9506F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2531F, -18.6141F, -5.8352F, 0.5256F, -0.636F, -0.3655F));

		PartDefinition cube_r245 = neck6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(199, 187).addBox(-0.8597F, -4.531F, -0.0286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2531F, -18.6141F, -5.8352F, 0.4444F, -0.7336F, -0.1004F));

		PartDefinition cube_r246 = neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 144).addBox(-2.4082F, -6.6478F, -10.3656F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4082F, -11.1953F, -5.1856F, -1.2043F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.0F, -8.0F, 0.0842F, 0.1745F, -0.105F));

		PartDefinition cube_r247 = neck5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.319F, -0.2796F, 3.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -33.5F, -4.2F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(79, 175).mirror().addBox(-2.2894F, -0.1112F, -0.3383F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, 0.9437F, -4.4042F, 0.2343F, -0.0837F, 0.0717F));

		PartDefinition cube_r249 = neck5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(57, 169).mirror().addBox(-3.2825F, -0.1158F, -0.7021F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -9.4563F, -1.6042F, -0.6387F, -1.0988F, 0.7709F));

		PartDefinition cube_r250 = neck5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(5, 195).mirror().addBox(-1.5472F, -1.0686F, -0.6089F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -9.4563F, -4.4042F, -0.0101F, -0.0837F, 0.0717F));

		PartDefinition cube_r251 = neck5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(84, 182).mirror().addBox(-1.5472F, -2.0876F, -1.0255F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -9.4563F, -4.4042F, 0.0597F, -0.0837F, 0.0717F));

		PartDefinition cube_r252 = neck5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(150, 150).mirror().addBox(-1.5F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9825F, -10.1564F, -4.3699F, 0.1159F, -0.3983F, -0.0111F));

		PartDefinition cube_r253 = neck5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(188, 53).mirror().addBox(-1.8173F, -1.0181F, -0.9254F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -9.4563F, -1.6042F, 0.1932F, -0.995F, -0.1626F));

		PartDefinition cube_r254 = neck5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(177, 194).mirror().addBox(-0.756F, -7.7441F, 2.2407F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -2.1563F, -1.6042F, 0.1677F, 0.6052F, 0.0983F));

		PartDefinition cube_r255 = neck5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(63, 200).mirror().addBox(0.9246F, -11.0F, 2.7386F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3696F, -2.1563F, -1.6042F, 0.0944F, 0.6252F, -0.1787F));

		PartDefinition cube_r256 = neck5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(74, 175).mirror().addBox(-1.9166F, -0.1945F, -0.1825F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.66F, -12.0909F, -6.4133F, 0.0946F, -0.0798F, 0.076F));

		PartDefinition cube_r257 = neck5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(196, 118).mirror().addBox(-1.2455F, -1.156F, -0.4217F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.66F, -21.4909F, -5.9133F, -0.0625F, -0.0798F, 0.076F));

		PartDefinition cube_r258 = neck5.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(103, 184).mirror().addBox(-1.2455F, -2.1617F, -0.8327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.66F, -21.4909F, -5.9133F, 0.0074F, -0.0798F, 0.076F));

		PartDefinition cube_r259 = neck5.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(191, 17).mirror().addBox(-1.3F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1355F, -22.2467F, -5.8775F, 0.0395F, -0.3545F, 0.0201F));

		PartDefinition cube_r260 = neck5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(91, 147).mirror().addBox(-4.9385F, -5.848F, -0.2889F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.66F, -15.2909F, -4.1133F, -0.8205F, -0.9988F, 0.9546F));

		PartDefinition cube_r261 = neck5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(190, 95).mirror().addBox(-0.4049F, -0.9721F, -0.2171F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5311F, -21.3474F, -4.5765F, 0.0649F, -1.0026F, -0.0547F));

		PartDefinition cube_r262 = neck5.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(182, 194).mirror().addBox(-0.5556F, -6.5473F, 1.9433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -15.2909F, -2.8133F, 0.1677F, 0.6052F, 0.0983F));

		PartDefinition cube_r263 = neck5.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(200, 173).mirror().addBox(0.8507F, -9.8193F, 2.3367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -15.2909F, -2.8133F, 0.0944F, 0.6252F, -0.1787F));

		PartDefinition cube_r264 = neck5.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(27, 50).mirror().addBox(-1.8642F, -0.0765F, -2.6364F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -5.0133F, 0.0248F, -0.0785F, 0.0773F));

		PartDefinition cube_r265 = neck5.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(195, 67).mirror().addBox(-1.8642F, -7.1775F, -2.6665F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -5.0133F, -0.0799F, -0.0785F, 0.0773F));

		PartDefinition cube_r266 = neck5.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(48, 190).mirror().addBox(-1.8642F, -8.3251F, -2.652F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -5.0133F, -0.0101F, -0.0785F, 0.0773F));

		PartDefinition cube_r267 = neck5.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(27, 139).mirror().addBox(-1.5522F, -7.5301F, -2.0316F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -5.0133F, 0.038F, -0.2237F, 0.0254F));

		PartDefinition cube_r268 = neck5.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-4.9385F, -5.848F, -0.2889F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -5.0133F, -0.8205F, -0.9988F, 0.9546F));

		PartDefinition cube_r269 = neck5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(191, 9).mirror().addBox(-0.4049F, -0.9721F, -0.2171F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2311F, -32.3474F, -5.4765F, 0.0649F, -1.0026F, -0.0547F));

		PartDefinition cube_r270 = neck5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(194, 184).mirror().addBox(-0.5556F, -6.5473F, 1.9433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -4.5133F, 0.1677F, 0.6052F, 0.0983F));

		PartDefinition cube_r271 = neck5.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(187, 200).mirror().addBox(0.8507F, -9.8193F, 2.3367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.36F, -26.2909F, -4.5133F, 0.0944F, 0.6252F, -0.1787F));

		PartDefinition cube_r272 = neck5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(79, 175).addBox(1.2894F, -0.1112F, -0.3383F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3696F, 0.9437F, -4.4042F, 0.2343F, 0.0837F, -0.0717F));

		PartDefinition cube_r273 = neck5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(5, 195).addBox(0.5472F, -1.0686F, -0.6089F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.3696F, -9.4563F, -4.4042F, -0.0101F, 0.0837F, -0.0717F));

		PartDefinition cube_r274 = neck5.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(84, 182).addBox(0.5472F, -2.0876F, -1.0255F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3696F, -9.4563F, -4.4042F, 0.0597F, 0.0837F, -0.0717F));

		PartDefinition cube_r275 = neck5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(150, 150).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9825F, -10.1564F, -4.3699F, 0.1159F, 0.3983F, 0.0111F));

		PartDefinition cube_r276 = neck5.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(57, 169).addBox(0.2825F, -0.1158F, -0.7021F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3696F, -9.4563F, -1.6042F, -0.6387F, 1.0988F, -0.7709F));

		PartDefinition cube_r277 = neck5.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(188, 53).addBox(-2.1827F, -1.0181F, -0.9254F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3696F, -9.4563F, -1.6042F, 0.1932F, 0.995F, 0.1626F));

		PartDefinition cube_r278 = neck5.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(177, 194).addBox(-0.244F, -7.7441F, 2.2407F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3696F, -2.1563F, -1.6042F, 0.1677F, -0.6052F, -0.0983F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 200).addBox(-1.9246F, -11.0F, 2.7386F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3696F, -2.1563F, -1.6042F, 0.0944F, -0.6252F, 0.1787F));

		PartDefinition cube_r280 = neck5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(88, 148).addBox(-2.3696F, -6.6436F, -10.104F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3696F, -2.1563F, -1.6042F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(191, 17).addBox(-1.7F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1355F, -22.2467F, -5.8775F, 0.0395F, 0.3545F, -0.0201F));

		PartDefinition cube_r282 = neck5.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(74, 175).addBox(0.9166F, -0.1945F, -0.1825F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.66F, -12.0909F, -6.4133F, 0.0946F, 0.0798F, -0.076F));

		PartDefinition cube_r283 = neck5.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(196, 118).addBox(0.2455F, -1.156F, -0.4217F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.66F, -21.4909F, -5.9133F, -0.0625F, 0.0798F, -0.076F));

		PartDefinition cube_r284 = neck5.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(103, 184).addBox(0.2455F, -2.1617F, -0.8327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.66F, -21.4909F, -5.9133F, 0.0074F, 0.0798F, -0.076F));

		PartDefinition cube_r285 = neck5.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 147).addBox(2.9385F, -5.848F, -0.2889F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.66F, -15.2909F, -4.1133F, -0.8205F, 0.9988F, -0.9546F));

		PartDefinition cube_r286 = neck5.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(190, 95).addBox(-3.5951F, -0.9721F, -0.2171F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5311F, -21.3474F, -4.5765F, 0.0649F, 1.0026F, 0.0547F));

		PartDefinition cube_r287 = neck5.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(200, 173).addBox(-1.8507F, -9.8193F, 2.3367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.36F, -15.2909F, -2.8133F, 0.0944F, -0.6252F, 0.1787F));

		PartDefinition cube_r288 = neck5.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(182, 194).addBox(-0.4444F, -6.5473F, 1.9433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.36F, -15.2909F, -2.8133F, 0.1677F, -0.6052F, -0.0983F));

		PartDefinition cube_r289 = neck5.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(116, 0).addBox(-1.86F, -6.3459F, -6.8907F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, -15.2909F, -2.8133F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r290 = neck5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(138, 160).addBox(-1.86F, -6.3459F, -6.8907F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.86F, -26.2909F, -4.5133F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck5.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(194, 184).addBox(-0.4444F, -6.5473F, 1.9433F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -4.5133F, 0.1677F, -0.6052F, -0.0983F));

		PartDefinition cube_r292 = neck5.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(187, 200).addBox(-1.8507F, -9.8193F, 2.3367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -4.5133F, 0.0944F, -0.6252F, 0.1787F));

		PartDefinition cube_r293 = neck5.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(191, 9).addBox(-2.5951F, -0.9721F, -0.2171F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2311F, -32.3474F, -5.4765F, 0.0649F, 1.0026F, 0.0547F));

		PartDefinition cube_r294 = neck5.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(61, 0).addBox(2.9385F, -5.848F, -0.2889F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -5.0133F, -0.8205F, 0.9988F, -0.9546F));

		PartDefinition cube_r295 = neck5.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(27, 139).addBox(-1.4478F, -7.5301F, -2.0316F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -5.0133F, 0.038F, 0.2237F, -0.0254F));

		PartDefinition cube_r296 = neck5.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(195, 67).addBox(0.8642F, -7.1775F, -2.6665F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -5.0133F, -0.0799F, 0.0785F, -0.0773F));

		PartDefinition cube_r297 = neck5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(48, 190).addBox(0.8642F, -8.3251F, -2.652F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -5.0133F, -0.0101F, 0.0785F, -0.0773F));

		PartDefinition cube_r298 = neck5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(27, 50).addBox(0.8642F, -0.0765F, -2.6364F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.36F, -26.2909F, -5.0133F, 0.0248F, 0.0785F, -0.0773F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, -5.0F, 0.1638F, 0.1742F, -0.062F));

		PartDefinition cube_r299 = neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, 0.2329F, -0.2956F, 2.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.0F, -2.0F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r300 = neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(31, 110).addBox(-1.6115F, -4.5449F, -7.3788F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -1.7901F, -0.8778F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r301 = neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(13, 165).mirror().addBox(-1.1517F, 6.8082F, -1.1728F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9115F, -9.1901F, -2.2778F, 0.0073F, -0.0771F, 0.0787F));

		PartDefinition cube_r302 = neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(195, 99).mirror().addBox(-1.1517F, -0.4835F, -0.4913F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.9115F, -9.1901F, -2.2778F, -0.0974F, -0.0771F, 0.0787F));

		PartDefinition cube_r303 = neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(118, 190).mirror().addBox(-1.1517F, -1.4957F, -0.949F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9115F, -9.1901F, -2.2778F, -0.0276F, -0.0771F, 0.0787F));

		PartDefinition cube_r304 = neck4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(117, 201).mirror().addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.334F, -8.3172F, -1.9619F, -0.8387F, -0.9845F, 0.9698F));

		PartDefinition cube_r305 = neck4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(193, 134).mirror().addBox(-0.2145F, -0.527F, -0.6492F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.3993F, -9.2834F, -2.4584F, 0.0212F, -0.3977F, 0.0256F));

		PartDefinition cube_r306 = neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(173, 60).mirror().addBox(-0.8671F, -0.1488F, -0.7659F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -9.1901F, -0.3778F, 0.0203F, -0.5322F, -0.0103F));

		PartDefinition cube_r307 = neck4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 194).mirror().addBox(-0.8883F, -7.0242F, 1.9827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -1.7901F, -0.8778F, 0.1466F, 0.6068F, 0.0863F));

		PartDefinition cube_r308 = neck4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(200, 137).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8447F, -10.664F, 0.5772F, 0.0732F, 0.622F, -0.1911F));

		PartDefinition cube_r309 = neck4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(119, 171).mirror().addBox(-1.6344F, -0.2803F, -0.1045F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -11.8901F, -3.7778F, -0.0101F, -0.0758F, 0.08F));

		PartDefinition cube_r310 = neck4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(195, 139).mirror().addBox(-1.2955F, -0.2665F, -2.3733F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -18.9901F, -0.7778F, -0.1148F, -0.0758F, 0.08F));

		PartDefinition cube_r311 = neck4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(190, 140).mirror().addBox(-1.1214F, -1.5136F, -0.5505F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -18.9901F, -3.0778F, -0.045F, -0.0758F, 0.08F));

		PartDefinition cube_r312 = neck4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(197, 60).mirror().addBox(-1.0857F, -0.6445F, -2.5992F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -18.9901F, -0.7778F, 0.0199F, -0.1883F, 0.0301F));

		PartDefinition cube_r313 = neck4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(198, 129).mirror().addBox(-2.6329F, -0.6445F, -0.7272F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -18.9901F, -0.7778F, 0.0529F, -1.1914F, -0.0153F));

		PartDefinition cube_r314 = neck4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(199, 12).mirror().addBox(-0.8671F, -0.6488F, -1.2659F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -18.9901F, -0.7778F, 0.0203F, -0.5322F, -0.0103F));

		PartDefinition cube_r315 = neck4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(167, 194).mirror().addBox(-0.8883F, -7.0242F, 1.9827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -11.1901F, -1.5778F, 0.1466F, 0.6068F, 0.0863F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(200, 143).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8447F, -20.064F, -0.1228F, 0.0732F, 0.622F, -0.1911F));

		PartDefinition cube_r317 = neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(200, 72).mirror().addBox(-1.0824F, -0.4454F, -2.618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -27.7901F, -1.7778F, 0.091F, -0.1899F, 0.0167F));

		PartDefinition cube_r318 = neck4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(123, 191).mirror().addBox(-1.1023F, -1.1567F, -0.6557F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -27.7901F, -3.9778F, 0.0248F, -0.0812F, 0.0746F));

		PartDefinition cube_r319 = neck4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(149, 175).mirror().addBox(-1.6679F, -0.1835F, -0.5999F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -20.3901F, -3.7778F, -0.0101F, -0.0812F, 0.0746F));

		PartDefinition cube_r320 = neck4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(195, 147).mirror().addBox(-1.2806F, -0.0672F, -2.3656F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -27.7901F, -1.7778F, -0.045F, -0.0812F, 0.0746F));

		PartDefinition cube_r321 = neck4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(15, 199).mirror().addBox(-2.6469F, -0.4454F, -0.7401F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -27.7901F, -1.7778F, 0.239F, -1.1843F, -0.188F));

		PartDefinition cube_r322 = neck4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(199, 24).mirror().addBox(-0.8759F, -0.4496F, -1.281F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -27.7901F, -1.7778F, 0.1012F, -0.5301F, -0.0513F));

		PartDefinition cube_r323 = neck4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(41, 183).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0384F, -21.5893F, 0.3445F, 0.5659F, 0.4599F, 0.4792F));

		PartDefinition cube_r324 = neck4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(196, 155).mirror().addBox(-0.8883F, -7.0242F, 1.9827F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6115F, -20.6901F, -2.7778F, 0.1466F, 0.6068F, 0.0863F));

		PartDefinition cube_r325 = neck4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(200, 149).mirror().addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8447F, -29.564F, -1.3228F, 0.0732F, 0.622F, -0.1911F));

		PartDefinition cube_r326 = neck4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(133, 194).addBox(-0.1117F, -7.0242F, 1.9827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -1.7901F, -0.8778F, 0.1466F, -0.6068F, -0.0863F));

		PartDefinition cube_r327 = neck4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(200, 137).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8447F, -10.664F, 0.5772F, 0.0732F, -0.622F, 0.1911F));

		PartDefinition cube_r328 = neck4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(193, 134).addBox(-2.7855F, -0.527F, -0.6492F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.3993F, -9.2834F, -2.4584F, 0.0212F, 0.3977F, -0.0256F));

		PartDefinition cube_r329 = neck4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(13, 165).addBox(0.1517F, 6.8082F, -1.1728F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9115F, -9.1901F, -2.2778F, 0.0073F, 0.0771F, -0.0787F));

		PartDefinition cube_r330 = neck4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(173, 60).addBox(-1.1329F, -0.1488F, -0.7659F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6115F, -9.1901F, -0.3778F, 0.0203F, 0.5322F, 0.0103F));

		PartDefinition cube_r331 = neck4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(117, 201).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.334F, -8.3172F, -1.9619F, -0.8387F, 0.9845F, -0.9698F));

		PartDefinition cube_r332 = neck4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(195, 99).addBox(0.1517F, -0.4835F, -0.4913F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.9115F, -9.1901F, -2.2778F, -0.0974F, 0.0771F, -0.0787F));

		PartDefinition cube_r333 = neck4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(118, 190).addBox(0.1517F, -1.4957F, -0.949F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9115F, -9.1901F, -2.2778F, -0.0276F, 0.0771F, -0.0787F));

		PartDefinition cube_r334 = neck4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(197, 60).addBox(-0.9143F, -0.6445F, -2.5992F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6115F, -18.9901F, -0.7778F, 0.0199F, 0.1883F, -0.0301F));

		PartDefinition cube_r335 = neck4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(151, 151).addBox(-1.6115F, -4.5449F, -7.3788F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -11.1901F, -1.5778F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(167, 194).addBox(-0.1117F, -7.0242F, 1.9827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -11.1901F, -1.5778F, 0.1466F, -0.6068F, -0.0863F));

		PartDefinition cube_r337 = neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(200, 143).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8447F, -20.064F, -0.1228F, 0.0732F, -0.622F, 0.1911F));

		PartDefinition cube_r338 = neck4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(199, 12).addBox(-1.1329F, -0.6488F, -1.2659F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6115F, -18.9901F, -0.7778F, 0.0203F, 0.5322F, 0.0103F));

		PartDefinition cube_r339 = neck4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(198, 129).addBox(0.6329F, -0.6445F, -0.7272F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6115F, -18.9901F, -0.7778F, 0.0529F, 1.1914F, 0.0153F));

		PartDefinition cube_r340 = neck4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(190, 140).addBox(0.1214F, -1.5136F, -0.5505F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6115F, -18.9901F, -3.0778F, -0.045F, 0.0758F, -0.08F));

		PartDefinition cube_r341 = neck4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(195, 139).addBox(0.2955F, -0.2665F, -2.3733F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6115F, -18.9901F, -0.7778F, -0.1148F, 0.0758F, -0.08F));

		PartDefinition cube_r342 = neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(119, 171).addBox(0.6344F, -0.2803F, -0.1045F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6115F, -11.8901F, -3.7778F, -0.0101F, 0.0758F, -0.08F));

		PartDefinition cube_r343 = neck4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(149, 175).addBox(0.6679F, -0.1835F, -0.5999F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6115F, -20.3901F, -3.7778F, -0.0101F, 0.0812F, -0.0746F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(195, 147).addBox(0.2806F, -0.0672F, -2.3656F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.6115F, -27.7901F, -1.7778F, -0.045F, 0.0812F, -0.0746F));

		PartDefinition cube_r345 = neck4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(123, 191).addBox(0.1023F, -1.1567F, -0.6557F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6115F, -27.7901F, -3.9778F, 0.0248F, 0.0812F, -0.0746F));

		PartDefinition cube_r346 = neck4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(199, 24).addBox(-1.1241F, -0.4496F, -1.281F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6115F, -27.7901F, -1.7778F, 0.1012F, 0.5301F, 0.0513F));

		PartDefinition cube_r347 = neck4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(15, 199).addBox(0.6469F, -0.4454F, -0.7401F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6115F, -27.7901F, -1.7778F, 0.239F, 1.1843F, 0.188F));

		PartDefinition cube_r348 = neck4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(200, 72).addBox(-0.9176F, -0.4454F, -2.618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6115F, -27.7901F, -1.7778F, 0.091F, 0.1899F, -0.0167F));

		PartDefinition cube_r349 = neck4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(41, 183).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0384F, -21.5893F, 0.3445F, 0.5659F, -0.4599F, -0.4792F));

		PartDefinition cube_r350 = neck4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(20, 136).addBox(-1.6115F, -4.5449F, -7.3788F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -20.6901F, -2.7778F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r351 = neck4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(196, 155).addBox(-0.1117F, -7.0242F, 1.9827F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6115F, -20.6901F, -2.7778F, 0.1466F, -0.6068F, -0.0863F));

		PartDefinition cube_r352 = neck4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(200, 149).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8447F, -29.564F, -1.3228F, 0.0732F, -0.622F, 0.1911F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.0F, -3.0F, 0.1309F, 0.1396F, 0.0F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(116, 0).addBox(-1.0F, -0.0936F, -0.0733F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -17.2F, -5.4F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-1.1941F, -0.5769F, -2.4452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -7.0649F, -1.3709F, 0.2598F, -0.19F, -0.0153F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(27, 177).mirror().addBox(-1.8107F, -0.2165F, -0.5278F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.474F, 0.4351F, -1.9709F, 0.0163F, -0.0923F, 0.0601F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(128, 191).mirror().addBox(-1.2328F, -0.9694F, -0.7446F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -7.0649F, -3.3709F, 0.2083F, -0.0923F, 0.0601F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(195, 170).mirror().addBox(-1.2328F, 0.0285F, -0.2472F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -7.0649F, -3.3709F, 0.1211F, -0.0923F, 0.0601F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(199, 28).mirror().addBox(-2.5612F, -0.5769F, -0.553F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -7.0649F, -1.3709F, 0.6238F, -1.1242F, -0.5408F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(199, 45).mirror().addBox(-0.9189F, -0.5861F, -1.0831F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -7.0649F, -1.3709F, 0.2916F, -0.5137F, -0.1464F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(201, 118).mirror().addBox(-0.7F, -1.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5466F, -2.8803F, 0.6904F, 0.87F, 0.3205F, 0.5937F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(107, 197).mirror().addBox(-0.8682F, -4.9031F, 1.7235F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -2.4649F, -1.6709F, 0.4059F, 0.5721F, 0.2311F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(191, 87).mirror().addBox(0.1762F, -6.5312F, 1.7235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -2.4649F, -1.6709F, 0.2554F, 0.6463F, -0.0308F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(201, 3).mirror().addBox(-1.1817F, -0.8537F, -2.33F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -14.1649F, -4.2709F, 0.4019F, -0.1861F, -0.0419F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(0, 193).mirror().addBox(-0.3607F, -0.3251F, -0.7398F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.1035F, -4.8999F, -3.4853F, 0.1213F, -0.0972F, 0.0518F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(108, 184).mirror().addBox(-1.4456F, -1.6228F, -2.8141F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -14.1649F, -4.0709F, 0.2958F, -0.0972F, 0.0518F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(196, 0).mirror().addBox(-1.6613F, -5.6656F, -0.5199F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -8.6649F, -4.7709F, 0.2086F, -0.0972F, 0.0518F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(199, 49).mirror().addBox(-2.4574F, -1.3537F, -0.5016F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -14.1649F, -4.2709F, 0.8615F, -1.0396F, -0.7511F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(201, 0).mirror().addBox(-0.8606F, -0.8633F, -0.9841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -14.1649F, -4.2709F, 0.4481F, -0.488F, -0.2217F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(201, 155).mirror().addBox(-0.7F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5466F, -10.6803F, -2.0096F, 0.9573F, 0.3205F, 0.5937F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(138, 197).mirror().addBox(-0.8682F, -4.9031F, 1.7235F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -10.2649F, -4.3709F, 0.4059F, 0.5721F, 0.2311F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(143, 201).mirror().addBox(0.1762F, -6.5312F, 1.7235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.474F, -10.2649F, -4.3709F, 0.2554F, 0.6463F, -0.0308F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(201, 118).addBox(-0.3F, -1.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5466F, -2.8803F, 0.6904F, 0.87F, -0.3205F, -0.5937F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(191, 87).addBox(-1.1762F, -6.5312F, 1.7235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.474F, -2.4649F, -1.6709F, 0.2554F, -0.6463F, 0.0308F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(94, 67).addBox(-1.474F, -4.4285F, -5.2494F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.474F, -2.4649F, -1.6709F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(107, 197).addBox(-0.1318F, -4.9031F, 1.7235F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.474F, -2.4649F, -1.6709F, 0.4059F, -0.5721F, -0.2311F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(199, 45).addBox(-1.0811F, -0.5861F, -1.0831F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.474F, -7.0649F, -1.3709F, 0.2916F, 0.5137F, 0.1464F));

		PartDefinition cube_r377 = neck3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(200, 200).addBox(-0.8059F, -0.5769F, -2.4452F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.474F, -7.0649F, -1.3709F, 0.2598F, 0.19F, 0.0153F));

		PartDefinition cube_r378 = neck3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(199, 28).addBox(0.5612F, -0.5769F, -0.553F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.474F, -7.0649F, -1.3709F, 0.6238F, 1.1242F, 0.5408F));

		PartDefinition cube_r379 = neck3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(128, 191).addBox(0.2328F, -0.9694F, -0.7446F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.474F, -7.0649F, -3.3709F, 0.2083F, 0.0923F, -0.0601F));

		PartDefinition cube_r380 = neck3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(195, 170).addBox(0.2328F, 0.0285F, -0.2472F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.474F, -7.0649F, -3.3709F, 0.1211F, 0.0923F, -0.0601F));

		PartDefinition cube_r381 = neck3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(27, 177).addBox(0.8107F, -0.2165F, -0.5278F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.474F, 0.4351F, -1.9709F, 0.0163F, 0.0923F, -0.0601F));

		PartDefinition cube_r382 = neck3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(201, 3).addBox(-0.8183F, -0.8537F, -2.33F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.474F, -14.1649F, -4.2709F, 0.4019F, 0.1861F, 0.0419F));

		PartDefinition cube_r383 = neck3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(201, 155).addBox(-0.3F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5466F, -10.6803F, -2.0096F, 0.9573F, -0.3205F, -0.5937F));

		PartDefinition cube_r384 = neck3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 0).addBox(-1.474F, -3.8285F, -4.2494F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.474F, -10.2649F, -4.3709F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r385 = neck3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(138, 197).addBox(-0.1318F, -4.9031F, 1.7235F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.474F, -10.2649F, -4.3709F, 0.4059F, -0.5721F, -0.2311F));

		PartDefinition cube_r386 = neck3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(143, 201).addBox(-1.1762F, -6.5312F, 1.7235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.474F, -10.2649F, -4.3709F, 0.2554F, -0.6463F, 0.0308F));

		PartDefinition cube_r387 = neck3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(201, 0).addBox(-1.1394F, -0.8633F, -0.9841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.474F, -14.1649F, -4.2709F, 0.4481F, 0.488F, 0.2217F));

		PartDefinition cube_r388 = neck3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(199, 49).addBox(0.4574F, -1.3537F, -0.5016F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.474F, -14.1649F, -4.2709F, 0.8615F, 1.0396F, 0.7511F));

		PartDefinition cube_r389 = neck3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(196, 0).addBox(0.6613F, -5.6656F, -0.5199F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.474F, -8.6649F, -4.7709F, 0.2086F, 0.0972F, -0.0518F));

		PartDefinition cube_r390 = neck3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(108, 184).addBox(0.4456F, -1.6228F, -2.8141F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.474F, -14.1649F, -4.0709F, 0.2958F, 0.0972F, -0.0518F));

		PartDefinition cube_r391 = neck3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 193).addBox(-0.6393F, -0.3251F, -0.7398F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.1035F, -4.8999F, -3.4853F, 0.1213F, 0.0972F, -0.0518F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.0F, -6.0F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r392 = neck2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(139, 0).addBox(-1.0F, -0.067F, -0.0558F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8F, -6.8F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(201, 32).mirror().addBox(-1.0546F, -2.7086F, -0.3911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.2746F, -3.19F, 0.5879F, -0.1753F, -0.0754F));

		PartDefinition cube_r394 = neck2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(67, 188).mirror().addBox(-1.8291F, -0.1798F, -0.4969F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5254F, -2.29F, 0.3577F, -0.105F, 0.0332F));

		PartDefinition cube_r395 = neck2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(10, 196).mirror().addBox(-1.8395F, -5.5844F, -0.6409F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5254F, -2.19F, 0.3926F, -0.105F, 0.0332F));

		PartDefinition cube_r396 = neck2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(72, 193).mirror().addBox(-1.3979F, -1.0969F, -0.4887F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -4.2746F, -4.89F, 0.4799F, -0.105F, 0.0332F));

		PartDefinition cube_r397 = neck2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(199, 53).mirror().addBox(-0.7538F, -3.2086F, 0.433F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.2746F, -3.19F, 1.0781F, -0.9023F, -0.9305F));

		PartDefinition cube_r398 = neck2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(201, 16).mirror().addBox(-0.0338F, -2.7293F, 0.7625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.2746F, -3.19F, 0.6459F, -0.4397F, -0.3104F));

		PartDefinition cube_r399 = neck2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(161, 201).mirror().addBox(0.4746F, -0.2993F, -0.4959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.4746F, 1.31F, 1.0078F, 0.314F, 0.5839F));

		PartDefinition cube_r400 = neck2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(28, 197).mirror().addBox(-1.0872F, -3.1856F, 1.7393F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -2.0746F, -2.49F, 0.7234F, 0.483F, 0.3921F));

		PartDefinition cube_r401 = neck2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(192, 201).mirror().addBox(0.1663F, -1.445F, -0.1755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -6.0746F, -2.49F, 0.6128F, 0.6242F, 0.1827F));

		PartDefinition cube_r402 = neck2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(201, 63).mirror().addBox(-1.0546F, -2.7086F, -0.3911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -6.6746F, -6.39F, 0.5879F, -0.1753F, -0.0754F));

		PartDefinition cube_r403 = neck2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(23, 193).mirror().addBox(-1.602F, 2.933F, -0.4868F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -6.7746F, -6.69F, 0.4452F, -0.1061F, 0.0295F));

		PartDefinition cube_r404 = neck2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(196, 193).mirror().addBox(-1.8325F, -5.5496F, -0.5853F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -3.9746F, -5.29F, 0.4277F, -0.1061F, 0.0295F));

		PartDefinition cube_r405 = neck2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(172, 194).mirror().addBox(-1.395F, -1.0101F, -0.5382F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -8.7746F, -8.09F, 0.515F, -0.1061F, 0.0295F));

		PartDefinition cube_r406 = neck2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(199, 106).mirror().addBox(-0.7538F, -3.2086F, 0.433F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -6.6746F, -6.39F, 1.0781F, -0.9023F, -0.9305F));

		PartDefinition cube_r407 = neck2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(201, 40).mirror().addBox(-0.0338F, -2.7293F, 0.7625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -6.6746F, -6.39F, 0.6459F, -0.4397F, -0.3104F));

		PartDefinition cube_r408 = neck2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(33, 198).mirror().addBox(-1.0872F, -3.1856F, 1.7393F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -7.0746F, -6.49F, 0.7234F, 0.483F, 0.3921F));

		PartDefinition cube_r409 = neck2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(201, 32).addBox(-0.9454F, -2.7086F, -0.3911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, -2.2746F, -3.19F, 0.5879F, 0.1753F, 0.0754F));

		PartDefinition cube_r410 = neck2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(201, 16).addBox(-1.9662F, -2.7293F, 0.7625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -2.2746F, -3.19F, 0.6459F, 0.4397F, 0.3104F));

		PartDefinition cube_r411 = neck2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(199, 53).addBox(-1.2462F, -3.2086F, 0.433F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -2.2746F, -3.19F, 1.0781F, 0.9023F, 0.9305F));

		PartDefinition cube_r412 = neck2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 78).addBox(-1.3F, -3.6537F, -2.5415F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -2.0746F, -2.49F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r413 = neck2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(192, 201).addBox(-1.1663F, -1.445F, -0.1755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3F, -6.0746F, -2.49F, 0.6128F, -0.6242F, -0.1827F));

		PartDefinition cube_r414 = neck2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(161, 201).addBox(-1.4746F, -0.2993F, -0.4959F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3F, -1.4746F, 1.31F, 1.0078F, -0.314F, -0.5839F));

		PartDefinition cube_r415 = neck2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(28, 197).addBox(0.0872F, -3.1856F, 1.7393F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -2.0746F, -2.49F, 0.7234F, -0.483F, -0.3921F));

		PartDefinition cube_r416 = neck2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 196).addBox(0.8395F, -5.5844F, -0.6409F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3F, 0.5254F, -2.19F, 0.3926F, 0.105F, -0.0332F));

		PartDefinition cube_r417 = neck2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(72, 193).addBox(0.3979F, -1.0969F, -0.4887F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, -4.2746F, -4.89F, 0.4799F, 0.105F, -0.0332F));

		PartDefinition cube_r418 = neck2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(67, 188).addBox(0.8291F, -0.1798F, -0.4969F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.5254F, -2.29F, 0.3577F, 0.105F, -0.0332F));

		PartDefinition cube_r419 = neck2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(201, 63).addBox(-0.9454F, -2.7086F, -0.3911F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3F, -6.6746F, -6.39F, 0.5879F, 0.1753F, 0.0754F));

		PartDefinition cube_r420 = neck2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(8, 0).addBox(-1.3F, -3.6537F, -1.8415F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -7.0746F, -6.49F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r421 = neck2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(33, 198).addBox(0.0872F, -3.1856F, 1.7393F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -7.0746F, -6.49F, 0.7234F, -0.483F, -0.3921F));

		PartDefinition cube_r422 = neck2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(201, 40).addBox(-1.9662F, -2.7293F, 0.7625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -6.6746F, -6.39F, 0.6459F, 0.4397F, 0.3104F));

		PartDefinition cube_r423 = neck2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(199, 106).addBox(-1.2462F, -3.2086F, 0.433F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -6.6746F, -6.39F, 1.0781F, 0.9023F, 0.9305F));

		PartDefinition cube_r424 = neck2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(196, 193).addBox(0.8325F, -5.5496F, -0.5853F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.3F, -3.9746F, -5.29F, 0.4277F, 0.1061F, -0.0295F));

		PartDefinition cube_r425 = neck2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(172, 194).addBox(0.395F, -1.0101F, -0.5382F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, -8.7746F, -8.09F, 0.515F, 0.1061F, -0.0295F));

		PartDefinition cube_r426 = neck2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(23, 193).addBox(0.602F, 2.933F, -0.4868F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, -6.7746F, -6.69F, 0.4452F, 0.1061F, -0.0295F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, -7.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r427 = neck.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(173, 0).addBox(-1.2262F, -2.7256F, -0.052F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, -2.7074F, -3.2448F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r428 = neck.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(38, 197).mirror().addBox(-1.6813F, -0.2643F, -0.4753F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -0.7074F, -3.1448F, 0.5329F, -0.1083F, 0.0201F));

		PartDefinition cube_r429 = neck.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(200, 167).mirror().addBox(-1.6749F, -2.636F, -1.5108F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -2.1074F, -2.9448F, 0.6551F, -0.1083F, 0.0201F));

		PartDefinition cube_r430 = neck.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(201, 85).mirror().addBox(-1.2338F, -1.9512F, -1.0762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -2.1074F, -2.9448F, 0.8169F, -0.1538F, -0.1131F));

		PartDefinition cube_r431 = neck.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(201, 94).mirror().addBox(-1.4279F, -1.9512F, 0.216F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -2.1074F, -2.9448F, 1.2565F, -0.7113F, -1.06F));

		PartDefinition cube_r432 = neck.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(201, 110).mirror().addBox(-0.4551F, -1.9724F, 0.1926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -2.1074F, -2.9448F, 0.8768F, -0.3603F, -0.4008F));

		PartDefinition cube_r433 = neck.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(99, 198).mirror().addBox(-0.5723F, -1.8445F, 0.8828F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -2.7074F, -3.2448F, 0.9497F, 0.3859F, 0.4878F));

		PartDefinition cube_r434 = neck.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(201, 110).addBox(-1.5449F, -1.9724F, 0.1926F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2262F, -2.1074F, -2.9448F, 0.8768F, 0.3603F, 0.4008F));

		PartDefinition cube_r435 = neck.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(99, 198).addBox(-0.4277F, -1.8445F, 0.8828F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, -2.7074F, -3.2448F, 0.9497F, -0.3859F, -0.4878F));

		PartDefinition cube_r436 = neck.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(201, 94).addBox(-0.5721F, -1.9512F, 0.216F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2262F, -2.1074F, -2.9448F, 1.2565F, 0.7113F, 1.06F));

		PartDefinition cube_r437 = neck.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(201, 85).addBox(-0.7662F, -1.9512F, -1.0762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2262F, -2.1074F, -2.9448F, 0.8169F, 0.1538F, 0.1131F));

		PartDefinition cube_r438 = neck.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(200, 167).addBox(0.6749F, -2.636F, -1.5108F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2262F, -2.1074F, -2.9448F, 0.6551F, 0.1083F, -0.0201F));

		PartDefinition cube_r439 = neck.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(38, 197).addBox(0.6813F, -0.2643F, -0.4753F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2262F, -0.7074F, -3.1448F, 0.5329F, 0.1083F, -0.0201F));

		PartDefinition cube_r440 = neck.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(163, 25).addBox(-1.0F, -0.0658F, -0.0316F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, -4.9F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r441 = neck.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(31, 0).addBox(0.0F, -0.7F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7266F, -4.9167F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r442 = neck.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(185, 134).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, -7.1F, -0.4538F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(163, 69).addBox(-2.5F, -2.3F, -4.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(114, 67).addBox(1.6F, -1.3F, -4.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 29).addBox(1.5F, 2.2F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(113, 29).mirror().addBox(-2.5F, 2.2F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(114, 67).mirror().addBox(-2.6F, -1.3F, -4.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.0F, -7.0F, 0.0242F, -0.0316F, 0.1271F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(197, 34).mirror().addBox(-0.9F, -0.3512F, -0.2691F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.3954F, -5.4056F, -0.7303F, 0.07F, 0.0779F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(196, 75).mirror().addBox(-0.73F, 0.3468F, -0.597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(195, 178).mirror().addBox(-1.03F, 0.3468F, -0.597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
				.texOffs(196, 80).mirror().addBox(-0.5F, -0.0532F, -0.197F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(68, 201).mirror().addBox(-0.5F, -0.0532F, 2.303F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 201).addBox(3.7F, -0.0532F, 2.303F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(195, 178).addBox(4.23F, 0.3468F, -0.597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F))
				.texOffs(196, 75).addBox(3.93F, 0.3468F, -0.597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(196, 80).addBox(3.7F, -0.0532F, -0.197F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1F, -1.2F, -2.7F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(102, 40).addBox(3.7F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1F, 2.0633F, -0.9787F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(15, 107).addBox(3.7F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1F, 1.7879F, -1.6887F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(199, 161).mirror().addBox(-3.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(199, 161).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2F, 0.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(125, 0).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.5319F, -5.6946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(17, 41).addBox(-2.0F, -6.0183F, -2.0076F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.8F, -3.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(183, 78).addBox(-2.0F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.2F, -1.3F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(182, 71).addBox(-2.0F, -4.1888F, -0.2639F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9294F, -5.2587F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(197, 34).addBox(-0.1F, -0.3512F, -0.2691F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3954F, -5.4056F, -0.7303F, -0.07F, -0.0779F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(83, 197).addBox(0.0F, -5.0242F, -0.0669F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.3F, -7.1F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(201, 113).addBox(0.0F, -2.9924F, -0.073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -9.6F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(116, 40).addBox(0.0F, -2.0026F, -0.9724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -9.5F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(185, 165).addBox(-1.0F, -2.0685F, -0.0657F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -11.7F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(78, 147).addBox(-2.0F, -0.236F, -0.4933F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4F, -9.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(186, 57).addBox(-1.0F, -2.0102F, -0.0654F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -12.8F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(184, 35).addBox(-1.5F, -1.9796F, -6.0564F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(136, 120).addBox(-1.5F, -0.1796F, -5.7564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(17, 152).addBox(-2.0F, -1.9796F, -3.0564F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.2F, -6.7F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(185, 91).addBox(-2.0F, -0.9024F, -0.0128F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.1F, -9.4F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(171, 91).addBox(-2.0F, 2.9F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(184, 18).addBox(1.5F, -0.4F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(184, 18).mirror().addBox(-2.5F, -0.4F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7F, 0.7F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(43, 199).mirror().addBox(-2.5F, 0.0335F, -2.0382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(43, 199).addBox(1.5F, 0.0335F, -2.0382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7F, -4.6F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-2.5F, -0.0014F, -1.0376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 0).addBox(1.5F, -0.0014F, -1.0376F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.6F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(199, 90).mirror().addBox(-2.5F, 0.0211F, -0.9592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(199, 90).addBox(1.5F, 0.0211F, -0.9592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.9F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-1.4F, -4.4101F, -9.1273F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(139, 25).mirror().addBox(-2.0F, -3.6101F, -8.3273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(199, 183).addBox(-1.5F, -3.6101F, -9.3273F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 62).addBox(0.4F, -4.4101F, -9.1273F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 25).addBox(0.0F, -3.6101F, -8.3273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4466F, -2.9515F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(97, 165).mirror().addBox(-1.9F, -0.0187F, 0.0112F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 165).addBox(0.9F, -0.0187F, 0.0112F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.3534F, -10.5515F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(100, 144).mirror().addBox(-2.5F, -2.2419F, -7.8911F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 144).addBox(0.5F, -2.2419F, -7.8911F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4466F, -2.9515F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(184, 152).mirror().addBox(-2.5F, -1.7983F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(184, 152).addBox(1.5F, -1.7983F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4466F, -2.9515F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(199, 6).mirror().addBox(-2.5F, 0.997F, -1.0151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(194, 163).mirror().addBox(-2.5F, -0.003F, -2.0151F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(199, 6).addBox(1.5F, 0.997F, -1.0151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(194, 163).addBox(1.5F, -0.003F, -2.0151F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(199, 124).mirror().addBox(-2.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(199, 124).addBox(1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.7156F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 78).addBox(-2.0F, -1.2491F, 0.0696F, 4.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 12.9F, -0.3627F, -0.1221F, -0.4532F));

		PartDefinition cube_r471 = tail.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(189, 0).addBox(-0.5F, -12.1F, 12.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 189).addBox(-0.5F, -10.0F, 9.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(189, 111).addBox(-0.5F, -8.0F, 6.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 190).addBox(-0.5F, -6.0F, 3.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 182).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.113F, 6.6573F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r472 = tail.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(191, 192).addBox(0.0F, 2.2F, 8.4F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(190, 171).addBox(0.0F, 0.0F, 5.4F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 188).addBox(0.0F, -2.5F, 2.4F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(113, 184).addBox(0.0F, -4.5F, -0.6F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5481F, 14.1459F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r473 = tail.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(145, 190).addBox(0.0F, 0.3F, 2.7F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(152, 191).addBox(0.0F, -3.7F, -0.3F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7103F, 5.1911F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r474 = tail.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(138, 60).addBox(-1.0F, -4.0F, -2.4F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3484F, 4.1624F, -0.5934F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 62).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 24.0F, -0.0678F, -0.2213F, -0.1502F));

		PartDefinition cube_r475 = tail2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(165, 52).addBox(0.0F, -1.5F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8906F, 23.2068F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r476 = tail2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(198, 18).addBox(0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8575F, 19.8528F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(196, 85).addBox(0.0F, -20.9F, 27.3F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 196).addBox(0.0F, -19.2F, 24.3F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 78).addBox(-0.5F, -17.3F, 21.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(116, 0).addBox(-0.5F, -15.9F, 18.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 110).addBox(-0.5F, -13.9F, 15.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.913F, -17.3427F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r478 = tail2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(155, 96).addBox(0.0F, 10.4F, 11.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 158).addBox(0.0F, 7.4F, 8.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(120, 158).addBox(0.0F, 4.4F, 5.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(163, 25).addBox(0.0F, 1.5F, 2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 167).addBox(0.0F, -2.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1797F, 7.6806F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r479 = tail2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(162, 192).addBox(0.0F, -3.0F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6218F, 4.1572F, 0.8639F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(76, 125).addBox(-1.0F, -0.3507F, -1.0711F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 25.0F, -0.0271F, -0.4532F, -0.2486F));

		PartDefinition cube_r480 = tail3.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(20, 201).addBox(0.0F, -4.3F, 14.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(148, 200).addBox(0.0F, -3.8F, 11.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 200).addBox(0.0F, -3.2F, 8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, -2.5F, 5.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(157, 0).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2906F, -1.7932F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r481 = tail3.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(116, 46).addBox(0.0F, 19.4F, 20.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(126, 67).addBox(0.0F, 16.6F, 17.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 128).addBox(0.0F, 13.6F, 14.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7797F, -17.3194F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(109, 103).addBox(-1.0F, -0.8F, -1.1F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 15.0F, -0.0852F, -0.396F, -0.1403F));

		PartDefinition cube_r482 = tail4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(100, 67).addBox(0.0F, 7.5F, 17.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 119).addBox(0.0F, 6.5F, 14.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(97, 125).addBox(0.0F, 5.1F, 11.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 144).addBox(0.0F, 4.1F, 8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 119).addBox(0.0F, 2.0F, 5.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 136).addBox(0.0F, 0.8F, 2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 152).addBox(0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.886F, 1.1622F, 0.4712F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(114, 67).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 21.0F, -0.1241F, -0.4537F, 0.0085F));

		PartDefinition cube_r483 = tail5.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(6, 21).addBox(0.0F, 9.7F, 23.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 67).addBox(0.0F, 8.6F, 20.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.286F, -19.8378F, 0.4712F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(55, 122).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 19.0F, 0.3549F, 0.6603F, 0.068F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(33, 119).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 17.0F, -0.1041F, 0.5282F, -0.1907F));

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
