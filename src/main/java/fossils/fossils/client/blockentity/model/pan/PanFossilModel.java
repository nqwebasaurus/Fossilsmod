package fossils.fossils.client.blockentity.model.pan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart thumb;
	private final ModelPart thumb2;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart thumb3;
	private final ModelPart thumb4;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public PanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.thumb = this.leftArm3.getChild("thumb");
		this.thumb2 = this.thumb.getChild("thumb2");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.thumb3 = this.rightArm3.getChild("thumb3");
		this.thumb4 = this.thumb3.getChild("thumb4");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.4935F, 17.1362F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 88).addBox(0.0F, -0.5937F, -1.4061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(107, 58).addBox(0.0F, -2.4132F, -0.1343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.2F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 4.0835F, 3.4763F, -0.4001F, 0.0341F, 0.0804F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 37).addBox(-1.5F, -5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 12.0487F, -4.469F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 92).addBox(-1.0F, -4.0212F, 0.3824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(92, 87).addBox(-1.0F, -4.0212F, 0.0324F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 9.8702F, -4.9541F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 93).addBox(-1.0F, 4.8788F, -0.9676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.3959F, -2.72F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 72).addBox(-1.0F, -7.0026F, -0.0604F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.1973F, -3.5292F, -0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 71).addBox(-1.0F, -0.5026F, -1.0104F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 103).addBox(-1.0F, -3.8F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 17.928F, -3.9838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.8F, -0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8944F, -5.4202F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -0.234F, -1.0486F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.6327F, -5.3054F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 65).addBox(-1.0F, -0.7638F, -1.0592F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.6327F, -5.3054F, -0.4538F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.2727F, -6.2451F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(46, 100).addBox(-1.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 77).addBox(-1.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 30).addBox(-1.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 81).addBox(-1.9F, -0.1589F, 0.2196F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 52).addBox(-0.7F, -5.8F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 60).addBox(-1.5F, -1.1F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3F, 13.9543F, -1.6789F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 76).addBox(0.3F, -0.075F, -0.125F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 7.6945F, -1.1038F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 7).addBox(0.3F, -0.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.4582F, 1.4642F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(87, 88).addBox(-1.9F, -5.0561F, -0.968F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4F, 10.516F, -1.6751F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(89, 48).addBox(-1.9F, -0.0561F, 0.032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 10.4463F, -2.6727F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 91).addBox(-1.9F, 0.0439F, 0.032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 5.3587F, -2.3169F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 89).addBox(-1.9F, -0.7561F, -0.468F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.288F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(56, 24).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2974F, 16.2918F, -2.9897F, -1.128F, -0.0577F, -0.0532F));

		PartDefinition cube_r26 = leftLeg3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(82, 54).addBox(-1.0F, -2.1185F, -1.9027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.4586F, 0.2937F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 66).addBox(-1.0017F, 0.2358F, -0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.3276F, -0.6858F, 0.2821F, -0.1745F, 0.0F, 0.3927F));

		PartDefinition cube_r28 = leftLeg3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 63).addBox(1.0453F, 0.2659F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6F, -0.6629F, -6.1394F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 4.2749F, 0.0205F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 0).addBox(-1.3F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -0.1629F, -3.0144F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -3.6144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 4.0835F, 3.4763F, 0.2925F, 0.0508F, -0.1671F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 66).addBox(-0.5F, -5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5757F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 82).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 12.0487F, -4.469F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 92).addBox(0.0F, -4.0212F, 0.3824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(10, 93).addBox(0.0F, -4.0212F, 0.0324F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 9.8702F, -4.9541F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 93).addBox(0.0F, 4.8788F, -0.9676F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.3959F, -2.72F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 72).addBox(0.0F, -7.0026F, -0.0604F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.1973F, -3.5292F, -0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -0.5026F, -1.0104F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(78, 103).addBox(0.0F, -3.8F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 17.928F, -3.9838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(22, 56).addBox(-1.0F, -0.8F, -0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8944F, -5.4202F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 31).addBox(-1.0F, -0.234F, -1.0486F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.6327F, -5.3054F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 75).addBox(-1.0F, -0.7638F, -1.0592F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.6327F, -5.3054F, -0.4538F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.2727F, -6.2451F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(66, 80).addBox(-0.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(100, 58).addBox(-0.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 19).addBox(-0.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(102, 33).addBox(-0.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(33, 85).addBox(0.9F, -0.1589F, 0.2196F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(29, 71).addBox(-1.3F, -5.8F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(22, 61).addBox(-0.5F, -1.1F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, 13.9543F, -1.6789F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(77, 49).addBox(-1.3F, -0.075F, -0.125F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 7.6945F, -1.1038F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 69).addBox(-1.3F, -0.1F, -0.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.4582F, 1.4642F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 89).addBox(0.9F, -5.0561F, -0.968F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.4F, 10.516F, -1.6751F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 10).addBox(0.9F, -0.0561F, 0.032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 10.4463F, -2.6727F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 91).addBox(0.9F, 0.0439F, 0.032F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 5.3587F, -2.3169F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(53, 89).addBox(0.9F, -0.7561F, -0.468F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(57, 43).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2974F, 16.2918F, -2.9897F, -1.2673F, 0.1549F, -0.0526F));

		PartDefinition cube_r52 = rightLeg3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(7, 86).addBox(0.0F, -2.1185F, -1.9027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 0.2937F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 66).addBox(0.0017F, 0.2358F, -0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.3276F, -0.6858F, 0.2821F, -0.2164F, 0.0283F, -0.2649F));

		PartDefinition cube_r54 = rightLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(83, 70).addBox(-2.0453F, 0.2659F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 8).addBox(-1.4F, -0.6629F, -6.1394F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.2749F, 0.0205F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 8).addBox(-0.7F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8F, -0.1629F, -3.0144F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -3.6144F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, 2.0328F, 1.4434F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(65, 28).addBox(-2.9F, -0.5F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2503F, -4.1492F, -4.7279F, -2.2812F, 0.7854F, -1.9615F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(98, 71).addBox(-0.2F, -0.5F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9388F, -4.4077F, -5.3184F, -0.9942F, 0.877F, -0.3766F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(13, 38).addBox(-1.3578F, -0.5024F, -3.2404F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -0.6042F, 0.3377F, 0.2672F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 38).addBox(-0.972F, -0.2819F, -3.2721F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -0.7983F, -0.6264F, 0.7708F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 57).addBox(-1.9F, -0.5F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6947F, -1.7453F, -3.8163F, -1.2986F, -0.9243F, 1.4637F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 33).addBox(-0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7862F, -1.5041F, -3.8348F, -2.3529F, -0.6319F, 2.822F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(46, 52).addBox(-0.7069F, -0.3331F, -3.168F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -0.6608F, -0.063F, 0.3866F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(30, 35).addBox(-7.0579F, -0.4703F, -0.3709F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -2.0142F, 0.9882F, -1.5216F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(13, 35).addBox(-7.106F, -0.4703F, 0.4365F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -2.0142F, 0.9882F, -1.5216F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 0).addBox(-6.8442F, -0.4703F, -1.4176F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, -2.7721F, -4.1593F, -2.1749F, 0.9225F, -1.7181F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(100, 79).addBox(-1.1874F, -0.5128F, -0.4266F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0754F, 1.6621F, 3.1955F, -0.4582F, 0.6883F, 0.4467F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(36, 10).addBox(-0.2728F, -0.5128F, -1.2856F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0754F, 1.6621F, 3.1955F, -1.9833F, 1.1506F, -1.2609F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(100, 67).addBox(-1.6844F, -0.5128F, -1.305F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0754F, 1.6621F, 3.1955F, -2.577F, 0.8783F, -1.9377F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(39, 43).addBox(-3.3169F, -0.5128F, 0.1557F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0754F, 1.6621F, 3.1955F, -1.4524F, 1.2196F, -0.6945F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(98, 75).addBox(-1.1516F, -0.4067F, -0.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0717F, 3.856F, 5.4039F, 0.573F, -0.2111F, -0.8052F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(29, 76).addBox(-0.2268F, -0.4067F, -0.7978F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0717F, 3.856F, 5.4039F, 0.588F, -0.2987F, -0.8646F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 14).addBox(-0.1205F, -0.4946F, 0.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7164F, 3.7134F, 4.3015F, -3.1416F, -0.9599F, 2.2689F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 95).addBox(-0.2686F, -0.4946F, -1.6418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7164F, 3.7134F, 4.3015F, 3.1416F, -1.4835F, 2.2689F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(102, 18).addBox(-1.9243F, -0.4946F, -0.9737F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7164F, 3.7134F, 4.3015F, -3.1416F, -0.48F, 2.2689F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 31).addBox(-2.7F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2334F, 2.5296F, 3.8922F, 0.0F, -1.5708F, -0.7418F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(109, 35).addBox(-0.1F, -0.5F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8135F, 3.4889F, 2.614F, 0.0F, -0.8378F, -0.7418F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 82).addBox(-0.525F, -2.95F, -0.85F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(20, 95).addBox(-0.525F, -1.75F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.34F, 1.5353F, -0.2495F, 0.5314F, 0.1531F, 0.5032F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(33, 58).addBox(-0.575F, -4.3767F, -1.9945F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 4.5294F, 1.9437F, -0.0602F, 0.0505F, 0.6966F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.8281F, 2.0328F, 1.4434F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-1.1F, -0.5F, -0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2503F, -4.1492F, -4.7279F, -2.2812F, -0.7854F, 1.9615F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 71).mirror().addBox(-0.8F, -0.5F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9388F, -4.4077F, -5.3184F, -0.9942F, -0.877F, 0.3766F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(13, 38).mirror().addBox(-0.6422F, -0.5024F, -3.2404F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -0.6042F, -0.3377F, -0.2672F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-1.028F, -0.2819F, -3.2721F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -0.7983F, 0.6264F, -0.7708F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 57).mirror().addBox(-0.1F, -0.5F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6947F, -1.7453F, -3.8163F, -1.2986F, 0.9243F, -1.4637F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-2.9F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7862F, -1.5041F, -3.8348F, -2.3529F, 0.6319F, -2.822F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-1.2931F, -0.3331F, -3.168F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -0.6608F, 0.063F, -0.3866F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(30, 35).mirror().addBox(0.0579F, -0.4703F, -0.3709F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -2.0142F, -0.9882F, 1.5216F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(13, 35).mirror().addBox(0.106F, -0.4703F, 0.4365F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -2.0142F, -0.9882F, 1.5216F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.1558F, -0.4703F, -1.4176F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, -2.7721F, -4.1593F, -2.1749F, -0.9225F, 1.7181F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-0.8126F, -0.5128F, -0.4266F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 1.6621F, 3.1955F, -0.4582F, -0.6883F, -0.4467F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-4.7272F, -0.5128F, -1.2856F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 1.6621F, 3.1955F, -1.9833F, -1.1506F, 1.2609F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-0.3156F, -0.5128F, -1.305F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 1.6621F, 3.1955F, -2.577F, -0.8783F, 1.9377F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(39, 43).mirror().addBox(-2.6831F, -0.5128F, 0.1557F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 1.6621F, 3.1955F, -1.4524F, -1.2196F, 0.6945F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(0.1516F, -0.4067F, -0.817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.0717F, 3.856F, 5.4039F, 0.573F, 0.2111F, 0.8052F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-1.7732F, -0.4067F, -0.7978F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0717F, 3.856F, 5.4039F, 0.588F, 0.2987F, 0.8646F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(95, 14).mirror().addBox(-0.8795F, -0.4946F, 0.0141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7164F, 3.7134F, 4.3015F, -3.1416F, 0.9599F, -2.2689F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-0.7314F, -0.4946F, -1.6418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7164F, 3.7134F, 4.3015F, 3.1416F, 1.4835F, -2.2689F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(102, 18).mirror().addBox(-0.0757F, -0.4946F, -0.9737F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7164F, 3.7134F, 4.3015F, -3.1416F, 0.48F, -2.2689F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-0.3F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2334F, 2.5296F, 3.8922F, 0.0F, 1.5708F, 0.7418F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(109, 35).mirror().addBox(-0.9F, -0.5F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 3.4889F, 2.614F, 0.0F, 0.8378F, 0.7418F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 71).mirror().addBox(-0.5F, -0.9517F, -3.0528F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 5.1672F, 6.6566F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(53, 82).mirror().addBox(-0.475F, -2.95F, -0.85F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(20, 95).mirror().addBox(-0.475F, -1.75F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.34F, 1.5353F, -0.2495F, 0.5314F, -0.1531F, -0.5032F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-0.425F, -4.3767F, -1.9945F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 4.5294F, 1.9437F, -0.0602F, -0.0505F, -0.6966F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 96).mirror().addBox(-0.5F, 0.0233F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 4.5294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 5.9234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, -0.2267F, -0.0871F, -0.0046F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(61, 107).addBox(0.0F, -2.8751F, -0.317F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(94, 108).addBox(0.0F, -3.193F, -0.0538F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.6F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-3.7148F, -2.3643F, -0.7898F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.8441F, -5.0417F, -0.1559F, 0.3023F, -1.4848F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 103).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.8441F, -5.0417F, 0.0063F, 0.339F, -0.98F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(104, 91).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.8441F, -5.0417F, 0.1549F, 0.2661F, -0.4745F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-5.0904F, -4.2742F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -1.2441F, -7.0417F, -0.2779F, 0.1969F, -1.7417F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(39, 106).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -1.2441F, -7.0417F, -0.1559F, 0.3023F, -1.2579F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 56).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -1.2441F, -7.0417F, 0.0063F, 0.339F, -0.7531F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(106, 28).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -1.2441F, -7.0417F, 0.1549F, 0.2661F, -0.2476F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.3198F, -2.8726F, 0.076F, -1.8398F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(63, 88).mirror().addBox(0.5189F, -0.2319F, -0.0351F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, -0.1342F, -1.8505F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(45, 110).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.3198F, -2.8726F, -0.076F, 1.8398F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(63, 88).addBox(-0.5189F, -0.2319F, -0.0351F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, 0.1342F, 1.8505F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(104, 91).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.8441F, -5.0417F, 0.1549F, -0.2661F, 0.4745F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(88, 103).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.8441F, -5.0417F, 0.0063F, -0.339F, 0.98F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(78, 15).addBox(2.7148F, -2.3643F, -0.7898F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.8441F, -5.0417F, -0.1559F, -0.3023F, 1.4848F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(106, 28).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -1.2441F, -7.0417F, 0.1549F, -0.2661F, 0.2476F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(103, 56).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -1.2441F, -7.0417F, 0.0063F, -0.339F, 0.7531F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(39, 106).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -1.2441F, -7.0417F, -0.1559F, -0.3023F, 1.2579F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(106, 48).addBox(3.0904F, -4.2742F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -1.2441F, -7.0417F, -0.2779F, -0.1969F, 1.7417F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 110).addBox(0.0F, -3.0111F, 0.1307F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -7.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(32, 110).addBox(0.0F, -2.9451F, 0.0058F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.7F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5F, -0.9597F, -6.0394F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(96, 54).addBox(-0.5F, 0.1F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2732F, -7.8768F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 11.2162F, -6.8021F, -0.0616F, -0.1307F, 0.008F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.3F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(107, 38).addBox(0.0F, -3.4769F, -0.628F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(-7.0904F, -4.2742F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.0291F, -1.1649F, -0.2667F, 0.4585F, -1.5287F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.0291F, -1.1649F, -0.0061F, 0.5256F, -0.9877F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.0291F, -1.1649F, 0.2566F, 0.464F, -0.4452F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.0291F, -1.1649F, 0.4263F, 0.2667F, 0.0337F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(106, 26).mirror().addBox(-1.7423F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -3.0649F, 0.372F, 0.2681F, 0.0193F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(104, 93).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -3.0649F, 0.2044F, 0.4409F, -0.468F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -3.0649F, -0.0386F, 0.4817F, -1.0034F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(36, 14).mirror().addBox(-8.0904F, -4.2742F, -0.7898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -3.0649F, -0.2691F, 0.4062F, -1.5297F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(105, 74).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.0291F, -1.1649F, 0.4263F, -0.2667F, -0.0337F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(104, 89).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.0291F, -1.1649F, 0.2566F, -0.464F, 0.4452F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(105, 76).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.0291F, -1.1649F, -0.0061F, -0.5256F, 0.9877F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 5).addBox(3.0904F, -4.2742F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.0291F, -1.1649F, -0.2667F, -0.4585F, 1.5287F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(36, 14).addBox(3.0904F, -4.2742F, -0.7898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -3.0649F, -0.2691F, -0.4062F, 1.5297F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(22, 106).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -3.0649F, -0.0386F, -0.4817F, 1.0034F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(104, 93).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -3.0649F, 0.2044F, -0.4409F, 0.468F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(106, 26).addBox(-0.2577F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -3.0649F, 0.372F, -0.2681F, -0.0193F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(25, 108).addBox(0.0F, -2.9938F, 0.054F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -4.8F, 0.004F, -0.1084F, -0.0735F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(24, 50).addBox(-0.5F, -0.0978F, -4.0739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(109, 16).addBox(0.0F, -2.9507F, -0.2782F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.7F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(-1.7423F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -0.0649F, 0.3539F, 0.2684F, 0.0146F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -0.0649F, 0.1872F, 0.4329F, -0.4753F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -0.0649F, -0.0491F, 0.4669F, -1.0082F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(49, 20).mirror().addBox(-9.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.4291F, -0.0649F, -0.2699F, 0.3888F, -1.53F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(-1.7423F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.2291F, -2.0649F, 0.3992F, 0.2675F, 0.0265F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(104, 85).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.2291F, -2.0649F, 0.2304F, 0.4525F, -0.4568F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.2291F, -2.0649F, -0.0226F, 0.5037F, -0.9958F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-9.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.2291F, -2.0649F, -0.268F, 0.4323F, -1.5292F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(49, 20).addBox(3.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -0.0649F, -0.2699F, -0.3888F, 1.53F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(105, 70).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -0.0649F, -0.0491F, -0.4669F, 1.0082F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(104, 87).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -0.0649F, 0.1872F, -0.4329F, 0.4753F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(105, 72).addBox(-0.2577F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.4291F, -0.0649F, 0.3539F, -0.2684F, -0.0146F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(47, 35).addBox(3.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.2291F, -2.0649F, -0.268F, -0.4323F, 1.5292F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(104, 99).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.2291F, -2.0649F, -0.0226F, -0.5037F, 0.9958F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(104, 85).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.2291F, -2.0649F, 0.2304F, -0.4525F, 0.4568F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(51, 105).addBox(-0.2577F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.2291F, -2.0649F, 0.3992F, -0.2675F, -0.0265F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(97, 108).addBox(0.0F, -3.0033F, -0.1405F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.62F, -3.6946F, 0.1327F, -0.0723F, -0.0489F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-11.4F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3097F, 9.5866F, 1.3928F, 0.5343F, 0.9887F, 0.8084F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 16).mirror().addBox(-9.2F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3097F, 9.5866F, 1.3928F, 0.3719F, 0.917F, 0.6143F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-7.6F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3097F, 9.5866F, 1.3928F, 0.1815F, 0.866F, 0.3906F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-6.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3097F, 9.5866F, 1.3928F, 0.1551F, 0.6451F, 0.3513F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3097F, 9.5866F, 1.3928F, 0.1051F, 0.3737F, 0.2608F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-5.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.367F, 9.2501F, -0.5107F, 0.1038F, 0.3389F, 0.2569F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(-3.9F, 0.1F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8434F, 8.3691F, -2.0492F, 0.0679F, 0.381F, 0.1671F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(93, 84).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.0695F, -3.1698F, 0.1545F, 0.2208F, 0.3572F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(45, 27).mirror().addBox(-0.5F, -0.75F, -2.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2624F, -1.0789F, 0.5709F, -0.4511F, 0.7109F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(36, 3).mirror().addBox(-0.7092F, -0.4515F, 0.3436F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.5447F, -0.4511F, 0.7109F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-7.0904F, -4.2742F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.3092F, -3.9703F, -0.2773F, 0.3538F, -1.6371F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(95, 106).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.3092F, -3.9703F, -0.075F, 0.4399F, -1.1241F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.3092F, -3.9703F, 0.1502F, 0.4214F, -0.5951F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(106, 50).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.3092F, -3.9703F, 0.3175F, 0.2742F, -0.0997F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(-8.0904F, -4.2742F, -0.7898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.7092F, -2.0702F, -0.2736F, 0.3016F, -1.5312F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.7092F, -2.0702F, -0.0995F, 0.3926F, -1.0292F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.7092F, -2.0702F, 0.1033F, 0.3917F, -0.509F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 105).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.7092F, -2.0702F, 0.2634F, 0.2686F, -0.0095F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(104, 97).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.1092F, -0.1703F, -0.0995F, 0.3926F, -1.0292F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-1.2703F, -0.5916F, 0.4604F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.9277F, -0.0719F, 0.451F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(93, 63).mirror().addBox(-0.7092F, 1.1671F, 1.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 1.6966F, -0.4511F, 0.7109F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(11, 62).mirror().addBox(-0.7092F, -2.3057F, 3.0478F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.7454F, -0.4511F, 0.7109F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(-0.7092F, -0.9078F, 3.6201F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.9636F, -0.4511F, 0.7109F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(49, 3).mirror().addBox(-0.7092F, -0.595F, 0.4239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.9462F, -0.4511F, 0.7109F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(104, 95).mirror().addBox(-1.7423F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.1092F, -0.1703F, 0.2634F, 0.2686F, -0.0095F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.1092F, -0.1703F, 0.1033F, 0.3917F, -0.509F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-9.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.1092F, -0.1703F, -0.2736F, 0.3016F, -1.5312F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.7092F, -0.5253F, 0.6847F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.7542F, -0.4511F, 0.7109F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-0.7092F, -2.503F, 3.0103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.1084F, -0.4511F, 0.7109F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(24, 44).mirror().addBox(-0.7092F, -2.3293F, 3.3068F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 4.2138F, -5.2221F, 0.2655F, -0.4511F, 0.7109F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-3.4716F, -0.3079F, -0.5555F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9805F, -5.0744F, -0.6876F, 0.0556F, 0.56F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(34, 18).addBox(0.2703F, -0.5916F, 0.4604F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.9277F, 0.0719F, -0.451F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(93, 63).addBox(-0.2908F, 1.1671F, 1.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 1.6966F, 0.4511F, -0.7109F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(11, 62).addBox(-0.2908F, -2.3057F, 3.0478F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.7454F, 0.4511F, -0.7109F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(13, 44).addBox(-0.2908F, -0.9078F, 3.6201F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.9636F, 0.4511F, -0.7109F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(49, 3).addBox(-0.2908F, -0.595F, 0.4239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.9462F, 0.4511F, -0.7109F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(106, 50).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.3092F, -3.9703F, 0.3175F, -0.2742F, 0.0997F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(75, 63).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.3092F, -3.9703F, 0.1502F, -0.4214F, 0.5951F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(95, 106).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.3092F, -3.9703F, -0.075F, -0.4399F, 1.1241F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(73, 17).addBox(3.0904F, -4.2742F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.3092F, -3.9703F, -0.2773F, -0.3538F, 1.6371F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(88, 105).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.7092F, -2.0702F, 0.2634F, -0.2686F, 0.0095F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(73, 35).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.7092F, -2.0702F, 0.1033F, -0.3917F, 0.509F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(15, 106).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.7092F, -2.0702F, -0.0995F, -0.3926F, 1.0292F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 17).addBox(3.0904F, -4.2742F, -0.7898F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.7092F, -2.0702F, -0.2736F, -0.3016F, 1.5312F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 95).addBox(-0.2577F, -0.0145F, -0.7382F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.1092F, -0.1703F, 0.2634F, -0.2686F, 0.0095F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(39, 104).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.1092F, -0.1703F, 0.1033F, -0.3917F, 0.509F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(104, 97).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.1092F, -0.1703F, -0.0995F, -0.3926F, 1.0292F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(45, 33).addBox(3.0904F, -4.2742F, -0.7898F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.1092F, -0.1703F, -0.2736F, -0.3016F, 1.5312F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 18).addBox(-0.2908F, -0.5253F, 0.6847F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.7542F, 0.4511F, -0.7109F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(36, 3).addBox(-0.2908F, -0.4515F, 0.3436F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.5447F, 0.4511F, -0.7109F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 14).addBox(-0.2908F, -2.503F, 3.0103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.1084F, 0.4511F, -0.7109F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(45, 27).addBox(-0.5F, -0.75F, -2.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3027F, 0.2624F, -1.0789F, 0.5709F, 0.4511F, -0.7109F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(24, 44).addBox(-0.2908F, -2.3293F, 3.3068F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.75F, 4.2138F, -5.2221F, 0.2655F, 0.4511F, -0.7109F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 11).addBox(0.4716F, -0.3079F, -0.5555F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9805F, -5.0744F, -0.6876F, -0.0556F, -0.56F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 62).addBox(-1.5F, -0.7078F, -0.1888F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9805F, -5.0744F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 16).addBox(0.4F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3097F, 9.5866F, 1.3928F, 0.5343F, -0.9887F, -0.8084F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(25, 16).addBox(0.2F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3097F, 9.5866F, 1.3928F, 0.3719F, -0.917F, -0.6143F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(34, 25).addBox(-0.4F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3097F, 9.5866F, 1.3928F, 0.1815F, -0.866F, -0.3906F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(51, 9).addBox(0.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3097F, 9.5866F, 1.3928F, 0.1551F, -0.6451F, -0.3513F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 22).addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3097F, 9.5866F, 1.3928F, 0.1051F, -0.3737F, -0.2608F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(56, 31).addBox(0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.367F, 9.2501F, -0.5107F, 0.1038F, -0.3389F, -0.2569F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(68, 57).addBox(-0.1F, 0.1F, -0.6F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8434F, 8.3691F, -2.0492F, 0.0679F, -0.381F, -0.1671F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(93, 84).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0695F, -3.1698F, 0.1545F, -0.2208F, -0.3572F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -0.898F, -0.1248F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2805F, -3.6744F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(42, 108).addBox(0.0F, -2.6126F, -0.1779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -4.7F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 106).addBox(0.0F, -3.3476F, 0.0375F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(109, 30).addBox(0.0F, -3.2815F, 0.0453F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.989F, -0.0323F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2006F, 5.2924F, -4.1018F, 0.0604F, -0.0076F, -0.0003F));

		PartDefinition cube_r236 = leftarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(35, 52).addBox(0.0F, -1.6F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0118F, -0.1534F, 0.4938F, 0.8726F, 0.0014F, -0.001F));

		PartDefinition cube_r237 = leftarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 47).addBox(-1.5F, 4.8F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.7652F, 6.0222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftarm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(5, 63).addBox(0.0F, -0.0373F, -1.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5035F, 1.4685F, 2.1771F, 0.7595F, -0.003F, -0.0001F));

		PartDefinition cube_r239 = leftarm.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(68, 93).addBox(-1.5F, -1.0F, -0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4757F, 10.9671F, 9.3773F, 0.489F, -0.003F, -0.0001F));

		PartDefinition cube_r240 = leftarm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(95, 10).addBox(-1.0F, 0.1626F, -1.0956F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0249F, 9.4425F, 9.5107F, 0.6199F, -0.003F, -0.0001F));

		PartDefinition cube_r241 = leftarm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(95, 4).addBox(0.0F, 0.1627F, -0.6956F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(94, 26).addBox(0.0F, 0.1627F, -1.0956F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5164F, 6.6614F, 6.608F, 0.7071F, -0.003F, -0.0001F));

		PartDefinition cube_r242 = leftarm.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(51, 62).addBox(0.0F, -0.0373F, -0.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.61F, 1.056F, 0.7944F, -0.003F, -0.0001F));

		PartDefinition cube_r243 = leftarm.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(97, 98).addBox(-0.5F, -1.8F, -0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1681F, 1.3916F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftarm.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(86, 23).addBox(-0.5F, -2.0F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, 1.1681F, 1.3916F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftarm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(100, 4).addBox(-0.5F, -1.0F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.508F, 0.8971F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.645F, 12.5898F, 10.5901F, 0.0083F, 0.0662F, 0.2052F));

		PartDefinition cube_r246 = leftarm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(14, 81).addBox(-0.4164F, -0.6432F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(38, 79).addBox(-0.4164F, -0.6432F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, 1.5708F, -1.3788F, -1.5359F));

		PartDefinition cube_r247 = leftarm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(72, 86).addBox(-1.1344F, -0.3443F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(58, 88).addBox(-1.1344F, -0.3443F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, 1.5708F, -1.2392F, -1.5359F));

		PartDefinition cube_r248 = leftarm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(97, 32).addBox(3.5005F, 13.3103F, -0.3291F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 71).addBox(3.5005F, 13.3103F, -0.629F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, -1.5708F, -1.3177F, 1.6057F));

		PartDefinition cube_r249 = leftarm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 69).addBox(2.3147F, 8.6515F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(77, 88).addBox(2.3147F, 8.6515F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, -1.5708F, -1.405F, 1.6057F));

		PartDefinition cube_r250 = leftarm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(48, 82).addBox(-0.0116F, 4.218F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(67, 85).addBox(-0.0116F, 4.218F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, 1.5708F, -1.4748F, -1.5359F));

		PartDefinition cube_r251 = leftarm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(107, 13).addBox(-0.0974F, -0.3657F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, 1.5708F, -1.3439F, -1.6581F));

		PartDefinition cube_r252 = leftarm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(63, 98).addBox(-5.2568F, 12.8401F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, 1.5708F, -1.213F, -1.6581F));

		PartDefinition cube_r253 = leftarm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(68, 101).addBox(-3.5308F, 10.4142F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, 1.5708F, -1.3439F, -1.6581F));

		PartDefinition cube_r254 = leftarm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(58, 101).addBox(-1.179F, 7.9411F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, 1.5708F, -1.5621F, -1.6581F));

		PartDefinition cube_r255 = leftarm2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(24, 72).addBox(0.5959F, 2.0183F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, -1.5708F, -1.3614F, 1.4835F));

		PartDefinition cube_r256 = leftarm2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(29, 103).addBox(-0.0212F, 0.4628F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2064F, 0.7022F, -1.2457F, 1.5708F, -1.5097F, -1.6581F));

		PartDefinition cube_r257 = leftarm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(82, 95).addBox(-0.8389F, -1.1818F, -0.4463F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7773F, -0.5534F, 0.4411F, 1.5708F, -0.8116F, -1.5359F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 17.4106F, -0.0101F, 0.5154F, -0.0025F, -0.0292F));

		PartDefinition cube_r258 = leftArm3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 0).addBox(-0.637F, -0.0108F, 0.0701F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3381F, 0.0886F, -0.2467F));

		PartDefinition cube_r259 = leftArm3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(14, 88).addBox(-1.6031F, -0.0189F, 0.0701F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3478F, 0.0298F, -0.082F));

		PartDefinition cube_r260 = leftArm3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(19, 101).addBox(0.9514F, 0.1773F, -0.5299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r261 = leftArm3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(83, 12).addBox(-0.4986F, -0.0227F, -0.5299F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thumb = leftArm3.addOrReplaceChild("thumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.2F, 0.0F, 0.9048F, -0.6333F, -0.2064F));

		PartDefinition cube_r262 = thumb.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(96, 102).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition thumb2 = thumb.addOrReplaceChild("thumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.075F, 1.7008F, -0.5174F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition cube_r263 = thumb2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(101, 102).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6F, 1.2F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.013F, 5.4136F, 0.757F, -0.1284F, -0.0393F, -0.1249F));

		PartDefinition cube_r264 = leftArm4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 81).addBox(-1.3F, -1.6F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9339F, 1.5658F, 0.0617F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r265 = leftArm4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(24, 80).addBox(0.0013F, -0.0214F, -0.529F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(35, 46).addBox(-0.1987F, -0.0637F, -0.4384F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0916F, 2.9999F, 0.1777F, 1.486F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2006F, 5.2924F, -4.1018F, -0.3687F, -0.07F, -0.1191F));

		PartDefinition cube_r266 = rightarm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(52, 37).addBox(-2.0F, -1.6F, -1.6F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0118F, -0.1534F, 0.4938F, 0.8726F, -0.0014F, 0.001F));

		PartDefinition cube_r267 = rightarm.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, 4.8F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.7652F, 6.0222F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightarm.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 19).addBox(-1.0F, -0.0373F, -1.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5035F, 1.4685F, 2.1771F, 0.7595F, 0.003F, 0.0001F));

		PartDefinition cube_r269 = rightarm.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 80).addBox(-0.5F, -1.0F, -0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4757F, 10.9671F, 9.3773F, 0.489F, 0.003F, 0.0001F));

		PartDefinition cube_r270 = rightarm.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(95, 18).addBox(-1.0F, 0.1626F, -1.0956F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0249F, 9.4425F, 9.5107F, 0.6199F, 0.003F, 0.0001F));

		PartDefinition cube_r271 = rightarm.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(58, 95).addBox(-1.0F, 0.1627F, -0.6956F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(94, 48).addBox(-1.0F, 0.1627F, -1.0956F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5164F, 6.6614F, 6.608F, 0.7071F, 0.003F, 0.0001F));

		PartDefinition cube_r272 = rightarm.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -0.0373F, -0.0956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.61F, 1.056F, 0.7944F, 0.003F, 0.0001F));

		PartDefinition cube_r273 = rightarm.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(5, 99).addBox(-1.5F, -1.8F, -0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.1681F, 1.3916F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightarm.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 43).addBox(-1.5F, -2.0F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 1.1681F, 1.3916F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightarm.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(100, 22).addBox(-1.5F, -1.0F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.508F, 0.8971F, 0.6021F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.645F, 12.5898F, 10.5901F, 0.04F, 0.1504F, -0.2434F));

		PartDefinition cube_r276 = rightarm2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 81).addBox(-0.5836F, -0.6432F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(73, 79).addBox(-0.5836F, -0.6432F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, 1.5708F, 1.3788F, 1.5359F));

		PartDefinition cube_r277 = rightarm2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(21, 88).addBox(0.1344F, -0.3443F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(88, 62).addBox(0.1344F, -0.3443F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, 1.5708F, 1.2392F, 1.5359F));

		PartDefinition cube_r278 = rightarm2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 98).addBox(-4.5005F, 13.3103F, -0.3291F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 93).addBox(-4.5005F, 13.3103F, -0.629F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, -1.5708F, 1.3177F, -1.6057F));

		PartDefinition cube_r279 = rightarm2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 88).addBox(-3.3146F, 8.6515F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(88, 80).addBox(-3.3146F, 8.6515F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, -1.5708F, 1.405F, -1.6057F));

		PartDefinition cube_r280 = rightarm2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(83, 5).addBox(-0.9884F, 4.218F, -0.629F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(38, 86).addBox(-0.9884F, 4.218F, -0.3291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, 1.5708F, 1.4748F, 1.5359F));

		PartDefinition cube_r281 = rightarm2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(107, 21).addBox(-0.9026F, -0.3657F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, 1.5708F, 1.3439F, 1.6581F));

		PartDefinition cube_r282 = rightarm2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(53, 100).addBox(4.2568F, 12.8401F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, 1.5708F, 1.213F, 1.6581F));

		PartDefinition cube_r283 = rightarm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(102, 13).addBox(2.5308F, 10.4142F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, 1.5708F, 1.3439F, 1.6581F));

		PartDefinition cube_r284 = rightarm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 8).addBox(0.179F, 7.9411F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, 1.5708F, 1.5621F, 1.6581F));

		PartDefinition cube_r285 = rightarm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(73, 71).addBox(-1.5959F, 2.0183F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, -1.5708F, 1.3614F, -1.4835F));

		PartDefinition cube_r286 = rightarm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(34, 103).addBox(-0.9788F, 0.4628F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2064F, 0.7022F, -1.2457F, 1.5708F, 1.5097F, 1.6581F));

		PartDefinition cube_r287 = rightarm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(43, 96).addBox(-1.1611F, -1.1818F, -0.4463F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7773F, -0.5534F, 0.4411F, 1.5708F, 0.8116F, 1.5359F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 17.4106F, -0.0101F, 0.369F, 0.1102F, -0.2569F));

		PartDefinition cube_r288 = rightArm3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(88, 5).addBox(-1.363F, -0.0108F, 0.0701F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3381F, -0.0886F, 0.2467F));

		PartDefinition cube_r289 = rightArm3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 17).addBox(-0.3969F, -0.0189F, 0.0701F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3478F, -0.0298F, 0.082F));

		PartDefinition cube_r290 = rightArm3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(24, 101).addBox(-1.9514F, 0.1773F, -0.5299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r291 = rightArm3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 86).addBox(-1.5014F, -0.0227F, -0.5299F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thumb3 = rightArm3.addOrReplaceChild("thumb3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.2F, 0.0F, 0.9048F, 0.6333F, 0.2064F));

		PartDefinition cube_r292 = thumb3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition thumb4 = thumb3.addOrReplaceChild("thumb4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.075F, 1.7008F, -0.5174F, 0.0832F, -0.0262F, 0.3043F));

		PartDefinition cube_r293 = thumb4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(10, 103).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, 1.2F, 0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.013F, 5.4136F, 0.757F, -0.2157F, 0.0393F, 0.1249F));

		PartDefinition cube_r294 = rightArm4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(7, 81).addBox(-0.7F, -1.6F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.9339F, 1.5658F, 0.0617F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r295 = rightArm4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(31, 80).addBox(-2.0013F, -0.0214F, -0.529F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0436F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(46, 46).addBox(-3.8013F, -0.0637F, -0.4384F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0916F, 2.9999F, 0.1777F, 1.3551F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9358F, -5.6142F, 0.8921F, -0.1837F, -0.0204F));

		PartDefinition cube_r296 = neck3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(29, 107).addBox(0.0F, -3.0342F, -0.7343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.414F, -0.0842F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r297 = neck3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(106, 103).mirror().addBox(-5.0904F, -4.2742F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.0017F, -0.181F, -0.0096F, -0.3878F, -1.8783F));

		PartDefinition cube_r298 = neck3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(-4.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.0017F, -0.181F, -0.1946F, -0.3377F, -1.3669F));

		PartDefinition cube_r299 = neck3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(102, 36).mirror().addBox(-3.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.0017F, -0.181F, -0.3278F, -0.2112F, -0.8852F));

		PartDefinition cube_r300 = neck3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(106, 101).mirror().addBox(-1.7423F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.0017F, -0.181F, -0.3992F, -0.0657F, -0.415F));

		PartDefinition cube_r301 = neck3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(106, 103).addBox(3.0904F, -4.2742F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.0017F, -0.181F, -0.0096F, 0.3878F, 1.8783F));

		PartDefinition cube_r302 = neck3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(102, 106).addBox(2.7148F, -2.3643F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.0017F, -0.181F, -0.1946F, 0.3377F, 1.3669F));

		PartDefinition cube_r303 = neck3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(102, 36).addBox(1.521F, -0.8269F, -0.7898F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.0017F, -0.181F, -0.3278F, 0.2112F, 0.8852F));

		PartDefinition cube_r304 = neck3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(106, 101).addBox(-0.2577F, -0.0145F, -0.7381F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, -0.0017F, -0.181F, -0.3992F, 0.0657F, 0.415F));

		PartDefinition cube_r305 = neck3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(107, 63).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5795F, -1.9173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5322F, -0.9458F, 0.6961F, -0.2068F, 0.1118F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 107).addBox(0.0F, -2.7681F, -0.0721F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(83, 107).addBox(0.0F, -3.0854F, -0.0704F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.7F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -2.6F, -0.2169F, -0.1071F, 0.1899F));

		PartDefinition cube_r309 = neck.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(89, 95).addBox(0.0F, -1.9684F, -0.1304F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.4F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(99, 26).addBox(-0.5F, -0.1681F, -2.0721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6601F, -1.1179F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(32, 99).addBox(-0.5F, -0.1681F, -2.0721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3249F, -1.2535F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 55).addBox(-1.0F, -1.1F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.6428F, -4.5231F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(39, 38).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.4002F, -4.6896F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -0.6638F, -0.7514F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4811F, -3.0344F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(58, 85).addBox(-1.0F, -1.6894F, -1.0607F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(85, 28).addBox(-1.0F, -0.9894F, -1.0607F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.5726F, -5.0153F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -0.9894F, -2.0857F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 3.2253F, -3.0457F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(76, 28).addBox(-1.0F, -0.5F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5F, 3.262F, -7.5655F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(87, 77).addBox(-1.0F, -0.7374F, -0.8687F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.3811F, -6.8344F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(88, 37).addBox(-1.0F, -1.003F, -0.1364F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.5495F, -6.8227F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(37, 108).addBox(0.0F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.7511F, -5.9225F, 1.7501F, -0.2266F, 0.2696F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(20, 108).addBox(-1.0F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.7511F, -5.9225F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(15, 108).addBox(-1.0F, -0.65F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.742F, -5.3917F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.742F, -5.3917F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2914F, -5.0793F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(89, 107).addBox(-1.0F, 0.0381F, 0.0539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.7579F, -5.8005F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(11, 57).addBox(-0.5F, 0.2381F, -0.3461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.5F, -6.5F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(72, 37).addBox(-0.5F, 0.4146F, -0.8098F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -5.1F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -0.0162F, -1.3635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -4.6F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(69, 13).addBox(-1.0F, -1.0F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5129F, 3.9753F, -8.1976F, -0.4393F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(53, 0).addBox(-0.6F, 0.2863F, -0.6525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.0461F, -7.2149F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(102, 82).addBox(0.0F, 0.3113F, 0.0475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.0461F, -7.2149F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(17, 18).addBox(-1.0F, -1.75F, -2.1F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.213F, -1.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(57, 50).addBox(-1.5F, 0.0F, -1.95F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.0F, -0.9829F, 2.1814F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(77, 45).addBox(-2.0F, -0.0022F, -0.0167F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9404F, 2.2076F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(10, 77).addBox(-2.0F, -0.0022F, -0.0167F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.8941F, 1.9069F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(88, 34).addBox(-2.0F, -0.1272F, 0.2833F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.8873F, 1.0588F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(24, 85).addBox(-2.0F, -0.0164F, 0.5408F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(84, 59).addBox(-2.0F, -0.0164F, -0.0092F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.1727F, -0.1691F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(60, 4).addBox(-2.0F, -0.0164F, -2.0092F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2945F, -1.1617F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 40).addBox(-2.0F, -0.0164F, -0.0092F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -4.2945F, -1.1617F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(11, 51).addBox(-2.0F, -0.064F, -2.0095F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6541F, -4.4956F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(56, 66).addBox(-2.0F, -0.064F, -1.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.5F, -3.3361F, -3.7642F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(66, 42).addBox(-2.0F, -0.114F, -0.6345F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.4254F, -3.1411F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3359F, 2.5361F, -9.8986F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(101, 0).addBox(-1.6894F, -0.5299F, -0.0369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5365F, -2.7088F, 8.5956F, 0.4201F, 0.6848F, 0.5034F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(32, 107).addBox(1.211F, -0.7828F, -0.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 64).addBox(-0.189F, -0.7828F, -0.8346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.1304F, -1.9614F, 7.7191F, 1.5515F, 1.0027F, 1.9208F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(100, 61).addBox(-0.2126F, -0.5095F, -0.8346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1811F, -2.6785F, 9.0356F, 1.1766F, 1.2365F, 1.5018F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(66, 60).addBox(-0.5F, -0.1776F, -1.9149F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.9866F, -1.5786F, 5.5002F, 0.4441F, 0.7756F, 0.4692F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(68, 97).addBox(-0.5F, -0.5118F, -1.0874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.9866F, -1.5786F, 5.5002F, 0.1387F, 0.7756F, 0.4692F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 44).addBox(-0.5F, -0.6895F, -1.3874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.9866F, -1.5786F, 5.5002F, -0.2977F, 0.7756F, 0.4692F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(107, 10).addBox(-0.5179F, -1.3135F, -0.5411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, 0.4917F, 0.7583F, 1.63F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(89, 99).addBox(-0.8911F, -0.066F, -1.8296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6733F, -0.4471F, 3.0412F, -3.0635F, 0.7585F, -1.5231F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(12, 99).addBox(-0.4345F, -0.6598F, -0.5647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0408F, 0.0613F, 3.2873F, -2.7214F, 1.2116F, -1.1807F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(83, 103).addBox(-1.2167F, 0.1418F, -2.1354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6733F, -0.4471F, 3.0412F, 3.0325F, 0.9695F, -1.604F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(93, 40).addBox(0.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3803F, -1.9109F, 5.2531F, -1.6205F, 1.4572F, 0.2164F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(60, 11).addBox(-0.2F, -0.2F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9696F, -3.2852F, 4.4795F, 0.6263F, 0.4874F, 2.565F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(93, 22).addBox(-0.475F, -0.975F, -0.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.066F, -2.4796F, 4.7595F, 2.526F, 1.446F, -0.3552F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(93, 22).addBox(-0.4196F, -1.1376F, -0.3099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, -1.1422F, 0.9755F, 1.4375F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(93, 22).addBox(-0.4477F, -1.1119F, -0.76F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, -0.2597F, 0.9116F, 1.6325F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(27, 94).addBox(-0.5F, -0.3F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(27, 94).addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2569F, -4.1647F, 4.1027F, 1.4612F, 1.0574F, 1.496F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(26, 93).addBox(-0.8273F, -1.1766F, -1.2485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, 1.4359F, 0.9053F, 1.8366F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 56).addBox(-0.5F, -0.45F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.6154F, -3.8146F, 3.7438F, 2.5063F, 0.8612F, 1.6833F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(90, 56).addBox(-0.5F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.6154F, -3.8146F, 3.7438F, 1.6773F, 0.8612F, 1.6833F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(89, 55).addBox(-0.4751F, -1.1766F, -1.2054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, 1.2377F, 0.8666F, 1.5812F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(103, 52).addBox(-0.7507F, -0.2918F, -0.8335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.3773F, 0.7553F, 3.1562F, 0.2069F, -0.0726F, -0.0571F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(68, 106).addBox(-0.7507F, -0.2599F, -0.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3773F, 0.7553F, 3.1562F, 0.076F, -0.0726F, -0.0571F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(107, 43).addBox(-0.7507F, 0.7569F, -1.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(107, 66).addBox(-0.7507F, 1.1569F, -1.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3773F, 0.7553F, 3.1562F, 0.6432F, -0.0726F, -0.0571F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(109, 105).addBox(-0.7507F, 0.9771F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.3773F, 0.7553F, 3.1562F, 0.2942F, -0.0726F, -0.0571F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(39, 100).addBox(0.025F, -0.0022F, 0.0333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1391F, -6.2903F, 11.2033F, -0.9114F, 0.3409F, 0.706F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -0.0164F, 0.5908F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(75, 99).addBox(0.0F, -0.0164F, -0.0092F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -6.7088F, 9.7295F, -0.2037F, 0.2173F, 0.8067F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(70, 19).addBox(0.0F, 0.0586F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4624F, -4.7146F, 11.2105F, -0.0619F, 0.2932F, 1.5982F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(65, 66).addBox(-0.7F, 0.0381F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3359F, -0.7605F, 3.4623F, 1.0278F, 0.1376F, 0.2234F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(97, 86).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0359F, -0.204F, 3.6198F, 0.6811F, 0.0339F, 0.0275F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(75, 59).addBox(-2.075F, -1.075F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8354F, -4.9897F, 6.3784F, 0.5342F, 0.6198F, -0.6283F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(75, 41).addBox(-2.075F, -1.075F, -1.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4478F, -4.2004F, 6.4225F, 0.0542F, 0.6198F, -0.6283F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(20, 67).addBox(-0.5F, -0.7F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -3.5449F, 6.0147F, 0.5926F, 0.3227F, 0.4146F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(97, 94).addBox(0.025F, -0.014F, -1.0345F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4846F, -4.7446F, 7.4977F, 0.0864F, -0.3623F, 1.7449F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(97, 90).addBox(-0.075F, -0.064F, -0.8345F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -6.0133F, 6.9507F, 0.3973F, -0.192F, 0.8117F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(69, 8).addBox(0.0F, -0.0164F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5153F, -5.4494F, 9.2534F, 0.1476F, -0.1906F, 1.5503F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(59, 71).addBox(0.0F, -0.0164F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -6.8306F, 8.737F, 0.2474F, -0.2612F, 0.7964F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(99, 48).addBox(0.0F, -0.0164F, -0.0092F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -6.8306F, 8.737F, -0.092F, 0.0475F, 0.829F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(93, 67).addBox(-1.655F, -0.5599F, -0.2313F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.4379F, 0.4336F, -0.0865F, 0.1314F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3359F, 2.5361F, -9.8986F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.3106F, -0.5299F, -0.0369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5365F, -2.7088F, 8.5956F, 0.4201F, -0.6848F, -0.5034F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(32, 107).mirror().addBox(-2.211F, -0.7828F, -0.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 64).mirror().addBox(-1.811F, -0.7828F, -0.8346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.1304F, -1.9614F, 7.7191F, 1.5515F, -1.0027F, -1.9208F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-1.7874F, -0.5095F, -0.8346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1811F, -2.6785F, 9.0356F, 1.1766F, -1.2365F, -1.5018F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-0.5F, -0.1776F, -1.9149F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.9866F, -1.5786F, 5.5002F, 0.4441F, -0.7756F, -0.4692F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(68, 97).mirror().addBox(-0.5F, -0.5118F, -1.0874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.9866F, -1.5786F, 5.5002F, 0.1387F, -0.7756F, -0.4692F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(-0.5F, -0.6895F, -1.3874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.9866F, -1.5786F, 5.5002F, -0.2977F, -0.7756F, -0.4692F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(107, 10).mirror().addBox(-0.4821F, -1.3135F, -0.5411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, 0.4917F, -0.7583F, -1.63F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(89, 99).mirror().addBox(-0.1089F, -0.066F, -1.8296F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6733F, -0.4471F, 3.0412F, -3.0635F, -0.7585F, 1.5231F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(12, 99).mirror().addBox(-0.5655F, -0.6598F, -0.5647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0408F, 0.0613F, 3.2873F, -2.7214F, -1.2116F, 1.1807F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(83, 103).mirror().addBox(0.2167F, 0.1418F, -2.1354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6733F, -0.4471F, 3.0412F, 3.0325F, -0.9695F, 1.604F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3803F, -1.9109F, 5.2531F, -1.6205F, -1.4572F, -0.2164F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(60, 11).mirror().addBox(-0.8F, -0.2F, -0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9696F, -3.2852F, 4.4795F, 0.6263F, -0.4874F, -2.565F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.525F, -0.975F, -0.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.066F, -2.4796F, 4.7595F, 2.526F, -1.446F, 0.3552F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.5804F, -1.1376F, -0.3099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, -1.1422F, -0.9755F, -1.4375F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-0.5523F, -1.1119F, -0.76F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, -0.2597F, -0.9116F, -1.6325F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(27, 94).mirror().addBox(-0.5F, -0.3F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(27, 94).mirror().addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2569F, -4.1647F, 4.1027F, 1.4612F, -1.0574F, -1.496F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(26, 93).mirror().addBox(-0.1727F, -1.1766F, -1.2485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, 1.4359F, -0.9053F, -1.8366F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.5F, -0.45F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.6154F, -3.8146F, 3.7438F, 2.5063F, -0.8612F, -1.6833F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.5F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.6154F, -3.8146F, 3.7438F, 1.6773F, -0.8612F, -1.6833F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-0.5249F, -1.1766F, -1.2054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, 1.2377F, -0.8666F, -1.5812F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.2493F, -0.2918F, -0.8335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, 0.7553F, 3.1562F, 0.2069F, 0.0726F, 0.0571F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(68, 106).mirror().addBox(-0.2493F, -0.2599F, -0.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, 0.7553F, 3.1562F, 0.076F, 0.0726F, 0.0571F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(107, 43).mirror().addBox(-0.2493F, 0.7569F, -1.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(107, 66).mirror().addBox(-0.2493F, 1.1569F, -1.3654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, 0.7553F, 3.1562F, 0.6432F, 0.0726F, 0.0571F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(109, 105).mirror().addBox(-0.2493F, 0.9771F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, 0.7553F, 3.1562F, 0.2942F, 0.0726F, 0.0571F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(39, 100).mirror().addBox(-2.025F, -0.0022F, 0.0333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1391F, -6.2903F, 11.2033F, -0.9114F, -0.3409F, -0.706F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-2.0F, -0.0164F, 0.5908F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(75, 99).mirror().addBox(-2.0F, -0.0164F, -0.0092F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.7088F, 9.7295F, -0.2037F, -0.2173F, -0.8067F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(-2.0F, 0.0586F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4624F, -4.7146F, 11.2105F, -0.0619F, -0.2932F, -1.5982F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-0.3F, 0.0381F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -0.7605F, 3.4623F, 1.0278F, -0.1376F, -0.2234F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(97, 86).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0359F, -0.204F, 3.6198F, 0.6811F, -0.0339F, -0.0275F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(0.075F, -1.075F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, -4.9897F, 6.3784F, 0.5342F, -0.6198F, 0.6283F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(0.075F, -1.075F, -1.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4478F, -4.2004F, 6.4225F, 0.0542F, -0.6198F, 0.6283F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-1.5F, -0.7F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -3.5449F, 6.0147F, 0.5926F, -0.3227F, -0.4146F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(97, 94).mirror().addBox(-2.025F, -0.014F, -1.0345F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4846F, -4.7446F, 7.4977F, 0.0864F, 0.3623F, -1.7449F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-1.925F, -0.064F, -0.8345F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.0133F, 6.9507F, 0.3973F, 0.192F, -0.8117F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-2.0F, -0.0164F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5153F, -5.4494F, 9.2534F, 0.1476F, 0.1906F, -1.5503F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-2.0F, -0.0164F, -2.0092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.8306F, 8.737F, 0.2474F, 0.2612F, -0.7964F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(99, 48).mirror().addBox(-2.0F, -0.0164F, -0.0092F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.8306F, 8.737F, -0.092F, -0.0475F, -0.829F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-0.345F, -0.5599F, -0.2313F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.4379F, 0.4336F, 0.0865F, -0.1314F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2355F, -0.4222F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(63, 103).mirror().addBox(-1.0F, -1.4658F, -0.1202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(63, 103).addBox(3.2F, -1.4658F, -0.1202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1F, 0.4434F, -2.8968F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(46, 103).mirror().addBox(-1.0F, -1.7649F, -0.7351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(46, 103).addBox(3.2F, -1.7649F, -0.7351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1F, 2.1434F, -2.7968F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(100, 108).mirror().addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(100, 108).addBox(0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 1.688F, -7.4499F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(105, 108).addBox(1.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.5F, 1.9218F, -6.6067F, 2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(108, 52).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(108, 52).addBox(0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 2.0522F, -7.9141F, 2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(40, 58).addBox(0.5F, -0.8F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 2.7439F, -7.9044F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(109, 81).mirror().addBox(-0.5064F, 0.0408F, -0.9551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(109, 81).addBox(1.4936F, 0.0408F, -0.9551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4936F, 4.2806F, -7.2131F, -2.3038F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(110, 38).mirror().addBox(-0.5064F, 0.7173F, -0.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(110, 38).addBox(0.4936F, 0.7173F, -0.0194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.9936F, 1.8586F, -6.4101F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(64, 107).mirror().addBox(-0.3064F, -1.8352F, -0.9607F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 107).addBox(2.2936F, -1.8352F, -0.9607F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4936F, 2.6586F, -6.1101F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5064F, -0.0073F, -0.9184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(0, 104).addBox(1.4936F, -0.0073F, -0.9184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4936F, 4.6286F, -5.3766F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-0.5064F, -0.1073F, -0.0184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 49).addBox(1.4936F, -0.1073F, -0.0184F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4936F, 2.3412F, -5.1155F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(54, 76).mirror().addBox(-1.0F, -0.9F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(54, 76).addBox(3.2F, -0.9F, -1.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.1F, 2.2704F, -1.9552F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-1.0F, -0.0175F, -1.0293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(107, 3).addBox(3.2F, -0.0175F, -1.0293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.1F, 3.7576F, -1.0391F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.5F, -0.1F, -0.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(81, 35).addBox(2.5F, -0.1F, -0.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0F, 3.4436F, -3.4796F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(93, 59).mirror().addBox(-0.5F, -0.7F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 59).addBox(2.5F, -0.7F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 3.4905F, -3.1833F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-1.0064F, -2.9579F, -0.5415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(79, 23).addBox(1.9936F, -2.9579F, -0.5415F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4936F, 2.6586F, -6.1101F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(10, 107).mirror().addBox(-0.5155F, -0.2345F, -0.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.3882F, 1.4503F, -7.966F, 0.0894F, -0.0367F, 2.8949F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(51, 107).mirror().addBox(-0.5155F, 0.1069F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 107).mirror().addBox(-0.5155F, -0.2931F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3882F, 1.4503F, -7.966F, 0.4385F, -0.0367F, 2.8949F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(73, 107).mirror().addBox(-0.5155F, -0.5213F, -0.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.3882F, 1.4503F, -7.966F, 0.0021F, -0.0367F, 2.8949F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(107, 7).mirror().addBox(-0.5155F, -0.4988F, -0.473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3882F, 1.4503F, -7.966F, -0.1288F, -0.0367F, 2.8949F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-0.6F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 107).addBox(3.8F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6F, 0.0397F, -1.1864F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(100, 38).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(100, 38).addBox(3.7F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6F, 0.5945F, -1.2215F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-1.0F, 0.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(47, 76).addBox(3.2F, 0.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1F, -0.2566F, -1.2968F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(10, 107).addBox(-0.4845F, -0.2345F, -0.5244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.3882F, 1.4503F, -7.966F, 0.0894F, 0.0367F, -2.8949F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(51, 107).addBox(-0.4845F, 0.1069F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 107).addBox(-0.4845F, -0.2931F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3882F, 1.4503F, -7.966F, 0.4385F, 0.0367F, -2.8949F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(100, 45).addBox(-1.0F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 42).addBox(-1.0F, -0.2F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5129F, 1.3334F, -8.7297F, 0.477F, 0.0F, 0.0F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(73, 107).addBox(-0.4845F, -0.5213F, -0.6811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.3882F, 1.4503F, -7.966F, 0.0021F, 0.0367F, -2.8949F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(107, 7).addBox(-0.4845F, -0.4988F, -0.473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3882F, 1.4503F, -7.966F, -0.1288F, 0.0367F, -2.8949F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(78, 107).addBox(-0.5F, -0.4538F, 0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.035F, 1.6057F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 97).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1644F, 1.119F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(107, 78).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3554F, 1.7511F, -0.3927F, 0.0F, 0.0F));

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