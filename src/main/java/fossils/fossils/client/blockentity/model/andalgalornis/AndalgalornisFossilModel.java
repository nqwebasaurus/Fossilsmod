package fossils.fossils.client.blockentity.model.andalgalornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AndalgalornisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
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

	public AndalgalornisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
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
		this.bone4 = this.chest.getChild("bone4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.1754F, 2.6883F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 59).addBox(-0.5F, 0.9F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.6418F, 1.4632F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4735F, -2.0775F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 46).addBox(-1.0F, 1.4F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8159F, -1.6798F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-0.9389F, 0.0534F, -0.3615F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, -0.2706F, -0.16F, -0.4169F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-5.2281F, -1.8016F, -0.3773F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, -0.0211F, -0.3364F, -1.5089F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 79).mirror().addBox(-2.8304F, -0.4461F, -0.3773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.54F, -3.1408F, -0.1909F, -0.2795F, -0.9619F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 79).addBox(0.8304F, -0.4461F, -0.3773F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, -0.1909F, 0.2795F, 0.9619F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 28).addBox(2.2281F, -1.8016F, -0.3773F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, -0.0211F, 0.3364F, 1.5089F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 6).addBox(-0.0611F, 0.0534F, -0.3615F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.54F, -3.1408F, -0.2706F, 0.16F, 0.4169F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(93, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4933F, 5.6918F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 7).addBox(-0.5F, -0.55F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0032F, 4.1712F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 21).addBox(-1.0F, 0.0027F, 0.0176F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5523F, 1.4621F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0973F, -5.9824F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.6444F, 1.423F, -0.3578F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 36).addBox(-2.0387F, -3.154F, -0.9355F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -0.893F, -0.9566F, 1.0852F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 21).addBox(-5.3749F, -3.0618F, -0.0288F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -1.5111F, -1.0645F, 1.815F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 26).addBox(-4.2516F, 0.9936F, -1.4054F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, -2.4037F, 4.6358F, -1.7874F, -1.028F, 2.2084F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 36).addBox(-0.5021F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.6531F, 0.1151F, -1.1235F, -0.1736F, 1.0988F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 10).addBox(-1.5026F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2884F, -2.6531F, 0.1151F, -1.1578F, 0.318F, 0.4127F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 45).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.141F, -3.4177F, 3.1389F, -0.4909F, -0.1836F, 0.1186F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, -0.7F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1513F, -2.7939F, 2.797F, -0.2727F, -0.1836F, 0.1186F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 64).addBox(-1.5507F, -3.2325F, -0.7484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -1.6849F, 0.8656F, -1.3261F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5154F, -2.5178F, 4.8549F, -0.4841F, 0.0906F, 0.0298F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 46).addBox(-1.798F, -3.2265F, -2.3569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -0.8458F, 0.6577F, -0.3137F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 0).addBox(0.0079F, -3.1103F, 2.374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -0.6449F, 0.0083F, 0.268F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 66).addBox(1.1748F, -4.6445F, 7.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7963F, 3.4358F, -1.2525F, 0.2236F, 0.1976F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 14).addBox(0.3815F, -0.4058F, 4.1614F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7963F, 3.4358F, -0.7784F, 0.2595F, 0.1019F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 65).addBox(-0.309F, -1.2831F, -2.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -1.7539F, 0.243F, 0.0128F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 22).addBox(-0.0298F, -0.7862F, -0.2333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1005F, 0.7963F, 3.4358F, -0.8825F, 0.3265F, 0.0402F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 80).addBox(-0.2502F, -5.7455F, 1.1359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -1.5286F, 0.1565F, 0.0239F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9902F, 5.5747F, 9.7908F, -0.176F, 0.1565F, 0.0239F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 41).addBox(0.0841F, -1.9655F, -4.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -0.6647F, 0.1565F, 0.0239F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(56, 71).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8183F, 0.8023F, 2.6254F, -0.5268F, -0.0319F, 0.1343F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 41).addBox(-0.5F, 0.2F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4242F, -0.6479F, 3.117F, -0.9265F, 0.1565F, 0.0239F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2182F, 1.4092F, 4.9447F, -0.6194F, 0.243F, 0.0128F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(74, 79).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7717F, 5.6485F, 8.4177F, -2.4013F, 0.1565F, 0.0239F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 59).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6326F, 4.0048F, 7.2869F, -0.7519F, 0.1565F, 0.0239F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7411F, 3.1594F, 7.8468F, -0.9614F, 0.1565F, 0.0239F));

		PartDefinition cube_r38 = bone2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 34).addBox(-2.8744F, -3.1103F, 2.8984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 8).addBox(-2.8744F, -3.1103F, -1.1016F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1005F, 2.7963F, 5.3358F, -0.6737F, 0.2714F, 0.0634F));

		PartDefinition cube_r39 = bone2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 14).addBox(-0.9F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1625F, 1.1977F, 5.1171F, -0.2656F, 0.467F, 1.0273F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.049F, -4.8424F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(0.0387F, -3.154F, -0.9355F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -0.893F, 0.9566F, -1.0852F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(1.3749F, -3.0618F, -0.0288F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -1.5111F, 1.0645F, -1.815F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(1.2516F, 0.9936F, -1.4054F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, -2.4037F, 4.6358F, -1.7874F, 1.028F, -2.2084F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-1.4979F, -0.4512F, -1.2225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.6531F, 0.1151F, -1.1235F, 0.1736F, -1.0988F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-0.4974F, -0.4738F, -1.2158F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2884F, -2.6531F, 0.1151F, -1.1578F, -0.318F, -0.4127F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.141F, -3.4177F, 3.1389F, -0.4909F, 0.1836F, -0.1186F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(-0.5F, -0.7F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1513F, -2.7939F, 2.797F, -0.2727F, 0.1836F, -0.1186F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(39, 64).mirror().addBox(0.5507F, -3.2325F, -0.7484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -1.6849F, -0.8656F, 1.3261F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5154F, -2.5178F, 4.8549F, -0.4841F, -0.0906F, -0.0298F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 46).mirror().addBox(0.798F, -3.2265F, -2.3569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -0.8458F, -0.6577F, 0.3137F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-2.0079F, -3.1103F, 2.374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -0.6449F, -0.0083F, -0.268F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-2.1748F, -4.6445F, 7.4218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7963F, 3.4358F, -1.2525F, -0.2236F, -0.1976F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(26, 14).mirror().addBox(-1.3815F, -0.4058F, 4.1614F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7963F, 3.4358F, -0.7784F, -0.2595F, -0.1019F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-0.691F, -1.2831F, -2.2865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -1.7539F, -0.243F, -0.0128F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.9702F, -0.7862F, -0.2333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 0.7963F, 3.4358F, -0.8825F, -0.3265F, -0.0402F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-0.7498F, -5.7455F, 1.1359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -1.5286F, -0.1565F, -0.0239F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9902F, 5.5747F, 9.7908F, -0.176F, -0.1565F, -0.0239F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-1.0841F, -1.9655F, -4.3678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -0.6647F, -0.1565F, -0.0239F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8183F, 0.8023F, 2.6254F, -0.5268F, 0.0319F, -0.1343F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 41).mirror().addBox(-0.5F, 0.2F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4242F, -0.6479F, 3.117F, -0.9265F, -0.1565F, -0.0239F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2182F, 1.4092F, 4.9447F, -0.6194F, -0.243F, -0.0128F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7717F, 5.6485F, 8.4177F, -2.4013F, -0.1565F, -0.0239F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6326F, 4.0048F, 7.2869F, -0.7519F, -0.1565F, -0.0239F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, -0.7F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7411F, 3.1594F, 7.8468F, -0.9614F, -0.1565F, -0.0239F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.1256F, -3.1103F, 2.8984F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 8).mirror().addBox(-1.1256F, -3.1103F, -1.1016F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1005F, 2.7963F, 5.3358F, -0.6737F, -0.2714F, -0.0634F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.1F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1625F, 1.1977F, 5.1171F, -0.2656F, -0.467F, -1.0273F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(75, 6).addBox(0.7F, 1.6F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(77, 23).addBox(0.7F, 5.5004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5F, -1.1601F, -0.6856F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 98).addBox(-0.5F, -0.0138F, -0.0301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 6.4949F, -0.514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(86, 64).addBox(0.5F, -0.984F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 6.7836F, 0.8486F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(98, 51).addBox(0.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 6.4949F, -0.514F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 32).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 3.4611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 27).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 3.4611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(76, 56).addBox(-5.4435F, -0.9691F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 42).addBox(-3.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 1.8011F, 0.2148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(46, 66).addBox(-1.0F, -0.025F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, 2.8583F, -0.7694F, 1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(86, 61).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 0.2636F, -0.667F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 86).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.2636F, -0.667F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 6.5469F, -0.3008F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 30).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.7774F, -0.8673F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(27, 36).addBox(-2.5F, -12.9F, 0.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 15.8547F, -1.8159F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(9, 57).addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 12.5169F, -0.7546F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 12.5169F, -0.7546F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(25, 47).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 1.2665F, 1.5175F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(13, 28).addBox(-2.5F, -0.2F, -1.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 52).addBox(-5.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(59, 78).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(38, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8292F, 1.5336F, 0.647F, -1.047F, 0.0064F, 0.052F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 85).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8068F, 1.9283F, 0.3653F, -0.698F, 0.0064F, 0.052F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(41, 41).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.587F, 6.0866F, -0.1822F, -0.1307F, 0.0064F, 0.052F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(39, 52).addBox(-1.5F, -0.4446F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 13.83F, -0.9625F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(18, 53).addBox(-5.5F, -3.0F, -1.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe = leftLeg3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0838F, 6.1597F, -0.3287F, -0.0436F, -0.3927F, 0.0F));

		PartDefinition cube_r86 = toe.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 67).addBox(-1.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r87 = toe.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 86).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(28, 0).addBox(-1.8F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3239F, -0.6211F, 1.5184F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 29).addBox(-1.8F, -0.5F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, -0.0049F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6122F, 0.2343F, -0.4308F, 0.0436F, 0.3054F, 0.0F));

		PartDefinition leftSickleClaw2 = leftSickleClaw.addOrReplaceChild("leftSickleClaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftSickleClaw2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, -0.1284F, -2.1805F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -0.6F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftSickleClaw2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 67).addBox(-2.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 0.0F, -0.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(75, 10).addBox(-2.7F, 1.6F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(78, 34).addBox(-2.7F, 5.5004F, -0.5358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5F, -1.1601F, -0.6856F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(98, 67).addBox(-0.5F, -0.0138F, -0.0301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 6.4949F, -0.514F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(96, 79).addBox(-1.5F, -0.984F, -0.0413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 6.7836F, 0.8486F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(55, 98).addBox(-1.5F, -0.0087F, -0.0302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.7F, 6.4949F, -0.514F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 57).addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 3.4611F, 0.2122F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(53, 62).addBox(2.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.2F, 3.4611F, 0.2122F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(19, 78).addBox(3.4435F, -0.9691F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 83).addBox(2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.2F, 1.8011F, 0.2148F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(74, 67).addBox(0.0F, -0.025F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7F, 2.8583F, -0.7694F, 1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(76, 96).addBox(-0.5F, -0.5804F, -0.7863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 0.2636F, -0.667F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(71, 96).addBox(-0.5F, -0.4658F, -0.406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.2636F, -0.667F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.5469F, -0.3008F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(41, 20).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.7774F, -0.8673F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(34, 36).addBox(0.5F, -12.9F, 0.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 15.8547F, -1.8159F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(59, 8).addBox(-1.5F, -1.2F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 12.5169F, -0.7546F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(53, 58).addBox(-1.5F, -1.3F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, 12.5169F, -0.7546F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(32, 52).addBox(0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 1.2665F, 1.5175F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 31).addBox(0.5F, -0.2F, -1.1F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 3.3497F, 0.7051F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(60, 62).addBox(3.8F, -3.6498F, -0.1321F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(69, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8292F, 1.5336F, 0.647F, -1.047F, -0.0064F, -0.052F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(32, 86).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8068F, 1.9283F, 0.3653F, -0.698F, -0.0064F, -0.052F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(20, 42).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.587F, 6.0866F, -0.1822F, -0.1307F, -0.0064F, -0.052F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -0.4446F, -0.8239F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.83F, -0.9625F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(46, 54).addBox(3.5F, -3.0F, -1.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0F, 7.5553F, 0.1261F, -0.0873F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0838F, 6.1597F, -0.3287F, -0.0436F, 0.3927F, 0.0F));

		PartDefinition cube_r110 = toe2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(96, 85).addBox(0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r111 = toe2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 96).addBox(0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.0F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(30, 5).addBox(-1.2F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3239F, -0.6211F, 1.4748F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(27, 31).addBox(-1.2F, -0.5F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.493F, -2.4804F, 0.5623F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(70, 74).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6122F, 0.2343F, -0.4308F, 0.2618F, -0.3054F, 0.0F));

		PartDefinition rightSickleClaw2 = rightSickleClaw.addOrReplaceChild("rightSickleClaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightSickleClaw2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(77, 0).addBox(0.0F, -0.1284F, -2.1805F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -0.6F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightSickleClaw2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 75).addBox(1.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.5F, 0.0F, -0.3F, -0.8727F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5F, -0.9104F, -0.0756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(63, 71).addBox(0.0F, -1.5104F, 0.9244F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0663F, 5.2056F, -0.6283F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(32, 47).addBox(-0.5F, -0.794F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 75).addBox(0.0F, -1.294F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0957F, 1.8382F, 0.1134F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, -1.2042F, -0.6302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -0.3422F, 2.9666F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(87, 8).addBox(-0.5F, -0.3683F, -0.6253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.1256F, -1.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(67, 62).addBox(-0.5F, -0.5413F, -0.3889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2003F, -0.1267F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2903F, -4.168F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 87).addBox(0.0F, -2.4025F, -0.0576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.9F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(37, 86).addBox(0.0F, -2.4285F, -0.0164F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 11).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6021F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.1908F, -0.0834F, -0.5409F, -1.4108F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(84, 81).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.1908F, -0.3577F, -0.4227F, -0.8328F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -2.1908F, -0.4818F, -0.203F, -0.3071F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.518F, -0.2603F, -0.365F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.3594F, -0.4899F, -0.8982F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-5.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.44F, -0.4408F, -0.0405F, -0.5976F, -1.5001F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(63, 0).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.0405F, 0.5976F, 1.5001F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 80).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.3594F, 0.4899F, 0.8982F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(72, 0).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.44F, -0.4408F, -0.518F, 0.2603F, 0.365F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 99).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.1908F, -0.4818F, 0.203F, 0.3071F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(84, 81).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.1908F, -0.3577F, 0.4227F, 0.8328F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(61, 6).addBox(2.3936F, -1.7918F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -2.1908F, -0.0834F, 0.5409F, 1.4108F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(87, 11).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 59).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6021F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 10).addBox(-1.0F, -0.0506F, -0.0332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.6F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(28, 87).addBox(0.0F, -3.1218F, -1.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(99, 16).addBox(0.0F, -1.9982F, -0.1317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0687F, -2.6025F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(99, 12).addBox(0.0F, -1.6852F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -4.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 89).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 89).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.2362F, -0.1018F, -0.2975F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.1918F, -0.2121F, -0.8379F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-4.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.615F, -0.2658F, -0.0584F, -0.2791F, -1.3738F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, -0.0762F, -0.0561F, -0.3268F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, -0.0775F, -0.0906F, -0.8718F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-4.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.19F, -2.1908F, -0.0217F, -0.1171F, -1.3976F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 49).mirror().addBox(-3.9688F, -0.3549F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.0965F, 0.1057F, -0.9303F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.215F, -4.1408F, 0.174F, 0.022F, -0.3909F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(61, 89).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 89).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 23).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 99).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.174F, -0.022F, 0.3909F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(66, 49).addBox(0.9688F, -0.3549F, -0.5273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.215F, -4.1408F, 0.0965F, -0.1057F, 0.9303F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 8).addBox(2.3936F, -1.7918F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, -0.0217F, 0.1171F, 1.3976F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(82, 20).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, -0.0775F, 0.0906F, 0.8718F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(57, 52).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.19F, -2.1908F, -0.0762F, 0.0561F, 0.3268F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(82, 18).addBox(2.77F, -3.756F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.0584F, 0.2791F, 1.3738F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 16).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.1918F, 0.2121F, 0.8379F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(98, 70).addBox(1.9152F, -0.418F, -0.4639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.615F, -0.2658F, -0.2362F, 0.1018F, 0.2975F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(86, 26).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3398F, 1.4959F, 1.0018F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(76, 26).addBox(-1.1727F, -1.2355F, -1.6669F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6727F, 7.0619F, -0.0436F, 1.0978F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(68, 12).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4487F, 0.4686F, 0.8797F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(49, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7413F, -3.1689F, -0.281F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 8).addBox(-1.1727F, -0.3214F, -0.0015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6727F, 7.2596F, -3.6469F, 0.7837F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(57, 48).addBox(-2.1727F, 0.5247F, -0.1977F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 6.487F, -3.0936F, 0.9669F, 0.0F, 0.0F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 7.026F, -3.8738F, 0.5219F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(61, 18).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.3972F, -4.0388F, 0.1379F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(55, 40).addBox(-1.5F, -0.9F, -0.725F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.662F, -2.9139F, 0.6615F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(53, 54).addBox(-1.5F, -0.5F, -0.55F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0693F, -3.6194F, 0.3299F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(71, 87).addBox(-1.1727F, -1.3328F, 0.0314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 4.6624F, -4.1746F, 0.1728F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(87, 45).addBox(-1.1727F, -0.7328F, -0.1436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6727F, 4.6624F, -4.1746F, -0.2199F, 0.0F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(46, 93).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.217F, -4.7196F, 1.9181F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.1573F, -4.3792F, 0.3473F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(13, 14).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1864F, -0.0263F, -4.7304F, 1.7213F, 0.3435F, 0.0387F));

		PartDefinition cube_r170 = leftArm1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(81, 63).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0059F, 0.5143F, 0.1482F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftArm1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(87, 73).addBox(-0.5F, -2.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0059F, 5.5442F, 1.6774F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftArm1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(7, 76).addBox(-0.5F, -1.275F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftArm1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(5, 81).addBox(0.0F, -1.4F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5059F, 0.7353F, 0.3525F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2476F, 4.6508F, 0.7147F, -2.5311F, 0.0387F, -0.0202F));

		PartDefinition cube_r174 = leftArm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(88, 48).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 3.4856F, -0.141F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftArm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 26).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftArm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(88, 37).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 30).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftArm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(86, 87).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftArm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 81).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftArm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(17, 81).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(26, 76).addBox(-0.5F, -1.45F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.1509F, -0.3369F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftArm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(81, 87).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(76, 87).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.05F, 3.4057F, -0.5042F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2694F, 4.0414F, 0.3721F, 2.3107F, -0.0692F, 0.0532F));

		PartDefinition cube_r181 = leftHand.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5F, -0.125F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 89).addBox(-0.5F, 0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(89, 14).addBox(-0.5F, 0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 89).addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 3).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5658F, 2.2259F, -0.1546F, -0.2968F, 0.0495F, 0.0529F));

		PartDefinition cube_r182 = leftHand.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(81, 59).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4832F, 0.9483F, 0.1465F, -0.0787F, 0.0495F, 0.0529F));

		PartDefinition cube_r183 = leftHand.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(88, 83).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(85, 34).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5026F, 0.9123F, -0.2828F, -0.3405F, 0.0495F, 0.0529F));

		PartDefinition cube_r184 = leftHand.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(88, 70).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.4719F, 0.1993F, -0.427F, -0.0787F, 0.0495F, 0.0529F));

		PartDefinition cube_r185 = leftHand.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 54).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4719F, 0.1993F, -0.427F, 0.4449F, 0.0495F, 0.0529F));

		PartDefinition cube_r186 = leftHand.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 78).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.452F, 0.8948F, 0.7182F, 0.0959F, 0.0495F, 0.0529F));

		PartDefinition cube_r187 = leftHand.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(85, 41).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.452F, 0.8948F, 0.7182F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition cube_r188 = leftHand.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(88, 51).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.5F, 1.7935F, 0.7102F, -0.0089F, 0.0495F, 0.0529F));

		PartDefinition cube_r189 = leftHand.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(43, 81).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.2782F, 0.7189F, -0.2967F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1864F, -0.0263F, -4.7304F, 1.7213F, -0.3435F, -0.0387F));

		PartDefinition cube_r190 = rightArm1.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0059F, 0.5143F, 0.1482F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightArm1.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(96, 88).addBox(-0.5F, -2.3F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0059F, 5.5442F, 1.6774F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r192 = rightArm1.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(77, 18).addBox(-0.5F, -1.275F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0059F, 2.2353F, -0.1475F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightArm1.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(83, 83).addBox(-1.0F, -1.4F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5059F, 0.7353F, 0.3525F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2476F, 4.6508F, 0.7147F, -2.5311F, -0.0387F, 0.0202F));

		PartDefinition cube_r194 = rightArm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(97, 72).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 3.4856F, -0.141F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightArm2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(84, 77).addBox(0.75F, -0.2F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r196 = rightArm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 42).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 97).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightArm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(97, 9).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(97, 6).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 0.7553F, 0.278F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r198 = rightArm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(84, 22).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.05F, 2.15F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightArm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 84).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(77, 74).addBox(-0.5F, -1.45F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.1509F, -0.3369F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightArm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(96, 91).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.05F, 3.4057F, -0.5042F, 0.4189F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2694F, 4.0414F, 0.3721F, 2.3107F, 0.0692F, -0.0532F));

		PartDefinition cube_r201 = rightHand.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(98, 48).addBox(-0.5F, -0.125F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 45).addBox(-0.5F, 0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 35).addBox(-0.5F, 0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 98).addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(98, 27).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5658F, 2.2259F, -0.1546F, -0.2968F, -0.0495F, -0.0529F));

		PartDefinition cube_r202 = rightHand.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4832F, 0.9483F, 0.1465F, -0.0787F, -0.0495F, -0.0529F));

		PartDefinition cube_r203 = rightHand.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(25, 98).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 58).addBox(-0.5F, -0.6F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5026F, 0.9123F, -0.2828F, -0.3405F, -0.0495F, -0.0529F));

		PartDefinition cube_r204 = rightHand.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(20, 98).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.4719F, 0.1993F, -0.427F, -0.0787F, -0.0495F, -0.0529F));

		PartDefinition cube_r205 = rightHand.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(15, 98).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4719F, 0.1993F, -0.427F, 0.4449F, -0.0495F, -0.0529F));

		PartDefinition cube_r206 = rightHand.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 79).addBox(-0.5F, -1.6F, -1.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.452F, 0.8948F, 0.7182F, 0.0959F, -0.0495F, -0.0529F));

		PartDefinition cube_r207 = rightHand.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(46, 86).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.452F, 0.8948F, 0.7182F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition cube_r208 = rightHand.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, 1.7935F, 0.7102F, -0.0089F, -0.0495F, -0.0529F));

		PartDefinition cube_r209 = rightHand.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.2782F, 0.7189F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.8F, 3.2036F, -3.9961F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(32, 64).addBox(-0.3085F, -1.2112F, 1.4357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0163F, -3.4179F, -1.2093F, 0.2583F, -0.0698F, -0.4986F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(69, 27).addBox(-0.5913F, -0.9087F, -0.1272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0163F, -3.4179F, -1.2093F, 0.4518F, 0.0972F, -0.429F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(82, 12).addBox(-0.8587F, 1.8216F, -1.0734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7163F, 1.2821F, 0.4907F, 1.1525F, -0.5676F, -0.8799F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(89, 20).addBox(0.3364F, 0.198F, -0.9319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7163F, 4.6821F, 2.5907F, 1.9184F, -0.8046F, -1.5544F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 8).addBox(0.384F, 2.5466F, -1.7847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7163F, 1.2821F, 0.4907F, 1.6547F, -0.9809F, -1.3915F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(63, 16).addBox(-0.7F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4754F, 4.399F, 4.1404F, 1.6516F, -0.9171F, -1.0115F));

		PartDefinition cube_r216 = bone.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 6).addBox(-0.2F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.987F, 3.4485F, 3.3435F, 1.3388F, -0.6917F, -1.2008F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(82, 4).addBox(-0.9F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0022F, 2.3524F, 2.5671F, 1.2247F, -0.4919F, -0.8538F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(81, 71).addBox(-1.0F, -0.5F, -0.125F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9174F, 1.2699F, 1.8602F, 1.1313F, -0.3896F, -0.841F));

		PartDefinition cube_r219 = bone.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(98, 30).addBox(-0.5F, -0.5F, -0.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9596F, 0.4359F, 0.9284F, 1.163F, -0.2089F, -0.689F));

		PartDefinition cube_r220 = bone.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 0).addBox(0.1664F, -0.3121F, -0.3877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7163F, 4.6821F, 2.5907F, 1.517F, -0.6679F, -1.0142F));

		PartDefinition cube_r221 = bone.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(14, 69).addBox(-0.0003F, -0.8607F, -1.0921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7163F, 1.2821F, 0.4907F, 1.3695F, -0.848F, -1.3052F));

		PartDefinition cube_r222 = bone.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(20, 89).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2965F, 1.3361F, 0.455F, 0.5973F, -1.0531F, -0.2726F));

		PartDefinition cube_r223 = bone.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5657F, 0.1393F, -0.8875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.7163F, 1.2821F, 0.4907F, 1.0077F, -0.6975F, -0.794F));

		PartDefinition cube_r224 = bone.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(35, 68).addBox(-1.0978F, -0.8987F, 0.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.245F, 0.0162F, 0.5397F));

		PartDefinition cube_r225 = bone.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(50, 10).addBox(-0.7364F, -0.5479F, -1.5668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.5348F, -0.1199F, 0.1972F));

		PartDefinition cube_r226 = bone.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(28, 68).addBox(0.016F, -0.5479F, -3.0572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.4615F, -1.9215F, -1.7092F, 1.4767F, -0.0826F, 0.7575F));

		PartDefinition cube_r227 = bone.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(15, 0).addBox(0.1186F, -0.1048F, 0.825F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7163F, 1.2821F, 0.4907F, 2.0392F, 0.241F, 0.1591F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.8F, 3.2036F, -3.9961F));

		PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(-0.6915F, -1.2112F, 1.4357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -3.4179F, -1.2093F, 0.2583F, 0.0698F, 0.4986F));

		PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-0.4087F, -0.9087F, -0.1272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0163F, -3.4179F, -1.2093F, 0.4518F, -0.0972F, 0.429F));

		PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.1413F, 1.8216F, -1.0734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 1.2821F, 0.4907F, 1.1525F, 0.5676F, 0.8799F));

		PartDefinition cube_r231 = bone4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-1.3364F, 0.198F, -0.9319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 4.6821F, 2.5907F, 1.9184F, 0.8046F, 1.5544F));

		PartDefinition cube_r232 = bone4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-1.384F, 2.5466F, -1.7847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 1.2821F, 0.4907F, 1.6547F, 0.9809F, 1.3915F));

		PartDefinition cube_r233 = bone4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-3.3F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4754F, 4.399F, 4.1404F, 1.6516F, 0.9171F, 1.0115F));

		PartDefinition cube_r234 = bone4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-2.8F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.987F, 3.4485F, 3.3435F, 1.3388F, 0.6917F, 1.2008F));

		PartDefinition cube_r235 = bone4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-2.1F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0022F, 2.3524F, 2.5671F, 1.2247F, 0.4919F, 0.8538F));

		PartDefinition cube_r236 = bone4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-2.0F, -0.5F, -0.125F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9174F, 1.2699F, 1.8602F, 1.1313F, 0.3896F, 0.841F));

		PartDefinition cube_r237 = bone4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(98, 30).mirror().addBox(-1.5F, -0.5F, -0.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9596F, 0.4359F, 0.9284F, 1.163F, 0.2089F, 0.689F));

		PartDefinition cube_r238 = bone4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-1.1664F, -0.3121F, -0.3877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 4.6821F, 2.5907F, 1.517F, 0.6679F, 1.0142F));

		PartDefinition cube_r239 = bone4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(14, 69).mirror().addBox(-0.9997F, -0.8607F, -1.0921F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 1.2821F, 0.4907F, 1.3695F, 0.848F, 1.3052F));

		PartDefinition cube_r240 = bone4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.2965F, 1.3361F, 0.455F, 0.5973F, 1.0531F, 0.2726F));

		PartDefinition cube_r241 = bone4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(81, 67).mirror().addBox(-0.4343F, 0.1393F, -0.8875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 1.2821F, 0.4907F, 1.0077F, 0.6975F, 0.794F));

		PartDefinition cube_r242 = bone4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(0.0978F, -0.8987F, 0.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.245F, -0.0162F, -0.5397F));

		PartDefinition cube_r243 = bone4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(50, 10).mirror().addBox(-0.2636F, -0.5479F, -1.5668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.5348F, 0.1199F, -0.1972F));

		PartDefinition cube_r244 = bone4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(28, 68).mirror().addBox(-1.016F, -0.5479F, -3.0572F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(2.4615F, -1.9215F, -1.7092F, 1.4767F, 0.0826F, -0.7575F));

		PartDefinition cube_r245 = bone4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-1.1186F, -0.1048F, 0.825F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7163F, 1.2821F, 0.4907F, 2.0392F, -0.241F, -0.1591F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4857F, -4.903F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r246 = neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(99, 20).addBox(0.0F, -1.4044F, -0.4936F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3763F, -0.9348F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3913F, -1.3756F, 0.4069F, 0.1421F, -0.7393F));

		PartDefinition cube_r248 = neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(99, 3).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3913F, -1.3756F, 0.4069F, -0.1421F, 0.7393F));

		PartDefinition cube_r249 = neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(69, 31).addBox(0.0F, -1.9943F, -2.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.0237F, -0.2348F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8763F, -1.6348F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r250 = neck5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(32, 83).addBox(0.0F, -1.875F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.8F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(40, 99).addBox(0.0F, -2.6731F, 3.3713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 5).addBox(-0.5F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -1.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r252 = neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(61, 37).addBox(0.0F, 0.0065F, -0.1463F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(43, 99).addBox(0.0F, 1.9374F, -0.2567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(14, 75).addBox(-1.0F, 3.0773F, -0.9318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7956F, -0.8402F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(46, 99).addBox(0.0F, -0.1247F, -0.3319F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.0466F, -0.7778F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(36, 82).addBox(-0.995F, 2.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, -4.1297F, -2.9899F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1955F, -0.8108F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(49, 99).addBox(0.0F, -0.6039F, -0.1013F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.015F, -0.3135F, -1.8493F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(69, 51).addBox(-0.985F, -0.1384F, 2.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.485F, -0.7135F, -4.6493F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4172F, -1.7696F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(52, 99).addBox(0.0F, -0.9789F, -0.3013F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.015F, -0.873F, -1.5105F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r260 = neck7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(69, 55).addBox(-0.985F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.485F, -1.273F, -3.3105F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1241F, -1.6251F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck8.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 2).addBox(-0.985F, -0.1384F, 1.7138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.485F, -0.5279F, -3.6753F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8317F, -1.5529F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(31, 76).addBox(-1.992F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.992F, -3.3504F, -0.3899F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(61, 24).addBox(-1.988F, -1.2F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 61).addBox(-1.988F, -0.9F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.488F, -2.7425F, 0.5218F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(70, 22).addBox(-0.485F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.015F, -1.7912F, -5.3879F, 2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(91, 89).addBox(-0.485F, -1.675F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.015F, -0.84F, -4.0072F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(19, 70).addBox(-0.489F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.011F, -0.9259F, -3.6027F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 86).addBox(-0.489F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.011F, -1.2597F, -4.5453F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(18, 60).addBox(-0.485F, -1.0F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.015F, -1.2675F, -0.8722F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(91, 79).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 66).addBox(-0.485F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.015F, -2.3793F, -1.7721F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(58, 82).addBox(-0.485F, -0.3F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.015F, -2.8216F, -2.8383F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(91, 63).addBox(-0.485F, -0.1F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.015F, -2.3466F, -2.7383F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(53, 82).addBox(-0.485F, -1.05F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.015F, -2.7993F, -3.2585F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(96, 55).addBox(-0.5F, -0.275F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(91, 60).addBox(-0.5F, -0.075F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.01F, -4.7865F, -3.3743F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(91, 57).addBox(-0.5F, -0.9148F, -0.8983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.015F, -4.1383F, -2.1219F, 1.069F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(96, 61).addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.885F, -3.6736F, -1.095F, 2.8008F, 0.2639F, 0.4564F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(75, 47).addBox(-0.985F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.015F, -3.9477F, -1.5131F, 2.5613F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(74, 71).addBox(-0.985F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.015F, -3.9477F, -1.5131F, 1.2435F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(61, 21).addBox(-1.985F, -0.375F, -0.55F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.485F, -2.0217F, 0.7626F, 1.2261F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(61, 3).addBox(-1.985F, -0.525F, -0.875F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.485F, -2.4611F, 0.8455F, 0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(52, 15).addBox(-2.0F, -0.1003F, -0.9038F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(52, 0).addBox(-2.0F, -0.6003F, -0.9038F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.015F, -1.5272F, 1.3489F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(39, 26).addBox(-2.0F, -0.7F, -0.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.015F, -2.0308F, 0.7964F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(46, 51).addBox(-2.0F, -0.4208F, -0.6912F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.015F, -1.3695F, 0.0811F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 33).addBox(-2.0F, -0.4208F, -0.3088F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.015F, -1.3695F, 0.0811F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(39, 16).addBox(-2.0F, -0.5F, -1.225F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.015F, -1.132F, 0.6985F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 60).addBox(-1.5F, -0.6024F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.015F, -0.5401F, 0.1078F, -3.05F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 12).addBox(-1.5F, -0.5376F, -0.6734F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.015F, -0.5401F, 0.1078F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(51, 30).addBox(-2.0F, 0.4731F, -0.4983F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.015F, -1.4062F, 1.0871F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(91, 26).addBox(-0.5F, -0.2553F, -0.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.019F, -4.9681F, -3.847F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(96, 98).addBox(-0.5F, -0.4427F, -0.3591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 28).addBox(-0.5F, -0.4427F, -0.1591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(81, 90).addBox(-0.5F, -0.4427F, 0.0409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(47, 75).addBox(-0.5F, -0.5341F, -0.2119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, 1.0865F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, 0.1488F, -0.6217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 90).addBox(-0.5F, 0.2238F, -0.4467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, 3.002F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(76, 90).addBox(-0.5F, -1.0578F, 0.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, 0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(71, 90).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.015F, -3.6652F, -8.6537F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(55, 90).addBox(-0.5F, -0.1278F, -0.0114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.015F, -3.8759F, -9.5035F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(78, 37).addBox(-0.5F, -0.3992F, 0.1299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.015F, -3.9509F, -9.4035F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5F, -0.4274F, -1.4347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, -1.8631F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(45, 90).addBox(-0.5F, -1.8066F, -0.6705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.015F, -2.4509F, -9.6035F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(91, 98).addBox(-0.5F, 0.0178F, -0.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(86, 98).addBox(-0.5F, -0.3072F, -0.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.015F, -3.9509F, -9.4035F, 0.9817F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(51, 86).addBox(-0.5F, -0.2614F, -0.2407F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -4.4509F, -9.0285F, 0.781F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(48, 82).addBox(-0.5F, -0.2754F, -0.1758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.015F, -4.7509F, -8.7285F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(90, 40).addBox(-0.5F, -0.7437F, -0.7661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -5.5009F, -7.3785F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(90, 33).addBox(-0.5F, -0.7441F, -0.7594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -5.4509F, -5.4035F, 2.7663F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(31, 90).addBox(-0.5F, -0.2492F, -0.7465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.015F, -5.5759F, -5.8785F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -0.2603F, -0.2465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -5.6259F, -6.3785F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(89, 76).addBox(-0.5F, -0.7555F, -0.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.015F, -5.6009F, -6.8785F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(66, 89).addBox(-0.5F, -0.2587F, -0.7554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -5.3509F, -7.8285F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(82, 46).addBox(-0.5F, -0.3628F, 0.3158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.015F, -4.7509F, -8.7285F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(70, 18).addBox(-0.5F, -0.2918F, -0.6151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.015F, -5.2377F, -4.9513F, -0.2662F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -12.0746F, -2.3424F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(50, 96).addBox(-0.872F, 0.4738F, -0.5771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, 1.2359F, 0.6066F, 0.0879F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(45, 96).addBox(0.067F, 0.244F, -0.5383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, 1.2532F, -0.0596F, 0.305F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(40, 96).addBox(-0.259F, -1.9421F, -2.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 1.8459F, -0.09F, -0.1409F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(30, 96).addBox(-0.259F, -2.6114F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 2.8931F, -0.09F, -0.1409F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(96, 24).addBox(-0.259F, -2.11F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 2.6313F, -0.09F, -0.1409F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 96).addBox(-0.259F, -1.0141F, 0.4989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -2.3429F, -0.09F, -0.1409F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(96, 64).addBox(-0.9F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.315F, 7.9277F, 0.2084F, 1.0754F, 0.1985F, -0.1106F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(95, 95).addBox(-0.259F, -1.1034F, -0.1351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -2.4738F, -0.09F, -0.1409F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(90, 95).addBox(-0.1199F, -0.7597F, -0.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.8141F, 0.3627F, -0.1822F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(61, 95).addBox(-0.3325F, -0.5386F, -1.5323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, -0.382F, 0.3704F, 0.0286F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(56, 95).addBox(-0.3325F, -0.9702F, -0.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, 1.0579F, 0.3704F, 0.0286F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(95, 39).addBox(-0.3153F, -0.4758F, -0.5265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, 1.1156F, 0.4083F, 0.1116F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(35, 95).addBox(-2.1528F, 2.0931F, 0.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 0.6228F, 0.1025F, -1.3403F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(55, 44).addBox(-2.0226F, -5.219F, -1.4014F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.0387F, -0.014F, -3.1204F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(95, 32).addBox(-2.0226F, -2.5219F, -4.7384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.9113F, -0.014F, -3.1204F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(25, 95).addBox(-2.0226F, -3.6077F, -3.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.6059F, -0.014F, -3.1204F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(20, 95).addBox(-2.0226F, -3.7172F, -3.443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.6932F, -0.014F, -3.1204F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 95).addBox(-0.946F, -4.6516F, -1.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(5, 95).addBox(-0.946F, -4.0516F, -1.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.2904F, -0.2661F, 3.0911F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(94, 76).addBox(-2.941F, -0.8871F, 1.7411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.3594F, 0.0947F, -1.9279F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(76, 53).addBox(-2.0642F, -5.1377F, -0.4821F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(76, 50).addBox(-2.0642F, -4.5877F, -0.4821F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.0551F, 0.0574F, 3.0656F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(74, 63).addBox(-0.6F, -1.8F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9949F, 8.4907F, 1.5626F, -0.3499F, 1.0516F, -2.1009F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(74, 59).addBox(-1.0F, -1.0F, -0.525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3237F, 9.3491F, 2.2871F, -0.5989F, 0.9006F, -2.3836F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(76, 31).addBox(-3.2823F, 1.8192F, -0.536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0592F, 7.8738F, -0.7837F, 0.8011F, 0.7729F, -0.6171F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(94, 21).addBox(-0.3183F, 0.0383F, -0.5383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2563F, 8.5572F, 0.6232F, 1.2122F, 0.4772F, 0.1149F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(94, 18).addBox(0.8116F, 2.9889F, -2.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 1.0323F, 0.2477F, 0.1179F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(94, 15).addBox(0.8116F, 1.5097F, 2.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.5385F, 0.2477F, 0.1179F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(94, 12).addBox(0.8116F, -2.7878F, 1.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.9784F, 0.2477F, 0.1179F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(10, 94).addBox(0.8116F, -3.0276F, -2.1138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 2.8213F, 0.2477F, 0.1179F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(94, 3).addBox(0.8116F, 0.4276F, -3.1385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 1.3378F, 0.2477F, 0.1179F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(85, 93).addBox(0.8116F, 1.8408F, 0.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.4948F, 0.2477F, 0.1179F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(93, 82).addBox(0.8116F, 4.1099F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, 0.3429F, 0.2477F, 0.1179F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 93).addBox(0.8116F, 2.301F, 3.2634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(75, 93).addBox(0.8116F, 2.301F, 2.7634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.3116F, 0.2477F, 0.1179F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(52, 23).addBox(0.8116F, 2.0868F, 0.4707F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.3814F, 0.2477F, 0.1179F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(52, 18).addBox(0.6764F, 2.2132F, -1.9886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.2706F, 0.3606F, 0.0598F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(70, 93).addBox(0.0167F, 4.023F, 2.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.0128F, 0.112F, -0.123F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(93, 69).addBox(0.0167F, 1.4709F, 4.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -0.6237F, 0.112F, -0.123F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(40, 74).addBox(0.0167F, -4.3001F, 1.9817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0592F, 7.7488F, -0.7837F, -1.8454F, 0.112F, -0.123F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(7, 64).addBox(-0.6323F, 0.43F, -2.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F))
				.texOffs(0, 63).addBox(-0.6323F, -0.07F, -2.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -2.4904F, 0.079F, -0.1042F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(56, 86).addBox(-0.6323F, 0.0658F, -0.5863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, 2.2743F, 0.079F, -0.1042F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(19, 74).addBox(-0.6323F, 0.124F, 0.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, 0.8344F, 0.079F, -0.1042F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 54).addBox(-0.6283F, -2.0121F, 0.6017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.7276F, 0.079F, -0.1042F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(83, 50).addBox(-0.6126F, -1.7884F, 0.8969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 37).addBox(-0.6126F, -1.7884F, 1.3969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, 0.4038F, 0.0832F, -0.1152F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(46, 61).addBox(-0.4425F, -2.6846F, 0.7241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.1642F, -0.001F, -0.1525F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(25, 61).addBox(-0.3669F, -3.0144F, 1.841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.3095F, -0.0076F, -0.1915F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(96, 58).addBox(-0.5F, -0.775F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-2.1111F, 7.6635F, -2.0518F, -1.0846F, -0.0438F, -0.2159F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(83, 30).addBox(-1.5637F, -0.4345F, -1.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0592F, 7.7488F, -0.7837F, -0.2992F, -0.0438F, -0.2159F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(73, 83).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.5674F, 8.3765F, -1.238F, -0.4189F, 0.1879F, -0.2511F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(73, 43).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.854F, 8.6459F, -1.8422F, -0.054F, 0.2538F, -0.3609F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(27, 83).addBox(-1.8337F, 0.5846F, -1.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0592F, 7.7488F, -0.7837F, -0.6992F, -0.1378F, -0.1954F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5887F, -1.1185F, 2.2664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.1918F, 0.0253F, -0.0576F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(63, 74).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-1.9567F, 8.9264F, -3.3052F, -0.3227F, 0.0253F, -0.0576F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(82, 73).addBox(-0.5887F, -1.5571F, 1.7473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.3663F, 0.0253F, -0.0576F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(68, 82).addBox(-0.5887F, -1.6423F, 1.156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.41F, 0.0253F, -0.0576F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(33, 72).addBox(-0.8243F, -1.4232F, 2.7871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F))
				.texOffs(26, 72).addBox(-0.8243F, -0.8232F, 2.7871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.2285F, 0.1006F, -0.1054F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(7, 72).addBox(-0.8311F, -0.1217F, 2.7653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9379F, 9.0218F, -6.286F, -0.1881F, 0.1123F, -0.0541F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(51, 93).addBox(-0.3625F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 49).addBox(-0.5375F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1078F, 9.432F, 0.7051F, -0.6037F, 0.688F, -0.395F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -12.0746F, -2.3424F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(50, 96).mirror().addBox(-0.128F, 0.4738F, -0.5771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, 1.2359F, -0.6066F, -0.0879F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-1.067F, 0.244F, -0.5383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, 1.2532F, 0.0596F, -0.305F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(-0.741F, -1.9421F, -2.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 1.8459F, 0.09F, 0.1409F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.741F, -2.6114F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 2.8931F, 0.09F, 0.1409F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(96, 24).mirror().addBox(-0.741F, -2.11F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 2.6313F, 0.09F, 0.1409F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.741F, -1.0141F, 0.4989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -2.3429F, 0.09F, 0.1409F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-0.1F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.315F, 7.9277F, 0.2084F, 1.0754F, -0.1985F, 0.1106F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.741F, -1.1034F, -0.1351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -2.4738F, 0.09F, 0.1409F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-0.8801F, -0.7597F, -0.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.8141F, -0.3627F, 0.1822F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-0.6675F, -0.5386F, -1.5323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, -0.382F, -0.3704F, -0.0286F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-0.6675F, -0.9702F, -0.5599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, 1.0579F, -0.3704F, -0.0286F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-0.6848F, -0.4758F, -0.5265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, 1.1156F, -0.4083F, -0.1116F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(1.1528F, 2.0931F, 0.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 0.6228F, -0.1025F, 1.3403F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(55, 44).mirror().addBox(0.0226F, -5.219F, -1.4014F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.0387F, 0.014F, 3.1204F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(95, 32).mirror().addBox(1.0226F, -2.5219F, -4.7384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.9113F, 0.014F, 3.1204F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(1.0226F, -3.6077F, -3.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.6059F, 0.014F, 3.1204F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(1.0226F, -3.7172F, -3.443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.6932F, 0.014F, 3.1204F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(-0.054F, -4.6516F, -1.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(5, 95).mirror().addBox(-0.054F, -4.0516F, -1.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.2904F, 0.2661F, -3.0911F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(1.9411F, -0.8871F, 1.7411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.3594F, -0.0947F, 1.9279F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(0.0642F, -5.1377F, -0.4821F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(76, 50).mirror().addBox(0.0642F, -4.5877F, -0.4821F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.0551F, -0.0574F, -3.0656F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(-1.4F, -1.8F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9949F, 8.4907F, 1.5626F, -0.3499F, -1.0516F, 2.1009F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(-1.0F, -1.0F, -0.525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3237F, 9.3491F, 2.2871F, -0.5989F, -0.9006F, 2.3836F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(1.2823F, 1.8192F, -0.536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.8738F, -0.7837F, 0.8011F, -0.7729F, 0.6171F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(94, 21).mirror().addBox(-0.6817F, 0.0383F, -0.5383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2563F, 8.5572F, 0.6232F, 1.2122F, -0.4772F, -0.1149F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(-1.8116F, 2.9889F, -2.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 1.0323F, -0.2477F, -0.1179F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(94, 15).mirror().addBox(-1.8116F, 1.5097F, 2.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.5385F, -0.2477F, -0.1179F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-1.8116F, -2.7878F, 1.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.9784F, -0.2477F, -0.1179F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-1.8116F, -3.0276F, -2.1138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 2.8213F, -0.2477F, -0.1179F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(-1.8116F, 0.4276F, -3.1385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 1.3378F, -0.2477F, -0.1179F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(85, 93).mirror().addBox(-1.8116F, 1.8408F, 0.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.4948F, -0.2477F, -0.1179F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-1.8116F, 4.1099F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, 0.3429F, -0.2477F, -0.1179F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(80, 93).mirror().addBox(-1.8116F, 2.301F, 3.2634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(75, 93).mirror().addBox(-1.8116F, 2.301F, 2.7634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.3116F, -0.2477F, -0.1179F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-1.8116F, 2.0868F, 0.4707F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.3814F, -0.2477F, -0.1179F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-1.6764F, 2.2132F, -1.9886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.2706F, -0.3606F, -0.0598F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(70, 93).mirror().addBox(-1.0168F, 4.023F, 2.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.0128F, -0.112F, 0.123F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-1.0168F, 1.4709F, 4.5709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -0.6237F, -0.112F, 0.123F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-1.0168F, -4.3001F, 1.9817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0592F, 7.7488F, -0.7837F, -1.8454F, -0.112F, 0.123F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.3677F, 0.43F, -2.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(0, 63).mirror().addBox(-0.3677F, -0.07F, -2.0575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -2.4904F, -0.079F, 0.1042F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(56, 86).mirror().addBox(-0.3677F, 0.0658F, -0.5863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, 2.2743F, -0.079F, 0.1042F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.3677F, 0.124F, 0.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, 0.8344F, -0.079F, 0.1042F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(83, 54).mirror().addBox(-0.3717F, -2.0121F, 0.6017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.7276F, -0.079F, 0.1042F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-0.3874F, -1.7884F, 0.8969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(83, 37).mirror().addBox(-0.3874F, -1.7884F, 1.3969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, 0.4038F, -0.0832F, 0.1152F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(46, 61).mirror().addBox(-0.5575F, -2.6846F, 0.7241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.1642F, 0.001F, 0.1525F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(25, 61).mirror().addBox(-0.6331F, -3.0144F, 1.841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.3095F, 0.0076F, 0.1915F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-0.5F, -0.775F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(2.1111F, 7.6635F, -2.0518F, -1.0846F, 0.0438F, 0.2159F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(83, 30).mirror().addBox(0.5637F, -0.4345F, -1.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0592F, 7.7488F, -0.7837F, -0.2992F, 0.0438F, 0.2159F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.5674F, 8.3765F, -1.238F, -0.4189F, -0.1879F, 0.2511F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.854F, 8.6459F, -1.8422F, -0.054F, -0.2538F, 0.3609F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(27, 83).mirror().addBox(0.8337F, 0.5846F, -1.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0592F, 7.7488F, -0.7837F, -0.6992F, 0.1378F, 0.1954F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.4113F, -1.1185F, 2.2664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.1918F, -0.0253F, 0.0576F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(63, 74).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(1.9567F, 8.9264F, -3.3052F, -0.3227F, -0.0253F, 0.0576F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-0.4113F, -1.5571F, 1.7473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.3663F, -0.0253F, 0.0576F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(-0.4113F, -1.6423F, 1.156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.41F, -0.0253F, 0.0576F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-0.1757F, -1.4232F, 2.7871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(26, 72).mirror().addBox(-0.1757F, -0.8232F, 2.7871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.2285F, -0.1006F, 0.1054F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-0.1689F, -0.1217F, 2.7653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9379F, 9.0218F, -6.286F, -0.1881F, -0.1123F, 0.0541F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-0.6375F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 49).mirror().addBox(-0.4625F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1078F, 9.432F, 0.7051F, -0.6037F, -0.688F, 0.395F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.8728F, -0.4236F, -0.0517F, 0.0F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(-0.0925F, -1.9022F, -2.344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.1121F, -0.1823F, -0.0469F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.2516F, -1.1341F, -3.7095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(67, 70).mirror().addBox(-0.2516F, -1.7591F, -3.6345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.032F, -0.2771F, -0.0688F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.0475F, -2.2363F, 0.6308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 1.477F, -0.2056F, -0.0966F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.2318F, -2.0009F, -4.7264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.078F, -0.2515F, -0.0457F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(0.4382F, -6.9367F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 1.5322F, -0.0967F, -0.0285F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(0.4382F, -1.2877F, 6.6466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 2.9721F, -0.0967F, -0.0285F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(0.4382F, -1.4017F, -6.1495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.0923F, -0.0967F, -0.0285F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(0.2533F, -2.3094F, -5.2963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.1455F, -0.1315F, -0.0267F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(0.4382F, 4.7522F, -2.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -1.2953F, -0.0967F, -0.0285F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(0.4591F, 5.4582F, -2.7929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -1.3124F, -0.094F, -0.0337F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(0.4382F, 6.4966F, -1.9552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -1.4436F, -0.0967F, -0.0285F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3436F, 0.9603F, -4.8096F, 0.1269F, -0.1294F, -0.0119F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(0.0936F, -1.0224F, -5.2764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 39).mirror().addBox(0.0936F, -1.3724F, -5.2764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 0.0009F, -0.1729F, -0.061F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(0.3031F, 3.1496F, -8.0001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.5467F, -0.0922F, 0.0431F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(60, 92).mirror().addBox(0.334F, 3.7914F, -8.0312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.6342F, -0.0883F, 0.0479F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(65, 92).mirror().addBox(0.3877F, 4.7529F, -7.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.7653F, -0.0815F, 0.0545F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(0.1226F, 0.6496F, -8.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.2383F, -0.1161F, 0.017F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(91, 92).mirror().addBox(0.1226F, 2.8309F, -7.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.5001F, -0.1161F, 0.017F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(0.1162F, 2.2539F, -7.7795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -0.421F, -0.1172F, 0.0105F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(93, 29).mirror().addBox(0.1162F, -8.3287F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 1.4988F, -0.1172F, 0.0105F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(0.1162F, -7.8309F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, 1.5861F, -0.1172F, 0.0105F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(-0.0946F, 0.7529F, -1.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -1.2502F, -0.1828F, -0.0333F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(93, 36).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1779F, 0.5417F, -0.9994F, -2.7774F, -0.1828F, -0.0333F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(41, 93).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 0.3444F, -0.215F, 1.8507F, -0.1835F, 0.0295F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(66, 96).mirror().addBox(0.4814F, 4.5377F, -3.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7103F, 1.5283F, -0.1734F, -1.2249F, -0.0908F, -0.0388F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(41, 93).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3282F, 0.3444F, -0.215F, 1.8507F, 0.1835F, -0.0295F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(93, 36).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1779F, 0.5417F, -0.9994F, -2.7774F, 0.1828F, 0.0333F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(98, 82).addBox(-0.9054F, 0.7529F, -1.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -1.2502F, 0.1828F, 0.0333F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(30, 93).addBox(-1.1162F, -7.8309F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 1.5861F, 0.1172F, -0.0105F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(93, 29).addBox(-1.1162F, -8.3287F, -0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 1.4988F, 0.1172F, -0.0105F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 93).addBox(-1.1162F, 2.2539F, -7.7795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.421F, 0.1172F, -0.0105F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(91, 92).addBox(-1.1225F, 2.8309F, -7.9999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.5001F, 0.1161F, -0.017F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(92, 73).addBox(-1.1225F, 0.6496F, -8.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.2383F, 0.1161F, -0.017F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(65, 92).addBox(-1.3877F, 4.7529F, -7.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.7653F, 0.0815F, -0.0545F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(60, 92).addBox(-1.334F, 3.7914F, -8.0312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.6342F, 0.0883F, -0.0479F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(92, 43).addBox(-1.3031F, 3.1496F, -8.0001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.264F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -0.5467F, 0.0922F, -0.0431F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(71, 39).addBox(-1.0936F, -1.3724F, -5.2764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(71, 35).addBox(-1.0936F, -1.0224F, -5.2764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.0009F, 0.1729F, 0.061F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6564F, 0.9603F, -4.8096F, 0.1269F, 0.1294F, 0.0119F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(36, 92).addBox(-1.4382F, 6.4966F, -1.9552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -1.4436F, 0.0967F, 0.0285F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(66, 96).addBox(-1.4814F, 4.5377F, -3.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -1.2249F, 0.0908F, 0.0388F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(25, 92).addBox(-1.4591F, 5.4582F, -2.7929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -1.3124F, 0.094F, 0.0337F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(20, 92).addBox(-1.4382F, 4.7522F, -2.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, -1.2953F, 0.0967F, 0.0285F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(15, 92).addBox(-1.2532F, -2.3094F, -5.2963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.1455F, 0.1315F, 0.0267F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(92, 9).addBox(-1.4382F, -1.4017F, -6.1495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.0923F, 0.0967F, 0.0285F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(92, 6).addBox(-1.4382F, -1.2877F, 6.6466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 2.9721F, 0.0967F, 0.0285F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(5, 92).addBox(-1.4382F, -6.9367F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 1.5322F, 0.0967F, 0.0285F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(9, 52).addBox(-0.7682F, -2.0009F, -4.7264F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.078F, 0.2515F, 0.0457F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(92, 0).addBox(-0.9525F, -2.2363F, 0.6308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 1.477F, 0.2056F, 0.0966F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(67, 70).addBox(-0.7484F, -1.7591F, -3.6345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 70).addBox(-0.7484F, -1.1341F, -3.7095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.032F, 0.2771F, 0.0688F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(52, 3).addBox(-0.9075F, -1.9022F, -2.344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7103F, 1.5283F, -0.1734F, 0.1121F, 0.1823F, 0.0469F));

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