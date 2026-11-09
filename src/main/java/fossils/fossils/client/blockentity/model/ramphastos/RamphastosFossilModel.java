package fossils.fossils.client.blockentity.model.ramphastos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RamphastosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot4;
	private final ModelPart leftToes4;
	private final ModelPart leftFoot3;
	private final ModelPart leftToes3;
	private final ModelPart leftFoot5;
	private final ModelPart leftToes5;
	private final ModelPart leftFoot2;
	private final ModelPart leftToes2;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot4;
	private final ModelPart rightToes4;
	private final ModelPart rightFoot3;
	private final ModelPart rightToes3;
	private final ModelPart rightFoot5;
	private final ModelPart rightToes5;
	private final ModelPart rightFoot2;
	private final ModelPart rightToes2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck10;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public RamphastosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot4 = this.leftLeg3.getChild("leftFoot4");
		this.leftToes4 = this.leftFoot4.getChild("leftToes4");
		this.leftFoot3 = this.leftLeg3.getChild("leftFoot3");
		this.leftToes3 = this.leftFoot3.getChild("leftToes3");
		this.leftFoot5 = this.leftLeg3.getChild("leftFoot5");
		this.leftToes5 = this.leftFoot5.getChild("leftToes5");
		this.leftFoot2 = this.leftLeg3.getChild("leftFoot2");
		this.leftToes2 = this.leftFoot2.getChild("leftToes2");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot4 = this.rightLeg3.getChild("rightFoot4");
		this.rightToes4 = this.rightFoot4.getChild("rightToes4");
		this.rightFoot3 = this.rightLeg3.getChild("rightFoot3");
		this.rightToes3 = this.rightFoot3.getChild("rightToes3");
		this.rightFoot5 = this.rightLeg3.getChild("rightFoot5");
		this.rightToes5 = this.rightFoot5.getChild("rightToes5");
		this.rightFoot2 = this.rightLeg3.getChild("rightFoot2");
		this.rightToes2 = this.rightFoot2.getChild("rightToes2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail5 = this.tail2.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck10 = this.neck5.getChild("neck10");
		this.neck4 = this.neck10.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.6825F, 2.5838F, -0.0378F, 0.3924F, -0.0145F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9228F, 0.0885F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 119).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.1209F, 0.9957F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 110).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8028F, 2.3737F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9228F, 0.0885F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 22).addBox(-0.503F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.003F, 3.1004F, 4.0726F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 28).mirror().addBox(-5.2148F, -1.8184F, -0.6126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.815F, -2.7408F, -0.0161F, -0.1441F, -1.4237F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 81).mirror().addBox(-2.8273F, -0.4674F, -0.6126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.815F, -2.7408F, -0.0863F, -0.1166F, -0.8963F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-0.9517F, 0.0249F, -0.5958F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.815F, -2.7408F, -0.0973F, -0.0739F, -0.3508F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(98, 28).addBox(2.2148F, -1.8184F, -0.6126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.815F, -2.7408F, -0.0161F, 0.1441F, 1.4237F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(108, 81).addBox(0.8273F, -0.4674F, -0.6126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.815F, -2.7408F, -0.0863F, 0.1166F, 0.8963F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 56).addBox(-0.0483F, 0.0249F, -0.5958F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.815F, -2.7408F, -0.0973F, 0.0739F, 0.3508F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.995F, -1.9801F, -0.6585F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -0.551F, -3.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, -0.926F, -5.5424F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 34).addBox(-5.1F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4818F, 3.2218F, 7.8122F, -0.9238F, -0.9085F, 1.0715F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(89, 8).addBox(-1.4131F, -1.0435F, 1.4437F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -0.6042F, -0.9292F, 1.0214F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 8).addBox(-0.3294F, -1.0435F, 0.9931F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -1.7342F, -1.219F, 2.261F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 26).addBox(-0.0155F, -1.0435F, 0.0462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -2.3499F, -1.0726F, 2.9308F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 53).addBox(-2.0F, 0.0F, -0.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4474F, -0.8823F, 2.0043F, -0.9434F, -1.0897F, 1.5365F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 13).addBox(-1.2175F, -0.528F, -0.3449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1197F, 0.226F, 2.6581F, -1.1467F, -0.9196F, 1.7655F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 25).addBox(-0.5F, 0.4F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1661F, 1.8501F, 8.6471F, -1.158F, 0.6309F, -0.4822F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 95).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3676F, 4.8841F, 9.5942F, -1.6025F, 0.7419F, -1.2918F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 95).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3676F, 4.8841F, 9.5942F, -1.1638F, 0.6396F, -0.6195F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 4).addBox(-1.8265F, -0.4689F, -0.0188F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.9646F, 0.1371F, 0.1874F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 77).addBox(-0.55F, -0.35F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6342F, 1.6603F, 4.3274F, -0.841F, 0.3286F, -0.0508F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 94).addBox(-0.525F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2507F, 3.3685F, 6.0658F, -0.8137F, 0.3136F, 0.0405F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 84).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2659F, 7.88F, 7.9682F, -0.6332F, 0.0298F, 0.3614F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 6).addBox(-0.7912F, -0.8533F, -0.2142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.452F, 5.3732F, 5.676F, -0.895F, 0.0298F, 0.3614F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(108, 19).addBox(-0.7687F, -0.6143F, -0.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.652F, 3.9732F, 4.976F, -0.9591F, 0.1319F, 0.2237F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(78, 84).addBox(-0.5F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.327F, 3.9899F, 4.8267F, -0.9949F, 0.2881F, -0.1219F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(118, 92).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2523F, 6.8514F, 7.7803F, -1.5788F, 0.0467F, 0.147F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(102, 11).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2523F, 6.8514F, 7.7803F, -0.9243F, 0.0467F, 0.147F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 91).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8355F, 6.1308F, 7.1552F, 0.6427F, 0.162F, 0.0805F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(112, 33).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4345F, 5.805F, 8.3565F, -0.9243F, 0.0467F, 0.147F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(36, 8).addBox(-0.464F, -4.029F, 7.2564F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, 0.072F, 0.2392F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(26, 42).addBox(-0.9328F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, 0.3396F, 0.5181F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(65, 71).addBox(-1.0F, 0.6F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, -0.3613F, -0.5584F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.926F, -5.5424F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(0.1F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4818F, 3.2218F, 7.8122F, -0.9238F, 0.9085F, -1.0715F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-0.5869F, -1.0435F, 1.4437F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -0.6042F, 0.9292F, -1.0214F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(105, 8).mirror().addBox(-1.6706F, -1.0435F, 0.9931F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -1.7342F, 1.219F, -2.261F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(108, 26).mirror().addBox(-1.9845F, -1.0435F, 0.0462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -2.3499F, 1.0726F, -2.9308F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(0.0F, 0.0F, -0.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4474F, -0.8823F, 2.0043F, -0.9434F, 1.0897F, -1.5365F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(36, 13).mirror().addBox(-2.7825F, -0.528F, -0.3449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1197F, 0.226F, 2.6581F, -1.1467F, 0.9196F, -1.7655F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 25).mirror().addBox(-0.5F, 0.4F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1661F, 1.8501F, 8.6471F, -1.158F, -0.6309F, 0.4822F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 95).mirror().addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3676F, 4.8841F, 9.5942F, -1.6025F, -0.7419F, 1.2918F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3676F, 4.8841F, 9.5942F, -1.1638F, -0.6396F, 0.6195F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-1.1735F, -0.4689F, -0.0188F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.9646F, -0.1371F, -0.1874F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.45F, -0.35F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6342F, 1.6603F, 4.3274F, -0.841F, -0.3286F, 0.0508F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-0.475F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2507F, 3.3685F, 6.0658F, -0.8137F, -0.3136F, -0.0405F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2659F, 7.88F, 7.9682F, -0.6332F, -0.0298F, -0.3614F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.2088F, -0.8533F, -0.2142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.452F, 5.3732F, 5.676F, -0.895F, -0.0298F, -0.3614F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 19).mirror().addBox(-0.2313F, -0.6143F, -0.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.652F, 3.9732F, 4.976F, -0.9591F, -0.1319F, -0.2237F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(78, 84).mirror().addBox(-0.5F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.327F, 3.9899F, 4.8267F, -0.9949F, -0.2881F, 0.1219F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(118, 92).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2523F, 6.8514F, 7.7803F, -1.5788F, -0.0467F, -0.147F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(102, 11).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2523F, 6.8514F, 7.7803F, -0.9243F, -0.0467F, -0.147F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 91).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8355F, 6.1308F, 7.1552F, 0.6427F, -0.162F, -0.0805F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(112, 33).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4345F, 5.805F, 8.3565F, -0.9243F, -0.0467F, -0.147F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(36, 8).mirror().addBox(-3.536F, -4.029F, 7.2564F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, -0.072F, -0.2392F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(26, 42).mirror().addBox(-0.0672F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, -0.3396F, -0.5181F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(0.0F, 0.6F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, 0.3613F, 0.5584F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5523F, 0.3935F, -1.7075F, -0.8721F, -0.2854F, -0.0975F));

		PartDefinition cube_r59 = leftLeg1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(115, 19).addBox(-1.1F, -0.667F, -1.0746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 115).addBox(0.0F, -0.667F, -1.0746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.0684F, -0.0696F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(115, 23).addBox(-0.5F, -1.42F, -0.5685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.0684F, -0.0696F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 115).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 9.0684F, -0.0696F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 119).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 9.216F, -1.3189F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(14, 105).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5F, 4.3476F, -0.1113F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(41, 110).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 2.8415F, -0.5113F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(99, 107).addBox(-1.5F, -0.2F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 3.8164F, -0.9186F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(96, 118).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9725F, -1.0158F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 117).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0089F, -0.7485F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, 0.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, -0.0988F, 0.4589F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 119).addBox(-1.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 0.7738F, -0.1143F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7669F, 10.8543F, 0.63F, 1.6599F, -0.0447F, 0.1093F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(20, 115).addBox(-0.5F, -0.4F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 0.0623F, -1.5565F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(44, 115).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, -0.0938F, -1.2024F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(36, 110).addBox(0.25F, -1.5F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.35F, 0.8629F, -0.9073F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(34, 115).addBox(-0.75F, -1.5F, 0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.45F, 0.8629F, -0.9073F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 20).addBox(-0.5F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 15.2534F, -2.6351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(108, 70).addBox(-0.5F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 63).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2F, 15.2534F, -2.6351F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(14, 73).addBox(-1.5F, -7.7751F, -0.9915F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 8.0497F, -0.9699F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 77).addBox(-1.5F, -8.6751F, -0.3665F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 16.7026F, -2.3794F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 115).addBox(-0.5F, -2.2317F, -0.7179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3509F, 1.7678F, -0.7887F, -0.3576F, 0.0073F, 0.0344F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(19, 107).addBox(-0.5F, -0.7522F, -0.5865F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3509F, 1.7678F, -0.7887F, -0.1133F, 0.0073F, 0.0344F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 16.5855F, -3.4221F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(94, 111).addBox(0.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, 0.786F, 0.6547F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(111, 101).addBox(-4.5F, -5.1F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(9, 73).addBox(0.0F, 0.1F, -0.9F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftFoot4 = leftLeg3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(62, 47).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.094F, 9.2758F, -2.3431F, -2.6008F, -0.5649F, 3.0894F));

		PartDefinition leftToes4 = leftFoot4.addOrReplaceChild("leftToes4", CubeListBuilder.create().texOffs(60, 12).addBox(-0.5F, -0.8662F, -3.8478F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0001F, 0.3597F, -3.6549F, -0.3189F, -0.0045F, 0.0003F));

		PartDefinition leftFoot3 = leftLeg3.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(47, 64).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0966F, 9.2401F, -2.3922F, 0.0695F, 0.0037F, 0.1001F));

		PartDefinition leftToes3 = leftFoot3.addOrReplaceChild("leftToes3", CubeListBuilder.create().texOffs(39, 42).addBox(-0.5F, -0.8662F, -4.8478F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0002F, 0.3554F, -3.7097F, -0.3354F, 0.0313F, -0.0263F));

		PartDefinition leftFoot5 = leftLeg3.addOrReplaceChild("leftFoot5", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7839F, 9.1902F, -2.2696F, 0.0712F, 0.4426F, -0.1115F));

		PartDefinition leftToes5 = leftFoot5.addOrReplaceChild("leftToes5", CubeListBuilder.create().texOffs(85, 79).addBox(-0.5F, -0.7662F, -2.8479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0001F, 0.2598F, -3.6509F, -0.3014F, -0.0045F, 0.0003F));

		PartDefinition leftFoot2 = leftLeg3.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, -0.5F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7495F, 9.3199F, -1.8078F, -2.1678F, 0.1976F, -3.0641F));

		PartDefinition leftToes2 = leftFoot2.addOrReplaceChild("leftToes2", CubeListBuilder.create().texOffs(78, 107).addBox(-0.5F, -0.7662F, -1.8479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0161F, 0.261F, -1.6912F, -0.5894F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5523F, 0.3935F, -1.7075F, -0.5667F, 0.2854F, 0.0975F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(115, 19).mirror().addBox(0.1F, -0.667F, -1.0746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 115).mirror().addBox(-1.0F, -0.667F, -1.0746F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.0684F, -0.0696F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(115, 23).mirror().addBox(-0.5F, -1.42F, -0.5685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.0684F, -0.0696F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(10, 115).mirror().addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.0684F, -0.0696F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(44, 119).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 9.216F, -1.3189F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.3476F, -0.1113F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(41, 110).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8415F, -0.5113F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(99, 107).mirror().addBox(0.5F, -0.2F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.8164F, -0.9186F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(96, 118).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9725F, -1.0158F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(61, 117).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0089F, -0.7485F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(0.0F, 0.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0988F, 0.4589F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 119).mirror().addBox(0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7738F, -0.1143F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7669F, 10.8543F, 0.63F, 2.1835F, 0.0447F, -0.1093F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(20, 115).mirror().addBox(-0.5F, -0.4F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.0623F, -1.5565F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 115).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0938F, -1.2024F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(36, 110).mirror().addBox(-1.25F, -1.5F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.35F, 0.8629F, -0.9073F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(34, 115).mirror().addBox(-0.25F, -1.5F, 0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.8629F, -0.9073F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(101, 20).mirror().addBox(-1.5F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2F, 15.2534F, -2.6351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(108, 70).mirror().addBox(-1.5F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 63).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.2F, 15.2534F, -2.6351F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(0.5F, -7.7751F, -0.9915F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 8.0497F, -0.9699F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(0.5F, -8.6751F, -0.3665F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 16.7026F, -2.3794F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(39, 115).mirror().addBox(-0.5F, -2.2317F, -0.7179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3509F, 1.7678F, -0.7887F, -0.3576F, -0.0073F, -0.0344F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 107).mirror().addBox(-0.5F, -0.7522F, -0.5865F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3509F, 1.7678F, -0.7887F, -0.1133F, -0.0073F, -0.0344F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 16.5855F, -3.4221F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(94, 111).mirror().addBox(-1.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.786F, 0.6547F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(111, 101).mirror().addBox(3.5F, -5.1F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-1.0F, 0.1F, -0.9F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightFoot4 = rightLeg3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(62, 47).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.094F, 9.2758F, -2.3431F, -2.4699F, 0.5649F, -3.0894F));

		PartDefinition rightToes4 = rightFoot4.addOrReplaceChild("rightToes4", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-0.5F, -0.8662F, -3.8478F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0001F, 0.3597F, -3.6549F, 0.2484F, 0.0045F, -0.0003F));

		PartDefinition rightFoot3 = rightLeg3.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(47, 64).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0966F, 9.2401F, -2.3922F, 0.5495F, -0.0037F, -0.1001F));

		PartDefinition rightToes3 = rightFoot3.addOrReplaceChild("rightToes3", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(-0.5F, -0.8662F, -4.8478F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0002F, 0.3554F, -3.7097F, 0.3618F, 0.0045F, -0.0003F));

		PartDefinition rightFoot5 = rightLeg3.addOrReplaceChild("rightFoot5", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.5F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7839F, 9.1902F, -2.2696F, 0.6384F, -0.4426F, 0.1115F));

		PartDefinition rightToes5 = rightFoot5.addOrReplaceChild("rightToes5", CubeListBuilder.create().texOffs(85, 79).mirror().addBox(-0.5F, -0.7662F, -2.8479F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0001F, 0.2598F, -3.6509F, 0.3967F, 0.0045F, -0.0003F));

		PartDefinition rightFoot2 = rightLeg3.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.5F, -0.5F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7495F, 9.3199F, -1.8078F, -2.6791F, -0.0525F, 2.9662F));

		PartDefinition rightToes2 = rightFoot2.addOrReplaceChild("rightToes2", CubeListBuilder.create().texOffs(78, 107).mirror().addBox(-0.5F, -0.1662F, -1.8479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0161F, -0.3355F, -1.6257F, -0.1094F, 0.0045F, -0.0003F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, -0.9914F, 0.0377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(18, 55).addBox(0.003F, -1.3914F, 0.0377F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 110).addBox(0.003F, -1.4914F, 2.0377F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0492F, 4.5597F, -0.5934F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 84).addBox(-0.5F, -0.3411F, -0.0636F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(120, 80).addBox(0.003F, -0.7411F, 0.9364F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 2.8949F, 0.2705F, 0.0F, 0.0F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1776F, 3.0222F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(117, 3).addBox(-0.5F, 0.1103F, -1.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.003F, -2.7485F, 0.1988F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 31).addBox(-0.5F, -0.7F, 0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.003F, -0.2908F, -0.345F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.003F, -0.2908F, -0.345F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(108, 23).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(108, 73).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.003F, 0.1267F, 0.6972F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -3.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(27, 58).addBox(0.0F, -0.4822F, -1.5043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6983F, -0.5421F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(83, 93).addBox(0.0F, 0.1699F, 1.982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 89).addBox(0.0F, 0.1699F, -2.018F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6311F, 3.8409F, -2.3998F, 0.0404F, -0.5091F, -1.5654F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(54, 118).mirror().addBox(0.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.9021F, -3.3333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 117).mirror().addBox(0.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8021F, -2.3333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-6.1968F, -1.8501F, -0.4145F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -5.5408F, -0.0275F, -0.1244F, -1.2747F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.7F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9794F, 2.9035F, -5.5199F, -0.0444F, -0.9094F, -1.2431F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(111, 105).mirror().addBox(-2.8276F, -0.5039F, -0.4145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -5.5408F, -0.0861F, -0.094F, -0.7487F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-0.9671F, 0.0013F, -0.3963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -5.5408F, -0.0854F, -0.0546F, -0.204F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(120, 62).mirror().addBox(-0.9682F, 0.0064F, -0.3963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.915F, -7.1408F, -0.0683F, -0.0511F, -0.2049F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(113, 95).mirror().addBox(-2.8312F, -0.5F, -0.4143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.915F, -7.1408F, -0.0733F, -0.0821F, -0.7499F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-9.2018F, -1.8486F, -0.4143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.915F, -7.1408F, -0.0223F, -0.1077F, -1.2753F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(110, 64).mirror().addBox(-3.4333F, -1.8241F, 4.004F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.915F, -7.1408F, -0.046F, -1.0672F, -1.2374F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(118, 56).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.9021F, -4.9333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(-0.9517F, 0.0249F, -0.5958F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -1.5408F, -0.1137F, -0.0799F, -0.3496F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-2.8273F, -0.4674F, -0.6126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -1.5408F, -0.0973F, -0.1303F, -0.8949F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-5.2148F, -1.8184F, -0.6126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -1.5408F, -0.0187F, -0.1613F, -1.4234F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.07F, 3.1068F, -5.6787F, 0.012F, -0.3F, -1.4067F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 89).mirror().addBox(-6.1019F, -1.879F, -0.4272F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -3.5408F, -0.0534F, -0.2079F, -1.2704F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-4.348F, -1.8544F, 3.8431F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -3.5408F, -0.0956F, -0.9914F, -1.2013F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(91, 18).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.04F, 3.6887F, -4.6052F, 0.0671F, -0.3805F, -1.5896F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(113, 54).mirror().addBox(-2.7598F, -0.5763F, -0.4272F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -3.5408F, -0.1508F, -0.1532F, -0.7408F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(120, 54).mirror().addBox(-0.9469F, -0.0962F, -0.4057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -3.5408F, -0.1711F, -0.0721F, -0.1986F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(118, 89).mirror().addBox(0.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.102F, -1.4333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 61).addBox(2.2148F, -1.8184F, -0.6126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -1.5408F, -0.0187F, 0.1613F, 1.4234F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(76, 69).addBox(0.8273F, -0.4674F, -0.6126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -1.5408F, -0.0973F, 0.1303F, 0.8949F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(15, 24).addBox(-0.0483F, 0.0249F, -0.5958F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -1.5408F, -0.1137F, 0.0799F, 0.3496F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(118, 56).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9021F, -4.9333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(110, 64).addBox(1.4333F, -1.8241F, 4.004F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.915F, -7.1408F, -0.046F, 1.0672F, 1.2374F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(45, 33).addBox(2.2018F, -1.8486F, -0.4143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.915F, -7.1408F, -0.0223F, 0.1077F, 1.2753F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(113, 95).addBox(0.8312F, -0.5F, -0.4143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.915F, -7.1408F, -0.0733F, 0.0821F, 0.7499F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 62).addBox(-0.0318F, 0.0064F, -0.3963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.915F, -7.1408F, -0.0683F, 0.0511F, 0.2049F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(118, 89).addBox(-1.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.102F, -1.4333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(120, 54).addBox(-0.0531F, -0.0962F, -0.4057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -3.5408F, -0.1711F, 0.0721F, 0.1986F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(113, 54).addBox(0.7598F, -0.5763F, -0.4272F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -3.5408F, -0.1508F, 0.1532F, 0.7408F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(91, 18).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.04F, 3.6887F, -4.6052F, 0.0671F, 0.3805F, 1.5896F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 8).addBox(2.348F, -1.8544F, 3.8431F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -3.5408F, -0.0956F, 0.9914F, 1.2013F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(31, 89).addBox(2.1019F, -1.879F, -0.4272F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -3.5408F, -0.0534F, 0.2079F, 1.2704F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 88).addBox(-0.0329F, 0.0013F, -0.3963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -5.5408F, -0.0854F, 0.0546F, 0.204F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(111, 105).addBox(0.8276F, -0.5039F, -0.4145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -5.5408F, -0.0861F, 0.094F, 0.7487F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(20, 66).addBox(-1.3F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9794F, 2.9035F, -5.5199F, -0.0444F, 0.9094F, 1.2431F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(89, 12).addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.07F, 3.1068F, -5.6787F, 0.012F, 0.3F, 1.4067F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 31).addBox(2.1968F, -1.8501F, -0.4145F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -5.5408F, -0.0275F, 0.1244F, 1.2747F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(15, 117).addBox(-1.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8021F, -2.3333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(54, 118).addBox(-1.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.9021F, -3.3333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6311F, 3.8409F, -2.3998F, 0.0404F, 0.5091F, 1.5654F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 12).addBox(-0.995F, -0.0506F, -5.0332F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.495F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.7508F, -8.5081F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(121, 12).addBox(0.0F, -0.9718F, -0.9625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5955F, -3.8426F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 121).addBox(0.0F, -0.8218F, -0.9375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.438F, -1.8264F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 92).addBox(0.0F, -0.8468F, -0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1905F, -0.7546F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(66, 118).mirror().addBox(-0.8F, -0.4F, 0.1F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6364F, 7.7973F, -0.1672F, -1.3026F, 0.3658F, -1.7334F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(118, 74).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, 0.0655F, 1.7432F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(118, 77).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -0.0845F, 1.7932F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.165F, -2.5408F, 0.279F, 0.0653F, -0.3251F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(112, 8).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.165F, -2.5408F, 0.1654F, 0.1965F, -0.8587F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(20, 113).mirror().addBox(-4.4102F, -1.789F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.165F, -2.5408F, 0.0436F, 0.2525F, -1.3931F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4358F, -0.3826F, 0.1111F, -0.0131F, -0.2107F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(113, 50).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4358F, -0.3826F, 0.0606F, 0.0431F, -0.7525F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-6.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4358F, -0.3826F, 0.0309F, 0.0676F, -1.2763F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-2.1707F, -1.8249F, 4.4809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4358F, -0.3826F, 0.0591F, -1.0224F, -1.3289F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(113, 52).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.07F, 5.7893F, 0.464F, 0.0308F, -0.0196F, -1.279F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-2.5707F, -1.8249F, 4.4809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4993F, 0.4358F, -0.3826F, 0.0591F, -1.0224F, -1.3289F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(28, 116).mirror().addBox(-0.5F, 0.2F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9188F, 9.1269F, 1.8383F, -1.1942F, 0.1637F, -1.8187F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1096F, 9.8201F, -1.779F, -1.2428F, 0.0418F, -1.8668F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(25, 115).mirror().addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0325F, 10.7165F, -0.7186F, -1.3747F, 0.0372F, -2.2879F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(118, 77).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -0.0845F, 1.7932F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(120, 25).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4358F, -0.3826F, 0.1111F, 0.0131F, 0.2107F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(113, 50).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4358F, -0.3826F, 0.0606F, -0.0431F, 0.7525F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(113, 52).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.07F, 5.7893F, 0.464F, 0.0308F, 0.0196F, 1.279F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(87, 36).addBox(2.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4358F, -0.3826F, 0.0309F, -0.0676F, 1.2763F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 56).addBox(1.5707F, -1.8249F, 4.4809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4993F, 0.4358F, -0.3826F, 0.0591F, 1.0224F, 1.3289F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(62, 33).addBox(1.1707F, -1.8249F, 4.4809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4358F, -0.3826F, 0.0591F, 1.0224F, 1.3289F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(118, 74).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, 0.0655F, 1.7432F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(20, 113).addBox(2.4102F, -1.789F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.165F, -2.5408F, 0.0436F, -0.2525F, 1.3931F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(112, 8).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.165F, -2.5408F, 0.1654F, -0.1965F, 0.8587F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(101, 56).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.165F, -2.5408F, 0.279F, -0.0653F, 0.3251F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(25, 115).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0325F, 10.7165F, -0.7186F, -1.3747F, -0.0372F, 2.2879F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 62).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1096F, 9.8201F, -1.779F, -1.2428F, -0.0418F, 1.8668F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(28, 116).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9188F, 9.1269F, 1.8383F, -1.1942F, -0.1637F, 1.8187F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(66, 118).addBox(-0.2F, -0.4F, 0.1F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6364F, 7.7973F, -0.1672F, -1.3026F, -0.3658F, 1.7334F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 50).addBox(-2.366F, -2.0213F, -0.0395F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.866F, 12.9434F, -3.1813F, 1.0716F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(66, 100).addBox(-2.366F, 0.4362F, 0.9056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.866F, 10.6434F, -6.4813F, 1.3291F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(100, 48).addBox(-2.366F, 0.0244F, -0.0427F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 10.6434F, -6.4813F, 1.0236F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 71).addBox(-2.366F, -3.9662F, -0.4492F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.866F, 12.9434F, -3.1813F, 0.8578F, 0.0F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(112, 37).addBox(-2.366F, -3.9114F, 0.607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.866F, 14.0434F, 2.4187F, 1.2418F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(5, 92).addBox(-2.366F, -3.7779F, -0.2951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.866F, 14.0434F, 2.4187F, 1.3727F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(19, 75).addBox(-2.366F, -5.7291F, -0.7204F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 14.0434F, 2.4187F, 1.2593F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(101, 52).addBox(-2.366F, -1.8195F, -0.1895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.866F, 14.0434F, 2.4187F, 1.4163F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(118, 64).addBox(-2.366F, -0.8572F, -0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 14.0434F, 2.4187F, 1.4992F, 0.0F, 0.0F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(69, 87).addBox(-3.366F, -2.302F, 1.6219F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 10.6434F, -6.4813F, 0.0594F, 0.0F, 0.0F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(21, 9).addBox(-0.995F, -1.3F, -4.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, 1.0F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2693F, 1.6498F, -6.5522F, 2.6141F, 0.2118F, 2.4702F));

		PartDefinition cube_r202 = leftArm1.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 24).addBox(-0.8F, 0.3F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.0832F, -0.8753F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftArm1.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(101, 87).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, 10.8478F, -4.8431F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftArm1.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 111).addBox(-0.5F, 0.075F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(-0.1081F, 8.7848F, -4.5986F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftArm1.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(47, 91).addBox(-0.5F, -0.125F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 7.0356F, -3.6289F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm1.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(91, 43).addBox(0.0F, -0.9905F, -0.3205F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.6081F, 4.0241F, -1.1262F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftArm1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(98, 34).addBox(-0.5F, -0.1F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1081F, 1.3532F, -0.1215F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftArm1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(52, 98).addBox(-0.5F, -0.1F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.086F)), PartPose.offsetAndRotation(-0.1081F, 3.4294F, 0.3879F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftArm1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(99, 67).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1081F, 3.4294F, 0.3879F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftArm1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 111).addBox(-0.5F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1081F, 3.9503F, -0.9039F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftArm1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(91, 38).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 0.9916F, 0.5522F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(31, 107).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 2.1467F, -0.3734F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1278F, 12.2867F, -4.835F, 1.1057F, -0.3777F, 2.9713F));

		PartDefinition cube_r213 = leftArm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(116, 115).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.05F, -0.1563F, 0.7999F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftArm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, -2.5F, -0.55F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.05F, 5.5829F, -0.7987F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftArm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(87, 84).addBox(-0.5F, -2.1F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.05F, 10.0147F, -2.5857F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(113, 76).addBox(-0.5F, -1.475F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 13.9352F, -3.4341F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftArm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(113, 66).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.05F, 13.9352F, -3.4341F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftArm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(14, 99).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.05F, 10.0147F, -2.5857F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftArm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(19, 101).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 7.0107F, -0.692F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftArm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(108, 87).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 4.5754F, 0.2186F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftArm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(61, 113).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 3.0263F, 0.6192F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftArm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(99, 111).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.05F, 1.345F, 0.8705F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftArm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(111, 97).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, -0.2558F, 0.8095F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftArm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(31, 101).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.05F, 1.8358F, -0.08F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(108, 76).addBox(-0.5F, -2.475F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 1.7375F, -0.3897F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftArm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(52, 91).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.11F, 9.3151F, -2.7629F, -0.2824F, 0.0063F, -0.0149F));

		PartDefinition cube_r227 = leftArm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(113, 56).addBox(-0.5982F, -1.6335F, -0.8202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1028F, 1.4649F, -0.9045F, -0.361F, 0.0063F, -0.0149F));

		PartDefinition cube_r228 = leftArm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(42, 56).addBox(-0.5982F, -0.0335F, -0.4202F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0781F, -0.1839F, -0.9291F, -0.2301F, 0.0063F, -0.0149F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1414F, 14.9504F, -4.3747F, -3.056F, -0.1249F, 0.1267F));

		PartDefinition cube_r229 = leftHand.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(31, 116).addBox(0.0F, -0.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1052F, 0.1522F, -1.1862F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftHand.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(101, 91).addBox(-0.5F, -1.3F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.1052F, 1.049F, -1.3094F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftHand.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(56, 35).addBox(-1.0F, -0.55F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.195F))
				.texOffs(69, 77).addBox(-1.0F, -0.05F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftHand.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(29, 112).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1052F, 4.0628F, -3.6198F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftHand.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(112, 4).addBox(-1.0F, -1.2156F, -0.0244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6052F, 3.0946F, -3.6961F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftHand.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(112, 29).addBox(-1.0F, -0.5156F, -0.4244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6052F, 1.8929F, -1.735F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftHand.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(81, 115).addBox(-0.325F, 1.9032F, -0.8247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1302F, 4.2085F, -6.3737F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftHand.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(116, 100).addBox(-0.525F, 1.3587F, -0.1571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1302F, 4.2085F, -6.3737F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftHand.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(120, 42).addBox(-0.525F, 1.1421F, -1.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(120, 39).addBox(-0.525F, 1.1421F, -0.6757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1302F, 4.2085F, -6.3737F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftHand.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(86, 115).addBox(-0.525F, -0.2316F, 0.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1302F, 4.2085F, -6.3737F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftHand.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(115, 41).addBox(-0.525F, -0.1481F, -0.3158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1302F, 4.2085F, -6.3737F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftHand.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(64, 108).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1052F, 2.7805F, -3.9655F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftHand.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 118).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1052F, 3.8887F, -6.1775F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftHand.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(117, 30).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 4.4109F, -5.882F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftHand.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(34, 119).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1052F, 4.8389F, -5.4615F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(101, 95).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1052F, 3.991F, -5.3565F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(108, 50).addBox(-0.525F, 0.1638F, 0.2556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1302F, 1.5612F, -3.3033F, -1.0734F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2693F, 1.6498F, -6.5522F, 2.6141F, -0.2118F, -2.4702F));

		PartDefinition cube_r246 = rightArm1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-1.2F, 0.3F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, -0.0832F, -0.8753F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightArm1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 87).mirror().addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 10.8478F, -4.8431F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(89, 111).mirror().addBox(-0.5F, 0.075F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.119F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 8.7848F, -4.5986F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightArm1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(-0.5F, -0.125F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 7.0356F, -3.6289F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightArm1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 43).mirror().addBox(-1.0F, -0.9905F, -0.3205F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 4.0241F, -1.1262F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightArm1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(98, 34).mirror().addBox(-0.5F, -0.1F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 1.3532F, -0.1215F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightArm1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(52, 98).mirror().addBox(-0.5F, -0.1F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.086F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 3.4294F, 0.3879F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightArm1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(99, 67).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 3.4294F, 0.3879F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightArm1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(10, 111).mirror().addBox(-0.5F, -1.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 3.9503F, -0.9039F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightArm1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(91, 38).mirror().addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 0.9916F, 0.5522F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightArm1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(31, 107).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 2.1467F, -0.3734F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1278F, 12.2867F, -4.835F, 1.1057F, 0.3777F, -2.9713F));

		PartDefinition cube_r257 = rightArm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(116, 115).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.1563F, 0.7999F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightArm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(19, 81).mirror().addBox(-0.5F, -2.5F, -0.55F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.05F, 5.5829F, -0.7987F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightArm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-0.5F, -2.1F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.05F, 10.0147F, -2.5857F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightArm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(113, 76).mirror().addBox(-0.5F, -1.475F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 13.9352F, -3.4341F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightArm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.05F, 13.9352F, -3.4341F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightArm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(14, 99).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.05F, 10.0147F, -2.5857F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightArm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(19, 101).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 7.0107F, -0.692F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightArm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(108, 87).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.5754F, 0.2186F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightArm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(61, 113).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 3.0263F, 0.6192F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightArm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(99, 111).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.345F, 0.8705F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightArm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(111, 97).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.2558F, 0.8095F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightArm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(31, 101).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.8358F, -0.08F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r269 = rightArm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(108, 76).mirror().addBox(-0.5F, -2.475F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7375F, -0.3897F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightArm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(52, 91).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.11F, 9.3151F, -2.7629F, -0.2824F, -0.0063F, 0.0149F));

		PartDefinition cube_r271 = rightArm2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(113, 56).mirror().addBox(-0.4018F, -1.6335F, -0.8202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1028F, 1.4649F, -0.9045F, -0.361F, -0.0063F, 0.0149F));

		PartDefinition cube_r272 = rightArm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(42, 56).mirror().addBox(-0.4018F, -0.0335F, -0.4202F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, -0.1839F, -0.9291F, -0.2301F, -0.0063F, 0.0149F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1414F, 14.9504F, -4.3747F, -3.056F, 0.1249F, -0.1267F));

		PartDefinition cube_r273 = rightHand.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(0.0F, -0.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 0.1522F, -1.1862F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightHand.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(101, 91).mirror().addBox(-0.5F, -1.3F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 1.049F, -1.3094F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightHand.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(0.0F, -0.55F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(69, 77).mirror().addBox(0.0F, -0.05F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightHand.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(29, 112).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 4.0628F, -3.6198F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightHand.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(112, 4).mirror().addBox(0.0F, -1.2156F, -0.0244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 3.0946F, -3.6961F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightHand.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(112, 29).mirror().addBox(0.0F, -0.5156F, -0.4244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.8929F, -1.735F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightHand.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(81, 115).mirror().addBox(-0.675F, 1.9032F, -0.8247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 4.2085F, -6.3737F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightHand.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(116, 100).mirror().addBox(-0.475F, 1.3587F, -0.1571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 4.2085F, -6.3737F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightHand.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-0.475F, 1.1421F, -1.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(120, 39).mirror().addBox(-0.475F, 1.1421F, -0.6757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 4.2085F, -6.3737F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightHand.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(86, 115).mirror().addBox(-0.475F, -0.2316F, 0.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 4.2085F, -6.3737F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightHand.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-0.475F, -0.1481F, -0.3158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 4.2085F, -6.3737F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightHand.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(64, 108).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 2.7805F, -3.9655F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightHand.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 118).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 3.8887F, -6.1775F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightHand.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(117, 30).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 4.4109F, -5.882F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightHand.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(34, 119).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 4.8389F, -5.4615F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightHand.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(101, 95).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 3.991F, -5.3565F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightHand.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-0.475F, 0.1638F, 0.2556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 1.5612F, -3.3033F, -1.0734F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, 2.2526F, -7.0035F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(49, 115).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4736F, 6.656F, 3.8751F, 0.6573F, 1.1371F, -1.5036F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(118, 67).addBox(-1.9462F, -0.5244F, -0.4034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6253F, 7.4743F, 3.5941F, -0.5218F, 1.177F, -2.7654F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(15, 113).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3391F, 7.3868F, 5.3129F, -1.0376F, 0.8573F, 2.9237F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, -6.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1915F, 10.8484F, 8.6034F, 1.2163F, -0.3039F, -0.4174F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 109).addBox(-1.1F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9026F, 10.082F, 8.5661F, 1.2207F, -0.263F, -0.4331F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(24, 108).addBox(-0.825F, -1.6F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0491F, 9.3312F, 8.6369F, 1.2543F, -0.1291F, -1.1583F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(85, 58).addBox(0.0F, -3.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4217F, 9.3314F, 6.145F, 1.8018F, -0.3407F, -2.1756F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(80, 101).addBox(0.0F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4217F, 9.3314F, 6.145F, 1.3147F, -0.3226F, -0.8721F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 101).addBox(-1.0F, -0.1F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2543F, 7.4005F, 2.1866F, 1.1214F, -0.4857F, -0.3997F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(109, 111).addBox(-0.2845F, -0.9454F, -0.5879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6253F, 7.4743F, 3.5941F, 1.2398F, 0.1579F, -0.8661F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(9, 83).addBox(-0.2607F, -0.4967F, 0.9269F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, 2.0741F, 0.047F, 0.1025F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(42, 86).addBox(-0.2607F, 0.0116F, 3.8276F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, 2.205F, 0.047F, 0.1025F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(59, 98).addBox(0.9703F, -2.9998F, -5.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0624F, 0.1982F, -0.1458F, 2.121F, 0.2886F, 0.7873F));

		PartDefinition cube_r303 = bone2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 46).addBox(0.9703F, -1.8452F, -4.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0624F, 0.1982F, -0.1458F, 1.8156F, 0.2886F, 0.7873F));

		PartDefinition cube_r304 = bone2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(45, 98).addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8053F, 3.1035F, -1.3582F, 1.7007F, 0.196F, 0.4967F));

		PartDefinition cube_r305 = bone2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(101, 71).addBox(1.0647F, 0.6263F, 6.3555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, 2.2789F, 0.1705F, -0.0665F));

		PartDefinition cube_r306 = bone2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(104, 111).addBox(1.0647F, 7.3367F, -2.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, -2.3288F, 0.1705F, -0.0665F));

		PartDefinition cube_r307 = bone2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(119, 112).addBox(1.0647F, 4.4034F, 6.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, 2.7763F, 0.1705F, -0.0665F));

		PartDefinition cube_r308 = bone2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(85, 74).addBox(1.0647F, 1.4469F, 5.8993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.315F, 7.6515F, 3.7699F, 2.4272F, 0.1705F, -0.0665F));

		PartDefinition cube_r309 = bone2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(62, 41).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3534F, -0.5645F, 5.29F, -0.1427F, -0.0076F, -0.322F));

		PartDefinition cube_r310 = bone2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3223F, -0.7295F, 2.2947F, -0.0555F, -0.0076F, -0.322F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(7, 99).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3767F, -0.5905F, 1.3008F, 0.0492F, -0.0076F, -0.322F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0142F, 2.2526F, -7.0035F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(49, 115).mirror().addBox(-0.6F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4736F, 6.656F, 3.8751F, 0.6573F, -1.1371F, 1.5036F));

		PartDefinition cube_r313 = bone4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(118, 67).mirror().addBox(0.9462F, -0.5244F, -0.4034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6253F, 7.4743F, 3.5941F, -0.5218F, -1.177F, 2.7654F));

		PartDefinition cube_r314 = bone4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(15, 113).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3391F, 7.3868F, 5.3129F, -1.0376F, -0.8573F, -2.9237F));

		PartDefinition cube_r315 = bone4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(0.0F, -6.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1915F, 10.8484F, 8.6034F, 1.2163F, 0.3039F, 0.4174F));

		PartDefinition cube_r316 = bone4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(0.1F, -1.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9026F, 10.082F, 8.5661F, 1.2207F, 0.263F, 0.4331F));

		PartDefinition cube_r317 = bone4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(24, 108).mirror().addBox(-0.175F, -1.6F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0491F, 9.3312F, 8.6369F, 1.2543F, 0.1291F, 1.1583F));

		PartDefinition cube_r318 = bone4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4217F, 9.3314F, 6.145F, 1.8018F, 0.3407F, 2.1756F));

		PartDefinition cube_r319 = bone4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(80, 101).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4217F, 9.3314F, 6.145F, 1.3147F, 0.3226F, 0.8721F));

		PartDefinition cube_r320 = bone4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-1.0F, -0.1F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2543F, 7.4005F, 2.1866F, 1.1214F, 0.4857F, 0.3997F));

		PartDefinition cube_r321 = bone4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(109, 111).mirror().addBox(-0.7155F, -0.9454F, -0.5879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6253F, 7.4743F, 3.5941F, 1.2398F, -0.1579F, 0.8661F));

		PartDefinition cube_r322 = bone4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(9, 83).mirror().addBox(-0.7393F, -0.4967F, 0.9269F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, 2.0741F, -0.047F, -0.1025F));

		PartDefinition cube_r323 = bone4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(42, 86).mirror().addBox(-0.7393F, 0.0116F, 3.8276F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, 2.205F, -0.047F, -0.1025F));

		PartDefinition cube_r324 = bone4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(59, 98).mirror().addBox(-1.9703F, -2.9998F, -5.2625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0624F, 0.1982F, -0.1458F, 2.121F, -0.2886F, -0.7873F));

		PartDefinition cube_r325 = bone4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(107, 46).mirror().addBox(-1.9703F, -1.8452F, -4.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0624F, 0.1982F, -0.1458F, 1.8156F, -0.2886F, -0.7873F));

		PartDefinition cube_r326 = bone4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8053F, 3.1035F, -1.3582F, 1.7007F, -0.196F, -0.4967F));

		PartDefinition cube_r327 = bone4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(101, 71).mirror().addBox(-2.0647F, 0.6263F, 6.3555F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, 2.2789F, -0.1705F, 0.0665F));

		PartDefinition cube_r328 = bone4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(104, 111).mirror().addBox(-2.0647F, 7.3367F, -2.9812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, -2.3288F, -0.1705F, 0.0665F));

		PartDefinition cube_r329 = bone4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(119, 112).mirror().addBox(-2.0647F, 4.4034F, 6.8678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, 2.7763F, -0.1705F, 0.0665F));

		PartDefinition cube_r330 = bone4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(85, 74).mirror().addBox(-2.0647F, 1.4469F, 5.8993F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.315F, 7.6515F, 3.7699F, 2.4272F, -0.1705F, 0.0665F));

		PartDefinition cube_r331 = bone4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3534F, -0.5645F, 5.29F, -0.1427F, 0.0076F, 0.322F));

		PartDefinition cube_r332 = bone4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3223F, -0.7295F, 2.2947F, -0.0555F, 0.0076F, 0.322F));

		PartDefinition cube_r333 = bone4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3767F, -0.5905F, 1.3008F, 0.0492F, 0.0076F, 0.322F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8106F, -5.9858F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r334 = neck6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(82, 53).addBox(0.0F, -2.2943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 34).addBox(-0.495F, -1.9943F, -5.1586F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 1.9232F, -0.4216F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r335 = neck6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(121, 16).addBox(0.0F, -0.9424F, -0.1881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.1716F, -0.6559F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r336 = neck6.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 97).mirror().addBox(-0.8983F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.495F, 0.6319F, 2.4007F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r337 = neck6.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(114, 14).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.495F, 0.4911F, 1.8306F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r338 = neck6.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(114, 14).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, 0.4911F, 1.8306F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r339 = neck6.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(7, 97).addBox(-0.1018F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 95).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, 0.6319F, 2.4007F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7022F, -4.8982F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck5.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 98).addBox(0.0F, -1.5F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 48).addBox(-0.495F, -1.1F, -4.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.2983F, 0.6012F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck10 = neck5.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0767F, -3.7314F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck10.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(71, 0).addBox(-0.995F, -2.0981F, 2.9713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(102, 4).addBox(-0.5F, -2.3981F, 3.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -5.2982F, -3.0954F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck4 = neck10.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.6F, -1.4F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r342 = neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 38).addBox(-0.995F, -1.9981F, -0.0537F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -2.6938F, -1.7418F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0546F, -1.6298F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(78, 56).addBox(-0.995F, 2.0773F, -1.9317F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.0404F, 0.2843F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8096F, 0.9144F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(78, 77).addBox(-0.995F, -0.0728F, -1.8396F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -2.8772F, -2.9629F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8627F, -2.8626F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r345 = neck.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 46).addBox(-0.995F, -0.1384F, -0.2862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7319F, -3.6921F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(45, 35).addBox(-0.995F, -0.1384F, -0.2862F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.6609F, -3.6252F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2566F, -3.0319F, 0.8889F, 0.1107F, 0.1352F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(57, 92).addBox(-2.0F, 0.179F, -1.4084F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.495F, 1.3686F, -0.8286F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 14).addBox(-2.0F, -0.6672F, -1.7166F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.495F, 0.9686F, 0.1464F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(71, 16).addBox(-1.5F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.505F, -1.5419F, 1.1074F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(71, 6).addBox(-2.0F, -1.7169F, -1.9647F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, 0.4186F, 0.9214F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(51, 15).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.005F, -0.3809F, 0.3112F, -1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(108, 92).addBox(0.0F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5F, -2.3572F, -30.0534F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(5, 111).addBox(0.0F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, -3.851F, -30.8833F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(113, 91).addBox(0.0F, -1.8F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -5.4313F, -30.633F, 2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(20, 119).addBox(0.0F, -1.8F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(10, 119).addBox(0.0F, -1.6F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(101, 118).addBox(0.0F, -1.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5F, -5.4313F, -30.633F, 3.002F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(106, 115).addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -5.7629F, -30.4093F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(115, 70).addBox(0.0F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -7.0893F, -29.5146F, 2.5482F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(69, 110).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -8.4015F, -28.0052F, 2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(56, 110).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -9.4613F, -26.3091F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(115, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -10.2105F, -24.4547F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(113, 87).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.7618F, -22.5322F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(113, 83).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -11.0919F, -20.5596F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(43, 102).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.995F, -11.2836F, -18.5688F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(36, 102).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.995F, -11.3708F, -16.5707F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(31, 91).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -11.2661F, -12.5721F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(102, 15).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -11.0397F, -10.585F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(14, 90).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -10.7268F, -8.6096F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(89, 0).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.243F, -6.669F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(67, 31).addBox(-1.5F, -5.1F, -1.1F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6385F, -14.3484F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(51, 110).addBox(-0.5F, -3.1F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7F, -25.3165F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(24, 95).addBox(-1.0F, -3.1F, -1.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0396F, -22.3358F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 53).addBox(-1.5F, -3.1F, -1.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -6.9873F, -19.3363F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(11, 66).addBox(-1.5F, -5.1F, -1.1F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.6416F, -9.4488F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(67, 64).addBox(-1.5F, -2.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2038F, -7.4357F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(78, 89).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -9.51F, -4.8082F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(5, 88).addBox(-1.0F, -1.7F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, -8.5984F, -3.3698F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(38, 91).addBox(-1.5F, -1.0F, -0.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -7.4707F, -3.7802F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(96, 31).addBox(-1.5F, -1.0F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.005F, -7.4707F, -3.7802F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(71, 20).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -7.1282F, -1.2751F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(76, 32).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -6.8694F, -0.3092F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(76, 29).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -6.4468F, 0.5971F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(17, 34).addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0291F, -4.1552F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(22, 49).addBox(-0.5F, -5.4F, 1.2F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -6.4468F, 0.5971F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -3.832F, -1.2052F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(45, 25).addBox(-0.5F, -1.8F, -2.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -3.832F, -1.2052F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(82, 48).addBox(-0.5F, -5.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F))
				.texOffs(76, 35).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -5.7712F, 1.3344F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(82, 15).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -4.9051F, 1.8344F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 28).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -3.9813F, 2.2171F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 65).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -2.9965F, 2.3907F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(82, 5).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -2.005F, 2.2602F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(35, 81).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -1.0811F, 1.8775F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(24, 81).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.005F, -0.224F, 1.3625F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(91, 50).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.005F, -0.224F, 1.3625F, -1.1956F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.0781F, -1.1971F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(118, 86).addBox(-0.2929F, -0.7668F, -0.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(118, 83).addBox(-0.2929F, -0.7668F, -0.6368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5504F, 9.3314F, -0.2975F, -0.4496F, 0.0688F, -0.0159F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(119, 109).addBox(-0.2929F, -0.6382F, -0.2237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(84, 119).addBox(-0.2929F, -0.6382F, -0.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5504F, 9.3314F, -0.2975F, -0.7463F, 0.0688F, -0.0159F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(80, 0).addBox(-0.2929F, -0.7007F, -2.8399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5504F, 9.3314F, -0.2975F, -0.6852F, 0.0688F, -0.0159F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(60, 87).addBox(-0.3999F, -1.0403F, -5.2349F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5504F, 9.3314F, -0.2975F, -0.5572F, -0.04F, -0.0644F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(117, 36).addBox(-0.5F, -0.7745F, -0.7254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.005F, 8.9268F, 0.6067F, 2.0988F, -0.3054F, 0.0F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(117, 33).addBox(-0.5F, -0.2518F, -0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.005F, 8.9268F, 0.6067F, 1.4006F, -0.3054F, 0.0F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(101, 115).addBox(-0.8301F, -2.0535F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8466F, 5.0936F, 2.1204F, 2.5028F, -0.1466F, -0.1329F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(120, 19).addBox(-0.5F, -0.5337F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3939F, 2.4295F, -0.3343F, -0.0108F, -0.0627F, -0.2167F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(116, 97).addBox(-0.5F, -0.2439F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3939F, 2.4295F, -0.3343F, 1.2982F, -0.0627F, -0.2167F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(98, 38).addBox(-0.4255F, 0.8203F, -0.3631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.668F, 4.3991F, 0.4575F, 2.5147F, -0.2331F, -0.2224F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(120, 51).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2898F, 4.3301F, 3.0564F, -2.4918F, 0.9939F, 0.6884F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(120, 59).addBox(-0.2F, -1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 120).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.561F, 4.0663F, 2.2969F, -2.0415F, 1.0118F, 1.0664F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(120, 70).addBox(-0.2F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.561F, 4.0663F, 2.2969F, -1.9706F, 0.999F, 1.0058F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(120, 48).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3089F, 3.8017F, 2.7728F, -2.2532F, 0.9159F, 0.8095F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(111, 118).addBox(-0.8F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(118, 106).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.52F, 3.4241F, 1.7814F, -2.0203F, 0.8216F, 0.9513F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(111, 115).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3883F, 2.257F, 1.0088F, -1.8553F, 0.3062F, 1.1834F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(91, 115).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3093F, 2.5088F, 1.5477F, -1.8604F, 0.3564F, 1.1678F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(116, 118).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2739F, 2.8546F, 2.0367F, -1.8881F, 0.5397F, 1.1042F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(106, 118).addBox(-0.4255F, -0.5382F, -1.8073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.668F, 4.3991F, 0.4575F, -2.4595F, -0.2331F, -0.2224F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(117, 0).addBox(-0.4255F, -1.8416F, -0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.668F, 4.3991F, 0.4575F, -1.0632F, -0.2331F, -0.2224F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(115, 80).addBox(-0.4255F, -0.147F, 0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.668F, 4.3991F, 0.4575F, 0.1585F, -0.2331F, -0.2224F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(118, 103).addBox(-0.4255F, 1.0658F, -1.0553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.668F, 4.3991F, 0.4575F, 1.5111F, -0.2331F, -0.2224F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(99, 83).addBox(-0.8301F, -0.4831F, -1.5541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8466F, 5.0936F, 2.1204F, 1.1502F, -0.1466F, -0.1329F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(99, 58).addBox(-0.5F, -0.5576F, -0.4659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.005F, 8.9268F, 0.6067F, 0.6589F, -0.3054F, 0.0F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(117, 27).addBox(-0.5F, -0.8005F, -0.9907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 8.9268F, 0.6067F, 1.1388F, -0.3054F, 0.0F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(46, 81).addBox(-2.253F, 0.9979F, 10.7184F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, 0.0436F, 0.0436F, -0.0698F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(60, 18).addBox(-2.253F, -2.4371F, 9.9424F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.1309F, 0.0436F, -0.0698F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(96, 43).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0914F, 1.545F, -3.3764F, 0.3476F, -0.0478F, -0.2687F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(28, 75).addBox(-0.1872F, -8.3627F, 8.5286F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.4815F, -0.0478F, -0.2687F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(29, 68).addBox(0.8128F, -7.008F, 7.5394F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.3506F, -0.0478F, -0.2687F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(106, 107).addBox(-0.4551F, 0.0907F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.4047F, 3.342F, -27.2723F, 0.4814F, 0.2253F, -0.0432F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(104, 103).addBox(-0.475F, -0.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F))
				.texOffs(104, 99).addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.2355F, 4.9739F, -8.2389F, -0.0965F, 0.0456F, -0.0677F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(64, 104).addBox(-0.45F, -0.8F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.2355F, 4.9739F, -8.2389F, -0.0966F, 0.063F, -0.0694F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(24, 104).addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.0557F, 4.0112F, -11.7254F, -0.0529F, 0.0456F, -0.0677F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(97, 103).addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.0323F, 3.7969F, -13.3323F, 0.0344F, 0.0456F, -0.0677F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(69, 82).addBox(-0.5F, -0.7F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.1039F, 3.8368F, -14.956F, -0.0092F, 0.0456F, -0.0677F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(90, 103).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.1993F, 3.6661F, -16.7895F, 0.0344F, 0.0456F, -0.0677F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(103, 62).addBox(-0.55F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.2322F, 3.6226F, -18.5416F, 0.0344F, 0.0456F, -0.0677F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(103, 42).addBox(-0.55F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3681F, 3.4834F, -20.3429F, 0.1209F, 0.0967F, -0.0791F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(7, 103).addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(-0.5599F, 3.5983F, -21.775F, 0.1897F, 0.1395F, -0.0876F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(73, 102).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.8249F, 3.6174F, -23.6669F, 0.2333F, 0.1395F, -0.0876F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(57, 102).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.0313F, 3.8632F, -25.2846F, 0.3031F, 0.1395F, -0.0876F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(50, 102).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.2378F, 4.0802F, -26.8847F, 0.3293F, 0.1395F, -0.0876F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(69, 58).addBox(-0.4532F, -0.8268F, -0.5554F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.4047F, 3.342F, -27.2723F, 0.242F, 0.1395F, -0.0876F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(56, 71).addBox(-0.1502F, -1.8098F, -2.8817F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.9246F, 3.4624F, -22.1946F, 0.1016F, 0.1701F, -0.0702F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 76).addBox(-0.4479F, -0.4596F, -2.5892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.4047F, 3.342F, -27.2723F, 0.7148F, 0.2265F, -0.0541F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(76, 64).addBox(-0.4479F, -1.2778F, -2.2294F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.4047F, 3.342F, -27.2723F, 1.0202F, 0.2265F, -0.0541F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(47, 70).addBox(-0.4532F, -1.5244F, -0.3036F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.4047F, 3.342F, -27.2723F, 0.3642F, 0.1395F, -0.0876F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(31, 56).addBox(0.3268F, -3.8842F, -3.4404F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.9246F, 3.4624F, -22.1946F, 0.2469F, 0.2108F, -0.2247F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(37, 75).addBox(-0.1502F, -3.2768F, -2.4404F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.9246F, 3.4624F, -22.1946F, 0.2762F, 0.1701F, -0.0702F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(27, 62).addBox(0.0814F, -4.5763F, -2.4437F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0754F, 3.4624F, -19.7946F, 0.1739F, 0.15F, -0.3291F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(42, 49).addBox(-0.9035F, -3.905F, -2.4437F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0754F, 3.4624F, -19.7946F, 0.2064F, 0.1003F, -0.07F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 69).addBox(-0.9035F, -2.9612F, -2.9144F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0754F, 3.4624F, -19.7946F, 0.0318F, 0.1003F, -0.07F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(82, 38).addBox(-0.975F, -0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6454F, -1.9169F, -19.6471F, 0.0761F, 0.038F, -0.3748F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(82, 43).addBox(-0.9F, -1.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F))
				.texOffs(51, 86).addBox(-0.9F, -0.9F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1385F, -0.3257F, -18.5466F, -0.0606F, 0.0313F, -0.2878F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(9, 55).addBox(-0.253F, -3.5692F, -5.1591F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.0524F, 0.0436F, -0.0698F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(47, 58).addBox(-0.9F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5489F, -1.818F, -15.5575F, -0.0259F, 0.0072F, -0.3995F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(31, 49).addBox(-0.9F, -1.9F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0017F, -0.1151F, -15.7589F, -0.1121F, 0.0171F, -0.3128F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(51, 7).addBox(-0.253F, -3.4462F, -2.5376F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.1047F, 0.0436F, -0.0698F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(82, 18).addBox(-0.9F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.4436F, -1.9726F, -10.8881F, -0.0974F, 0.0117F, -0.2944F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(71, 10).addBox(-0.9F, -1.9F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.2253F, 0.4705F, -11.5063F, -0.1625F, 0.013F, -0.2594F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(53, 42).addBox(-0.253F, -3.4606F, 0.0868F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.1571F, 0.0436F, -0.0698F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(67, 24).addBox(0.4235F, -6.3183F, 2.6825F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.2481F, -0.0033F, -0.256F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(0, 53).addBox(-0.253F, -3.7081F, 2.5825F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.2443F, 0.0436F, -0.0698F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(38, 68).addBox(0.491F, -6.492F, 5.2533F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.2823F, -0.0122F, -0.2627F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(53, 50).addBox(-0.253F, -3.8972F, 5.2533F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.2793F, 0.0436F, -0.0698F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(18, 58).addBox(-0.253F, -4.4567F, 7.7685F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.3491F, 0.0436F, -0.0698F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(92, 58).addBox(-0.253F, -2.6254F, 9.5574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3771F, 3.3559F, -15.0492F, -0.3665F, 0.0436F, -0.0698F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(109, 16).addBox(-1.6436F, -0.9579F, -0.3873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2039F, 2.8481F, -1.9388F, 0.1013F, 1.5522F, 0.0612F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(91, 20).addBox(-0.5125F, -0.9215F, -0.3899F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2039F, 2.8481F, -1.9388F, 1.5547F, 0.7923F, 1.5167F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(67, 38).addBox(-0.8875F, -0.7215F, -0.3899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2039F, 2.8481F, -1.9388F, 1.5325F, 1.2721F, 1.4914F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(38, 98).addBox(-0.4105F, -0.7437F, -1.7802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2039F, 2.8481F, -1.9388F, 0.4871F, 0.1433F, 0.0387F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(79, 111).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9989F, -1.1422F, -23.2333F, 1.9119F, 0.1997F, -0.2801F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(74, 111).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9989F, -1.1422F, -23.2333F, 1.9561F, 0.0809F, 0.0328F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(49, 0).addBox(-0.57F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.47F))
				.texOffs(20, 68).addBox(-0.08F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0191F, 5.2634F, -0.7645F, -0.1115F, 0.1212F, -0.0935F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(76, 115).addBox(-0.8F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2F, 1.9887F, -28.3175F, 2.5488F, 0.0293F, 0.0434F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(110, 42).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.3832F, -25.112F, 2.0989F, 0.1911F, -0.3147F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(110, 60).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.6766F, -26.808F, 2.2645F, 0.298F, -0.2303F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(56, 114).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9091F, -1.6855F, -21.3242F, 1.8498F, 0.053F, 0.0029F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(114, 10).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9091F, -1.6855F, -21.3242F, 1.8161F, 0.1443F, -0.3358F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(114, 46).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -2.0138F, -19.3625F, 1.6897F, 0.156F, -0.3485F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(19, 94).addBox(0.9F, -2.1F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7F, 4.8743F, -6.2386F, 1.1926F, 0.1217F, -0.0482F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -2.0138F, -19.3625F, 1.7375F, 0.1033F, 0.0173F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(84, 111).addBox(-0.8F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2837F, 3.3134F, -29.2109F, 2.8804F, 0.0293F, 0.0434F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(85, 101).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4041F, -2.187F, -11.366F, 1.5437F, 0.0864F, -0.0145F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(60, 82).addBox(-0.4F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 7.9339F, -1.8686F, 2.4343F, 0.4891F, -0.3819F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(113, 107).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, -1.9616F, -9.3878F, 1.4568F, 0.0954F, -0.0109F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.0781F, -1.1971F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(118, 86).mirror().addBox(-0.7071F, -0.7668F, -0.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(118, 83).mirror().addBox(-0.7071F, -0.7668F, -0.6368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5504F, 9.3314F, -0.2975F, -0.4496F, -0.0688F, 0.0159F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(119, 109).mirror().addBox(-0.7071F, -0.6382F, -0.2237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(84, 119).mirror().addBox(-0.7071F, -0.6382F, -0.7237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5504F, 9.3314F, -0.2975F, -0.7463F, -0.0688F, 0.0159F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.7071F, -0.7007F, -2.8399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5504F, 9.3314F, -0.2975F, -0.6852F, -0.0688F, 0.0159F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(60, 87).mirror().addBox(-0.6001F, -1.0403F, -5.2349F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5504F, 9.3314F, -0.2975F, -0.5572F, 0.04F, 0.0644F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(117, 36).mirror().addBox(-0.5F, -0.7745F, -0.7254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.005F, 8.9268F, 0.6067F, 2.0988F, 0.3054F, 0.0F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(117, 33).mirror().addBox(-0.5F, -0.2518F, -0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.005F, 8.9268F, 0.6067F, 1.4006F, 0.3054F, 0.0F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(101, 115).mirror().addBox(-0.1699F, -2.0535F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8466F, 5.0936F, 2.1204F, 2.5028F, 0.1466F, 0.1329F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(120, 19).mirror().addBox(-0.5F, -0.5337F, -0.7561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3939F, 2.4295F, -0.3343F, -0.0108F, 0.0627F, 0.2167F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(116, 97).mirror().addBox(-0.5F, -0.2439F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3939F, 2.4295F, -0.3343F, 1.2982F, 0.0627F, 0.2167F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.5745F, 0.8203F, -0.3631F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.668F, 4.3991F, 0.4575F, 2.5147F, 0.2331F, 0.2224F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2898F, 4.3301F, 3.0564F, -2.4918F, -0.9939F, -0.6884F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(120, 59).mirror().addBox(-0.8F, -1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 120).mirror().addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.561F, 4.0663F, 2.2969F, -2.0415F, -1.0118F, -1.0664F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-0.8F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.561F, 4.0663F, 2.2969F, -1.9706F, -0.999F, -1.0058F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3089F, 3.8017F, 2.7728F, -2.2532F, -0.9159F, -0.8095F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(111, 118).mirror().addBox(-0.2F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(118, 106).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.52F, 3.4241F, 1.7814F, -2.0203F, -0.8216F, -0.9513F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(111, 115).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3883F, 2.257F, 1.0088F, -1.8553F, -0.3062F, -1.1834F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(91, 115).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 2.5088F, 1.5477F, -1.8604F, -0.3564F, -1.1678F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(116, 118).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2739F, 2.8546F, 2.0367F, -1.8881F, -0.5397F, -1.1042F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(106, 118).mirror().addBox(-0.5745F, -0.5382F, -1.8073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.668F, 4.3991F, 0.4575F, -2.4595F, 0.2331F, 0.2224F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(117, 0).mirror().addBox(-0.5745F, -1.8416F, -0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.668F, 4.3991F, 0.4575F, -1.0632F, 0.2331F, 0.2224F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(115, 80).mirror().addBox(-0.5745F, -0.147F, 0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.668F, 4.3991F, 0.4575F, 0.1585F, 0.2331F, 0.2224F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(118, 103).mirror().addBox(-0.5745F, 1.0658F, -1.0553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.668F, 4.3991F, 0.4575F, 1.5111F, 0.2331F, 0.2224F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.1699F, -0.4831F, -1.5541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8466F, 5.0936F, 2.1204F, 1.1502F, 0.1466F, 0.1329F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(99, 58).mirror().addBox(-0.5F, -0.5576F, -0.4659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.005F, 8.9268F, 0.6067F, 0.6589F, 0.3054F, 0.0F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(117, 27).mirror().addBox(-0.5F, -0.8005F, -0.9907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.005F, 8.9268F, 0.6067F, 1.1388F, 0.3054F, 0.0F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(46, 81).mirror().addBox(-0.747F, 0.9979F, 10.7184F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, 0.0436F, -0.0436F, 0.0698F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-0.747F, -2.4371F, 9.9424F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.1309F, -0.0436F, 0.0698F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(96, 43).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0914F, 1.545F, -3.3764F, 0.3476F, 0.0478F, 0.2687F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(28, 75).mirror().addBox(-1.8128F, -8.3627F, 8.5286F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.4815F, 0.0478F, 0.2687F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(-1.8128F, -7.008F, 7.5394F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.3506F, 0.0478F, 0.2687F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.5449F, 0.0907F, -2.1191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 3.342F, -27.2723F, 0.4814F, -0.2253F, 0.0432F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(104, 103).mirror().addBox(-0.525F, -0.2F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(104, 99).mirror().addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-0.2355F, 4.9739F, -8.2389F, -0.0965F, -0.0456F, 0.0677F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(64, 104).mirror().addBox(-0.55F, -0.8F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.2355F, 4.9739F, -8.2389F, -0.0966F, -0.063F, 0.0694F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(24, 104).mirror().addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-0.0557F, 4.0112F, -11.7254F, -0.0529F, -0.0456F, 0.0677F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(97, 103).mirror().addBox(-0.5F, -0.425F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.0323F, 3.7969F, -13.3323F, 0.0344F, -0.0456F, 0.0677F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.5F, -0.7F, -1.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(0.1039F, 3.8368F, -14.956F, -0.0092F, -0.0456F, 0.0677F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(90, 103).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.1993F, 3.6661F, -16.7895F, 0.0344F, -0.0456F, 0.0677F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-0.45F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(0.2322F, 3.6226F, -18.5416F, 0.0344F, -0.0456F, 0.0677F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(-0.45F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3681F, 3.4834F, -20.3429F, 0.1209F, -0.0967F, 0.0791F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(7, 103).mirror().addBox(-0.5F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(0.5599F, 3.5983F, -21.775F, 0.1897F, -0.1395F, 0.0876F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(73, 102).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.8249F, 3.6174F, -23.6669F, 0.2333F, -0.1395F, 0.0876F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.0313F, 3.8632F, -25.2846F, 0.3031F, -0.1395F, 0.0876F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(50, 102).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(1.2378F, 4.0802F, -26.8847F, 0.3293F, -0.1395F, 0.0876F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(69, 58).mirror().addBox(-0.5468F, -0.8268F, -0.5554F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 3.342F, -27.2723F, 0.242F, -0.1395F, 0.0876F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(-0.8498F, -1.8098F, -2.8817F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.9246F, 3.4624F, -22.1946F, 0.1016F, -0.1701F, 0.0702F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5521F, -0.4596F, -2.5892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 3.342F, -27.2723F, 0.7148F, -0.2265F, 0.0541F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(76, 64).mirror().addBox(-0.5521F, -1.2778F, -2.2294F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 3.342F, -27.2723F, 1.0202F, -0.2265F, 0.0541F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(47, 70).mirror().addBox(-0.5468F, -1.5244F, -0.3036F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 3.342F, -27.2723F, 0.3642F, -0.1395F, 0.0876F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(31, 56).mirror().addBox(-1.3268F, -3.8842F, -3.4404F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.9246F, 3.4624F, -22.1946F, 0.2469F, -0.2108F, 0.2247F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-0.8498F, -3.2768F, -2.4404F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.9246F, 3.4624F, -22.1946F, 0.2762F, -0.1701F, 0.0702F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-1.0814F, -4.5763F, -2.4437F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 3.4624F, -19.7946F, 0.1739F, -0.15F, 0.3291F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(42, 49).mirror().addBox(-0.0965F, -3.905F, -2.4437F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 3.4624F, -19.7946F, 0.2064F, -0.1003F, 0.07F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.0965F, -2.9612F, -2.9144F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.0754F, 3.4624F, -19.7946F, 0.0318F, -0.1003F, 0.07F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-0.025F, -0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6454F, -1.9169F, -19.6471F, 0.0761F, -0.038F, 0.3748F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(82, 43).mirror().addBox(-0.1F, -1.4F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(51, 86).mirror().addBox(-0.1F, -0.9F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1385F, -0.3257F, -18.5466F, -0.0606F, -0.0313F, 0.2878F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-0.747F, -3.5692F, -5.1591F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.0524F, -0.0436F, 0.0698F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(-0.1F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5489F, -1.818F, -15.5575F, -0.0259F, -0.0072F, 0.3995F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(31, 49).mirror().addBox(-0.1F, -1.9F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0017F, -0.1151F, -15.7589F, -0.1121F, -0.0171F, 0.3128F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(51, 7).mirror().addBox(-0.747F, -3.4462F, -2.5376F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.1047F, -0.0436F, 0.0698F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.1F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.4436F, -1.9726F, -10.8881F, -0.0974F, -0.0117F, 0.2944F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.1F, -1.9F, -2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.2253F, 0.4705F, -11.5063F, -0.1625F, -0.013F, 0.2594F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-0.747F, -3.4606F, 0.0868F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.1571F, -0.0436F, 0.0698F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-1.4235F, -6.3183F, 2.6825F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.2481F, 0.0033F, 0.256F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.747F, -3.7081F, 2.5825F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.2443F, -0.0436F, 0.0698F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(38, 68).mirror().addBox(-1.491F, -6.492F, 5.2533F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.2823F, 0.0122F, 0.2627F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-0.747F, -3.8972F, 5.2533F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.2793F, -0.0436F, 0.0698F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.747F, -4.4567F, 7.7685F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.3491F, -0.0436F, 0.0698F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(92, 58).mirror().addBox(-0.747F, -2.6254F, 9.5574F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3771F, 3.3559F, -15.0492F, -0.3665F, -0.0436F, 0.0698F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(109, 16).mirror().addBox(-0.3564F, -0.9579F, -0.3873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2039F, 2.8481F, -1.9388F, 0.1013F, -1.5522F, -0.0612F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(91, 20).mirror().addBox(-2.4876F, -0.9215F, -0.3899F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2039F, 2.8481F, -1.9388F, 1.5547F, -0.7923F, -1.5167F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-0.1125F, -0.7215F, -0.3899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2039F, 2.8481F, -1.9388F, 1.5325F, -1.2721F, -1.4914F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-0.5895F, -0.7437F, -1.7802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2039F, 2.8481F, -1.9388F, 0.4871F, -0.1433F, -0.0387F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(79, 111).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9989F, -1.1422F, -23.2333F, 1.9119F, -0.1997F, 0.2801F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(74, 111).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9989F, -1.1422F, -23.2333F, 1.9561F, -0.0809F, -0.0328F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.43F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.47F)).mirror(false)
				.texOffs(20, 68).mirror().addBox(-0.92F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0191F, 5.2634F, -0.7645F, -0.1115F, -0.1212F, 0.0935F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(76, 115).mirror().addBox(-0.2F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.2F, 1.9887F, -28.3175F, 2.5488F, -0.0293F, -0.0434F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(110, 42).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2F, -0.3832F, -25.112F, 2.0989F, -0.1911F, 0.3147F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(110, 60).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2F, 0.6766F, -26.808F, 2.2645F, -0.298F, 0.2303F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(56, 114).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9091F, -1.6855F, -21.3242F, 1.8498F, -0.053F, -0.0029F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(114, 10).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9091F, -1.6855F, -21.3242F, 1.8161F, -0.1443F, 0.3358F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(114, 46).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -2.0138F, -19.3625F, 1.6897F, -0.156F, 0.3485F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(19, 94).mirror().addBox(-1.9F, -2.1F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.7F, 4.8743F, -6.2386F, 1.1926F, -0.1217F, 0.0482F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -2.0138F, -19.3625F, 1.7375F, -0.1033F, -0.0173F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(84, 111).mirror().addBox(-0.2F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2837F, 3.3134F, -29.2109F, 2.8804F, -0.0293F, -0.0434F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4041F, -2.187F, -11.366F, 1.5437F, -0.0864F, 0.0145F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.6F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.9339F, -1.8686F, 2.4343F, -0.4891F, 0.3819F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(113, 107).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.9616F, -9.3878F, 1.4568F, -0.0954F, 0.0109F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.0645F, -0.5763F, 0.2974F, 0.0F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(0.0058F, -0.6659F, -6.5794F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -0.1476F, -0.0404F, -0.3137F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-0.0147F, -0.6829F, -6.6001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -0.2693F, -0.0353F, -0.2823F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(101, 75).mirror().addBox(-0.3348F, -0.7349F, -0.3027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 0.7172F, -4.6879F, -0.6165F, -0.4369F, 0.2549F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-1.0522F, 0.3694F, 2.1628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 0.7172F, -4.6879F, -0.0409F, -0.0747F, 0.1489F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(101, 79).mirror().addBox(-0.6256F, -0.4035F, 1.0594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9793F, 0.7172F, -4.6879F, -0.3388F, -0.2491F, 0.1563F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-0.1181F, -1.4557F, -9.3917F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -0.1667F, -0.0449F, -0.2961F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.1181F, -0.9168F, -11.4829F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -0.0969F, -0.0449F, -0.2961F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-0.1181F, -1.9401F, -11.108F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -0.1144F, -0.0449F, -0.2961F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.0274F, -2.1933F, -1.4418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.0518F, -0.0783F, -0.2967F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(87, 92).mirror().addBox(-0.0274F, -2.2164F, -3.205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.0344F, -0.0783F, -0.2967F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(76, 93).mirror().addBox(-0.0274F, -2.3235F, -4.9293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, 0.0006F, -0.0783F, -0.2967F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(12, 94).mirror().addBox(-0.0274F, -2.4907F, -6.6487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, 0.0355F, -0.0783F, -0.2967F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-0.0274F, -2.8301F, -8.3146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, 0.0878F, -0.0783F, -0.2967F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(94, 53).mirror().addBox(-0.3735F, -0.0773F, -0.7581F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.13F, -0.0449F, -0.2961F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-0.3735F, -0.1146F, -2.5583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.1867F, -0.0449F, -0.2961F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(73, 98).mirror().addBox(-0.3735F, -0.3289F, -4.3477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.274F, -0.0449F, -0.2961F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(66, 96).mirror().addBox(-0.3735F, -0.5508F, -6.1299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.3263F, -0.0449F, -0.2961F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(96, 115).mirror().addBox(-1.2331F, 1.1968F, -0.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.4383F, -0.0115F, -0.2958F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(15, 120).mirror().addBox(-1.2331F, 1.0851F, -1.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.5692F, -0.0115F, -0.2958F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(49, 119).mirror().addBox(-1.0018F, 0.7489F, -2.8324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.7568F, 0.0887F, -0.2272F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(119, 45).mirror().addBox(-1.0018F, 2.7513F, 0.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, -0.5959F, 0.0887F, -0.2272F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(116, 16).mirror().addBox(-1.0018F, -0.1843F, 3.4884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, -1.9048F, 0.0887F, -0.2272F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.0274F, -0.9925F, -5.9138F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.1042F, -0.0783F, -0.2967F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-0.0274F, -1.4958F, -9.6139F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.0169F, -0.0783F, -0.2967F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.3735F, 0.2079F, -1.8435F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.0252F, -0.0449F, -0.2961F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(-0.3735F, 1.1149F, -3.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(97, 99).mirror().addBox(-0.3735F, 0.6149F, -3.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.0776F, -0.0449F, -0.2961F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-0.3735F, 0.7957F, -5.6018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.1649F, -0.0449F, -0.2961F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(98, 7).mirror().addBox(-1.2331F, 1.5816F, -1.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.242F, -0.0115F, -0.2958F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(94, 73).mirror().addBox(0.0058F, 2.7686F, -2.1047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -1.413F, -0.0404F, -0.3137F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(0.0058F, 1.5067F, -0.3298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -1.6311F, -0.0404F, -0.3137F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(114, 111).mirror().addBox(0.0058F, -0.4603F, -0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -1.7882F, -0.0404F, -0.3137F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(109, 11).mirror().addBox(0.0058F, -0.4126F, -0.2706F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(69, 119).mirror().addBox(0.0058F, -1.0126F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, -2.0936F, -0.0404F, -0.3137F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(71, 115).mirror().addBox(0.0058F, -0.6363F, 2.2306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-3.0848F, -0.0783F, -0.569F, 3.0551F, -0.0404F, -0.3137F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(5, 119).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.7059F, 0.3235F, -6.279F, -0.1442F, 0.0513F, 0.2904F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-1.7491F, 0.6095F, -6.3303F, 0.0301F, 1.3655F, 0.3768F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(119, 9).mirror().addBox(-1.0F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-1.7491F, 0.6095F, -6.3303F, -1.2279F, -1.4178F, 1.522F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(36, 18).mirror().addBox(-0.1F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.6825F, -0.0867F, -9.5966F, -0.1051F, 0.0187F, 0.3116F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.9F, -0.9F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(13, 41).mirror().addBox(-1.5F, -0.9F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.0043F, 0.7185F, -7.2439F, -0.1052F, 0.0361F, 0.3098F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.48F, -0.1982F, -5.9138F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.1301F, -0.0046F, 0.3104F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(15, 26).mirror().addBox(0.9048F, -0.1982F, -5.8689F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.1301F, 0.0041F, 0.3092F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(30, 26).mirror().addBox(-0.9F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.8852F, -0.1755F, -11.7876F, -0.1302F, 0.0387F, 0.3047F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(58, 58).mirror().addBox(0.1913F, -0.6105F, -9.6139F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.0588F, -0.0544F, 0.3151F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.9F, -0.5F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.8719F, -0.9642F, -17.5549F, -0.0587F, 0.0153F, 0.311F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(0.7645F, -0.6105F, -8.5418F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.9848F, -1.1783F, -11.869F, -0.0587F, -0.0196F, 0.3131F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(71, 106).mirror().addBox(0.885F, 0.9836F, -1.8435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, -0.0051F, -0.0512F, 0.3155F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(106, 83).mirror().addBox(1.2983F, 0.9836F, -1.7611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, -0.0051F, 0.0011F, 0.3152F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(24, 100).mirror().addBox(0.7999F, 0.9234F, -3.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.0393F, -0.0806F, 0.2975F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(7, 107).mirror().addBox(1.2453F, 0.9234F, -3.6128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.0391F, -0.0108F, 0.3002F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.5804F, 0.6771F, -5.6018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, -3.2783F, -21.369F, 0.1154F, -0.1263F, 0.2676F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-1.0F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.8111F, -0.9624F, -26.3587F, 0.1144F, -0.0049F, 0.2816F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(31, 97).mirror().addBox(0.1777F, 1.9018F, -1.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.1991F, -0.1389F, 0.259F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(0.3126F, 1.9018F, -0.9969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.1975F, -0.0533F, 0.2762F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(39, 119).mirror().addBox(0.1412F, 1.9018F, -1.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2848F, -3.2783F, -27.769F, 0.2005F, -0.1816F, 0.2502F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.5F, -1.125F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.6268F, -2.6694F, -15.7501F, -0.1303F, -0.0783F, -0.2967F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(105, 4).mirror().addBox(-0.5F, -1.2F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(105, 30).mirror().addBox(-0.5F, -1.4F, 1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(105, 34).mirror().addBox(-0.5F, -1.5F, 3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.7744F, -2.7179F, -14.1296F, -0.2002F, -0.0783F, -0.2967F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(105, 38).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.6913F, -3.3991F, -17.3637F, -0.1303F, -0.0783F, -0.2967F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(36, 106).mirror().addBox(-0.5F, -0.1F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.6263F, -3.6637F, -19.143F, -0.0867F, -0.0783F, -0.2967F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(43, 106).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.338F, -3.1698F, -20.8174F, -0.0344F, -0.0783F, -0.2967F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-0.5F, -0.45F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.2081F, -2.9612F, -21.6241F, 0.0006F, -0.039F, -0.2967F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(106, 56).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0131F, -2.6533F, -24.0971F, 0.0704F, -0.039F, -0.2967F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(-0.5F, -0.375F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(106, 66).mirror().addBox(-0.5F, -0.15F, -1.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8152F, -2.2425F, -25.8684F, 0.1576F, -0.039F, -0.2967F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(97, 99).addBox(-0.6265F, 0.6149F, -3.6596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(90, 99).addBox(-0.6265F, 1.1149F, -3.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.0776F, 0.0449F, 0.2961F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(98, 0).addBox(-1.3126F, 1.9018F, -0.9969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.1975F, 0.0533F, -0.2762F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(39, 119).addBox(-1.1412F, 1.9018F, -1.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.2005F, 0.1816F, -0.2502F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(31, 97).addBox(-1.1777F, 1.9018F, -1.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.1991F, 0.1389F, -0.259F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(98, 7).addBox(0.2331F, 1.5816F, -1.1303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.242F, 0.0115F, 0.2958F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(83, 97).addBox(0.0F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1889F, -0.9624F, -26.3587F, 0.1144F, 0.0049F, -0.2816F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(0, 97).addBox(-1.5804F, 0.6771F, -5.6018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.1154F, 0.1263F, -0.2676F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(96, 63).addBox(-0.6265F, 0.7957F, -5.6018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.1649F, 0.0449F, 0.2961F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(7, 107).addBox(-2.2453F, 0.9234F, -3.6128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.0391F, 0.0108F, -0.3002F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(24, 100).addBox(-1.7999F, 0.9234F, -3.7096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.0393F, 0.0806F, -0.2975F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(106, 83).addBox(-2.2983F, 0.9836F, -1.7611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, -0.0051F, -0.0011F, -0.3152F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(71, 106).addBox(-1.885F, 0.9836F, -1.8435F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, -0.0051F, 0.0512F, -0.3155F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(94, 89).addBox(-0.6265F, 0.2079F, -1.8435F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.0252F, 0.0449F, 0.2961F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(83, 69).addBox(-1.7645F, -0.6105F, -8.5418F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.0587F, 0.0196F, -0.3131F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(60, 0).addBox(-0.1F, -0.5F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.1281F, -0.9642F, -17.5549F, -0.0587F, -0.0153F, -0.311F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(58, 58).addBox(-1.1913F, -0.6105F, -9.6139F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.0588F, 0.0544F, -0.3151F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(49, 18).addBox(-0.9726F, -1.4958F, -9.6139F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.0169F, 0.0783F, 0.2967F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(30, 26).addBox(-0.1F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1148F, -0.1755F, -11.7876F, -0.1302F, -0.0387F, -0.3047F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(15, 26).addBox(-1.9048F, -0.1982F, -5.8689F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.1301F, -0.0041F, -0.3092F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(0, 24).addBox(-1.48F, -0.1982F, -5.9138F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.1301F, 0.0046F, -0.3104F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(21, 0).addBox(-0.9726F, -0.9925F, -5.9138F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.1042F, 0.0783F, 0.2967F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(13, 41).addBox(0.5F, -0.9F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 39).addBox(-0.1F, -0.9F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.9957F, 0.7185F, -7.2439F, -0.1052F, -0.0361F, -0.3098F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(36, 18).addBox(-0.9F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(0.6825F, -0.0867F, -9.5966F, -0.1051F, -0.0187F, -0.3116F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(36, 0).addBox(-0.8819F, -0.9168F, -11.4829F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -0.0969F, 0.0449F, 0.2961F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(116, 16).addBox(0.0018F, -0.1843F, 3.4884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, -1.9048F, -0.0887F, 0.2272F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(119, 45).addBox(0.0018F, 2.7513F, 0.1374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, -0.5959F, -0.0887F, 0.2272F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(49, 119).addBox(0.0018F, 0.7489F, -2.8324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.7568F, -0.0887F, 0.2272F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(15, 120).addBox(0.2331F, 1.0851F, -1.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.5692F, 0.0115F, 0.2958F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(96, 115).addBox(0.2331F, 1.1968F, -0.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7152F, -3.2783F, -27.769F, 0.4383F, 0.0115F, 0.2958F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(66, 96).addBox(-0.6265F, -0.5508F, -6.1299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.3263F, 0.0449F, 0.2961F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(73, 98).addBox(-0.6265F, -0.3289F, -4.3477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.274F, 0.0449F, 0.2961F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(85, 107).addBox(-0.6265F, -0.1146F, -2.5583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.1867F, 0.0449F, 0.2961F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(94, 53).addBox(-0.6265F, -0.0773F, -0.7581F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4848F, -3.2783F, -21.369F, 0.13F, 0.0449F, 0.2961F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(94, 23).addBox(-0.9726F, -2.8301F, -8.3146F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, 0.0878F, 0.0783F, 0.2967F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(12, 94).addBox(-0.9726F, -2.4907F, -6.6487F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, 0.0355F, 0.0783F, 0.2967F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(105, 34).addBox(-0.5F, -1.5F, 3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(105, 30).addBox(-0.5F, -1.4F, 1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(105, 4).addBox(-0.5F, -1.2F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(105, 0).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7745F, -2.7179F, -14.1296F, -0.2002F, 0.0783F, 0.2967F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(106, 66).addBox(-0.5F, -0.15F, -1.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(57, 106).addBox(-0.5F, -0.375F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1848F, -2.2425F, -25.8684F, 0.1576F, 0.039F, 0.2967F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(106, 56).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0131F, -2.6533F, -24.0971F, 0.0704F, 0.039F, 0.2967F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(50, 106).addBox(-0.5F, -0.45F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.2081F, -2.9612F, -21.6241F, 0.0006F, 0.039F, 0.2967F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(43, 106).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.338F, -3.1698F, -20.8174F, -0.0344F, 0.0783F, 0.2967F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(36, 106).addBox(-0.5F, -0.1F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.6263F, -3.6637F, -19.143F, -0.0867F, 0.0783F, 0.2967F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(105, 38).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6913F, -3.3991F, -17.3637F, -0.1303F, 0.0783F, 0.2967F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -1.125F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.6268F, -2.6694F, -15.7501F, -0.1303F, 0.0783F, 0.2967F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(76, 93).addBox(-0.9726F, -2.3235F, -4.9293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, 0.0006F, 0.0783F, 0.2967F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(87, 92).addBox(-0.9726F, -2.2164F, -3.205F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.0344F, 0.0783F, 0.2967F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(92, 84).addBox(-0.9726F, -2.1933F, -1.4418F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9848F, -1.1783F, -11.869F, -0.0518F, 0.0783F, 0.2967F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(92, 68).addBox(-0.8819F, -1.9401F, -11.108F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -0.1144F, 0.0449F, 0.2961F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(73, 44).addBox(-0.8819F, -1.4557F, -9.3917F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -0.1667F, 0.0449F, 0.2961F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(101, 79).addBox(-0.3744F, -0.4035F, 1.0594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0207F, 0.7172F, -4.6879F, -0.3388F, 0.2491F, -0.1563F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(80, 10).addBox(0.0522F, 0.3694F, 2.1628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0207F, 0.7172F, -4.6879F, -0.0409F, 0.0747F, -0.1489F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(101, 75).addBox(-0.6652F, -0.7349F, -0.3027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0207F, 0.7172F, -4.6879F, -0.6165F, 0.4369F, -0.2549F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(85, 23).addBox(-0.9853F, -0.6829F, -6.6001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -0.2693F, 0.0353F, 0.2823F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(69, 119).addBox(-1.0058F, -1.0126F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(109, 11).addBox(-1.0058F, -0.4126F, -0.2706F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -2.0936F, 0.0404F, 0.3137F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(71, 115).addBox(-1.0058F, -0.6363F, 2.2306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, 3.0551F, 0.0404F, 0.3137F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(114, 111).addBox(-1.0058F, -0.4603F, -0.09F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -1.7882F, 0.0404F, 0.3137F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(66, 114).addBox(-1.0058F, 1.5067F, -0.3298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -1.6311F, 0.0404F, 0.3137F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(94, 73).addBox(-1.0058F, 2.7686F, -2.1047F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -1.413F, 0.0404F, 0.3137F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(119, 6).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(-0.2509F, 0.6095F, -6.3303F, 0.0301F, -1.3655F, -0.3768F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(119, 9).addBox(0.0F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(-0.2509F, 0.6095F, -6.3303F, -1.2279F, 1.4178F, -1.522F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(5, 119).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.7059F, 0.3235F, -6.279F, -0.1442F, -0.0513F, -0.2904F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(94, 78).addBox(-1.0058F, -0.6659F, -6.5794F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(1.0848F, -0.0783F, -0.569F, -0.1476F, 0.0404F, 0.3137F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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