package fossils.fossils.client.blockentity.model.Kelenken;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KelenkenFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftSickleClaw2;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightSickleClaw2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public KelenkenFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe = this.leftLeg3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftSickleClaw2 = this.leftSickleClaw.getChild("leftSickleClaw2");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightSickleClaw2 = this.rightSickleClaw.getChild("rightSickleClaw2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.8754F, 1.0883F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 4).addBox(-0.5F, 0.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 1.4632F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 96).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4735F, -2.0775F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 48).addBox(-1.0F, 1.4F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8159F, -1.6798F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-0.9389F, 0.0534F, -0.3615F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, 0.2845F, 0.0989F, -0.4344F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(-6.2281F, -1.8016F, -0.3773F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, 0.0157F, 0.2734F, -1.5101F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(-2.8304F, -0.4461F, -0.3773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, 0.1526F, 0.2282F, -0.9711F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 40).addBox(0.8304F, -0.4461F, -0.3773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, 0.1526F, -0.2282F, 0.9711F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 30).addBox(2.2281F, -1.8016F, -0.3773F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, 0.0157F, -0.2734F, 1.5101F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(72, 26).addBox(-0.0611F, 0.0534F, -0.3615F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, 0.2845F, -0.0989F, 0.4344F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 25).addBox(-1.0F, 0.0027F, 0.0176F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5523F, 1.4621F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0973F, -5.9824F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.6444F, 1.423F, -0.3578F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 10).addBox(-2.0387F, -3.154F, -0.9355F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.893F, -0.9566F, 1.0852F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 20).addBox(-5.3749F, -3.0618F, -0.0288F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -1.5111F, -1.0645F, 1.815F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 32).addBox(-3.3516F, 0.9936F, -1.4054F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, -2.4036F, 4.6358F, -1.7874F, -1.028F, 2.2084F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(23, 60).addBox(-0.5021F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.6531F, 1.3151F, -1.1235F, -0.1736F, 1.0988F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 14).addBox(-1.5026F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.6531F, 1.3151F, -1.1578F, 0.318F, 0.4127F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(21, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4653F, -2.5633F, 4.3294F, -0.6654F, -0.1836F, 0.1186F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 47).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1513F, -2.7939F, 2.797F, -0.4909F, -0.1836F, 0.1186F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(71, 28).addBox(-1.5507F, -3.2325F, -0.7484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -1.6849F, 0.8656F, -1.3261F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 55).addBox(-2.9518F, -3.0996F, -3.4843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.5436F, 0.2064F, 0.2169F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 58).addBox(-1.798F, -3.2265F, -2.3569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.8458F, 0.6577F, -0.3137F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(45, 5).addBox(0.0079F, -3.1103F, 2.374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.6449F, 0.0083F, 0.268F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(70, 59).addBox(1.1748F, -4.6445F, 7.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7964F, 3.4358F, -1.2525F, 0.2236F, 0.1976F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 22).addBox(0.3815F, -0.4058F, 4.1614F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7964F, 3.4358F, -0.7784F, 0.2595F, 0.1019F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 77).addBox(-0.309F, -1.2831F, -2.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -1.7539F, 0.243F, 0.0128F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 29).addBox(-0.0298F, -0.7862F, -0.2333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7964F, 3.4358F, -0.8825F, 0.3265F, 0.0402F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 82).addBox(-0.2502F, -5.7455F, 1.0359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -1.5286F, 0.1565F, 0.0239F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9902F, 5.5747F, 9.7908F, -0.176F, 0.1565F, 0.0239F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(58, 71).addBox(0.0841F, -1.9655F, -4.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.6647F, 0.1565F, 0.0239F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 53).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4242F, -0.6478F, 3.117F, -0.9265F, 0.1565F, 0.0239F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 16).addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2182F, 1.4092F, 4.9447F, -0.6194F, 0.243F, 0.0128F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 82).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7717F, 5.6485F, 8.4177F, -2.4013F, 0.1565F, 0.0239F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 66).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6326F, 4.0048F, 7.2869F, -0.9614F, 0.1565F, 0.0239F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(15, 0).addBox(-0.2502F, -2.5825F, -0.431F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.7868F, 0.1565F, 0.0239F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 37).addBox(-2.8744F, -3.1103F, 2.8984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 8).addBox(-2.8744F, -3.1103F, -1.1016F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7964F, 5.3358F, -0.6737F, 0.2714F, 0.0634F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 20).addBox(-0.9F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1625F, 1.1977F, 5.1171F, -0.2656F, 0.467F, 1.0273F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(0.0387F, -3.154F, -0.9355F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.893F, 0.9566F, -1.0852F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(28, 20).mirror().addBox(1.3749F, -3.0618F, -0.0288F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -1.5111F, 1.0645F, -1.815F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.3516F, 0.9936F, -1.4054F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, -2.4036F, 4.6358F, -1.7874F, 1.028F, -2.2084F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-1.4979F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.6531F, 1.3151F, -1.1235F, 0.1736F, -1.0988F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-0.4974F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.6531F, 1.3151F, -1.1578F, -0.318F, -0.4127F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4653F, -2.5633F, 4.3294F, -0.6654F, 0.1836F, -0.1186F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1513F, -2.7939F, 2.797F, -0.4909F, 0.1836F, -0.1186F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(0.5507F, -3.2325F, -0.7484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -1.6849F, -0.8656F, 1.3261F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(1.9518F, -3.0996F, -3.4843F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.5436F, -0.2064F, -0.2169F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(0.798F, -3.2265F, -2.3569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.8458F, -0.6577F, 0.3137F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 5).mirror().addBox(-2.0079F, -3.1103F, 2.374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.6449F, -0.0083F, -0.268F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-2.1748F, -4.6445F, 7.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7964F, 3.4358F, -1.2525F, -0.2236F, -0.1976F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.3815F, -0.4058F, 4.1614F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7964F, 3.4358F, -0.7784F, -0.2595F, -0.1019F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-0.691F, -1.2831F, -2.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -1.7539F, -0.243F, -0.0128F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.9702F, -0.7862F, -0.2333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7964F, 3.4358F, -0.8825F, -0.3265F, -0.0402F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(24, 82).mirror().addBox(-0.7498F, -5.7455F, 1.0359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -1.5286F, -0.1565F, -0.0239F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9902F, 5.5747F, 9.7908F, -0.176F, -0.1565F, -0.0239F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(58, 71).mirror().addBox(-1.0841F, -1.9655F, -4.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.6647F, -0.1565F, -0.0239F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 53).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4242F, -0.6478F, 3.117F, -0.9265F, -0.1565F, -0.0239F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(43, 16).mirror().addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2182F, 1.4092F, 4.9447F, -0.6194F, -0.243F, -0.0128F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 82).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7717F, 5.6485F, 8.4177F, -2.4013F, -0.1565F, -0.0239F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6326F, 4.0048F, 7.2869F, -0.9614F, -0.1565F, -0.0239F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-0.7498F, -2.5825F, -0.431F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.7868F, -0.1565F, -0.0239F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-0.1256F, -3.1103F, 2.8984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 8).mirror().addBox(-1.1256F, -3.1103F, -1.1016F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7964F, 5.3358F, -0.6737F, -0.2714F, -0.0634F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(15, 20).mirror().addBox(-0.1F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1625F, 1.1977F, 5.1171F, -0.2656F, -0.467F, -1.0273F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(28, 75).addBox(0.7F, 0.3F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(79, 72).addBox(0.7F, 4.2004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3F, 0.0766F, -1.5215F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 35).addBox(-1.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 32).addBox(0.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 5.1949F, -0.514F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 96).addBox(-0.5F, -0.0138F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 5.1949F, -0.514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(35, 90).addBox(0.5F, -0.984F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 5.4836F, 0.8486F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(65, 46).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.1611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(65, 23).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 2.1611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(70, 79).addBox(-5.4435F, -0.9691F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 82).addBox(-3.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 0.5011F, 0.2148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -0.025F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, 1.5583F, -0.7694F, 1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 88).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, -1.0365F, -0.667F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(96, 20).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.0365F, -0.667F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.2469F, -0.3008F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -1.3F, -1.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.7774F, -0.8673F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(26, 32).addBox(-2.5F, -12.9F, 0.2F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 15.8547F, -1.8159F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 62).addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 13.8169F, -1.0296F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 40).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 13.8169F, -1.0296F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(54, 58).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 1.2665F, 1.5175F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(13, 35).addBox(-2.5F, -0.2F, -1.1F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(60, 66).addBox(-5.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 83).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 26).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8292F, 1.5336F, 0.647F, -1.047F, 0.0064F, 0.052F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(84, 49).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8068F, 1.9283F, 0.3653F, -0.698F, 0.0064F, 0.052F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(7, 36).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.587F, 6.0866F, -0.1822F, -0.1307F, 0.0064F, 0.052F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 15.1377F, -1.5007F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 53).addBox(-5.5F, -3.0F, -1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0838F, 6.1597F, -0.3287F, -0.0436F, -0.3927F, 0.0F));

		PartDefinition cube_r82 = toe.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 47).addBox(-1.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r83 = toe.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(45, 89).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(41, 0).addBox(-1.8F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3301F, -0.778F, 0.384F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(15, 14).addBox(-1.8F, -0.5F, -4.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, -0.0049F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6122F, 0.2343F, -0.4308F, 0.0436F, 0.3054F, 0.0F));

		PartDefinition leftSickleClaw2 = leftSickleClaw.addOrReplaceChild("leftSickleClaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftSickleClaw2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -0.2284F, -2.8555F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -0.6F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftSickleClaw2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(76, 40).addBox(-2.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 0.0F, -0.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(56, 75).addBox(-2.7F, 0.3F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(7, 81).addBox(-2.7F, 4.2004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3F, 0.0766F, -1.5215F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(96, 9).addBox(0.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 3).addBox(-1.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.7F, 5.1949F, -0.514F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 62).addBox(-0.5F, -0.0138F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 5.1949F, -0.514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(96, 6).addBox(-1.5F, -0.984F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 5.4836F, 0.8486F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 66).addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 2.1611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(53, 65).addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.2F, 2.1611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(77, 80).addBox(3.4435F, -0.9691F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 75).addBox(2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.2F, 0.5011F, 0.2148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(28, 71).addBox(0.0F, -0.025F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7F, 1.5583F, -0.7694F, 1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 89).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, -1.0365F, -0.667F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -1.0365F, -0.667F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 5.2469F, -0.3008F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(13, 28).addBox(-1.0F, -1.3F, -1.7F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.7774F, -0.8673F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(33, 32).addBox(0.5F, -12.9F, 0.2F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 15.8547F, -1.8159F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 29).addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 13.8169F, -1.0296F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 58).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, 13.8169F, -1.0296F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(32, 59).addBox(0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 1.2665F, 1.5175F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 36).addBox(0.5F, -0.2F, -1.1F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(67, 66).addBox(3.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 30).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8292F, 1.5336F, 0.647F, -1.047F, -0.0064F, -0.052F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 53).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8068F, 1.9283F, 0.3653F, -0.698F, -0.0064F, -0.052F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(31, 44).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.587F, 6.0866F, -0.1822F, -0.1307F, -0.0064F, -0.052F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 15.1377F, -1.5007F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(23, 64).addBox(3.5F, -3.0F, -1.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0838F, 6.1597F, -0.3287F, -0.0436F, 0.3927F, 0.0F));

		PartDefinition cube_r106 = toe2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(89, 50).addBox(0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r107 = toe2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(50, 89).addBox(0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(41, 25).addBox(-1.2F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3301F, -0.778F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(17, 8).addBox(-1.2F, -0.5F, -4.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, -0.354F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6122F, 0.2343F, -0.4308F, 0.0436F, -0.3054F, 0.0F));

		PartDefinition rightSickleClaw2 = rightSickleClaw.addOrReplaceChild("rightSickleClaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightSickleClaw2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 5).addBox(0.0F, -0.2284F, -2.8555F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -0.6F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightSickleClaw2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 77).addBox(1.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.5F, 0.0F, -0.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(71, 32).addBox(-0.5F, -0.9104F, -0.0756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(16, 47).addBox(0.0F, -1.5104F, 0.9244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0663F, 5.2056F, -0.2793F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.794F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(101, 7).addBox(0.0F, -1.294F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0957F, 1.8382F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -1.2042F, -0.6302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.3422F, 2.9666F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 90).addBox(-0.5F, -0.3683F, -0.6253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(60, 90).addBox(-0.5F, -0.1256F, -1.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(65, 71).addBox(-0.5F, -0.5413F, -0.3889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2903F, -4.168F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(78, 90).addBox(0.0F, -2.3025F, -0.0576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.9F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 90).addBox(0.0F, -2.4535F, -0.0164F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(70, 90).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 96).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.602F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.0278F, -0.1956F, -1.4311F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.1226F, -0.1553F, -0.9007F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.3408F, -0.1483F, -0.0883F, -0.356F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(98, 39).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.1105F, -0.0876F, -0.4367F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0905F, -0.1352F, -0.9827F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-6.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0103F, -0.1622F, -1.5116F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 44).addBox(2.3936F, -1.7918F, -0.5273F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0103F, 0.1622F, 1.5116F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(83, 8).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0905F, 0.1352F, 0.9827F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(98, 39).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.1105F, 0.0876F, 0.4367F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 69).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.1483F, 0.0883F, 0.356F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 6).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.1226F, 0.1553F, 0.9007F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(70, 63).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.3408F, -0.0278F, 0.1956F, 1.4311F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(25, 96).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 90).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.602F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(40, 42).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.6F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 12).addBox(0.0F, -3.0468F, -1.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(101, 0).addBox(0.0F, -1.9982F, -0.1317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0687F, -2.6025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(32, 55).addBox(0.0F, -2.4424F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 38).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 0).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.036F, -0.0388F, -0.3117F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(80, 44).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.052F, -0.0549F, -0.8566F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(-4.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.0176F, -0.0735F, -1.381F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(99, 15).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.089F, 0.0004F, -0.3314F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.0346F, 0.0433F, -0.8744F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, 0.0083F, 0.0548F, -1.3985F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.2036F, 0.2448F, -0.9115F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(100, 87).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.3358F, 0.088F, -0.382F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(91, 0).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 38).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 86).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(100, 87).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.3358F, -0.088F, 0.382F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 58).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.2036F, -0.2448F, 0.9115F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(82, 60).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.0083F, -0.0548F, 1.3985F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(55, 82).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.0346F, -0.0433F, 0.8744F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(99, 15).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, 0.089F, -0.0004F, 0.3314F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(81, 67).addBox(2.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.0176F, 0.0735F, 1.381F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(80, 44).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.052F, 0.0549F, 0.8566F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(65, 51).addBox(1.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.036F, 0.0388F, 0.3117F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(14, 81).addBox(-1.1727F, 3.0084F, 0.1933F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 8.162F, -3.7436F, 1.0106F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(83, 39).addBox(-1.1727F, 1.8434F, -0.472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 8.162F, -3.7436F, 1.2374F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(63, 75).addBox(-1.6727F, 2.179F, -0.1043F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 8.162F, -3.7436F, 1.1502F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 58).addBox(-1.1727F, -0.0464F, -0.0015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.587F, -4.5936F, 0.9757F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(54, 15).addBox(-2.1727F, 0.1497F, 0.4023F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.587F, -4.5936F, 0.9233F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(86, 90).addBox(-1.1727F, -1.0622F, 0.0145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.587F, -4.5936F, 0.6528F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(63, 0).addBox(-2.1727F, -1.9941F, -0.0198F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.3869F, -4.1936F, 0.6179F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(62, 37).addBox(-2.1727F, -2.8888F, -0.6371F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 7.3869F, -4.1936F, 0.2862F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(81, 90).addBox(-1.1727F, -1.3328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 66).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 5.7624F, -5.6746F, 0.1728F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 96).addBox(-1.1727F, -0.9328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.6869F, -5.2936F, 0.391F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 7).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(85, 34).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(3.8267F, -1.4067F, -4.4437F, 0.8351F, 0.5159F, -0.5662F));

		PartDefinition cube_r162 = leftArm1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(45, 85).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(96, 68).addBox(-0.5F, -0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0059F, 5.5442F, 1.6774F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftArm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(70, 96).addBox(-0.5F, 0.6856F, -0.0912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 96).addBox(-0.5F, -0.1144F, -0.0912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 4.5486F, 0.6306F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 84).addBox(-0.5F, -0.0658F, -0.106F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0059F, 2.9983F, -0.007F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftArm1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 85).addBox(-0.5F, -1.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4102F, 6.1673F, 1.5368F, -1.7021F, 0.0387F, -0.0202F));

		PartDefinition cube_r167 = leftArm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(97, 44).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 3.4856F, -0.141F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftArm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 4).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftArm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(97, 41).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 97).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftArm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(96, 95).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(96, 92).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftArm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(86, 10).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftArm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(19, 81).addBox(-0.5F, -1.45F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftArm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(99, 12).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.05F, 3.4057F, -0.6542F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2694F, 4.0414F, 0.3721F, 2.0053F, -0.0692F, 0.0532F));

		PartDefinition cube_r174 = leftHand.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(98, 26).addBox(-0.5F, -0.125F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 23).addBox(-0.5F, 0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 81).addBox(-0.5F, 0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 71).addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(55, 97).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5658F, 2.2259F, -0.1547F, -0.2968F, 0.0495F, 0.0529F));

		PartDefinition cube_r175 = leftHand.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4832F, 0.9483F, 0.1465F, -0.0787F, 0.0495F, 0.0529F));

		PartDefinition cube_r176 = leftHand.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(99, 50).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 47).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5026F, 0.9123F, -0.2828F, -0.3405F, 0.0495F, 0.0529F));

		PartDefinition cube_r177 = leftHand.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(35, 99).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.4719F, 0.1993F, -0.427F, -0.0787F, 0.0495F, 0.0529F));

		PartDefinition cube_r178 = leftHand.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(30, 99).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4719F, 0.1993F, -0.427F, 0.4449F, 0.0495F, 0.0529F));

		PartDefinition cube_r179 = leftHand.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(86, 22).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.452F, 0.8948F, 0.7182F, 0.0959F, 0.0495F, 0.0529F));

		PartDefinition cube_r180 = leftHand.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.452F, 0.8948F, 0.7182F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition cube_r181 = leftHand.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(70, 99).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.5F, 1.7935F, 0.7102F, -0.0089F, 0.0495F, 0.0529F));

		PartDefinition cube_r182 = leftHand.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(86, 62).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.2782F, 0.7189F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(50, 85).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-3.8267F, -1.4067F, -4.4437F, 0.6446F, -0.8487F, 0.4111F));

		PartDefinition cube_r183 = rightArm1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightArm1.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(96, 89).addBox(-0.5F, -0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0059F, 5.5442F, 1.6774F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightArm1.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(85, 96).addBox(-0.5F, 0.6856F, -0.0912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 96).addBox(-0.5F, -0.1144F, -0.0912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 4.5486F, 0.6306F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightArm1.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(84, 79).addBox(-0.5F, -0.0658F, -0.106F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0059F, 2.9983F, -0.007F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightArm1.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -1.075F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4102F, 6.1673F, 1.5368F, -1.833F, -0.0387F, 0.0202F));

		PartDefinition cube_r188 = rightArm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(98, 65).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 3.4856F, -0.141F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightArm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 86).addBox(0.75F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 98).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 98).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightArm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(40, 98).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(98, 36).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightArm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 14).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightArm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 18).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(35, 81).addBox(-0.5F, -1.45F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.1509F, -0.4869F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightArm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(25, 99).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(20, 99).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 3.4057F, -0.6542F, 0.4189F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2694F, 4.0414F, 0.3721F, 1.7871F, 0.0692F, -0.0532F));

		PartDefinition cube_r195 = rightHand.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5F, -0.125F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 99).addBox(-0.5F, 0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(95, 98).addBox(-0.5F, 0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(90, 98).addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(75, 98).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5658F, 2.2259F, -0.1547F, -0.2968F, -0.0495F, -0.0529F));

		PartDefinition cube_r196 = rightHand.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 86).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4832F, 0.9483F, 0.1465F, -0.0787F, -0.0495F, -0.0529F));

		PartDefinition cube_r197 = rightHand.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(60, 99).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 59).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5026F, 0.9123F, -0.2828F, -0.3405F, -0.0495F, -0.0529F));

		PartDefinition cube_r198 = rightHand.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(99, 56).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.4719F, 0.1993F, -0.427F, -0.0787F, -0.0495F, -0.0529F));

		PartDefinition cube_r199 = rightHand.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 53).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4719F, 0.1993F, -0.427F, 0.4449F, -0.0495F, -0.0529F));

		PartDefinition cube_r200 = rightHand.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.452F, 0.8948F, 0.7182F, 0.0959F, -0.0495F, -0.0529F));

		PartDefinition cube_r201 = rightHand.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(30, 86).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.452F, 0.8948F, 0.7182F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition cube_r202 = rightHand.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(99, 74).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 1.7935F, 0.7102F, -0.0089F, -0.0495F, -0.0529F));

		PartDefinition cube_r203 = rightHand.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(86, 69).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.2782F, 0.7189F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 2.2036F, -3.0961F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(53, 35).addBox(2.3728F, -6.1384F, 2.2543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0163F, 1.7821F, -1.2093F, -0.0878F, -0.2458F, -0.4434F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(20, 44).addBox(1.78F, -5.5625F, 0.0764F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0163F, 1.7821F, -1.2093F, 0.1034F, -0.0652F, -0.4347F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(72, 14).addBox(-0.3796F, -0.7087F, -1.2202F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1273F, 4.7833F, 0.4025F, 1.0836F, -0.6338F, -0.8409F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 99).addBox(-0.1364F, 0.3955F, -0.634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, -3.061F, -1.452F, -2.7507F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(99, 77).addBox(-0.3678F, -0.2618F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, 1.9011F, -1.1972F, -1.5395F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 86).addBox(-0.3918F, -1.9648F, -0.5979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1287F, 6.0365F, 2.1885F, 1.6225F, -1.0666F, -1.364F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(30, 14).addBox(-0.3F, -0.4F, -0.1F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1351F, 5.6022F, 2.2633F, 1.191F, -1.4516F, -0.5372F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(58, 12).addBox(-0.1F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5949F, 4.7117F, 1.8569F, 0.987F, -1.4416F, -0.9092F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 44).addBox(-0.8F, -0.2F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5466F, 3.2688F, 1.1672F, 1.1478F, -1.153F, -0.9125F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(25, 50).addBox(-0.1F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.8F, 7.2147F, 2.9732F, 0.8714F, -0.1409F, 0.1176F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(79, 24).addBox(-0.4F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5466F, 2.4537F, 0.5879F, 1.1584F, -0.934F, -1.0573F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(100, 100).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5596F, 1.4899F, -0.1873F, 1.1998F, -0.7951F, -1.0532F));

		PartDefinition cube_r216 = bone.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(87, 43).addBox(-0.2918F, -0.65F, -0.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3773F, 5.8849F, 1.6924F, 1.1489F, -0.9743F, -0.7402F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 86).addBox(-0.8801F, -0.85F, -0.5837F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3773F, 5.8849F, 1.6924F, 1.0176F, -0.5219F, -0.4652F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(20, 35).addBox(-0.9F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.38F, 2.7898F, 0.573F, 1.3312F, -0.9319F, -1.2753F));

		PartDefinition cube_r219 = bone.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(71, 36).addBox(-0.95F, -1.05F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.186F, 2.7075F, -1.0375F, 0.9878F, -0.651F, -0.837F));

		PartDefinition cube_r220 = bone.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(72, 4).addBox(0.4527F, -1.9941F, -0.6907F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1273F, 4.9833F, -0.7975F, 0.9234F, -0.758F, -0.7379F));

		PartDefinition cube_r221 = bone.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 70).addBox(-1.0978F, -0.8987F, 0.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.245F, 0.0162F, 0.5397F));

		PartDefinition cube_r222 = bone.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(14, 55).addBox(-0.7364F, -0.5479F, -1.5668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.5348F, -0.1199F, 0.1972F));

		PartDefinition cube_r223 = bone.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(21, 77).addBox(0.016F, -0.5479F, -3.0572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.4767F, -0.0826F, 0.7575F));

		PartDefinition cube_r224 = bone.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 14).addBox(-1.1336F, -0.2981F, -0.6658F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0163F, 1.2821F, -1.2093F, 1.7338F, 0.241F, 0.1591F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.8F, 2.2036F, -3.0961F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-3.3728F, -6.1384F, 2.2543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0163F, 1.7821F, -1.2093F, -0.0878F, 0.2458F, 0.4434F));

		PartDefinition cube_r226 = bone3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-2.78F, -5.5625F, 0.0764F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0163F, 1.7821F, -1.2093F, 0.1034F, 0.0652F, 0.4347F));

		PartDefinition cube_r227 = bone3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-1.6204F, -0.7087F, -1.2202F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.1273F, 4.7833F, 0.4025F, 1.0836F, 0.6338F, 0.8409F));

		PartDefinition cube_r228 = bone3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(80, 99).mirror().addBox(-0.8636F, 0.3955F, -0.634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, -3.061F, 1.452F, 2.7507F));

		PartDefinition cube_r229 = bone3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 77).mirror().addBox(-0.6322F, -0.2618F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, 1.9011F, 1.1972F, 1.5395F));

		PartDefinition cube_r230 = bone3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.6082F, -1.9648F, -0.5979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1287F, 6.0365F, 2.1885F, 1.6225F, 1.0666F, 1.364F));

		PartDefinition cube_r231 = bone3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-7.7F, -0.4F, -0.1F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1351F, 5.6022F, 2.2633F, 1.191F, 1.4516F, 0.5372F));

		PartDefinition cube_r232 = bone3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-4.9F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5949F, 4.7117F, 1.8569F, 0.987F, 1.4416F, 0.9092F));

		PartDefinition cube_r233 = bone3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(-3.2F, -0.2F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5466F, 3.2688F, 1.1672F, 1.1478F, 1.153F, 0.9125F));

		PartDefinition cube_r234 = bone3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-0.9F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(3.8F, 7.2147F, 2.9732F, 0.8714F, 0.1409F, -0.1176F));

		PartDefinition cube_r235 = bone3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5466F, 2.4537F, 0.5879F, 1.1584F, 0.934F, 1.0573F));

		PartDefinition cube_r236 = bone3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(100, 100).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5596F, 1.4899F, -0.1873F, 1.1998F, 0.7951F, 1.0532F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-0.7082F, -0.65F, -0.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3773F, 5.8849F, 1.6924F, 1.1489F, 0.9743F, 0.7402F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.1199F, -0.85F, -0.5837F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3773F, 5.8849F, 1.6924F, 1.0176F, 0.5219F, 0.4652F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(20, 35).mirror().addBox(-0.1F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.38F, 2.7898F, 0.573F, 1.3312F, 0.9319F, 1.2753F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(71, 36).mirror().addBox(-1.05F, -1.05F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.186F, 2.7075F, -1.0375F, 0.9878F, 0.651F, 0.837F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-2.4527F, -1.9941F, -0.6907F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.1273F, 4.9833F, -0.7975F, 0.9234F, 0.758F, 0.7379F));

		PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(0.0978F, -0.8987F, 0.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.245F, -0.0162F, -0.5397F));

		PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-0.2636F, -0.5479F, -1.5668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.5348F, 0.1199F, -0.1972F));

		PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-1.016F, -0.5479F, -3.0572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.4767F, 0.0826F, -0.7575F));

		PartDefinition cube_r245 = bone3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(0.1336F, -0.2981F, -0.6658F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0163F, 1.2821F, -1.2093F, 1.7338F, -0.241F, -0.1591F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.6F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition cube_r246 = neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(36, 44).addBox(0.0F, -3.3943F, -2.1586F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 18).addBox(-0.5F, -1.9943F, -2.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.2F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(100, 98).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.615F, -1.3408F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r248 = neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(100, 98).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.615F, -1.3408F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.6F, -0.3642F, -0.077F, 0.1682F));

		PartDefinition cube_r249 = neck5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(101, 4).addBox(0.0F, -1.9F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 48).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, 0.1833F, -0.1309F, -0.0011F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(65, 9).addBox(0.0F, -2.5981F, 3.3713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 50).addBox(-0.5F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -1.4F, -0.1967F, -0.1369F, -0.0169F));

		PartDefinition cube_r251 = neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(49, 101).addBox(0.0F, 0.0065F, 0.0537F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 17).addBox(0.0F, 1.9374F, -0.0567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(77, 75).addBox(-1.0F, 3.0773F, -0.9317F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7956F, -0.8402F, -0.8373F, -0.0324F, -0.0292F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(101, 20).addBox(0.0F, 2.0061F, 0.2563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -3.6297F, -2.1899F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(78, 26).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -4.1297F, -2.9899F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8955F, -1.6108F, -0.0785F, -0.0015F, -0.0436F));

		PartDefinition cube_r256 = neck.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(40, 101).addBox(0.0F, -1.3039F, 0.7987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.3325F, -1.7601F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(72, 22).addBox(-0.994F, -0.1384F, 2.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.494F, -0.7325F, -4.5601F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3112F, -1.8457F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 101).addBox(0.0F, -1.3789F, 0.6987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.2263F, -1.8455F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(72, 46).addBox(-0.994F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.494F, -0.6263F, -3.6455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.375F, -1.95F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck8.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(46, 101).addBox(0.0F, -1.5039F, 0.6987F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -0.2263F, -1.8455F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck8.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 73).addBox(-0.994F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.494F, -0.6263F, -3.6455F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5979F, -1.3454F, 0.6071F, -0.1463F, 0.0555F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(79, 12).addBox(-1.0F, -0.55F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.006F, -2.9129F, -1.4818F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(54, 50).addBox(-2.0F, -0.5F, -0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.006F, -2.5705F, -0.8078F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(42, 73).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -2.1544F, -6.0606F, 2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(5, 88).addBox(-0.5F, -1.675F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -1.2032F, -4.6799F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(35, 73).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.002F, -1.2891F, -4.2754F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -1.623F, -5.218F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 18).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.006F, -1.9945F, -2.7794F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(94, 53).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 50).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.006F, -2.8425F, -3.4448F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(62, 82).addBox(-0.5F, -0.3F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 94).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.006F, -3.2848F, -4.5111F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 47).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.006F, -3.7375F, -5.0313F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(55, 91).addBox(-0.5F, -0.3267F, -2.8222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.006F, -4.012F, -2.7189F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(79, 3).addBox(-1.0F, -1.6913F, -0.6886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -4.4015F, -3.3696F, 1.5053F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, -0.9148F, -0.8983F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.006F, -4.4015F, -3.3696F, 1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 18).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.006F, -3.8416F, -2.3264F, 2.7358F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(79, 15).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -4.0609F, -2.6609F, 2.5613F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -0.869F, -0.8307F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -4.012F, -2.7189F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(54, 47).addBox(-2.0F, -0.5F, -0.525F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.006F, -2.3866F, -0.2942F, 1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(54, 26).addBox(-2.0F, -0.8003F, -0.9038F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.006F, -2.0952F, 0.5535F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(54, 23).addBox(-2.0F, -0.925F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.006F, -2.041F, -1.1113F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(54, 20).addBox(-2.0F, -0.625F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.006F, -1.6659F, -0.6649F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(43, 22).addBox(-2.0F, -0.1F, -0.825F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.006F, -1.3044F, 0.3967F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(62, 33).addBox(-1.5F, -0.6024F, -0.3551F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.006F, -1.1284F, -0.4649F, -3.05F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(9, 65).addBox(-1.5F, -0.5376F, -0.6734F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.006F, -1.1284F, -0.4649F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(30, 16).addBox(-2.0F, 0.4731F, -0.4983F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.006F, -1.9944F, 0.5143F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(70, 51).addBox(-0.5F, -0.0203F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -4.4015F, -3.3696F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(91, 15).addBox(-0.5F, 0.1754F, -1.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -4.4015F, -3.3696F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(85, 87).addBox(-0.5F, -0.2553F, -0.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.01F, -5.2574F, -5.0405F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5F, -0.0303F, 1.2675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(18, 65).addBox(-0.5F, -0.0303F, 0.7925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.1965F, -6.8431F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(35, 77).addBox(-0.5F, -0.2553F, -1.7575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -5.6125F, -5.9485F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(91, 12).addBox(-0.5F, -0.595F, -0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(91, 9).addBox(-0.5F, -0.595F, -0.6561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(91, 6).addBox(-0.5F, -0.595F, -0.4561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.006F, -3.9827F, -12.9646F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(21, 69).addBox(-0.5F, -0.4198F, -0.719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(-0.006F, -3.9827F, -12.9646F, 1.2785F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(50, 92).addBox(-0.5F, -0.475F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 92).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.006F, -4.0791F, -13.187F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(92, 72).addBox(-0.5F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.006F, -4.9542F, -12.5197F, 0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(91, 92).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.006F, -5.0353F, -12.2213F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.006F, -4.9542F, -12.5197F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(78, 31).addBox(-0.5F, -0.7552F, -0.518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.006F, -5.327F, -12.4412F, 0.9992F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(92, 44).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.006F, -4.6205F, -13.1588F, -1.6712F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(92, 41).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.006F, -5.0135F, -13.0842F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(92, 83).addBox(-0.5F, -0.4652F, -0.821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(91, 3).addBox(-0.5F, -0.7902F, -0.821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.006F, -5.327F, -12.4412F, 1.2086F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(9, 61).addBox(-0.5F, -0.7102F, -0.3064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -5.327F, -12.4412F, 0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(39, 59).addBox(-0.5F, -0.8138F, 0.0283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -5.327F, -12.4412F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(100, 29).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.6037F, -11.2F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(100, 84).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.5127F, -9.2165F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(55, 100).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.6124F, -9.7065F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(100, 32).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.669F, -10.2033F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.6603F, -10.7032F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -6.4617F, -11.6794F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(87, 73).addBox(-0.5F, -0.9255F, 0.4381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.006F, -5.327F, -12.4412F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(53, 30).addBox(-0.5F, -0.3162F, -1.2371F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -6.0642F, -7.8763F, -0.3011F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -12.117F, -3.763F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(91, 21).addBox(0.199F, -0.1642F, -0.4903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1679F, 8.7553F, 1.6152F, 0.9997F, 0.6178F, -0.4396F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8375F, 8.679F, -2.7275F, 1.7418F, 0.1146F, -0.1004F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(49, 78).addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2925F, 8.5929F, 1.4558F, 1.1145F, 0.0029F, -0.0847F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 93).addBox(-0.8092F, -2.56F, -0.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(81, 93).addBox(-0.8092F, -1.96F, -0.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3033F, 7.4149F, -1.1569F, 2.5232F, -0.0139F, 0.0176F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(70, 93).addBox(-0.8092F, -0.6904F, 0.3972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3033F, 7.4149F, -1.1569F, -2.3637F, -0.0139F, 0.0176F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(93, 65).addBox(-0.8092F, -0.7693F, -0.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3033F, 7.4149F, -1.1569F, -2.4946F, -0.0139F, 0.0176F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(60, 93).addBox(-0.7765F, 1.4341F, -0.8698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2147F, 8.3398F, 0.824F, -1.8406F, 0.4377F, -0.3493F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(93, 38).addBox(-0.7765F, -0.7979F, -1.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2147F, 8.3398F, 0.824F, -0.3134F, 0.4377F, -0.3493F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(28, 79).addBox(-1.7765F, -1.3307F, -0.3458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2147F, 8.3398F, 0.824F, 1.1264F, 0.4377F, -0.3493F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(79, 21).addBox(-1.7765F, -0.8192F, -0.4505F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2147F, 8.3398F, 0.824F, 0.9519F, 0.4377F, -0.3493F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(20, 96).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5315F, 9.1586F, 1.8193F, 0.5439F, 0.1102F, -1.4182F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(79, 46).addBox(-0.2F, -1.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(94, 78).addBox(-0.2F, -1.425F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(94, 59).addBox(-0.2F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4546F, 9.9854F, 2.829F, -1.0303F, -0.0924F, 3.0929F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(95, 30).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 75).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.1599F, 10.2616F, 2.7585F, -1.9029F, -0.0924F, 3.0929F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(94, 56).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4546F, 9.9854F, 2.829F, -0.8121F, -0.0924F, 3.0929F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(55, 94).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0365F, 9.9906F, 2.7056F, -0.5453F, 0.6415F, -2.3245F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(63, 79).addBox(-0.2F, -1.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(56, 79).addBox(-0.2F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4332F, 9.5206F, 3.1872F, -1.0392F, -0.0199F, 2.9964F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(61, 62).addBox(-1.3F, -0.825F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9723F, 9.457F, 2.7616F, -0.6868F, 0.8561F, -2.5308F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(79, 69).addBox(-1.5F, -0.3F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5142F, 8.7082F, 1.6524F, 0.722F, 0.8294F, -0.8308F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(78, 36).addBox(-1.425F, -0.2013F, -0.5124F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5647F, 8.3398F, 0.924F, 1.0428F, 0.5061F, -0.3588F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(25, 93).addBox(-0.4518F, 1.7789F, -4.6533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 2.1562F, 0.3297F, -0.0114F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(93, 24).addBox(-0.4518F, 3.45F, 1.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 0.7163F, 0.3297F, -0.0114F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(20, 93).addBox(-0.4518F, -1.7478F, 3.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.7236F, 0.3297F, -0.0114F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 26).addBox(-0.4518F, -3.8453F, -1.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -2.1635F, 0.3297F, -0.0114F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(15, 93).addBox(-0.4518F, 0.0136F, -3.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 2.6361F, 0.3297F, -0.0114F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(10, 93).addBox(-0.4518F, 1.9803F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 1.1526F, 0.3297F, -0.0114F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 93).addBox(-0.4518F, 0.2143F, 1.4944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 0.0181F, 0.3297F, -0.0114F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(35, 93).addBox(-0.4518F, 2.6776F, 3.8459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, 0.1578F, 0.3297F, -0.0114F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(30, 93).addBox(-0.4518F, -0.5287F, 4.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(93, 27).addBox(-0.4518F, -0.5287F, 4.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.4967F, 0.3297F, -0.0114F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(36, 54).addBox(-0.4518F, -0.8292F, 1.605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.5665F, 0.3297F, -0.0114F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(51, 42).addBox(-0.695F, -0.3677F, -0.6913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.3465F, 0.4301F, -0.0931F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(96, 17).addBox(-0.446F, 2.2915F, 4.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.0327F, 0.1884F, -0.1955F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(15, 96).addBox(-0.446F, -1.0698F, 5.1805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -0.6436F, 0.1884F, -0.1955F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 71).addBox(-0.446F, -5.4248F, 0.658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3511F, 9.21F, -2.2374F, -1.6471F, 0.1884F, -0.1955F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(70, 55).addBox(-0.3677F, 1.7893F, 0.0239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -2.2273F, 0.0865F, -0.0846F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(81, 63).addBox(-0.3677F, -1.9155F, 1.3793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, 2.5375F, 0.0865F, -0.0846F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(49, 74).addBox(-0.3677F, -2.0834F, -1.6886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, 1.0976F, 0.0865F, -0.0846F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(29, 82).addBox(-0.3636F, -0.3237F, -1.6206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -0.4645F, 0.0865F, -0.0846F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(37, 68).addBox(-0.3875F, -2.3985F, -2.9174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, 0.1004F, 0.0659F, -0.115F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(14, 68).addBox(-0.525F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0685F, 6.4998F, -5.6642F, -0.1616F, -0.0183F, -0.1525F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(7, 68).addBox(-0.775F, -0.225F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9328F, 6.0446F, -4.0794F, -0.3061F, -0.0247F, -0.1915F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 82).addBox(-0.2281F, -1.9293F, 0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -0.2981F, -0.1443F, -0.1904F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(45, 81).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0164F, 7.1355F, -3.391F, -0.2955F, -0.0608F, -0.2161F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0303F, 7.3094F, -2.954F, -0.5388F, -0.1034F, -0.1879F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(46, 63).addBox(-0.425F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9392F, 8.2067F, -2.7708F, -0.7212F, -0.0264F, -0.1936F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(69, 9).addBox(-0.5098F, -0.5186F, -1.2971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -0.3217F, 0.0079F, -0.0576F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(65, 93).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.3126F, 7.8193F, -1.5533F, 0.7684F, -0.0617F, -0.4118F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(39, 63).addBox(-0.6694F, -0.9674F, 1.4661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -0.2352F, -0.0617F, -0.4118F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F))
				.texOffs(44, 68).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9039F, 7.876F, -3.7381F, -0.2266F, 0.0833F, -0.1053F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(14, 60).addBox(-0.513F, 0.5189F, 0.1748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.974F, 7.6553F, -4.8915F, -0.2221F, 0.0949F, -0.054F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(95, 33).addBox(-0.425F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(91, 18).addBox(-0.6F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3279F, 9.2429F, 1.2415F, -0.4923F, 0.7432F, -0.3761F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -12.117F, -3.763F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-1.199F, -0.1642F, -0.4903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.1679F, 8.7553F, 1.6152F, 0.9997F, -0.6178F, 0.4396F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.5F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8375F, 8.679F, -2.7275F, 1.7418F, -0.1146F, 0.1004F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.2925F, 8.5929F, 1.4558F, 1.1145F, -0.0029F, 0.0847F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(86, 93).mirror().addBox(-0.1908F, -2.56F, -0.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(81, 93).mirror().addBox(-0.1908F, -1.96F, -0.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3033F, 7.4149F, -1.1569F, 2.5232F, 0.0139F, -0.0176F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(70, 93).mirror().addBox(-0.1908F, -0.6904F, 0.3972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3033F, 7.4149F, -1.1569F, -2.3637F, 0.0139F, -0.0176F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-0.1908F, -0.7693F, -0.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3033F, 7.4149F, -1.1569F, -2.4946F, 0.0139F, -0.0176F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(60, 93).mirror().addBox(-0.2235F, 1.4341F, -0.8698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2147F, 8.3398F, 0.824F, -1.8406F, -0.4377F, 0.3493F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-0.2235F, -0.7979F, -1.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2147F, 8.3398F, 0.824F, -0.3134F, -0.4377F, 0.3493F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-0.2235F, -1.3307F, -0.3458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2147F, 8.3398F, 0.824F, 1.1264F, -0.4377F, 0.3493F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.2235F, -0.8192F, -0.4505F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.2147F, 8.3398F, 0.824F, 0.9519F, -0.4377F, 0.3493F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.5315F, 9.1586F, 1.8193F, 0.5439F, -0.1102F, 1.4182F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-1.8F, -1.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(94, 78).mirror().addBox(-0.8F, -1.425F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(94, 59).mirror().addBox(-0.8F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.4546F, 9.9854F, 2.829F, -1.0303F, 0.0924F, -3.0929F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(95, 30).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 75).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.1599F, 10.2616F, 2.7585F, -1.9029F, 0.0924F, -3.0929F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4546F, 9.9854F, 2.829F, -0.8121F, 0.0924F, -3.0929F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0365F, 9.9906F, 2.7056F, -0.5453F, -0.6415F, 2.3245F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(-1.8F, -1.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(56, 79).mirror().addBox(-1.8F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.4332F, 9.5206F, 3.1872F, -1.0392F, 0.0199F, -2.9964F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(61, 62).mirror().addBox(-1.7F, -0.825F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9723F, 9.457F, 2.7616F, -0.6868F, -0.8561F, 2.5308F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(79, 69).mirror().addBox(-0.5F, -0.3F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.5142F, 8.7082F, 1.6524F, 0.722F, -0.8294F, 0.8308F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(78, 36).mirror().addBox(-0.575F, -0.2013F, -0.5124F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.5647F, 8.3398F, 0.924F, 1.0428F, -0.5061F, 0.3588F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-0.5481F, 1.7789F, -4.6533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 2.1562F, -0.3297F, 0.0114F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(93, 24).mirror().addBox(-0.5481F, 3.45F, 1.2478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 0.7163F, -0.3297F, 0.0114F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(-0.5481F, -1.7478F, 3.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.7236F, -0.3297F, 0.0114F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-0.5481F, -3.8453F, -1.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -2.1635F, -0.3297F, 0.0114F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(15, 93).mirror().addBox(-0.5481F, 0.0136F, -3.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 2.6361F, -0.3297F, 0.0114F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.5481F, 1.9803F, -0.2223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 1.1526F, -0.3297F, 0.0114F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5481F, 0.2143F, 1.4944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 0.0181F, -0.3297F, 0.0114F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-0.5481F, 2.6776F, 3.8459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, 0.1578F, -0.3297F, 0.0114F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(-0.5481F, -0.5287F, 4.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(93, 27).mirror().addBox(-0.5481F, -0.5287F, 4.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.4967F, -0.3297F, 0.0114F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(36, 54).mirror().addBox(-0.5481F, -0.8292F, 1.605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.5665F, -0.3297F, 0.0114F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-0.305F, -0.3677F, -0.6913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.3465F, -0.4301F, 0.0931F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(96, 17).mirror().addBox(-0.554F, 2.2915F, 4.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.0327F, -0.1884F, 0.1955F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-0.554F, -1.0698F, 5.1805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -0.6436F, -0.1884F, 0.1955F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-0.554F, -5.4248F, 0.658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 9.21F, -2.2374F, -1.6471F, -0.1884F, 0.1955F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-0.6323F, 1.7893F, 0.0239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -2.2273F, -0.0865F, 0.0846F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-0.6323F, -1.9155F, 1.3793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, 2.5375F, -0.0865F, 0.0846F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(-0.6323F, -2.0834F, -1.6886F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, 1.0976F, -0.0865F, 0.0846F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.6364F, -0.3237F, -1.6206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -0.4645F, -0.0865F, 0.0846F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-0.6125F, -2.3985F, -2.9174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, 0.1004F, -0.0659F, 0.115F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.475F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0685F, 6.4998F, -5.6642F, -0.1616F, 0.0183F, 0.1525F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.225F, -0.225F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9328F, 6.0446F, -4.0794F, -0.3061F, 0.0247F, 0.1915F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.7719F, -1.9293F, 0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -0.2981F, 0.1443F, 0.1904F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0164F, 7.1355F, -3.391F, -0.2955F, 0.0608F, 0.2161F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0303F, 7.3094F, -2.954F, -0.5388F, 0.1034F, 0.1879F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-0.575F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9392F, 8.2067F, -2.7708F, -0.7212F, 0.0264F, 0.1936F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-0.4902F, -0.5186F, -1.2971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -0.3217F, -0.0079F, 0.0576F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.3126F, 7.8193F, -1.5533F, 0.7684F, 0.0617F, 0.4118F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-0.3306F, -0.9674F, 1.4661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -0.2352F, 0.0617F, 0.4118F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(44, 68).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9039F, 7.876F, -3.7381F, -0.2266F, -0.0833F, 0.1053F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-0.487F, 0.5189F, 0.1748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.974F, 7.6553F, -4.8915F, -0.2221F, -0.0949F, 0.054F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-0.575F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(91, 18).mirror().addBox(-0.4F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3279F, 9.2429F, 1.2415F, -0.4923F, -0.7432F, 0.3761F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.3864F, -0.8578F, -0.0342F, 0.0F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-0.027F, -0.5229F, -1.6903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.1181F, -0.3043F, -0.0483F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.1376F, 0.3614F, -2.8745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(74, 65).mirror().addBox(-0.1376F, -0.4386F, -2.8745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.0411F, -0.3989F, -0.0718F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-0.0629F, -1.4225F, -2.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.4027F, -0.3663F, -0.1013F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(0.1115F, -0.67F, -4.4961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.0819F, -0.3039F, -0.0414F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(0.3317F, 0.1899F, -5.4009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.0411F, -0.2516F, -0.0121F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(42, 77).mirror().addBox(0.1335F, 0.4247F, -4.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 50).mirror().addBox(0.1335F, -0.0753F, -4.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.0087F, -0.2948F, -0.0628F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-1.0197F, 0.824F, -3.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false)
				.texOffs(40, 92).mirror().addBox(-1.0197F, 0.824F, -3.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-1.0197F, 0.824F, -4.1345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -0.4142F, -0.0625F, 0.0351F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(91, 89).mirror().addBox(-1.086F, -0.1129F, -3.4009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -0.1063F, -0.0828F, 0.0062F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-0.0114F, 0.4023F, 0.0378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, -1.2459F, -0.3049F, -0.0344F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(20, 41).mirror().addBox(-0.0023F, 0.066F, -0.8938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 2.0215F, -0.3056F, 0.0304F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(89, 77).mirror().addBox(-0.0114F, -0.9363F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, -2.6422F, -0.3049F, -0.0344F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.0629F, -1.9622F, -1.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 1.1009F, -0.3663F, -0.1013F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(89, 80).mirror().addBox(-0.0263F, -1.4036F, -0.6042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 1.4894F, -0.3272F, -0.0998F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(-0.0629F, -1.1486F, -3.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, 0.2718F, -0.3663F, -0.1013F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(0.4146F, 4.1888F, -0.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.5193F, 0.1506F, -1.0267F, -1.4476F, -0.2347F, -0.0324F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.9418F, -0.5919F, 0.3466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1193F, 0.1506F, -5.2267F, -2.934F, -0.1474F, -0.0319F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.9418F, -2.132F, -0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1193F, 0.1506F, -5.2267F, 1.822F, -0.1474F, -0.0319F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(-0.9593F, -0.0067F, -1.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.8193F, 0.1506F, -7.1267F, 0.3281F, -0.0951F, -0.0317F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.8953F, -0.1552F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -1.2438F, -0.0602F, -0.0316F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.8953F, 0.6253F, -0.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -1.3485F, -0.0602F, -0.0316F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(88, 29).mirror().addBox(-0.9418F, -1.299F, 0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1193F, 0.1506F, -5.2267F, -3.0038F, -0.1474F, -0.0319F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.9418F, -1.2312F, 0.2254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.1193F, 0.1506F, -5.2267F, -2.9515F, -0.1474F, -0.0319F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.9593F, 0.1743F, 0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8193F, 0.1506F, -7.1267F, -1.3387F, -0.0951F, -0.0317F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(95, 86).mirror().addBox(-0.8953F, -1.6061F, -0.9129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, 1.4963F, -0.0602F, -0.0316F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-0.8953F, -0.2593F, -0.9653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, 0.1437F, -0.0602F, -0.0316F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(87, 83).mirror().addBox(-0.8953F, -0.9778F, 1.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, 3.0235F, -0.0602F, -0.0316F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.8953F, 1.3631F, -0.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -1.5231F, -0.0602F, -0.0316F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-1.086F, -3.0094F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false)
				.texOffs(30, 90).mirror().addBox(-1.086F, -2.5594F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, 1.639F, -0.0828F, 0.0062F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(91, 95).mirror().addBox(-1.086F, 0.6713F, -3.1759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-1.086F, 0.6713F, -2.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-0.7804F, 1.1877F, -7.8639F, -0.3681F, -0.0828F, 0.0062F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(20, 41).addBox(-0.9977F, 0.066F, -0.8938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 2.0215F, 0.3056F, -0.0304F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(89, 77).addBox(-0.9886F, -0.9363F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, -2.6422F, 0.3049F, 0.0344F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(89, 59).addBox(-0.9886F, 0.4023F, 0.0378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, -1.2459F, 0.3049F, 0.0344F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(30, 90).addBox(0.086F, -2.5594F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
				.texOffs(25, 90).addBox(0.086F, -3.0094F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, 1.639F, 0.0828F, -0.0062F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 96).addBox(0.086F, 0.6713F, -2.7009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
				.texOffs(91, 95).addBox(0.086F, 0.6713F, -3.1759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -0.3681F, 0.0828F, -0.0062F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(91, 89).addBox(0.086F, -0.1129F, -3.4009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -0.1063F, 0.0828F, -0.0062F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(96, 0).addBox(0.0197F, 0.824F, -4.1345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
				.texOffs(91, 69).addBox(0.0197F, 0.824F, -3.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F))
				.texOffs(40, 92).addBox(0.0197F, 0.824F, -3.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -0.4142F, 0.0625F, -0.0351F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(77, 50).addBox(-1.1335F, -0.0753F, -4.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(42, 77).addBox(-1.1335F, 0.4247F, -4.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.0087F, 0.2948F, 0.0628F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(77, 54).addBox(-1.3317F, 0.1899F, -5.4009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.0411F, 0.2516F, 0.0121F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(20, 90).addBox(-0.1047F, 1.3631F, -0.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -1.5231F, 0.0602F, 0.0316F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(15, 90).addBox(-0.1047F, 0.6253F, -0.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -1.3485F, 0.0602F, 0.0316F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(65, 99).addBox(-0.1047F, -0.1552F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, -1.2438F, 0.0602F, 0.0316F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(75, 95).addBox(-0.0407F, -0.0067F, -1.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.1807F, 0.1506F, -7.1267F, 0.3281F, 0.0951F, 0.0317F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(10, 90).addBox(-0.0582F, -2.132F, -0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8807F, 0.1506F, -5.2267F, 1.822F, 0.1474F, 0.0319F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(89, 53).addBox(-0.1047F, -0.2593F, -0.9653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, 0.1437F, 0.0602F, 0.0316F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(87, 83).addBox(-0.1047F, -0.9778F, 1.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, 3.0235F, 0.0602F, 0.0316F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(95, 86).addBox(-0.1047F, -1.6061F, -0.9129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.2196F, 1.1877F, -7.8639F, 1.4963F, 0.0602F, 0.0316F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(80, 87).addBox(-0.0407F, 0.1743F, 0.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1807F, 0.1506F, -7.1267F, -1.3387F, 0.0951F, 0.0317F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 75).addBox(-0.0582F, -1.2312F, 0.2254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8807F, 0.1506F, -5.2267F, -2.9515F, 0.1474F, 0.0319F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(88, 29).addBox(-0.0582F, -1.299F, 0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8807F, 0.1506F, -5.2267F, -3.0038F, 0.1474F, 0.0319F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(0, 90).addBox(-0.0582F, -0.5919F, 0.3466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8807F, 0.1506F, -5.2267F, -2.934F, 0.1474F, 0.0319F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(50, 95).addBox(-1.4146F, 4.1888F, -0.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, -1.4476F, 0.2347F, 0.0324F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(69, 40).addBox(-1.1115F, -0.67F, -4.4961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.0819F, 0.3039F, 0.0414F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(89, 80).addBox(-0.9737F, -1.4036F, -0.6042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 1.4894F, 0.3272F, 0.0998F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(40, 95).addBox(-0.9371F, -1.9622F, -1.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 1.1009F, 0.3663F, 0.1013F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(45, 95).addBox(-0.9371F, -1.1486F, -3.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.2718F, 0.3663F, 0.1013F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(89, 56).addBox(-0.9371F, -1.4225F, -2.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.4027F, 0.3663F, 0.1013F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(74, 65).addBox(-0.8624F, -0.4386F, -2.8745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 73).addBox(-0.8624F, 0.3614F, -2.8745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.0411F, 0.3989F, 0.0718F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(54, 53).addBox(-0.973F, -0.5229F, -1.6903F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5193F, 0.1506F, -1.0267F, 0.1181F, 0.3043F, 0.0483F));

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