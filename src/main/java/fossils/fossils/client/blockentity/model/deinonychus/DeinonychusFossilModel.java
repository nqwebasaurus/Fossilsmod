package fossils.fossils.client.blockentity.model.deinonychus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeinonychusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Deinonychus;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
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

	public DeinonychusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Deinonychus = this.fossil.getChild("Deinonychus");
		this.hips = this.Deinonychus.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftLeg1 = this.Deinonychus.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.Deinonychus.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Deinonychus = fossil.addOrReplaceChild("Deinonychus", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, -6.25F));

		PartDefinition hips = Deinonychus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 5).addBox(0.0F, -1.3895F, 0.0181F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1357F, -0.8693F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-2.2F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 19).mirror().addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 9).addBox(0.2F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 19).addBox(2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(32, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.35F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-0.5F, -1.1454F, -2.9056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.3F, -0.25F, 0.1745F, 0.2094F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.5F, 0.4908F, -1.7217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.3F, -0.25F, -0.7854F, 0.2094F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-3.0F, 0.0124F, -2.0242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(57, 20).addBox(2.0F, 0.0124F, -2.0242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.2F, 2.35F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 45).mirror().addBox(-0.5F, -0.7682F, -1.3816F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.3F, -0.25F, -0.1222F, 0.2094F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 58).mirror().addBox(-3.0F, -0.062F, -1.6036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 58).addBox(2.0F, -0.062F, -1.6036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 3.65F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.2412F, -0.1949F, -1.5198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 0.623F, 0.066F, -0.2975F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-0.2412F, 5.0914F, -4.2142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 1.1379F, 0.066F, -0.2975F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-0.2412F, 2.5711F, -1.9077F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 0.7626F, 0.066F, -0.2975F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 39).mirror().addBox(-0.5F, -0.6423F, -1.2462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.0651F, 0.292F, 0.384F, 0.0F, -0.2618F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 1).mirror().addBox(-0.2412F, -0.1309F, 0.3401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 0.7277F, 0.066F, -0.2975F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-0.2412F, 1.7961F, -0.3284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 1.0942F, 0.066F, -0.2975F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 45).mirror().addBox(-0.0412F, 1.6535F, -1.6149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.9349F, 0.992F, 1.5533F, 0.0F, -0.2618F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 58).addBox(-0.5F, 0.4908F, -1.7217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -1.3F, -0.25F, -0.7854F, -0.2094F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5F, -1.1454F, -2.9056F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -1.3F, -0.25F, 0.1745F, -0.2094F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(6, 45).addBox(-0.5F, -0.7682F, -1.3816F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, -1.3F, -0.25F, -0.1222F, -0.2094F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(58, 32).addBox(-0.7588F, 5.0914F, -4.2142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 1.1379F, -0.066F, 0.2975F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 57).addBox(-0.7588F, 2.5711F, -1.9077F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 0.7626F, -0.066F, 0.2975F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 45).addBox(-0.9588F, 1.6535F, -1.6149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 1.5533F, 0.0F, 0.2618F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(27, 0).addBox(-0.7588F, 1.7961F, -0.3284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 1.0942F, -0.066F, 0.2975F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 1).addBox(-0.7588F, -0.1309F, 0.3401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 0.7277F, -0.066F, 0.2975F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 9).addBox(-0.7588F, -0.1949F, -1.5198F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.9349F, 0.992F, 0.623F, -0.066F, 0.2975F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 39).addBox(-0.5F, -0.6423F, -1.2462F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.0651F, 0.292F, 0.384F, 0.0F, 0.2618F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 3.5F, 0.176F, -0.1289F, -0.0229F));

		PartDefinition cube_r25 = tail1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 11).addBox(0.0F, -1.2175F, 3.9914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 52).addBox(0.0F, -1.1175F, 1.9914F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 63).addBox(0.0F, -1.0175F, -0.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3809F, 0.8971F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 39).addBox(0.0F, -0.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 14).addBox(0.0F, -0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, 1.2308F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1191F, -0.1029F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.1084F, -0.1257F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4309F, 6.8971F, 0.1942F, -0.1726F, -0.0261F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(44, 26).addBox(0.0F, -2.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 45).addBox(0.0F, -2.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 45).addBox(0.0F, -1.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1084F, -0.1257F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 9).addBox(0.0F, 0.0F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 9).addBox(0.0F, -0.1F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 66).addBox(0.0F, -0.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 27).addBox(0.0F, -0.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 39).addBox(0.0F, -0.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5757F, -5.6662F, 0.1134F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.4395F, -0.0878F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 12.9743F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1714F, -0.3954F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1895F, 12.0122F, -0.2545F, -0.1291F, 0.0217F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.75F, -1.25F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 27).addBox(-2.5F, -1.9284F, -0.3751F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8296F, 0.3482F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 19).addBox(-2.5F, -1.9284F, -5.9751F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8296F, 0.3482F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.0714F, -0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9566F, -2.5289F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, -1.75F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.3124F, 0.2205F, -1.0717F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.3887F, 0.1276F, -0.6385F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.2133F, 0.5101F, -1.4536F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.4282F, 0.3552F, -0.9514F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.5479F, 0.2038F, -0.5249F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.6293F, 0.2401F, -0.4895F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-5.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.2347F, 0.5955F, -1.4249F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.4903F, 0.4209F, -0.9105F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.6954F, 0.268F, -0.4554F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.5426F, 0.4724F, -0.8704F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(-6.3847F, -1.7132F, -0.4412F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.2537F, 0.6636F, -1.3963F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.3887F, -0.1276F, 0.6385F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(44, 0).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.3124F, -0.2205F, 1.0717F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 18).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.4282F, -0.3552F, 0.9514F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(65, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.5479F, -0.2038F, 0.5249F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 58).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.2133F, -0.5101F, 1.4536F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 30).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.4903F, -0.4209F, 0.9105F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.6293F, -0.2401F, 0.4895F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 0).addBox(2.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.2347F, -0.5955F, 1.4249F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(20, 14).addBox(2.3847F, -1.7132F, -0.4412F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.2537F, -0.6636F, 1.3963F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(61, 40).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.5426F, -0.4724F, 0.8704F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.6954F, -0.268F, 0.4554F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, -6.9F, 0.3494F, -0.041F, -0.0149F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(59, 65).addBox(0.0F, -0.7F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8479F, -3.4463F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 66).addBox(0.0F, -0.8605F, -0.1715F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4479F, -3.8463F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(-1, 67).mirror().addBox(-2.8896F, 0.0F, -0.4075F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 4.9115F, -2.1471F, -0.1358F, 1.0013F, -0.0361F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-1.8896F, 0.0F, -0.4075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 4.9115F, -2.1471F, 0.1286F, 0.5847F, 1.024F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(28, 41).mirror().addBox(-0.5F, 0.6F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6706F, 2.7608F, -3.4056F, 0.8708F, 0.0074F, 0.0369F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 45).mirror().addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5473F, -3.3533F, 1.3221F, -0.6787F, -0.8905F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-0.5F, 0.0002F, -2.9997F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5473F, -3.3533F, 0.99F, -0.4454F, -0.285F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-3.0F, -0.8723F, -1.812F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 14).addBox(2.0F, -0.8723F, -1.812F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9036F, -1.1961F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(-3.0F, 0.0094F, 0.0166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 6).addBox(2.0F, 0.0094F, 0.0166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4964F, 0.5039F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-3.0F, -0.5F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(20, 0).addBox(2.0F, -0.5F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6036F, -1.9961F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(28, 41).addBox(-0.5F, 0.6F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6706F, 2.7608F, -3.4056F, 0.8708F, -0.0074F, -0.0369F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(26, 39).addBox(-0.5F, 0.0002F, -2.9997F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.5473F, -3.3533F, 0.99F, 0.4454F, 0.285F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 45).addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5F, 0.5473F, -3.3533F, 1.3221F, 0.6787F, 0.8905F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 59).addBox(-0.5F, -0.5558F, -0.401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.782F, -4.2376F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.0852F, 0.5389F, -1.5712F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-5.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.2048F, 0.4051F, -1.4214F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.3688F, 0.2665F, -0.9336F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(53, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.4582F, 0.1466F, -0.5046F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(32, 21).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.3392F, 0.4351F, -1.0391F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -3.5422F, 0.506F, 0.311F, -0.5889F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(19, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.506F, -0.311F, 0.5889F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(32, 21).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.3392F, -0.4351F, 1.0391F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 15).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -3.5422F, 0.0852F, -0.5389F, 1.5712F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(-1, 67).addBox(-0.1104F, 0.0F, -0.4075F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 4.9115F, -2.1471F, -0.1358F, -1.0013F, 0.0361F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(30, 15).addBox(-0.1104F, 0.0F, -0.4075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 4.9115F, -2.1471F, 0.1286F, -0.5847F, -1.024F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 40).addBox(2.3847F, -1.7132F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.2048F, -0.4051F, 1.4214F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(40, 7).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.3688F, -0.2665F, 0.9336F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(53, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.4582F, -0.1466F, 0.5046F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4339F, -3.9914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0474F, 2.7395F, -2.4157F, 0.9188F, 0.1396F, -0.3903F));

		PartDefinition cube_r87 = leftArm1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(61, 52).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(10, 62).addBox(-0.55F, -0.55F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0941F, 4.6353F, -0.6475F, -2.0512F, 0.0387F, -0.0202F));

		PartDefinition cube_r88 = leftArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 62).addBox(-1.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(16, 19).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(48, 56).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 53).addBox(-1.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(62, 24).addBox(-1.0F, 1.7F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, 4.5F, -0.5F, 0.886F, -0.2748F, 0.218F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(31, 50).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(26, 50).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0474F, 2.7395F, -2.4157F, -0.0861F, -0.0696F, 0.2183F));

		PartDefinition cube_r91 = rightArm1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(27, 6).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 62).addBox(-0.45F, -0.55F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0941F, 4.6353F, -0.6475F, -1.5276F, -0.0387F, 0.0202F));

		PartDefinition cube_r92 = rightArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(61, 61).addBox(0.75F, -0.2F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, 2.05F, 0.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightArm2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(8, 19).addBox(-0.5F, -0.5991F, -0.5131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 2.35F, -0.5F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(56, 40).addBox(0.0F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(43, 52).addBox(0.0F, 1.7F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(15, 62).addBox(0.0F, 1.7F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, 4.5F, -0.5F, 0.7343F, 0.3108F, -0.3105F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(50, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.258F, -0.045F, -0.1687F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1661F, -3.6914F, -0.5477F, -0.2031F, -0.0791F));

		PartDefinition cube_r95 = neck1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(37, 66).addBox(0.0F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4208F, -2.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1292F, -2.8F, -0.3124F, -0.2079F, 0.0666F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 66).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 5).addBox(0.0F, -1.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.805F, -4.8573F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.655F, -4.0573F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3598F, 0.1094F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r98 = neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 45).addBox(0.0F, -1.0F, 0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1069F, -2.7077F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7137F, -3.7587F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-0.63F, -0.8122F, -2.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(24, 66).mirror().addBox(-0.63F, -0.8122F, -2.6966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 66).mirror().addBox(-0.5F, -0.4122F, -0.9966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 13).addBox(0.23F, -0.8122F, -2.2966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(24, 66).addBox(0.23F, -0.8122F, -2.6966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 66).addBox(0.1F, -0.4122F, -0.9966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, -0.8262F, -5.1848F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-0.8F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(59, 36).addBox(-0.2F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.3887F, -7.1507F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.6F, -1.0598F, 0.0949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 65).addBox(-0.4F, -1.0598F, 0.0949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0887F, -8.0507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(7, 34).mirror().addBox(-1.0F, -0.6177F, -1.1408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1679F, -4.1181F, 0.0698F, -0.1571F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 34).addBox(0.0F, -0.6177F, -1.1408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1679F, -4.1181F, 0.0698F, 0.1571F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 41).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, 0.2406F, -3.4786F, -0.1396F, -0.1571F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(47, 41).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, 0.2406F, -3.4786F, -0.1396F, 0.1571F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(47, 36).mirror().addBox(-0.6401F, -0.6424F, -0.4899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0908F, -1.4176F, -2.532F, -1.4862F, -0.795F, -0.01F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2833F, -1.4241F, -2.5859F, -1.4374F, -0.3246F, 0.0266F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(47, 36).addBox(-0.3599F, -0.6424F, -0.4899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0908F, -1.4176F, -2.532F, -1.4862F, 0.795F, 0.01F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 61).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2833F, -1.4241F, -2.5859F, -1.4374F, 0.3246F, -0.0266F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, -1.0743F, -0.1048F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5668F, -2.8623F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 56).addBox(-0.5F, -0.399F, 0.0107F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.536F, -4.1578F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(7, 26).mirror().addBox(0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 0.517F, -4.0048F, 0.0943F, -0.0266F, 0.0194F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(10, 9).mirror().addBox(0.4F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.938F, 0.3603F, -6.3489F, -0.2161F, -0.0291F, -0.0214F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 26).addBox(-0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 0.517F, -4.0048F, 0.0943F, 0.0266F, -0.0194F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 9).addBox(-0.4F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.938F, 0.3603F, -6.3489F, -0.2161F, 0.0291F, 0.0214F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-1.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(42, 63).addBox(0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.6697F, 0.5732F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -0.0321F, -0.026F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.8F, -0.35F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(33, 34).addBox(-1.0F, -3.0912F, -1.1647F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(37, 21).addBox(-1.0F, -1.9912F, 0.0353F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(37, 62).addBox(1.34F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.92F, -1.2877F, 0.2808F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-1.32F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 9).addBox(0.92F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 0.5052F, -0.1927F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-1.32F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(55, 62).addBox(0.92F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.3F, -0.4877F, 0.2808F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-1.43F, -0.8162F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 49).mirror().addBox(-1.43F, -1.3162F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false)
				.texOffs(65, 32).addBox(0.83F, -0.8162F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 49).addBox(0.83F, -1.3162F, -0.1114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-0.2F, 0.3133F, -2.07F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-1.42F, -0.2198F, -0.8128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(52, 17).addBox(-0.98F, -0.2198F, -0.8128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3F, 0.4133F, -1.07F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-1.42F, -0.1957F, -0.773F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(51, 45).addBox(-0.98F, -0.1957F, -0.773F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.3F, -0.0867F, -0.67F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-1.43F, -0.1229F, -0.0525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 55).addBox(0.83F, -0.1229F, -0.0525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, -1.5867F, -2.07F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(-1.22F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 35).mirror().addBox(-1.3F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 20).mirror().addBox(-1.52F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 20).addBox(1.12F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 35).addBox(0.9F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 63).addBox(0.82F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -0.4867F, -1.57F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(24, 27).mirror().addBox(-1.42F, -0.2067F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(24, 27).addBox(-0.98F, -0.2067F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3F, -1.1867F, -0.57F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(51, 31).mirror().addBox(-1.42F, -0.1647F, -0.8353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 31).addBox(-0.98F, -0.1647F, -0.8353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.5867F, -0.47F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(43, 2).mirror().addBox(-0.5F, 0.0306F, -1.7853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.5387F, -3.505F, -0.2705F, -0.1396F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-0.5F, -1.2373F, -0.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.5387F, -3.505F, -1.6144F, -0.1396F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(-0.5F, -0.9023F, -0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.5387F, -3.505F, 0.0262F, -0.1396F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-0.5F, -0.865F, -1.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.5387F, -3.505F, 0.288F, -0.1396F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(-0.5F, -0.3851F, -1.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.5387F, -3.505F, -0.0087F, -0.1396F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5F, -0.9023F, -0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.73F, -0.5387F, -3.505F, 0.0262F, 0.1396F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 48).addBox(-0.5F, -0.865F, -1.6255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.73F, -0.5387F, -3.505F, 0.288F, 0.1396F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5F, -1.2373F, -0.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.73F, -0.5387F, -3.505F, -1.6144F, 0.1396F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(43, 2).addBox(-0.5F, 0.0306F, -1.7853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.73F, -0.5387F, -3.505F, -0.2705F, 0.1396F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(41, 36).addBox(-0.5F, -0.3851F, -1.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.73F, -0.5387F, -3.505F, -0.0087F, 0.1396F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8F, -2.95F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7548F, 0.6772F, -0.2783F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-1.5F, -1.0771F, -1.9548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(60, 10).addBox(0.5F, -1.0771F, -1.9548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.8285F, 0.116F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(46, 17).mirror().addBox(-1.5F, -2.7834F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(46, 17).addBox(0.5F, -2.7834F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.1285F, -0.484F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-2.0F, 0.6143F, -0.0124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(64, 5).mirror().addBox(-2.0F, 0.0143F, -0.0124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 42).addBox(0.0F, 0.6143F, -0.0124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(64, 5).addBox(0.0F, 0.0143F, -0.0124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3186F, -2.8411F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(40, 14).mirror().addBox(-0.5F, -0.822F, -2.7109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0864F, -2.3643F, 0.755F, -0.0352F, -0.1044F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(57, 2).mirror().addBox(-0.5F, -0.2982F, -1.8484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0864F, -2.3643F, 0.4671F, -0.0352F, -0.1044F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(7, 39).mirror().addBox(0.2F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.615F, 3.617F, -5.149F, 0.5686F, -0.0662F, -0.0423F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 14).addBox(-0.5F, -0.822F, -2.7109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6F, 2.0864F, -2.3643F, 0.755F, 0.0352F, 0.1044F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 2).addBox(-0.5F, -0.2982F, -1.8484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.6F, 2.0864F, -2.3643F, 0.4671F, 0.0352F, 0.1044F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(7, 39).addBox(-0.2F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.615F, 3.617F, -5.149F, 0.5686F, 0.0662F, 0.0423F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5722F, -7.3928F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.2387F, -5.4491F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = Deinonychus.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(61, 45).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, 0.9F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition cube_r151 = leftLeg1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(12, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(52, 34).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(7, 50).addBox(-0.9F, 2.9946F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 1.6148F, -0.1308F, -0.0057F));

		PartDefinition cube_r152 = leftLeg2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(21, 39).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 56).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(14, 49).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -0.8722F, -0.0334F, -0.0281F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(11, 34).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.0472F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(44, 26).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.3491F, 0.3054F, 0.0F));

		PartDefinition cube_r153 = leftSickleClaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(50, 5).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = Deinonychus.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -0.7948F, -0.5638F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.5F, 0.9F, -0.8271F, -0.0643F, -0.059F));

		PartDefinition cube_r154 = rightLeg1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(55, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.2052F, -0.5638F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(51, 50).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(21, 49).addBox(-0.1F, 2.9946F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 7.1052F, 0.2362F, 1.1759F, 0.1264F, -0.0341F));

		PartDefinition cube_r155 = rightLeg2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(16, 39).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 26).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(10, 0).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0946F, 0.178F, -0.4744F, -0.0327F, 0.182F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.7934F, -0.3088F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(44, 7).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.6981F, -0.3054F, 0.0F));

		PartDefinition cube_r156 = rightSickleClaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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