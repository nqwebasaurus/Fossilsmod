package fossils.fossils.client.blockentity.model.bisonlatifrons;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BisonlatifronsFossilModel extends SkullModelBase {
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
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public BisonlatifronsFossilModel(ModelPart root) {
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
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(79, 4).addBox(-2.5397F, 2.7482F, -2.4279F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -31.0F, 26.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 45).addBox(0.0F, -1.6986F, 0.0389F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2649F, 3.1982F, -1.2638F, -2.6773F, -0.7355F, 1.5425F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 39).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1083F, 5.0263F, 0.457F, -1.0432F, -1.4638F, -0.3606F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-1.3779F, -0.3152F, -0.5075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3216F, -2.5558F, -3.6318F, -0.6614F, -0.1215F, 0.2705F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 11).mirror().addBox(-2.0F, -1.1F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6904F, -1.9313F, -4.0688F, -0.6646F, -0.0794F, 0.3377F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 13).mirror().addBox(-1.3753F, -0.0279F, -0.7009F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6216F, -3.1558F, -3.6318F, -0.6476F, -0.0846F, 0.8133F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-2.0F, -0.0731F, -1.249F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8F, -2.5F, -0.6269F, -0.2327F, -0.3082F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-0.3755F, 0.4323F, -1.7324F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6216F, -1.8558F, -2.9318F, -2.385F, -0.5276F, 1.7407F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(-2.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0199F, 2.7071F, 0.0164F, -2.5464F, -0.7355F, 1.5425F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-1.5F, -0.5F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9884F, 3.8189F, 1.0228F, -1.381F, -1.1337F, 0.1892F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-2.5F, -1.0F, -0.9F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9215F, 3.5249F, 3.2074F, -1.1534F, -1.3244F, -0.4793F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7601F, 3.4171F, 3.1589F, -1.6182F, -0.9937F, -0.5426F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, 2.3005F, 4.0228F, -1.0721F, -0.9013F, -1.2062F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 11).addBox(-2.0F, -1.1F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6904F, -1.9313F, -4.0688F, -0.6646F, 0.0794F, -0.3377F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -0.5F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9884F, 3.8189F, 1.0228F, -1.381F, 1.1337F, -0.1892F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 39).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1083F, 5.0263F, 0.457F, -1.0432F, 1.4638F, 0.3606F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(56, 37).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8426F, 2.3005F, 4.0228F, -1.0721F, 0.9013F, 1.2062F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 43).addBox(-2.5F, -1.0F, -0.9F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9215F, 3.5249F, 3.2074F, -1.1534F, 1.3244F, 0.4793F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 15).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7601F, 3.4171F, 3.1589F, -1.6182F, 0.9937F, 0.5426F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -1.0F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4603F, 3.7482F, -1.9279F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(88, 24).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2649F, 3.1982F, -1.2638F, -2.6773F, 0.7355F, -1.5425F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(80, 43).addBox(-1.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0199F, 2.7071F, 0.0164F, -2.5464F, 0.7355F, -1.5425F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 34).addBox(-3.6245F, 0.4323F, -1.7324F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6216F, -1.8558F, -2.9318F, -2.385F, 0.5276F, -1.7407F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 13).addBox(-0.6247F, -0.0279F, -0.7009F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6216F, -3.1558F, -3.6318F, -0.6476F, 0.0846F, -0.8133F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 51).addBox(-0.6221F, -0.3152F, -0.5075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3216F, -2.5558F, -3.6318F, -0.6614F, 0.1215F, -0.2705F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -0.0731F, -1.249F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8F, -2.5F, -0.6269F, 0.2327F, 0.3082F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 14).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 3.6F, -0.4F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 35).addBox(-1.0F, -5.4F, -1.4F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 68).addBox(-1.0F, -2.0F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(86, 87).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 63).addBox(-1.5F, -15.5937F, -5.8715F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 81).addBox(-1.0F, -0.0858F, -0.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3652F, 0.7178F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 7).addBox(-1.5F, -0.8F, -1.9F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(18, 70).addBox(-1.9F, -7.9918F, -1.048F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(79, 26).addBox(-2.4F, -4.735F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(74, 64).addBox(-1.9F, -11.735F, 0.4314F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.5443F, -1.1179F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.6475F, -0.4467F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 85).addBox(-0.5F, -3.9857F, -1.9115F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 64).addBox(-2.0F, -1.4696F, -1.3933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9414F, -0.3063F, 2.2777F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition cube_r36 = leftLeg5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(75, 53).addBox(0.0F, 0.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(78, 53).addBox(-1.0F, 0.1F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(95, 53).addBox(1.2F, 0.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(77, 21).addBox(1.2F, 0.1F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -1.0295F, 1.1145F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(74, 15).addBox(0.0F, -1.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 47).addBox(-1.0F, -1.8F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(95, 38).addBox(1.2F, -1.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 58).addBox(1.2F, -1.8F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1F, -0.4F, -0.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 3.6F, -0.4F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -5.4F, -1.4F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 62).addBox(-1.0F, -2.0F, -1.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(31, 87).addBox(-1.0F, -0.7F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.8163F, -1.2656F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 63).addBox(-1.5F, -15.5937F, -5.8715F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 22.249F, 5.9194F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(33, 80).addBox(-1.0F, -0.0858F, -0.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1652F, -1.6822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3652F, 0.7178F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(39, 56).addBox(-1.5F, -0.8F, -1.9F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 32).addBox(-0.1F, -7.9918F, -1.048F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9F, 9.6475F, -0.1467F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 28).addBox(-0.6F, -4.735F, -0.1686F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(67, 71).addBox(-0.1F, -11.735F, 0.4314F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 13.2475F, -1.9467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.5443F, -1.1179F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.6475F, -0.4467F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(40, 85).addBox(-0.5F, -3.9857F, -1.9115F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.4414F, 0.7937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(63, 53).addBox(-2.0F, -1.4696F, -1.3933F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9414F, -0.3063F, 2.8013F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0696F, -2.9933F));

		PartDefinition cube_r46 = rightLeg5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 14).addBox(-1.0F, 0.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(78, 38).addBox(-1.0F, 0.1F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(61, 61).addBox(-2.2F, 0.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(77, 15).addBox(-3.2F, 0.1F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.0295F, 1.1145F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, -1.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(86, 36).addBox(-1.0F, -1.8F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 27).addBox(-2.2F, -1.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(34, 56).addBox(-3.2F, -1.8F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -0.4F, -0.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, -5.0F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(3, 96).addBox(0.0F, -1.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5064F, 1.141F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(6, 96).addBox(0.0F, -0.4F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 56).addBox(0.0F, -0.6F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 97).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.731F, -4.5389F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 81).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9315F, -6.8301F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(31, 95).addBox(0.0F, -2.0F, -0.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2434F, -8.2974F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 95).addBox(0.0F, -3.2057F, 0.0627F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -11.2F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 26).mirror().addBox(-4.0F, -0.0193F, 9.5405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 64).mirror().addBox(-4.0F, -0.0193F, 7.5405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 50).mirror().addBox(-3.0F, -0.0193F, 5.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-3.0F, -0.0193F, 3.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 5).mirror().addBox(-2.4F, -0.0193F, 1.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 63).mirror().addBox(-2.0F, -0.0193F, -0.4595F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8F, -10.9F, -0.2005F, -0.0608F, -0.2906F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, -0.0193F, 3.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 26).addBox(0.0F, -0.0193F, 9.5405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 64).addBox(0.0F, -0.0193F, 7.5405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 50).addBox(0.0F, -0.0193F, 5.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 5).addBox(-0.6F, -0.0193F, 1.5405F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 63).addBox(0.0F, -0.0193F, -0.4595F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8F, -10.9F, -0.2005F, 0.0608F, 0.2906F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1512F, -0.2526F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -11.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(80, 95).addBox(0.0F, -2.8F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7307F, -12.4437F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 93).addBox(0.0F, -2.7F, -0.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4715F, -14.4189F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 91).addBox(0.0F, -8.9248F, 4.3356F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 32).addBox(0.0F, -8.9248F, 2.0356F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3899F, -22.9238F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -13.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0794F, -14.6644F, -0.3595F, 0.3681F, -0.6996F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0794F, -14.6644F, -0.4391F, 0.2657F, -0.9534F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-14.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0794F, -14.6644F, -0.5027F, 0.0815F, -1.3162F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 17).mirror().addBox(-15.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4794F, -12.7644F, -0.4939F, 0.1153F, -1.3153F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4794F, -12.7644F, -0.418F, 0.2941F, -0.9476F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.4794F, -12.7644F, -0.3307F, 0.3904F, -0.689F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(15, 35).mirror().addBox(-15.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8794F, -10.7644F, -0.4668F, 0.2166F, -1.3108F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8794F, -10.7644F, -0.3523F, 0.3785F, -0.9259F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 92).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8794F, -10.7644F, -0.2407F, 0.4555F, -0.652F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-15.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -8.4644F, -0.4622F, 0.2334F, -1.3098F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(93, 47).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -8.4644F, -0.3409F, 0.3924F, -0.9216F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(93, 36).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.8794F, -8.4644F, -0.2252F, 0.4661F, -0.6451F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(47, 33).mirror().addBox(-15.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -6.4644F, -0.4481F, 0.284F, -1.3062F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 86).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -6.4644F, -0.3061F, 0.4339F, -0.9076F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6794F, -6.4644F, -0.1776F, 0.4971F, -0.623F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 25).mirror().addBox(-14.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -4.4644F, -0.4434F, 0.3008F, -1.3397F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(86, 93).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -4.4644F, -0.2941F, 0.4477F, -0.9374F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(77, 93).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -4.4644F, -0.1613F, 0.5072F, -0.6501F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-12.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.4644F, -0.4336F, 0.3345F, -1.3891F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 51).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.4644F, -0.2698F, 0.4749F, -0.979F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -2.4644F, -0.1284F, 0.5271F, -0.6862F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -0.4644F, -0.4336F, 0.3345F, -1.4938F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -0.4644F, -0.2698F, 0.4749F, -1.0837F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1794F, -0.4644F, -0.1284F, 0.5271F, -0.7909F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 56).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -0.4644F, -0.1284F, -0.5271F, 0.7909F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 51).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -0.4644F, -0.2698F, -0.4749F, 1.0837F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(11, 43).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -0.4644F, -0.4336F, -0.3345F, 1.4938F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.4644F, -0.1284F, -0.5271F, 0.6862F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 51).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.4644F, -0.2698F, -0.4749F, 0.979F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(63, 22).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1794F, -2.4644F, -0.4336F, -0.3345F, 1.3891F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(86, 93).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -4.4644F, -0.2941F, -0.4477F, 0.9374F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 93).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -4.4644F, -0.1613F, -0.5072F, 0.6501F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 25).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -4.4644F, -0.4434F, -0.3008F, 1.3397F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(47, 35).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0794F, -14.6644F, -0.5027F, -0.0815F, 1.3162F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(92, 12).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0794F, -14.6644F, -0.4391F, -0.2657F, 0.9534F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 6).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0794F, -14.6644F, -0.3595F, -0.3681F, 0.6996F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(15, 17).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4794F, -12.7644F, -0.4939F, -0.1153F, 1.3153F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(45, 92).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4794F, -12.7644F, -0.418F, -0.2941F, 0.9476F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(36, 92).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.4794F, -12.7644F, -0.3307F, -0.3904F, 0.689F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 35).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8794F, -10.7644F, -0.4668F, -0.2166F, 1.3108F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 80).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8794F, -10.7644F, -0.3523F, -0.3785F, 0.9259F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 92).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8794F, -10.7644F, -0.2407F, -0.4555F, 0.652F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(44, 45).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -8.4644F, -0.4622F, -0.2334F, 1.3098F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(93, 47).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -8.4644F, -0.3409F, -0.3924F, 0.9216F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(93, 36).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8794F, -8.4644F, -0.2252F, -0.4661F, 0.6451F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(47, 33).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -6.4644F, -0.4481F, -0.284F, 1.3062F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(93, 86).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -6.4644F, -0.3061F, -0.4339F, 0.9076F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 94).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6794F, -6.4644F, -0.1776F, -0.4971F, 0.623F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(33, 28).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 94).addBox(0.0F, -4.4673F, -0.8726F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -12.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(48, 94).addBox(-0.01F, -4.4673F, -0.8726F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -12.9F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 95).addBox(0.01F, -4.0969F, -0.0814F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -14.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(42, 94).addBox(-0.01F, -4.8573F, -0.6934F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7899F, -11.1238F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(83, 95).addBox(-0.01F, -4.023F, -0.0061F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5899F, -10.5238F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(30, 19).addBox(0.0F, -2.097F, -0.984F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6899F, -7.9238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(28, 81).addBox(0.0F, -8.9248F, 0.1356F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6101F, -9.9238F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(86, 95).addBox(0.0F, -4.0727F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2101F, -11.9238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 75).addBox(0.0F, -9.5F, -0.3F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4101F, -12.9238F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(97, 23).addBox(-0.01F, -2.9572F, -0.56F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -14.7F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -0.1638F, -8.0438F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -15.3F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(9, 17).addBox(0.0F, -9.8067F, 0.0216F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.5F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(38, 14).addBox(-0.01F, -7.0358F, -1.0676F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9688F, -2.3479F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 94).addBox(-0.01F, 0.0076F, -0.9697F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4423F, 0.2947F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(9, 93).addBox(0.01F, -2.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.4423F, -0.1053F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 96).addBox(-0.01F, -3.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5187F, -0.5052F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 70).addBox(0.0F, -11.2777F, -0.2492F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7774F, -1.2979F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(14, 77).addBox(0.0F, -6.4F, -0.4F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5688F, -3.0479F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 80).addBox(-0.01F, -9.8067F, -0.5784F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.5F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(68, 81).addBox(0.0F, -9.6412F, 1.8323F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -8.2F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-11.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -4.9644F, -0.4894F, 0.1322F, -1.5591F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -4.9644F, -0.4073F, 0.3083F, -1.1888F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(88, 17).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6794F, -4.9644F, -0.316F, 0.4015F, -0.9277F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -2.9644F, -0.3738F, 0.3568F, -0.7571F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(90, 74).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -2.9644F, -0.4495F, 0.2515F, -1.0085F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-12.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1794F, -2.9644F, -0.5071F, 0.0646F, -1.3689F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -0.9644F, -0.4702F, 0.2229F, -0.961F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-13.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -0.9644F, -0.5159F, 0.0308F, -1.3169F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -0.9644F, -0.4019F, 0.3341F, -0.7142F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(90, 64).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -4.9644F, -0.4073F, -0.3083F, 1.1888F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(88, 17).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -4.9644F, -0.316F, -0.4015F, 0.9277F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(18, 48).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6794F, -4.9644F, -0.4894F, -0.1322F, 1.5591F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(91, 45).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -2.9644F, -0.3738F, -0.3568F, 0.7571F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(90, 74).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -2.9644F, -0.4495F, -0.2515F, 1.0085F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 37).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1794F, -2.9644F, -0.5071F, -0.0646F, 1.3689F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 20).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -0.9644F, -0.5159F, -0.0308F, 1.3169F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(85, 91).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -0.9644F, -0.4702F, -0.2229F, 0.961F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(92, 4).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -0.9644F, -0.4019F, -0.3341F, 0.7142F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(63, 88).addBox(0.0F, -6.1412F, -0.1677F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -8.2F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, -2.5618F, -0.7552F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -9.4F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, -0.1967F, -5.0364F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.9803F, -5.3538F, 1.2802F, 0.4456F, -0.0886F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 20).mirror().addBox(-5.0F, -1.0F, -6.5F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(15, 20).addBox(4.0F, -1.0F, -6.5F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.5616F, -4.7694F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(34, 41).mirror().addBox(-5.0F, -0.1553F, -0.2213F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 41).addBox(4.0F, -0.1553F, -0.2213F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8616F, -5.8694F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-5.0F, -2.1023F, -1.3921F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 17).addBox(4.0F, -2.1023F, -1.3921F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0616F, -4.7694F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-5.0F, -1.922F, -0.1426F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(45, 47).addBox(4.0F, -1.922F, -0.1426F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.7616F, -3.2694F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -0.1967F, -5.0364F, 2.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 1.9803F, -5.3538F, 1.2802F, -0.4456F, 0.0886F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -1.908F, -0.16F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2F, -9.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 8.4651F, -6.6441F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(88, 82).addBox(-1.5F, -0.0117F, -0.8194F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4209F, 4.8038F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(69, 27).addBox(-1.5F, -1.2F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0119F, -1.1425F, 0.6416F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r157 = leftarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 74).addBox(-1.0F, -7.5475F, -0.5419F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.3209F, 3.9038F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r158 = leftarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 75).addBox(-1.0F, -4.9389F, -0.1208F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.5149F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.5499F, 4.0325F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftarm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(24, 94).addBox(-0.964F, -1.0149F, -0.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.364F, 0.9298F, 0.4549F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r160 = leftarm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(7, 77).addBox(-0.864F, -0.3149F, -0.7424F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.364F, 1.2298F, 0.3549F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r161 = leftarm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(11, 45).addBox(-1.0256F, -0.0186F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -2.0702F, -0.1451F, 1.5708F, 0.4538F, -1.5708F));

		PartDefinition cube_r162 = leftarm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 94).addBox(-2.0256F, -0.0385F, -0.4596F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -3.8702F, 0.7549F, 1.5708F, -0.4538F, -1.5708F));

		PartDefinition cube_r163 = leftarm2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 95).addBox(-1.0256F, -1.9952F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -2.3702F, 2.3549F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition cube_r164 = leftarm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(42, 70).addBox(-1.0256F, -2.4299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.0702F, 1.5549F, -1.5708F, -1.2566F, 1.5708F));

		PartDefinition cube_r165 = leftarm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 70).addBox(1.0786F, -3.0344F, -0.4596F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.364F, 0.8298F, -0.5451F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.4F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(89, 55).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftArm4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(91, 0).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(12, 91).addBox(0.9F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 3.8173F, -0.7435F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftArm4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(90, 76).addBox(0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 28).addBox(1.6F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 3.5F, -0.5F, 0.9163F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4F, 8.4651F, -6.6441F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(54, 88).addBox(-1.5F, -0.0117F, -0.8194F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4209F, 4.8038F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(47, 68).addBox(-1.5F, -1.2F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0119F, -1.1425F, 0.6416F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(35, 70).addBox(-1.0F, -7.5475F, -0.5419F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.3209F, 3.9038F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r171 = rightarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(60, 71).addBox(-1.0F, -4.9389F, -0.1208F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.5149F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.5499F, 4.0325F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(94, 19).addBox(-0.036F, -1.0149F, -0.7424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.364F, 0.9298F, 0.4549F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r173 = rightarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 75).addBox(-0.136F, -0.3149F, -0.7424F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.364F, 1.2298F, 0.3549F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r174 = rightarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(9, 8).addBox(0.0256F, -0.0186F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -2.0702F, -0.1451F, 1.5708F, -0.4538F, 1.5708F));

		PartDefinition cube_r175 = rightarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(94, 14).addBox(0.0256F, -0.0385F, -0.4596F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -3.8702F, 0.7549F, 1.5708F, 0.4538F, 1.5708F));

		PartDefinition cube_r176 = rightarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(12, 95).addBox(0.0256F, -1.9952F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -2.3702F, 2.3549F, 1.5708F, 1.2217F, 1.5708F));

		PartDefinition cube_r177 = rightarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(36, 40).addBox(0.0256F, -2.4299F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.0702F, 1.5549F, -1.5708F, 1.2566F, -1.5708F));

		PartDefinition cube_r178 = rightarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 68).addBox(-2.0786F, -3.0344F, -0.4596F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.364F, 0.8298F, -0.5451F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(81, 82).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.4F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(89, 40).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightArm4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(11, 63).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 90).addBox(-1.9F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7F, 3.8173F, -0.7435F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightArm4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(88, 66).addBox(-1.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 70).addBox(-2.6F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 3.5F, -0.5F, 0.9163F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, -9.8F, 0.219F, -0.0852F, -0.0189F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 18).addBox(0.0F, -1.356F, -0.9396F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6529F, -1.5763F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -1.4F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -5.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r183 = neck.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(20, 81).addBox(0.0F, -4.1F, 1.8F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(85, 20).addBox(-2.0F, -2.1F, 0.8F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(24, 56).addBox(-1.0F, -1.1F, -0.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 40).addBox(-0.5F, -1.0F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(20, 40).mirror().addBox(-3.5F, -1.0F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-2.0F, -0.0394F, -4.0004F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 47).addBox(0.0F, -0.0394F, -7.0004F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(1.0F, -0.0394F, -4.0004F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(50, 61).mirror().addBox(-1.5F, 1.9606F, -4.0004F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(50, 61).addBox(0.5F, 1.9606F, -4.0004F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -6.2F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-3.0F, 0.0F, 0.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 18).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -5.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(65, 0).addBox(0.0F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-3.0F, 0.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(67, 59).addBox(0.0F, 0.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -5.0F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(93, 93).addBox(-0.5F, -0.0108F, -1.7881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3F, -7.9F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-0.1F, -1.0797F, 0.1719F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 4.9F, -6.2F, 1.4032F, 0.0756F, 0.9296F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 2).addBox(-2.9F, -1.0797F, 0.1719F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 4.9F, -6.2F, 1.4032F, -0.0756F, -0.9296F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-1.5F, -1.0122F, 0.0176F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(82, 30).addBox(0.5F, -1.0122F, 0.0176F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, 5.2742F, -2.3729F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(81, 74).addBox(-1.5F, -0.4159F, -0.2408F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F))
				.texOffs(15, 19).mirror().addBox(-1.9F, -4.0159F, -0.0408F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 19).addBox(-1.1F, -4.0159F, -0.0408F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.1742F, -2.7729F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-1.5F, -3.8265F, -0.1292F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(94, 90).addBox(-0.6F, -1.1265F, -4.4292F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 55).addBox(-0.1F, -0.9265F, -4.1292F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 78).addBox(-1.1F, -0.2265F, -0.1292F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(7, 70).addBox(-0.7F, -3.8265F, -0.1292F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 8.6742F, -3.9729F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(44, 11).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0F, 0.0F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -0.6248F, -3.7081F, 0.5127F, 0.0417F, -0.1027F));

		PartDefinition cube_r195 = leftHorn.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 51).addBox(0.0F, -0.2664F, -1.3584F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, -0.0561F, 0.1468F));

		PartDefinition cube_r196 = leftHorn.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(54, 47).addBox(-7.9733F, -0.7404F, -3.2253F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(26.6F, -8.8F, -0.5F, 0.2799F, 0.2398F, -0.6904F));

		PartDefinition cube_r197 = leftHorn.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(54, 50).addBox(0.2228F, -1.469F, -0.7167F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.6F, -1.8F, -0.5F, 0.2537F, 0.2674F, -0.7947F));

		PartDefinition cube_r198 = leftHorn.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(44, 40).addBox(0.0227F, -2.1646F, -0.3908F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.6F, 1.9F, 0.0F, 0.3254F, 0.1718F, -0.4691F));

		PartDefinition cube_r199 = leftHorn.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(47, 28).addBox(-0.169F, -2.0611F, -0.2474F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.8F, 2.3F, 0.0F, 0.3659F, 0.0219F, -0.057F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -0.6248F, -3.7081F, 0.5127F, -0.0417F, 0.1027F));

		PartDefinition cube_r200 = rightHorn.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 51).mirror().addBox(-7.0F, -0.2664F, -1.3584F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.3624F, 0.0561F, -0.1468F));

		PartDefinition cube_r201 = rightHorn.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(-1.0267F, -0.7404F, -3.2253F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-26.6F, -8.8F, -0.5F, 0.2799F, -0.2398F, 0.6904F));

		PartDefinition cube_r202 = rightHorn.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(54, 50).mirror().addBox(-9.2228F, -1.469F, -0.7167F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.6F, -1.8F, -0.5F, 0.2537F, -0.2674F, 0.7947F));

		PartDefinition cube_r203 = rightHorn.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(44, 40).mirror().addBox(-8.0227F, -2.1646F, -0.3908F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.6F, 1.9F, 0.0F, 0.3254F, -0.1718F, 0.4691F));

		PartDefinition cube_r204 = rightHorn.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(-7.831F, -2.0611F, -0.2474F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.8F, 2.3F, 0.0F, 0.3659F, -0.0219F, 0.057F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 8.8742F, -3.9729F));

		PartDefinition cube_r205 = leftMaxilla.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 89).addBox(0.5F, -1.9354F, -1.9615F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftMaxilla.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 7).addBox(0.5F, -0.911F, -1.9619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.7F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftMaxilla.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(71, 84).addBox(0.5F, -0.1082F, -0.0657F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 1.0F, -2.5F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftMaxilla.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(17, 94).addBox(-0.4F, -0.4988F, -1.5999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 1.3F, -2.2F, 1.1987F, 0.0971F, 0.2435F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(0.0F, 8.8742F, -3.9729F));

		PartDefinition cube_r209 = rightMaxilla.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(-1.5F, -1.9354F, -1.9615F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightMaxilla.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(56, 7).mirror().addBox(-1.5F, -0.911F, -1.9619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -0.7F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightMaxilla.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(71, 84).mirror().addBox(-1.5F, -0.1082F, -0.0657F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.0F, -2.5F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightMaxilla.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(17, 94).mirror().addBox(-0.6F, -0.4988F, -1.5999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -2.2F, 1.1987F, -0.0971F, -0.2435F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.4F, 3.3856F, -4.5235F));

		PartDefinition cube_r213 = leftOrbit.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(85, 7).addBox(-1.0F, -2.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.345F, -0.2203F, -0.7603F));

		PartDefinition cube_r214 = leftOrbit.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(70, 5).addBox(-2.3984F, -0.4968F, -0.3528F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.4F, 0.0F, 0.7703F, -0.4031F, -0.0081F));

		PartDefinition cube_r215 = leftOrbit.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(61, 64).addBox(-1.9984F, -2.0968F, -0.1528F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.4F, 0.0F, 1.1671F, -0.111F, -0.2941F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.4F, 3.3856F, -4.5235F));

		PartDefinition cube_r216 = rightOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(85, 7).mirror().addBox(-1.0F, -2.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.345F, 0.2203F, 0.7603F));

		PartDefinition cube_r217 = rightOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(0.3984F, -0.4968F, -0.3528F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.4F, 0.0F, 0.7703F, 0.4031F, 0.0081F));

		PartDefinition cube_r218 = rightOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(61, 64).mirror().addBox(-0.0016F, -2.0968F, -0.1528F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.4F, 0.0F, 1.1671F, 0.111F, 0.2941F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(35, 0).addBox(1.0F, -1.0F, -1.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(35, 0).mirror().addBox(-3.2F, -1.0F, -1.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5F, -2.0F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(61, 0).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.5545F, -11.1798F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(94, 8).addBox(-1.5F, 0.0172F, -0.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9F, -9.0F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.2F, 0.3694F, -2.1544F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 94).mirror().addBox(0.0F, -0.4306F, -1.6544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 5.8F, -5.2F, -1.5184F, -0.1222F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(0.0F, -0.0778F, -0.8971F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 5.8F, -5.2F, -1.7977F, -0.1222F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(-1.0F, -2.9879F, -0.6865F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 94).mirror().addBox(-1.2F, -2.9879F, -0.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(34, 97).addBox(1.8F, -2.9879F, -0.6865F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 94).addBox(1.0F, -2.9879F, -0.0865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 4.3F, -5.4F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-1.0F, -0.0177F, -0.9732F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(0, 52).addBox(1.2F, -0.0177F, -0.9732F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 5.1F, -1.2F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-1.0F, -3.0177F, -1.9732F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(7, 87).addBox(3.2F, -3.0177F, -1.9732F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.2F, 5.1F, -1.2F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 88).addBox(3.2F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 1.5F, -1.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, 0.3694F, -2.1544F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 94).addBox(-1.0F, -0.4306F, -1.6544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.8F, -5.2F, -1.5184F, 0.1222F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -0.0778F, -0.8971F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 5.8F, -5.2F, -1.7977F, 0.1222F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 19).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 6.4F, -1.441F, 0.017F, -0.1298F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(9, 55).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5043F, -0.2344F, 0.0923F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(54, 53).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.553F, 0.0734F, -0.0611F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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