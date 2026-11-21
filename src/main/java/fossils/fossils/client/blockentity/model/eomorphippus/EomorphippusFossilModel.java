package fossils.fossils.client.blockentity.model.eomorphippus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EomorphippusFossilModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck6;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public EomorphippusFossilModel(ModelPart root) {
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
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck2 = this.chest2.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone4 = this.neck2.getChild("bone4");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck6 = this.neck3.getChild("neck6");
		this.neck4 = this.neck6.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.589F, 16.4842F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 100).addBox(0.0F, -1.9986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 51).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2457F, -0.4763F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4451F, -0.2618F, -0.1657F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3815F, -0.1179F, 0.2741F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3815F, 0.1179F, -0.2741F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4451F, 0.2618F, 0.1657F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 2.9807F, -0.9704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(81, 74).addBox(-1.0F, 0.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.4039F, 1.7322F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 26).addBox(-1.0F, 0.0F, 1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 29).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1972F, -0.7717F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(79, 56).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1852F, 0.5182F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 73).addBox(-1.0F, -4.425F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 57).addBox(0.5F, -4.8653F, -1.0619F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.9045F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 47).addBox(0.5F, -0.025F, -1.025F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 1.3109F, 1.5093F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 24).addBox(0.5F, -0.525F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.7292F, -0.1514F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 87).addBox(0.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.7292F, -0.1514F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(91, 55).addBox(4.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.836F, 0.4255F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 39).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.1335F, -0.6522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 9).addBox(-1.0F, 1.1683F, -1.0245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.1586F, -0.4965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 83).addBox(0.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 9.2768F, -0.9186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3104F, 0.3733F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, -2.0112F, 1.5225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, -2.9337F, -0.4013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 91).addBox(-0.5F, -0.2656F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(91, 31).addBox(-0.5F, -0.6448F, -0.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(91, 28).addBox(-0.5F, -1.1448F, -0.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 91).addBox(-0.5F, -2.1128F, -0.4155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 5.279F, -0.1725F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.246F, -0.6159F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2736F, -1.7203F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 3).addBox(-0.5F, -2.299F, -0.7721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 22).addBox(-0.2F, -3.4881F, -1.3332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(82, 17).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 7.924F, -1.255F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 63).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, 2.7064F, 0.8653F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(47, 47).addBox(-2.3F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 11.8341F, -1.1484F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 53).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1754F, -0.0452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 42).addBox(-1.4F, -0.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9246F, 0.5716F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(43, 6).addBox(-2.8F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.925F, 0.475F, -0.5247F, 0.0028F, 0.0093F));

		PartDefinition cube_r35 = leftLeg5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 42).addBox(-2.8F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 2.9807F, -0.9704F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 74).mirror().addBox(-1.0F, 0.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 33).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4039F, 1.7322F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-1.0F, 0.0F, 1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 29).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1972F, -0.7717F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1852F, 0.5182F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 73).mirror().addBox(-1.0F, -4.425F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(36, 57).mirror().addBox(-1.5F, -4.8653F, -1.0619F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.9045F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(42, 47).mirror().addBox(-1.5F, -0.025F, -1.025F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.3109F, 1.5093F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-1.5F, -0.525F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.7292F, -0.1514F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(66, 87).mirror().addBox(-1.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.7292F, -0.1514F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-5.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.836F, 0.4255F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.1335F, -0.6522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-1.0F, 1.1683F, -1.0245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1586F, -0.4965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(34, 83).mirror().addBox(-1.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.2768F, -0.9186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3104F, 0.3733F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.5F, -2.0112F, 1.5225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 87).mirror().addBox(-0.5F, -2.9337F, -0.4013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-0.5F, -0.2656F, -1.2312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-0.5F, -0.6448F, -0.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(91, 28).mirror().addBox(-0.5F, -1.1448F, -0.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-0.5F, -2.1128F, -0.4155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.279F, -0.1725F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.246F, -0.6159F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2736F, -1.7203F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 3).mirror().addBox(-0.5F, -2.299F, -0.7721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7054F, -0.7053F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(13, 22).mirror().addBox(-0.8F, -3.4881F, -1.3332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.924F, -1.255F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 63).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.7064F, 0.8653F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(47, 47).mirror().addBox(-1.7F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 11.8341F, -1.1484F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 53).mirror().addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1754F, -0.0452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-0.6F, -0.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.9246F, 0.5716F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(-1.2F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 2.925F, 0.475F));

		PartDefinition cube_r64 = rightLeg5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(35, 42).mirror().addBox(-1.2F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4869F, 2.1826F, -0.6118F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(58, 0).addBox(0.0851F, -0.1223F, -1.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9399F, -1.1254F, -1.4299F, 0.1834F, 0.5053F, 2.452F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(5, 73).addBox(-1.0F, -1.0F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1892F, -3.092F, -2.9638F, 0.462F, 0.5866F, 2.585F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(52, 30).addBox(0.0851F, -0.1667F, -2.9802F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9399F, -1.1254F, -1.4299F, 0.9165F, 0.5053F, 2.452F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(49, 0).addBox(0.0851F, 0.2056F, -2.2822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9399F, -1.1254F, -1.4299F, 0.4365F, 0.5053F, 2.452F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 5).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.2325F, -2.4882F, -6.3713F, -0.6474F, -0.0552F, 0.9742F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(31, 47).addBox(1.0F, -0.5F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 27).addBox(0.0F, -0.5F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4824F, 0.3367F, -3.3412F, -2.5041F, 0.2964F, -1.9766F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(47, 11).addBox(-2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.8794F, 0.4101F, -4.7706F, -1.0372F, 0.7962F, 0.0525F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 63).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3544F, -0.8362F, -6.2609F, -0.6797F, 0.2906F, 0.7049F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(83, 70).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5139F, -3.1356F, -6.1175F, -1.1719F, -0.8586F, 1.9953F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 42).addBox(-2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9941F, -4.142F, -5.2942F, -2.4197F, -0.4242F, -2.5567F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(48, 24).addBox(-2.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3255F, -3.6141F, -4.1654F, -2.3328F, 0.5874F, -1.6829F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(7, 70).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1195F, 0.9188F, 0.0565F, -2.9119F, 0.279F, -0.4248F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(59, 85).addBox(-0.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6991F, 0.3212F, 0.1348F, 3.0197F, 0.339F, -1.4816F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(53, 68).addBox(-0.9F, -0.325F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9459F, 0.1037F, 0.4846F, 2.9655F, 0.8573F, -1.5746F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(83, 48).addBox(-0.65F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 67).addBox(-0.75F, -0.5F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0318F, 0.5133F, 2.3146F, 2.7156F, -0.4266F, -0.9197F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 9).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1524F, 1.9246F, 2.8109F, 2.5487F, -0.0266F, -0.2198F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 12).addBox(-3.3748F, -0.5F, -1.1981F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 0.8995F, 1.1109F, 2.9479F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(52, 85).addBox(-1.0998F, -0.5F, -1.4481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 1.5885F, 1.2158F, -2.5911F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(83, 45).addBox(-0.925F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7992F, 0.6905F, 1.9985F, 2.011F, 1.1419F, -2.1982F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 0).addBox(-4.5765F, 0.4729F, -0.642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5649F, -2.4004F, -2.0549F, -1.4596F, 1.2268F, -1.2404F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4869F, 2.1826F, -0.6118F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-1.0851F, -0.1223F, -1.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9399F, -1.1254F, -1.4299F, 0.1834F, -0.5053F, -2.452F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(0.0F, -1.0F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1892F, -3.092F, -2.9638F, 0.462F, -0.5866F, -2.585F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-1.0851F, -0.1667F, -2.9802F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9399F, -1.1254F, -1.4299F, 0.9165F, -0.5053F, -2.452F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.0851F, 0.2056F, -2.2822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9399F, -1.1254F, -1.4299F, 0.4365F, -0.5053F, -2.452F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(63, 5).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2325F, -2.4882F, -6.3713F, -0.6474F, 0.0552F, -0.9742F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 47).mirror().addBox(-3.0F, -0.5F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 27).mirror().addBox(-1.0F, -0.5F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4824F, 0.3367F, -3.3412F, -2.5041F, -0.2964F, 1.9766F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.8794F, 0.4101F, -4.7706F, -1.0372F, -0.7962F, -0.0525F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3544F, -0.8362F, -6.2609F, -0.6797F, -0.2906F, -0.7049F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5139F, -3.1356F, -6.1175F, -1.1719F, 0.8586F, -1.9953F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9941F, -4.142F, -5.2942F, -2.4197F, 0.4242F, 2.5567F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-1.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3255F, -3.6141F, -4.1654F, -2.3328F, -0.5874F, 1.6829F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1195F, 0.9188F, 0.0565F, -2.9119F, -0.279F, 0.4248F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-1.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6991F, 0.3212F, 0.1348F, 3.0197F, -0.339F, 1.4816F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-2.1F, -0.325F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 0.1037F, 0.4846F, 2.9655F, -0.8573F, 1.5746F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-1.35F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 67).mirror().addBox(-2.25F, -0.5F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0318F, 0.5133F, 2.3146F, 2.7156F, 0.4266F, 0.9197F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1524F, 1.9246F, 2.8109F, 2.5487F, 0.0266F, 0.2198F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(0.3748F, -0.5F, -1.1981F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 0.8995F, -1.1109F, -2.9479F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(52, 85).mirror().addBox(-0.9002F, -0.5F, -1.4481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 1.5885F, -1.2158F, 2.5911F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(83, 45).mirror().addBox(-1.075F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7992F, 0.6905F, 1.9985F, 2.011F, -1.1419F, 2.1982F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(1.5765F, 0.4729F, -0.642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5649F, -2.4004F, -2.0549F, -1.4596F, -1.2268F, 1.2404F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(43, 100).addBox(0.0F, -1.9354F, -0.1789F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6549F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 20).addBox(0.0F, -1.9589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(100, 40).addBox(0.0F, -1.8945F, -0.5572F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8144F, -2.2389F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2571F, -0.1961F, -0.2596F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-1.9F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6005F, -0.2507F, -0.2599F, -0.1556F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(84, 7).mirror().addBox(-1.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7725F, -4.4268F, -0.0672F, -0.1093F, -0.2615F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(84, 7).addBox(-0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7725F, -4.4268F, -0.0672F, 0.1093F, 0.2615F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(52, 88).addBox(-0.1F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6005F, -0.2507F, 0.2599F, 0.1556F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(87, 82).addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2571F, 0.1961F, 0.2596F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, -0.1513F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(89, 93).addBox(0.0F, -2.2408F, 0.0224F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 95).addBox(0.0F, -2.2094F, -0.0811F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 88).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.367F, -1.6528F, 0.0442F, 0.0383F, -0.3343F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 75).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.467F, -3.5528F, -0.2829F, 0.4196F, -0.7046F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.467F, -3.5528F, -0.3814F, 0.3337F, -0.9708F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.467F, -3.5528F, -0.4757F, 0.1648F, -1.3472F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(59, 88).addBox(-0.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.367F, -1.6528F, 0.0442F, -0.0383F, 0.3343F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(62, 75).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.467F, -3.5528F, -0.2829F, -0.4196F, 0.7046F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(76, 0).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.467F, -3.5528F, -0.3814F, -0.3337F, 0.9708F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(73, 36).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.467F, -3.5528F, -0.4757F, -0.1648F, 1.3472F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.1053F, 0.1727F, 0.006F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 36).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.1454F, 0.5177F, -0.6074F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.2826F, 0.4617F, -0.8975F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(37, 32).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.4391F, 0.3178F, -1.3036F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.3868F, -0.4349F, 0.3348F, -1.3371F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(75, 24).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.3868F, -0.2709F, 0.4757F, -0.9271F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(53, 75).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.3868F, -0.1292F, 0.5281F, -0.6342F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 75).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.3868F, -0.1292F, -0.5281F, 0.6342F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 24).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.3868F, -0.2709F, -0.4757F, 0.9271F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(48, 28).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.3868F, -0.4349F, -0.3348F, 1.3371F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(37, 32).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.4391F, -0.3178F, 1.3036F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 40).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.2826F, -0.4617F, 0.8975F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 38).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.1454F, -0.5177F, 0.6074F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(28, 92).addBox(0.0F, -2.4611F, -0.1182F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(23, 63).addBox(0.0F, -2.6088F, 0.0394F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(24, 40).addBox(-0.5F, -0.8311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3341F, -3.7576F, 0.3319F, 0.0413F, 0.0142F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 92).addBox(0.0F, -2.7745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8311F, -0.9471F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 95).addBox(0.0F, -3.0501F, 0.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8311F, -2.9471F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2855F, -2.4155F, -0.4828F, 0.0583F, -1.2632F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2855F, -2.4155F, -0.4285F, 0.2369F, -0.8992F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2855F, -2.4155F, -0.3566F, 0.3376F, -0.647F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0855F, -0.4155F, -0.5027F, 0.0456F, -1.2803F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0855F, -0.4155F, -0.4522F, 0.2321F, -0.9207F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 46).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0855F, -0.4155F, -0.3815F, 0.3387F, -0.6713F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 46).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0855F, -0.4155F, -0.3815F, -0.3387F, 0.6713F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 44).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0855F, -0.4155F, -0.4522F, -0.2321F, 0.9207F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 14).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.0855F, -0.4155F, -0.5027F, -0.0456F, 1.2803F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(74, 42).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2855F, -2.4155F, -0.3566F, -0.3376F, 0.647F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 34).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2855F, -2.4155F, -0.4285F, -0.2369F, 0.8992F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 18).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2855F, -2.4155F, -0.4828F, -0.0583F, 1.2632F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3466F, -3.8819F, -0.2288F, -0.1275F, 0.0296F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(15, 89).addBox(0.0F, -3.7226F, -0.0168F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 87).addBox(0.0F, -3.8222F, -0.0133F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(19, 18).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4223F, 0.3133F, -1.2476F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.2682F, 0.4512F, -0.8404F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.1346F, 0.504F, -0.5514F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4105F, 0.3463F, -1.2438F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.242F, 0.477F, -0.8286F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.1003F, 0.522F, -0.5345F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(74, 54).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.1003F, -0.522F, 0.5345F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(74, 52).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.242F, -0.477F, 0.8286F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(38, 18).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4105F, -0.3463F, 1.2438F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 50).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.1346F, -0.504F, 0.5514F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(74, 48).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.2682F, -0.4512F, 0.8404F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(19, 18).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4223F, -0.3133F, 1.2476F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.337F, -3.76F, 0.22F, 0.1278F, 0.0285F));

		PartDefinition cube_r170 = chest2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(35, 88).addBox(0.0F, -4.4226F, -0.0168F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(12, 81).addBox(0.0F, -4.6222F, -0.0133F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-8.1F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1742F, 11.427F, 4.7152F, -0.3079F, 0.8986F, 0.3221F));

		PartDefinition cube_r173 = chest2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-7.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0475F, 11.5393F, 4.4668F, -0.3174F, 0.7665F, 0.1918F));

		PartDefinition cube_r174 = chest2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(-7.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6908F, 11.6703F, 4.1341F, -0.3063F, 0.5377F, 0.1234F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-6.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9994F, 11.3725F, 4.0179F, -0.2686F, 0.3899F, 0.0529F));

		PartDefinition cube_r176 = chest2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(37, 34).mirror().addBox(-5.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 10.3289F, 0.0619F, -0.2119F, 0.2092F, 0.4352F));

		PartDefinition cube_r177 = chest2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(48, 36).mirror().addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1085F, 9.6591F, -1.6811F, -0.3134F, 0.1949F, 0.5552F));

		PartDefinition cube_r178 = chest2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-5.4458F, -0.1791F, -0.3922F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2995F, 11.2575F, 3.1568F, -0.007F, 0.2356F, 0.3647F));

		PartDefinition cube_r179 = chest2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(37, 30).mirror().addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1371F, 11.0736F, 2.0453F, -0.0717F, 0.1953F, 0.4867F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4548F, 0.2136F, -1.2915F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.3418F, 0.3713F, -0.9053F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.2324F, 0.4459F, -0.6316F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4449F, 0.2471F, -1.2892F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.3184F, 0.3987F, -0.8965F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.2009F, 0.4664F, -0.6177F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(37, 73).mirror().addBox(-3.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9119F, 8.6402F, -3.482F, -0.3391F, 0.0242F, 0.7679F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(74, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.2009F, -0.4664F, 0.6177F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(74, 64).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.3184F, -0.3987F, 0.8965F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(60, 15).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4449F, -0.2471F, 1.2892F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(74, 62).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.2324F, -0.4459F, 0.6316F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(74, 60).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.3418F, -0.3713F, 0.9053F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(47, 16).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4548F, -0.2136F, 1.2915F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(24, 34).addBox(-2.6701F, -0.9335F, 0.0466F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6701F, 11.3391F, 0.8676F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(37, 30).addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1371F, 11.0736F, 2.0453F, -0.0717F, -0.1953F, -0.4867F));

		PartDefinition cube_r195 = chest2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(32, 22).addBox(-1.5542F, -0.1791F, -0.3922F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2995F, 11.2575F, 3.1568F, -0.007F, -0.2356F, -0.3647F));

		PartDefinition cube_r196 = chest2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 11).addBox(-2.6701F, 1.7382F, -7.8036F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6701F, 9.6391F, 3.0676F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(37, 73).addBox(0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9119F, 8.6402F, -3.482F, -0.3391F, -0.0242F, -0.7679F));

		PartDefinition cube_r198 = chest2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(48, 36).addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1085F, 9.6591F, -1.6811F, -0.3134F, -0.1949F, -0.5552F));

		PartDefinition cube_r199 = chest2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(37, 34).addBox(-0.9F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 10.3289F, 0.0619F, -0.2119F, -0.2092F, -0.4352F));

		PartDefinition cube_r200 = chest2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(62, 17).addBox(-2.6701F, 1.3227F, -3.1483F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6701F, 9.6391F, 3.0676F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(32, 20).addBox(-0.6F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9994F, 11.3725F, 4.0179F, -0.2686F, -0.3899F, -0.0529F));

		PartDefinition cube_r202 = chest2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(30, 16).addBox(0.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6908F, 11.6703F, 4.1341F, -0.3063F, -0.5377F, -0.1234F));

		PartDefinition cube_r203 = chest2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0475F, 11.5393F, 4.4668F, -0.3174F, -0.7665F, -0.1918F));

		PartDefinition cube_r204 = chest2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 9).addBox(-0.9F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1742F, 11.427F, 4.7152F, -0.3079F, -0.8986F, -0.3221F));

		PartDefinition cube_r205 = chest2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(11, 42).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3707F, -3.5804F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(39, 83).addBox(0.0F, -4.8489F, -0.0609F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -5.2489F, 0.0391F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.7717F, -0.0432F, -0.8004F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(74, 70).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.746F, -0.2239F, -0.9918F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.6303F, -0.4813F, -1.3215F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-4.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.7959F, -0.2966F, -1.1011F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(74, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.8327F, -0.1057F, -0.918F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(74, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.8327F, 0.1057F, 0.918F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(43, 90).addBox(2.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.7959F, 0.2966F, 1.1011F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 64).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.6303F, 0.4813F, 1.3215F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(74, 70).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.746F, 0.2239F, 0.9918F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(74, 68).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.7717F, 0.0432F, 0.8004F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(47, 52).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.4226F, -4.8674F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(55, 90).addBox(-0.475F, -1.225F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r220 = leftarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(42, 85).addBox(-0.5F, -2.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(90, 46).addBox(-0.5F, -1.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.6489F, 0.1883F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(18, 58).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.8469F, -0.1371F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(96, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.881F, -0.3959F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(18, 97).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.0782F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.8626F, 1.1732F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftarm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(93, 73).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 8.4433F, 0.6813F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(47, 97).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0534F, 2.0408F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(23, 97).addBox(-0.5F, 1.6F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(85, 85).addBox(-0.5F, -1.825F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5069F, -1.3866F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(93, 50).addBox(-0.5F, -0.75F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5708F, -0.9613F, -2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 25).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3751F, -0.4596F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(28, 97).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6537F, 0.9051F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(43, 92).addBox(-0.5F, -1.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -1.0996F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.856F, 1.0585F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(79, 78).addBox(0.1F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.9127F, 1.0059F, 1.5708F, 0.7679F, -1.5708F));

		PartDefinition cube_r235 = leftarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(86, 32).addBox(-0.3811F, -0.9086F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3236F, -1.5769F, 0.6542F, 1.5708F, 1.0734F, -1.5708F));

		PartDefinition cube_r236 = leftarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(82, 36).addBox(-0.9229F, -0.4141F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3236F, -1.5769F, 0.6542F, 1.5708F, -0.5847F, -1.5708F));

		PartDefinition cube_r237 = leftarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 82).addBox(-1.1229F, -0.4141F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -1.5769F, 0.6542F, 1.5708F, -0.192F, -1.5708F));

		PartDefinition cube_r238 = leftarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(50, 90).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7764F, 7.8788F, 0.1793F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition cube_r239 = leftarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 82).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7764F, 5.1172F, -0.2828F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r240 = leftarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(41, 66).addBox(-0.6F, -2.65F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7764F, 2.8273F, -0.0207F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r241 = leftarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(75, 82).addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.1763F, -0.1504F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition cube_r242 = leftarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(47, 85).addBox(-0.025F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 6.1589F, 0.2231F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r243 = leftarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 78).addBox(-0.425F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3236F, 3.6335F, 0.4037F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(-0.2F, 9.0969F, 1.3286F));

		PartDefinition cube_r244 = leftArm3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 58).addBox(0.2F, -1.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftArm3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(77, 6).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(65, 56).addBox(-1.0F, -0.2399F, -0.3908F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.0435F, -0.2403F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(58, 48).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 3.3345F, 0.8567F, -1.0734F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create().texOffs(48, 38).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.4226F, -4.8674F, 0.2955F, -0.0136F, 0.174F));

		PartDefinition cube_r246 = rightarm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(-0.525F, -1.225F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r247 = rightarm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-0.5F, -2.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(90, 46).mirror().addBox(-0.5F, -1.5F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6489F, 0.1883F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightarm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8469F, -0.1371F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightarm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(96, 76).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.881F, -0.3959F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightarm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(18, 97).mirror().addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.0782F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightarm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8626F, 1.1732F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightarm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.4433F, 0.6813F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightarm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(47, 97).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0534F, 2.0408F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightarm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(23, 97).mirror().addBox(-0.5F, 1.6F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.5F, -1.825F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5069F, -1.3866F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(-0.5F, -0.75F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5708F, -0.9613F, -2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(93, 25).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3751F, -0.4596F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6537F, 0.9051F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightarm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-0.5F, -1.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -1.0996F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.856F, 1.0585F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightarm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 78).mirror().addBox(-1.1F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2236F, -0.9127F, 1.0059F, 1.5708F, -0.7679F, 1.5708F));

		PartDefinition cube_r262 = rightarm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(-0.6189F, -0.9086F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -1.5769F, 0.6542F, 1.5708F, -1.0734F, 1.5708F));

		PartDefinition cube_r263 = rightarm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-1.0771F, -0.4141F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -1.5769F, 0.6542F, 1.5708F, 0.5847F, 1.5708F));

		PartDefinition cube_r264 = rightarm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.8771F, -0.4141F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -1.5769F, 0.6542F, 1.5708F, 0.192F, 1.5708F));

		PartDefinition cube_r265 = rightarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7764F, 7.8788F, 0.1793F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition cube_r266 = rightarm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7764F, 5.1172F, -0.2828F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r267 = rightarm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(41, 66).mirror().addBox(-0.4F, -2.65F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7764F, 2.8273F, -0.0207F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r268 = rightarm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 2.1763F, -0.1504F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r269 = rightarm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(-0.975F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 6.1589F, 0.2231F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r270 = rightarm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.575F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 3.6335F, 0.4037F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(0.2F, 9.0969F, 1.3286F));

		PartDefinition cube_r271 = rightArm3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(93, 58).mirror().addBox(-1.2F, -1.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r272 = rightArm3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-1.0F, -0.2399F, -0.3908F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0435F, -0.2403F, 0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-2.0F, -0.5F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.7822F, -0.0122F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-2.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, 0.9F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7082F, 1.1713F, -2.4595F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(67, 41).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0252F, 1.9197F, 1.3709F, 1.9065F, 0.169F, -0.3803F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1567F, -0.7498F, 6.3251F, 2.3025F, 0.1857F, -0.3986F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0239F, -0.0808F, 5.5939F, -2.7328F, 0.1857F, -0.3986F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 73).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.419F, -1.5967F, 6.7877F, 1.0807F, 0.1857F, -0.3986F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(76, 9).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7794F, -2.5192F, 6.9258F, -0.141F, 0.1857F, -0.3986F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.627F, -4.1382F, 6.1132F, -2.279F, 0.1857F, -0.3986F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-1.9685F, -1.6197F, -0.7663F, 1.2989F, 0.1857F, -0.3986F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.6403F, -0.7127F, -1.0303F, -0.0101F, 0.1857F, -0.3986F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.2309F, -2.4666F, -0.3037F, 2.6515F, 0.1857F, -0.3986F));

		PartDefinition cube_r282 = bone2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.5992F, -3.9597F, 0.9749F, -2.279F, 0.1857F, -0.3986F));

		PartDefinition cube_r283 = bone2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(57, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.6782F, -4.5398F, 1.7856F, -0.97F, 0.1857F, -0.3986F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.6838F, -4.9861F, 2.6805F, 0.4262F, 0.1857F, -0.3986F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(27, 57).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.5975F, -5.2466F, 3.6421F, 1.7789F, 0.1857F, -0.3986F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(89, 2).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-2.3904F, -5.2283F, 4.6202F, 3.0442F, 0.1857F, -0.3986F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(46, 62).addBox(-0.5F, -1.075F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1972F, -2.8489F, 5.5575F, -1.1446F, 0.1857F, -0.3986F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(27, 62).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4237F, 0.6746F, 1.9104F, 0.3881F, 0.169F, -0.3803F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(37, 24).addBox(-1.5272F, -1.3788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F))
				.texOffs(13, 36).addBox(-1.5272F, -1.9788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 0.7982F, 0.169F, -0.3803F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(66, 36).addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.9711F, 0.169F, -0.3803F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 60).addBox(-1.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -0.175F, -2.5F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6157F, 0.5002F, 0.3011F, 0.6811F, -0.2758F, 0.0865F));

		PartDefinition bone4 = neck2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7082F, 1.1713F, -2.4595F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r293 = bone4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 41).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0252F, 1.9197F, 1.3709F, 1.9065F, -0.169F, 0.3803F));

		PartDefinition cube_r294 = bone4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1567F, -0.7498F, 6.3251F, 2.3025F, -0.1857F, 0.3986F));

		PartDefinition cube_r295 = bone4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0239F, -0.0808F, 5.5939F, -2.7328F, -0.1857F, 0.3986F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.5967F, 6.7877F, 1.0807F, -0.1857F, 0.3986F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7794F, -2.5192F, 6.9258F, -0.141F, -0.1857F, 0.3986F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.627F, -4.1382F, 6.1132F, -2.279F, -0.1857F, 0.3986F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(1.9685F, -1.6197F, -0.7663F, 1.2989F, -0.1857F, 0.3986F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.6403F, -0.7127F, -1.0303F, -0.0101F, -0.1857F, 0.3986F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.2309F, -2.4666F, -0.3037F, 2.6515F, -0.1857F, 0.3986F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.5992F, -3.9597F, 0.9749F, -2.279F, -0.1857F, 0.3986F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 38).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.6782F, -4.5398F, 1.7856F, -0.97F, -0.1857F, 0.3986F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.6838F, -4.9861F, 2.6805F, 0.4262F, -0.1857F, 0.3986F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(27, 57).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.5975F, -5.2466F, 3.6421F, 1.7789F, -0.1857F, 0.3986F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(89, 2).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(2.3904F, -5.2283F, 4.6202F, 3.0442F, -0.1857F, 0.3986F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.5F, -1.075F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.1972F, -2.8489F, 5.5575F, -1.1446F, -0.1857F, 0.3986F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4237F, 0.6746F, 1.9104F, 0.3881F, -0.169F, 0.3803F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(0.5272F, -1.3788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(13, 36).mirror().addBox(0.5272F, -1.9788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 0.7982F, -0.169F, 0.3803F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.9711F, -0.169F, 0.3803F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(0.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3F, -0.175F, -2.5F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6157F, 0.5002F, 0.3011F, 0.6811F, 0.2758F, -0.0865F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.9633F, 0.2291F, -0.2214F));

		PartDefinition cube_r313 = neck.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 89).addBox(0.0F, -3.1828F, -0.0159F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 66).mirror().addBox(-1.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0303F, -1.3555F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r315 = neck.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(88, 66).addBox(-0.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0303F, -1.3555F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition cube_r316 = neck.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(58, 10).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(46, 100).addBox(0.0F, -2.4F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.4889F, 0.2178F, -0.0454F));

		PartDefinition cube_r317 = neck3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(75, 93).addBox(0.0F, -2.6F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r318 = neck3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-0.9F, 0.2F, -2.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 90).mirror().addBox(-0.9F, 0.2F, -4.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.055F, 1.3133F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r319 = neck3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(3, 90).addBox(-1.1F, 0.2F, -4.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 68).addBox(-1.1F, 0.2F, -2.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.055F, 1.3133F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition neck6 = neck3.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(56, 57).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(49, 100).addBox(0.0F, -2.1F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0194F, -2.9276F, -0.5094F, 0.1733F, 0.0646F));

		PartDefinition cube_r320 = neck6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-0.9F, 0.2F, -3.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.055F, 1.3133F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r321 = neck6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(89, 36).addBox(-1.1F, 0.2F, -3.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.055F, 1.3133F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition neck4 = neck6.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 100).addBox(0.0F, -1.3089F, -0.9336F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4911F, -3.0664F, 0.2114F, 0.0769F, 0.282F));

		PartDefinition cube_r322 = neck4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(84, 2).addBox(0.0F, -1.1F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-0.4F, 0.2F, -5.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4361F, 4.3798F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r324 = neck4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(61, 36).addBox(-0.6F, 0.2F, -5.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4361F, 4.3798F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(46, 73).addBox(-0.5F, -0.1069F, -2.0175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0042F, -1.8069F, 0.2727F, 0.1261F, 0.0352F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1522F, -1.7299F, -0.1132F, 0.2184F, 0.3159F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(9, 53).addBox(-1.0F, -1.7F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3017F, -1.1299F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(36, 0).addBox(-0.995F, 0.6238F, -1.7079F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.053F, -2.6492F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.9156F, -3.0891F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 6.7999F, -7.5909F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(15, 80).addBox(-0.5F, -0.35F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 4.8215F, -8.8918F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(15, 11).addBox(-1.0F, -0.5444F, -0.5909F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 6.1413F, -6.9622F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(23, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.7766F, -8.7705F, 2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(18, 94).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.9149F, -8.2629F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(94, 3).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.1836F, -7.5809F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -1.575F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.0426F, -6.0502F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(22, 46).addBox(-0.505F, -1.2558F, 1.1926F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 3.5674F, -7.0768F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 65).addBox(-0.505F, -1.8881F, -2.4425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.005F, -0.053F, -2.6492F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(83, 60).addBox(-0.995F, -1.8628F, -1.505F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.495F, -0.053F, -2.6492F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 99).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.5046F, -1.9491F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(23, 7).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.1219F, -2.873F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(60, 90).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.5555F, -3.6971F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(44, 77).addBox(0.0F, 0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 29).addBox(0.0F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -3.5384F, -1.4808F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(39, 95).addBox(0.0F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 38).addBox(0.0F, -1.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -2.1992F, -1.6094F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(70, 29).addBox(0.0F, -0.2F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -2.648F, -2.9506F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(42, 81).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.5365F, -4.1015F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(67, 71).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.1297F, -3.981F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(70, 82).addBox(-0.995F, -1.7997F, -0.7101F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.495F, -0.053F, -2.6492F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(33, 97).addBox(-1.0F, -0.35F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -2.2024F, -1.3774F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7791F, 4.6615F, -4.5745F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 42).addBox(-0.4891F, -0.626F, -1.402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0465F, -6.2714F, 3.9157F, -1.9588F, -1.4363F, -0.6058F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(16, 71).addBox(-0.4891F, -1.0F, -0.8105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0465F, -6.2714F, 3.9157F, 3.0154F, -1.4363F, -0.6058F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(71, 15).addBox(-0.4891F, -1.374F, -2.402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0465F, -6.2714F, 3.9157F, 1.7064F, -1.4363F, -0.6058F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(92, 96).addBox(0.5104F, -1.41F, 1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.4133F, -0.1088F, -0.3217F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(3, 92).addBox(-1.4342F, -0.9106F, -1.5069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 1.05F, 1.4085F, 2.4365F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(63, 94).addBox(-1.4596F, -0.9106F, -0.2974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.1718F, 0.6099F, 1.4913F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(5, 77).addBox(-0.3594F, -0.7831F, -1.0143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.3855F, -0.855F, 1.2666F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(68, 94).addBox(1.6724F, -1.2638F, 0.7987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.3159F, -2.8441F, 1.7415F, 1.1196F, 1.0639F, 2.8256F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(38, 90).addBox(-0.5F, -0.8853F, -0.0734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4377F, -4.4906F, -0.4301F, 0.8896F, -0.7239F, 1.2055F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, -0.9427F, -1.4381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4377F, -4.4906F, -0.4301F, 0.4969F, -0.7239F, 1.2055F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(18, 90).addBox(-0.825F, -0.5F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4009F, -3.1767F, -1.8846F, 0.2399F, 0.2919F, 1.6741F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(90, 13).addBox(-0.825F, -0.5F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3446F, -2.4939F, -2.0286F, 2.3056F, 1.259F, -2.3491F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(83, 94).addBox(1.0733F, -0.5883F, 0.5827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.565F, -0.7281F, -0.4483F, 2.911F, 0.0902F, -1.5589F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5F, -0.5F, -1.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1306F, 1.5611F, -4.0309F, 3.0583F, -1.2324F, -1.7794F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 23).addBox(-0.5F, -0.525F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(94, 90).addBox(-0.5F, -0.525F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1306F, 1.5611F, -4.0309F, 2.7878F, -1.2324F, -1.7794F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(94, 80).addBox(-1.0055F, -0.5883F, 0.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.565F, -0.7281F, -0.4483F, 2.6771F, -1.0378F, -1.1304F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(78, 94).addBox(-1.3983F, -0.5883F, -0.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.565F, -0.7281F, -0.4483F, 0.3689F, -0.8878F, 1.3125F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(48, 94).addBox(-0.8681F, -0.5883F, -0.8067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.565F, -0.7281F, -0.4483F, 0.2298F, 0.0373F, 1.6126F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(91, 77).addBox(-0.9918F, -1.3022F, 1.657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 94).addBox(-1.1725F, -1.3022F, 1.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 2.4646F, 0.5044F, -1.7365F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(8, 92).addBox(-2.0628F, -1.3022F, -0.6914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 2.3964F, -0.6287F, -0.8688F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(58, 94).addBox(0.9177F, -1.2638F, -2.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3159F, -2.8441F, 1.7415F, 0.4736F, -0.2912F, 1.6149F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(96, 31).addBox(1.891F, -1.3022F, -0.1716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.7452F, 0.6287F, 2.2728F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(95, 83).addBox(-1.5518F, -0.7831F, -1.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 2.4688F, -1.1637F, -0.9462F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(22, 77).addBox(-0.4799F, -0.7831F, -1.5928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.5617F, -1.0892F, 1.055F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(34, 94).addBox(-0.459F, -0.7831F, -1.6958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.3383F, -0.7325F, 1.3327F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(77, 2).addBox(-0.8285F, -0.7774F, -1.0108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 0.5677F, -1.0937F, 1.0541F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(90, 84).addBox(0.223F, -0.9106F, 0.0567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 2.9337F, -0.8242F, -1.5958F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(90, 70).addBox(0.3035F, -0.9106F, -1.6518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 68).addBox(0.3035F, -0.9106F, -2.3518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7095F, -2.9201F, 1.9891F, 2.9838F, 0.4689F, -1.8211F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(38, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.675F, 3.0882F, -4.9637F, 2.1353F, -0.0154F, -3.1165F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 51).addBox(-0.5F, -0.2F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6232F, 2.0292F, -3.3318F, -0.3082F, -0.0154F, -3.1165F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(30, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6455F, 2.2438F, -4.4288F, 0.9135F, -0.0154F, -3.1165F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1869F, 3.9183F, -4.3957F, 2.528F, -0.0154F, -3.1165F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7166F, 2.932F, -4.855F, 1.7045F, -0.5603F, -1.8138F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(97, 96).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7544F, 3.3403F, -4.5688F, 1.7657F, -0.9481F, -1.9013F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(99, 3).addBox(-1.2797F, -0.0693F, -0.8472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4014F, 4.0829F, -3.7979F, 0.2801F, -0.0612F, 0.0073F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(99, 0).addBox(-1.2797F, -0.74F, -0.8306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4014F, 4.0829F, -3.7979F, 0.1056F, -0.0612F, 0.0073F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(98, 73).addBox(-0.4957F, -0.8021F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4014F, 4.0829F, -3.7979F, 0.1485F, -0.2156F, -0.1348F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(72, 98).addBox(-0.4957F, -0.099F, -0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4014F, 4.0829F, -3.7979F, 0.323F, -0.2156F, -0.1348F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(98, 56).addBox(-0.35F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(10, 98).addBox(-0.65F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.1133F, 4.0078F, -3.5094F, 0.498F, -0.711F, -0.6343F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(98, 59).addBox(-0.35F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(5, 98).addBox(-0.65F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1133F, 4.0078F, -3.5094F, 0.3234F, -0.711F, -0.6343F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(98, 50).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4698F, 2.5093F, -4.351F, 1.1605F, -0.5282F, -0.5115F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(97, 93).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5076F, 2.9176F, -4.0649F, 0.7242F, -0.5282F, -0.5115F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(56, 81).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0731F, 2.0074F, -3.5824F, 0.2638F, -0.6499F, 0.482F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(49, 81).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2875F, 2.6722F, -3.5538F, 0.64F, -0.2901F, -0.302F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(11, 48).addBox(-2.0F, 0.0F, -1.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7915F, 1.3203F, -2.5647F, 0.3295F, -0.5277F, 1.0213F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(65, 52).addBox(-1.0F, -0.375F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2919F, -0.5615F, -1.4087F, 0.4163F, -0.589F, 1.236F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(70, 26).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6446F, -0.0458F, -4.3643F, 2.7349F, -0.8286F, -1.456F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(97, 15).addBox(-0.475F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4562F, 0.5728F, -4.1247F, 0.6295F, -1.0994F, 0.8026F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, 0.125F, -1.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7915F, 1.3203F, -2.5647F, 0.3252F, -0.5791F, 1.1957F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(95, 9).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2791F, -0.8849F, -4.196F, 2.8087F, 0.3313F, -0.112F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2791F, -1.7466F, -3.6885F, -2.1307F, 0.2991F, -0.1827F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(90, 38).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0678F, -2.1854F, -2.5052F, -0.8894F, -0.0605F, 0.5026F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(90, 9).addBox(-0.475F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.407F, -1.3547F, -2.5351F, -1.0096F, 0.4135F, -0.1406F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -1.625F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.407F, -1.3547F, -2.5351F, -1.0352F, 0.3017F, -0.2134F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(5, 95).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2791F, -2.4779F, -3.0065F, -0.7816F, 0.2528F, -0.2433F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(95, 12).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2791F, -3.0443F, -2.1823F, 1.9477F, 0.9859F, 1.4991F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(10, 95).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2791F, -2.7611F, -2.5944F, 0.5571F, 0.2417F, -0.3669F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(60, 71).addBox(-0.5551F, -1.4029F, -0.9133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(53, 71).addBox(-0.5551F, -0.7029F, -0.9133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7413F, 0.2179F, 0.3304F, -0.6416F, 0.188F, 0.1291F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(34, 66).addBox(-0.5869F, -0.929F, -1.9018F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7413F, 0.2179F, 0.3304F, 0.7433F, 0.1354F, 0.0585F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(86, 56).addBox(-0.5F, -0.8867F, -0.7537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7935F, 2.8807F, -2.85F, 0.492F, -0.1959F, -0.3526F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, -1.0908F, -0.1124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7935F, 2.8807F, -2.85F, 0.5793F, -0.1959F, -0.3526F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.4106F, -1.9754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3659F, 0.8503F, -1.0766F, 0.5671F, 0.0656F, -0.0463F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(58, 43).addBox(-0.5F, -0.4356F, -2.9754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3659F, 0.8503F, -1.0766F, 0.6107F, 0.0656F, -0.0463F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(99, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4272F, -5.5388F, 3.5387F, 3.0062F, 0.2744F, -3.0025F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 100).addBox(-0.9247F, -0.2536F, -0.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2587F, -6.2613F, 2.7086F, 3.0915F, 0.0715F, -2.1835F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(100, 12).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2791F, -7.1661F, 2.6254F, -3.0798F, 0.0617F, -0.7835F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(51, 77).addBox(0.025F, 0.0F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1605F, -5.5647F, 2.2063F, 1.1835F, 0.0665F, -2.9801F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(95, 64).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5354F, -6.6404F, 2.8431F, 0.2903F, 0.3189F, -2.2193F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(95, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5354F, -6.2577F, 1.9193F, 1.3375F, 0.3189F, -2.2193F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(95, 47).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2791F, -7.1661F, 2.6254F, 2.4269F, 1.2759F, -0.1624F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(95, 41).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2791F, -6.7834F, 1.7015F, 1.8041F, 0.3189F, -0.9223F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(79, 90).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1081F, -5.0765F, 1.6612F, -0.595F, 0.0985F, -2.9973F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(100, 9).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5354F, -5.7481F, 1.1997F, -0.3755F, 0.4825F, -2.2751F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(98, 99).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2791F, -6.217F, 0.8774F, 0.3755F, 0.4825F, -0.8665F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(61, 32).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1169F, -4.5071F, 1.1319F, -1.8554F, 0.7728F, 2.321F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(61, 28).addBox(0.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1176F, -4.5042F, 1.1336F, -1.2445F, 0.7728F, 2.321F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(71, 87).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.119F, -4.8551F, 1.4974F, -0.756F, 0.1509F, -2.9835F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(23, 91).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5446F, -5.0999F, 0.566F, 0.3232F, 0.6053F, -2.3427F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(91, 6).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5446F, -5.4473F, 0.9256F, -0.5058F, 0.6053F, -2.3427F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(91, 22).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2791F, -5.5159F, 0.1643F, 0.4145F, -0.1464F, -1.1683F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(89, 90).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2791F, -5.8632F, 0.524F, 0.5058F, 0.6053F, -0.7989F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(30, 7).addBox(0.2F, -0.3F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.7791F, 2.1384F, -3.0164F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(95, 67).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2791F, -5.1421F, -0.1477F, 0.5695F, 0.7024F, -0.7899F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(31, 52).addBox(-0.5F, -0.4356F, -0.1246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3659F, 0.8503F, -1.0766F, 0.7128F, 0.2033F, 0.0617F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(63, 81).addBox(-1.0889F, -1.2938F, 1.101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0595F, -3.5274F, 1.4312F, 0.0052F, 0.4885F, -1.4812F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7791F, 4.6615F, -4.5745F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-0.5109F, -0.626F, -1.402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0465F, -6.2714F, 3.9157F, -1.9588F, 1.4363F, 0.6058F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(16, 71).mirror().addBox(-0.5109F, -1.0F, -0.8105F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0465F, -6.2714F, 3.9157F, 3.0154F, 1.4363F, 0.6058F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-0.5109F, -1.374F, -2.402F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0465F, -6.2714F, 3.9157F, 1.7064F, 1.4363F, 0.6058F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-1.5104F, -1.41F, 1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.4133F, 0.1088F, 0.3217F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(0.4342F, -0.9106F, -1.5069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 1.05F, -1.4085F, -2.4365F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(63, 94).mirror().addBox(0.4596F, -0.9106F, -0.2974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.1718F, -0.6099F, -1.4913F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.6406F, -0.7831F, -1.0143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.3855F, 0.855F, -1.2666F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(-2.6724F, -1.2638F, 0.7987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.3159F, -2.8441F, 1.7415F, 1.1196F, -1.0639F, -2.8256F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(38, 90).mirror().addBox(-0.5F, -0.8853F, -0.0734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4377F, -4.4906F, -0.4301F, 0.8896F, 0.7239F, -1.2055F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.5F, -0.9427F, -1.4381F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4377F, -4.4906F, -0.4301F, 0.4969F, 0.7239F, -1.2055F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(18, 90).mirror().addBox(-0.175F, -0.5F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4009F, -3.1767F, -1.8846F, 0.2399F, -0.2919F, -1.6741F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(-0.175F, -0.5F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3446F, -2.4939F, -2.0286F, 2.3056F, -1.259F, 2.3491F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-2.0733F, -0.5883F, 0.5827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.565F, -0.7281F, -0.4483F, 2.911F, -0.0902F, 1.5589F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(-1.5F, -0.5F, -1.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1306F, 1.5611F, -4.0309F, 3.0583F, 1.2324F, 1.7794F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(84, 23).mirror().addBox(-1.5F, -0.525F, -0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(94, 90).mirror().addBox(-0.5F, -0.525F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1306F, 1.5611F, -4.0309F, 2.7878F, 1.2324F, 1.7794F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(94, 80).mirror().addBox(0.0055F, -0.5883F, 0.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.565F, -0.7281F, -0.4483F, 2.6771F, 1.0378F, 1.1304F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(0.3983F, -0.5883F, -0.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.565F, -0.7281F, -0.4483F, 0.3689F, 0.8878F, -1.3125F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(-0.1319F, -0.5883F, -0.8067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.565F, -0.7281F, -0.4483F, 0.2298F, -0.0373F, -1.6126F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(-0.0082F, -1.3022F, 1.657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 94).mirror().addBox(0.1725F, -1.3022F, 1.0922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 2.4646F, -0.5044F, 1.7365F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(8, 92).mirror().addBox(1.0628F, -1.3022F, -0.6914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 2.3964F, 0.6287F, 0.8688F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-1.9176F, -1.2638F, -2.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3159F, -2.8441F, 1.7415F, 0.4736F, 0.2912F, -1.6149F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(96, 31).mirror().addBox(-2.891F, -1.3022F, -0.1716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.7452F, -0.6287F, -2.2728F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(95, 83).mirror().addBox(0.5518F, -0.7831F, -1.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 2.4688F, 1.1637F, 0.9462F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-0.5201F, -0.7831F, -1.5928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.5617F, 1.0892F, -1.055F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(34, 94).mirror().addBox(-0.541F, -0.7831F, -1.6958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.3383F, 0.7325F, -1.3327F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(77, 2).mirror().addBox(-0.1715F, -0.7774F, -1.0108F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 0.5677F, 1.0937F, -1.0541F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-1.223F, -0.9106F, 0.0567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 2.9337F, 0.8242F, 1.5958F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-1.3035F, -0.9106F, -1.6518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(62, 68).mirror().addBox(-1.3035F, -0.9106F, -2.3518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7095F, -2.9201F, 1.9891F, 2.9838F, -0.4689F, 1.8211F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.675F, 3.0882F, -4.9637F, 2.1353F, 0.0154F, 3.1165F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-0.5F, -0.2F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6232F, 2.0292F, -3.3318F, -0.3082F, 0.0154F, 3.1165F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6455F, 2.2438F, -4.4288F, 0.9135F, 0.0154F, 3.1165F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1869F, 3.9183F, -4.3957F, 2.528F, 0.0154F, 3.1165F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7166F, 2.932F, -4.855F, 1.7045F, 0.5603F, 1.8138F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7544F, 3.3403F, -4.5688F, 1.7657F, 0.9481F, 1.9013F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(0.2798F, -0.0693F, -0.8472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4014F, 4.0829F, -3.7979F, 0.2801F, 0.0612F, -0.0073F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.2798F, -0.74F, -0.8306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4014F, 4.0829F, -3.7979F, 0.1056F, 0.0612F, -0.0073F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(98, 73).mirror().addBox(-0.5043F, -0.8021F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4014F, 4.0829F, -3.7979F, 0.1485F, 0.2156F, 0.1348F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-0.5043F, -0.099F, -0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4014F, 4.0829F, -3.7979F, 0.323F, 0.2156F, 0.1348F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(-0.65F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(10, 98).mirror().addBox(-0.35F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.1133F, 4.0078F, -3.5094F, 0.498F, 0.711F, 0.6343F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(98, 59).mirror().addBox(-0.65F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(5, 98).mirror().addBox(-0.35F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1133F, 4.0078F, -3.5094F, 0.3234F, 0.711F, 0.6343F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4698F, 2.5093F, -4.351F, 1.1605F, 0.5282F, 0.5115F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(97, 93).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5076F, 2.9176F, -4.0649F, 0.7242F, 0.5282F, 0.5115F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0731F, 2.0074F, -3.5824F, 0.2638F, 0.6499F, -0.482F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2875F, 2.6722F, -3.5538F, 0.64F, 0.2901F, 0.302F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(0.0F, 0.0F, -1.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7915F, 1.3203F, -2.5647F, 0.3295F, 0.5277F, -1.0213F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-1.0F, -0.375F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2919F, -0.5615F, -1.4087F, 0.4163F, 0.589F, -1.236F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6446F, -0.0458F, -4.3643F, 2.7349F, 0.8286F, 1.456F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4562F, 0.5728F, -4.1247F, 0.6295F, 1.0994F, -0.8026F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(0.0F, 0.125F, -1.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7915F, 1.3203F, -2.5647F, 0.3252F, 0.5791F, -1.1957F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -0.8849F, -4.196F, 2.8087F, -0.3313F, 0.112F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -1.7466F, -3.6885F, -2.1307F, -0.2991F, 0.1827F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(90, 38).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0678F, -2.1854F, -2.5052F, -0.8894F, 0.0605F, -0.5026F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.525F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.407F, -1.3547F, -2.5351F, -1.0096F, -0.4135F, 0.1406F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.5F, -1.625F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.407F, -1.3547F, -2.5351F, -1.0352F, -0.3017F, 0.2134F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -2.4779F, -3.0065F, -0.7816F, -0.2528F, 0.2433F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -3.0443F, -2.1823F, 1.9477F, -0.9859F, -1.4991F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -2.7611F, -2.5944F, 0.5571F, -0.2417F, 0.3669F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.4449F, -1.4029F, -0.9133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(53, 71).mirror().addBox(-0.4449F, -0.7029F, -0.9133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7413F, 0.2179F, 0.3304F, -0.6416F, -0.188F, -0.1291F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(-0.4131F, -0.929F, -1.9018F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7413F, 0.2179F, 0.3304F, 0.7433F, -0.1354F, -0.0585F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(86, 56).mirror().addBox(-0.5F, -0.8867F, -0.7537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7935F, 2.8807F, -2.85F, 0.492F, 0.1959F, 0.3526F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5F, -1.0908F, -0.1124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7935F, 2.8807F, -2.85F, 0.5793F, 0.1959F, 0.3526F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.4106F, -1.9754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3659F, 0.8503F, -1.0766F, 0.5671F, -0.0656F, 0.0463F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(58, 43).mirror().addBox(-0.5F, -0.4356F, -2.9754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3659F, 0.8503F, -1.0766F, 0.6107F, -0.0656F, 0.0463F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(99, 89).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4272F, -5.5388F, 3.5387F, 3.0062F, -0.2744F, 3.0025F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-0.0753F, -0.2536F, -0.996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2587F, -6.2613F, 2.7086F, 3.0915F, -0.0715F, 2.1835F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -7.1661F, 2.6254F, -3.0798F, -0.0617F, 0.7835F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-1.025F, 0.0F, 0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1605F, -5.5647F, 2.2063F, 1.1835F, -0.0665F, 2.9801F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(95, 64).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5354F, -6.6404F, 2.8431F, 0.2903F, -0.3189F, 2.2193F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(95, 44).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5354F, -6.2577F, 1.9193F, 1.3375F, -0.3189F, 2.2193F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -7.1661F, 2.6254F, 2.4269F, -1.2759F, 0.1624F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(95, 41).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -6.7834F, 1.7015F, 1.8041F, -0.3189F, 0.9223F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1081F, -5.0765F, 1.6612F, -0.595F, -0.0985F, 2.9973F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(100, 9).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5354F, -5.7481F, 1.1997F, -0.3755F, -0.4825F, 2.2751F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(98, 99).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -6.217F, 0.8774F, 0.3755F, -0.4825F, 0.8665F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(61, 32).mirror().addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1169F, -4.5071F, 1.1319F, -1.8554F, -0.7728F, -2.321F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1176F, -4.5042F, 1.1336F, -1.2445F, -0.7728F, -2.321F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(71, 87).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.119F, -4.8551F, 1.4974F, -0.756F, -0.1509F, 2.9835F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(23, 91).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, -5.0999F, 0.566F, 0.3232F, -0.6053F, 2.3427F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5446F, -5.4473F, 0.9256F, -0.5058F, -0.6053F, 2.3427F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -5.5159F, 0.1643F, 0.4145F, 0.1464F, 1.1683F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(89, 90).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -5.8632F, 0.524F, 0.5058F, -0.6053F, 0.7989F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(30, 7).mirror().addBox(-1.2F, -0.3F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.7791F, 2.1384F, -3.0164F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2791F, -5.1421F, -0.1477F, 0.5695F, -0.7024F, 0.7899F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-0.5F, -0.4356F, -0.1246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3659F, 0.8503F, -1.0766F, 0.7128F, -0.2033F, -0.0617F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(63, 81).mirror().addBox(0.0889F, -1.2938F, 1.101F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0595F, -3.5274F, 1.4312F, 0.0052F, -0.4885F, 1.4812F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.7291F, -1.4696F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(-0.839F, 2.7751F, 0.7486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.7558F, -0.0878F, 0.1378F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.839F, -0.114F, -0.2746F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.2008F, -0.0878F, 0.1378F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-0.839F, 0.4212F, -4.2987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.0227F, -0.0878F, 0.1378F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-0.839F, 1.2875F, -1.8397F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.2409F, -0.0878F, 0.1378F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(30, 100).mirror().addBox(-0.839F, 0.7776F, 0.1061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.7209F, -0.0878F, 0.1378F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(100, 37).mirror().addBox(-0.839F, 0.5633F, 0.7664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.4626F, -0.0878F, 0.1378F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(84, 90).mirror().addBox(-0.839F, -0.743F, 0.4637F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.2445F, -0.0878F, 0.1378F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-0.839F, 2.373F, 1.4281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.2881F, -0.0878F, 0.1378F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(86, 77).mirror().addBox(-0.839F, -0.051F, -1.1493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.0437F, -0.0878F, 0.1378F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.814F, 1.1009F, 2.6695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.8379F, -0.0878F, 0.1378F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(52, 97).mirror().addBox(-0.839F, -0.8506F, -1.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -1.2183F, -0.0878F, 0.1378F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(57, 97).mirror().addBox(-0.839F, -1.3219F, 0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, 0.0907F, -0.0878F, 0.1378F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.839F, -0.7202F, -1.1135F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, 0.4398F, -0.0878F, 0.1378F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-0.814F, 3.1119F, -1.7074F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.747F, -0.0878F, 0.1378F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-0.814F, 3.2413F, -3.2553F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, -0.8343F, -0.0878F, 0.1378F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-0.9919F, -2.954F, 0.0902F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, 0.6563F, 0.0166F, 0.0852F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-0.9919F, -2.5977F, 1.0492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 85).mirror().addBox(-0.9919F, -2.5977F, 1.7492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, 0.857F, 0.0166F, 0.0852F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(95, 70).mirror().addBox(-0.9919F, -1.567F, -3.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, -0.8883F, 0.0166F, 0.0852F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(95, 86).mirror().addBox(-0.5033F, -0.5387F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9631F, -3.483F, -8.4748F, -2.095F, 0.1905F, -0.1314F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(58, 77).mirror().addBox(-0.5033F, -0.2852F, -1.2712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9631F, -3.483F, -8.4748F, -0.6551F, 0.1905F, -0.1314F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-0.9919F, 0.344F, -4.0973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, -1.3246F, 0.0166F, 0.0852F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(96, 34).mirror().addBox(-0.9919F, 2.3543F, -1.3847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, -2.3718F, 0.0166F, 0.0852F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-0.814F, -4.2773F, -3.565F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, -0.7348F, -0.5271F, 0.9808F, -0.0878F, 0.1378F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(-0.9919F, -3.5179F, 0.4426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 13).mirror().addBox(-0.9919F, -4.1179F, 0.4426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6805F, 0.4799F, -6.6568F, 0.7261F, 0.0166F, 0.0852F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1812F, -3.7527F, -8.4959F, 1.189F, 0.0079F, -0.35F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9095F, -4.3096F, -9.9421F, -1.7657F, 0.9144F, -1.8073F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(96, 20).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9095F, -4.3096F, -9.9421F, -0.7311F, 0.4604F, -0.3662F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.5F, -0.7997F, -0.9869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1812F, -3.7527F, -8.4959F, 1.2326F, 0.0079F, -0.35F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(78, 97).mirror().addBox(-0.5F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7237F, -5.23F, -9.4713F, 0.026F, 0.251F, -0.1979F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(20, 100).mirror().addBox(-0.5F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7237F, -5.23F, -9.4713F, -0.1485F, 0.251F, -0.1979F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(25, 100).mirror().addBox(-0.5043F, -0.8022F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.9556F, -5.2598F, -9.3778F, -0.1135F, 0.0585F, -0.0097F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-0.5043F, -0.099F, -0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9556F, -5.2598F, -9.3778F, 0.061F, 0.0585F, -0.0097F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(-0.6F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(67, 97).mirror().addBox(-0.4F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3681F, -4.9045F, -9.16F, -0.0575F, 0.583F, -0.5952F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.4F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(88, 99).mirror().addBox(-0.6F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.3681F, -4.9045F, -9.16F, -0.232F, 0.583F, -0.5952F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(96, 28).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2802F, -4.3904F, -10.0603F, -2.5463F, -0.0139F, 3.1079F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9198F, -4.3904F, -10.0603F, -2.5463F, 0.0139F, -3.1079F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(96, 34).addBox(-0.0081F, 2.3543F, -1.3847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, -2.3718F, -0.0166F, -0.0852F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(96, 53).addBox(-0.0081F, 0.344F, -4.0973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, -1.3246F, -0.0166F, -0.0852F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(83, 97).addBox(-0.4957F, -0.099F, -0.6576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2444F, -5.2598F, -9.3778F, 0.061F, -0.0585F, 0.0097F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(25, 100).addBox(-0.4957F, -0.8022F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2444F, -5.2598F, -9.3778F, -0.1135F, -0.0585F, 0.0097F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(88, 99).addBox(-0.4F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(99, 79).addBox(-0.6F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.1681F, -4.9045F, -9.16F, -0.232F, -0.583F, 0.5952F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(67, 97).addBox(-0.6F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(62, 97).addBox(-0.4F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1681F, -4.9045F, -9.16F, -0.0575F, -0.583F, 0.5952F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(78, 97).addBox(-0.5F, -0.1378F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5237F, -5.23F, -9.4713F, 0.026F, -0.251F, 0.1979F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(20, 100).addBox(-0.5F, -0.8622F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5237F, -5.23F, -9.4713F, -0.1485F, -0.251F, 0.1979F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(96, 20).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7095F, -4.3096F, -9.9421F, -0.7311F, -0.4604F, 0.3662F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(96, 6).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7095F, -4.3096F, -9.9421F, -1.7657F, -0.9144F, 1.8073F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(58, 77).addBox(-0.4967F, -0.2852F, -1.2712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7631F, -3.483F, -8.4748F, -0.6551F, -0.1905F, 0.1314F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(95, 86).addBox(-0.4967F, -0.5387F, -0.3398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7631F, -3.483F, -8.4748F, -2.095F, -0.1905F, 0.1314F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(95, 70).addBox(-0.0081F, -1.567F, -3.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, -0.8883F, -0.0166F, -0.0852F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(46, 68).addBox(-0.186F, -4.2773F, -3.565F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, 0.9808F, 0.0878F, -0.1378F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5F, -0.7997F, -0.9869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9812F, -3.7527F, -8.4959F, 1.2326F, -0.0079F, 0.35F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(72, 78).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9812F, -3.7527F, -8.4959F, 1.189F, -0.0079F, 0.35F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(78, 13).addBox(-0.0081F, -4.1179F, 0.4426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 77).addBox(-0.0081F, -3.5179F, 0.4426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, 0.7261F, -0.0166F, -0.0852F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(20, 85).addBox(-0.0081F, -2.5977F, 1.7492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 12).addBox(-0.0081F, -2.5977F, 1.0492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, 0.857F, -0.0166F, -0.0852F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(5, 85).addBox(-0.0081F, -2.954F, 0.0902F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4805F, 0.4799F, -6.6568F, 0.6563F, -0.0166F, -0.0852F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(23, 68).addBox(-0.186F, 3.2413F, -3.2553F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.8343F, 0.0878F, -0.1378F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(68, 21).addBox(-0.186F, 3.1119F, -1.7074F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.747F, 0.0878F, -0.1378F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(74, 74).addBox(-0.186F, 1.1009F, 2.6695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.8379F, 0.0878F, -0.1378F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(0, 58).addBox(-0.161F, -0.7202F, -1.1135F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, 0.4398F, 0.0878F, -0.1378F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(57, 97).addBox(-0.161F, -1.3219F, 0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, 0.0907F, 0.0878F, -0.1378F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(52, 97).addBox(-0.161F, -0.8506F, -1.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.2183F, 0.0878F, -0.1378F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(86, 77).addBox(-0.161F, -0.051F, -1.1493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.0437F, 0.0878F, -0.1378F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(22, 81).addBox(-0.161F, 2.373F, 1.4281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.2881F, 0.0878F, -0.1378F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(84, 90).addBox(-0.161F, -0.743F, 0.4637F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.2445F, 0.0878F, -0.1378F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(100, 37).addBox(-0.161F, 0.5633F, 0.7664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.4626F, 0.0878F, -0.1378F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(30, 100).addBox(-0.161F, 0.7776F, 0.1061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.7209F, 0.0878F, -0.1378F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(30, 71).addBox(-0.161F, 1.2875F, -1.8397F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.2409F, 0.0878F, -0.1378F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(67, 46).addBox(-0.161F, 0.4212F, -4.2987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.0227F, 0.0878F, -0.1378F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(87, 17).addBox(-0.161F, -0.114F, -0.2746F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -1.2008F, 0.0878F, -0.1378F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(93, 61).addBox(-0.161F, 2.7751F, 0.7486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0375F, -0.7348F, -0.5271F, -0.7558F, 0.0878F, -0.1378F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(18, 53).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(53, 18).addBox(-0.5F, 2.4F, 2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r588 = tail.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(53, 62).addBox(0.0F, -0.825F, -2.55F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 2.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 75).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.2256F, 0.2555F, -0.0579F));

		PartDefinition cube_r589 = tail2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(100, 44).addBox(0.0F, -1.3F, -0.075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(43, 11).addBox(0.0F, -0.8F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 68).addBox(0.0F, -0.6F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 52).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.2409F, 0.3398F, -0.0817F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.414F, 0.2406F, -0.1043F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(47, 57).addBox(-0.5F, -0.9193F, -0.049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5587F, 2.7481F, 0.3604F, 0.2457F, 0.0914F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(59, 23).addBox(-0.5F, -1.0193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.075F, 0.4943F, 0.2316F, 0.1231F));

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