package fossils.fossils.client.blockentity.model.obdurodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ObdurodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart thumbToe;
	private final ModelPart thumbToe2;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart thumbToe3;
	private final ModelPart thumbToe4;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftBill;
	private final ModelPart rightBill;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ObdurodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.thumbToe = this.leftLeg3.getChild("thumbToe");
		this.thumbToe2 = this.thumbToe.getChild("thumbToe2");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.thumbToe3 = this.rightLeg3.getChild("thumbToe3");
		this.thumbToe4 = this.thumbToe3.getChild("thumbToe4");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.bone4 = this.chest.getChild("bone4");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftBill = this.head.getChild("leftBill");
		this.rightBill = this.head.getChild("rightBill");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.0906F, 12.1881F, 0.7873F, -0.0561F, -0.0669F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 78).addBox(0.0F, -0.9937F, -0.4061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 48).addBox(0.0F, -1.0937F, 1.5939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 78).addBox(0.0F, -1.1201F, -0.5189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(-1.2F, 0.3F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 79).mirror().addBox(-1.4F, 0.3F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 29).addBox(0.2F, 0.3F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 79).addBox(0.4F, 0.3F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7723F, 1.0161F, -1.6323F, 1.0056F, -0.7646F, -1.7481F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(65, 20).addBox(-1.0294F, -5.504F, -0.2798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 18).addBox(-1.4642F, -2.6766F, -1.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9241F, 5.5398F, -1.9246F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 44).addBox(-1.025F, 1.4974F, -1.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(14, 51).addBox(-1.525F, -0.5026F, -1.1104F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0849F, 4.5424F, -2.7112F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 56).addBox(-1.0F, -1.2F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(26, 56).addBox(-1.0F, -0.5F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0849F, 4.5603F, -1.7377F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 56).addBox(-1.8392F, -0.3618F, -1.4208F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9241F, 4.5898F, -1.1996F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 49).addBox(-1.8392F, -0.736F, -1.4517F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9241F, 4.5898F, -1.1996F, -0.7156F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0226F, 5.0255F, -2.5975F, 0.9156F, 0.3475F, -0.2922F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 33).addBox(-0.4496F, -1.782F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2249F, 1.6695F, -1.0687F, -0.6308F, 0.3212F, -0.3241F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 39).addBox(-0.4496F, -1.2528F, -0.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2249F, 1.6695F, -1.0687F, 0.4862F, 0.3212F, -0.3241F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 63).addBox(-0.3543F, -1.2144F, -0.5854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2249F, 2.0695F, -1.0687F, -0.0904F, 0.1749F, -0.3526F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 30).addBox(-0.4699F, -2.7471F, -0.6419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7449F, 2.752F, -0.8495F, -0.4887F, 0.0F, 0.1745F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 56).addBox(-0.4699F, -2.673F, -0.6332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7449F, 2.752F, -0.8495F, -0.6545F, 0.0F, 0.1745F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 55).addBox(-0.4699F, -2.65F, -0.628F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7449F, 2.752F, -0.8495F, -0.7069F, 0.0F, 0.1745F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 58).addBox(-0.4699F, -0.2371F, -0.6358F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.7449F, 2.752F, -0.8495F, -0.288F, 0.0F, 0.1745F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(71, 67).addBox(-0.4F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1036F, 3.9457F, -1.648F, -0.2549F, 0.3613F, 0.2353F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 16).addBox(-0.1589F, 0.4537F, -0.3247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2249F, 2.0695F, -1.0687F, -0.3508F, 0.2694F, -0.0714F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(33, 18).addBox(-1.8838F, -0.2555F, -0.4998F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1891F, 5.3858F, -2.3537F, -1.1714F, 1.2082F, -0.7185F));

		PartDefinition thumbToe = leftLeg3.addOrReplaceChild("thumbToe", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.8557F, -0.0179F));

		PartDefinition cube_r21 = thumbToe.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(65, 4).addBox(-0.5F, -2.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0344F, -1.7461F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r22 = thumbToe.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 47).addBox(-1.5972F, -1.9559F, -0.4819F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition thumbToe2 = thumbToe.addOrReplaceChild("thumbToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9201F, 0.3151F, -0.2904F, 0.3553F, 0.1523F, 0.0829F));

		PartDefinition cube_r23 = thumbToe2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(33, 28).addBox(-0.3857F, 0.1039F, -0.4213F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4276F, 0.0066F, 0.4F, -0.045F, -0.123F, 0.3955F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1015F, 2.7488F, -0.1784F, 1.9633F, -0.0915F, 0.0111F));

		PartDefinition cube_r24 = leftLeg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 8).addBox(-0.3683F, -0.0345F, -3.8478F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.1629F, 0.0856F, 0.0076F, -0.0869F, -0.0876F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7723F, 1.0161F, -1.6323F, 1.0151F, 0.8246F, 1.7679F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 43).addBox(0.0294F, -5.504F, -0.2798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 75).addBox(0.4642F, -2.6766F, -1.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9241F, 5.5398F, -1.9246F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 72).addBox(0.025F, 1.4974F, -1.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(42, 52).addBox(-0.475F, -0.5026F, -1.1104F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(76, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0849F, 4.5424F, -2.7112F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 41).addBox(-1.0F, -1.2F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(57, 38).addBox(-1.0F, -0.5F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0849F, 4.5603F, -1.7377F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(57, 35).addBox(-0.1608F, -0.3618F, -1.4208F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9241F, 4.5898F, -1.1996F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(19, 59).addBox(-0.1608F, -0.736F, -1.4517F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9241F, 4.5898F, -1.1996F, -0.7156F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0226F, 5.0255F, -2.5975F, 0.8725F, 0.0091F, 0.4076F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 48).addBox(-0.5503F, -1.782F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2249F, 1.6695F, -1.0687F, -0.6308F, -0.3212F, 0.3241F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 43).addBox(-0.5503F, -1.2528F, -0.0222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.2249F, 1.6695F, -1.0687F, 0.4862F, -0.3212F, 0.3241F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 29).addBox(-0.6457F, -1.2144F, -0.5854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2249F, 2.0695F, -1.0687F, -0.0904F, -0.1749F, 0.3526F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 59).addBox(-0.5301F, -2.7471F, -0.6419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7449F, 2.752F, -0.8495F, -0.4887F, 0.0F, -0.1745F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(57, 44).addBox(-0.5301F, -2.673F, -0.6332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7449F, 2.752F, -0.8495F, -0.6545F, 0.0F, -0.1745F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 55).addBox(-0.5301F, -2.65F, -0.628F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7449F, 2.752F, -0.8495F, -0.7069F, 0.0F, -0.1745F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5301F, -0.2371F, -0.6358F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.7449F, 2.752F, -0.8495F, -0.288F, 0.0F, -0.1745F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 70).addBox(-0.6F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1036F, 3.9457F, -1.648F, -0.2549F, -0.3613F, -0.2353F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 64).addBox(-0.8411F, 0.4537F, -0.3247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2249F, 2.0695F, -1.0687F, -0.3508F, -0.2694F, 0.0714F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(33, 23).addBox(-1.1162F, -0.2555F, -0.4998F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1891F, 5.3858F, -2.3537F, -1.0841F, -1.2082F, 0.7185F));

		PartDefinition thumbToe3 = rightLeg3.addOrReplaceChild("thumbToe3", CubeListBuilder.create(), PartPose.offset(1.0F, 1.8557F, -0.0179F));

		PartDefinition cube_r41 = thumbToe3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5F, -2.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0344F, -1.7461F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r42 = thumbToe3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(55, 5).addBox(0.5971F, -1.9559F, -0.4819F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition thumbToe4 = thumbToe3.addOrReplaceChild("thumbToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9201F, 0.3151F, -0.2904F, 0.0498F, -0.1523F, -0.0829F));

		PartDefinition cube_r43 = thumbToe4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(29, 33).addBox(-2.6143F, 0.1039F, -0.4213F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4276F, 0.0066F, 0.4F, -0.045F, 0.123F, -0.3955F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1015F, 2.7488F, -0.1784F, 1.6142F, 0.0915F, -0.0111F));

		PartDefinition cube_r44 = rightLeg4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 14).addBox(-2.6317F, -0.0345F, -3.8478F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.1629F, 0.0856F, 0.0076F, 0.0869F, 0.0876F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.63F, 1.1266F, -3.0029F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 38).addBox(-0.6754F, -0.5007F, -1.7658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.055F, -1.1483F, -0.7555F, -0.3821F, 0.2343F, 0.2936F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 20).addBox(-0.2834F, -0.5228F, -1.7677F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, -1.1483F, -0.7555F, -0.3407F, 0.1203F, 0.4789F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(20, 73).addBox(-0.1679F, -0.5F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2814F, -1.0129F, 1.0218F, -0.0059F, 1.2131F, 1.9628F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(15, 73).addBox(-0.8238F, -0.5F, -0.6098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2814F, -1.0129F, 1.0218F, -3.1316F, 1.3612F, -1.1634F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(70, 64).addBox(-0.575F, -0.7F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3299F, -0.6467F, 1.9473F, 3.0544F, -0.7578F, 2.0334F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 73).addBox(-0.8618F, -0.767F, -1.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0098F, 0.2467F, 2.1301F, 0.2256F, -1.2842F, -1.3848F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(25, 75).addBox(-1.5056F, -0.967F, -2.1799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0098F, 0.2467F, 2.1301F, 0.0745F, -0.5568F, -1.2076F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 70).addBox(-0.075F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5781F, 0.4921F, 0.9826F, 0.2042F, 1.1001F, -0.9451F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 17).addBox(-0.25F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5639F, 1.1753F, -0.5015F, 0.9635F, -0.16F, -0.2613F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5039F, -2.2605F, -1.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5718F, 1.7857F, 1.4567F, -0.2896F, -0.1828F, 0.0244F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.63F, 1.1266F, -3.0029F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.3246F, -0.5007F, -1.7658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.055F, -1.1483F, -0.7555F, -0.3821F, -0.2343F, -0.2936F));

		PartDefinition cube_r56 = bone6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-0.7166F, -0.5228F, -1.7677F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, -1.1483F, -0.7555F, -0.3407F, -0.1203F, -0.4789F));

		PartDefinition cube_r57 = bone6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-0.8321F, -0.5F, -0.5814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2814F, -1.0129F, 1.0218F, -0.0059F, -1.2131F, -1.9628F));

		PartDefinition cube_r58 = bone6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.1762F, -0.5F, -0.6098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2814F, -1.0129F, 1.0218F, -3.1316F, -1.3612F, 1.1634F));

		PartDefinition cube_r59 = bone6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.425F, -0.7F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3299F, -0.6467F, 1.9473F, 3.0544F, 0.7578F, -2.0334F));

		PartDefinition cube_r60 = bone6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.1382F, -0.767F, -1.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0098F, 0.2467F, 2.1301F, 0.2256F, 1.2842F, 1.3848F));

		PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(0.5056F, -0.967F, -2.1799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0098F, 0.2467F, 2.1301F, 0.0745F, 0.5568F, 1.2076F));

		PartDefinition cube_r62 = bone6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.925F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5781F, 0.4921F, 0.9826F, 0.2042F, -1.1001F, 0.9451F));

		PartDefinition cube_r63 = bone6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 17).mirror().addBox(-0.75F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 1.1753F, -0.5015F, 0.9635F, 0.16F, 0.2613F));

		PartDefinition cube_r64 = bone6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.4961F, -2.2605F, -1.3857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5718F, 1.7857F, 1.4567F, -0.2896F, 0.1828F, -0.0244F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.63F, 0.3757F, 0.3191F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 33).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.63F, 2.1559F, -1.316F, 0.7243F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, -0.0831F, 0.0872F, -0.0034F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 6).addBox(0.0F, -1.1972F, -0.043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 79).addBox(0.0F, -1.2078F, -0.0244F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.9F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, 2.6885F, 0.0437F, -1.9348F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 47).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, 2.6885F, -0.0437F, 1.9348F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(11, 21).addBox(-0.5F, 0.1F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0504F, -4.0954F, -0.3105F, 0.0859F, -0.0156F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4453F, 0.462F, 0.436F, -0.592F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-2.7461F, -0.5225F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4453F, 0.3333F, 0.5381F, -0.8652F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4453F, 0.5076F, 0.4531F, -0.5198F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4453F, 0.3745F, 0.5656F, -0.791F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.3842F, -6.1452F, 0.1003F, 0.7705F, -1.2783F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.3842F, -6.1452F, 0.495F, 0.6244F, -0.6763F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.3842F, -6.1452F, 0.6327F, 0.4836F, -0.4162F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, 0.6148F, 0.4765F, -0.4244F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, 0.4783F, 0.6134F, -0.686F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, 0.0934F, 0.7538F, -1.2831F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(37, 68).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4453F, 0.462F, -0.436F, 0.592F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(35, 79).addBox(1.7461F, -0.5225F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4453F, 0.3333F, -0.5381F, 0.8652F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 60).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4453F, 0.5076F, -0.4531F, 0.5198F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(64, 41).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4453F, 0.3745F, -0.5656F, 0.791F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 35).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.3842F, -6.1452F, 0.1003F, -0.7705F, 1.2783F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(20, 68).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.3842F, -6.1452F, 0.495F, -0.6244F, 0.6763F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(69, 28).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.3842F, -6.1452F, 0.6327F, -0.4836F, 0.4162F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, 0.6148F, -0.4765F, 0.4244F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(65, 12).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, 0.4783F, -0.6134F, 0.686F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 24).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, 0.0934F, -0.7538F, 1.2831F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, -0.0745F, -3.0935F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(79, 31).addBox(0.0F, -1.4219F, -0.0409F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1823F, -0.8733F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 64).addBox(0.0F, -1.1187F, -0.0039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0419F, -2.8703F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(41, 61).addBox(0.0F, -0.8638F, -0.0503F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4419F, -4.7703F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(55, 60).addBox(0.0F, -0.938F, 0.0788F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -6.8F, -0.2269F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -6.6F, 0.1922F, 0.0428F, 0.0083F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-1.9896F, 0.1068F, -0.4259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 3.2166F, -6.4021F, 0.7547F, 0.6747F, -0.4676F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-2.9495F, -0.4117F, -0.4259F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 3.2166F, -6.4021F, 0.558F, 0.8358F, -0.7526F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.6F, -0.4F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.979F, 6.2178F, -2.9511F, 0.1924F, 0.1363F, 0.6963F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-3.0F, -0.1F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.648F, 6.0031F, -1.1948F, 0.2111F, 0.0656F, 0.6988F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(42, 24).mirror().addBox(-3.4F, 0.0F, -0.8F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5172F, 5.3852F, 1.4302F, 0.2119F, -0.1051F, 0.6622F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-3.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4543F, 5.0876F, 2.6942F, 0.2136F, -0.1014F, 0.6451F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-3.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4543F, 5.0876F, 2.6942F, -0.1516F, 0.4078F, 0.6119F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-3.7996F, -0.5084F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 2.0166F, -4.8021F, 0.3201F, 0.6409F, -0.9139F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-1.8699F, -0.0253F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 2.0166F, -4.8021F, 0.4823F, 0.5378F, -0.6238F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-4.0336F, -2.2241F, -0.2062F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -3.2702F, -0.0748F, 0.5901F, -1.5298F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-3.739F, -0.5554F, -0.2062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -3.2702F, 0.2389F, 0.5494F, -0.9594F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-1.8234F, -0.0863F, -0.2062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9842F, -3.2702F, 0.3791F, 0.4692F, -0.6736F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(65, 2).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -1.3453F, 0.379F, 0.394F, -0.5869F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -1.3453F, 0.2627F, 0.4771F, -0.861F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -1.3453F, -0.0087F, 0.5397F, -1.4076F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4543F, 5.0876F, 2.6942F, -0.1238F, 0.7148F, 0.7473F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(9, 52).addBox(1.9495F, -0.4117F, -0.4259F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 3.2166F, -6.4021F, 0.558F, -0.8358F, 0.7526F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(67, 8).addBox(-0.0104F, 0.1068F, -0.4259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 3.2166F, -6.4021F, 0.7547F, -0.6747F, 0.4676F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 64).addBox(1.7996F, -0.5084F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 2.0166F, -4.8021F, 0.3201F, -0.6409F, 0.9139F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 63).addBox(-0.1301F, -0.0253F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 2.0166F, -4.8021F, 0.4823F, -0.5378F, 0.6238F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(77, 13).addBox(3.0336F, -2.2241F, -0.2062F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -3.2702F, -0.0748F, -0.5901F, 1.5298F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 14).addBox(1.739F, -0.5554F, -0.2062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -3.2702F, 0.2389F, -0.5494F, 0.9594F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(65, 26).addBox(-0.1765F, -0.0863F, -0.2062F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9842F, -3.2702F, 0.3791F, -0.4692F, 0.6736F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 2).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -1.3453F, 0.379F, -0.394F, 0.5869F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 0).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -1.3453F, 0.2627F, -0.4771F, 0.861F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 59).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -1.3453F, -0.0087F, -0.5397F, 1.4076F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(8, 79).addBox(0.0F, -1.4007F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.809F, -3.602F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(37, 65).addBox(0.0F, -1.1661F, 0.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1329F, -1.9474F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 35).addBox(0.0F, 0.4424F, -1.2931F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 56).addBox(0.0F, -1.7576F, 0.0069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.009F, -5.202F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(18, 37).addBox(-0.5F, -1.0115F, -2.669F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6329F, -0.0474F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 52).addBox(-0.4F, -0.4F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.979F, 6.2178F, -2.9511F, 0.1924F, -0.1363F, -0.6963F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 21).addBox(0.0F, -0.1F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.648F, 6.0031F, -1.1948F, 0.2111F, -0.0656F, -0.6988F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(42, 24).addBox(-0.6F, 0.0F, -0.8F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5172F, 5.3852F, 1.4302F, 0.2119F, 0.1051F, -0.6622F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(42, 28).addBox(-0.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4543F, 5.0876F, 2.6942F, 0.2136F, 0.1014F, -0.6451F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(42, 26).addBox(-0.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4543F, 5.0876F, 2.6942F, -0.1516F, -0.4078F, -0.6119F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(28, 16).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4543F, 5.0876F, 2.6942F, -0.1238F, -0.7148F, -0.7473F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -1.0799F, -0.1031F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5169F, -1.4857F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(28, 6).addBox(-1.0F, -1.0182F, -0.0167F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.7169F, -4.4857F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(28, 11).addBox(-1.0F, -0.9262F, -0.0741F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2169F, -7.3857F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.099F, -5.0169F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 0.6283F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8645F, 3.8481F, -5.8625F, 0.8306F, 0.1059F, -0.4192F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(53, 23).addBox(-0.6102F, -0.611F, -1.4186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.527F, -0.6373F, -0.8506F, 1.5937F, 0.1704F, -0.0033F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5F, -2.1259F, -0.3097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.9427F, -0.5373F, -1.2282F, -2.297F, 1.0283F, 1.335F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(51, 67).addBox(-0.5F, -1.7259F, -0.3097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9427F, -0.5373F, -1.2282F, -2.8206F, 1.0283F, 1.335F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.2855F, -0.2704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.9427F, -0.5373F, -1.2282F, 2.8954F, 1.0283F, 1.335F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 30).addBox(-0.6102F, -0.5341F, -0.2058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.527F, -0.6373F, -0.8506F, 2.353F, 0.1704F, -0.0033F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.2655F, -2.4312F, 0.655F, 0.3004F, 0.2436F, 0.1377F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.7F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7493F, -1.4898F, -0.7534F, -0.1883F, 0.2436F, 0.1377F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 50).addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.173F, -3.6664F, 0.3415F, -1.5846F, 0.2436F, 0.1377F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(74, 47).addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4466F, -3.1009F, -0.4366F, -0.9301F, 0.2436F, 0.1377F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(52, 75).addBox(-0.5F, -1.1F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(40, 75).addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7103F, -2.4026F, -1.102F, -0.7556F, 0.2436F, 0.1377F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(50, 51).addBox(-0.7585F, -2.4235F, -1.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, -0.7119F, 0.2436F, 0.1377F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8645F, 3.8481F, -5.8625F, 0.8306F, -0.1059F, 0.4192F));

		PartDefinition cube_r148 = bone5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-0.3898F, -0.611F, -1.4186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.527F, -0.6373F, -0.8506F, 1.5937F, -0.1704F, 0.0033F));

		PartDefinition cube_r149 = bone5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-0.5F, -2.1259F, -0.3097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.9427F, -0.5373F, -1.2282F, -2.297F, -1.0283F, -1.335F));

		PartDefinition cube_r150 = bone5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 67).addBox(-0.5F, -1.7259F, -0.3097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7863F, -0.5373F, -1.2282F, -2.8206F, 1.0283F, 1.335F));

		PartDefinition cube_r151 = bone5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(-0.5F, -1.7259F, -0.3097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.9427F, -0.5373F, -1.2282F, -2.8206F, -1.0283F, -1.335F));

		PartDefinition cube_r152 = bone5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.2855F, -0.2704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.9427F, -0.5373F, -1.2282F, 2.8954F, -1.0283F, -1.335F));

		PartDefinition cube_r153 = bone5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.3898F, -0.5341F, -0.2058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.527F, -0.6373F, -0.8506F, 2.353F, -0.1704F, 0.0033F));

		PartDefinition cube_r154 = bone5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, -0.6F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.2655F, -2.4312F, 0.655F, 0.3004F, -0.2436F, -0.1377F));

		PartDefinition cube_r155 = bone5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -0.7F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7493F, -1.4898F, -0.7534F, -0.1883F, -0.2436F, -0.1377F));

		PartDefinition cube_r156 = bone5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.173F, -3.6664F, 0.3415F, -1.5846F, -0.2436F, -0.1377F));

		PartDefinition cube_r157 = bone5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.4466F, -3.1009F, -0.4366F, -0.9301F, -0.2436F, -0.1377F));

		PartDefinition cube_r158 = bone5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(52, 75).mirror().addBox(-0.5F, -1.1F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(40, 75).mirror().addBox(-0.5F, -0.9F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7103F, -2.4026F, -1.102F, -0.7556F, -0.2436F, -0.1377F));

		PartDefinition cube_r159 = bone5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-0.2415F, -2.4235F, -1.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, -0.7119F, -0.2436F, -0.1377F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5582F, 1.7379F, -3.8506F, 0.8306F, -0.1059F, 0.4192F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1015F, 5.7173F, -6.775F, 0.4348F, -0.7903F, -1.5602F));

		PartDefinition cube_r160 = leftarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(27, 68).addBox(0.346F, -0.5929F, -1.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6507F, 0.6343F, 0.4798F, 0.1657F, -0.6196F, -0.3882F));

		PartDefinition cube_r161 = leftarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 20).addBox(-0.5F, -2.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1509F, 5.3355F, 0.8979F, -0.4941F, 0.6209F, 0.226F));

		PartDefinition cube_r162 = leftarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(49, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2587F, 2.698F, 1.9925F, 0.0731F, 0.6209F, 0.226F));

		PartDefinition cube_r163 = leftarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(10, 70).addBox(0.5097F, 2.0101F, 0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 46).addBox(0.5097F, -1.0899F, -0.0033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6507F, 0.6343F, 0.4798F, 0.3786F, 0.6209F, 0.226F));

		PartDefinition cube_r164 = leftarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(62, 8).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.7599F, 2.4017F, 1.2199F, 0.7276F, 0.6209F, 0.226F));

		PartDefinition cube_r165 = leftarm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 76).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1496F, 2.1639F, 0.3138F, 0.8585F, 0.6209F, 0.226F));

		PartDefinition cube_r166 = leftarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9361F, 1.4757F, 1.1699F, -0.3196F, 0.6209F, 0.226F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9858F, 3.2352F, 1.6846F, -0.6354F, 0.5188F, 0.9704F));

		PartDefinition cube_r167 = leftarm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2407F, 0.2416F, 0.7048F, -1.6269F, -1.447F, 1.3705F));

		PartDefinition cube_r168 = leftarm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(5, 76).addBox(-0.4F, -2.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5763F, 2.8542F, 0.0779F, -1.5708F, -1.3701F, 1.5708F));

		PartDefinition cube_r169 = leftarm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(35, 73).addBox(-0.3608F, 0.3471F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5763F, 1.5072F, 0.0989F, -1.5708F, -1.3265F, 1.5708F));

		PartDefinition cube_r170 = leftarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(54, 30).addBox(-1.52F, -3.1166F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.2763F, 5.5072F, 0.9989F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r171 = leftarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 38).addBox(-0.3F, -0.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4237F, 1.2501F, -0.0965F, -1.5708F, -1.2828F, 1.5708F));

		PartDefinition cube_r172 = leftarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(64, 37).addBox(-0.2858F, -1.2529F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7763F, 1.5072F, 0.0989F, -1.5602F, -1.1957F, 1.5608F));

		PartDefinition cube_r173 = leftarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(77, 10).addBox(0.3F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5935F, 0.8394F, 0.1975F, 1.5821F, -0.909F, -1.8356F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5617F, 5.03F, -0.2963F, 1.726F, -0.0403F, 0.223F));

		PartDefinition cube_r174 = leftArm3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(64, 52).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r175 = leftArm3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(18, 42).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0061F, 1.7111F, -0.0893F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftArm4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(32, 47).addBox(-0.615F, -1.5755F, -0.4916F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r177 = leftArm4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 32).addBox(-0.8F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1015F, 5.7173F, -6.775F, 0.2231F, 0.6924F, 1.5617F));

		PartDefinition cube_r178 = rightarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(5, 69).addBox(-1.346F, -0.5929F, -1.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6507F, 0.6343F, 0.4798F, 0.1657F, 0.6196F, 0.3882F));

		PartDefinition cube_r179 = rightarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(37, 70).addBox(-0.5F, -2.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1509F, 5.3355F, 0.8979F, -0.4941F, -0.6209F, -0.226F));

		PartDefinition cube_r180 = rightarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2587F, 2.698F, 1.9925F, 0.0731F, -0.6209F, -0.226F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(15, 70).addBox(-1.5097F, 2.0101F, 0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(-1.5097F, -1.0899F, -0.0033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6507F, 0.6343F, 0.4798F, 0.3786F, -0.6209F, -0.226F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(62, 44).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.7599F, 2.4017F, 1.2199F, 0.7276F, -0.6209F, -0.226F));

		PartDefinition cube_r183 = rightarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 67).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1496F, 2.1639F, 0.3138F, 0.8585F, -0.6209F, -0.226F));

		PartDefinition cube_r184 = rightarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 3).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9361F, 1.4757F, 1.1699F, -0.3196F, -0.6209F, -0.226F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9858F, 3.2352F, 1.6846F, 1.8926F, -0.3109F, -2.1659F));

		PartDefinition cube_r185 = rightarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(77, 42).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.2407F, 0.2416F, 0.7048F, -1.6269F, 1.447F, -1.3705F));

		PartDefinition cube_r186 = rightarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(35, 76).addBox(-0.6F, -2.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5763F, 2.8542F, 0.0779F, -1.5708F, 1.3701F, -1.5708F));

		PartDefinition cube_r187 = rightarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(75, 15).addBox(-0.6392F, 0.3471F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5763F, 1.5072F, 0.0989F, -1.5708F, 1.3265F, -1.5708F));

		PartDefinition cube_r188 = rightarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 0).addBox(0.52F, -3.1166F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.2763F, 5.5072F, 0.9989F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 45).addBox(-0.7F, -0.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4237F, 1.2501F, -0.0965F, -1.5708F, 1.2828F, -1.5708F));

		PartDefinition cube_r190 = rightarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 64).addBox(-0.7142F, -1.2529F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7763F, 1.5072F, 0.0989F, -1.5602F, 1.1957F, -1.5608F));

		PartDefinition cube_r191 = rightarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 39).addBox(-1.3F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5935F, 0.8394F, 0.1975F, 1.5821F, 0.909F, 1.8356F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5617F, 5.03F, -0.2963F, -0.185F, -0.0271F, -0.2191F));

		PartDefinition cube_r192 = rightArm3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 56).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r193 = rightArm3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(42, 20).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0061F, 1.7111F, -0.0893F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(48, 0).addBox(-1.385F, -1.5755F, -0.4916F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r195 = rightArm4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(9, 33).addBox(-2.2F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3337F, -6.6944F, 0.8033F, 0.0303F, 0.0314F));

		PartDefinition cube_r196 = neck3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(69, 73).addBox(-0.5F, -0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2907F, -0.6886F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r197 = neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(11, 79).mirror().addBox(-0.0057F, -1.4598F, 0.0994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7168F, -2.7489F, -1.0607F, -1.039F, 0.4617F, 0.2563F));

		PartDefinition cube_r198 = neck2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(11, 79).addBox(0.0057F, -1.4598F, 0.0994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7168F, -2.7489F, -1.0607F, -1.039F, -0.4617F, -0.2563F));

		PartDefinition cube_r199 = neck2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(79, 51).addBox(0.0F, -1.7228F, 0.731F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -0.7F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r200 = neck2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8734F, -2.5439F, -1.7562F, -0.119F, 0.0871F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(21, 52).addBox(-0.5F, -0.8162F, -0.1525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 5.575F, -6.6677F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(36, 43).addBox(-1.0F, -0.2162F, -1.8525F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 3.866F, -6.0938F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 27).addBox(-1.0F, 0.0244F, -1.0289F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.6106F, -4.431F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.0098F, -0.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8105F, -6.1352F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 78).addBox(-0.5F, -1.8505F, -0.8146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5534F, -3.2098F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-0.9F, -0.363F, -1.2557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1146F, -2.9692F, -0.0524F, -0.1745F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-0.4911F, -0.3849F, 0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4126F, 2.0422F, -2.666F, 0.4014F, -0.1745F, 0.0873F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(-0.4911F, -1.4075F, -0.8289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(69, 55).mirror().addBox(-0.4911F, -0.0584F, -1.0385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4126F, 2.0422F, -2.666F, 0.192F, -0.1745F, 0.0873F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(61, 69).mirror().addBox(-0.4911F, -0.0837F, -0.3471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4126F, 2.0422F, -2.666F, 0.3229F, -0.1745F, 0.0873F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(56, 69).addBox(-0.509F, -0.3849F, 0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4126F, 2.0422F, -2.666F, 0.4014F, 0.1745F, -0.0873F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(70, 4).addBox(-0.1F, -0.363F, -1.2557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.1146F, -2.9692F, -0.0524F, 0.1745F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(61, 69).addBox(-0.509F, -0.0837F, -0.3471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4126F, 2.0422F, -2.666F, 0.3229F, 0.1745F, -0.0873F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(69, 55).addBox(-0.509F, -0.0584F, -1.0385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 25).addBox(-0.509F, -1.4075F, -0.8289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4126F, 2.0422F, -2.666F, 0.192F, 0.1745F, -0.0873F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(50, 60).addBox(-0.5F, 0.0198F, 0.0315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.1614F, -3.4799F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, -1.8802F, 0.0315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.9674F, -2.3186F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.0215F, -0.9677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9154F, -3.8508F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(47, 30).addBox(-0.7F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5656F, -1.7444F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 52).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4289F, -0.6234F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(27, 43).addBox(-1.0F, 1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.213F, -1.9092F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(9, 44).addBox(-1.5F, 0.4969F, -1.1968F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 43).addBox(-1.5F, -0.0031F, -1.1968F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.9F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(12, 60).addBox(-1.0F, 0.0229F, -1.1083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3291F, -2.0048F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.6984F, -0.0666F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 65).addBox(-1.0F, -0.0129F, -0.9838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6853F, -1.1933F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(60, 65).addBox(-0.5F, -0.05F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.5669F, -0.1506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5F, -0.45F, 0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0437F, -1.3023F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftBill = head.addOrReplaceChild("leftBill", CubeListBuilder.create(), PartPose.offset(0.9567F, 4.6818F, -6.1173F));

		PartDefinition cube_r226 = leftBill.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(35, 52).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7446F, -0.1337F, -0.173F));

		PartDefinition cube_r227 = leftBill.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 39).addBox(-0.625F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3433F, 1.2604F, -1.3067F, 0.7319F, -0.1304F, -0.1163F));

		PartDefinition cube_r228 = leftBill.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(39, 10).addBox(-0.625F, -0.5F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.4822F, 1.7825F, -1.8968F, 0.7911F, -0.3716F, -0.352F));

		PartDefinition cube_r229 = leftBill.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(20, 76).addBox(-0.775F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.321F, 2.7621F, -2.8524F, 0.9438F, 0.4933F, 0.5789F));

		PartDefinition cube_r230 = leftBill.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4201F, 2.8067F, -2.8963F, 1.1772F, 0.6883F, 0.9918F));

		PartDefinition cube_r231 = leftBill.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(15, 76).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.1121F, 2.9404F, -3.0276F, 1.1141F, 0.6523F, 0.8903F));

		PartDefinition cube_r232 = leftBill.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(30, 76).addBox(-0.75F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.671F, 2.0538F, -2.1564F, 0.8034F, -0.1341F, -0.1378F));

		PartDefinition cube_r233 = leftBill.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(76, 26).addBox(-0.75F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.671F, 2.4104F, -2.5068F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftBill.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(36, 38).addBox(-0.325F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0433F, 1.2174F, -1.3861F, 0.8533F, -0.1096F, -0.1247F));

		PartDefinition cube_r235 = leftBill.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(74, 53).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5469F, -3.0049F, 2.2832F, 0.973F, -0.2793F, -0.2222F));

		PartDefinition cube_r236 = leftBill.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(74, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.784F, -3.8579F, 2.8599F, 1.0725F, -0.187F, -0.2467F));

		PartDefinition cube_r237 = leftBill.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(28, 52).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0433F, 0.0307F, -0.2778F, 0.9192F, -0.1337F, -0.173F));

		PartDefinition cube_r238 = leftBill.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(38, 33).addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0433F, 1.2174F, -1.3861F, 0.917F, -0.3377F, -0.4081F));

		PartDefinition cube_r239 = leftBill.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(50, 47).addBox(-0.3F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0954F, -2.2295F, 1.6635F, 0.917F, -0.3377F, -0.4081F));

		PartDefinition cube_r240 = leftBill.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(7, 54).addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3067F, -1.3163F, 0.9732F, 0.892F, -0.0549F, -0.0679F));

		PartDefinition cube_r241 = leftBill.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(39, 5).addBox(0.175F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(0.0433F, 1.2174F, -1.3861F, 0.893F, -0.2784F, -0.3289F));

		PartDefinition cube_r242 = leftBill.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(39, 0).addBox(-0.725F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.277F, 1.6194F, -1.7417F, 0.8855F, -0.2564F, -0.3008F));

		PartDefinition rightBill = head.addOrReplaceChild("rightBill", CubeListBuilder.create(), PartPose.offset(-0.9567F, 4.6818F, -6.1173F));

		PartDefinition cube_r243 = rightBill.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7446F, 0.1337F, 0.173F));

		PartDefinition cube_r244 = rightBill.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.375F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3433F, 1.2604F, -1.3067F, 0.7319F, 0.1304F, 0.1163F));

		PartDefinition cube_r245 = rightBill.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(39, 10).mirror().addBox(-0.375F, -0.5F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.4822F, 1.7825F, -1.8968F, 0.7911F, 0.3716F, 0.352F));

		PartDefinition cube_r246 = rightBill.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.225F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.321F, 2.7621F, -2.8524F, 0.9438F, -0.4933F, -0.5789F));

		PartDefinition cube_r247 = rightBill.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4201F, 2.8067F, -2.8963F, 1.1772F, -0.6883F, -0.9918F));

		PartDefinition cube_r248 = rightBill.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.1121F, 2.9404F, -3.0276F, 1.1141F, -0.6523F, -0.8903F));

		PartDefinition cube_r249 = rightBill.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-0.25F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.671F, 2.0538F, -2.1564F, 0.8034F, 0.1341F, 0.1378F));

		PartDefinition cube_r250 = rightBill.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-0.25F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.671F, 2.4104F, -2.5068F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightBill.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(36, 38).mirror().addBox(-0.675F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0433F, 1.2174F, -1.3861F, 0.8533F, 0.1096F, 0.1247F));

		PartDefinition cube_r252 = rightBill.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5469F, -3.0049F, 2.2832F, 0.973F, 0.2793F, 0.2222F));

		PartDefinition cube_r253 = rightBill.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.784F, -3.8579F, 2.8599F, 1.0725F, 0.187F, 0.2467F));

		PartDefinition cube_r254 = rightBill.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0433F, 0.0307F, -0.2778F, 0.9192F, 0.1337F, 0.173F));

		PartDefinition cube_r255 = rightBill.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(38, 33).mirror().addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0433F, 1.2174F, -1.3861F, 0.917F, 0.3377F, 0.4081F));

		PartDefinition cube_r256 = rightBill.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.7F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0954F, -2.2295F, 1.6635F, 0.917F, 0.3377F, 0.4081F));

		PartDefinition cube_r257 = rightBill.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3067F, -1.3163F, 0.9732F, 0.892F, 0.0549F, 0.0679F));

		PartDefinition cube_r258 = rightBill.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(39, 5).mirror().addBox(-1.175F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(-0.0433F, 1.2174F, -1.3861F, 0.893F, 0.2784F, 0.3289F));

		PartDefinition cube_r259 = rightBill.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.275F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.277F, 1.6194F, -1.7417F, 0.8855F, 0.2564F, 0.3008F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 4.5418F, -10.1604F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(20, 70).addBox(-1.1043F, -0.4837F, -0.3868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.997F, -3.9335F, 8.7828F, 1.6279F, 1.0848F, 1.8259F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5945F, -0.4384F, -0.3868F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.997F, -3.9335F, 8.7828F, 1.6169F, 0.954F, 1.813F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 77).addBox(-1.9091F, -0.5018F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 76).addBox(-1.3091F, -0.5018F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.997F, -3.9335F, 8.7828F, 0.8062F, 0.9564F, 0.7689F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(58, 13).addBox(-0.925F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1694F, -4.8646F, 10.3352F, 0.7992F, 0.1576F, 0.0569F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 58).addBox(-1.4F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7279F, -5.369F, 10.2748F, 0.8093F, -0.0632F, 0.2686F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(77, 76).addBox(-1.9092F, -0.2987F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(45, 77).addBox(-1.3092F, -0.2987F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.997F, -3.9335F, 8.7828F, 1.0661F, 0.6002F, 1.1312F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(42, 15).addBox(0.1791F, -0.4435F, -3.5695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.997F, -3.9335F, 8.7828F, 0.7536F, 0.5084F, 0.4637F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(47, 74).addBox(-0.625F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3057F, -5.0766F, 10.4916F, -1.0762F, 0.1231F, 0.6644F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2909F, -5.3419F, 9.8607F, -0.1009F, 0.04F, 0.6097F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 67).addBox(0.37F, -1.2024F, 1.6423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6135F, -5.8297F, 7.4202F, -0.0008F, -0.0087F, 1.6581F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 66).addBox(1.0528F, -1.2765F, 0.2017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6135F, -5.8297F, 7.4202F, -0.0513F, -0.5301F, 1.672F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 33).addBox(0.3677F, 0.4823F, 0.0333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3267F, -6.3965F, 8.2304F, 0.1541F, -0.2341F, 0.5828F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(74, 30).addBox(0.559F, 0.2805F, -0.1224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6135F, -5.8297F, 7.4202F, 0.4889F, -0.3177F, 0.531F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(50, 35).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5539F, -3.3988F, 7.3102F, 0.1923F, -0.33F, 1.7938F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(7, 48).addBox(-0.718F, -1.3151F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8381F, -4.5687F, 8.539F, 0.2886F, -0.8824F, 1.6315F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(48, 5).addBox(-0.1282F, -1.2625F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8381F, -4.5687F, 8.539F, 0.9006F, -0.1975F, 0.582F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(25, 78).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8359F, -0.7883F, 5.0513F, 0.8339F, 0.2399F, 0.2561F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(48, 9).addBox(-0.775F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.3229F, -1.8023F, 6.0305F, 0.8048F, -0.0606F, -0.0629F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(10, 66).addBox(-0.5225F, -1.2911F, -0.8407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8381F, -4.5687F, 8.539F, 0.1543F, -0.649F, 1.6427F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(74, 7).addBox(-0.1782F, -1.2474F, -0.8203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8381F, -4.5687F, 8.539F, 0.9267F, -0.268F, 0.5558F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 4.5418F, -10.1604F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(0.1043F, -0.4837F, -0.3868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.997F, -3.9335F, 8.7828F, 1.6279F, -1.0848F, -1.8259F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-1.4055F, -0.4384F, -0.3868F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.997F, -3.9335F, 8.7828F, 1.6169F, -0.954F, -1.813F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.9091F, -0.5018F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 76).mirror().addBox(0.3091F, -0.5018F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.997F, -3.9335F, 8.7828F, 0.8062F, -0.9564F, -0.7689F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(58, 13).mirror().addBox(-1.075F, -0.375F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1694F, -4.8646F, 10.3352F, 0.7992F, -0.1576F, -0.0569F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-0.6F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7279F, -5.369F, 10.2748F, 0.8093F, 0.0632F, -0.2686F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(0.9092F, -0.2987F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(45, 77).mirror().addBox(0.3092F, -0.2987F, 0.0308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.997F, -3.9335F, 8.7828F, 1.0661F, -0.6002F, -1.1312F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(42, 15).mirror().addBox(-1.1791F, -0.4435F, -3.5695F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.997F, -3.9335F, 8.7828F, 0.7536F, -0.5084F, -0.4637F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(47, 74).mirror().addBox(-0.375F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3057F, -5.0766F, 10.4916F, -1.0762F, -0.1231F, -0.6644F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2909F, -5.3419F, 9.8607F, -0.1009F, -0.04F, -0.6097F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-1.37F, -1.2024F, 1.6423F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6135F, -5.8297F, 7.4202F, -0.0008F, 0.0087F, -1.6581F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-2.0528F, -1.2765F, 0.2017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6135F, -5.8297F, 7.4202F, -0.0513F, 0.5301F, -1.672F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(74, 33).mirror().addBox(-1.3677F, 0.4823F, 0.0333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3267F, -6.3965F, 8.2304F, 0.1541F, 0.2341F, -0.5828F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.559F, 0.2805F, -0.1224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6135F, -5.8297F, 7.4202F, 0.4889F, 0.3177F, -0.531F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5539F, -3.3988F, 7.3102F, 0.1923F, 0.33F, -1.7938F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-0.282F, -1.3151F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8381F, -4.5687F, 8.539F, 0.2886F, 0.8824F, -1.6315F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.8718F, -1.2625F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8381F, -4.5687F, 8.539F, 0.9006F, 0.1975F, -0.582F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -0.7883F, 5.0513F, 0.8339F, -0.2399F, -0.2561F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-0.225F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.3229F, -1.8023F, 6.0305F, 0.8048F, 0.0606F, 0.0629F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(10, 66).mirror().addBox(-0.4775F, -1.2911F, -0.8407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8381F, -4.5687F, 8.539F, 0.1543F, 0.649F, -1.6427F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(-0.8218F, -1.2474F, -0.8203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8381F, -4.5687F, 8.539F, 0.9267F, 0.268F, -0.5558F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.33F, 0.2807F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5599F, 0.251F, -9.592F, -1.6452F, 0.0788F, 0.0066F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(17, 62).mirror().addBox(0.1327F, 1.4428F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.6466F, 0.2093F, -0.0034F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(0.0187F, 1.3893F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.6484F, 0.2963F, -0.0103F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(-0.0159F, -0.2453F, -0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 47).mirror().addBox(-0.0159F, 0.1547F, -0.5847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.4889F, 0.1309F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-0.0159F, -0.2278F, -0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 61).mirror().addBox(-0.0159F, 0.1722F, -0.2875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.646F, 0.1309F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-0.2062F, -1.0013F, -0.572F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.4889F, 0.1658F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(49, 55).mirror().addBox(-0.2062F, -0.9339F, -0.2993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, 0.1762F, -7.8432F, -1.646F, 0.1658F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(1.1602F, 6.3327F, 0.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.6284F, 0.0696F, 0.0018F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(1.1602F, 6.2981F, -1.9338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.384F, 0.0696F, 0.0018F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(42, 30).mirror().addBox(0.3443F, 4.3384F, 1.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.8151F, -0.0838F, -0.0981F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-0.4631F, 3.4145F, 2.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(28, 18).mirror().addBox(-0.0631F, 3.4145F, 2.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -2.2047F, -0.2103F, -0.0124F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.2631F, 3.0208F, 0.7747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 59).mirror().addBox(-0.4631F, 2.8208F, 0.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 55).mirror().addBox(-0.0631F, 2.8208F, 0.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 4).mirror().addBox(-0.2631F, 2.8208F, 1.1997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.812F, -0.2103F, -0.0124F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(1.0571F, 6.0341F, -0.253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.5795F, 0.0524F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(1.0571F, 4.6451F, 0.6108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(40, 78).mirror().addBox(1.0571F, 4.5701F, 0.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 34).mirror().addBox(1.0571F, 4.9451F, 0.2608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.7104F, 0.0524F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-0.1061F, 0.6163F, 0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.6027F, -0.1717F, 0.0662F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.1315F, 1.2073F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 23).mirror().addBox(-0.1315F, 1.8073F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.4259F, -0.1797F, 0.026F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.1315F, 2.0211F, -0.0498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.4826F, -0.1797F, 0.026F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-0.1315F, 2.4646F, 0.3604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.631F, -0.1797F, 0.026F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-0.1315F, 2.2702F, 1.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.8055F, -0.1797F, 0.026F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(59, 72).mirror().addBox(-0.1315F, 1.8639F, 0.8852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.7008F, -0.1797F, 0.026F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-0.1315F, 1.8025F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(54, 72).mirror().addBox(-0.1315F, 1.2025F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.2077F, -0.1797F, 0.026F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-0.1315F, -0.3375F, -0.5613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1703F, 0.1925F, -1.0158F, -0.1797F, 0.026F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(36, 61).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7599F, 0.251F, -9.592F, -1.6452F, -0.0788F, -0.0066F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(17, 62).addBox(-1.1327F, 1.4428F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.6466F, -0.2093F, 0.0034F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0187F, 1.3893F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.6484F, -0.2963F, 0.0103F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(57, 75).addBox(-0.9841F, -0.2453F, -0.5847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 47).addBox(-0.9841F, 0.1547F, -0.5847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.4889F, -0.1309F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(42, 72).addBox(-0.9841F, -0.2278F, -0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 61).addBox(-0.9841F, 0.1722F, -0.2875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.646F, -0.1309F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(58, 16).addBox(-0.7939F, -1.0013F, -0.572F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.4889F, -0.1658F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(49, 55).addBox(-0.7939F, -0.9339F, -0.2993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0354F, 0.1762F, -7.8432F, -1.646F, -0.1658F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(45, 60).addBox(-2.1602F, 6.3327F, 0.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.6284F, -0.0696F, -0.0018F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(60, 21).addBox(-2.1602F, 6.2981F, -1.9338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.384F, -0.0696F, -0.0018F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(42, 30).addBox(-1.3443F, 4.3384F, 1.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.8151F, 0.0838F, 0.0981F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(69, 38).addBox(-0.5369F, 3.4145F, 2.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(28, 18).addBox(-0.9369F, 3.4145F, 2.5823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -2.2047F, 0.2103F, 0.0124F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(60, 0).addBox(-0.7369F, 3.0208F, 0.7747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 59).addBox(-0.5369F, 2.8208F, 0.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 55).addBox(-0.9369F, 2.8208F, 0.9747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 4).addBox(-0.7369F, 2.8208F, 1.1997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.812F, 0.2103F, 0.0124F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(50, 78).addBox(-2.0571F, 6.0341F, -0.253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.5795F, -0.0524F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(69, 51).addBox(-2.0571F, 4.6451F, 0.6108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(40, 78).addBox(-2.0571F, 4.5701F, 0.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 34).addBox(-2.0571F, 4.9451F, 0.2608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.7104F, -0.0524F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(74, 73).addBox(-0.8939F, 0.6163F, 0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.6027F, 0.1717F, -0.0662F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(72, 0).addBox(-0.8685F, 1.2073F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 23).addBox(-0.8685F, 1.8073F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.4259F, 0.1797F, -0.026F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(25, 72).addBox(-0.8685F, 2.0211F, -0.0498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.4826F, 0.1797F, -0.026F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(66, 69).addBox(-0.8685F, 2.4646F, 0.3604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.631F, 0.1797F, -0.026F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(72, 41).addBox(-0.8685F, 2.2702F, 1.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.8055F, 0.1797F, -0.026F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(59, 72).addBox(-0.8685F, 1.8639F, 0.8852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.7008F, 0.1797F, -0.026F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(72, 12).addBox(-0.8685F, 1.8025F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(54, 72).addBox(-0.8685F, 1.2025F, -0.2742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.2077F, 0.1797F, -0.026F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(32, 69).addBox(-0.8685F, -0.3375F, -0.5613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 0.1703F, 0.1925F, -1.0158F, 0.1797F, -0.026F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(77, 45).addBox(0.5F, 0.3503F, 0.9147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 10).addBox(0.0F, 0.3503F, 2.9147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 45).mirror().addBox(-1.5F, 0.3503F, 0.9147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 10).mirror().addBox(-2.0F, 0.3503F, 2.9147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2927F, 1.7764F, -0.2716F, -0.0829F, 0.027F));

		PartDefinition cube_r344 = tail.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(69, 79).addBox(0.0F, -0.8787F, 2.0448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 61).addBox(0.0F, -0.8787F, 0.0448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.071F, 0.8699F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, -0.5707F, -0.037F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(67, 62).addBox(0.1F, -0.0707F, -0.037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 16).addBox(0.1F, -0.0707F, 1.963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 62).mirror().addBox(-2.1F, -0.0707F, -0.037F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 16).mirror().addBox(-2.1F, -0.0707F, 1.963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4227F, 4.882F, 0.2271F, -0.0871F, -0.0046F));

		PartDefinition cube_r345 = tail2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(72, 79).addBox(0.0F, -0.4127F, -1.1385F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3707F, 3.063F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r346 = tail2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(66, 79).addBox(0.0F, -0.15F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7707F, 1.463F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 27).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(68, 18).addBox(-0.1F, 0.4F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 79).addBox(0.5F, 0.4F, 1.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 18).mirror().addBox(-1.9F, 0.4F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 79).mirror().addBox(-1.5F, 0.4F, 1.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4587F, 4.0098F, 0.2024F, -0.1283F, -0.0262F));

		PartDefinition cube_r347 = tail3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, -0.3F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F))
				.texOffs(30, 79).addBox(-0.1F, 0.4F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 79).mirror().addBox(-0.9F, 0.4F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0197F, 3.9622F, 0.2009F, -0.0428F, -0.0087F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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