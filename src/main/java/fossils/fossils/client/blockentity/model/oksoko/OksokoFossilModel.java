package fossils.fossils.client.blockentity.model.oksoko;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OksokoFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public OksokoFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.5755F, 3.2335F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 83).addBox(-0.5F, -1.7012F, 6.0471F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9302F, -2.3024F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -1.8012F, 0.0471F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9302F, -2.3024F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-0.4257F, -6.1401F, 2.2775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, 2.8867F, -0.0904F, 0.0921F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.4257F, -3.6384F, 4.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(82, 66).mirror().addBox(-0.4257F, -3.6384F, 4.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -2.7856F, -0.0904F, 0.0921F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-0.4257F, 1.498F, -6.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, 0.4607F, -0.0904F, 0.0921F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.4257F, -0.1003F, -6.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, 0.8272F, -0.0904F, 0.0921F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(-0.7627F, 3.4224F, -0.1281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -0.7655F, -0.0947F, 0.0099F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.7683F, 3.4716F, -0.5912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -0.6387F, -0.0899F, 0.0048F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.4876F, -0.5732F, -0.4381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 52).mirror().addBox(-0.4876F, -0.6232F, -0.9381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0659F, 6.8622F, 2.7435F, 1.4653F, -0.0299F, 0.0046F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.5558F, -1.4082F, -0.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, 6.4249F, 3.3662F, 0.7421F, -0.1671F, -0.1795F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(41, 45).mirror().addBox(-0.5793F, -1.2554F, -0.2542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, 6.4249F, 3.3662F, 1.7136F, -0.1172F, -0.1263F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-0.4876F, -0.8716F, -0.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0659F, 6.8622F, 2.7435F, 1.8318F, -0.0299F, 0.0046F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-0.4876F, -0.2397F, -0.441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.0659F, 6.8622F, 2.7435F, 0.5926F, -0.0299F, 0.0046F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7811F, 3.0109F, 1.3593F, 1.1653F, -0.029F, -0.3031F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 36).mirror().addBox(-0.6657F, -0.7488F, -1.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.2316F, 4.4056F, 2.2783F, 2.2067F, -0.1518F, -0.2141F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-0.6657F, -0.1488F, -0.1072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1942F, 6.0378F, 1.8259F, 1.718F, -0.1518F, -0.2141F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-0.5558F, -0.334F, -0.3711F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, 6.4249F, 3.3662F, 1.0388F, -0.1671F, -0.1795F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.5F, -1.625F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.761F, 3.7325F, -0.3232F, -0.6936F, -0.0898F, -0.2007F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-0.4857F, -1.7947F, 0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 63).mirror().addBox(-0.4857F, -1.7447F, -0.3946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5709F, 4.5287F, -0.7891F, 0.0482F, -0.0898F, -0.2007F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 63).mirror().addBox(-0.4486F, -0.4572F, -0.093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(41, 63).mirror().addBox(-0.4486F, -0.2572F, -0.393F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5709F, 4.5287F, -0.7891F, -0.2489F, -0.1546F, -0.1058F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.7627F, -0.3161F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 45).mirror().addBox(-0.7627F, 0.2839F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -0.4819F, -0.0947F, 0.0099F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.7627F, 0.8681F, -0.586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -0.639F, -0.0947F, 0.0099F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.375F, -0.5092F, -1.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(48, 28).mirror().addBox(-0.375F, 0.4908F, -2.1217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.9F, -0.8F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-0.5F, -0.5092F, -1.6217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.475F, -0.9F, -0.8F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-0.5F, 0.0318F, -0.9816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -2.4752F, -2.5486F, 0.0698F, 0.2094F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 43).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 52).addBox(2.3F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 43).addBox(2.3F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.7469F, 2.0312F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-3.0F, -0.0083F, -0.0022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 82).addBox(-0.2F, -0.0083F, -0.0022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -2.0597F, 1.9522F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 80).addBox(2.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.0474F, 4.7135F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.5F, 0.0318F, -1.0816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6388F, -2.4578F, -1.5706F, -0.0175F, 0.2094F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, 0.0318F, 0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7219F, -2.4787F, -1.9613F, -0.0519F, 0.1572F, 0.0028F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(61, 63).mirror().addBox(-0.5F, 0.1384F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2005F, -0.0826F, -4.3251F, 2.1118F, 0.2094F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-0.5F, 0.0F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2338F, -1.1532F, -4.4818F, 1.2392F, 0.2094F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, 0.0052F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1932F, -1.7512F, -4.2907F, 0.672F, 0.2094F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(13, 25).mirror().addBox(-0.5F, -1.5F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(13, 25).addBox(2.3F, -1.5F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, -0.616F, -0.0836F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(-3.0F, -0.0083F, -0.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(21, 53).addBox(-0.2F, -0.0083F, -0.1022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -2.3241F, 0.0707F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, 0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 73).addBox(2.3F, 0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.7657F, 1.1082F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-0.5F, 0.05F, -3.975F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(30, 14).addBox(2.3F, 0.05F, -3.975F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, -0.4592F, 5.4731F, -0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 73).addBox(2.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.5092F, 3.8265F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(82, 46).addBox(2.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, -1.2768F, 3.0809F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.5F, -0.8226F, -1.1577F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.8924F, -0.4602F, 0.1302F, 0.0028F, -0.1935F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, -1.2693F, -1.1331F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.8924F, -0.4602F, 0.6101F, 0.0028F, -0.1935F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2423F, 0.1507F, -0.4091F, -0.1396F, 0.0F, -0.2618F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-0.5558F, -1.3071F, -0.6978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, 6.4249F, 3.3662F, 1.1784F, -0.1671F, -0.1795F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-1.2763F, -0.4811F, -0.7016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, 2.6942F, 1.5718F, 0.3818F, -0.0419F, -0.3017F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(46, 22).mirror().addBox(-0.7627F, -0.1341F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 6.0794F, -0.4746F, -0.5299F, -0.0947F, 0.0099F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(30, 20).mirror().addBox(-1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 20).addBox(1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 10).addBox(-0.5F, 0.0318F, -0.9816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8467F, -2.4752F, -2.5486F, 0.0698F, -0.2094F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 77).addBox(-0.5F, 0.0318F, -1.0816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6388F, -2.4578F, -1.5706F, -0.0175F, -0.2094F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 0.0318F, 0.1184F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7219F, -2.4787F, -1.9613F, -0.0519F, -0.1572F, -0.0028F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(61, 63).addBox(-0.5F, 0.1384F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2005F, -0.0826F, -4.3251F, 2.1118F, -0.2094F, 0.0F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, 0.0F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2338F, -1.1532F, -4.4818F, 1.2392F, -0.2094F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, 0.0052F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1932F, -1.7512F, -4.2907F, 0.672F, -0.2094F, 0.0F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 73).addBox(-0.625F, -0.5092F, -1.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(48, 28).addBox(-0.625F, 0.4908F, -2.1217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, -0.9F, -0.8F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 56).addBox(-0.5F, -0.5092F, -1.6217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.475F, -0.9F, -0.8F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.8226F, -1.1577F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 0.8924F, -0.4602F, 0.1302F, -0.0028F, 0.1935F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -1.2693F, -1.1331F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.08F, 0.8924F, -0.4602F, 0.6101F, -0.0028F, 0.1935F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2423F, 0.1507F, -0.4091F, -0.1396F, 0.0F, 0.2618F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 70).addBox(-0.4443F, -1.4082F, -0.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0522F, 6.4249F, 3.3662F, 0.7421F, 0.1671F, 0.1795F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 55).addBox(-0.4442F, -0.334F, -0.3711F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0522F, 6.4249F, 3.3662F, 1.0388F, 0.1671F, 0.1795F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 44).addBox(-0.4442F, -1.3071F, -0.6978F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.0522F, 6.4249F, 3.3662F, 1.1784F, 0.1671F, 0.1795F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 40).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7811F, 3.0109F, 1.3593F, 1.1653F, 0.029F, 0.3031F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 12).addBox(0.2763F, -0.4811F, -0.7016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0752F, 2.6942F, 1.5718F, 0.3818F, 0.0419F, 0.3017F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5124F, -0.5732F, -0.4381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 52).addBox(-0.5124F, -0.6232F, -0.9381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0659F, 6.8622F, 2.7435F, 1.4653F, 0.0299F, -0.0046F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 36).addBox(-0.3343F, -0.7488F, -1.7072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.2316F, 4.4056F, 2.2783F, 2.2067F, 0.1518F, 0.2141F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 45).addBox(-0.4207F, -1.2554F, -0.2542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0522F, 6.4249F, 3.3662F, 1.7136F, 0.1172F, 0.1263F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(14, 47).addBox(-0.3343F, -0.1488F, -0.1072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1942F, 6.0378F, 1.8259F, 1.718F, 0.1518F, 0.2141F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(46, 32).addBox(-0.5124F, -0.8716F, -0.7162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0659F, 6.8622F, 2.7435F, 1.8318F, 0.0299F, -0.0046F));

		PartDefinition cube_r68 = hips.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 69).addBox(-0.5124F, -0.2397F, -0.441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0659F, 6.8622F, 2.7435F, 0.5926F, 0.0299F, -0.0046F));

		PartDefinition cube_r69 = hips.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -1.625F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.761F, 3.7325F, -0.3232F, -0.6936F, 0.0898F, 0.2007F));

		PartDefinition cube_r70 = hips.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(63, 20).addBox(-0.5143F, -1.7947F, 0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 63).addBox(-0.5143F, -1.7447F, -0.3946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5709F, 4.5287F, -0.7891F, 0.0482F, 0.0898F, 0.2007F));

		PartDefinition cube_r71 = hips.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 63).addBox(-0.5514F, -0.4572F, -0.093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(41, 63).addBox(-0.5514F, -0.2572F, -0.393F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5709F, 4.5287F, -0.7891F, -0.2489F, 0.1546F, 0.1058F));

		PartDefinition cube_r72 = hips.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 11).addBox(-0.2317F, 3.4716F, -0.5912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -0.6387F, 0.0899F, -0.0048F));

		PartDefinition cube_r73 = hips.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(36, 62).addBox(-0.2373F, 3.4224F, -0.1281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -0.7655F, 0.0947F, -0.0099F));

		PartDefinition cube_r74 = hips.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 48).addBox(-0.2373F, -0.3161F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 45).addBox(-0.2373F, 0.2839F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -0.4819F, 0.0947F, -0.0099F));

		PartDefinition cube_r75 = hips.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 56).addBox(-0.2373F, 0.8681F, -0.586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -0.639F, 0.0947F, -0.0099F));

		PartDefinition cube_r76 = hips.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 22).addBox(-0.2373F, -0.1341F, -0.9979F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -0.5299F, 0.0947F, -0.0099F));

		PartDefinition cube_r77 = hips.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(11, 84).addBox(0.0F, -2.7F, -4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7776F, 8.1735F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r78 = hips.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 66).addBox(-0.5743F, -3.6384F, 4.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(65, 82).addBox(-0.5743F, -3.6384F, 4.651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, -2.7856F, 0.0904F, -0.0921F));

		PartDefinition cube_r79 = hips.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(53, 32).addBox(-0.5743F, -6.1401F, 2.2775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, 2.8867F, 0.0904F, -0.0921F));

		PartDefinition cube_r80 = hips.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(48, 51).addBox(-0.5743F, -0.1003F, -6.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, 0.8272F, 0.0904F, -0.0921F));

		PartDefinition cube_r81 = hips.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 55).addBox(-0.5743F, 1.498F, -6.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1231F, 6.0794F, -0.4746F, 0.4607F, 0.0904F, -0.0921F));

		PartDefinition cube_r82 = hips.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.9791F, 0.1549F, -1.7931F, -0.2148F, 0.0385F));

		PartDefinition cube_r83 = leftLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(33, 56).addBox(-0.5F, -2.375F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(26, 61).addBox(-0.5F, -2.975F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 2.4728F, 0.6491F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(5, 61).addBox(-0.5F, -2.825F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.4728F, 0.6491F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 8.6145F, 1.2471F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 49).addBox(-0.5F, -0.925F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 9.0609F, 1.941F, 0.9992F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(82, 30).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 8.5061F, 2.1598F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(17, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 7.7371F, 2.3803F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(67, 32).addBox(-0.5F, -1.875F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 5.8014F, 1.2791F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 50).addBox(-0.5F, -1.05F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.9489F, 0.9144F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(68, 19).addBox(-0.5F, 0.2F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, -0.125F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.3463F, 0.6229F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 67).addBox(-0.5F, -1.9F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 4.2794F, -0.2353F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1886F, 2.0973F, 2.9672F, 0.0076F, 0.043F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(31, 36).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 5.0516F, -0.6777F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 3.0844F, -0.1391F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(31, 61).addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.6F, 3.0844F, -0.1391F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(30, 45).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6F, 0.6972F, 0.128F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 58).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4F, 2.6347F, -1.0152F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 15).addBox(-1.0F, 5.9F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(36, 41).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4F, 4.6455F, -1.1733F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(18, 38).addBox(-0.5F, -2.675F, -1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.4F, 6.8822F, 0.1572F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 50).addBox(-0.5F, -2.0F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.4F, 2.9095F, -0.7497F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 3.085F, -0.176F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(63, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(-0.4F, 0.9345F, -1.6936F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, 0.3467F, -0.8846F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.4F, 0.5161F, -0.2671F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.4F, 0.746F, 0.7874F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(40, 82).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.4F, 1.157F, 0.0317F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(24, 36).addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 12.3951F, -1.4688F, -2.0926F, -0.05F, -0.0715F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(35, 32).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2239F, 0.1423F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(11, 32).addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, -0.0142F, -1.2223F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.9791F, 0.1549F, -1.7922F, 0.1704F, -0.0381F));

		PartDefinition cube_r109 = rightLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(-0.5F, -2.375F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1052F, -0.5638F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(26, 61).mirror().addBox(-0.5F, -2.975F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4728F, 0.6491F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.5F, -2.825F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4728F, 0.6491F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.5F, -2.9F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.6145F, 1.2471F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-0.5F, -0.925F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0609F, 1.941F, 0.9992F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5061F, 2.1598F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(17, 62).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.7371F, 2.3803F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-0.5F, -1.875F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8014F, 1.2791F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-0.5F, -1.05F, -0.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9489F, 0.9144F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-0.5F, 0.2F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(28, 56).mirror().addBox(-0.5F, -0.125F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3463F, 0.6229F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(62, 67).mirror().addBox(-0.5F, -1.9F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2794F, -0.2353F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1886F, 2.0973F, 2.9685F, -0.0227F, -0.1289F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 36).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 5.0516F, -0.6777F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.0844F, -0.1391F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-0.5F, -2.7F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.0844F, -0.1391F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 45).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.6972F, 0.128F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.6347F, -1.0152F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-1.0F, 5.9F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(36, 41).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.4F, 4.6455F, -1.1733F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(18, 38).mirror().addBox(-0.5F, -2.675F, -1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.4F, 6.8822F, 0.1572F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-0.5F, -2.0F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.9095F, -0.7497F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4F, 3.085F, -0.176F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.03F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.9345F, -1.6936F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.3467F, -0.8846F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5161F, -0.2671F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.746F, 0.7874F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.157F, 0.0317F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(24, 36).mirror().addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.3951F, -1.4688F, -2.0944F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(35, 32).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2239F, 0.1423F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(-0.5F, -0.0142F, -1.2223F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(22, 62).addBox(-0.5F, -1.7952F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5476F, -0.9007F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5F, -1.8702F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -1.8499F, -0.0113F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -4.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.4269F, -0.2803F, -0.1342F, -0.6171F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 9).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.4269F, -0.1952F, -0.2227F, -1.0877F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 34).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -0.4269F, -0.0505F, -0.2908F, -1.6433F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4268F, -0.1462F, -0.1297F, -1.0963F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4268F, -0.0582F, -0.1864F, -1.6415F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.4268F, -0.1947F, -0.0731F, -0.626F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 20).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, -0.089F, -0.0915F, -1.5727F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, -0.1233F, -0.0327F, -1.0337F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.4268F, -0.1304F, 0.003F, -0.5638F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 34).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.4269F, -0.0505F, 0.2908F, 1.6433F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(62, 9).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.4269F, -0.1952F, 0.2227F, 1.0877F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -0.4269F, -0.2803F, 0.1342F, 0.6171F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(10, 62).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4268F, -0.1462F, 0.1297F, 1.0963F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(21, 8).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4268F, -0.0582F, 0.1864F, 1.6415F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(82, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.4268F, -0.1947F, 0.0731F, 0.626F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 20).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, -0.089F, 0.0915F, 1.5727F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(62, 15).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, -0.1233F, 0.0327F, 1.0337F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.4268F, -0.1304F, -0.003F, 0.5638F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(24, 25).addBox(-2.5F, -1.9047F, 0.2457F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.2857F, -5.0339F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(17, 11).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2433F, -4.8202F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5F, -1.6214F, -1.244F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-1.0F, 0.0036F, -4.244F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 33).addBox(-0.5F, -1.5235F, -1.0855F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -4.9F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(13, 19).addBox(-0.5F, -1.7503F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -2.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-1.59F, -0.0255F, -0.5607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8768F, 5.5879F, -5.5104F, 0.2767F, 0.0216F, 1.0043F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-1.89F, -0.0255F, -0.3607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.055F, 5.9526F, -5.0043F, 0.4702F, 0.8935F, 0.8121F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(-0.1856F, -0.1815F, -0.6126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8631F, 6.1286F, -4.2778F, 1.4445F, 0.9602F, 0.5486F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.4F, -0.65F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8702F, 6.3711F, -4.5005F, 1.4916F, 0.4218F, 0.6198F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9906F, 6.1912F, -5.1558F, 1.4257F, 0.1454F, 0.6521F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-0.775F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2655F, 5.955F, -5.9769F, 0.8912F, -0.2405F, 0.6003F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-0.3F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5063F, 6.5089F, -4.6058F, 1.38F, 0.3863F, 0.3375F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.7729F, -0.5055F, -0.2092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3021F, 6.7863F, -5.2913F, 1.3932F, 0.1031F, 0.3917F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-0.7979F, -2.0173F, -0.3031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.3021F, 6.7863F, -5.2913F, 0.9142F, 0.0F, 0.4102F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.5F, -1.025F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 73).mirror().addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 79).addBox(3.3F, -1.025F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 73).addBox(3.3F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 3.4892F, -6.4087F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.5F, -0.2151F, -0.2024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(35, 79).addBox(3.3F, -0.2151F, -0.2024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9F, 4.0126F, -6.3285F, 2.4391F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.1859F, -0.2207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(30, 79).addBox(3.3F, -0.1859F, -0.2207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9F, 4.0876F, -6.9535F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(72, 3).mirror().addBox(-0.5F, -0.45F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(60, 71).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(10, 72).addBox(3.3F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(72, 3).addBox(3.3F, -0.45F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(60, 71).addBox(3.3F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.9F, 0.6723F, -1.9303F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5F, -0.8128F, -1.3678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(71, 62).mirror().addBox(-0.5F, -0.8128F, -0.7928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(72, 0).addBox(3.3F, -0.8128F, -1.3678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(71, 62).addBox(3.3F, -0.8128F, -0.7928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9F, 1.0973F, -2.1053F, 0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.161F, 0.1654F, -0.5527F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.0627F, 0.244F, -1.0276F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, -0.0745F, 0.2407F, -1.5853F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3268F, 0.2753F, 0.2171F, -0.6163F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3268F, 0.1423F, 0.3412F, -1.0899F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, -5.3268F, -0.0619F, 0.3636F, -1.6669F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(11, 36).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, -0.0082F, 0.1886F, -1.4955F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(67, 67).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, 0.091F, 0.1656F, -0.9461F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0255F, -1.5268F, 0.1501F, 0.083F, -0.4783F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-0.5374F, 0.2175F, -1.6365F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3985F, 3.0565F, -6.0248F, 0.3096F, 0.6213F, 0.0836F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(50, 74).addBox(3.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9F, 3.6126F, -6.9535F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-0.5F, -2.2472F, -2.8986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(45, 74).addBox(3.3F, -2.2472F, -2.8986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.5F, -1.1372F, -2.9801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(5, 74).addBox(3.3F, -1.1372F, -2.9801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -0.69F, -2.5207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 74).addBox(3.3F, -0.69F, -2.5207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.5F, -1.0931F, -2.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(40, 73).addBox(3.3F, -1.0931F, -2.3009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.5F, -0.6687F, -1.8222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(73, 38).addBox(3.3F, -0.6687F, -1.8222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-0.5F, -0.2437F, -0.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 35).addBox(3.3F, -0.2437F, -0.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 2.0681F, -5.7444F, 0.528F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.5F, -0.6187F, -1.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(35, 73).addBox(3.3F, -0.6187F, -1.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.6944F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.5F, -0.1875F, -0.2371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(21, 49).addBox(3.3F, -0.1875F, -0.2371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.9F, 2.0931F, -5.8694F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-0.5F, -0.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(45, 71).addBox(3.3F, -0.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-1.9F, 0.3712F, -1.8079F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(41, 10).mirror().addBox(-0.5F, -0.7704F, -0.2934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 10).addBox(3.3F, -0.7704F, -0.2934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 1.8681F, -4.1944F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(35, 30).mirror().addBox(-4.8034F, -0.0035F, -0.1203F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9636F, 6.1006F, -4.3735F, -0.1573F, 1.1498F, -0.3437F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-2.69F, -0.0255F, 0.0393F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2918F, 6.0541F, -4.8485F, 0.4227F, 1.0928F, 0.2172F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(83, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.161F, -0.1654F, 0.5527F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(65, 49).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.0627F, -0.244F, 1.0276F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 0).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, -0.0745F, -0.2407F, 1.5853F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(83, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3268F, 0.2753F, -0.2171F, 0.6163F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 47).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3268F, 0.1423F, -0.3412F, 1.0899F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(66, 36).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0255F, -5.3268F, -0.0619F, -0.3636F, 1.6669F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(11, 36).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, -0.0082F, -0.1886F, 1.4955F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 67).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, 0.091F, -0.1656F, 0.9461F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(84, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0255F, -1.5268F, 0.1501F, -0.083F, 0.4783F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(7, 48).addBox(-1.4626F, 0.2175F, -1.6365F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3985F, 3.0565F, -6.0248F, 0.3096F, -0.6213F, -0.0836F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(57, 67).addBox(-0.225F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2655F, 5.955F, -5.9769F, 0.8912F, 0.2405F, -0.6003F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(52, 67).addBox(-0.2021F, -2.0173F, -0.3031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.3021F, 6.7863F, -5.2913F, 0.9142F, 0.0F, -0.4102F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 80).addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9906F, 6.1912F, -5.1558F, 1.4257F, -0.1454F, -0.6521F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 80).addBox(-0.2271F, -0.5055F, -0.2092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3021F, 6.7863F, -5.2913F, 1.3932F, -0.1031F, -0.3917F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(55, 80).addBox(-0.8144F, -0.1815F, -0.6126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8631F, 6.1286F, -4.2778F, 1.4445F, -0.9602F, -0.5486F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(50, 80).addBox(-0.6F, -0.65F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8702F, 6.3711F, -4.5005F, 1.4916F, -0.4218F, -0.6198F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(80, 74).addBox(-0.7F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5063F, 6.5089F, -4.6058F, 1.38F, -0.3863F, -0.3375F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(65, 79).addBox(-0.7271F, 0.228F, -0.6768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 63).addBox(-0.7271F, -0.372F, -0.6768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2271F, 6.3113F, -5.2913F, 1.3942F, 0.0F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(10, 64).addBox(-0.7271F, -1.7274F, -0.6793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2271F, 6.3113F, -5.2913F, 0.9142F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(35, 30).addBox(-0.1966F, -0.0035F, -0.1203F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9636F, 6.1006F, -4.3735F, -0.1573F, -1.1498F, 0.3437F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(40, 67).addBox(-0.41F, -0.0255F, -0.5607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8768F, 5.5879F, -5.5104F, 0.2767F, -0.0216F, -1.0043F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(66, 17).addBox(-0.11F, -0.0255F, -0.3607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.055F, 5.9526F, -5.0043F, 0.4702F, -0.8935F, -0.8121F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(50, 18).addBox(-0.31F, -0.0255F, 0.0393F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2918F, 6.0541F, -4.8485F, 0.4227F, -1.0928F, -0.2172F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -1.9832F, -0.0316F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.9289F, -2.5137F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(41, 41).addBox(-1.5F, -1.0505F, -0.059F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.9289F, -4.2137F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(41, 5).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(48, 45).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.368F, 4.7481F, -6.2481F, 1.1112F, 0.6705F, -0.3457F));

		PartDefinition cube_r224 = leftArm1.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(20, 73).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0059F, 1.6535F, -1.1395F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm1.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(73, 19).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0059F, 0.7822F, -0.9141F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftArm1.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0059F, 0.6738F, -0.4661F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftArm1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(46, 63).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftArm1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(70, 59).addBox(0.0F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(41, 22).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5059F, 3.2353F, 0.3525F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0913F, 4.7205F, -0.7657F, -1.7457F, 0.0387F, -0.0202F));

		PartDefinition cube_r229 = leftArm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(57, 2).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.75F, 0.3F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftArm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(50, 55).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftArm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftArm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.5991F, -0.613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(65, 43).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(47, 67).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1957F, 4.3488F, -0.2219F, 1.3595F, -0.0692F, 0.0532F));

		PartDefinition cube_r233 = leftHand.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(68, 38).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.6971F, 0.6342F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(57, 7).addBox(-1.0F, -0.375F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(48, 45).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.368F, 4.7481F, -6.2481F, 1.0949F, -0.7094F, 0.3712F));

		PartDefinition cube_r234 = rightArm1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 1.6535F, -1.1395F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightArm1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.7822F, -0.9141F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightArm1.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.6738F, -0.4661F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-1.0F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(41, 22).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 3.2353F, 0.3525F, -0.384F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0913F, 4.7205F, -0.7657F, -1.9203F, -0.0387F, 0.0202F));

		PartDefinition cube_r239 = rightArm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 2).mirror().addBox(0.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.3F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -2.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightArm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -0.5991F, -0.613F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(47, 67).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1957F, 4.3488F, -0.2219F, 1.0599F, 0.3776F, -0.2217F));

		PartDefinition cube_r243 = rightHand.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6971F, 0.6342F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(0.0F, -0.375F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6473F, -6.6262F, 0.1174F, 0.2601F, 0.0303F));

		PartDefinition cube_r244 = neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(48, 83).addBox(-0.5F, -1.6F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3953F, 0.232F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(32, 85).addBox(-0.5F, -1.3F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 36).addBox(-1.0F, -1.0F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -2.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2219F, -2.5006F, 0.131F, 0.6234F, -1.3484F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4219F, -0.4006F, 0.2055F, 0.1488F, -0.6798F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(83, 19).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4219F, -0.4006F, -0.0366F, 0.2698F, -1.7098F));

		PartDefinition cube_r249 = neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4219F, -0.4006F, 0.1107F, 0.2492F, -1.1499F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(69, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2219F, -2.5006F, 0.131F, -0.6234F, 1.3484F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(83, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4219F, -0.4006F, 0.2055F, -0.1488F, 0.6798F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(83, 19).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4219F, -0.4006F, -0.0366F, -0.2698F, 1.7098F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(65, 51).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4219F, -0.4006F, 0.1107F, -0.2492F, 1.1499F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.285F, -2.6097F, -0.7617F, 0.3073F, 0.2862F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, -0.3262F, 1.9312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 56).addBox(-0.5F, -0.2262F, -0.0688F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1F, -2.3F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6369F, -2.6909F, 0.0656F, 0.3712F, -1.4763F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1369F, -1.3909F, 0.1237F, 0.5368F, -1.3617F));

		PartDefinition cube_r257 = neck2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(65, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6369F, -2.6909F, 0.0656F, -0.3712F, 1.4763F));

		PartDefinition cube_r258 = neck2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1369F, -1.3909F, 0.1237F, -0.5368F, 1.3617F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -2.6F, 0.0144F, 0.141F, 0.1349F));

		PartDefinition cube_r259 = neck.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(17, 59).addBox(0.0F, -0.2676F, 0.0085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 25).addBox(-0.5F, -0.0676F, -0.9915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5369F, -1.6909F, 0.3593F, 0.9222F, -1.1295F));

		PartDefinition cube_r261 = neck.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5369F, -1.6909F, 0.3593F, -0.9222F, 1.1295F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.4F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(76, 84).addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 85).addBox(0.0F, -0.6F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1607F, -2.4197F, 0.5712F, 0.05F, 0.0838F));

		PartDefinition cube_r262 = neck4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2631F, -0.8909F, 0.3637F, 1.0822F, -1.1809F));

		PartDefinition cube_r263 = neck4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 83).mirror().addBox(-1.0157F, -0.0171F, -0.4209F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3881F, -2.7159F, 0.5089F, 1.221F, -1.0223F));

		PartDefinition cube_r264 = neck4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2631F, -0.8909F, 0.3637F, -1.0822F, 1.1809F));

		PartDefinition cube_r265 = neck4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(51, 83).addBox(0.0157F, -0.0171F, -0.4209F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3881F, -2.7159F, 0.5089F, -1.221F, 1.0223F));

		PartDefinition cube_r266 = neck4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2173F, -3.788F, 0.1565F, 0.2771F, 0.2535F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(60, 25).addBox(-0.5F, -0.9421F, -0.7505F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.9018F, -1.2528F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(38, 59).addBox(-0.5F, -1.0025F, -0.906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 1.8018F, -0.3529F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(59, 36).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.0725F, -0.2629F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(50, 6).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4725F, -2.0977F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, 0.0F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 2.3903F, -2.7639F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(59, 17).addBox(-1.0F, -0.675F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.4466F, -3.0873F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(52, 60).addBox(-0.5F, 0.0F, -1.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(10, 59).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4184F, -3.0344F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(45, 60).addBox(-1.0F, -0.575F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4048F, -0.5311F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(60, 31).addBox(-0.5F, 0.0338F, 0.0107F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.2302F, -1.2652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(60, 28).addBox(-0.5F, 1.3F, 0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(50, 2).addBox(-0.5F, 0.3F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4552F, -2.2152F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(58, 45).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1552F, -2.2152F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 0).addBox(0.0F, -0.028F, 0.0198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8255F, -1.8099F, -0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(66, 63).addBox(0.0F, 0.0096F, -0.7997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.0951F, -0.1606F, -0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(77, 68).addBox(-0.5F, -0.2197F, -0.763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 4.0635F, -4.3459F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 57).addBox(-0.5F, -0.5118F, -1.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 4.5385F, -4.6459F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5F, 0.1882F, -1.1599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, 4.5385F, -4.6459F, 2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(58, 40).addBox(-0.5F, -0.1692F, -1.352F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 2.2239F, -5.3676F, 1.994F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(62, 5).addBox(-0.5F, -0.2102F, -0.7862F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2739F, -4.8426F, 2.0988F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(45, 55).addBox(-0.5F, -0.1832F, -0.7598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.2239F, -5.3676F, 2.0115F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(55, 26).addBox(-0.5F, -0.2021F, -0.2066F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.2041F, -5.3551F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(67, 69).addBox(-0.5F, -0.2098F, -0.2027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.631F, -5.461F, 1.6013F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(58, 20).addBox(-0.5F, -0.1926F, -0.213F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 1.0172F, -5.4768F, 1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(21, 57).addBox(-0.5F, -0.1872F, -0.2206F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4316F, -5.3044F, 1.1257F, 0.0038F, 0.0069F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(60, 48).addBox(-0.5F, -0.1947F, -0.2056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -4.5816F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(30, 66).addBox(-0.5F, -0.1958F, -0.1846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.0811F, -5.0566F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(25, 66).addBox(-0.5F, -0.1002F, -0.1078F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0954F, -2.5168F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 4).addBox(-0.5F, -0.0993F, -0.0845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -1.0454F, -3.3418F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(20, 66).addBox(-0.5F, -0.1093F, -0.0999F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7454F, -4.0668F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(9, 38).addBox(-0.5291F, -0.1988F, -0.2308F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.6442F, -2.1665F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(70, 42).addBox(-0.4989F, -0.5586F, -0.5467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.01F, 3.6387F, -2.6922F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(72, 29).addBox(-0.5291F, -0.2239F, -0.1674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 3.0706F, -2.6671F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(72, 26).addBox(-0.5291F, -0.7718F, -0.1991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.8456F, -2.5171F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(55, 74).addBox(-0.7F, -0.225F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 3.4891F, -3.8634F, 2.138F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.33F, 2.5023F, -6.8842F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(72, 69).addBox(-0.4971F, -0.5374F, 0.139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.29F, -1.4094F, 5.9982F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(55, 71).addBox(-0.4971F, -0.0918F, -0.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.29F, -2.5094F, 6.0232F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(72, 72).addBox(-0.4971F, -0.8631F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.29F, -1.9094F, 6.5482F, 2.186F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(72, 54).addBox(-0.4971F, -0.2745F, -0.6538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.29F, -1.4094F, 5.9982F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(50, 71).addBox(-0.4971F, -0.0794F, -0.9015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.29F, -1.5094F, 5.4982F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(35, 70).addBox(-0.5F, -0.2308F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 70).addBox(-0.5F, -0.4558F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(25, 70).addBox(-0.5F, -0.2808F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.19F, 0.1819F, 3.3793F, 0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.19F, 0.0319F, 3.5043F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(82, 27).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.27F, -2.4749F, 2.6242F, 0.2313F, -0.0066F, -0.004F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(82, 12).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.27F, -0.8794F, 2.1687F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(82, 24).addBox(-0.5013F, -0.2621F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.27F, -0.5895F, 1.7546F, 1.2436F, -0.0073F, -0.0042F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(82, 21).addBox(-0.5F, -0.2715F, -0.2506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.27F, -0.0895F, 1.8546F, 1.7498F, -0.0073F, -0.0042F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(82, 9).addBox(-0.5F, -0.375F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.27F, -0.2145F, 1.8796F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(82, 3).addBox(-0.387F, 0.1F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.11F, 0.2787F, 3.1214F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 70).addBox(-0.4999F, -0.3388F, -0.8716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.1899F, -0.1267F, 3.6724F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5691F, -0.4772F, -1.0366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3791F, -0.9874F, 4.3354F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(75, 81).addBox(-0.5691F, -0.9658F, -0.5452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.3791F, -0.9874F, 4.3354F, 1.6973F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(72, 23).addBox(-0.5691F, -0.4532F, -0.913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3791F, -0.9874F, 4.3354F, -0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(75, 41).addBox(-0.4091F, -0.5791F, -0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 74).addBox(-0.5891F, -0.5791F, -0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.3791F, -0.9874F, 4.3354F, 0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(28, 52).addBox(-0.4881F, -0.9234F, 0.2261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.17F, 0.3205F, 5.5482F, 0.5741F, 0.084F, -0.0121F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(41, 49).addBox(-0.4916F, -0.7546F, -1.7889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1236F, 0.6408F, 5.1439F, -0.2806F, 0.1262F, 0.0415F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 66).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.13F, 0.9712F, 3.6037F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(25, 82).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(70, 81).addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.13F, -0.5915F, 2.9261F, 3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(81, 59).addBox(-0.5F, -0.2832F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1236F, 0.3908F, 4.7439F, 0.8033F, 0.0591F, 0.0609F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(10, 75).addBox(-0.4881F, -0.8045F, -0.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.17F, 0.3205F, 5.5482F, 0.801F, 0.084F, -0.0121F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(72, 13).addBox(-0.0004F, -0.484F, 0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, -2.5973F, 6.4736F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(74, 65).addBox(-0.0004F, 0.0068F, -0.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.03F, -2.3842F, 7.4809F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(52, 36).addBox(-0.5004F, -0.8221F, -1.6473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2957F, -0.5522F, 7.4211F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(7, 52).addBox(-0.5004F, -0.4872F, -1.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2957F, -0.9272F, 7.4211F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(7, 43).addBox(-0.4987F, -1.143F, -0.0563F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2313F, -0.7524F, 2.853F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(5, 66).addBox(-0.4987F, -0.2198F, -0.7694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.2313F, -1.5274F, 2.328F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 66).addBox(-0.4987F, -0.3854F, -1.3387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2313F, -1.5274F, 2.328F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(65, 59).addBox(-0.4987F, -0.5803F, -1.8892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.2313F, -1.5274F, 2.328F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(40, 69).addBox(-0.4987F, -0.8399F, -2.4089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2313F, -1.5274F, 2.328F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5691F, -0.1026F, -0.0972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3791F, -1.9124F, 4.8354F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5691F, -0.0802F, -0.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3791F, -1.8124F, 4.0604F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(81, 6).addBox(-0.5691F, -0.0896F, -0.7238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3791F, -0.9874F, 4.3354F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5671F, -0.8831F, -0.1109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3791F, -0.8874F, 5.5104F, 1.7628F, 0.0016F, 0.0019F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(80, 80).addBox(-0.5691F, -0.8819F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.3791F, -0.3874F, 4.8854F, 0.6763F, 0.0016F, 0.0019F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.33F, 2.5023F, -6.8842F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-0.5028F, -0.5374F, 0.139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.4094F, 5.9982F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-0.5028F, -0.0918F, -0.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -2.5094F, 6.0232F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.5028F, -0.8631F, -0.7841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.9094F, 6.5482F, 2.186F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.5028F, -0.2745F, -0.6538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.4094F, 5.9982F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(50, 71).mirror().addBox(-0.5028F, -0.0794F, -0.9015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.29F, -1.5094F, 5.4982F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.5F, -0.2308F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 70).mirror().addBox(-0.5F, -0.4558F, -0.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(25, 70).mirror().addBox(-0.5F, -0.2808F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.1819F, 3.3793F, 0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.0319F, 3.5043F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.27F, -2.4749F, 2.6242F, 0.2313F, 0.0066F, 0.004F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.27F, -0.8794F, 2.1687F, 0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.4986F, -0.2621F, -0.2604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.27F, -0.5895F, 1.7546F, 1.2436F, 0.0073F, 0.0042F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-0.5F, -0.2715F, -0.2506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.27F, -0.0895F, 1.8546F, 1.7498F, 0.0073F, 0.0042F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(82, 9).mirror().addBox(-0.5F, -0.375F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.27F, -0.2145F, 1.8796F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-0.613F, 0.1F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.11F, 0.2787F, 3.1214F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.5001F, -0.3388F, -0.8716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.1899F, -0.1267F, 3.6724F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.4309F, -0.4772F, -1.0366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.9874F, 4.3354F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-0.4309F, -0.9658F, -0.5452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.9874F, 4.3354F, 1.6973F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-0.4309F, -0.4532F, -0.913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.9874F, 4.3354F, -0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-0.5909F, -0.5791F, -0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 74).mirror().addBox(-0.4109F, -0.5791F, -0.4772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.9874F, 4.3354F, 0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-0.5119F, -0.9234F, 0.2261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.17F, 0.3205F, 5.5482F, 0.5741F, -0.084F, 0.0121F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-0.5084F, -0.7546F, -1.7889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 0.6408F, 5.1439F, -0.2806F, -0.1262F, -0.0415F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.13F, 0.9712F, 3.6037F, 2.6965F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(70, 81).mirror().addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.13F, -0.5915F, 2.9261F, 3.1285F, 0.0F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-0.5F, -0.2832F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 0.3908F, 4.7439F, 0.8033F, -0.0591F, -0.0609F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5119F, -0.8045F, -0.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.17F, 0.3205F, 5.5482F, 0.801F, -0.084F, 0.0121F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-0.9996F, -0.484F, 0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.03F, -2.5973F, 6.4736F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-0.9996F, 0.0068F, -0.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.03F, -2.3842F, 7.4809F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-0.4996F, -0.8221F, -1.6473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.2957F, -0.5522F, 7.4211F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.4996F, -0.4872F, -1.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2957F, -0.9272F, 7.4211F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(7, 43).mirror().addBox(-0.5013F, -1.143F, -0.0563F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -0.7524F, 2.853F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.5013F, -0.2198F, -0.7694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -1.5274F, 2.328F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5013F, -0.3854F, -1.3387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -1.5274F, 2.328F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.5013F, -0.5803F, -1.8892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -1.5274F, 2.328F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-0.5013F, -0.8399F, -2.4089F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2313F, -1.5274F, 2.328F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.4309F, -0.1026F, -0.0972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -1.9124F, 4.8354F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.4309F, -0.0802F, -0.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -1.8124F, 4.0604F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-0.4309F, -0.0896F, -0.7238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.9874F, 4.3354F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.4329F, -0.8831F, -0.1109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.8874F, 5.5104F, 1.7628F, -0.0016F, -0.0019F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.4309F, -0.8819F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.3791F, -0.3874F, 4.8854F, 0.6763F, -0.0016F, -0.0019F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 2.7862F, -3.763F, 0.1391F, -0.0121F, 0.0864F));

		PartDefinition cube_r376 = leftBeak.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(67, 24).addBox(-0.4486F, -1.5477F, 0.1162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6315F, 1.333F, -0.3114F, 0.9441F, -0.9076F, -1.0052F));

		PartDefinition cube_r377 = leftBeak.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(23, 44).addBox(-0.9581F, -1.766F, -0.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6315F, 1.333F, -0.3114F, 0.5771F, 0.1418F, -0.1649F));

		PartDefinition cube_r378 = leftBeak.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(10, 78).addBox(-1.2581F, 0.2806F, 0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(67, 11).addBox(-0.9581F, -1.1194F, 0.3909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5447F, 0.2808F, -0.2548F, -0.7071F, 0.0F, -0.2661F));

		PartDefinition cube_r379 = leftBeak.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(77, 71).addBox(-0.2F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.3557F, 1.7656F, -0.2646F, -0.4407F, -0.5725F, -1.1206F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 2.7862F, -3.763F, 0.1391F, 0.0121F, -0.0864F));

		PartDefinition cube_r380 = rightBeak.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-0.5514F, -1.5477F, 0.1162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6315F, 1.333F, -0.3114F, 0.9441F, 0.9076F, 1.0052F));

		PartDefinition cube_r381 = rightBeak.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(23, 44).mirror().addBox(-0.0419F, -1.766F, -0.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6315F, 1.333F, -0.3114F, 0.5771F, -0.1418F, 0.1649F));

		PartDefinition cube_r382 = rightBeak.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.2581F, 0.2806F, 0.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(67, 11).mirror().addBox(-0.0419F, -1.1194F, 0.3909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5447F, 0.2808F, -0.2548F, -0.7071F, 0.0F, 0.2661F));

		PartDefinition cube_r383 = rightBeak.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-0.8F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.3557F, 1.7656F, -0.2646F, -0.4407F, 0.5725F, 1.1206F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.6106F, 0.8029F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.5F, -0.425F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 77).mirror().addBox(-0.5F, -0.825F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6866F, 1.5121F, -2.4772F, 2.8919F, -0.0379F, -0.0853F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-0.4395F, -0.6789F, -0.6977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6861F, 1.5726F, -3.2421F, -2.3561F, -0.0302F, -0.1079F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.4606F, -0.3027F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7194F, 1.4341F, -2.8215F, -1.731F, -0.0508F, -0.1361F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.3654F, -0.3093F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7194F, 1.9591F, -3.2965F, 0.1889F, -0.0508F, -0.1361F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6846F, 1.322F, -2.747F, -0.5631F, -0.0405F, -0.1027F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.3272F, -1.1016F, -0.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(45, 77).mirror().addBox(-0.3272F, -0.7016F, -0.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7194F, 2.4091F, -2.8465F, -0.326F, -0.0508F, -0.1361F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(77, 44).mirror().addBox(-0.4724F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6276F, 2.2305F, -2.5043F, 0.4167F, -0.0705F, -0.1031F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(77, 31).mirror().addBox(-0.4746F, -0.4122F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7054F, 1.716F, -2.1587F, 0.5004F, -0.0358F, -0.1029F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(77, 28).mirror().addBox(-0.4387F, -0.7138F, -0.2834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.7054F, 2.066F, -2.1587F, 0.5658F, -0.0358F, -0.1029F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-0.2994F, -0.201F, -1.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2512F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, 0.6872F, -0.0705F, -0.1031F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-0.5F, -0.5289F, -0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, -0.734F, -0.0682F, -0.1005F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-0.5F, -0.3974F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, -0.0184F, -0.0682F, -0.1005F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.4527F, -0.7762F, -0.7431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6495F, 2.0517F, -1.8214F, -0.9839F, -0.0705F, -0.1031F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.5171F, -0.2396F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5885F, 2.0415F, -1.7821F, -1.0799F, -0.0705F, -0.1031F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5363F, 2.1625F, -2.5836F, -1.0494F, -0.0705F, -0.1031F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.3251F, -0.7442F, -0.2724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3414F, -2.5956F, -2.0922F, -0.0705F, -0.1031F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.2671F, -0.7163F, -0.7457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6664F, -2.9456F, -2.45F, -0.0705F, -0.1031F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(-0.2994F, -0.0585F, -1.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.5171F, -0.0705F, -0.1031F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-0.1867F, -1.249F, -0.2421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(50, 40).mirror().addBox(-0.1867F, -0.749F, -0.2421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.1414F, -3.3956F, -0.8618F, -0.0705F, -0.1031F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.5142F, -0.2785F, -0.2671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5722F, 1.1395F, -3.3668F, -0.3295F, -0.0705F, -0.1031F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5309F, 1.708F, -3.3203F, -0.3862F, -0.0705F, -0.1031F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.4786F, 2.1937F, -3.3496F, 0.1898F, -0.0705F, -0.1031F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.2994F, 1.1528F, 0.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8664F, -2.1956F, -0.7701F, -0.0705F, -0.1031F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.5F, -0.3939F, -0.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6893F, -3.3521F, 0.1038F, -0.0682F, -0.1005F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-0.3948F, -1.8812F, -3.2262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(78, 34).mirror().addBox(-0.3448F, -1.8812F, -3.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 78).mirror().addBox(-0.3948F, -1.3812F, -3.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(40, 76).mirror().addBox(-0.3448F, -1.3812F, -3.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.6626F, -0.0175F, -0.0174F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-0.3992F, -0.7555F, -0.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7622F, 1.8005F, -1.4235F, 0.6944F, -0.0576F, -0.0516F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.507F, -0.2474F, -0.2454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.7669F, 0.2874F, -0.3686F, -0.3628F, -0.0175F, -0.0174F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7669F, 0.5374F, -0.5186F, -0.0181F, -0.0175F, -0.0174F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-0.3734F, -1.0336F, -2.9751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3664F, 0.9044F, 0.6448F, -0.0105F, -0.0436F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(75, 78).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(25, 76).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7714F, 0.6429F, -0.2148F, 0.4619F, -0.0144F, -0.0259F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7352F, 0.8171F, -2.0522F, -0.3715F, -0.0175F, -0.0174F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5026F, -0.2591F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.7386F, 0.6824F, -1.8455F, 0.0038F, -0.0175F, -0.0174F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.3507F, -0.2444F, -0.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6664F, -1.3206F, 0.2656F, -0.0155F, -0.0238F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.7661F, 0.468F, -0.6346F, 1.064F, -0.0067F, -0.0336F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(20, 79).addBox(-0.5F, -0.425F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 77).addBox(-0.5F, -0.825F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4866F, 1.5121F, -2.4772F, 2.8919F, 0.0379F, 0.0853F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(77, 53).addBox(-0.5605F, -0.6789F, -0.6977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4861F, 1.5726F, -3.2421F, -2.3561F, 0.0302F, 0.1079F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(77, 50).addBox(-0.5394F, -0.3027F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5194F, 1.4341F, -2.8215F, -1.731F, 0.0508F, 0.1361F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(50, 77).addBox(-0.6346F, -0.3093F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5194F, 1.9591F, -3.2965F, 0.1889F, 0.0508F, 0.1361F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(77, 47).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4846F, 1.322F, -2.747F, -0.5631F, 0.0405F, 0.1027F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(25, 79).addBox(-0.6728F, -1.1016F, -0.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(45, 77).addBox(-0.6728F, -0.7016F, -0.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5194F, 2.4091F, -2.8465F, -0.326F, 0.0508F, 0.1361F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(77, 44).addBox(-0.5276F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4276F, 2.2305F, -2.5043F, 0.4167F, 0.0705F, 0.1031F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(77, 31).addBox(-0.5254F, -0.4122F, -0.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5054F, 1.716F, -2.1587F, 0.5004F, 0.0358F, 0.1029F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(77, 28).addBox(-0.5613F, -0.7138F, -0.2834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5054F, 2.066F, -2.1587F, 0.5658F, 0.0358F, 0.1029F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(14, 51).addBox(-0.7006F, -0.201F, -1.8993F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2512F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, 0.6872F, 0.0705F, 0.1031F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(77, 25).addBox(-0.5F, -0.5289F, -0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, -0.734F, 0.0682F, 0.1005F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(77, 22).addBox(-0.5F, -0.3974F, -0.747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, -0.0184F, 0.0682F, 0.1005F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5473F, -0.7762F, -0.7431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4495F, 2.0517F, -1.8214F, -0.9839F, 0.0705F, 0.1031F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(77, 9).addBox(-0.4829F, -0.2396F, -0.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3884F, 2.0415F, -1.7821F, -1.0799F, 0.0705F, 0.1031F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.3363F, 2.1625F, -2.5836F, -1.0494F, 0.0705F, 0.1031F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(78, 18).addBox(-0.6749F, -0.7442F, -0.2724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)), PartPose.offsetAndRotation(0.7F, 0.3414F, -2.5956F, -2.0922F, 0.0705F, 0.1031F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(78, 15).addBox(-0.7329F, -0.7163F, -0.7457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.6664F, -2.9456F, -2.45F, 0.0705F, 0.1031F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(77, 3).addBox(-0.7006F, -0.0585F, -1.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.5171F, 0.0705F, 0.1031F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(51, 22).addBox(-0.8133F, -1.249F, -0.2421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F))
				.texOffs(50, 40).addBox(-0.8133F, -0.749F, -0.2421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 1.1414F, -3.3956F, -0.8618F, 0.0705F, 0.1031F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(50, 14).addBox(-0.4858F, -0.2785F, -0.2671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.3722F, 1.1395F, -3.3668F, -0.3295F, 0.0705F, 0.1031F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3309F, 1.708F, -3.3203F, -0.3862F, 0.0705F, 0.1031F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2786F, 2.1937F, -3.3496F, 0.1898F, 0.0705F, 0.1031F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(65, 76).addBox(-0.7006F, 1.1528F, 0.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.8664F, -2.1956F, -0.7701F, 0.0705F, 0.1031F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(76, 60).addBox(-0.5F, -0.3939F, -0.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 2.6893F, -3.3521F, 0.1038F, 0.0682F, 0.1005F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(78, 37).addBox(-0.6052F, -1.8812F, -3.2262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 34).addBox(-0.6552F, -1.8812F, -3.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 78).addBox(-0.6052F, -1.3812F, -3.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 76).addBox(-0.6552F, -1.3812F, -3.3012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.6626F, 0.0175F, 0.0174F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(50, 10).addBox(-0.6008F, -0.7555F, -0.2096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5622F, 1.8005F, -1.4235F, 0.6944F, 0.0576F, 0.0516F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(15, 79).addBox(-0.493F, -0.2474F, -0.2454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.5669F, 0.2874F, -0.3686F, -0.3628F, 0.0175F, 0.0174F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5669F, 0.5374F, -0.5186F, -0.0181F, 0.0175F, 0.0174F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(30, 76).addBox(-0.6266F, -1.0336F, -2.9751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.7F, 0.3664F, 0.9044F, 0.6448F, 0.0105F, 0.0436F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(75, 78).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(25, 76).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5714F, 0.6429F, -0.2148F, 0.4619F, 0.0144F, 0.0259F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.5353F, 0.8171F, -2.0522F, -0.3715F, 0.0175F, 0.0174F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(15, 76).addBox(-0.4974F, -0.2591F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.5386F, 0.6824F, -1.8455F, 0.0038F, 0.0175F, 0.0174F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(76, 6).addBox(-0.6493F, -0.2444F, -0.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7F, 0.6664F, -1.3206F, 0.2656F, 0.0155F, 0.0238F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(75, 75).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.5661F, 0.468F, -0.6346F, 1.064F, 0.0067F, 0.0336F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(70, 84).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0371F, 5.5323F, -0.248F, 0.1693F, -0.0426F));

		PartDefinition cube_r452 = tail.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(73, 84).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(8, 84).addBox(0.0F, -1.4F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 83).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7405F, 2.6412F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.024F, 3.8581F, -0.0403F, 0.5232F, -0.0201F));

		PartDefinition cube_r454 = tail2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(85, 39).addBox(0.0F, -0.55F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(14, 85).addBox(0.0F, 0.2786F, 0.0052F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4011F, 2.3172F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r457 = tail2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(59, 83).addBox(0.0F, -0.2826F, -0.0677F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4761F, 0.3422F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 85).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 85).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0374F, 3.8442F, 0.0788F, 0.4194F, 0.124F));

		PartDefinition cube_r458 = tail3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(38, 85).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(23, 85).addBox(0.0F, -0.8F, -0.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4851F, 3.2271F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(20, 85).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4174F, 1.0741F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0752F, 4.8356F, 0.088F, 0.9128F, 0.3541F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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