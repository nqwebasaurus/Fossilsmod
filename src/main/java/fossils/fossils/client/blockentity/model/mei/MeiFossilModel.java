package fossils.fossils.client.blockentity.model.mei;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MeiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
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
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public MeiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
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
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.7933F, -4.6947F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 36).addBox(-0.5F, -0.3012F, 2.0471F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 32).addBox(-0.5F, -0.3012F, 0.0471F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 27).mirror().addBox(0.0F, 0.3F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 27).addBox(1.4F, 0.3F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.6537F, -0.2254F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-0.14F, -3.2769F, -1.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 18).addBox(2.86F, -3.2769F, -1.0137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(0.5F, -0.1152F, -1.023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.1514F, 0.318F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.1341F, -3.5735F, -0.7324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.76F, 2.1163F, -0.6929F, 0.2994F, 0.2079F, 0.0259F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(0.5F, 0.0247F, -0.9884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.4514F, -0.682F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 40).mirror().addBox(-0.14F, -3.222F, -0.9307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(17, 40).addBox(2.86F, -3.222F, -0.9307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.86F, 2.1163F, -0.1929F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 23).mirror().addBox(0.6988F, -1.7106F, -1.0051F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3415F, 1.4025F, -0.9162F, -0.3546F, -0.0971F, -0.2435F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-0.6909F, 0.8849F, -0.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, 1.0613F, -1.0514F, 1.1277F, 0.3959F, -0.3099F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-0.5794F, 1.2647F, -0.4102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(48, 28).mirror().addBox(-0.5794F, -0.1353F, -0.4102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, 1.0613F, -1.0514F, 0.7421F, 0.2765F, -0.3165F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-0.378F, 1.1913F, 0.2128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9602F, 1.0613F, -1.0514F, 0.4809F, 0.196F, -0.2936F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(0.4659F, -0.8412F, -1.0045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3415F, 0.5025F, -0.9162F, 0.0006F, -0.0045F, -0.2618F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.1149F, -0.6936F, -0.2648F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.36F, 0.9163F, -1.9929F, 0.0045F, -0.1236F, -0.1742F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 46).mirror().addBox(-0.1337F, 2.797F, -0.5916F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.36F, 0.9163F, -1.9929F, 0.1243F, -0.1042F, -0.1819F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 51).addBox(-0.8659F, -3.5735F, -0.7324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.76F, 2.1163F, -0.6929F, 0.2994F, -0.2079F, -0.0259F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(47, 57).addBox(-1.5F, 0.0247F, -0.9884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, -1.4514F, -0.682F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 51).addBox(-1.5F, -0.1152F, -1.023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, -1.1514F, 0.318F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(51, 23).addBox(-1.6988F, -1.7106F, -1.0051F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3415F, 1.4025F, -0.9162F, -0.3546F, 0.0971F, 0.2435F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 51).addBox(-1.4659F, -0.8412F, -1.0045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3415F, 0.5025F, -0.9162F, 0.0006F, 0.0045F, 0.2618F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 57).addBox(-0.622F, 1.1913F, 0.2128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9602F, 1.0613F, -1.0514F, 0.4809F, -0.196F, 0.2936F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 57).addBox(-0.3091F, 0.8849F, -0.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.9602F, 1.0613F, -1.0514F, 1.1277F, -0.3959F, 0.3099F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 54).addBox(-0.4206F, 1.2647F, -0.4102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(48, 28).addBox(-0.4206F, -0.1353F, -0.4102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9602F, 1.0613F, -1.0514F, 0.7421F, -0.2765F, 0.3165F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 43).addBox(-0.8851F, -0.6936F, -0.2648F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.36F, 0.9163F, -1.9929F, 0.0045F, 0.1236F, 0.1742F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 46).addBox(-0.8663F, 2.797F, -0.5916F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.36F, 0.9163F, -1.9929F, 0.1243F, 0.1042F, 0.1819F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(19, 44).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.5208F, -1.1168F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 27).addBox(-0.9F, -0.0054F, -0.022F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.4759F, 0.059F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(18, 30).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0718F, 0.5234F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 10).addBox(-1.6F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(5, 45).addBox(-0.5244F, -0.5637F, -1.4269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4449F, -0.2224F, -0.0217F, -1.5895F, 0.2466F, 0.0F));

		PartDefinition cube_r28 = leftSickleClaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 48).addBox(0.0F, -1.5F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0244F, -0.0637F, -2.4269F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(34, 14).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(32, 34).addBox(-2.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.5208F, -1.1168F, -0.7999F, 0.2894F, 0.3304F));

		PartDefinition cube_r29 = rightLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.1F, -0.0054F, -0.022F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4759F, 0.059F, 2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0718F, 0.5234F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 10).mirror().addBox(-0.4F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.6581F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(5, 45).mirror().addBox(-0.4756F, -0.5637F, -1.4269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -0.2224F, -0.0217F, -0.2805F, -0.2466F, 0.0F));

		PartDefinition cube_r31 = rightSickleClaw.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(12, 48).mirror().addBox(0.0F, -1.5F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0244F, -0.0637F, -2.4269F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(32, 34).mirror().addBox(0.1F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.287F, 0.3359F, 0.097F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 32).addBox(-0.5F, -0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -1.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.252F, 0.177F, -0.6596F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(29, 49).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -1.4269F, 0.14F, 0.2951F, -1.1294F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(24, 40).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, -0.0739F, 0.3276F, -1.5346F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.1116F, 0.3171F, -0.9634F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1745F, -3.4269F, 0.2376F, 0.2089F, -0.4878F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.252F, -0.177F, 0.6596F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 49).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -1.4269F, 0.14F, -0.2951F, 1.1294F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(24, 40).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, -0.0739F, -0.3276F, 1.5346F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(48, 21).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.1116F, -0.3171F, 0.9634F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(34, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1745F, -3.4269F, 0.2376F, -0.2089F, 0.4878F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -1.9874F, -0.1396F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8F, -3.3F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 20).addBox(-2.5F, -1.0493F, 0.0283F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0434F, -5.3099F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, -0.4016F, -0.0017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, 0.0044F, -5.9051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -3.8F, 0.1179F, 0.3482F, 0.0254F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(3, 59).addBox(-0.5F, -0.1964F, -2.2441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 0).addBox(-1.0F, 0.0036F, -2.2441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.809F, -0.0167F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(58, 51).addBox(-0.5F, -0.476F, -0.1108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 30).mirror().addBox(-4.5974F, 0.078F, -0.627F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1605F, 3.4942F, -3.0194F, 0.0497F, 0.977F, 0.006F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, 0.5903F, 0.3276F, -0.4849F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, 0.3906F, 0.5756F, -0.933F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9255F, -5.3269F, -0.0085F, 0.6829F, -1.594F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.4124F, 0.3003F, -0.4239F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, 0.2294F, 0.4757F, -0.8979F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5255F, -3.5269F, -0.0722F, 0.5198F, -1.514F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.014F, 0.4232F, -1.4361F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.2394F, 0.3527F, -0.8552F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1255F, -1.5269F, 0.3639F, 0.1863F, -0.3969F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(37, 38).mirror().addBox(-1.3903F, -0.2435F, -0.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 0.4261F, -3.2865F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(23, 30).mirror().addBox(-1.3903F, -0.5902F, -0.3758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 2.1261F, -5.0865F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 38).mirror().addBox(-1.3903F, 0.0949F, -0.4381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 2.1261F, -5.0865F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-0.3597F, 0.2578F, -1.1102F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.1124F, 2.0262F, -4.9776F, 0.2037F, -0.5403F, -1.0033F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-0.8586F, -0.0121F, -0.8356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2366F, 3.4371F, -3.2418F, -0.1525F, 0.0563F, -0.003F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(39, 22).mirror().addBox(-2.9364F, 0.0721F, -0.8342F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0395F, 3.3942F, -3.0194F, -0.059F, 0.6473F, -0.2488F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(58, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, 0.5903F, -0.3276F, 0.4849F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 10).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, 0.3906F, -0.5756F, 0.933F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(58, 28).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9255F, -5.3269F, -0.0085F, -0.6829F, 1.594F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(58, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.4124F, -0.3003F, 0.4239F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, 0.2294F, -0.4757F, 0.8979F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(50, 6).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5255F, -3.5269F, -0.0722F, -0.5198F, 1.514F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 4).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.014F, -0.4232F, 1.4361F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 49).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.2394F, -0.3527F, 0.8552F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1255F, -1.5269F, 0.3639F, -0.1863F, 0.3969F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 38).addBox(0.3903F, -0.2435F, -0.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 0.4261F, -3.2865F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 30).addBox(0.3903F, -0.5902F, -0.3758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 2.1261F, -5.0865F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(30, 38).addBox(0.3903F, 0.0949F, -0.4381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 2.1261F, -5.0865F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(37, 24).addBox(-0.6403F, 0.2578F, -1.1102F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.1124F, 2.0262F, -4.9776F, 0.2037F, 0.5403F, 1.0033F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 32).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0119F, 3.3637F, -3.8186F, 1.1673F, 0.0037F, 0.0F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 49).addBox(-1.1414F, -0.0121F, -0.8356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2366F, 3.4371F, -3.2418F, -0.1525F, -0.0563F, 0.003F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(5, 30).addBox(-0.4026F, 0.078F, -0.627F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1605F, 3.4942F, -3.0194F, 0.0497F, -0.977F, -0.006F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(39, 22).addBox(-0.0636F, 0.0721F, -0.8342F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0395F, 3.3942F, -3.0194F, -0.059F, -0.6473F, 0.2488F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(26, 24).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2474F, 2.9395F, -4.4157F, 1.0391F, 0.599F, -0.9739F));

		PartDefinition cube_r84 = leftArm1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(17, 49).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftArm1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 12).addBox(0.0F, -2.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftArm1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 41).addBox(0.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0818F, 2.9995F, -0.1146F, -1.5282F, 0.0442F, -0.0236F));

		PartDefinition cube_r87 = leftArm2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(48, 0).addBox(-1.75F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 45).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(5, 49).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -1.2991F, -0.4131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(51, 16).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(46, 16).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2601F, 2.5927F, -0.0848F, 0.7704F, -0.212F, 0.2292F));

		PartDefinition cube_r91 = leftHand.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(12, 36).addBox(-1.0F, -0.15F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.3568F, -0.2795F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2474F, 2.9395F, -4.4157F, 0.639F, -0.3327F, 1.5203F));

		PartDefinition cube_r92 = rightArm1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(17, 49).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-1.0F, -2.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 5.0353F, 0.1525F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(-1.0F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5059F, -0.7647F, -0.6475F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0818F, 2.9995F, -0.1146F, -1.3967F, -0.0387F, 0.0202F));

		PartDefinition cube_r95 = rightArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(0.75F, -1.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.85F, 0.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5F, -1.2991F, -0.4131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(46, 16).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2601F, 2.5927F, -0.0848F, 0.7704F, 0.212F, -0.2292F));

		PartDefinition cube_r99 = rightHand.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 36).mirror().addBox(0.0F, -0.15F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3568F, -0.2795F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -5.8F, 0.2239F, 0.7848F, 0.0349F));

		PartDefinition cube_r100 = neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 36).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(6, 59).addBox(-0.5F, -1.1F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 41).addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0861F, -2.401F, -0.039F, 0.6041F, -0.0971F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(23, 6).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9F, -2.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.324F, -2.5807F, 0.5287F, 0.2129F, 0.0479F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 29).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5F, 2.8733F, -4.4553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.1F, -0.3696F, 0.0317F, -0.0365F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 30).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6914F, -0.3759F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 46).addBox(-1.0F, -0.0281F, -0.8728F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0933F, 0.017F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(27, 54).addBox(0.0F, 0.0242F, -1.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -0.8481F, -2.1506F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(55, 48).addBox(0.0F, 0.1119F, -0.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0481F, -1.4506F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 30).addBox(0.0F, -0.0571F, -0.0363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7481F, -2.1506F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 20).mirror().addBox(-0.6853F, -0.7039F, -1.5333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7167F, 0.3015F, -2.4158F, 1.2398F, -0.0979F, -0.2739F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(5, 32).mirror().addBox(-0.7436F, -0.6442F, -0.5006F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7167F, 0.3015F, -2.4158F, 0.8181F, 0.0821F, 0.2822F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(0.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 51).addBox(0.24F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.62F, 3.1479F, -3.8187F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-0.6F, -0.6527F, -0.8667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false)
				.texOffs(58, 0).mirror().addBox(-0.56F, -0.5527F, -0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(-0.36F, 2.3452F, -2.5832F, 1.0625F, -0.2525F, -0.1206F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-0.503F, -0.7577F, -0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 1.3403F, 0.1813F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(-0.5F, -0.6191F, -2.3609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.72F, -1.6597F, -0.3187F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(24, 42).mirror().addBox(-0.5F, -0.3279F, -0.4135F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.72F, 1.3403F, -0.3187F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 23).mirror().addBox(-0.41F, -0.648F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.7684F, -1.7422F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.41F, -0.6634F, -0.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.7684F, -1.7422F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(37, 54).mirror().addBox(-0.41F, -0.4089F, 0.1658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.7684F, -1.7422F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(42, 56).mirror().addBox(-0.41F, 0.2407F, -0.6816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-0.41F, -0.8593F, -0.8816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(50, 12).mirror().addBox(-0.41F, -0.8593F, -0.6816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.7684F, -1.7422F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-0.38F, -0.1255F, -0.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 1.1684F, -2.0422F, -0.2141F, -0.099F, -0.0761F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-0.41F, -0.0839F, -0.7897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 1.1684F, -2.0422F, -0.6674F, -0.1255F, -0.1847F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(-0.38F, -0.4868F, -0.9838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 1.1684F, -2.0422F, -0.344F, -0.0787F, -0.1617F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 32).addBox(-1.2564F, -0.6442F, -0.5006F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7167F, 0.3015F, -2.4158F, 0.8181F, -0.0821F, -0.2822F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 20).addBox(-1.3147F, -0.7039F, -1.5333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7167F, 0.3015F, -2.4158F, 1.2398F, 0.0979F, 0.2739F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 41).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4013F, 1.1852F, -2.0389F, -0.0698F, 0.1222F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(32, 54).addBox(-1.0F, 1.1869F, 0.3105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.4067F, -4.383F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(55, 45).addBox(-1.0F, -0.0433F, -2.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(53, 27).addBox(-1.0F, -0.0433F, -1.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0067F, -2.783F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(55, 42).addBox(-0.5F, -0.7756F, -0.8637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 20).addBox(-0.5F, -0.7756F, -0.5637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 3.4067F, -3.683F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 56).addBox(-0.2F, -0.5756F, -0.2637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 3.4067F, -3.683F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(12, 44).addBox(-0.2F, -0.1877F, -0.2637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3F, 2.5067F, -3.783F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(55, 39).addBox(-0.2F, -0.2923F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 3.0067F, -3.983F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(20, 55).addBox(-0.2F, -0.8149F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.3F, 3.2067F, -3.083F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.44F, -0.1959F, -0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 56).mirror().addBox(-0.44F, -0.1959F, -1.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(31, 42).mirror().addBox(-0.44F, -0.3959F, -1.0985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.36F, 2.3452F, -2.5832F, 0.6262F, -0.2525F, -0.1206F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(15, 56).addBox(-0.56F, -0.1959F, -0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 56).addBox(-0.56F, -0.1959F, -1.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(31, 42).addBox(-0.56F, -0.3959F, -1.0985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.36F, 2.3452F, -2.5832F, 0.6262F, 0.2525F, 0.1206F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(0.0F, -0.9653F, -0.9572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2067F, -1.483F, 0.4967F, -0.3127F, -0.1577F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 53).addBox(-1.0F, -0.9653F, -0.9572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 2.2067F, -1.483F, 0.4967F, 0.3127F, 0.1577F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(52, 54).addBox(-0.497F, -0.7577F, -0.277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.72F, 1.3403F, 0.1813F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(10, 53).addBox(-0.5F, -0.6191F, -2.3609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.72F, -1.6597F, -0.3187F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.3279F, -0.4135F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.72F, 1.3403F, -0.3187F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.28F, -0.3316F, -0.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(5, 53).mirror().addBox(-0.54F, -0.3316F, -0.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 53).addBox(1.0F, -0.3316F, -0.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 0).addBox(0.74F, -0.3316F, -0.8241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.73F, 0.7684F, -1.7422F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(56, 15).addBox(-0.62F, -0.1255F, -0.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.73F, 1.1684F, -2.0422F, -0.2141F, 0.099F, 0.0761F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(47, 54).addBox(-0.59F, -0.0839F, -0.7897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.73F, 1.1684F, -2.0422F, -0.6674F, 0.1255F, 0.1847F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(37, 54).addBox(-0.59F, -0.4089F, 0.1658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.73F, 0.7684F, -1.7422F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 36).addBox(-0.59F, -0.6634F, -0.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.73F, 0.7684F, -1.7422F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 23).addBox(-0.59F, -0.648F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.73F, 0.7684F, -1.7422F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(42, 56).addBox(-0.59F, 0.2407F, -0.6816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F))
				.texOffs(50, 12).addBox(-0.59F, -0.8593F, -0.6816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 53).addBox(-0.59F, -0.8593F, -0.8816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.73F, 0.7684F, -1.7422F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(20, 58).addBox(-0.4F, -0.6527F, -0.8667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F))
				.texOffs(58, 0).addBox(-0.44F, -0.5527F, -0.3667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(0.36F, 2.3452F, -2.5832F, 1.0625F, 0.2525F, 0.1206F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(37, 51).addBox(-0.62F, -0.4868F, -0.9838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(0.73F, 1.1684F, -2.0422F, -0.344F, 0.0787F, 0.1617F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 46).addBox(-1.0F, -0.9098F, -0.0135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.7067F, 0.017F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(43, 46).addBox(-1.0F, -0.0088F, -1.0101F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.6933F, -1.883F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 35).addBox(-1.0F, -3.0047F, 0.0573F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.0067F, -0.583F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(41, 33).addBox(-1.0F, -2.0047F, -0.9427F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0067F, -0.583F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.2234F, 0.8653F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 57).addBox(-0.1F, -0.7874F, -0.2978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(30, 57).addBox(-0.1F, -0.8874F, -0.7978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(25, 57).addBox(-0.1F, -0.7874F, -1.2978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(57, 6).addBox(-0.1F, -0.6874F, -1.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 3).addBox(-0.1F, -0.6874F, -1.0978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 51).addBox(-0.1F, -0.6874F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.214F, -4.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-0.3F, -0.9186F, -0.7531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(53, 33).mirror().addBox(-0.3F, -0.9186F, -0.5531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.014F, -2.4038F, 0.3911F, -0.2559F, -0.0557F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-1.0F, -0.6497F, -1.7336F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.714F, -1.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.114F, -0.0038F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-0.1734F, -0.7506F, -1.6874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.014F, -2.9038F, 0.2335F, -0.2569F, -0.0511F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-0.3F, -0.7633F, -1.617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.014F, -2.4038F, 0.1817F, -0.2559F, -0.0557F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(43, 4).mirror().addBox(-1.0F, -0.3212F, -1.6628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.114F, -1.2038F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(42, 53).mirror().addBox(-0.44F, 1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 53).addBox(1.18F, 1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.97F, 1.076F, -3.0073F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(38, 42).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 42).addBox(0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.114F, -0.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(43, 8).addBox(-0.7F, -0.7633F, -1.617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.7F, 1.014F, -2.4038F, 0.1817F, 0.2559F, 0.0557F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 37).addBox(0.0F, -0.6497F, -1.7336F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.714F, -1.0038F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 4).addBox(0.0F, -0.3212F, -1.6628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2F, 0.114F, -1.2038F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(43, 12).addBox(-0.8266F, -0.7506F, -1.6874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 1.014F, -2.9038F, 0.2335F, 0.2569F, 0.0511F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(57, 9).addBox(-0.7F, -0.9186F, -0.7531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(53, 33).addBox(-0.7F, -0.9186F, -0.5531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7F, 1.014F, -2.4038F, 0.3911F, 0.2559F, 0.0557F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(44, 24).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2F, 0.114F, -0.0038F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 59).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 2.7F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(15, 59).addBox(0.0F, -1.1719F, -0.3732F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9809F, 2.9397F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(12, 59).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, -0.1833F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.5585F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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