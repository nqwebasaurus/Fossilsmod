package fossils.fossils.client.blockentity.model.jakapil;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JakapilFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart torso;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart jaw;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftClaw;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightClaw;

	public JakapilFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.torso = this.hips.getChild("torso");
		this.chest = this.torso.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.jaw = this.head.getChild("jaw");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftClaw = this.leftHand.getChild("leftClaw");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightClaw = this.rightHand.getChild("rightClaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.9323F, -2.9958F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 73).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8986F, 2.2102F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 30).addBox(-1.5F, -0.6271F, 0.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.2F, -0.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 6).mirror().addBox(0.0F, 0.1821F, 0.9996F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 6).addBox(2.0F, 0.1821F, 0.9996F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(1.0F, -0.3179F, -0.0004F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, -1.2F, -1.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 42).mirror().addBox(-0.4342F, -0.513F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.982F, 0.6123F, 0.5934F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 44).mirror().addBox(-0.4342F, 0.7206F, -0.209F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.982F, 0.6123F, 0.3752F, 0.0F, -0.4363F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(-0.5F, 1.479F, -0.3944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9931F, 1.6675F, 0.2007F, 0.0F, -0.3491F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 33).mirror().addBox(-0.5F, -1.0065F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9931F, 1.6675F, 0.2443F, 0.0F, -0.3491F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(-0.5F, -0.9638F, -0.6228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9931F, 1.6675F, 0.4189F, 0.0F, -0.3491F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(0.0F, 0.575F, -0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.0648F, 1.1943F, -1.2828F, 0.0F, -0.2793F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(0.0F, -1.2919F, -0.1202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 58).addBox(2.6F, -1.2919F, -0.1202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.0648F, 1.1943F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(0.0F, -0.0221F, -0.7133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 46).mirror().addBox(0.0F, -0.0221F, 0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.0648F, 1.1943F, -0.2356F, 0.0F, -0.2793F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(0.0F, 0.1472F, -0.7298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.0648F, 1.1943F, -0.6283F, 0.0F, -0.2793F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-0.65F, -0.825F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 27).addBox(2.25F, -0.825F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, 0.6826F, 3.5651F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.0F, -0.8045F, -2.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.95F, -1.025F, 0.725F, 0.4625F, 0.0873F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(0.0F, -0.5403F, -2.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.95F, -1.025F, 0.725F, 0.3316F, 0.0873F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(0.0F, -0.2447F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.95F, -1.025F, 0.725F, 0.1134F, 0.0873F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(0.0F, -0.1533F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.95F, -1.025F, 0.725F, -0.0175F, 0.0873F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(0.0F, -0.0094F, 0.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(53, 23).addBox(2.6F, -0.0094F, 0.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8F, -0.65F, 2.65F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(0.0F, -0.0083F, -0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 40).addBox(2.6F, -0.0083F, -0.2886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.7F, 1.95F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(0.0F, 0.0217F, -0.0215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(32, 20).addBox(2.6F, 0.0217F, -0.0215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, -1.025F, 0.725F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 14).addBox(-0.5F, 1.479F, -0.3944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 0.9931F, 1.6675F, 0.2007F, 0.0F, 0.3491F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 33).addBox(-0.5F, -1.0065F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.1F, 0.9931F, 1.6675F, 0.2443F, 0.0F, 0.3491F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 42).addBox(-0.5658F, -0.513F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3F, 0.982F, 0.6123F, 0.5934F, 0.0F, 0.4363F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(69, 15).addBox(-0.5658F, 2.5142F, 0.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(69, 6).addBox(-0.5658F, 2.2142F, 0.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 70).addBox(-0.5658F, 1.9142F, 0.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3F, 0.982F, 0.6123F, 0.2007F, 0.0F, 0.4363F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(17, 44).addBox(-0.5658F, 0.7206F, -0.209F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(1.3F, 0.982F, 0.6123F, 0.3752F, 0.0F, 0.4363F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 5).addBox(-0.5F, -0.9638F, -0.6228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 0.9931F, 1.6675F, 0.4189F, 0.0F, 0.3491F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(69, 0).addBox(-1.0F, -0.8045F, -2.8202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.95F, -1.025F, 0.725F, 0.4625F, -0.0873F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 68).addBox(-1.0F, -0.5403F, -2.192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.95F, -1.025F, 0.725F, 0.3316F, -0.0873F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 26).addBox(-1.0F, -0.2447F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.95F, -1.025F, 0.725F, 0.1134F, -0.0873F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 53).addBox(-1.0F, -0.1533F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.95F, -1.025F, 0.725F, -0.0175F, -0.0873F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -0.0221F, -0.7133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 46).addBox(-1.0F, -0.0221F, 0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7F, 0.0648F, 1.1943F, -0.2356F, 0.0F, 0.2793F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 21).addBox(-1.0F, 0.575F, -0.1839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.0648F, 1.1943F, -1.2828F, 0.0F, 0.2793F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 43).addBox(-1.0F, 0.1472F, -0.7298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7F, 0.0648F, 1.1943F, -0.6283F, 0.0F, 0.2793F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-0.3349F, -0.9568F, 2.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6838F, -0.5796F, -4.0813F, -0.0397F, 0.0639F, 0.3932F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.4613F, -0.4082F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.7601F, 0.9526F, -0.1706F, 0.0639F, 0.3932F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 59).mirror().addBox(-0.3885F, -0.2244F, -0.4602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2233F, -0.5684F, 2.9434F, -0.2135F, 0.0839F, 0.3754F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 41).mirror().addBox(-0.4931F, 0.4008F, -0.5114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -1.626F, 1.5746F, 1.7498F, 0.0155F, 3.0912F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(39, 40).mirror().addBox(-0.5F, -2.4F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -1.626F, 1.5746F, 1.706F, 0.0197F, 3.0958F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 41).addBox(-0.5069F, 0.4008F, -0.5114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3293F, -1.626F, 1.5746F, 1.7498F, -0.0155F, -3.0912F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 40).addBox(-0.5F, -2.4F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3293F, -1.626F, 1.5746F, 1.706F, -0.0197F, -3.0958F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 59).addBox(-0.6115F, -0.2244F, -0.4602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2233F, -0.5684F, 2.9434F, -0.2135F, -0.0839F, -0.3754F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 51).addBox(-0.5387F, -0.4082F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2233F, -0.7601F, 0.9526F, -0.1706F, -0.0639F, -0.3932F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(69, 3).addBox(-0.6651F, -0.9568F, 2.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6838F, -0.5796F, -4.0813F, -0.0397F, -0.0639F, -0.3932F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.4393F, -0.0927F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(74, 0).addBox(0.0F, -0.8393F, -0.0927F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(0.0F, -0.9393F, 1.9073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 73).addBox(0.0F, -0.9393F, 3.9073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 3.5715F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition cube_r44 = tail1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(3, 73).addBox(0.0F, 2.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 22).addBox(0.0F, 1.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1607F, 0.4073F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-0.2031F, -0.3047F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5276F, 0.5163F, 0.3009F, -0.3767F, -0.1137F));

		PartDefinition cube_r46 = tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-0.2208F, -0.6571F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 1.6775F, 1.2518F, 0.3009F, 0.3767F, 0.1137F));

		PartDefinition cube_r47 = tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1513F, 0.1353F, 1.3331F, 0.0046F, 0.0839F, 0.3754F));

		PartDefinition cube_r48 = tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-0.209F, -0.5963F, -0.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 1.3478F, 2.5466F, 0.2074F, -0.3851F, -0.0789F));

		PartDefinition cube_r49 = tail1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.219F, -0.602F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 1.3478F, 2.5466F, 0.2074F, 0.3851F, 0.0789F));

		PartDefinition cube_r50 = tail1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(65, 65).mirror().addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7658F, -0.1576F, 4.3206F, 0.0046F, -0.0034F, 0.375F));

		PartDefinition cube_r51 = tail1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 68).mirror().addBox(0.0632F, -0.4972F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 1.1198F, 4.6365F, 0.1133F, -0.3904F, -0.0433F));

		PartDefinition cube_r52 = tail1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(0.0632F, -0.5028F, -0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 1.1198F, 4.6365F, 0.1133F, 0.3904F, 0.0433F));

		PartDefinition cube_r53 = tail1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.5008F, 0.9912F, -0.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(55, 32).mirror().addBox(-0.5008F, 0.4912F, -0.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3606F, -1.1549F, 3.3547F, 1.4461F, -0.0194F, 3.0912F));

		PartDefinition cube_r54 = tail1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(41, 22).mirror().addBox(-0.5008F, -2.5046F, -0.52F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3606F, -1.1549F, 3.3547F, 1.577F, -0.0194F, 3.0912F));

		PartDefinition cube_r55 = tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 55).addBox(-0.4992F, 0.9912F, -0.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(55, 32).addBox(-0.4992F, 0.4912F, -0.3159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3606F, -1.1549F, 3.3547F, 1.4461F, 0.0194F, -3.0912F));

		PartDefinition cube_r56 = tail1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 22).addBox(-0.4992F, -2.5046F, -0.52F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3606F, -1.1549F, 3.3547F, 1.577F, 0.0194F, -3.0912F));

		PartDefinition cube_r57 = tail1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 24).addBox(-1.0632F, -0.5028F, -0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 1.1198F, 4.6365F, 0.1133F, -0.3904F, -0.0433F));

		PartDefinition cube_r58 = tail1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(40, 68).addBox(-1.0632F, -0.4972F, -0.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 1.1198F, 4.6365F, 0.1133F, 0.3904F, 0.0433F));

		PartDefinition cube_r59 = tail1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(20, 68).addBox(-0.781F, -0.602F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 1.3478F, 2.5466F, 0.2074F, -0.3851F, -0.0789F));

		PartDefinition cube_r60 = tail1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(68, 21).addBox(-0.791F, -0.5963F, -0.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 1.3478F, 2.5466F, 0.2074F, 0.3851F, 0.0789F));

		PartDefinition cube_r61 = tail1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(60, 67).addBox(-0.7792F, -0.6571F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 1.6775F, 1.2518F, 0.3009F, -0.3767F, -0.1137F));

		PartDefinition cube_r62 = tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(67, 42).addBox(-0.7969F, -0.3047F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.4F, 1.5276F, 0.5163F, 0.3009F, 0.3767F, 0.1137F));

		PartDefinition cube_r63 = tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 62).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7658F, -0.1576F, 4.3206F, 0.0046F, 0.0034F, -0.375F));

		PartDefinition cube_r64 = tail1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(59, 27).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1513F, 0.1353F, 1.3331F, 0.0046F, -0.0839F, -0.3754F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5017F, -0.0739F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F))
				.texOffs(27, 74).addBox(0.0F, -1.1017F, -0.0739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 74).addBox(0.0F, -1.0017F, 1.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 15).addBox(0.0F, -0.8017F, 3.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(0.0F, -0.7017F, 5.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0647F, 5.9274F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r65 = tail2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(21, 74).addBox(0.0F, 6.3F, 9.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 74).addBox(0.0F, 5.0F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 74).addBox(0.0F, 3.5F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0461F, -5.5227F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(0.2476F, -0.3972F, -1.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(69, 33).mirror().addBox(1.106F, -0.5797F, 0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(10, 69).mirror().addBox(2.0561F, -0.5623F, 2.5353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.733F, 0.7037F, 0.0189F, -0.3926F, -0.0072F));

		PartDefinition cube_r67 = tail2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(0.2483F, -0.4028F, 0.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(67, 39).mirror().addBox(-0.4253F, -0.5854F, 1.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(65, 59).mirror().addBox(-1.0059F, -0.5679F, 3.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.733F, 0.7037F, 0.0189F, 0.3926F, 0.0072F));

		PartDefinition cube_r68 = tail2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-0.4958F, -0.4394F, -2.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 50).mirror().addBox(-0.4958F, -0.5394F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 53).mirror().addBox(-0.4958F, -0.5394F, 1.5004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6273F, -0.2579F, 3.4004F, 0.0046F, 0.0403F, 0.3752F));

		PartDefinition cube_r69 = tail2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(0.6175F, -0.4972F, -1.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.5806F, 6.7026F, -0.0755F, -0.3917F, 0.0289F));

		PartDefinition cube_r70 = tail2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(0.6175F, -0.5028F, 0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.5806F, 6.7026F, -0.0755F, 0.3917F, -0.0289F));

		PartDefinition cube_r71 = tail2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.5515F, 2.2426F, 0.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.37F, -1.0523F, 3.7118F, 1.4887F, 0.0002F, 3.0934F));

		PartDefinition cube_r72 = tail2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(35, 53).mirror().addBox(-0.5863F, 2.3658F, 0.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.37F, -1.0523F, 3.7118F, 1.1828F, 0.0094F, 3.1059F));

		PartDefinition cube_r73 = tail2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-0.4662F, 0.5276F, -0.1547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.37F, -1.0523F, 3.7118F, 1.1393F, 0.0078F, 3.1033F));

		PartDefinition cube_r74 = tail2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.454F, 0.1762F, -0.4228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(56, 9).mirror().addBox(-0.454F, -1.8238F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(55, 53).mirror().addBox(-0.454F, -1.3238F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(50, 55).mirror().addBox(-0.454F, -3.1238F, -1.1228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(55, 50).mirror().addBox(-0.454F, -3.6238F, -1.1228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.37F, -1.0523F, 3.7118F, 1.4452F, -0.0019F, 3.0912F));

		PartDefinition cube_r75 = tail2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(35, 53).addBox(-0.4137F, 2.3658F, 0.8834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.37F, -1.0523F, 3.7118F, 1.1828F, -0.0094F, -3.1059F));

		PartDefinition cube_r76 = tail2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 9).addBox(-0.4485F, 2.2426F, 0.0148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.37F, -1.0523F, 3.7118F, 1.4887F, -0.0002F, -3.0934F));

		PartDefinition cube_r77 = tail2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5338F, 0.5276F, -0.1547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.37F, -1.0523F, 3.7118F, 1.1393F, -0.0078F, -3.1033F));

		PartDefinition cube_r78 = tail2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 56).addBox(-0.546F, 0.1762F, -0.4228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(55, 53).addBox(-0.546F, -1.3238F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(56, 9).addBox(-0.546F, -1.8238F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(55, 50).addBox(-0.546F, -3.6238F, -1.1228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(50, 55).addBox(-0.546F, -3.1238F, -1.1228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.37F, -1.0523F, 3.7118F, 1.4452F, 0.0019F, -3.0912F));

		PartDefinition cube_r79 = tail2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(69, 12).addBox(-1.6175F, -0.4972F, -1.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.5806F, 6.7026F, -0.0755F, 0.3917F, -0.0289F));

		PartDefinition cube_r80 = tail2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(65, 47).addBox(-1.6175F, -0.5028F, 0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.5806F, 6.7026F, -0.0755F, -0.3917F, 0.0289F));

		PartDefinition cube_r81 = tail2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 69).addBox(-3.0561F, -0.5623F, 2.5353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(69, 33).addBox(-2.106F, -0.5797F, 0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(25, 68).addBox(-1.2476F, -0.3972F, -1.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.733F, 0.7037F, 0.0189F, 0.3926F, 0.0072F));

		PartDefinition cube_r82 = tail2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(65, 59).addBox(0.0059F, -0.5679F, 3.8571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(67, 39).addBox(-0.5747F, -0.5854F, 1.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(46, 11).addBox(-1.2483F, -0.4028F, 0.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.733F, 0.7037F, 0.0189F, -0.3926F, -0.0072F));

		PartDefinition cube_r83 = tail2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(65, 53).addBox(-0.5042F, -0.5394F, 1.5004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 50).addBox(-0.5042F, -0.5394F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 54).addBox(-0.5042F, -0.4394F, -2.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6273F, -0.2579F, 3.4004F, 0.0046F, -0.0403F, -0.3752F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, -0.3589F, -0.0183F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1409F, 6.9235F, -0.1772F, 0.1719F, -0.0306F));

		PartDefinition cube_r84 = tail3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.1464F, -0.5F, -0.8536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2713F, 0.4585F, 1.7212F, -0.0986F, -0.783F, 0.0696F));

		PartDefinition cube_r85 = tail3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-0.0558F, -0.3781F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2713F, 0.3818F, 3.2326F, -0.0114F, -0.7878F, -0.0536F));

		PartDefinition cube_r86 = tail3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(1.1611F, -0.5134F, 0.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2713F, 0.3818F, 3.2326F, -0.0986F, -0.783F, 0.0696F));

		PartDefinition cube_r87 = tail3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5029F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.5965F, 4.8645F, 1.0084F, 0.003F, 3.1049F));

		PartDefinition cube_r88 = tail3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(27, 47).mirror().addBox(-0.4984F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.5965F, 4.8645F, 1.3144F, -0.0081F, 3.0941F));

		PartDefinition cube_r89 = tail3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(22, 47).mirror().addBox(-0.4984F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.6965F, 3.2645F, 1.3144F, -0.0081F, 3.0941F));

		PartDefinition cube_r90 = tail3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.5029F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.6965F, 3.2645F, 1.0084F, 0.003F, 3.1049F));

		PartDefinition cube_r91 = tail3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(30, 53).mirror().addBox(-0.5029F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.6965F, 1.4644F, 1.0084F, 0.003F, 3.1049F));

		PartDefinition cube_r92 = tail3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(40, 50).mirror().addBox(-0.4984F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.6965F, 1.4644F, 1.3144F, -0.0081F, 3.0941F));

		PartDefinition cube_r93 = tail3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(27, 47).addBox(-0.5016F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.5965F, 4.8645F, 1.3144F, 0.0081F, -3.0941F));

		PartDefinition cube_r94 = tail3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(54, 0).addBox(-0.4971F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.5965F, 4.8645F, 1.0084F, -0.003F, -3.1049F));

		PartDefinition cube_r95 = tail3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(22, 47).addBox(-0.5016F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.6965F, 3.2645F, 1.3144F, 0.0081F, -3.0941F));

		PartDefinition cube_r96 = tail3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 53).addBox(-0.4971F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.6965F, 3.2645F, 1.0084F, -0.003F, -3.1049F));

		PartDefinition cube_r97 = tail3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(30, 53).addBox(-0.4971F, -0.297F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.6965F, 1.4644F, 1.0084F, -0.003F, -3.1049F));

		PartDefinition cube_r98 = tail3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(40, 50).addBox(-0.5016F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3059F, -0.6965F, 1.4644F, 1.3144F, 0.0081F, -3.0941F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 48).addBox(-0.9442F, -0.3781F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2713F, 0.3818F, 3.2326F, -0.0114F, 0.7878F, 0.0536F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(49, 38).addBox(-2.1611F, -0.5134F, 0.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2713F, 0.3818F, 3.2326F, -0.0986F, 0.783F, -0.0696F));

		PartDefinition cube_r101 = tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(15, 69).addBox(-0.8536F, -0.5F, -0.8536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.2713F, 0.4585F, 1.7212F, -0.0986F, 0.783F, -0.0696F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4711F, 0.0008F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1023F, 5.8817F, -0.0088F, 0.1309F, -0.0011F));

		PartDefinition cube_r102 = tail4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(32, 47).addBox(-0.6059F, -0.7037F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.0941F, -0.4988F, 0.5828F, 1.3144F, 0.0081F, -3.0941F));

		PartDefinition cube_r103 = tail4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(45, 52).addBox(-0.6078F, 1.8215F, 0.9853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(52, 44).addBox(-0.6078F, 1.0215F, 0.4853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.0922F, -0.458F, 4.8435F, 1.052F, 0.0F, -3.1049F));

		PartDefinition cube_r104 = tail4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(52, 41).addBox(-0.6078F, 0.2339F, -0.0465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(5, 52).addBox(-0.6078F, -0.8662F, -0.4965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(0, 52).addBox(-0.6078F, -1.8662F, -0.9215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(51, 20).addBox(-0.6078F, -2.9662F, -1.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.0922F, -0.458F, 4.8435F, 1.1829F, 0.0F, -3.1049F));

		PartDefinition cube_r105 = tail4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(49, 31).mirror().addBox(2.2411F, -0.5985F, 1.2512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 0).mirror().addBox(3.3888F, -0.7228F, 2.3989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 46).mirror().addBox(4.6073F, -0.8471F, 3.4759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(5.6708F, -1.0163F, 4.398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(6.7343F, -1.1855F, 5.3201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2713F, 0.2796F, -2.6491F, -0.0986F, -0.783F, 0.0696F));

		PartDefinition cube_r106 = tail4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 46).addBox(-7.7343F, -1.1855F, 5.3201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 35).addBox(-6.6708F, -1.0163F, 4.398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 46).addBox(-5.6073F, -0.8471F, 3.4759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 0).addBox(-4.3888F, -0.7228F, 2.3989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 31).addBox(-3.2411F, -0.5985F, 1.2512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2713F, 0.2796F, -2.6491F, -0.0986F, 0.783F, -0.0696F));

		PartDefinition cube_r107 = tail4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(54, 3).addBox(-0.6059F, -0.397F, -0.4663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.0941F, -0.4988F, 0.5828F, 1.0084F, -0.003F, -3.1049F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.675F, 1.4084F, -1.125F, 0.2772F, 0.13F));

		PartDefinition cube_r108 = leftLeg1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 36).addBox(-2.1F, 2.3617F, -1.2937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, 0.109F, -0.0628F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(40, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.4F, -0.0845F, 1.5333F, 1.1391F, 0.1716F, 0.355F));

		PartDefinition cube_r110 = leftLeg1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 65).addBox(-0.2293F, -0.6F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.4F, 0.8429F, 0.8405F, 0.8879F, 0.5629F, 0.5806F));

		PartDefinition cube_r111 = leftLeg1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 30).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.4F, 1.5123F, -0.2205F, 0.5513F, 0.7056F, 0.3794F));

		PartDefinition cube_r112 = leftLeg1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(19, 37).addBox(-1.6F, -0.3673F, -0.3923F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, 0.109F, -0.0628F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.3987F, 1.4324F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(20, 30).addBox(0.3F, -0.0392F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 26).addBox(-0.7F, -0.0392F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.3248F, 4.5249F, -1.1772F, -0.1402F, -0.257F));

		PartDefinition cube_r114 = leftLeg3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 37).addBox(-0.5F, 4.8724F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6216F, -1.6655F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3026F, 1.3802F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftFoot.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(34, 24).addBox(1.0F, -1.9F, 1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5303F, 0.3468F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftToes.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(20, 26).addBox(1.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.675F, 1.4084F, -0.7026F, -0.0849F, -0.0998F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(0.1F, 2.3617F, -1.2937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.109F, -0.0628F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0845F, 1.5333F, 1.1391F, -0.1716F, -0.355F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.7707F, -0.6F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8429F, 0.8405F, 0.8879F, -0.5629F, -0.5806F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.5123F, -0.2205F, 0.5513F, -0.7056F, -0.3794F));

		PartDefinition cube_r121 = rightLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 37).mirror().addBox(0.6F, -0.3673F, -0.3923F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 0.109F, -0.0628F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.3987F, 1.4324F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(20, 30).mirror().addBox(-1.3F, -0.0392F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 26).mirror().addBox(-0.3F, -0.0392F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 1.3248F, 4.5249F, -0.0416F, 0.0253F, 0.1345F));

		PartDefinition cube_r123 = rightLeg3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.5F, 4.8724F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6216F, -1.6655F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3026F, 1.3802F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightFoot.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-3.0F, -1.9F, 1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5303F, 0.3468F));

		PartDefinition cube_r125 = rightToes.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(20, 26).mirror().addBox(-3.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition torso = hips.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.1F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r126 = torso.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(73, 21).addBox(-2.0F, -0.5629F, -0.0088F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = torso.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(74, 12).addBox(-2.0F, -0.475F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(-2.5F, -0.05F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, -0.7F, -6.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r128 = torso.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-0.5F, -0.9F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(20, 65).mirror().addBox(-0.5F, -0.9F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 65).mirror().addBox(-0.5F, -0.9F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(25, 65).addBox(4.3F, -0.9F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(60, 64).addBox(4.3F, -0.9F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(20, 65).addBox(4.3F, -0.9F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4F, 4.0718F, -3.9204F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r129 = torso.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.5385F, -0.5922F, -1.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6838F, 0.5204F, -2.9813F, 0.0039F, 0.0639F, 0.3932F));

		PartDefinition cube_r130 = torso.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-0.577F, -0.7282F, 0.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6838F, 0.5204F, -2.9813F, -0.0397F, 0.0639F, 0.3932F));

		PartDefinition cube_r131 = torso.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(59, 15).addBox(4.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4F, 2.4518F, -2.8344F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r132 = torso.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(67, 36).mirror().addBox(-0.5F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(67, 36).addBox(4.3F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(30, 65).addBox(4.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-2.4F, 2.753F, -0.9975F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r133 = torso.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 59).addBox(4.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4F, 1.7431F, -1.0744F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r134 = torso.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(-0.5F, 0.1908F, -0.5403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3633F, -1.1955F, -2.7526F, 1.616F, 0.0087F, 3.1289F));

		PartDefinition cube_r135 = torso.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.5F, -1.1859F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(0, 55).mirror().addBox(-0.5F, -1.6859F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3633F, -1.1955F, -2.7526F, 1.4851F, 0.0087F, 3.1289F));

		PartDefinition cube_r136 = torso.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, 0.1908F, -0.5403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3633F, -1.1955F, -2.7526F, 1.616F, -0.0087F, -3.1289F));

		PartDefinition cube_r137 = torso.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -1.1859F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(0, 55).addBox(-0.5F, -1.6859F, -0.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3633F, -1.1955F, -2.7526F, 1.4851F, -0.0087F, -3.1289F));

		PartDefinition cube_r138 = torso.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 6).addBox(-0.423F, -0.7282F, 0.4973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6838F, 0.5204F, -2.9813F, -0.0397F, -0.0639F, -0.3932F));

		PartDefinition cube_r139 = torso.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(64, 15).addBox(-0.4615F, -0.5922F, -1.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6838F, 0.5204F, -2.9813F, 0.0039F, -0.0639F, -0.3932F));

		PartDefinition cube_r140 = torso.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1483F, -0.5602F, -0.0862F, 0.0153F, -0.8745F));

		PartDefinition cube_r141 = torso.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1483F, -0.5602F, -0.0895F, -0.0017F, -1.3455F));

		PartDefinition cube_r142 = torso.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3483F, -2.5602F, -0.0862F, 0.0153F, -0.7175F));

		PartDefinition cube_r143 = torso.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3483F, -2.5602F, -0.0758F, -0.0475F, -1.7277F));

		PartDefinition cube_r144 = torso.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 26).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3483F, -2.5602F, -0.0895F, -0.0017F, -1.1884F));

		PartDefinition cube_r145 = torso.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(41, 30).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1483F, -0.5602F, -0.0895F, 0.0017F, 1.3455F));

		PartDefinition cube_r146 = torso.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(72, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1483F, -0.5602F, -0.0862F, -0.0153F, 0.8745F));

		PartDefinition cube_r147 = torso.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(72, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3483F, -2.5602F, -0.0862F, -0.0153F, 0.7175F));

		PartDefinition cube_r148 = torso.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 28).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3483F, -2.5602F, -0.0758F, 0.0475F, 1.7277F));

		PartDefinition cube_r149 = torso.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(41, 26).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3483F, -2.5602F, -0.0895F, 0.0017F, 1.1884F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1431F, -3.9826F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 57).mirror().addBox(-0.5F, -0.3012F, -0.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(-0.5F, -0.8012F, -0.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.8582F, -6.3425F, 1.3623F, -0.3153F, -0.5595F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-0.5F, -0.1709F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(40, 56).mirror().addBox(-0.5F, -0.7709F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.8582F, -6.3425F, 0.8387F, -0.3153F, -0.5595F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(35, 56).mirror().addBox(-1.3903F, -0.008F, -0.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 56).mirror().addBox(-1.3903F, -0.208F, -0.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(35, 56).addBox(2.4097F, -0.008F, -0.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 56).addBox(2.4097F, -0.208F, -0.2318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.0097F, 2.6954F, -6.2373F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(25, 56).mirror().addBox(-1.3903F, -1.0312F, -0.8644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 33).mirror().addBox(-1.3903F, -0.6312F, -0.2644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(25, 56).addBox(2.4097F, -1.0312F, -0.8644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 33).addBox(2.4097F, -0.6312F, -0.2644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0097F, 2.3954F, -5.6373F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-1.3903F, -0.252F, -0.1715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(5, 67).addBox(2.4097F, -0.252F, -0.1715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0097F, 0.7204F, -4.4123F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-1.3903F, -0.1957F, -0.1911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 67).addBox(2.4097F, -0.1957F, -0.1911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0097F, 1.0204F, -4.9123F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1948F, -6.3776F, 0.0433F, 0.2245F, -1.3132F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1948F, -6.3776F, 0.1351F, 0.1568F, -0.8379F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(72, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1052F, -4.4776F, 0.0238F, 0.0865F, -0.642F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(17, 42).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1052F, -4.4776F, -0.0239F, 0.1116F, -1.115F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1052F, -4.4776F, -0.0781F, 0.0834F, -1.658F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 10).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -0.5776F, -0.0758F, -0.0475F, -1.6405F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(41, 9).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -0.5776F, -0.0895F, -0.0017F, -1.1011F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -0.5776F, -0.0862F, 0.0153F, -0.6302F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.5776F, -0.0496F, 0.0391F, -0.5768F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(39, 12).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.5776F, -0.0677F, 0.0361F, -1.0484F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(11, 31).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.5776F, -0.0766F, -0.0039F, -1.5881F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 4).mirror().addBox(-3.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4132F, 4.2996F, -4.5325F, -0.1331F, 1.0804F, -0.1962F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(39, 3).mirror().addBox(-1.8731F, 0.0376F, -0.6182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4591F, 4.0958F, -4.4529F, 0.1635F, 0.5448F, 0.0659F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -0.5776F, -0.0862F, -0.0153F, 0.6302F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(41, 9).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -0.5776F, -0.0895F, 0.0017F, 1.1011F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(32, 10).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -0.5776F, -0.0758F, 0.0475F, 1.6405F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(70, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1948F, -6.3776F, 0.1351F, -0.1568F, 0.8379F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 44).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1948F, -6.3776F, 0.0433F, -0.2245F, 1.3132F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 42).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1052F, -4.4776F, -0.0781F, -0.0834F, 1.658F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(17, 42).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1052F, -4.4776F, -0.0239F, -0.1116F, 1.115F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(72, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1052F, -4.4776F, 0.0238F, -0.0865F, 0.642F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.5776F, -0.0496F, -0.0391F, 0.5768F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(39, 12).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.5776F, -0.0677F, -0.0361F, 1.0484F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(11, 31).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.5776F, -0.0766F, 0.0039F, 1.5881F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5F, -0.775F, -1.9305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 73).addBox(-0.5F, -0.675F, -3.9305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-1.0F, -0.275F, -3.9305F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3164F, -3.0259F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 16).addBox(-1.0F, -1.0538F, -0.3115F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5836F, -6.5259F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(73, 24).addBox(-1.5F, -0.7796F, 3.6754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 24).mirror().addBox(-4.4F, 2.3204F, 5.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(58, 24).addBox(0.4F, 2.3204F, 5.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(11, 26).addBox(-2.0F, -0.2796F, 3.6754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.4307F, -6.6507F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(15, 57).addBox(-0.5F, -0.3012F, -0.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 57).addBox(-0.5F, -0.8012F, -0.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4F, 2.8582F, -6.3425F, 1.3623F, 0.3153F, 0.5595F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(55, 56).addBox(-0.5F, -0.1709F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(40, 56).addBox(-0.5F, -0.7709F, -0.4307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4F, 2.8582F, -6.3425F, 0.8387F, 0.3153F, 0.5595F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.5F, -0.4285F, -1.7354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(50, 64).mirror().addBox(-0.5F, -0.4285F, -1.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.5099F, -3.5514F, -0.3316F, -0.1309F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.4F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(59, 12).mirror().addBox(-0.4F, -0.5F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.1174F, -4.8704F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(-0.3F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(59, 0).mirror().addBox(-0.3F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0069F, 0.7628F, -4.6757F, 0.1063F, -0.1736F, 0.3743F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-0.5F, -0.7849F, 0.2868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.7461F, -2.7844F, -0.0262F, 0.0F, 0.3927F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(45, 58).addBox(4.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4F, 2.5007F, -2.4506F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, -0.369F, 0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(64, 27).mirror().addBox(-0.5F, -0.369F, 0.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 3.5099F, -3.5514F, -0.1571F, -0.1309F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(46, 22).mirror().addBox(-0.5451F, 0.3971F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, -1.2942F, -2.0495F, 1.226F, 0.0197F, 3.0958F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-0.5451F, 0.1694F, -0.3388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, -1.2942F, -2.0495F, 1.3569F, 0.0197F, 3.0958F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-0.4672F, -1.0412F, -0.9702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, -1.2942F, -2.0495F, 0.9647F, 0.006F, 3.0832F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-0.4672F, -1.354F, -0.8905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3936F, -1.2942F, -2.0495F, 1.0956F, 0.006F, 3.0832F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-2.5947F, -0.5626F, -0.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-2.4916F, -0.9018F, -4.6541F, 1.1819F, 0.0031F, 3.0704F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(50, 34).mirror().addBox(-2.6227F, -0.3773F, -0.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(30, 50).mirror().addBox(-2.6227F, -0.1023F, -0.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -0.9073F, -4.6361F, 0.3965F, 0.0031F, 3.0704F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-2.6227F, -0.3479F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -0.9073F, -4.6361F, 0.5274F, 0.0031F, 3.0704F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-2.6227F, -0.3479F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -0.7073F, -6.2361F, 0.5274F, 0.0031F, 3.0704F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-2.6227F, -0.3023F, -0.3693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -0.7073F, -6.2361F, 0.3965F, 0.0031F, 3.0704F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 34).addBox(1.6227F, -0.3773F, -0.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(30, 50).addBox(1.6227F, -0.1023F, -0.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -0.9073F, -4.6361F, 0.3965F, -0.0031F, -3.0704F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(15, 51).addBox(-0.4549F, 0.1694F, -0.3388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3936F, -1.2942F, -2.0495F, 1.3569F, -0.0197F, -3.0958F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(46, 22).addBox(-0.4549F, 0.3971F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3936F, -1.2942F, -2.0495F, 1.226F, -0.0197F, -3.0958F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(48, 28).addBox(-0.5328F, -1.354F, -0.8905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3936F, -1.2942F, -2.0495F, 1.0956F, -0.006F, -3.0832F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(35, 50).addBox(-0.5328F, -1.0412F, -0.9702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3936F, -1.2942F, -2.0495F, 0.9647F, -0.006F, -3.0832F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(49, 17).addBox(1.5947F, -0.5626F, -0.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(2.4916F, -0.9018F, -4.6541F, 1.1819F, -0.0031F, -3.0704F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(48, 25).addBox(1.6227F, -0.3479F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -0.9073F, -4.6361F, 0.5274F, -0.0031F, -3.0704F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(15, 48).addBox(1.6227F, -0.3479F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -0.7073F, -6.2361F, 0.5274F, -0.0031F, -3.0704F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(25, 50).addBox(1.6227F, -0.3023F, -0.3693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -0.7073F, -6.2361F, 0.3965F, -0.0031F, -3.0704F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(30, 4).addBox(0.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4132F, 4.2996F, -4.5325F, -0.1331F, -1.0804F, 0.1962F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(39, 3).addBox(-0.1269F, 0.0376F, -0.6182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4591F, 4.0958F, -4.4529F, 0.1635F, -0.5448F, -0.0659F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 73).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4486F, -0.4727F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(59, 3).addBox(-0.5F, -0.7849F, 0.2868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, 0.7461F, -2.7844F, -0.0262F, 0.0F, -0.3927F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(59, 6).addBox(-0.7F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 0).addBox(-0.7F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0069F, 0.7628F, -4.6757F, 0.1063F, 0.1736F, -0.3743F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(59, 12).addBox(-0.6F, -0.5F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 58).addBox(-0.6F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, 2.1174F, -4.8704F, -0.1595F, 0.1724F, -0.0276F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(45, 64).addBox(-0.5F, -0.4285F, -1.7354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(50, 64).addBox(-0.5F, -0.4285F, -1.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2F, 3.5099F, -3.5514F, -0.3316F, 0.1309F, 0.0F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, -0.369F, 0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(64, 27).addBox(-0.5F, -0.369F, 0.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2F, 3.5099F, -3.5514F, -0.1571F, 0.1309F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.211F, -6.5712F, 0.6863F, -0.1396F, 0.1682F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(20, 50).mirror().addBox(-2.6483F, 0.126F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.8183F, -0.0649F, 1.7489F, 0.0702F, 3.1292F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-2.6483F, 0.4932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(49, 6).mirror().addBox(-2.6483F, 0.0932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.8183F, -0.0649F, 1.8798F, 0.0702F, 3.1292F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.4777F, 0.711F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(44, 0).mirror().addBox(-0.4777F, 0.211F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.24F, -0.2286F, -1.1677F, -0.7302F, 0.6996F, 0.4045F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(32, 44).mirror().addBox(-0.4777F, 0.666F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(44, 32).mirror().addBox(-0.4777F, 0.166F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.24F, -0.1286F, -1.0677F, -0.9047F, 0.6996F, 0.4045F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.4777F, -0.2594F, -0.6817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.24F, -0.1286F, -1.0677F, -0.512F, 0.6996F, 0.4045F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(27, 44).mirror().addBox(-0.4777F, -0.3505F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-1.24F, -0.2286F, -1.1677F, -0.3811F, 0.6996F, 0.4045F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(49, 14).addBox(1.6483F, 0.4932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(49, 6).addBox(1.6483F, 0.0932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -1.8183F, -0.0649F, 1.8798F, -0.0702F, -3.1292F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(32, 44).addBox(-0.5223F, 0.666F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(44, 32).addBox(-0.5223F, 0.166F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.24F, -0.1286F, -1.0677F, -0.9047F, -0.6996F, -0.4045F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(27, 44).addBox(-0.5223F, -0.3505F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(1.24F, -0.2286F, -1.1677F, -0.3811F, -0.6996F, -0.4045F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5223F, -0.2594F, -0.6817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.24F, -0.1286F, -1.0677F, -0.512F, -0.6996F, -0.4045F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(22, 44).addBox(-0.5223F, 0.711F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(44, 0).addBox(-0.5223F, 0.211F, -0.672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.24F, -0.2286F, -1.1677F, -0.7302F, -0.6996F, -0.4045F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(19, 6).addBox(-2.24F, -1.5743F, -0.7374F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.74F, -0.1286F, -1.0677F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(20, 50).addBox(1.6483F, 0.126F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -1.8183F, -0.0649F, 1.7489F, -0.0702F, -3.1292F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(74, 3).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5791F, -0.1684F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(25, 33).addBox(-0.5F, -0.3133F, 1.5278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.5391F, -0.7008F, -1.3614F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6543F, -0.2611F, -0.9157F, 0.1618F, -0.2067F));

		PartDefinition cube_r232 = neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-2.6483F, -0.4068F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(5, 49).mirror().addBox(-2.6483F, 0.0932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.2641F, -0.4038F, 1.1372F, 0.0433F, 3.085F));

		PartDefinition cube_r233 = neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-2.6483F, -0.374F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(47, 49).mirror().addBox(-2.6483F, 0.126F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.2641F, -0.4038F, 1.0063F, 0.0433F, 3.085F));

		PartDefinition cube_r234 = neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-0.4257F, -0.2731F, -0.5246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, 0.7859F, -0.8288F, 0.2624F, 0.3416F, 0.862F));

		PartDefinition cube_r235 = neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.4257F, -0.3436F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, 0.7859F, -0.8288F, 0.3933F, 0.3416F, 0.862F));

		PartDefinition cube_r236 = neck3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(37, 47).mirror().addBox(-0.5F, -0.5727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(42, 47).mirror().addBox(-0.5F, -0.2727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 1.3211F, -0.7294F, -0.1303F, 0.3416F, 0.862F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(37, 44).mirror().addBox(-0.5F, -0.5305F, -0.6229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 1.3211F, -0.7294F, 0.0443F, 0.3416F, 0.862F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(66, 18).addBox(1.6483F, -0.374F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(47, 49).addBox(1.6483F, 0.126F, -0.2432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -1.2641F, -0.4038F, 1.0063F, -0.0433F, -3.085F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(20, 53).addBox(1.6483F, -0.4068F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(5, 49).addBox(1.6483F, 0.0932F, -0.373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -1.2641F, -0.4038F, 1.1372F, -0.0433F, -3.085F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(42, 47).addBox(-0.5F, -0.2727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(37, 47).addBox(-0.5F, -0.5727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.2939F, 1.3211F, -0.7294F, -0.1303F, -0.3416F, -0.862F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(12, 45).addBox(-0.5743F, -0.3436F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.8452F, 0.7859F, -0.8288F, 0.3933F, -0.3416F, -0.862F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 56).addBox(-0.5743F, -0.2731F, -0.5246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8452F, 0.7859F, -0.8288F, 0.2624F, -0.3416F, -0.862F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(37, 44).addBox(-0.5F, -0.5305F, -0.6229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.2939F, 1.3211F, -0.7294F, 0.0443F, -0.3416F, -0.862F));

		PartDefinition cube_r244 = neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 0).addBox(-1.8452F, -0.137F, -0.1192F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8452F, -0.7141F, -0.4288F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(60, 30).addBox(-0.5F, -0.0744F, 1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6749F, -1.9219F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8231F, -1.183F, -0.4264F, 0.132F, -0.0248F));

		PartDefinition cube_r246 = neck4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-2.6351F, -0.6898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(50, 52).mirror().addBox(-2.6351F, -0.1898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.3409F, -1.2208F, 0.5274F, 0.0031F, 3.0704F));

		PartDefinition cube_r247 = neck4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-2.6351F, -0.1362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(30, 68).mirror().addBox(-2.6351F, -0.6362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.3409F, -1.2208F, 0.3965F, 0.0031F, 3.0704F));

		PartDefinition cube_r248 = neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-2.6351F, 0.2102F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(65, 68).mirror().addBox(-2.6351F, -0.6898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(10, 66).mirror().addBox(-2.6351F, -0.1898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.1409F, -0.0208F, 0.7886F, 0.0214F, 3.0736F));

		PartDefinition cube_r249 = neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-2.6351F, -0.1362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 30).mirror().addBox(-2.6351F, -0.6362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, -1.1409F, -0.0208F, 0.6577F, 0.0214F, 3.0736F));

		PartDefinition cube_r250 = neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 43).mirror().addBox(-0.5F, -0.2727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(47, 46).mirror().addBox(-0.5F, -0.5727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 1.3442F, -0.7464F, -0.1303F, 0.3416F, 0.862F));

		PartDefinition cube_r251 = neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.4257F, -0.2731F, -0.5246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, 0.8091F, -0.8458F, 0.2624F, 0.3416F, 0.862F));

		PartDefinition cube_r252 = neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(10, 48).mirror().addBox(-0.4257F, -0.3436F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.8452F, 0.8091F, -0.8458F, 0.3933F, 0.3416F, 0.862F));

		PartDefinition cube_r253 = neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(44, 40).mirror().addBox(-0.5F, -0.5305F, -0.6229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.2939F, 1.3442F, -0.7464F, 0.0443F, 0.3416F, 0.862F));

		PartDefinition cube_r254 = neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(70, 30).addBox(1.6351F, -0.6362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 70).addBox(1.6351F, -0.1362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -1.1409F, -0.0208F, 0.6577F, -0.0214F, -3.0736F));

		PartDefinition cube_r255 = neck4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(65, 68).addBox(1.6351F, -0.6898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(15, 66).addBox(1.6351F, 0.2102F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(10, 66).addBox(1.6351F, -0.1898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -1.1409F, -0.0208F, 0.7886F, -0.0214F, -3.0736F));

		PartDefinition cube_r256 = neck4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 52).addBox(1.6351F, -0.1898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(54, 37).addBox(1.6351F, -0.6898F, -0.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.5202F, -1.3409F, -1.2208F, 0.5274F, -0.0031F, -3.0704F));

		PartDefinition cube_r257 = neck4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(54, 29).addBox(1.6351F, -0.1362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(30, 68).addBox(1.6351F, -0.6362F, -0.4195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5202F, -1.3409F, -1.2208F, 0.3965F, -0.0031F, -3.0704F));

		PartDefinition cube_r258 = neck4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(64, 12).addBox(-0.5F, -0.1111F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3534F, -0.6757F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(44, 40).addBox(-0.5F, -0.5305F, -0.6229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.2939F, 1.3442F, -0.7464F, 0.0443F, -0.3416F, -0.862F));

		PartDefinition cube_r260 = neck4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(55, 68).addBox(-0.5743F, -0.2731F, -0.5246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8452F, 0.8091F, -0.8458F, 0.2624F, -0.3416F, -0.862F));

		PartDefinition cube_r261 = neck4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 48).addBox(-0.5743F, -0.3436F, -0.6651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.8452F, 0.8091F, -0.8458F, 0.3933F, -0.3416F, -0.862F));

		PartDefinition cube_r262 = neck4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(47, 46).addBox(-0.5F, -0.5727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(47, 43).addBox(-0.5F, -0.2727F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2939F, 1.3442F, -0.7464F, -0.1303F, -0.3416F, -0.862F));

		PartDefinition cube_r263 = neck4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(32, 12).addBox(-1.0F, -1.1F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2768F, -0.6773F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r264 = neck4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(74, 6).addBox(0.0F, -0.525F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0825F, -0.2181F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(60, 49).addBox(-0.5F, -0.7853F, 0.9437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0534F, -1.7757F, -0.3665F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.0291F, -1.933F, 0.6939F, 0.084F, -0.1005F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-1.0F, -0.2107F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 71).addBox(0.0F, -0.2107F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(12, 38).addBox(-1.0F, -0.1608F, -0.854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.1F, -0.8545F, 0.7122F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-1.0F, -0.2399F, -0.8253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 70).addBox(0.0F, -0.2399F, -0.8253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 33).addBox(-1.0F, -0.1649F, -0.8753F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1F, -1.3545F, 0.2622F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-1.0F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(44, 18).addBox(0.0F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.1F, -0.0331F, -0.3047F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-1.0F, -0.1099F, -0.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(25, 71).mirror().addBox(-1.0F, -0.3099F, -0.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(30, 71).addBox(0.35F, -0.1099F, -0.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(25, 71).addBox(0.35F, -0.3099F, -0.3139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.275F, -0.3922F, -0.4837F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-1.0F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 71).addBox(0.35F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, -0.2974F, -0.1723F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-1.0F, -0.7022F, -0.3377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(20, 71).addBox(0.35F, -0.7022F, -0.3377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.275F, -0.3922F, -0.4587F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-1.0F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(70, 69).addBox(0.35F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.275F, -0.8672F, -0.1337F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-1.0F, -0.2986F, -0.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(71, 18).mirror().addBox(-1.0F, 0.1014F, -0.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(71, 18).addBox(0.35F, 0.1014F, -0.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(71, 9).addBox(0.35F, -0.2986F, -0.3075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, -1.0422F, 0.1413F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-1.0F, -0.2706F, -0.3122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 71).addBox(0.35F, -0.2706F, -0.3122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.275F, -1.1672F, -0.2337F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-1.0F, -0.2528F, -0.7435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(70, 63).addBox(0.25F, -0.2528F, -0.7435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.225F, -0.1861F, -1.3276F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-1.0F, -0.255F, -0.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false)
				.texOffs(70, 60).addBox(0.25F, -0.255F, -0.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-0.225F, -0.3361F, -0.8526F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(60, 70).mirror().addBox(-1.0F, -0.3105F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(60, 70).addBox(0.25F, -0.3105F, -0.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.225F, -0.3111F, -0.9026F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(70, 57).mirror().addBox(-1.0F, -0.2595F, -0.2641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(70, 57).addBox(0.25F, -0.2595F, -0.2641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.225F, -1.1861F, -1.3026F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(70, 54).mirror().addBox(-1.0F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 54).addBox(0.25F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.225F, -0.7861F, -1.3776F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 72).mirror().addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 72).addBox(0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 71).addBox(0.775F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.725F, -0.7494F, -1.365F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-1.0F, -0.2354F, -0.7582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false)
				.texOffs(70, 66).addBox(0.25F, -0.2354F, -0.7582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-0.225F, -0.3611F, -1.7776F, -2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(-0.5F, -0.4757F, -0.6091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.441F, -3.4554F, -2.8449F, -0.0611F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-0.5F, -0.4712F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.441F, -3.4554F, -2.3649F, -0.0611F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(31, 37).addBox(-1.0F, -0.1834F, -0.6553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1F, -0.8545F, 0.5122F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, 0.5344F, -0.8632F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(37, 0).addBox(-1.0F, -0.1656F, -0.8632F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -1.5045F, -1.2628F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(24, 37).addBox(-1.0F, -0.2028F, -0.9763F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(37, 6).addBox(-1.0F, -0.2028F, -0.7763F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 37).addBox(-1.0F, 0.4971F, -0.7763F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.1F, -1.3545F, -0.4628F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(70, 51).addBox(-0.5F, -0.4757F, -0.6091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.3F, -0.441F, -3.4554F, -2.8449F, 0.0611F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(50, 70).addBox(-0.5F, -0.4712F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3F, -0.441F, -3.4554F, -2.3649F, 0.0611F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0838F, -2.3755F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5251F, -1.4493F, -1.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 58).addBox(-0.3751F, -0.8493F, -1.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0001F, 0.0737F, 1.3693F, -0.061F, 0.0522F, 0.0037F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.3957F, -0.8375F, -0.0885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7001F, 0.2737F, -0.1307F, 0.3012F, -0.0522F, -0.0043F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(-0.3977F, -0.6939F, -0.8385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7001F, 0.1237F, -0.1057F, 0.0394F, -0.0522F, -0.0043F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.4177F, -0.2537F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6477F, -0.389F, -1.5875F, 1.1304F, -0.0506F, -0.0133F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(25, 62).mirror().addBox(-0.4884F, -0.1994F, -0.7994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6477F, -0.789F, -1.1125F, 0.6935F, -0.0515F, 0.0093F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6477F, -0.514F, -0.9375F, 0.1699F, -0.0515F, 0.0093F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.361F, -0.8164F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, 0.1737F, -0.8057F, -0.2228F, -0.0515F, 0.0093F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.3653F, -0.1672F, -0.2271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, -0.8263F, -0.8057F, 0.2575F, -0.0522F, -0.0043F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.3977F, -0.8439F, -0.8385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, 0.1237F, -0.1057F, 0.0394F, -0.0522F, -0.0043F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-0.4271F, -0.1423F, -0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, -1.2513F, 0.3443F, 0.2575F, -0.0522F, -0.0043F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(-0.392F, -0.151F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, -0.9763F, -0.3057F, 0.3884F, -0.0522F, -0.0043F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.4307F, -0.8512F, -0.7705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, 0.0237F, 0.5193F, 0.1703F, -0.0522F, -0.0043F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(61, 18).addBox(-0.5729F, -0.1423F, -0.1326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0001F, -1.2513F, 0.3443F, 0.2575F, 0.0522F, 0.0043F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(61, 9).addBox(-0.608F, -0.151F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0001F, -0.9763F, -0.3057F, 0.3884F, 0.0522F, 0.0043F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(50, 61).addBox(-0.6347F, -0.1672F, -0.2271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0001F, -0.8263F, -0.8057F, 0.2575F, 0.0522F, 0.0043F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(30, 62).addBox(-0.5823F, -0.2537F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1523F, -0.389F, -1.5875F, 1.1304F, 0.0506F, 0.0133F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(25, 62).addBox(-0.5116F, -0.1994F, -0.7994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1523F, -0.789F, -1.1125F, 0.6935F, 0.0515F, -0.0093F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(20, 62).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1523F, -0.514F, -0.9375F, 0.1699F, 0.0515F, -0.0093F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(60, 61).addBox(-0.639F, -0.8164F, -0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0001F, 0.1737F, -0.8057F, -0.2228F, 0.0515F, -0.0093F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(35, 62).addBox(-0.6023F, -0.6939F, -0.8385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0999F, 0.1237F, -0.1057F, 0.0394F, 0.0522F, 0.0043F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(45, 61).addBox(-0.6023F, -0.8439F, -0.8385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0001F, 0.1237F, -0.1057F, 0.0394F, 0.0522F, 0.0043F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(62, 38).addBox(-0.6043F, -0.8375F, -0.0885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0999F, 0.2737F, -0.1307F, 0.3012F, 0.0522F, 0.0043F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(5, 61).addBox(-0.5693F, -0.8512F, -0.7705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0001F, 0.0237F, 0.5193F, 0.1703F, 0.0522F, 0.0043F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-0.6249F, -0.8493F, -1.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8001F, 0.0737F, 1.3693F, -0.061F, -0.0522F, -0.0037F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(34, 30).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0921F, -0.2865F, 1.1901F, -0.061F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(34, 27).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1008F, -0.0218F, 1.8529F, -0.5846F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(60, 52).addBox(0.0F, 0.0583F, -0.8706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, -1.0589F, 2.639F, 0.48F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.8017F, -0.481F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-0.25F, -0.971F, -1.2664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(40, 59).mirror().addBox(-0.25F, -0.971F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.2007F, -0.1309F, 0.1309F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-0.25F, -0.9946F, -0.2946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, 0.0611F, -0.1309F, 0.1309F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.3F, 0.9331F, -1.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1871F, -1.7438F, -1.5097F, -0.1309F, 0.1309F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.3F, 0.2696F, -1.7595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1871F, -1.7438F, -0.9861F, -0.1309F, 0.1309F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-0.3F, 0.556F, -1.8291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1871F, -1.7438F, -1.2043F, -0.1309F, 0.1309F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.3F, -0.8336F, -2.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1871F, -1.7438F, -0.3752F, -0.1309F, 0.1309F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(64, 3).mirror().addBox(-0.3F, -0.3506F, -1.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1871F, -1.7438F, -0.6807F, -0.1309F, 0.1309F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.3F, -0.631F, -1.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-0.3F, -0.506F, -1.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(63, 24).mirror().addBox(-0.3F, -0.506F, -1.5026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.4189F, -0.1309F, 0.1309F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(63, 21).mirror().addBox(-0.3F, -0.6897F, -1.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.3752F, -0.1309F, 0.1309F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.3F, -0.7935F, -1.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.2443F, -0.1309F, 0.1309F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(10, 63).mirror().addBox(-0.3F, -0.3148F, -1.1915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.637F, -0.1309F, 0.1309F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-0.3F, -0.4597F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(62, 44).mirror().addBox(-0.3F, -0.8597F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.0262F, -0.1309F, 0.1309F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-0.3F, -0.2924F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, -0.6807F, -0.1309F, 0.1309F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-0.3F, -0.8557F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.1871F, -1.7438F, 0.2182F, -0.1309F, 0.1309F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(29, 40).mirror().addBox(-0.5F, -1.7016F, -0.6997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(29, 40).addBox(0.7F, -1.7016F, -0.6997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.1F, 0.2879F, -2.0438F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-1.0F, -0.2945F, -0.7013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 54).addBox(0.2F, -0.2945F, -0.7013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, -0.9181F, -0.9573F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-1.0F, -0.3251F, -0.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(54, 12).addBox(0.2F, -0.3251F, -0.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6F, -0.7931F, -0.5823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-0.5F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 32).mirror().addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(52, 47).addBox(0.7F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 32).addBox(0.7F, -0.525F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-1.1F, 0.3379F, -0.3438F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(24, 40).mirror().addBox(-0.5F, -1.7083F, -0.7097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(24, 40).addBox(0.7F, -1.7083F, -0.7097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, 0.6129F, -1.7938F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(39, 33).mirror().addBox(-0.5F, -1.6784F, -0.7117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(39, 33).addBox(0.7F, -1.6784F, -0.7117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1F, 0.8129F, -1.4438F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-1.0F, -0.2955F, -0.7186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(39, 18).addBox(0.2F, -0.2955F, -0.7186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.6F, -0.4931F, -0.2823F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(39, 14).mirror().addBox(-1.0F, -0.2862F, -0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(39, 14).addBox(0.2F, -0.2862F, -0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.6F, -0.2681F, -0.1073F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(42, 44).mirror().addBox(-1.0F, -0.2735F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 44).addBox(0.2F, -0.2735F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, -0.1931F, 0.1177F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(70, 45).mirror().addBox(-1.0F, -0.7004F, -0.6486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(70, 45).addBox(0.2F, -0.7004F, -0.6486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.6F, 0.4069F, 0.1427F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(49, 3).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(49, 3).addBox(0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.6F, 0.1319F, 0.1427F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(40, 62).addBox(-0.7F, -0.8557F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, 0.2182F, 0.1309F, -0.1309F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(55, 62).addBox(-0.7F, -0.4597F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(62, 44).addBox(-0.7F, -0.8597F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.0262F, 0.1309F, -0.1309F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(55, 59).addBox(-0.75F, -0.971F, -1.2664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 59).addBox(-0.75F, -0.971F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.2007F, 0.1309F, -0.1309F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(59, 35).addBox(-0.75F, -0.9946F, -0.2946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, 0.0611F, 0.1309F, -0.1309F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 21).addBox(-0.7F, -0.6897F, -1.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.3752F, 0.1309F, -0.1309F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(15, 63).addBox(-0.7F, -0.7935F, -1.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.2443F, 0.1309F, -0.1309F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(66, 9).addBox(-0.7F, 0.2696F, -1.7595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.2F, -0.1871F, -1.7438F, -0.9861F, 0.1309F, -0.1309F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(54, 15).addBox(-0.7F, 0.556F, -1.8291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, -0.1871F, -1.7438F, -1.2043F, 0.1309F, -0.1309F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(64, 6).addBox(-0.7F, 0.9331F, -1.6756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.2F, -0.1871F, -1.7438F, -1.5097F, 0.1309F, -0.1309F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(5, 64).addBox(-0.7F, -0.8336F, -2.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.2F, -0.1871F, -1.7438F, -0.3752F, 0.1309F, -0.1309F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(64, 3).addBox(-0.7F, -0.3506F, -1.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.2F, -0.1871F, -1.7438F, -0.6807F, 0.1309F, -0.1309F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(64, 0).addBox(-0.7F, -0.631F, -1.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 64).addBox(-0.7F, -0.506F, -1.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 24).addBox(-0.7F, -0.506F, -1.5026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.4189F, 0.1309F, -0.1309F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(10, 63).addBox(-0.7F, -0.3148F, -1.1915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.637F, 0.1309F, -0.1309F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(62, 41).addBox(-0.7F, -0.2924F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.25F, -0.1871F, -1.7438F, -0.6807F, 0.1309F, -0.1309F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8168F, 3.2754F, -5.8974F, -0.2618F, 0.2182F, 0.0F));

		PartDefinition cube_r355 = leftArm1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(60, 55).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0308F, 0.4777F, 0.7028F, 1.0123F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0044F, 0.5989F, 0.9072F, 0.8525F, -0.0555F, 0.147F));

		PartDefinition cube_r356 = leftArm2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(45, 67).addBox(0.0F, -0.5992F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(35, 59).addBox(0.0F, -1.1742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 60).addBox(0.0F, -0.5742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F))
				.texOffs(10, 60).addBox(0.0F, -0.7742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 59).addBox(0.0F, -1.1742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.8019F, -0.1786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftClaw = leftHand.addOrReplaceChild("leftClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r357 = leftClaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(50, 67).addBox(0.0076F, -0.4989F, -1.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7F, 0.2F, -0.6021F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8168F, 3.2754F, -5.8974F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r358 = rightArm1.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(60, 55).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0308F, 0.4777F, 0.7028F, 1.0123F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0044F, 0.5989F, 0.9072F, 0.8525F, 0.0555F, -0.147F));

		PartDefinition cube_r359 = rightArm2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-1.0F, -0.5992F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(35, 59).mirror().addBox(-1.0F, -1.1742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 60).mirror().addBox(-1.0F, -0.5742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.301F)).mirror(false)
				.texOffs(10, 60).mirror().addBox(-1.0F, -0.7742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 59).mirror().addBox(-1.0F, -1.1742F, 1.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.8019F, -0.1786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightClaw = rightHand.addOrReplaceChild("rightClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r360 = rightClaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-1.0076F, -0.4989F, -1.2366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.7F, 0.2F, -0.6021F, 0.0F, 0.0F));

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