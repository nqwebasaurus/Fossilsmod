package fossils.fossils.client.blockentity.model.tyrannosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TyrannosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart tail1;
	private final ModelPart bone;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public TyrannosaurusFossilModel(ModelPart root) {
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
		this.tail1 = this.hips.getChild("tail1");
		this.bone = this.tail1.getChild("bone");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -46.3771F, -2.6002F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 48).addBox(0.0F, -2.9F, -4.7F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3724F, 1.8478F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 126).mirror().addBox(2.1227F, 16.5285F, -13.9217F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 0.3556F, -0.0085F, -0.0183F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(128, 17).mirror().addBox(2.1227F, 20.199F, -6.5006F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 0.0065F, -0.0085F, -0.0183F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 124).mirror().addBox(2.1062F, 4.7731F, -18.984F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 1.1235F, -0.0085F, -0.0183F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(150, 78).mirror().addBox(2.1062F, -18.3278F, -7.2283F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 3.0783F, -0.0085F, -0.0183F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 94).mirror().addBox(2.1062F, 17.1686F, -9.0757F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 0.4079F, -0.0085F, -0.0183F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(160, 148).mirror().addBox(1.3746F, 11.1498F, 3.1506F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, -0.3261F, -0.0185F, -0.0686F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 161).mirror().addBox(1.3746F, 11.988F, 0.2644F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, -0.0818F, -0.0185F, -0.0686F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(166, 63).mirror().addBox(0.8891F, 7.9309F, 1.5366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9419F, 10.0684F, 8.4894F, 0.9283F, 0.0137F, -0.0208F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 171).mirror().addBox(0.1834F, -0.7538F, -0.1683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(59, 151).mirror().addBox(0.1834F, -0.7538F, 0.5317F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9419F, 10.0684F, 8.4894F, 1.0479F, 0.0835F, -0.0732F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 145).mirror().addBox(-0.5F, -2.8193F, -3.6277F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6455F, -2.5971F, -6.3375F, 0.9288F, 0.4913F, 0.177F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 147).mirror().addBox(-0.5F, -2.1317F, -0.2907F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6455F, -2.5971F, -6.3375F, 0.0349F, 0.384F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 109).mirror().addBox(-0.4365F, -0.3389F, -7.9325F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -7.7688F, 2.8532F, -0.0125F, 0.0321F, 0.4016F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(152, 107).mirror().addBox(-0.536F, 0.2652F, -5.6244F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5419F, 5.0684F, 4.1894F, 1.4661F, 0.2793F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(152, 117).mirror().addBox(-0.536F, 2.4304F, -0.0078F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5419F, 5.0684F, 4.1894F, 0.3752F, 0.2793F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(106, 131).mirror().addBox(-0.536F, -1.7947F, -2.9954F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5419F, 5.0684F, 4.1894F, 0.6894F, 0.2793F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(44, 95).mirror().addBox(-2.6639F, -4.5105F, -7.8265F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 6.8312F, 4.5532F, 0.1658F, 0.0349F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(165, 128).mirror().addBox(0.1834F, -0.8121F, -0.872F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9419F, 10.0684F, 8.4894F, 1.3621F, 0.0835F, -0.0732F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 152).mirror().addBox(-5.7962F, -9.0239F, 5.5119F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 8.9312F, 1.5532F, 0.2519F, -0.0643F, 0.4023F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(154, 26).mirror().addBox(-2.7687F, -1.9649F, -0.5825F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1312F, 7.9532F, 0.6359F, -0.0643F, 0.4023F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(119, 134).mirror().addBox(-0.5F, -1.0F, -2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3328F, -2.4082F, 11.1212F, 0.2345F, -0.0643F, 0.4023F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(134, 134).mirror().addBox(-0.5F, -1.8F, -1.9F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4679F, -4.4049F, 10.9024F, -0.3116F, 0.0391F, 0.4053F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(126, 122).mirror().addBox(-0.5F, -1.7F, -2.5F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1057F, -5.6967F, -7.3777F, 0.5223F, 0.3037F, 0.4681F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(92, 159).mirror().addBox(-0.2315F, 2.4771F, 1.6185F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, -0.3008F, 0.0852F, -0.2229F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(108, 154).mirror().addBox(0.1229F, 6.3616F, -0.0962F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, -0.044F, 0.0665F, -0.1738F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 110).mirror().addBox(-0.2315F, -0.4866F, -2.7586F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1925F, 3.792F, -2.9221F, 0.3712F, 0.0852F, -0.2229F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(11, 154).mirror().addBox(-2.9256F, -0.4864F, -0.4526F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7688F, -2.9468F, -0.3925F, 0.0336F, 0.0096F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(132, 151).mirror().addBox(-2.8F, -3.5569F, -1.7947F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 6.8312F, 0.6532F, -0.5672F, 0.0349F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-3.1F, -11.0866F, -4.9717F, 1.0F, 11.0F, 9.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 6.8312F, 0.6532F, -0.1484F, 0.0047F, 0.0928F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(109, 24).mirror().addBox(-0.4173F, -0.2069F, -0.5175F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -7.7688F, 3.4532F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-3.0F, -1.4822F, 1.8974F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 124).addBox(1.0F, -1.4822F, 1.8974F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(35, 75).addBox(-1.0F, -1.9822F, -0.6026F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(99, 152).addBox(4.7962F, -9.0239F, 5.5119F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 8.9312F, 1.5532F, 0.2519F, 0.0643F, -0.4023F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(154, 26).addBox(1.7687F, -1.9649F, -0.5825F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4F, 0.1312F, 7.9532F, 0.6359F, 0.0643F, -0.4023F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(119, 134).addBox(-0.5F, -1.0F, -2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3328F, -2.4082F, 11.1212F, 0.2345F, 0.0643F, -0.4023F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(134, 134).addBox(-0.5F, -1.8F, -1.9F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4679F, -4.4049F, 10.9024F, -0.3116F, -0.0391F, -0.4053F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(126, 122).addBox(-0.5F, -1.7F, -2.5F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1057F, -5.6967F, -7.3777F, 0.5223F, -0.3037F, -0.4681F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(92, 159).addBox(-0.7685F, 2.4771F, 1.6185F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, -0.3008F, -0.0852F, 0.2229F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(150, 78).addBox(-3.1062F, -18.3278F, -7.2283F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 3.0783F, 0.0085F, 0.0183F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(128, 17).addBox(-3.1227F, 20.199F, -6.5006F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 0.0065F, 0.0085F, 0.0183F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(141, 126).addBox(-3.1227F, 16.5285F, -13.9217F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 0.3556F, 0.0085F, 0.0183F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(93, 124).addBox(-3.1062F, 4.7731F, -18.984F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 1.1235F, 0.0085F, 0.0183F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(91, 94).addBox(-3.1062F, 17.1686F, -9.0757F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 0.4079F, 0.0085F, 0.0183F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(74, 161).addBox(-2.3746F, 11.988F, 0.2644F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, -0.0818F, 0.0185F, 0.0686F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(160, 148).addBox(-2.3746F, 11.1498F, 3.1506F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, -0.3261F, 0.0185F, 0.0686F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(166, 63).addBox(-1.8891F, 7.9309F, 1.5366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9419F, 10.0684F, 8.4894F, 0.9283F, -0.0137F, 0.0208F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(165, 128).addBox(-1.1834F, -0.8121F, -0.872F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9419F, 10.0684F, 8.4894F, 1.3621F, -0.0835F, 0.0732F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 171).addBox(-1.1834F, -0.7538F, -0.1683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(59, 151).addBox(-1.1834F, -0.7538F, 0.5317F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9419F, 10.0684F, 8.4894F, 1.0479F, -0.0835F, 0.0732F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(108, 154).addBox(-1.1229F, 6.3616F, -0.0962F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, -0.044F, -0.0665F, 0.1738F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(57, 110).addBox(-0.7685F, -0.4866F, -2.7586F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1925F, 3.792F, -2.9221F, 0.3712F, -0.0852F, 0.2229F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(11, 154).addBox(1.9256F, -0.4864F, -0.4526F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.7688F, -2.9468F, -0.3925F, -0.0336F, -0.0096F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(132, 151).addBox(1.8F, -3.5569F, -1.7947F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 6.8312F, 0.6532F, -0.5672F, -0.0349F, 0.0F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(152, 107).addBox(-0.464F, 0.2652F, -5.6244F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5419F, 5.0684F, 4.1894F, 1.4661F, -0.2793F, 0.0F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(152, 117).addBox(-0.464F, 2.4304F, -0.0078F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5419F, 5.0684F, 4.1894F, 0.3752F, -0.2793F, 0.0F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(106, 131).addBox(-0.464F, -1.7947F, -2.9954F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5419F, 5.0684F, 4.1894F, 0.6894F, -0.2793F, 0.0F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(44, 95).addBox(1.6639F, -4.5105F, -7.8265F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 6.8312F, 4.5532F, 0.1658F, -0.0349F, 0.0F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 145).addBox(-0.5F, -2.8193F, -3.6277F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6455F, -2.5971F, -6.3375F, 0.9288F, -0.4913F, -0.177F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 147).addBox(-0.5F, -2.1317F, -0.2907F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6455F, -2.5971F, -6.3375F, 0.0349F, -0.384F, 0.0F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 92).addBox(2.1F, -11.0866F, -4.9717F, 1.0F, 11.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 6.8312F, 0.6532F, -0.1484F, -0.0047F, -0.0928F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 109).addBox(-0.5635F, -0.3389F, -7.9325F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -7.7688F, 2.8532F, -0.0125F, -0.0321F, -0.4016F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(109, 24).addBox(-0.5827F, -0.2069F, -0.5175F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -7.7688F, 3.4532F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 113).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 3.6158F, 2.2847F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(109, 38).addBox(-2.5F, -2.5F, -2.2F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.9323F, 1.1981F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 143).addBox(-5.5F, 0.0009F, 0.0995F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.0F, 13.8F, -2.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 135).addBox(-5.5F, -0.3F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 8.1F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(165, 19).addBox(-5.0F, -0.1038F, -0.9394F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 6.0F, 2.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 151).addBox(-5.0F, -0.9F, -2.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 132).addBox(-5.5F, -6.3F, 0.1F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.9F, -1.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftLeg1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(13, 135).addBox(-5.5F, -6.0F, -0.1F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 7.9F, -1.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.9038F, 2.7796F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 145).addBox(-3.5F, -0.0005F, 0.0867F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 1.2472F, -3.1117F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(135, 74).addBox(-3.5F, 0.0073F, -3.9549F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8F, 2.5472F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(107, 122).addBox(-3.5F, -2.707F, -2.7331F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(135, 82).addBox(-1.5F, -2.2F, -2.2F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2F, 18.8686F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(147, 134).addBox(-3.5F, 0.0749F, -1.9599F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 12.6472F, 0.7883F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 147).addBox(-3.5F, 0.0749F, -1.9599F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 12.6472F, 0.7883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 134).addBox(-3.5F, -5.0F, -0.4F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(156, 37).addBox(-2.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(138, 158).addBox(-2.5F, 0.1411F, -1.0338F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 11.5472F, 0.1883F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 154).addBox(-2.5F, -8.8589F, -1.0338F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(40, 110).addBox(-2.5F, -0.4447F, -1.4239F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 19.8568F, -2.4858F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(101, 48).addBox(-4.0F, -1.0746F, -2.9368F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.9803F, -0.8129F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(76, 24).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5746F, -2.9368F, -0.3453F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(114, 89).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 3.6158F, 2.2847F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(116, 106).addBox(-2.5F, -2.5F, -2.2F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.9323F, 1.1981F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(143, 54).addBox(2.5F, 0.0009F, 0.0995F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-4.0F, 13.8F, -2.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(88, 135).addBox(2.5F, -0.3F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 8.1F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 165).addBox(3.0F, -0.1038F, -0.9394F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 6.0F, 2.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 151).addBox(3.0F, -0.9F, -2.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.1F, 1.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 133).addBox(2.5F, -6.3F, 0.1F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 7.9F, -1.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 135).addBox(2.5F, -6.0F, -0.1F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.0F, 7.9F, -1.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.9038F, 2.7796F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(145, 37).addBox(0.5F, -0.0005F, 0.0867F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 1.2472F, -3.1117F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(137, 106).addBox(0.5F, 0.0073F, -3.9549F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8F, 2.5472F, 2.7883F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 123).addBox(0.5F, -2.707F, -2.7331F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.5472F, -0.5117F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(135, 90).addBox(-1.5F, -2.2F, -2.2F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, 18.8686F, -1.7911F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(150, 70).addBox(0.5F, 0.0749F, -1.9599F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, 12.6472F, 0.7883F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(147, 142).addBox(0.5F, 0.0749F, -1.9599F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, 12.6472F, 0.7883F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(77, 134).addBox(0.5F, -5.0F, -0.4F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8F, 7.6472F, -0.5117F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(156, 54).addBox(1.5F, -2.6498F, -1.9321F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 3.3472F, 0.9883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(87, 159).addBox(1.5F, 0.1411F, -1.0338F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 11.5472F, 0.1883F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(41, 154).addBox(1.5F, -8.8589F, -1.0338F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.0F, 11.5472F, 0.1883F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(111, 8).addBox(-2.5F, -0.4447F, -1.4239F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 19.8568F, -2.4858F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(101, 56).addBox(-4.0F, -1.0746F, -2.9368F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.9803F, -0.8129F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(76, 36).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5746F, -2.9368F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 8.6F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r95 = tail1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(31, 76).addBox(0.5F, 9.7871F, 9.4246F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 163).addBox(0.5F, 8.4871F, 7.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(163, 92).addBox(0.5F, 6.8871F, 5.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 162).addBox(0.5F, 4.9871F, 3.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 163).addBox(0.5F, 2.9871F, 1.4246F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(170, 128).addBox(0.5F, 0.7871F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 2.0709F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 161).addBox(0.5F, -5.2823F, 11.7838F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 161).addBox(0.5F, -5.3823F, 8.7838F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(99, 160).addBox(0.5F, -5.5823F, 5.7838F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(159, 155).addBox(0.5F, -5.3823F, 2.7838F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(161, 70).addBox(0.5F, -5.4823F, -0.2162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9438F, 1.0709F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(173, 4).mirror().addBox(-3.2593F, -0.1587F, 5.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(173, 2).mirror().addBox(-2.6953F, 0.0F, 3.0567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(173, 0).mirror().addBox(-2.0F, 0.0F, 0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2505F, 7.3501F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r98 = tail1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(173, 75).mirror().addBox(-1.3167F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 173).mirror().addBox(-1.9F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.1562F, 5.0709F, 0.1608F, 0.2154F, 0.0347F));

		PartDefinition cube_r99 = tail1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(173, 4).addBox(1.2593F, -0.1587F, 5.912F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(173, 2).addBox(0.6953F, 0.0F, 3.0567F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(173, 0).addBox(0.0F, 0.0F, 0.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2505F, 7.3501F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r100 = tail1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(173, 75).addBox(-0.6833F, -1.3609F, -2.9818F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 173).addBox(-0.1F, -1.5257F, -0.3508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1562F, 5.0709F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r101 = tail1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(39, 16).addBox(-0.5F, -1.9F, 0.1F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.1562F, 0.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0925F, 7.6858F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(163, 8).addBox(0.0F, -5.2878F, -0.1018F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 163).addBox(0.0F, -4.9878F, 2.8982F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 163).addBox(0.0F, -4.8878F, 5.8982F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(101, 135).addBox(0.0F, -4.5878F, 8.8982F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(115, 163).addBox(0.0F, -4.4878F, 11.8982F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 164).addBox(0.0F, -4.3878F, 14.8982F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7119F, 15.7733F, 0.1329F, -0.173F, -0.023F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(104, 160).addBox(0.5F, -0.6874F, 0.9249F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4805F, 14.5914F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(55, 158).addBox(0.5F, -0.4668F, -0.1421F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4805F, 12.4914F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 95).addBox(0.5F, 0.345F, -0.1749F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4805F, 7.7914F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 57).addBox(0.5F, 0.3524F, -0.1196F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4805F, 2.4914F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(12, 175).mirror().addBox(-0.6F, -3.0576F, 9.9963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 175).mirror().addBox(-0.6F, -2.552F, 7.3365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 175).mirror().addBox(-0.5F, -2.3241F, 4.327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 174).mirror().addBox(-0.5F, -1.9738F, 1.5468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 87).mirror().addBox(-0.6F, -1.2906F, -1.3423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4128F, 1.7416F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(12, 175).addBox(0.6F, -3.0576F, 9.9963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 175).addBox(0.6F, -2.552F, 7.3365F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 175).addBox(0.5F, -2.3241F, 4.327F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 174).addBox(0.5F, -1.9738F, 1.5468F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 87).addBox(0.6F, -1.2906F, -1.3423F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4128F, 1.7416F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.9F, -1.0F, 2.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3933F, 0.9298F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(81, 164).addBox(0.0F, -4.5219F, 0.7993F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(157, 164).addBox(0.0F, -4.6219F, 3.7993F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(138, 167).addBox(0.0F, -4.4219F, 9.7993F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(150, 167).addBox(0.0F, -4.4219F, 12.7993F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(164, 160).addBox(0.0F, -4.5219F, 6.7993F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1933F, 17.0298F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 168).addBox(0.0F, -0.1672F, -0.7912F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2196F, 14.1977F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 125).addBox(0.5F, 3.8126F, 12.2249F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(166, 79).addBox(0.5F, 2.8126F, 9.3249F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 165).addBox(0.5F, 2.3126F, 6.9249F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 163).addBox(0.5F, 0.9126F, 3.9249F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2873F, -2.4384F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 0.1F, 0.2F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.059F, -0.4024F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.109F, 14.6976F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition cube_r112 = tail4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(50, 174).addBox(0.0F, 1.7F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 174).addBox(0.0F, 1.0F, 8.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(172, 163).addBox(0.0F, 0.1F, 5.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 170).addBox(0.0F, -1.8F, 2.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(169, 160).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1304F, 2.2434F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(168, 6).addBox(0.0F, -2.6405F, 8.9075F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(168, 0).addBox(0.0F, -2.4405F, 5.9075F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(167, 167).addBox(0.0F, -2.3405F, 2.9075F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(162, 167).addBox(0.0F, -2.3405F, -0.0925F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5459F, 4.0329F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(110, 163).addBox(0.0F, -2.4756F, 0.1004F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.8329F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(39, 56).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6459F, 0.1329F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(39, 37).addBox(-0.5F, -0.4948F, -0.2213F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.005F))
				.texOffs(168, 12).addBox(0.0F, -2.9948F, -0.2213F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 168).addBox(0.0F, -2.9948F, 2.7787F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5041F, 15.9329F, -0.0447F, 0.218F, -0.0097F));

		PartDefinition cube_r116 = tail5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(174, 145).addBox(0.0F, -2.1F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 174).addBox(0.0F, -2.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 141).addBox(0.0F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 137).addBox(0.0F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 46).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4948F, 7.7787F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(44, 174).addBox(0.0F, -2.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4948F, 5.8787F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(9, 175).addBox(0.0F, 6.7F, 26.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 175).addBox(0.0F, 5.6F, 23.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 175).addBox(0.0F, 4.9F, 20.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 175).addBox(0.0F, 4.1F, 17.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 149).addBox(0.0F, 3.2F, 14.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6264F, -13.6895F, 0.3403F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5016F, 16.8368F, -0.1162F, 0.2167F, -0.0251F));

		PartDefinition cube_r119 = tail6.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(64, 175).addBox(0.0F, -0.9F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 175).addBox(0.0F, -0.9F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(175, 33).addBox(0.0F, -0.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(175, 30).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 175).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 131).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail6.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(175, 97).addBox(0.0F, 8.5062F, 24.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 175).addBox(0.0F, 7.9062F, 22.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 175).addBox(0.0F, 7.2062F, 20.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 175).addBox(0.0F, 6.5062F, 18.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 175).addBox(0.0F, 5.9062F, 16.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 122).addBox(0.0F, 5.4062F, 14.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 10).addBox(0.0F, 4.7062F, 12.2585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2694F, -13.3115F, 0.3578F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.1614F, -0.0016F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1599F, 13.9833F, -0.2376F, 0.1273F, -0.0307F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(68, 75).addBox(-1.0F, -1.669F, -19.9704F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.0F, 0.131F, -0.0433F, -0.0057F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 163).addBox(-0.5F, -4.6F, 6.9F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(163, 0).addBox(-0.5F, -4.4F, 3.9F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 163).addBox(-0.5F, -4.2F, 0.9F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(97, 74).addBox(-1.5F, 0.0F, -0.1F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -7.8704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 13).addBox(-6.5F, -4.9707F, 0.5236F, 12.0F, 5.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 23.731F, -9.7704F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(115, 154).addBox(0.0F, -4.8913F, -0.1481F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.669F, -18.8704F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(120, 162).addBox(0.0F, -4.5674F, 0.0389F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -9.9704F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(58, 162).addBox(0.0F, -4.6459F, 0.0379F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -12.9704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(161, 79).addBox(0.0F, -4.7843F, -0.7625F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.769F, -15.1704F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(154, 17).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.0942F, -0.4249F, -1.3971F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(173, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.413F, -0.1555F, -0.3647F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(173, 58).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.469F, -4.2704F, -0.321F, -0.2982F, -0.7754F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(173, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.2364F, -0.0606F, -0.2903F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(172, 42).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.1897F, -0.1543F, -0.7192F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(152, 115).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -7.0704F, -0.0705F, -0.2337F, -1.319F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(79, 173).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.1878F, -0.0391F, -0.2585F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(173, 77).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.1542F, -0.1145F, -0.6896F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(141, 35).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -9.0704F, -0.0637F, -0.1811F, -1.2861F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(173, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.1202F, -0.0221F, -0.2256F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(172, 40).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.0997F, -0.0707F, -0.6597F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -11.2704F, -0.0431F, -0.1143F, -1.2542F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-14.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.0131F, -0.0324F, -1.239F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(172, 22).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.029F, -0.0195F, -0.6455F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(173, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -13.4704F, -0.0345F, -0.0055F, -0.2093F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(171, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0516F, 0.0091F, -0.1743F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(171, 67).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0429F, 0.03F, -0.6102F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 2).mirror().addBox(-18.6882F, -2.8327F, -0.5F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -15.9704F, 0.0188F, 0.0489F, -1.2038F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-21.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.044F, 0.114F, -1.2018F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(171, 157).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.1002F, 0.07F, -0.6074F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(7, 173).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.669F, -18.4704F, 0.1203F, 0.0212F, -0.1733F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(154, 17).addBox(2.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.0942F, 0.4249F, 1.3971F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(173, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.413F, 0.1555F, 0.3647F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(173, 58).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.469F, -4.2704F, -0.321F, 0.2982F, 0.7754F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(173, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.2364F, 0.0606F, 0.2903F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(172, 42).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.1897F, 0.1543F, 0.7192F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(152, 115).addBox(2.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -7.0704F, -0.0705F, 0.2337F, 1.319F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(79, 173).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.1878F, 0.0391F, 0.2585F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(173, 77).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.1542F, 0.1145F, 0.6896F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(141, 35).addBox(2.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -9.0704F, -0.0637F, 0.1811F, 1.2861F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(173, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.1202F, 0.0221F, 0.2256F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(172, 40).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.0997F, 0.0707F, 0.6597F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(123, 0).addBox(2.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -11.2704F, -0.0431F, 0.1143F, 1.2542F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(82, 8).addBox(2.6882F, -2.8327F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.0131F, 0.0324F, 1.239F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(172, 22).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.029F, 0.0195F, 0.6455F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(173, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -13.4704F, -0.0345F, 0.0055F, 0.2093F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(171, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0516F, -0.0091F, 0.1743F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(171, 67).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0429F, -0.03F, 0.6102F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(82, 2).addBox(2.6882F, -2.8327F, -0.5F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -15.9704F, 0.0188F, -0.0489F, 1.2038F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 70).addBox(2.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.044F, -0.114F, 1.2018F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(171, 157).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.1002F, -0.07F, 0.6074F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(7, 173).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.669F, -18.4704F, 0.1203F, -0.0212F, 0.1733F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -4.1F, -0.1F, 12.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 22.431F, -19.8704F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.069F, -19.8704F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(143, 10).mirror().addBox(-0.9484F, -0.2255F, -4.0556F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1913F, 11.0422F, -11.9126F, 0.3825F, -0.9752F, -0.5835F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(158, 131).mirror().addBox(-0.9484F, -1.9527F, -6.207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1913F, 11.0422F, -11.9126F, 1.0108F, -0.9752F, -0.5835F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(129, 158).mirror().addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.0616F, 1.5763F, -4.4336F, 0.927F, 0.0409F, 0.0964F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(172, 169).mirror().addBox(-0.3848F, -1.9801F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.0208F, 0.8506F, -2.3307F, 1.119F, 0.0409F, 0.0964F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(174, 51).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.0208F, 1.7506F, -3.0307F, -0.0678F, 0.0409F, 0.0964F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(0.4457F, 0.4371F, -4.6512F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 0.831F, -3.4512F, 0.6652F, 0.0409F, 0.0964F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(128, 26).mirror().addBox(-0.9484F, -1.1317F, -5.051F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1913F, 11.0422F, -11.9126F, 0.0509F, -0.9752F, -0.5835F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(87, 153).mirror().addBox(-0.1F, -0.4436F, -4.0786F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 7.831F, -11.2512F, 0.9076F, -0.6632F, 0.0F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(130, 116).mirror().addBox(-0.1F, -0.4737F, -4.1516F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 7.831F, -11.2512F, 1.0647F, -0.6632F, 0.0F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(126, 54).mirror().addBox(-0.0886F, -0.0778F, 0.0285F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 7.931F, -11.7512F, 0.6633F, 0.0039F, 0.017F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(121, 143).mirror().addBox(0.4693F, -0.3099F, -4.7418F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.9F, 0.331F, -4.0512F, 0.9705F, 0.0366F, 0.0981F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(173, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.2917F, 0.055F, -0.2017F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(172, 56).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.2429F, 0.172F, -0.6251F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(130, 46).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -10.5F, 0.105F, 0.278F, -1.2249F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(173, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.2408F, 0.042F, -0.1694F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(172, 54).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.2015F, 0.1392F, -0.5968F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-17.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -8.2F, 0.0891F, 0.2278F, -1.1941F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(173, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.1719F, 0.0302F, -0.1719F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(173, 87).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.1434F, 0.0998F, -0.6037F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-21.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -5.8F, 0.0631F, 0.1628F, -1.1991F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(171, 155).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.1031F, 0.0182F, -0.1736F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(155, 171).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0859F, 0.06F, -0.6083F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-21.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -3.3F, 0.0376F, 0.0977F, -1.2024F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-21.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.0125F, 0.0326F, -1.2041F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(172, 44).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.0286F, 0.02F, -0.6106F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(173, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2F, -0.6F, 0.0344F, 0.0061F, -0.1744F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(139, 98).mirror().addBox(-1.387F, -0.5F, -2.1883F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4872F, 15.1889F, -13.7644F, -1.0316F, -0.2612F, 0.4074F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-10.2F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 17.2479F, -11.4906F, -0.7493F, 0.7861F, 0.2237F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(47, 13).mirror().addBox(-11.6085F, -0.0315F, -0.275F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 17.7479F, -10.8906F, -0.4953F, 0.7581F, -0.1182F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-12.9085F, -0.0315F, -0.275F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 17.7479F, -10.8906F, -0.171F, 0.8412F, -0.1852F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(172, 169).addBox(-0.6152F, -1.9801F, -0.9964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.0208F, 0.8506F, -2.3307F, 1.119F, -0.0409F, -0.0964F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(174, 51).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.0208F, 1.7506F, -3.0307F, -0.0678F, -0.0409F, -0.0964F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(129, 158).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.0616F, 1.5763F, -4.4336F, 0.927F, -0.0409F, -0.0964F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 144).addBox(-1.4457F, 0.4371F, -4.6512F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9F, 0.831F, -3.4512F, 0.6652F, -0.0409F, -0.0964F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(143, 10).addBox(-0.0516F, -0.2255F, -4.0556F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.1913F, 11.0422F, -11.9126F, 0.3825F, 0.9752F, 0.5835F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(158, 131).addBox(-0.0516F, -1.9527F, -6.207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1913F, 11.0422F, -11.9126F, 1.0108F, 0.9752F, 0.5835F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(128, 26).addBox(-0.0516F, -1.1317F, -5.051F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1913F, 11.0422F, -11.9126F, 0.0509F, 0.9752F, 0.5835F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 153).addBox(-0.9F, -0.4436F, -4.0786F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 7.831F, -11.2512F, 0.9076F, 0.6632F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(130, 116).addBox(-0.9F, -0.4737F, -4.1516F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 7.831F, -11.2512F, 1.0647F, 0.6632F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(126, 54).addBox(-0.9114F, -0.0778F, 0.0285F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 7.931F, -11.7512F, 0.6633F, -0.0039F, -0.017F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(121, 143).addBox(-1.4693F, -0.3099F, -4.7418F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9F, 0.331F, -4.0512F, 0.9705F, -0.0366F, -0.0981F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(47, 0).addBox(-4.0F, -2.901F, -8.9449F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 23.0F, -3.0F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(101, 142).addBox(-1.0F, -2.2141F, -0.0945F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(161, 107).addBox(0.0F, -4.6775F, -0.1399F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(35, 68).addBox(0.0F, -4.6543F, 5.3502F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -9.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(173, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.2917F, -0.055F, 0.2017F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(172, 56).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.2429F, -0.172F, 0.6251F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(130, 46).addBox(2.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -10.5F, 0.105F, -0.278F, 1.2249F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(173, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.2408F, -0.042F, 0.1694F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(172, 54).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.2015F, -0.1392F, 0.5968F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 4).addBox(2.6882F, -2.8327F, -0.5F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -8.2F, 0.0891F, -0.2278F, 1.1941F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(173, 89).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.1719F, -0.0302F, 0.1719F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(173, 87).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.1434F, -0.0998F, 0.6037F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 0).addBox(2.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -5.8F, 0.0631F, -0.1628F, 1.1991F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(171, 155).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.1031F, -0.0182F, 0.1736F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(155, 171).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0859F, -0.06F, 0.6083F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 68).addBox(2.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -3.3F, 0.0376F, -0.0977F, 1.2024F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(76, 72).addBox(2.6882F, -2.8327F, -0.5F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.0125F, -0.0326F, 1.2041F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(172, 44).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.0286F, -0.02F, 0.6106F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(173, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2F, -0.6F, 0.0344F, -0.0061F, 0.1744F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(170, 121).addBox(0.0F, -4.513F, 0.0539F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -6.4F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(170, 24).addBox(0.0F, -4.2333F, -0.0492F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -8.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(120, 170).addBox(0.0F, -4.3326F, 0.0307F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -11.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(139, 98).addBox(-0.613F, -0.5F, -2.1883F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4872F, 15.1889F, -13.7644F, -1.0316F, 0.2612F, -0.4074F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(82, 10).addBox(-0.8F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.2479F, -11.4906F, -0.7493F, -0.7861F, -0.2237F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(47, 13).addBox(-1.3915F, -0.0315F, -0.275F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.7479F, -10.8906F, -0.4953F, -0.7581F, 0.1182F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(82, 6).addBox(-2.0915F, -0.0315F, -0.275F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.7479F, -10.8906F, -0.171F, -0.8412F, 0.1852F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(97, 89).addBox(-3.4872F, -0.7946F, -0.4052F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 16.9889F, -12.6644F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(147, 48).addBox(-1.4872F, -0.5F, -2.0978F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 15.1889F, -13.7644F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(68, 94).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -12.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0147F, 13.3333F, -12.7115F, 0.9361F, 0.5526F, -0.2115F));

		PartDefinition cube_r240 = leftArm1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(173, 26).addBox(-1.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.2018F, -0.7676F, 0.1498F));

		PartDefinition cube_r241 = leftArm1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(123, 171).addBox(-1.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8847F, 0.8893F, 0.5713F, -0.6678F, 0.2037F));

		PartDefinition cube_r242 = leftArm1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(168, 87).addBox(6.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r243 = leftArm1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(169, 92).addBox(6.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(143, 168).addBox(-0.8F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(168, 115).addBox(-0.8F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 5.1325F, 0.8904F, -1.543F, -0.4375F, 0.0278F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r244 = leftHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(50, 168).addBox(0.0F, -2.5F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(92, 166).addBox(0.0F, -2.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0147F, 13.3333F, -12.7115F, -0.3752F, -0.2618F, 0.0F));

		PartDefinition cube_r246 = rightArm1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(28, 173).addBox(0.0126F, -2.1148F, -0.0627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.2018F, 0.7676F, -0.1498F));

		PartDefinition cube_r247 = rightArm1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(172, 36).addBox(0.0F, -1.9618F, -0.1285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8847F, 0.8893F, 0.5713F, 0.6678F, -0.2037F));

		PartDefinition cube_r248 = rightArm1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(169, 79).addBox(-7.0F, -1.2842F, 0.0838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r249 = rightArm1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(97, 169).addBox(-7.0F, 0.7F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.5F, 0.8847F, -0.8107F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(23, 169).addBox(-0.2F, -0.2307F, -0.4734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 168).addBox(-0.2F, -0.2307F, -1.5734F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 5.1325F, 0.8904F, -0.9732F, 0.2849F, -0.3917F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.8693F, 0.2266F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r250 = rightHand.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(86, 168).addBox(-1.0F, -2.5F, 0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightHand.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(74, 168).addBox(-1.0F, -2.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8219F, -11.4055F, -0.6791F, 0.1839F, 0.0187F));

		PartDefinition cube_r252 = neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(38, 170).addBox(0.0F, -4.2954F, 0.0418F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0932F, -2.4134F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(35, 170).addBox(0.0F, -3.9489F, -0.1171F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7415F, -4.652F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(128, 7).addBox(-1.0F, -2.0F, 1.1F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7415F, -5.052F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(79, 171).mirror().addBox(-1.9601F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 1.0104F, 0.6964F, -0.6294F));

		PartDefinition cube_r256 = neck1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(21, 92).mirror().addBox(-6.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.451F, -3.8399F, 0.6621F, 1.0274F, -1.0789F));

		PartDefinition cube_r257 = neck1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(101, 64).mirror().addBox(-9.7157F, -2.8222F, -0.3799F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0474F, -1.8213F, 0.1174F, 1.1253F, -1.4379F));

		PartDefinition cube_r258 = neck1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(171, 69).mirror().addBox(-2.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0474F, -1.8213F, 1.0793F, 0.4351F, -0.2189F));

		PartDefinition cube_r259 = neck1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(171, 65).mirror().addBox(-3.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0474F, -1.8213F, 0.9064F, 0.8037F, -0.5104F));

		PartDefinition cube_r260 = neck1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 171).addBox(-0.0399F, -0.0556F, -0.5554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 1.0104F, -0.6964F, 0.6294F));

		PartDefinition cube_r261 = neck1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(21, 92).addBox(1.7529F, -0.8788F, -0.5554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.451F, -3.8399F, 0.6621F, -1.0274F, 1.0789F));

		PartDefinition cube_r262 = neck1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(101, 64).addBox(2.7157F, -2.8222F, -0.3799F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0474F, -1.8213F, 0.1174F, -1.1253F, 1.4379F));

		PartDefinition cube_r263 = neck1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(171, 69).addBox(0.0051F, 0.029F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0474F, -1.8213F, 1.0793F, -0.4351F, 0.2189F));

		PartDefinition cube_r264 = neck1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(171, 65).addBox(1.8295F, -0.8211F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0474F, -1.8213F, 0.9064F, -0.8037F, 0.5104F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5771F, -4.5361F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(19, 172).addBox(0.0F, -3.2575F, 0.0116F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2088F, -2.282F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r266 = neck2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(58, 170).addBox(0.0F, -3.8679F, -0.0407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5183F, -4.2832F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(152, 105).mirror().addBox(-7.8057F, -0.8639F, -0.554F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.0806F, 0.1666F, 0.9212F, -1.2847F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(13, 133).mirror().addBox(-2.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6417F, -6.0806F, 0.6218F, 0.7468F, -0.6808F));

		PartDefinition cube_r269 = neck2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(28, 171).mirror().addBox(-1.9767F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0343F, -4.1954F, 0.679F, 0.779F, -0.6413F));

		PartDefinition cube_r270 = neck2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-7.7687F, -0.8843F, -0.3345F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0343F, -4.1954F, 0.1928F, 0.9712F, -1.2635F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 66).mirror().addBox(-7.6888F, -0.8865F, -0.5178F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.7753F, 0.2024F, 0.9879F, -1.2555F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(171, 71).mirror().addBox(-1.9053F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1018F, -1.7753F, 0.6988F, 0.7893F, -0.6272F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(152, 105).addBox(1.8057F, -0.8639F, -0.554F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.0806F, 0.1666F, -0.9212F, 1.2847F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(13, 133).addBox(0.0016F, -0.0199F, -0.554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6417F, -6.0806F, 0.6218F, -0.7468F, 0.6808F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(28, 171).addBox(-0.0233F, -0.0539F, -0.3345F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0343F, -4.1954F, 0.679F, -0.779F, 0.6413F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(146, 0).addBox(1.7687F, -0.8843F, -0.3345F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0343F, -4.1954F, 0.1928F, -0.9712F, 1.2635F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(101, 66).addBox(1.6888F, -0.8865F, -0.5178F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.7753F, 0.2024F, -0.9879F, 1.2555F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(171, 71).addBox(-0.0947F, -0.0897F, -0.5178F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1018F, -1.7753F, 0.6988F, -0.7893F, 0.6272F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(48, 145).addBox(0.0F, -4.0217F, 0.0062F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -6.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 95).addBox(-1.0F, -0.1F, -1.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -6.3F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8572F, -7.4387F, 0.5918F, -0.1453F, -0.097F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(166, 92).addBox(0.5F, -5.2939F, -0.0114F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0315F, -3.9346F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(82, 155).addBox(0.5F, -5.4207F, -0.3013F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7315F, -6.7346F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(130, 37).addBox(-0.5F, -0.1185F, -4.9683F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1315F, -2.0346F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 171).mirror().addBox(-1.9618F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9373F, -5.331F, 0.5423F, 0.6958F, -0.7333F));

		PartDefinition cube_r285 = neck3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(7, 171).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1681F, -0.2577F, 0.148F, 0.3098F, -0.9288F));

		PartDefinition cube_r286 = neck3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(11, 152).mirror().addBox(-7.8788F, -0.8475F, -0.612F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1681F, -0.2577F, -0.0017F, 0.3423F, -1.3886F));

		PartDefinition cube_r287 = neck3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(171, 63).mirror().addBox(-3.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9373F, -5.331F, 0.1333F, 0.8455F, -1.3106F));

		PartDefinition cube_r288 = neck3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(66, 132).mirror().addBox(-4.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9363F, -3.487F, 0.0425F, 0.548F, -1.3695F));

		PartDefinition cube_r289 = neck3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(154, 103).mirror().addBox(-1.9025F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9363F, -3.487F, 0.2884F, 0.4744F, -0.8749F));

		PartDefinition cube_r290 = neck3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(151, 46).mirror().addBox(-7.8788F, -0.8475F, -0.612F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9681F, -2.1577F, 0.0193F, 0.4452F, -1.3805F));

		PartDefinition cube_r291 = neck3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(154, 33).mirror().addBox(-2.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9681F, -2.1577F, 0.2158F, 0.393F, -0.9055F));

		PartDefinition cube_r292 = neck3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(171, 63).addBox(1.7622F, -0.8631F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9373F, -5.331F, 0.1333F, -0.8455F, 1.3106F));

		PartDefinition cube_r293 = neck3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 171).addBox(-0.0382F, -0.0375F, -0.6859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9373F, -5.331F, 0.5423F, -0.6958F, 0.7333F));

		PartDefinition cube_r294 = neck3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(66, 132).addBox(1.6872F, -0.8836F, -0.5678F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9363F, -3.487F, 0.0425F, -0.548F, 1.3695F));

		PartDefinition cube_r295 = neck3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(154, 103).addBox(-0.0975F, -0.0878F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9363F, -3.487F, 0.2884F, -0.4744F, 0.8749F));

		PartDefinition cube_r296 = neck3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(11, 152).addBox(1.8788F, -0.8475F, -0.612F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1681F, -0.2577F, -0.0017F, -0.3423F, 1.3886F));

		PartDefinition cube_r297 = neck3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(7, 171).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1681F, -0.2577F, 0.148F, -0.3098F, 0.9288F));

		PartDefinition cube_r298 = neck3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(151, 46).addBox(1.8788F, -0.8475F, -0.612F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9681F, -2.1577F, 0.0193F, -0.4452F, 1.3805F));

		PartDefinition cube_r299 = neck3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(154, 33).addBox(0.061F, 0.0259F, -0.612F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9681F, -2.1577F, 0.2158F, -0.393F, 0.9055F));

		PartDefinition cube_r300 = neck3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(102, 170).addBox(0.5F, -4.8395F, -2.0692F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2315F, -0.1346F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r301 = neck3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(61, 170).addBox(0.5F, -4.6395F, -0.0692F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2315F, -0.1346F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r302 = neck3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(150, 85).addBox(-0.5F, -0.5F, -4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0685F, 1.3654F, -0.48F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2511F, -7.7344F, 0.1445F, -0.2592F, -0.0373F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(118, 77).addBox(-1.0F, -0.041F, -0.2653F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.0167F)), PartPose.offsetAndRotation(0.0F, -2.8218F, -4.5418F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(36, 125).addBox(-1.0F, -2.0756F, 0.0014F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3218F, -10.0418F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(173, 173).addBox(-0.5F, -1.0195F, -0.0293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2606F, -10.8635F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(168, 173).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8606F, -10.7635F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(163, 173).addBox(-0.5F, -3.2F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(158, 173).addBox(-0.5F, -2.0F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(153, 173).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.2113F, -15.8583F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(118, 64).addBox(-1.0F, -7.0378F, 0.0374F, 2.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.8782F, -16.5418F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(150, 92).addBox(-1.5F, 1.2997F, -1.3369F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.2782F, -17.0418F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(121, 150).addBox(-1.0F, -2.3753F, -1.4861F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1782F, -17.5418F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(150, 155).addBox(-1.0F, -2.3028F, -1.183F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0357F, -17.6125F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(166, 111).addBox(-1.0F, -1.8858F, -1.3409F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7357F, -18.6125F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(133, 172).addBox(-0.5F, -1.85F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.2791F, -16.2231F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(166, 107).addBox(-1.0F, -2.6822F, -4.0767F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6281F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(25, 154).addBox(-1.5F, -2.6822F, -3.1767F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6029F, -15.6781F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(167, 139).addBox(0.0F, -0.0141F, -0.5352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -4.0865F, -1.1188F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(147, 150).addBox(-1.0F, -0.2141F, -1.5352F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -4.0865F, -0.1188F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(84, 116).addBox(-11.6F, -0.0287F, 0.0879F, 9.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(126, 48).addBox(-10.6F, -2.0287F, -0.9121F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.1F, -1.0218F, -3.7551F, -0.027F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(138, 173).addBox(0.0F, 0.936F, 0.2744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -4.2865F, -2.4188F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(88, 145).addBox(-0.5F, -0.1028F, -3.5457F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.5794F, -1.5523F, 0.2162F, 0.0076F, 0.0287F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(107, 116).addBox(-4.5F, 0.0371F, -1.9718F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0718F, 0.4449F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(117, 2).addBox(-4.5F, 0.0016F, -1.9458F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5718F, -1.4551F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(91, 108).addBox(-4.0F, -3.0931F, -3.0028F, 9.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 2.0282F, 0.9449F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(114, 100).addBox(-4.0F, -2.9F, -3.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.9282F, 1.1449F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(112, 143).addBox(-1.0386F, -7.0216F, -2.1954F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -0.1275F, 0.0727F, -0.2512F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(173, 124).addBox(-0.7723F, -0.7089F, 0.873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0814F, 5.7791F, -4.763F, 0.3018F, 0.4415F, 0.0543F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(173, 121).addBox(-0.7723F, -0.7998F, -0.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0814F, 5.7791F, -4.763F, 0.1621F, 0.4415F, 0.0543F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(143, 20).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.9131F, 5.7585F, -5.1154F, -0.9351F, 0.2475F, 0.0328F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(128, 174).addBox(3.4F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8829F, -13.8142F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(160, 48).addBox(0.0F, -2.4996F, -1.9926F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3F, -4.7147F, 0.0363F, -1.2216F, 1.1737F, 2.4784F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(143, 151).addBox(3.4F, -0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3888F, -12.7025F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(64, 170).addBox(3.4F, -1.904F, 3.0009F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8509F, -13.668F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(65, 105).addBox(0.5F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 7.545F, -17.8535F, 0.3596F, 0.5462F, 0.1929F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(41, 173).addBox(0.5F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 7.6422F, -16.4879F, 0.1522F, 0.2244F, 0.0341F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(140, 2).addBox(3.3F, -0.6404F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9509F, -15.368F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(143, 163).addBox(-1.0848F, -1.9011F, 0.116F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2F, 6.6F, -17.0F, -0.1168F, 0.1887F, -0.0354F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(154, 125).addBox(-0.1F, -1.9356F, -1.0269F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3F, 6.6F, -17.9F, -0.1582F, 0.6332F, -0.1365F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(172, 159).addBox(-0.9F, -1.9927F, -1.0287F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, 7.0F, -13.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(73, 155).addBox(-0.9F, -2.0257F, -2.956F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 6.6F, -11.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(128, 163).addBox(-1.0F, -0.875F, 0.3987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.7F, -11.8F, 0.4272F, 0.0686F, -0.0127F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(143, 2).addBox(-0.9F, -1.8097F, 0.3275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.6F, -10.2F, 0.0389F, 0.223F, -0.042F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(157, 65).addBox(-0.3768F, 6.7224F, -0.8489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4F, -1.95F, -3.6867F, -0.4162F, 0.7481F, -0.0299F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 158).addBox(-2.9296F, 0.2516F, -3.1712F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.1F, -2.55F, -4.7F, 0.2371F, 0.6028F, 0.1336F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(141, 114).addBox(-1.0132F, -6.5947F, -3.3811F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(113, 170).addBox(-1.6271F, -5.5898F, -1.8779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(169, 84).addBox(-1.9071F, -5.5898F, -1.8779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, -0.0017F, 0.5691F, -0.3038F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(25, 159).addBox(-0.5F, -0.6843F, -2.4651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, 1.6482F, 2.73F, 0.1571F, 0.0F, -0.1396F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(165, 37).addBox(-0.4F, -2.4462F, -2.4156F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, 1.6482F, 2.73F, 0.2248F, 0.0313F, -0.2757F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(23, 164).addBox(-1.534F, -0.119F, -0.0618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9018F, -1.5396F, 0.6658F, 1.3721F, -0.6227F, -1.1437F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(163, 25).addBox(-1.5187F, -3.1876F, -0.0562F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9018F, -1.5396F, 0.6658F, 1.3775F, -0.2391F, -1.1445F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(173, 111).addBox(-1.32F, -1.0566F, 1.5483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.32F, 5.7521F, -1.301F, 0.2793F, 0.0F, -0.0873F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(173, 107).addBox(-1.32F, -0.5693F, 1.7737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.32F, 5.7521F, -1.301F, 0.4887F, 0.0F, -0.0873F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(143, 155).addBox(-1.5876F, -5.6451F, -0.5224F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.6135F, -9.09F, -1.2215F, 0.5849F, 0.0274F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(21, 122).addBox(-2.5775F, -4.9447F, -1.7487F, 2.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4804F, 2.4944F, -14.7169F, -1.2886F, 0.1585F, -0.3543F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(13, 145).addBox(-2.4F, -3.5227F, -1.8505F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.85F, -19.1867F, -1.151F, 0.4211F, -0.2751F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(133, 63).addBox(-1.4716F, 0.8878F, -0.7972F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, 0.1823F, 0.3657F, -0.2296F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(21, 108).addBox(-2.462F, 0.3775F, -1.2825F, 2.0F, 6.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, 0.2608F, 0.4034F, -0.0437F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(170, 97).addBox(-0.5F, -1.4717F, -0.5996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.03F, 3.4519F, -17.6236F, -1.2292F, 0.3546F, -0.3622F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(170, 31).addBox(-0.5F, -1.5141F, -0.3974F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.03F, 3.4519F, -17.6236F, -1.0895F, 0.3546F, -0.3622F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(166, 75).addBox(-1.4833F, -0.5161F, 1.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4804F, 2.4944F, -14.7169F, -0.1253F, 0.1523F, -0.3692F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(173, 127).addBox(-1.285F, 3.9903F, 1.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, -0.183F, 0.3433F, -0.2422F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(74, 174).addBox(-1.3487F, 2.2455F, 3.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, -0.7415F, 0.3433F, -0.2422F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(148, 173).addBox(-1.7056F, 4.0825F, -2.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, 1.0418F, 0.3526F, -0.3629F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(167, 151).addBox(-1.2766F, 4.6348F, -0.9292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, 0.4702F, 0.3823F, -0.2212F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(46, 163).addBox(-1.3427F, 2.7421F, 0.1552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, 0.0369F, 0.3768F, -0.2306F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(172, 18).addBox(-1.3427F, -2.0059F, 2.4436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, -0.731F, 0.3768F, -0.2306F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(113, 173).addBox(-1.3427F, -1.3873F, 3.0939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(154, 97).addBox(-1.3427F, -0.5873F, 2.3939F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, -0.923F, 0.3768F, -0.2306F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(157, 60).addBox(-1.3427F, -3.49F, 1.0597F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.0295F, -0.94F, -9.9791F, -1.4291F, 0.3768F, -0.2306F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(134, 144).addBox(-0.6675F, 0.6174F, -6.8602F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -1.69F, 0.0503F, -0.2796F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(166, 59).addBox(-0.9659F, -2.8916F, -0.9986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, 0.1296F, 0.0514F, -0.1922F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(173, 115).addBox(-0.6675F, 4.7287F, -5.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -2.3881F, 0.0503F, -0.2796F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(91, 172).addBox(-0.6675F, -4.4192F, 0.7673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, 0.4044F, 0.0503F, -0.2796F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(96, 174).addBox(-0.6675F, -6.4375F, 1.5209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, 0.2474F, 0.0503F, -0.2796F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(174, 94).addBox(-0.6675F, -6.8017F, -1.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -0.2937F, 0.0503F, -0.2796F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(173, 130).addBox(-0.6675F, -5.238F, -5.219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -0.8871F, 0.0503F, -0.2796F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(166, 69).addBox(-0.6675F, -7.3904F, -1.7994F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.22F, 5.7521F, -1.301F, -0.2064F, 0.0503F, -0.2796F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(165, 42).addBox(-1.9702F, -4.2428F, -2.1253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, 0.314F, 0.5719F, -0.2783F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(163, 101).addBox(-1.9702F, -3.7165F, -2.0681F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, 0.2268F, 0.5719F, -0.2783F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(119, 131).addBox(-1.9271F, 0.1068F, -3.2075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, -0.8831F, 0.5691F, -0.3038F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(57, 120).addBox(-1.9271F, -5.4295F, 0.699F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, 0.4346F, 0.5691F, -0.3038F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(165, 54).addBox(-1.9271F, -4.3126F, -4.5916F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, -0.5428F, 0.5691F, -0.3038F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(161, 87).addBox(-1.9271F, -5.0825F, -3.6662F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.7542F, 4.4705F, -3.2601F, -0.3508F, 0.5691F, -0.3038F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(170, 102).addBox(-0.8564F, -3.1637F, -1.6911F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.6204F, -1.6118F, -2.7377F, -1.8391F, 0.0123F, -0.0367F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(18, 154).addBox(-1.1261F, -5.8515F, 0.5461F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.32F, 5.7521F, -1.301F, 0.1556F, 0.0218F, -0.2252F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(158, 143).addBox(-1.0F, 0.1903F, -1.5497F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.7204F, -1.6118F, -2.2377F, -1.8064F, 0.1322F, -0.061F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(156, 2).addBox(-2.262F, -0.0555F, 0.0484F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3359F, -2.1062F, -5.4488F, -0.1563F, 0.1434F, 0.0085F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(158, 138).addBox(-1.0F, -0.4506F, -2.6114F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7204F, -1.6118F, -2.2377F, -0.6635F, 0.1754F, -0.0056F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6718F, 0.2449F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(112, 143).mirror().addBox(0.0386F, -7.0216F, -2.1954F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -0.1275F, -0.0727F, 0.2512F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(173, 124).mirror().addBox(-0.2277F, -0.7089F, 0.873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0814F, 5.7791F, -4.763F, 0.3018F, -0.4415F, -0.0543F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(173, 121).mirror().addBox(-0.2277F, -0.7998F, -0.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0814F, 5.7791F, -4.763F, 0.1621F, -0.4415F, -0.0543F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(143, 20).mirror().addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.9131F, 5.7585F, -5.1154F, -0.9351F, -0.2475F, -0.0328F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(128, 174).mirror().addBox(-3.4F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.8829F, -13.8142F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(160, 48).mirror().addBox(-1.0F, -2.4996F, -1.9926F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -4.7147F, 0.0363F, -1.2216F, -1.1737F, -2.4784F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(143, 151).mirror().addBox(-3.4F, -0.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3888F, -12.7025F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(64, 170).mirror().addBox(-3.4F, -1.904F, 3.0009F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.8509F, -13.668F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(65, 105).mirror().addBox(-0.5F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 7.545F, -17.8535F, 0.3596F, -0.5462F, -0.1929F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(41, 173).mirror().addBox(-0.5F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 7.6422F, -16.4879F, 0.1522F, -0.2244F, -0.0341F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(140, 2).mirror().addBox(-3.3F, -0.6404F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9509F, -15.368F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(143, 163).mirror().addBox(0.0848F, -1.9011F, 0.116F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 6.6F, -17.0F, -0.1168F, -0.1887F, 0.0354F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(154, 125).mirror().addBox(-0.9F, -1.9356F, -1.0269F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 6.6F, -17.9F, -0.1582F, -0.6332F, 0.1365F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(172, 159).mirror().addBox(-0.1F, -1.9927F, -1.0287F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 7.0F, -13.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(73, 155).mirror().addBox(-0.1F, -2.0257F, -2.956F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 6.6F, -11.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(128, 163).mirror().addBox(0.0F, -0.875F, 0.3987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 5.7F, -11.8F, 0.4272F, -0.0686F, 0.0127F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(143, 2).mirror().addBox(-0.1F, -1.8097F, 0.3275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 5.6F, -10.2F, 0.0389F, -0.223F, 0.042F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(157, 65).mirror().addBox(-0.6232F, 6.7224F, -0.8489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4F, -1.95F, -3.6867F, -0.4162F, -0.7481F, 0.0299F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 158).mirror().addBox(0.9296F, 0.2516F, -3.1712F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -2.55F, -4.7F, 0.2371F, -0.6028F, -0.1336F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(141, 114).mirror().addBox(0.0132F, -6.5947F, -3.3811F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 170).mirror().addBox(-0.3729F, -5.5898F, -1.8779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(169, 84).mirror().addBox(-0.0929F, -5.5898F, -1.8779F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, -0.0017F, -0.5691F, 0.3038F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(25, 159).mirror().addBox(-0.5F, -0.6843F, -2.4651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 1.6482F, 2.73F, 0.1571F, 0.0F, 0.1396F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(165, 37).mirror().addBox(-0.6F, -2.4462F, -2.4156F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9F, 1.6482F, 2.73F, 0.2248F, -0.0313F, 0.2757F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(23, 164).mirror().addBox(0.534F, -0.119F, -0.0618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9018F, -1.5396F, 0.6658F, 1.3721F, 0.6227F, 1.1437F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(163, 25).mirror().addBox(0.5187F, -3.1876F, -0.0562F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9018F, -1.5396F, 0.6658F, 1.3775F, 0.2391F, 1.1445F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(173, 111).mirror().addBox(0.32F, -1.0566F, 1.5483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.32F, 5.7521F, -1.301F, 0.2793F, 0.0F, 0.0873F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(173, 107).mirror().addBox(0.32F, -0.5693F, 1.7737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.32F, 5.7521F, -1.301F, 0.4887F, 0.0F, 0.0873F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(143, 155).mirror().addBox(-0.4124F, -5.6451F, -0.5224F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6135F, -9.09F, -1.2215F, -0.5849F, -0.0274F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(21, 122).mirror().addBox(0.5775F, -4.9447F, -1.7487F, 2.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4804F, 2.4944F, -14.7169F, -1.2886F, -0.1585F, 0.3543F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(13, 145).mirror().addBox(0.4F, -3.5227F, -1.8505F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.85F, -19.1867F, -1.151F, -0.4211F, 0.2751F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(133, 63).mirror().addBox(0.4716F, 0.8878F, -0.7972F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, 0.1823F, -0.3657F, 0.2296F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(21, 108).mirror().addBox(0.462F, 0.3775F, -1.2825F, 2.0F, 6.0F, 7.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, 0.2608F, -0.4034F, 0.0437F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(170, 97).mirror().addBox(-0.5F, -1.4717F, -0.5996F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.03F, 3.4519F, -17.6236F, -1.2292F, -0.3546F, 0.3622F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(170, 31).mirror().addBox(-0.5F, -1.5141F, -0.3974F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.03F, 3.4519F, -17.6236F, -1.0895F, -0.3546F, 0.3622F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(166, 75).mirror().addBox(0.4833F, -0.5161F, 1.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4804F, 2.4944F, -14.7169F, -0.1253F, -0.1523F, 0.3692F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(173, 127).mirror().addBox(0.285F, 3.9903F, 1.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, -0.183F, -0.3433F, 0.2422F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(74, 174).mirror().addBox(0.3487F, 2.2455F, 3.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, -0.7415F, -0.3433F, 0.2422F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(148, 173).mirror().addBox(0.7056F, 4.0825F, -2.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, 1.0418F, -0.3526F, 0.3629F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(167, 151).mirror().addBox(0.2766F, 4.6348F, -0.9292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, 0.4702F, -0.3823F, 0.2212F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(46, 163).mirror().addBox(0.3427F, 2.7421F, 0.1552F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, 0.0369F, -0.3768F, 0.2306F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(172, 18).mirror().addBox(0.3427F, -2.0059F, 2.4436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, -0.731F, -0.3768F, 0.2306F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(113, 173).mirror().addBox(0.3427F, -1.3873F, 3.0939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(154, 97).mirror().addBox(0.3427F, -0.5873F, 2.3939F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, -0.923F, -0.3768F, 0.2306F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(157, 60).mirror().addBox(0.3427F, -3.49F, 1.0597F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0295F, -0.94F, -9.9791F, -1.4291F, -0.3768F, 0.2306F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(134, 144).mirror().addBox(-0.3325F, 0.6174F, -6.8602F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -1.69F, -0.0503F, 0.2796F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(166, 59).mirror().addBox(-0.0341F, -2.8916F, -0.9986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, 0.1296F, -0.0514F, 0.1922F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(173, 115).mirror().addBox(-0.3325F, 4.7287F, -5.0067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -2.3881F, -0.0503F, 0.2796F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(91, 172).mirror().addBox(-0.3325F, -4.4192F, 0.7673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, 0.4044F, -0.0503F, 0.2796F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(96, 174).mirror().addBox(-0.3325F, -6.4375F, 1.5209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, 0.2474F, -0.0503F, 0.2796F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(174, 94).mirror().addBox(-0.3325F, -6.8017F, -1.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -0.2937F, -0.0503F, 0.2796F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(173, 130).mirror().addBox(-0.3325F, -5.238F, -5.219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -0.8871F, -0.0503F, 0.2796F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(166, 69).mirror().addBox(-0.3325F, -7.3904F, -1.7994F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.22F, 5.7521F, -1.301F, -0.2064F, -0.0503F, 0.2796F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(165, 42).mirror().addBox(-0.0298F, -4.2428F, -2.1253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, 0.314F, -0.5719F, 0.2783F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(163, 101).mirror().addBox(-0.0298F, -3.7165F, -2.0681F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, 0.2268F, -0.5719F, 0.2783F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(119, 131).mirror().addBox(-0.0729F, 0.1068F, -3.2075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, -0.8831F, -0.5691F, 0.3038F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(57, 120).mirror().addBox(-0.0729F, -5.4295F, 0.699F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, 0.4346F, -0.5691F, 0.3038F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(165, 54).mirror().addBox(-0.0729F, -4.3126F, -4.5916F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, -0.5428F, -0.5691F, 0.3038F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(161, 87).mirror().addBox(-0.0729F, -5.0825F, -3.6662F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.7542F, 4.4705F, -3.2601F, -0.3508F, -0.5691F, 0.3038F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(170, 102).mirror().addBox(-0.1436F, -3.1637F, -1.6911F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.6204F, -1.6118F, -2.7377F, -1.8391F, -0.0123F, 0.0367F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(18, 154).mirror().addBox(0.1261F, -5.8515F, 0.5461F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.32F, 5.7521F, -1.301F, 0.1556F, -0.0218F, 0.2252F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(158, 143).mirror().addBox(-1.0F, 0.1903F, -1.5497F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7204F, -1.6118F, -2.2377F, -1.8064F, -0.1322F, 0.061F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(156, 2).mirror().addBox(0.262F, -0.0555F, 0.0484F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3359F, -2.1062F, -5.4488F, -0.1563F, -0.1434F, -0.0085F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(158, 138).mirror().addBox(-1.0F, -0.4506F, -2.6114F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7204F, -1.6118F, -2.2377F, -0.6635F, -0.1754F, 0.0056F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2282F, 1.3923F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(141, 26).mirror().addBox(-0.8481F, -2.7508F, -4.9409F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-4.1975F, 4.7134F, -6.5378F, -0.1964F, -0.2576F, 0.1075F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(64, 155).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5862F, 1.4298F, -2.1136F, 0.565F, -0.1834F, 0.0263F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(150, 161).mirror().addBox(-0.9541F, -2.7465F, 0.3294F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 3.65F, -4.7F, 0.384F, -0.2618F, 0.0F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(154, 10).mirror().addBox(-0.6195F, -2.8576F, -2.9457F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.65F, -4.2F, 0.384F, -0.6109F, 0.0F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(174, 79).mirror().addBox(-1.5F, -0.9587F, 0.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7396F, -17.7304F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(167, 135).mirror().addBox(-1.5F, -1.1528F, 0.0823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6396F, -17.7304F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(69, 170).mirror().addBox(0.5F, -2.4883F, 4.1521F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7563F, -17.0213F, -0.0698F, -0.2793F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(174, 133).mirror().addBox(0.5F, -2.5718F, 0.935F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(146, 70).mirror().addBox(0.5F, -2.1718F, 2.735F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7563F, -17.0213F, -0.0698F, -0.2793F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(167, 147).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8593F, -17.8284F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(167, 46).mirror().addBox(-1.0F, -0.0338F, -0.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7945F, -18.4865F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(76, 124).mirror().addBox(0.0F, -0.131F, -0.5685F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7563F, -17.0213F, -0.0873F, -0.2793F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(46, 158).mirror().addBox(0.0F, -0.6466F, -0.1094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7563F, -17.0213F, -0.1396F, -0.2793F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(120, 157).mirror().addBox(0.0F, 0.0019F, 2.3779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7563F, -17.0213F, 0.1396F, -0.2793F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(156, 19).mirror().addBox(-0.4201F, -0.4477F, -0.5061F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.1547F, 1.5794F, -11.4603F, 0.6481F, -0.2121F, 0.0236F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(163, 31).mirror().addBox(1.3737F, -0.3061F, -4.424F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-6.1634F, -1.2529F, -5.8468F, 0.254F, -0.2102F, 0.0367F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(174, 91).mirror().addBox(-1.2066F, -4.1838F, 2.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1634F, 4.0471F, -5.4468F, -0.2269F, -0.2531F, 0.0F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(173, 118).mirror().addBox(-0.6337F, -0.4436F, -2.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 3.65F, -4.2F, -0.2269F, -0.6021F, 0.0F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(161, 117).mirror().addBox(-1.093F, 0.1214F, 0.145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1634F, -1.5529F, -5.7468F, -0.0349F, -0.2531F, 0.0F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(146, 62).mirror().addBox(-0.7564F, -0.6809F, -1.1451F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8634F, -0.1529F, -7.2468F, 0.0807F, -0.6493F, 0.1279F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(84, 109).mirror().addBox(-0.1864F, 0.2577F, -0.5761F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.7F, -1.6197F, -3.7058F, -0.1753F, -0.2731F, -0.0378F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(164, 155).mirror().addBox(-4.0F, -0.15F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.2F, -1.1F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(163, 123).mirror().addBox(-4.0F, 3.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(141, 26).addBox(-0.1519F, -2.7508F, -4.9409F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.1975F, 4.7134F, -6.5378F, -0.1964F, 0.2576F, -0.1075F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(64, 155).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5862F, 1.4298F, -2.1136F, 0.565F, 0.1834F, -0.0263F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(150, 161).addBox(-0.0459F, -2.7465F, 0.3294F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 3.65F, -4.7F, 0.384F, 0.2618F, 0.0F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(154, 10).addBox(-0.3805F, -2.8576F, -2.9457F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.0F, 3.65F, -4.2F, 0.384F, 0.6109F, 0.0F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(174, 79).addBox(0.5F, -0.9587F, 0.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 3.7396F, -17.7304F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(167, 135).addBox(0.5F, -1.1528F, 0.0823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.6396F, -17.7304F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(167, 50).addBox(-1.5F, -0.6406F, -1.3209F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0945F, -18.2865F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(69, 170).addBox(-0.5F, -2.4883F, 4.1521F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7563F, -17.0213F, -0.0698F, 0.2793F, 0.0F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(167, 143).addBox(-1.0F, -0.6F, -4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1147F, -13.6636F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(174, 133).addBox(-0.5F, -2.5718F, 0.935F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 70).addBox(-0.5F, -2.1718F, 2.735F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7563F, -17.0213F, -0.0698F, 0.2793F, 0.0F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(105, 172).addBox(-1.0F, 1.3991F, -0.5884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9055F, -18.2865F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(156, 43).addBox(-1.5F, -0.2966F, -1.2885F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0945F, -18.2865F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(167, 147).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 1.8593F, -17.8284F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(167, 46).addBox(0.0F, -0.0338F, -0.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7945F, -18.4865F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(76, 124).addBox(-1.0F, -0.131F, -0.5685F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7563F, -17.0213F, -0.0873F, 0.2793F, 0.0F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(46, 158).addBox(-1.0F, -0.6466F, -0.1094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 1.7563F, -17.0213F, -0.1396F, 0.2793F, 0.0F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(120, 157).addBox(-1.0F, 0.0019F, 2.3779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 1.7563F, -17.0213F, 0.1396F, 0.2793F, 0.0F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(156, 19).addBox(-0.5799F, -0.4477F, -0.5061F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.1547F, 1.5794F, -11.4603F, 0.6481F, 0.2121F, -0.0236F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(163, 31).addBox(-2.3737F, -0.3061F, -4.424F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(6.1634F, -1.2529F, -5.8468F, 0.254F, 0.2102F, -0.0367F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(174, 91).addBox(0.2066F, -4.1838F, 2.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.1634F, 4.0471F, -5.4468F, -0.2269F, 0.2531F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(173, 118).addBox(-0.3663F, -0.4436F, -2.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.0F, 3.65F, -4.2F, -0.2269F, 0.6021F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(161, 117).addBox(0.093F, 0.1214F, 0.145F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1634F, -1.5529F, -5.7468F, -0.0349F, 0.2531F, 0.0F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(146, 62).addBox(-0.2436F, -0.6809F, -1.1451F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8634F, -0.1529F, -7.2468F, 0.0807F, 0.6493F, -0.1279F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(84, 109).addBox(-0.8136F, 0.2577F, -0.5761F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.7F, -1.6197F, -3.7058F, -0.1753F, 0.2731F, 0.0378F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(164, 155).addBox(3.0F, -0.15F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.2F, -0.2F, -1.1F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(163, 123).addBox(3.0F, 3.25F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.2F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 180, 180);
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