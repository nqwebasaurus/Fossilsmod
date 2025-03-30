package fossils.fossils.client.blockentity.model.bannykus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BannykusFossilModel extends SkullModelBase {
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
	private final ModelPart throat;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftClaw;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightClaw;

	public BannykusFossilModel(ModelPart root) {
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
		this.throat = this.neck4.getChild("throat");
		this.head = this.neck4.getChild("head");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -16.0F, 0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 56).addBox(-1.5F, -0.4271F, 2.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 56).addBox(-1.5F, -0.4271F, 0.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -0.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-0.1486F, -0.3482F, -0.2968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.7849F, -0.808F, -0.1655F, 0.0677F, -0.1131F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(55, 12).addBox(-0.8F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -0.55F, 0.15F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 44).mirror().addBox(-0.079F, -0.2498F, -0.3538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.3849F, -0.208F, -0.2102F, 0.035F, -0.3025F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.2016F, -1.0292F, -0.6069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.9849F, 1.292F, 0.3944F, -0.0381F, -0.3022F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(18, 55).addBox(-0.8F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -0.55F, -0.45F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 48).addBox(1.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, -0.1633F, 2.082F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 9).mirror().addBox(-3.0F, -0.0874F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 9).addBox(-0.8F, -0.0874F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, -1.05F, 1.35F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 42).mirror().addBox(-0.3545F, 0.0435F, -2.0069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.15F, 1.35F, -0.2618F, 0.2094F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(-0.5F, -1.1454F, -1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.65F, 0.55F, 0.1745F, 0.2094F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 54).addBox(-0.5F, -1.1454F, -1.9056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.65F, 0.55F, 0.1745F, -0.2094F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 42).addBox(-0.6455F, 0.0435F, -2.0069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -1.15F, 1.35F, -0.2618F, -0.2094F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(26, 44).addBox(-0.7984F, -1.0292F, -0.6069F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 0.9849F, 1.292F, 0.3944F, 0.0381F, 0.3022F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 16).addBox(-0.8514F, -0.3482F, -0.2968F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 2.7849F, -0.808F, -0.1655F, -0.0677F, 0.1131F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 44).addBox(-0.921F, -0.2498F, -0.3538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 0.3849F, -0.208F, -0.2102F, -0.035F, 0.3025F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 32).addBox(-2.0F, -0.3179F, -0.0004F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -0.3447F, -0.053F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(56, 49).addBox(-0.5F, -0.6447F, 0.947F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 56).addBox(-0.5F, -0.6447F, 2.947F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 52).addBox(-0.5F, -0.6447F, 4.947F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3572F, 2.5598F, -0.2231F, -0.1951F, 0.1313F));

		PartDefinition cube_r17 = tail1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, 1.5F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 55).addBox(0.0F, 0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 54).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2553F, 1.447F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5017F, -0.0739F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(57, 4).addBox(0.0F, -0.8017F, -0.0739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 57).addBox(0.0F, -0.7017F, 1.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 57).addBox(0.0F, -0.7017F, 3.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 57).addBox(0.0F, -0.7017F, 5.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2093F, 6.9697F, -0.0268F, -0.2181F, 0.0058F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 56).addBox(0.0F, 5.0F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 56).addBox(0.0F, 3.8F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0461F, -5.5227F, 0.6807F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, -0.6586F, -0.0053F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1591F, 6.9235F, 0.0464F, -0.3487F, -0.0159F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4711F, 0.0008F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1975F, 5.8947F, 0.1646F, -0.3016F, -0.0493F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1132F, 0.6096F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 46).addBox(-2.1F, 0.0124F, -0.0071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, 5.0361F, 2.2006F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 38).addBox(-1.6F, 0.0124F, -0.0071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.175F, 2.609F, 0.4372F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 43).addBox(-1.6F, -0.1876F, -0.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.175F, -0.1931F, -0.0506F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, 5.4574F, 3.6402F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 0).addBox(0.3F, -0.0392F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 33).addBox(-0.7F, -0.0392F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.4128F, 6.9674F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(26, 37).addBox(-0.5F, 1.8724F, -1.4104F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.2131F, -0.517F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 3.6462F, 1.783F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftFoot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 30).addBox(1.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6303F, 0.6468F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftToes.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 34).addBox(1.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, -0.1132F, 0.6096F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(0.1F, 0.0124F, -0.0071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 5.0361F, 2.2006F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 38).mirror().addBox(0.6F, 0.0124F, -0.0071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.609F, 0.4372F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 43).mirror().addBox(0.6F, -0.1876F, -0.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.1931F, -0.0506F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 5.4574F, 3.6402F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.3F, -0.0392F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(9, 33).mirror().addBox(-0.3F, -0.0392F, -0.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0319F, -0.0588F, 1.2217F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.4128F, 6.9674F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 37).mirror().addBox(-0.5F, 1.8724F, -1.4104F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.2131F, -0.517F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 3.6462F, 1.783F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightFoot.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 30).mirror().addBox(-3.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.3351F, 2.108F, 1.8326F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6303F, 0.6468F));

		PartDefinition cube_r32 = rightToes.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 34).mirror().addBox(-3.0F, -1.9F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.6367F, 1.9788F, 1.8326F, 0.0F, 0.0F));

		PartDefinition torso = hips.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -1.1F, -1.1F, 0.0117F, 0.2615F, 0.0452F));

		PartDefinition cube_r33 = torso.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, -1.0437F, -4.9957F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9829F, 5.1F, -0.1389F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r34 = torso.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 46).addBox(-2.0F, -0.5879F, -0.0088F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9829F, -0.4F, -0.8389F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = torso.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 33).addBox(-2.0F, -0.55F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 30).addBox(-2.0F, -0.55F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-2.5F, -0.05F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9829F, -0.7F, -5.8389F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r36 = torso.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.0745F, -0.3658F, -0.0755F, 0.0408F, -1.2415F));

		PartDefinition cube_r37 = torso.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.0745F, -0.3658F, -0.0544F, 0.0468F, -0.7698F));

		PartDefinition cube_r38 = torso.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -2.3658F, 0.0519F, 0.1078F, -0.6743F));

		PartDefinition cube_r39 = torso.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(31, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -2.3658F, -0.0086F, 0.1433F, -1.1481F));

		PartDefinition cube_r40 = torso.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -2.3658F, -0.0815F, 0.1183F, -1.6933F));

		PartDefinition cube_r41 = torso.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -4.3658F, -0.079F, 0.1881F, -1.6406F));

		PartDefinition cube_r42 = torso.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 46).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -4.3658F, 0.0304F, 0.2015F, -1.089F));

		PartDefinition cube_r43 = torso.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.3745F, -4.3658F, 0.1131F, 0.1421F, -0.6143F));

		PartDefinition cube_r44 = torso.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(55, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.0745F, -0.3658F, -0.0544F, -0.0468F, 0.7698F));

		PartDefinition cube_r45 = torso.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.0745F, -0.3658F, -0.0755F, -0.0408F, 1.2415F));

		PartDefinition cube_r46 = torso.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 25).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -2.3658F, -0.0815F, -0.1183F, 1.6933F));

		PartDefinition cube_r47 = torso.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(31, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -2.3658F, -0.0086F, -0.1433F, 1.1481F));

		PartDefinition cube_r48 = torso.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -2.3658F, 0.0519F, -0.1078F, 0.6743F));

		PartDefinition cube_r49 = torso.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -4.3658F, 0.1131F, -0.1421F, 0.6143F));

		PartDefinition cube_r50 = torso.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 46).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -4.3658F, 0.0304F, -0.2015F, 1.089F));

		PartDefinition cube_r51 = torso.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(14, 46).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4829F, -0.3745F, -4.3658F, -0.079F, -0.1881F, 1.6406F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0171F, -0.337F, -5.891F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 27).addBox(-1.5F, -0.6115F, -2.9237F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 56).addBox(-1.5F, -0.6115F, -0.9237F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.263F, -1.9479F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-3.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4132F, 3.3673F, -1.5296F, -0.1989F, 0.8594F, -0.2865F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-2.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4591F, 3.1635F, -1.45F, 0.2195F, 0.1012F, 0.1615F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6697F, 1.7842F, -3.4756F, -0.6951F, 0.048F, -0.6945F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 9).mirror().addBox(-1.3903F, -0.5885F, -0.1522F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(32, 9).addBox(2.8097F, -0.5885F, -0.1522F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2097F, 1.2631F, -3.9344F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 2).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -4.4748F, 0.2223F, 0.4584F, -1.2007F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -4.4748F, 0.3983F, 0.2878F, -0.7275F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -2.4748F, 0.2376F, 0.2089F, -0.4878F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -2.4748F, 0.1116F, 0.3171F, -0.9634F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -2.4748F, -0.0739F, 0.3276F, -1.5346F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, 0.175F, 0.1758F, -0.4998F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(14, 48).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, 0.0704F, 0.2595F, -0.9751F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0375F, -0.4748F, -0.0765F, 0.2578F, -1.5353F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -4.4748F, 0.3983F, -0.2878F, 0.7275F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 2).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -4.4748F, 0.2223F, -0.4584F, 1.2007F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 42).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -2.4748F, -0.0739F, -0.3276F, 1.5346F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(48, 14).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -2.4748F, 0.1116F, -0.3171F, 0.9634F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -2.4748F, 0.2376F, -0.2089F, 0.4878F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, 0.175F, -0.1758F, 0.4998F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(14, 48).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, 0.0704F, -0.2595F, 0.9751F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(7, 48).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0375F, -0.4748F, -0.0765F, -0.2578F, 1.5353F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(12, 56).addBox(-1.5F, -0.6796F, 3.6754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 9).addBox(-2.0F, -0.2796F, -0.3246F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.263F, -4.5479F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(43, 10).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6697F, 1.7842F, -3.4756F, -0.6951F, -0.048F, 0.6945F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(43, 8).addBox(0.0731F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4132F, 3.3673F, -1.5296F, -0.1989F, -0.8594F, 0.2865F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(41, 27).addBox(-0.9269F, 0.0377F, -0.6183F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4591F, 3.1635F, -1.45F, 0.2195F, -0.1012F, -0.1615F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -0.8033F, -3.1595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.837F, -1.1479F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.163F, -4.6479F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r78 = neck1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 19).addBox(-1.0F, -0.4627F, -0.3164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, -0.7767F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0215F, -1.0982F, 0.3574F, 0.346F, 0.0475F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(17, 24).addBox(-0.5F, -0.5133F, -0.1722F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -5.4788F, -1.1484F, -1.3614F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0765F, -5.394F, -1.2934F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r80 = neck3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5F, -0.3494F, -0.1793F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.6749F, -1.9219F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.4575F, -1.9561F, 0.262F, -0.0038F, -0.0872F));

		PartDefinition cube_r81 = neck4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.809F, -0.4489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0534F, -1.3757F, -0.192F, 0.0F, 0.0F));

		PartDefinition throat = neck4.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8343F, -1.4229F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3008F, -1.6079F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-1.0F, -0.1417F, -0.7706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(48, 24).addBox(0.0F, -0.1417F, -0.7706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.9751F, 0.2635F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 50).mirror().addBox(-1.0F, -0.27F, -0.1504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(51, 50).addBox(0.0F, -0.27F, -0.1504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(44, 29).addBox(-1.0F, -0.1493F, -0.1504F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, -1.0837F, -0.3639F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(51, 47).mirror().addBox(-0.904F, -0.2926F, -0.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 47).addBox(0.404F, -0.2926F, -0.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.75F, -0.7593F, 0.0484F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 4).mirror().addBox(-1.005F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 4).addBox(0.505F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.75F, -0.1593F, -0.0516F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.5577F, -0.6339F, -0.8297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.8823F, -0.1924F, -1.0575F, 0.3229F, -0.2094F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-0.5577F, -0.311F, -0.6451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8823F, -0.1924F, -1.0575F, -0.1658F, -0.2094F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 51).mirror().addBox(-0.6877F, -0.5409F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(51, 33).mirror().addBox(-0.5877F, -0.5409F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(51, 53).mirror().addBox(-0.5577F, -0.7409F, -0.6909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8823F, -0.1924F, -1.0575F, 0.0611F, -0.2094F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(3, 50).mirror().addBox(-0.5577F, -0.2998F, -0.128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.8823F, -0.1924F, -1.0575F, -0.0785F, -0.1484F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.3F, -0.5026F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.7296F, -0.4108F, 0.009F, -0.2443F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(8, 50).mirror().addBox(-0.5577F, -0.7413F, -0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.8823F, -0.1924F, -1.0575F, -0.5149F, -0.1484F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(32, 25).mirror().addBox(-1.0F, 0.0705F, -1.9936F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9005F, -2.7776F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-0.5F, -0.2264F, -0.1482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5436F, -2.4618F, 0.3226F, -0.213F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.2677F, -1.5285F, 0.1573F, -0.1221F, -0.0043F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(39, 4).mirror().addBox(-0.4F, -0.8159F, -1.578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0838F, -2.3755F, 0.1032F, -0.1826F, 0.0162F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(13, 50).mirror().addBox(-0.52F, -0.4722F, -0.5126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 10).mirror().addBox(-0.52F, -0.4722F, -0.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(46, 51).mirror().addBox(-0.59F, -0.3722F, -1.3126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0288F, -2.4395F, -0.096F, -0.1745F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.52F, -0.3031F, -0.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0288F, -2.4395F, 0.5323F, -0.1745F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-0.52F, -0.5344F, -0.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(50, 38).mirror().addBox(-0.52F, -0.5344F, -0.5812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.0288F, -2.4395F, 0.096F, -0.1745F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 3).mirror().addBox(-0.01F, -0.4791F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(51, 27).mirror().addBox(-0.01F, -0.4791F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(51, 30).mirror().addBox(-0.01F, -0.4791F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0946F, -4.455F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(0.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4662F, -0.8304F, -0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-0.4F, -0.3159F, -1.878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(32, 15).mirror().addBox(-0.4F, -0.5159F, -1.878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0838F, -2.3755F, -0.0887F, -0.1826F, 0.0162F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.4662F, -0.8304F, -0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(39, 4).addBox(-0.6F, -0.8159F, -1.578F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.0838F, -2.3755F, 0.1032F, 0.1826F, -0.0162F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 20).addBox(-0.6F, -0.3159F, -1.878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F))
				.texOffs(32, 15).addBox(-0.6F, -0.5159F, -1.878F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.1F, 0.0838F, -2.3755F, -0.0887F, 0.1826F, -0.0162F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(14, 42).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.5F, 0.1343F, -4.0563F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 38).addBox(-1.0F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1162F, -4.7755F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 42).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.2677F, -1.5285F, 0.1573F, 0.1221F, 0.0043F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(41, 15).addBox(-0.5F, -0.2264F, -0.1482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.5436F, -2.4618F, 0.3226F, 0.213F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(41, 51).addBox(-0.5F, -0.1493F, -0.7504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, -1.0837F, -0.3639F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(21, 49).addBox(-0.7F, -0.5026F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, -0.7296F, -0.4108F, 0.009F, 0.2443F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(44, 32).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5F, -0.0331F, -0.3047F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.5F, 0.1703F, -0.7029F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(26, 49).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 0.1703F, -0.7029F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(33, 54).addBox(-0.4423F, -0.311F, -0.6451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1177F, -0.1924F, -1.0575F, -0.1658F, 0.2094F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 30).addBox(-0.99F, -0.4791F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(51, 27).addBox(-0.99F, -0.4791F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(51, 3).addBox(-0.99F, -0.4791F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1F, -0.0946F, -4.455F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 51).addBox(-0.41F, -0.3722F, -1.3126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 41).addBox(-0.48F, -0.4722F, -0.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(13, 50).addBox(-0.48F, -0.4722F, -0.5126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 10).addBox(-0.48F, -0.4722F, -0.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2F, -0.0288F, -2.4395F, -0.096F, 0.1745F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 0).addBox(-0.48F, -0.3031F, -0.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, -0.0288F, -2.4395F, 0.5323F, 0.1745F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 44).addBox(-0.48F, -0.5344F, -0.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(50, 38).addBox(-0.48F, -0.5344F, -0.5812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.2F, -0.0288F, -2.4395F, 0.096F, 0.1745F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(38, 54).addBox(-0.4423F, -0.6339F, -0.8297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.1177F, -0.1924F, -1.0575F, 0.3229F, 0.2094F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 51).addBox(-0.3123F, -0.5409F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(51, 33).addBox(-0.4123F, -0.5409F, -0.5909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(51, 53).addBox(-0.4423F, -0.7409F, -0.6909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1177F, -0.1924F, -1.0575F, 0.0611F, 0.2094F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(8, 50).addBox(-0.4423F, -0.7413F, -0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.1177F, -0.1924F, -1.0575F, -0.5149F, 0.1484F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(3, 50).addBox(-0.4423F, -0.2998F, -0.128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.1177F, -0.1924F, -1.0575F, -0.0785F, 0.1484F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(41, 48).addBox(0.0F, 0.5069F, -0.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.6F, -1.0338F, -1.0304F, 0.0087F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6102F, -0.0107F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(8, 53).mirror().addBox(0.2148F, -0.3016F, -0.7753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.6016F, 0.0642F, -1.8499F, 0.3316F, -0.1745F, 0.0F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(0.0759F, -0.2984F, -1.1694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 48).mirror().addBox(0.0759F, -0.2984F, -0.7694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6016F, -0.0358F, -1.0499F, 0.1222F, -0.1745F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(31, 42).mirror().addBox(-0.3F, -0.6458F, -2.966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(7, 42).mirror().addBox(-0.3F, -0.509F, -2.766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4319F, -0.7573F, -0.0262F, -0.192F, 0.0F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(3, 53).mirror().addBox(-0.3F, -0.6635F, -1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(28, 52).mirror().addBox(-0.3F, -0.6635F, -1.0872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(18, 52).mirror().addBox(-0.3F, -0.6635F, -0.6872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4319F, -0.7573F, 0.1134F, -0.192F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-1.12F, -0.6322F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(53, 16).mirror().addBox(-1.12F, -0.6322F, -0.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(53, 19).addBox(0.32F, -0.6322F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(53, 16).addBox(0.32F, -0.6322F, -0.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, 0.3319F, -0.5573F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 53).mirror().addBox(-1.12F, -0.6956F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(52, 6).mirror().addBox(-1.0F, -0.6956F, -0.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(13, 53).addBox(0.32F, -0.6956F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(52, 6).addBox(0.2F, -0.6956F, -0.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 0.3319F, -0.3573F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(41, 23).addBox(0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.6F, 0.1319F, 0.1427F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(31, 38).mirror().addBox(-0.3F, -0.8696F, -1.6239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(14, 38).mirror().addBox(-0.3F, -0.7466F, -1.6239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.5957F, -3.2045F, -0.044F, -0.0869F, 0.0076F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(8, 53).addBox(-1.2148F, -0.3016F, -0.7753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.6016F, 0.0642F, -1.8499F, 0.3316F, 0.1745F, 0.0F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(23, 52).addBox(-1.0759F, -0.2984F, -1.1694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 48).addBox(-1.0759F, -0.2984F, -0.7694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6016F, -0.0358F, -1.0499F, 0.1222F, 0.1745F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(31, 42).addBox(-0.7F, -0.6458F, -2.966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(7, 42).addBox(-0.7F, -0.509F, -2.766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3F, 0.4319F, -0.7573F, -0.0262F, 0.192F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(3, 53).addBox(-0.7F, -0.6635F, -1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 52).addBox(-0.7F, -0.6635F, -1.0872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(18, 52).addBox(-0.7F, -0.6635F, -0.6872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.4319F, -0.7573F, 0.1134F, 0.192F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(31, 38).addBox(-0.7F, -0.8696F, -1.6239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(14, 38).addBox(-0.7F, -0.7466F, -1.6239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 0.5957F, -3.2045F, -0.044F, 0.0869F, -0.0076F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8624F, 1.837F, -3.6438F, -0.0873F, 0.2182F, 0.0F));

		PartDefinition cube_r137 = leftArm1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(53, 22).addBox(-0.5F, 0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(46, 0).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.519F, 0.4407F, 0.8045F, 1.0123F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0765F, 1.9591F, 0.2418F, -1.0329F, -0.5605F));

		PartDefinition cube_r138 = leftArm2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(31, 48).addBox(0.0F, -1.1742F, 0.6417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 20).addBox(0.0F, -1.1742F, 1.4417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 1.4449F, -0.3698F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftHand.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 49).addBox(1.0076F, 0.0895F, -0.4354F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0317F, 0.0718F, -0.2356F, 0.0F, 0.0F));

		PartDefinition leftClaw = leftHand.addOrReplaceChild("leftClaw", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.2F, -1.1F));

		PartDefinition cube_r140 = leftClaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(21, 38).addBox(0.0076F, -0.9989F, -1.2366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, 1.1F, -0.6021F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8624F, 1.837F, -3.6438F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition cube_r141 = rightArm1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.5F, 0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.519F, 0.4407F, 0.8045F, 1.0123F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0765F, 1.9591F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition cube_r142 = rightArm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-1.0F, -1.1742F, 0.6417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 20).mirror().addBox(-1.0F, -1.1742F, 1.4417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 1.4449F, -0.3698F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightHand.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-1.0076F, 0.0895F, -0.4354F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0317F, 0.0718F, -0.2356F, 0.0F, 0.0F));

		PartDefinition rightClaw = rightHand.addOrReplaceChild("rightClaw", CubeListBuilder.create(), PartPose.offset(1.0F, -1.2F, -1.1F));

		PartDefinition cube_r144 = rightClaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 38).mirror().addBox(-1.0076F, -0.9989F, -1.2366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, 1.1F, -0.6021F, 0.0F, 0.0F));

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