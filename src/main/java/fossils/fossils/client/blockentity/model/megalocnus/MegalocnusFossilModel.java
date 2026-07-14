package fossils.fossils.client.blockentity.model.megalocnus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalocnusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart leftArm8;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart rightArm8;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;

	public MegalocnusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body5 = this.body3.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body6 = this.body.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm7 = this.leftArm3.getChild("leftArm7");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.leftArm8 = this.leftArm3.getChild("leftArm8");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm7 = this.rightArm3.getChild("rightArm7");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.rightArm8 = this.rightArm3.getChild("rightArm8");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.4F, 16.3F, 0.0021F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 9).addBox(-0.1F, -1.0F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6642F, 3.6052F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 44).addBox(-0.1F, -2.1903F, -0.167F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8904F, -6.0965F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.1F, -0.2F, -3.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6086F, 0.9515F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 121).mirror().addBox(0.6F, -0.5F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3711F, -2.5706F, -5.9145F, -0.0841F, 0.2973F, 1.6582F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(125, 10).mirror().addBox(0.4F, -0.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3707F, -1.5031F, -4.1508F, 0.0517F, 0.5239F, 1.6703F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(125, 10).addBox(-0.4F, -0.5F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3707F, -1.5031F, -4.1508F, 0.0517F, -0.5239F, -1.6703F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 121).addBox(-0.6F, -0.5F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3711F, -2.5706F, -5.9145F, -0.0841F, -0.2973F, -1.6582F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5627F, -1.9442F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 49).addBox(-1.0F, -0.2057F, 0.0747F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.977F, 6.3211F, -1.8342F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 66).addBox(-0.501F, -3.3418F, -0.9983F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6306F, -8.4528F, -2.0866F, 0.6934F, -0.6566F, -2.8095F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 94).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4232F, -7.6575F, -1.081F, 0.172F, -1.2131F, -1.8042F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 89).addBox(-0.501F, -4.0418F, -0.7983F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6306F, -8.4528F, -2.0866F, 0.0978F, -0.9102F, -1.7202F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7403F, -8.2182F, -2.2645F, -0.6429F, -0.9009F, -1.7092F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 124).addBox(-0.5F, -1.95F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0829F, -6.6184F, -0.6414F, -1.951F, -1.1534F, -1.3043F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(103, 94).addBox(-1.1096F, -4.6363F, -1.6196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6191F, -7.7529F, -0.5226F, -2.0819F, -1.1534F, -1.3043F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 57).addBox(-0.8845F, -3.9203F, -6.4197F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.4314F, -7.3198F, -0.2859F, -1.3937F, -1.1389F, -1.9356F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 109).addBox(-1.1204F, -0.0767F, 0.3578F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 122).addBox(-1.1204F, -0.0767F, -0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6191F, -7.7529F, -0.5226F, -1.6618F, -0.9803F, -1.3216F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(71, 94).addBox(-0.8845F, -1.0537F, -4.9055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4314F, -7.3198F, -0.2859F, -0.9573F, -1.1389F, -1.9356F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(123, 127).addBox(-1.1096F, -1.0294F, -0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6191F, -7.7529F, -0.5226F, -1.5932F, -1.1534F, -1.3043F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(88, 80).addBox(-1.1096F, -4.0294F, 0.3591F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.6191F, -7.7529F, -0.5226F, -1.6456F, -1.1534F, -1.3043F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -4.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7191F, -10.9529F, -3.9226F, -1.2101F, -0.9009F, -1.7092F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(88, 6).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.7191F, -10.9529F, -3.9226F, -0.7301F, -0.9009F, -1.7092F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(107, 59).addBox(-1.1204F, 0.9697F, -0.7967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6191F, -7.7529F, -0.5226F, -1.1819F, -0.9803F, -1.3216F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 80).addBox(-0.4952F, -1.4829F, -2.9163F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6306F, -8.4528F, -2.0866F, -0.032F, -0.9009F, -1.7092F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 71).addBox(-0.55F, -0.075F, 0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4408F, -0.7457F, 3.1623F, -1.253F, -0.0768F, 0.2406F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 110).addBox(-0.55F, -0.475F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4408F, -0.7457F, 3.1623F, 0.0123F, -0.0768F, 0.2406F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 123).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9603F, -3.0201F, -1.6149F, 0.4122F, -0.1325F, 0.225F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(122, 106).addBox(-0.55F, -2.375F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 81).addBox(-0.55F, -0.375F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5474F, -3.5674F, -0.5742F, 0.7105F, -0.0768F, 0.2406F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.904F, 2.7911F, 5.8367F, -2.6022F, -0.0716F, 0.1001F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(106, 5).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1674F, 1.2341F, 6.3159F, 2.694F, -0.547F, -0.2289F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8294F, -0.3742F, 5.1761F, 2.3013F, -0.547F, -0.2289F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(93, 105).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4456F, -1.932F, 3.982F, 0.7741F, -0.547F, -0.2289F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 26).addBox(-1.0F, -7.0F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9316F, -2.3519F, 4.3829F, 0.8192F, 0.0508F, 0.1834F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 53).addBox(-1.3145F, -7.9102F, -3.7371F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6191F, -3.3049F, 5.3138F, 0.8614F, -0.547F, -0.2289F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 124).addBox(-0.5F, -1.25F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.7363F, 3.5505F, 3.6568F, -0.8279F, 0.088F, 0.2151F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(118, 12).addBox(-0.8916F, 1.1185F, -1.805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(97, 85).addBox(-0.8916F, 2.0185F, -3.205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, 0.9671F, 0.335F, 0.3141F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(17, 32).addBox(-0.8916F, -0.2645F, -6.7706F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, 1.6653F, 0.335F, 0.3141F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 57).addBox(-0.8916F, -0.004F, -5.2292F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, 1.5344F, 0.335F, 0.3141F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 124).addBox(-1.227F, 4.8605F, -1.9826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, 0.3231F, 0.2696F, 0.2489F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 86).addBox(-2.4373F, 4.4728F, 3.8682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, -0.5348F, 0.057F, 0.0679F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 96).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2946F, 5.0046F, 0.7412F, -0.622F, 0.057F, 0.0679F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(115, 63).addBox(-2.4373F, -7.0074F, 0.7255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 115).addBox(-2.4373F, -7.4074F, 0.7255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0416F, -1.7013F, -0.3877F, -2.507F, 0.057F, 0.0679F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(128, 123).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.2708F, 5.2096F, 1.4005F, -1.582F, 0.057F, 0.0679F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.977F, 6.3211F, -1.8342F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.499F, -3.3418F, -0.9983F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6306F, -8.4528F, -2.0866F, 0.6934F, 0.6566F, 2.8095F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(19, 94).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4232F, -7.6575F, -1.081F, 0.172F, 1.2131F, 1.8042F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-0.499F, -4.0418F, -0.7983F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6306F, -8.4528F, -2.0866F, 0.0978F, 0.9102F, 1.7202F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7403F, -8.2182F, -2.2645F, -0.6429F, 0.9009F, 1.7092F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(71, 124).mirror().addBox(-0.5F, -1.95F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0829F, -6.6184F, -0.6414F, -1.951F, 1.1534F, 1.3043F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(0.1096F, -4.6363F, -1.6196F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6191F, -7.7529F, -0.5226F, -2.0819F, 1.1534F, 1.3043F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(15, 57).mirror().addBox(-0.1155F, -3.9203F, -6.4197F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.4314F, -7.3198F, -0.2859F, -1.3937F, 1.1389F, 1.9356F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(86, 109).mirror().addBox(0.1204F, -0.0767F, 0.3578F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 122).mirror().addBox(0.1204F, -0.0767F, -0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6191F, -7.7529F, -0.5226F, -1.6618F, 0.9803F, 1.3216F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(-0.1155F, -1.0537F, -4.9055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4314F, -7.3198F, -0.2859F, -0.9573F, 1.1389F, 1.9356F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(123, 127).mirror().addBox(0.1096F, -1.0294F, -0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6191F, -7.7529F, -0.5226F, -1.5932F, 1.1534F, 1.3043F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(0.1096F, -4.0294F, 0.3591F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6191F, -7.7529F, -0.5226F, -1.6456F, 1.1534F, 1.3043F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.5F, -4.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7191F, -10.9529F, -3.9226F, -1.2101F, 0.9009F, 1.7092F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.7191F, -10.9529F, -3.9226F, -0.7301F, 0.9009F, 1.7092F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(107, 59).mirror().addBox(0.1204F, 0.9697F, -0.7967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6191F, -7.7529F, -0.5226F, -1.1819F, 0.9803F, 1.3216F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5048F, -1.4829F, -2.9163F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6306F, -8.4528F, -2.0866F, -0.032F, 0.9009F, 1.7092F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-0.45F, -0.075F, 0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4408F, -0.7457F, 3.1623F, -1.253F, 0.0768F, -0.2406F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 110).mirror().addBox(-0.45F, -0.475F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4408F, -0.7457F, 3.1623F, 0.0123F, 0.0768F, -0.2406F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9603F, -3.0201F, -1.6149F, 0.4122F, 0.1325F, -0.225F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(122, 106).mirror().addBox(-0.45F, -2.375F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 81).mirror().addBox(-0.45F, -0.375F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5474F, -3.5674F, -0.5742F, 0.7105F, 0.0768F, -0.2406F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.904F, 2.7911F, 5.8367F, -2.6022F, 0.0716F, -0.1001F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(106, 5).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.1674F, 1.2341F, 6.3159F, 2.694F, 0.547F, 0.2289F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8294F, -0.3742F, 5.1761F, 2.3013F, 0.547F, 0.2289F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 105).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4456F, -1.932F, 3.982F, 0.7741F, 0.547F, 0.2289F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-1.0F, -7.0F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9316F, -2.3519F, 4.3829F, 0.8192F, -0.0508F, -0.1834F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(0.3145F, -7.9102F, -3.7371F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6191F, -3.3049F, 5.3138F, 0.8614F, 0.547F, 0.2289F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 124).mirror().addBox(-0.5F, -1.25F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.7363F, 3.5505F, 3.6568F, -0.8279F, -0.088F, -0.2151F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(118, 12).mirror().addBox(-0.1084F, 1.1185F, -1.805F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(97, 85).mirror().addBox(-0.1084F, 2.0185F, -3.205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, 0.9671F, -0.335F, -0.3141F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(17, 32).mirror().addBox(-0.1084F, -0.2645F, -6.7706F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, 1.6653F, -0.335F, -0.3141F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 57).mirror().addBox(-0.1084F, -0.004F, -5.2292F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, 1.5344F, -0.335F, -0.3141F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 124).mirror().addBox(0.2271F, 4.8605F, -1.9826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, 0.3231F, -0.2696F, -0.2489F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(122, 86).mirror().addBox(1.4374F, 4.4728F, 3.8682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, -0.5348F, -0.057F, -0.0679F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 96).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2946F, 5.0046F, 0.7412F, -0.622F, -0.057F, -0.0679F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(115, 63).mirror().addBox(1.4374F, -7.0074F, 0.7255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 115).mirror().addBox(1.4374F, -7.4074F, 0.7255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0416F, -1.7013F, -0.3877F, -2.507F, -0.057F, -0.0679F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(128, 123).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.2708F, 5.2096F, 1.4005F, -1.582F, -0.057F, -0.0679F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1894F, 5.9328F, 0.3365F, 0.0116F, -0.1726F, -0.1341F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 37).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, 10.42F, -1.4212F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 26).addBox(-2.0F, -0.65F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4F, 10.5937F, 1.1436F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(84, 36).addBox(-3.0F, 0.7F, -0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 9.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(118, 0).addBox(-1.2228F, -1.9311F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5853F, 0.9436F, 1.3709F, -0.1065F, -0.5736F, 0.4096F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(122, 81).addBox(-3.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.5525F, 4.3632F, 2.4736F, 0.0985F, -0.5472F, -0.0047F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(60, 103).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.5525F, 4.3632F, 2.4736F, -0.116F, -0.5441F, 0.4044F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 83).addBox(-1.6091F, -1.5488F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.5853F, 0.9436F, 1.3709F, 0.1212F, -0.571F, -0.0066F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(77, 80).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.7133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(52, 64).addBox(-2.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 2.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(106, 25).addBox(-3.0F, -0.0139F, -1.1995F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7F, 7.4156F, 1.6161F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(70, 71).addBox(-1.0F, -2.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7F, 4.9008F, 1.541F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(52, 89).addBox(-3.0F, 1.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 1.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(38, 22).addBox(-2.0F, -0.4371F, -0.1907F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.8658F, 13.059F, 2.3936F, -0.8962F, 0.0425F, 0.1238F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.9287F, -1.2866F, 3.3504F, -0.2094F, 0.0262F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(77, 118).addBox(-1.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(118, 75).addBox(-1.5F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9862F, -0.0294F, 5.5459F, -0.3403F, 0.0262F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(20, 118).addBox(-1.5F, -0.2F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(111, 14).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9706F, -1.2307F, 4.9489F, -0.6458F, 0.0262F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(110, 97).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9287F, -1.2866F, 3.3504F, -0.0349F, 0.0262F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0995F, -0.9995F, -2.1146F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.485F, -0.4F, 1.694F, 0.0524F, 0.0262F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(121, 34).addBox(-0.4F, 0.4F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 58).addBox(-1.5F, 0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5839F, -1.4433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(98, 54).addBox(-1.5F, -1.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.591F, -0.9237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(118, 116).addBox(-1.5F, 0.0F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7141F, 6.0417F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(118, 113).addBox(-1.5F, -0.1F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0629F, 5.3093F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(6, 119).addBox(-1.5F, -0.9F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.687F, 0.9046F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 50).addBox(-1.5F, -0.4F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1514F, 1.7152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(55, 20).addBox(-1.0F, -0.525F, 0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0844F, 0.5978F, 6.3073F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 75).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, -0.5532F, -1.0204F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.525F, 3.9F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(26, 57).addBox(0.5F, -0.275F, -0.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2F, 0.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1894F, 5.9328F, 0.3365F, -0.3374F, 0.1726F, 0.1341F));

		PartDefinition cube_r103 = rightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 53).addBox(-1.0F, -0.9F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6F, 10.42F, -1.4212F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 47).addBox(-2.0F, -0.65F, -0.9F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4F, 10.5937F, 1.1436F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(23, 85).addBox(-1.0F, 0.7F, -0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 9.4929F, 0.3446F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(118, 8).addBox(-0.7772F, -1.9311F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5853F, 0.9436F, 1.3709F, -0.1065F, 0.5736F, -0.4096F));

		PartDefinition cube_r107 = rightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(122, 101).addBox(2.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.5525F, 4.3632F, 2.4736F, 0.0985F, 0.5472F, 0.0047F));

		PartDefinition cube_r108 = rightLeg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 103).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.5525F, 4.3632F, 2.4736F, -0.116F, 0.5441F, -0.4044F));

		PartDefinition cube_r109 = rightLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(43, 83).addBox(-1.3909F, -1.5488F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.5853F, 0.9436F, 1.3709F, 0.1212F, 0.571F, 0.0066F));

		PartDefinition cube_r110 = rightLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 42).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.7133F, -0.5557F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 64).addBox(-1.5F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 2.5F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 107).addBox(1.0F, -0.0139F, -1.1995F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.7F, 7.4156F, 1.6161F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 8).addBox(-1.0F, -2.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.7F, 4.9008F, 1.541F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 89).addBox(1.0F, 1.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.7F, 1.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 12).addBox(0.0F, -0.4371F, -0.1907F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.8658F, 13.059F, 2.3936F, -0.8089F, -0.0425F, -0.1238F));

		PartDefinition cube_r115 = rightLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(111, 10).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.9287F, -1.2866F, 3.3504F, -0.2094F, -0.0262F, 0.0F));

		PartDefinition cube_r116 = rightLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 118).addBox(-0.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(118, 78).addBox(-0.5F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9862F, -0.0294F, 5.5459F, -0.3403F, -0.0262F, 0.0F));

		PartDefinition cube_r117 = rightLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(62, 118).addBox(-0.5F, -0.2F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(55, 118).addBox(-0.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9706F, -1.2307F, 4.9489F, -0.6458F, -0.0262F, 0.0F));

		PartDefinition cube_r118 = rightLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(111, 0).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9287F, -1.2866F, 3.3504F, -0.0349F, -0.0262F, 0.0F));

		PartDefinition cube_r119 = rightLeg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 0).addBox(0.0995F, -0.9995F, -2.1146F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.485F, -0.4F, 1.694F, 0.0524F, -0.0262F, 0.0F));

		PartDefinition cube_r120 = rightLeg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(121, 37).addBox(-1.6F, 0.4F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 66).addBox(-0.5F, 0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5839F, -1.4433F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 99).addBox(-0.5F, -1.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.591F, -0.9237F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(119, 89).addBox(-0.5F, 0.0F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.7141F, 6.0417F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(119, 19).addBox(-0.5F, -0.1F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0629F, 5.3093F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(119, 16).addBox(-0.5F, -0.9F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.687F, 0.9046F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(98, 62).addBox(-0.5F, -0.4F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1514F, 1.7152F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(57, 9).addBox(-2.0F, -0.525F, 0.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0844F, 0.5978F, 6.3073F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 63).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, -0.5532F, -1.0204F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, -0.525F, 3.9F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(41, 57).addBox(-3.5F, -0.275F, -0.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2F, 0.2F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0544F, -6.3999F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(125, 74).addBox(-0.6F, -3.27F, -0.2269F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2966F, -1.6034F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(129, 68).addBox(-0.6F, -2.67F, 0.073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9119F, -5.5997F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(43, 125).addBox(-0.6F, -3.07F, 0.0731F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1952F, -3.7325F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(40, 125).mirror().addBox(0.2F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2622F, -0.8855F, -3.3267F, -0.0408F, 0.2859F, 1.6589F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(49, 90).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0513F, -0.0884F, -1.4709F, -0.11F, 0.2851F, 1.568F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(93, 113).mirror().addBox(-3.0027F, 1.9234F, -0.5581F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -1.4144F, -4.998F, 0.111F, 0.0099F, 0.2491F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(3, 130).mirror().addBox(-1.7482F, 1.108F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -1.4144F, -4.998F, 0.1027F, -0.0433F, 0.735F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(25, 131).mirror().addBox(-0.1783F, 0.074F, -0.5116F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7233F, -1.4144F, -4.998F, 0.0058F, -0.1156F, 1.6573F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(25, 131).addBox(0.1783F, 0.074F, -0.5116F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -1.4144F, -4.998F, 0.0058F, 0.1156F, -1.6573F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(3, 130).addBox(1.7482F, 1.108F, -0.5581F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -1.4144F, -4.998F, 0.1027F, 0.0433F, -0.735F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(93, 113).addBox(3.0027F, 1.9234F, -0.5581F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7233F, -1.4144F, -4.998F, 0.111F, -0.0099F, -0.2491F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 32).addBox(-1.0F, -0.07F, 0.073F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9119F, -5.5997F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(49, 90).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0513F, -0.0884F, -1.4709F, -0.11F, -0.2851F, -1.568F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(40, 125).addBox(-0.2F, -0.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2622F, -0.8855F, -3.3267F, -0.0408F, -0.2859F, -1.6589F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(110, 17).addBox(-1.5F, -1.0602F, 3.0964F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 110).addBox(-1.5F, -1.0061F, 5.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9119F, -12.3997F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -1.6176F, -5.537F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 107).addBox(-1.5F, -0.6061F, 0.0442F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.0943F, -5.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(124, 95).addBox(-0.6F, -2.8406F, -0.2547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.4413F, -3.7432F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(5, 125).addBox(-0.6F, -3.0061F, -0.2558F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.163F, -1.7627F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(110, 127).addBox(-0.6F, -2.2061F, -0.0558F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(22, 131).mirror().addBox(-0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, -0.0034F, -0.2199F, 1.6588F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, 0.1808F, -0.1133F, 0.7289F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(34, 116).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8467F, -0.8968F, -1.461F, 0.2125F, -0.0159F, 0.2488F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(16, 131).mirror().addBox(-0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, -0.0066F, -0.2547F, 1.6596F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(3, 115).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, 0.2071F, -0.1365F, 0.7257F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3467F, -1.1968F, -3.461F, 0.2463F, -0.0245F, 0.2481F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(128, 126).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, -0.0034F, -0.2199F, 1.6588F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(113, 23).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, 0.1808F, -0.1133F, 0.7289F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 83).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8467F, -1.4968F, -5.261F, 0.2125F, -0.0159F, 0.2488F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(61, 83).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, 0.2125F, 0.0159F, -0.2488F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(113, 23).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, 0.1808F, 0.1133F, -0.7289F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(128, 126).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4968F, -5.261F, -0.0034F, 0.2199F, -1.6588F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(74, 99).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, 0.2463F, 0.0245F, -0.2481F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(3, 115).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, 0.2071F, 0.1365F, -0.7257F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(16, 131).addBox(0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1968F, -3.461F, -0.0066F, 0.2547F, -1.6596F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(34, 116).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, 0.2125F, 0.0159F, -0.2488F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 115).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, 0.1808F, 0.1133F, -0.7289F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(22, 131).addBox(0.0925F, 1.0702F, -0.5274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8968F, -1.461F, -0.0034F, 0.2199F, -1.6588F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(19, 22).addBox(-1.0F, 0.0939F, -0.0558F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.2411F, -6.9487F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(81, 110).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, 0.1547F, -0.09F, 0.7316F));

		PartDefinition cube_r167 = body5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(129, 87).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, -0.0003F, -0.1852F, 1.6582F));

		PartDefinition cube_r168 = body5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(17, 74).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.2557F, -0.3123F, 0.1786F, -0.0073F, 0.2492F));

		PartDefinition cube_r169 = body5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, 0.1786F, -0.0073F, 0.2492F));

		PartDefinition cube_r170 = body5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(96, 113).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, 0.1547F, -0.09F, 0.7316F));

		PartDefinition cube_r171 = body5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(117, 124).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.0557F, -2.4123F, -0.0003F, -0.1852F, 1.6582F));

		PartDefinition cube_r172 = body5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(117, 124).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, -0.0003F, 0.1852F, -1.6582F));

		PartDefinition cube_r173 = body5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(96, 113).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, 0.1547F, 0.09F, -0.7316F));

		PartDefinition cube_r174 = body5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(14, 74).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.0557F, -2.4123F, 0.1786F, 0.0073F, -0.2492F));

		PartDefinition cube_r175 = body5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 74).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, 0.1786F, 0.0073F, -0.2492F));

		PartDefinition cube_r176 = body5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -1.0F, -3.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(106, 87).addBox(-1.5F, -1.6F, -2.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 53).addBox(-1.5F, -1.6F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(77, 99).addBox(-0.6F, -2.0014F, 0.0678F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8407F, -2.9843F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 131).addBox(-0.6F, -2.0014F, -0.0322F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8896F, -0.8308F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(129, 87).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, -0.0003F, 0.1852F, -1.6582F));

		PartDefinition cube_r180 = body5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(81, 110).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.2557F, -0.3123F, 0.1547F, 0.09F, -0.7316F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, -3.8751F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(130, 6).addBox(-0.6F, -1.6874F, -0.3422F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5071F, -4.6216F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(18, 126).addBox(-0.6F, -1.9874F, -0.2422F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5212F, -2.8723F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(129, 63).addBox(-0.6F, -2.1874F, -0.1422F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -0.9027F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(110, 94).addBox(-1.5F, -2.0F, -6.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 110).addBox(-1.5F, -2.0F, -10.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 110).addBox(-1.5F, -2.0F, -8.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(125, 113).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.0104F, -0.0635F, 1.6569F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(111, 38).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.0639F, -0.0081F, 0.736F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.854F, -4.4372F, 0.0602F, 0.0228F, 0.2483F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(99, 124).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -2.4372F, 0.0074F, -0.0982F, 1.6571F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(105, 109).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -2.4372F, 0.0897F, -0.0316F, 0.7355F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(11, 66).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -2.4372F, 0.094F, 0.0142F, 0.2489F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(126, 15).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -0.5372F, 0.0058F, -0.1156F, 1.6573F));

		PartDefinition cube_r192 = body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(99, 113).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -0.5372F, 0.1027F, -0.0433F, 0.735F));

		PartDefinition cube_r193 = body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(28, 70).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.1539F, -0.5372F, 0.111F, 0.0099F, 0.2491F));

		PartDefinition cube_r194 = body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(28, 70).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -0.5372F, 0.111F, -0.0099F, -0.2491F));

		PartDefinition cube_r195 = body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(99, 113).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -0.5372F, 0.1027F, 0.0433F, -0.735F));

		PartDefinition cube_r196 = body2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(126, 15).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -0.5372F, 0.0058F, 0.1156F, -1.6573F));

		PartDefinition cube_r197 = body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(11, 66).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -2.4372F, 0.094F, -0.0142F, -0.2489F));

		PartDefinition cube_r198 = body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(105, 109).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -2.4372F, 0.0897F, 0.0316F, -0.7355F));

		PartDefinition cube_r199 = body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 124).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.1539F, -2.4372F, 0.0074F, 0.0982F, -1.6571F));

		PartDefinition cube_r200 = body2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 70).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.0602F, -0.0228F, -0.2483F));

		PartDefinition cube_r201 = body2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(111, 38).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.0639F, 0.0081F, -0.736F));

		PartDefinition cube_r202 = body2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(125, 113).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.854F, -4.4372F, 0.0104F, 0.0635F, -1.6569F));

		PartDefinition cube_r203 = body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -8.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1989F, -5.0852F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(120, 124).addBox(-0.6F, -1.8015F, -0.2561F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8395F, -3.4547F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(127, 106).addBox(-0.6F, -1.7765F, 0.0189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2136F, -1.8212F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(78, 68).addBox(-1.5F, -1.0401F, -4.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 56).addBox(-1.5F, -1.0401F, -2.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 37).addBox(-1.0F, -0.0401F, -4.1382F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(21, 126).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, -0.0066F, -0.2547F, 1.6596F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(102, 109).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, 0.2071F, -0.1365F, 0.7257F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 0.445F, -3.252F, 0.2463F, -0.0245F, 0.2481F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 126).mirror().addBox(-0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, -0.0082F, -0.2721F, 1.66F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(14, 112).mirror().addBox(-2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, 0.2203F, -0.1481F, 0.7238F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(31, 70).mirror().addBox(-5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.155F, -1.352F, 0.2632F, -0.0288F, 0.2477F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(31, 70).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, 0.2632F, 0.0288F, -0.2477F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(14, 112).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, 0.2203F, 0.1481F, -0.7238F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(24, 126).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.155F, -1.352F, -0.0082F, 0.2721F, -1.66F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(67, 71).addBox(5.8496F, 5.6992F, -0.5949F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, 0.2463F, 0.0245F, -0.2481F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 109).addBox(2.4893F, 1.7784F, -0.5949F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, 0.2071F, 0.1365F, -0.7257F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(21, 126).addBox(0.0925F, 0.0702F, -0.5274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, 0.445F, -3.252F, -0.0066F, 0.2547F, -1.6596F));

		PartDefinition body6 = body.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body6.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(126, 89).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, 0.2084F, -1.2743F, -0.0058F, -0.246F, 1.6594F));

		PartDefinition cube_r220 = body6.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(17, 112).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, 0.2084F, -1.2743F, 0.2005F, -0.1307F, 0.7265F));

		PartDefinition cube_r221 = body6.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4233F, 0.2084F, -1.2743F, 0.2378F, -0.0224F, 0.2483F));

		PartDefinition cube_r222 = body6.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(20, 74).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, 0.2084F, -1.2743F, 0.2378F, 0.0224F, -0.2483F));

		PartDefinition cube_r223 = body6.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(17, 112).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, 0.2084F, -1.2743F, 0.2005F, 0.1307F, -0.7265F));

		PartDefinition cube_r224 = body6.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(126, 89).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4233F, 0.2084F, -1.2743F, -0.0058F, 0.246F, -1.6594F));

		PartDefinition cube_r225 = body6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(70, 20).addBox(-1.0F, -0.0401F, -7.1382F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(110, 20).addBox(-1.5F, -1.0401F, -6.1382F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4366F, 3.9778F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r226 = body6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(27, 126).addBox(-0.6F, -2.1636F, 0.0067F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6938F, -1.7671F, -0.1484F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1669F, -2.5223F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(105, 130).addBox(-0.6F, -2.0653F, -0.587F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0064F, -2.3457F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(31, 131).addBox(-0.6F, -2.2654F, -0.087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4338F, -0.9738F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(102, 126).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, -0.0074F, -0.2634F, 1.6162F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(108, 113).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.2137F, -0.1423F, 0.6811F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(28, 89).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0233F, 0.6415F, -2.452F, 0.2548F, -0.0267F, 0.2043F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, -0.009F, -0.2808F, 1.6602F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, 0.2269F, -0.1539F, 0.7228F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(9, 81).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.1585F, -0.652F, 0.2717F, -0.0309F, 0.2474F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(23, 9).mirror().addBox(-0.1F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5683F, 8.1158F, -9.7789F, -0.4634F, -0.4652F, 0.3297F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(23, 9).addBox(-4.9F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5683F, 8.1158F, -9.7789F, -0.4634F, 0.4652F, -0.3297F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(57, 15).addBox(-2.0F, -0.6F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(51, 30).addBox(-1.0F, -0.6F, 0.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3773F, -6.2914F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(30, 104).addBox(-1.5F, -1.9F, -4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 107).addBox(-1.5F, -1.9F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 63).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, 1.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(9, 81).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, 0.2717F, 0.0309F, -0.2474F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(31, 116).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, 0.2269F, 0.1539F, -0.7228F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 127).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2233F, -0.1585F, -0.652F, -0.009F, 0.2808F, -1.6602F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(28, 89).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.2548F, 0.0267F, -0.2043F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(108, 113).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, 0.2137F, 0.1423F, -0.6811F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(102, 126).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0233F, 0.6415F, -2.452F, -0.0074F, 0.2634F, -1.6162F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.2851F, -2.9861F));

		PartDefinition cube_r245 = chest2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(35, 127).addBox(-0.6F, -2.5644F, -0.5794F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7507F, -2.9815F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(38, 130).addBox(-0.6F, -2.3644F, -0.0795F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4546F, -1.5657F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(104, 35).addBox(-1.5F, -1.9F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 63).addBox(-1.0F, -0.9F, -9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -3.1F, 4.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r248 = chest2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(13, 127).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.7436F, -1.1659F, -0.0074F, -0.2634F, 1.5376F));

		PartDefinition cube_r249 = chest2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(28, 112).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.7436F, -1.1659F, 0.2137F, -0.1423F, 0.6026F));

		PartDefinition cube_r250 = chest2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -1.7436F, -1.1659F, 0.2548F, -0.0267F, 0.1257F));

		PartDefinition cube_r251 = chest2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(113, 127).mirror().addBox(-0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, -0.0123F, -0.3156F, 1.443F));

		PartDefinition cube_r252 = chest2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(38, 113).mirror().addBox(-1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, 0.2535F, -0.1769F, 0.5002F));

		PartDefinition cube_r253 = chest2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(114, 121).mirror().addBox(-4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.5436F, -2.9659F, 0.3056F, -0.0395F, 0.0281F));

		PartDefinition cube_r254 = chest2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(114, 121).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, 0.3056F, 0.0395F, -0.0281F));

		PartDefinition cube_r255 = chest2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(38, 113).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, 0.2535F, 0.1769F, -0.5002F));

		PartDefinition cube_r256 = chest2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(113, 127).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -0.5436F, -2.9659F, -0.0123F, 0.3156F, -1.443F));

		PartDefinition cube_r257 = chest2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(39, 104).addBox(4.9775F, 5.4796F, -0.5618F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.7436F, -1.1659F, 0.2548F, 0.0267F, -0.1257F));

		PartDefinition cube_r258 = chest2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(28, 112).addBox(1.8223F, 1.175F, -0.5618F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.7436F, -1.1659F, 0.2137F, 0.1423F, -0.6026F));

		PartDefinition cube_r259 = chest2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(13, 127).addBox(0.1697F, -0.8263F, -0.5132F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9233F, -1.7436F, -1.1659F, -0.0074F, 0.2634F, -1.5376F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1009F, -3.5656F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(127, 79).addBox(-0.1F, -2.6722F, 0.0299F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6588F, -2.116F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(92, 20).addBox(-0.5F, 0.9F, 1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2195F, -2.6473F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r262 = neck2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(130, 77).addBox(0.0F, -0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8444F, -1.3313F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r263 = neck2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(41, 130).addBox(0.0F, -1.5861F, 0.0638F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6761F, -3.1188F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(34, 77).addBox(-0.5F, 0.0F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0626F, -3.542F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(120, 31).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.012F, -3.5121F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(104, 79).addBox(0.0F, -1.0F, -1.6F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0629F, -3.0355F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(50, 131).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5062F, -1.2519F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(45, 49).addBox(-0.5F, 0.7742F, -1.8591F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5182F, -4.5372F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1238F, -4.6446F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(88, 0).addBox(-1.0F, -2.1F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 8.0172F, -3.8729F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7515F, -1.8915F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(13, 120).addBox(0.491F, 3.5881F, -1.8062F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.491F, 6.0407F, -5.9719F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(120, 4).addBox(0.491F, -0.9584F, 0.0177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.491F, 9.0907F, -5.4219F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 36).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.4704F, -6.1773F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(106, 30).addBox(0.991F, -2.0069F, -1.9375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.491F, 5.9901F, -3.838F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(31, 90).addBox(0.491F, -2.8569F, 0.0625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.491F, 9.0907F, -5.4219F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(89, 64).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.5087F, -6.1233F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 59).addBox(0.991F, 1.959F, -0.3391F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.491F, 0.1907F, -4.8969F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(81, 20).addBox(-2.0F, -1.0F, -0.175F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.8775F, -2.6637F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(87, 55).addBox(-2.5F, -1.2F, 0.175F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.6351F, -2.2264F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(87, 51).addBox(-2.5F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.6264F, -1.7264F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(102, 117).mirror().addBox(-1.5F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(102, 117).addBox(0.55F, -2.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.025F, 1.6887F, 1.9257F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(123, 26).mirror().addBox(-0.6F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.925F, 1.5696F, 1.7696F, -2.3756F, 0.0866F, -0.1226F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(127, 3).mirror().addBox(-0.6F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4446F, 0.6696F, -1.6425F, 0.0866F, -0.1226F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-0.6F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4446F, 0.6696F, -0.5953F, 0.0866F, -0.1226F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(96, 129).mirror().addBox(-0.6F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4446F, 0.6696F, -0.159F, 0.0866F, -0.1226F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(96, 129).addBox(-0.4F, -1.4321F, 3.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.4446F, 0.6696F, -0.159F, -0.0866F, 0.1226F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(116, 129).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2571F, 1.9947F, 3.86F, -0.5953F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(64, 85).addBox(-0.4F, -2.2604F, 2.6086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0F, 1.4446F, 0.6696F, -0.5953F, -0.0866F, 0.1226F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(127, 3).addBox(-0.4F, -3.2992F, 0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 1.4446F, 0.6696F, -1.6425F, -0.0866F, 0.1226F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(123, 26).addBox(-0.4F, -1.986F, -0.7103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.925F, 1.5696F, 1.7696F, -2.3756F, -0.0866F, 0.1226F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(86, 25).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.009F, -1.2372F, -3.8857F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(77, 85).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.491F, 0.2156F, -4.8643F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(20, 114).addBox(1.0F, -0.0144F, 0.0293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.491F, 0.2157F, -4.8969F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(75, 26).addBox(-1.5F, -0.9F, -1.1F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2832F, -1.1335F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(111, 113).addBox(1.0F, 0.9757F, -0.1423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.491F, 0.2157F, -4.8969F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 6.8548F, -0.2369F));

		PartDefinition cube_r296 = leftSygomaticarch.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(42, 107).addBox(-0.625F, -0.125F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5494F, -4.4489F, -4.8335F, 0.3882F, 0.4035F, -2.5547F));

		PartDefinition cube_r297 = leftSygomaticarch.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(129, 13).addBox(-0.625F, -0.95F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.5494F, -4.4489F, -4.8335F, 0.2689F, 0.4886F, -2.8294F));

		PartDefinition cube_r298 = leftSygomaticarch.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(76, 124).addBox(0.15F, 0.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6269F, -1.7267F, -5.3348F, 0.0703F, 0.3066F, 3.0329F));

		PartDefinition cube_r299 = leftSygomaticarch.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(115, 81).addBox(-1.125F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3147F, -0.836F, -4.7034F, -0.4524F, -0.0099F, 2.2564F));

		PartDefinition cube_r300 = leftSygomaticarch.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(14, 107).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4479F, -2.3843F, -5.9404F, 0.2194F, 0.0583F, -0.2554F));

		PartDefinition cube_r301 = leftSygomaticarch.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(128, 36).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9303F, -0.502F, -5.5058F, -0.9131F, 0.5804F, -1.5713F));

		PartDefinition cube_r302 = leftSygomaticarch.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(8, 125).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0701F, -3.6295F, -5.3864F, 0.358F, -0.9935F, 2.3205F));

		PartDefinition cube_r303 = leftSygomaticarch.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(128, 42).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.4479F, -2.3843F, -5.9404F, 1.0337F, 0.0428F, 1.1441F));

		PartDefinition cube_r304 = leftSygomaticarch.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(46, 124).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.4479F, -2.3843F, -5.9404F, 0.4019F, 0.9819F, 0.0714F));

		PartDefinition cube_r305 = leftSygomaticarch.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(128, 39).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9479F, 1.3786F, -5.2423F, -0.4426F, 0.2371F, -1.372F));

		PartDefinition cube_r306 = leftSygomaticarch.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(51, 124).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9479F, 1.3786F, -5.2423F, 0.1571F, 0.4749F, 0.0723F));

		PartDefinition cube_r307 = leftSygomaticarch.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(114, 47).addBox(-1.0F, -1.125F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9046F, 0.3389F, -4.1152F, -0.524F, 0.1785F, 2.6542F));

		PartDefinition cube_r308 = leftSygomaticarch.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(76, 57).addBox(-0.8F, -0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.708F, 1.8732F, -4.3831F, 1.6246F, 0.9968F, 0.0046F));

		PartDefinition cube_r309 = leftSygomaticarch.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(76, 51).addBox(-0.3701F, -1.3119F, -1.5537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, 1.5965F, 0.1944F, -0.072F));

		PartDefinition cube_r310 = leftSygomaticarch.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(123, 123).addBox(-1.1908F, -0.4452F, -0.3362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, -0.0041F, -0.1048F, -0.0693F));

		PartDefinition cube_r311 = leftSygomaticarch.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(20, 121).addBox(-0.4096F, -2.7926F, -0.3253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, 0.3827F, 0.0346F, -0.0989F));

		PartDefinition cube_r312 = leftSygomaticarch.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(106, 84).addBox(-2.725F, -0.2F, -0.825F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6593F, 2.5522F, -4.6167F, 0.7854F, -0.0253F, 1.5366F));

		PartDefinition cube_r313 = leftSygomaticarch.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(106, 74).addBox(-2.8F, -0.2F, -0.825F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6593F, 2.5522F, -4.6167F, 1.5708F, -0.0253F, 1.5366F));

		PartDefinition cube_r314 = leftSygomaticarch.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(128, 26).addBox(-0.8F, -0.275F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6613F, 2.6249F, -4.5986F, 1.5642F, 1.3274F, 1.5913F));

		PartDefinition cube_r315 = leftSygomaticarch.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(128, 23).addBox(-0.875F, -0.275F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0347F, 2.73F, -5.0625F, 0.3372F, 0.7548F, 0.263F));

		PartDefinition cube_r316 = leftSygomaticarch.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(128, 20).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, 2.2502F, -5.1732F, 0.2295F, 0.2289F, 0.232F));

		PartDefinition cube_r317 = leftSygomaticarch.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(128, 10).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9479F, 2.2502F, -5.1732F, 0.2234F, -0.0093F, 0.1769F));

		PartDefinition cube_r318 = leftSygomaticarch.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(105, 127).addBox(1.291F, 3.112F, -0.142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.4389F, -0.814F, -5.735F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftSygomaticarch.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(8, 128).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1479F, 3.4733F, -4.7805F, 0.7799F, -0.6514F, -0.5402F));

		PartDefinition cube_r320 = leftSygomaticarch.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(76, 128).addBox(-1.1393F, 0.4383F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(61, 128).addBox(-1.1393F, 0.1383F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, 0.7804F, -0.0961F, -0.0343F));

		PartDefinition cube_r321 = leftSygomaticarch.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(128, 74).addBox(-1.1219F, -0.0365F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(71, 128).addBox(-1.1219F, 0.4635F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(66, 128).addBox(-1.1219F, 0.6635F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.226F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, 1.652F, -0.1017F, -0.0164F));

		PartDefinition cube_r322 = leftSygomaticarch.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(128, 57).addBox(-0.9858F, 0.6229F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(56, 128).addBox(-0.9858F, 0.4229F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.226F))
				.texOffs(128, 33).addBox(-0.9858F, -0.0771F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, 1.6515F, -0.0668F, -0.0163F));

		PartDefinition cube_r323 = leftSygomaticarch.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(128, 45).addBox(-1.003F, 0.1137F, -0.5111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(30, 128).addBox(-1.003F, 0.4137F, -0.5111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, 0.7792F, -0.0613F, -0.0342F));

		PartDefinition cube_r324 = leftSygomaticarch.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(30, 124).addBox(-1.0096F, -0.4204F, -0.3743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3589F, 2.2959F, -3.2089F, -0.0062F, -0.0613F, -0.0342F));

		PartDefinition cube_r325 = leftSygomaticarch.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(123, 119).addBox(-0.422F, -0.3981F, -0.6438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, -0.0086F, 0.0085F, -0.0341F));

		PartDefinition cube_r326 = leftSygomaticarch.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 95).addBox(-0.3701F, -0.8605F, -0.0031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, 1.8583F, 0.1944F, -0.072F));

		PartDefinition cube_r327 = leftSygomaticarch.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(115, 71).addBox(-0.3701F, -0.938F, -1.6471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, 1.4219F, 0.1944F, -0.072F));

		PartDefinition cube_r328 = leftSygomaticarch.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(123, 53).addBox(-0.6166F, -0.4022F, -0.6308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, -0.009F, -0.0352F, -0.0689F));

		PartDefinition cube_r329 = leftSygomaticarch.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(118, 119).addBox(-1.0F, -2.5F, -1.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5786F, 1.6935F, -3.7281F, -1.2549F, 1.5227F, -1.2526F));

		PartDefinition cube_r330 = leftSygomaticarch.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(115, 67).addBox(-0.4636F, -0.9166F, -0.9746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0485F, 2.8848F, -3.5964F, 1.6034F, 0.0987F, -0.0709F));

		PartDefinition cube_r331 = leftSygomaticarch.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(114, 43).addBox(-0.5559F, -0.9616F, -1.6397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.9589F, 2.2959F, -3.2089F, 1.4233F, 0.1508F, -0.1065F));

		PartDefinition cube_r332 = leftSygomaticarch.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(114, 39).addBox(0.6513F, 0.32F, -1.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3557F, -1.398F, -2.5847F, 0.6251F, 0.2326F, 0.3421F));

		PartDefinition cube_r333 = leftSygomaticarch.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(111, 77).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2052F, -1.5667F, -1.3037F, -0.0458F, 0.0057F, 0.148F));

		PartDefinition cube_r334 = leftSygomaticarch.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(91, 128).addBox(-0.5F, 0.2389F, -0.2674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0045F, -2.2265F, -3.1834F, -3.0227F, 0.0405F, 0.0565F));

		PartDefinition cube_r335 = leftSygomaticarch.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(86, 128).addBox(-0.5F, -0.2382F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0045F, -2.2265F, -3.1834F, -2.7609F, 0.0405F, 0.0565F));

		PartDefinition cube_r336 = leftSygomaticarch.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(128, 111).addBox(-0.5F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0099F, -1.874F, -2.772F, -1.8882F, 0.038F, 0.0583F));

		PartDefinition cube_r337 = leftSygomaticarch.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(13, 123).addBox(-0.5F, -1.768F, -0.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0045F, -2.2515F, -3.2084F, -2.5427F, 0.038F, 0.0583F));

		PartDefinition cube_r338 = leftSygomaticarch.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(127, 103).addBox(-1.0305F, -0.7113F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2943F, -1.398F, -2.5847F, -2.8308F, 0.0317F, 0.0619F));

		PartDefinition cube_r339 = leftSygomaticarch.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(127, 100).addBox(-1.0306F, -1.1846F, -0.3783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2943F, -1.398F, -2.5847F, -1.3299F, 0.0317F, 0.0619F));

		PartDefinition cube_r340 = leftSygomaticarch.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(128, 120).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3481F, -0.5707F, -0.3395F, -1.0494F, 0.0057F, 0.148F));

		PartDefinition cube_r341 = leftSygomaticarch.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(127, 97).addBox(0.4404F, -0.9909F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3557F, -0.223F, -1.2097F, -1.2239F, 0.0057F, 0.148F));

		PartDefinition cube_r342 = leftSygomaticarch.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(127, 94).addBox(0.6508F, 0.352F, -0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3557F, -1.398F, -2.5847F, 0.3004F, -0.0326F, 0.1445F));

		PartDefinition cube_r343 = leftSygomaticarch.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(127, 84).addBox(0.6458F, 0.2638F, -0.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3557F, -1.398F, -2.5847F, -0.3307F, -0.117F, 0.1264F));

		PartDefinition cube_r344 = leftSygomaticarch.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(115, 85).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.245F, -5.0198F, -5.4343F, -0.2396F, -0.3747F, -1.103F));

		PartDefinition cube_r345 = leftSygomaticarch.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(115, 105).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8253F, -5.8505F, -5.0683F, -0.2243F, -0.4864F, -1.1232F));

		PartDefinition cube_r346 = leftSygomaticarch.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(115, 101).addBox(0.1F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4857F, -4.0732F, -5.7205F, -0.1721F, -0.2817F, -1.3115F));

		PartDefinition cube_r347 = leftSygomaticarch.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(123, 49).addBox(-0.7F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0157F, -0.3259F, -3.6571F, -0.0936F, 0.0174F, -0.0889F));

		PartDefinition cube_r348 = leftSygomaticarch.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(119, 92).addBox(-1.6012F, 1.8116F, 0.0284F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4704F, -7.114F, -2.575F, -0.1646F, 0.1566F, 0.0709F));

		PartDefinition cube_r349 = leftSygomaticarch.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(115, 109).addBox(-1.0F, -1.0F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1177F, -5.8879F, -2.8665F, -0.1969F, 0.0679F, -0.3959F));

		PartDefinition cube_r350 = leftSygomaticarch.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(95, 12).addBox(-2.0478F, -1.0467F, -0.177F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4704F, -7.114F, -2.575F, -0.7598F, 0.0644F, -0.2477F));

		PartDefinition cube_r351 = leftSygomaticarch.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(114, 35).addBox(-2.0478F, -0.0467F, 0.423F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4704F, -7.114F, -2.575F, -0.4151F, 0.0679F, -0.3959F));

		PartDefinition cube_r352 = leftSygomaticarch.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(26, 100).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4479F, -6.9088F, -2.3764F, -1.5058F, 0.3484F, 0.0222F));

		PartDefinition cube_r353 = leftSygomaticarch.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(128, 48).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6456F, -7.7785F, -3.1269F, -1.5708F, 1.0297F, -1.5708F));

		PartDefinition cube_r354 = leftSygomaticarch.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 128).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4389F, -8.092F, -3.6487F, -0.7789F, 0.7478F, -0.5911F));

		PartDefinition cube_r355 = leftSygomaticarch.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(129, 16).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3983F, -5.7427F, -4.7118F, -1.0859F, -0.2713F, -1.021F));

		PartDefinition cube_r356 = leftSygomaticarch.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(61, 124).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0537F, -5.4583F, -4.4872F, -1.2557F, -0.26F, -2.6383F));

		PartDefinition cube_r357 = leftSygomaticarch.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(56, 124).addBox(-0.95F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6688F, -6.2337F, -4.0959F, -1.7972F, -0.4246F, -1.11F));

		PartDefinition cube_r358 = leftSygomaticarch.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(128, 51).addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4389F, -6.6392F, -4.6274F, -1.0554F, -0.4246F, -1.11F));

		PartDefinition cube_r359 = leftSygomaticarch.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(51, 128).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4389F, -6.6392F, -4.6274F, -0.8465F, 0.6684F, -0.6111F));

		PartDefinition cube_r360 = leftSygomaticarch.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(35, 100).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6729F, -6.2614F, -4.1074F, -1.6308F, 0.9412F, -1.6449F));

		PartDefinition cube_r361 = leftSygomaticarch.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(129, 60).addBox(-1.0F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(128, 54).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4682F, -4.4418F, -2.5569F, -0.1855F, 0.0985F, 0.0268F));

		PartDefinition cube_r362 = leftSygomaticarch.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(128, 117).addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0881F, -4.0389F, -2.9908F, 0.2346F, 0.0436F, 0.0576F));

		PartDefinition cube_r363 = leftSygomaticarch.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(128, 114).addBox(-0.5F, -0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1472F, -4.789F, -2.5009F, 0.0981F, 0.0479F, -0.2752F));

		PartDefinition cube_r364 = leftSygomaticarch.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(127, 30).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1472F, -4.789F, -2.5009F, -0.1637F, 0.0479F, -0.2752F));

		PartDefinition cube_r365 = leftSygomaticarch.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(87, 97).addBox(-0.5F, -1.9F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3992F, -0.6069F, -2.6472F, -0.4884F, 0.0118F, 0.051F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 6.8548F, -0.2369F));

		PartDefinition cube_r366 = rightSygomaticarch.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(42, 107).mirror().addBox(-0.375F, -0.125F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5494F, -4.4489F, -4.8335F, 0.3882F, -0.4035F, 2.5547F));

		PartDefinition cube_r367 = rightSygomaticarch.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(129, 13).mirror().addBox(-0.375F, -0.95F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.5494F, -4.4489F, -4.8335F, 0.2689F, -0.4886F, 2.8294F));

		PartDefinition cube_r368 = rightSygomaticarch.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(76, 124).mirror().addBox(-1.15F, 0.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6269F, -1.7267F, -5.3348F, 0.0703F, -0.3066F, -3.0329F));

		PartDefinition cube_r369 = rightSygomaticarch.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-0.875F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3147F, -0.836F, -4.7034F, -0.4524F, 0.0099F, -2.2564F));

		PartDefinition cube_r370 = rightSygomaticarch.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(14, 107).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4479F, -2.3843F, -5.9404F, 0.2194F, -0.0583F, 0.2554F));

		PartDefinition cube_r371 = rightSygomaticarch.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(128, 36).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9303F, -0.502F, -5.5058F, -0.9131F, -0.5804F, 1.5713F));

		PartDefinition cube_r372 = rightSygomaticarch.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(8, 125).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0701F, -3.6295F, -5.3864F, 0.358F, 0.9935F, -2.3205F));

		PartDefinition cube_r373 = rightSygomaticarch.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(128, 42).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.4479F, -2.3843F, -5.9404F, 1.0337F, -0.0428F, -1.1441F));

		PartDefinition cube_r374 = rightSygomaticarch.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(46, 124).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.4479F, -2.3843F, -5.9404F, 0.4019F, -0.9819F, -0.0714F));

		PartDefinition cube_r375 = rightSygomaticarch.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(128, 39).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 1.3786F, -5.2423F, -0.4426F, -0.2371F, 1.372F));

		PartDefinition cube_r376 = rightSygomaticarch.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(51, 124).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 1.3786F, -5.2423F, 0.1571F, -0.4749F, -0.0723F));

		PartDefinition cube_r377 = rightSygomaticarch.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(114, 47).mirror().addBox(-1.0F, -1.125F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9046F, 0.3389F, -4.1152F, -0.524F, -0.1785F, -2.6542F));

		PartDefinition cube_r378 = rightSygomaticarch.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-0.2F, -0.8F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.708F, 1.8732F, -4.3831F, 1.6246F, -0.9968F, -0.0046F));

		PartDefinition cube_r379 = rightSygomaticarch.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.6299F, -1.3119F, -1.5537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, 1.5965F, -0.1944F, 0.072F));

		PartDefinition cube_r380 = rightSygomaticarch.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(123, 123).mirror().addBox(0.1908F, -0.4452F, -0.3362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, -0.0041F, 0.1048F, 0.0693F));

		PartDefinition cube_r381 = rightSygomaticarch.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(20, 121).mirror().addBox(-0.5904F, -2.7926F, -0.3253F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, 0.3827F, -0.0346F, 0.0989F));

		PartDefinition cube_r382 = rightSygomaticarch.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(106, 84).mirror().addBox(-0.275F, -0.2F, -0.825F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6593F, 2.5522F, -4.6167F, 0.7854F, 0.0253F, -1.5366F));

		PartDefinition cube_r383 = rightSygomaticarch.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(106, 74).mirror().addBox(-0.2F, -0.2F, -0.825F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6593F, 2.5522F, -4.6167F, 1.5708F, 0.0253F, -1.5366F));

		PartDefinition cube_r384 = rightSygomaticarch.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(128, 26).mirror().addBox(-0.2F, -0.275F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6613F, 2.6249F, -4.5986F, 1.5642F, -1.3274F, -1.5913F));

		PartDefinition cube_r385 = rightSygomaticarch.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(128, 23).mirror().addBox(-0.125F, -0.275F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0347F, 2.73F, -5.0625F, 0.3372F, -0.7548F, -0.263F));

		PartDefinition cube_r386 = rightSygomaticarch.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(128, 20).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 2.2502F, -5.1732F, 0.2295F, -0.2289F, -0.232F));

		PartDefinition cube_r387 = rightSygomaticarch.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(128, 10).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9479F, 2.2502F, -5.1732F, 0.2234F, 0.0093F, -0.1769F));

		PartDefinition cube_r388 = rightSygomaticarch.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(105, 127).mirror().addBox(-2.291F, 3.112F, -0.142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.4389F, -0.814F, -5.735F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r389 = rightSygomaticarch.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(8, 128).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1479F, 3.4733F, -4.7805F, 0.7799F, 0.6514F, 0.5402F));

		PartDefinition cube_r390 = rightSygomaticarch.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(76, 128).mirror().addBox(0.1393F, 0.4383F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(61, 128).mirror().addBox(0.1393F, 0.1383F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, 0.7804F, 0.0961F, 0.0343F));

		PartDefinition cube_r391 = rightSygomaticarch.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(128, 74).mirror().addBox(0.1219F, -0.0365F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(71, 128).mirror().addBox(0.1219F, 0.4635F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(66, 128).mirror().addBox(0.1219F, 0.6635F, -1.6072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.226F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, 1.652F, 0.1017F, 0.0164F));

		PartDefinition cube_r392 = rightSygomaticarch.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(128, 57).mirror().addBox(-0.0142F, 0.6229F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(56, 128).mirror().addBox(-0.0142F, 0.4229F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.226F)).mirror(false)
				.texOffs(128, 33).mirror().addBox(-0.0142F, -0.0771F, -1.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, 1.6515F, 0.0668F, 0.0163F));

		PartDefinition cube_r393 = rightSygomaticarch.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(128, 45).mirror().addBox(0.003F, 0.1137F, -0.5111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(30, 128).mirror().addBox(0.003F, 0.4137F, -0.5111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, 0.7792F, 0.0613F, 0.0342F));

		PartDefinition cube_r394 = rightSygomaticarch.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(30, 124).mirror().addBox(0.0096F, -0.4204F, -0.3743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3589F, 2.2959F, -3.2089F, -0.0062F, 0.0613F, 0.0342F));

		PartDefinition cube_r395 = rightSygomaticarch.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(123, 119).mirror().addBox(-0.578F, -0.3981F, -0.6438F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, -0.0086F, -0.0085F, 0.0341F));

		PartDefinition cube_r396 = rightSygomaticarch.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.6299F, -0.8605F, -0.0031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, 1.8583F, -0.1944F, 0.072F));

		PartDefinition cube_r397 = rightSygomaticarch.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(115, 71).mirror().addBox(-0.6299F, -0.938F, -1.6471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, 1.4219F, -0.1944F, 0.072F));

		PartDefinition cube_r398 = rightSygomaticarch.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(123, 53).mirror().addBox(-0.3834F, -0.4022F, -0.6308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, -0.009F, 0.0352F, 0.0689F));

		PartDefinition cube_r399 = rightSygomaticarch.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(118, 119).mirror().addBox(0.0F, -2.5F, -1.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5786F, 1.6935F, -3.7281F, -1.2549F, -1.5227F, 1.2526F));

		PartDefinition cube_r400 = rightSygomaticarch.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(115, 67).mirror().addBox(-0.5364F, -0.9166F, -0.9746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0485F, 2.8848F, -3.5964F, 1.6034F, -0.0987F, 0.0709F));

		PartDefinition cube_r401 = rightSygomaticarch.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(114, 43).mirror().addBox(-0.4441F, -0.9616F, -1.6397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.9589F, 2.2959F, -3.2089F, 1.4233F, -0.1508F, 0.1065F));

		PartDefinition cube_r402 = rightSygomaticarch.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(114, 39).mirror().addBox(-1.6513F, 0.32F, -1.9713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3557F, -1.398F, -2.5847F, 0.6251F, -0.2326F, -0.3421F));

		PartDefinition cube_r403 = rightSygomaticarch.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(111, 77).mirror().addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2052F, -1.5667F, -1.3037F, -0.0458F, -0.0057F, -0.148F));

		PartDefinition cube_r404 = rightSygomaticarch.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(91, 128).mirror().addBox(-0.5F, 0.2389F, -0.2674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0045F, -2.2265F, -3.1834F, -3.0227F, -0.0405F, -0.0565F));

		PartDefinition cube_r405 = rightSygomaticarch.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 128).mirror().addBox(-0.5F, -0.2382F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0045F, -2.2265F, -3.1834F, -2.7609F, -0.0405F, -0.0565F));

		PartDefinition cube_r406 = rightSygomaticarch.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(128, 111).mirror().addBox(-0.5F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0099F, -1.874F, -2.772F, -1.8882F, -0.038F, -0.0583F));

		PartDefinition cube_r407 = rightSygomaticarch.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(13, 123).mirror().addBox(-0.5F, -1.768F, -0.3986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0045F, -2.2515F, -3.2084F, -2.5427F, -0.038F, -0.0583F));

		PartDefinition cube_r408 = rightSygomaticarch.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(127, 103).mirror().addBox(0.0305F, -0.7113F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2943F, -1.398F, -2.5847F, -2.8308F, -0.0317F, -0.0619F));

		PartDefinition cube_r409 = rightSygomaticarch.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(127, 100).mirror().addBox(0.0306F, -1.1846F, -0.3783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2943F, -1.398F, -2.5847F, -1.3299F, -0.0317F, -0.0619F));

		PartDefinition cube_r410 = rightSygomaticarch.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(128, 120).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3481F, -0.5707F, -0.3395F, -1.0494F, -0.0057F, -0.148F));

		PartDefinition cube_r411 = rightSygomaticarch.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(127, 97).mirror().addBox(-1.4404F, -0.9909F, -1.1654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3557F, -0.223F, -1.2097F, -1.2239F, -0.0057F, -0.148F));

		PartDefinition cube_r412 = rightSygomaticarch.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(127, 94).mirror().addBox(-1.6508F, 0.352F, -0.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3557F, -1.398F, -2.5847F, 0.3004F, 0.0326F, -0.1445F));

		PartDefinition cube_r413 = rightSygomaticarch.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(127, 84).mirror().addBox(-1.6458F, 0.2638F, -0.3405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3557F, -1.398F, -2.5847F, -0.3307F, 0.117F, -0.1264F));

		PartDefinition cube_r414 = rightSygomaticarch.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(115, 85).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.245F, -5.0198F, -5.4343F, -0.2396F, 0.3747F, 1.103F));

		PartDefinition cube_r415 = rightSygomaticarch.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(115, 105).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8253F, -5.8505F, -5.0683F, -0.2243F, 0.4864F, 1.1232F));

		PartDefinition cube_r416 = rightSygomaticarch.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(115, 101).mirror().addBox(-1.1F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4857F, -4.0732F, -5.7205F, -0.1721F, 0.2817F, 1.3115F));

		PartDefinition cube_r417 = rightSygomaticarch.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(123, 49).mirror().addBox(-0.3F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0157F, -0.3259F, -3.6571F, -0.0936F, -0.0174F, 0.0889F));

		PartDefinition cube_r418 = rightSygomaticarch.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(119, 92).mirror().addBox(-0.3988F, 1.8116F, 0.0284F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4704F, -7.114F, -2.575F, -0.1646F, -0.1566F, -0.0709F));

		PartDefinition cube_r419 = rightSygomaticarch.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(115, 109).mirror().addBox(-1.0F, -1.0F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.1177F, -5.8879F, -2.8665F, -0.1969F, -0.0679F, 0.3959F));

		PartDefinition cube_r420 = rightSygomaticarch.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(0.0478F, -1.0467F, -0.177F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4704F, -7.114F, -2.575F, -0.7598F, -0.0644F, 0.2477F));

		PartDefinition cube_r421 = rightSygomaticarch.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(114, 35).mirror().addBox(0.0478F, -0.0467F, 0.423F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4704F, -7.114F, -2.575F, -0.4151F, -0.0679F, 0.3959F));

		PartDefinition cube_r422 = rightSygomaticarch.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(26, 100).mirror().addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4479F, -6.9088F, -2.3764F, -1.5058F, -0.3484F, -0.0222F));

		PartDefinition cube_r423 = rightSygomaticarch.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(128, 48).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6456F, -7.7785F, -3.1269F, -1.5708F, -1.0297F, 1.5708F));

		PartDefinition cube_r424 = rightSygomaticarch.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(46, 128).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -8.092F, -3.6487F, -0.7789F, -0.7478F, 0.5911F));

		PartDefinition cube_r425 = rightSygomaticarch.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(129, 16).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3983F, -5.7427F, -4.7118F, -1.0859F, 0.2713F, 1.021F));

		PartDefinition cube_r426 = rightSygomaticarch.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(61, 124).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0537F, -5.4583F, -4.4872F, -1.2557F, 0.26F, 2.6383F));

		PartDefinition cube_r427 = rightSygomaticarch.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(56, 124).mirror().addBox(-0.05F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6688F, -6.2337F, -4.0959F, -1.7972F, 0.4246F, 1.11F));

		PartDefinition cube_r428 = rightSygomaticarch.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(128, 51).mirror().addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -6.6392F, -4.6274F, -1.0554F, 0.4246F, 1.11F));

		PartDefinition cube_r429 = rightSygomaticarch.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(51, 128).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -6.6392F, -4.6274F, -0.8465F, -0.6684F, 0.6111F));

		PartDefinition cube_r430 = rightSygomaticarch.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6729F, -6.2614F, -4.1074F, -1.6308F, -0.9412F, 1.6449F));

		PartDefinition cube_r431 = rightSygomaticarch.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(129, 60).mirror().addBox(0.0F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(128, 54).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4682F, -4.4418F, -2.5569F, -0.1855F, -0.0985F, -0.0268F));

		PartDefinition cube_r432 = rightSygomaticarch.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(128, 117).mirror().addBox(-0.5F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0881F, -4.0389F, -2.9908F, 0.2346F, -0.0436F, -0.0576F));

		PartDefinition cube_r433 = rightSygomaticarch.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(128, 114).mirror().addBox(-0.5F, -0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1472F, -4.789F, -2.5009F, 0.0981F, -0.0479F, 0.2752F));

		PartDefinition cube_r434 = rightSygomaticarch.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(127, 30).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1472F, -4.789F, -2.5009F, -0.1637F, -0.0479F, 0.2752F));

		PartDefinition cube_r435 = rightSygomaticarch.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(87, 97).mirror().addBox(-0.5F, -1.9F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3992F, -0.6069F, -2.6472F, -0.4884F, -0.0118F, -0.051F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2093F, -1.9803F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(122, 110).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(107, 124).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4793F, 1.422F, -0.1164F, -0.5236F, 0.0F, -0.1047F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(113, 4).mirror().addBox(0.0F, 1.1251F, -0.6853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(19, 89).mirror().addBox(0.0F, 0.1251F, -1.9603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.3F, 2.0F, -0.6545F, 0.0F, -0.1047F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(95, 17).mirror().addBox(0.0F, -0.351F, -1.0467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.3F, 2.0F, 0.2356F, 0.0F, -0.1047F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(56, 114).mirror().addBox(0.0F, -1.2359F, -0.8748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.6F, 2.0F, -1.3875F, 0.0F, -0.1047F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(107, 48).mirror().addBox(-0.5F, -0.8F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5109F, 1.4219F, 3.3218F, -0.5585F, 0.0F, -0.1047F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(52, 83).mirror().addBox(-0.5F, -1.25F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4129F, 2.3534F, 2.1615F, -1.5708F, 0.0F, -0.1047F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(114, 59).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6276F, 0.3108F, 2.2349F, -1.789F, 0.0F, -0.1047F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(0.0203F, -0.5005F, -3.1101F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1716F, 7.3184F, 1.5861F, -1.6842F, 0.0F, -0.192F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0933F, 4.0224F, 1.196F, -1.8326F, 0.003F, -0.1748F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(63, 114).mirror().addBox(0.0203F, -1.1085F, -0.3207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 4.6F, 2.0F, -1.6319F, 0.0F, -0.192F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(113, 31).mirror().addBox(-0.4049F, -0.4274F, -0.8983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 113).mirror().addBox(-0.4049F, -0.4274F, -0.8983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.3315F, 0.1222F, 0.0871F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(31, 112).mirror().addBox(-0.4049F, -0.5957F, -1.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(112, 90).mirror().addBox(-0.4049F, -0.5957F, -1.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.4886F, 0.1222F, 0.0871F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(49, 113).mirror().addBox(-0.5732F, -0.5467F, -1.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.4982F, -0.0066F, -0.0784F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(42, 112).mirror().addBox(-0.5732F, -0.4207F, -1.069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.3412F, -0.0066F, -0.0784F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-0.5F, -0.65F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5032F, 1.4946F, 3.8653F, -1.1694F, 0.0F, -0.1047F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(104, 12).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.347F, 2.9813F, 5.206F, -0.2094F, 0.0F, -0.1047F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(23, 104).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1425F, 4.9269F, 4.7901F, 0.8381F, -0.0234F, -0.1307F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(123, 22).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9871F, 6.4051F, 3.4519F, 2.1414F, -0.1206F, -0.0787F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 96).mirror().addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4692F, 1.5178F, -0.7494F, -0.0436F, 0.0F, -0.1047F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(0.1951F, -0.5957F, -2.3627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.4942F, -0.0168F, -0.0186F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(0.1951F, -0.4207F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7701F, 7.3104F, 1.3215F, -2.3197F, -0.0168F, -0.0186F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(125, 7).mirror().addBox(-0.6F, -0.175F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8197F, 8.2023F, 0.3608F, -2.9871F, 0.036F, 0.0736F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(81, 128).mirror().addBox(-0.475F, -0.175F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.8197F, 8.2023F, 0.3608F, -2.986F, 0.1222F, 0.0871F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(112, 90).addBox(-0.5951F, -0.5957F, -1.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(31, 112).addBox(-0.5951F, -0.5957F, -1.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.4886F, -0.1222F, -0.0871F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(72, 113).addBox(-0.5951F, -0.4274F, -0.8983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(113, 31).addBox(-0.5951F, -0.4274F, -0.8983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.3315F, -0.1222F, -0.0871F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(42, 112).addBox(-0.4268F, -0.4207F, -1.069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.3412F, 0.0066F, 0.0784F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(49, 113).addBox(-0.4268F, -0.5467F, -1.1294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.4982F, 0.0066F, 0.0784F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(125, 0).addBox(-1.1951F, -0.4207F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.3197F, 0.0168F, 0.0186F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(71, 89).addBox(-1.1951F, -0.5957F, -2.3627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.7701F, 7.3104F, 1.3215F, -2.4942F, 0.0168F, 0.0186F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(81, 128).addBox(-0.525F, -0.175F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8197F, 8.2023F, 0.3608F, -2.986F, -0.1222F, -0.0871F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(125, 7).addBox(-0.4F, -0.175F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8197F, 8.2023F, 0.3608F, -2.9871F, -0.036F, -0.0736F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(63, 114).addBox(-1.0203F, -1.1085F, -0.3207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 4.6F, 2.0F, -1.6319F, 0.0F, 0.192F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(7, 105).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0933F, 4.0224F, 1.196F, -1.8326F, -0.003F, 0.1748F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(97, 74).addBox(-1.0203F, -0.5005F, -3.1101F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1716F, 7.3184F, 1.5861F, -1.6842F, 0.0F, 0.192F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(114, 59).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6276F, 0.3108F, 2.2349F, -1.789F, 0.0F, 0.1047F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(52, 83).addBox(-0.5F, -1.25F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4129F, 2.3534F, 2.1615F, -1.5708F, 0.0F, 0.1047F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(123, 22).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9871F, 6.4051F, 3.4519F, 2.1414F, 0.1206F, 0.0787F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(23, 104).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1425F, 4.9269F, 4.7901F, 0.8381F, 0.0234F, 0.1307F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(104, 12).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.347F, 2.9813F, 5.206F, -0.2094F, 0.0F, 0.1047F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -0.65F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5032F, 1.4946F, 3.8653F, -1.1694F, 0.0F, 0.1047F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(107, 48).addBox(-0.5F, -0.8F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5109F, 1.4219F, 3.3218F, -0.5585F, 0.0F, 0.1047F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(56, 114).addBox(-1.0F, -1.2359F, -0.8748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1F, 0.6F, 2.0F, -1.3875F, 0.0F, 0.1047F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(95, 17).addBox(-1.0F, -0.351F, -1.0467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 0.3F, 2.0F, 0.2356F, 0.0F, 0.1047F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(19, 89).addBox(-1.0F, 0.1251F, -1.9603F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(113, 4).addBox(-1.0F, 1.1251F, -0.6853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 0.3F, 2.0F, -0.6545F, 0.0F, 0.1047F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(107, 124).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(122, 110).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4793F, 1.422F, -0.1164F, -0.5236F, 0.0F, 0.1047F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(9, 96).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(95, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4692F, 1.5178F, -0.7494F, -0.0436F, 0.0F, 0.1047F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7701F, 4.1353F, -5.7898F, 0.2443F, 0.2438F, -0.0725F));

		PartDefinition cube_r482 = bone2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 12).addBox(-0.4F, 0.0F, -8.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7586F, 2.7876F, -3.7432F, -2.6844F, 0.4391F, -0.9835F));

		PartDefinition cube_r483 = bone2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(44, 101).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5594F, -0.4381F, 2.9441F, 0.9122F, 0.2457F, -0.3953F));

		PartDefinition cube_r484 = bone2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(65, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9991F, 2.9458F, -0.6337F, -3.0148F, 0.2457F, -0.3953F));

		PartDefinition cube_r485 = bone2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8937F, 1.1363F, 1.7568F, 2.1775F, 0.2457F, -0.3953F));

		PartDefinition cube_r486 = bone2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(58, 109).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1187F, -2.2877F, 3.2888F, -0.1787F, 0.2457F, -0.3953F));

		PartDefinition cube_r487 = bone2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(21, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9297F, -3.1997F, 1.7043F, -0.615F, 0.2457F, -0.3953F));

		PartDefinition cube_r488 = bone2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.9229F, -3.7755F, -1.0673F, -1.8804F, 0.2457F, -0.3953F));

		PartDefinition cube_r489 = bone2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(108, 108).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9303F, -2.6967F, -2.7513F, -2.6221F, 0.2457F, -0.3953F));

		PartDefinition cube_r490 = bone2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(108, 103).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5603F, -1.081F, -3.8706F, 2.5266F, 0.2457F, -0.3953F));

		PartDefinition cube_r491 = bone2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(108, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9353F, 0.7491F, -4.3804F, 1.3049F, 0.2457F, -0.3953F));

		PartDefinition cube_r492 = bone2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(97, 25).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.231F, 1.9652F, -3.6557F, 0.5195F, 0.2457F, -0.3953F));

		PartDefinition cube_r493 = bone2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(88, 29).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1002F, 2.5364F, -4.0514F, 0.1704F, 0.2457F, -0.3953F));

		PartDefinition cube_r494 = bone2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(108, 64).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7296F, 1.4369F, -4.6798F, -0.3096F, 0.2457F, -0.3953F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7701F, 4.1353F, -5.7898F, 0.2443F, -0.2438F, 0.0725F));

		PartDefinition cube_r495 = bone4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.6F, 0.0F, -8.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7586F, 2.7876F, -3.7432F, -2.6844F, -0.4391F, 0.9835F));

		PartDefinition cube_r496 = bone4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(44, 101).mirror().addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -0.4381F, 2.9441F, 0.9122F, -0.2457F, 0.3953F));

		PartDefinition cube_r497 = bone4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(65, 109).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9991F, 2.9458F, -0.6337F, -3.0148F, -0.2457F, 0.3953F));

		PartDefinition cube_r498 = bone4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8937F, 1.1363F, 1.7568F, 2.1775F, -0.2457F, 0.3953F));

		PartDefinition cube_r499 = bone4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(58, 109).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1187F, -2.2877F, 3.2888F, -0.1787F, -0.2457F, 0.3953F));

		PartDefinition cube_r500 = bone4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(21, 109).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9297F, -3.1997F, 1.7043F, -0.615F, -0.2457F, 0.3953F));

		PartDefinition cube_r501 = bone4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.9229F, -3.7755F, -1.0673F, -1.8804F, -0.2457F, 0.3953F));

		PartDefinition cube_r502 = bone4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(108, 108).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.9303F, -2.6967F, -2.7513F, -2.6221F, -0.2457F, 0.3953F));

		PartDefinition cube_r503 = bone4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(108, 103).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.5603F, -1.081F, -3.8706F, 2.5266F, -0.2457F, 0.3953F));

		PartDefinition cube_r504 = bone4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(108, 69).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9353F, 0.7491F, -4.3804F, 1.3049F, -0.2457F, 0.3953F));

		PartDefinition cube_r505 = bone4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(97, 25).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.231F, 1.9652F, -3.6557F, 0.5195F, -0.2457F, 0.3953F));

		PartDefinition cube_r506 = bone4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(88, 29).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1002F, 2.5364F, -4.0514F, 0.1704F, -0.2457F, 0.3953F));

		PartDefinition cube_r507 = bone4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(108, 64).mirror().addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7296F, 1.4369F, -4.6798F, -0.3096F, -0.2457F, 0.3953F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 21).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.5479F, 8.8842F, -7.4497F, -0.7309F, 0.2682F, -0.1405F));

		PartDefinition cube_r508 = leftArm.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(45, 78).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r509 = leftArm.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(99, 70).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r510 = leftArm.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(88, 75).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r511 = leftArm.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(75, 32).addBox(-3.5206F, -0.5F, -1.1533F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8502F, 0.4534F, 7.68F, -0.5259F, -1.1261F, 0.4679F));

		PartDefinition cube_r512 = leftArm.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(77, 103).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2446F, 0.2245F, 6.6644F, -2.7924F, 0.8878F, -2.881F));

		PartDefinition cube_r513 = leftArm.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(101, 17).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3291F, 0.6572F, 8.6152F, -1.3682F, 1.3485F, -1.378F));

		PartDefinition cube_r514 = leftArm.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(101, 99).addBox(-0.6F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8993F, 0.6947F, 8.8798F, -0.3671F, 0.9253F, -0.3128F));

		PartDefinition cube_r515 = leftArm.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(102, 44).addBox(-0.751F, -0.5F, 0.0016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8502F, 0.4534F, 7.68F, -0.2176F, -0.0018F, -0.0143F));

		PartDefinition cube_r516 = leftArm.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(15, 41).addBox(-0.5014F, -0.3286F, -2.7839F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3213F, -0.0873F, 0.052F, -0.0076F));

		PartDefinition cube_r517 = leftArm.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(45, 41).addBox(-0.9195F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r518 = leftArm.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(90, 69).addBox(-1.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 90).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1128F, -0.9727F, 1.6424F, -0.3054F, 0.0873F, 0.0F));

		PartDefinition cube_r519 = leftArm.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(116, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.35F, -1.5452F, 3.5213F, -0.6545F, 0.0873F, 0.0F));

		PartDefinition cube_r520 = leftArm.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(84, 114).addBox(-0.9F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0267F, -0.9F, 2.6274F, 0.2618F, 0.0873F, 0.0F));

		PartDefinition cube_r521 = leftArm.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, -0.0105F, 4.3213F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r522 = leftArm.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(97, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r523 = leftArm.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(40, 95).addBox(-1.2F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4839F, -0.8967F, 9.9025F, -0.1777F, -0.5504F, -0.3072F));

		PartDefinition cube_r524 = leftArm2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(122, 65).addBox(-2.0F, 2.6246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(122, 62).addBox(-2.0F, 2.0246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, 0.0349F));

		PartDefinition cube_r525 = leftArm2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(74, 121).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0679F, 1.4312F, 0.5537F, 0.3752F, 0.0F, 0.0349F));

		PartDefinition cube_r526 = leftArm2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(67, 121).addBox(-1.0F, -1.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(60, 121).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0679F, 1.4312F, 0.5537F, -0.3665F, 0.0F, 0.0349F));

		PartDefinition cube_r527 = leftArm2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(116, 55).addBox(-1.0F, -1.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.089F, 2.0358F, 0.3695F, 0.0262F, 0.0F, 0.0349F));

		PartDefinition cube_r528 = leftArm2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(121, 43).addBox(-1.0F, -1.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(121, 40).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4072F, 11.1481F, 1.0464F, 0.6545F, 0.0F, 0.0349F));

		PartDefinition cube_r529 = leftArm2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(53, 121).addBox(-1.0F, -0.725F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.1097F, 2.6268F, -0.6878F, 0.3491F, 0.0F, 0.0349F));

		PartDefinition cube_r530 = leftArm2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(81, 121).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1097F, 2.6268F, -0.6878F, -0.4363F, 0.0F, 0.0349F));

		PartDefinition cube_r531 = leftArm2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(117, 97).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1788F, 4.6063F, -1.1747F, -0.0436F, 0.0F, 0.0349F));

		PartDefinition cube_r532 = leftArm2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(116, 27).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2414F, 6.3983F, -1.0178F, 0.0873F, 0.0F, 0.0349F));

		PartDefinition cube_r533 = leftArm2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(96, 92).addBox(-1.0F, -2.7F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3292F, 8.9135F, -0.3574F, 0.2182F, 0.0F, 0.0349F));

		PartDefinition cube_r534 = leftArm2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(58, 96).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2412F, 6.392F, 0.4199F, 0.1309F, 0.0F, 0.0349F));

		PartDefinition cube_r535 = leftArm2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(94, 99).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1739F, 4.4656F, 0.6528F, 0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(79, 6).addBox(-0.6F, 0.2F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, 11.0224F, 2.1029F, -1.2775F, 0.8781F, -1.4085F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4923F, 2.6871F, -0.008F, -1.2053F, -1.1507F, 1.2138F));

		PartDefinition cube_r536 = leftArm4.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(86, 103).addBox(-2.4F, 0.4F, -0.875F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4267F, 2.8885F, 0.0914F, -0.4796F, 0.0201F, -0.2667F));

		PartDefinition cube_r537 = leftArm5.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(12, 88).addBox(-0.6F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm7 = leftArm3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, 0.5236F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0788F, 3.3893F, 1.957F, -0.1946F, 0.1054F, -0.2767F));

		PartDefinition cube_r538 = leftArm6.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(41, 120).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm8 = leftArm3.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1755F, 1.0282F, -0.318F, -0.5512F, 0.0723F, -0.2053F));

		PartDefinition cube_r539 = leftArm8.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(86, 124).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(21, 12).addBox(0.2F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.5479F, 8.8842F, -7.4497F, -0.6291F, -0.3644F, 0.2339F));

		PartDefinition cube_r540 = rightArm.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(56, 78).addBox(-1.0F, -0.4F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.5041F, 0.5966F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r541 = rightArm.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(7, 101).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r542 = rightArm.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(88, 87).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2929F, 0.0649F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r543 = rightArm.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(77, 71).addBox(-0.4794F, -0.5F, -1.1533F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8502F, 0.4534F, 7.68F, -0.5259F, 1.1261F, -0.4679F));

		PartDefinition cube_r544 = rightArm.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(103, 90).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2446F, 0.2245F, 6.6644F, -2.7924F, -0.8878F, 2.881F));

		PartDefinition cube_r545 = rightArm.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(101, 21).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3291F, 0.6572F, 8.6152F, -1.3682F, -1.3485F, 1.378F));

		PartDefinition cube_r546 = rightArm.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(102, 40).addBox(-1.4F, -0.5F, -1.325F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8993F, 0.6947F, 8.8798F, -0.3671F, -0.9253F, 0.3128F));

		PartDefinition cube_r547 = rightArm.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(51, 103).addBox(-1.249F, -0.5F, 0.0016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8502F, 0.4534F, 7.68F, -0.2176F, 0.0018F, 0.0143F));

		PartDefinition cube_r548 = rightArm.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(30, 41).addBox(-0.4986F, -0.3286F, -2.7839F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3213F, -0.0873F, -0.052F, 0.0076F));

		PartDefinition cube_r549 = rightArm.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(15, 49).addBox(-0.0805F, -0.5F, -2.7601F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2805F, 0.2F, 4.7601F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r550 = rightArm.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(95, 35).addBox(0.2F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 95).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1128F, -0.9727F, 1.6424F, -0.3054F, -0.0873F, 0.0F));

		PartDefinition cube_r551 = rightArm.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(48, 117).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.35F, -1.5452F, 3.5213F, -0.6545F, -0.0873F, 0.0F));

		PartDefinition cube_r552 = rightArm.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(116, 23).addBox(-0.1F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0267F, -0.9F, 2.6274F, 0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r553 = rightArm.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.6895F, -3.7005F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, -0.0105F, 4.3213F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r554 = rightArm.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(97, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.0755F, 8.1713F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r555 = rightArm.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(49, 96).addBox(-0.8F, -2.0F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4839F, -0.8967F, 9.9025F, -0.0031F, 0.5504F, 0.3072F));

		PartDefinition cube_r556 = rightArm2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(122, 71).addBox(0.0F, 2.6246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(122, 68).addBox(0.0F, 2.0246F, -1.0218F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, -0.4965F, 0.1528F, 0.288F, 0.0F, -0.0349F));

		PartDefinition cube_r557 = rightArm2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(6, 122).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0679F, 1.4312F, 0.5537F, 0.3752F, 0.0F, -0.0349F));

		PartDefinition cube_r558 = rightArm2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(107, 121).addBox(-1.0F, -1.7F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(95, 121).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0679F, 1.4312F, 0.5537F, -0.3665F, 0.0F, -0.0349F));

		PartDefinition cube_r559 = rightArm2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(70, 117).addBox(-1.0F, -1.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.089F, 2.0358F, 0.3695F, 0.0262F, 0.0F, -0.0349F));

		PartDefinition cube_r560 = rightArm2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(121, 46).addBox(-1.0F, -1.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(46, 121).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.4072F, 11.1481F, 1.0464F, 0.6545F, 0.0F, -0.0349F));

		PartDefinition cube_r561 = rightArm2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(121, 59).addBox(-1.0F, -0.725F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1097F, 2.6268F, -0.6878F, 0.3491F, 0.0F, -0.0349F));

		PartDefinition cube_r562 = rightArm2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(88, 121).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1097F, 2.6268F, -0.6878F, -0.4363F, 0.0F, -0.0349F));

		PartDefinition cube_r563 = rightArm2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(111, 117).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1788F, 4.6063F, -1.1747F, -0.0436F, 0.0F, -0.0349F));

		PartDefinition cube_r564 = rightArm2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(41, 116).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2414F, 6.3983F, -1.0178F, 0.0873F, 0.0F, -0.0349F));

		PartDefinition cube_r565 = rightArm2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(97, 0).addBox(-1.0F, -2.7F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3292F, 8.9135F, -0.3574F, 0.2182F, 0.0F, -0.0349F));

		PartDefinition cube_r566 = rightArm2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(80, 96).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2412F, 6.392F, 0.4199F, 0.1309F, 0.0F, -0.0349F));

		PartDefinition cube_r567 = rightArm2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(16, 101).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1739F, 4.4656F, 0.6528F, 0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(79, 13).addBox(-0.4F, 0.2F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3881F, 11.0224F, 2.1029F, -1.3678F, -0.619F, 1.1715F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4923F, 2.6871F, -0.008F, -1.2053F, 1.1507F, -1.2138F));

		PartDefinition cube_r568 = rightArm4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(101, 103).addBox(0.4F, 0.4F, -0.875F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4267F, 2.8885F, 0.0914F, -0.4796F, -0.0201F, 0.2667F));

		PartDefinition cube_r569 = rightArm5.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(88, 12).addBox(-0.4F, -0.4F, -2.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm7 = rightArm3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5089F, 3.1492F, 1.6F, 0.0873F, 0.0F, -0.5236F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0788F, 3.3893F, 1.957F, -0.1946F, -0.1054F, 0.2767F));

		PartDefinition cube_r570 = rightArm6.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(25, 121).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm8 = rightArm3.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1755F, 1.0282F, -0.318F, -0.5512F, -0.0723F, 0.2053F));

		PartDefinition cube_r571 = rightArm8.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(91, 124).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(71, 44).addBox(-0.5F, 0.0933F, -0.1029F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4458F, 4.8631F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r572 = tail.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(23, 101).addBox(-0.1F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1805F, 1.8952F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r573 = tail.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(121, 130).addBox(-0.1F, -0.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0933F, -0.1029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(34, 70).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1939F, 3.8622F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r574 = tail8.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(130, 106).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8202F, 2.6282F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r575 = tail8.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(96, 124).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8447F, 0.5888F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r576 = tail8.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(9, 93).addBox(-0.1F, -0.95F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 9).addBox(-0.1F, -0.85F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0128F, -2.0019F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(56, 71).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0444F, 3.9545F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r577 = tail2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(47, 131).addBox(-0.1F, -0.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0463F, 2.1077F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r578 = tail2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(44, 131).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9193F, 2.5604F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r579 = tail2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(28, 131).addBox(0.0F, -0.6F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9928F, 0.5256F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r580 = tail2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(53, 131).addBox(-0.1F, -0.575F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(87, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.09F, 3.4483F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail9.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(6, 131).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6063F, 2.4854F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r582 = tail9.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(124, 130).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8056F, 0.5932F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail9.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(111, 81).addBox(-0.1F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.037F, 0.0177F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0006F, 2.756F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail3.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(9, 131).addBox(0.0F, -1.2F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5337F, 1.4137F, 0.4451F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(93, 40).addBox(-0.5F, -0.8982F, 0.0171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8982F, 2.7829F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r585 = tail10.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(130, 81).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 0).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2975F, 0.3805F, 0.2705F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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