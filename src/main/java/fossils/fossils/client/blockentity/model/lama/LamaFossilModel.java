package fossils.fossils.client.blockentity.model.lama;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LamaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart chest2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public LamaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
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
		this.chest2 = this.chest.getChild("chest2");
		this.bone = this.chest2.getChild("bone");
		this.bone3 = this.chest2.getChild("bone3");
		this.leftarm = this.chest2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.neck2 = this.neck5.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck6 = this.neck4.getChild("neck6");
		this.neck7 = this.neck4.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.9402F, 12.6534F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, -0.7F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 96).addBox(0.0F, -1.6201F, -1.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.5442F, -0.2404F, -0.6718F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-2.2F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, 0.0023F, -0.2221F, -0.36F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 8).addBox(-0.8F, 0.3F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, 0.0023F, 0.2221F, 0.36F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 35).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.5442F, 0.2404F, 0.6718F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 25).addBox(-1.0F, -0.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.045F, 1.8445F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7318F, 2.5874F, 0.0037F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 5).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1016F, 0.221F, 1.8072F, -0.6503F, -1.4197F, 1.9066F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(89, 88).addBox(-0.775F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3658F, 0.9537F, 1.4915F, -0.0913F, -0.0103F, 1.2627F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 8).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.166F, 0.8099F, 3.0937F, -0.1779F, 1.0299F, 1.1089F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 14).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0769F, 1.6898F, 5.1242F, -1.2198F, 0.7344F, -0.036F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(90, 11).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0769F, 1.6898F, 5.1242F, 0.8183F, 1.1881F, 2.1498F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 10).addBox(-0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0626F, 0.6914F, 5.0796F, 1.0316F, 0.4076F, 2.4804F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 5).addBox(-0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0626F, 0.6914F, 5.0796F, 0.885F, 0.7312F, 2.2132F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 34).addBox(-3.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 1.0113F, 2.1218F, -0.5765F, 1.4028F, 0.6917F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 75).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4829F, 2.6669F, 1.0424F, 0.2469F, 0.9776F, 1.1997F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 48).addBox(-1.475F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5721F, 1.3376F, 0.6194F, -0.1661F, 0.9869F, 1.1229F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 63).addBox(-0.075F, -0.5F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3197F, 0.42F, 0.198F, -0.1223F, 0.7277F, 1.1802F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 59).addBox(-0.2123F, -1.0055F, 1.0133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3167F, -0.4456F, -1.6012F, -0.0983F, 0.3807F, 1.2252F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 55).addBox(-0.7052F, -1.0055F, -0.7691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3167F, -0.4456F, -1.6012F, -0.1473F, 0.9007F, 1.1461F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 43).addBox(0.0272F, -1.0055F, -0.6145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3167F, -0.4456F, -1.6012F, -0.0957F, 0.3069F, 1.2328F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 47).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1916F, -3.4219F, -2.6344F, -0.4598F, 0.8823F, 0.9928F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(89, 85).addBox(-1.6256F, -1.0116F, -3.2635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(96, 40).addBox(-1.6256F, -1.0116F, -2.6635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3213F, -1.3835F, -2.8772F, -1.3317F, -1.1517F, 2.4271F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(42, 47).addBox(-1.3205F, -1.0116F, -1.8541F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3213F, -1.3835F, -2.8772F, -2.0039F, -1.1201F, -3.1209F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 75).addBox(-2.3146F, -1.0116F, -1.5294F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3213F, -1.3835F, -2.8772F, -2.4853F, -0.8659F, -2.5551F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(75, 26).addBox(-1.8615F, -1.0116F, 0.3945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3213F, -1.3835F, -2.8772F, -2.7248F, -0.2164F, -2.1193F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(84, 89).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1556F, -2.8898F, -3.4067F, -2.6243F, 0.9641F, -1.3463F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(86, 2).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4631F, -3.3437F, -1.6752F, -0.2859F, 0.0184F, 1.3526F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(89, 82).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4567F, -2.5216F, -1.1058F, -0.3501F, -0.6057F, 1.563F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(37, 37).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0332F, -1.6706F, -2.1236F, -1.3604F, -1.2783F, 2.7094F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7318F, 2.5874F, 0.0037F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(90, 5).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.221F, 1.8072F, -0.6503F, 1.4197F, -1.9066F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-0.225F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3658F, 0.9537F, 1.4915F, -0.0913F, 0.0103F, -1.2627F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.166F, 0.8099F, 3.0937F, -0.1779F, -1.0299F, -1.1089F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0769F, 1.6898F, 5.1242F, -1.2198F, -0.7344F, 0.036F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0769F, 1.6898F, 5.1242F, 0.8183F, -1.1881F, -2.1498F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-2.9F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0626F, 0.6914F, 5.0796F, 1.0316F, -0.4076F, -2.4804F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-2.9F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0626F, 0.6914F, 5.0796F, 0.885F, -0.7312F, -2.2132F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 34).mirror().addBox(0.1F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 1.0113F, 2.1218F, -0.5765F, -1.4028F, -0.6917F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4829F, 2.6669F, 1.0424F, 0.2469F, -0.9776F, -1.1997F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.525F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5721F, 1.3376F, 0.6194F, -0.1661F, -0.9869F, -1.1229F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 63).mirror().addBox(-0.925F, -0.5F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3197F, 0.42F, 0.198F, -0.1223F, -0.7277F, -1.1802F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(63, 59).mirror().addBox(-0.7877F, -1.0055F, 1.0133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3167F, -0.4456F, -1.6012F, -0.0983F, -0.3807F, -1.2252F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-0.2948F, -1.0055F, -0.7691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3167F, -0.4456F, -1.6012F, -0.1473F, -0.9007F, -1.1461F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 43).mirror().addBox(-1.0272F, -1.0055F, -0.6145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3167F, -0.4456F, -1.6012F, -0.0957F, -0.3069F, -1.2328F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(96, 47).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1916F, -3.4219F, -2.6344F, -0.4598F, -0.8823F, -0.9928F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(89, 85).mirror().addBox(0.6256F, -1.0116F, -3.2635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(96, 40).mirror().addBox(0.6256F, -1.0116F, -2.6635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3213F, -1.3835F, -2.8772F, -1.3317F, 1.1517F, -2.4271F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 47).mirror().addBox(-0.6795F, -1.0116F, -1.8541F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3213F, -1.3835F, -2.8772F, -2.0039F, 1.1201F, 3.1209F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(0.3146F, -1.0116F, -1.5294F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3213F, -1.3835F, -2.8772F, -2.4853F, 0.8659F, 2.5551F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(-0.1385F, -1.0116F, 0.3945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3213F, -1.3835F, -2.8772F, -2.7248F, 0.2164F, 2.1193F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 89).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -2.8898F, -3.4067F, -2.6243F, -0.9641F, 1.3463F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(86, 2).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4631F, -3.3437F, -1.6752F, -0.2859F, -0.0184F, -1.3526F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 82).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4567F, -2.5216F, -1.1058F, -0.3501F, 0.6057F, -1.563F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(37, 37).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0332F, -1.6706F, -2.1236F, -1.3604F, 1.2783F, -2.7094F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 5.7255F, 1.3991F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 43).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)), PartPose.offsetAndRotation(0.0F, 5.8295F, -0.4077F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(73, 66).addBox(-1.0F, 0.0F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 43).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(59, 13).addBox(-1.0F, -0.875F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 80).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, 3.84F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 20).addBox(-1.0F, 0.7386F, -0.1186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 7.2684F, -0.8302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 51).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 8.1239F, -0.8277F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -0.325F, -1.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.0763F, -0.5238F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, 0.3F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.5448F, 1.2846F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -0.325F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6874F, 0.9693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 12).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 8.4882F, 0.2264F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 23).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 13).addBox(-1.0F, -0.775F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 72).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 17).addBox(-0.5F, -4.0F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6664F, 0.2653F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 48).addBox(-1.9F, 0.0521F, -1.0729F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 5.653F, 0.4695F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(19, 64).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0799F, -0.6198F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.545F, -1.7115F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 59).addBox(-1.0F, -3.4136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(22, 39).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 7.3768F, -0.4639F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.3027F, -0.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6054F, 0.1726F, -1.7302F, 0.1631F, 0.1813F, -0.1404F));

		PartDefinition cube_r80 = leftLeg4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(70, 50).addBox(-0.5F, -0.0563F, -1.6299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6054F, 0.1726F, -1.7302F, -0.7096F, 0.1813F, -0.1404F));

		PartDefinition cube_r81 = leftLeg4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, -0.0563F, -1.6299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4054F, 0.1726F, -1.7302F, -0.7096F, -0.1813F, 0.1404F));

		PartDefinition cube_r82 = leftLeg4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(60, 4).addBox(-0.5F, -0.3027F, -0.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4054F, 0.1726F, -1.7302F, 0.1631F, -0.1813F, 0.1404F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.6921F, -2.8676F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8F, 5.7255F, 1.3991F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.0123F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8295F, -0.4077F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-1.0F, 0.0F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 17).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8555F, -0.7177F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-1.0F, -0.875F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1511F, -0.766F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 80).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2545F, 0.3235F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.5F, 3.84F, 1.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-1.0F, 0.7386F, -0.1186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2684F, -0.8302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.1239F, -0.8277F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-1.0F, -0.325F, -1.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0763F, -0.5238F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-1.0F, 0.3F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5448F, 1.2846F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-1.0F, -0.325F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.6874F, 0.9693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.4882F, 0.2264F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.3906F, 0.7456F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(50, 13).mirror().addBox(-1.0F, -0.775F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4984F, 0.8262F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 72).mirror().addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-0.5F, -4.0F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6664F, 0.2653F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(0.9F, 0.0521F, -1.0729F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 5.653F, 0.4695F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(19, 64).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7767F, 0.7733F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0781F, -0.6808F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0799F, -0.6198F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.545F, -1.7115F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(0.0F, -3.4136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(22, 39).mirror().addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.3768F, -0.4639F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, -0.3027F, -0.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6054F, 0.1726F, -1.7302F, 0.1631F, -0.1813F, 0.1404F));

		PartDefinition cube_r108 = rightLeg4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 50).mirror().addBox(-0.5F, -0.0563F, -1.6299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6054F, 0.1726F, -1.7302F, -0.7096F, -0.1813F, 0.1404F));

		PartDefinition cube_r109 = rightLeg4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, -0.0563F, -1.6299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4054F, 0.1726F, -1.7302F, -0.7096F, 0.1813F, -0.1404F));

		PartDefinition cube_r110 = rightLeg4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.5F, -0.3027F, -0.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4054F, 0.1726F, -1.7302F, 0.1631F, 0.1813F, -0.1404F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.6921F, -2.8676F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -1.9001F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(6, 97).addBox(0.0F, -1.9327F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(-0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4552F, -2.9409F, 0.0F, -1.885F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.9679F, 0.0491F, -1.8803F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9888F, 0.0829F, -1.8741F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(-0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1152F, -0.7516F, -7.3958F, -3.0718F, 0.0F, -1.885F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(16, 88).addBox(0.0F, -0.1F, -0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9888F, -0.0829F, 1.8741F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(13, 86).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.9679F, -0.0491F, 1.8803F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 97).addBox(0.5078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1152F, -0.7516F, -7.3958F, -3.0718F, 0.0F, 1.885F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(45, 60).addBox(0.6078F, -0.6036F, -0.6209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, -2.9409F, 0.0F, 1.885F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(3, 97).addBox(-0.5753F, -1.8245F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 96).addBox(-0.4485F, -1.6641F, -0.1492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.6806F, -7.7242F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.0961F, -0.0434F, 0.0042F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.116F, 0.2946F, -0.8484F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0377F, 0.3138F, -1.3515F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1893F, 0.2545F, -0.5795F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-8.8656F, -2.2434F, -0.4173F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0255F, 0.3649F, -1.3475F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-3.5988F, -0.6501F, -0.4173F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1526F, 0.3337F, -0.8371F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-1.7126F, -0.2141F, -0.4173F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.2349F, 0.283F, -0.5674F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(-7.8655F, -2.2335F, -0.4096F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0244F, 0.4003F, -1.3991F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-3.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.172F, 0.364F, -0.8824F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-1.7058F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2618F, 0.3073F, -0.6116F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(80, 65).addBox(-0.2942F, -0.2069F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2618F, -0.3073F, 0.6116F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(83, 10).addBox(1.5942F, -0.6413F, -0.4096F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.172F, -0.364F, 0.8824F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(38, 11).addBox(2.8655F, -2.2335F, -0.4096F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0244F, -0.4003F, 1.3991F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(80, 12).addBox(-0.2874F, -0.2141F, -0.4173F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.2349F, -0.283F, 0.5674F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(80, 0).addBox(1.5988F, -0.6501F, -0.4173F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1526F, -0.3337F, 0.8371F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 35).addBox(2.8656F, -2.2434F, -0.4173F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0255F, -0.3649F, 1.3475F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(84, 57).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1893F, -0.2545F, 0.5795F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(19, 7).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0377F, -0.3138F, 1.3515F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(78, 72).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.116F, -0.2946F, 0.8484F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(9, 97).addBox(0.0F, -1.9188F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(19, 88).addBox(0.0F, -2.1938F, -0.046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(45, 95).addBox(0.0F, -2.5198F, -0.0541F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 89).addBox(0.0F, -2.798F, -0.0557F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2437F, -0.9064F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(22, 84).addBox(0.0F, -3.9213F, -0.1497F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 86).addBox(-0.005F, -3.7103F, -0.2312F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8985F, -4.6627F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(48, 39).addBox(0.0F, -0.7463F, -0.0997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8985F, -4.6627F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(39, 29).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4532F, 10.8911F, -1.1687F, -0.4232F, -0.297F, -2.881F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0924F, 10.6508F, 0.196F, -0.4141F, -0.4579F, -2.8042F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-1.7864F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0901F, 0.1948F, -0.6275F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(46, 84).mirror().addBox(-3.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.036F, 0.2114F, -0.8943F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-9.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, -0.0671F, 0.2038F, -1.385F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, 0.2194F, -0.5393F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 49).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, 0.2475F, -0.8069F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, 0.2537F, -1.3026F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, 0.2417F, -0.5305F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, 0.2958F, -1.2994F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, 0.2788F, -0.7988F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0924F, 10.6508F, 0.196F, -0.4968F, -0.7873F, -2.6541F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(17, 12).mirror().addBox(-0.2F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0924F, 10.6508F, 0.196F, -0.7487F, -0.8377F, -2.3201F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.4F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0924F, 10.6508F, 0.196F, -0.8896F, -0.9208F, -2.1415F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 51).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1068F, -0.2788F, 0.7988F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(26, 21).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, -0.0378F, -0.2958F, 1.2994F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(83, 8).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4985F, -0.6877F, 0.1762F, -0.2417F, 0.5305F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(25, 9).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, -0.0499F, -0.2537F, 1.3026F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(84, 49).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.0754F, -0.2475F, 0.8069F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(83, 6).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1485F, -2.5877F, 0.1377F, -0.2194F, 0.5393F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(22, 37).addBox(3.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, -0.0671F, -0.2038F, 1.385F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(46, 84).addBox(1.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.036F, -0.2114F, 0.8943F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(82, 26).addBox(-0.2136F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0901F, -0.1948F, 0.6275F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 10).addBox(-10.6F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0924F, 10.6508F, 0.196F, -0.8896F, 0.9208F, 2.1415F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(17, 12).addBox(-8.8F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0924F, 10.6508F, 0.196F, -0.7487F, 0.8377F, 2.3201F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(26, 23).addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0924F, 10.6508F, 0.196F, -0.4968F, 0.7873F, 2.6541F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(36, 6).addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0924F, 10.6508F, 0.196F, -0.4141F, 0.4579F, 2.8042F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(39, 29).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4532F, 10.8911F, -1.1687F, -0.4232F, 0.297F, 2.881F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.4677F, -0.7306F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 10.393F, -2.2913F, 0.2356F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2485F, -4.5877F, 0.219F, -0.0852F, -0.0189F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(97, 22).addBox(-0.005F, -4.0235F, -0.4903F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(97, 18).addBox(0.0F, -2.0848F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 86).addBox(-0.005F, -4.4594F, -0.3902F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, -1.825F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(12, 97).addBox(0.0F, -1.5133F, -0.2054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, -1.825F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(39, 25).mirror().addBox(-8.0781F, -2.659F, -0.4744F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1059F, -0.0994F, -1.4478F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(42, 8).mirror().addBox(-0.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4765F, 9.4631F, -2.7023F, -0.0124F, -0.2386F, -2.8254F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(39, 27).mirror().addBox(-0.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5272F, 10.1748F, -1.1907F, -0.0187F, -0.3678F, -2.8117F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1397F, -0.0395F, -0.9704F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1451F, -0.0021F, -0.7112F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.133F, -0.0288F, -0.7574F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1211F, -0.0622F, -1.0173F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(43, 22).mirror().addBox(-7.1867F, -2.6424F, -0.3998F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0788F, -0.111F, -1.4967F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6432F, 8.5688F, -4.7458F, 0.5488F, -0.2768F, -2.8933F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(59, 27).addBox(-2.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6432F, 8.5688F, -4.7458F, 0.5488F, 0.2768F, 2.8933F));

		PartDefinition cube_r194 = chest2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(43, 22).addBox(3.1867F, -2.6424F, -0.3998F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0788F, 0.111F, 1.4967F));

		PartDefinition cube_r195 = chest2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(84, 43).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1211F, 0.0622F, 1.0173F));

		PartDefinition cube_r196 = chest2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(81, 37).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.133F, 0.0288F, 0.7574F));

		PartDefinition cube_r197 = chest2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(80, 74).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1451F, 0.0021F, 0.7112F));

		PartDefinition cube_r198 = chest2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(80, 67).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1397F, 0.0395F, 0.9704F));

		PartDefinition cube_r199 = chest2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(39, 27).addBox(-4.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5272F, 10.1748F, -1.1907F, -0.0187F, 0.3678F, 2.8117F));

		PartDefinition cube_r200 = chest2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(42, 8).addBox(-3.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, 9.4631F, -2.7023F, -0.0124F, 0.2386F, 2.8254F));

		PartDefinition cube_r201 = chest2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(39, 25).addBox(3.0781F, -2.659F, -0.4744F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1059F, 0.0994F, 1.4478F));

		PartDefinition cube_r202 = chest2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(43, 18).addBox(-1.0F, 9.3533F, 2.0119F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r203 = chest2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 9.8091F, -2.5839F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r204 = chest2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2406F, 1.1294F, -3.2655F, 0.1522F, 0.204F, -0.264F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(13, 21).addBox(1.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 28).addBox(2.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(35, 88).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0249F, 3.038F, -3.5702F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(30, 88).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 84).addBox(-0.5F, -1.65F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0249F, -3.07F, 1.5944F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.175F, -2.075F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0249F, -2.1157F, -0.8217F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 80).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, -2.8289F, -0.1208F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(19, 60).addBox(-0.5F, 0.025F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0249F, 0.1805F, -1.9548F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, -0.95F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 1.8331F, -2.2357F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(24, 31).addBox(2.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.9249F, -0.4785F, 2.9521F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 80).addBox(-0.5F, -1.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(88, 28).addBox(-0.5F, -0.625F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0249F, 0.2801F, 2.3877F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r216 = bone.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.9229F, 1.6217F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(41, 13).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0249F, 1.9944F, -0.9652F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(30, 14).addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2406F, 1.1294F, -3.2655F, 0.1522F, -0.204F, 0.264F));

		PartDefinition cube_r219 = bone3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-2.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r220 = bone3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-3.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r221 = bone3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 3.038F, -3.5702F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r222 = bone3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 3.069F, -2.914F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r223 = bone3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-0.5F, -1.65F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -3.07F, 1.5944F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(-0.5F, -0.175F, -2.075F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -2.1157F, -0.8217F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(79, 80).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, -2.8289F, -0.1208F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r226 = bone3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-0.5F, 0.025F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.1805F, -1.9548F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r227 = bone3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(-0.5F, -0.95F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 1.8331F, -2.2357F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r228 = bone3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(24, 31).mirror().addBox(-3.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.9249F, -0.4785F, 2.9521F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r229 = bone3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(74, 80).mirror().addBox(-0.5F, -1.8F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(88, 28).mirror().addBox(-0.5F, -0.625F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.2801F, 2.3877F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r230 = bone3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.9229F, 1.6217F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r231 = bone3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 1.9944F, -0.9652F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r232 = bone3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 0.6339F, -0.7383F, 0.6458F, 0.0F, 0.0F));

		PartDefinition leftarm = chest2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 5.2619F, -6.9584F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 81).addBox(-0.0018F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -0.4761F, 0.052F, 1.2216F, 0.0012F, -0.0013F));

		PartDefinition cube_r234 = leftarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0122F, -0.4915F, 0.9714F, -1.8152F, 0.0014F, -0.001F));

		PartDefinition cube_r235 = leftarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(81, 2).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0113F, 0.1026F, 1.1883F, -0.5935F, 0.0014F, -0.001F));

		PartDefinition cube_r236 = leftarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 69).addBox(0.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5144F, 0.2216F, -1.1013F, 0.4537F, 0.0014F, -0.001F));

		PartDefinition cube_r237 = leftarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(88, 35).addBox(-0.5F, -0.9F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftarm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(89, 38).addBox(0.0F, -1.0461F, -0.9134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 4.5051F, 2.7331F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftarm.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 60).addBox(0.0F, -4.0461F, -1.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 4.5051F, 2.7331F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftarm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(43, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8132F, 0.176F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftarm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(46, 31).addBox(-0.5F, -0.075F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.6098F, 3.0757F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftarm.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(70, 46).addBox(0.0F, -0.2914F, -0.7046F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1384F, 7.9448F, 2.3224F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(16, 43).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.9029F, 0.1716F, 1.5708F, -1.2392F, -1.5708F));

		PartDefinition cube_r244 = leftarm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(52, 74).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6064F, 4.8804F, 0.2036F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition cube_r245 = leftarm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(74, 37).addBox(0.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1236F, 2.1144F, 1.0517F, 1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r246 = leftarm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(89, 45).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -1.6284F, 1.9555F, -1.5708F, -0.3142F, 1.5708F));

		PartDefinition cube_r247 = leftarm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(45, 89).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.6603F, 1.7051F, -1.5708F, -1.3177F, 1.5708F));

		PartDefinition cube_r248 = leftarm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(26, 74).addBox(-1.95F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1236F, -0.4558F, 1.8574F, 1.5708F, -0.733F, -1.5708F));

		PartDefinition cube_r249 = leftarm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 74).addBox(-1.2F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, -1.3222F, 0.7668F, 1.5708F, -0.5149F, -1.5708F));

		PartDefinition cube_r250 = leftarm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(74, 3).addBox(0.6935F, -1.481F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, 2.1144F, 1.0517F, 1.5708F, -0.2967F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(27, 39).addBox(-0.5F, -0.2045F, -0.4286F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 8.7331F, 1.9855F, 1.3265F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(58, 81).addBox(-0.5F, -0.3455F, -0.6306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.063F, 0.1818F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftArm4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(89, 79).addBox(-0.5F, -0.825F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(66, 89).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3802F, 2.7859F, -0.1936F, 1.1856F, 0.1344F, 0.1117F));

		PartDefinition cube_r252 = leftArm4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5233F, 2.9573F, -1.1036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r253 = leftArm4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 59).addBox(-0.5F, -0.85F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(89, 53).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3569F, 2.805F, -0.1775F, 1.1856F, -0.1344F, -0.1117F));

		PartDefinition cube_r254 = leftArm4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(57, 34).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.9573F, -1.1036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition rightarm = chest2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 5.2619F, -6.9584F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(36, 84).addBox(-0.9982F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -0.4761F, 0.052F, 1.2216F, -0.0012F, 0.0013F));

		PartDefinition cube_r256 = rightarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(76, 93).addBox(-0.5F, 0.15F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0122F, -0.4915F, 0.9714F, -1.8152F, -0.0014F, 0.001F));

		PartDefinition cube_r257 = rightarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(31, 84).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0113F, 0.1026F, 1.1883F, -0.5935F, -0.0014F, 0.001F));

		PartDefinition cube_r258 = rightarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(28, 77).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5144F, 0.2216F, -1.1013F, 0.4537F, -0.0014F, 0.001F));

		PartDefinition cube_r259 = rightarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(93, 34).addBox(-0.5F, -0.9F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightarm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(93, 26).addBox(-1.0F, -1.0461F, -0.9134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.5051F, 2.7331F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightarm.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 66).addBox(-1.0F, -4.0461F, -1.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.5051F, 2.7331F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightarm.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(48, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8132F, 0.176F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightarm.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(18, 49).addBox(-1.5F, -0.075F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.6098F, 3.0757F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightarm.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(70, 54).addBox(-2.0F, -0.2914F, -0.7046F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.3792F, 3.0206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1384F, 7.9448F, 2.3224F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(7, 58).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 4.9029F, 0.1716F, 1.5708F, 1.2392F, 1.5708F));

		PartDefinition cube_r266 = rightarm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(69, 77).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6064F, 4.8804F, 0.2036F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r267 = rightarm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(77, 62).addBox(-2.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1236F, 2.1144F, 1.0517F, 1.5708F, -0.0785F, 1.5708F));

		PartDefinition cube_r268 = rightarm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1236F, -1.6284F, 1.9555F, -1.5708F, 0.3142F, -1.5708F));

		PartDefinition cube_r269 = rightarm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 94).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.6603F, 1.7051F, -1.5708F, 1.3177F, -1.5708F));

		PartDefinition cube_r270 = rightarm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(77, 59).addBox(-0.05F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.1236F, -0.4558F, 1.8574F, 1.5708F, 0.733F, 1.5708F));

		PartDefinition cube_r271 = rightarm2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(77, 56).addBox(-0.8F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1236F, -1.3222F, 0.7668F, 1.5708F, 0.5149F, 1.5708F));

		PartDefinition cube_r272 = rightarm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(77, 53).addBox(-2.6935F, -1.481F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, 2.1144F, 1.0517F, 1.5708F, 0.2967F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5F, -0.2045F, -0.4286F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, 8.7331F, 1.9855F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(84, 39).addBox(-0.5F, -0.3455F, -0.6306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.063F, 0.1818F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r273 = rightArm4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(35, 94).addBox(-0.5F, -0.825F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(30, 94).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3802F, 2.7859F, -0.1936F, 1.1856F, -0.1344F, -0.1117F));

		PartDefinition cube_r274 = rightArm4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(66, 67).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5233F, 2.9573F, -1.1036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r275 = rightArm4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(25, 94).addBox(-0.5F, -0.85F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(10, 94).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3569F, 2.805F, -0.1775F, 1.1856F, 0.1344F, 0.1117F));

		PartDefinition cube_r276 = rightArm4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(12, 58).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.9573F, -1.1036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(28, 97).addBox(0.0F, -1.8069F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r278 = neck3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(34, 49).addBox(0.0F, -1.9F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 42).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.766F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(81, 76).addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2226F, -1.6821F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3744F, -3.1925F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(83, 28).addBox(0.0F, -0.8681F, -0.0721F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 37).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(25, 97).addBox(0.0F, -1.5F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(53, 60).addBox(-0.5F, -1.3753F, -0.4709F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(58, 60).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 97).addBox(0.0F, -3.3F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5648F, -2.9493F, 1.0559F, 0.0F, 0.0F));

		PartDefinition neck6 = neck4.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(33, 75).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(37, 97).addBox(0.0F, -2.7F, 0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8793F, 0.0324F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck7 = neck4.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(38, 75).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9064F, -0.2611F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck7.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(31, 97).mirror().addBox(0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.2F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r285 = neck7.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(31, 97).addBox(-0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.2F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 65).addBox(-1.0F, -2.4182F, -1.8675F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4566F, -0.2853F, -1.0209F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(56, 52).addBox(-0.5F, 0.0F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.9969F, -3.1815F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(56, 48).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4664F, -4.0644F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(38, 80).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.8473F, -4.9619F, -2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(56, 88).addBox(-0.5F, 0.0F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.484F, -4.8932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(51, 88).addBox(-0.7F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.203F, 0.9286F, -6.4224F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(78, 90).addBox(-0.5F, -0.6908F, -0.8482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 69).addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 3.9405F, -7.6621F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 31).addBox(-0.5F, -0.7F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 17).addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 3.5526F, -6.9625F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(33, 61).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.6045F, -6.0155F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(52, 24).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.3685F, -3.093F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(75, 23).addBox(-1.0F, 0.4F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(73, 74).addBox(-0.5F, 0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.6964F, -3.4092F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(9, 49).addBox(-1.5F, -0.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0196F, -2.7883F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(48, 35).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.4184F, -1.8712F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(78, 69).addBox(-1.0F, 0.0F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8993F, 0.0763F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(17, 84).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -2.4819F, -1.5683F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(34, 52).addBox(-0.5F, -1.275F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.5632F, -0.4687F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2963F, 0.1251F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(52, 17).addBox(-1.5F, -0.0332F, -1.6042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.987F, -1.1694F, -3.9462F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -1.7019F, -0.8729F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.3F, 0.6196F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5359F, 0.9361F, -6.2987F, 0.0F, -0.0164F, -0.006F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(95, 9).addBox(-0.2652F, 0.1773F, -0.2317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2979F, -0.9635F, 3.7611F, 1.7907F, 0.1015F, 0.0931F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(52, 70).addBox(-1.7F, -1.7F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7801F, -2.5727F, 6.4088F, 2.5383F, 0.0619F, 0.7326F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(14, 53).addBox(-0.725F, -1.325F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1284F, -1.529F, 5.469F, 2.6116F, 1.4298F, 1.0477F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(65, 42).addBox(-2.3185F, -1.0618F, -0.3399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.7729F, -1.4635F, 4.8611F, 2.313F, 0.5893F, 0.5693F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(21, 77).addBox(-1.6167F, 0.2103F, -0.3399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7729F, -1.4635F, 4.8611F, 2.1718F, -0.1124F, 0.0213F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 91).addBox(-0.6167F, -0.4374F, -0.0908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.7729F, -1.4635F, 4.8611F, 0.9937F, -0.1124F, 0.0213F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 91).addBox(-0.6167F, -0.378F, -0.3951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7729F, -1.4635F, 4.8611F, 1.9536F, -0.1124F, 0.0213F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(94, 51).addBox(-0.6693F, -0.9345F, -0.2741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7729F, -0.9635F, 4.6611F, 0.5608F, 0.0146F, 0.0926F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(94, 44).addBox(-0.2652F, -0.6539F, -0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.2979F, -0.9635F, 3.7611F, 0.4381F, 0.1015F, 0.0931F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(91, 48).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0632F, 0.0718F, 1.429F, -2.3422F, 0.3573F, 0.1912F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(77, 47).addBox(-1.65F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0632F, 0.0718F, 1.429F, -2.3002F, -0.2662F, -0.6471F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(77, 44).addBox(-1.7F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0845F, 0.1764F, 1.5981F, -2.0733F, -0.2662F, -0.6471F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(88, 94).addBox(-0.7213F, 0.4272F, 1.1339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(94, 87).addBox(-0.7213F, 0.0272F, 1.1339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -2.0889F, 0.2319F, 0.1824F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(77, 50).addBox(-1.7F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1271F, 0.3857F, 1.9363F, -2.0733F, -0.2662F, -0.6471F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(94, 84).addBox(-0.7213F, -1.9506F, 0.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 2.9289F, 0.2319F, 0.1824F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(94, 81).addBox(-0.7213F, -1.3599F, -1.6476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 1.7508F, 0.2319F, 0.1824F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(94, 78).addBox(-0.7213F, 0.3868F, -1.3346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 0.4854F, 0.2319F, 0.1824F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(95, 6).addBox(-0.7213F, -1.0665F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 1.3581F, 0.2319F, 0.1824F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(95, 3).addBox(-0.7213F, -0.9493F, -1.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 1.5326F, 0.2319F, 0.1824F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(93, 94).addBox(-0.7213F, 0.2351F, -1.5877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 0.7472F, 0.2319F, 0.1824F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 90).addBox(-0.7213F, 0.3022F, 0.1112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 94).addBox(-0.7213F, 0.3022F, 0.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -0.6927F, 0.2319F, 0.1824F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(94, 59).addBox(-0.7213F, -0.6606F, 0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 94).addBox(-0.7213F, -0.6606F, -0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -1.6962F, 0.2319F, 0.1824F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(95, 15).addBox(-0.7213F, -0.5481F, -0.5639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -2.7783F, 0.2319F, 0.1824F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(7, 77).addBox(-1.7213F, -1.3601F, 1.1156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 2.894F, 0.2319F, 0.1824F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(5, 91).addBox(-0.7213F, 0.694F, 0.9193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -2.0366F, 0.2319F, 0.1824F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(43, 76).addBox(-1.7213F, -1.1158F, 1.0511F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 2.8067F, 0.2319F, 0.1824F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(76, 29).addBox(-1.7213F, 0.8839F, 0.1549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -2.1675F, 0.2319F, 0.1824F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(14, 76).addBox(-1.7213F, 0.3816F, -1.5432F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -1.033F, 0.2319F, 0.1824F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(76, 9).addBox(-1.7213F, -1.1877F, -1.4055F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 0.1451F, 0.2319F, 0.1824F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(76, 6).addBox(-1.7213F, -1.2666F, -0.1071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 1.3668F, 0.2319F, 0.1824F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 76).addBox(-1.7213F, -1.371F, -0.2899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 1.0614F, 0.2319F, 0.1824F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(91, 0).addBox(-0.7213F, -0.2899F, -0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, 2.6322F, 0.2319F, 0.1824F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(95, 12).addBox(-0.7213F, -0.3051F, -0.5927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6979F, -0.8635F, 3.2611F, -2.4293F, 0.2319F, 0.1824F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 94).addBox(-0.2652F, -0.2705F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2979F, -0.9635F, 3.7611F, -0.5219F, 0.1015F, 0.0931F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(94, 37).addBox(-0.2652F, -0.6093F, -0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2979F, -0.9635F, 3.7611F, 0.6562F, 0.1015F, 0.0931F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(84, 86).addBox(-0.9235F, -1.2218F, 0.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6981F, 0.7568F, 2.3639F, -0.8614F, 0.0837F, 0.0643F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(87, 23).addBox(-0.9235F, 0.1166F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6981F, 0.7568F, 2.3639F, 0.6221F, 0.0837F, 0.0643F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(87, 20).addBox(-0.8091F, 0.3879F, 0.752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(86, 76).addBox(-0.8091F, 0.3879F, -0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1007F, 1.1244F, 0.814F, 0.438F, 0.3568F, 0.1852F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(85, 14).addBox(-0.575F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(84, 83).addBox(-0.575F, 0.0F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0852F, 2.4185F, -0.9448F, -0.0351F, 0.2369F, -0.1412F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(85, 32).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 17).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0263F, 2.4301F, -0.1743F, 0.7307F, 0.1924F, 0.0444F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(68, 86).addBox(-0.917F, -1.2433F, -0.3446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6981F, 0.7568F, 2.3639F, -0.9226F, 0.0867F, 0.0607F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(46, 86).addBox(-0.917F, -0.3446F, -0.1067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6981F, 0.7568F, 2.3639F, 0.6482F, 0.0867F, 0.0607F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(33, 91).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3511F, -1.7259F, 1.8812F, 0.8348F, 0.1667F, 0.4699F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(40, 95).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2531F, -0.8075F, 1.2261F, 0.7321F, -0.109F, 0.2643F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(40, 95).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1392F, -0.4247F, 1.2037F, -0.0729F, -0.0607F, 0.538F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 95).addBox(-0.275F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(40, 95).addBox(-0.075F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 95).addBox(0.325F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2606F, -1.0554F, 1.1449F, -0.056F, -0.0765F, 0.2936F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(84, 53).addBox(-0.5F, -0.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4145F, -0.2664F, 1.2303F, -0.2315F, 0.1268F, 1.4126F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(95, 29).addBox(0.1F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2606F, -1.0554F, 1.1449F, -0.2634F, -0.0043F, 0.9043F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(52, 66).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0591F, -3.2851F, 5.2137F, -1.6326F, 0.9197F, -0.008F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(26, 66).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0092F, -3.2606F, 4.2153F, -1.5431F, 0.0482F, 0.0641F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(66, 21).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7825F, -2.8542F, 3.3301F, -1.1288F, 0.2042F, 0.104F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(5, 84).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8641F, -2.6325F, 2.8895F, -2.3315F, -0.0693F, 0.0088F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(66, 12).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8641F, -2.6325F, 2.8895F, -1.0992F, -0.1461F, -0.0745F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(7, 53).addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6443F, -0.4695F, 2.582F, 0.2632F, -0.0032F, 0.1376F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(28, 91).addBox(0.025F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3511F, -1.7259F, 1.8812F, 0.7386F, -0.0916F, 0.2342F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(53, 85).addBox(-0.8649F, -0.7087F, -0.5786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1007F, 1.1244F, 0.814F, 2.8342F, 0.3685F, 0.0455F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(38, 91).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3329F, 0.3421F, 0.9441F, -0.2618F, 0.7025F, -1.5708F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(7, 66).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0424F, -0.4361F, 0.3872F, 0.6469F, 0.3927F, -0.0759F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(66, 0).addBox(-0.45F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3077F, -0.5833F, 1.335F, 0.7196F, 0.1988F, 0.1714F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(85, 69).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0548F, -0.0296F, -0.0843F, 2.2807F, -0.0321F, -0.1135F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(80, 18).addBox(-0.4963F, -0.6347F, -0.1989F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(58, 85).addBox(-0.4963F, -0.6347F, -0.4239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0783F, 0.5911F, -0.1232F, 0.9281F, -0.0321F, -0.1135F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(55, 91).addBox(-0.6571F, -1.3148F, -1.5662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.022F, 2.409F, -0.9342F, -1.4646F, 0.0963F, 0.0478F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(67, 4).addBox(-0.4963F, -0.5279F, -0.5747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0783F, 0.5911F, -0.1232F, 0.4045F, -0.0321F, -0.1135F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(91, 75).addBox(-0.2939F, 0.588F, -1.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.228F, 1.559F, -0.8342F, 0.2626F, 0.2556F, 0.1327F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(71, 91).addBox(-0.2551F, 0.4759F, -1.5665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.228F, 1.559F, -0.8342F, 0.3499F, 0.2556F, 0.1327F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(60, 91).addBox(-0.2551F, 0.3076F, -1.3575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.228F, 1.559F, -0.8342F, 0.5244F, 0.2556F, 0.1327F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(91, 56).addBox(-0.4079F, 0.3076F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.228F, 1.559F, -0.8342F, 0.5069F, 0.0656F, 0.0239F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(66, 71).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2776F, 1.5816F, 0.2034F, -0.0348F, 0.5044F, -1.5462F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(59, 71).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2541F, 1.4262F, 0.0797F, 0.4974F, 0.1124F, -0.061F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(59, 67).addBox(-0.673F, -0.6091F, -0.2734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.022F, 2.409F, -0.9342F, 0.6821F, 0.1941F, 0.0054F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0196F, 1.1992F, -0.1308F, 0.5355F, 0.1209F, -0.0938F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(71, 33).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0196F, 1.1992F, -0.1308F, 0.9524F, 0.2085F, -0.1986F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(67, 37).addBox(-0.673F, -0.5917F, -0.1943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.022F, 2.409F, -0.9342F, 0.9439F, 0.1941F, 0.0054F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(56, 56).addBox(-0.7742F, -0.4872F, -0.2092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.022F, 2.409F, -0.9342F, 0.5627F, 0.1332F, 0.0712F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(49, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0603F, -0.6473F, 0.6367F, 0.665F, 0.2607F, -0.183F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(50, 91).addBox(-0.4922F, -0.1721F, -0.5348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0783F, 0.5911F, -0.1232F, -0.1171F, -0.0155F, -0.0816F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(41, 56).addBox(-0.625F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3133F, -0.2868F, 0.9847F, 0.7044F, 0.0666F, 0.0565F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(45, 65).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8511F, -2.3951F, 2.6244F, 0.7503F, 0.1935F, 0.1774F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(87, 66).addBox(-0.3642F, -0.1345F, -1.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 63).addBox(-0.3642F, -0.1345F, -1.182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.228F, 1.559F, -0.8342F, 0.9479F, 0.1126F, 0.0726F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(25, 86).addBox(-0.8014F, 0.0286F, -0.9404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1007F, 1.1244F, 0.814F, 1.9887F, 0.3636F, 0.1727F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(96, 54).addBox(-0.8014F, -0.0244F, 0.7867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1007F, 1.1244F, 0.814F, 0.4615F, 0.3636F, 0.1727F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5359F, 0.9361F, -6.2987F, 0.0F, 0.0164F, 0.006F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.7348F, 0.1773F, -0.2317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -0.9635F, 3.7611F, 1.7907F, -0.1015F, -0.0931F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-0.3F, -1.7F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7801F, -2.5727F, 6.4088F, 2.5383F, -0.0619F, -0.7326F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.275F, -1.325F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1284F, -1.529F, 5.469F, 2.6116F, -1.4298F, -1.0477F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(65, 42).mirror().addBox(0.3185F, -1.0618F, -0.3399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.7729F, -1.4635F, 4.8611F, 2.313F, -0.5893F, -0.5693F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-0.3833F, 0.2103F, -0.3399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7729F, -1.4635F, 4.8611F, 2.1718F, 0.1124F, -0.0213F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.3833F, -0.4374F, -0.0908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.7729F, -1.4635F, 4.8611F, 0.9937F, 0.1124F, -0.0213F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.3833F, -0.378F, -0.3951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7729F, -1.4635F, 4.8611F, 1.9536F, 0.1124F, -0.0213F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(94, 51).mirror().addBox(-0.3308F, -0.9345F, -0.2741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7729F, -0.9635F, 4.6611F, 0.5608F, -0.0146F, -0.0926F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(94, 44).mirror().addBox(-0.7348F, -0.6539F, -0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -0.9635F, 3.7611F, 0.4381F, -0.1015F, -0.0931F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 0.0718F, 1.429F, -2.3422F, -0.3573F, -0.1912F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-0.35F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0632F, 0.0718F, 1.429F, -2.3002F, 0.2662F, 0.6471F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(77, 44).mirror().addBox(-0.3F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0845F, 0.1764F, 1.5981F, -2.0733F, 0.2662F, 0.6471F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(-0.2787F, 0.4272F, 1.1339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 87).mirror().addBox(-0.2787F, 0.0272F, 1.1339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -2.0889F, -0.2319F, -0.1824F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.3F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1271F, 0.3857F, 1.9363F, -2.0733F, 0.2662F, 0.6471F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(94, 84).mirror().addBox(-0.2787F, -1.9506F, 0.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 2.9289F, -0.2319F, -0.1824F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-0.2787F, -1.3599F, -1.6476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 1.7508F, -0.2319F, -0.1824F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(-0.2787F, 0.3868F, -1.3346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 0.4854F, -0.2319F, -0.1824F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.2787F, -1.0665F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 1.3581F, -0.2319F, -0.1824F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-0.2787F, -0.9493F, -1.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 1.5326F, -0.2319F, -0.1824F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(-0.2787F, 0.2351F, -1.5877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 0.7472F, -0.2319F, -0.1824F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(94, 90).mirror().addBox(-0.2787F, 0.3022F, 0.1112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 94).mirror().addBox(-0.2787F, 0.3022F, 0.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -0.6927F, -0.2319F, -0.1824F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-0.2787F, -0.6606F, 0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 94).mirror().addBox(-0.2787F, -0.6606F, -0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -1.6962F, -0.2319F, -0.1824F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(95, 15).mirror().addBox(-0.2787F, -0.5481F, -0.5639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -2.7783F, -0.2319F, -0.1824F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.2787F, -1.3601F, 1.1156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 2.894F, -0.2319F, -0.1824F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.2787F, 0.694F, 0.9193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -2.0366F, -0.2319F, -0.1824F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(43, 76).mirror().addBox(-0.2787F, -1.1158F, 1.0511F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 2.8067F, -0.2319F, -0.1824F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-0.2787F, 0.8839F, 0.1549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -2.1675F, -0.2319F, -0.1824F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.2787F, 0.3816F, -1.5432F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -1.033F, -0.2319F, -0.1824F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.2787F, -1.1877F, -1.4055F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 0.1451F, -0.2319F, -0.1824F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.2787F, -1.2666F, -0.1071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 1.3668F, -0.2319F, -0.1824F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.2787F, -1.371F, -0.2899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 1.0614F, -0.2319F, -0.1824F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.2787F, -0.2899F, -0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, 2.6322F, -0.2319F, -0.1824F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(-0.2787F, -0.3051F, -0.5927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6979F, -0.8635F, 3.2611F, -2.4293F, -0.2319F, -0.1824F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(53, 94).mirror().addBox(-0.7348F, -0.2705F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -0.9635F, 3.7611F, -0.5219F, -0.1015F, -0.0931F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-0.7348F, -0.6093F, -0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -0.9635F, 3.7611F, 0.6562F, -0.1015F, -0.0931F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-0.0765F, -1.2218F, 0.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6981F, 0.7568F, 2.3639F, -0.8614F, -0.0837F, -0.0643F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-0.0765F, 0.1166F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6981F, 0.7568F, 2.3639F, 0.6221F, -0.0837F, -0.0643F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(87, 20).mirror().addBox(-0.1909F, 0.3879F, 0.752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(86, 76).mirror().addBox(-0.1909F, 0.3879F, -0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1007F, 1.1244F, 0.814F, 0.438F, -0.3568F, -0.1852F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-0.425F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(84, 83).mirror().addBox(-0.425F, 0.0F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0852F, 2.4185F, -0.9448F, -0.0351F, -0.2369F, 0.1412F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 17).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0263F, 2.4301F, -0.1743F, 0.7307F, -0.1924F, -0.0444F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(-0.083F, -1.2433F, -0.3446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6981F, 0.7568F, 2.3639F, -0.9226F, -0.0867F, -0.0607F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(46, 86).mirror().addBox(-0.083F, -0.3446F, -0.1067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6981F, 0.7568F, 2.3639F, 0.6482F, -0.0867F, -0.0607F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3511F, -1.7259F, 1.8812F, 0.8348F, -0.1667F, -0.4699F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2531F, -0.8075F, 1.2261F, 0.7321F, 0.109F, -0.2643F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1392F, -0.4247F, 1.2037F, -0.0729F, 0.0607F, -0.538F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.725F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(40, 95).mirror().addBox(-0.925F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 95).mirror().addBox(-1.325F, -0.35F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2606F, -1.0554F, 1.1449F, -0.056F, 0.0765F, -0.2936F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-0.5F, -0.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4145F, -0.2664F, 1.2303F, -0.2315F, -0.1268F, -1.4126F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(95, 29).mirror().addBox(-1.1F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2606F, -1.0554F, 1.1449F, -0.2634F, 0.0043F, -0.9043F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(52, 66).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0591F, -3.2851F, 5.2137F, -1.6326F, -0.9197F, 0.008F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0092F, -3.2606F, 4.2153F, -1.5431F, -0.0482F, -0.0641F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7825F, -2.8542F, 3.3301F, -1.1288F, -0.2042F, -0.104F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -2.6325F, 2.8895F, -2.3315F, 0.0693F, -0.0088F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8641F, -2.6325F, 2.8895F, -1.0992F, 0.1461F, 0.0745F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, -0.4695F, 2.582F, 0.2632F, 0.0032F, -0.1376F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-1.025F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3511F, -1.7259F, 1.8812F, 0.7386F, 0.0916F, -0.2342F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(-0.1351F, -0.7087F, -0.5786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1007F, 1.1244F, 0.814F, 2.8342F, -0.3685F, -0.0455F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3329F, 0.3421F, 0.9441F, -0.2618F, -0.7025F, 1.5708F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0424F, -0.4361F, 0.3872F, 0.6469F, -0.3927F, 0.0759F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.55F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3077F, -0.5833F, 1.335F, 0.7196F, -0.1988F, -0.1714F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0548F, -0.0296F, -0.0843F, 2.2807F, 0.0321F, 0.1135F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.5037F, -0.6347F, -0.1989F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(58, 85).mirror().addBox(-0.5037F, -0.6347F, -0.4239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0783F, 0.5911F, -0.1232F, 0.9281F, 0.0321F, 0.1135F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-0.3429F, -1.3148F, -1.5662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.022F, 2.409F, -0.9342F, -1.4646F, -0.0963F, -0.0478F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-0.5037F, -0.5279F, -0.5747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0783F, 0.5911F, -0.1232F, 0.4045F, 0.0321F, 0.1135F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-0.7061F, 0.588F, -1.6627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.228F, 1.559F, -0.8342F, 0.2626F, -0.2556F, -0.1327F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(71, 91).mirror().addBox(-0.7449F, 0.4759F, -1.5665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.228F, 1.559F, -0.8342F, 0.3499F, -0.2556F, -0.1327F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(60, 91).mirror().addBox(-0.7449F, 0.3076F, -1.3575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.228F, 1.559F, -0.8342F, 0.5244F, -0.2556F, -0.1327F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.5921F, 0.3076F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.228F, 1.559F, -0.8342F, 0.5069F, -0.0656F, -0.0239F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2776F, 1.5816F, 0.2034F, -0.0348F, -0.5044F, 1.5462F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2541F, 1.4262F, 0.0797F, 0.4974F, -0.1124F, 0.061F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-0.327F, -0.6091F, -0.2734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.022F, 2.409F, -0.9342F, 0.6821F, -0.1941F, -0.0054F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0196F, 1.1992F, -0.1308F, 0.5355F, -0.1209F, 0.0938F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(71, 33).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0196F, 1.1992F, -0.1308F, 0.9524F, -0.2085F, 0.1986F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-0.327F, -0.5917F, -0.1943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.022F, 2.409F, -0.9342F, 0.9439F, -0.1941F, -0.0054F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-0.2258F, -0.4872F, -0.2092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.022F, 2.409F, -0.9342F, 0.5627F, -0.1332F, -0.0712F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(49, 55).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0603F, -0.6473F, 0.6367F, 0.665F, -0.2607F, 0.183F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(50, 91).mirror().addBox(-0.5077F, -0.1721F, -0.5348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0783F, 0.5911F, -0.1232F, -0.1171F, 0.0155F, 0.0816F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(41, 56).mirror().addBox(-0.375F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3133F, -0.2868F, 0.9847F, 0.7044F, -0.0666F, -0.0565F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8511F, -2.3951F, 2.6244F, 0.7503F, -0.1935F, -0.1774F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-0.6358F, -0.1345F, -1.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 63).mirror().addBox(-0.6358F, -0.1345F, -1.182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.228F, 1.559F, -0.8342F, 0.9479F, -0.1126F, -0.0726F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.1986F, 0.0286F, -0.9404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1007F, 1.1244F, 0.814F, 1.9887F, -0.3636F, -0.1727F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(-0.1986F, -0.0244F, 0.7867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1007F, 1.1244F, 0.814F, 0.4615F, -0.3636F, -0.1727F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4368F, -1.4042F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.05F, -3.1707F, 1.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 3.9128F, -1.1425F, 0.2531F, -0.0873F, -0.0698F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(12, 82).mirror().addBox(-0.05F, -4.221F, -1.7951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 3.9128F, -1.1425F, -0.6632F, -0.0873F, -0.0698F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(0.0727F, -1.0255F, -0.3577F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1444F, 3.051F, -3.0998F, -1.4376F, -0.1978F, -0.0718F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-0.1574F, 0.5905F, -1.6995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, -1.1684F, -0.338F, -0.109F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(0.2136F, -0.2468F, -0.7346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 95).mirror().addBox(0.2136F, 0.3532F, -0.7346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1444F, 3.051F, -3.0998F, -1.4272F, -0.1726F, -0.1058F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(74, 84).mirror().addBox(0.0727F, -0.4025F, 0.0085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1444F, 3.051F, -3.0998F, -1.6732F, -0.1978F, -0.0718F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(73, 88).mirror().addBox(0.0521F, -0.2119F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, -1.2005F, -0.2614F, -0.0284F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(0.0521F, -1.3045F, -1.4131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, -0.7641F, -0.2614F, -0.0284F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(0.0387F, 0.469F, -0.9882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, -1.2049F, -0.2592F, -0.073F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(26, 82).mirror().addBox(-0.05F, -3.7754F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 3.9128F, -1.0175F, 0.0262F, -0.0873F, -0.0698F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.05F, -5.0902F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 3.9128F, -1.0175F, -0.0175F, -0.0873F, -0.0698F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-0.0397F, -0.4614F, -0.0308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 3.051F, -5.5998F, -1.7128F, 0.0184F, -0.0293F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(0.0767F, 0.6631F, -0.1786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1444F, 3.051F, -3.0998F, -1.4995F, -0.1124F, -0.0295F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(-0.0397F, -0.4415F, -0.1483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 3.051F, -5.5998F, -1.6343F, 0.0184F, -0.0293F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.5F, -0.2F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.5606F, -1.2218F, -0.918F, 1.3788F, -0.0873F, -0.0698F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5903F, -1.5641F, -0.8515F, 1.946F, -0.0873F, -0.0698F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1253F, 3.4193F, -0.0753F, -2.3038F, -0.0873F, -0.0698F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 62).mirror().addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2353F, 2.6821F, 0.5913F, 3.0194F, -0.0873F, -0.0698F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(65, 92).mirror().addBox(0.0521F, -0.3014F, -1.6287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, 0.1085F, -0.2614F, -0.0284F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(0.0521F, -2.5966F, -0.769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6694F, 3.051F, -0.4998F, 1.6357F, -0.2614F, -0.0284F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(21, 80).mirror().addBox(0.0806F, 1.3147F, -0.4422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1444F, 3.051F, -3.0998F, -1.4688F, -0.1102F, -0.0327F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-0.2497F, 0.0119F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(81, 95).mirror().addBox(-0.2497F, 0.0119F, -0.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 3.051F, -5.5998F, -1.2637F, 0.0049F, -0.2542F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(92, 72).mirror().addBox(-0.001F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 92).mirror().addBox(-0.001F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7444F, 3.551F, -6.8998F, -2.1068F, -0.0777F, 0.0224F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(87, 72).mirror().addBox(0.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(79, 87).mirror().addBox(0.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 3.0061F, -6.6142F, -1.9894F, 0.4287F, 0.3657F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(3, 88).mirror().addBox(-0.455F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 3.0061F, -6.6142F, -1.9533F, -0.1365F, 0.6032F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(15, 93).mirror().addBox(-0.7349F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 93).mirror().addBox(-0.3849F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7284F, 3.0061F, -6.6142F, -2.2206F, -0.9134F, 1.0901F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(79, 84).mirror().addBox(-0.65F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2952F, 3.3554F, -6.7027F, -1.598F, 0.3123F, 0.3416F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(-0.25F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6866F, 3.5418F, -6.3498F, -1.4668F, 0.2687F, 0.3429F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(79, 40).addBox(-0.9603F, -0.4415F, -0.1483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, 3.051F, -5.5998F, -1.6343F, -0.0184F, 0.0293F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(21, 80).addBox(-1.0806F, 1.3147F, -0.4422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1444F, 3.051F, -3.0998F, -1.4688F, 0.1102F, 0.0327F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(33, 80).addBox(-1.0767F, 0.6631F, -0.1786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1444F, 3.051F, -3.0998F, -1.4995F, 0.1124F, 0.0295F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(83, 92).addBox(-0.999F, 0.2577F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(92, 72).addBox(-0.999F, -0.1423F, -0.6166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7444F, 3.551F, -6.8998F, -2.1068F, 0.0777F, -0.0224F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(20, 93).addBox(-0.6151F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(15, 93).addBox(-0.2651F, -0.1374F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7284F, 3.0061F, -6.6142F, -2.2206F, 0.9134F, -1.0901F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(3, 88).addBox(-0.545F, 0.1376F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7284F, 3.0061F, -6.6142F, -1.9533F, 0.1365F, -0.6032F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(79, 87).addBox(-1.0535F, 0.075F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(87, 72).addBox(-1.0535F, -0.325F, -0.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7284F, 3.0061F, -6.6142F, -1.9894F, -0.4287F, -0.3657F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(84, 80).addBox(-0.75F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6866F, 3.5418F, -6.3498F, -1.4668F, -0.2687F, -0.3429F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(79, 84).addBox(-0.35F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2952F, 3.3554F, -6.7027F, -1.598F, -0.3123F, -0.3416F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(7, 80).addBox(-0.9603F, -0.4614F, -0.0308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7444F, 3.051F, -5.5998F, -1.7128F, -0.0184F, 0.0293F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(92, 20).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5903F, -1.5641F, -0.8515F, 1.946F, 0.0873F, 0.0698F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(89, 91).addBox(-0.5F, -0.2F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5606F, -1.2218F, -0.918F, 1.3788F, 0.0873F, 0.0698F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(69, 82).addBox(-0.95F, -5.0902F, -0.279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 3.9128F, -1.0175F, -0.0175F, 0.0873F, 0.0698F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(26, 82).addBox(-0.95F, -3.7754F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.45F, 3.9128F, -1.0175F, 0.0262F, 0.0873F, 0.0698F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(84, 45).addBox(-1.0387F, 0.469F, -0.9882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, -1.2049F, 0.2592F, 0.073F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(82, 22).addBox(-1.0521F, -1.3045F, -1.4131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, -0.7641F, 0.2614F, 0.0284F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(92, 62).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(43, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2353F, 2.6821F, 0.5913F, 3.0194F, 0.0873F, 0.0698F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(92, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1253F, 3.4193F, -0.0753F, -2.3038F, 0.0873F, 0.0698F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(92, 65).addBox(-1.0521F, -2.5966F, -0.769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, 1.6357F, 0.2614F, 0.0284F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(65, 92).addBox(-1.0521F, -0.3014F, -1.6287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, 0.1085F, 0.2614F, 0.0284F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(73, 88).addBox(-1.0521F, -0.2119F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, -1.2005F, 0.2614F, 0.0284F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(74, 84).addBox(-1.0727F, -0.4025F, 0.0085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1444F, 3.051F, -3.0998F, -1.6732F, 0.1978F, 0.0718F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(81, 95).addBox(-0.7503F, 0.0119F, -0.565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(95, 68).addBox(-0.7503F, 0.0119F, -0.765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7444F, 3.051F, -5.5998F, -1.2637F, -0.0049F, 0.2542F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(63, 95).addBox(-1.2136F, 0.3532F, -0.7346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 94).addBox(-1.2136F, -0.2468F, -0.7346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1444F, 3.051F, -3.0998F, -1.4272F, 0.1726F, 0.1058F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(84, 59).addBox(-0.8427F, 0.5905F, -1.6995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.6694F, 3.051F, -0.4998F, -1.1684F, 0.338F, 0.109F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(21, 72).addBox(-1.0727F, -1.0255F, -0.3577F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1444F, 3.051F, -3.0998F, -1.4376F, 0.1978F, 0.0718F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(12, 82).addBox(-0.95F, -4.221F, -1.7951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 3.9128F, -1.1425F, -0.6632F, 0.0873F, 0.0698F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(61, 88).addBox(-0.95F, -3.1707F, 1.0809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.45F, 3.9128F, -1.1425F, 0.2531F, 0.0873F, 0.0698F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 8).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4305F, 0.7086F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(12, 62).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.0186F, 1.919F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(26, 62).addBox(-0.5F, -0.9402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.781F, 1.8269F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(62, 29).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3079F, 0.1248F, -0.0396F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5F, -0.0402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1787F, -0.2148F, 0.0385F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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