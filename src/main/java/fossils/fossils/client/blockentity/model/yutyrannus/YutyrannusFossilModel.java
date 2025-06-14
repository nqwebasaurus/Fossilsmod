package fossils.fossils.client.blockentity.model.yutyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YutyrannusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm3;
	private final ModelPart leftarm4;
	private final ModelPart lefthand2;
	private final ModelPart leftfingers;
	private final ModelPart leftclaw;
	private final ModelPart rightarm3;
	private final ModelPart rightarm4;
	private final ModelPart righthand2;
	private final ModelPart rightfingers;
	private final ModelPart rightclaw;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;

	public YutyrannusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm3 = this.chest.getChild("leftarm3");
		this.leftarm4 = this.leftarm3.getChild("leftarm4");
		this.lefthand2 = this.leftarm4.getChild("lefthand2");
		this.leftfingers = this.lefthand2.getChild("leftfingers");
		this.leftclaw = this.lefthand2.getChild("leftclaw");
		this.rightarm3 = this.chest.getChild("rightarm3");
		this.rightarm4 = this.rightarm3.getChild("rightarm4");
		this.righthand2 = this.rightarm4.getChild("righthand2");
		this.rightfingers = this.righthand2.getChild("rightfingers");
		this.rightclaw = this.righthand2.getChild("rightclaw");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.329F, 3.4267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.1036F, -7.3947F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(58, 93).addBox(0.0F, -3.1036F, -8.8947F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, -0.2036F, -9.8947F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8655F, 3.5513F, -1.3267F, -0.0181F, 0.0282F, -0.2141F));

		PartDefinition hips_r1 = bone.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(54, 60).addBox(-1.6867F, 6.6429F, -3.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, 0.3353F, -0.0121F, 0.186F));

		PartDefinition hips_r2 = bone.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(80, 15).addBox(-1.6867F, 6.1808F, 0.1734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, -0.2931F, -0.0121F, 0.186F));

		PartDefinition hips_r3 = bone.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(0, 80).addBox(-1.6867F, 2.9261F, -8.3875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, 0.6669F, -0.0121F, 0.186F));

		PartDefinition hips_r4 = bone.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(63, 71).addBox(-1.6867F, 7.301F, -4.628F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, 0.0036F, -0.0121F, 0.186F));

		PartDefinition hips_r5 = bone.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(81, 61).addBox(-1.6867F, 6.7901F, -2.5202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, -0.0749F, -0.0121F, 0.186F));

		PartDefinition hips_r6 = bone.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(0, 54).addBox(-0.8293F, 4.0745F, -1.8003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, -0.0815F, 0.054F, 0.2888F));

		PartDefinition hips_r7 = bone.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(19, 84).addBox(-0.8293F, 2.3711F, -0.3541F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, -0.4305F, 0.054F, 0.2888F));

		PartDefinition hips_r8 = bone.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(57, 88).addBox(-0.8575F, -0.5456F, -0.4074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3345F, 0.3477F, -1.7F, -0.3943F, 0.0662F, 0.2857F));

		PartDefinition hips_r9 = bone.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(94, 81).addBox(-0.7662F, 1.3608F, 0.6056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 15).addBox(-0.7662F, 0.3608F, -0.1944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8345F, -1.3523F, 3.6F, 0.0657F, -0.241F, 0.2789F));

		PartDefinition hips_r10 = bone.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(0, 45).addBox(-1.3338F, 4.3127F, -1.056F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8345F, -1.3523F, 3.6F, 0.9872F, -0.1057F, 0.2264F));

		PartDefinition hips_r11 = bone.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(0, 85).addBox(-0.6F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6552F, -1.1284F, 1.3478F, 1.2889F, 0.0362F, 0.2856F));

		PartDefinition hips_r12 = bone.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(75, 84).addBox(-0.7662F, -0.6078F, -0.7079F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8345F, -1.3523F, 3.6F, 0.9035F, -0.241F, 0.2789F));

		PartDefinition hips_r13 = bone.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(93, 21).addBox(-1.844F, 0.496F, -0.3015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -1.4523F, -1.6F, -0.1721F, 0.0299F, 0.2923F));

		PartDefinition hips_r14 = bone.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(39, 82).addBox(-1.5427F, -1.5904F, 0.8166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -1.4523F, -1.6F, -0.9179F, 0.0662F, 0.2333F));

		PartDefinition hips_r15 = bone.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(84, 71).addBox(-1.0927F, 1.9168F, -1.3835F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.5F, -0.6827F, -0.0004F, 0.2938F));

		PartDefinition hips_r16 = bone.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(32, 78).addBox(-1.0858F, -2.8048F, 2.2456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.0F, -0.0699F, 0.0435F, -0.0038F));

		PartDefinition hips_r17 = bone.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(65, 77).addBox(-1.0425F, -4.7641F, 0.551F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.0F, -0.5062F, 0.0435F, -0.0038F));

		PartDefinition hips_r18 = bone.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(12, 60).addBox(-0.9588F, -0.2335F, -1.7985F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.0F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition hips_r19 = bone.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(34, 63).addBox(-0.9F, -2.1756F, -1.7985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips_r20 = bone.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(62, 39).addBox(-0.9387F, 1.3924F, -3.6934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6345F, -7.2523F, -0.2F, -0.1956F, -0.2246F, 0.0321F));

		PartDefinition hips_r21 = bone.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(52, 88).addBox(-0.9387F, -1.3042F, -3.6623F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6345F, -7.2523F, -0.2F, 0.5112F, -0.2246F, 0.0321F));

		PartDefinition hips_r22 = bone.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(75, 68).addBox(-0.1645F, -0.0917F, -0.1641F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6345F, -5.6523F, -3.9F, 0.3629F, -0.2246F, 0.0321F));

		PartDefinition hips_r23 = bone.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(74, 19).addBox(-0.9387F, -0.3769F, -2.8929F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6345F, -7.2523F, -0.2F, 0.1622F, -0.2246F, 0.0321F));

		PartDefinition hips_r24 = bone.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(67, 64).addBox(-0.9F, -4.0673F, -1.3918F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6345F, -3.4523F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8655F, 3.5513F, -1.3267F, -0.0181F, -0.0282F, 0.2141F));

		PartDefinition hips_r25 = bone2.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(54, 60).mirror().addBox(0.6867F, 6.6429F, -3.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, 0.3353F, 0.0121F, -0.186F));

		PartDefinition hips_r26 = bone2.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(80, 15).mirror().addBox(0.6867F, 6.1808F, 0.1734F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, -0.2931F, 0.0121F, -0.186F));

		PartDefinition hips_r27 = bone2.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.6867F, 2.9261F, -8.3875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, 0.6669F, 0.0121F, -0.186F));

		PartDefinition hips_r28 = bone2.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(63, 71).mirror().addBox(0.6867F, 7.301F, -4.628F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, 0.0036F, 0.0121F, -0.186F));

		PartDefinition hips_r29 = bone2.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(0.6867F, 6.7901F, -2.5202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, -0.0749F, 0.0121F, -0.186F));

		PartDefinition hips_r30 = bone2.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.1707F, 4.0745F, -1.8003F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, -0.0815F, -0.054F, -0.2888F));

		PartDefinition hips_r31 = bone2.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(19, 84).mirror().addBox(-0.1707F, 2.3711F, -0.3541F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, -0.4305F, -0.054F, -0.2888F));

		PartDefinition hips_r32 = bone2.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(-0.1425F, -0.5456F, -0.4074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3345F, 0.3477F, -1.7F, -0.3943F, -0.0662F, -0.2857F));

		PartDefinition hips_r33 = bone2.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-0.2338F, 1.3608F, 0.6056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 15).mirror().addBox(-0.2338F, 0.3608F, -0.1944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8345F, -1.3523F, 3.6F, 0.0657F, 0.241F, -0.2789F));

		PartDefinition hips_r34 = bone2.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(0.3338F, 4.3127F, -1.056F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8345F, -1.3523F, 3.6F, 0.9872F, 0.1057F, -0.2264F));

		PartDefinition hips_r35 = bone2.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.4F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6552F, -1.1284F, 1.3478F, 1.2889F, -0.0362F, -0.2856F));

		PartDefinition hips_r36 = bone2.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.2338F, -0.6078F, -0.7079F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8345F, -1.3523F, 3.6F, 0.9035F, 0.241F, -0.2789F));

		PartDefinition hips_r37 = bone2.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(0.844F, 0.496F, -0.3015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -1.4523F, -1.6F, -0.1721F, -0.0299F, -0.2923F));

		PartDefinition hips_r38 = bone2.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(39, 82).mirror().addBox(0.5427F, -1.5904F, 0.8166F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -1.4523F, -1.6F, -0.9179F, -0.0662F, -0.2333F));

		PartDefinition hips_r39 = bone2.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(0.0927F, 1.9168F, -1.3835F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.5F, -0.6827F, 0.0004F, -0.2938F));

		PartDefinition hips_r40 = bone2.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(32, 78).mirror().addBox(0.0858F, -2.8048F, 2.2456F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.0F, -0.0699F, -0.0435F, 0.0038F));

		PartDefinition hips_r41 = bone2.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(0.0425F, -4.7641F, 0.551F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.0F, -0.5062F, -0.0435F, 0.0038F));

		PartDefinition hips_r42 = bone2.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-0.0412F, -0.2335F, -1.7985F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.0F, -0.0843F, -0.0226F, -0.2608F));

		PartDefinition hips_r43 = bone2.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(34, 63).mirror().addBox(-0.1F, -2.1756F, -1.7985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips_r44 = bone2.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(62, 39).mirror().addBox(-0.0613F, 1.3924F, -3.6934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -7.2523F, -0.2F, -0.1956F, 0.2246F, -0.0321F));

		PartDefinition hips_r45 = bone2.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.0613F, -1.3042F, -3.6623F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -7.2523F, -0.2F, 0.5112F, 0.2246F, -0.0321F));

		PartDefinition hips_r46 = bone2.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.8355F, -0.0917F, -0.1641F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -5.6523F, -3.9F, 0.3629F, 0.2246F, -0.0321F));

		PartDefinition hips_r47 = bone2.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-0.0613F, -0.3769F, -2.8929F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -7.2523F, -0.2F, 0.1622F, 0.2246F, -0.0321F));

		PartDefinition hips_r48 = bone2.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-0.1F, -4.0673F, -1.3918F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6345F, -3.4523F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create().texOffs(8, 69).addBox(-1.0117F, -1.7658F, -2.0091F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5F, 0.399F, 0.1733F, -0.0955F, 0.0F, 0.0F));

		PartDefinition rightthigh_r1 = rightthigh.addOrReplaceChild("rightthigh_r1", CubeListBuilder.create().texOffs(31, 71).addBox(-1.0F, 2.4634F, -1.0978F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightthigh_r2 = rightthigh.addOrReplaceChild("rightthigh_r2", CubeListBuilder.create().texOffs(8, 0).addBox(-0.6057F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightthigh_r3 = rightthigh.addOrReplaceChild("rightthigh_r3", CubeListBuilder.create().texOffs(76, 0).addBox(-1.0243F, -4.5488F, -0.2813F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0098F, 11.2721F, -2.5336F, -0.0613F, 0.0092F, 0.0003F));

		PartDefinition rightthigh_r4 = rightthigh.addOrReplaceChild("rightthigh_r4", CubeListBuilder.create().texOffs(47, 68).addBox(-1.0971F, -0.3977F, -1.5327F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0941F, 0.8756F, 0.5047F, -0.2533F, 0.0092F, 0.0003F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create().texOffs(25, 60).addBox(-1.5134F, 3.0449F, 0.1212F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 60).addBox(-1.5134F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2618F, 12.4892F, -1.4228F, 0.796F, 0.0F, 0.0424F));

		PartDefinition rightshin_r1 = rightshin.addOrReplaceChild("rightshin_r1", CubeListBuilder.create().texOffs(79, 31).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 76).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create().texOffs(0, 62).addBox(-1.471F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0524F, 12.6142F, 0.7396F, -0.8072F, -0.0682F, -0.1118F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(54, 9).addBox(-1.971F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0743F, -0.8039F, 0.3667F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(33, 47).addBox(-2.471F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create().texOffs(56, 68).addBox(-0.9883F, -1.7658F, -2.0091F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.5F, 0.399F, 0.1733F, -0.5301F, 0.0F, 0.0F));

		PartDefinition leftthigh_r1 = leftthigh.addOrReplaceChild("leftthigh_r1", CubeListBuilder.create().texOffs(70, 27).addBox(-1.0F, 2.4634F, -1.0978F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftthigh_r2 = leftthigh.addOrReplaceChild("leftthigh_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3943F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftthigh_r3 = leftthigh.addOrReplaceChild("leftthigh_r3", CubeListBuilder.create().texOffs(56, 75).addBox(-0.9757F, -4.5488F, -0.2813F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0098F, 11.2721F, -2.5336F, -0.0613F, -0.0092F, -0.0003F));

		PartDefinition leftthigh_r4 = leftthigh.addOrReplaceChild("leftthigh_r4", CubeListBuilder.create().texOffs(67, 52).addBox(-0.9029F, -0.3977F, -1.5327F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0941F, 0.8756F, 0.5047F, -0.2533F, -0.0092F, -0.0003F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create().texOffs(0, 18).addBox(-0.4866F, 3.0449F, 0.1212F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 60).addBox(-0.4866F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2618F, 12.4892F, -1.4228F, 0.7088F, 0.0F, -0.0424F));

		PartDefinition leftshin_r1 = leftshin.addOrReplaceChild("leftshin_r1", CubeListBuilder.create().texOffs(47, 78).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 71).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create().texOffs(20, 0).addBox(-1.529F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0524F, 12.6142F, 0.7396F, -0.8965F, 0.0518F, 0.0702F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(53, 43).addBox(-2.029F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0743F, -0.8039F, 0.6721F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(0, 46).addBox(-2.529F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4162F, 4.0077F, 0.0966F, 0.1387F, -0.0743F));

		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 92).addBox(-0.5F, -5.1F, 2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 48).addBox(-0.5F, -5.2F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 93).addBox(-0.5F, -5.4F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 93).addBox(-0.5F, -5.6F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 40).addBox(-1.5F, -2.8F, -3.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4267F, 2.9921F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 63).addBox(0.0F, 0.6F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 92).addBox(0.0F, -1.5F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3363F, 1.8162F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1692F, 7.8444F, 0.1516F, -0.0139F, -0.1745F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -1.4F, 7.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 40).addBox(0.0F, -1.6F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 40).addBox(0.0F, -1.8F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 39).addBox(0.0F, -2.2F, 1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(0.0F, -2.6F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 51).addBox(0.0F, -3.0F, -2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 56).addBox(0.0F, -3.1F, -4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.1F, -4.9F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 4.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 95).addBox(0.0F, 3.7F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 94).addBox(0.0F, 1.5F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 93).addBox(0.0F, -0.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 95).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7674F, 5.6438F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 95).addBox(0.0F, -0.5F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 95).addBox(0.0F, -1.5F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7179F, 1.2179F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0118F, 14.2188F, -0.0937F, -0.1999F, -0.0679F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 68).addBox(0.0F, 8.8F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 22).addBox(0.0F, 7.9F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 34).addBox(0.0F, 7.0F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(0.0F, 6.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 56).addBox(0.0F, 4.5F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2416F, -8.6273F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.5F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1973F, 5.5477F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0262F, 11.0007F, -0.0524F, -0.0436F, 0.0023F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 34).addBox(-2.0F, -3.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.8986F, 5.4654F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, 11.9F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 45).addBox(0.0F, 11.1F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 71).addBox(0.0F, 10.4F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 55).addBox(0.0F, 10.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 68).addBox(0.0F, 9.5F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2155F, -19.6279F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3082F, 10.6083F, -0.0464F, -0.3487F, 0.0159F));

		PartDefinition cube_r11 = tail5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0284F, 5.7812F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9686F, 11.6353F, -0.0962F, -0.4346F, 0.0406F));

		PartDefinition cube_r12 = tail6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 1.25F, -7.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8888F, 7.1672F, -0.48F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6111F, -5.6872F, -0.0429F, -0.0436F, -0.0095F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(70, 93).addBox(0.0F, -2.741F, 9.8678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 93).addBox(0.0F, -2.841F, 7.8678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 93).addBox(0.0F, -2.841F, 5.8678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 85).addBox(0.0F, -2.741F, 3.8678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 94).addBox(0.0F, -2.741F, 1.8678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 94).addBox(0.0F, -2.641F, -0.1322F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 26).addBox(-1.0F, -0.041F, -0.1322F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6486F, -10.8654F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 18).addBox(-5.5F, -0.1628F, -5.0146F, 11.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7514F, -6.0654F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 26).addBox(-5.0F, -2.0669F, -4.3889F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.3514F, -2.0654F, -0.1658F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = body.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-9.8588F, -3.0866F, -0.7988F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -10.1983F, -0.0501F, 0.1456F, -1.3685F));

		PartDefinition bodymiddle_r2 = body.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(55, 22).mirror().addBox(-4.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -2.1983F, -0.0781F, 0.0087F, -1.5103F));

		PartDefinition bodymiddle_r3 = body.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-3.8852F, -0.7437F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -0.1983F, -0.121F, -0.0189F, -1.1806F));

		PartDefinition bodymiddle_r4 = body.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -0.1983F, -0.1203F, 0.0221F, -0.79F));

		PartDefinition bodymiddle_r5 = body.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -2.1983F, -0.0633F, 0.0466F, -0.9878F));

		PartDefinition bodymiddle_r6 = body.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(85, 54).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -2.1983F, -0.042F, 0.0606F, -0.5948F));

		PartDefinition bodymiddle_r7 = body.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-5.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -4.1983F, -0.0677F, 0.0601F, -1.4401F));

		PartDefinition bodymiddle_r8 = body.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(78, 28).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -4.1983F, -0.0285F, 0.0858F, -0.9157F));

		PartDefinition bodymiddle_r9 = body.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -4.1983F, 0.0052F, 0.0835F, -0.5216F));

		PartDefinition bodymiddle_r10 = body.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(-6.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -6.1983F, -0.0607F, 0.0943F, -1.4396F));

		PartDefinition bodymiddle_r11 = body.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -6.1983F, -0.0053F, 0.1119F, -0.9134F));

		PartDefinition bodymiddle_r12 = body.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -6.1983F, 0.0368F, 0.0987F, -0.5187F));

		PartDefinition bodymiddle_r13 = body.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(-8.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -8.1983F, -0.0537F, 0.1285F, -1.4039F));

		PartDefinition bodymiddle_r14 = body.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -8.1983F, 0.0182F, 0.138F, -0.8756F));

		PartDefinition bodymiddle_r15 = body.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(87, 61).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -8.1983F, 0.0684F, 0.1138F, -0.4805F));

		PartDefinition bodymiddle_r16 = body.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(85, 30).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -10.1983F, 0.0299F, 0.151F, -0.839F));

		PartDefinition bodymiddle_r17 = body.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(88, 19).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0361F, -10.1983F, 0.0843F, 0.1213F, -0.4437F));

		PartDefinition bodymiddle_r18 = body.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(0, 71).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -0.1983F, -0.1203F, -0.0221F, 0.79F));

		PartDefinition bodymiddle_r19 = body.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(88, 34).addBox(1.8852F, -0.7437F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -0.1983F, -0.121F, 0.0189F, 1.1806F));

		PartDefinition bodymiddle_r20 = body.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(85, 54).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -2.1983F, -0.042F, -0.0606F, 0.5948F));

		PartDefinition bodymiddle_r21 = body.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(16, 69).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -2.1983F, -0.0633F, -0.0466F, 0.9878F));

		PartDefinition bodymiddle_r22 = body.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(55, 22).addBox(3.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -2.1983F, -0.0781F, -0.0087F, 1.5103F));

		PartDefinition bodymiddle_r23 = body.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(86, 76).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -4.1983F, 0.0052F, -0.0835F, 0.5216F));

		PartDefinition bodymiddle_r24 = body.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(78, 28).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -4.1983F, -0.0285F, -0.0858F, 0.9157F));

		PartDefinition bodymiddle_r25 = body.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(90, 0).addBox(3.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -4.1983F, -0.0677F, -0.0601F, 1.4401F));

		PartDefinition bodymiddle_r26 = body.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(87, 47).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -6.1983F, 0.0368F, -0.0987F, 0.5187F));

		PartDefinition bodymiddle_r27 = body.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(80, 20).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -6.1983F, -0.0053F, -0.1119F, 0.9134F));

		PartDefinition bodymiddle_r28 = body.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(85, 52).addBox(3.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -6.1983F, -0.0607F, -0.0943F, 1.4396F));

		PartDefinition bodymiddle_r29 = body.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(87, 61).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -8.1983F, 0.0684F, -0.1138F, 0.4805F));

		PartDefinition bodymiddle_r30 = body.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(84, 12).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -8.1983F, 0.0182F, -0.138F, 0.8756F));

		PartDefinition bodymiddle_r31 = body.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(35, 14).addBox(3.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -8.1983F, -0.0537F, -0.1285F, 1.4039F));

		PartDefinition bodymiddle_r32 = body.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(88, 19).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -10.1983F, 0.0843F, -0.1213F, 0.4437F));

		PartDefinition bodymiddle_r33 = body.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(85, 30).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -10.1983F, 0.0299F, -0.151F, 0.839F));

		PartDefinition bodymiddle_r34 = body.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(0, 11).addBox(3.8588F, -3.0866F, -0.7988F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0361F, -10.1983F, -0.0501F, -0.1456F, 1.3685F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0121F, -10.9135F, -0.0433F, 0.0435F, -0.0076F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 94).addBox(-1.0F, -2.7972F, 4.0833F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 25).addBox(-1.0F, -2.3972F, 2.0833F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 95).addBox(-1.0F, -1.9972F, 0.0833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3022F, -6.1261F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 34).addBox(-6.0F, -1.8572F, -1.8727F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.0022F, -0.4261F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r35 = chest.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-8.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3482F, -1.1848F, -0.043F, 0.1798F, -1.3673F));

		PartDefinition bodyfront_r1 = chest.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(0.0248F, -0.7486F, -0.4546F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 9.8304F, -5.1993F, 2.1672F, 0.1781F, -1.419F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(48, 11).mirror().addBox(-0.1001F, -0.1395F, -0.0931F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 9.7304F, -5.5993F, 2.2637F, 0.2937F, -1.3521F));

		PartDefinition bodyfront_r3 = chest.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.263F, -0.0819F, -0.3107F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 9.6304F, -5.8993F, 2.4343F, 0.2672F, -1.2351F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(61, 83).mirror().addBox(-0.2672F, -1.0771F, -0.8698F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 8.9304F, -7.1993F, 1.2823F, -0.4693F, -1.0247F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.3F, -1.5F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1544F, 6.0776F, -6.8194F, 1.0716F, -0.352F, -0.5639F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(43, 11).mirror().addBox(-4.0F, -0.2584F, -0.2592F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 11).addBox(5.2F, -0.2584F, -0.2592F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 4.9608F, -7.0731F, 0.829F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r36 = chest.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(15, 40).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0482F, -8.4848F, 0.2408F, 0.3671F, -1.2033F));

		PartDefinition bodymiddle_r37 = chest.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0482F, -8.4848F, 0.3598F, 0.2427F, -0.8123F));

		PartDefinition bodymiddle_r38 = chest.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -6.6848F, 0.2774F, 0.2085F, -0.6213F));

		PartDefinition bodymiddle_r39 = chest.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(16, 45).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -6.6848F, 0.1761F, 0.3047F, -1.0153F));

		PartDefinition bodymiddle_r40 = chest.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-5.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -6.6848F, -0.0056F, 0.3505F, -1.567F));

		PartDefinition bodymiddle_r41 = chest.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(20, 9).mirror().addBox(-7.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -5.1848F, -0.021F, 0.2823F, -1.4321F));

		PartDefinition bodymiddle_r42 = chest.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -5.1848F, 0.1262F, 0.254F, -0.8894F));

		PartDefinition bodymiddle_r43 = chest.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9482F, -5.1848F, 0.2124F, 0.1801F, -0.4942F));

		PartDefinition bodymiddle_r44 = chest.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-7.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6482F, -3.1848F, -0.0285F, 0.2481F, -1.4166F));

		PartDefinition bodymiddle_r45 = chest.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6482F, -3.1848F, 0.1017F, 0.2284F, -0.8778F));

		PartDefinition bodymiddle_r46 = chest.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(89, 71).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6482F, -3.1848F, 0.1802F, 0.1657F, -0.4823F));

		PartDefinition bodymiddle_r47 = chest.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3482F, -1.1848F, 0.1161F, 0.1362F, -0.4396F));

		PartDefinition bodymiddle_r48 = chest.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3482F, -1.1848F, 0.0536F, 0.1769F, -0.8351F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(36, 0).addBox(-0.7F, -1.5F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1544F, 6.0776F, -6.8194F, 1.0716F, 0.352F, 0.5639F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(61, 83).addBox(-0.7328F, -1.0771F, -0.8698F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 8.9304F, -7.1993F, 1.2823F, 0.4693F, 1.0247F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(10, 87).addBox(0.263F, -0.0819F, -0.3107F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 9.6304F, -5.8993F, 2.4343F, -0.2672F, 1.2351F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(48, 11).addBox(0.1001F, -0.1395F, -0.0931F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 9.7304F, -5.5993F, 2.2637F, -0.2937F, 1.3521F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(9, 18).addBox(-0.0248F, -0.7486F, -0.4546F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 9.8304F, -5.1993F, 2.1672F, -0.1781F, 1.419F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 51).addBox(-2.0F, -1.422F, -0.6023F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6022F, -5.2261F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 95).addBox(-1.0F, -2.5232F, 1.8141F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 95).addBox(-1.0F, -2.2232F, -0.1859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9022F, -9.1261F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r49 = chest.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(88, 56).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0482F, -8.4848F, 0.3598F, -0.2427F, 0.8123F));

		PartDefinition bodymiddle_r50 = chest.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(15, 40).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0482F, -8.4848F, 0.2408F, -0.3671F, 1.2033F));

		PartDefinition bodymiddle_r51 = chest.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(43, 89).addBox(3.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -6.6848F, -0.0056F, -0.3505F, 1.567F));

		PartDefinition bodymiddle_r52 = chest.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(16, 45).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -6.6848F, 0.1761F, -0.3047F, 1.0153F));

		PartDefinition bodymiddle_r53 = chest.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(88, 83).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -6.6848F, 0.2774F, -0.2085F, 0.6213F));

		PartDefinition bodymiddle_r54 = chest.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(62, 89).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -5.1848F, 0.2124F, -0.1801F, 0.4942F));

		PartDefinition bodymiddle_r55 = chest.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(12, 54).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -5.1848F, 0.1262F, -0.254F, 0.8894F));

		PartDefinition bodymiddle_r56 = chest.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(20, 9).addBox(3.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9482F, -5.1848F, -0.021F, -0.2823F, 1.4321F));

		PartDefinition bodymiddle_r57 = chest.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(89, 71).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6482F, -3.1848F, 0.1802F, -0.1657F, 0.4823F));

		PartDefinition bodymiddle_r58 = chest.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(54, 16).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6482F, -3.1848F, 0.1017F, -0.2284F, 0.8778F));

		PartDefinition bodymiddle_r59 = chest.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(35, 16).addBox(3.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6482F, -3.1848F, -0.0285F, -0.2481F, 1.4166F));

		PartDefinition bodymiddle_r60 = chest.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(0, 13).addBox(3.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3482F, -1.1848F, -0.043F, -0.1798F, 1.3673F));

		PartDefinition bodymiddle_r61 = chest.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(39, 61).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3482F, -1.1848F, 0.0536F, -0.1769F, 0.8351F));

		PartDefinition bodymiddle_r62 = chest.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(9, 62).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3482F, -1.1848F, 0.1161F, -0.1362F, 0.4396F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 39).addBox(-2.0F, -0.4183F, -0.1233F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3022F, -9.1261F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftarm3 = chest.addOrReplaceChild("leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7967F, 8.0401F, -4.9998F, -0.4611F, 0.1966F, -0.2699F));

		PartDefinition cube_r21 = leftarm3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(13, 91).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.019F, 0.5237F, 1.4254F, 2.0503F, 0.0357F, -0.025F));

		PartDefinition cube_r22 = leftarm3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 91).addBox(-0.8532F, 1.5234F, -0.4556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2228F, -1.5125F, -1.3361F, 0.6453F, 0.0357F, -0.025F));

		PartDefinition cube_r23 = leftarm3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(70, 71).addBox(3.9285F, 0.3143F, -0.4591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5034F, -0.4252F, -0.4159F, 0.8199F, 0.0357F, -0.025F));

		PartDefinition cube_r24 = leftarm3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 89).addBox(3.9825F, -1.1926F, -1.9136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5034F, -1.1252F, 1.5841F, 1.3435F, 0.0357F, -0.025F));

		PartDefinition cube_r25 = leftarm3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(80, 88).addBox(4.1251F, -1.3643F, -1.1075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5034F, 0.5748F, 4.3841F, 1.1864F, 0.0357F, -0.025F));

		PartDefinition leftarm4 = leftarm3.addOrReplaceChild("leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3966F, 1.7009F, 5.4048F, 0.083F, -0.1046F, -0.0363F));

		PartDefinition cube_r26 = leftarm4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 86).addBox(3.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(14, 84).addBox(3.5F, -1.6F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lefthand2 = leftarm4.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0273F, 5.0738F, -1.5538F, -0.0791F, -0.0368F, -0.4349F));

		PartDefinition cube_r27 = lefthand2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 82).addBox(-1.3F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2273F, 1.8943F, -0.7714F, -0.1265F, 0.0338F, 0.2597F));

		PartDefinition leftfingers = lefthand2.addOrReplaceChild("leftfingers", CubeListBuilder.create(), PartPose.offset(-0.2273F, 1.8943F, -0.7714F));

		PartDefinition cube_r28 = leftfingers.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(67, 0).addBox(-1.9452F, -0.0569F, -0.3825F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5904F, 0.8753F, 0.2706F, -0.1106F, 0.0702F, 0.5633F));

		PartDefinition leftclaw = lefthand2.addOrReplaceChild("leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3049F, 0.1884F, -0.8777F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftclaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 26).addBox(-0.3F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5723F, 1.8839F, -1.6548F, -0.453F, 0.0969F, 0.4691F));

		PartDefinition cube_r30 = leftclaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 78).addBox(-3.1419F, -0.04F, -0.3231F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7723F, 2.2839F, -1.1548F, -0.398F, 0.2422F, 0.7914F));

		PartDefinition rightarm3 = chest.addOrReplaceChild("rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7967F, 8.0401F, -4.9998F, -0.5228F, -0.4549F, 0.0885F));

		PartDefinition cube_r31 = rightarm3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.019F, 0.5237F, 1.4254F, 2.0503F, -0.0357F, 0.025F));

		PartDefinition cube_r32 = rightarm3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(42, 91).addBox(-0.1468F, 1.5234F, -0.4556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2228F, -1.5125F, -1.3361F, 0.6453F, -0.0357F, 0.025F));

		PartDefinition cube_r33 = rightarm3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 49).addBox(-4.9285F, 0.3143F, -0.4591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5034F, -0.4252F, -0.4159F, 0.8199F, -0.0357F, 0.025F));

		PartDefinition cube_r34 = rightarm3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 89).addBox(-4.9825F, -1.1926F, -1.9136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5034F, -1.1252F, 1.5841F, 1.3435F, -0.0357F, 0.025F));

		PartDefinition cube_r35 = rightarm3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(88, 66).addBox(-5.1251F, -1.3643F, -1.1075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5034F, 0.5748F, 4.3841F, 1.1864F, -0.0357F, 0.025F));

		PartDefinition rightarm4 = rightarm3.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3966F, 1.7009F, 5.4048F, -0.0346F, 0.5186F, 0.4215F));

		PartDefinition cube_r36 = rightarm4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(85, 0).addBox(-4.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(34, 61).addBox(-4.5F, -1.6F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition righthand2 = rightarm4.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0273F, 5.0738F, -1.5538F, -0.2461F, 0.05F, 0.6091F));

		PartDefinition cube_r37 = righthand2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 82).addBox(0.3F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2273F, 1.8943F, -0.7714F, -0.1265F, -0.0338F, -0.2597F));

		PartDefinition rightfingers = righthand2.addOrReplaceChild("rightfingers", CubeListBuilder.create(), PartPose.offset(0.2273F, 1.8943F, -0.7714F));

		PartDefinition cube_r38 = rightfingers.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 32).addBox(-0.0548F, -0.0569F, -0.3825F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5904F, 0.8753F, 0.2706F, -0.1106F, -0.0702F, -0.5633F));

		PartDefinition rightclaw = righthand2.addOrReplaceChild("rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3049F, 0.1884F, -0.8777F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightclaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 18).addBox(-0.7F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5723F, 1.8839F, -1.6548F, -0.453F, -0.0969F, -0.4691F));

		PartDefinition cube_r40 = rightclaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(76, 52).addBox(0.1419F, -0.04F, -0.3231F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7723F, 2.2839F, -1.1548F, -0.398F, -0.2422F, -0.7914F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1342F, -8.9269F, 0.1018F, 0.0908F, 0.0402F));

		PartDefinition cube_r41 = neck.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(75, 39).addBox(0.0F, -2.1001F, 0.0068F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9724F, -3.8304F, -0.48F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r63 = neck.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(-3.0282F, 0.0346F, -0.7852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.586F, -3.2579F, 0.2939F, 0.5636F, -1.0728F));

		PartDefinition bodymiddle_r64 = neck.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-3.0282F, 0.0346F, -0.7852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.086F, -1.2579F, 0.312F, 0.4714F, -1.0026F));

		PartDefinition bodymiddle_r65 = neck.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(85, 32).addBox(0.0282F, 0.0346F, -0.7852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.586F, -3.2579F, 0.2939F, -0.5636F, 1.0728F));

		PartDefinition bodymiddle_r66 = neck.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(85, 37).addBox(0.0282F, 0.0346F, -0.7852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.086F, -1.2579F, 0.312F, -0.4714F, 1.0026F));

		PartDefinition cube_r42 = neck.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 0).addBox(0.0F, -2.7015F, 1.9229F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 39).addBox(-0.5F, -1.0015F, -0.0771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0276F, -3.9304F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.503F, -3.7071F, 0.0153F, 0.1538F, 0.0817F));

		PartDefinition cube_r43 = neck2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(85, 94).addBox(0.5F, -2.7F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 94).addBox(0.5F, -2.7F, -4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 45).addBox(0.0F, -0.4F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0132F, 0.101F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r67 = neck2.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(90, 43).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.083F, -2.6507F, 0.2539F, 0.4981F, -1.1768F));

		PartDefinition bodymiddle_r68 = neck2.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(90, 45).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.883F, -1.0507F, 0.2582F, 0.4218F, -1.159F));

		PartDefinition bodymiddle_r69 = neck2.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(90, 43).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.083F, -2.6507F, 0.2539F, -0.4981F, 1.1768F));

		PartDefinition bodymiddle_r70 = neck2.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(90, 45).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.883F, -1.0507F, 0.2582F, -0.4218F, 1.159F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8764F, -4.0773F, 0.0703F, 0.1166F, 0.0213F));

		PartDefinition cube_r44 = neck3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(48, 95).addBox(0.5F, -3.2F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 26).addBox(0.0F, -1.2F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 0.5278F, -0.3196F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r71 = neck3.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3065F, -0.1734F, 0.2671F, 0.4892F, -1.1388F));

		PartDefinition bodymiddle_r72 = neck3.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(90, 9).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3065F, -0.1734F, 0.2671F, -0.4892F, 1.1388F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7754F, -1.4407F, -0.1855F, 0.3435F, -0.0631F));

		PartDefinition cube_r45 = neck4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(61, 50).addBox(-0.5F, -4.6F, 0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 47).addBox(-1.0F, -2.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 2.5228F, -2.174F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r73 = neck4.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2689F, -0.9327F, 0.6662F, 0.9138F, -0.926F));

		PartDefinition bodymiddle_r74 = neck4.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(90, 2).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2689F, -0.9327F, 0.6662F, -0.9138F, 0.926F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.123F, -2.089F, 0.0F, 0.1309F, -0.0436F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(31, 84).addBox(0.0F, -0.018F, -1.9604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.7934F, -3.0611F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(20, 60).addBox(1.0F, -0.0306F, -1.0289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.072F, -6.7682F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 73).addBox(1.0F, -0.0147F, -2.9986F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, -0.728F, -4.9682F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(18, 91).addBox(1.0F, -0.0249F, -1.0445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 1.4547F, -10.5292F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 73).addBox(1.0F, -0.0771F, -1.028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 1.0547F, -9.6292F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 77).addBox(1.0F, -0.0375F, -0.9864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.7547F, -9.4292F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(28, 94).addBox(1.0F, -0.0038F, -0.9707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 0.3547F, -8.5292F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 30).addBox(1.0F, -0.0317F, -0.3697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.5F, 0.3547F, -8.1292F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 83).addBox(1.0F, -0.4F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 1.1547F, -8.9292F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 89).addBox(-0.5F, -0.0341F, -0.0412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.4485F, -11.6148F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(85, 90).addBox(-0.5F, -0.0266F, -0.6807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7485F, -11.8148F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -0.0443F, -0.0589F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.3485F, -12.5148F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(94, 60).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9485F, -12.1148F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(73, 45).addBox(-0.5F, -0.4397F, -0.0263F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 5.0812F, -12.4872F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(74, 64).addBox(0.0F, -0.025F, -0.0665F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 1.8816F, -10.3611F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 34).addBox(0.0F, 0.0022F, 0.0446F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 4.0816F, -12.5611F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 74).addBox(0.0F, -0.4F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.0F, 4.4816F, -11.4611F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 10).addBox(-1.0F, -0.9434F, 0.0181F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 6.0147F, -9.6326F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(81, 42).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 3.6987F, -10.1412F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 72).addBox(-1.0F, -3.0248F, -2.041F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, 4.9147F, -7.5326F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(15, 26).addBox(-1.0F, -1.0269F, -0.0855F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 5.2916F, -6.65F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 50).addBox(-1.0F, -3.9834F, -2.0068F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.2916F, -5.85F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 32).addBox(-1.0F, -2.0512F, -1.6085F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.1916F, -4.25F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(46, 84).mirror().addBox(-0.5F, -0.4F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, -0.6879F, -3.6177F, 0.932F, -0.1048F, -0.3791F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(46, 84).addBox(-0.5F, -0.4F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -0.6879F, -3.6177F, 0.932F, 0.1048F, 0.3791F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(87, 79).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4226F, -0.9691F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-2.0F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8455F, -0.0231F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(93, 11).mirror().addBox(-2.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 11).addBox(1.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.7075F, -0.2345F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(86, 86).addBox(1.0F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8455F, -0.0231F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(32, 55).addBox(-3.0F, -0.1F, 0.7F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(53, 39).addBox(-2.0F, -0.1F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7455F, -3.9231F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(88, 39).mirror().addBox(-2.0F, 0.0116F, -2.0282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 39).addBox(-0.8F, 0.0116F, -2.0282F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.9441F, -10.7326F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-2.0F, -0.6F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(63, 30).addBox(-0.8F, -0.6F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9F, 2.8441F, -11.2326F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-1.0F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 4).addBox(1.2F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6F, 2.6017F, -8.4803F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-2.0F, -0.03F, -1.9351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(86, 14).addBox(0.2F, -0.03F, -1.9351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4F, 0.9863F, -5.9321F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(-2.0F, -1.0323F, -0.446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 23).addBox(0.2F, -1.0323F, -0.446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.3863F, -7.1321F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-2.0F, -0.6F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(62, 91).mirror().addBox(-2.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(62, 91).addBox(0.7F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(81, 66).addBox(0.2F, -0.6F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, 2.1863F, -4.8321F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(93, 38).addBox(1.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1F, 1.4261F, -4.6525F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 22).mirror().addBox(-2.0F, -0.132F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(86, 22).addBox(1.2F, -0.132F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, 0.3863F, -3.9321F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(74, 91).mirror().addBox(-2.0F, -2.0192F, 0.01F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 91).addBox(2.2F, -2.0192F, 0.01F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.499F, -1.6646F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-2.0F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 92).addBox(2.2F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6F, 2.299F, -0.9646F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(34, 92).mirror().addBox(-2.0F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(34, 92).addBox(2.2F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6F, 1.8566F, -3.1678F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-2.0F, -1.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 67).mirror().addBox(-2.0F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(90, 58).mirror().addBox(-2.14F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(29, 78).mirror().addBox(-2.26F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 53).addBox(2.2F, -1.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(29, 78).addBox(2.46F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 58).addBox(2.34F, -1.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 67).addBox(2.2F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6F, 1.2095F, -2.6869F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(58, 22).addBox(-2.0F, -4.08F, -2.9826F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.2959F, -2.485F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 16).addBox(-3.0F, -3.0677F, -1.8025F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.7959F, -0.685F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -1.8F, -1.5F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.5959F, -2.285F, 0.0436F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.542F, 0.7596F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(76, 7).addBox(-0.5F, -1.026F, 0.054F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 5.1956F, -11.6071F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 10).addBox(0.0F, -0.8F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.829F, -10.537F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(75, 15).addBox(0.0F, -0.6F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 4.829F, -10.537F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(48, 22).addBox(0.0F, -0.9F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 4.2795F, -11.544F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 59).addBox(0.0F, -0.0197F, -1.9154F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.6795F, -10.044F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(81, 7).mirror().addBox(-2.5F, -0.043F, -3.0093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 7).addBox(-0.5F, -0.043F, -3.0093F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.913F, -7.3256F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(88, 5).mirror().addBox(-2.5F, -1.0395F, -1.9006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(88, 5).addBox(-0.5F, -1.0395F, -1.9006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 3.313F, -5.2256F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(80, 76).mirror().addBox(-3.0F, 0.0601F, -2.8904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(80, 76).addBox(-1.0F, 0.0601F, -2.8904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 2.6101F, -7.6568F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(36, 88).mirror().addBox(-3.0F, -0.0413F, -1.9294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(36, 88).addBox(-1.0F, -0.0413F, -1.9294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.0F, 1.5101F, -6.0568F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(23, 78).mirror().addBox(-4.0F, -0.0057F, -2.9877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(23, 78).addBox(-1.0F, -0.0057F, -2.9877F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, 0.281F, -3.2729F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-4.0F, -1.9594F, 0.0426F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(24, 84).addBox(-1.0F, -1.9594F, 0.0426F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 3.281F, -5.2729F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-5.0F, -2.0419F, -1.9751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0035F)).mirror(false)
				.texOffs(83, 56).addBox(-1.0F, -2.0419F, -1.9751F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0035F)), PartPose.offsetAndRotation(3.0F, 2.281F, -1.5729F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(32, 34).mirror().addBox(-2.0F, 4.1F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(32, 34).addBox(-0.8F, 4.1F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1F, -2.6854F, -3.9274F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-5.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0035F)).mirror(false)
				.texOffs(79, 37).addBox(-1.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0035F)), PartPose.offsetAndRotation(3.0F, 0.381F, 0.6271F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(92, 63).mirror().addBox(-5.0F, 0.0004F, -1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 63).addBox(-1.0F, 0.0004F, -1.0672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.119F, -2.2729F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(26, 52).mirror().addBox(-5.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(26, 52).addBox(-1.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 0.381F, 0.6271F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-5.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0035F)).mirror(false)
				.texOffs(74, 79).addBox(-1.0F, -0.8738F, -2.8772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0035F)), PartPose.offsetAndRotation(3.0F, 0.381F, 0.6271F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 40).addBox(0.0F, -0.0351F, 0.1484F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 2.8101F, -10.2568F, 0.288F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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