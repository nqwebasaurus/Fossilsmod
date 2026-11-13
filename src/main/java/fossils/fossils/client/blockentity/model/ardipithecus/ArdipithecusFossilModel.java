package fossils.fossils.client.blockentity.model.ardipithecus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArdipithecusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart opposableToe;
	private final ModelPart opposableToe2;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart opposableToe3;
	private final ModelPart opposableToe4;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart thumb;
	private final ModelPart thumb2;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart thumb3;
	private final ModelPart thumb4;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone5;
	private final ModelPart rightFace;
	private final ModelPart bone7;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart tail;

	public ArdipithecusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.opposableToe = this.leftLeg3.getChild("opposableToe");
		this.opposableToe2 = this.opposableToe.getChild("opposableToe2");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.opposableToe3 = this.rightLeg3.getChild("opposableToe3");
		this.opposableToe4 = this.opposableToe3.getChild("opposableToe4");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone4 = this.chest.getChild("bone4");
		this.bone6 = this.chest.getChild("bone6");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.thumb = this.leftArm3.getChild("thumb");
		this.thumb2 = this.thumb.getChild("thumb2");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.thumb3 = this.rightArm3.getChild("thumb3");
		this.thumb4 = this.thumb3.getChild("thumb4");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone5 = this.leftFace.getChild("bone5");
		this.rightFace = this.head.getChild("rightFace");
		this.bone7 = this.rightFace.getChild("bone7");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.668F, 7.0317F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 92).addBox(0.0F, -0.5722F, -1.6092F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 89).addBox(0.0F, -0.7132F, -0.1343F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.2F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 51).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6082F, 2.5596F, -1.3391F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(100, 39).addBox(-0.5F, -0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.5121F, -1.076F, -1.0915F, -0.1484F, 0.9076F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1844F, 0.1669F, -0.0543F, -0.5411F, 0.9076F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 56).addBox(-0.9F, -0.4863F, -2.1035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 0.5915F, -0.1053F, -0.8029F, 0.9076F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 85).addBox(-0.4965F, -6.068F, -1.4026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0916F, 1.0036F, 0.0524F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.533F, 7.5583F, 0.0298F, 0.0268F, 0.8472F, 0.11F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 80).addBox(-0.2186F, -3.1462F, -0.2704F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1167F, 12.9435F, 0.6664F, 0.2793F, 0.6723F, 0.1668F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 82).addBox(-0.2186F, -3.1744F, -0.7257F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1167F, 12.9435F, 0.6664F, 0.1484F, 0.6723F, 0.1668F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 64).addBox(-1.0171F, -0.1999F, -0.8006F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0734F, 5.3069F, -0.346F, 0.0529F, 0.8472F, 0.11F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(79, 89).addBox(-0.4965F, -3.1785F, -1.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0044F, 1.0036F, 0.0524F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 27).addBox(-0.9F, -0.5797F, -0.8394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4F, 0.5915F, -0.1053F, -1.8675F, 0.9076F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9181F, 0.1033F, 0.8071F, -2.0857F, 0.9076F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 41).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 0.1033F, 0.8071F, -2.6965F, 0.9076F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 86).addBox(-0.4965F, -5.4792F, -1.6579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.2531F, 1.0036F, 0.0524F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 5).addBox(-0.4965F, -6.1463F, -0.9542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0349F, 1.0036F, 0.0524F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(71, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0228F, 14.0315F, -0.4644F, 0.1471F, 0.0193F, 0.0014F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 35).addBox(-0.7649F, 0.7286F, -1.718F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2167F, 12.9435F, 0.6664F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 56).addBox(-0.7649F, -0.6162F, -1.2993F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2167F, 12.9435F, 0.6664F, 0.9861F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 15.0432F, 0.501F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 21).addBox(-1.0F, -0.775F, 0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 22).addBox(-1.0F, -0.225F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2583F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9643F, -2.0532F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 64).addBox(0.0F, 0.975F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8722F, -1.3643F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 74).addBox(-1.0F, -1.725F, -1.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2583F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(27, 85).addBox(-1.0F, -0.8F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(17, 79).addBox(-1.9F, -0.2839F, -0.9554F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 9.9667F, -4.7034F, -0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -8.1F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.9748F, -4.7729F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 52).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 1.1353F, 0.7092F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(100, 25).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(25, 100).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 1.9449F, 1.8022F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 93).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8F, 3.3706F, 0.8763F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -10.9573F, -0.8132F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.8F, 12.1593F, -5.4992F, -0.6196F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(35, 39).addBox(-1.1059F, -0.537F, -0.55F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1982F, 13.3323F, -6.7907F, -1.4148F, -0.1603F, 0.0616F));

		PartDefinition cube_r33 = leftLeg3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 77).addBox(-1.2F, -1.9185F, -0.2027F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8941F, -0.4513F, 0.3615F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(53, 72).addBox(0.7499F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.68F, 3.9813F, 0.35F, -0.2182F, 0.0F, -0.1309F));

		PartDefinition cube_r35 = leftLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(71, 44).addBox(0.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, -0.1309F));

		PartDefinition opposableToe = leftLeg3.addOrReplaceChild("opposableToe", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3405F, 0.0386F, 0.0965F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r36 = opposableToe.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(26, 71).addBox(-1.2726F, 0.1383F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition opposableToe2 = opposableToe.addOrReplaceChild("opposableToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4839F, 4.7462F, -0.3405F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r37 = opposableToe2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(31, 33).addBox(-2.0254F, -12.1998F, -7.6228F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3115F, 11.6999F, 3.3713F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(17, 0).addBox(-1.2059F, -0.6556F, -5.0715F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 4.2749F, 0.0205F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 21).addBox(-1.5974F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1941F, -0.1556F, -2.9466F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -3.6144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6082F, 2.5596F, -1.3391F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 101).addBox(-0.5F, -0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5121F, -1.076F, -1.0915F, -0.1484F, -0.9076F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(43, 81).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1844F, 0.1669F, -0.0543F, -0.5411F, -0.9076F, 0.0F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 56).addBox(-0.1F, -0.4863F, -2.1035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 0.5915F, -0.1053F, -0.8029F, -0.9076F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(41, 85).addBox(-0.5035F, -6.068F, -1.4026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0916F, -1.0036F, -0.0524F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.533F, 7.5583F, 0.0298F, 0.0268F, -0.8472F, -0.11F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(22, 82).addBox(-0.7814F, -3.1462F, -0.2704F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1167F, 12.9435F, 0.6664F, 0.2793F, -0.6723F, -0.1668F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(69, 82).addBox(-0.7814F, -3.1744F, -0.7257F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1167F, 12.9435F, 0.6664F, 0.1484F, -0.6723F, -0.1668F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 10).addBox(0.0171F, -0.1999F, -0.8006F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0734F, 5.3069F, -0.346F, 0.0529F, -0.8472F, -0.11F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 91).addBox(-0.5035F, -3.1785F, -1.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0044F, -1.0036F, -0.0524F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 98).addBox(-0.1F, -0.5797F, -0.8394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4F, 0.5915F, -0.1053F, -1.8675F, -0.9076F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(83, 28).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9181F, 0.1033F, 0.8071F, -2.0857F, -0.9076F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(83, 45).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9181F, 0.1033F, 0.8071F, -2.6965F, -0.9076F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 87).addBox(-0.5035F, -5.4792F, -1.6579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.2531F, -1.0036F, -0.0524F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5035F, -6.1463F, -0.9542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0349F, -1.0036F, -0.0524F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0228F, 14.0315F, -0.4644F, 0.1471F, -0.0193F, -0.0014F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 51).addBox(-1.2351F, 0.7286F, -1.718F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2167F, 12.9435F, 0.6664F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(53, 56).addBox(-1.2351F, -0.6162F, -1.2993F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2167F, 12.9435F, 0.6664F, 0.9861F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 15.0432F, 0.501F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(84, 14).addBox(-1.0F, -0.775F, 0.075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -0.225F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2583F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.9643F, -2.0532F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(74, 37).addBox(-1.0F, 0.975F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8722F, -1.3643F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 74).addBox(-1.0F, -1.725F, -1.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2583F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(34, 85).addBox(-1.0F, -0.8F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 79).addBox(0.9F, -0.2839F, -0.9554F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 9.9667F, -4.7034F, -0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(5, 39).addBox(-0.5F, -8.1F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 8.9748F, -4.7729F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(53, 30).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 1.1353F, 0.7092F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(35, 100).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(100, 33).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 1.9449F, 1.8022F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(61, 93).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8F, 3.3706F, 0.8763F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 25).addBox(-0.5F, -10.9573F, -0.8132F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8F, 12.1593F, -5.4992F, -0.6196F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(10, 41).addBox(-1.8941F, -0.537F, -0.55F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1982F, 13.3323F, -6.7907F, -1.6929F, 0.0639F, -0.1388F));

		PartDefinition cube_r68 = rightLeg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(29, 81).addBox(-0.8F, -1.9185F, -0.2027F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8941F, -0.4513F, 0.3615F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 73).addBox(-1.7499F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.68F, 3.9813F, 0.35F, -0.2182F, 0.0F, 0.1309F));

		PartDefinition cube_r70 = rightLeg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(17, 72).addBox(-1.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, 0.1309F));

		PartDefinition opposableToe3 = rightLeg3.addOrReplaceChild("opposableToe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3405F, 0.0386F, 0.0965F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r71 = opposableToe3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(7, 72).addBox(0.2726F, 0.1383F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition opposableToe4 = opposableToe3.addOrReplaceChild("opposableToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4839F, 4.7462F, -0.3405F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r72 = opposableToe4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(34, 0).addBox(1.0254F, -12.1998F, -7.6228F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3115F, 11.6999F, 3.3713F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(17, 7).addBox(-1.7941F, -0.6556F, -5.0715F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, 4.2749F, 0.0205F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 27).addBox(-0.4026F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1941F, -0.1556F, -2.9466F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -3.6144F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, -0.7672F, -4.5566F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 17).addBox(-1.8F, -0.5F, -0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6931F, 0.088F, -0.4538F, -1.9756F, 0.637F, -1.7965F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(59, 17).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1208F, -1.2902F, -2.1172F, -0.9983F, 0.4969F, -0.2382F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(42, 31).addBox(-1.325F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8771F, 1.9573F, -0.1267F, -0.8062F, 0.0137F, 1.2116F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(75, 11).addBox(-1.1376F, -0.6105F, -3.5155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -0.9656F, -0.5004F, 1.8322F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(76, 29).addBox(0.2193F, -0.6105F, -3.4859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -0.8092F, -0.0768F, 1.3062F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 61).addBox(-0.7115F, -0.5465F, -3.2412F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -0.8065F, 0.0718F, 1.0253F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1536F, -1.2558F, -2.0999F, -0.8315F, 0.0003F, 0.3983F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(71, 51).addBox(-1.9438F, -0.4813F, -1.3164F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -1.8238F, 0.91F, -1.1855F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(86, 72).addBox(-1.992F, -0.4813F, -0.509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -1.8238F, 0.91F, -1.1855F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(44, 70).addBox(-1.6505F, -0.4813F, -1.6874F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -1.9767F, 0.8675F, -1.3822F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 86).addBox(-2.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -0.4942F, 0.7097F, 0.6504F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(39, 22).addBox(-3.9227F, -0.1753F, -1.6635F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, -1.7937F, 1.0457F, -0.9108F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 24).addBox(-0.7838F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.5696F, 0.8437F, -1.7052F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(19, 41).addBox(-2.3138F, -4.361F, -1.3196F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -1.5391F, 1.2026F, -0.5487F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(82, 0).addBox(0.6503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -3.0944F, -0.9384F, 2.4575F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(49, 94).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2987F, 3.8197F, 5.8756F, -2.743F, 1.4989F, 2.8932F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 94).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0943F, 3.2175F, 5.8095F, -3.0945F, 0.9368F, 2.5335F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 94).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4931F, 4.4115F, 5.7244F, -3.1134F, 0.1519F, 2.4998F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 78).addBox(0.25F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0791F, 3.9424F, 4.6493F, -3.1058F, -0.6768F, 2.4731F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 66).addBox(1.738F, -1.0648F, -3.4722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.8891F, -1.459F, 2.2445F));

		PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(34, 88).addBox(-2.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -3.1105F, -0.4588F, 2.4818F));

		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 34).addBox(-0.7515F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -2.0857F, -1.5359F, 1.5708F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 10).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6203F, 3.3817F, 2.4857F, -3.0933F, -0.8898F, 2.5889F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 35).addBox(1.084F, -1.5093F, -2.7575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 5.6544F, 1.9437F, -0.0463F, -0.8544F, -0.4802F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 88).addBox(-0.7566F, -0.6238F, -0.8335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3282F, 1.3858F, 0.0303F, 0.418F, 0.0779F, 0.6711F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(11, 61).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3896F, 1.6187F, 3.5616F, -0.149F, -0.8259F, 0.402F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 84).addBox(-0.1F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3124F, -0.0208F, 0.7731F, -0.0105F, -0.1591F, 0.1597F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(39, 26).addBox(0.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 0.0769F, 1.2632F, -0.1986F, 0.0169F, 0.2438F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 77).addBox(-0.5F, -2.0F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.127F, 3.8832F, 1.1001F, 0.1368F, 0.0783F, 0.9221F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(32, 95).addBox(-1.0F, -0.7742F, -1.0573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 5.3294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(75, 7).addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8281F, 5.9234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -4.5566F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-1.2F, -0.5F, -0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6931F, 0.088F, -0.4538F, -1.9756F, -0.637F, 1.7965F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1208F, -1.2902F, -2.1172F, -0.9983F, -0.4969F, 0.2382F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(42, 31).mirror().addBox(-0.675F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8771F, 1.9573F, -0.1267F, -0.8062F, -0.0137F, -1.2116F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(0.1376F, -0.6105F, -3.5155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.9656F, 0.5004F, -1.8322F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-1.2193F, -0.6105F, -3.4859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8092F, 0.0768F, -1.3062F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-1.2885F, -0.5465F, -3.2412F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8065F, -0.0718F, -1.0253F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1536F, -1.2558F, -2.0999F, -0.8315F, -0.0003F, -0.3983F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-1.0562F, -0.4813F, -1.3164F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.8238F, -0.91F, 1.1855F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-0.008F, -0.4813F, -0.509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.8238F, -0.91F, 1.1855F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(44, 70).mirror().addBox(-1.3495F, -0.4813F, -1.6874F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.9767F, -0.8675F, 1.3822F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 86).mirror().addBox(0.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.4942F, -0.7097F, -0.6504F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(39, 22).mirror().addBox(-0.0773F, -0.1753F, -1.6635F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.7937F, -1.0457F, 0.9108F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-1.2162F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.5696F, -0.8437F, 1.7052F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 41).mirror().addBox(-2.6862F, -4.361F, -1.3196F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -1.5391F, -1.2026F, 0.5487F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-1.6503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.0944F, 0.9384F, -2.4575F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(49, 94).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2987F, 3.8197F, 5.8756F, -2.743F, -1.4989F, -2.8932F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(44, 94).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0943F, 3.2175F, 5.8095F, -3.0945F, -0.9368F, -2.5335F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(39, 94).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4931F, 4.4115F, 5.7244F, -3.1134F, -0.1519F, -2.4998F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-1.25F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0791F, 3.9424F, 4.6493F, -3.1058F, 0.6768F, -2.4731F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-2.738F, -1.0648F, -3.4722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.8891F, 1.459F, -2.2445F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 88).mirror().addBox(0.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.1105F, 0.4588F, -2.4818F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-2.2484F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0857F, 1.5359F, -1.5708F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6203F, 3.3817F, 2.4857F, -3.0933F, 0.8898F, -2.5889F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(95, 35).mirror().addBox(-2.084F, -1.5093F, -2.7575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.0463F, 0.8544F, 0.4802F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(29, 88).mirror().addBox(-0.2435F, -0.6238F, -0.8335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, 0.418F, -0.0779F, -0.6711F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3896F, 1.6187F, 3.5616F, -0.149F, 0.8259F, -0.402F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(-1.9F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3124F, -0.0208F, 0.7731F, -0.0105F, 0.1591F, -0.1597F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(39, 26).mirror().addBox(-2.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 0.0769F, 1.2632F, -0.1986F, -0.0169F, -0.2438F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-0.5F, -2.0F, -0.45F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.127F, 3.8832F, 1.1001F, 0.1368F, -0.0783F, -0.9221F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(32, 95).mirror().addBox(0.0F, -0.7742F, -1.0573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 5.3294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 5.9234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3183F, -4.0742F, -0.4011F, -0.017F, -0.0402F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 25).addBox(0.0F, -0.6751F, -0.317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(32, 41).addBox(0.0F, -0.793F, -0.2538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(0.8189F, -0.4319F, 0.0649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, -0.1342F, -1.8505F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5204F, -0.8527F, -5.2657F, -2.9695F, -0.3063F, -1.8805F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(55, 103).mirror().addBox(0.1F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.3198F, 3.1052F, 0.0324F, -1.8382F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(55, 103).addBox(-0.1F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.3198F, 3.1052F, -0.0324F, 1.8382F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(103, 62).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5204F, -0.8527F, -5.2657F, -2.9695F, 0.3063F, 1.8805F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(41, 57).addBox(-0.8189F, -0.4319F, 0.0649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, 0.1342F, 1.8505F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(81, 93).addBox(0.0F, -0.9451F, 0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.7F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(20, 33).addBox(-0.5F, -0.9597F, -4.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(73, 60).addBox(-0.5F, 0.1F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8732F, -5.9268F, -0.5176F, -0.0059F, -0.0972F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-1.087F, 0.2454F, -0.2779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6915F, 7.0592F, -0.1677F, 0.8767F, -1.0994F, -0.3823F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-1.4836F, 0.2454F, 1.3951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6915F, 7.0592F, -0.1677F, 0.6054F, -0.9105F, -0.0631F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-2.7086F, -6.8595F, -0.7226F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.2398F, -1.2913F, -0.3861F, -0.3895F, -2.6847F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(82, 19).mirror().addBox(-2.7125F, -6.7042F, -0.7226F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.2398F, -1.2913F, -0.5381F, -0.0625F, -2.0377F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(39, 20).mirror().addBox(-5.0291F, -0.01F, -0.5729F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.2398F, -1.2913F, 0.0483F, 0.5085F, -0.2445F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(91, 84).mirror().addBox(-5.9554F, -3.0933F, -0.7226F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.2398F, -1.2913F, -0.3082F, 0.4525F, -0.992F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(82, 10).addBox(0.4956F, 0.2513F, 1.4055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6915F, 7.0592F, -0.1677F, 0.5849F, 0.6491F, 0.0486F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 79).addBox(0.096F, 0.2513F, -0.2648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6915F, 7.0592F, -0.1677F, 0.7298F, 0.8504F, 0.2597F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 0).addBox(-0.4915F, 0.1645F, -2.6024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6915F, 7.0592F, -0.1677F, 0.192F, -0.1309F, 0.0F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 38).addBox(-2.2915F, -6.8595F, -0.7226F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.2398F, -1.2913F, -0.3861F, 0.3895F, 2.6847F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(82, 19).addBox(-0.2876F, -6.7042F, -0.7226F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.2398F, -1.2913F, -0.5381F, 0.0625F, 2.0377F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(39, 20).addBox(-0.9709F, -0.01F, -0.5729F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.2398F, -1.2913F, 0.0483F, -0.5085F, 0.2445F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 84).addBox(3.9554F, -3.0933F, -0.7226F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 0.2398F, -1.2913F, -0.3082F, -0.4525F, 0.992F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(13, 18).addBox(0.0F, -1.2769F, -0.828F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, -0.3752F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4857F, -2.7264F, 0.1891F, 0.0331F, -0.1714F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(103, 74).addBox(0.0F, -1.3938F, 0.054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.2F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5F, -0.3F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(34, 12).mirror().addBox(-5.3743F, -0.0435F, -0.1609F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.4541F, -0.8649F, 0.1494F, 0.3118F, -0.2371F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 22).mirror().addBox(-6.2201F, -3.335F, -0.3207F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.4541F, -0.8649F, -0.0904F, 0.3665F, -0.9381F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(81, 70).mirror().addBox(-2.6052F, -7.0462F, -0.3207F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.4541F, -0.8649F, -0.3698F, 0.0751F, -2.0698F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(-2.4049F, -7.05F, -0.3207F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.4541F, -0.8649F, -0.3341F, -0.1779F, -2.7325F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(10, 49).mirror().addBox(-4.7296F, -0.4613F, -0.6989F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 1.3335F, -2.0958F, 0.3069F, 0.2467F, -0.1236F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-4.9529F, -2.6181F, -0.8339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 1.3335F, -2.0958F, 0.1546F, 0.3924F, -0.6146F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-0.8876F, -7.0037F, -0.8339F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 1.3335F, -2.0958F, -0.4068F, 0.1086F, -2.3259F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-4.651F, -5.3535F, -0.8339F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 1.3335F, -2.0958F, -0.1839F, 0.3801F, -1.4663F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7171F, 6.2804F, 0.4503F, -0.4082F, -0.103F, -2.8057F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(49, 36).mirror().addBox(-2.4049F, -7.0499F, -0.3207F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.2541F, 1.1351F, -0.2693F, -0.2522F, -2.7483F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-2.6052F, -7.0462F, -0.3207F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.2541F, 1.1351F, -0.3662F, -0.0224F, -2.0716F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(90, 69).mirror().addBox(-6.2201F, -3.335F, -0.3207F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.2541F, 1.1351F, -0.1818F, 0.3204F, -0.9708F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(20, 39).mirror().addBox(-5.3743F, -0.0435F, -0.1609F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3086F, 0.2541F, 1.1351F, 0.0488F, 0.3321F, -0.2708F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(10, 49).addBox(-0.2704F, -0.4613F, -0.6989F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 1.3335F, -2.0958F, 0.3069F, -0.2467F, 0.1236F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(101, 99).addBox(3.9529F, -2.6181F, -0.8339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 1.3335F, -2.0958F, 0.1546F, -0.3924F, 0.6146F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(83, 49).addBox(-1.1124F, -7.0037F, -0.8339F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 1.3335F, -2.0958F, -0.4068F, -0.1086F, 2.3259F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(80, 51).addBox(1.651F, -5.3535F, -0.8339F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 1.3335F, -2.0958F, -0.1839F, -0.3801F, 1.4663F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(59, 15).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7171F, 6.2804F, 0.4503F, -0.4082F, 0.103F, 2.8057F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, -0.0978F, -4.0739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(27, 51).addBox(0.0F, -1.5507F, -0.2782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(20, 39).addBox(-0.6257F, -0.0435F, -0.1609F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.2541F, 1.1351F, 0.0488F, -0.3321F, 0.2708F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(90, 69).addBox(4.2201F, -3.335F, -0.3207F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.2541F, 1.1351F, -0.1818F, -0.3204F, 0.9708F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(82, 8).addBox(-0.3947F, -7.0462F, -0.3207F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.2541F, 1.1351F, -0.3662F, 0.0224F, 2.0716F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(49, 36).addBox(-2.5951F, -7.0499F, -0.3207F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.2541F, 1.1351F, -0.2693F, 0.2522F, 2.7483F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 11).addBox(-2.5951F, -7.05F, -0.3207F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.4541F, -0.8649F, -0.3341F, 0.1779F, 2.7325F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(81, 70).addBox(-0.3947F, -7.0462F, -0.3207F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.4541F, -0.8649F, -0.3698F, -0.0751F, 2.0698F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(89, 22).addBox(4.2201F, -3.335F, -0.3207F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.4541F, -0.8649F, -0.0904F, -0.3665F, 0.9381F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(34, 12).addBox(-0.6257F, -0.0435F, -0.1609F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3086F, 0.4541F, -0.8649F, 0.1494F, -0.3118F, 0.2371F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(103, 66).addBox(0.0F, -1.4034F, -0.1405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, -0.1134F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6199F, -3.6946F, 0.4272F, 0.0181F, -0.0397F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(44, 47).addBox(-2.2F, -0.6943F, -0.6964F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 4.4424F, -3.5406F, -0.6283F, -0.0873F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(17, 14).addBox(-1.7F, -0.5745F, 1.2287F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 4.4424F, -3.5406F, -0.5411F, -0.0873F, 0.0F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(103, 70).addBox(0.0F, -2.0476F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(22, 72).addBox(0.0F, -2.0815F, 0.0453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(70, 27).mirror().addBox(-4.4541F, -3.423F, -0.9053F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8586F, 0.7135F, -1.8261F, -0.0921F, 0.0185F, -1.4555F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-0.7793F, -5.4829F, -0.9053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8586F, 0.7135F, -1.8261F, -0.0558F, -0.0756F, -2.587F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(23, 49).mirror().addBox(0.9418F, -4.7445F, -0.5703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8586F, 0.7135F, -1.8261F, -0.0048F, 0.0368F, 3.0132F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-3.4486F, -1.3922F, -0.9053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8586F, 0.7135F, -1.8261F, -0.0521F, 0.0781F, -0.6713F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(58, 44).mirror().addBox(-2.8297F, -0.0794F, -0.8221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8586F, 0.7135F, -1.8261F, -0.022F, 0.0636F, -0.1828F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-3.8762F, -0.276F, -0.4813F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5586F, 0.2135F, -0.4761F, -0.038F, 0.1494F, -0.1846F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 72).mirror().addBox(-4.2924F, -2.0561F, -0.5933F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5586F, 0.2135F, -0.4761F, -0.1069F, 0.1463F, -0.6774F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(84, 17).mirror().addBox(-1.5051F, -6.3947F, -0.5933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5586F, 0.2135F, -0.4761F, -0.1374F, -0.1182F, -2.3195F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-4.5813F, -4.4891F, -0.5933F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5586F, 0.2135F, -0.4761F, -0.1788F, 0.0284F, -1.4575F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-1.5651F, -6.1015F, -0.5933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5586F, 0.2135F, -0.4761F, -0.0445F, -0.1755F, -2.9346F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(74, 41).addBox(1.5813F, -4.4891F, -0.5933F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5586F, 0.2135F, -0.4761F, -0.1788F, -0.0284F, 1.4575F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(59, 13).addBox(-2.4349F, -6.1015F, -0.5933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5586F, 0.2135F, -0.4761F, -0.0445F, 0.1755F, 2.9346F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 17).addBox(-0.4949F, -6.3947F, -0.5933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5586F, 0.2135F, -0.4761F, -0.1374F, 0.1182F, 2.3195F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 72).addBox(3.2924F, -2.0561F, -0.5933F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5586F, 0.2135F, -0.4761F, -0.1069F, -0.1463F, 0.6774F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 61).addBox(-0.1238F, -0.276F, -0.4813F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5586F, 0.2135F, -0.4761F, -0.038F, -0.1494F, 0.1846F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(58, 44).addBox(-1.1703F, -0.0794F, -0.8221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8586F, 0.7135F, -1.8261F, -0.022F, -0.0636F, 0.1828F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(53, 65).addBox(2.4486F, -1.3922F, -0.9053F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8586F, 0.7135F, -1.8261F, -0.0521F, -0.0781F, 0.6713F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(23, 49).addBox(-2.9418F, -4.7445F, -0.5703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8586F, 0.7135F, -1.8261F, -0.0048F, -0.0368F, -3.0132F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(89, 4).addBox(-1.2207F, -5.4829F, -0.9053F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8586F, 0.7135F, -1.8261F, -0.0558F, 0.0756F, 2.587F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(70, 27).addBox(1.4541F, -3.423F, -0.9053F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8586F, 0.7135F, -1.8261F, -0.0921F, -0.0185F, 1.4555F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, -0.9889F, 1.9677F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.4254F, 3.4368F, -3.9385F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, -0.7F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.9687F, -3.526F, 3.4221F, 0.6727F, 0.287F, -0.8642F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 47).addBox(1.818F, -2.1319F, 1.7753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 0.7882F, -0.1615F, -1.213F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(76, 43).addBox(-0.2359F, -0.013F, 0.5372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 1.9555F, 0.287F, -0.8642F));

		PartDefinition cube_r221 = bone4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 5).addBox(-0.2359F, -2.2038F, 0.8918F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 1.0916F, 0.287F, -0.8642F));

		PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 18).addBox(-0.2328F, -2.1231F, 1.1492F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 0.6552F, 0.287F, -0.8642F));

		PartDefinition cube_r223 = bone4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 63).addBox(-0.2327F, 0.3262F, 4.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 1.3534F, 0.287F, -0.8642F));

		PartDefinition cube_r224 = bone4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(35, 46).addBox(-0.2327F, -0.3666F, 2.8607F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 1.5715F, 0.287F, -0.8642F));

		PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 71).addBox(-0.6576F, 2.0542F, 0.6449F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3655F, -1.6145F, -0.0005F, -0.5686F, 0.1326F, -0.2011F));

		PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(44, 73).addBox(0.3237F, -2.4994F, -0.8436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 0.6489F, 0.4823F, -0.5141F));

		PartDefinition cube_r227 = bone4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(31, 73).addBox(0.9946F, -2.1319F, 0.6673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.6871F, 0.7801F, 0.0994F, -0.9548F));

		PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(18, 51).addBox(-0.2359F, -0.8771F, 0.2345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.1871F, 1.2105F, 0.1391F, -0.8385F));

		PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(9, 51).addBox(-0.2359F, -0.6183F, 0.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.568F, -0.7331F, 0.1871F, 0.8091F, 0.1391F, -0.8385F));

		PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(72, 0).addBox(3.8303F, 2.5617F, 0.0471F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5897F, -0.9603F, 0.2069F, -0.6132F, 0.0482F, -0.5136F));

		PartDefinition cube_r231 = bone4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(88, 37).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1707F, 0.9419F, -0.2556F, -0.6629F, 0.3652F, -0.7516F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.4254F, 3.4368F, -3.9385F));

		PartDefinition cube_r232 = bone6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-0.5F, -0.7F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9687F, -3.526F, 3.4221F, 0.6727F, -0.287F, 0.8642F));

		PartDefinition cube_r233 = bone6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-2.818F, -2.1319F, 1.7753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 0.7882F, 0.1615F, 1.213F));

		PartDefinition cube_r234 = bone6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(76, 43).mirror().addBox(-0.7641F, -0.013F, 0.5372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 1.9555F, -0.287F, 0.8642F));

		PartDefinition cube_r235 = bone6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(45, 5).mirror().addBox(-0.7641F, -2.2038F, 0.8918F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 1.0916F, -0.287F, 0.8642F));

		PartDefinition cube_r236 = bone6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.7672F, -2.1231F, 1.1492F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 0.6552F, -0.287F, 0.8642F));

		PartDefinition cube_r237 = bone6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.7673F, 0.3262F, 4.0753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 1.3534F, -0.287F, 0.8642F));

		PartDefinition cube_r238 = bone6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(35, 46).mirror().addBox(-0.7673F, -0.3666F, 2.8607F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 1.5715F, -0.287F, 0.8642F));

		PartDefinition cube_r239 = bone6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-2.3424F, 2.0542F, 0.6449F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3655F, -1.6145F, -0.0005F, -0.5686F, -0.1326F, 0.2011F));

		PartDefinition cube_r240 = bone6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-1.3237F, -2.4994F, -0.8436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 0.6489F, -0.4823F, 0.5141F));

		PartDefinition cube_r241 = bone6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(31, 73).mirror().addBox(-1.9946F, -2.1319F, 0.6673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.6871F, 0.7801F, -0.0994F, 0.9548F));

		PartDefinition cube_r242 = bone6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(18, 51).mirror().addBox(-0.7641F, -0.8771F, 0.2345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.1871F, 1.2105F, -0.1391F, 0.8385F));

		PartDefinition cube_r243 = bone6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-0.7641F, -0.6183F, 0.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.568F, -0.7331F, 0.1871F, 0.8091F, -0.1391F, 0.8385F));

		PartDefinition cube_r244 = bone6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-6.8303F, 2.5617F, 0.0471F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5897F, -0.9603F, 0.2069F, -0.6132F, -0.0482F, 0.5136F));

		PartDefinition cube_r245 = bone6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 37).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1707F, 0.9419F, -0.2556F, -0.6629F, -0.3652F, 0.7516F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7889F, 2.1196F, -3.4533F, 1.5366F, 0.4822F, -0.0104F));

		PartDefinition cube_r246 = leftarm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(87, 57).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.96F, 10.6135F, 6.2257F, -2.4038F, 0.6565F, 0.3F));

		PartDefinition cube_r247 = leftarm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(98, 78).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 91).addBox(-0.5F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1472F, 11.2107F, 5.082F, -1.313F, 0.6565F, 0.3F));

		PartDefinition cube_r248 = leftarm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(89, 87).addBox(-0.5F, -1.325F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1472F, 11.2107F, 5.082F, -0.2222F, 0.6565F, 0.3F));

		PartDefinition cube_r249 = leftarm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(92, 56).addBox(-0.5F, -1.2235F, -0.8902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2634F, 9.4815F, 4.928F, 0.476F, 0.6565F, 0.3F));

		PartDefinition cube_r250 = leftarm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(56, 88).addBox(-0.5F, -1.9589F, -0.2909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1023F, 0.7981F, 0.2353F, 0.981F, 0.4313F, 0.2229F));

		PartDefinition cube_r251 = leftarm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(10, 28).addBox(-0.5F, -2.0528F, -0.2427F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1023F, 0.7981F, 0.2353F, 0.5011F, 0.4313F, 0.2229F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2966F, 12.8226F, 6.1559F, -0.5908F, -0.7092F, 0.3967F));

		PartDefinition cube_r252 = leftarm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(54, 13).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3882F, 4.8043F, -0.9993F, 0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r253 = leftarm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 20).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3882F, 4.8043F, -0.9993F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r254 = leftarm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.4402F, 4.7349F, -0.5099F, -0.0347F, -0.0068F, -0.0519F));

		PartDefinition cube_r255 = leftarm2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(12, 83).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.4074F, -0.0784F, -0.0068F, -0.0519F));

		PartDefinition cube_r256 = leftarm2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(46, 85).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.4074F, -0.1307F, -0.0068F, -0.0519F));

		PartDefinition cube_r257 = leftarm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(20, 28).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3882F, 4.8043F, -0.9993F, -0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2284F, 13.7797F, -1.4263F, -0.1529F, -1.2569F, 0.0228F));

		PartDefinition cube_r258 = leftArm3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(64, 46).addBox(-0.7408F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3381F, 0.0886F, -0.2467F));

		PartDefinition cube_r259 = leftArm3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(69, 29).addBox(-1.6708F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3478F, 0.0298F, -0.082F));

		PartDefinition cube_r260 = leftArm3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(89, 10).addBox(0.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r261 = leftArm3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(74, 68).addBox(-0.4986F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thumb = leftArm3.addOrReplaceChild("thumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, 0.1133F, 0.3107F, 0.9484F, -0.6333F, -0.2064F));

		PartDefinition cube_r262 = thumb.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(69, 88).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition thumb2 = thumb.addOrReplaceChild("thumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.075F, 1.7008F, -0.5174F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition cube_r263 = thumb2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(79, 99).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6F, 1.2F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8309F, 4.2838F, 0.3601F, 0.7004F, 0.0263F, -0.1009F));

		PartDefinition cube_r264 = leftArm4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(62, 29).addBox(-1.309F, -2.6047F, -0.6643F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.934F, 2.5658F, 0.6616F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r265 = leftArm4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(20, 61).addBox(0.0366F, -1.0099F, -0.6933F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.9577F, 0.6906F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7889F, 2.1196F, -3.4533F, 0.8149F, -0.5778F, 0.0897F));

		PartDefinition cube_r266 = rightarm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(74, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.96F, 10.6135F, 6.2257F, -2.4038F, -0.6565F, -0.3F));

		PartDefinition cube_r267 = rightarm.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(91, 98).addBox(-0.5F, -0.825F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 18).addBox(-0.5F, -1.625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1472F, 11.2107F, 5.082F, -1.313F, -0.6565F, -0.3F));

		PartDefinition cube_r268 = rightarm.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(91, 14).addBox(-0.5F, -1.325F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1472F, 11.2107F, 5.082F, -0.2222F, -0.6565F, -0.3F));

		PartDefinition cube_r269 = rightarm.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 92).addBox(-0.5F, -1.2235F, -0.8902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2634F, 9.4815F, 4.928F, 0.476F, -0.6565F, -0.3F));

		PartDefinition cube_r270 = rightarm.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(88, 65).addBox(-0.5F, -1.9589F, -0.2909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1023F, 0.7981F, 0.2353F, 0.981F, -0.4313F, -0.2229F));

		PartDefinition cube_r271 = rightarm.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 28).addBox(-0.5F, -2.0528F, -0.2427F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1023F, 0.7981F, 0.2353F, 0.5011F, -0.4313F, -0.2229F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2966F, 12.8226F, 6.1559F, -0.4412F, 0.6761F, -0.3633F));

		PartDefinition cube_r272 = rightarm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(27, 55).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3882F, 4.8043F, -0.9993F, 0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r273 = rightarm2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(39, 70).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3882F, 4.8043F, -0.9993F, -0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r274 = rightarm2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(44, 36).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.4402F, 4.7349F, -0.5099F, -0.0347F, 0.0068F, 0.0519F));

		PartDefinition cube_r275 = rightarm2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 84).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.4074F, -0.0784F, 0.0068F, 0.0519F));

		PartDefinition cube_r276 = rightarm2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(51, 85).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.4074F, -0.1307F, 0.0068F, 0.0519F));

		PartDefinition cube_r277 = rightarm2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(74, 82).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3882F, 4.8043F, -0.9993F, -0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2284F, 13.7797F, -1.4263F, -0.1529F, 1.2569F, -0.0228F));

		PartDefinition cube_r278 = rightArm3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(32, 68).addBox(-1.2592F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3381F, -0.0886F, 0.2467F));

		PartDefinition cube_r279 = rightArm3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(69, 55).addBox(-0.3292F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3478F, -0.0298F, 0.082F));

		PartDefinition cube_r280 = rightArm3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(61, 89).addBox(-1.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r281 = rightArm3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(72, 74).addBox(-1.5014F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thumb3 = rightArm3.addOrReplaceChild("thumb3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1142F, 0.1133F, 0.3107F, 0.9484F, 0.6333F, 0.2064F));

		PartDefinition cube_r282 = thumb3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(89, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition thumb4 = thumb3.addOrReplaceChild("thumb4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.075F, 1.7008F, -0.5174F, 0.047F, -0.0736F, 1.0018F));

		PartDefinition cube_r283 = thumb4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(99, 93).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, 1.2F, 0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8526F, 4.5049F, 0.3351F, 1.0059F, -0.0263F, 0.1009F));

		PartDefinition cube_r284 = rightArm4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(32, 62).addBox(-0.691F, -2.6047F, -0.6643F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.934F, 2.3658F, 0.7616F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r285 = rightArm4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(59, 61).addBox(-2.0366F, -1.0099F, -0.6933F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.7577F, 0.7906F, 0.0F, 0.0F, -0.0436F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2593F, -3.5968F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(58, 103).addBox(0.0F, -2.0003F, -0.0139F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.814F, -0.6842F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r287 = neck3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(95, 38).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5795F, -1.9173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6129F, -0.838F, 0.143F, -0.4109F, -0.1743F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(45, 103).addBox(0.0F, -1.4854F, -0.0704F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.7F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(82, 4).addBox(-0.5F, -0.1681F, 1.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1225F, -1.4348F, -0.1454F, -0.2514F, -0.1787F));

		PartDefinition cube_r290 = neck.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(75, 24).addBox(0.0F, -1.0684F, -0.1304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.4F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r291 = neck.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(44, 51).addBox(-0.5F, -0.1681F, -3.0721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7858F, -1.2037F, 0.2959F, -0.1627F, -0.197F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(19, 44).addBox(-1.0F, -0.975F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.35F, -4.3258F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(61, 25).addBox(-1.0F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3173F, -3.671F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(15, 103).addBox(-0.5F, -0.65F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.9249F, -5.4251F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(93, 78).addBox(-0.5F, -0.1463F, -0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0F, 0.8519F, -6.5175F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(84, 101).addBox(-0.5F, -0.802F, -0.5327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 1.0231F, -6.1802F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -0.9F, -2.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.3963F, -4.1463F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(95, 47).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(65, 78).addBox(-0.5F, -0.5F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.4202F, -5.6348F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(96, 3).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.1673F, -5.1631F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(95, 44).addBox(-0.5F, -0.475F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4503F, -4.7808F, 2.1555F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 53).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.4584F, -5.3966F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(95, 41).addBox(-0.5F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.3654F, -4.8698F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(100, 48).addBox(-0.5F, -0.225F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.252F, -5.2695F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(100, 45).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9109F, -5.6352F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(45, 100).addBox(-1.0F, -0.275F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.334F, -5.1898F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5F, -0.35F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(0, 101).addBox(-0.5F, -0.35F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.3871F, -6.2135F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(62, 82).addBox(-0.5F, -0.2F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.408F, -6.2271F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(57, 100).addBox(-1.0F, -0.75F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5F, -0.2906F, -5.1898F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(100, 42).addBox(-1.0F, -0.525F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.334F, -5.1898F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(30, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6566F, -6.3492F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(66, 66).addBox(-1.5F, -3.0F, 1.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.505F, 0.6271F, 0.3297F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.005F, 0.333F, -0.5573F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(58, 78).addBox(-2.5F, -1.6268F, -2.1379F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.505F, -1.0299F, 1.1316F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 75).addBox(-3.0F, -0.1808F, -1.5736F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.005F, -1.0299F, 1.1316F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(10, 88).addBox(-3.0F, 0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 62).addBox(-3.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.005F, -1.4049F, 1.5066F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(62, 55).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -2.4018F, 1.5851F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(66, 61).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.497F, -3.3004F, 1.1281F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(46, 65).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.505F, -4.0883F, 0.5022F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(39, 65).addBox(-1.5F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.505F, -4.2505F, -3.3827F, -2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(43, 14).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.513F, -4.6837F, -1.4282F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(12, 65).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.505F, -4.5094F, -0.4353F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(61, 21).addBox(-1.5F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -4.4582F, -0.3301F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(49, 40).addBox(-1.5F, -1.675F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -2.0046F, -3.378F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(65, 0).addBox(-2.0F, -0.0259F, -1.0147F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(1.0032F, -4.2329F, -3.3649F, 0.7941F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 2.3818F, -9.1283F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(15, 94).addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1614F, -1.0403F, 2.9888F, -0.7298F, -0.6292F, 0.1949F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 60).addBox(-0.475F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.062F, -0.9874F, 3.6813F, -0.2301F, 0.2491F, -0.3572F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(75, 3).addBox(-0.4116F, -0.1739F, -1.0506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1701F, -1.4679F, 4.6638F, 0.1941F, 0.2058F, -0.1434F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 15).addBox(0.2893F, -0.8948F, -0.3941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, -0.1403F, -1.2471F, 0.1902F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(79, 80).addBox(-0.2F, -1.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.6166F, -3.2823F, 10.8903F, 1.5844F, 1.3045F, 1.5746F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 62).addBox(-1.8F, -1.8F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.1498F, -3.3601F, 10.2661F, 0.2296F, 0.3939F, -0.0593F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(50, 26).addBox(-1.4F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.1203F, -3.4729F, 9.549F, 0.0952F, -0.2926F, -0.1248F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(55, 46).addBox(0.2404F, -0.8948F, 0.1766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, -0.0595F, -0.7256F, 0.0966F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(99, 87).addBox(0.1494F, -0.8718F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, -0.1103F, -0.4533F, -0.0769F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(94, 89).addBox(0.4144F, 0.5066F, -0.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, -1.312F, 0.4068F, 0.0123F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(99, 90).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.0925F, -2.4428F, 4.8807F, 0.2019F, -0.9949F, -0.205F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(99, 84).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.042F, -2.5142F, 5.5458F, 0.1183F, 0.3895F, 0.0101F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(94, 92).addBox(0.4144F, 0.0369F, -1.7339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, -0.2386F, 0.4068F, 0.0123F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(94, 86).addBox(0.4144F, -0.3305F, -1.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, 0.1104F, 0.4068F, 0.0123F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(15, 100).addBox(0.0113F, -0.6566F, -0.1137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(81, 37).addBox(0.0113F, -0.6566F, -1.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.671F, -3.2342F, 6.975F, 0.4099F, -0.0867F, -0.0256F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(62, 102).addBox(-0.575F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(102, 54).addBox(-0.575F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.1983F, -1.7059F, 3.378F, 0.9178F, -0.3016F, 0.0854F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(67, 102).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.296F, -1.5394F, 2.8432F, 0.9517F, -0.0198F, -0.124F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(100, 51).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3361F, -2.2258F, 3.6548F, 1.7883F, 0.256F, 0.7859F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(40, 100).addBox(-0.3999F, -1.4157F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1701F, -1.4679F, 4.6638F, 1.4928F, 0.3255F, -0.1713F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.6827F, -2.8956F, 4.6884F, -0.9991F, -0.2542F, 3.1003F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 95).addBox(-0.2F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.9975F, -3.1227F, 4.6856F, -1.4806F, -0.4512F, 3.1162F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(59, 97).addBox(-0.275F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.6044F, -3.4422F, 4.246F, -1.478F, -0.6197F, 3.0576F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(79, 76).addBox(-0.675F, -0.2F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.51F, -4.1071F, 4.9638F, -1.4377F, -0.1523F, -3.1321F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(41, 61).addBox(-0.325F, -0.275F, -1.775F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.435F, -4.8537F, 4.6914F, -1.9277F, -0.4646F, -3.1334F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(79, 72).addBox(-0.5969F, -0.7263F, -2.6771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4386F, -5.387F, 4.0749F, -1.8657F, -0.0645F, 3.1061F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(68, 5).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0566F, -5.1048F, 5.0783F, -2.0614F, -1.1158F, -2.2962F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(80, 58).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2473F, -4.9799F, 4.8833F, -1.8468F, -0.708F, -2.5614F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(98, 22).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8937F, -5.5055F, 4.6625F, -1.5151F, -0.8037F, -2.0344F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(69, 99).addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2749F, -5.2557F, 4.2724F, -1.1487F, -0.708F, -2.5614F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(99, 59).addBox(-0.4937F, -1.2752F, -0.7443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4286F, -5.3778F, 4.0783F, -0.7674F, -0.1457F, 3.0453F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(20, 98).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8443F, -5.5212F, 3.9498F, -1.4901F, 0.5676F, -2.5891F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(20, 95).addBox(-0.7609F, -0.7852F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.431F, -5.3743F, 4.0817F, -0.6621F, 0.6058F, -2.4664F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(80, 33).addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1591F, -5.6604F, 4.4306F, 2.8282F, 0.9416F, 1.482F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(10, 98).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2625F, -5.6196F, 3.8409F, 1.7757F, 1.3844F, 0.3759F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(98, 81).addBox(-0.8F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2479F, -5.6215F, 3.8325F, 0.2834F, 0.8648F, -1.1852F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(47, 97).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.258F, -5.6195F, 3.8316F, 0.2834F, 0.8648F, -1.1852F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(91, 6).addBox(-0.225F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3374F, -5.6212F, 3.854F, 1.614F, -0.1091F, -0.0029F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 91).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3374F, -5.6212F, 3.854F, 1.6137F, 0.0217F, 0.0028F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(86, 98).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.036F, -5.1365F, 3.9734F, 0.8922F, 0.1239F, -0.0793F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(42, 97).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3374F, -5.6212F, 3.854F, 0.8982F, 0.0217F, 0.0028F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(64, 99).addBox(-0.2F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.9298F, -5.5414F, 3.8019F, 1.3577F, -0.021F, 1.4356F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(5, 92).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9298F, -5.5414F, 3.8019F, 1.4886F, -0.021F, 1.4356F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(92, 31).addBox(-0.45F, -0.5F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.6883F, -5.0835F, 3.8169F, 2.1464F, 0.3704F, 2.6082F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(89, 91).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3374F, -5.6212F, 3.854F, 1.3609F, 0.6443F, 1.2054F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(90, 27).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2263F, -2.9833F, 4.31F, 0.6669F, 1.3665F, -0.7038F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 52).addBox(-0.5F, -1.4F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7271F, -3.4882F, 4.3149F, -3.0357F, 1.3024F, -0.9533F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(87, 32).addBox(-0.575F, -0.525F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7126F, -3.5987F, 4.4583F, -2.1194F, 1.3024F, -0.9533F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(5, 87).addBox(-0.575F, -0.925F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7126F, -3.5987F, 4.4583F, -2.2939F, 1.3024F, -0.9533F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(52, 99).addBox(-0.4948F, -0.6621F, -0.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3331F, -2.4439F, 3.668F, 0.5528F, 0.1929F, -0.4881F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(99, 9).addBox(-0.4948F, -0.5707F, -0.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3331F, -2.4439F, 3.668F, 0.9018F, 0.1929F, -0.4881F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(74, 99).addBox(-0.8F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 99).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1523F, -2.5528F, 3.1546F, 1.0378F, 0.5311F, 0.0029F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(17, 90).addBox(-0.4598F, -1.6414F, 0.3827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1701F, -1.4679F, 4.6638F, 0.1949F, 0.2117F, -0.1735F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(97, 56).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5513F, -2.252F, 4.4698F, 0.1991F, 0.0885F, 0.7463F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(95, 53).addBox(-0.4598F, -0.7098F, -0.5462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1701F, -1.4679F, 4.6638F, 0.0509F, 0.2117F, -0.1735F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(22, 88).addBox(-0.5504F, -0.022F, -0.4996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0356F, -4.398F, 4.668F, 0.1356F, -0.1957F, 0.1167F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(86, 78).addBox(-0.625F, -0.5F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0064F, -4.8644F, 4.5454F, 0.266F, -0.1961F, 0.119F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(77, 102).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0351F, -3.8259F, 10.1364F, 1.9196F, -1.3391F, 2.8014F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(72, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1691F, -4.7836F, 10.7133F, -1.7269F, -1.0419F, 0.1351F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(25, 97).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0271F, -5.459F, 9.8089F, 0.4788F, -1.044F, -2.1116F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(54, 96).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1611F, -5.6821F, 10.2564F, -0.7868F, -0.8868F, -0.658F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(15, 97).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0351F, -6.1554F, 9.2419F, 0.3094F, -0.8491F, -1.9733F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(96, 19).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1691F, -6.4701F, 9.6305F, -0.5532F, -0.7383F, -0.8284F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(76, 54).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3132F, -5.2027F, 6.1691F, 2.573F, 0.8597F, 2.6373F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(41, 90).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.3132F, -5.2027F, 6.1691F, 2.8536F, 0.0F, -3.1416F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(51, 90).addBox(-0.8F, 0.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0125F, -6.1171F, 5.8982F, -1.7504F, 0.725F, -0.8962F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 48).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0125F, -6.1171F, 5.8982F, -2.2705F, 0.2743F, -1.8885F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(66, 96).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0125F, -6.1171F, 5.8982F, 3.0528F, 0.2743F, -1.8885F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(37, 97).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1691F, -6.6323F, 5.7456F, -2.9531F, -0.6194F, -1.1328F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(96, 13).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1691F, -6.6323F, 5.7456F, -2.9838F, 0.2419F, -0.9843F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(79, 24).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3212F, -5.5889F, 7.9076F, -1.7104F, 0.0F, 3.1416F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(71, 96).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0205F, -6.5334F, 7.7749F, -1.613F, 0.1331F, -1.879F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(96, 6).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1771F, -7.0654F, 7.7001F, -1.4954F, 0.1176F, -0.9991F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(34, 91).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2542F, -4.8924F, 9.2939F, 1.3444F, 0.0415F, -3.0966F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(46, 90).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.3132F, -5.4206F, 8.4469F, 0.559F, 0.0415F, -3.0966F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(90, 44).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3132F, -5.4206F, 8.4469F, 0.1658F, -0.0029F, -3.1244F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(76, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0125F, -6.3612F, 8.6043F, 0.0503F, -0.1581F, -1.8802F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(5, 96).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1691F, -6.8912F, 8.6929F, -0.0897F, -0.1397F, -0.9973F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(81, 96).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0075F, -6.1846F, 8.9365F, 1.7085F, -0.4107F, -1.905F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(96, 16).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1641F, -6.6725F, 9.1614F, 1.328F, -0.3609F, -0.9591F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(101, 12).addBox(-1.3774F, -0.2F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.5359F, -1.9737F, 2.9012F, 1.5425F, 0.5753F, 1.4664F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(10, 101).addBox(-0.8F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5359F, -1.9737F, 2.9012F, 1.0229F, 0.1874F, 0.2439F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(101, 18).addBox(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6359F, -2.7305F, 3.6903F, 1.2038F, 0.2247F, 0.5254F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(101, 15).addBox(-0.525F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6359F, -2.7305F, 3.6903F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(101, 6).addBox(-0.625F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.7069F, -1.7911F, 2.7794F, 0.9508F, 0.3237F, 0.4191F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(97, 30).addBox(-1.0F, -0.0259F, -1.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.194F, -6.6166F, 5.7614F, 0.6437F, 0.5028F, -0.5709F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(95, 50).addBox(-0.2398F, -0.2687F, -0.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5962F, -3.6774F, 9.0402F, 1.14F, -0.2747F, -0.3001F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(72, 78).addBox(-1.2398F, -0.946F, -0.1221F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5962F, -3.6774F, 9.0402F, 0.2673F, -0.2747F, -0.3001F));

		PartDefinition bone5 = leftFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.6032F, -3.3121F, 4.3416F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 2.3818F, -9.1283F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1614F, -1.0403F, 2.9888F, -0.7298F, 0.6292F, -0.1949F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.525F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.062F, -0.9874F, 3.6813F, -0.2301F, -0.2491F, 0.3572F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(75, 3).mirror().addBox(-0.5883F, -0.1739F, -1.0506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -1.4679F, 4.6638F, 0.1941F, -0.2058F, 0.1434F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-1.2893F, -0.8948F, -0.3941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, -0.1403F, 1.2471F, -0.1902F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(79, 80).mirror().addBox(-1.8F, -1.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -3.2823F, 10.8903F, 1.5844F, -1.3045F, -1.5746F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-0.2F, -1.8F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.1498F, -3.3601F, 10.2661F, 0.2296F, -0.3939F, 0.0593F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(50, 26).mirror().addBox(-1.6F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.1203F, -3.4729F, 9.549F, 0.0952F, 0.2926F, 0.1248F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(55, 46).mirror().addBox(-1.2404F, -0.8948F, 0.1766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, -0.0595F, 0.7256F, -0.0966F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-1.1494F, -0.8718F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, -0.1103F, 0.4533F, 0.0769F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-1.4144F, 0.5066F, -0.4058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, -1.312F, -0.4068F, -0.0123F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.0925F, -2.4428F, 4.8807F, 0.2019F, 0.9949F, 0.205F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(99, 84).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.042F, -2.5142F, 5.5458F, 0.1183F, -0.3895F, -0.0101F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-1.4144F, 0.0369F, -1.7339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, -0.2386F, -0.4068F, -0.0123F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(-1.4144F, -0.3305F, -1.3594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, 0.1104F, -0.4068F, -0.0123F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-1.0113F, -0.6566F, -0.1137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(81, 37).mirror().addBox(-1.0113F, -0.6566F, -1.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.671F, -3.2342F, 6.975F, 0.4099F, 0.0867F, 0.0256F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(62, 102).mirror().addBox(-0.425F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(102, 54).mirror().addBox(-0.425F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.1983F, -1.7059F, 3.378F, 0.9178F, 0.3016F, -0.0854F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(67, 102).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.296F, -1.5394F, 2.8432F, 0.9517F, 0.0198F, 0.124F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(100, 51).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3361F, -2.2258F, 3.6548F, 1.7883F, -0.256F, -0.7859F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(-0.6001F, -1.4157F, -0.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -1.4679F, 4.6638F, 1.4928F, -0.3255F, 0.1713F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.6827F, -2.8956F, 4.6884F, -0.9991F, 0.2542F, -3.1003F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.8F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.9975F, -3.1227F, 4.6856F, -1.4806F, 0.4512F, -3.1162F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(59, 97).mirror().addBox(-0.725F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.6044F, -3.4422F, 4.246F, -1.478F, 0.6197F, -3.0576F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.325F, -0.2F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -4.1071F, 4.9638F, -1.4377F, 0.1523F, 3.1321F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-1.675F, -0.275F, -1.775F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.435F, -4.8537F, 4.6914F, -1.9277F, 0.4646F, 3.1334F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-0.4031F, -0.7263F, -2.6771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4386F, -5.387F, 4.0749F, -1.8657F, 0.0645F, -3.1061F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0566F, -5.1048F, 5.0783F, -2.0614F, 1.1158F, 2.2962F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.2473F, -4.9799F, 4.8833F, -1.8468F, 0.708F, 2.5614F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8937F, -5.5055F, 4.6625F, -1.5151F, 0.8037F, 2.0344F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(69, 99).mirror().addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.2749F, -5.2557F, 4.2724F, -1.1487F, 0.708F, 2.5614F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.5063F, -1.2752F, -0.7443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4286F, -5.3778F, 4.0783F, -0.7674F, 0.1457F, -3.0453F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8443F, -5.5212F, 3.9498F, -1.4901F, -0.5676F, 2.5891F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(-0.2391F, -0.7852F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.431F, -5.3743F, 4.0817F, -0.6621F, -0.6058F, 2.4664F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1591F, -5.6604F, 4.4306F, 2.8282F, -0.9416F, -1.482F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2625F, -5.6196F, 3.8409F, 1.7757F, -1.3844F, -0.3759F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(98, 81).mirror().addBox(-0.2F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2479F, -5.6215F, 3.8325F, 0.2834F, -0.8648F, 1.1852F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(47, 97).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.258F, -5.6195F, 3.8316F, 0.2834F, -0.8648F, 1.1852F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-0.775F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.3374F, -5.6212F, 3.854F, 1.614F, 0.1091F, 0.0029F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3374F, -5.6212F, 3.854F, 1.6137F, -0.0217F, -0.0028F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(86, 98).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.036F, -5.1365F, 3.9734F, 0.8922F, -0.1239F, 0.0793F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(42, 97).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3374F, -5.6212F, 3.854F, 0.8982F, -0.0217F, -0.0028F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(64, 99).mirror().addBox(-0.8F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.9298F, -5.5414F, 3.8019F, 1.3577F, 0.021F, -1.4356F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9298F, -5.5414F, 3.8019F, 1.4886F, 0.021F, -1.4356F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-0.55F, -0.5F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.6883F, -5.0835F, 3.8169F, 2.1464F, -0.3704F, -2.6082F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.3374F, -5.6212F, 3.854F, 1.3609F, -0.6443F, -1.2054F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2263F, -2.9833F, 4.31F, 0.6669F, -1.3665F, 0.7038F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-0.5F, -1.4F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7271F, -3.4882F, 4.3149F, -3.0357F, -1.3024F, 0.9533F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-0.425F, -0.525F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7126F, -3.5987F, 4.4583F, -2.1194F, -1.3024F, 0.9533F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.425F, -0.925F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.7126F, -3.5987F, 4.4583F, -2.2939F, -1.3024F, 0.9533F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(52, 99).mirror().addBox(-0.5052F, -0.6621F, -0.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3331F, -2.4439F, 3.668F, 0.5528F, -0.1929F, 0.4881F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-0.5052F, -0.5707F, -0.4785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3331F, -2.4439F, 3.668F, 0.9018F, -0.1929F, 0.4881F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-0.2F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 99).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1523F, -2.5528F, 3.1546F, 1.0378F, -0.5311F, -0.0029F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(17, 90).mirror().addBox(-0.5402F, -1.6414F, 0.3827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -1.4679F, 4.6638F, 0.1949F, -0.2117F, 0.1735F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5513F, -2.252F, 4.4698F, 0.1991F, -0.0885F, -0.7463F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(95, 53).mirror().addBox(-0.5402F, -0.7098F, -0.5462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -1.4679F, 4.6638F, 0.0509F, -0.2117F, 0.1735F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(22, 88).mirror().addBox(-1.4496F, -0.022F, -0.4996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0356F, -4.398F, 4.668F, 0.1356F, 0.1957F, -0.1167F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(86, 78).mirror().addBox(-1.375F, -0.5F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0064F, -4.8644F, 4.5454F, 0.266F, 0.1961F, -0.119F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(77, 102).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0351F, -3.8259F, 10.1364F, 1.9196F, 1.3391F, -2.8014F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -4.7836F, 10.7133F, -1.7269F, 1.0419F, -0.1351F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0271F, -5.459F, 9.8089F, 0.4788F, 1.044F, 2.1116F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(54, 96).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1611F, -5.6821F, 10.2564F, -0.7868F, 0.8868F, 0.658F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(15, 97).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0351F, -6.1554F, 9.2419F, 0.3094F, 0.8491F, 1.9733F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -6.4701F, 9.6305F, -0.5532F, 0.7383F, 0.8284F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, -5.2027F, 6.1691F, 2.573F, -0.8597F, -2.6373F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(41, 90).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, -5.2027F, 6.1691F, 2.8536F, 0.0F, 3.1416F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(51, 90).mirror().addBox(-0.2F, 0.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0125F, -6.1171F, 5.8982F, -1.7504F, -0.725F, 0.8962F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0125F, -6.1171F, 5.8982F, -2.2705F, -0.2743F, 1.8885F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(66, 96).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0125F, -6.1171F, 5.8982F, 3.0528F, -0.2743F, 1.8885F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(37, 97).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -6.6323F, 5.7456F, -2.9531F, 0.6194F, 1.1328F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(96, 13).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -6.6323F, 5.7456F, -2.9838F, -0.2419F, 0.9843F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3212F, -5.5889F, 7.9076F, -1.7104F, 0.0F, -3.1416F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(71, 96).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0205F, -6.5334F, 7.7749F, -1.613F, -0.1331F, 1.879F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1771F, -7.0654F, 7.7001F, -1.4954F, -0.1176F, 0.9991F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(34, 91).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2542F, -4.8924F, 9.2939F, 1.3444F, -0.0415F, 3.0966F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(46, 90).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, -5.4206F, 8.4469F, 0.559F, -0.0415F, 3.0966F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(90, 44).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, -5.4206F, 8.4469F, 0.1658F, 0.0029F, 3.1244F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(76, 96).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0125F, -6.3612F, 8.6043F, 0.0503F, 0.1581F, 1.8802F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -6.8912F, 8.6929F, -0.0897F, 0.1397F, 0.9973F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0075F, -6.1846F, 8.9365F, 1.7085F, 0.4107F, 1.905F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.6725F, 9.1614F, 1.328F, 0.3609F, 0.9591F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(0.3774F, -0.2F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -1.9737F, 2.9012F, 1.5425F, -0.5753F, -1.4664F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(-0.2F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -1.9737F, 2.9012F, 1.0229F, -0.1874F, -0.2439F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -2.7305F, 3.6903F, 1.2038F, -0.2247F, -0.5254F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(101, 15).mirror().addBox(-0.475F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6359F, -2.7305F, 3.6903F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(-0.375F, -0.375F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.7069F, -1.7911F, 2.7794F, 0.9508F, -0.3237F, -0.4191F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(0.0F, -0.0259F, -1.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.194F, -6.6166F, 5.7614F, 0.6437F, -0.5028F, 0.5709F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(-0.7602F, -0.2687F, -0.7686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5962F, -3.6774F, 9.0402F, 1.14F, 0.2747F, 0.3001F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.7602F, -0.946F, -0.1221F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5962F, -3.6774F, 9.0402F, 0.2673F, 0.2747F, 0.3001F));

		PartDefinition bone7 = rightFace.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-1.6032F, -3.3121F, 4.3416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6151F, -1.0267F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.9F, -3.6587F, 0.7331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1295F, 1.3584F, -3.2435F, -0.8335F, -0.0972F, -0.0181F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.5065F, -1.1783F, -0.8188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4992F, 1.385F, -1.6621F, -0.3426F, -0.1743F, -0.0532F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(-0.4994F, -0.1967F, -0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2917F, 2.5021F, -2.2595F, 1.9235F, -0.122F, 0.0171F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-0.125F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(38, 77).mirror().addBox(-0.125F, -0.825F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1221F, 1.5996F, -3.7691F, 2.7369F, -0.1849F, 0.0871F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-0.5065F, -1.6413F, -0.8861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4992F, 1.385F, -1.6621F, -0.4735F, -0.1743F, -0.0532F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(53, 67).mirror().addBox(-0.5065F, -0.5849F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.4992F, 1.385F, -1.6621F, -0.8313F, -0.1743F, -0.0532F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5065F, -1.7783F, -1.3436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4992F, 1.385F, -1.6621F, -0.3513F, -0.1743F, -0.0532F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(94, 95).mirror().addBox(-0.6321F, -2.745F, -0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.1795F, 1.3584F, -3.2435F, -0.9039F, -0.122F, -0.0353F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.5053F, 0.3269F, -1.0882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4992F, 1.385F, -1.6621F, 0.9315F, -0.1743F, -0.0532F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(30, 98).mirror().addBox(-0.6321F, -2.9218F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.1795F, 1.3584F, -3.2435F, -0.3541F, -0.122F, -0.0353F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.8662F, -0.2631F, -0.1096F, -1.5752F, -0.0972F, -0.0181F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(98, 66).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.808F, -0.2668F, -0.7067F, -2.4479F, -0.0972F, -0.0181F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(76, 93).mirror().addBox(-0.4994F, -0.5551F, -0.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2917F, 2.5021F, -2.2595F, 2.4908F, -0.122F, 0.0171F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(-0.4994F, -0.4766F, -0.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2917F, 2.5021F, -2.2595F, 2.8835F, -0.122F, 0.0171F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(94, 101).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.9129F, -0.135F, -6.1847F, -1.7264F, -1.0908F, -0.0168F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.6117F, 0.0008F, -5.8197F, 1.9371F, -1.0123F, 2.7037F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-0.95F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.9956F, 0.1806F, -5.1412F, 1.95F, 0.1503F, 3.1184F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(99, 101).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.7896F, 0.6534F, -6.2419F, -2.6053F, -0.4669F, 1.1176F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 28).mirror().addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.515F, 0.7803F, -5.9715F, 2.6963F, -1.0123F, 2.7037F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-0.9F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.9499F, 1.108F, -4.9673F, 1.877F, -0.2718F, -2.1014F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(50, 102).mirror().addBox(-0.3F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.5921F, 1.4198F, -5.5876F, 1.2225F, -0.2718F, -2.1014F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(-0.525F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.0129F, 1.2756F, -5.2115F, 1.991F, -0.6464F, 0.6192F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(35, 103).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(40, 103).mirror().addBox(-0.1F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.4915F, 1.5959F, -5.6469F, 0.9808F, -0.4697F, 0.4678F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 1.972F, -5.015F, 2.5113F, 0.7132F, -0.5014F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.1137F, -6.1494F, -0.2376F, -1.09F, 0.0559F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-0.1F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5988F, 0.0357F, -5.7898F, -2.6514F, -1.0805F, 2.4819F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(86, 81).mirror().addBox(-0.1F, -0.625F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8965F, 0.2666F, -5.084F, -1.9105F, -1.1534F, 1.9195F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(93, 24).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6737F, 2.7331F, -3.2807F, 2.4937F, 0.8316F, -0.6019F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-0.1F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(99, 0).mirror().addBox(-0.1F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-2.6392F, 1.8554F, -3.0703F, -0.5553F, 0.6744F, 0.8923F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(94, 95).addBox(-0.3679F, -2.745F, -0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.1795F, 1.3584F, -3.2435F, -0.9039F, 0.122F, 0.0353F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(30, 98).addBox(-0.3679F, -2.9218F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1795F, 1.3584F, -3.2435F, -0.3541F, 0.122F, 0.0353F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(0, 68).addBox(-0.4935F, -1.7783F, -1.3436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.4992F, 1.385F, -1.6621F, -0.3513F, 0.1743F, 0.0532F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(40, 103).addBox(-0.9F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(35, 103).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.4915F, 1.5959F, -5.6469F, 0.9808F, 0.4697F, -0.4678F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(25, 103).addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0129F, 1.2756F, -5.2115F, 1.991F, 0.6464F, -0.6192F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(103, 21).addBox(-0.4936F, -0.8745F, -1.1596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4936F, 0.5795F, -5.5129F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(100, 36).addBox(-0.4936F, -0.6363F, -0.2838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.4936F, 0.5795F, -5.5129F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(50, 102).addBox(-0.7F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5921F, 1.4198F, -5.5876F, 1.2225F, 0.2718F, 2.1014F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(93, 71).addBox(-0.1F, -0.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.9499F, 1.108F, -4.9673F, 1.877F, 0.2718F, 2.1014F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(93, 65).addBox(-0.05F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.9956F, 0.1806F, -5.1412F, 1.95F, -0.1503F, -3.1184F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(102, 28).addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 102).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.515F, 0.7803F, -5.9715F, 2.6963F, 1.0123F, -2.7037F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(101, 96).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.6117F, 0.0008F, -5.8197F, 1.9371F, 1.0123F, -2.7037F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(99, 101).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.2103F, 0.6534F, -6.2419F, -2.6053F, 0.4669F, -1.1176F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(94, 101).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0871F, -0.135F, -6.1847F, -1.7264F, 1.0908F, 0.0168F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(89, 101).addBox(-0.4936F, -0.2345F, -0.8203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4936F, 0.5795F, -5.5129F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(99, 0).addBox(-0.9F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(98, 75).addBox(-0.9F, -0.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6392F, 1.8554F, -3.0703F, -0.5553F, -0.6744F, -0.8923F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(53, 67).addBox(-0.4935F, -0.5849F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.4992F, 1.385F, -1.6621F, -0.8313F, 0.1743F, 0.0532F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(67, 39).addBox(-0.4935F, -1.6413F, -0.8861F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4992F, 1.385F, -1.6621F, -0.4735F, 0.1743F, 0.0532F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(10, 95).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0484F, 1.972F, -5.015F, 2.5113F, -0.7132F, 0.5014F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(38, 77).addBox(-0.875F, -0.825F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(31, 77).addBox(-0.875F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1221F, 1.5996F, -3.7691F, 2.7369F, 0.1849F, -0.0871F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(94, 0).addBox(-0.4947F, 0.3269F, -1.0882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4992F, 1.385F, -1.6621F, 0.9315F, 0.1743F, 0.0532F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(93, 24).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6737F, 2.7331F, -3.2807F, 2.4937F, -0.8316F, 0.6019F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(93, 75).addBox(-0.5006F, -0.4766F, -0.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.2917F, 2.5021F, -2.2595F, 2.8835F, 0.122F, -0.0171F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(76, 93).addBox(-0.5006F, -0.5551F, -0.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2917F, 2.5021F, -2.2595F, 2.4908F, 0.122F, -0.0171F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(93, 81).addBox(-0.5006F, -0.1967F, -0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.2917F, 2.5021F, -2.2595F, 1.9235F, 0.122F, -0.0171F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(19, 67).addBox(-0.4935F, -1.1783F, -0.8188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.4992F, 1.385F, -1.6621F, -0.3426F, 0.1743F, 0.0532F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(86, 81).addBox(-1.9F, -0.625F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8965F, 0.2666F, -5.084F, -1.9105F, 1.1534F, -1.9195F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(98, 72).addBox(-0.9F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5988F, 0.0357F, -5.7898F, -2.6514F, 1.0805F, -2.4819F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(98, 69).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, -0.1137F, -6.1494F, -0.2376F, 1.09F, -0.0559F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(89, 95).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.5269F, -5.7371F, -0.0292F, 0.0F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(98, 66).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.808F, -0.2668F, -0.7067F, -2.4479F, 0.0972F, 0.0181F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(98, 63).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.8662F, -0.2631F, -0.1096F, -1.5752F, 0.0972F, 0.0181F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(90, 40).addBox(-0.1F, -3.6587F, 0.7331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1295F, 1.3584F, -3.2435F, -0.8335F, 0.0972F, 0.0181F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5129F, 1.8093F, -8.2194F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 57).addBox(-0.496F, -1.0088F, 0.0251F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0782F, -1.2715F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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