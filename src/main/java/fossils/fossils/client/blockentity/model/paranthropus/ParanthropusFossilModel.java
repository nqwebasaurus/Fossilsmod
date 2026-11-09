package fossils.fossils.client.blockentity.model.paranthropus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParanthropusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart bone;
	private final ModelPart bone8;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone4;
	private final ModelPart bone7;
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
	private final ModelPart bone6;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart tail;

	public ParanthropusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.bone = this.hips.getChild("bone");
		this.bone8 = this.hips.getChild("bone8");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone4 = this.chest.getChild("bone4");
		this.bone7 = this.chest.getChild("bone7");
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
		this.bone6 = this.rightFace.getChild("bone6");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.3859F, 5.1405F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 45).addBox(0.0F, -0.4937F, -1.6061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 18).addBox(0.0F, -0.7132F, -0.1343F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.2F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0828F, -1.3178F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 62).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4736F, 2.2303F, 2.0618F, 0.6478F, -0.0978F, 0.0189F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.5121F, -1.076F, -1.0915F, -0.1484F, 0.9076F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 71).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1844F, 0.1669F, -0.0543F, -0.5411F, 0.9076F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 53).addBox(-0.9F, -0.4863F, -2.1035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 0.5915F, -0.1053F, -0.8029F, 0.9076F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 25).addBox(-0.4965F, -6.068F, -1.4026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0916F, 1.0036F, 0.0524F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 85).addBox(-0.4965F, -1.3214F, -0.8259F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, 0.0704F, 0.8472F, 0.0227F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 85).addBox(-0.5F, -2.2241F, -0.3173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1129F, 10.8084F, 0.3616F, 0.2793F, 0.6723F, 0.0359F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 85).addBox(-0.5F, -1.754F, -0.6519F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1129F, 10.8084F, 0.3616F, 0.1484F, 0.6723F, 0.0359F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 85).addBox(-0.4965F, -1.3159F, -0.9663F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, 0.0529F, 0.8472F, 0.0227F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 95).addBox(-0.4965F, -3.1785F, -1.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0044F, 1.0036F, 0.0524F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(101, 48).addBox(-0.9F, -0.5797F, -0.8394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4F, 0.5915F, -0.1053F, -1.8675F, 0.9076F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 89).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9181F, 0.1033F, 0.8071F, -2.0857F, 0.9076F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9181F, 0.1033F, 0.8071F, -2.6965F, 0.9076F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 91).addBox(-0.4965F, -5.4792F, -1.6579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.2531F, 1.0036F, 0.0524F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 44).addBox(-0.4965F, -6.1463F, -0.9542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0035F, 6.3974F, 0.1928F, -0.0349F, 1.0036F, 0.0524F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 33).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.7703F, -0.4303F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 63).addBox(-1.0F, -0.234F, -1.0486F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.5375F, 1.525F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 63).addBox(-1.0734F, 0.448F, -1.4931F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0734F, 11.5069F, 0.754F, 0.9861F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.885F, 0.947F, 1.546F, 0.1035F, -0.1408F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(80, 34).addBox(-1.0F, -1.275F, 0.075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(29, 91).addBox(-1.0F, -0.725F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2584F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9643F, -2.0532F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 42).addBox(0.0F, 0.975F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.8722F, -1.3643F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -1.725F, -1.975F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2584F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3925F, -1.5083F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 63).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 95).addBox(-1.9F, -0.2839F, -0.9554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 9.9667F, -4.7034F, -0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 42).addBox(-1.9F, 1.0161F, 0.0446F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 0.3841F, -1.6747F, -0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(43, 58).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 1.1353F, 0.7093F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(101, 61).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(101, 58).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8F, 1.9448F, 1.8022F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 38).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.8F, 3.3706F, 0.8763F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 29).addBox(-0.5F, -10.9573F, -0.8132F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.8F, 12.1593F, -5.4992F, -0.6196F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(11, 44).addBox(-1.1059F, -0.537F, -0.55F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2046F, 12.3705F, -6.5214F, -2.3837F, 0.0203F, 0.0662F));

		PartDefinition cube_r35 = leftLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 15).addBox(-1.2F, -2.9185F, -0.2027F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8941F, -0.4513F, 0.3615F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(37, 71).addBox(0.7498F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.68F, 3.9813F, 0.35F, -0.2182F, 0.0F, -0.1309F));

		PartDefinition cube_r37 = leftLeg3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 71).addBox(0.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r38 = leftLeg3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(70, 67).addBox(-1.2726F, 0.1382F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, 0.0873F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(17, 0).addBox(-1.2059F, -0.6556F, -5.0716F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 4.2749F, 0.0205F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 25).addBox(-1.5974F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1941F, -0.1556F, -2.9466F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r40 = leftLeg4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(17, 14).addBox(-2.0254F, -12.1998F, -8.6228F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7941F, 11.5444F, 3.5535F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -3.6144F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4736F, 2.2303F, 2.0618F, 0.3336F, 0.1502F, -0.0893F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, -0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.5121F, -1.076F, -1.0915F, -0.1484F, -0.9076F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 38).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1844F, 0.1669F, -0.0543F, -0.5411F, -0.9076F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 61).addBox(-0.1F, -0.4863F, -2.1035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 0.5915F, -0.1053F, -0.8029F, -0.9076F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 94).addBox(-0.5035F, -6.068F, -1.4026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0916F, -1.0036F, -0.0524F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(89, 46).addBox(-0.5035F, -1.3214F, -0.8259F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, 0.0704F, -0.8472F, -0.0227F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(12, 89).addBox(-0.5F, -2.2241F, -0.3173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1129F, 10.8084F, 0.3616F, 0.2793F, -0.6723F, -0.0359F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 89).addBox(-0.5F, -1.754F, -0.6519F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1129F, 10.8084F, 0.3616F, 0.1484F, -0.6723F, -0.0359F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5035F, -1.3159F, -0.9663F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, 0.0529F, -0.8472F, -0.0227F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5035F, -3.1785F, -1.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0044F, -1.0036F, -0.0524F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(105, 54).addBox(-0.1F, -0.5797F, -0.8394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4F, 0.5915F, -0.1053F, -1.8675F, -0.9076F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 85).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.9181F, 0.1033F, 0.8071F, -2.0857F, -0.9076F, 0.0F));

		PartDefinition cube_r52 = rightLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(89, 4).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9181F, 0.1033F, 0.8071F, -2.6965F, -0.9076F, 0.0F));

		PartDefinition cube_r53 = rightLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 33).addBox(-0.5035F, -5.4792F, -1.6579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.2531F, -1.0036F, -0.0524F));

		PartDefinition cube_r54 = rightLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5035F, -6.1463F, -0.9542F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0035F, 6.3974F, 0.1928F, -0.0349F, -1.0036F, -0.0524F));

		PartDefinition cube_r55 = rightLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(99, 51).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.7703F, -0.4303F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(45, 63).addBox(-1.0F, -0.234F, -1.0486F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.5375F, 1.525F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 69).addBox(-0.9266F, 0.448F, -1.4931F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0734F, 11.5069F, 0.754F, 0.9861F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.885F, 0.947F, 1.2842F, -0.1035F, 0.1408F));

		PartDefinition cube_r58 = rightLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(80, 53).addBox(-1.0F, -1.275F, 0.075F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(39, 94).addBox(-1.0F, -0.725F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2584F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.9643F, -2.0532F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 89).addBox(-1.0F, 0.975F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8722F, -1.3643F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(62, 5).addBox(-1.0F, -1.725F, -1.975F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9805F, 1.2584F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(61, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3925F, -1.5083F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 63).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0995F, -1.5021F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 99).addBox(0.9F, -0.2839F, -0.9554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 9.9667F, -4.7034F, -0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 44).addBox(0.9F, 1.0161F, 0.0446F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 0.3841F, -1.6747F, -0.4058F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 1.1353F, 0.7093F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(105, 70).addBox(-0.5F, 0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(62, 105).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8F, 1.9448F, 1.8022F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(27, 99).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8F, 3.3706F, 0.8763F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, -10.9573F, -0.8132F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8F, 12.1593F, -5.4992F, -0.6196F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(46, 36).addBox(-1.8941F, -0.537F, -0.55F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2046F, 12.3705F, -6.5214F, -1.8075F, 0.1603F, -0.0616F));

		PartDefinition cube_r71 = rightLeg3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(27, 78).addBox(-0.8F, -2.9185F, -0.2027F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8941F, -0.4513F, 0.3615F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(22, 78).addBox(-1.7498F, -4.4857F, -0.7066F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.68F, 3.9813F, 0.35F, -0.2182F, 0.0F, 0.1309F));

		PartDefinition cube_r73 = rightLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(17, 78).addBox(-1.7499F, 0.2141F, -0.8952F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r74 = rightLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(12, 78).addBox(0.2726F, 0.1382F, -0.8996F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0665F, -0.6785F, 0.35F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(17, 7).addBox(-1.7941F, -0.6556F, -5.0716F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1F, 4.2749F, 0.0205F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(30, 14).addBox(-0.4026F, -0.4981F, -0.9604F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1941F, -0.1556F, -2.9466F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r76 = rightLeg4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(13, 21).addBox(1.0254F, -12.1998F, -8.6228F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7941F, 11.5444F, 3.5535F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -3.6144F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, 2.8328F, -2.5566F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 4).addBox(-0.2478F, -0.5205F, -2.2388F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.8102F, 0.7065F, -1.5318F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 66).addBox(-1.1647F, -0.5205F, -3.3343F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.9294F, 0.3971F, -0.0793F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 67).addBox(0.0977F, -0.6105F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.8267F, -0.1963F, 1.4347F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 10).addBox(-1.1881F, -0.6106F, -3.0966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.2036F, -0.687F, 2.2515F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(82, 63).addBox(-0.9126F, -0.6105F, -3.3155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.9656F, -0.5004F, 1.8322F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(82, 49).addBox(0.2943F, -0.6105F, -3.186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.8092F, -0.0768F, 1.3062F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(27, 65).addBox(-0.7115F, -0.5465F, -2.9412F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.8065F, 0.0718F, 1.0253F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 26).addBox(-1.5902F, -0.5205F, -3.0028F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -0.8357F, -0.0877F, 0.4953F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 60).addBox(-1.9438F, -0.4813F, -1.3164F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.8238F, 0.91F, -1.1855F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 46).addBox(-1.992F, -0.4813F, -0.509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.8238F, 0.91F, -1.1855F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 57).addBox(-1.6505F, -0.4813F, -1.6874F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.9767F, 0.8675F, -1.3822F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 48).addBox(-2.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -0.4942F, 0.7097F, 0.6504F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(34, 5).addBox(-3.9227F, -0.1753F, -1.9385F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, -1.7937F, 1.0457F, -0.9108F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(43, 55).addBox(-0.7838F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -2.5696F, 0.8437F, -1.7052F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 31).addBox(-3.3138F, -4.361F, -1.3196F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -1.5391F, 1.2026F, -0.5487F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 38).addBox(0.9503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -3.0944F, -0.9384F, 2.4575F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 71).addBox(0.75F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0791F, 0.3424F, 4.6493F, -3.1058F, -0.6768F, 2.4731F));

		PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(64, 39).addBox(1.938F, -1.0648F, -3.4722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -2.8891F, -1.459F, 2.2445F));

		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(18, 55).addBox(-2.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -3.1105F, -0.4588F, 2.4818F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(34, 11).addBox(-0.7515F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -2.0857F, -1.5359F, 1.5708F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(99, 97).addBox(1.484F, -1.5093F, -2.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -0.0463F, -0.8544F, -0.4802F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(99, 90).addBox(-0.5F, -0.9517F, -3.0528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8281F, 1.5672F, 6.6566F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 78).addBox(-0.7566F, -0.6238F, -0.8334F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.3282F, -2.2142F, 0.0303F, 0.418F, 0.0779F, 0.6711F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 35).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3896F, -1.9813F, 3.5616F, -0.149F, -0.8259F, 0.402F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 23).addBox(-0.1F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3124F, -3.6208F, 0.7731F, -0.0105F, -0.1591F, 0.1597F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, -3.5231F, 1.2632F, -0.1986F, 0.0169F, 0.2438F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 47).addBox(-1.0876F, -4.9877F, -2.0573F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3781F, 2.0544F, 1.9437F, -0.0813F, 0.0783F, 0.9221F));

		PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(89, 61).addBox(-1.0F, -0.7742F, -2.0573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3281F, 1.7294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(41, 81).addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8281F, 2.3234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone8 = hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -2.5566F));

		PartDefinition cube_r106 = bone8.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-2.7522F, -0.5205F, -2.2388F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.8102F, -0.7065F, 1.5318F));

		PartDefinition cube_r107 = bone8.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.8353F, -0.5205F, -3.3343F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.9294F, -0.3971F, 0.0793F));

		PartDefinition cube_r108 = bone8.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-1.0977F, -0.6105F, -1.532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8267F, 0.1963F, -1.4347F));

		PartDefinition cube_r109 = bone8.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(0.1881F, -0.6106F, -3.0966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.2036F, 0.687F, -2.2515F));

		PartDefinition cube_r110 = bone8.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 63).mirror().addBox(-0.0874F, -0.6105F, -3.3155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.9656F, 0.5004F, -1.8322F));

		PartDefinition cube_r111 = bone8.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-1.2943F, -0.6105F, -3.186F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8092F, 0.0768F, -1.3062F));

		PartDefinition cube_r112 = bone8.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-1.2885F, -0.5465F, -2.9412F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8065F, -0.0718F, -1.0253F));

		PartDefinition cube_r113 = bone8.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(46, 26).mirror().addBox(-0.4098F, -0.5205F, -3.0028F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -0.8357F, 0.0877F, -0.4953F));

		PartDefinition cube_r114 = bone8.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-1.0562F, -0.4813F, -1.3164F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.8238F, -0.91F, 1.1855F));

		PartDefinition cube_r115 = bone8.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(55, 46).mirror().addBox(-0.008F, -0.4813F, -0.509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.8238F, -0.91F, 1.1855F));

		PartDefinition cube_r116 = bone8.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 57).mirror().addBox(-1.3495F, -0.4813F, -1.6874F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.9767F, -0.8675F, 1.3822F));

		PartDefinition cube_r117 = bone8.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(94, 48).mirror().addBox(0.2284F, -4.361F, -1.472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.4942F, -0.7097F, -0.6504F));

		PartDefinition cube_r118 = bone8.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(34, 5).mirror().addBox(-0.0773F, -0.1753F, -1.9385F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, -1.7937F, -1.0457F, 0.9108F));

		PartDefinition cube_r119 = bone8.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(43, 55).mirror().addBox(-1.2162F, -4.361F, -2.4735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.5696F, -0.8437F, 1.7052F));

		PartDefinition cube_r120 = bone8.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-2.6862F, -4.361F, -1.3196F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -1.5391F, -1.2026F, 0.5487F));

		PartDefinition cube_r121 = bone8.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-1.9503F, -1.0648F, -2.6744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.0944F, 0.9384F, -2.4575F));

		PartDefinition cube_r122 = bone8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-1.75F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0791F, 3.9424F, 4.6493F, -3.1058F, 0.6768F, -2.4731F));

		PartDefinition cube_r123 = bone8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-3.938F, -1.0648F, -3.4722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.8891F, 1.459F, -2.2445F));

		PartDefinition cube_r124 = bone8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(0.2824F, -1.0648F, -3.8182F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -3.1105F, 0.4588F, -2.4818F));

		PartDefinition cube_r125 = bone8.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 11).mirror().addBox(-2.2484F, -1.5093F, -3.6428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -2.0857F, 1.5359F, -1.5708F));

		PartDefinition cube_r126 = bone8.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(99, 97).mirror().addBox(-2.484F, -1.5093F, -2.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.0463F, 0.8544F, 0.4802F));

		PartDefinition cube_r127 = bone8.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.5F, -0.9517F, -3.0528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 5.1672F, 6.6566F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r128 = bone8.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(56, 78).mirror().addBox(-0.2435F, -0.6238F, -0.8334F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3282F, 1.3858F, 0.0303F, 0.418F, -0.0779F, -0.6711F));

		PartDefinition cube_r129 = bone8.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3896F, 1.6187F, 3.5616F, -0.149F, 0.8259F, -0.402F));

		PartDefinition cube_r130 = bone8.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 23).mirror().addBox(-1.9F, 0.1F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3124F, -0.0208F, 0.7731F, -0.0105F, 0.1591F, -0.1597F));

		PartDefinition cube_r131 = bone8.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-2.0F, 0.1F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 0.0769F, 1.2632F, -0.1986F, -0.0169F, -0.2438F));

		PartDefinition cube_r132 = bone8.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(0.0876F, -4.9877F, -2.0573F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3781F, 5.6544F, 1.9437F, -0.0813F, -0.0783F, -0.9221F));

		PartDefinition cube_r133 = bone8.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(0.0F, -0.7742F, -2.0573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3281F, 5.3294F, 1.9437F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone8.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(41, 81).mirror().addBox(-0.5F, -0.9767F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.8281F, 5.9234F, 3.6921F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3183F, -4.0742F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 42).addBox(0.0F, -0.6751F, -0.317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.7F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(58, 5).addBox(0.0F, -0.793F, -0.2538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(0.8189F, -0.4319F, 0.0649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, -0.1342F, -1.8505F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(14, 106).mirror().addBox(0.1F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.3198F, 3.1052F, 0.0324F, -1.8382F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(96, 104).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5204F, -0.8527F, -5.2657F, -2.9695F, -0.3063F, -1.8805F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(14, 106).addBox(-0.1F, -0.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.3198F, 3.1052F, -0.0324F, 1.8382F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(96, 104).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5204F, -0.8527F, -5.2657F, -2.9695F, 0.3063F, 1.8805F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(11, 39).addBox(-0.8189F, -0.4319F, 0.0649F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -2.9761F, 0.1342F, 1.8505F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(43, 26).addBox(0.0F, -0.9451F, 0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.7F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(35, 29).addBox(-0.5F, -0.9597F, -4.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(27, 83).addBox(-0.5F, 0.1F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8732F, -5.9268F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.775F, -0.6F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 7.4549F, -0.1153F, 0.7077F, -0.7193F, -0.2429F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2863F, 6.6813F, 0.2542F, 0.5977F, -0.5175F, -0.0545F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(14, 85).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1643F, 5.602F, 1.6909F, 0.5977F, -0.5175F, -0.0545F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 85).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1643F, 5.602F, 1.6909F, 0.5977F, 0.5175F, 0.0545F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 30).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2863F, 6.6813F, 0.2542F, 0.5977F, 0.5175F, 0.0545F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(80, 3).addBox(-0.225F, -0.6F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 7.4549F, -0.1153F, 0.7077F, 0.7193F, 0.2429F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 58).addBox(-0.5F, -0.3097F, 1.4244F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0308F, -3.7781F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(34, 55).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 96).addBox(0.0F, -1.2769F, -0.828F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.2F, -0.3752F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4857F, -2.7264F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(11, 106).addBox(0.0F, -1.3938F, 0.054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.2F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(26, 27).mirror().addBox(-4.9717F, 0.0136F, -0.041F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6119F, -0.1684F, 1.6773F, -0.0155F, 0.5424F, -0.1842F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9353F, 4.3081F, 5.1782F, -0.3022F, -0.4143F, -2.6294F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(-3.5406F, -6.1654F, 0.1622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6119F, -0.1684F, 1.6773F, -0.5072F, -0.0204F, -1.7544F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 11).mirror().addBox(-4.9755F, -3.9535F, 0.1622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6119F, -0.1684F, 1.6773F, -0.4271F, 0.2832F, -1.167F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-5.3694F, -4.5882F, -0.2526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1119F, -0.0184F, -0.3227F, -0.1056F, 0.4448F, -1.2526F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(13, 29).mirror().addBox(-5.7007F, -0.054F, -0.4815F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1119F, -0.0184F, -0.3227F, 0.316F, 0.3746F, -0.2372F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(69, 55).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8065F, 5.5384F, 3.4885F, -0.4217F, -0.18F, -2.9616F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-4.4667F, -6.9087F, -0.2526F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1119F, -0.0184F, -0.3227F, -0.3596F, 0.2874F, -1.9358F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 11).addBox(2.9755F, -3.9535F, 0.1622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6119F, -0.1684F, 1.6773F, -0.4271F, -0.2832F, 1.167F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 69).addBox(1.5406F, -6.1654F, 0.1622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6119F, -0.1684F, 1.6773F, -0.5072F, 0.0204F, 1.7544F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(61, 20).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9353F, 4.3081F, 5.1782F, -0.3022F, 0.4143F, 2.6294F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(26, 27).addBox(-2.0283F, 0.0136F, -0.041F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6119F, -0.1684F, 1.6773F, -0.0155F, -0.5424F, 0.1842F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(27, 58).addBox(3.3694F, -4.5882F, -0.2526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1119F, -0.0184F, -0.3227F, -0.1056F, -0.4448F, 1.2526F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(13, 29).addBox(-1.2993F, -0.054F, -0.4815F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1119F, -0.0184F, -0.3227F, 0.316F, -0.3746F, 0.2372F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(69, 55).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8065F, 5.5384F, 3.4885F, -0.4217F, 0.18F, 2.9616F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(79, 61).addBox(1.4667F, -6.9087F, -0.2526F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1119F, -0.0184F, -0.3227F, -0.3596F, -0.2874F, 1.9358F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(79, 57).addBox(-0.5F, -0.3F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -0.0978F, -4.0739F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 106).addBox(0.0F, -1.5507F, -0.2782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(47, 2).mirror().addBox(-4.4727F, -0.2064F, -0.5242F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.1291F, -2.3399F, 0.5069F, 0.3053F, -0.065F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 7).mirror().addBox(-6.3974F, -2.9074F, -0.6548F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.1291F, -2.3399F, 0.2095F, 0.5791F, -0.7374F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-4.0687F, -7.0268F, -0.6548F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 1.1291F, -2.3399F, -0.4763F, 0.3996F, -2.0327F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(43, 17).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0266F, 6.2249F, 2.0845F, -0.6067F, -0.0835F, -2.7984F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-4.8787F, -0.1229F, -0.6059F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8086F, 0.4541F, -0.2649F, 0.3043F, 0.3793F, -0.193F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-6.7664F, -3.0898F, -0.7496F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8086F, 0.4541F, -0.2649F, -0.0171F, 0.5128F, -0.9153F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(48, 83).mirror().addBox(-3.0592F, -7.4383F, -0.7496F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8086F, 0.4541F, -0.2649F, -0.4776F, 0.1951F, -2.0929F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4461F, 5.87F, 3.4649F, -0.4936F, -0.146F, -2.7153F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4461F, 5.87F, 3.4649F, -0.4936F, 0.146F, 2.7153F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(48, 83).addBox(0.0593F, -7.4383F, -0.7496F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8086F, 0.4541F, -0.2649F, -0.4776F, -0.1951F, 2.0929F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(81, 75).addBox(3.7664F, -3.0898F, -0.7496F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8086F, 0.4541F, -0.2649F, -0.0171F, -0.5128F, 0.9153F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(34, 9).addBox(-1.1213F, -0.1229F, -0.6059F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8086F, 0.4541F, -0.2649F, 0.3043F, -0.3793F, 0.193F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(43, 17).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0266F, 6.2249F, 2.0845F, -0.6067F, 0.0835F, 2.7984F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(62, 51).addBox(0.0687F, -7.0268F, -0.6548F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.1291F, -2.3399F, -0.4763F, -0.3996F, 2.0327F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(80, 7).addBox(3.3974F, -2.9074F, -0.6548F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.1291F, -2.3399F, 0.2095F, -0.5791F, 0.7374F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(47, 2).addBox(-0.5272F, -0.2064F, -0.5242F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5086F, 1.1291F, -2.3399F, 0.5069F, -0.3053F, 0.065F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(28, 73).addBox(0.0F, -1.4033F, -0.1405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, -0.1134F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6199F, -3.6946F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-6.1163F, -3.7488F, -1.1375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 0.1135F, -1.9761F, -0.1319F, 0.412F, -1.2348F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-1.1873F, -7.1276F, -1.1375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 0.1135F, -1.9761F, -0.4275F, 0.0601F, -2.3547F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(64, 43).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4029F, 5.6179F, 0.4659F, -0.382F, -0.2058F, -2.9562F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 51).mirror().addBox(-4.5732F, -1.6884F, -1.1375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 0.1135F, -1.9761F, 0.1051F, 0.4192F, -0.6612F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-3.9686F, 0.187F, -1.0172F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, 0.1135F, -1.9761F, 0.2788F, 0.2919F, -0.1582F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-4.8085F, -2.2999F, -0.7324F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 0.2592F, -0.2952F, -0.0011F, 0.3177F, -0.7741F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-6.8944F, -3.6394F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 0.2592F, -0.2952F, -0.0996F, 0.3022F, -1.0946F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(66, 83).mirror().addBox(-2.6153F, -7.7865F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 0.2592F, -0.2952F, -0.3153F, 0.0398F, -2.2202F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7595F, 6.7909F, 2.0006F, -0.239F, -0.2114F, -3.0523F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-4.4502F, -0.2487F, -0.603F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3336F, 0.2592F, -0.2952F, 0.1379F, 0.2508F, -0.2706F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(49, 8).addBox(-0.5498F, -0.2487F, -0.603F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3336F, 0.2592F, -0.2952F, 0.1379F, -0.2508F, 0.2706F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 53).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7595F, 6.7909F, 2.0006F, -0.239F, 0.2114F, 3.0523F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(66, 83).addBox(-0.3847F, -7.7865F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3336F, 0.2592F, -0.2952F, -0.3153F, -0.0398F, 2.2202F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(57, 83).addBox(3.8943F, -3.6394F, -0.7324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3336F, 0.2592F, -0.2952F, -0.0996F, -0.3022F, 1.0946F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 17).addBox(3.8085F, -2.2999F, -0.7324F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3336F, 0.2592F, -0.2952F, -0.0011F, -0.3177F, 0.7741F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(47, 4).addBox(-1.5F, -3.9528F, 1.1824F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9805F, -5.0744F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(26, 21).addBox(-1.0F, -3.7869F, 1.8911F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2805F, -3.6744F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(20, 106).addBox(0.0F, -2.0476F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(17, 106).addBox(0.0F, -2.0815F, 0.0453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(57, 33).addBox(-0.0314F, 0.187F, -1.0172F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 0.1135F, -1.9761F, 0.2788F, -0.2919F, 0.1582F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(25, 51).addBox(3.5732F, -1.6884F, -1.1375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 0.1135F, -1.9761F, 0.1051F, -0.4192F, 0.6612F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(64, 43).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4029F, 5.6179F, 0.4659F, -0.382F, 0.2058F, 2.9562F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(54, 15).addBox(-0.8127F, -7.1276F, -1.1375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 0.1135F, -1.9761F, -0.4275F, -0.0601F, 2.3547F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(78, 47).addBox(3.1163F, -3.7488F, -1.1375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3586F, 0.1135F, -1.9761F, -0.1319F, -0.412F, 1.2348F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.9889F, 1.9677F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.4254F, 4.1368F, -2.6385F));

		PartDefinition cube_r217 = bone4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(39, 20).addBox(-0.5452F, 0.1181F, 0.1219F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 0.7507F, 0.3306F, -0.9611F));

		PartDefinition cube_r218 = bone4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(83, 77).addBox(0.042F, -0.7399F, -0.9836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5263F, -3.6773F, 2.0741F, 0.9941F, -0.028F, -1.4066F));

		PartDefinition cube_r219 = bone4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(34, 83).addBox(-0.5484F, -1.6881F, -1.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 2.2081F, 0.3306F, -0.9611F));

		PartDefinition cube_r220 = bone4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5484F, -1.7082F, -1.7343F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 1.3442F, 0.3306F, -0.9611F));

		PartDefinition cube_r221 = bone4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7607F, -5.7258F, 3.5972F, 0.9078F, 0.3306F, -0.9611F));

		PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(46, 43).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4468F, -5.1537F, 1.7067F, 1.606F, 0.3306F, -0.9611F));

		PartDefinition cube_r223 = bone4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(42, 49).addBox(-0.5452F, -1.1397F, 0.3024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 1.8241F, 0.3306F, -0.9611F));

		PartDefinition cube_r224 = bone4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(71, 7).addBox(-7.0268F, 0.6797F, 0.434F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6655F, -1.6145F, 0.0995F, -0.5408F, -0.0042F, -0.1993F));

		PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(75, 83).addBox(1.4851F, -0.3605F, -3.4474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5263F, -3.6773F, 2.0741F, 0.9167F, 0.4351F, -0.5689F));

		PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(79, 10).addBox(0.3253F, -0.7399F, -2.5448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5263F, -3.6773F, 2.0741F, 1.0164F, 0.17F, -1.0969F));

		PartDefinition cube_r227 = bone4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(63, 10).addBox(-0.5484F, -1.0316F, -2.6335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 1.5885F, 0.3306F, -0.9611F));

		PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(25, 53).addBox(-0.5484F, 0.2819F, -2.5618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.268F, -3.2331F, 1.6871F, 1.1871F, 0.3306F, -0.9611F));

		PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(78, 0).addBox(-3.1764F, -0.6473F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.6655F, -1.6145F, 0.0995F, -0.5446F, -0.0734F, -0.5144F));

		PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(94, 45).addBox(-4.3366F, -0.6473F, -2.3057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6655F, -1.6145F, 0.0995F, -0.5878F, 0.3715F, -0.7962F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.4254F, 4.1368F, -2.6385F));

		PartDefinition cube_r231 = bone7.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(39, 20).mirror().addBox(-0.4548F, 0.1181F, 0.1219F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 0.7507F, -0.3306F, 0.9611F));

		PartDefinition cube_r232 = bone7.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-1.042F, -0.7399F, -0.9836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5263F, -3.6773F, 2.0741F, 0.9941F, 0.028F, 1.4066F));

		PartDefinition cube_r233 = bone7.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(34, 83).mirror().addBox(-0.4516F, -1.6881F, -1.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 2.2081F, -0.3306F, 0.9611F));

		PartDefinition cube_r234 = bone7.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.4516F, -1.7082F, -1.7343F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 1.3442F, -0.3306F, 0.9611F));

		PartDefinition cube_r235 = bone7.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7607F, -5.7258F, 3.5972F, 0.9078F, -0.3306F, 0.9611F));

		PartDefinition cube_r236 = bone7.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4468F, -5.1537F, 1.7067F, 1.606F, -0.3306F, 0.9611F));

		PartDefinition cube_r237 = bone7.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(42, 49).mirror().addBox(-0.4548F, -1.1397F, 0.3024F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 1.8241F, -0.3306F, 0.9611F));

		PartDefinition cube_r238 = bone7.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(4.0268F, 0.6797F, 0.434F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6655F, -1.6145F, 0.0995F, -0.5408F, 0.0042F, 0.1993F));

		PartDefinition cube_r239 = bone7.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-2.4851F, -0.3605F, -3.4474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5263F, -3.6773F, 2.0741F, 0.9167F, -0.4351F, 0.5689F));

		PartDefinition cube_r240 = bone7.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-1.3253F, -0.7399F, -2.5448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5263F, -3.6773F, 2.0741F, 1.0164F, -0.17F, 1.0969F));

		PartDefinition cube_r241 = bone7.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(63, 10).mirror().addBox(-0.4516F, -1.0316F, -2.6335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 1.5885F, -0.3306F, 0.9611F));

		PartDefinition cube_r242 = bone7.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-0.4516F, 0.2819F, -2.5618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.268F, -3.2331F, 1.6871F, 1.1871F, -0.3306F, 0.9611F));

		PartDefinition cube_r243 = bone7.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.1764F, -0.6473F, -0.8285F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.6655F, -1.6145F, 0.0995F, -0.5446F, 0.0734F, 0.5144F));

		PartDefinition cube_r244 = bone7.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(2.3366F, -0.6473F, -2.3057F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6655F, -1.6145F, 0.0995F, -0.5878F, -0.3715F, 0.7962F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.4143F, 2.9545F, -1.1506F, 1.2997F, 0.1576F, 0.0377F));

		PartDefinition cube_r245 = leftarm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(100, 7).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0178F, 9.5319F, 5.7357F, -0.6019F, -0.003F, 0.0006F));

		PartDefinition cube_r246 = leftarm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(95, 75).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0165F, 7.9558F, 5.6095F, 0.4017F, -0.003F, 0.0006F));

		PartDefinition cube_r247 = leftarm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(95, 71).addBox(-0.5F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0045F, 0.9539F, -0.1328F, 1.0562F, -0.003F, 0.0006F));

		PartDefinition cube_r248 = leftarm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 31).addBox(0.0F, -4.0373F, -0.0956F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 2.6099F, 1.056F, 0.5762F, -0.003F, 0.0006F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3227F, 10.8228F, 6.1684F, -1.5707F, -0.0971F, 0.8623F));

		PartDefinition cube_r249 = leftarm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(94, 89).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, 0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r250 = leftarm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(57, 71).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r251 = leftarm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, 4.5991F, 0.1825F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, -0.1222F, 0.0F, -0.0524F));

		PartDefinition cube_r252 = leftarm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 51).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, 0.0524F, 0.0F, -0.0524F));

		PartDefinition cube_r253 = leftarm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(90, 75).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, -0.0524F));

		PartDefinition cube_r254 = leftarm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(89, 89).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0882F, 5.8043F, -0.9993F, -0.0873F, 0.0F, 0.0349F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.176F, 9.5374F, -1.4119F, -1.6029F, -1.51F, 2.1355F));

		PartDefinition cube_r255 = leftArm3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(34, 78).addBox(-0.7408F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3381F, 0.0886F, -0.2467F));

		PartDefinition cube_r256 = leftArm3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 71).addBox(-1.6708F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4F, 2.9F, -0.6F, 0.3478F, 0.0298F, -0.082F));

		PartDefinition cube_r257 = leftArm3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(95, 79).addBox(0.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r258 = leftArm3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(63, 89).addBox(-0.4986F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thumb = leftArm3.addOrReplaceChild("thumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, 0.1133F, 0.3107F, 0.5121F, -0.6333F, -0.2064F));

		PartDefinition cube_r259 = thumb.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(96, 3).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition thumb2 = thumb.addOrReplaceChild("thumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.075F, 1.7008F, -0.5174F, 0.0832F, 0.0262F, -0.3043F));

		PartDefinition cube_r260 = thumb2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(90, 80).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6F, 1.2F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.835F, 4.4218F, -0.0153F, 0.3514F, 0.0263F, -0.1009F));

		PartDefinition cube_r261 = leftArm4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(72, 10).addBox(-1.309F, -2.6048F, -0.6643F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.934F, 2.5658F, 1.0616F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r262 = leftArm4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(78, 42).addBox(0.0367F, -1.0099F, -0.6933F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.9577F, 1.0906F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.4143F, 2.9545F, -1.1506F, 0.7825F, -1.0368F, -1.4136F));

		PartDefinition cube_r263 = rightarm.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(105, 9).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0178F, 9.5319F, 5.7357F, -0.6019F, 0.003F, -0.0006F));

		PartDefinition cube_r264 = rightarm.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0165F, 7.9558F, 5.6095F, 0.4017F, 0.003F, -0.0006F));

		PartDefinition cube_r265 = rightarm.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(84, 98).addBox(-0.5F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0045F, 0.9539F, -0.1328F, 1.0562F, 0.003F, -0.0006F));

		PartDefinition cube_r266 = rightarm.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(20, 31).addBox(-1.0F, -4.0373F, -0.0956F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.6099F, 1.056F, 0.5762F, 0.003F, -0.0006F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3227F, 10.8228F, 6.1684F, -0.8841F, 0.8165F, -0.1181F));

		PartDefinition cube_r267 = rightarm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, 2.0201F, -0.6591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, 0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r268 = rightarm2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(76, 71).addBox(-0.5F, -2.7617F, -0.5847F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, -0.0175F, 0.0F, -0.0349F));

		PartDefinition cube_r269 = rightarm2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(62, 76).addBox(-0.5F, 4.5991F, 0.1825F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, -0.1222F, 0.0F, 0.0524F));

		PartDefinition cube_r270 = rightarm2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(69, 94).addBox(-0.5F, 1.8157F, -0.6499F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, 0.0524F, 0.0F, 0.0524F));

		PartDefinition cube_r271 = rightarm2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(17, 94).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, 0.0524F));

		PartDefinition cube_r272 = rightarm2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 93).addBox(-0.5F, -5.5147F, -0.762F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0882F, 5.8043F, -0.9993F, -0.0873F, 0.0F, -0.0349F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.176F, 9.5374F, -1.4119F, -1.0793F, 1.51F, -2.1355F));

		PartDefinition cube_r273 = rightArm3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(49, 78).addBox(-1.2592F, -0.9568F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3381F, -0.0886F, 0.2467F));

		PartDefinition cube_r274 = rightArm3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(77, 15).addBox(-0.3292F, -0.9456F, 0.4498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 2.9F, -0.6F, 0.3478F, -0.0298F, 0.082F));

		PartDefinition cube_r275 = rightArm3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(5, 99).addBox(-1.9514F, 0.1773F, -0.5299F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r276 = rightArm3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(89, 65).addBox(-1.5014F, -0.0227F, -0.5299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thumb3 = rightArm3.addOrReplaceChild("thumb3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1142F, 0.1133F, 0.3107F, 0.5121F, 0.6333F, 0.2064F));

		PartDefinition cube_r277 = thumb3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(10, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition thumb4 = thumb3.addOrReplaceChild("thumb4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.075F, 1.7008F, -0.5174F, 0.0832F, -0.0262F, 0.3043F));

		PartDefinition cube_r278 = thumb4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(29, 94).addBox(0.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, 1.2F, 0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.835F, 4.4218F, -0.0153F, 0.5695F, -0.0263F, 0.1009F));

		PartDefinition cube_r279 = rightArm4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(77, 29).addBox(-0.691F, -2.6048F, -0.6643F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.934F, 2.5658F, 1.0616F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r280 = rightArm4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(76, 78).addBox(-2.0366F, -1.0099F, -0.6933F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.9577F, 1.0906F, 0.0F, 0.0F, -0.0436F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2593F, -3.5968F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(23, 106).addBox(0.0F, -2.0003F, -0.014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.814F, -0.6842F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(100, 10).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5795F, -1.9173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6129F, -0.838F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(8, 106).addBox(0.0F, -1.4854F, -0.0704F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.7F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(83, 81).addBox(-0.5F, -0.1681F, 1.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1225F, -1.4348F, -0.4051F, -0.4692F, 0.0114F));

		PartDefinition cube_r285 = neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(106, 25).addBox(0.0F, -1.0684F, -0.1304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.4F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r286 = neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(67, 79).addBox(-0.5F, -0.1681F, -2.0721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6297F, 0.6001F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(46, 31).addBox(-1.0F, -0.7F, -1.575F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.0885F, -4.7527F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.3F, -1.9F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9858F, -3.6715F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(66, 26).addBox(-1.5F, -2.0F, -0.075F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.4023F, -3.9663F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 19).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.3249F, -6.475F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(36, 91).addBox(-0.9936F, -0.0572F, -0.0527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.0064F, 1.6487F, -7.5972F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(91, 30).addBox(-0.5F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5F, 1.5365F, -7.051F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(43, 91).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1395F, -5.9405F, 2.5045F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(72, 63).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1395F, -5.9405F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(49, 100).addBox(-1.0F, -0.65F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0963F, -5.4463F, 2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(57, 23).addBox(-1.0F, -0.9F, -2.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.0963F, -5.4463F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(99, 103).addBox(-0.5F, -0.525F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(33, 87).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.6212F, -6.3503F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(84, 14).addBox(-0.5F, -0.5099F, 0.4819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0793F, -5.6191F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.8584F, -6.4466F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(44, 100).addBox(-0.5F, -0.725F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0346F, -5.9198F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(20, 100).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1197F, -5.8901F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(106, 3).addBox(0.5F, 0.2113F, 1.2475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(89, 94).addBox(0.0F, 0.2113F, 0.5475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.0F, 1.4918F, -7.4445F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(66, 22).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0566F, -7.3992F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(43, 11).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.005F, -0.0729F, -0.5703F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(73, 50).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.005F, -0.7157F, 0.1957F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(42, 73).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.005F, -0.7933F, 0.4855F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(73, 39).addBox(-1.5F, -0.5F, 0.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.8361F, -0.9175F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(98, 17).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.005F, -2.021F, 0.8618F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(36, 67).addBox(-1.5F, -2.1F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.005F, -1.8361F, -0.9175F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(9, 51).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -3.2452F, 0.8187F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(27, 60).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.005F, -4.1322F, 0.3569F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(9, 57).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -4.9361F, -0.2379F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(56, 85).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.006F, -5.0995F, -4.1391F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(69, 74).addBox(-0.5F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.006F, -5.4285F, -0.2688F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(96, 64).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.006F, -5.7726F, -0.7603F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(61, 96).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.006F, -5.9279F, -1.3398F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(96, 60).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.006F, -5.9279F, -1.9398F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(56, 96).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.006F, -5.8861F, -2.5384F, -3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(51, 96).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.006F, -5.7157F, -3.1137F, -2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(46, 96).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.006F, -5.4479F, -3.6506F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(101, 64).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.006F, -5.0091F, -3.7061F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.006F, -5.1428F, -3.2243F, -2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, -5.1428F, -3.2243F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(55, 41).addBox(-1.5F, 0.15F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.006F, -5.3421F, -2.2444F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(50, 19).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -5.1582F, -1.2301F, 1.3483F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(35, 41).addBox(-1.5F, 0.0F, -0.7F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -4.3453F, -5.0769F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(55, 36).addBox(-2.0F, 0.0241F, -1.0147F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.5F, -4.8834F, -4.2002F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3359F, 1.6818F, -10.0283F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 80).addBox(-0.4275F, -0.2071F, -0.502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1149F, -0.1575F, 4.3155F, 0.2639F, 0.2058F, -0.0125F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(66, 99).addBox(-0.4267F, -0.1566F, -1.1456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1149F, -0.1575F, 4.3155F, 0.1066F, 0.2094F, -0.0126F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(84, 22).addBox(0.5726F, -1.2066F, -0.7335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1987F, -2.8836F, 6.8049F, -0.5236F, -1.3682F, 0.4165F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(61, 67).addBox(-1.725F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.3143F, -3.4987F, 11.5958F, 0.1595F, -0.0079F, 0.2201F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(52, 67).addBox(-2.8347F, -0.7431F, 0.1913F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.8011F, -3.1402F, 8.701F, 0.1005F, 0.4547F, -0.0538F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(34, 0).addBox(-2.515F, -0.7431F, -0.5865F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8011F, -3.1402F, 8.701F, 0.0914F, -0.1536F, -0.1121F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.7282F, -3.355F, 8.7321F, -0.0249F, -0.8651F, 0.0208F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(57, 28).addBox(0.6555F, -1.2066F, 0.0242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.1987F, -2.8836F, 6.8049F, -0.1558F, -0.8651F, 0.0208F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(104, 34).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.7018F, -2.9465F, 7.7327F, -0.7561F, -0.1287F, -0.0851F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(101, 45).addBox(0.1216F, -1.2066F, 0.3486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.1987F, -2.8836F, 6.8049F, -0.1016F, -0.1287F, -0.0851F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(103, 13).addBox(-0.75F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.6032F, -3.3122F, 4.3416F, -0.0916F, -0.315F, 0.7264F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(10, 103).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.3516F, -3.2611F, 4.4733F, -0.2217F, -0.5704F, 0.1561F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1811F, -3.1949F, 4.8562F, -0.2F, 0.3713F, -0.0384F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(103, 16).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.4646F, -2.539F, 4.6922F, 0.1789F, -0.9789F, -0.1856F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(15, 103).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.4646F, -2.539F, 4.6922F, 0.415F, -0.9274F, -0.4745F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.46F, -2.5887F, 5.5123F, 0.2626F, 0.3713F, -0.0384F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 57).addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.959F, -3.3387F, 6.04F, 0.1753F, 0.3713F, -0.0384F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(26, 87).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.7071F, -3.0728F, 6.8981F, 0.0586F, 0.0271F, -0.0981F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(84, 18).addBox(0.0218F, -0.9942F, -0.8715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1987F, -2.8836F, 6.8049F, 0.1633F, 0.0271F, -0.0981F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(101, 37).addBox(-1.3327F, -1.2458F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(37, 101).addBox(-1.3327F, -1.2458F, -0.6031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.328F, -0.0984F, 4.0391F, 1.5389F, -0.3509F, 0.0016F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(99, 42).addBox(-0.425F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2102F, 0.4407F, 3.2159F, 1.4837F, 0.9851F, -0.2917F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(69, 103).addBox(-1.6F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4336F, -0.6825F, 3.2716F, 1.958F, 0.5916F, 1.267F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(57, 103).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4336F, -0.6825F, 3.2716F, 1.8912F, 0.0988F, 1.0761F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(101, 25).addBox(-0.3656F, -1.3482F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1149F, -0.1575F, 4.3155F, 1.6402F, 0.3278F, 0.0069F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.022F, -5.0231F, 3.7082F, 1.9151F, 1.0121F, 1.2684F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(101, 0).addBox(-0.6645F, -0.5615F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5687F, -5.3518F, 3.7175F, 0.818F, 1.3326F, 0.8149F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(93, 57).addBox(-1.5787F, -0.1763F, -1.0317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(17, 91).addBox(-1.5787F, -0.1763F, -0.8317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.6687F, -5.7518F, 3.7175F, 0.9065F, 1.306F, 0.7491F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(104, 31).addBox(-0.0131F, -0.3208F, -1.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(99, 100).addBox(-0.0131F, -0.3208F, -0.8317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6687F, -5.7518F, 3.7175F, 1.3636F, 0.6693F, 1.2666F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(104, 99).addBox(-0.3349F, -0.5617F, 0.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(100, 80).addBox(-0.3349F, -0.5617F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.5687F, -5.3518F, 3.7175F, 1.3636F, 0.6693F, 1.4237F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(96, 83).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6321F, -4.5805F, 4.4741F, 1.2711F, 1.1378F, 2.773F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5005F, -2.6717F, -1.3795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.436F, -2.5485F, 4.3208F, 1.6159F, 1.4074F, -0.0058F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(39, 97).addBox(-0.5005F, -0.814F, -0.8599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 103).addBox(-0.5005F, 0.186F, -0.4599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.436F, -2.5485F, 4.3208F, 0.7433F, 1.4074F, -0.0058F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(86, 9).addBox(-0.5005F, -0.4696F, -0.8107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.436F, -2.5485F, 4.3208F, -0.173F, 1.4074F, -0.0058F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(81, 102).addBox(-0.5005F, -1.2106F, -0.6262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.436F, -2.5485F, 4.3208F, -1.3075F, 1.4074F, -0.0058F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5005F, -0.5231F, -1.2481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.436F, -2.5485F, 4.3208F, -2.1802F, 1.4074F, -0.0058F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(94, 97).addBox(-0.55F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3957F, -3.2729F, 4.0391F, -2.6681F, 1.4715F, -0.7004F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(50, 91).addBox(-0.575F, -0.925F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7876F, -3.5987F, 4.1583F, -0.7995F, 1.4113F, 0.2591F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(104, 102).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5617F, -3.6326F, 4.2989F, 1.0148F, 1.4298F, 1.9711F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(63, 85).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3339F, -4.5545F, 4.494F, 0.4912F, 1.4298F, 1.9711F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(82, 85).addBox(-0.2172F, -0.8047F, -0.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2344F, -5.082F, 4.1995F, -0.8022F, 0.9298F, 2.0873F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(89, 101).addBox(-0.2172F, -0.8047F, -0.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4344F, -5.082F, 4.1995F, -1.208F, 1.093F, 1.6126F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(96, 93).addBox(-0.175F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2402F, -5.0917F, 4.214F, -1.4981F, 0.9577F, 2.3824F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(79, 96).addBox(-0.2F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8862F, -5.4428F, 3.8802F, -2.3699F, 0.6821F, 1.7772F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(101, 83).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.1055F, -5.2332F, 3.6657F, -2.4909F, 0.7964F, 1.5983F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 91).addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2042F, -5.7871F, 4.2495F, 2.4868F, -1.0075F, 2.5333F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(101, 93).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3608F, -5.6569F, 3.6851F, 2.8087F, -0.0972F, 1.9911F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(101, 67).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.58F, -5.4472F, 3.4706F, 2.6579F, 0.7964F, 1.5983F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(74, 96).addBox(-0.2F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0627F, -5.6846F, 3.666F, 1.5064F, -0.1611F, 1.6738F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(100, 77).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.2488F, -5.2621F, 3.6604F, 1.5496F, 0.7964F, 1.5983F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(14, 73).addBox(0.0F, 0.025F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2557F, -5.0729F, 6.2832F, 0.3653F, -0.8587F, 1.3321F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(104, 105).addBox(0.214F, -0.6351F, 0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6197F, -2.0333F, 3.7327F, 1.3501F, -0.276F, -0.9467F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(105, 79).addBox(0.164F, -0.6351F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4947F, -2.1333F, 3.7327F, 1.3501F, -0.276F, -1.0165F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(105, 76).addBox(-0.3154F, -0.9006F, 0.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4947F, -2.1333F, 3.7327F, 0.944F, 0.0251F, -0.3074F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(79, 105).addBox(-0.3154F, -0.687F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 73).addBox(-0.3154F, -0.687F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4947F, -2.1333F, 3.7327F, 1.2931F, 0.0251F, -0.3074F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(7, 73).addBox(-0.2575F, -0.3371F, -1.7585F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5428F, -1.978F, 3.3408F, 1.2222F, 0.1442F, -0.0573F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(91, 16).addBox(-2.075F, -1.075F, -1.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8354F, -5.3897F, 6.2034F, 0.5342F, 0.6198F, -0.6283F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(55, 93).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8194F, -1.0059F, 4.8627F, 0.3392F, -0.2132F, 1.0749F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(76, 100).addBox(-0.4187F, -0.5644F, 0.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1149F, -0.1575F, 4.3155F, 0.3378F, 0.2155F, -0.0123F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(100, 74).addBox(-0.4408F, -0.2597F, 0.4409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.3825F, -0.731F, 4.4857F, 0.3836F, 0.0097F, -0.0691F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(93, 8).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6504F, -0.7938F, 4.079F, 0.2803F, -0.0706F, 1.0563F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(100, 71).addBox(-0.4187F, -0.64F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1149F, -0.1575F, 4.3155F, 0.1938F, 0.2155F, -0.0123F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(96, 68).addBox(-0.4408F, 0.8339F, -1.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3825F, -0.731F, 4.4857F, 2.5304F, 0.0097F, -0.0691F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(25, 103).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9361F, -5.9379F, 6.0121F, -2.2969F, 0.2611F, -1.842F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(94, 101).addBox(-1.0F, 0.0241F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.1641F, -6.0652F, 4.962F, 0.2918F, -0.7158F, -1.1103F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(92, 42).addBox(-2.0F, -0.9759F, -0.0147F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.9301F, -5.5085F, 5.2834F, 1.0592F, 0.5187F, -1.7217F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 92).addBox(-2.0F, -0.9759F, -1.0147F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.9301F, -6.0085F, 6.1495F, -0.0752F, 0.5187F, -1.7217F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(59, 100).addBox(-1.0F, 0.0241F, -1.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.1641F, -6.5652F, 5.8281F, 0.3554F, 0.3931F, -0.8012F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(105, 6).addBox(-0.125F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.8326F, -2.2928F, 3.9227F, 1.4337F, 0.5309F, 1.2811F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(74, 103).addBox(-0.425F, -0.55F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4417F, -2.3089F, 4.0885F, 1.7495F, 0.0795F, 1.4953F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(100, 55).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.0587F, -2.6727F, 3.99F, 1.7652F, -0.0198F, 2.0098F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(103, 22).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9361F, -6.2051F, 6.9757F, 3.0699F, 0.2611F, -1.842F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(71, 100).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -6.8245F, 6.8039F, -2.9652F, 0.2062F, -0.8544F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(89, 97).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1691F, -4.4389F, 10.9551F, -1.3049F, -0.6028F, -0.1532F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4215F, -4.8249F, 9.5679F, -1.6943F, -0.5558F, -0.3292F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(103, 28).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1691F, -5.3705F, 10.6161F, -0.9961F, -0.5558F, -0.3292F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(69, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3122F, -4.0838F, 6.2018F, 0.8858F, 0.1309F, -1.8115F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(68, 30).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4375F, -4.2473F, 7.1803F, -0.1614F, 0.1309F, -1.8115F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(51, 49).addBox(-3.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.943F, -6.2349F, 7.4148F, -1.5576F, 0.1309F, -1.8115F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(64, 102).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1701F, -6.8594F, 7.3027F, -1.4582F, 0.0682F, -0.8834F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(75, 23).addBox(-3.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9417F, -6.2335F, 8.277F, 0.0021F, -0.0085F, -1.8152F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(103, 19).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1701F, -6.8695F, 8.2825F, -0.0056F, -0.0067F, -0.8814F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(75, 26).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9412F, -6.0055F, 9.6346F, 0.8382F, -0.2163F, -1.8121F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(75, 20).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9412F, -6.1159F, 9.147F, 1.6236F, -0.2163F, -1.8121F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(52, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.1834F, -6.1451F, 9.6354F, 2.3857F, 0.2817F, 0.4709F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(47, 103).addBox(-0.35F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1114F, -5.8351F, 9.9545F, 2.2952F, 0.4953F, 0.2343F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(42, 103).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9412F, -6.0055F, 9.6346F, 1.8724F, 0.8093F, -0.4376F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(20, 103).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1641F, -6.7296F, 9.2859F, 1.4293F, -0.1724F, -0.8779F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(91, 13).addBox(-1.2F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.075F, -3.8323F, 4.6618F, 0.2734F, -0.1829F, 0.0901F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(54, 100).addBox(-0.275F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.3359F, -1.562F, 4.1381F, 1.326F, -0.0648F, -0.2538F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(36, 60).addBox(-1.605F, -1.0349F, -0.1313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4717F, -4.0076F, 4.2879F, 0.4043F, -0.1829F, 0.0901F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(70, 87).addBox(-1.3F, -1.4F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6691F, -3.1159F, 10.2149F, 0.7854F, 0.0008F, 0.0087F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(98, 29).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6691F, -3.1159F, 10.2149F, -0.0873F, 0.0008F, 0.0087F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(98, 21).addBox(-0.9F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6691F, -3.1159F, 10.2149F, -0.0794F, -0.0362F, -0.4262F));

		PartDefinition bone5 = leftFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.6032F, -3.3122F, 4.3416F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3359F, 1.6818F, -10.0283F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5725F, -0.2071F, -0.502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1149F, -0.1575F, 4.3155F, 0.2639F, -0.2058F, 0.0125F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.5733F, -0.1566F, -1.1456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1149F, -0.1575F, 4.3155F, 0.1066F, -0.2094F, 0.0126F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-1.5726F, -1.2066F, -0.7335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, -2.8836F, 6.8049F, -0.5236F, 1.3682F, -0.4165F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(61, 67).mirror().addBox(-0.275F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.3143F, -3.4987F, 11.5958F, 0.1595F, 0.0079F, -0.2201F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(0.8347F, -0.7431F, 0.1913F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.8011F, -3.1402F, 8.701F, 0.1005F, -0.4547F, 0.0538F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.485F, -0.7431F, -0.5865F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8011F, -3.1402F, 8.701F, 0.0914F, 0.1536F, 0.1121F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.7282F, -3.355F, 8.7321F, -0.0249F, 0.8651F, -0.0208F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-1.6555F, -1.2066F, 0.0242F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, -2.8836F, 6.8049F, -0.1558F, 0.8651F, -0.0208F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(104, 34).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.7018F, -2.9465F, 7.7327F, -0.7561F, 0.1287F, 0.0851F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(101, 45).mirror().addBox(-1.1216F, -1.2066F, 0.3486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, -2.8836F, 6.8049F, -0.1016F, 0.1287F, 0.0851F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(103, 13).mirror().addBox(-0.25F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.6032F, -3.3122F, 4.3416F, -0.0916F, 0.315F, -0.7264F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 103).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.3516F, -3.2611F, 4.4733F, -0.2217F, 0.5704F, -0.1561F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1811F, -3.1949F, 4.8562F, -0.2F, -0.3713F, 0.0384F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(103, 16).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.4646F, -2.539F, 4.6922F, 0.1789F, 0.9789F, 0.1856F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(15, 103).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.4646F, -2.539F, 4.6922F, 0.415F, 0.9274F, 0.4745F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.46F, -2.5887F, 5.5123F, 0.2626F, -0.3713F, 0.0384F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.959F, -3.3387F, 6.04F, 0.1753F, -0.3713F, 0.0384F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(26, 87).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.7071F, -3.0728F, 6.8981F, 0.0586F, -0.0271F, 0.0981F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(84, 18).mirror().addBox(-1.0218F, -0.9942F, -0.8715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, -2.8836F, 6.8049F, 0.1633F, -0.0271F, 0.0981F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(0.3327F, -1.2458F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(37, 101).mirror().addBox(0.3327F, -1.2458F, -0.6031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.328F, -0.0984F, 4.0391F, 1.5389F, 0.3509F, -0.0016F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(-0.575F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2102F, 0.4407F, 3.2159F, 1.4837F, -0.9851F, 0.2917F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(69, 103).mirror().addBox(0.6F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, -0.6825F, 3.2716F, 1.958F, -0.5916F, -1.267F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(57, 103).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4336F, -0.6825F, 3.2716F, 1.8912F, -0.0988F, -1.0761F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-0.6344F, -1.3482F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1149F, -0.1575F, 4.3155F, 1.6402F, -0.3278F, -0.0069F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.022F, -5.0231F, 3.7082F, 1.9151F, -1.0121F, -1.2684F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.3355F, -0.5615F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5687F, -5.3518F, 3.7175F, 0.818F, -1.3326F, -0.8149F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(93, 57).mirror().addBox(-0.4213F, -0.1763F, -1.0317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(17, 91).mirror().addBox(-0.4213F, -0.1763F, -0.8317F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.6687F, -5.7518F, 3.7175F, 0.9065F, -1.306F, -0.7491F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(104, 31).mirror().addBox(-0.9869F, -0.3208F, -1.0817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(99, 100).mirror().addBox(-0.9869F, -0.3208F, -0.8317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.6687F, -5.7518F, 3.7175F, 1.3636F, -0.6693F, -1.2666F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-0.6651F, -0.5617F, 0.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(100, 80).mirror().addBox(-0.6651F, -0.5617F, -0.3485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.5687F, -5.3518F, 3.7175F, 1.3636F, -0.6693F, -1.4237F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6321F, -4.5805F, 4.4741F, 1.2711F, -1.1378F, -2.773F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.4995F, -2.6717F, -1.3795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.436F, -2.5485F, 4.3208F, 1.6159F, -1.4074F, 0.0058F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(39, 97).mirror().addBox(-0.4995F, -0.814F, -0.8599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 103).mirror().addBox(-0.4995F, 0.186F, -0.4599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.436F, -2.5485F, 4.3208F, 0.7433F, -1.4074F, 0.0058F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.4995F, -0.4696F, -0.8107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.436F, -2.5485F, 4.3208F, -0.173F, -1.4074F, 0.0058F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(81, 102).mirror().addBox(-0.4995F, -1.2106F, -0.6262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.436F, -2.5485F, 4.3208F, -1.3075F, -1.4074F, 0.0058F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.4995F, -0.5231F, -1.2481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.436F, -2.5485F, 4.3208F, -2.1802F, -1.4074F, 0.0058F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(94, 97).mirror().addBox(-0.45F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3957F, -3.2729F, 4.0391F, -2.6681F, -1.4715F, 0.7004F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(50, 91).mirror().addBox(-0.425F, -0.925F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7876F, -3.5987F, 4.1583F, -0.7995F, -1.4113F, -0.2591F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(104, 102).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5617F, -3.6326F, 4.2989F, 1.0148F, -1.4298F, -1.9711F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(63, 85).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3339F, -4.5545F, 4.494F, 0.4912F, -1.4298F, -1.9711F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(82, 85).mirror().addBox(-0.7828F, -0.8047F, -0.2041F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2344F, -5.082F, 4.1995F, -0.8022F, -0.9298F, -2.0873F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(89, 101).mirror().addBox(-0.7828F, -0.8047F, -0.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4344F, -5.082F, 4.1995F, -1.208F, -1.093F, -1.6126F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-0.825F, -1.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2402F, -5.0917F, 4.214F, -1.4981F, -0.9577F, -2.3824F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(79, 96).mirror().addBox(-0.8F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8862F, -5.4428F, 3.8802F, -2.3699F, -0.6821F, -1.7772F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(101, 83).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.1055F, -5.2332F, 3.6657F, -2.4909F, -0.7964F, -1.5983F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2042F, -5.7871F, 4.2495F, 2.4868F, 1.0075F, -2.5333F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(101, 93).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3608F, -5.6569F, 3.6851F, 2.8087F, 0.0972F, -1.9911F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(101, 67).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.58F, -5.4472F, 3.4706F, 2.6579F, -0.7964F, -1.5983F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(74, 96).mirror().addBox(-0.8F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0627F, -5.6846F, 3.666F, 1.5064F, 0.1611F, -1.6738F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(100, 77).mirror().addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.2488F, -5.2621F, 3.6604F, 1.5496F, -0.7964F, -1.5983F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-1.0F, 0.025F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2557F, -5.0729F, 6.2832F, 0.3653F, 0.8587F, -1.3321F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(-1.214F, -0.6351F, 0.8561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6197F, -2.0333F, 3.7327F, 1.3501F, 0.276F, 0.9467F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-1.164F, -0.6351F, 0.3061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4947F, -2.1333F, 3.7327F, 1.3501F, 0.276F, 1.0165F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(-0.6846F, -0.9006F, 0.2783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4947F, -2.1333F, 3.7327F, 0.944F, -0.0251F, 0.3074F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(79, 105).mirror().addBox(-0.6846F, -0.687F, -0.1006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 73).mirror().addBox(-0.6846F, -0.687F, -0.7006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4947F, -2.1333F, 3.7327F, 1.2931F, -0.0251F, 0.3074F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.7425F, -0.3371F, -1.7585F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5428F, -1.978F, 3.3408F, 1.2222F, -0.1442F, 0.0573F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(0.075F, -1.075F, -1.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8354F, -5.3897F, 6.2034F, 0.5342F, -0.6198F, 0.6283F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(55, 93).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8194F, -1.0059F, 4.8627F, 0.3392F, 0.2132F, -1.0749F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(76, 100).mirror().addBox(-0.5813F, -0.5644F, 0.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1149F, -0.1575F, 4.3155F, 0.3378F, -0.2155F, 0.0123F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-0.5591F, -0.2597F, 0.4409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.3825F, -0.731F, 4.4857F, 0.3836F, -0.0097F, 0.0691F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6504F, -0.7938F, 4.079F, 0.2803F, 0.0706F, -1.0563F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(100, 71).mirror().addBox(-0.5813F, -0.64F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1149F, -0.1575F, 4.3155F, 0.1938F, -0.2155F, 0.0123F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(96, 68).mirror().addBox(-0.5591F, 0.8339F, -1.3749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3825F, -0.731F, 4.4857F, 2.5304F, -0.0097F, 0.0691F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9361F, -5.9379F, 6.0121F, -2.2969F, -0.2611F, 1.842F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(94, 101).mirror().addBox(0.0F, 0.0241F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.0652F, 4.962F, 0.2918F, 0.7158F, 1.1103F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(0.0F, -0.9759F, -0.0147F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.9301F, -5.5085F, 5.2834F, 1.0592F, -0.5187F, 1.7217F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(0.0F, -0.9759F, -1.0147F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.9301F, -6.0085F, 6.1495F, -0.0752F, -0.5187F, 1.7217F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(59, 100).mirror().addBox(0.0F, 0.0241F, -1.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.5652F, 5.8281F, 0.3554F, -0.3931F, 0.8012F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.875F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(0.8326F, -2.2928F, 3.9227F, 1.4337F, -0.5309F, -1.2811F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(74, 103).mirror().addBox(-0.575F, -0.55F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4417F, -2.3089F, 4.0885F, 1.7495F, -0.0795F, -1.4953F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.0587F, -2.6727F, 3.99F, 1.7652F, 0.0198F, -2.0098F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(103, 22).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9361F, -6.2051F, 6.9757F, 3.0699F, -0.2611F, 1.842F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(71, 100).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -6.8245F, 6.8039F, -2.9652F, -0.2062F, 0.8544F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(89, 97).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -4.4389F, 10.9551F, -1.3049F, 0.6028F, 0.1532F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(30, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4215F, -4.8249F, 9.5679F, -1.6943F, 0.5558F, 0.3292F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(103, 28).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1691F, -5.3705F, 10.6161F, -0.9961F, 0.5558F, 0.3292F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3122F, -4.0838F, 6.2018F, 0.8858F, -0.1309F, 1.8115F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4375F, -4.2473F, 7.1803F, -0.1614F, -0.1309F, 1.8115F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(0.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.943F, -6.2349F, 7.4148F, -1.5576F, -0.1309F, 1.8115F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -6.8594F, 7.3027F, -1.4582F, -0.0682F, 0.8834F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(0.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9417F, -6.2335F, 8.277F, 0.0021F, 0.0085F, 1.8152F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1701F, -6.8695F, 8.2825F, -0.0056F, 0.0067F, 0.8814F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9412F, -6.0055F, 9.6346F, 0.8382F, 0.2163F, 1.8121F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9412F, -6.1159F, 9.147F, 1.6236F, 0.2163F, 1.8121F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(52, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.1834F, -6.1451F, 9.6354F, 2.3857F, -0.2817F, -0.4709F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(47, 103).mirror().addBox(-0.65F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1114F, -5.8351F, 9.9545F, 2.2952F, -0.4953F, -0.2343F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(42, 103).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9412F, -6.0055F, 9.6346F, 1.8724F, -0.8093F, 0.4376F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(20, 103).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.1641F, -6.7296F, 9.2859F, 1.4293F, 0.1724F, 0.8779F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(91, 13).mirror().addBox(-0.8F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.075F, -3.8323F, 4.6618F, 0.2734F, 0.1829F, -0.0901F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(54, 100).mirror().addBox(-0.725F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.3359F, -1.562F, 4.1381F, 1.326F, 0.0648F, 0.2538F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-0.395F, -1.0349F, -0.1313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4717F, -4.0076F, 4.2879F, 0.4043F, 0.1829F, -0.0901F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-0.7F, -1.4F, -1.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6691F, -3.1159F, 10.2149F, 0.7854F, -0.0008F, -0.0087F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(98, 29).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6691F, -3.1159F, 10.2149F, -0.0873F, -0.0008F, -0.0087F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.1F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6691F, -3.1159F, 10.2149F, -0.0794F, 0.0362F, 0.4262F));

		PartDefinition bone6 = rightFace.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-1.6032F, -3.3122F, 4.3416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.4126F, -1.9602F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(22, 96).mirror().addBox(-0.9F, -3.6587F, 0.7332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, -0.8335F, -0.0972F, -0.0181F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(9, 67).mirror().addBox(-0.6321F, -1.1086F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9795F, 1.3584F, -3.2435F, -0.3454F, -0.122F, -0.0353F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.6321F, -2.6144F, -0.0258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9795F, 1.3584F, -3.2435F, -0.6945F, -0.122F, -0.0353F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(16, 67).mirror().addBox(-0.6321F, -1.7661F, -0.6317F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.9795F, 1.3584F, -3.2435F, -0.5723F, -0.122F, -0.0353F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-0.8937F, 1.2483F, 0.7159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, -1.9217F, -0.3292F, 0.0444F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-0.3F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3157F, 1.6003F, -5.1713F, -1.9685F, -0.2139F, 0.0839F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-0.6321F, -2.2218F, -0.4294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.9795F, 1.3584F, -3.2435F, -0.3541F, -0.122F, -0.0353F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(87, 34).mirror().addBox(-0.6321F, -2.545F, -1.502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.9795F, 1.3584F, -3.2435F, -0.9039F, -0.122F, -0.0353F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(99, 87).mirror().addBox(-0.6321F, 1.7602F, -1.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, 0.5273F, -0.122F, -0.0353F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-0.6321F, -0.2543F, -2.8475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, 1.4872F, -0.122F, -0.0353F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.6214F, -2.7922F, -0.6159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, 2.7517F, -0.1381F, -0.0286F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(87, 53).mirror().addBox(1.3291F, 1.0217F, 0.7159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8795F, 1.3584F, -3.2435F, -1.9684F, 0.5735F, -0.2974F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(104, 40).mirror().addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.973F, -7.1844F, -2.4178F, -0.8538F, 0.7062F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(104, 51).mirror().addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.1428F, 1.17F, -6.8363F, -2.2633F, -0.69F, 0.4858F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(86, 104).mirror().addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 1.3211F, -7.3814F, 3.0426F, 0.4407F, -0.2663F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(104, 86).mirror().addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.1481F, 1.5116F, -7.0402F, 3.0173F, 0.6847F, -0.2809F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 2.1211F, -7.3744F, 1.882F, 0.4201F, -0.2874F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(-0.55F, -1.0F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3388F, 2.4964F, -5.2697F, -1.9358F, -0.2108F, 0.0445F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(91, 104).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.1505F, 2.3281F, -7.0481F, 1.9462F, -0.7035F, -0.6675F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(98, 13).mirror().addBox(-0.2F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1562F, 2.0882F, -6.2763F, -2.0257F, -0.6527F, 0.2535F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(104, 96).mirror().addBox(-0.375F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8252F, 1.1363F, -6.3F, -2.0256F, -0.5324F, 0.2383F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(87, 34).addBox(-0.3679F, -2.545F, -1.502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.9795F, 1.3584F, -3.2435F, -0.9039F, 0.122F, 0.0353F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(73, 34).addBox(-0.3679F, -2.2218F, -0.4294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.9795F, 1.3584F, -3.2435F, -0.3541F, 0.122F, 0.0353F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(91, 104).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.1505F, 2.3281F, -7.0481F, 1.9462F, 0.7035F, 0.6675F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(104, 89).addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.45F, 2.1211F, -7.3744F, 1.882F, -0.4201F, 0.2874F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(94, 0).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4871F, 2.1211F, -7.3744F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(104, 86).addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.1481F, 1.5116F, -7.0402F, 3.0173F, -0.6847F, 0.2809F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(86, 104).addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.45F, 1.3211F, -7.3814F, 3.0426F, -0.4407F, 0.2663F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(77, 93).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.4871F, 1.3211F, -7.3814F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(104, 51).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.1428F, 1.17F, -6.8363F, -2.2633F, 0.69F, -0.4858F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(104, 40).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.45F, 0.973F, -7.1844F, -2.4178F, 0.8538F, -0.7062F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(62, 93).addBox(-1.0F, -0.95F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.4871F, 0.9484F, -7.2279F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(104, 96).addBox(-0.625F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8252F, 1.1363F, -6.3F, -2.0256F, 0.5324F, -0.2383F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(96, 25).addBox(-0.7F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3157F, 1.6003F, -5.1713F, -1.9685F, 0.2139F, -0.0839F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(87, 53).addBox(-2.3291F, 1.0217F, 0.7159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, -1.9684F, -0.5735F, 0.2974F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(98, 13).addBox(-0.8F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1562F, 2.0882F, -6.2763F, -2.0257F, 0.6527F, -0.2535F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(42, 76).addBox(-0.45F, -1.0F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3388F, 2.4964F, -5.2697F, -1.9358F, 0.2108F, -0.0445F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(84, 26).addBox(-0.1063F, 1.2483F, 0.7159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, -1.9217F, 0.3292F, -0.0444F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(16, 67).addBox(-0.3679F, -1.7661F, -0.6317F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.9795F, 1.3584F, -3.2435F, -0.5723F, 0.122F, 0.0353F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(21, 73).addBox(-0.3679F, -2.6144F, -0.0258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9795F, 1.3584F, -3.2435F, -0.6945F, 0.122F, 0.0353F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(75, 66).addBox(-0.3786F, -2.7922F, -0.6159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, 2.7517F, 0.1381F, 0.0286F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(35, 104).addBox(-0.3679F, -0.2543F, -2.8475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, 1.4872F, 0.122F, 0.0353F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(99, 87).addBox(-0.3679F, 1.7602F, -1.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, 0.5273F, 0.122F, 0.0353F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(9, 67).addBox(-0.3679F, -1.1086F, 0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.9795F, 1.3584F, -3.2435F, -0.3454F, 0.122F, 0.0353F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(91, 22).addBox(-1.0F, -0.35F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.6989F, -6.5831F, -0.4655F, 0.0F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(22, 96).addBox(-0.1F, -3.6587F, 0.7332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8795F, 1.3584F, -3.2435F, -0.8335F, 0.0972F, 0.0181F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5129F, 1.8093F, -8.2194F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0308F, -3.7781F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 46).addBox(-0.496F, -0.0236F, -0.0019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5781F, 0.6285F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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