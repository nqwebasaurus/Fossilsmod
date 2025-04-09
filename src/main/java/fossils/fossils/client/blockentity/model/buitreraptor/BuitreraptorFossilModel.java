package fossils.fossils.client.blockentity.model.buitreraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BuitreraptorFossilModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public BuitreraptorFossilModel(ModelPart root) {
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.8503F, 0.2869F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -0.6012F, 0.0471F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-0.5928F, 1.6646F, -1.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 59).mirror().addBox(-0.5928F, 1.6646F, -1.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, 3.4259F, -1.0269F, 1.1972F, -0.0381F, -0.1276F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-0.5928F, 2.122F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(55, 4).mirror().addBox(-0.5928F, 2.122F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, 3.4259F, -1.0269F, 0.4991F, -0.0381F, -0.1276F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 42).mirror().addBox(-0.5928F, 1.536F, -0.8977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, 3.4259F, -1.0269F, 0.5253F, -0.0381F, -0.1276F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 50).mirror().addBox(-0.5333F, -0.3849F, -0.6655F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2713F, 3.4259F, -1.0269F, 0.4293F, -0.0381F, -0.1276F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(-0.0825F, -0.7999F, -0.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 50).mirror().addBox(-0.0825F, -0.1998F, -0.2672F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.1349F, -1.858F, 0.1559F, -0.0791F, -0.2943F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 33).addBox(1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 26).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 34).mirror().addBox(-0.2016F, 0.0641F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 61).mirror().addBox(-0.2016F, -0.5359F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.0952F, 1.6885F, 0.2605F, 1.1087F, 0.0272F, -0.3033F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 9).mirror().addBox(-0.3F, -0.6423F, -0.0462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 59).mirror().addBox(-0.3F, -0.6423F, -1.0462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.6349F, -0.958F, 0.0349F, 0.0F, -0.2618F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 42).mirror().addBox(-0.5F, -0.0682F, -2.0816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4378F, -1.2095F, -0.7369F, -0.0349F, 0.2094F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.5F, -0.9454F, -2.1056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.6F, -1.5F, 0.1745F, 0.2094F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 29).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(42, 29).addBox(2.3F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, -0.3378F, -0.284F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-3.0F, -0.1083F, -0.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 60).addBox(-0.2F, -0.1083F, -0.3022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -1.2F, -0.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-3.0F, -0.5429F, 0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 10).addBox(-0.2F, -0.5429F, 0.4585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.2F, -0.6F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-0.5F, -0.2092F, -0.6217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.6F, -1.5F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.2016F, -0.5291F, -0.1069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8349F, -1.058F, 0.6026F, 0.0272F, -0.3033F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.0412F, 0.4536F, -1.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8349F, -1.058F, 1.4269F, -0.0338F, -0.2597F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(37, 42).addBox(-0.5F, -0.0682F, -2.0816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4378F, -1.2095F, -0.7369F, -0.0349F, -0.2094F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 22).addBox(-0.5F, -0.9454F, -2.1056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.6F, -1.5F, 0.1745F, -0.2094F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 29).addBox(-0.5F, -0.2092F, -0.6217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6F, -0.6F, -1.5F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 9).addBox(-0.7F, -0.6423F, -0.0462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 59).addBox(-0.7F, -0.6423F, -1.0462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.6349F, -0.958F, 0.0349F, 0.0F, 0.2618F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 34).addBox(-0.7984F, 0.0641F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 61).addBox(-0.7984F, -0.5359F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.0952F, 1.6885F, 0.2605F, 1.1087F, -0.0272F, 0.3033F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(51, 52).addBox(-0.7984F, -0.5291F, -0.1069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.8349F, -1.058F, 0.6026F, -0.0272F, 0.3033F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 61).addBox(-0.9588F, 0.4536F, -1.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.8349F, -1.058F, 1.4269F, 0.0338F, 0.2597F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 50).addBox(-0.9175F, -0.7999F, -0.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 50).addBox(-0.9175F, -0.1998F, -0.2672F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 1.1349F, -1.858F, 0.1559F, 0.0791F, 0.2943F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 50).addBox(-0.4667F, -0.3849F, -0.6655F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2713F, 3.4259F, -1.0269F, 0.4293F, 0.0381F, 0.1276F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 42).addBox(-0.4072F, 1.536F, -0.8977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2713F, 3.4259F, -1.0269F, 0.5253F, 0.0381F, 0.1276F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 59).addBox(-0.4072F, 2.122F, -0.8334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(55, 4).addBox(-0.4072F, 2.122F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2713F, 3.4259F, -1.0269F, 0.4991F, 0.0381F, 0.1276F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 59).addBox(-0.4072F, 1.6646F, -1.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 28).addBox(-0.4072F, 1.6646F, -1.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2713F, 3.4259F, -1.0269F, 1.1972F, 0.0381F, 0.1276F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(50, 4).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, 0.6662F, -0.8587F, -0.9145F, 0.0692F, 0.0532F));

		PartDefinition cube_r30 = leftLeg1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(61, 31).addBox(-0.5F, 0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 61).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 14).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(55, 7).addBox(-0.9F, -0.0054F, -0.122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(25, 37).addBox(-0.9F, 0.7946F, -0.122F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.6013F, 0.7637F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 0.1972F, 0.628F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.9786F, 0.111F, -1.3963F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.7934F, -0.3088F, 0.8708F, 0.0668F, -0.0562F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5477F, -0.1218F, -0.1513F, -0.6545F, 0.3054F, 0.0F));

		PartDefinition cube_r33 = leftSickleClaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 62).addBox(-0.0123F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6217F, -2.6422F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftSickleClaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(51, 32).addBox(0.0F, -2.2F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(37, 25).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.6662F, -0.8587F, -0.3873F, -0.0665F, -0.1615F));

		PartDefinition cube_r35 = rightLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(61, 31).mirror().addBox(-0.5F, 0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 61).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9148F, -0.1542F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(55, 7).mirror().addBox(-0.1F, -0.0054F, -0.122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(25, 37).mirror().addBox(-0.1F, 0.7946F, -0.122F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6013F, 0.7637F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(11, 37).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1972F, 0.628F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-1.0F, -0.4066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.9786F, 0.111F, -0.8286F, 0.0322F, 0.0295F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 3.7934F, -0.3088F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5477F, -0.1218F, -0.1513F, -0.6545F, -0.3054F, 0.0F));

		PartDefinition cube_r38 = rightSickleClaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(0.0123F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6217F, -2.6422F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightSickleClaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(0.0F, -2.2F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -3.3F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 62).addBox(-0.5F, -0.3952F, -0.0025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -1.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(7, 42).addBox(-0.5F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 20).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2745F, -1.4268F, 0.0664F, 0.0304F, -0.7837F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 50).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2745F, -1.4268F, 0.0398F, 0.0809F, -1.253F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 37).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -3.4268F, -0.0809F, 0.1357F, -1.6409F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -3.4268F, 0.0011F, 0.1579F, -1.0942F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -3.4268F, 0.0671F, 0.1164F, -0.6203F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2745F, -1.4268F, 0.0664F, -0.0304F, 0.7837F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 50).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2745F, -1.4268F, 0.0398F, -0.0809F, 1.253F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(61, 37).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -3.4268F, -0.0809F, -0.1357F, 1.6409F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 42).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -3.4268F, 0.0011F, -0.1579F, 1.0942F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -3.4268F, 0.0671F, -0.1164F, 0.6203F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -2.0021F, -0.1562F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.5573F, -2.2175F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 32).addBox(-2.0F, -1.9F, -0.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8168F, -4.199F, -0.3054F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(37, 38).addBox(1.4F, 0.2851F, -2.6148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 38).mirror().addBox(-2.4F, 0.2851F, -2.6148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -3.9F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 62).addBox(-0.5F, -0.1964F, -2.244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 6).addBox(-1.0F, 0.0036F, -2.244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(25, 62).addBox(-0.5F, -0.609F, -0.0167F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, -0.476F, -0.1108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.8F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-0.5F, -0.279F, -1.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 54).mirror().addBox(-0.5F, -0.279F, -0.7742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 25).addBox(3.3F, -0.279F, -1.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(0, 54).addBox(3.3F, -0.279F, -0.7742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 1.5851F, -4.9148F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 47).mirror().addBox(-0.4F, -0.5F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 2.5569F, -5.0193F, 0.8084F, 0.3116F, 0.3106F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 53).addBox(3.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 2.5569F, -5.0193F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-0.5F, -0.1608F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(39, 53).mirror().addBox(-0.5F, -0.1608F, -0.7726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 53).addBox(3.3F, -0.1608F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(39, 53).addBox(3.3F, -0.1608F, -0.7726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 0.7851F, -4.0148F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 42).addBox(3.3F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.9F, 0.4851F, -2.4148F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1255F, -5.2268F, 0.6991F, 0.4103F, -0.6638F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1255F, -5.2268F, 0.4598F, 0.694F, -1.11F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -3.4268F, 0.3301F, 0.2635F, -0.5166F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 44).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -3.4268F, 0.1703F, 0.4068F, -0.9931F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6255F, -3.4268F, -0.0776F, 0.4326F, -1.5864F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -1.4268F, 0.0065F, 0.3713F, -1.4914F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 51).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -1.4268F, 0.2033F, 0.313F, -0.9194F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2255F, -1.4268F, 0.3149F, 0.1659F, -0.4578F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 9).mirror().addBox(0.3945F, -0.1914F, -0.3396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 3.9261F, -4.4865F, 1.3069F, -0.0017F, 0.0376F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-0.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5591F, 3.8265F, -2.4021F, 0.4783F, 0.4524F, 0.443F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(42, 33).mirror().addBox(-2.7F, -0.1F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2918F, 4.2041F, -2.4485F, 0.7035F, 0.933F, 0.7976F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1255F, -5.2268F, 0.6991F, -0.4103F, 0.6638F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(51, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1255F, -5.2268F, 0.4598F, -0.694F, 1.11F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(62, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -3.4268F, 0.3301F, -0.2635F, 0.5166F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 44).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -3.4268F, 0.1703F, -0.4068F, 0.9931F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 61).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6255F, -3.4268F, -0.0776F, -0.4326F, 1.5864F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(55, 61).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -1.4268F, 0.0065F, -0.3713F, 1.4914F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(44, 51).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -1.4268F, 0.2033F, -0.313F, 0.9194F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(61, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2255F, -1.4268F, 0.3149F, -0.1659F, 0.4578F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 47).addBox(-1.6F, -0.5F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 2.5569F, -5.0193F, 0.8084F, -0.3116F, -0.3106F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 9).addBox(-1.3945F, -0.1914F, -0.3396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 3.9261F, -4.4865F, 1.3069F, 0.0017F, -0.0376F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 48).addBox(-1.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5591F, 3.8265F, -2.4021F, 0.4783F, -0.4524F, -0.443F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(42, 33).addBox(-0.3F, -0.1F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2918F, 4.2041F, -2.4485F, 0.7035F, -0.933F, -0.7976F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, -0.9F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.6488F, -1.8433F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(26, 20).addBox(-1.0F, -0.5F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(38, 6).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4652F, 2.8501F, -3.9924F, 0.5791F, -0.1823F, -1.358F));

		PartDefinition cube_r87 = leftArm1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.0059F, 0.6738F, -0.4661F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftArm1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1099F, 5.6146F, -0.7514F, -2.0948F, 0.0387F, -0.0202F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 37).addBox(-1.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.75F, 0.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(29, 51).addBox(-1.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(14, 50).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(7, 51).addBox(-0.5F, -0.5991F, -0.513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(30, 38).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(49, 26).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(53, 18).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2383F, 4.7275F, -1.1258F, 0.6881F, -0.1814F, 0.1881F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(38, 14).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4652F, 2.8501F, -3.9924F, 0.7608F, 0.2483F, 0.9346F));

		PartDefinition cube_r93 = rightArm1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.6738F, -0.4661F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1099F, 5.6146F, -0.7514F, -2.0948F, -0.0387F, 0.0202F));

		PartDefinition cube_r95 = rightArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(0.75F, -0.2F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(29, 51).mirror().addBox(0.75F, 0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.3F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(14, 50).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(7, 51).mirror().addBox(-0.5F, -0.5991F, -0.513F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(30, 38).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(49, 26).mirror().addBox(0.0F, 1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(53, 18).mirror().addBox(0.0F, 1.7F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2383F, 4.7275F, -1.1258F, 0.705F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(38, 14).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, 0.1801F, 0.1707F, -0.0366F));

		PartDefinition cube_r99 = neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 55).addBox(-1.0F, -0.8643F, 0.2306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r100 = neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -3.0F, -0.0002F, -0.0394F, 0.1517F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.0262F, -0.0688F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7F, -1.9F, -0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, -2.2F, -0.9047F, -0.0983F, 0.1168F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(43, 10).addBox(-0.5F, -0.0676F, 0.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.6F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(17, 55).addBox(-0.5F, -0.4674F, -0.9054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.7F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(57, 13).addBox(-0.5F, 0.3543F, -0.1186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7531F, -0.033F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(46, 22).addBox(-0.5F, -0.1137F, -0.1485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.3199F, -3.3353F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(15, 58).addBox(-0.5F, -0.135F, 0.8157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.2199F, -4.7353F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(23, 46).addBox(-0.5F, -0.1958F, -1.8016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9199F, -6.1353F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(16, 37).addBox(-0.5F, -0.1958F, -0.2195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9199F, -6.1353F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(57, 58).addBox(-0.5F, -0.5666F, 0.3047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 49).addBox(-0.5F, -0.5666F, -0.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 46).addBox(-0.5F, -0.5666F, -1.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 43).addBox(-0.5F, -0.5666F, -2.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 40).addBox(-0.5F, -0.5666F, -3.6953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(26, 26).addBox(-0.5F, -0.7666F, -3.3953F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 2.8469F, -4.033F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(37, 50).addBox(-1.0F, -0.9229F, -0.0352F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.0F, 2.2469F, -2.733F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.33F, 3.4533F, -6.5752F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 58).addBox(-0.71F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 31).addBox(-0.71F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 56).addBox(-0.69F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2654F, -0.9911F, 2.5277F, 0.4092F, 0.0445F, -0.0009F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(47, 56).addBox(-0.2F, -0.9285F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.33F, -1.6064F, 5.2421F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(44, 39).addBox(-0.8359F, -0.8432F, -0.1829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.045F, -0.7793F, 2.8387F, 0.3794F, 0.1573F, 0.0864F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5119F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1381F, -1.4704F, 3.1873F, 1.1847F, 0.0801F, -0.004F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 6).addBox(-0.835F, -0.9985F, 0.4571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(60, 3).addBox(-0.835F, -0.9985F, 0.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.045F, -0.7793F, 2.8387F, 0.4142F, 0.2096F, 0.0862F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(37, 20).addBox(-0.7382F, -0.302F, -0.4037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0209F, -1.5267F, 2.2959F, 0.6025F, 0.1717F, 0.1541F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(52, 56).addBox(-1.0F, -0.0028F, 0.0287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.47F, -2.7064F, 4.0421F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 52).addBox(-1.0F, -0.0304F, -0.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.47F, -3.7064F, 5.6421F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(57, 0).addBox(-0.1F, 8.1134F, -1.1139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.33F, -12.1064F, 5.5421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 0.3769F, -0.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.47F, -4.1064F, 5.5421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(30, 43).addBox(-0.2F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.33F, -2.5568F, 5.8726F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 56).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.19F, -2.8049F, 6.3571F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(58, 16).addBox(-0.59F, -0.1332F, -0.1207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2F, -2.8441F, 4.5704F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(22, 55).addBox(-0.59F, -0.1258F, -0.1805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2F, -2.3441F, 4.1704F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(58, 19).addBox(-0.59F, -0.1383F, -0.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2F, -3.1441F, 5.1704F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 56).addBox(-0.43F, -0.3289F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 34).addBox(-0.61F, -0.3289F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(44, 35).addBox(-0.59F, -0.1897F, -0.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -2.5441F, 4.9704F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.33F, 3.4533F, -6.5752F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-0.29F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 31).mirror().addBox(-0.29F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(32, 56).mirror().addBox(-0.31F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2654F, -0.9911F, 2.5277F, 0.4092F, -0.0445F, 0.0009F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-0.8F, -0.9285F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.33F, -1.6064F, 5.2421F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-0.1641F, -0.8432F, -0.1829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.045F, -0.7793F, 2.8387F, 0.3794F, -0.1573F, -0.0864F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.4881F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1381F, -1.4704F, 3.1873F, 1.1847F, -0.0801F, 0.004F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.165F, -0.9985F, 0.4571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(60, 3).mirror().addBox(-0.165F, -0.9985F, 0.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.045F, -0.7793F, 2.8387F, 0.4142F, -0.2096F, -0.0862F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-0.2618F, -0.302F, -0.4037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0209F, -1.5267F, 2.2959F, 0.6025F, -0.1717F, -0.1541F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(52, 56).mirror().addBox(0.0F, -0.0028F, 0.0287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.47F, -2.7064F, 4.0421F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(56, 52).mirror().addBox(0.0F, -0.0304F, -0.9497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.47F, -3.7064F, 5.6421F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.9F, 8.1134F, -1.1139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.33F, -12.1064F, 5.5421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(0.0F, 0.3769F, -0.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.47F, -4.1064F, 5.5421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-0.8F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.33F, -2.5568F, 5.8726F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 56).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.19F, -2.8049F, 6.3571F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-0.41F, -0.1332F, -0.1207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.8441F, 4.5704F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(22, 55).mirror().addBox(-0.41F, -0.1258F, -0.1805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.3441F, 4.1704F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-0.41F, -0.1383F, -0.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -3.1441F, 5.1704F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(37, 56).mirror().addBox(-0.57F, -0.3289F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 34).mirror().addBox(-0.39F, -0.3289F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(44, 35).mirror().addBox(-0.41F, -0.1897F, -0.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.5441F, 4.9704F, 0.384F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.0324F, 0.3458F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 25).addBox(0.0F, -0.8955F, -0.8872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F))
				.texOffs(30, 59).addBox(0.0F, -0.8955F, 2.1128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F))
				.texOffs(59, 28).addBox(0.0F, -0.8955F, 1.1128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F))
				.texOffs(25, 59).addBox(0.0F, -0.8955F, 0.1128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F))
				.texOffs(5, 59).addBox(0.0F, -0.8955F, -1.8872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F))
				.texOffs(7, 47).addBox(0.0F, -0.6955F, -2.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2504F))
				.texOffs(46, 18).addBox(0.0F, -0.6955F, -1.7872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6F, 1.3664F, -5.9956F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(16, 46).addBox(0.0F, -0.7743F, -1.9988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6F, 1.2664F, -4.2956F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.3F, -0.5522F, -1.7419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.8664F, -3.1956F, 0.1418F, -0.1728F, -0.0245F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(-0.4F, -0.4505F, -3.4934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3664F, 0.1044F, 0.1222F, -0.0524F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(45, 14).mirror().addBox(-0.4F, -0.6657F, -2.0156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3664F, 0.1044F, 0.2443F, -0.0524F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 58).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.57F, 0.593F, -1.8432F, 1.7804F, -0.0427F, -0.0091F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-0.4F, -0.8097F, -3.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3664F, 0.1044F, 0.2269F, -0.0524F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.4F, -0.6094F, -1.6654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3664F, 0.1044F, 0.1134F, -0.0524F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(-0.4F, -0.7101F, -3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3664F, 0.1044F, 0.192F, -0.0524F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 46).addBox(-0.7F, -0.5522F, -1.7419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4F, 0.8664F, -3.1956F, 0.1418F, 0.1728F, 0.0245F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(37, 46).addBox(-0.6F, -0.4505F, -3.4934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 0.3664F, 0.1044F, 0.1222F, 0.0524F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 14).addBox(-0.6F, -0.6657F, -2.0156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.5F, 0.3664F, 0.1044F, 0.2443F, 0.0524F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(58, 22).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 58).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.37F, 0.593F, -1.8432F, 1.7804F, 0.0427F, 0.0091F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(57, 55).addBox(-0.6F, -0.8097F, -3.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5F, 0.3664F, 0.1044F, 0.2269F, 0.0524F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(45, 0).addBox(-0.6F, -0.6094F, -1.6654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 0.3664F, 0.1044F, 0.1134F, 0.0524F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(44, 43).addBox(-0.6F, -0.7101F, -3.1307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.5F, 0.3664F, 0.1044F, 0.192F, 0.0524F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(11, 27).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 62).addBox(0.0F, -0.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 62).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 62).addBox(0.0F, -0.8F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.7F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 62).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5077F, 6.9059F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(31, 62).addBox(0.0F, -0.0059F, -0.8732F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0191F, 4.9397F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(49, 62).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7405F, 0.6412F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(46, 62).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1224F, 0.2911F, -0.1609F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.011F, 7.9604F, -0.3555F, 0.2874F, -0.1049F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0192F, 7.8744F, -0.2946F, 0.209F, -0.0629F));

		return LayerDefinition.create(meshdefinition, 66, 66);
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