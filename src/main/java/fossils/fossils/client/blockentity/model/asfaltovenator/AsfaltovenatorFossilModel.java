package fossils.fossils.client.blockentity.model.asfaltovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AsfaltovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AsfaltovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.5846F, -0.2193F, -0.0174F, 0.0015F, 0.0873F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(113, 10).addBox(0.0F, 1.8F, -0.825F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6645F, 8.5319F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 12).addBox(-0.006F, 0.1F, -9.7F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.18F, 7.705F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9031F, 4.3581F, 3.0382F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 85).addBox(-0.5F, 0.1F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1658F, -5.697F, -1.9459F, -0.8765F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 60).addBox(-0.5827F, 3.7931F, -9.9175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5815F, -8.6405F, 5.3682F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(93, 53).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6085F, -8.869F, 0.7867F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 47).addBox(-0.5F, -2.8F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0658F, -4.8347F, 3.9432F, 0.513F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 19).addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2469F, -5.4363F, 5.3715F, 0.0942F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 73).addBox(-0.5F, 0.15F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.336F, -8.0021F, 4.6653F, -0.364F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(120, 99).addBox(-0.4837F, -3.9348F, -0.5312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.9312F, -0.0173F, -0.0501F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 120).addBox(-0.4837F, -2.5948F, -0.7721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.6694F, -0.0173F, -0.0501F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 134).addBox(-0.4837F, 0.4717F, -0.6254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.3378F, -0.0173F, -0.0501F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(132, 56).addBox(-0.4837F, 0.3808F, 0.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.076F, -0.0173F, -0.0501F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(96, 118).addBox(-0.4837F, 1.3031F, -0.843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.4687F, -0.0173F, -0.0501F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(127, 89).addBox(-0.4865F, 1.5588F, -0.0199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(127, 82).addBox(-0.4865F, 1.1588F, -0.0449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, 0.9051F, -0.0173F, -0.0501F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(101, 85).addBox(-0.4865F, -0.9036F, -1.8007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2603F, 2.8877F, 7.2063F, -0.6221F, -0.0173F, -0.0501F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(103, 118).addBox(-0.4835F, -4.5584F, 0.0532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2754F, 1.8637F, 5.0808F, 1.0788F, -0.0065F, -0.0438F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(34, 134).addBox(-0.4835F, -1.4125F, -4.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 134).addBox(-0.4835F, -1.4125F, -3.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2754F, 1.8637F, 5.0808F, -0.1866F, -0.0065F, -0.0438F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 127).addBox(-0.4835F, -4.7023F, -0.0968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2754F, 1.8637F, 5.0808F, 0.9042F, -0.0065F, -0.0438F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(118, 93).addBox(-0.4835F, -4.4773F, 0.7833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2754F, 1.8637F, 5.0808F, 1.2097F, -0.0065F, -0.0438F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 118).addBox(-0.4835F, -1.1863F, 0.4145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2754F, 1.8637F, 5.0808F, 0.7733F, -0.0065F, -0.0438F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(113, 102).addBox(-0.5F, -1.6F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4114F, -3.0996F, 2.4354F, 0.462F, 0.0639F, 0.0248F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 113).addBox(-0.5F, 0.2F, 0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1918F, -1.7043F, -0.4558F, 0.3748F, 0.0639F, 0.0248F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 91).addBox(-0.5F, -3.725F, -2.4F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0457F, 0.7049F, -2.5179F, -1.1437F, 0.0639F, 0.0248F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 45).addBox(-0.3869F, -2.5888F, 1.4735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.173F, 6.7663F, -4.1279F, -1.5728F, 0.0891F, -0.1553F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(106, 21).addBox(-0.3869F, 0.8805F, 0.9886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.173F, 6.7663F, -4.1279F, -0.8311F, 0.0891F, -0.1553F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(127, 116).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4022F, 10.394F, -5.3171F, -1.311F, 0.0891F, -0.1553F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(119, 65).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4883F, 9.1135F, -2.1495F, -1.2238F, 0.0891F, -0.1553F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(85, 101).addBox(-0.3869F, 0.7481F, 0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.173F, 6.7663F, -4.1279F, -0.3598F, 0.0891F, -0.1553F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 119).addBox(-0.3869F, -0.0935F, 0.0604F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.173F, 6.7663F, -4.1279F, 0.0852F, 0.0891F, -0.1553F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(39, 127).addBox(-0.3869F, 0.7955F, -0.3573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.173F, 6.7663F, -4.1279F, 0.3906F, 0.0891F, -0.1553F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(119, 25).addBox(-1.2154F, 4.0663F, -1.1499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.1279F, -0.1501F, 0.0837F, -0.1583F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(120, 70).addBox(-0.4901F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.1279F, -0.0005F, 0.0643F, 0.0237F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(113, 95).addBox(-0.4901F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.073F, 0.8663F, -2.1279F, -0.175F, 0.0643F, 0.0237F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 104).addBox(-0.5F, -2.475F, 0.525F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0129F, 0.9743F, -4.0689F, 0.2613F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 82).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1883F, -3.2186F, -2.298F, -0.4542F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(22, 77).addBox(-0.3844F, -0.3139F, -1.1767F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1504F, -4.4868F, -1.572F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(122, 120).addBox(-0.9819F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 1.6842F, -0.3289F, -0.3595F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4749F, -5.0861F, -6.6856F, 2.3736F, -0.3289F, -0.3595F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(113, 5).addBox(-0.9819F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 1.3439F, -0.3289F, -0.3595F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 102).addBox(-0.9819F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1253F, -8.8554F, -4.6902F, 0.5847F, -0.3289F, -0.3595F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 96).addBox(0.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.186F, -9.0019F, -2.3068F, 0.2343F, -0.3037F, -0.3808F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(88, 77).addBox(-0.58F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5815F, -9.3405F, -3.2318F, -0.0562F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9031F, 9.1074F, 3.1211F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(22, 85).mirror().addBox(-0.5F, 0.1F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1658F, -10.4463F, -2.0288F, -0.8765F, 0.0321F, 0.4016F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-0.4173F, 3.7931F, -9.9175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -13.3898F, 5.2853F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6085F, -13.6183F, 0.7038F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-0.5F, -2.8F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, -9.5839F, 3.8603F, 0.513F, 0.0327F, 0.4104F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-0.5F, -2.0F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -10.1856F, 5.2886F, 0.0942F, 0.0327F, 0.4104F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(-0.5F, 0.15F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.336F, -12.7513F, 4.5824F, -0.364F, 0.0391F, 0.4053F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(120, 99).mirror().addBox(-0.5163F, -3.9348F, -0.5312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.9312F, 0.0173F, 0.0501F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(77, 120).mirror().addBox(-0.5163F, -2.5948F, -0.7721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.6694F, 0.0173F, 0.0501F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(44, 134).mirror().addBox(-0.5163F, 0.4717F, -0.6254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.3378F, 0.0173F, 0.0501F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(132, 56).mirror().addBox(-0.5163F, 0.3808F, 0.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.076F, 0.0173F, 0.0501F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(96, 118).mirror().addBox(-0.5163F, 1.3031F, -0.843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.4687F, 0.0173F, 0.0501F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(127, 89).mirror().addBox(-0.5135F, 1.5588F, -0.0199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(127, 82).mirror().addBox(-0.5135F, 1.1588F, -0.0449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, 0.9051F, 0.0173F, 0.0501F));

		PartDefinition cube_r56 = bone5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(101, 85).mirror().addBox(-0.5135F, -0.9036F, -1.8007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2603F, -1.8616F, 7.1234F, -0.6221F, 0.0173F, 0.0501F));

		PartDefinition cube_r57 = bone5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 118).mirror().addBox(-0.5165F, -4.5584F, 0.0532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, -2.8855F, 4.9979F, 1.0788F, 0.0065F, 0.0438F));

		PartDefinition cube_r58 = bone5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(34, 134).mirror().addBox(-0.5165F, -1.4125F, -4.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 134).mirror().addBox(-0.5165F, -1.4125F, -3.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, -2.8855F, 4.9979F, -0.1866F, 0.0065F, 0.0438F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(49, 127).mirror().addBox(-0.5165F, -4.7023F, -0.0968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, -2.8855F, 4.9979F, 0.9042F, 0.0065F, 0.0438F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(118, 93).mirror().addBox(-0.5165F, -4.4773F, 0.7833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, -2.8855F, 4.9979F, 1.2097F, 0.0065F, 0.0438F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(91, 118).mirror().addBox(-0.5165F, -1.1863F, 0.4145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2754F, -2.8855F, 4.9979F, 0.7733F, 0.0065F, 0.0438F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(113, 102).mirror().addBox(-0.5F, -1.6F, -2.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4114F, -7.8489F, 2.3525F, 0.462F, -0.0639F, -0.0248F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(24, 113).mirror().addBox(-0.5F, 0.2F, 0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1918F, -6.4536F, -0.5387F, 0.3748F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-0.5F, -3.725F, -2.4F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0457F, -4.0443F, -2.6008F, -1.1437F, -0.0639F, -0.0248F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(120, 45).mirror().addBox(-0.6131F, -2.5888F, 1.4735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.173F, 2.0171F, -4.2108F, -1.5728F, -0.0891F, 0.1553F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(-0.6131F, 0.8805F, 0.9886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.173F, 2.0171F, -4.2108F, -0.8311F, -0.0891F, 0.1553F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(127, 116).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4022F, 5.6447F, -5.4F, -1.311F, -0.0891F, 0.1553F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(119, 65).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4883F, 4.3642F, -2.2324F, -1.2238F, -0.0891F, 0.1553F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(-0.6131F, 0.7481F, 0.2111F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.173F, 2.0171F, -4.2108F, -0.3598F, -0.0891F, 0.1553F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(31, 119).mirror().addBox(-0.6131F, -0.0935F, 0.0604F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.173F, 2.0171F, -4.2108F, 0.0852F, -0.0891F, 0.1553F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(39, 127).mirror().addBox(-0.6131F, 0.7955F, -0.3573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.173F, 2.0171F, -4.2108F, 0.3906F, -0.0891F, 0.1553F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(119, 25).mirror().addBox(0.2154F, 4.0663F, -1.1499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, -3.8829F, -2.2108F, -0.1501F, -0.0837F, 0.1583F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-0.5099F, -0.6934F, -1.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, -3.8829F, -2.2108F, -0.0005F, -0.0643F, -0.0237F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(113, 95).mirror().addBox(-0.5099F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.073F, -3.8829F, -2.2108F, -0.175F, -0.0643F, -0.0237F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(18, 104).mirror().addBox(-0.5F, -2.475F, 0.525F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0129F, -3.775F, -4.1517F, 0.2613F, -0.0639F, -0.0248F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1883F, -7.9678F, -2.3809F, -0.4542F, -0.0639F, -0.0248F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-0.6156F, -0.3139F, -1.1767F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1504F, -9.236F, -1.6549F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(122, 120).mirror().addBox(-0.0181F, -2.4083F, -3.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -13.6047F, -4.7731F, 1.6842F, 0.3289F, 0.3595F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4749F, -9.8354F, -6.7685F, 2.3736F, 0.3289F, 0.3595F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(113, 5).mirror().addBox(-0.0181F, -1.3481F, -3.4282F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -13.6047F, -4.7731F, 1.3439F, 0.3289F, 0.3595F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 102).mirror().addBox(-0.0181F, -0.039F, -1.9676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1253F, -13.6047F, -4.7731F, 0.5847F, 0.3289F, 0.3595F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-1.1F, 0.15F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, -13.7511F, -2.3897F, 0.2343F, 0.3037F, 0.3808F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(-0.42F, 0.205F, 1.0796F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.5815F, -14.0898F, -3.3147F, -0.0562F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.8506F, 3.077F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(95, 41).addBox(-0.6F, -0.4457F, -2.5902F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(113, 70).addBox(-5.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 7.6851F, -2.8601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(103, 32).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 12.6286F, -2.7038F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(113, 75).addBox(-5.1F, -1.1307F, -1.743F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(108, 90).addBox(-5.1F, -2.132F, 0.0567F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(105, 67).addBox(-5.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(104, 25).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 9.0341F, -3.6887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(120, 75).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.1355F, -0.827F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(118, 107).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 4.1355F, -0.827F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(53, 93).addBox(-5.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(106, 97).addBox(-5.1F, -3.8362F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(82, 54).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1301F, 0.171F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 94).addBox(-1.1F, -2.425F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, 1.5376F, 1.2007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.5643F, -2.117F, 0.9232F, -0.0697F, 0.0526F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(106, 36).addBox(0.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(112, 65).addBox(0.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(11, 92).addBox(-0.1F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(118, 61).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(86, 19).addBox(-0.1F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(95, 14).addBox(-0.1F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 9).addBox(-0.1F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 109).addBox(-0.1F, 1.5F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(90, 97).addBox(-0.1F, -8.4F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(71, 101).addBox(-0.1F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(112, 28).addBox(-0.1F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(49, 74).addBox(-1.1F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(97, 108).addBox(-1.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.2472F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(56, 79).addBox(-1.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(79, 79).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1416F, -1.4628F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(123, 20).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r111 = rightLeg3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 114).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(61, 55).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.4938F, 0.0623F, -0.1152F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(46, 12).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.8253F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.8506F, 3.077F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(38, 100).addBox(-2.4F, -0.4457F, -2.5902F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 12.615F, -1.4005F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(95, 113).addBox(3.1F, -1.2214F, 0.2676F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 7.6851F, -2.8601F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(106, 17).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 12.6286F, -2.7038F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 114).addBox(3.1F, -1.1307F, -1.743F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 11.6054F, -1.1045F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(111, 60).addBox(3.1F, -2.132F, 0.0567F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(106, 11).addBox(3.1F, -1.132F, -0.7183F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 10.6777F, -3.0694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(36, 104).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.0341F, -3.6887F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 121).addBox(-0.5F, -0.0843F, -0.9038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.1355F, -0.827F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(114, 118).addBox(-0.5F, -0.5365F, -0.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 4.1355F, -0.827F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(97, 0).addBox(3.1F, -2.0863F, -1.9196F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 3.4214F, 0.6287F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(106, 103).addBox(3.1F, -3.8362F, -0.2445F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 5.5302F, -2.7348F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 85).addBox(-1.5F, -1.6F, -0.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.1301F, 0.171F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(95, 25).addBox(-0.9F, -2.425F, -3.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 1.5376F, 1.2007F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.5643F, -2.117F, 1.438F, 0.0699F, -0.1409F));

		PartDefinition cube_r124 = leftLeg2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(106, 73).addBox(-2.9F, -0.1F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(113, 0).addBox(-2.9F, -2.4F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(22, 92).addBox(-1.9F, -1.2F, 0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 118).addBox(-1.0F, -0.425F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.5975F, -1.523F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 91).addBox(-1.9F, -0.6F, -1.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(42, 95).addBox(-1.9F, -0.6F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2303F, 1.8973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(95, 36).addBox(-1.9F, -0.6F, -1.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(111, 109).addBox(-1.9F, 1.5F, -0.85F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(49, 101).addBox(-1.9F, -8.4F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 16.4611F, -0.1532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(78, 101).addBox(-1.9F, -6.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2F, 9.6597F, -0.0125F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(88, 112).addBox(-1.9F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7195F, 0.6129F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(15, 77).addBox(-0.9F, -6.6F, -0.525F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 111).addBox(0.1F, 0.0274F, -1.1625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.2472F, 0.2883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 79).addBox(0.1F, -0.209F, -0.1593F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.4F, 2.2197F, -0.3418F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(33, 82).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.1416F, -1.4628F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(127, 16).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r139 = leftLeg3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(58, 114).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(36, 68).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 1.2851F, 0.0371F, 0.1256F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 50).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.258F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2161F, 8.6304F, -0.2602F, -0.0623F, 0.1065F));

		PartDefinition cube_r140 = tail1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(90, 124).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2878F, 8.7295F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(124, 79).addBox(0.5F, -0.0129F, -0.5754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1058F, 1.6434F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(31, 124).addBox(0.5F, 0.5871F, -0.1754F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8299F, 3.4583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 120).addBox(0.5F, 0.2871F, -0.8754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.096F, 5.7805F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(124, 24).addBox(0.5F, -3.0823F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8326F, 4.9848F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(108, 120).addBox(0.5F, -2.9573F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1588F, 6.9807F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(119, 118).addBox(0.5F, -3.2073F, -0.4162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5051F, 3.3259F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(11, 83).addBox(0.497F, -3.3323F, -1.0162F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2471F, 1.9357F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-2.3F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0111F, 0.0962F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 0).addBox(-0.7F, -0.5F, 1.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0111F, 0.0962F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(23, 27).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, 0.1382F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 122).addBox(-1.0F, -4.1335F, 3.7591F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 93).addBox(-1.0F, -4.4335F, 5.7591F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.8946F, 0.0766F, -0.0469F, 0.0401F));

		PartDefinition cube_r151 = tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-2.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.0381F, 0.9544F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition cube_r152 = tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(65, 26).addBox(0.4F, -0.5F, -1.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.0381F, 0.9544F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition cube_r153 = tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 61).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(28, 128).addBox(0.0F, 1.0F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.548F, 6.0799F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(114, 123).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(123, 104).addBox(0.0F, 0.4F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(87, 121).addBox(0.5F, -2.6823F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(111, 120).addBox(0.5F, -2.7073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, 0.0262F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1888F, -0.0939F, 0.0263F));

		PartDefinition cube_r159 = tail2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(111, 126).addBox(0.0F, -3.3561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(11, 130).addBox(0.0F, -3.1561F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(8, 130).addBox(0.0F, -2.9061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(130, 6).addBox(0.0F, -2.7811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(23, 50).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(127, 129).addBox(0.0F, 0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, 1.9009F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(119, 129).addBox(0.0F, 1.4F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, 5.4187F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 129).addBox(0.0F, 1.1F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-1.6F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, -0.4739F, 1.0278F, 0.0175F, 0.0262F, 0.0005F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(61, 47).addBox(-0.4F, -0.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5302F, -0.4739F, 1.0278F, 0.0175F, -0.0262F, -0.0005F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0734F, -0.1338F, 0.0336F));

		PartDefinition cube_r169 = tail8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r170 = tail8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 39).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r171 = tail8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(53, 89).addBox(0.0F, 3.8F, 3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 130).addBox(0.0F, 1.4F, 1.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 48).addBox(0.0F, 0.0F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(31, 130).addBox(0.0F, 0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.837F, 0.6886F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(23, 130).addBox(0.0F, -2.5811F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 6.8984F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(20, 130).addBox(0.0F, -2.5561F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.9983F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(17, 130).addBox(0.0F, -2.6061F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(14, 130).addBox(0.0F, -2.7561F, -0.0316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, -0.0804F, -0.2175F, 0.0174F));

		PartDefinition cube_r178 = tail3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(127, 134).addBox(0.0F, -2.0128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 121).addBox(0.0F, -2.2128F, 2.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(119, 134).addBox(0.0F, -2.1628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 130).addBox(0.0F, -2.1628F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(62, 130).addBox(0.0F, -2.1128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(49, 134).addBox(0.0F, 2.2F, 3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 134).addBox(0.0F, 0.8F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 114).addBox(0.0F, -0.5F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 27).mirror().addBox(-1.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(44, 27).addBox(0.5F, 0.6F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail9.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(57, 71).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail9.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(19, 57).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail9.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(14, 135).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail9.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(11, 135).addBox(0.0F, 6.3F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 9).addBox(0.0F, 5.1F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 135).addBox(0.0F, 3.7F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail9.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 135).addBox(0.0F, -1.325F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r191 = tail4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(31, 135).addBox(0.0F, -0.625F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 5.0293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(23, 135).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(120, 104).addBox(0.0F, -0.7F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(116, 25).addBox(0.0F, 0.15F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 68).addBox(0.0F, -1.25F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 71).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(34, 74).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(135, 59).addBox(0.0F, -1.0948F, 0.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 135).addBox(0.0F, -1.0698F, 2.7774F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1489F, 0.0863F, -0.0129F));

		PartDefinition cube_r196 = tail5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 135).addBox(0.0F, -0.425F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5698F, 4.7774F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(58, 135).addBox(0.0F, 3.85F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 135).addBox(0.0F, 2.65F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 135).addBox(0.0F, 1.45F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6637F, -2.9195F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 58).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(67, 135).addBox(0.0F, -0.4F, 0.9987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.1672F, 0.1291F, -0.0217F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1577F, 0.3451F, -0.0537F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.7531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(111, 21).addBox(-0.503F, -3.2022F, -1.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2486F, -2.8492F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(19, 111).addBox(-0.503F, -3.0022F, -2.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3533F, -4.8465F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(14, 111).addBox(-0.503F, -3.3522F, -0.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -0.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(42, 47).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5518F, -7.2053F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(125, 63).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, -0.0395F, -0.0085F, -0.645F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, -0.0322F, -0.0244F, -1.0811F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(125, 77).mirror().addBox(-4.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -2.9704F, -0.0131F, -0.0382F, -1.6747F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(117, 87).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, 0.0296F, -0.1233F, -0.0713F, -0.6417F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(90, 36).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, 0.0296F, -0.0021F, -0.1424F, -1.6757F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(118, 14).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.119F, 0.0296F, -0.0817F, -0.1167F, -1.0776F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(125, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, 0.016F, 0.0512F, -0.4895F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(125, 101).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, -0.0072F, 0.0531F, -0.9264F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -5.9704F, -0.0357F, 0.04F, -1.5204F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(97, 83).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, -0.0357F, -0.04F, 1.5204F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(125, 101).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, -0.0072F, -0.0531F, 0.9264F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(125, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -5.9704F, 0.016F, -0.0512F, 0.4895F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(118, 14).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, 0.0296F, -0.0817F, 0.1167F, 1.0776F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(90, 36).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, 0.0296F, -0.0021F, 0.1424F, 1.6757F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(117, 87).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.119F, 0.0296F, -0.1233F, 0.0713F, 0.6417F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(125, 77).addBox(2.74F, -2.3355F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, -0.0131F, 0.0382F, 1.6747F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(119, 30).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, -0.0322F, 0.0244F, 1.0811F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(125, 63).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -2.9704F, -0.0395F, 0.0085F, 0.645F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.1F, -9.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3746F, -6.8877F, 0.0528F, -0.1307F, -0.0069F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(36, 60).addBox(0.0F, -3.0122F, -1.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0895F, -1.8945F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 109).addBox(0.0F, -2.6117F, -0.8614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0008F, -8.095F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(113, 33).addBox(0.0F, -2.9367F, -0.9614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0263F, -4.9951F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -4.9F, 0.0338F, 0.1886F, -1.3948F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(126, 97).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -4.9F, 0.134F, 0.1373F, -0.7953F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(126, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -4.9F, 0.1792F, 0.0682F, -0.3621F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(123, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -7.9F, 0.2262F, 0.0923F, -0.3241F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(123, 51).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -7.9F, 0.1669F, 0.1789F, -0.7559F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.85F, -7.9F, 0.0371F, 0.2413F, -1.3598F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9F, -1.9F, -0.0027F, 0.0901F, -1.4489F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(123, 110).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9F, -1.9F, 0.0483F, 0.0761F, -0.8536F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(124, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9F, -1.9F, 0.0759F, 0.0486F, -0.4172F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(124, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9F, -1.9F, 0.0759F, -0.0486F, 0.4172F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(46, 19).addBox(-3.5F, -2.0F, -4.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.3198F, -5.109F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(42, 39).addBox(-2.5F, -1.0505F, -3.8437F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 14.9955F, -1.0077F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(123, 110).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9F, -1.9F, 0.0483F, -0.0761F, 0.8536F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(84, 32).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9F, -1.9F, -0.0027F, -0.0901F, 1.4489F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(52, 10).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -7.9F, 0.0371F, -0.2413F, 1.3598F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(123, 51).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -7.9F, 0.1669F, -0.1789F, 0.7559F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(123, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -7.9F, 0.2262F, -0.0923F, 0.3241F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(126, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -4.9F, 0.1792F, -0.0682F, 0.3621F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(126, 97).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -4.9F, 0.134F, -0.1373F, 0.7953F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 10).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.85F, -4.9F, 0.0338F, -0.1886F, 1.3948F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2476F, -8.7953F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(109, 50).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.8391F, -2.0368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(93, 124).addBox(0.0F, -2.6525F, -0.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -1.9368F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 130).addBox(0.0F, -2.6967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -4.0368F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(69, 21).addBox(-4.9595F, 0.1454F, -1.4401F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 11.6749F, -5.6497F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(-5.9F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4626F, 12.713F, -5.6729F, -0.2317F, 0.962F, -0.1732F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.841F, 12.5173F, -5.5447F, -0.6467F, 0.7943F, -0.1083F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-2.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9587F, 12.0938F, -6.3649F, -0.6432F, 0.7217F, 0.514F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-1.5322F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, 11.6749F, -5.6497F, -0.6592F, -0.3904F, 0.2867F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(124, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -1.5368F, 0.1436F, 0.0612F, -0.2781F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(124, 85).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -1.5368F, 0.1045F, 0.116F, -0.7128F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -1.5368F, 0.0214F, 0.1545F, -1.3106F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-13.6882F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6391F, -3.5368F, 0.0395F, 0.1855F, -1.3607F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(124, 87).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6391F, -3.5368F, 0.1369F, 0.1316F, -0.7619F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(101, 124).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6391F, -3.5368F, 0.1794F, 0.0618F, -0.329F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 34).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -5.4368F, 0.0562F, 0.1985F, -1.3934F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -5.4368F, 0.158F, 0.1331F, -0.795F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -5.4368F, 0.199F, 0.0544F, -0.3638F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(125, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -7.4368F, 0.2472F, 0.0735F, -0.4483F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(125, 4).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -7.4368F, 0.1942F, 0.1705F, -0.8772F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 36).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9391F, -7.4368F, 0.0648F, 0.2496F, -1.4791F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(71, 36).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -7.4368F, 0.0648F, -0.2496F, 1.4791F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(125, 4).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -7.4368F, 0.1942F, -0.1705F, 0.8772F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(125, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -7.4368F, 0.2472F, -0.0735F, 0.4483F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(130, 69).addBox(0.0F, -2.8927F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1391F, -7.8368F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(125, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -5.4368F, 0.199F, -0.0544F, 0.3638F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(122, 124).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -5.4368F, 0.158F, -0.1331F, 0.795F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(65, 34).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9391F, -5.4368F, 0.0562F, -0.1985F, 1.3934F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 124).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6391F, -3.5368F, 0.1794F, -0.0618F, 0.329F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(124, 87).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6391F, -3.5368F, 0.1369F, -0.1316F, 0.7619F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(52, 8).addBox(2.6881F, -2.8327F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6391F, -3.5368F, 0.0395F, -0.1855F, 1.3607F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(44, 37).addBox(2.6881F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -1.5368F, 0.0214F, -0.1545F, 1.3106F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(124, 85).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -1.5368F, 0.1045F, -0.116F, 0.7128F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(124, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -1.5368F, 0.1436F, -0.0612F, 0.2781F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(68, 130).addBox(0.0F, -2.8927F, -0.2837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1391F, -5.8368F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 76).addBox(-0.4678F, 0.3608F, -5.6557F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, 11.6749F, -5.6497F, -0.6592F, 0.3904F, -0.2867F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(79, 68).addBox(0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9587F, 12.0938F, -6.3649F, -0.6432F, -0.7217F, -0.514F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(98, 79).addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.841F, 12.5173F, -5.5447F, -0.6467F, -0.7943F, 0.1083F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(84, 45).addBox(-0.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4626F, 12.713F, -5.6729F, -0.2317F, -0.962F, 0.1732F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(61, 79).addBox(-2.9595F, 0.3608F, -5.2405F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9595F, 11.6749F, -5.6497F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 12).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2609F, -2.1368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1842F, 4.3167F, -6.279F, -0.3408F, 0.0981F, -0.1959F));

		PartDefinition cube_r284 = bone2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(9, 104).addBox(-0.5F, -0.4F, 1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.484F, -2.4235F, 2.4641F, 0.9905F, -0.0159F, -0.0072F));

		PartDefinition cube_r285 = bone2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.4F, -2.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.484F, -2.4235F, 2.4641F, 0.9033F, -0.0159F, -0.0072F));

		PartDefinition cube_r286 = bone2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(132, 3).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(132, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4134F, -6.4381F, 4.9877F, 2.2035F, 0.0005F, -0.0174F));

		PartDefinition cube_r287 = bone2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(91, 47).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4585F, -3.7694F, 1.9305F, 0.9817F, 0.0005F, -0.0174F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(42, 89).addBox(-0.9466F, -0.2156F, -0.0387F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9653F, -0.2793F, 0.0595F, 1.0254F, 0.0005F, -0.0174F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(91, 61).addBox(-0.8861F, -0.7709F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F))
				.texOffs(79, 88).addBox(-0.8861F, -1.2709F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9653F, 3.3207F, -0.7405F, 1.0646F, 0.003F, -0.0172F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(132, 62).addBox(-0.425F, -0.95F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1079F, 3.6255F, -0.8059F, 1.0297F, 0.1346F, 0.2175F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 83).addBox(-0.1317F, 2.5826F, -2.2852F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9278F, 3.281F, -1.2683F, -0.4194F, 0.6401F, 1.071F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(61, 92).addBox(-1.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9278F, 3.281F, -1.2683F, -0.6093F, 0.4662F, 0.7137F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(70, 118).addBox(-1.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9278F, 3.281F, -1.2683F, 0.1325F, 0.4662F, 0.7137F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(25, 108).addBox(-1.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9278F, 3.281F, -1.2683F, 0.787F, 0.4662F, 0.7137F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(133, 95).addBox(-1.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9653F, 3.3207F, -0.7405F, 1.0512F, 0.0827F, 0.2417F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1842F, 4.3167F, -6.279F, -0.3408F, -0.0981F, 0.1959F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(9, 104).mirror().addBox(-0.5F, -0.4F, 1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -2.4235F, 2.4641F, 0.9905F, 0.0159F, 0.0072F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.4F, -2.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -2.4235F, 2.4641F, 0.9033F, 0.0159F, 0.0072F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(132, 3).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(132, 0).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4134F, -6.4381F, 4.9877F, 2.2035F, -0.0005F, 0.0174F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4585F, -3.7694F, 1.9305F, 0.9817F, -0.0005F, 0.0174F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(42, 89).mirror().addBox(-0.0534F, -0.2156F, -0.0387F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9653F, -0.2793F, 0.0595F, 1.0254F, -0.0005F, 0.0174F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-0.1139F, -0.7709F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(79, 88).mirror().addBox(-0.1139F, -1.2709F, 0.7464F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9653F, 3.3207F, -0.7405F, 1.0646F, -0.003F, 0.0172F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(132, 62).mirror().addBox(-0.575F, -0.95F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1079F, 3.6255F, -0.8059F, 1.0297F, -0.1346F, -0.2175F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.8683F, 2.5826F, -2.2852F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9278F, 3.281F, -1.2683F, -0.4194F, -0.6401F, -1.071F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(61, 92).mirror().addBox(0.0673F, 1.7238F, -2.2852F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9278F, 3.281F, -1.2683F, -0.6093F, -0.4662F, -0.7137F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(70, 118).mirror().addBox(0.0673F, -0.2729F, -2.8494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9278F, 3.281F, -1.2683F, 0.1325F, -0.4662F, -0.7137F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(25, 108).mirror().addBox(0.0673F, -0.8336F, -1.9078F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9278F, 3.281F, -1.2683F, 0.787F, -0.4662F, -0.7137F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(133, 95).mirror().addBox(0.1422F, -1.2384F, -0.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9653F, 3.3207F, -0.7405F, 1.0512F, -0.0827F, -0.2417F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1181F, 8.867F, -8.9508F, 0.3729F, 0.3644F, -0.3989F));

		PartDefinition cube_r308 = leftArm1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(106, 42).addBox(-0.2F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0734F, -0.0675F, 0.1906F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r309 = leftArm1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(133, 106).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 11).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9477F, 1.0557F, -0.8789F, -0.3218F, -0.7676F, 0.1498F));

		PartDefinition cube_r310 = leftArm1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(125, 10).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9477F, 1.0557F, -0.8789F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r311 = leftArm1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(125, 6).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8229F, 1.0987F, -1.4704F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition cube_r312 = leftArm1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6771F, 3.5184F, 0.3785F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftArm1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(3, 125).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6771F, 3.4485F, 0.249F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(43, 104).addBox(-0.8F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 114).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9402F, 6.8426F, -1.1079F, -1.7194F, -0.3023F, 0.5988F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r314 = leftHand.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(87, 68).addBox(0.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftHand.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(85, 105).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1181F, 8.867F, -8.9508F, 0.8714F, -0.4678F, 0.1734F));

		PartDefinition cube_r316 = rightArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(127, 79).addBox(-0.8F, -0.625F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0734F, -0.0675F, 0.1906F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r317 = rightArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(122, 133).addBox(-0.5F, -1.9F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 132).addBox(-0.5F, -1.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9477F, 1.0557F, -0.8789F, -0.3218F, 0.7676F, -0.1498F));

		PartDefinition cube_r318 = rightArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(122, 126).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9477F, 1.0557F, -0.8789F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r319 = rightArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(126, 112).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8229F, 1.0987F, -1.4704F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition cube_r320 = rightArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 120).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6771F, 3.5184F, 0.3785F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(106, 126).addBox(-0.5F, -1.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6771F, 3.4485F, 0.249F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(92, 105).addBox(-0.2F, -1.2307F, -0.4734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 114).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9402F, 6.8426F, -1.1079F, -1.2595F, 0.2341F, 0.063F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r322 = rightHand.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 0).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r323 = rightHand.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(106, 5).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7698F, -7.8672F, -0.3099F, -0.1664F, 0.053F));

		PartDefinition cube_r324 = neck1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(90, 130).addBox(0.0F, -3.0459F, -0.0161F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r325 = neck1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.1079F, 0.591F, -1.6626F));

		PartDefinition cube_r326 = neck1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(125, 14).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.4371F, 0.4246F, -1.0064F));

		PartDefinition cube_r327 = neck1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(125, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.5653F, 0.2119F, -0.604F));

		PartDefinition cube_r328 = neck1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(125, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.5653F, -0.2119F, 0.604F));

		PartDefinition cube_r329 = neck1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(125, 14).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.4371F, -0.4246F, 1.0064F));

		PartDefinition cube_r330 = neck1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(88, 34).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.1079F, -0.591F, 1.6626F));

		PartDefinition cube_r331 = neck1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(97, 97).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7921F, -2.0254F, 0.1232F, -0.1299F, -0.016F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(111, 131).addBox(0.0F, -2.4816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0431F, -0.7163F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(34, 125).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9878F, -0.5629F, 0.2054F, 0.5609F, -1.0212F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(97, 81).mirror().addBox(-6.737F, -0.79F, -0.4755F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9878F, -0.5629F, -0.0822F, 0.5885F, -1.5418F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(97, 81).addBox(1.737F, -0.79F, -0.4755F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9878F, -0.5629F, -0.0822F, -0.5885F, 1.5418F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(34, 125).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9878F, -0.5629F, 0.2054F, -0.5609F, 1.0212F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(96, 67).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2498F, -2.825F, -0.3663F, -0.2264F, -0.0976F));

		PartDefinition cube_r338 = neck5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(9, 98).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.0754F, -5.7788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck5.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8097F, -0.7743F, -0.2592F, 1.0687F, -1.6638F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(125, 34).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8097F, -0.7743F, 0.5074F, 1.0095F, -0.7889F));

		PartDefinition cube_r341 = neck5.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(125, 36).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8097F, -2.7743F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(111, 47).mirror().addBox(-4.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8097F, -2.7743F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r343 = neck5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(111, 47).addBox(1.7911F, -0.3926F, -0.2462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8097F, -2.7743F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r344 = neck5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(125, 36).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8097F, -2.7743F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r345 = neck5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(125, 34).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8097F, -0.7743F, 0.5074F, -1.0095F, 0.7889F));

		PartDefinition cube_r346 = neck5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(77, 8).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8097F, -0.7743F, -0.2592F, -1.0687F, 1.6638F));

		PartDefinition cube_r347 = neck5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(96, 130).addBox(0.0F, -2.8566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7059F, -2.7414F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r348 = neck5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 130).addBox(0.0F, -2.5566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9842F, -0.7608F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1819F, -2.5815F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r349 = neck4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(125, 38).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r350 = neck4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(125, 40).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r351 = neck4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(41, 125).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.508F, 0.9362F, -0.7795F));

		PartDefinition cube_r352 = neck4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(125, 42).mirror().addBox(-3.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1513F, 1.0193F, -1.5615F));

		PartDefinition cube_r353 = neck4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(125, 42).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1513F, -1.0193F, 1.5615F));

		PartDefinition cube_r354 = neck4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(41, 125).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.508F, -0.9362F, 0.7795F));

		PartDefinition cube_r355 = neck4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(125, 40).addBox(1.7663F, -0.3906F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r356 = neck4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(125, 38).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r357 = neck4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(102, 130).addBox(0.0F, -1.6677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9211F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(99, 130).addBox(0.0F, -1.9677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r359 = neck4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(84, 12).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.4378F, -0.0791F, -0.037F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(125, 44).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3293F, 0.5553F, -1.0638F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(126, 30).mirror().addBox(-3.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0326F, 0.6359F, -1.584F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(125, 46).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(48, 125).mirror().addBox(-3.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0339F, 0.6365F, -1.5305F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(48, 125).addBox(1.8627F, -0.3478F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0339F, -0.6365F, 1.5305F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(125, 46).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(126, 30).addBox(1.8842F, -0.3479F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0326F, -0.6359F, 1.584F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(125, 44).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3293F, -0.5553F, 1.0638F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(17, 135).addBox(0.5F, -1.1458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(105, 130).addBox(0.5F, -1.269F, 0.0228F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 25).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(125, 53).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r372 = neck.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(125, 55).mirror().addBox(-3.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r373 = neck.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(125, 55).addBox(1.6944F, -0.3859F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r374 = neck.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(20, 135).addBox(0.5F, -1.3207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r375 = neck.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(18, 98).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r376 = neck.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(125, 53).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck6.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(125, 57).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.5254F, 0.741F, -0.9857F));

		PartDefinition cube_r378 = neck6.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(108, 95).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0783F, 0.876F, -1.5935F));

		PartDefinition cube_r379 = neck6.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(108, 95).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0783F, -0.876F, 1.5935F));

		PartDefinition cube_r380 = neck6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(108, 130).addBox(0.5F, -1.9207F, -0.1013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(53, 109).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(125, 57).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.5254F, -0.741F, 0.9857F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1696F, -1.2074F, -0.1659F, 0.0011F, -0.1309F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(102, 62).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -1.8408F, -4.4351F, -1.7846F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(102, 57).addBox(-1.0F, -2.94F, -0.0924F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.4519F, -7.3211F, -1.4704F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(117, 79).addBox(-0.5F, -0.9819F, -0.0131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -1.4519F, -7.3211F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(32, 110).addBox(-0.5F, -4.709F, -0.4836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.7981F, -11.4711F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(77, 116).addBox(-0.5F, -1.0021F, -0.0488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.0981F, -12.8711F, -0.8421F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(116, 49).addBox(-0.5F, -1.9514F, -0.0656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.0981F, -12.8711F, -0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(104, 109).addBox(-0.5F, -1.9791F, -0.0241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.7981F, -11.4711F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(45, 116).addBox(-0.5F, -2.8619F, -0.1406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.7981F, -11.4711F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 132).addBox(-0.505F, -1.989F, -0.1298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.8589F, -13.7403F, -0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(131, 112).addBox(-0.505F, -0.9971F, 0.0265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.8589F, -13.7403F, -0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(131, 103).addBox(-0.5F, -1.0003F, 0.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.8589F, -13.5403F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(131, 92).addBox(-0.5F, -0.9916F, 0.0028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8589F, -13.7403F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(38, 116).addBox(-0.5F, -0.0162F, -1.9985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.9207F, -3.666F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(116, 21).addBox(-0.5F, -0.8162F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -1.5521F, -2.7365F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(78, 61).addBox(-0.5F, -0.9044F, 0.8162F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 5.2589F, -13.5403F, 0.2523F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5F, -0.8F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 3.4016F, -6.9696F, 0.2697F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(17, 70).addBox(-1.5F, -0.325F, -2.05F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.4688F, -4.1472F, 0.1127F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(131, 85).addBox(-0.5F, -0.2082F, -0.7557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5521F, -2.7365F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, 0.3621F, -4.3218F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2775F, 1.3132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(27, 99).addBox(-1.5F, -0.4145F, -0.8068F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1665F, -2.5959F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(60, 98).addBox(-1.5F, 0.1617F, -0.6623F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1665F, -2.5959F, 0.8203F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8252F, 3.7941F, -5.7247F, 0.0F, 0.0524F, -0.0698F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(44, 127).addBox(-0.625F, -1.15F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.9283F, -5.0703F, 2.5151F, 1.7694F, 0.5903F, -0.8895F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.65F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.4992F, -0.3795F, -2.1766F, 0.2521F, 0.0788F, 0.0537F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(74, 109).addBox(-0.5261F, -1.062F, -1.9472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.6906F, -3.4181F, -2.0191F, 0.7638F, -0.0123F, 0.2789F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(67, 109).addBox(-0.5013F, -1.0683F, -0.093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.6906F, -3.4181F, -2.0191F, 0.6263F, 0.0218F, 0.2787F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(115, 89).addBox(0.0602F, -0.0311F, -1.8081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.6906F, -5.318F, -1.0191F, 2.1843F, 0.1795F, 0.4169F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(118, 57).addBox(-1.0F, -0.0319F, -0.0131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(-0.6063F, -5.3129F, -1.6002F, -1.1755F, 0.2106F, 0.0888F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(118, 53).addBox(-1.0F, -0.0819F, -0.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(-0.4073F, -5.4621F, -0.7353F, -1.385F, 0.2106F, 0.0888F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(17, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2991F, -5.1732F, 1.187F, -1.734F, 0.1795F, 0.4169F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(132, 14).addBox(0.0542F, -1.4877F, -1.8295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6906F, -5.318F, -1.0191F, -2.3448F, 0.1795F, 0.4169F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(81, 125).addBox(0.0542F, -1.5076F, -1.8283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.6906F, -5.318F, -1.0191F, -2.8684F, 0.1795F, 0.4169F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(31, 115).addBox(-0.5F, -0.6F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.475F, -1.4422F, 5.5813F, -0.6667F, -0.0349F, -0.0175F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(101, 126).addBox(-0.55F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6182F, -4.979F, -2.1733F, -1.3778F, -0.0236F, 0.0085F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(8, 126).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6182F, -4.979F, -2.1733F, -1.3768F, 0.1049F, 0.0336F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(117, 125).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.728F, -4.6223F, -3.101F, -2.7731F, 0.1049F, 0.0336F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(111, 42).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9427F, -3.6254F, -4.8215F, 2.0964F, 0.1049F, 0.0336F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(39, 111).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1494F, -2.411F, -6.3971F, 0.6565F, 0.1049F, 0.0336F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(132, 32).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2492F, -1.7368F, -7.1289F, -0.827F, 0.1049F, 0.0336F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(132, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3336F, -0.8947F, -7.6616F, -2.136F, 0.1049F, 0.0336F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(132, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.397F, 0.058F, -7.9587F, 2.8382F, 0.1049F, 0.0336F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(132, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4349F, 1.0564F, -8.0001F, 1.5292F, 0.1049F, 0.0336F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(131, 65).addBox(-0.9093F, -1.0383F, -9.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0061F, -0.7227F, 1.0888F, 0.3075F, 0.1049F, 0.0336F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(115, 17).addBox(-0.5F, -0.225F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3334F, 0.9952F, -7.0558F, 0.3685F, 0.1049F, 0.0336F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(34, 127).addBox(-0.5F, -0.85F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1373F, 0.2133F, -5.4436F, 0.0631F, 0.1049F, 0.0336F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(81, 94).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8015F, 0.3692F, -2.2047F, 0.3293F, 0.1049F, 0.0336F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 114).addBox(-0.9093F, -3.6576F, -1.5231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0061F, -0.7227F, 1.0888F, 0.3336F, 0.1049F, 0.0336F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(84, 38).addBox(-0.9093F, -4.5546F, -7.6543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0061F, -0.7227F, 1.0888F, 0.5954F, 0.1049F, 0.0336F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(96, 126).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(126, 93).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.577F, -0.1664F, -1.3289F, 0.4122F, 0.1049F, 0.0336F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(70, 126).addBox(-0.5F, -1.225F, 2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 126).addBox(-0.5F, -1.225F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 126).addBox(-0.5F, -1.2F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 126).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9675F, 1.4565F, -4.5186F, 0.4645F, 0.1049F, 0.0336F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(18, 126).addBox(-0.5F, -1.1F, 1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 126).addBox(-0.5F, -0.6F, 0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 125).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2761F, 1.9109F, -7.3041F, 0.3773F, 0.1049F, 0.0336F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(56, 102).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8063F, 0.3941F, -2.2425F, 0.3249F, 0.1049F, 0.0336F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(102, 50).addBox(-0.9093F, -3.9358F, -1.7104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0061F, -0.7227F, 1.0888F, 0.2551F, 0.1049F, 0.0336F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(41, 120).addBox(-0.8948F, -3.6624F, -0.0327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0061F, -0.7227F, 1.0888F, 0.2531F, -0.0349F, 0.0F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(46, 120).addBox(-0.5F, -0.675F, 0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 114).addBox(-0.5F, -1.675F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3645F, -2.9657F, 1.7943F, -0.1658F, 0.0349F, -0.0002F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(49, 131).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.419F, -4.1717F, 4.751F, -0.1745F, -0.0323F, -0.0219F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(36, 120).addBox(-0.1031F, -2.887F, -0.1293F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4457F, -5.6043F, 2.6502F, -2.0771F, 0.056F, 0.3715F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(120, 5).addBox(-0.8586F, -0.1407F, -0.1203F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.2543F, -5.3293F, 2.7002F, -1.0498F, -0.0733F, 0.3642F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(125, 73).addBox(-0.129F, -1.887F, -0.1364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4457F, -5.6043F, 2.6502F, -1.918F, 0.3803F, 1.069F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(125, 69).addBox(-0.6754F, -0.1407F, 0.3854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.2543F, -5.3293F, 2.7002F, -1.2235F, -0.4029F, 1.0627F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(27, 103).addBox(-2.05F, -2.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1855F, -3.1952F, 1.0554F, -0.1132F, 0.079F, 0.0045F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(102, 45).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3321F, -4.186F, 2.0556F, -0.009F, -0.0173F, -0.0002F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(60, 109).addBox(-0.5F, -0.425F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4162F, -4.1246F, 4.6952F, -0.3665F, -0.0349F, -0.0175F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(126, 103).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4236F, -3.4485F, 5.2447F, 0.6545F, -0.0349F, -0.0175F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(125, 59).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4009F, -2.1959F, 5.2204F, 0.48F, -0.0349F, -0.0175F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(3, 120).addBox(-0.5F, -3.025F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3635F, -0.6047F, 4.9447F, 0.4014F, -0.0349F, -0.0175F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(132, 41).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.32F, -4.4686F, 3.0849F, 1.1345F, -0.0349F, -0.0175F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(133, 71).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(132, 115).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3042F, -3.3729F, 3.1807F, 1.6581F, -0.0349F, -0.0175F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(56, 120).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2962F, -1.3699F, 3.9518F, 0.48F, -0.0349F, -0.0175F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(132, 53).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2761F, -1.9076F, 3.1089F, 1.0036F, -0.0349F, -0.0175F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(132, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2789F, -2.8316F, 2.7264F, 1.9635F, -0.0349F, -0.0175F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(133, 20).addBox(-0.4984F, 0.7239F, -1.2565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, -0.2677F, 0.119F, 0.0253F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(114, 132).addBox(-0.4984F, -0.8909F, -1.3497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, 0.9541F, 0.119F, 0.0253F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(133, 6).addBox(-0.5032F, -1.4058F, -0.8532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(130, 132).addBox(-0.5032F, -1.9058F, -0.8532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, 2.1885F, 0.0973F, 0.0428F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(132, 99).addBox(-0.5032F, -0.1979F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, 0.705F, 0.0973F, 0.0428F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(132, 88).addBox(-0.5032F, -0.8262F, -0.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, -0.7F, 0.0973F, 0.0428F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(132, 118).addBox(-0.5032F, -0.9189F, -1.9641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(84, 132).addBox(-0.5032F, -0.9189F, -1.3641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, -2.0526F, 0.0973F, 0.0428F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(132, 125).addBox(-0.4984F, 0.0545F, -1.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(132, 80).addBox(-0.4984F, 0.0545F, -1.4071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, -2.6239F, 0.119F, 0.0253F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(79, 132).addBox(-0.4984F, -0.0467F, -0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, 2.394F, 0.119F, 0.0253F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(132, 77).addBox(-0.4984F, -0.84F, -0.7165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.994F, -1.2254F, -6.1585F, 0.8668F, 0.119F, 0.0253F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(74, 132).addBox(-0.35F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9632F, -0.9373F, -4.33F, 0.2202F, 0.1049F, 0.0336F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(133, 50).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(133, 47).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7757F, -0.9233F, -2.4072F, -3.061F, 0.1049F, 0.0336F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4228F, -3.7609F, 0.0369F, 0.866F, 0.1049F, 0.0336F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(24, 118).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4637F, -1.7766F, 0.2833F, 1.695F, 0.1049F, 0.0336F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(133, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5617F, -1.0771F, -0.4247F, 2.3495F, 0.1049F, 0.0336F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(133, 29).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7806F, -2.2564F, -2.8794F, -2.0138F, 0.1049F, 0.0336F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(26, 133).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6872F, -3.0154F, -2.235F, -0.7048F, 0.1049F, 0.0336F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(127, 24).addBox(-0.5F, 0.0F, 0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7214F, -2.8318F, -2.501F, 0.6042F, 0.1049F, 0.0336F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(44, 131).addBox(-0.4606F, -5.8456F, 1.8422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 131).addBox(-0.6855F, -5.8456F, 1.8422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3439F, -2.9727F, 7.2888F, 1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(34, 131).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.1246F, -4.2622F, 2.3751F, 1.4573F, 0.0524F, 0.0F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(130, 129).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.159F, -4.5762F, 1.7193F, 0.192F, 0.0524F, 0.0F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(55, 125).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1183F, -2.268F, 2.5329F, 0.2088F, 0.0281F, -0.0442F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(122, 130).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0943F, -1.5295F, 2.2265F, 1.1775F, 0.0281F, -0.0442F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(132, 38).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.169F, -2.46F, 1.0343F, -2.9677F, 0.0281F, -0.0442F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(132, 35).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2077F, -3.247F, 0.8959F, -1.5714F, 0.0281F, -0.0442F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(130, 109).addBox(-0.5F, 0.075F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1747F, -2.4526F, 0.8195F, 2.2247F, 0.0281F, -0.0442F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(130, 74).addBox(-0.5F, -0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2059F, -4.1844F, 0.8239F, -1.5097F, 0.0524F, 0.0F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(130, 59).addBox(-0.5F, -0.475F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1673F, -4.277F, 1.5604F, -0.48F, 0.0524F, 0.0F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(101, 90).addBox(-0.9399F, -3.9952F, -0.1253F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1439F, -0.4727F, 3.0888F, 0.0872F, -0.0356F, -0.0159F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8252F, 3.7941F, -5.7247F, 0.0F, -0.0524F, 0.0698F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(44, 127).mirror().addBox(-0.375F, -1.15F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.9283F, -5.0703F, 2.5151F, 1.7694F, -0.5903F, 0.8895F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, -0.65F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.4992F, -0.3795F, -2.1766F, 0.2521F, -0.0788F, -0.0537F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(74, 109).mirror().addBox(-0.4739F, -1.062F, -1.9472F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.6906F, -3.4181F, -2.0191F, 0.7638F, 0.0123F, -0.2789F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(67, 109).mirror().addBox(-0.4987F, -1.0683F, -0.093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.6906F, -3.4181F, -2.0191F, 0.6263F, -0.0218F, -0.2787F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(115, 89).mirror().addBox(-1.0602F, -0.0311F, -1.8081F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.6906F, -5.318F, -1.0191F, 2.1843F, -0.1795F, -0.4169F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(118, 57).mirror().addBox(0.0F, -0.0319F, -0.0131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)).mirror(false), PartPose.offsetAndRotation(0.6063F, -5.3129F, -1.6002F, -1.1755F, -0.2106F, -0.0888F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(118, 53).mirror().addBox(0.0F, -0.0819F, -0.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0167F)).mirror(false), PartPose.offsetAndRotation(0.4073F, -5.4621F, -0.7353F, -1.385F, -0.2106F, -0.0888F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(17, 118).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2991F, -5.1732F, 1.187F, -1.734F, -0.1795F, -0.4169F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(132, 14).mirror().addBox(-1.0542F, -1.4877F, -1.8295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6906F, -5.318F, -1.0191F, -2.3448F, -0.1795F, -0.4169F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(81, 125).mirror().addBox(-1.0542F, -1.5076F, -1.8283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.6906F, -5.318F, -1.0191F, -2.8684F, -0.1795F, -0.4169F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(31, 115).mirror().addBox(-0.5F, -0.6F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.475F, -1.4422F, 5.5813F, -0.6667F, 0.0349F, 0.0175F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(101, 126).mirror().addBox(-0.45F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6182F, -4.979F, -2.1733F, -1.3778F, 0.0236F, -0.0085F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(8, 126).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6182F, -4.979F, -2.1733F, -1.3768F, -0.1049F, -0.0336F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(117, 125).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.728F, -4.6223F, -3.101F, -2.7731F, -0.1049F, -0.0336F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(111, 42).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9427F, -3.6254F, -4.8215F, 2.0964F, -0.1049F, -0.0336F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1494F, -2.411F, -6.3971F, 0.6565F, -0.1049F, -0.0336F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(132, 32).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2492F, -1.7368F, -7.1289F, -0.827F, -0.1049F, -0.0336F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(132, 26).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3336F, -0.8947F, -7.6616F, -2.136F, -0.1049F, -0.0336F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.397F, 0.058F, -7.9587F, 2.8382F, -0.1049F, -0.0336F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(132, 17).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4349F, 1.0564F, -8.0001F, 1.5292F, -0.1049F, -0.0336F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(131, 65).mirror().addBox(-0.0907F, -1.0383F, -9.3043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0061F, -0.7227F, 1.0888F, 0.3075F, -0.1049F, -0.0336F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(115, 17).mirror().addBox(-0.5F, -0.225F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3334F, 0.9952F, -7.0558F, 0.3685F, -0.1049F, -0.0336F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(34, 127).mirror().addBox(-0.5F, -0.85F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.1373F, 0.2133F, -5.4436F, 0.0631F, -0.1049F, -0.0336F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(81, 94).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.8015F, 0.3692F, -2.2047F, 0.3293F, -0.1049F, -0.0336F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(-0.0907F, -3.6576F, -1.5231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0061F, -0.7227F, 1.0888F, 0.3336F, -0.1049F, -0.0336F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.0907F, -4.5546F, -7.6543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0061F, -0.7227F, 1.0888F, 0.5954F, -0.1049F, -0.0336F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(96, 126).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(126, 93).mirror().addBox(-0.5F, -1.0F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.577F, -0.1664F, -1.3289F, 0.4122F, -0.1049F, -0.0336F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(70, 126).mirror().addBox(-0.5F, -1.225F, 2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 126).mirror().addBox(-0.5F, -1.225F, 1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 126).mirror().addBox(-0.5F, -1.2F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 126).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9675F, 1.4565F, -4.5186F, 0.4645F, -0.1049F, -0.0336F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(18, 126).mirror().addBox(-0.5F, -1.1F, 1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(13, 126).mirror().addBox(-0.5F, -0.6F, 0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 125).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2761F, 1.9109F, -7.3041F, 0.3773F, -0.1049F, -0.0336F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8063F, 0.3941F, -2.2425F, 0.3249F, -0.1049F, -0.0336F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-0.0907F, -3.9358F, -1.7104F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0061F, -0.7227F, 1.0888F, 0.2551F, -0.1049F, -0.0336F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(41, 120).mirror().addBox(-0.1052F, -3.6624F, -0.0327F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0061F, -0.7227F, 1.0888F, 0.2531F, 0.0349F, 0.0F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(46, 120).mirror().addBox(-0.5F, -0.675F, 0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 114).mirror().addBox(-0.5F, -1.675F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3645F, -2.9657F, 1.7943F, -0.1658F, -0.0349F, 0.0002F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(49, 131).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.419F, -4.1717F, 4.751F, -0.1745F, 0.0323F, 0.0219F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(36, 120).mirror().addBox(-0.8969F, -2.887F, -0.1293F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.4457F, -5.6043F, 2.6502F, -2.0771F, -0.056F, -0.3715F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(120, 5).mirror().addBox(-0.1414F, -0.1407F, -0.1203F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.2543F, -5.3293F, 2.7002F, -1.0498F, 0.0733F, -0.3642F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(125, 73).mirror().addBox(-0.871F, -1.887F, -0.1364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.4457F, -5.6043F, 2.6502F, -1.918F, -0.3803F, -1.069F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(125, 69).mirror().addBox(-0.3246F, -0.1407F, 0.3854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.2543F, -5.3293F, 2.7002F, -1.2235F, 0.4029F, -1.0627F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(27, 103).mirror().addBox(0.05F, -2.0F, -1.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1855F, -3.1952F, 1.0554F, -0.1132F, -0.079F, -0.0045F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(102, 45).mirror().addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3321F, -4.186F, 2.0556F, -0.009F, 0.0173F, 0.0002F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(60, 109).mirror().addBox(-0.5F, -0.425F, -2.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4162F, -4.1246F, 4.6952F, -0.3665F, 0.0349F, 0.0175F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(126, 103).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4236F, -3.4485F, 5.2447F, 0.6545F, 0.0349F, 0.0175F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(125, 59).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4009F, -2.1959F, 5.2204F, 0.48F, 0.0349F, 0.0175F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(3, 120).mirror().addBox(-0.5F, -3.025F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3635F, -0.6047F, 4.9447F, 0.4014F, 0.0349F, 0.0175F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(132, 41).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.32F, -4.4686F, 3.0849F, 1.1345F, 0.0349F, 0.0175F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(133, 71).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(132, 115).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3042F, -3.3729F, 3.1807F, 1.6581F, 0.0349F, 0.0175F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(56, 120).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2962F, -1.3699F, 3.9518F, 0.48F, 0.0349F, 0.0175F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(132, 53).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2761F, -1.9076F, 3.1089F, 1.0036F, 0.0349F, 0.0175F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(132, 44).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2789F, -2.8316F, 2.7264F, 1.9635F, 0.0349F, 0.0175F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(133, 20).mirror().addBox(-0.5016F, 0.7239F, -1.2565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, -0.2677F, -0.119F, -0.0253F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(114, 132).mirror().addBox(-0.5016F, -0.8909F, -1.3497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, 0.9541F, -0.119F, -0.0253F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(133, 6).mirror().addBox(-0.4968F, -1.4058F, -0.8532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(130, 132).mirror().addBox(-0.4968F, -1.9058F, -0.8532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, 2.1885F, -0.0973F, -0.0428F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(132, 99).mirror().addBox(-0.4968F, -0.1979F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, 0.705F, -0.0973F, -0.0428F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(132, 88).mirror().addBox(-0.4968F, -0.8262F, -0.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, -0.7F, -0.0973F, -0.0428F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(132, 118).mirror().addBox(-0.4968F, -0.9189F, -1.9641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(84, 132).mirror().addBox(-0.4968F, -0.9189F, -1.3641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, -2.0526F, -0.0973F, -0.0428F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(132, 125).mirror().addBox(-0.5016F, 0.0545F, -1.7071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(132, 80).mirror().addBox(-0.5016F, 0.0545F, -1.4071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, -2.6239F, -0.119F, -0.0253F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(79, 132).mirror().addBox(-0.5016F, -0.0467F, -0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, 2.394F, -0.119F, -0.0253F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(132, 77).mirror().addBox(-0.5016F, -0.84F, -0.7165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.994F, -1.2254F, -6.1585F, 0.8668F, -0.119F, -0.0253F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(74, 132).mirror().addBox(-0.65F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9632F, -0.9373F, -4.33F, 0.2202F, -0.1049F, -0.0336F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(133, 50).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(133, 47).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7757F, -0.9233F, -2.4072F, -3.061F, -0.1049F, -0.0336F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4228F, -3.7609F, 0.0369F, 0.866F, -0.1049F, -0.0336F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(24, 118).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4637F, -1.7766F, 0.2833F, 1.695F, -0.1049F, -0.0336F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(133, 68).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5617F, -1.0771F, -0.4247F, 2.3495F, -0.1049F, -0.0336F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(133, 29).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7806F, -2.2564F, -2.8794F, -2.0138F, -0.1049F, -0.0336F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(26, 133).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6872F, -3.0154F, -2.235F, -0.7048F, -0.1049F, -0.0336F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(127, 24).mirror().addBox(-0.5F, 0.0F, 0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7214F, -2.8318F, -2.501F, 0.6042F, -0.1049F, -0.0336F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(44, 131).mirror().addBox(-0.5394F, -5.8456F, 1.8422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(39, 131).mirror().addBox(-0.3144F, -5.8456F, 1.8422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3439F, -2.9727F, 7.2888F, 1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(34, 131).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.1246F, -4.2622F, 2.3751F, 1.4573F, -0.0524F, 0.0F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(130, 129).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.159F, -4.5762F, 1.7193F, 0.192F, -0.0524F, 0.0F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(55, 125).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1183F, -2.268F, 2.5329F, 0.2088F, -0.0281F, 0.0442F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(122, 130).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0943F, -1.5295F, 2.2265F, 1.1775F, -0.0281F, 0.0442F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(132, 38).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.169F, -2.46F, 1.0343F, -2.9677F, -0.0281F, 0.0442F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(132, 35).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2077F, -3.247F, 0.8959F, -1.5714F, -0.0281F, 0.0442F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(130, 109).mirror().addBox(-0.5F, 0.075F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1747F, -2.4526F, 0.8195F, 2.2247F, -0.0281F, 0.0442F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(130, 74).mirror().addBox(-0.5F, -0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2059F, -4.1844F, 0.8239F, -1.5097F, -0.0524F, 0.0F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(130, 59).mirror().addBox(-0.5F, -0.475F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1673F, -4.277F, 1.5604F, -0.48F, -0.0524F, 0.0F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(101, 90).mirror().addBox(-0.0601F, -3.9952F, -0.1253F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1439F, -0.4727F, 3.0888F, 0.0872F, 0.0356F, 0.0159F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1405F, 0.439F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(117, 83).mirror().addBox(0.1F, -0.3403F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, -0.2967F, -0.0349F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(84, 117).mirror().addBox(0.1F, -0.1826F, -2.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, -0.0611F, -0.0349F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(121, 112).mirror().addBox(0.1F, -1.5083F, -4.8321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.1222F, -0.0349F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(8, 122).mirror().addBox(0.1F, -1.1382F, -3.9799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.0262F, -0.0349F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(128, 20).mirror().addBox(0.0426F, 0.7131F, -1.1359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.0087F, -0.1222F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(0.075F, 0.6712F, -5.1397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.0087F, -0.0349F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(13, 122).mirror().addBox(-0.2291F, -1.3741F, -6.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 16).mirror().addBox(-0.2291F, -1.3741F, -7.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 122).mirror().addBox(-0.2291F, -1.0741F, -8.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 122).mirror().addBox(-0.2291F, -1.3741F, -5.8418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 89).mirror().addBox(-0.2291F, -1.0991F, -4.9418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 122).mirror().addBox(-0.2291F, -0.9241F, -3.1418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 116).mirror().addBox(-0.2291F, -0.9991F, -4.0418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.0585F, -0.1685F, -0.0126F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(63, 114).mirror().addBox(-0.2284F, -0.6417F, -7.5318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.1146F, -0.171F, -0.0021F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(127, 119).mirror().addBox(-0.2284F, -0.5049F, -8.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.0971F, -0.171F, -0.0021F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(10, 118).mirror().addBox(0.1F, -0.6656F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.2269F, -0.0349F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(54, 129).mirror().addBox(0.1F, -0.0203F, -2.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.2793F, -0.0349F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(118, 10).mirror().addBox(0.1F, -0.3371F, -0.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.5236F, -0.0349F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(70, 114).mirror().addBox(-0.2284F, -0.4987F, -7.5149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.167F, -0.171F, -0.0021F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(75, 129).mirror().addBox(-0.2284F, 1.5918F, -8.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -0.121F, -0.171F, -0.0021F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(80, 129).mirror().addBox(-0.2284F, -6.0959F, -6.7122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.8651F, -0.171F, -0.0021F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(127, 126).mirror().addBox(-0.2284F, -3.704F, -8.4482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 0.4724F, -0.171F, -0.0021F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(110, 79).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.2043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(110, 84).mirror().addBox(-0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.2043F, 0.2923F, -0.0969F, 0.0654F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(85, 129).mirror().addBox(0.1F, -0.2208F, -1.8431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 0.3927F, -0.0349F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(23, 122).mirror().addBox(0.1F, -0.8232F, -3.1409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, -0.0785F, -0.0349F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(114, 129).mirror().addBox(0.1F, -3.6145F, -1.0969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, 1.8064F, -0.0349F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(61, 122).mirror().addBox(0.1F, -1.578F, 3.3941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, -3.0369F, -0.0349F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(129, 122).mirror().addBox(0.1F, 4.2482F, 0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0204F, 0.463F, 0.0419F, -1.5097F, -0.0349F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(66, 122).mirror().addBox(0.0676F, 0.1211F, -1.0043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -0.1309F, -0.1222F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(118, 33).mirror().addBox(0.0676F, 0.0099F, -0.9244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -1.405F, -0.1222F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(111, 55).mirror().addBox(0.0676F, -0.9911F, 0.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -2.8885F, -0.1222F, 0.0F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(118, 37).mirror().addBox(0.0676F, -2.1346F, 0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 2.9583F, -0.1222F, 0.0F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(97, 103).mirror().addBox(0.0676F, -0.4204F, 2.8773F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -3.0369F, -0.1222F, 0.0F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(0.0676F, -1.3253F, 2.549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, -3.1241F, -0.1222F, 0.0F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(118, 41).mirror().addBox(0.0676F, -2.0791F, 2.2768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8203F, 0.463F, -4.758F, 2.9845F, -0.1222F, 0.0F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(110, 84).addBox(0.6193F, -0.0979F, 2.7933F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.2043F, 0.2923F, 0.0969F, -0.0654F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(110, 79).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2278F, -4.2043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(127, 126).addBox(-0.7716F, -3.704F, -8.4482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.4724F, 0.171F, 0.0021F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(80, 129).addBox(-0.7716F, -6.0959F, -6.7122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.8651F, 0.171F, 0.0021F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(75, 129).addBox(-0.7716F, 1.5918F, -8.0078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -0.121F, 0.171F, 0.0021F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(70, 114).addBox(-0.7716F, -0.4987F, -7.5149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.167F, 0.171F, 0.0021F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(66, 122).addBox(-1.0676F, 0.1211F, -1.0043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -0.1309F, 0.1222F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(85, 129).addBox(-1.1F, -0.2208F, -1.8431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.3927F, 0.0349F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(118, 10).addBox(-1.1F, -0.3371F, -0.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.5236F, 0.0349F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(129, 122).addBox(-1.1F, 4.2482F, 0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, -1.5097F, 0.0349F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(61, 122).addBox(-1.1F, -1.578F, 3.3941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, -3.0369F, 0.0349F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(114, 129).addBox(-1.1F, -3.6145F, -1.0969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 1.8064F, 0.0349F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(54, 129).addBox(-1.1F, -0.0203F, -2.7087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.2793F, 0.0349F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(10, 118).addBox(-1.1F, -0.6656F, -0.9192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.2269F, 0.0349F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(127, 119).addBox(-0.7716F, -0.5049F, -8.3855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.0971F, 0.171F, 0.0021F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(63, 114).addBox(-0.7716F, -0.6417F, -7.5318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.1146F, 0.171F, 0.0021F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(18, 122).addBox(-0.7709F, -1.0741F, -8.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(122, 16).addBox(-0.7709F, -1.3741F, -7.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(122, 116).addBox(-0.7709F, -0.9991F, -4.0418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 122).addBox(-0.7709F, -0.9241F, -3.1418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(122, 89).addBox(-0.7709F, -1.0991F, -4.9418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 122).addBox(-0.7709F, -1.3741F, -5.8418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 122).addBox(-0.7709F, -1.3741F, -6.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.0585F, 0.1685F, 0.0126F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(0, 129).addBox(-1.075F, 0.6712F, -5.1397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.0087F, 0.0349F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(128, 20).addBox(-1.0426F, 0.7131F, -1.1359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 0.0087F, 0.1222F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(8, 122).addBox(-1.1F, -1.1382F, -3.9799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(118, 37).addBox(-1.0676F, -2.1346F, 0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 2.9583F, 0.1222F, 0.0F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(118, 41).addBox(-1.0676F, -2.0791F, 2.2768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, 2.9845F, 0.1222F, 0.0F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(104, 0).addBox(-1.0676F, -1.3253F, 2.549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -3.1241F, 0.1222F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(97, 103).addBox(-1.0676F, -0.4204F, 2.8773F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -3.0369F, 0.1222F, 0.0F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(111, 55).addBox(-1.0676F, -0.9911F, 0.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -2.8885F, 0.1222F, 0.0F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(118, 33).addBox(-1.0676F, 0.0099F, -0.9244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8203F, 0.463F, -4.758F, -1.405F, 0.1222F, 0.0F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(121, 112).addBox(-1.1F, -1.5083F, -4.8321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, 0.1222F, 0.0349F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(84, 117).addBox(-1.1F, -0.1826F, -2.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, -0.0611F, 0.0349F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(23, 122).addBox(-1.1F, -0.8232F, -3.1409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, -0.0785F, 0.0349F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(117, 83).addBox(-1.1F, -0.3403F, -2.2933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.0204F, 0.463F, 0.0419F, -0.2967F, 0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 140, 140);
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