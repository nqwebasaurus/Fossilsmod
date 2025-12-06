package fossils.fossils.client.blockentity.model.vancleavea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VancleaveaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart rightArm2;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart leftArm;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart rightArm;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;
	private final ModelPart bone3;

	public VancleaveaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.FrontFlipperR3 = this.hips.getChild("FrontFlipperR3");
		this.leftArm2 = this.FrontFlipperR3.getChild("leftArm2");
		this.FrontFlipperMiddleR3 = this.leftArm2.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperR5 = this.hips.getChild("FrontFlipperR5");
		this.rightArm2 = this.FrontFlipperR5.getChild("rightArm2");
		this.FrontFlipperMiddleR5 = this.rightArm2.getChild("FrontFlipperMiddleR5");
		this.bone2 = this.hips.getChild("bone2");
		this.bone5 = this.hips.getChild("bone5");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.body = this.hips.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.chest = this.body5.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.leftArm = this.FrontFlipperR2.getChild("leftArm");
		this.FrontFlipperMiddleR2 = this.leftArm.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperR4 = this.chest.getChild("FrontFlipperR4");
		this.rightArm = this.FrontFlipperR4.getChild("rightArm");
		this.FrontFlipperMiddleR4 = this.rightArm.getChild("FrontFlipperMiddleR4");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.9623F, 9.9865F, 0.1028F, -0.0305F, 0.1273F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-1.8F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 21).addBox(-0.2F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(69, 100).addBox(0.0F, -3.7904F, 3.891F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-0.5F, -1.0904F, 0.891F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 101).addBox(0.0F, -2.8904F, -0.109F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6748F, -0.8849F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 100).addBox(0.0F, -2.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6257F, 3.3799F, -0.3229F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5657F, 1.3527F, -0.2456F, -0.4452F, -1.1312F, 1.322F));

		PartDefinition cube_r4 = FrontFlipperR3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 83).addBox(-1.6F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0283F, -0.1811F, 0.1907F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = FrontFlipperR3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 69).addBox(-1.625F, -0.5F, -1.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.0283F, -0.1811F, 0.1907F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = FrontFlipperR3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 87).addBox(-1.125F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6653F, -0.1811F, 0.8823F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = FrontFlipperR3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 36).addBox(-0.925F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0283F, -0.1811F, 0.1907F, 0.0F, 0.3578F, 0.0F));

		PartDefinition cube_r8 = FrontFlipperR3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 85).addBox(-0.025F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.8182F, -0.1811F, -1.4237F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r9 = FrontFlipperR3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 72).addBox(-0.2F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8182F, -0.1811F, -1.4237F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r10 = FrontFlipperR3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 47).addBox(0.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(4.8182F, -0.1811F, -1.4237F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r11 = FrontFlipperR3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 65).addBox(-1.5F, -0.5F, 0.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.4593F, -0.1811F, -1.2566F, 0.0F, 0.3054F, 0.0F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8631F, -0.1811F, -1.2056F, 3.1416F, 0.6109F, 0.0F));

		PartDefinition cube_r12 = leftArm2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 108).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6579F, 0.0557F, -0.6598F, -0.2865F, 1.4309F, -0.2702F));

		PartDefinition cube_r13 = leftArm2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 53).addBox(-0.425F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0955F, 0.0651F, -0.6807F, -2.8407F, 1.4374F, -2.8296F));

		PartDefinition cube_r14 = leftArm2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(108, 56).addBox(-0.375F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(108, 50).addBox(-0.375F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0955F, 0.0651F, -0.6807F, -0.0783F, 1.0425F, -0.054F));

		PartDefinition cube_r15 = leftArm2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 57).addBox(-0.55F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0978F, 0.0415F, -1.2802F, -0.4109F, 1.4719F, -0.3954F));

		PartDefinition cube_r16 = leftArm2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 12).addBox(-0.575F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9186F, -0.0287F, -3.3444F, -0.0529F, 0.7289F, -0.0215F));

		PartDefinition cube_r17 = leftArm2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 24).addBox(-1.975F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3022F, 0.0F, -2.4037F, -0.0719F, 0.9902F, -0.0465F));

		PartDefinition cube_r18 = leftArm2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 18).addBox(-0.3219F, -0.5F, -0.3713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.6108F, 0.0F, -1.0936F, 0.0F, 1.0297F, 0.0F));

		PartDefinition cube_r19 = leftArm2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(86, 15).addBox(-1.6781F, -0.5F, -0.3713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.6108F, 0.0F, -1.0936F, 0.0F, 0.6545F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(63, 108).addBox(-0.3117F, -0.3972F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1626F, -0.0346F, -3.1141F, -0.0418F, 0.7409F, -0.0591F));

		PartDefinition cube_r20 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(108, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0117F, 0.1028F, -0.4294F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r21 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4908F, 0.1028F, -0.7181F, 3.1416F, 0.1309F, 0.0F));

		PartDefinition FrontFlipperR5 = hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5657F, 1.3527F, -0.2456F, -0.0607F, 1.0464F, -1.3333F));

		PartDefinition cube_r22 = FrontFlipperR5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 84).addBox(-0.4F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0283F, -0.1811F, 0.1907F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r23 = FrontFlipperR5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(70, 15).addBox(-1.375F, -0.5F, -1.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0283F, -0.1811F, 0.1907F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r24 = FrontFlipperR5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 99).addBox(0.125F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6653F, -0.1811F, 0.8823F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r25 = FrontFlipperR5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(83, 51).addBox(-1.075F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0283F, -0.1811F, 0.1907F, 0.0F, -0.3578F, 0.0F));

		PartDefinition cube_r26 = FrontFlipperR5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 39).addBox(-1.975F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-4.8182F, -0.1811F, -1.4237F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r27 = FrontFlipperR5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(85, 78).addBox(-1.8F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.8182F, -0.1811F, -1.4237F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r28 = FrontFlipperR5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(85, 75).addBox(-2.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-4.8182F, -0.1811F, -1.4237F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r29 = FrontFlipperR5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 52).addBox(-2.5F, -0.5F, 0.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.4593F, -0.1811F, -1.2566F, 0.0F, -0.3054F, 0.0F));

		PartDefinition rightArm2 = FrontFlipperR5.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8631F, -0.1811F, -1.2056F, 3.1416F, -0.6109F, 0.0F));

		PartDefinition cube_r30 = rightArm2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(108, 47).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6579F, 0.0557F, -0.6598F, -0.2865F, -1.4309F, 0.2702F));

		PartDefinition cube_r31 = rightArm2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(108, 62).addBox(-0.575F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0955F, 0.0651F, -0.6807F, -2.8407F, -1.4374F, 2.8296F));

		PartDefinition cube_r32 = rightArm2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(108, 59).addBox(-0.625F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(58, 108).addBox(-0.625F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0955F, 0.0651F, -0.6807F, -0.0783F, -1.0425F, 0.054F));

		PartDefinition cube_r33 = rightArm2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(61, 86).addBox(-1.45F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0978F, 0.0415F, -1.2802F, -0.4109F, -1.4719F, 0.3954F));

		PartDefinition cube_r34 = rightArm2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(23, 108).addBox(-0.425F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9186F, -0.0287F, -3.3444F, -0.0529F, -0.7289F, 0.0215F));

		PartDefinition cube_r35 = rightArm2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 71).addBox(-1.025F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3022F, 0.0F, -2.4037F, -0.0719F, -0.9902F, 0.0465F));

		PartDefinition cube_r36 = rightArm2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 54).addBox(-1.6781F, -0.5F, -0.3713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.6108F, 0.0F, -1.0936F, 0.0F, -1.0297F, 0.0F));

		PartDefinition cube_r37 = rightArm2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 21).addBox(-0.3219F, -0.5F, -0.3713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-1.6108F, 0.0F, -1.0936F, 0.0F, -0.6545F, 0.0F));

		PartDefinition FrontFlipperMiddleR5 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create().texOffs(68, 108).addBox(-0.6883F, -0.3972F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1626F, -0.0346F, -3.1141F, -0.0418F, -0.7409F, 0.0591F));

		PartDefinition cube_r38 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(5, 108).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0117F, 0.1028F, -0.4294F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r39 = FrontFlipperMiddleR5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4908F, 0.1028F, -0.7181F, 3.1416F, -0.1309F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(100, 66).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.151F, 1.724F, 0.1059F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(75, 31).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.151F, 1.1792F, 1.1751F, -2.6704F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(48, 106).addBox(-0.5F, -1.425F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 106).addBox(-0.5F, -1.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.151F, -0.1322F, 1.6654F, 2.7838F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(38, 106).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.151F, -0.5692F, 0.3204F, 2.042F, 0.0F, 0.0F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.151F, 0.2188F, -0.2953F, 0.9076F, 0.0F, 0.0F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(106, 96).addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.151F, 0.672F, -0.5066F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(101, 81).addBox(-1.2F, -1.0056F, -2.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, 1.9533F, 0.0806F, 0.394F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(71, 75).addBox(-1.2F, 0.2033F, -4.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 75).addBox(-1.2F, 1.0032F, -4.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(44, 59).addBox(-1.2F, -0.8885F, -2.2314F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, 1.517F, 0.0806F, 0.394F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(71, 90).addBox(-1.2F, -0.9279F, 3.3941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -0.9265F, 0.0806F, 0.394F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(66, 90).addBox(-1.2F, -3.3526F, 1.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -1.8864F, 0.0806F, 0.394F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(43, 98).addBox(-1.2F, -0.9147F, -2.6622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, 2.2151F, 0.0806F, 0.394F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(90, 50).addBox(-1.2F, 0.7528F, -0.5758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -0.8392F, 0.0806F, 0.394F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(73, 43).addBox(-1.2F, -0.3678F, 1.1814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -2.1482F, 0.0806F, 0.394F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(101, 0).addBox(-1.2F, 1.4807F, 2.1216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -1.4501F, 0.0806F, 0.394F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(81, 101).addBox(-1.2F, -2.9011F, 1.9921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -2.8463F, 0.0806F, 0.394F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(75, 35).addBox(-1.2F, 0.9531F, 2.0333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, -1.8428F, 0.0806F, 0.394F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(101, 105).addBox(-1.2F, -0.2182F, -0.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, 0.2953F, 0.0806F, 0.394F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(79, 14).addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.151F, 1.5926F, -0.5565F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Hips_r19 = bone5.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(100, 66).mirror().addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.151F, 1.724F, 0.1059F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = bone5.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(75, 31).mirror().addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.151F, 1.1792F, 1.1751F, -2.6704F, 0.0F, 0.0F));

		PartDefinition Hips_r21 = bone5.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(48, 106).mirror().addBox(-0.5F, -1.425F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 106).mirror().addBox(-0.5F, -1.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -0.1322F, 1.6654F, 2.7838F, 0.0F, 0.0F));

		PartDefinition Hips_r22 = bone5.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(38, 106).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -0.5692F, 0.3204F, 2.042F, 0.0F, 0.0F));

		PartDefinition Hips_r23 = bone5.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.151F, 0.2188F, -0.2953F, 0.9076F, 0.0F, 0.0F));

		PartDefinition Hips_r24 = bone5.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(106, 96).mirror().addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.151F, 0.672F, -0.5066F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Hips_r25 = bone5.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(101, 81).mirror().addBox(0.2F, -1.0056F, -2.8544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, 1.9533F, -0.0806F, -0.394F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(0.2F, 0.2033F, -4.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 75).mirror().addBox(0.2F, 1.0032F, -4.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(44, 59).mirror().addBox(0.2F, -0.8885F, -2.2314F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, 1.517F, -0.0806F, -0.394F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(0.2F, -0.9279F, 3.3941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -0.9265F, -0.0806F, -0.394F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(0.2F, -3.3526F, 1.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -1.8864F, -0.0806F, -0.394F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(43, 98).mirror().addBox(0.2F, -0.9147F, -2.6622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, 2.2151F, -0.0806F, -0.394F));

		PartDefinition Hips_r30 = bone5.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(90, 50).mirror().addBox(0.2F, 0.7528F, -0.5758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -0.8392F, -0.0806F, -0.394F));

		PartDefinition Hips_r31 = bone5.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(0.2F, -0.3678F, 1.1814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -2.1482F, -0.0806F, -0.394F));

		PartDefinition Hips_r32 = bone5.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(0.2F, 1.4807F, 2.1216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -1.4501F, -0.0806F, -0.394F));

		PartDefinition Hips_r33 = bone5.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(81, 101).mirror().addBox(0.2F, -2.9011F, 1.9921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -2.8463F, -0.0806F, -0.394F));

		PartDefinition Hips_r34 = bone5.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(75, 35).mirror().addBox(0.2F, 0.9531F, 2.0333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, -1.8428F, -0.0806F, -0.394F));

		PartDefinition Hips_r35 = bone5.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(101, 105).mirror().addBox(0.2F, -0.2182F, -0.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, 1.6025F, -1.4586F, 0.2953F, -0.0806F, -0.394F));

		PartDefinition Hips_r36 = bone5.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(79, 14).mirror().addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.151F, 1.5926F, -0.5565F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.12F, -0.13F, -0.0156F));

		PartDefinition cube_r40 = tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 45).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4366F, 0.0316F, -0.0148F));

		PartDefinition cube_r41 = tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 45).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4366F, -0.0316F, 0.0148F));

		PartDefinition cube_r42 = tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(50, 93).addBox(0.0F, -3.1434F, -0.0361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0615F, 3.8605F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 84).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 84).addBox(0.0F, -1.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9202F, 3.9263F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(86, 101).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(91, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.7752F, 7.7844F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(92, 34).addBox(-0.5F, -0.6744F, -0.2289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.7752F, 7.7844F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 98).addBox(0.0F, -2.8434F, -0.2361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0986F, 2.4594F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(98, 10).addBox(0.0F, -2.7434F, -0.5361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5675F, 0.8858F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(44, 7).addBox(-0.5F, -0.9432F, -0.4009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1641F, 5.6001F, -0.1711F, -0.0715F, 0.1006F));

		PartDefinition cube_r49 = tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 108).addBox(0.0F, -2.4F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1976F, 3.8945F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(30, 100).addBox(0.0F, -2.553F, 0.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(58, 80).addBox(0.0F, 0.0F, 0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7315F, 3.8451F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 26).addBox(0.0F, 0.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1173F, 1.8772F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -0.6F, -0.9F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(98, 18).addBox(0.0F, -2.6169F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 46).mirror().addBox(-1.4F, 0.2F, -4.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 46).addBox(-0.6F, 0.2F, -4.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 76).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.2166F, 5.686F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(12, 88).addBox(-0.5F, -0.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.068F, 6.337F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 67).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -5.5516F, 7.6299F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 84).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -6.2516F, 6.1799F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 88).addBox(-0.5F, -0.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.768F, 4.887F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r62 = tail2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(7, 76).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.9166F, 4.236F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 84).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -6.6516F, 4.4799F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(17, 31).addBox(-0.5F, -2.8F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.168F, 3.187F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.5444F, 2.8536F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.0311F, -0.1732F, 0.0488F));

		PartDefinition cube_r67 = tail3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(97, 108).addBox(-0.5F, -1.8257F, -0.2177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.043F, 3.8453F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 88).addBox(0.0F, -0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4721F, 5.1299F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(17, 88).addBox(0.0F, -1.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4647F, 3.12F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(24, 84).addBox(0.0F, -0.9F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9642F, 0.9662F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(94, 108).addBox(-0.5F, -1.9257F, -0.1177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3589F, 1.9659F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(91, 108).addBox(-0.5F, -2.0257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(106, 105).addBox(-0.5F, -5.0108F, 2.0267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(92, 71).addBox(-0.5F, -4.5108F, 2.0267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(101, 90).addBox(-0.5F, -4.5929F, 0.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(5, 91).addBox(-0.5F, -3.9928F, 0.4964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(76, 81).addBox(-0.5F, -4.269F, -1.121F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.8137F, 1.5838F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(37, 80).addBox(-0.5F, -4.1379F, -0.3341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(62, 79).addBox(-0.5F, -2.6896F, -1.0499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(79, 6).addBox(-0.5F, -1.0341F, -1.6818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.8137F, 1.5838F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(93, 4).addBox(-0.5F, -2.3624F, 3.2155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(76, 92).addBox(-0.5F, -2.4836F, 1.6045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.8137F, 1.5838F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 38).addBox(-0.5F, -2.4753F, -0.0706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.8283F, 1.4849F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1285F, -0.0533F, -0.2621F, 0.0506F, -0.0136F));

		PartDefinition cube_r78 = tail3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 52).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1285F, -0.0533F, -0.2621F, -0.0506F, 0.0136F));

		PartDefinition cube_r79 = tail3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.0867F, -0.1704F, 0.0579F));

		PartDefinition cube_r80 = tail4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(106, 108).addBox(0.0F, -1.193F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2376F, 3.9381F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(103, 108).addBox(0.0F, -1.293F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3821F, 1.9408F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(100, 108).addBox(0.0F, -1.568F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5199F, -0.0832F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 87).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0662F, 3.6204F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 86).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7332F, 1.4092F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 80).addBox(-0.5F, -0.0327F, -0.2003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(44, 80).addBox(-0.5F, 1.4662F, -0.7945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.5032F, 4.422F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(101, 93).addBox(-0.5F, -0.3731F, -0.5626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(93, 16).addBox(-0.5F, -0.7078F, -2.0487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.5032F, 4.422F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(85, 26).addBox(-0.5F, -2.3323F, -0.7126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.5032F, 4.422F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -1.768F, -2.1772F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.5032F, 4.422F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 43).addBox(-0.5F, -5.2733F, 0.8461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.6352F, -4.1377F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 12).addBox(-0.5F, -1.6007F, 4.7478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -4.6352F, -4.1377F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(92, 75).addBox(-0.5F, -4.6083F, 3.7347F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -4.6352F, -4.1377F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.343F, 4.8318F, -0.0616F, -0.0871F, 0.0054F));

		PartDefinition cube_r93 = tail5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(110, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 3.0188F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(39, 103).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3325F, 1.0188F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(89, 33).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3348F, 3.266F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(54, 91).addBox(-0.5F, -3.6349F, 0.8324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.278F, 2.0826F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 91).addBox(-0.5F, -1.9165F, 1.4726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.278F, 2.0826F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(86, 107).addBox(-0.5F, -2.8013F, -0.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.278F, 2.0826F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(81, 107).addBox(-0.5F, -1.0344F, -1.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.478F, 2.1826F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 91).addBox(-0.5F, -1.5751F, -0.2323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.478F, 2.1826F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(45, 91).addBox(-0.5F, -2.7966F, -0.691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.478F, 2.1826F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 91).addBox(-0.5F, -2.4817F, 0.6653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.8139F, -0.6448F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 91).addBox(-0.5F, -1.4419F, 1.1414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.8139F, -0.6448F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(14, 81).addBox(-0.5F, -1.8187F, -0.0148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.8139F, -0.6448F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 81).addBox(0.0F, -0.6F, -0.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4269F, 1.2656F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0618F, 0.1742F, 0.0107F));

		PartDefinition cube_r106 = tail6.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(100, 61).addBox(0.0F, -0.3F, -0.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.029F, 4.7972F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail6.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(100, 56).addBox(0.0F, 0.8F, 1.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 48).addBox(0.0F, 0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2778F, 0.3356F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(81, 110).addBox(0.0F, -2.2F, 3.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 65).addBox(0.0F, -1.5F, 1.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 23).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 0.0188F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(92, 46).addBox(-0.5F, -6.4165F, 3.9118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2926F, -2.853F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail6.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 96).addBox(-0.5F, -0.8653F, 6.1726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.2926F, -2.853F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail6.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(91, 81).addBox(-0.5F, -2.4953F, 4.7366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(81, 91).addBox(-0.5F, -2.2348F, 3.2594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.2926F, -2.853F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail6.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(54, 87).addBox(-0.5F, -6.0612F, 2.0638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 108).addBox(-0.5F, -3.9037F, 1.1097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2926F, -2.853F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail6.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(93, 20).addBox(-0.5F, -4.5398F, 2.0471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.2926F, -2.853F, -0.6632F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, -0.0061F, 0.2617F, -0.0448F));

		PartDefinition cube_r114 = tail7.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(87, 110).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 3.0188F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail7.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(13, 109).addBox(0.0F, 3.3F, 3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 100).addBox(0.0F, 1.1F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, -0.2034F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail7.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -8.1645F, 8.3321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(91, 91).addBox(-0.5F, -8.9645F, 9.5321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.2815F, -7.8536F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail7.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(102, 26).addBox(-0.5F, -8.0578F, 6.2475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(8, 102).addBox(-0.5F, -7.4577F, 6.2475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(86, 91).addBox(-0.5F, -7.3665F, 5.0773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2815F, -7.8536F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail7.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 102).addBox(-0.5F, -0.9006F, 9.2744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 102).addBox(-0.5F, -0.8308F, 7.6759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.2815F, -7.8536F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(84, 110).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 1.0188F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(39, 52).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0194F, 4.9264F, -0.1213F, 0.1636F, -0.1064F));

		PartDefinition cube_r120 = tail8.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 4.5188F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail8.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(109, 110).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 2.5188F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(7, 87).addBox(-0.5F, -9.8479F, 10.653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(73, 86).addBox(-0.5F, -10.8479F, 11.953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.2622F, -12.78F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(68, 86).addBox(-0.5F, -13.7585F, 11.2139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.2622F, -12.78F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(3, 111).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 0.5188F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail8.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(111, 0).addBox(0.0F, 6.1F, 7.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 60).addBox(0.0F, 4.1F, 5.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, -5.1298F, 0.6632F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(59, 7).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0097F, 4.8979F, -0.2278F, 0.2463F, -0.0997F));

		PartDefinition cube_r126 = tail9.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(30, 94).addBox(-0.5F, -9.287F, 19.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 94).addBox(-0.5F, -8.787F, 19.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(93, 87).addBox(-0.5F, -8.587F, 18.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 72).addBox(-0.5F, -7.9572F, 17.0918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.2525F, -17.6779F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail9.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(102, 29).addBox(-0.5F, -13.8642F, 13.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -2.2525F, -17.6779F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail9.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(95, 50).addBox(-0.5F, -12.9944F, 12.6581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -2.2525F, -17.5779F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail9.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 65).addBox(-0.5F, -7.4493F, 15.8951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.2525F, -17.5779F, -0.4538F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -0.28F, -0.0033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2525F, 4.0221F, -0.1806F, 0.2577F, -0.0465F));

		PartDefinition cube_r130 = tail10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -2.244F, 2.161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 95).addBox(-0.5F, -2.144F, 1.261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 95).addBox(-0.5F, -1.344F, 0.361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(69, 94).addBox(-0.5F, -1.844F, 0.361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4477F, 0.0305F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(64, 94).addBox(-0.5F, -0.9779F, -0.3621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(94, 42).addBox(-0.5F, -1.4779F, -0.3621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4477F, 0.0305F, -0.3665F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2823F, -2.1294F, -0.2132F, 0.1689F, -0.0441F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(33, 101).addBox(0.0F, -2.75F, -0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0032F, -6.8614F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(20, 101).addBox(0.0F, -4.0F, 10.9974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 18).addBox(0.0F, -4.0F, 12.9974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 9).addBox(0.0F, -4.1F, 14.9974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 29).addBox(-0.5F, -1.3F, 8.9974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.197F, -15.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(52, 109).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -0.4716F, -0.031F, 0.0515F, -0.7918F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(47, 109).mirror().addBox(-3.5846F, -1.4487F, -0.4422F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -0.4716F, -0.0804F, 0.0528F, -1.5332F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -0.4716F, -0.054F, 0.0795F, -1.1405F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(42, 109).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -2.4716F, -0.045F, 0.0411F, -0.6354F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-4.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -2.4716F, -0.0837F, 0.0357F, -1.3763F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(86, 89).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -2.4716F, -0.0637F, 0.065F, -0.9842F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(109, 41).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -4.4716F, -0.0899F, 0.014F, -0.5669F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-5.5846F, -1.4487F, -0.4422F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -4.4716F, -0.0986F, -0.0146F, -1.3067F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(59, 89).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -4.4716F, -0.0967F, 0.0242F, -0.9159F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(41, 89).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -6.4716F, -0.0875F, 0.0392F, -0.8807F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-6.5846F, -1.4487F, -0.4422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -6.4716F, -0.0958F, 0.0028F, -1.2718F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(109, 21).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5613F, -6.4716F, -0.0762F, 0.025F, -0.5318F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(90, 28).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -0.4716F, -0.054F, -0.0795F, 1.1405F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(47, 109).addBox(2.5846F, -1.4487F, -0.4422F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -0.4716F, -0.0804F, -0.0528F, 1.5332F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(52, 109).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -0.4716F, -0.031F, -0.0515F, 0.7918F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(86, 89).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -2.4716F, -0.0637F, -0.065F, 0.9842F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(90, 26).addBox(2.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -2.4716F, -0.0837F, -0.0357F, 1.3763F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(42, 109).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -2.4716F, -0.045F, -0.0411F, 0.6354F));

		PartDefinition Bodyfront_r19 = body.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(59, 89).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -4.4716F, -0.0967F, -0.0242F, 0.9159F));

		PartDefinition Bodyfront_r20 = body.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(72, 12).addBox(2.5846F, -1.4487F, -0.4422F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -4.4716F, -0.0986F, 0.0146F, 1.3067F));

		PartDefinition Bodyfront_r21 = body.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(109, 41).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -4.4716F, -0.0899F, -0.014F, 0.5669F));

		PartDefinition Bodyfront_r22 = body.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(109, 21).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -6.4716F, -0.0762F, -0.025F, 0.5318F));

		PartDefinition Bodyfront_r23 = body.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(65, 55).addBox(2.5846F, -1.4487F, -0.4422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -6.4716F, -0.0958F, -0.0028F, 1.2718F));

		PartDefinition Bodyfront_r24 = body.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(41, 89).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5613F, -6.4716F, -0.0875F, -0.0392F, 0.8807F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.7839F, 0.1595F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4785F, -6.1116F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4524F, -6.868F, -0.1431F, 0.1307F, -0.0073F));

		PartDefinition Bodyfront_r25 = body3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-7.5846F, -1.4487F, -0.4422F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5036F, -0.0648F, 0.1029F, -1.2702F));

		PartDefinition Bodyfront_r26 = body3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5036F, -0.0204F, 0.1198F, -0.8754F));

		PartDefinition Bodyfront_r27 = body3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(109, 9).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5036F, 0.0143F, 0.0779F, -0.5271F));

		PartDefinition Bodyfront_r28 = body3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(108, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4036F, 0.0315F, 0.083F, -0.5086F));

		PartDefinition Bodyfront_r29 = body3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(88, 10).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4036F, -0.0059F, 0.1304F, -0.8565F));

		PartDefinition Bodyfront_r30 = body3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(60, 46).mirror().addBox(-7.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4036F, -0.0556F, 0.1182F, -1.2521F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-7.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4036F, -0.0435F, 0.1417F, -1.2158F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4036F, 0.0144F, 0.1475F, -0.8189F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4036F, 0.0564F, 0.0922F, -0.4717F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(59, 13).addBox(2.5846F, -1.4487F, -0.4422F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5036F, -0.0648F, -0.1029F, 1.2702F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(88, 67).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5036F, -0.0204F, -0.1198F, 0.8754F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(109, 9).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5036F, 0.0143F, -0.0779F, 0.5271F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(108, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4036F, 0.0315F, -0.083F, 0.5086F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(88, 10).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4036F, -0.0059F, -0.1304F, 0.8565F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(60, 46).addBox(2.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4036F, -0.0556F, -0.1182F, 1.2521F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(49, 44).addBox(2.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4036F, -0.0435F, -0.1417F, 1.2158F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(87, 44).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4036F, 0.0144F, -0.1475F, 0.8189F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(108, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4036F, 0.0564F, -0.0922F, 0.4717F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(46, 101).addBox(0.0F, -2.8715F, 3.9779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 101).addBox(0.0F, -2.9215F, 5.9779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 38).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(36, 101).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4896F, -2.0219F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -2.3992F, -5.5774F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.5038F, 0.8139F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9764F, -0.0548F, 0.1744F, 0.0056F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(109, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -1.3272F, 0.0423F, 0.0813F, -0.4558F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(91, 85).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -1.3272F, 0.0048F, 0.1325F, -0.8032F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-7.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -1.3272F, -0.0465F, 0.1242F, -1.1991F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(62, 37).mirror().addBox(-7.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, -0.0481F, 0.106F, -1.1648F));

		PartDefinition Bodyfront_r47 = body4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, -0.0037F, 0.1163F, -0.7697F));

		PartDefinition Bodyfront_r48 = body4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(109, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, 0.0287F, 0.0689F, -0.4224F));

		PartDefinition Bodyfront_r49 = body4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(109, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -1.3272F, 0.0423F, -0.0813F, 0.4558F));

		PartDefinition Bodyfront_r50 = body4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(91, 85).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -1.3272F, 0.0048F, -0.1325F, 0.8032F));

		PartDefinition Bodyfront_r51 = body4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(61, 4).addBox(2.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -1.3272F, -0.0465F, -0.1242F, 1.1991F));

		PartDefinition Bodyfront_r52 = body4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(62, 37).addBox(2.586F, -1.4386F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, -0.0481F, -0.106F, 1.1648F));

		PartDefinition Bodyfront_r53 = body4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(93, 8).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, -0.0037F, -0.1163F, 0.7697F));

		PartDefinition Bodyfront_r54 = body4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(109, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, 0.0287F, -0.0689F, 0.4224F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 101).addBox(0.0F, -2.7216F, 4.9779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 101).addBox(0.0F, -2.7715F, 6.9779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 52).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(23, 7).addBox(-2.5F, -2.8287F, -4.9747F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.5063F, 0.9196F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.425F, -4.85F, -0.0392F, 0.2616F, -0.0101F));

		PartDefinition Bodyfront_r55 = body5.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(108, 86).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.0895F, 0.1042F, -0.4514F));

		PartDefinition Bodyfront_r56 = body5.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.0417F, 0.1701F, -0.7976F));

		PartDefinition Bodyfront_r57 = body5.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(44, 27).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, -0.0272F, 0.1729F, -1.1962F));

		PartDefinition Bodyfront_r58 = body5.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, -0.0059F, 0.202F, -1.1583F));

		PartDefinition Bodyfront_r59 = body5.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, 0.0728F, 0.1887F, -0.7581F));

		PartDefinition Bodyfront_r60 = body5.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(108, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, 0.1248F, 0.1114F, -0.4137F));

		PartDefinition Bodyfront_r61 = body5.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(108, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.0895F, -0.1042F, 0.4514F));

		PartDefinition Bodyfront_r62 = body5.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(86, 87).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.0417F, -0.1701F, 0.7976F));

		PartDefinition Bodyfront_r63 = body5.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(44, 27).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, -0.0272F, -0.1729F, 1.1962F));

		PartDefinition Bodyfront_r64 = body5.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(62, 44).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, -0.0059F, -0.202F, 1.1583F));

		PartDefinition Bodyfront_r65 = body5.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(88, 69).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, 0.0728F, -0.1887F, 0.7581F));

		PartDefinition Bodyfront_r66 = body5.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(108, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, 0.1248F, -0.1114F, 0.4137F));

		PartDefinition cube_r140 = body5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 101).addBox(0.0F, -2.5716F, -1.0221F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0414F, -1.8723F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(55, 101).addBox(0.0F, -2.6716F, -1.0221F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1155F, 0.1215F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(17, 38).addBox(-2.0F, -2.849F, -4.1486F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.0412F, 1.1697F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(24, 59).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body5.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3346F, -3.9803F, 0.0319F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = chest.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(109, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.1094F, 0.1027F, -0.3979F));

		PartDefinition Bodyfront_r68 = chest.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.0612F, 0.1753F, -0.7427F));

		PartDefinition Bodyfront_r69 = chest.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0113F, 0.1852F, -1.1419F));

		PartDefinition Bodyfront_r70 = chest.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.0035F, 0.2549F, -1.1892F));

		PartDefinition Bodyfront_r71 = chest.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.1026F, 0.2338F, -0.7849F));

		PartDefinition Bodyfront_r72 = chest.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(76, 109).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.1678F, 0.144F, -0.4412F));

		PartDefinition Bodyfront_r73 = chest.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(109, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.1094F, -0.1027F, 0.3979F));

		PartDefinition Bodyfront_r74 = chest.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(92, 79).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.0612F, -0.1753F, 0.7427F));

		PartDefinition Bodyfront_r75 = chest.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(79, 10).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0113F, -0.1852F, 1.1419F));

		PartDefinition Bodyfront_r76 = chest.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(74, 4).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.0035F, -0.2549F, 1.1892F));

		PartDefinition Bodyfront_r77 = chest.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(90, 64).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.1026F, -0.2338F, 0.7849F));

		PartDefinition Bodyfront_r78 = chest.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(76, 109).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.1678F, -0.144F, 0.4412F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(16, 109).addBox(0.0F, -2.3715F, -0.0221F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1199F, -2.8692F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(78, 101).addBox(0.0F, -2.1715F, -0.0221F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3361F, -0.8989F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0653F, 5.0721F, -1.4495F, 2.8217F, -0.6972F, -1.6355F));

		PartDefinition cube_r147 = FrontFlipperR2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(30, 78).addBox(-2.1F, -0.5F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 33).addBox(-1.8F, -0.5F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.4231F, 0.027F, -0.9278F, -0.0184F, 0.5038F, 0.0066F));

		PartDefinition cube_r148 = FrontFlipperR2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(28, 82).addBox(-1.8F, -0.5F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.4231F, 0.027F, -0.9278F, -0.0311F, 1.0273F, -0.0112F));

		PartDefinition cube_r149 = FrontFlipperR2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(98, 84).addBox(0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 98).addBox(-0.2F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7593F, 0.0189F, -1.7566F, -0.0184F, 0.5038F, 0.0066F));

		PartDefinition cube_r150 = FrontFlipperR2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(9, 69).addBox(-1.5F, -0.5F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.7593F, 0.0189F, -1.7566F, -0.0223F, 0.7655F, 0.0F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3981F, 0.0189F, -2.4096F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r151 = leftArm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(70, 18).addBox(-0.7F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2467F, 0.0F, -1.3099F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r152 = leftArm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(81, 81).addBox(-1.8F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5091F, 0.0F, 0.0302F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r153 = leftArm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(86, 5).addBox(-1.6F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4215F, 0.0F, -1.1894F, 0.0F, 0.5236F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = leftArm.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(0, 25).addBox(0.3884F, 0.1028F, -2.3294F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(107, 26).addBox(-0.5116F, -0.3972F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(102, 32).addBox(-0.5116F, -0.3972F, -0.0294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0757F, -0.0334F, -1.7771F, 0.2114F, 0.4067F, 0.3618F));

		PartDefinition FrontFlipperR4 = chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0653F, 5.0721F, -1.4495F, 2.0217F, 0.782F, 0.6839F));

		PartDefinition cube_r154 = FrontFlipperR4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 47).addBox(1.1F, -0.5F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 64).addBox(-0.2F, -0.5F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.4231F, 0.027F, -0.9278F, -0.0184F, -0.5038F, -0.0066F));

		PartDefinition cube_r155 = FrontFlipperR4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 83).addBox(-0.2F, -0.5F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.4231F, 0.027F, -0.9278F, -0.0311F, -1.0273F, 0.0112F));

		PartDefinition cube_r156 = FrontFlipperR4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(73, 99).addBox(-1.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 41).addBox(-0.8F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7593F, 0.0189F, -1.7566F, -0.0184F, -0.5038F, -0.0066F));

		PartDefinition cube_r157 = FrontFlipperR4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(18, 70).addBox(-1.5F, -0.5F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-1.7593F, 0.0189F, -1.7566F, -0.0223F, -0.7655F, 0.0F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3981F, 0.0189F, -2.4096F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r158 = rightArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(70, 21).addBox(-2.3F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2467F, 0.0F, -1.3099F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r159 = rightArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 82).addBox(-0.2F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.5091F, 0.0F, 0.0302F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r160 = rightArm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 12).addBox(-0.4F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4215F, 0.0F, -1.1894F, 0.0F, -0.5236F, 0.0F));

		PartDefinition FrontFlipperMiddleR4 = rightArm.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create().texOffs(25, 15).addBox(-6.3883F, 0.1028F, -2.3294F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(107, 35).addBox(-0.4884F, -0.3972F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 103).addBox(-0.4884F, -0.3972F, -0.0294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0757F, -0.0334F, -1.7771F, 0.051F, -0.453F, 0.0192F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7367F, 4.9202F, -1.2658F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Bodyfront_r79 = bone.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(99, 99).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.003F, -0.0412F, 1.9897F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r80 = bone.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(34, 74).addBox(-0.5F, -0.775F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1947F, -0.1182F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r81 = bone.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(72, 57).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -3.1656F, 0.2428F, 1.405F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r82 = bone.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(66, 105).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.9715F, -0.3321F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r83 = bone.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(79, 98).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -3.7379F, -0.9919F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r84 = bone.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 100).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3215F, -1.5546F, -2.5045F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r85 = bone.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(100, 6).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -2.6795F, -1.8338F, 2.7314F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r86 = bone.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(75, 27).addBox(-0.5F, -0.25F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -2.0551F, -0.8041F, 2.5133F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = bone.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(74, 61).addBox(-0.5F, -0.15F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -1.3692F, -0.6646F, 1.7715F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = bone.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.7894F, 1.0801F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r89 = bone.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(99, 78).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, -0.2817F, 0.5983F, 0.8116F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r90 = bone.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(100, 23).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3875F, -0.2862F, 2.9932F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = bone.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(66, 32).addBox(-0.9F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0F, 0.6931F, -0.4982F, 2.8891F, 0.9813F, -0.5639F));

		PartDefinition Bodyfront_r92 = bone.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(0, 55).addBox(-2.3F, -0.5F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.0F, 0.6931F, -0.4982F, 2.9854F, 0.4676F, -0.4235F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7367F, 4.9202F, -1.2658F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Bodyfront_r93 = bone4.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(99, 99).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.003F, -0.0412F, 1.9897F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r94 = bone4.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-0.5F, -0.775F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1947F, -0.1182F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r95 = bone4.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-0.5F, -1.05F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1656F, 0.2428F, 1.405F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r96 = bone4.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(66, 105).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9715F, -0.3321F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r97 = bone4.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7379F, -0.9919F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r98 = bone4.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 100).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.3215F, -1.5546F, -2.5045F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r99 = bone4.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6795F, -1.8338F, 2.7314F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r100 = bone4.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(75, 27).mirror().addBox(-0.5F, -0.25F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0551F, -0.8041F, 2.5133F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r101 = bone4.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.5F, -0.15F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3692F, -0.6646F, 1.7715F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r102 = bone4.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7894F, 1.0801F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r103 = bone4.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(99, 78).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2817F, 0.5983F, 0.8116F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r104 = bone4.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3875F, -0.2862F, 2.9932F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r105 = bone4.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(66, 32).mirror().addBox(-1.1F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6931F, -0.4982F, 2.8891F, -0.9813F, 0.5639F));

		PartDefinition Bodyfront_r106 = bone4.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.7F, -0.5F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6931F, -0.4982F, 2.9854F, -0.4676F, 0.4235F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3832F, -3.7571F, -0.1318F, 0.2616F, -0.0115F));

		PartDefinition Bodyfront_r107 = neck.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(87, 42).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.3177F, 0.5443F, -1.101F));

		PartDefinition Bodyfront_r108 = neck.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.4689F, 0.3704F, -0.7626F));

		PartDefinition Bodyfront_r109 = neck.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(93, 58).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0283F, 0.4648F, -1.4057F));

		PartDefinition Bodyfront_r110 = neck.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(93, 24).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.2148F, 0.4164F, -0.9742F));

		PartDefinition Bodyfront_r111 = neck.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(109, 108).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.333F, 0.2803F, -0.6316F));

		PartDefinition Bodyfront_r112 = neck.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(87, 42).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.3177F, -0.5443F, 1.101F));

		PartDefinition Bodyfront_r113 = neck.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(81, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.4689F, -0.3704F, 0.7626F));

		PartDefinition Bodyfront_r114 = neck.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(93, 58).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0283F, -0.4648F, 1.4057F));

		PartDefinition Bodyfront_r115 = neck.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(93, 24).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.2148F, -0.4164F, 0.9742F));

		PartDefinition Bodyfront_r116 = neck.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(109, 108).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.333F, -0.2803F, 0.6316F));

		PartDefinition cube_r161 = neck.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(19, 109).addBox(0.0F, -1.825F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7904F, -2.4808F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r162 = neck.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(109, 17).addBox(-0.5F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6597F, -0.9865F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r163 = neck.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(13, 58).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.387F, -3.8692F, -0.1392F, 0.4346F, -0.0403F));

		PartDefinition Bodyfront_r117 = neck2.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.3069F, 0.5108F, -1.1204F));

		PartDefinition Bodyfront_r118 = neck2.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(-2.1F, 0.0F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.2571F, 0.5145F, -1.0996F));

		PartDefinition Bodyfront_r119 = neck2.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(86, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.3069F, -0.5108F, 1.1204F));

		PartDefinition Bodyfront_r120 = neck2.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(93, 60).addBox(0.1F, 0.0F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.2571F, -0.5145F, 1.0996F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 109).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7904F, -2.4807F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 109).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6161F, -0.4884F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(55, 27).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(10, 108).addBox(0.0F, -2.0904F, -2.9808F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3445F, -3.8761F, -0.2287F, 0.305F, -0.0163F));

		PartDefinition Bodyfront_r121 = neck3.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.3541F, 0.5677F, -0.939F));

		PartDefinition Bodyfront_r122 = neck3.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.2945F, 0.4339F, -1.0317F));

		PartDefinition Bodyfront_r123 = neck3.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(86, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.3541F, -0.5677F, 0.939F));

		PartDefinition Bodyfront_r124 = neck3.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(93, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.2945F, -0.4339F, 1.0317F));

		PartDefinition cube_r167 = neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(39, 109).addBox(0.0F, -1.85F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2177F, -0.5232F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(63, 58).addBox(-1.0F, -2.9F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.269F, -2.9305F, -0.1332F, 0.2581F, 0.0444F));

		PartDefinition Bodyfront_r125 = neck4.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(85, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -1.5909F, 0.3216F, 0.6257F, -1.0254F));

		PartDefinition Bodyfront_r126 = neck4.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(85, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -1.5909F, 0.3216F, -0.6257F, 1.0254F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(23, 73).addBox(-0.5F, -3.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 39).addBox(-1.0F, -2.9F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(25, 21).addBox(-1.5F, 0.2643F, -5.4011F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0503F, -3.7083F, -0.0231F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(97, 69).addBox(-1.0F, 0.5074F, -1.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(97, 75).addBox(-1.0F, 0.3074F, -1.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.0991F, -8.742F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(102, 38).addBox(-1.0F, -0.7887F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.0991F, -8.742F, 0.624F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(48, 98).addBox(-0.5F, -0.6299F, -0.1433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0991F, -8.742F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(102, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0361F, -8.2465F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 63).addBox(-1.4F, -0.5F, -0.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.3156F, 0.4636F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(61, 0).addBox(-2.5F, -0.025F, 0.025F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -2.3954F, -0.2805F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 48).addBox(-2.5F, -0.125F, -0.425F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.2998F, -0.3231F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 9).addBox(-1.5F, -0.4F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.0484F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(70, 6).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1873F, 0.7798F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(103, 3).addBox(-0.525F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.145F, -0.0831F, -9.1858F, 2.3741F, 0.1738F, 0.0518F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(14, 85).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.917F, -7.3707F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(27, 68).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.2643F, -5.4011F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(48, 15).addBox(-1.5F, -1.3F, -0.675F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.3976F, -1.555F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(51, 84).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -1.7999F, -6.5606F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 85).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -2.1826F, -5.6367F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(81, 84).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -2.4666F, -4.6779F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(52, 69).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -2.666F, -3.6979F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 46).addBox(-2.0F, 0.025F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -2.6899F, -3.6719F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2548F, 0.2675F, 0.315F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(40, 95).addBox(0.0382F, 1.7981F, -2.1056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(45, 95).addBox(-0.0618F, 1.7231F, -1.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -0.1736F, 0.2794F, -0.1218F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(91, 102).addBox(-0.8752F, -0.0339F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3577F, -1.5895F, -7.7417F, 0.3973F, 0.2334F, 0.1026F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(58, 98).addBox(-0.849F, -0.1154F, -1.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6469F, -1.1718F, -8.5077F, 0.4537F, 0.224F, 0.1025F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(96, 102).addBox(-0.3866F, -0.278F, -2.6606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(101, 102).addBox(-0.3866F, -0.278F, -2.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 0.6303F, 0.1236F, -0.045F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(98, 3).addBox(-0.3627F, 2.2531F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -0.6607F, 0.0983F, -0.0188F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 72).addBox(-0.7233F, 2.4475F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -0.6667F, 0.0176F, -0.1221F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(96, 90).addBox(-0.0618F, 1.0355F, 1.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -1.3081F, 0.2794F, -0.1218F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(10, 96).addBox(0.0382F, -1.2592F, 0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -2.748F, 0.2794F, -0.1218F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(96, 0).addBox(-0.0618F, -1.0754F, 1.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -2.268F, 0.2794F, -0.1218F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(71, 39).addBox(-0.0618F, -1.9528F, -0.8205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -2.9225F, 0.2794F, -0.1218F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(58, 95).addBox(-0.0618F, -0.6398F, 1.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(53, 95).addBox(-0.0618F, -0.6398F, 1.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -2.4774F, 0.2794F, -0.1218F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(9, 72).addBox(-0.5F, -0.6F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.7461F, -0.8722F, -8.3935F, -2.7831F, 0.282F, -0.1228F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(98, 15).addBox(-0.0618F, -2.0061F, -0.9692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 2.7498F, 0.2794F, -0.1218F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(74, 96).addBox(-0.0618F, -0.7731F, -2.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.8335F, 0.2794F, -0.1218F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(102, 44).addBox(-0.1917F, 0.1775F, -2.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 76).addBox(-0.1917F, 0.6775F, -2.6162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.4408F, 0.2096F, -0.1219F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(102, 75).addBox(-0.0468F, 0.9131F, -1.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.3287F, 0.0391F, 1.3232F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(72, 102).addBox(-0.9114F, 0.0728F, -1.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.0035F, 0.3309F, -0.1225F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(76, 69).addBox(0.3264F, 0.1915F, -0.4652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 0.3003F, -0.5394F, 1.219F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(69, 66).addBox(-0.1623F, 0.3418F, -0.4652F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 0.5773F, 0.2096F, -0.1185F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(102, 72).addBox(-0.6704F, 0.8562F, -2.8696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.3777F, -0.3016F, 1.2434F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(25, 92).addBox(-0.9114F, -0.5932F, -2.8696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.3526F, 0.3309F, -0.1225F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(107, 32).addBox(-0.7815F, -0.9422F, -4.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.6099F, 0.0347F, -0.1048F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(79, 22).addBox(-0.7722F, -1.5195F, -4.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.5997F, 0.3309F, -0.1261F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(78, 77).addBox(-0.7722F, -1.836F, -4.893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.5299F, 0.3309F, -0.1261F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(95, 66).addBox(0.0915F, 1.1992F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(81, 95).addBox(0.0915F, 1.1992F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F))
				.texOffs(86, 95).addBox(0.0915F, 1.1992F, 2.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, -1.5873F, 0.3667F, -0.1217F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 95).addBox(0.0915F, -3.562F, 0.103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 2.7673F, 0.3667F, -0.1217F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(71, 48).addBox(-0.441F, -1.7941F, -3.7122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.2182F, 0.1941F, -0.1821F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(25, 96).addBox(0.0915F, -0.9453F, -3.2864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.1267F, 0.3667F, -0.1217F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 96).addBox(0.0915F, -1.4095F, -3.2112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.2838F, 0.3667F, -0.1217F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 26).addBox(-0.5813F, -0.229F, 0.1377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(15, 97).addBox(-0.5813F, -0.229F, 0.4377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 96).addBox(-0.5813F, -0.229F, 0.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, -1.3275F, 0.2089F, -0.2436F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(30, 97).addBox(-0.5813F, -1.177F, -0.53F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, 3.0271F, 0.2089F, -0.2436F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(97, 45).addBox(-0.5813F, -0.4801F, -0.863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, 1.3865F, 0.2089F, -0.2436F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(96, 93).addBox(-0.5813F, -0.5709F, -0.8905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, 1.5436F, 0.2089F, -0.2436F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(97, 38).addBox(-0.5813F, -0.5418F, -0.5263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, 1.404F, 0.2089F, -0.2436F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(96, 81).addBox(-0.5813F, -0.4392F, -0.5156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1016F, 0.8698F, -7.1939F, 1.1771F, 0.2089F, -0.2436F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(72, 0).addBox(0.0915F, -1.2569F, -3.3119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.3972F, 0.3667F, -0.1217F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 71).addBox(-0.015F, -1.6195F, -2.8818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.7026F, 0.2794F, -0.1218F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(27, 72).addBox(-0.02F, 0.2901F, -3.2761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.2663F, 0.2096F, -0.1219F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(97, 29).addBox(-0.02F, 0.8725F, -3.351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0847F, -1.7782F, -7.5923F, 1.4844F, 0.2096F, -0.1219F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(43, 72).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1206F, 0.8199F, -6.1067F, 1.4251F, 0.3309F, -0.1261F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(76, 52).addBox(-0.7722F, -2.0742F, -4.9939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(44, 64).addBox(-0.944F, -1.6967F, -4.2047F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.4426F, 0.3309F, -0.1261F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(103, 87).addBox(-0.8101F, -2.9107F, 0.5452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 2.3859F, 0.3309F, -0.1225F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(103, 84).addBox(-0.8101F, -0.6968F, 1.5678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -2.8675F, 0.3309F, -0.1225F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(103, 62).addBox(-0.8101F, 0.7674F, 0.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -1.5411F, 0.3309F, -0.1225F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(104, 17).addBox(-0.7101F, 1.5863F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(104, 9).addBox(-0.8851F, 1.5863F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 59).addBox(-0.8101F, 0.8864F, 0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -1.384F, 0.3309F, -0.1225F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(88, 60).addBox(-0.8311F, -2.5966F, -2.4345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 2.849F, 0.0347F, -0.1048F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(81, 104).addBox(-0.8311F, -2.2284F, 1.1144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -2.1251F, 0.0347F, -0.1048F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(104, 41).addBox(-0.8311F, -0.8328F, 1.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -1.5143F, 0.0347F, -0.1048F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(76, 65).addBox(-0.8311F, -4.0025F, -1.1032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -2.0204F, 0.0347F, -0.1048F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 105).addBox(-0.8311F, -1.3851F, -4.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 2.945F, 0.0347F, -0.1048F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(104, 99).addBox(-0.8311F, -3.1277F, -3.4131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -3.024F, 0.0347F, -0.1048F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(86, 104).addBox(-0.8311F, -2.5844F, -4.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 2.9101F, 0.0347F, -0.1048F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(62, 66).addBox(-0.8311F, -2.8761F, -3.3606F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 2.9974F, 0.0347F, -0.1048F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(55, 76).addBox(-0.8311F, 0.5286F, -2.2053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.6535F, 0.0347F, -0.1048F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(104, 78).addBox(-0.8311F, 0.5379F, -0.6148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.7808F, 0.0347F, -0.1048F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(104, 20).addBox(-0.8311F, 0.707F, 0.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.0744F, 0.0347F, -0.1048F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(103, 56).addBox(-0.8101F, 1.4057F, -0.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.5986F, 0.3309F, -0.1225F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(103, 53).addBox(-0.8101F, 0.0846F, -2.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.5795F, 0.3309F, -0.1225F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(103, 50).addBox(-0.8101F, -1.4912F, -3.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(103, 47).addBox(-0.8101F, -1.8912F, -3.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.1031F, 0.3309F, -0.1225F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(103, 14).addBox(-0.8101F, -3.1177F, -1.8495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.6092F, 0.3309F, -0.1225F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(53, 64).addBox(-0.944F, -2.4F, -4.3127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.3728F, 0.3309F, -0.1261F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(66, 27).addBox(-0.944F, -0.9877F, -4.146F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.5124F, 0.3309F, -0.1261F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(78, 39).addBox(-0.9639F, -1.139F, -1.9387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.7068F, 0.3216F, -0.138F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(18, 65).addBox(-0.9561F, 0.1165F, -4.1112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.3742F, 0.0347F, -0.1048F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(9, 64).addBox(-0.9561F, 0.6503F, -3.9823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 1.2433F, 0.0347F, -0.1048F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(53, 98).addBox(-0.9561F, 3.2961F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.1089F, 0.0347F, -0.1048F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(36, 68).addBox(-0.9561F, 1.158F, 0.8491F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 15).addBox(-0.9561F, -0.0169F, -0.1509F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.0656F, 0.0347F, -0.1048F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 30).addBox(-0.9472F, -0.4932F, 2.7935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.2582F, 0.0305F, -0.1217F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(79, 18).addBox(-0.9561F, -2.6873F, 2.7486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 66).addBox(-0.9561F, -3.1873F, 1.7486F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -1.3746F, 0.0347F, -0.1048F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(106, 102).addBox(-0.7061F, 2.5256F, 4.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.1093F, 0.0347F, -0.1048F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 90).addBox(-0.7061F, 2.6639F, 2.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(102, 69).addBox(-0.7061F, 2.1639F, 2.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.3794F, 0.0347F, -0.1048F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(10, 92).addBox(-0.7061F, -2.423F, 2.879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.7114F, 0.0347F, -0.1048F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(106, 81).addBox(-0.7061F, 1.3063F, 3.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(76, 106).addBox(-0.9561F, 1.6063F, 3.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.2049F, 0.0347F, -0.1048F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(13, 106).addBox(-0.7061F, 5.039F, 1.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(106, 0).addBox(-0.7061F, 5.039F, 1.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.5539F, 0.0347F, -0.1048F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(105, 65).addBox(-0.8561F, 3.3538F, 3.3399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, 0.0391F, 0.0347F, -0.1048F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(107, 29).addBox(-0.8561F, -0.5095F, 4.5205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -0.7201F, 0.0347F, -0.1048F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(53, 106).addBox(-0.9561F, -4.3083F, -0.4133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7653F, -2.9782F, -3.6923F, -1.9855F, 0.0347F, -0.1048F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.2548F, 0.2675F, 0.315F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-1.0382F, 1.7981F, -2.1056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(45, 95).mirror().addBox(-0.9382F, 1.7231F, -1.7306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -0.1736F, -0.2794F, 0.1218F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 102).mirror().addBox(-0.1248F, -0.0339F, -0.9639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.3577F, -1.5895F, -7.7417F, 0.3973F, -0.2334F, -0.1026F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(58, 98).mirror().addBox(-0.151F, -0.1154F, -1.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6469F, -1.1718F, -8.5077F, 0.4537F, -0.224F, -0.1025F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(96, 102).mirror().addBox(-0.6134F, -0.278F, -2.6606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(101, 102).mirror().addBox(-0.6134F, -0.278F, -2.7606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 0.6303F, -0.1236F, 0.045F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(-0.6373F, 2.2531F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -0.6607F, -0.0983F, 0.0188F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 72).mirror().addBox(-0.2767F, 2.4475F, -1.0382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -0.6667F, -0.0176F, 0.1221F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(96, 90).mirror().addBox(-0.9382F, 1.0355F, 1.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -1.3081F, -0.2794F, 0.1218F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(10, 96).mirror().addBox(-1.0382F, -1.2592F, 0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -2.748F, -0.2794F, 0.1218F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.9382F, -1.0754F, 1.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -2.268F, -0.2794F, 0.1218F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-0.9382F, -1.9528F, -0.8205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -2.9225F, -0.2794F, 0.1218F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(58, 95).mirror().addBox(-0.9382F, -0.6398F, 1.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(53, 95).mirror().addBox(-0.9382F, -0.6398F, 1.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -2.4774F, -0.2794F, 0.1218F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-0.5F, -0.6F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.7461F, -0.8722F, -8.3935F, -2.7831F, -0.282F, 0.1228F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(-0.9382F, -2.0061F, -0.9692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 2.7498F, -0.2794F, 0.1218F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(74, 96).mirror().addBox(-0.9382F, -0.7731F, -2.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.8335F, -0.2794F, 0.1218F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(-0.8083F, 0.1775F, -2.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 76).mirror().addBox(-0.8083F, 0.6775F, -2.6162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.4408F, -0.2096F, 0.1219F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-0.9532F, 0.9131F, -1.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.3287F, -0.0391F, -1.3232F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(-0.0886F, 0.0728F, -1.9665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.0035F, -0.3309F, 0.1225F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-1.3264F, 0.1915F, -0.4652F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 0.3003F, 0.5394F, -1.219F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-0.8377F, 0.3418F, -0.4652F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 0.5773F, -0.2096F, 0.1185F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 72).mirror().addBox(-0.3296F, 0.8562F, -2.8696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.3777F, 0.3016F, -1.2434F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.0886F, -0.5932F, -2.8696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.3526F, -0.3309F, 0.1225F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(107, 32).mirror().addBox(-0.2185F, -0.9422F, -4.6988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.6099F, -0.0347F, 0.1048F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(79, 22).mirror().addBox(-0.2278F, -1.5195F, -4.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.5997F, -0.3309F, 0.1261F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.2278F, -1.836F, -4.893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.5299F, -0.3309F, 0.1261F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(95, 66).mirror().addBox(-1.0915F, 1.1992F, 2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(81, 95).mirror().addBox(-1.0915F, 1.1992F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false)
				.texOffs(86, 95).mirror().addBox(-1.0915F, 1.1992F, 2.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, -1.5873F, -0.3667F, 0.1217F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 95).mirror().addBox(-1.0915F, -3.562F, 0.103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 2.7673F, -0.3667F, 0.1217F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-0.559F, -1.7941F, -3.7122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.2182F, -0.1941F, 0.1821F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(25, 96).mirror().addBox(-1.0915F, -0.9453F, -3.2864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.1267F, -0.3667F, 0.1217F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-1.0915F, -1.4095F, -3.2112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.2838F, -0.3667F, 0.1217F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-0.4187F, -0.229F, 0.1377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(15, 97).mirror().addBox(-0.4187F, -0.229F, 0.4377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 96).mirror().addBox(-0.4187F, -0.229F, 0.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, -1.3275F, -0.2089F, 0.2436F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(30, 97).mirror().addBox(-0.4187F, -1.177F, -0.53F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, 3.0271F, -0.2089F, 0.2436F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(97, 45).mirror().addBox(-0.4187F, -0.4801F, -0.863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, 1.3865F, -0.2089F, 0.2436F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-0.4187F, -0.5709F, -0.8905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, 1.5436F, -0.2089F, 0.2436F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(97, 38).mirror().addBox(-0.4187F, -0.5418F, -0.5263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, 1.404F, -0.2089F, 0.2436F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(96, 81).mirror().addBox(-0.4187F, -0.4392F, -0.5156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1016F, 0.8698F, -7.1939F, 1.1771F, -0.2089F, 0.2436F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-1.0915F, -1.2569F, -3.3119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.3972F, -0.3667F, 0.1217F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(69, 71).mirror().addBox(-0.9849F, -1.6195F, -2.8818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.7026F, -0.2794F, 0.1218F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.98F, 0.2901F, -3.2761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.2663F, -0.2096F, 0.1219F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(97, 29).mirror().addBox(-0.98F, 0.8725F, -3.351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0847F, -1.7782F, -7.5923F, 1.4844F, -0.2096F, 0.1219F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1206F, 0.8199F, -6.1067F, 1.4251F, -0.3309F, 0.1261F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-0.2278F, -2.0742F, -4.9939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 64).mirror().addBox(-0.056F, -1.6967F, -4.2047F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.4426F, -0.3309F, 0.1261F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(103, 87).mirror().addBox(-0.1899F, -2.9107F, 0.5452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 2.3859F, -0.3309F, 0.1225F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(-0.1899F, -0.6968F, 1.5678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -2.8675F, -0.3309F, 0.1225F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-0.1899F, 0.7674F, 0.1063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -1.5411F, -0.3309F, 0.1225F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(104, 17).mirror().addBox(-0.2899F, 1.5863F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(104, 9).mirror().addBox(-0.1149F, 1.5863F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 59).mirror().addBox(-0.1899F, 0.8864F, 0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -1.384F, -0.3309F, 0.1225F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(-0.1689F, -2.5966F, -2.4345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 2.849F, -0.0347F, 0.1048F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(81, 104).mirror().addBox(-0.1689F, -2.2284F, 1.1144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -2.1251F, -0.0347F, 0.1048F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-0.1689F, -0.8328F, 1.512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -1.5143F, -0.0347F, 0.1048F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(76, 65).mirror().addBox(-0.1689F, -4.0025F, -1.1032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -2.0204F, -0.0347F, 0.1048F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.1689F, -1.3851F, -4.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 2.945F, -0.0347F, 0.1048F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-0.1689F, -3.1277F, -3.4131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -3.024F, -0.0347F, 0.1048F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(86, 104).mirror().addBox(-0.1689F, -2.5844F, -4.3205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 2.9101F, -0.0347F, 0.1048F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-0.1689F, -2.8761F, -3.3606F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 2.9974F, -0.0347F, 0.1048F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(55, 76).mirror().addBox(-0.1689F, 0.5286F, -2.2053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.6535F, -0.0347F, 0.1048F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(104, 78).mirror().addBox(-0.1689F, 0.5379F, -0.6148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.7808F, -0.0347F, 0.1048F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-0.1689F, 0.707F, 0.0437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.0744F, -0.0347F, 0.1048F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(103, 56).mirror().addBox(-0.1899F, 1.4057F, -0.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.5986F, -0.3309F, 0.1225F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(103, 53).mirror().addBox(-0.1899F, 0.0846F, -2.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.5795F, -0.3309F, 0.1225F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-0.1899F, -1.4912F, -3.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(103, 47).mirror().addBox(-0.1899F, -1.8912F, -3.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.1031F, -0.3309F, 0.1225F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(103, 14).mirror().addBox(-0.1899F, -3.1177F, -1.8495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.6092F, -0.3309F, 0.1225F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-0.056F, -2.4F, -4.3127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.3728F, -0.3309F, 0.1261F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-0.056F, -0.9877F, -4.146F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.5124F, -0.3309F, 0.1261F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-0.0361F, -1.139F, -1.9387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.7068F, -0.3216F, 0.138F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(18, 65).mirror().addBox(-0.0439F, 0.1165F, -4.1112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.3742F, -0.0347F, 0.1048F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-0.0439F, 0.6503F, -3.9823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 1.2433F, -0.0347F, 0.1048F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(53, 98).mirror().addBox(-0.0439F, 3.2961F, -0.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.1089F, -0.0347F, 0.1048F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(-0.0439F, 1.158F, 0.8491F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 15).mirror().addBox(-0.0439F, -0.0169F, -0.1509F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.0656F, -0.0347F, 0.1048F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(92, 30).mirror().addBox(-0.0528F, -0.4932F, 2.7935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.2582F, -0.0305F, 0.1217F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(-0.0439F, -2.6873F, 2.7486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.0439F, -3.1873F, 1.7486F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -1.3746F, -0.0347F, 0.1048F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(106, 102).mirror().addBox(-0.2939F, 2.5256F, 4.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.1093F, -0.0347F, 0.1048F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(106, 90).mirror().addBox(-0.2939F, 2.6639F, 2.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(102, 69).mirror().addBox(-0.2939F, 2.1639F, 2.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.3794F, -0.0347F, 0.1048F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.2939F, -2.423F, 2.879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.7114F, -0.0347F, 0.1048F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(106, 81).mirror().addBox(-0.2939F, 1.3063F, 3.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(76, 106).mirror().addBox(-0.0439F, 1.6063F, 3.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.2049F, -0.0347F, 0.1048F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(13, 106).mirror().addBox(-0.2939F, 5.039F, 1.3407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(106, 0).mirror().addBox(-0.2939F, 5.039F, 1.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.5539F, -0.0347F, 0.1048F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(105, 65).mirror().addBox(-0.1439F, 3.3538F, 3.3399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, 0.0391F, -0.0347F, 0.1048F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(107, 29).mirror().addBox(-0.1439F, -0.5095F, 4.5205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -0.7201F, -0.0347F, 0.1048F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(53, 106).mirror().addBox(-0.0439F, -4.3083F, -0.4133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7653F, -2.9782F, -3.6923F, -1.9855F, -0.0347F, 0.1048F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2551F, 1.1322F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r342 = lower_jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(81, 87).mirror().addBox(-0.0136F, 0.1183F, -0.3456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.59F, -5.5685F, -1.5546F, -0.3447F, -0.0183F));

		PartDefinition cube_r343 = lower_jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.0136F, -0.558F, 1.0887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.59F, -5.5685F, -3.0425F, -0.3447F, -0.0183F));

		PartDefinition cube_r344 = lower_jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.0303F, -0.746F, 0.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(89, 98).mirror().addBox(-0.0303F, -0.746F, 0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -3.0441F, -0.2574F, -0.0178F));

		PartDefinition cube_r345 = lower_jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(91, 105).mirror().addBox(-0.0303F, 1.3201F, -0.0834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0076F)).mirror(false)
				.texOffs(71, 105).mirror().addBox(-0.0303F, 0.4534F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 105).mirror().addBox(-0.0303F, 0.0534F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.5955F, -0.2574F, -0.0178F));

		PartDefinition cube_r346 = lower_jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(107, 44).mirror().addBox(-0.1803F, -1.2405F, 1.9921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(107, 38).mirror().addBox(-0.1803F, -1.2405F, 2.2921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, 3.0384F, -0.2574F, -0.0178F));

		PartDefinition cube_r347 = lower_jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(35, 98).mirror().addBox(-0.1803F, 0.4767F, 2.4164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(20, 98).mirror().addBox(-0.1803F, 0.4767F, 1.9164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -2.7212F, -0.2574F, -0.0178F));

		PartDefinition cube_r348 = lower_jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(68, 97).mirror().addBox(-0.7864F, -2.2228F, -1.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, 1.5529F, 0.2341F, 2.9327F));

		PartDefinition cube_r349 = lower_jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(63, 97).mirror().addBox(-0.7864F, -2.1677F, -1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, 1.4656F, 0.2341F, 2.9327F));

		PartDefinition cube_r350 = lower_jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(94, 99).mirror().addBox(-0.7864F, -2.3465F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, 1.6489F, 0.2341F, 2.9327F));

		PartDefinition cube_r351 = lower_jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-0.7864F, -2.3942F, -0.7482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, 1.8408F, 0.2341F, 2.9327F));

		PartDefinition cube_r352 = lower_jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(96, 105).mirror().addBox(-0.7864F, -1.3028F, 1.2838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, -3.0112F, 0.2341F, 2.9327F));

		PartDefinition cube_r353 = lower_jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(97, 32).mirror().addBox(-0.7864F, 1.489F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(97, 35).mirror().addBox(-0.7864F, 1.489F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.3685F, -1.0826F, 0.2341F, 2.9327F));

		PartDefinition cube_r354 = lower_jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(18, 106).mirror().addBox(-0.0303F, 1.4193F, -0.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.5169F, -0.2574F, -0.0178F));

		PartDefinition cube_r355 = lower_jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.5537F, 4.4392F, -1.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 72).mirror().addBox(-0.5537F, 5.0392F, -1.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -1.2829F, -0.0829F, -0.0174F));

		PartDefinition cube_r356 = lower_jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(-0.5537F, 5.6286F, -0.6626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -1.3702F, -0.0829F, -0.0174F));

		PartDefinition cube_r357 = lower_jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(107, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, 1.5231F, -10.6119F, -0.9114F, 0.0639F, 0.0645F));

		PartDefinition cube_r358 = lower_jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(21, 80).mirror().addBox(-0.2803F, 2.282F, -2.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.133F, -0.2574F, -0.0178F));

		PartDefinition cube_r359 = lower_jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-0.2803F, 1.9526F, -2.3458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.2726F, -0.2574F, -0.0178F));

		PartDefinition cube_r360 = lower_jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-0.2803F, 1.7816F, -0.9798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.6653F, -0.2574F, -0.0178F));

		PartDefinition cube_r361 = lower_jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(107, 71).mirror().addBox(-0.2303F, 0.6295F, -0.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.7002F, -0.2574F, -0.0178F));

		PartDefinition cube_r362 = lower_jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(107, 68).mirror().addBox(-0.2303F, -0.0656F, -0.9386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.394F, 1.59F, -7.4685F, -1.5257F, -0.2574F, -0.0178F));

		PartDefinition cube_r363 = lower_jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.2136F, 1.3045F, -1.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 56).mirror().addBox(-0.2136F, 0.7045F, -1.3831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 0).mirror().addBox(-0.2136F, 0.1045F, -1.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 54).mirror().addBox(-0.0136F, 0.1045F, -0.6581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.094F, 1.59F, -5.5685F, -1.4368F, -0.3447F, -0.0183F));

		PartDefinition cube_r364 = lower_jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(-0.3537F, 5.3185F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -1.2131F, -0.0829F, -0.0174F));

		PartDefinition cube_r365 = lower_jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.3537F, 3.8646F, -1.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -1.1258F, -0.0829F, -0.0174F));

		PartDefinition cube_r366 = lower_jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(23, 105).mirror().addBox(-0.2563F, 1.9253F, -3.3868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -0.4974F, -0.0654F, 0.0F));

		PartDefinition cube_r367 = lower_jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.2563F, 0.4827F, -3.8657F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -0.1047F, -0.0654F, 0.0F));

		PartDefinition cube_r368 = lower_jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.3537F, 2.577F, -5.6818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -0.1615F, -0.0829F, -0.0174F));

		PartDefinition cube_r369 = lower_jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(105, 23).mirror().addBox(-0.3537F, 1.749F, -4.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -0.1702F, -0.0829F, -0.0174F));

		PartDefinition cube_r370 = lower_jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(8, 105).mirror().addBox(-0.2563F, 2.2701F, -3.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, -0.0829F, -0.0654F, 0.0F));

		PartDefinition cube_r371 = lower_jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.2563F, 1.7109F, -3.4578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, 0.0916F, -0.0654F, 0.0F));

		PartDefinition cube_r372 = lower_jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-0.2563F, 1.3669F, -2.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, 0.2225F, -0.0654F, 0.0F));

		PartDefinition cube_r373 = lower_jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.2563F, 0.4145F, -2.0558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, 0.8683F, -0.0654F, 0.0F));

		PartDefinition cube_r374 = lower_jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.2563F, 0.1231F, -3.5191F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, 0.0436F, -0.0654F, 0.0F));

		PartDefinition cube_r375 = lower_jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(106, 93).mirror().addBox(-0.2563F, 0.15F, -0.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.41F, 0.3315F, 0.0F, -0.0654F, 0.0F));

		PartDefinition cube_r376 = lower_jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(81, 87).addBox(-0.9864F, 0.1183F, -0.3456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.094F, 1.59F, -5.5685F, -1.5546F, 0.3447F, 0.0183F));

		PartDefinition cube_r377 = lower_jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(10, 99).addBox(-0.9864F, -0.558F, 1.0887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.094F, 1.59F, -5.5685F, -3.0425F, 0.3447F, 0.0183F));

		PartDefinition cube_r378 = lower_jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 99).addBox(-0.9697F, -0.746F, 0.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(89, 98).addBox(-0.9697F, -0.746F, 0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -3.0441F, 0.2574F, 0.0178F));

		PartDefinition cube_r379 = lower_jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(91, 105).addBox(-0.9697F, 1.3201F, -0.0834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0076F))
				.texOffs(71, 105).addBox(-0.9697F, 0.4534F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 105).addBox(-0.9697F, 0.0534F, -0.3764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.5955F, 0.2574F, 0.0178F));

		PartDefinition cube_r380 = lower_jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(107, 44).addBox(-0.8197F, -1.2405F, 1.9921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(107, 38).addBox(-0.8197F, -1.2405F, 2.2921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, 3.0384F, 0.2574F, 0.0178F));

		PartDefinition cube_r381 = lower_jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(35, 98).addBox(-0.8197F, 0.4767F, 2.4164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(20, 98).addBox(-0.8197F, 0.4767F, 1.9164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -2.7212F, 0.2574F, 0.0178F));

		PartDefinition cube_r382 = lower_jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(68, 97).addBox(-0.2136F, -2.2228F, -1.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, 1.5529F, -0.2341F, -2.9327F));

		PartDefinition cube_r383 = lower_jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(63, 97).addBox(-0.2136F, -2.1677F, -1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, 1.4656F, -0.2341F, -2.9327F));

		PartDefinition cube_r384 = lower_jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(94, 99).addBox(-0.2136F, -2.3465F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, 1.6489F, -0.2341F, -2.9327F));

		PartDefinition cube_r385 = lower_jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(98, 53).addBox(-0.2136F, -2.3942F, -0.7482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, 1.8408F, -0.2341F, -2.9327F));

		PartDefinition cube_r386 = lower_jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(96, 105).addBox(-0.2136F, -1.3028F, 1.2838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, -3.0112F, -0.2341F, -2.9327F));

		PartDefinition cube_r387 = lower_jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(97, 32).addBox(-0.2136F, 1.489F, -0.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(97, 35).addBox(-0.2136F, 1.489F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.3685F, -1.0826F, -0.2341F, -2.9327F));

		PartDefinition cube_r388 = lower_jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(18, 106).addBox(-0.9697F, 1.4193F, -0.4913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.5169F, 0.2574F, 0.0178F));

		PartDefinition cube_r389 = lower_jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(57, 72).addBox(-0.4463F, 4.4392F, -1.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 72).addBox(-0.4463F, 5.0392F, -1.1209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -1.2829F, 0.0829F, 0.0174F));

		PartDefinition cube_r390 = lower_jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(16, 73).addBox(-0.4463F, 5.6286F, -0.6626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -1.3702F, 0.0829F, 0.0174F));

		PartDefinition cube_r391 = lower_jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(107, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2622F, 1.5231F, -10.6119F, -0.9114F, -0.0639F, -0.0645F));

		PartDefinition cube_r392 = lower_jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(21, 80).addBox(-0.7197F, 2.282F, -2.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.133F, 0.2574F, 0.0178F));

		PartDefinition cube_r393 = lower_jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(81, 60).addBox(-0.7197F, 1.9526F, -2.3458F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.2726F, 0.2574F, 0.0178F));

		PartDefinition cube_r394 = lower_jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(7, 80).addBox(-0.7197F, 1.7816F, -0.9798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.6653F, 0.2574F, 0.0178F));

		PartDefinition cube_r395 = lower_jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(107, 71).addBox(-0.7697F, 0.6295F, -0.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.7002F, 0.2574F, 0.0178F));

		PartDefinition cube_r396 = lower_jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(107, 68).addBox(-0.7697F, -0.0656F, -0.9386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.394F, 1.59F, -7.4685F, -1.5257F, 0.2574F, 0.0178F));

		PartDefinition cube_r397 = lower_jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(69, 79).addBox(-0.7864F, 1.3045F, -1.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 56).addBox(-0.7864F, 0.7045F, -1.3831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 0).addBox(-0.7864F, 0.1045F, -1.3581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 54).addBox(-0.9864F, 0.1045F, -0.6581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.094F, 1.59F, -5.5685F, -1.4368F, 0.3447F, 0.0183F));

		PartDefinition cube_r398 = lower_jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(28, 105).addBox(-0.6463F, 5.3185F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -1.2131F, 0.0829F, 0.0174F));

		PartDefinition cube_r399 = lower_jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 88).addBox(-0.6463F, 3.8646F, -1.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -1.1258F, 0.0829F, 0.0174F));

		PartDefinition cube_r400 = lower_jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(23, 105).addBox(-0.7437F, 1.9253F, -3.3868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -0.4974F, 0.0654F, 0.0F));

		PartDefinition cube_r401 = lower_jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(35, 59).addBox(-0.7437F, 0.4827F, -3.8657F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -0.1047F, 0.0654F, 0.0F));

		PartDefinition cube_r402 = lower_jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 78).addBox(-0.6463F, 2.577F, -5.6818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -0.1615F, 0.0829F, 0.0174F));

		PartDefinition cube_r403 = lower_jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(105, 23).addBox(-0.6463F, 1.749F, -4.6268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -0.1702F, 0.0829F, 0.0174F));

		PartDefinition cube_r404 = lower_jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(8, 105).addBox(-0.7437F, 2.2701F, -3.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, -0.0829F, 0.0654F, 0.0F));

		PartDefinition cube_r405 = lower_jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(105, 6).addBox(-0.7437F, 1.7109F, -3.4578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, 0.0916F, 0.0654F, 0.0F));

		PartDefinition cube_r406 = lower_jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(14, 77).addBox(-0.7437F, 1.3669F, -2.7906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, 0.2225F, 0.0654F, 0.0F));

		PartDefinition cube_r407 = lower_jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(41, 76).addBox(-0.7437F, 0.4145F, -2.0558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, 0.8683F, 0.0654F, 0.0F));

		PartDefinition cube_r408 = lower_jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(0, 60).addBox(-0.7437F, 0.1231F, -3.5191F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, 0.0436F, 0.0654F, 0.0F));

		PartDefinition cube_r409 = lower_jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(106, 93).addBox(-0.7437F, 0.15F, -0.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.269F, -0.41F, 0.3315F, 0.0F, 0.0654F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 114, 114);
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