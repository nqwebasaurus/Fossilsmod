package fossils.fossils.client.blockentity.model.australopithecusafricanus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustralopithecusafricanusFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart thumb;
	private final ModelPart thumb2;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart thumb5;
	private final ModelPart thumb6;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public AustralopithecusafricanusFossilModel(ModelPart root) {
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
		this.bone4 = this.hips.getChild("bone4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.thumb = this.leftArm3.getChild("thumb");
		this.thumb2 = this.thumb.getChild("thumb2");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.thumb5 = this.rightArm3.getChild("thumb5");
		this.thumb6 = this.thumb5.getChild("thumb6");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.6863F, 4.3988F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 75).addBox(0.0F, -0.1937F, -1.4061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 62).addBox(0.0F, -0.7132F, -0.1343F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.2F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.7973F, 1.4482F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 36).addBox(-1.5F, -5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 59).addBox(-0.5F, 9.9365F, -3.0293F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 86).addBox(-0.5F, 6.2919F, -1.2367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 77).addBox(-0.5F, 6.2919F, -1.5867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 92).addBox(-0.5F, 10.1115F, -2.4794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -0.5144F, -1.007F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 49).addBox(-0.5F, -0.4885F, -0.4584F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 91).addBox(-0.5F, 13.6379F, -6.069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, 13.9295F, -5.7137F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 62).addBox(-1.0F, 14.0966F, 0.1807F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0922F, 0.7664F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(29, 88).addBox(-1.5F, -0.0469F, -0.2346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2483F, -0.0978F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 92).addBox(-1.9F, 0.0161F, -0.9554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 9.9667F, -3.9034F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(16, 37).addBox(-1.9F, 0.0161F, 0.0446F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 0.3841F, -0.8747F, -0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(97, 29).addBox(-0.5F, 1.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 92).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 10.5092F, -3.3016F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 12).addBox(-0.5F, -1.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 97).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 1.203F, -0.1275F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 28).addBox(-0.5F, -4.0F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8F, 4.8593F, -1.4992F, -0.4102F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(37, 44).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1822F, 11.8312F, -5.7112F, -1.9734F, -0.033F, 0.0314F));

		PartDefinition cube_r19 = leftLeg3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 10).addBox(-1.2F, -2.9185F, -0.2027F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4586F, 0.2937F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 71).addBox(0.7499F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2858F, 3.974F, 0.2821F, -0.2182F, 0.0F, -0.1309F));

		PartDefinition cube_r21 = leftLeg3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(21, 68).addBox(0.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r22 = leftLeg3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 56).addBox(-1.2726F, 0.1383F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, 0.0873F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6F, -0.6629F, -5.1394F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 4.2749F, 0.0205F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 22).addBox(-1.5974F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -0.1629F, -3.0144F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r24 = leftLeg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(17, 7).addBox(-2.0254F, -12.1999F, -8.6228F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 11.5371F, 3.4856F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -3.6144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.7973F, 1.4482F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 88).addBox(-0.5F, 9.9365F, -3.0293F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 86).addBox(-0.5F, 6.2919F, -1.2367F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(19, 86).addBox(-0.5F, 6.2919F, -1.5867F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(95, 71).addBox(-0.5F, 10.1115F, -2.4794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.5144F, -1.007F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(27, 59).addBox(-0.5F, -0.4885F, -0.4584F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7327F, 0.0946F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, 13.6379F, -6.069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 66).addBox(-1.0F, 13.9295F, -5.7137F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 62).addBox(-1.0F, 14.0966F, 0.1807F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0673F, -0.2054F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.0922F, 0.7664F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5F, -0.0469F, -0.2346F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2483F, -0.0978F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 95).addBox(0.9F, 0.0161F, -0.9554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 9.9667F, -3.9034F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(21, 37).addBox(0.9F, 0.0161F, 0.0446F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 0.3841F, -0.8747F, -0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 99).addBox(-0.5F, 1.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 75).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 10.5092F, -3.3016F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(59, 99).addBox(-0.5F, -1.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 99).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 1.203F, -0.1275F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, -4.0F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8F, 4.8593F, -1.4992F, -0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1822F, 11.8312F, -5.7112F, -1.9734F, 0.033F, -0.0314F));

		PartDefinition cube_r40 = rightLeg3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 42).addBox(-0.8F, -2.9185F, -0.2027F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 0.2937F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(12, 73).addBox(-1.7499F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2858F, 3.974F, 0.2821F, -0.2182F, 0.0F, 0.1309F));

		PartDefinition cube_r42 = rightLeg3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 72).addBox(-1.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r43 = rightLeg3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(74, 68).addBox(0.2726F, 0.1383F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3276F, -0.6858F, 0.2821F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 7).addBox(-1.4F, -0.6629F, -5.1394F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, 4.2749F, 0.0205F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(26, 22).addBox(-0.4026F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8F, -0.1629F, -3.0144F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r45 = rightLeg4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 22).addBox(1.0254F, -12.1999F, -8.6228F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 11.5371F, 3.4856F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -3.6144F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, -0.7672F, -2.5566F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(64, 69).addBox(-1.7758F, -0.5253F, -1.4048F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4216F, 0.0356F, -0.7158F, -1.9826F, 0.71F, -1.6005F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 64).addBox(-0.8886F, -0.5253F, -1.6156F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4216F, 0.0356F, -0.7158F, -0.9348F, 0.5279F, -0.038F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 76).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1598F, 1.8298F, -0.759F, -0.6942F, -0.1826F, 1.4533F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(41, 57).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7616F, 3.0156F, -1.4858F, -1.0671F, -0.7694F, 2.2041F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(24, 82).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9603F, 2.1787F, -1.9958F, -0.8204F, -0.5352F, 1.8039F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 75).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.7336F, 1.2059F, -2.0434F, -0.6813F, -0.0476F, 1.3419F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 47).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8009F, -0.5429F, -1.7759F, -0.6908F, 0.1341F, 1.0808F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 34).addBox(-0.2255F, -0.5253F, -1.9222F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4216F, 0.0356F, -0.7158F, -0.7687F, 0.0247F, 0.5368F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 69).addBox(2.5412F, -4.2434F, -0.5292F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.0306F, 0.9546F, -1.3083F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(87, 23).addBox(2.493F, -4.2434F, 0.2782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.0306F, 0.9546F, -1.3083F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(37, 68).addBox(2.6934F, -4.2434F, -0.3216F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.1793F, 0.8877F, -1.4946F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(91, 17).addBox(-2.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -0.4942F, 0.7097F, 0.6504F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 18).addBox(0.1837F, -4.3474F, -2.7252F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.0243F, 1.1203F, -1.0712F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(91, 3).addBox(-0.7838F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.5696F, 0.8437F, -1.7052F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(13, 28).addBox(-3.3138F, -4.361F, -1.3196F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -1.5391F, 1.2026F, -0.5487F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 78).addBox(0.9503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -3.0944F, -0.9384F, 2.4575F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(82, 10).addBox(0.75F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0791F, 3.9424F, 4.6493F, -3.1058F, -0.6768F, 2.4731F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(63, 15).addBox(1.938F, -1.0648F, -3.4722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.8891F, -1.459F, 2.2445F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(88, 34).addBox(-2.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -3.1105F, -0.4588F, 2.4818F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 21).addBox(-0.7515F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.0857F, -1.5359F, 1.5708F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(96, 37).addBox(1.484F, -1.5093F, -2.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -0.0463F, -0.8544F, -0.4802F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 96).addBox(-0.5F, -0.9517F, -3.0528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8281F, 5.1672F, 6.6566F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(64, 77).addBox(-0.5546F, -6.4358F, 0.0249F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, 0.505F, 0.1763F, 0.7258F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 43).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3896F, 1.6187F, 3.5616F, -0.149F, -0.8259F, 0.402F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(89, 8).addBox(-0.1F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3124F, -0.0208F, 0.7731F, -0.0105F, -0.1591F, 0.1597F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 0.0769F, 1.2632F, -0.1986F, 0.0169F, 0.2438F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(26, 46).addBox(-1.0876F, -4.9876F, -2.0572F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -0.0813F, 0.0783F, 0.9221F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(78, 30).addBox(-1.0F, -0.7742F, -2.0572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 5.3294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(24, 78).addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8281F, 5.9234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -2.5566F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 69).mirror().addBox(-1.2242F, -0.5253F, -1.4048F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4216F, 0.0356F, -0.7158F, -1.9826F, -0.71F, 1.6005F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-1.1114F, -0.5253F, -1.6156F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4216F, 0.0356F, -0.7158F, -0.9348F, -0.5279F, 0.038F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1598F, 1.8298F, -0.759F, -0.6942F, 0.1826F, -1.4533F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.7616F, 3.0156F, -1.4858F, -1.0671F, 0.7694F, -2.2041F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(24, 82).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9603F, 2.1787F, -1.9958F, -0.8204F, 0.5352F, -1.8039F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7336F, 1.2059F, -2.0434F, -0.6813F, 0.0476F, -1.3419F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 47).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8009F, -0.5429F, -1.7759F, -0.6908F, -0.1341F, -1.0808F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 34).mirror().addBox(-1.7745F, -0.5253F, -1.9222F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4216F, 0.0356F, -0.7158F, -0.7687F, -0.0247F, -0.5368F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-5.5412F, -4.2434F, -0.5292F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0306F, -0.9546F, 1.3083F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-4.493F, -4.2434F, 0.2782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0306F, -0.9546F, 1.3083F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-5.6934F, -4.2434F, -0.3216F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.1793F, -0.8877F, 1.4946F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(91, 17).mirror().addBox(0.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.4942F, -0.7097F, -0.6504F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 18).mirror().addBox(-4.1837F, -4.3474F, -2.7252F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0243F, -1.1203F, 1.0712F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-1.2162F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.5696F, -0.8437F, 1.7052F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(-2.6862F, -4.361F, -1.3196F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -1.5391F, -1.2026F, 0.5487F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-1.9503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.0944F, 0.9384F, -2.4575F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-1.75F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0791F, 3.9424F, 4.6493F, -3.1058F, 0.6768F, -2.4731F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-3.938F, -1.0648F, -3.4722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.8891F, 1.459F, -2.2445F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(0.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.1105F, 0.4588F, -2.4818F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-2.2484F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0857F, 1.5359F, -1.5708F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-2.484F, -1.5093F, -2.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.0463F, 0.8544F, 0.4802F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 77).mirror().addBox(-0.4454F, -6.4358F, 0.0249F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, 0.505F, -0.1763F, -0.7258F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(66, 43).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3896F, 1.6187F, 3.5616F, -0.149F, 0.8259F, -0.402F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-1.9F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3124F, -0.0208F, 0.7731F, -0.0105F, 0.1591F, -0.1597F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-2.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 0.0769F, 1.2632F, -0.1986F, -0.0169F, -0.2438F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 46).mirror().addBox(0.0876F, -4.9876F, -2.0572F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.0813F, -0.0783F, -0.9221F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3183F, -4.0742F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 81).addBox(0.0F, -0.6751F, -0.317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(14, 60).addBox(0.0F, -0.893F, -0.0538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-2.5356F, -0.7233F, -0.9359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5327F, 0.3861F, -4.4396F, -0.4946F, 0.0751F, -1.0038F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-2.5304F, -0.3495F, -0.6756F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, -0.444F, -5.1917F, -0.4522F, 0.3039F, -0.5081F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.3198F, -2.8726F, 0.076F, -1.8398F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(0.5189F, -0.2319F, -0.0351F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, -0.1342F, -1.8505F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(52, 72).addBox(0.0F, -0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.3198F, -2.8726F, -0.076F, 1.8398F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5189F, -0.2319F, -0.0351F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, 0.1342F, 1.8505F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(23, 64).addBox(0.0F, -0.7451F, 0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.7F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 74).addBox(-0.4696F, -0.3495F, -0.6756F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, -0.444F, -5.1917F, -0.4522F, -0.3039F, 0.5081F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(90, 82).addBox(0.5356F, -0.7233F, -0.9359F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5327F, 0.3861F, -4.4396F, -0.4946F, -0.0751F, 1.0038F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -0.9597F, -4.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(78, 56).addBox(-0.5F, 0.1F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8732F, -5.9268F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5863F, 6.6813F, -0.7458F, 0.517F, -0.1453F, 0.1882F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(37, 66).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0762F, 4.2883F, 1.3213F, -0.4281F, -0.3745F, -2.3934F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-5.7827F, -2.8171F, -0.7379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1086F, -0.0709F, -1.2649F, -0.5043F, 0.2572F, -1.2857F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-3.9623F, -0.1315F, -0.713F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1086F, -0.0709F, -1.2649F, -0.2486F, 0.5219F, -0.5152F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-0.775F, -0.6F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4549F, -1.1153F, 0.7077F, -0.7193F, -0.2429F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(81, 51).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5863F, 6.6813F, -0.7458F, 0.517F, 0.1453F, -0.1882F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(81, 34).addBox(-0.225F, -0.6F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4549F, -1.1153F, 0.7077F, 0.7193F, 0.2429F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 80).addBox(-0.5F, -0.5097F, 0.7244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0308F, -3.7781F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 8).addBox(-0.0377F, -0.1315F, -0.713F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1086F, -0.0709F, -1.2649F, -0.2486F, -0.5219F, 0.5152F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 49).addBox(2.7827F, -2.8171F, -0.7379F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1086F, -0.0709F, -1.2649F, -0.5043F, -0.2572F, 1.2857F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(37, 66).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0762F, 4.2883F, 1.3213F, -0.4281F, 0.3745F, 2.3934F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 22).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(5, 62).addBox(0.0F, -1.1769F, -0.628F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, -0.2007F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 88).addBox(0.0F, -0.6938F, 0.054F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2126F, 5.3932F, 2.2976F, -0.3123F, -0.3483F, -2.7346F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-4.3745F, -5.8242F, -0.2868F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0709F, -0.6649F, -0.4619F, 0.0408F, -1.8397F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(92, 54).mirror().addBox(-4.636F, -3.7839F, -0.2868F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0709F, -0.6649F, -0.3519F, 0.3083F, -1.2308F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 46).mirror().addBox(-4.6166F, -0.1571F, -0.4773F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0709F, -0.6649F, 0.0542F, 0.4961F, -0.2354F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(46, 46).addBox(-0.3834F, -0.1571F, -0.4773F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0709F, -0.6649F, 0.0542F, -0.4961F, 0.2354F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 32).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2126F, 5.3932F, 2.2976F, -0.3123F, 0.3483F, 2.7346F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(81, 17).addBox(1.3745F, -5.8242F, -0.2868F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0709F, -0.6649F, -0.4619F, -0.0408F, 1.8397F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(92, 54).addBox(2.636F, -3.7839F, -0.2868F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0709F, -0.6649F, -0.3519F, -0.3083F, 1.2308F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(80, 62).addBox(-0.5F, -0.3F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.0978F, -4.0739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 49).addBox(0.0F, -0.6507F, -0.2782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 28).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0556F, 6.2237F, 3.0395F, -0.4294F, -0.2538F, -2.8938F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-3.9763F, -0.1456F, -0.5341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9086F, 0.4791F, -0.2149F, 0.2202F, 0.4101F, -0.3145F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-6.0427F, -2.5546F, -0.6507F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9086F, 0.4791F, -0.2149F, -0.1064F, 0.4841F, -1.0471F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 66).mirror().addBox(-3.2386F, -6.5562F, -0.6507F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9086F, 0.4791F, -0.2149F, -0.483F, 0.1117F, -2.1828F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(66, 6).mirror().addBox(-0.8013F, -7.4225F, -0.6355F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, 0.7291F, -2.5649F, -0.544F, -0.2323F, -2.9048F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-4.5414F, -6.6859F, -0.6355F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, 0.7291F, -2.5649F, -0.5091F, 0.3058F, -2.0465F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(-6.2883F, -2.3349F, -0.6355F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, 0.7291F, -2.5649F, 0.0915F, 0.5805F, -0.8045F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-4.0347F, 0.1783F, -0.513F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, 0.7291F, -2.5649F, 0.4273F, 0.3693F, -0.0938F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 28).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0556F, 6.2237F, 3.0395F, -0.4294F, 0.2538F, 2.8938F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(80, 66).addBox(0.2385F, -6.5562F, -0.6507F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9086F, 0.4791F, -0.2149F, -0.483F, -0.1117F, 2.1828F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 81).addBox(3.0427F, -2.5546F, -0.6507F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9086F, 0.4791F, -0.2149F, -0.1064F, -0.4841F, 1.0471F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(46, 44).addBox(-1.0237F, -0.1456F, -0.5341F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9086F, 0.4791F, -0.2149F, 0.2202F, -0.4101F, 0.3145F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(66, 6).addBox(-3.1987F, -7.4225F, -0.6355F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, 0.7291F, -2.5649F, -0.544F, 0.2323F, 2.9048F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 4).addBox(0.5414F, -6.6859F, -0.6355F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, 0.7291F, -2.5649F, -0.5091F, -0.3058F, 2.0465F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(77, 8).addBox(3.2883F, -2.3349F, -0.6355F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, 0.7291F, -2.5649F, 0.0915F, -0.5805F, 0.8045F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 41).addBox(0.0347F, 0.1783F, -0.513F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, 0.7291F, -2.5649F, 0.4273F, -0.3693F, 0.0938F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 92).addBox(0.0F, -0.7034F, -0.1405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6199F, -3.6946F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(82, 84).mirror().addBox(-2.4851F, -0.3605F, -3.4474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7517F, 0.4595F, -2.2645F, 1.0144F, -0.2863F, 0.5343F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-1.042F, -0.7399F, -0.9836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7517F, 0.4595F, -2.2645F, 1.1665F, 0.056F, 1.4138F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4029F, 5.6179F, 0.4659F, -0.3731F, -0.2219F, -2.9977F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 19).mirror().addBox(1.1059F, -6.4342F, -0.7324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, 0.2592F, -0.2952F, -0.1153F, -0.3056F, 3.0775F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-2.6153F, -7.7865F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, 0.2592F, -0.2952F, -0.3183F, -0.0719F, -2.2171F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-6.8944F, -3.6394F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, 0.2592F, -0.2952F, -0.2051F, 0.2553F, -1.1206F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-1.3852F, -5.9454F, -0.8321F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3586F, 0.8135F, -1.7761F, -0.4275F, 0.0601F, -2.3547F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 5).mirror().addBox(-0.4548F, -1.5897F, 0.2024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(54, 0).mirror().addBox(-0.4548F, -0.6897F, 0.2024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.7526F, -0.2276F, 0.9205F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-5.1285F, -3.0698F, -0.8321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3586F, 0.8135F, -1.7761F, -0.1319F, 0.412F, -1.2348F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-3.3783F, -1.5943F, -0.8321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3586F, 0.8135F, -1.7761F, 0.1051F, 0.4192F, -0.6612F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(-2.8597F, -0.2919F, -0.7507F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3586F, 0.8135F, -1.7761F, 0.2788F, 0.2919F, -0.1582F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-6.2209F, 0.5094F, 0.4745F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4254F, 4.1368F, -2.6385F, -0.6491F, -0.3057F, 0.456F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-1.3253F, -0.7399F, -2.5448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7517F, 0.4595F, -2.2645F, 1.1721F, -0.0887F, 1.0767F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-0.4516F, -1.6881F, -1.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 2.3547F, -0.2276F, 0.9205F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(-0.4516F, -1.6082F, -0.7343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.6653F, -0.2276F, 0.9205F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.4516F, -1.0316F, -2.6335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.7352F, -0.2276F, 0.9205F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(46, 10).mirror().addBox(-4.4502F, -0.2487F, -0.603F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, 0.2592F, -0.2952F, 0.0307F, 0.2935F, -0.2964F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(26, 68).mirror().addBox(-4.8085F, -2.2999F, -0.7324F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2336F, 0.2592F, -0.2952F, -0.1176F, 0.3048F, -0.8068F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.4548F, -0.3715F, -2.799F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.5432F, -0.2276F, 0.9205F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(49, 31).mirror().addBox(-0.4516F, 0.282F, -2.5618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.3337F, -0.2276F, 0.9205F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(42, 52).mirror().addBox(-0.4548F, 0.1181F, 0.5219F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 0.8974F, -0.2276F, 0.9205F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.4548F, -0.004F, 0.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.3599F, -0.2276F, 0.9205F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 51).mirror().addBox(-0.4548F, -0.0885F, 0.42F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4934F, 0.9037F, -2.6514F, 1.0545F, -0.2276F, 0.9205F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(26, 70).mirror().addBox(-2.7607F, -0.247F, 0.0936F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4254F, 4.1368F, -2.6385F, -0.5238F, -0.3527F, 0.1008F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 84).addBox(0.042F, -0.7399F, -0.9836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7517F, 0.4595F, -2.2645F, 1.1665F, -0.056F, -1.4138F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(82, 84).addBox(1.4851F, -0.3605F, -3.4474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7517F, 0.4595F, -2.2645F, 1.0144F, 0.2863F, -0.5343F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(79, 0).addBox(0.3253F, -0.7399F, -2.5448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7517F, 0.4595F, -2.2645F, 1.1721F, 0.0887F, -1.0767F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(75, 47).addBox(-0.5484F, -1.6881F, -1.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 2.3547F, 0.2276F, -0.9205F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(55, 70).addBox(-0.5484F, -1.6082F, -0.7343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.6653F, 0.2276F, -0.9205F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(57, 5).addBox(-0.5452F, -1.5897F, 0.2024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F))
				.texOffs(54, 0).addBox(-0.5452F, -0.6897F, 0.2024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.7526F, 0.2276F, -0.9205F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(51, 52).addBox(-0.5484F, -1.0316F, -2.6335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.7352F, 0.2276F, -0.9205F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(46, 10).addBox(-0.5498F, -0.2487F, -0.603F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, 0.2592F, -0.2952F, 0.0307F, -0.2935F, 0.2964F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(63, 19).addBox(-5.1059F, -6.4342F, -0.7324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, 0.2592F, -0.2952F, -0.1153F, 0.3056F, -3.0775F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(80, 39).addBox(-0.3847F, -7.7865F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, 0.2592F, -0.2952F, -0.3183F, 0.0719F, 2.2171F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 28).addBox(3.8944F, -3.6394F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, 0.2592F, -0.2952F, -0.2051F, -0.2553F, 1.1206F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(26, 68).addBox(3.8085F, -2.2999F, -0.7324F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2336F, 0.2592F, -0.2952F, -0.1176F, -0.3048F, 0.8068F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5452F, -0.3715F, -2.799F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.5432F, 0.2276F, -0.9205F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(49, 31).addBox(-0.5484F, 0.282F, -2.5618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.3337F, 0.2276F, -0.9205F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 52).addBox(-0.5452F, 0.1181F, 0.5219F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 0.8974F, 0.2276F, -0.9205F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5452F, -0.004F, 0.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.3599F, 0.2276F, -0.9205F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(33, 51).addBox(-0.5452F, -0.0885F, 0.42F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.4934F, 0.9037F, -2.6514F, 1.0545F, 0.2276F, -0.9205F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(49, 41).addBox(2.2209F, 0.5094F, 0.4745F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4254F, 4.1368F, -2.6385F, -0.6491F, 0.3057F, -0.456F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(26, 70).addBox(-0.2393F, -0.247F, 0.0936F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4254F, 4.1368F, -2.6385F, -0.5238F, 0.3527F, -0.1008F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(49, 27).addBox(-1.5F, -3.9528F, 1.1824F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9805F, -5.0744F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(39, 22).addBox(-1.0F, -3.7869F, 1.8911F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2805F, -3.6744F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(24, 31).addBox(0.0F, -1.7476F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 93).addBox(0.0F, -1.2815F, 0.0453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(60, 26).addBox(-1.1403F, -0.2919F, -0.7507F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3586F, 0.8135F, -1.7761F, 0.2788F, -0.2919F, 0.1582F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(98, 49).addBox(2.3783F, -1.5943F, -0.8321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3586F, 0.8135F, -1.7761F, 0.1051F, -0.4192F, 0.6612F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 30).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4029F, 5.6179F, 0.4659F, -0.3731F, 0.2219F, 2.9977F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(91, 49).addBox(-0.6148F, -5.9454F, -0.8321F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3586F, 0.8135F, -1.7761F, -0.4275F, -0.0601F, 2.3547F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 72).addBox(2.1285F, -3.0698F, -0.8321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3586F, 0.8135F, -1.7761F, -0.1319F, -0.412F, 1.2348F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(38, 28).addBox(-0.5F, -0.9889F, 1.9677F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9561F, 2.5883F, -1.57F, 0.907F, 0.1576F, 0.0377F));

		PartDefinition cube_r209 = leftarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0178F, 9.5319F, 5.7358F, -0.6019F, -0.003F, 0.0006F));

		PartDefinition cube_r210 = leftarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(92, 56).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0165F, 7.9558F, 5.6095F, 0.4017F, -0.003F, 0.0006F));

		PartDefinition cube_r211 = leftarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(58, 92).addBox(-0.5F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0045F, 0.9539F, -0.1328F, 1.0562F, -0.003F, 0.0006F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(28, 28).addBox(0.0F, -4.0373F, -0.0956F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 2.61F, 1.056F, 0.5762F, -0.003F, 0.0006F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2698F, 10.7365F, 6.1294F, 0.0054F, 0.0665F, 0.1615F));

		PartDefinition cube_r213 = leftarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(19, 80).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, 0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r214 = leftarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r215 = leftarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(59, 57).addBox(-0.5F, 4.5991F, 0.1825F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, -0.1222F, 0.0F, -0.0524F));

		PartDefinition cube_r216 = leftarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(67, 87).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, 0.0524F, 0.0F, -0.0524F));

		PartDefinition cube_r217 = leftarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(62, 87).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, -0.0524F));

		PartDefinition cube_r218 = leftarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 87).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, -0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2873F, 11.5283F, -1.2564F, 1.9368F, -1.4875F, -1.8822F));

		PartDefinition cube_r219 = leftArm3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(68, 10).addBox(-0.7408F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3381F, 0.0886F, -0.2467F));

		PartDefinition cube_r220 = leftArm3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(73, 63).addBox(-1.6708F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3478F, 0.0298F, -0.082F));

		PartDefinition cube_r221 = leftArm3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(92, 60).addBox(0.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r222 = leftArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 77).addBox(-0.4986F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thumb = leftArm3.addOrReplaceChild("thumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, 0.1133F, 0.3107F, 0.5121F, -0.6333F, -0.2064F));

		PartDefinition cube_r223 = thumb.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(24, 92).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition thumb2 = thumb.addOrReplaceChild("thumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.075F, 1.7008F, -0.5174F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition cube_r224 = thumb2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(43, 88).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6F, 1.2F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.835F, 4.4217F, -0.0153F, 0.3514F, 0.0263F, -0.1009F));

		PartDefinition cube_r225 = leftArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 72).addBox(-1.309F, -2.6048F, -0.6643F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.934F, 2.5658F, 1.0617F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r226 = leftArm4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 15).addBox(0.0366F, -1.0099F, -0.6933F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.9577F, 1.0906F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9561F, 2.5883F, -1.57F, 1.4306F, -0.1576F, -0.0377F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 99).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0178F, 9.5319F, 5.7358F, -0.6019F, 0.003F, -0.0006F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 84).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0165F, 7.9558F, 5.6095F, 0.4017F, 0.003F, -0.0006F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(93, 67).addBox(-0.5F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0045F, 0.9539F, -0.1328F, 1.0562F, 0.003F, -0.0006F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(30, 5).addBox(-1.0F, -4.0373F, -0.0956F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.61F, 1.056F, 0.5762F, 0.003F, -0.0006F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2698F, 10.7365F, 6.1294F, 0.0054F, -0.0665F, -0.1615F));

		PartDefinition cube_r231 = rightarm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(14, 84).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, 0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r232 = rightarm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 72).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, -0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r233 = rightarm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(9, 60).addBox(-0.5F, 4.5991F, 0.1825F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, -0.1222F, 0.0F, 0.0524F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, 0.0524F, 0.0F, 0.0524F));

		PartDefinition cube_r235 = rightarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(72, 87).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, 0.0524F));

		PartDefinition cube_r236 = rightarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(57, 87).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, -0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2873F, 11.5283F, -1.2564F, 1.9368F, 1.4875F, 1.8822F));

		PartDefinition cube_r237 = rightArm3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(14, 68).addBox(-1.2592F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3381F, -0.0886F, 0.2467F));

		PartDefinition cube_r238 = rightArm3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 34).addBox(-0.3292F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3478F, -0.0298F, 0.082F));

		PartDefinition cube_r239 = rightArm3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 95).addBox(-1.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r240 = rightArm3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(77, 20).addBox(-1.5014F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thumb5 = rightArm3.addOrReplaceChild("thumb5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1931F, 0.0968F, 0.3699F, 0.5121F, 0.6333F, 0.2064F));

		PartDefinition cube_r241 = thumb5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(95, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition thumb6 = thumb5.addOrReplaceChild("thumb6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.075F, 1.7008F, -0.5174F, 0.0832F, -0.0262F, 0.3043F));

		PartDefinition cube_r242 = thumb6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(90, 74).addBox(0.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, 1.2F, 0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.835F, 4.4217F, -0.0153F, 0.3514F, -0.0263F, 0.1009F));

		PartDefinition cube_r243 = rightArm4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(62, 72).addBox(-0.691F, -2.6048F, -0.6643F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.934F, 2.5658F, 1.0617F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r244 = rightArm4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(74, 51).addBox(-2.0367F, -1.0099F, -0.6933F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.9577F, 1.0906F, 0.0F, 0.0F, -0.0436F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2902F, -3.6951F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(44, 93).addBox(0.0F, -1.2003F, -0.0139F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.814F, -0.6842F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(-1.5975F, -4.7721F, -1.0087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0017F, 0.019F, 0.1094F, -0.4215F, -2.7197F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-1.1714F, -4.8341F, -1.0087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0017F, 0.019F, -0.1297F, -0.4161F, -2.1452F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-3.9395F, -2.8068F, -1.0087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0017F, 0.019F, -0.4086F, -0.1528F, -1.2246F));

		PartDefinition cube_r249 = neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-3.083F, -1.461F, -1.0087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0017F, 0.019F, -0.4301F, 0.0646F, -0.7468F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-2.5419F, -0.3098F, -0.9371F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4086F, -0.0017F, 0.019F, -0.3664F, 0.2264F, -0.2816F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(81, 15).addBox(-1.4025F, -4.7721F, -1.0087F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0017F, 0.019F, 0.1094F, 0.4215F, 2.7197F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 6).addBox(0.1714F, -4.8341F, -1.0087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0017F, 0.019F, -0.1297F, 0.4161F, 2.1452F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(91, 6).addBox(1.9395F, -2.8068F, -1.0087F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0017F, 0.019F, -0.4086F, 0.1528F, 1.2246F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(97, 62).addBox(2.083F, -1.461F, -1.0087F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0017F, 0.019F, -0.4301F, -0.0646F, 0.7468F));

		PartDefinition cube_r255 = neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(78, 60).addBox(-0.4582F, -0.3098F, -0.9371F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4086F, -0.0017F, 0.019F, -0.3664F, -0.2264F, 0.2816F));

		PartDefinition cube_r256 = neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(96, 40).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5795F, -1.9173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5323F, -0.9458F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(33, 46).addBox(0.0F, -1.2854F, -0.0704F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.7F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(79, 68).addBox(-0.5F, -0.1681F, 1.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1432F, -1.5069F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, -1.0684F, -0.1304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.4F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -0.1681F, -2.0721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6601F, -1.1179F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(96, 43).addBox(-0.5F, -0.1681F, -1.0721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3485F, -0.2267F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(46, 5).addBox(-1.0F, -0.9F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.0885F, -4.7527F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(35, 11).addBox(-1.0F, -2.9888F, -0.0014F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9101F, -3.1669F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(71, 39).addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4914F, -4.0117F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(38, 39).addBox(-1.0F, -2.3638F, -0.2514F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.9268F, -3.264F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(71, 27).addBox(-1.0F, -1.6894F, -1.0607F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 3.0182F, -5.2449F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(89, 64).addBox(-0.9936F, -0.0572F, -0.0527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.0064F, 2.6737F, -7.9972F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(88, 71).addBox(-0.9936F, -0.0846F, -0.0962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0064F, 1.9953F, -7.5733F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(49, 96).addBox(0.0F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -2.9054F, -6.0771F, 1.7501F, -0.2266F, 0.2696F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(96, 46).addBox(-1.0F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -2.9054F, -6.0771F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(54, 80).addBox(-1.0F, -0.65F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8963F, -5.5463F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(97, 79).addBox(-0.5F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0595F, -6.1066F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(35, 71).addBox(-1.0F, -0.9F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.8963F, -5.5463F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(44, 96).addBox(-0.5F, -0.5099F, -0.2181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0793F, -5.6191F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(67, 51).addBox(-0.5F, -0.3943F, -1.7615F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0793F, -5.6191F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 51).addBox(-0.9936F, -0.8265F, 0.1185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0064F, 2.7203F, -7.1483F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(85, 30).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.8584F, -6.4466F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0346F, -5.9198F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(30, 99).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1197F, -5.8901F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(99, 82).addBox(0.5F, 0.2113F, 1.2475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(12, 90).addBox(0.0F, 0.2113F, 0.5475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(64, 65).addBox(0.0F, 0.3863F, 0.0475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.4918F, -7.4445F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(46, 48).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2243F, 0.968F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6059F, -0.9952F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(35, 5).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.2243F, 0.968F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(46, 12).addBox(-1.5F, 0.025F, -1.95F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.0F, -1.5372F, 1.9518F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(64, 61).addBox(-2.0F, -0.0022F, -1.0167F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.4948F, 1.9693F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(64, 57).addBox(-2.0F, -0.0022F, -1.0167F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.4346F, 1.7872F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(32, 56).addBox(-2.0F, -0.0022F, -0.9917F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4156F, 1.4561F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(9, 55).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.1767F, 0.8203F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(50, 57).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.006F, -5.1428F, -3.2243F, -2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, -5.3421F, -2.2444F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(23, 54).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.006F, -5.3334F, -1.2444F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 0.375F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(71, 24).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -5.3256F, -1.2412F, 1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(58, 31).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5627F, -5.6994F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(54, 16).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.3453F, -5.0769F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 36).addBox(-2.0F, 0.0241F, -1.0147F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.5F, -4.8834F, -4.2002F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3359F, 1.6818F, -10.0283F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(9, 49).addBox(-0.5F, -1.279F, -2.285F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(0.6795F, -0.9132F, 4.8729F, 1.8585F, 1.0406F, 0.6923F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(98, 15).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.7631F, -1.5287F, 5.1315F, 0.375F, 1.0406F, 0.6923F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(20, 96).addBox(-0.8F, -0.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(95, 51).addBox(-0.8F, -0.125F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.512F, -1.7795F, 5.4268F, 0.836F, 0.3381F, 0.0776F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 4).addBox(-0.9787F, -0.8715F, -0.1573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2288F, 1.7519F, 4.2395F, 0.3098F, 0.0F, -0.0698F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 99).addBox(-0.9508F, -0.3771F, -0.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1678F, 1.2786F, 4.1227F, 0.1526F, 0.0037F, -0.0697F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 80).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.7334F, -2.5466F, 8.5868F, -0.0758F, -1.3856F, -0.0232F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(18, 59).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.7334F, -2.5466F, 8.5868F, -0.0214F, -0.8625F, -0.0814F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(96, 26).addBox(-0.8213F, -0.2174F, -0.2006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.7688F, -3.1437F, 8.0025F, -0.014F, -0.1208F, -0.096F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(83, 76).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.7287F, -2.7594F, 6.454F, 0.2502F, 0.0356F, -0.0954F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(77, 4).addBox(-0.1575F, -0.0264F, -1.1275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3815F, 1.073F, 2.1521F, 1.3881F, -0.7789F, 0.1177F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(20, 99).addBox(-0.2258F, -0.0764F, -0.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(20, 99).addBox(-0.2258F, -0.0764F, -0.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3815F, 1.073F, 2.1521F, 1.2694F, -0.7405F, 0.3529F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(74, 99).addBox(-0.8635F, -0.8304F, -0.7137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0759F, 1.3029F, 3.3284F, 1.6471F, 0.1166F, -0.0561F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(98, 97).addBox(-0.8792F, -1.7697F, -0.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1678F, 0.8786F, 4.4227F, 1.5421F, 0.1136F, -0.0621F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(98, 94).addBox(-0.8F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.8032F, -1.8964F, 6.6335F, 0.9521F, 0.1508F, -0.0546F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 99).addBox(-0.8F, -0.25F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.6692F, -2.0577F, 5.8113F, 0.5856F, 0.1508F, -0.0546F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(94, 23).addBox(-0.8F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.512F, -1.7795F, 5.4268F, 0.6178F, 0.3381F, 0.0776F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(98, 67).addBox(-0.8F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.1962F, -1.0374F, 5.1631F, 0.4044F, 0.5815F, 0.1858F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(98, 18).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.2208F, -0.7612F, 5.2776F, 0.6487F, 0.5815F, 0.1858F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -0.379F, -0.285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6795F, -0.9132F, 4.8729F, 0.8549F, 1.0406F, 0.6923F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(61, 83).addBox(-0.5F, -0.079F, -0.685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.6795F, -0.9132F, 4.8729F, 1.2913F, 1.0406F, 0.6923F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.7858F, -0.9627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6795F, -0.9132F, 4.8729F, 0.724F, 1.0406F, 0.6923F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 59).addBox(-0.55F, -0.225F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(96, 64).addBox(-0.55F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.2314F, -3.6874F, 3.7343F, 0.3429F, 0.87F, 1.602F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(10, 93).addBox(-0.325F, -1.475F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2319F, -1.8759F, 4.6342F, -1.5515F, 1.0735F, 0.1527F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(96, 8).addBox(-0.325F, -1.475F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2319F, -1.8759F, 4.6342F, -1.1588F, 1.0735F, 0.1527F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(67, 34).addBox(-0.25F, -2.175F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.066F, -2.4796F, 4.6595F, 2.1957F, 1.3961F, -0.6891F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(68, 83).addBox(-0.4729F, -0.4679F, -0.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3717F, -2.2076F, 4.7379F, 0.2452F, 1.1434F, 1.4669F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(54, 83).addBox(-0.4729F, -0.2429F, -0.5121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 96).addBox(-0.4729F, -0.2429F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3717F, -2.2076F, 4.7379F, -0.2784F, 1.1434F, 1.4669F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(59, 96).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.9234F, -3.6452F, 3.8499F, 2.1769F, 1.0121F, 1.2684F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(98, 3).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 0).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.8287F, -4.2648F, 3.4997F, 1.2552F, 1.0241F, 1.1592F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(97, 91).addBox(-0.6947F, -0.2386F, -0.7945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(54, 96).addBox(-0.6947F, -0.2386F, -0.4945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4391F, -3.9066F, 3.2698F, 1.3636F, 0.6693F, 1.3015F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 83).addBox(-0.2F, -0.2F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1789F, -3.6285F, 4.1097F, 1.0473F, -0.638F, 1.6103F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(82, 45).addBox(-0.2F, -0.2F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2605F, -3.8818F, 3.9712F, 0.9017F, -0.48F, 1.8827F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(15, 96).addBox(-0.5589F, -0.5692F, -0.2099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1412F, -4.0904F, 4.1927F, 1.1959F, -0.4931F, 1.9401F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5589F, -0.5412F, -0.7634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1412F, -4.0904F, 4.1927F, 1.3268F, -0.4931F, 1.9401F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(85, 55).addBox(0.0443F, -0.6308F, -0.7634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1412F, -4.0904F, 4.1927F, 1.2616F, 0.7964F, 1.5983F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(43, 0).addBox(0.4F, 0.0F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3653F, -3.8109F, 10.6797F, -0.1664F, 1.2715F, 1.3926F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 41).addBox(-1.1F, 0.0F, 0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0503F, -2.8951F, 5.8196F, 0.2563F, -0.4003F, 1.5122F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(59, 10).addBox(-0.7F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0503F, -2.8951F, 5.8196F, 0.2734F, -0.5266F, 1.4739F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 75).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2557F, -5.0729F, 6.2832F, 0.3653F, -0.8587F, 1.3321F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(43, 17).addBox(-1.1F, -0.9F, -1.175F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.513F, -4.3235F, 7.7956F, 0.1029F, -0.2748F, 1.5274F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(26, 41).addBox(-0.3764F, -1.3211F, -1.4333F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0827F, -4.6635F, 9.2709F, -0.0815F, 0.4204F, 1.5423F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 57).addBox(-0.7F, 0.0381F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3359F, -0.7605F, 3.3623F, 1.0278F, 0.1376F, 0.2234F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(12, 80).addBox(-0.025F, -0.375F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0359F, -0.204F, 3.5198F, 0.8989F, 0.023F, 0.0138F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(91, 20).addBox(-2.075F, -1.075F, -1.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8354F, -5.3897F, 6.2034F, 0.5342F, 0.6198F, -0.6283F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(86, 68).addBox(-2.075F, -1.075F, -1.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4478F, -4.6004F, 6.2475F, 0.0542F, 0.6198F, -0.6283F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(76, 79).addBox(-0.5F, -0.7F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8359F, -3.5449F, 5.9147F, 0.5926F, 0.3227F, 0.4146F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 92).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -3.685F, 11.9055F, -1.3334F, -0.6842F, -0.1517F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(89, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1641F, -4.6071F, 11.6536F, -1.0909F, 0.8132F, 0.3615F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(69, 96).addBox(-0.9787F, -0.4906F, 0.0315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(97, 56).addBox(-0.9787F, -0.4906F, 0.3316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.1678F, 0.8786F, 4.4227F, 0.2443F, 0.0F, -0.0698F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 96).addBox(-0.9787F, -0.5102F, -0.8721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1678F, 0.8786F, 4.4227F, 0.1004F, 0.0F, -0.0698F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(39, 97).addBox(-0.9787F, 0.8679F, -1.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1678F, 0.8786F, 4.4227F, 2.3911F, 0.0F, -0.0698F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(89, 26).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -5.8585F, 10.8486F, -0.6459F, 0.6481F, 0.6506F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(89, 11).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -5.8585F, 10.8486F, -0.4768F, 0.4931F, 0.7418F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -7.0195F, 8.2838F, -0.0055F, 0.0068F, 0.8901F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(89, 40).addBox(0.0F, -0.85F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(89, 37).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1641F, -6.669F, 9.594F, 1.3049F, 0.2985F, 0.8237F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(87, 92).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -6.8245F, 6.8039F, -2.925F, 0.1634F, -0.6367F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(38, 82).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -7.0239F, 7.7839F, -1.4108F, 0.1217F, -0.6447F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 93).addBox(-0.7874F, -0.1F, -1.972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1891F, -6.0271F, 4.9514F, 0.9814F, 0.7496F, -0.0871F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(92, 92).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1891F, -6.0271F, 4.9514F, 0.7442F, 0.6142F, -0.3028F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(92, 29).addBox(-1.0F, 0.0241F, -1.0147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.1641F, -6.5652F, 5.8281F, 0.4461F, 0.4042F, -0.5392F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(90, 14).addBox(-1.8F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5359F, -1.1779F, 3.5882F, 1.3452F, 0.4472F, 1.083F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(0, 87).addBox(-1.305F, -0.1349F, -0.3313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(86, 0).addBox(-1.305F, -0.7349F, -0.3313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3717F, -3.0076F, 4.3379F, 0.4043F, -0.1829F, 0.0901F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(44, 99).addBox(-0.275F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.3359F, -1.562F, 4.1381F, 1.326F, -0.0648F, -0.2538F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3359F, 1.6818F, -10.0283F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-0.5F, -1.279F, -2.285F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-0.6795F, -0.9132F, 4.8729F, 1.8585F, -1.0406F, -0.6923F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.7631F, -1.5287F, 5.1315F, 0.375F, -1.0406F, -0.6923F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.2F, -0.125F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(95, 51).mirror().addBox(-0.2F, -0.125F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.512F, -1.7795F, 5.4268F, 0.836F, -0.3381F, -0.0776F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-0.0213F, -0.8715F, -0.1573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2288F, 1.7519F, 4.2395F, 0.3098F, 0.0F, 0.0698F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(79, 99).mirror().addBox(-0.0492F, -0.3771F, -0.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1678F, 1.2786F, 4.1227F, 0.1526F, -0.0037F, 0.0697F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.7334F, -2.5466F, 8.5868F, -0.0758F, 1.3856F, 0.0232F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(18, 59).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.7334F, -2.5466F, 8.5868F, -0.0214F, 0.8625F, 0.0814F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(-0.1787F, -0.2174F, -0.2006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.7688F, -3.1437F, 8.0025F, -0.014F, 0.1208F, 0.096F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.7287F, -2.7594F, 6.454F, 0.2502F, -0.0356F, 0.0954F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 4).mirror().addBox(-0.8425F, -0.0264F, -1.1275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3815F, 1.073F, 2.1521F, 1.3881F, 0.7789F, -0.1177F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.7742F, -0.0764F, -0.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(20, 99).mirror().addBox(-0.7742F, -0.0764F, -0.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3815F, 1.073F, 2.1521F, 1.2694F, 0.7405F, -0.3529F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-0.1365F, -0.8304F, -0.7137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0759F, 1.3029F, 3.3284F, 1.6471F, -0.1166F, 0.0561F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(-0.1208F, -1.7697F, -0.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1678F, 0.8786F, 4.4227F, 1.5421F, -0.1136F, 0.0621F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-0.2F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.8032F, -1.8964F, 6.6335F, 0.9521F, -0.1508F, 0.0546F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(69, 99).mirror().addBox(-0.2F, -0.25F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.6692F, -2.0577F, 5.8113F, 0.5856F, -0.1508F, 0.0546F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-0.2F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.512F, -1.7795F, 5.4268F, 0.6178F, -0.3381F, -0.0776F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(98, 67).mirror().addBox(-0.2F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.1962F, -1.0374F, 5.1631F, 0.4044F, -0.5815F, -0.1858F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.2208F, -0.7612F, 5.2776F, 0.6487F, -0.5815F, -0.1858F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.5F, -0.379F, -0.285F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6795F, -0.9132F, 4.8729F, 0.8549F, -1.0406F, -0.6923F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(61, 83).mirror().addBox(-0.5F, -0.079F, -0.685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.6795F, -0.9132F, 4.8729F, 1.2913F, -1.0406F, -0.6923F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5F, -0.7858F, -0.9627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6795F, -0.9132F, 4.8729F, 0.724F, -1.0406F, -0.6923F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-0.45F, -0.225F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(96, 64).mirror().addBox(-0.45F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-1.2314F, -3.6874F, 3.7343F, 0.3429F, -0.87F, -1.602F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.675F, -1.475F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2319F, -1.8759F, 4.6342F, -1.5515F, -1.0735F, -0.1527F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-0.675F, -1.475F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2319F, -1.8759F, 4.6342F, -1.1588F, -1.0735F, -0.1527F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.75F, -2.175F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.066F, -2.4796F, 4.6595F, 2.1957F, -1.3961F, 0.6891F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(68, 83).mirror().addBox(-0.5271F, -0.4679F, -0.6621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3717F, -2.2076F, 4.7379F, 0.2452F, -1.1434F, -1.4669F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(-0.5271F, -0.2429F, -0.5121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 96).mirror().addBox(-0.5271F, -0.2429F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3717F, -2.2076F, 4.7379F, -0.2784F, -1.1434F, -1.4669F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(59, 96).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.9234F, -3.6452F, 3.8499F, 2.1769F, -1.0121F, -1.2684F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 0).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.8287F, -4.2648F, 3.4997F, 1.2552F, -1.0241F, -1.1592F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(97, 91).mirror().addBox(-0.3052F, -0.2386F, -0.7945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(54, 96).mirror().addBox(-0.3052F, -0.2386F, -0.4945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4391F, -3.9066F, 3.2698F, 1.3636F, -0.6693F, -1.3015F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-1.8F, -0.2F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1789F, -3.6285F, 4.1097F, 1.0473F, 0.638F, -1.6103F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(82, 45).mirror().addBox(-1.8F, -0.2F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2605F, -3.8818F, 3.9712F, 0.9017F, 0.48F, -1.8827F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-0.4411F, -0.5692F, -0.2099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1412F, -4.0904F, 4.1927F, 1.1959F, 0.4931F, -1.9401F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.4411F, -0.5412F, -0.7634F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1412F, -4.0904F, 4.1927F, 1.3268F, 0.4931F, -1.9401F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-1.0443F, -0.6308F, -0.7634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1412F, -4.0904F, 4.1927F, 1.2616F, -0.7964F, -1.5983F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-3.4F, 0.0F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3653F, -3.8109F, 10.6797F, -0.1664F, -1.2715F, -1.3926F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(82, 41).mirror().addBox(-0.9F, 0.0F, 0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, -2.8951F, 5.8196F, 0.2563F, 0.4003F, -1.5122F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-1.3F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0503F, -2.8951F, 5.8196F, 0.2734F, 0.5266F, -1.4739F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(52, 75).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2557F, -5.0729F, 6.2832F, 0.3653F, 0.8587F, -1.3321F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(43, 17).mirror().addBox(-1.9F, -0.9F, -1.175F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.513F, -4.3235F, 7.7956F, 0.1029F, 0.2748F, -1.5274F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(26, 41).mirror().addBox(-2.6236F, -1.3211F, -1.4333F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0827F, -4.6635F, 9.2709F, -0.0815F, -0.4204F, -1.5423F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.3F, 0.0381F, -0.1461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -0.7605F, 3.3623F, 1.0278F, -0.1376F, -0.2234F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-0.975F, -0.375F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0359F, -0.204F, 3.5198F, 0.8989F, -0.023F, -0.0138F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(0.075F, -1.075F, -1.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, -5.3897F, 6.2034F, 0.5342F, -0.6198F, 0.6283F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(0.075F, -1.075F, -1.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4478F, -4.6004F, 6.2475F, 0.0542F, -0.6198F, 0.6283F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-1.5F, -0.7F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -3.5449F, 5.9147F, 0.5926F, -0.3227F, -0.4146F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(73, 92).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -3.685F, 11.9055F, -1.3334F, 0.6842F, 0.1517F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -4.6071F, 11.6536F, -1.0909F, -0.8132F, -0.3615F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(69, 96).mirror().addBox(-0.0213F, -0.4906F, 0.0315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(97, 56).mirror().addBox(-0.0213F, -0.4906F, 0.3316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.1678F, 0.8786F, 4.4227F, 0.2443F, 0.0F, 0.0698F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(-0.0213F, -0.5102F, -0.8721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1678F, 0.8786F, 4.4227F, 0.1004F, 0.0F, 0.0698F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(39, 97).mirror().addBox(-0.0213F, 0.8679F, -1.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1678F, 0.8786F, 4.4227F, 2.3911F, 0.0F, 0.0698F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -5.8585F, 10.8486F, -0.6459F, -0.6481F, -0.6506F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(89, 11).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -5.8585F, 10.8486F, -0.4768F, -0.4931F, -0.7418F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -7.0195F, 8.2838F, -0.0055F, -0.0068F, -0.8901F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-2.0F, -0.85F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(89, 37).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.669F, 9.594F, 1.3049F, -0.2985F, -0.8237F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(87, 92).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -6.8245F, 6.8039F, -2.925F, -0.1634F, 0.6367F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(38, 82).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -7.0239F, 7.7839F, -1.4108F, -0.1217F, 0.6447F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.2126F, -0.1F, -1.972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, -6.0271F, 4.9514F, 0.9814F, -0.7496F, 0.0871F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1891F, -6.0271F, 4.9514F, 0.7442F, -0.6142F, 0.3028F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(0.0F, 0.0241F, -1.0147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.5652F, 5.8281F, 0.4461F, -0.4042F, 0.5392F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.2F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -1.1779F, 3.5882F, 1.3452F, -0.4472F, -1.083F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.695F, -0.1349F, -0.3313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(86, 0).mirror().addBox(-0.695F, -0.7349F, -0.3313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3717F, -3.0076F, 4.3379F, 0.4043F, 0.1829F, -0.0901F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(44, 99).mirror().addBox(-0.725F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.3359F, -1.562F, 4.1381F, 1.326F, 0.0648F, 0.2538F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6985F, -0.6111F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(31, 84).addBox(-0.5F, -2.4F, -0.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 1.6126F, -8.4161F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-0.05F, 0.2495F, -0.5955F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.8105F, -5.4549F, -1.7279F, -0.2269F, 0.0349F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-0.1F, -0.2F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8366F, 2.8743F, -7.6926F, -1.6223F, -0.6397F, 0.1143F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.9573F, 1.6943F, -6.4819F, -1.7414F, -0.0807F, 0.0092F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8897F, 2.1504F, -7.3693F, -1.6948F, -0.5726F, -0.0412F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-0.3F, 2.8914F, 0.8421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(88, 96).mirror().addBox(-0.3F, 2.4914F, 0.8421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.7381F, -0.122F, -0.1051F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-0.05F, -2.7505F, -0.5955F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.845F, 2.5133F, -7.3796F, -1.6891F, -0.0544F, 0.0077F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-0.3F, -0.8586F, 0.4129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.6508F, -0.122F, -0.1051F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.3F, -0.1592F, 0.2486F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.5199F, -0.122F, -0.1051F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-1.0F, -0.9158F, -0.1202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(99, 21).addBox(3.2F, -0.9158F, -0.1202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1F, -0.6624F, -2.7552F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(96, 88).mirror().addBox(-1.0F, -1.1658F, -0.5702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(96, 88).addBox(3.2F, -1.1658F, -0.5702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.1F, 0.3434F, -3.2968F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(53, 92).mirror().addBox(-0.3F, -0.0624F, -1.8682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.3541F, -0.122F, -0.1051F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5657F, 2.2398F, -5.6579F, -1.7408F, -0.0119F, -0.0027F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(59, 44).mirror().addBox(-0.3F, -0.0949F, -1.6026F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.5723F, -0.122F, -0.1051F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(60, 51).mirror().addBox(-0.5F, 0.291F, -0.7915F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.3436F, -2.4796F, -1.6842F, -0.1222F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(34, 92).mirror().addBox(-0.5F, -1.175F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 92).addBox(3.9F, -1.175F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7F, 0.4844F, -0.7477F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-0.3F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4945F, -1.6215F, -0.0487F, -0.122F, -0.1051F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(53, 92).addBox(-0.7F, -0.0624F, -1.8682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.3541F, 0.122F, 0.1051F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, -2.35F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(89, 89).addBox(-1.5F, -1.85F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 1.6126F, -8.4161F, 3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(25, 99).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9573F, 1.6943F, -6.4819F, -1.7414F, 0.0807F, -0.0092F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(7, 84).addBox(-0.9F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8897F, 2.1504F, -7.3693F, -1.6948F, 0.5726F, 0.0412F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5657F, 2.2398F, -5.6579F, -1.7408F, 0.0119F, 0.0027F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(84, 19).addBox(-0.9F, -0.2F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8366F, 2.8743F, -7.6926F, -1.6223F, 0.6397F, -0.1143F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(26, 73).addBox(-0.95F, 0.2495F, -0.5955F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.8105F, -5.4549F, -1.7279F, 0.2269F, -0.0349F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(48, 66).addBox(-0.95F, -2.7505F, -0.5955F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.845F, 2.5133F, -7.3796F, -1.6891F, 0.0544F, -0.0077F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(59, 44).addBox(-0.7F, -0.0949F, -1.6026F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.5723F, 0.122F, 0.1051F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(39, 93).addBox(-0.7F, -0.8586F, 0.4129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.6508F, 0.122F, 0.1051F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(89, 84).addBox(-0.7F, -0.1592F, 0.2486F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.5199F, 0.122F, 0.1051F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(93, 0).addBox(-0.7F, 2.8914F, 0.8421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(88, 96).addBox(-0.7F, 2.4914F, 0.8421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.7381F, 0.122F, 0.1051F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(60, 51).addBox(-0.5F, 0.291F, -0.7915F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2F, 3.3436F, -2.4796F, -1.6842F, 0.1222F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(82, 88).addBox(-1.0F, -0.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5129F, 1.8093F, -8.1195F, 0.0581F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(80, 24).addBox(-0.7F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, 0.4945F, -1.6215F, -0.0487F, 0.122F, 0.1051F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5129F, 1.8093F, -8.1195F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0308F, -3.7781F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(93, 96).addBox(-0.5F, -0.4538F, 0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.035F, 1.6057F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(47, 80).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1644F, 1.119F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3554F, 1.7511F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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