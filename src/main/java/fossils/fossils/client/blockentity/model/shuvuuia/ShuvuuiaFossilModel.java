package fossils.fossils.client.blockentity.model.shuvuuia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShuvuuiaFossilModel extends SkullModelBase {
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
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftClaw;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightClaw;

	public ShuvuuiaFossilModel(ModelPart root) {
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
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.4027F, -1.8241F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 30).addBox(-1.5F, -0.4271F, 2.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 55).addBox(-1.5F, -0.4271F, 0.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.2F, -0.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.7628F, 1.3504F, -0.1175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 46).mirror().addBox(-0.7628F, -0.1496F, -0.1175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.9849F, 1.292F, 0.3828F, -0.1043F, -0.1403F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 45).mirror().addBox(0.4036F, 2.2838F, -0.4288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1849F, 0.092F, 0.3933F, 0.1173F, -0.0601F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(-0.3897F, -1.1942F, -1.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3055F, -0.7024F, 0.8842F, 0.3172F, 0.2074F, 0.0296F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(35, 38).mirror().addBox(-0.4104F, -0.6849F, -1.4039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3055F, -0.7024F, 0.8842F, -0.1191F, 0.2074F, 0.0296F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 51).mirror().addBox(-0.2945F, -0.8501F, 0.3495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(53, 51).addBox(1.9055F, -0.8501F, 0.3495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3055F, -0.7024F, 0.8842F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-0.2945F, -0.9475F, 0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 15).addBox(1.9055F, -0.9475F, 0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3055F, -0.7024F, 0.8842F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(35, 54).mirror().addBox(-0.5F, -0.5843F, -0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(40, 53).mirror().addBox(-0.5F, -0.6157F, -0.7996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(35, 54).addBox(1.7F, -0.5843F, -0.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(40, 53).addBox(1.7F, -0.6157F, -0.7996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, -0.0769F, 0.3755F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 3).mirror().addBox(-0.2016F, -1.6292F, -0.6069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9849F, 1.292F, 0.3944F, -0.0381F, -0.3022F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 37).mirror().addBox(-0.1087F, -0.1562F, -0.3349F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1849F, 0.092F, 0.3308F, 0.1886F, -0.2405F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 3).addBox(-0.6103F, -1.1942F, -1.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3055F, -0.7024F, 0.8842F, 0.3172F, -0.2074F, -0.0296F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(35, 38).addBox(-0.5896F, -0.6849F, -1.4039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3055F, -0.7024F, 0.8842F, -0.1191F, -0.2074F, -0.0296F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 54).addBox(-0.2372F, 1.3504F, -0.1175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 46).addBox(-0.2372F, -0.1496F, -0.1175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2F, 1.9849F, 1.292F, 0.3828F, 0.1043F, 0.1403F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 3).addBox(-0.7984F, -1.6292F, -0.6069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 0.9849F, 1.292F, 0.3944F, 0.0381F, 0.3022F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 45).addBox(-1.4036F, 2.2838F, -0.4288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.1849F, 0.092F, 0.3933F, -0.1173F, 0.0601F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 37).addBox(-0.8913F, -0.1562F, -0.3349F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.1849F, 0.092F, 0.3308F, -0.1886F, 0.2405F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(17, 24).addBox(-2.0F, -0.3179F, -0.0004F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.2F, -1.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, -0.4393F, -0.0927F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F))
				.texOffs(14, 57).addBox(0.0F, -0.7393F, -0.0927F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(0.0F, -0.7393F, 1.9073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 56).addBox(0.0F, -0.7393F, 3.9073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, 3.5598F, -0.3893F, -0.1617F, 0.066F));

		PartDefinition cube_r18 = tail1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 56).addBox(0.0F, 1.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 43).addBox(0.0F, 0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 53).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1607F, 0.4073F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.5017F, -0.0739F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(32, 57).addBox(0.0F, -0.8017F, -0.0739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 57).addBox(0.0F, -0.7017F, 1.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 57).addBox(0.0F, -0.7017F, 3.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 55).addBox(0.0F, -0.7017F, 5.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1146F, 5.93F, 0.1442F, 0.214F, 0.0874F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 57).addBox(0.0F, 3.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0461F, -5.5227F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, -0.3589F, -0.0184F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1409F, 6.9235F, 0.2796F, 0.2521F, 0.0715F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.4711F, 0.0008F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1023F, 5.8816F, -0.0432F, 0.1982F, 0.0917F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.3918F, 0.6587F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(14, 44).addBox(-2.1F, 1.9469F, -0.4309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, 2.609F, 0.4372F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 47).addBox(-1.6F, 0.0124F, -0.0071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.175F, 2.609F, 0.4372F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 43).addBox(-1.6F, -0.1876F, -0.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, -0.1931F, -0.0506F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 4.8287F, 2.4761F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 30).addBox(0.3F, -0.0392F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(11, 26).addBox(-0.7F, -0.0392F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.9634F, 8.7212F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, 1.8724F, -1.4104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2131F, -0.517F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7111F, 2.5287F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftFoot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 30).addBox(1.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6303F, 0.6468F));

		PartDefinition cube_r26 = leftToes.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 18).addBox(1.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.3918F, 0.6587F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(0.1F, 1.9469F, -0.4309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.609F, 0.4372F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(0.6F, 0.0124F, -0.0071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.609F, 0.4372F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 43).mirror().addBox(0.6F, -0.1876F, -0.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.1931F, -0.0506F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.8287F, 2.4761F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-1.3F, -0.0392F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(11, 26).mirror().addBox(-0.3F, -0.0392F, -0.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.9634F, 8.7212F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 31).mirror().addBox(-0.5F, 1.8724F, -1.4104F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2131F, -0.517F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7111F, 2.5287F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightFoot.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 30).mirror().addBox(-3.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6303F, 0.6468F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightToes.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(32, 18).mirror().addBox(-3.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition torso = hips.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.1F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r34 = torso.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.6437F, -4.9957F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.1F, -0.4F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r35 = torso.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(17, 57).addBox(-2.0F, -0.3879F, -0.0088F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -1.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r36 = torso.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 57).addBox(-2.0F, -0.45F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 55).addBox(-2.0F, -0.35F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-2.5F, -0.05F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, -0.7F, -6.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r37 = torso.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -0.6269F, -0.1045F, -0.0018F, -0.771F));

		PartDefinition cube_r38 = torso.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 54).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0745F, -0.6269F, -0.098F, -0.0253F, -1.2417F));

		PartDefinition cube_r39 = torso.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 47).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.6269F, 0.0281F, 0.2227F, -1.1414F));

		PartDefinition cube_r40 = torso.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -2.6269F, 0.1209F, 0.1619F, -0.665F));

		PartDefinition cube_r41 = torso.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.6269F, 0.1276F, 0.1521F, -0.6122F));

		PartDefinition cube_r42 = torso.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.6269F, 0.0387F, 0.217F, -1.0873F));

		PartDefinition cube_r43 = torso.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3745F, -4.6269F, -0.0803F, 0.2055F, -1.6408F));

		PartDefinition cube_r44 = torso.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -0.6269F, -0.1045F, 0.0018F, 0.771F));

		PartDefinition cube_r45 = torso.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 54).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0745F, -0.6269F, -0.098F, 0.0253F, 1.2417F));

		PartDefinition cube_r46 = torso.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(10, 47).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.6269F, 0.0281F, -0.2227F, 1.1414F));

		PartDefinition cube_r47 = torso.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -2.6269F, 0.1209F, -0.1619F, 0.665F));

		PartDefinition cube_r48 = torso.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.6269F, 0.1276F, -0.1521F, 0.6122F));

		PartDefinition cube_r49 = torso.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(47, 37).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.6269F, 0.0387F, -0.217F, 1.0873F));

		PartDefinition cube_r50 = torso.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 54).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3745F, -4.6269F, -0.0803F, -0.2055F, 1.6408F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.337F, -6.1521F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 56).addBox(-1.5F, -0.4115F, -0.9237F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.263F, -1.9479F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(26, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -2.4748F, 0.1654F, 0.3883F, -1.1368F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -2.4748F, 0.3172F, 0.2492F, -0.6618F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, 0.0978F, 0.1335F, -0.5641F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 45).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, 0.0206F, 0.187F, -1.0385F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(54, 36).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, -0.0796F, 0.1706F, -1.5883F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.3903F, -0.5885F, -0.1522F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 26).addBox(2.2097F, -0.5885F, -0.1522F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9097F, 1.5631F, -2.5344F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 42).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3697F, 2.0842F, -2.0756F, -0.6951F, 0.048F, -0.6945F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-3.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4132F, 3.2673F, -0.6296F, -0.1331F, 1.0804F, -0.1962F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-1.8731F, 0.0377F, -0.6183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4591F, 3.0635F, -0.55F, 0.1635F, 0.5448F, 0.0659F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(26, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -2.4748F, 0.1654F, -0.3883F, 1.1368F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(54, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -2.4748F, 0.3172F, -0.2492F, 0.6618F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, 0.0978F, -0.1335F, 0.5641F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(37, 45).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, 0.0206F, -0.187F, 1.0385F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 36).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, -0.0796F, -0.1706F, 1.5883F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 56).addBox(-1.5F, -0.4796F, 3.6754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-2.0F, -0.2796F, 1.6754F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.263F, -4.5479F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3697F, 2.0842F, -2.0756F, -0.6951F, -0.048F, 0.6945F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 22).addBox(0.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4132F, 3.2673F, -0.6296F, -0.1331F, -1.0804F, 0.1962F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(44, 32).addBox(-0.1269F, 0.0377F, -0.6183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4591F, 3.0635F, -0.55F, 0.1635F, -0.5448F, -0.0659F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(32, 13).addBox(-2.0F, -0.8033F, -3.1595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.737F, -0.2479F, -0.5323F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0324F, -2.8098F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r71 = neck1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(23, 39).addBox(-1.0F, -0.4627F, -0.3164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.1F, -1.0F, -0.7767F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0215F, -1.0982F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5F, -0.5133F, 1.8278F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -5.4788F, -1.1484F, -1.3614F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.594F, -0.7086F, -0.2379F, 0.2096F, 0.061F));

		PartDefinition cube_r73 = neck3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(14, 40).addBox(-0.5F, -0.3494F, 0.8207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.6749F, -1.9219F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8231F, -1.183F, 0.0975F, 0.1737F, 0.0169F));

		PartDefinition cube_r74 = neck4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(41, 24).addBox(-0.5F, -0.809F, -0.4489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0534F, -1.3757F, -0.192F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.0841F, -1.4261F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, -0.3913F, -2.3007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, -0.4005F, -2.3776F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(41, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.1F, -0.0282F, -4.2308F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(16, 36).addBox(-1.1F, -0.5318F, -0.2745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.2737F, -4.9218F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 20).addBox(-0.5343F, -0.2216F, -0.4144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.4436F, -2.1618F, 0.3515F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 50).addBox(-1.2F, -0.1533F, -0.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6F, -0.9446F, -0.9709F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(37, 42).addBox(-1.0F, -0.1834F, -0.8553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(42, 34).addBox(-1.0F, -0.1834F, -1.0553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1F, -0.8545F, 0.5122F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -1.1F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.1F, -0.0331F, -0.3047F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.1F, 0.1703F, -0.7029F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(17, 48).addBox(0.0F, 0.5069F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.2F, -1.0338F, -1.0304F, 0.0087F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0838F, -2.3755F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 45).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.29F, -0.3023F, -2.0009F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(49, 27).addBox(-0.5188F, -0.4034F, -1.1131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 49).addBox(-0.5888F, -0.5034F, -0.7131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 24).addBox(-0.5888F, -0.5034F, -0.3131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(22, 48).addBox(-0.5888F, -0.5034F, 0.0869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.0812F, -0.079F, -0.5945F, -0.2555F, 0.1724F, -0.0276F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(16, 31).addBox(-0.8905F, -0.6553F, -0.3108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, -0.2109F, 0.1826F, -0.0162F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 37).addBox(-0.6F, -0.8159F, -1.578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1032F, 0.1826F, -0.0162F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(7, 37).addBox(-0.7681F, -0.7695F, -0.2454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.3824F, 0.0451F, -0.1732F, 0.123F, 0.0092F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5343F, -0.2216F, -0.4144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, -0.5274F, 0.2137F, 0.3675F, 0.3109F, 0.0384F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(41, 8).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.3515F, 0.847F, 0.1573F, 0.1221F, 0.0043F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5888F, -0.5269F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(0, 49).addBox(-0.5888F, -0.5269F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.0812F, -0.079F, -0.5945F, -0.0635F, 0.1724F, -0.0276F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 49).addBox(-0.5888F, -0.2111F, 0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0812F, -0.079F, -0.5945F, 0.3729F, 0.1724F, -0.0276F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(53, 18).addBox(-0.5184F, -0.3807F, -0.9391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0752F, -0.1185F, 1.2815F, -0.0443F, 0.2443F, -0.0176F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(20, 54).addBox(-0.5184F, -0.1617F, -0.6893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 21).addBox(-0.5184F, -0.1617F, -0.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0752F, -0.1185F, 1.2815F, -0.2362F, 0.2443F, -0.0176F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 12).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.1017F, -0.394F, 1.5933F, -0.5129F, 0.1174F, -0.004F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 54).addBox(-0.5184F, -0.7356F, -0.7942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(53, 15).addBox(-0.5184F, -0.7356F, -0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0752F, -0.1185F, 1.2815F, 0.3397F, 0.2443F, -0.0176F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(48, 21).addBox(-0.3884F, -0.6242F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(48, 18).addBox(-0.4884F, -0.6242F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0752F, -0.1185F, 1.2815F, 0.0605F, 0.2443F, -0.0176F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 48).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.2983F, 1.86F, 0.0699F, 0.0522F, 0.0037F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.109F, 0.1993F, 1.5507F, 0.1144F, 0.1412F, -0.0267F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 45).addBox(-0.4495F, -0.445F, -0.374F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(44, 42).addBox(-0.4495F, -0.445F, -0.474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(0.3045F, -0.5148F, 2.2851F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(44, 28).addBox(-0.4495F, -0.8383F, -0.5978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3045F, -0.1148F, 2.1851F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(47, 39).addBox(0.0F, 0.0583F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, -1.0589F, 2.639F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 3).addBox(0.0F, -0.3041F, -0.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4F, -0.9384F, 2.8877F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(50, 0).addBox(-0.8494F, -0.153F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -1.0285F, 1.4046F, 0.063F, 0.244F, 0.013F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0838F, -2.3755F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 45).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.29F, -0.3023F, -2.0009F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(-0.4812F, -0.4034F, -1.1131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 49).mirror().addBox(-0.4112F, -0.5034F, -0.7131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 24).mirror().addBox(-0.4112F, -0.5034F, -0.3131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(22, 48).mirror().addBox(-0.4112F, -0.5034F, 0.0869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0812F, -0.079F, -0.5945F, -0.2555F, -0.1724F, 0.0276F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-0.1095F, -0.6553F, -0.3108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, -0.2109F, -0.1826F, 0.0162F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.4F, -0.8159F, -1.578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1032F, -0.1826F, 0.0162F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.2319F, -0.7695F, -0.2454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3824F, 0.0451F, -0.1732F, -0.123F, -0.0092F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(7, 41).mirror().addBox(-0.4657F, -0.2216F, -0.4144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.5274F, 0.2137F, 0.3675F, -0.3109F, -0.0384F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(41, 8).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, -0.3515F, 0.847F, 0.1573F, -0.1221F, -0.0043F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.4112F, -0.5269F, -0.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.4112F, -0.5269F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.0812F, -0.079F, -0.5945F, -0.0635F, -0.1724F, 0.0276F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.4112F, -0.2111F, 0.0435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0812F, -0.079F, -0.5945F, 0.3729F, -0.1724F, 0.0276F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.4816F, -0.3807F, -0.9391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1185F, 1.2815F, -0.0443F, -0.2443F, 0.0176F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(20, 54).mirror().addBox(-0.4816F, -0.1617F, -0.6893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(53, 21).mirror().addBox(-0.4816F, -0.1617F, -0.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1185F, 1.2815F, -0.2362F, -0.2443F, 0.0176F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.1017F, -0.394F, 1.5933F, -0.5129F, -0.1174F, 0.004F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-0.4816F, -0.7356F, -0.7942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(53, 15).mirror().addBox(-0.4816F, -0.7356F, -0.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1185F, 1.2815F, 0.3397F, -0.2443F, 0.0176F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.6116F, -0.6242F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(48, 18).mirror().addBox(-0.5116F, -0.6242F, -0.487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1185F, 1.2815F, 0.0605F, -0.2443F, 0.0176F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 48).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2983F, 1.86F, 0.0699F, -0.0522F, -0.0037F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(53, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.109F, 0.1993F, 1.5507F, 0.1144F, -0.1412F, 0.0267F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5505F, -0.445F, -0.374F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(44, 42).mirror().addBox(-0.5505F, -0.445F, -0.474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(-0.3045F, -0.5148F, 2.2851F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 28).mirror().addBox(-0.5505F, -0.8383F, -0.5978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3045F, -0.1148F, 2.1851F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-1.0F, 0.0583F, -0.6706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.0589F, 2.639F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 3).mirror().addBox(-1.0F, -0.3041F, -0.8553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.9384F, 2.8877F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.1506F, -0.153F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.0285F, 1.4046F, 0.063F, -0.244F, -0.013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.7496F, -0.1856F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(-0.5825F, -0.7197F, -0.6326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.4957F, -1.8045F, 0.0603F, -0.1743F, 0.0092F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(10, 52).mirror().addBox(0.2148F, -0.3016F, -0.3753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 52).mirror().addBox(0.2148F, -0.3016F, 0.0247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6016F, 0.0642F, -1.8499F, 0.0175F, -0.1745F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-0.591F, -0.6794F, -1.969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.4957F, -1.8045F, -0.0097F, -0.1917F, 0.0102F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.591F, -0.6224F, -0.6417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.4957F, -1.8045F, -0.2191F, -0.1917F, 0.0102F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.1092F, -0.6518F, -0.4006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 51).mirror().addBox(-0.1092F, -0.6518F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(51, 30).mirror().addBox(-0.1092F, -0.6518F, 0.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5319F, -1.7573F, 0.0087F, -0.192F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-1.12F, -0.6322F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 51).mirror().addBox(-1.12F, -0.6322F, -0.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 51).addBox(0.32F, -0.6322F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 51).addBox(0.32F, -0.6322F, -0.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, 0.4319F, -0.5573F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-1.12F, -0.6956F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 51).addBox(0.32F, -0.6956F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, 0.4319F, -0.3573F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-1.0F, -0.5956F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 51).mirror().addBox(-1.0F, -0.5956F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 6).addBox(0.2F, -0.5956F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 51).addBox(0.2F, -0.5956F, -0.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 0.3319F, -0.3573F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(36, 4).addBox(0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.6F, 0.1319F, 0.1427F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.4208F, -1.0166F, -3.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 34).mirror().addBox(-0.4208F, -0.8936F, -3.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.4957F, -1.8045F, 0.1304F, -0.0864F, 0.0122F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(52, 39).addBox(-0.4175F, -0.7197F, -0.6326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.2F, 0.4957F, -1.8045F, 0.0603F, 0.1743F, -0.0092F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(10, 52).addBox(-1.2148F, -0.3016F, -0.3753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 52).addBox(-1.2148F, -0.3016F, 0.0247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6016F, 0.0642F, -1.8499F, 0.0175F, 0.1745F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(41, 16).addBox(-0.409F, -0.6794F, -1.969F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 0.4957F, -1.8045F, -0.0097F, 0.1917F, -0.0102F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 52).addBox(-0.409F, -0.6224F, -0.6417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, 0.4957F, -1.8045F, -0.2191F, 0.1917F, -0.0102F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(48, 51).addBox(-0.8908F, -0.6518F, -0.4006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 51).addBox(-0.8908F, -0.6518F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(51, 30).addBox(-0.8908F, -0.6518F, 0.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.5319F, -1.7573F, 0.0087F, 0.192F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5792F, -1.0166F, -3.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2F, 0.4957F, -1.8045F, 0.1304F, 0.0864F, -0.0122F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 34).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4722F, 0.3938F, -4.0142F, 0.1304F, 0.0864F, -0.0122F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1886F, 1.94F, -2.1176F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition cube_r143 = leftArm1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(53, 24).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0308F, 0.4777F, 0.7028F, 1.0123F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0119F, 0.5239F, 0.9729F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftArm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(30, 54).addBox(0.0F, -0.8742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(54, 33).addBox(0.0F, -0.8742F, 1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(48, 9).addBox(0.0F, -1.1742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 6).addBox(0.0F, -1.1742F, 1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftArm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(48, 12).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.2474F, 0.4989F, -0.6021F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.8019F, -0.1786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r146 = leftHand.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 57).addBox(0.9933F, 0.0895F, -0.3354F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0317F, 0.0718F, -0.2356F, 0.0F, 0.0F));

		PartDefinition leftClaw = leftHand.addOrReplaceChild("leftClaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -0.1F));

		PartDefinition cube_r147 = leftClaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 47).addBox(0.0076F, -0.9989F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.4F, 0.1F, -0.6021F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1886F, 1.94F, -2.1176F, -1.1113F, 0.3757F, 0.2802F));

		PartDefinition cube_r148 = rightArm1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(53, 24).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0308F, 0.4777F, 0.7028F, 1.0123F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0119F, 0.5239F, 0.9729F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightArm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-1.0F, -0.8742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(54, 33).mirror().addBox(-1.0F, -0.8742F, 1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(48, 9).mirror().addBox(-1.0F, -1.1742F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 6).mirror().addBox(-1.0F, -1.1742F, 1.4417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightArm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2474F, 0.4989F, -0.6021F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.8019F, -0.1786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightHand.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.9933F, 0.0895F, -0.3354F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0317F, 0.0718F, -0.2356F, 0.0F, 0.0F));

		PartDefinition rightClaw = rightHand.addOrReplaceChild("rightClaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -0.1F));

		PartDefinition cube_r152 = rightClaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(33, 47).mirror().addBox(-1.0076F, -0.9989F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.4F, 0.1F, -0.6021F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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