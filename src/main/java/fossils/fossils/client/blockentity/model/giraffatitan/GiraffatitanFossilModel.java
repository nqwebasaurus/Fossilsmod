package fossils.fossils.client.blockentity.model.giraffatitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GiraffatitanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips2;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart neck11;
	private final ModelPart neck12;
	private final ModelPart neck13;
	private final ModelPart neck14;
	private final ModelPart neck15;
	private final ModelPart neck16;
	private final ModelPart head2;
	private final ModelPart bone;
	private final ModelPart bone9;
	private final ModelPart jaw2;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftHand;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightHand;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;

	public GiraffatitanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips2 = this.root.getChild("hips2");
		this.tail8 = this.hips2.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.body2 = this.hips2.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.neck9 = this.body3.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.neck11 = this.neck10.getChild("neck11");
		this.neck12 = this.neck11.getChild("neck12");
		this.neck13 = this.neck12.getChild("neck13");
		this.neck14 = this.neck13.getChild("neck14");
		this.neck15 = this.neck14.getChild("neck15");
		this.neck16 = this.neck15.getChild("neck16");
		this.head2 = this.neck16.getChild("head2");
		this.bone = this.head2.getChild("bone");
		this.bone9 = this.bone.getChild("bone9");
		this.jaw2 = this.head2.getChild("jaw2");
		this.leftArm4 = this.body3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftHand = this.leftArm5.getChild("leftHand");
		this.rightArm4 = this.body3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightHand = this.rightArm5.getChild("rightHand");
		this.leftLeg5 = this.hips2.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftFoot = this.leftLeg6.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg5 = this.hips2.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightFoot = this.rightLeg6.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 1.45F, -25.0F));

		PartDefinition hips2 = root.addOrReplaceChild("hips2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -62.5F, 57.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-3.0F, 0.1F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 118).addBox(6.0F, 0.1F, -7.5F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.5179F, 0.7188F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(125, 230).addBox(-0.5F, -4.3F, -1.2F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -7.1121F, -3.1014F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(154, 217).addBox(-0.5F, -3.6F, -2.2F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -6.1274F, 0.7871F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(229, 214).addBox(-0.5F, -3.0F, -2.9F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(238, 209).addBox(-0.5F, -3.0F, 0.3F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.7697F, 6.1328F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 168).addBox(-8.44F, -8.9574F, -12.3911F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5399F, 24.33F, 4.7411F, -0.9256F, 0.0179F, 0.4829F));

		PartDefinition cube_r6 = hips2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(208, 203).addBox(-8.4623F, -15.0767F, -9.0719F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5904F, 34.1488F, 13.2929F, -0.3497F, 0.0179F, 0.4829F));

		PartDefinition cube_r7 = hips2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(191, 203).addBox(-6.4284F, -14.7925F, 2.7927F, 2.0F, 10.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.7F, 23.65F, -3.6162F, 0.2644F, -0.458F, 0.3678F));

		PartDefinition cube_r8 = hips2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(209, 153).addBox(-7.5501F, -18.2354F, -2.6962F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8648F, 24.726F, 0.0104F, 0.0351F, 0.292F, 0.4992F));

		PartDefinition cube_r9 = hips2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 219).addBox(-4.607F, 1.8411F, 1.7394F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(216, 45).addBox(-4.607F, -8.1589F, 2.7394F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7F, 23.65F, -3.6162F, 0.2201F, -0.4162F, 0.0823F));

		PartDefinition cube_r10 = hips2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 189).addBox(-10.0176F, -11.9658F, 3.9087F, 2.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8889F, 25.7416F, 2.5342F, 0.8981F, 0.1568F, 0.6124F));

		PartDefinition cube_r11 = hips2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(192, 220).addBox(-7.9316F, -13.5436F, 6.8392F, 2.0F, 6.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4022F, 31.3943F, 2.6933F, 0.5872F, -0.458F, 0.4725F));

		PartDefinition cube_r12 = hips2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(192, 220).mirror().addBox(5.9316F, -13.5436F, 6.8392F, 2.0F, 6.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5978F, 31.3943F, 2.6933F, 0.5872F, 0.458F, -0.4725F));

		PartDefinition cube_r13 = hips2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(21, 189).mirror().addBox(8.0176F, -11.9658F, 3.9087F, 2.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8889F, 25.7416F, 2.5342F, 0.8981F, -0.1568F, -0.6124F));

		PartDefinition cube_r14 = hips2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(209, 153).mirror().addBox(5.5501F, -18.2354F, -2.6962F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8648F, 24.726F, 0.0104F, 0.0351F, -0.292F, -0.4992F));

		PartDefinition cube_r15 = hips2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(208, 203).mirror().addBox(6.4623F, -15.0767F, -9.0719F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5904F, 34.1488F, 13.2929F, -0.3497F, -0.0179F, -0.4829F));

		PartDefinition cube_r16 = hips2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(61, 168).mirror().addBox(6.44F, -8.9574F, -12.3911F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5399F, 24.33F, 4.7411F, -0.9256F, -0.0179F, -0.4829F));

		PartDefinition cube_r17 = hips2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 219).mirror().addBox(2.607F, 1.8411F, 1.7394F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(216, 45).mirror().addBox(2.607F, -8.1589F, 2.7394F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 23.65F, -3.6162F, 0.2201F, 0.4162F, -0.0823F));

		PartDefinition cube_r18 = hips2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 207).addBox(-1.0F, -14.7129F, -6.6933F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(9.0F, 8.1545F, -2.8324F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(175, 145).addBox(7.5F, -12.4916F, -11.3295F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(175, 145).mirror().addBox(-9.5F, -12.4916F, -11.3295F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 11.474F, 1.5776F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(117, 135).addBox(-1.0F, -13.9105F, -15.9381F, 2.0F, 4.0F, 15.0F, new CubeDeformation(-0.003F))
				.texOffs(117, 135).mirror().addBox(-18.0F, -13.9105F, -15.9381F, 2.0F, 4.0F, 15.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(9.0F, 12.8932F, 3.7214F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(113, 155).addBox(-6.1297F, -17.4025F, -11.2399F, 2.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 20.3342F, 0.7682F, -0.3283F, -0.0044F, 0.2784F));

		PartDefinition cube_r22 = hips2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 206).addBox(-1.0F, -19.6134F, -2.9021F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(57, 206).mirror().addBox(-18.0F, -19.6134F, -2.9021F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(9.0F, 11.8545F, -5.9324F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hips2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(19, 207).mirror().addBox(-1.0F, -14.7129F, -6.6933F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 8.1545F, -2.8324F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hips2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(113, 155).mirror().addBox(4.1297F, -17.4025F, -11.2399F, 2.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 20.3342F, 0.7682F, -0.3283F, 0.0044F, -0.2784F));

		PartDefinition cube_r25 = hips2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(191, 203).mirror().addBox(4.4284F, -14.7925F, 2.7927F, 2.0F, 10.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.7F, 23.65F, -3.6162F, 0.2644F, 0.458F, -0.3678F));

		PartDefinition cube_r26 = hips2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, -2.1232F, -6.2257F, 5.0F, 5.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0111F, -3.4302F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail8 = hips2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.25F, 8.2F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition cube_r27 = tail8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 77).addBox(0.0F, -3.2F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7987F, 11.9454F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(47, 102).addBox(0.0F, -3.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7195F, 8.7841F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 135).addBox(-1.0F, -0.4591F, -1.4913F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 1.3F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(245, 89).addBox(-0.5F, -3.1F, 9.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(202, 153).addBox(-0.5F, -3.4F, 5.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(62, 245).addBox(-0.5F, -2.8F, 2.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(44, 245).addBox(-0.5F, -2.4F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7129F, 2.1936F, -0.3229F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(159, 33).addBox(-2.0F, -1.4555F, -0.0038F, 4.0F, 4.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.95F, 13.375F, -0.3155F, -0.2494F, 0.0804F));

		PartDefinition cube_r31 = tail9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(246, 65).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2409F, 10.1121F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(43, 118).addBox(0.0F, -2.1F, 2.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 94).addBox(0.0F, -4.0F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5768F, 6.4256F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 68).addBox(0.0F, -4.1F, -0.1F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3286F, 3.1107F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail9.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(207, 245).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2789F, 6.2483F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail9.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(245, 96).addBox(-0.5F, -0.9F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.321F, 1.9069F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1555F, 10.7962F, -0.1506F, -0.1726F, 0.0261F));

		PartDefinition cube_r36 = tail10.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -0.1F, 0.175F, 3.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1614F, -0.3608F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail10.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(189, 250).addBox(0.0F, -1.2F, 14.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail10.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(165, 250).addBox(0.0F, -1.2F, 11.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail10.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(132, 250).addBox(0.0F, -1.2F, 8.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail10.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(95, 250).addBox(0.0F, -0.2F, 5.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail10.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(249, 245).addBox(0.0F, -0.2F, 1.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(249, 167).addBox(0.0F, -0.1F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7083F, 2.6796F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail10.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(57, 194).addBox(0.0F, 7.3F, 11.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 189).addBox(0.0F, 5.2F, 8.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 183).addBox(0.0F, 3.5F, 6.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 109).addBox(0.0F, 1.3F, 3.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 176).addBox(0.0F, -1.2F, 1.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 125).addBox(0.0F, -2.9F, -0.8F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9193F, 3.1514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5614F, 19.6142F, 0.407F, 0.1605F, 0.0688F));

		PartDefinition cube_r43 = tail11.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 112).addBox(-0.5F, 0.1F, -0.925F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1357F, 0.602F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail11.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(5, 252).addBox(0.0F, 0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4821F, 18.5559F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail11.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(242, 251).addBox(0.0F, -2.0F, 12.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.02F, 2.0507F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail11.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(225, 251).addBox(0.0F, -1.3F, 8.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(214, 251).addBox(0.0F, -1.1F, 5.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(250, 241).addBox(0.0F, -0.8F, 2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(249, 172).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.32F, 2.0507F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail11.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(133, 200).addBox(0.0F, 19.4F, 24.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 199).addBox(0.0F, 17.5F, 22.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(196, 133).addBox(0.0F, 15.1F, 20.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(196, 128).addBox(0.0F, 12.9F, 18.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 195).addBox(0.0F, 10.4F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 85).addBox(0.0F, 8.8F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7759F, -16.4886F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2643F, 19.577F, 0.0177F, 0.1745F, 0.0031F));

		PartDefinition cube_r48 = tail12.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(102, 89).addBox(-0.5F, -0.1F, -0.325F, 2.0F, 1.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8186F, 0.1841F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail12.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 132).addBox(0.0F, 0.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 205).addBox(0.0F, -2.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.538F, 3.705F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail12.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(199, 141).addBox(0.0F, 22.2F, 27.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.893F, -35.9065F, 0.8203F, 0.0F, 0.0F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(51, 89).addBox(-0.5F, -0.4937F, -0.4528F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0186F, 20.6591F, -0.085F, 0.3914F, -0.0325F));

		PartDefinition body2 = hips2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -7.5F, 0.0089F, 0.0432F, 0.0061F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 38).addBox(-8.5F, -4.5F, 19.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 47).addBox(-8.5F, -4.5F, 17.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 0).addBox(-8.5F, -4.5F, 15.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 0).addBox(-8.5F, -4.5F, 13.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 11).addBox(-8.5F, -4.5F, 11.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 11).addBox(-8.5F, -4.5F, 9.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 11).addBox(-8.5F, -4.5F, 7.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 0).addBox(-8.5F, -4.5F, 5.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 38).addBox(-8.5F, -4.5F, -3.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 38).addBox(-8.5F, -4.5F, -1.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 47).addBox(-8.5F, -4.5F, 1.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 47).addBox(-8.5F, -4.5F, 3.0F, 17.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 20.7001F, -21.1232F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(120, 33).addBox(-3.0F, -0.3788F, 0.1209F, 5.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.2897F, -11.5791F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 231).addBox(-1.5396F, -4.8359F, -1.6255F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -3.8911F, 0.647F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(234, 168).mirror().addBox(-3.0641F, 0.8549F, -0.8745F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -3.8911F, 0.647F, -0.5068F, 0.1984F, 0.3412F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(231, 19).mirror().addBox(3.0584F, 4.9068F, -1.2246F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -21.509F, -28.5441F, -0.0057F, -0.0407F, -0.5439F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(168, 89).mirror().addBox(-18.0402F, 5.7701F, -1.1813F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -21.509F, -28.5441F, 0.0069F, -0.0231F, -0.9364F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 157).mirror().addBox(-38.6146F, -3.1402F, -1.1813F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -21.509F, -28.5441F, 0.0168F, -0.0173F, -1.4165F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(230, 79).mirror().addBox(3.0929F, 4.8743F, -0.826F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -17.709F, -24.6441F, -0.0357F, -0.0588F, -0.5424F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(167, 16).mirror().addBox(-18.0025F, 5.752F, -0.782F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -17.709F, -24.6441F, -0.0138F, -0.0512F, -0.9357F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(171, 29).mirror().addBox(-34.5728F, -3.1389F, -0.782F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -17.709F, -24.6441F, 0.0115F, -0.0518F, -1.4163F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(230, 76).mirror().addBox(3.0347F, 4.9276F, -1.5234F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -14.509F, -19.5441F, -0.0882F, -0.0902F, -0.5385F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(159, 49).mirror().addBox(-18.065F, 5.7812F, -1.4805F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -14.509F, -19.5441F, -0.0502F, -0.1004F, -0.9329F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(198, 86).mirror().addBox(-31.6418F, -3.1419F, -1.4805F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -14.509F, -19.5441F, 0.002F, -0.1121F, -1.4155F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(229, 86).mirror().addBox(3.0477F, 4.9302F, -1.1313F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -10.009F, -14.8441F, -0.179F, -0.1435F, -0.5279F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(185, 125).mirror().addBox(-14.0606F, 5.7874F, -1.0883F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -10.009F, -14.8441F, -0.1135F, -0.1842F, -0.9239F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(198, 13).mirror().addBox(-28.0701F, -1.3623F, -1.1163F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1203F, -10.009F, -14.8441F, -0.0145F, -0.2156F, -1.4128F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(232, 193).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -6.1149F, -4.1538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(192, 232).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -8.8149F, -8.1538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(232, 189).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -12.4149F, -13.0538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(232, 185).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -17.0149F, -18.4538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(232, 181).mirror().addBox(-3.3675F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5396F, -20.6149F, -23.4538F, -0.6338F, 0.2405F, 0.3135F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(238, 220).mirror().addBox(-12.0858F, 0.7544F, -1.1433F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -0.9352F, -1.4543F, -0.0762F, -0.5512F, -1.3894F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(236, 73).mirror().addBox(-6.0656F, 3.9188F, -1.1153F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -0.9352F, -1.4543F, -0.3388F, -0.4495F, -0.8528F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(229, 11).mirror().addBox(0.4804F, 3.9702F, -1.1187F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -0.9352F, -1.4543F, -0.4862F, -0.306F, -0.4587F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(216, 67).mirror().addBox(-9.3386F, 3.3892F, -0.8939F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -3.2352F, -6.1543F, -0.2473F, -0.3494F, -0.8885F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(211, 119).mirror().addBox(-19.7964F, -1.2796F, -0.9219F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -3.2352F, -6.1543F, -0.0504F, -0.4223F, -1.4015F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(228, 70).mirror().addBox(0.9533F, 3.2023F, -0.9077F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -3.2352F, -6.1543F, -0.3652F, -0.246F, -0.4918F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(210, 16).mirror().addBox(-22.8377F, -2.2407F, -0.8526F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -6.1352F, -10.3543F, -0.0319F, -0.319F, -1.4082F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(209, 73).mirror().addBox(-11.5347F, 3.5351F, -0.8246F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -6.1352F, -10.3543F, -0.1789F, -0.2674F, -0.9093F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(226, 110).mirror().addBox(0.8291F, 3.4118F, -0.8356F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.428F, -6.1352F, -10.3543F, -0.2712F, -0.1955F, -0.5124F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(232, 177).mirror().addBox(-3.7863F, -0.7852F, 0.3621F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -23.917F, -28.4577F, -0.7025F, 0.2615F, 0.2964F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(234, 168).addBox(-1.9359F, 0.8549F, -0.8745F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -3.8911F, 0.647F, -0.5068F, -0.1984F, -0.3412F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(231, 44).addBox(-1.5396F, -6.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -5.7149F, -4.1538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(231, 19).addBox(-9.0584F, 4.9068F, -1.2246F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -21.509F, -28.5441F, -0.0057F, 0.0407F, 0.5439F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(168, 89).addBox(-0.9598F, 5.7701F, -1.1813F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -21.509F, -28.5441F, 0.0069F, 0.0231F, 0.9364F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(23, 157).addBox(18.6146F, -3.1402F, -1.1813F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -21.509F, -28.5441F, 0.0168F, 0.0173F, 1.4165F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(230, 79).addBox(-9.0929F, 4.8743F, -0.826F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -17.709F, -24.6441F, -0.0357F, 0.0588F, 0.5424F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(167, 16).addBox(-0.9975F, 5.752F, -0.782F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -17.709F, -24.6441F, -0.0138F, 0.0512F, 0.9357F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(171, 29).addBox(18.5728F, -3.1389F, -0.782F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -17.709F, -24.6441F, 0.0115F, 0.0518F, 1.4163F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(230, 76).addBox(-9.0347F, 4.9276F, -1.5234F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -14.509F, -19.5441F, -0.0882F, 0.0902F, 0.5385F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(159, 49).addBox(-0.935F, 5.7812F, -1.4805F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -14.509F, -19.5441F, -0.0502F, 0.1004F, 0.9329F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(198, 86).addBox(18.6418F, -3.1419F, -1.4805F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -14.509F, -19.5441F, 0.002F, 0.1121F, 1.4155F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(229, 86).addBox(-9.0477F, 4.9302F, -1.1313F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -10.009F, -14.8441F, -0.179F, 0.1435F, 0.5279F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(185, 125).addBox(-0.9394F, 5.7874F, -1.0883F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -10.009F, -14.8441F, -0.1135F, 0.1842F, 0.9239F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(198, 13).addBox(15.0701F, -1.3623F, -1.1163F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.1203F, -10.009F, -14.8441F, -0.0145F, 0.2156F, 1.4128F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(232, 193).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -6.1149F, -4.1538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(192, 232).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -8.8149F, -8.1538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 228).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -8.4149F, -8.1538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(232, 189).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -12.4149F, -13.0538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(230, 226).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -12.0149F, -13.0538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(232, 185).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -17.0149F, -18.4538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(134, 230).addBox(-1.5396F, -7.1418F, -1.482F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -16.6149F, -18.4538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(232, 181).addBox(-1.6325F, 0.1223F, -0.482F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5396F, -20.6149F, -23.4538F, -0.6338F, -0.2405F, -0.3135F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(169, 225).addBox(-1.5396F, -10.1418F, -1.482F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5396F, -20.2149F, -23.4538F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(238, 220).addBox(7.0858F, 0.7544F, -1.1433F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -0.9352F, -1.4543F, -0.0762F, 0.5512F, 1.3894F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(236, 73).addBox(1.0656F, 3.9188F, -1.1153F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -0.9352F, -1.4543F, -0.3388F, 0.4495F, 0.8528F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(229, 11).addBox(-6.4804F, 3.9702F, -1.1187F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -0.9352F, -1.4543F, -0.4862F, 0.306F, 0.4587F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(216, 67).addBox(0.3386F, 3.3892F, -0.8939F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -3.2352F, -6.1543F, -0.2473F, 0.3494F, 0.8885F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(211, 119).addBox(9.7964F, -1.2796F, -0.9219F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -3.2352F, -6.1543F, -0.0504F, 0.4223F, 1.4015F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(228, 70).addBox(-6.9533F, 3.2023F, -0.9077F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -3.2352F, -6.1543F, -0.3652F, 0.246F, 0.4918F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(210, 16).addBox(11.8377F, -2.2407F, -0.8526F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -6.1352F, -10.3543F, -0.0319F, 0.319F, 1.4082F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(209, 73).addBox(0.5347F, 3.5351F, -0.8246F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -6.1352F, -10.3543F, -0.1789F, 0.2674F, 0.9093F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(226, 110).addBox(-6.8291F, 3.4118F, -0.8356F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.428F, -6.1352F, -10.3543F, -0.2712F, 0.1955F, 0.5124F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(232, 177).addBox(-1.2137F, -0.7852F, 0.3621F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -23.917F, -28.4577F, -0.7025F, -0.2615F, -0.2964F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(106, 225).addBox(-1.5F, -11.1405F, -0.6379F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -23.917F, -28.4577F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 0).addBox(-2.0F, -0.0512F, -0.3866F, 5.0F, 5.0F, 27.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -26.2897F, -30.9791F, -0.7069F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5F, -32.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(136, 192).mirror().addBox(-1.5F, -5.9F, -6.5F, 3.0F, 10.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-14.6873F, -0.7347F, 1.1425F, -0.0072F, 0.3514F, 0.3966F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(118, 62).mirror().addBox(-4.0475F, -17.3018F, -3.9631F, 3.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 19.7273F, -23.8363F, -0.5285F, -0.8711F, -0.737F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 115).mirror().addBox(-19.5F, -15.6999F, -0.191F, 3.0F, 15.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 10.9273F, -24.1363F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 202).mirror().addBox(-1.5F, -5.0F, -3.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.7059F, 3.5723F, -3.634F, -0.8292F, 0.1791F, 0.192F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(82, 189).mirror().addBox(-27.5826F, -19.8019F, 6.809F, 3.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 10.9273F, -24.1363F, -0.6879F, 0.3514F, 0.3966F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(209, 197).mirror().addBox(-11.2381F, 0.3221F, -2.764F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.142F, 6.4631F, -21.5594F, -1.5449F, 0.6624F, 0.1885F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(153, 232).mirror().addBox(-0.3797F, 0.2053F, -2.764F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.142F, 6.4631F, -21.5594F, -1.5482F, 0.4443F, 0.1823F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(211, 116).mirror().addBox(-17.775F, 4.3874F, -1.1994F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9555F, 34.5803F, -5.4161F, 0.1432F, 0.5633F, -0.0872F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(224, 131).mirror().addBox(-8.1036F, 0.3369F, -0.8414F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9555F, 34.5803F, -5.4161F, -0.2463F, 0.5073F, -0.7084F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(224, 128).mirror().addBox(-7.7229F, 0.2653F, -1.6637F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3555F, 35.1803F, -3.4161F, -0.8574F, 0.967F, -1.0275F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(185, 122).mirror().addBox(-22.4767F, 4.0773F, -2.0002F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3555F, 35.1803F, -3.4161F, 0.2043F, 1.1951F, 0.0721F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(223, 8).mirror().addBox(-7.9286F, -0.3486F, -0.9869F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6555F, 35.6803F, -4.1161F, -0.7029F, 0.7591F, -0.9057F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(195, 70).mirror().addBox(-20.9725F, 3.7F, -1.3007F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6555F, 35.6803F, -4.1161F, -0.0289F, 0.99F, -0.1326F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(222, 122).mirror().addBox(-8.2882F, -1.2049F, -3.0623F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4555F, 36.0803F, -3.4161F, -0.4776F, 0.6849F, -0.7451F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(201, 83).mirror().addBox(-20.7001F, 3.0082F, -3.3408F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4555F, 36.0803F, -3.4161F, 0.0908F, 0.8208F, -0.0268F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(220, 125).mirror().addBox(-7.5886F, -0.5584F, -1.6188F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1555F, 35.9803F, -3.4161F, -0.3885F, 0.5426F, -0.6734F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(211, 113).mirror().addBox(-17.7814F, 3.3048F, -1.9059F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1555F, 35.9803F, -3.4161F, 0.0469F, 0.6643F, -0.0364F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(170, 73).mirror().addBox(-15.4761F, -0.5711F, -0.8889F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1555F, 35.8803F, -5.3161F, -0.472F, 0.3592F, -0.2026F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(193, 110).mirror().addBox(-13.91F, 0.1314F, -1.8665F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1555F, 34.8803F, -6.4161F, -0.3935F, 0.3168F, 0.0254F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(78, 154).mirror().addBox(2.3008F, 2.6615F, -9.0851F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(209, 177).mirror().addBox(4.3008F, 2.6615F, -16.0851F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1555F, 31.3803F, -3.4161F, -0.5861F, 0.1471F, 0.2173F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(152, 142).mirror().addBox(-39.9774F, -3.3469F, -1.0218F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -0.7658F, -1.0047F, 0.0249F, 0.0344F, -1.4164F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(168, 119).mirror().addBox(-18.4574F, 5.7543F, -1.0218F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -0.7658F, -1.0047F, 0.038F, 0.0191F, -0.9365F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(232, 82).mirror().addBox(2.6696F, 5.0512F, -1.0581F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -0.7658F, -1.0047F, 0.0391F, -0.0136F, -0.5451F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(152, 139).mirror().addBox(-40.5638F, -3.2981F, -1.0169F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -5.3658F, -5.6047F, 0.0004F, 0.0553F, -1.4624F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(168, 116).mirror().addBox(-18.955F, 6.0684F, -1.0169F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -5.3658F, -5.6047F, 0.0259F, 0.0488F, -0.9818F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(231, 56).mirror().addBox(2.33F, 5.5316F, -1.046F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -5.3658F, -5.6047F, 0.0393F, 0.0185F, -0.59F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(151, 86).mirror().addBox(-40.4885F, -2.6012F, -1.0479F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -11.4658F, -11.4047F, 0.0003F, 0.0904F, -1.4703F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(168, 113).mirror().addBox(-18.5664F, 6.6518F, -1.0479F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -11.4658F, -11.4047F, 0.0421F, 0.08F, -0.9887F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(231, 27).mirror().addBox(2.9115F, 5.9222F, -1.0854F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8573F, -11.4658F, -11.4047F, 0.0661F, 0.0412F, -0.5971F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(238, 205).mirror().addBox(-4.3035F, -1.0338F, 1.2696F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.617F, -0.4577F, -0.8246F, 0.2953F, 0.2628F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(238, 201).mirror().addBox(-4.2734F, -0.961F, 0.351F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.817F, -4.8577F, -0.9491F, 0.3248F, 0.2248F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 241).mirror().addBox(-3.3595F, -1.169F, 2.834F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -12.717F, -11.8577F, -0.8777F, 0.3085F, 0.247F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(118, 62).addBox(1.0475F, -17.3018F, -3.9631F, 3.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 19.7273F, -23.8363F, -0.5285F, 0.8711F, 0.737F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(47, 115).addBox(16.5F, -15.6999F, -0.191F, 3.0F, 15.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.9273F, -24.1363F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 202).addBox(-1.5F, -5.0F, -3.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.7059F, 3.5723F, -3.634F, -0.8292F, -0.1791F, -0.192F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(136, 192).addBox(-1.5F, -5.9F, -6.5F, 3.0F, 10.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(15.6873F, -0.7347F, 1.1425F, -0.0072F, -0.3514F, -0.3966F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 189).addBox(24.5826F, -19.8019F, 6.809F, 3.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.9273F, -24.1363F, -0.6879F, -0.3514F, -0.3966F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(209, 197).addBox(0.2381F, 0.3221F, -2.764F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.142F, 6.4631F, -21.5594F, -1.5449F, -0.6624F, -0.1885F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(153, 232).addBox(-3.6203F, 0.2053F, -2.764F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.142F, 6.4631F, -21.5594F, -1.5482F, -0.4443F, -0.1823F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(214, 100).addBox(-9.6555F, 9.4387F, -19.2418F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1555F, 31.3803F, -3.4161F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(209, 187).addBox(-6.142F, 1.7417F, -0.9571F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.142F, 6.4631F, -21.5594F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(211, 116).addBox(6.775F, 4.3874F, -1.1994F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9555F, 34.5803F, -5.4161F, 0.1432F, -0.5633F, 0.0872F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(224, 131).addBox(-0.8964F, 0.3369F, -0.8414F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9555F, 34.5803F, -5.4161F, -0.2463F, -0.5073F, 0.7084F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(224, 128).addBox(-1.2771F, 0.2653F, -1.6637F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3555F, 35.1803F, -3.4161F, -0.8574F, -0.967F, 1.0275F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(185, 122).addBox(6.4767F, 4.0773F, -2.0002F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3555F, 35.1803F, -3.4161F, 0.2043F, -1.1951F, -0.0721F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(223, 8).addBox(-1.0714F, -0.3486F, -0.9869F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6555F, 35.6803F, -4.1161F, -0.7029F, -0.7591F, 0.9057F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(195, 70).addBox(6.9725F, 3.7F, -1.3007F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6555F, 35.6803F, -4.1161F, -0.0289F, -0.99F, 0.1326F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(222, 122).addBox(-0.7118F, -1.2049F, -3.0623F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4555F, 36.0803F, -3.4161F, -0.4776F, -0.6849F, 0.7451F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(201, 83).addBox(7.7001F, 3.0082F, -3.3408F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4555F, 36.0803F, -3.4161F, 0.0908F, -0.8208F, 0.0268F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(220, 125).addBox(-1.4114F, -0.5584F, -1.6188F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1555F, 35.9803F, -3.4161F, -0.3885F, -0.5426F, 0.6734F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(211, 113).addBox(6.7814F, 3.3048F, -1.9059F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1555F, 35.9803F, -3.4161F, 0.0469F, -0.6643F, 0.0364F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(170, 73).addBox(-1.5239F, -0.5711F, -0.8889F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1555F, 35.8803F, -5.3161F, -0.472F, -0.3592F, 0.2026F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(193, 110).addBox(-0.09F, 0.1314F, -1.8665F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1555F, 34.8803F, -6.4161F, -0.3935F, -0.3168F, -0.0254F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(78, 154).addBox(-8.3008F, 2.6615F, -9.0851F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(209, 177).addBox(-8.3008F, 2.6615F, -16.0851F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1555F, 31.3803F, -3.4161F, -0.5861F, -0.1471F, -0.2173F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 62).addBox(-2.0F, -0.2431F, -0.4948F, 5.0F, 5.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.7F, -14.65F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(152, 142).addBox(18.9774F, -3.3469F, -1.0218F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -0.7658F, -1.0047F, 0.0249F, -0.0344F, 1.4164F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(168, 119).addBox(-0.5426F, 5.7543F, -1.0218F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -0.7658F, -1.0047F, 0.038F, -0.0191F, 0.9365F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(232, 82).addBox(-8.6696F, 5.0512F, -1.0581F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -0.7658F, -1.0047F, 0.0391F, 0.0136F, 0.5451F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(152, 139).addBox(19.5638F, -3.2981F, -1.0169F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -5.3658F, -5.6047F, 0.0004F, -0.0553F, 1.4624F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(168, 116).addBox(-0.045F, 6.0684F, -1.0169F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -5.3658F, -5.6047F, 0.0259F, -0.0488F, 0.9818F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(231, 56).addBox(-8.33F, 5.5316F, -1.046F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -5.3658F, -5.6047F, 0.0393F, -0.0185F, 0.59F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(151, 86).addBox(19.4885F, -2.6012F, -1.0479F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -11.4658F, -11.4047F, 0.0003F, -0.0904F, 1.4703F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(168, 113).addBox(-0.4336F, 6.6518F, -1.0479F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -11.4658F, -11.4047F, 0.0421F, -0.08F, 0.9887F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(231, 27).addBox(-8.9115F, 5.9222F, -1.0854F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8573F, -11.4658F, -11.4047F, 0.0661F, -0.0412F, 0.5971F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(238, 205).addBox(-0.6965F, -1.0338F, 1.2696F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.617F, -0.4577F, -0.8246F, -0.2953F, -0.2628F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(17, 228).addBox(-1.5F, -10.4919F, 0.2696F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -3.617F, -0.4577F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(238, 201).addBox(-0.7266F, -0.961F, 0.351F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -6.817F, -4.8577F, -0.9491F, -0.3248F, -0.2248F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(178, 225).addBox(-1.5F, -10.4132F, -0.649F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, -6.817F, -4.8577F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 241).addBox(-0.6405F, -1.169F, 2.834F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -12.717F, -11.8577F, -0.8777F, -0.3085F, -0.247F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(140, 155).addBox(-1.0F, -10.6383F, -0.166F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -12.717F, -11.8577F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck9 = body3.addOrReplaceChild("neck9", CubeListBuilder.create().texOffs(65, 33).addBox(-2.0F, -2.5165F, -22.3423F, 4.0F, 5.0F, 23.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -12.4595F, -16.0816F, -0.8818F, -0.0198F, 0.0389F));

		PartDefinition cube_r187 = neck9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(103, 195).addBox(-3.2326F, -12.1106F, -12.9517F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r188 = neck9.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(247, 44).mirror().addBox(4.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r189 = neck9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(53, 228).mirror().addBox(-1.4585F, -13.3405F, 3.8989F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r190 = neck9.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(247, 49).mirror().addBox(4.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r191 = neck9.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(81, 231).mirror().addBox(-1.4585F, -13.3405F, 3.8989F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r192 = neck9.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(85, 243).mirror().addBox(-0.4636F, -4.8741F, -1.1039F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.6199F, -0.1108F, 0.2244F));

		PartDefinition cube_r193 = neck9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 245).mirror().addBox(-0.8123F, -0.2683F, -0.8761F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 4.7744F, 1.5301F, -0.0814F, 0.2299F));

		PartDefinition cube_r194 = neck9.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(21, 243).mirror().addBox(-0.4636F, -4.4176F, -0.8633F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.5501F, -0.1108F, 0.2244F));

		PartDefinition cube_r195 = neck9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(14, 243).mirror().addBox(-0.4361F, -9.8134F, -1.5813F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.4989F, 3.5757F, 1.6744F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r196 = neck9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(245, 209).mirror().addBox(1.1161F, -10.6185F, 1.297F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.6854F, 3.6315F, 1.603F, -0.0105F, -0.886F));

		PartDefinition cube_r197 = neck9.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(239, 223).mirror().addBox(-2.7678F, -10.8185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.6854F, 3.6315F, 1.6046F, 0.0017F, -1.2523F));

		PartDefinition cube_r198 = neck9.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(242, 0).mirror().addBox(-2.8944F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.1854F, 3.6315F, 1.6027F, 0.0142F, -0.4187F));

		PartDefinition cube_r199 = neck9.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(207, 241).mirror().addBox(-2.8944F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.3854F, -8.0685F, 1.6027F, 0.0142F, -0.4187F));

		PartDefinition cube_r200 = neck9.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(179, 240).mirror().addBox(-3.1013F, -0.3034F, -1.0748F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 5.1854F, -6.7685F, 1.6021F, -0.0613F, 0.236F));

		PartDefinition cube_r201 = neck9.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(202, 19).mirror().addBox(-2.2187F, -6.564F, -4.3083F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.5345F, -0.091F, 0.2331F));

		PartDefinition cube_r202 = neck9.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(183, 193).mirror().addBox(-2.2187F, -5.8798F, -4.1778F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.4647F, -0.091F, 0.2331F));

		PartDefinition cube_r203 = neck9.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(239, 59).mirror().addBox(-2.1167F, -13.2241F, -4.9562F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.4337F, -0.0606F, 0.2391F));

		PartDefinition cube_r204 = neck9.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(230, 238).mirror().addBox(-2.7678F, -11.2185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.6046F, 0.0017F, -1.2523F));

		PartDefinition cube_r205 = neck9.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(245, 121).mirror().addBox(1.1161F, -11.2185F, 1.297F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.2326F, 1.8854F, -8.0685F, 1.603F, -0.0105F, -0.886F));

		PartDefinition cube_r206 = neck9.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(247, 49).addBox(-5.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition cube_r207 = neck9.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(81, 231).addBox(0.4585F, -13.3405F, 3.8989F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r208 = neck9.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(85, 243).addBox(-0.5364F, -4.8741F, -1.1039F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.6199F, 0.1108F, -0.2244F));

		PartDefinition cube_r209 = neck9.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(51, 245).addBox(-0.1877F, -0.2683F, -0.8761F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 4.7744F, 1.5301F, 0.0814F, -0.2299F));

		PartDefinition cube_r210 = neck9.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(21, 243).addBox(-0.5364F, -4.4176F, -0.8633F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.5501F, 0.1108F, -0.2244F));

		PartDefinition cube_r211 = neck9.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(14, 243).addBox(-0.5639F, -9.8134F, -1.5813F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4989F, 3.5757F, 1.6744F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r212 = neck9.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(245, 209).addBox(-4.1161F, -10.6185F, 1.297F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.2326F, 1.6854F, 3.6315F, 1.603F, 0.0105F, 0.886F));

		PartDefinition cube_r213 = neck9.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(239, 223).addBox(-2.2322F, -10.8185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.6854F, 3.6315F, 1.6046F, -0.0017F, 1.2523F));

		PartDefinition cube_r214 = neck9.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(242, 0).addBox(-2.1056F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.1854F, 3.6315F, 1.6027F, -0.0142F, 0.4187F));

		PartDefinition cube_r215 = neck9.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(207, 241).addBox(-2.1056F, -10.5864F, -2.3842F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.6027F, -0.0142F, 0.4187F));

		PartDefinition cube_r216 = neck9.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(179, 240).addBox(2.1013F, -0.3034F, -1.0748F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 5.1854F, -6.7685F, 1.6021F, 0.0613F, -0.236F));

		PartDefinition cube_r217 = neck9.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(202, 19).addBox(1.2187F, -6.564F, -4.3083F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.5345F, 0.091F, -0.2331F));

		PartDefinition cube_r218 = neck9.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(183, 193).addBox(1.2187F, -5.8798F, -4.1778F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.4647F, 0.091F, -0.2331F));

		PartDefinition cube_r219 = neck9.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(239, 59).addBox(1.1167F, -13.2241F, -4.9562F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.4337F, 0.0606F, -0.2391F));

		PartDefinition cube_r220 = neck9.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(230, 238).addBox(-2.2322F, -11.2185F, 0.6221F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.6046F, -0.0017F, 1.2523F));

		PartDefinition cube_r221 = neck9.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(245, 121).addBox(-4.1161F, -11.2185F, 1.297F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.2326F, 1.8854F, -8.0685F, 1.603F, 0.0105F, 0.886F));

		PartDefinition cube_r222 = neck9.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(90, 168).addBox(-3.2326F, -12.1106F, -12.9517F, 0.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r223 = neck9.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(53, 228).addBox(0.4585F, -13.3405F, 3.8989F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r224 = neck9.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(247, 44).addBox(-5.3537F, -14.4767F, 4.8989F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2326F, 1.3854F, -8.0685F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4165F, -22.3423F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r225 = neck10.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(69, 247).mirror().addBox(5.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, 1.1403F, -13.9242F, 1.6066F, 0.4103F, 0.6268F));

		PartDefinition cube_r226 = neck10.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(226, 140).mirror().addBox(-0.5092F, -13.5251F, 2.3438F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, 1.1403F, -13.9242F, 1.6036F, -0.0258F, 0.6117F));

		PartDefinition cube_r227 = neck10.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(76, 247).mirror().addBox(5.7903F, -16.8188F, 4.6187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6447F, 0.3844F, 0.6416F));

		PartDefinition cube_r228 = neck10.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(207, 226).mirror().addBox(-1.1464F, -16.0703F, 3.6187F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6394F, -0.0509F, 0.6103F));

		PartDefinition cube_r229 = neck10.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(242, 30).mirror().addBox(-2.1276F, -13.3292F, -1.6064F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6825F, 0.0496F, -0.4161F));

		PartDefinition cube_r230 = neck10.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(102, 240).mirror().addBox(-0.5178F, 10.4579F, -1.6457F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.8041F, 5.2076F, 0.9094F, 1.8094F, -0.0814F, 0.2299F));

		PartDefinition cube_r231 = neck10.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(240, 89).mirror().addBox(-0.5178F, 0.0148F, -0.7078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.8041F, 5.2076F, 0.9094F, 1.7221F, -0.0814F, 0.2299F));

		PartDefinition cube_r232 = neck10.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(160, 243).mirror().addBox(-2.2988F, -0.4296F, -0.9172F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 5.9426F, -5.9229F, 1.6199F, -0.1108F, 0.2244F));

		PartDefinition cube_r233 = neck10.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(120, 243).mirror().addBox(-2.2988F, 0.0031F, -0.367F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 5.9426F, -5.9229F, 1.5501F, -0.1108F, 0.2244F));

		PartDefinition cube_r234 = neck10.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(240, 44).mirror().addBox(-2.3422F, -15.9203F, -4.6251F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 2.6426F, 2.6771F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r235 = neck10.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(235, 103).mirror().addBox(-4.8288F, -2.2093F, -0.9276F, 5.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.7738F, 0.6486F, -9.2363F, 1.632F, 0.0846F, -1.2511F));

		PartDefinition cube_r236 = neck10.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(245, 145).mirror().addBox(0.8386F, -13.9554F, 1.0517F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.3332F, 1.5426F, 2.6771F, 1.6582F, 0.057F, -0.8847F));

		PartDefinition cube_r237 = neck10.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(245, 140).mirror().addBox(1.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 2.5796F, -11.5078F, 1.6306F, 0.0233F, -0.8858F));

		PartDefinition cube_r238 = neck10.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(95, 239).mirror().addBox(-1.039F, -15.9229F, -3.0449F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.6796F, -11.5078F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r239 = neck10.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(26, 242).mirror().addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.3413F, 2.7909F, -23.3153F, 1.6232F, 0.037F, -1.1299F));

		PartDefinition cube_r240 = neck10.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(235, 140).mirror().addBox(-0.6199F, -0.414F, -0.6009F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 5.1796F, -19.6078F, 1.4136F, -0.0788F, 0.2374F));

		PartDefinition cube_r241 = neck10.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(235, 89).mirror().addBox(-0.6199F, -0.8565F, -1.1327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 5.1796F, -19.6078F, 1.4572F, -0.0788F, 0.2374F));

		PartDefinition cube_r242 = neck10.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(147, 122).mirror().addBox(-1.779F, -1.2609F, -0.9521F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.0553F, 6.5796F, -8.0078F, 1.6241F, -0.0403F, 0.2349F));

		PartDefinition cube_r243 = neck10.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(57, 241).mirror().addBox(-1.779F, 9.1588F, -1.9358F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-5.0553F, 6.5796F, -8.0078F, 1.7288F, -0.0403F, 0.2349F));

		PartDefinition cube_r244 = neck10.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(242, 4).mirror().addBox(-2.2F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6544F, 4.7525F, -23.5084F, 1.6426F, 0.0319F, -0.4177F));

		PartDefinition cube_r245 = neck10.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(242, 30).addBox(-2.8724F, -13.3292F, -1.6064F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6825F, -0.0496F, 0.4161F));

		PartDefinition cube_r246 = neck10.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(102, 240).addBox(-0.4822F, 10.4579F, -1.6457F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.8041F, 5.2076F, 0.9094F, 1.8094F, 0.0814F, -0.2299F));

		PartDefinition cube_r247 = neck10.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(240, 89).addBox(-0.4822F, 0.0148F, -0.7078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.8041F, 5.2076F, 0.9094F, 1.7221F, 0.0814F, -0.2299F));

		PartDefinition cube_r248 = neck10.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(160, 243).addBox(1.2988F, -0.4296F, -0.9172F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.3332F, 5.9426F, -5.9229F, 1.6199F, 0.1108F, -0.2244F));

		PartDefinition cube_r249 = neck10.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(120, 243).addBox(1.2988F, 0.0031F, -0.367F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 5.9426F, -5.9229F, 1.5501F, 0.1108F, -0.2244F));

		PartDefinition cube_r250 = neck10.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(240, 44).addBox(1.3422F, -15.9203F, -4.6251F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3332F, 2.6426F, 2.6771F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r251 = neck10.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(235, 103).addBox(-0.1712F, -2.2093F, -0.9276F, 5.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.7738F, 0.6486F, -9.2363F, 1.632F, -0.0846F, 1.2511F));

		PartDefinition cube_r252 = neck10.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(245, 145).addBox(-3.8386F, -13.9554F, 1.0517F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6582F, -0.057F, 0.8847F));

		PartDefinition cube_r253 = neck10.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 247).addBox(-6.7903F, -16.8188F, 4.6187F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6447F, -0.3844F, -0.6416F));

		PartDefinition cube_r254 = neck10.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(165, 172).addBox(-3.3332F, -11.5648F, -15.6572F, 0.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck10.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(207, 226).addBox(0.1464F, -16.0703F, 3.6187F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3332F, 1.5426F, 2.6771F, 1.6394F, 0.0509F, -0.6103F));

		PartDefinition cube_r256 = neck10.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(80, 115).addBox(-3.1163F, -9.2853F, -13.0446F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck10.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(69, 247).addBox(-6.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, 1.6066F, -0.4103F, -0.6268F));

		PartDefinition cube_r258 = neck10.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(226, 140).addBox(-0.4908F, -13.5251F, 2.3438F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, 1.1403F, -13.9242F, 1.6036F, 0.0258F, -0.6117F));

		PartDefinition cube_r259 = neck10.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(245, 140).addBox(-4.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(4.9553F, 2.5796F, -11.5078F, 1.6306F, -0.0233F, 0.8858F));

		PartDefinition cube_r260 = neck10.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(95, 239).addBox(0.039F, -15.9229F, -3.0449F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 3.6796F, -11.5078F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r261 = neck10.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(26, 242).addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.3413F, 2.7909F, -23.3153F, 1.6232F, -0.037F, 1.1299F));

		PartDefinition cube_r262 = neck10.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(235, 140).addBox(-0.3801F, -0.414F, -0.6009F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 5.1796F, -19.6078F, 1.4136F, 0.0788F, -0.2374F));

		PartDefinition cube_r263 = neck10.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(235, 89).addBox(-0.3801F, -0.8565F, -1.1327F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.9553F, 5.1796F, -19.6078F, 1.4572F, 0.0788F, -0.2374F));

		PartDefinition cube_r264 = neck10.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(147, 122).addBox(0.779F, -1.2609F, -0.9521F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.0553F, 6.5796F, -8.0078F, 1.6241F, 0.0403F, -0.2349F));

		PartDefinition cube_r265 = neck10.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 241).addBox(0.779F, 9.1588F, -1.9358F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(5.0553F, 6.5796F, -8.0078F, 1.7288F, 0.0403F, -0.2349F));

		PartDefinition cube_r266 = neck10.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(242, 4).addBox(-2.8F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6544F, 4.7525F, -23.5084F, 1.6426F, -0.0319F, 0.4177F));

		PartDefinition cube_r267 = neck10.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 0).addBox(0.25F, 0.2F, -0.35F, 3.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -0.5199F, -28.1713F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck11 = neck10.addOrReplaceChild("neck11", CubeListBuilder.create().texOffs(130, 0).addBox(-1.5F, -1.7651F, -14.7846F, 3.0F, 4.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.4801F, -28.2213F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck11.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(247, 76).mirror().addBox(5.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, -0.1049F, -0.6875F, 1.6066F, 0.4103F, 0.6268F));

		PartDefinition cube_r269 = neck11.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(26, 228).mirror().addBox(-0.5092F, -13.5251F, 2.3438F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1163F, -0.1049F, -0.6875F, 1.6036F, -0.0258F, 0.6117F));

		PartDefinition cube_r270 = neck11.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(242, 40).mirror().addBox(-2.2F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6544F, 3.5073F, -10.2717F, 1.6426F, 0.0319F, -0.4177F));

		PartDefinition cube_r271 = neck11.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(237, 243).mirror().addBox(-0.4823F, 15.701F, -2.1446F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-6.3066F, 4.3372F, 3.865F, 1.7118F, -0.0362F, 0.2356F));

		PartDefinition cube_r272 = neck11.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(115, 225).mirror().addBox(-0.4823F, -0.7625F, -0.5063F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-6.3066F, 4.3372F, 3.865F, 1.6071F, -0.0362F, 0.2356F));

		PartDefinition cube_r273 = neck11.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(197, 236).mirror().addBox(-0.5742F, -0.852F, -1.3273F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.4344F, -6.3711F, 1.5254F, -0.095F, 0.2315F));

		PartDefinition cube_r274 = neck11.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(192, 236).mirror().addBox(-0.5742F, -0.401F, -0.7952F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 3.4344F, -6.3711F, 1.4817F, -0.095F, 0.2315F));

		PartDefinition cube_r275 = neck11.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(37, 242).mirror().addBox(-1.039F, -14.9229F, -3.0449F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 2.1344F, 1.7289F, 1.5187F, -0.081F, 0.233F));

		PartDefinition cube_r276 = neck11.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(242, 34).mirror().addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.3413F, 1.5457F, -10.0786F, 1.6232F, 0.037F, -1.1299F));

		PartDefinition cube_r277 = neck11.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(245, 150).mirror().addBox(1.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-4.9553F, 1.3344F, 1.7289F, 1.6306F, 0.0233F, -0.8858F));

		PartDefinition cube_r278 = neck11.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(242, 40).addBox(-2.8F, -1.0F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6544F, 3.5073F, -10.2717F, 1.6426F, -0.0319F, 0.4177F));

		PartDefinition cube_r279 = neck11.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(237, 243).addBox(-0.5177F, 15.701F, -2.1446F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(6.3066F, 4.3372F, 3.865F, 1.7118F, 0.0362F, -0.2356F));

		PartDefinition cube_r280 = neck11.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(115, 225).addBox(-0.5177F, -0.7625F, -0.5063F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(6.3066F, 4.3372F, 3.865F, 1.6071F, 0.0362F, -0.2356F));

		PartDefinition cube_r281 = neck11.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(197, 236).addBox(-0.4258F, -0.852F, -1.3273F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.9553F, 3.4344F, -6.3711F, 1.5254F, 0.095F, -0.2315F));

		PartDefinition cube_r282 = neck11.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(192, 236).addBox(-0.4258F, -0.401F, -0.7952F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 3.4344F, -6.3711F, 1.4817F, 0.095F, -0.2315F));

		PartDefinition cube_r283 = neck11.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(37, 242).addBox(0.039F, -14.9229F, -3.0449F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9553F, 2.1344F, 1.7289F, 1.5187F, 0.081F, -0.233F));

		PartDefinition cube_r284 = neck11.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(242, 34).addBox(-2.0F, -2.0F, -0.7F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.3413F, 1.5457F, -10.0786F, 1.6232F, -0.037F, 1.1299F));

		PartDefinition cube_r285 = neck11.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(245, 150).addBox(-4.9663F, -13.8144F, -0.1283F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(4.9553F, 1.3344F, 1.7289F, 1.6306F, -0.0233F, 0.8858F));

		PartDefinition cube_r286 = neck11.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(247, 76).addBox(-6.2921F, -14.2428F, 3.3438F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, 1.6066F, -0.4103F, -0.6268F));

		PartDefinition cube_r287 = neck11.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(26, 228).addBox(-0.4908F, -13.5251F, 2.3438F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, 1.6036F, 0.0258F, -0.6117F));

		PartDefinition cube_r288 = neck11.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(168, 92).addBox(-3.1163F, -9.2853F, -14.0446F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1163F, -0.1049F, -0.6875F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck12 = neck11.addOrReplaceChild("neck12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1349F, -14.7846F, 0.0872F, 0.0438F, 0.0038F));

		PartDefinition cube_r289 = neck12.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 34).addBox(-0.25F, 0.0F, -0.15F, 3.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.4846F, -28.7085F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r290 = neck12.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(170, 52).addBox(-2.7561F, -8.8921F, -16.6866F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7561F, -0.2854F, 1.8257F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck12.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(247, 126).mirror().addBox(-1.7017F, -1.6396F, -0.7906F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.5809F, -0.0376F, -0.8855F));

		PartDefinition cube_r292 = neck12.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(242, 245).mirror().addBox(2.4847F, -14.7053F, 2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5758F, -0.4419F, -16.9584F, 1.5371F, 0.3682F, 0.6004F));

		PartDefinition cube_r293 = neck12.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(228, 30).mirror().addBox(-1.7315F, -12.0003F, 1.4099F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5758F, -0.4419F, -16.9584F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r294 = neck12.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(247, 176).mirror().addBox(-0.5006F, -1.8F, -1.0023F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5946F, -3.6192F, -14.5457F, 1.5676F, 0.4356F, 0.6108F));

		PartDefinition cube_r295 = neck12.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(216, 226).mirror().addBox(-0.6599F, -16.1827F, 1.921F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7561F, -0.2854F, 1.8257F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r296 = neck12.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(141, 247).mirror().addBox(2.3319F, -13.6307F, 0.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-3.9951F, 2.6768F, 1.2702F, 1.5477F, -0.0781F, -0.8836F));

		PartDefinition cube_r297 = neck12.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(243, 134).mirror().addBox(-0.0323F, -13.6307F, 0.0801F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.9951F, 2.6768F, 1.2702F, 1.5602F, -0.0807F, -1.0411F));

		PartDefinition cube_r298 = neck12.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(120, 221).mirror().addBox(-0.2939F, 14.0152F, -4.0224F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.5218F, -0.0475F, 0.2442F));

		PartDefinition cube_r299 = neck12.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(237, 30).mirror().addBox(-0.1588F, 3.3058F, -0.9795F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3201F, -0.0559F, 0.2437F));

		PartDefinition cube_r300 = neck12.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(202, 236).mirror().addBox(-0.1588F, 2.8433F, -1.6731F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3638F, -0.0559F, 0.2437F));

		PartDefinition cube_r301 = neck12.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(125, 242).mirror().addBox(-0.2898F, -3.2151F, -1.8076F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2007F, 1.1255F, -10.2671F, 1.3912F, -0.0502F, 0.2414F));

		PartDefinition cube_r302 = neck12.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(243, 109).mirror().addBox(-1.5F, -1.0F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5463F, 2.3426F, -10.5944F, 1.6055F, 0.004F, -0.1134F));

		PartDefinition cube_r303 = neck12.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(103, 189).mirror().addBox(-4.218F, -1.6396F, -0.5629F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.5866F, -0.0355F, -1.0426F));

		PartDefinition cube_r304 = neck12.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(187, 225).mirror().addBox(-1.5581F, 16.6082F, -4.387F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3891F, -0.0262F, 0.2429F));

		PartDefinition cube_r305 = neck12.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(67, 228).mirror().addBox(-1.5581F, 2.7737F, -3.6944F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3455F, -0.0262F, 0.2429F));

		PartDefinition cube_r306 = neck12.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(153, 243).mirror().addBox(-1.5635F, -3.1142F, -4.7944F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.4504F, -0.0288F, 0.24F));

		PartDefinition cube_r307 = neck12.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(62, 228).mirror().addBox(-1.5581F, 2.1933F, -4.3622F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8636F, -2.7357F, -24.7418F, 1.3891F, -0.0262F, 0.2429F));

		PartDefinition cube_r308 = neck12.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(245, 213).mirror().addBox(-1.5F, -0.5F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.494F, 1.2103F, -25.7786F, 1.5708F, 0.0F, 0.1047F));

		PartDefinition cube_r309 = neck12.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(247, 176).addBox(-0.4994F, -1.8F, -1.0023F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5946F, -3.6192F, -14.5457F, 1.5676F, -0.4356F, -0.6108F));

		PartDefinition cube_r310 = neck12.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(216, 226).addBox(-0.3401F, -16.1827F, 1.921F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7561F, -0.2854F, 1.8257F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r311 = neck12.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(141, 247).addBox(-4.3319F, -13.6307F, 0.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(3.9951F, 2.6768F, 1.2702F, 1.5477F, 0.0781F, 0.8836F));

		PartDefinition cube_r312 = neck12.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(243, 134).addBox(-2.9677F, -13.6307F, 0.0801F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.9951F, 2.6768F, 1.2702F, 1.5602F, 0.0807F, 1.0411F));

		PartDefinition cube_r313 = neck12.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(120, 221).addBox(-0.7061F, 14.0152F, -4.0224F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.5218F, 0.0475F, -0.2442F));

		PartDefinition cube_r314 = neck12.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(237, 30).addBox(-0.8412F, 3.3058F, -0.9795F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3201F, 0.0559F, -0.2437F));

		PartDefinition cube_r315 = neck12.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(202, 236).addBox(-0.8412F, 2.8433F, -1.6731F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3638F, 0.0559F, -0.2437F));

		PartDefinition cube_r316 = neck12.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(125, 242).addBox(-0.7102F, -3.2151F, -1.8076F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2007F, 1.1255F, -10.2671F, 1.3912F, 0.0502F, -0.2414F));

		PartDefinition cube_r317 = neck12.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(243, 109).addBox(-2.5F, -1.0F, -0.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5463F, 2.3426F, -10.5944F, 1.6055F, -0.004F, 0.1134F));

		PartDefinition cube_r318 = neck12.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(228, 30).addBox(0.7315F, -12.0003F, 1.4099F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r319 = neck12.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(242, 245).addBox(-3.4847F, -14.7053F, 2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, 1.5371F, -0.3682F, -0.6004F));

		PartDefinition cube_r320 = neck12.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(140, 172).addBox(-1.5758F, -8.3002F, -12.5222F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5758F, -0.4419F, -16.9584F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r321 = neck12.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(247, 126).addBox(-0.2983F, -1.6396F, -0.7906F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.5809F, 0.0376F, 0.8855F));

		PartDefinition cube_r322 = neck12.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(103, 189).addBox(1.218F, -1.6396F, -0.5629F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.5866F, 0.0355F, 1.0426F));

		PartDefinition cube_r323 = neck12.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(187, 225).addBox(0.5581F, 16.6082F, -4.387F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3891F, 0.0262F, -0.2429F));

		PartDefinition cube_r324 = neck12.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(67, 228).addBox(0.5581F, 2.7737F, -3.6944F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3455F, 0.0262F, -0.2429F));

		PartDefinition cube_r325 = neck12.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(153, 243).addBox(0.5635F, -3.1142F, -4.7944F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.4504F, 0.0288F, -0.24F));

		PartDefinition cube_r326 = neck12.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(62, 228).addBox(0.5581F, 2.1933F, -4.3622F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8636F, -2.7357F, -24.7418F, 1.3891F, 0.0262F, -0.2429F));

		PartDefinition cube_r327 = neck12.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(245, 213).addBox(-1.5F, -0.5F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.494F, 1.2103F, -25.7786F, 1.5708F, 0.0F, -0.1047F));

		PartDefinition neck13 = neck12.addOrReplaceChild("neck13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8846F, -28.7585F, 0.3056F, 0.0433F, 0.0057F));

		PartDefinition cube_r328 = neck13.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(113, 176).addBox(-1.3799F, -8.0831F, -11.9488F, 0.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck13.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(82, 185).mirror().addBox(-1.688F, -1.4554F, -0.8303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(247, 181).mirror().addBox(-2.688F, -1.4554F, -0.8303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.5868F, -0.0511F, -1.06F));

		PartDefinition cube_r330 = neck13.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(246, 59).mirror().addBox(2.2754F, -14.1832F, 2.0969F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3799F, 0.6536F, -1.4444F, 1.4981F, 0.3926F, 0.5859F));

		PartDefinition cube_r331 = neck13.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(35, 228).mirror().addBox(-1.7496F, -11.4382F, 1.0969F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3799F, 0.6536F, -1.4444F, 1.5036F, 0.0443F, 0.6108F));

		PartDefinition cube_r332 = neck13.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(112, 244).mirror().addBox(-1.2856F, -2.3987F, -4.0352F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.4408F, -0.0399F, 0.066F));

		PartDefinition cube_r333 = neck13.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(90, 231).mirror().addBox(-1.2828F, 2.3254F, -3.4422F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.362F, -0.0374F, 0.069F));

		PartDefinition cube_r334 = neck13.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(9, 230).mirror().addBox(-1.2828F, 2.458F, -2.7324F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.3184F, -0.0374F, 0.069F));

		PartDefinition cube_r335 = neck13.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(225, 226).mirror().addBox(-1.2828F, 16.1127F, -0.8526F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0844F, -2.02F, -10.7586F, 1.2049F, -0.0374F, 0.069F));

		PartDefinition cube_r336 = neck13.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(246, 8).mirror().addBox(-1.6F, -0.5F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 0.6676F, -11.7227F, 1.5277F, -0.0068F, -0.1569F));

		PartDefinition cube_r337 = neck13.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(35, 228).addBox(0.7496F, -11.4382F, 1.0969F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, 1.5036F, -0.0443F, -0.6108F));

		PartDefinition cube_r338 = neck13.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(82, 185).addBox(-0.312F, -1.4554F, -0.8303F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(247, 181).addBox(0.688F, -1.4554F, -0.8303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.5868F, 0.0511F, 1.06F));

		PartDefinition cube_r339 = neck13.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(112, 244).addBox(0.2856F, -2.3987F, -4.0352F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.4408F, 0.0399F, -0.066F));

		PartDefinition cube_r340 = neck13.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(90, 231).addBox(0.2828F, 2.3254F, -3.4422F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.362F, 0.0374F, -0.069F));

		PartDefinition cube_r341 = neck13.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(9, 230).addBox(0.2828F, 2.458F, -2.7324F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.3184F, 0.0374F, -0.069F));

		PartDefinition cube_r342 = neck13.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(225, 226).addBox(0.2828F, 16.1127F, -0.8526F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0844F, -2.02F, -10.7586F, 1.2049F, 0.0374F, -0.069F));

		PartDefinition cube_r343 = neck13.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(246, 59).addBox(-3.2754F, -14.1832F, 2.0969F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3799F, 0.6536F, -1.4444F, 1.4981F, -0.3926F, -0.5859F));

		PartDefinition cube_r344 = neck13.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(246, 8).addBox(-1.4F, -0.5F, -0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6109F, 0.6676F, -11.7227F, 1.5277F, 0.0068F, 0.1569F));

		PartDefinition cube_r345 = neck13.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(80, 135).addBox(-0.25F, -0.3F, -0.05F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.25F, -2.2886F, -14.5954F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck14 = neck13.addOrReplaceChild("neck14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5886F, -14.5954F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck14.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(152, 122).addBox(-0.25F, -0.1F, -0.05F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.946F, -12.6159F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r347 = neck14.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(190, 32).addBox(-1.3748F, -6.8339F, -10.7857F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3748F, 0.223F, -1.2891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r348 = neck14.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(23, 154).mirror().addBox(-1.2F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6057F, 0.3362F, -10.4337F, 1.5277F, -0.0068F, -0.1569F));

		PartDefinition cube_r349 = neck14.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(247, 191).mirror().addBox(-0.4601F, -1.8971F, -0.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8819F, -3.2121F, -11.4368F, 1.4981F, 0.3926F, 0.5859F));

		PartDefinition cube_r350 = neck14.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(229, 201).mirror().addBox(-1.5749F, -10.2891F, 0.8439F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3748F, 0.223F, -1.2891F, 1.5036F, 0.0443F, 0.6108F));

		PartDefinition cube_r351 = neck14.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(247, 186).mirror().addBox(-2.8501F, -1.3694F, -0.9024F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(246, 85).mirror().addBox(-1.8501F, -1.3694F, -0.9024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.5639F, -0.0382F, -1.059F));

		PartDefinition cube_r352 = neck14.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(174, 245).mirror().addBox(-1.2908F, -1.3077F, -3.2053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.4414F, 0.0036F, 0.066F));

		PartDefinition cube_r353 = neck14.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(143, 231).mirror().addBox(-1.2878F, 2.569F, -2.8902F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.3191F, 0.0062F, 0.069F));

		PartDefinition cube_r354 = neck14.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(148, 231).mirror().addBox(-1.2878F, 16.2409F, -0.9968F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0884F, -2.2324F, -9.5614F, 1.2056F, 0.0062F, 0.069F));

		PartDefinition cube_r355 = neck14.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(247, 191).addBox(-0.5399F, -1.8971F, -0.5604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8819F, -3.2121F, -11.4368F, 1.4981F, -0.3926F, -0.5859F));

		PartDefinition cube_r356 = neck14.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(229, 201).addBox(0.5749F, -10.2891F, 0.8439F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3748F, 0.223F, -1.2891F, 1.5036F, -0.0443F, -0.6108F));

		PartDefinition cube_r357 = neck14.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(23, 154).addBox(-1.8F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6057F, 0.3362F, -10.4337F, 1.5277F, 0.0068F, 0.1569F));

		PartDefinition cube_r358 = neck14.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(246, 85).addBox(-0.1499F, -1.3694F, -0.9024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(247, 186).addBox(0.8501F, -1.3694F, -0.9024F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.5639F, 0.0382F, 1.059F));

		PartDefinition cube_r359 = neck14.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(174, 245).addBox(0.2908F, -1.3077F, -3.2053F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.4414F, -0.0036F, -0.066F));

		PartDefinition cube_r360 = neck14.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(143, 231).addBox(0.2878F, 2.569F, -2.8902F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.3191F, -0.0062F, -0.069F));

		PartDefinition cube_r361 = neck14.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(148, 231).addBox(0.2878F, 16.2409F, -0.9968F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0884F, -2.2324F, -9.5614F, 1.2056F, -0.0062F, -0.069F));

		PartDefinition neck15 = neck14.addOrReplaceChild("neck15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.696F, -12.7159F, 0.4362F, -0.0309F, -0.0534F));

		PartDefinition cube_r362 = neck15.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(167, 0).addBox(-1.5F, -0.0505F, -0.0719F, 3.0F, 3.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.9567F, -10.7093F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck15.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(172, 203).addBox(-1.2817F, -8.0394F, -7.3866F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2817F, 1.3565F, -2.967F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck15.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(245, 70).mirror().addBox(-0.3079F, -0.5392F, -0.5248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2972F, -1.9011F, -17.3465F, 1.4923F, 0.0014F, 0.0174F));

		PartDefinition cube_r365 = neck15.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(68, 157).mirror().addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2631F, -1.0764F, -9.2247F, 1.3527F, 0.0038F, 0.017F));

		PartDefinition cube_r366 = neck15.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(184, 244).mirror().addBox(-0.562F, 10.4811F, 0.603F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.1939F, -0.0054F, -0.0502F));

		PartDefinition cube_r367 = neck15.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(32, 154).mirror().addBox(-0.4614F, -1.096F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3084F, -5.9102F, -18.1307F, 1.4618F, 0.4985F, 0.5631F));

		PartDefinition cube_r368 = neck15.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(202, 49).mirror().addBox(-0.1299F, -4.314F, 0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(248, 18).mirror().addBox(-1.1299F, -4.314F, 0.8138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -1.9498F, -13.631F, 1.5738F, -0.0835F, -1.1901F));

		PartDefinition cube_r369 = neck15.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(72, 252).mirror().addBox(0.2714F, -4.3394F, 1.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -1.9498F, -13.631F, 1.5031F, -0.0398F, -0.531F));

		PartDefinition cube_r370 = neck15.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(230, 243).mirror().addBox(-1.5309F, -6.403F, 1.5476F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2317F, -2.0498F, -12.231F, 1.4749F, 0.0643F, 0.6092F));

		PartDefinition cube_r371 = neck15.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(248, 54).mirror().addBox(-0.3569F, -1.9677F, -1.2077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5946F, -4.7688F, -9.496F, 1.3282F, 0.5265F, 0.5042F));

		PartDefinition cube_r372 = neck15.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(248, 26).mirror().addBox(0.9676F, -7.0777F, 1.2983F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(26, 248).mirror().addBox(-0.0324F, -7.0777F, 1.2983F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2817F, 1.6565F, -3.167F, 1.5209F, -0.2129F, -1.1822F));

		PartDefinition cube_r373 = neck15.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 230).mirror().addBox(-2.2689F, -7.8321F, 1.68F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2817F, 1.3565F, -2.967F, 1.3594F, 0.1436F, 0.5972F));

		PartDefinition cube_r374 = neck15.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(240, 140).mirror().addBox(-0.5191F, 12.2856F, 2.4039F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 0.9423F, -0.0304F, -0.0575F));

		PartDefinition cube_r375 = neck15.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(225, 245).mirror().addBox(-0.5136F, -1.4537F, -0.4645F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 1.2654F, -0.0334F, -0.06F));

		PartDefinition cube_r376 = neck15.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(107, 240).mirror().addBox(-0.5191F, 2.0911F, -0.185F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6817F, -0.7435F, -9.367F, 1.143F, -0.0304F, -0.0575F));

		PartDefinition cube_r377 = neck15.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(220, 241).mirror().addBox(-0.562F, 1.9137F, -0.3323F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.2812F, -0.0054F, -0.0502F));

		PartDefinition cube_r378 = neck15.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(214, 245).mirror().addBox(-0.5573F, -1.6476F, -0.589F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5317F, -2.1498F, -17.231F, 1.4035F, -0.0081F, -0.0531F));

		PartDefinition cube_r379 = neck15.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(248, 54).addBox(-0.6431F, -1.9677F, -1.2077F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5946F, -4.7688F, -9.496F, 1.3282F, -0.5265F, -0.5042F));

		PartDefinition cube_r380 = neck15.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 230).addBox(1.2689F, -7.8321F, 1.68F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2817F, 1.3565F, -2.967F, 1.3594F, -0.1436F, -0.5972F));

		PartDefinition cube_r381 = neck15.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(240, 140).addBox(-0.4809F, 12.2856F, 2.4039F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 0.9423F, 0.0304F, 0.0575F));

		PartDefinition cube_r382 = neck15.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(225, 245).addBox(-0.4864F, -1.4537F, -0.4645F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 1.2654F, 0.0334F, 0.06F));

		PartDefinition cube_r383 = neck15.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(107, 240).addBox(-0.4809F, 2.0911F, -0.185F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6817F, -0.7435F, -9.367F, 1.143F, 0.0304F, 0.0575F));

		PartDefinition cube_r384 = neck15.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(245, 217).addBox(-2.92F, -7.1056F, 2.4176F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2817F, 1.6565F, -3.167F, 1.3821F, 0.1101F, 0.5219F));

		PartDefinition cube_r385 = neck15.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(248, 26).addBox(-2.9676F, -7.0777F, 1.2983F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(26, 248).addBox(-1.9676F, -7.0777F, 1.2983F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2817F, 1.6565F, -3.167F, 1.5209F, 0.2129F, 1.1822F));

		PartDefinition cube_r386 = neck15.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(68, 157).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2631F, -1.0764F, -9.2247F, 1.3527F, -0.0038F, -0.017F));

		PartDefinition cube_r387 = neck15.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(245, 70).addBox(-1.6921F, -0.5392F, -0.5248F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2972F, -1.9011F, -17.3465F, 1.4923F, -0.0014F, -0.0174F));

		PartDefinition cube_r388 = neck15.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(184, 244).addBox(-0.438F, 10.4811F, 0.603F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.1939F, 0.0054F, 0.0502F));

		PartDefinition cube_r389 = neck15.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(220, 241).addBox(-0.438F, 1.9137F, -0.3323F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.2812F, 0.0054F, 0.0502F));

		PartDefinition cube_r390 = neck15.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(214, 245).addBox(-0.4427F, -1.6476F, -0.589F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5317F, -2.1498F, -17.231F, 1.4035F, 0.0081F, 0.0531F));

		PartDefinition cube_r391 = neck15.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(72, 252).addBox(-1.2714F, -4.3394F, 1.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2317F, -1.9498F, -13.631F, 1.5031F, 0.0398F, 0.531F));

		PartDefinition cube_r392 = neck15.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(248, 18).addBox(-0.8701F, -4.314F, 0.8138F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(202, 49).addBox(-1.8701F, -4.314F, 0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.2317F, -1.9498F, -13.631F, 1.5738F, 0.0835F, 1.1901F));

		PartDefinition cube_r393 = neck15.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(172, 193).addBox(-1.2317F, -5.3624F, -4.8913F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2317F, -2.0498F, -12.231F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck15.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(32, 154).addBox(-0.5386F, -1.096F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3084F, -5.9102F, -18.1307F, 1.4618F, -0.4985F, -0.5631F));

		PartDefinition cube_r395 = neck15.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(230, 243).addBox(0.5309F, -6.403F, 1.5476F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2317F, -2.0498F, -12.231F, 1.4749F, -0.0643F, -0.6092F));

		PartDefinition cube_r396 = neck15.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(202, 141).addBox(-1.5F, -0.15F, -0.05F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5567F, -18.7093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck16 = neck15.addOrReplaceChild("neck16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8907F, -18.6933F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck16.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(247, 131).mirror().addBox(-1.3426F, -0.607F, -1.6092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7085F, -0.5884F, -2.8026F, 1.3273F, -0.0971F, -0.3721F));

		PartDefinition cube_r398 = neck16.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(194, 250).mirror().addBox(-0.5351F, 6.6315F, 0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 0.811F, -0.0225F, -0.0647F));

		PartDefinition cube_r399 = neck16.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(211, 45).mirror().addBox(-0.5351F, 2.2157F, -0.4015F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 0.9855F, -0.0225F, -0.0647F));

		PartDefinition cube_r400 = neck16.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(9, 246).mirror().addBox(-0.5351F, -1.3648F, -0.8212F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4812F, 0.4455F, -3.3293F, 1.16F, -0.0225F, -0.0647F));

		PartDefinition cube_r401 = neck16.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(249, 81).mirror().addBox(-1.5385F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(77, 252).mirror().addBox(-1.9385F, -0.6293F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8085F, -0.8884F, -2.8026F, 1.5038F, -0.2533F, -1.1783F));

		PartDefinition cube_r402 = neck16.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(252, 89).mirror().addBox(-0.0784F, -0.707F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7085F, -0.5884F, -2.8026F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r403 = neck16.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(245, 155).mirror().addBox(-0.5429F, -0.6448F, 0.467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4085F, -0.9884F, -3.8026F, 1.3228F, 0.1681F, 0.5915F));

		PartDefinition cube_r404 = neck16.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(245, 155).addBox(-0.4571F, -0.6448F, 0.467F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4085F, -0.9884F, -3.8026F, 1.3228F, -0.1681F, -0.5915F));

		PartDefinition cube_r405 = neck16.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(252, 89).addBox(-0.9216F, -0.707F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7085F, -0.5884F, -2.8026F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r406 = neck16.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(77, 252).addBox(0.9385F, -0.6293F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(249, 81).addBox(-0.4615F, -0.6293F, -0.5035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8085F, -0.8884F, -2.8026F, 1.5038F, 0.2533F, 1.1783F));

		PartDefinition cube_r407 = neck16.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(194, 250).addBox(-0.4649F, 6.6315F, 0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 0.811F, 0.0225F, 0.0647F));

		PartDefinition cube_r408 = neck16.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(211, 45).addBox(-0.4649F, 2.2157F, -0.4015F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 0.9855F, 0.0225F, 0.0647F));

		PartDefinition cube_r409 = neck16.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(9, 246).addBox(-0.4649F, -1.3648F, -0.8212F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4812F, 0.4455F, -3.3293F, 1.16F, 0.0225F, 0.0647F));

		PartDefinition cube_r410 = neck16.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(247, 131).addBox(-0.6574F, -0.607F, -1.6092F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7085F, -0.5884F, -2.8026F, 1.3273F, 0.0971F, 0.3721F));

		PartDefinition cube_r411 = neck16.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(37, 135).addBox(0.5F, -3.1F, 1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(125, 221).addBox(-0.5F, -0.1F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -2.3415F, -4.444F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head2 = neck16.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.4062F, -5.11F, 0.2472F, 0.0118F, 0.0477F));

		PartDefinition cube_r412 = head2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(237, 14).addBox(-3.0F, -1.1F, -0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.6472F, -6.5347F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(166, 240).addBox(-2.5F, -1.5854F, -0.0412F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 7.4449F, -8.9027F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(243, 236).addBox(2.0F, -0.8619F, -0.0408F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(238, 113).addBox(-2.0F, -0.8619F, 0.1592F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3346F, -5.0763F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(223, 0).addBox(-3.0F, -0.0634F, 0.0685F, 6.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.9163F, -5.6885F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(38, 252).addBox(-1.0F, -0.0209F, -0.0631F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4802F, -8.1951F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(33, 252).addBox(-1.0F, -1.9151F, -0.0832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.4176F, -9.072F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(90, 247).addBox(-1.0F, -0.1151F, -0.0832F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.4176F, -9.072F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(252, 134).addBox(-0.5F, -0.0529F, -0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -2.8535F, -6.0544F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(125, 252).addBox(-0.5F, -0.9529F, -0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -2.8535F, -6.1544F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(112, 252).addBox(-0.5F, -0.9074F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -2.3535F, -7.5544F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(252, 98).addBox(-0.5F, -0.8282F, -0.1779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.9535F, -8.1544F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(153, 237).addBox(-2.0F, -1.0706F, -0.3524F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -2.1013F, -3.5433F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(55, 221).addBox(-3.0F, 0.2515F, -1.6481F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6163F, -2.3885F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(239, 231).addBox(-2.0F, -1.3F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 5.8848F, -9.9942F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(239, 228).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.7737F, -11.0374F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(236, 197).addBox(-3.0F, -0.6046F, -0.9041F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 7.7737F, -8.9374F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(234, 172).addBox(-3.0F, -1.7F, -0.4F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 6.7693F, -10.243F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(226, 164).addBox(-3.5F, -0.3434F, -2.0225F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.4901F, -4.7915F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(61, 160).addBox(-3.5F, -0.175F, -2.952F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 222).addBox(-3.5F, -2.175F, -2.952F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.6901F, -6.3915F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(226, 160).addBox(-3.5F, 0.0355F, -1.951F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.4901F, -7.9915F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(226, 155).addBox(-3.5F, -0.0417F, -2.0048F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 6.5901F, -6.2915F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(246, 22).addBox(-1.5F, -1.9F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 2.7831F, -3.3452F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(76, 224).addBox(-3.5F, 4.9914F, 1.469F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.1163F, 0.6115F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(252, 12).mirror().addBox(-0.5F, -0.2518F, -0.7217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(252, 12).addBox(6.36F, -0.2518F, -0.7217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.93F, 2.7549F, -4.4603F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(15, 252).mirror().addBox(-0.5F, -1.738F, -0.7548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(15, 252).addBox(6.36F, -1.738F, -0.7548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-2.93F, 3.7549F, -5.5603F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(10, 252).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(10, 252).addBox(6.36F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-2.93F, 2.0549F, -4.7603F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(248, 103).mirror().addBox(-0.8F, 1.7517F, -1.2639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(250, 236).mirror().addBox(-0.8F, -0.2483F, -0.2639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(248, 103).addBox(6.66F, 1.7517F, -1.2639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(250, 236).addBox(6.66F, -0.2483F, -0.2639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.93F, -0.3267F, -0.9316F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(249, 250).mirror().addBox(-0.8F, -0.2483F, -0.2639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(249, 250).addBox(6.66F, -0.2483F, -0.2639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.93F, -0.3267F, -0.9316F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(148, 246).mirror().addBox(-0.8F, -2.6F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(148, 246).addBox(6.66F, -2.6F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.93F, 0.9733F, -1.4316F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(252, 95).mirror().addBox(-0.5F, 0.1412F, -1.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-2.93F, -0.6451F, -1.7603F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(245, 162).mirror().addBox(-4.95F, 80.0804F, -217.7282F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(165, 245).mirror().addBox(-5.17F, 80.0804F, -217.7282F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(199, 250).mirror().addBox(-4.43F, 80.5804F, -217.9282F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(199, 250).addBox(2.43F, 80.5804F, -217.9282F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(165, 245).addBox(2.17F, 80.0804F, -217.7282F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(245, 162).addBox(1.95F, 80.0804F, -217.7282F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.0F, -81.5255F, 213.9679F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(252, 92).mirror().addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false)
				.texOffs(252, 92).addBox(6.36F, 0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(-2.93F, -1.0451F, -3.9603F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 251).mirror().addBox(-0.5F, 0.1F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false), PartPose.offsetAndRotation(-2.93F, -1.0451F, -2.8603F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(252, 95).addBox(-0.5F, 0.1412F, -1.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.93F, -0.6451F, -1.7603F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 251).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(3.93F, -1.0451F, -2.8603F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(76, 218).addBox(-4.0F, -2.0116F, -3.0154F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.2236F, -2.1242F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r448 = head2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(216, 61).addBox(-4.0F, -1.8044F, -2.5841F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 3.8236F, -3.9242F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(209, 169).addBox(-4.0F, -0.3491F, -3.0644F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6236F, -0.7242F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(224, 134).addBox(-4.0F, -0.1942F, -0.8974F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2764F, 0.2758F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(169, 220).addBox(-4.0F, -0.5751F, -2.7802F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.3236F, -0.3242F, -1.1519F, 0.0F, 0.0F));

		PartDefinition bone = head2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -81.5255F, 213.9679F));

		PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.5127F, -0.1909F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r452 = jaw2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(137, 252).mirror().addBox(-3.4F, -2.0438F, 0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(137, 252).addBox(2.4F, -2.0438F, 0.949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(61, 164).addBox(-3.0F, -1.5438F, -0.051F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 10.6076F, 1.9148F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(252, 70).mirror().addBox(-3.5F, -0.9325F, -0.0183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(252, 70).addBox(2.5F, -0.9325F, -0.0183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8608F, 1.0586F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r454 = jaw2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(204, 251).mirror().addBox(-3.5F, 0.0042F, -0.0511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9798F, 0.3793F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r455 = jaw2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(209, 251).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 7.024F, 1.7345F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(62, 252).mirror().addBox(-0.5F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.4564F, 0.39F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(249, 113).mirror().addBox(-4.0F, -0.2397F, -0.9173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(249, 113).addBox(3.0F, -0.2397F, -0.9173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5244F, 0.8061F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r458 = jaw2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(67, 252).mirror().addBox(-0.5F, -1.8027F, -0.9181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 5.624F, 1.5345F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r459 = jaw2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(43, 252).mirror().addBox(-4.0F, -0.0406F, -0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(43, 252).addBox(3.0F, -0.0406F, -0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.4407F, -0.8618F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r460 = jaw2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(252, 137).mirror().addBox(-3.5F, 0.0852F, -0.1376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(252, 137).addBox(2.5F, 0.0852F, -0.1376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 5.0798F, -0.0207F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r461 = jaw2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(251, 196).mirror().addBox(-4.0F, -1.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(251, 196).addBox(3.0F, -1.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8407F, -0.3618F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r462 = jaw2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(170, 251).mirror().addBox(-4.0F, -0.6983F, 0.0121F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(170, 251).addBox(3.0F, -0.6983F, 0.0121F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.2244F, -0.4939F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r463 = jaw2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(67, 252).addBox(-0.5F, -1.8027F, -0.9181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(3.0F, 5.624F, 1.5345F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r464 = jaw2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(209, 251).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(3.0F, 7.024F, 1.7345F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r465 = jaw2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(204, 251).addBox(2.5F, 0.0042F, -0.0511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.9798F, 0.3793F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r466 = jaw2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(231, 22).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 6.5618F, 0.4512F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r467 = jaw2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(72, 243).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.0086F, 0.9576F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(62, 252).addBox(-0.5F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, 0.4564F, 0.39F, -0.3578F, 0.0F, 0.0F));

		PartDefinition leftArm4 = body3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(149, 89).addBox(-3.0F, -1.0513F, -1.7832F, 6.0F, 29.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5F, 19.3509F, -14.2686F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r469 = leftArm4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(175, 161).addBox(-3.3125F, -0.1008F, -1.1586F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1F, 10.0487F, -2.5832F, 0.1712F, 0.7453F, 0.4211F));

		PartDefinition cube_r470 = leftArm4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(122, 195).addBox(-0.7F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.4487F, -0.2832F, -0.1719F, 0.7703F, -0.2444F));

		PartDefinition cube_r471 = leftArm4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(122, 210).addBox(-3.0F, -0.2F, -3.8F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.1487F, 1.0168F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(152, 145).addBox(-2.5F, 0.2963F, -1.7258F, 6.0F, 21.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(42, 189).addBox(-1.5F, 1.6963F, -5.1258F, 4.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 32.7613F, 0.3716F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm5.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(0, 181).addBox(-6.0F, 0.9021F, -1.1388F, 2.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(211, 30).addBox(-4.0F, 0.9021F, -2.1388F, 6.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 185).addBox(2.0F, 0.9021F, -1.1388F, 2.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 21.2963F, -3.8258F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r472 = leftHand.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(132, 242).addBox(1.5F, -2.05F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightArm4 = body3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(151, 53).addBox(-3.0F, -1.0513F, -1.7832F, 6.0F, 29.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 19.3509F, -14.2686F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightArm4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(185, 128).addBox(0.3125F, -0.1008F, -1.1586F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1F, 10.0487F, -2.5832F, 0.1712F, -0.7453F, -0.4211F));

		PartDefinition cube_r474 = rightArm4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(95, 225).addBox(-2.3F, -8.0F, -1.3F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 7.4487F, -0.2832F, -0.1719F, -0.7703F, 0.2444F));

		PartDefinition cube_r475 = rightArm4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(214, 89).addBox(-3.0F, -0.2F, -3.8F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.1487F, 1.0168F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(0, 154).addBox(-3.5F, 0.2963F, -1.7258F, 6.0F, 21.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(157, 193).addBox(-2.5F, 1.6963F, -5.1258F, 4.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 32.7613F, 0.3716F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm5.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(188, 161).addBox(4.0F, 0.9021F, -1.1388F, 2.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(38, 213).addBox(-2.0F, 0.9021F, -2.1388F, 6.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(188, 182).addBox(-4.0F, 0.9021F, -1.1388F, 2.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 21.2963F, -3.8258F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightHand.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 243).addBox(-3.5F, -2.05F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.9021F, 3.8612F, 0.0F, 0.0F, -0.48F));

		PartDefinition leftLeg5 = hips2.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(23, 160).addBox(-1.5F, 3.0159F, -1.677F, 5.0F, 24.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(99, 214).addBox(-1.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, 6.5691F, -0.0261F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r477 = leftLeg5.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(76, 207).addBox(-6.5F, 0.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create().texOffs(51, 68).addBox(3.0F, 3.3881F, -0.1302F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(193, 92).addBox(-3.5F, 7.3881F, -0.5302F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(198, 0).addBox(-3.5F, 1.3881F, -1.5302F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 30.5593F, -0.1397F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg6.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(130, 20).addBox(-7.0F, 1.0F, -7.0F, 13.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 20.9319F, 0.7163F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r478 = leftFoot.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(120, 53).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r479 = leftFoot2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(170, 76).addBox(-4.8F, -2.5F, -0.5F, 11.0F, 5.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.5F, -2.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightLeg5 = hips2.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(42, 160).addBox(-3.5F, 3.0159F, -1.677F, 5.0F, 24.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(208, 215).addBox(-3.5F, -1.9841F, -2.677F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 6.5691F, -0.0261F, -0.0564F, 0.0258F, 0.0173F));

		PartDefinition cube_r480 = rightLeg5.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(208, 19).addBox(1.5F, 0.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.0F, 27.0159F, -1.677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(143, 210).addBox(-5.0F, 3.3881F, -0.1302F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(195, 52).addBox(-2.5F, 7.3881F, -0.5302F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(199, 128).addBox(-2.5F, 1.3881F, -1.5302F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 30.5593F, -0.1397F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg6.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(37, 144).addBox(-6.0F, 1.0F, -7.0F, 13.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 20.9319F, 0.7163F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r481 = rightFoot.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(201, 76).addBox(-5.5F, -0.9266F, -1.0985F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.5F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition cube_r482 = rightFoot2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(171, 19).addBox(-6.2F, -2.5F, -0.5F, 11.0F, 5.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -3.5F, -2.0F, 0.0F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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