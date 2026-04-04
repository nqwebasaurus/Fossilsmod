package fossils.fossils.client.blockentity.model.theosodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TheosodonFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public TheosodonFossilModel(ModelPart root) {
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
		this.bone4 = this.hips.getChild("bone4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.chest = this.body7.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone3 = this.neck2.getChild("bone3");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.7442F, 17.1612F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 59).addBox(0.0F, -1.0986F, 0.0389F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4336F, -0.1433F, -0.2225F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4336F, 0.1433F, 0.2225F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 21).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 3.3186F, -1.558F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 70).addBox(-1.0F, 1.8F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(73, 70).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.9716F, 0.9271F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 70).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9318F, 0.6001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 104).addBox(0.5F, -1.0653F, -1.0869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0365F, 0.8629F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 39).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.7182F, -0.4942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -3.4F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.8628F, 0.9126F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(103, 84).addBox(-0.5F, -3.4F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8628F, 0.9126F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 93).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.703F, -1.4654F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 80).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 14.2084F, 1.1454F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(108, 87).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.1823F, 0.1457F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 76).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9573F, -0.8287F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 5).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 12.5062F, -2.1352F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 75).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.3766F, -1.6428F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 10).addBox(-1.0F, -0.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1435F, -0.2719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(85, 27).addBox(-1.0F, -0.8F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.8058F, 0.4561F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 75).addBox(-0.5F, -1.3F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 3.7521F, -0.0603F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(89, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.007F, 10.3117F, -1.8978F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 105).addBox(-0.5F, 0.0F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.007F, 7.6246F, -0.2745F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(109, 0).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 8.5068F, 0.0375F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(98, 18).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.007F, 5.5637F, 1.25F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, 0.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 97).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.007F, 6.6007F, 1.0534F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(97, 50).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.007F, 7.13F, 0.2774F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(113, 22).addBox(-0.5F, -1.15F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.007F, 8.3229F, -0.2542F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -3.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.007F, 9.2294F, -0.5689F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.4159F, 1.6095F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 92).addBox(-1.0F, -0.1F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 56).addBox(-1.0F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(50, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.8562F, 0.7683F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(45, 86).addBox(-1.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 86).addBox(-1.5F, -0.5F, -0.475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.7022F, -0.1869F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(98, 39).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9F, 1.0808F, 0.8897F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(15, 119).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9F, 0.4209F, 1.1233F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 119).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, -0.01F, 1.675F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(98, 22).addBox(-0.5F, 0.525F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.9F, 1.0119F, 2.8309F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 1.0104F, 2.8251F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(103, 112).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9F, 2.3029F, 1.7597F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(11, 52).addBox(-1.5F, -4.3748F, -0.4658F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 5.4657F, 0.391F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(98, 112).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.0586F, 1.3954F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(11, 64).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.0586F, 1.3954F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(113, 26).addBox(-0.5F, -0.025F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 9.0012F, -1.3361F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(70, 112).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 9.0012F, -1.3361F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(105, 12).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 8.6109F, -0.7464F, -0.2007F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 11.3092F, -1.7951F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(71, 30).addBox(-1.6F, -0.6F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, -0.7065F, 1.0594F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(119, 42).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, -3.3743F, 0.3978F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(105, 17).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2F, -2.2313F, 0.166F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(113, 90).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.2F, -2.7494F, -0.9489F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 92).addBox(-0.8F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.3295F, 0.122F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(43, 61).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.3F, 3.909F, 3.6136F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(90, 0).addBox(-1.0F, -0.1248F, -0.3422F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.026F)), PartPose.offsetAndRotation(-0.3F, 6.7548F, 5.297F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(43, 109).addBox(-0.9F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.9F, -0.1248F, 0.1578F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r52 = leftLeg4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(109, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, -0.1248F, 0.1578F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0391F, 2.8553F, 0.6261F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(119, 100).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(-1.4499F, 0.6331F, -0.8597F, -0.3527F, 0.3326F, 1.031F));

		PartDefinition cube_r54 = leftLeg5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 119).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(1.3577F, 0.573F, -0.8811F, -0.3806F, 0.3556F, 0.4108F));

		PartDefinition cube_r55 = leftLeg5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(98, 47).addBox(0.4F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.036F))
				.texOffs(119, 62).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0298F)), PartPose.offsetAndRotation(-1.0391F, 1.45F, -1.3713F, -0.3876F, 0.3614F, 0.7137F));

		PartDefinition cube_r56 = leftLeg5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(119, 59).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.4409F, 2.0364F, -1.7099F, -0.3876F, 0.3614F, 0.7137F));

		PartDefinition cube_r57 = leftLeg5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(119, 56).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.4463F, -0.0258F, 0.0317F, -0.48F, 0.0F, 0.3054F));

		PartDefinition cube_r58 = leftLeg5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(119, 53).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.8404F, -0.2062F, 0.0317F, -0.5149F, 0.0F, -0.3054F));

		PartDefinition cube_r59 = leftLeg5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(57, 93).addBox(-2.6391F, -1.5148F, 0.1596F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(1.6F, 0.7F, -1.7F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 3.3186F, -1.558F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(101, 95).addBox(-1.0F, 1.8F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(75, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.9716F, 0.9271F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 18).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9318F, 0.6001F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(104, 102).addBox(-1.5F, -1.0653F, -1.0869F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0365F, 0.8629F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 112).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.7182F, -0.4942F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(19, 104).addBox(-0.5F, -3.4F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.8628F, 0.9126F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 104).addBox(-0.5F, -3.4F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.8628F, 0.9126F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(102, 58).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.703F, -1.4654F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 85).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 14.2084F, 1.1454F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(48, 111).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.1823F, 0.1457F, 3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(62, 84).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9573F, -0.8287F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 74).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 12.5062F, -2.1352F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(110, 78).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 13.3766F, -1.6428F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(45, 102).addBox(-1.0F, -0.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.1435F, -0.2719F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 31).addBox(-1.0F, -0.8F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 12.8058F, 0.4561F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(28, 84).addBox(-0.5F, -1.3F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 3.7521F, -0.0603F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(91, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.007F, 10.3117F, -1.8978F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(111, 46).addBox(-0.5F, 0.0F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.007F, 7.6246F, -0.2745F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(34, 111).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, 8.5068F, 0.0375F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 101).addBox(-0.5F, -1.0F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.007F, 5.5637F, 1.25F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(98, 84).addBox(-0.5F, 0.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 101).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.007F, 6.6007F, 1.0534F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 101).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.007F, 7.13F, 0.2774F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(113, 70).addBox(-0.5F, -1.15F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.007F, 8.3229F, -0.2542F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(29, 111).addBox(-0.5F, -3.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.007F, 9.2294F, -0.5689F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.4159F, 1.6095F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(33, 92).addBox(0.0F, -0.1F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 102).addBox(0.0F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(91, 45).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.8562F, 0.7683F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(7, 91).addBox(0.5F, -5.2F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7021F, -0.2306F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(86, 44).addBox(0.5F, -0.5F, -0.475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.7022F, -0.1869F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(77, 102).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.9F, 1.0808F, 0.8897F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(100, 122).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9F, 0.4209F, 1.1233F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(122, 78).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, -0.01F, 1.675F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(61, 102).addBox(-0.5F, 0.525F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.9F, 1.0119F, 2.8309F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 122).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 1.0104F, 2.8251F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9F, 2.3029F, 1.7597F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(27, 58).addBox(0.5F, -4.3748F, -0.4658F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9F, 5.4657F, 0.391F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(108, 112).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.0586F, 1.3954F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(16, 70).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.0586F, 1.3954F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(113, 81).addBox(-0.5F, -0.025F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 9.0012F, -1.3361F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 112).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 9.0012F, -1.3361F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 111).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 8.6109F, -0.7464F, -0.2007F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 11.3092F, -1.7951F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 75).addBox(-0.4F, -0.6F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3F, -0.7065F, 1.0594F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, -3.3743F, 0.3978F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(24, 112).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2F, -2.2313F, 0.166F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(115, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, -2.7494F, -0.9489F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 92).addBox(-1.2F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.3295F, 0.122F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(50, 61).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.3F, 3.909F, 3.6136F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(50, 91).addBox(-1.0F, -0.1248F, -0.3422F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.026F)), PartPose.offsetAndRotation(0.3F, 6.7548F, 5.297F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(112, 5).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.9F, -0.1248F, 0.1578F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r107 = rightLeg4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(93, 111).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.0F, -0.1248F, 0.1578F, 0.0F, 0.0F, -0.3054F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0391F, 2.8553F, 0.6261F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(120, 122).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(1.4499F, 0.6331F, -0.8597F, -0.3527F, -0.3326F, -1.031F));

		PartDefinition cube_r109 = rightLeg5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(122, 117).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(-1.3577F, 0.573F, -0.8811F, -0.3806F, -0.3556F, -0.4108F));

		PartDefinition cube_r110 = rightLeg5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 116).addBox(-1.4F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.036F))
				.texOffs(115, 122).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0298F)), PartPose.offsetAndRotation(1.0391F, 1.45F, -1.3713F, -0.3876F, -0.3614F, -0.7137F));

		PartDefinition cube_r111 = rightLeg5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(122, 114).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.4409F, 2.0364F, -1.7099F, -0.3876F, -0.3614F, -0.7137F));

		PartDefinition cube_r112 = rightLeg5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(110, 122).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.4463F, -0.0258F, 0.0317F, -0.48F, 0.0F, -0.3054F));

		PartDefinition cube_r113 = rightLeg5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(105, 122).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.8404F, -0.2062F, 0.0317F, -0.5149F, 0.0F, 0.3054F));

		PartDefinition cube_r114 = rightLeg5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(97, 102).addBox(0.6391F, -1.5148F, 0.1596F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.034F)), PartPose.offsetAndRotation(-1.6F, 0.7F, -1.7F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9869F, 4.0013F, 0.6489F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r115 = bone.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(36, 108).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.142F, 1.0618F, -0.3398F, 2.9536F, -1.14F, 1.9301F));

		PartDefinition cube_r116 = bone.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(80, 15).addBox(-0.806F, -0.923F, -0.3532F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8454F, 1.1053F, -0.62F, -2.5442F, -1.14F, 1.9301F));

		PartDefinition cube_r117 = bone.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(40, 97).addBox(-2.6357F, -0.923F, -1.8327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8454F, 1.1053F, -0.62F, -0.309F, -0.6883F, -0.4577F));

		PartDefinition cube_r118 = bone.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 36).addBox(0.0F, -1.0F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1566F, 2.3771F, -1.8484F, -0.0328F, -0.2753F, -1.5523F));

		PartDefinition cube_r119 = bone.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(118, 89).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4121F, 2.4009F, -0.2882F, -0.2573F, -0.3948F, -0.557F));

		PartDefinition cube_r120 = bone.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(39, 49).addBox(-2.517F, -0.923F, -3.3909F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8454F, 1.1053F, -0.62F, -0.2395F, -0.1409F, -0.6235F));

		PartDefinition cube_r121 = bone.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 84).addBox(-2.517F, -0.58F, -3.4091F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8454F, 1.1053F, -0.62F, -0.3704F, -0.1409F, -0.6235F));

		PartDefinition cube_r122 = bone.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 24).addBox(0.1694F, -0.6208F, -5.9873F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0268F, -1.3948F, -0.1618F, 0.0542F, 0.5493F, 1.8338F));

		PartDefinition cube_r123 = bone.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(26, 43).addBox(0.1694F, -0.0985F, -5.0014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0268F, -1.3948F, -0.1618F, 0.1763F, 0.5493F, 1.8338F));

		PartDefinition cube_r124 = bone.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 36).addBox(-0.9F, -0.5F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7479F, -0.0225F, -1.6347F, 0.0633F, 0.6532F, 1.8432F));

		PartDefinition cube_r125 = bone.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 18).addBox(-0.9F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0039F, 0.109F, -1.1276F, -0.2134F, 0.5808F, 1.261F));

		PartDefinition cube_r126 = bone.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(48, 0).addBox(-2.8784F, 0.3966F, 1.8617F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -2.1965F, 0.3137F, -1.5845F));

		PartDefinition cube_r127 = bone.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 62).addBox(0.5858F, 0.3966F, -4.8976F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -0.8816F, -0.0442F, 1.2071F));

		PartDefinition cube_r128 = bone.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(12, 80).addBox(1.6448F, 0.3966F, -4.7072F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -0.8813F, 0.0391F, 1.1062F));

		PartDefinition cube_r129 = bone.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 79).addBox(3.8066F, 0.3966F, 1.314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -1.2771F, 0.6343F, 0.0547F));

		PartDefinition cube_r130 = bone.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(107, 54).addBox(-6.1393F, 0.3966F, 2.1146F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -2.2603F, -0.0391F, -2.0354F));

		PartDefinition cube_r131 = bone.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(86, 118).addBox(-1.8469F, 0.3966F, 5.6326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -2.1071F, 0.4581F, -1.3484F));

		PartDefinition cube_r132 = bone.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(48, 5).addBox(-2.657F, -0.1001F, -2.9557F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -1.9203F, -0.818F, -2.9476F));

		PartDefinition cube_r133 = bone.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 32).addBox(-2.037F, -0.1001F, -3.5027F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6257F, -5.8526F, -5.4092F, -1.731F, -0.8624F, 3.0821F));

		PartDefinition cube_r134 = bone.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(73, 65).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(60, 30).addBox(1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9919F, -7.7667F, -3.5409F, -0.7071F, -0.7369F, 1.784F));

		PartDefinition cube_r135 = bone.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(118, 81).addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5548F, -7.8285F, -2.5978F, -1.9341F, -1.0301F, -3.0323F));

		PartDefinition cube_r136 = bone.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(21, 70).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -4.2584F, -2.2804F, -2.8362F, 0.4614F, -1.8365F));

		PartDefinition cube_r137 = bone.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(43, 36).addBox(2.3846F, -0.9106F, -1.4459F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4731F, -1.5231F, -5.2253F, -2.5954F, -0.3864F, -2.104F));

		PartDefinition cube_r138 = bone.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(62, 8).addBox(-2.2F, -0.45F, -0.425F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5371F, -5.4079F, -4.7266F, -2.2506F, 0.4117F, -1.5056F));

		PartDefinition cube_r139 = bone.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 108).addBox(-1.4F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8044F, 0.239F, 3.0484F, 1.5267F, -1.1847F, 0.5131F));

		PartDefinition cube_r140 = bone.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(29, 108).addBox(-1.4F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8044F, 0.239F, 3.0484F, 2.444F, -0.9451F, -0.5086F));

		PartDefinition cube_r141 = bone.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 105).addBox(1.6F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2955F, 1.5051F, 3.328F, 1.9209F, 1.1588F, -2.2969F));

		PartDefinition cube_r142 = bone.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(105, 22).addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.251F, 0.1099F, 1.456F, 1.3788F, 1.1956F, -2.9552F));

		PartDefinition cube_r143 = bone.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(104, 51).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9291F, -1.1158F, -3.3734F, -1.6029F, 0.1893F, -1.3503F));

		PartDefinition cube_r144 = bone.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(103, 32).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1041F, -1.2094F, -0.2426F, -1.6236F, 0.9305F, -1.3866F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9869F, 4.0013F, 0.6489F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(36, 108).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.142F, 1.0618F, -0.3398F, 2.9536F, 1.14F, -1.9301F));

		PartDefinition cube_r146 = bone4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 15).mirror().addBox(-1.194F, -0.923F, -0.3532F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8454F, 1.1053F, -0.62F, -2.5442F, 1.14F, -1.9301F));

		PartDefinition cube_r147 = bone4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 97).mirror().addBox(1.6357F, -0.923F, -1.8327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8454F, 1.1053F, -0.62F, -0.309F, 0.6883F, 0.4577F));

		PartDefinition cube_r148 = bone4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1566F, 2.3771F, -1.8484F, -0.0328F, 0.2753F, 1.5523F));

		PartDefinition cube_r149 = bone4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(118, 89).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4121F, 2.4009F, -0.2882F, -0.2573F, 0.3948F, 0.557F));

		PartDefinition cube_r150 = bone4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(39, 49).mirror().addBox(1.517F, -0.923F, -3.3909F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8454F, 1.1053F, -0.62F, -0.2395F, 0.1409F, 0.6235F));

		PartDefinition cube_r151 = bone4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.483F, -0.58F, -3.4091F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8454F, 1.1053F, -0.62F, -0.3704F, 0.1409F, 0.6235F));

		PartDefinition cube_r152 = bone4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.1694F, -0.6208F, -5.9873F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.3948F, -0.1618F, 0.0542F, -0.5493F, -1.8338F));

		PartDefinition cube_r153 = bone4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(26, 43).mirror().addBox(-1.1694F, -0.0985F, -5.0014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0268F, -1.3948F, -0.1618F, 0.1763F, -0.5493F, -1.8338F));

		PartDefinition cube_r154 = bone4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 36).mirror().addBox(-0.1F, -0.5F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7479F, -0.0225F, -1.6347F, 0.0633F, -0.6532F, -1.8432F));

		PartDefinition cube_r155 = bone4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(51, 18).mirror().addBox(-0.1F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0039F, 0.109F, -1.1276F, -0.2134F, -0.5808F, -1.261F));

		PartDefinition cube_r156 = bone4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.1216F, 0.3966F, 1.8617F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -2.1965F, -0.3137F, 1.5845F));

		PartDefinition cube_r157 = bone4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-2.5858F, 0.3966F, -4.8976F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -0.8816F, 0.0442F, -1.2071F));

		PartDefinition cube_r158 = bone4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-3.6448F, 0.3966F, -4.7072F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -0.8813F, -0.0391F, -1.1062F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(78, 79).mirror().addBox(-5.8066F, 0.3966F, 1.314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -1.2771F, -0.6343F, -0.0547F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(107, 54).mirror().addBox(4.1393F, 0.3966F, 2.1146F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -2.2603F, 0.0391F, 2.0354F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(86, 118).mirror().addBox(0.847F, 0.3966F, 5.6326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -2.1071F, -0.4581F, 1.3484F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.343F, -0.1001F, -2.9557F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -1.9203F, 0.818F, 2.9476F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.9631F, -0.1001F, -3.5027F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6257F, -5.8526F, -5.4092F, -1.731F, 0.8624F, -3.0821F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 30).mirror().addBox(-2.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9919F, -7.7667F, -3.5409F, -0.7071F, 0.7369F, -1.784F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(118, 81).mirror().addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5548F, -7.8285F, -2.5978F, -1.9341F, 1.0301F, 3.0323F));

		PartDefinition cube_r166 = bone4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0032F, -4.2584F, -2.2804F, -2.8362F, -0.4614F, 1.8365F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(43, 36).mirror().addBox(-7.3846F, -0.9106F, -1.4459F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4731F, -1.5231F, -5.2253F, -2.5954F, 0.3864F, 2.104F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.8F, -0.45F, -0.425F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5371F, -5.4079F, -4.7266F, -2.2506F, -0.4117F, 1.5056F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(52, 108).mirror().addBox(-0.6F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8044F, 0.239F, 3.0484F, 1.5267F, 1.1847F, -0.5131F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(29, 108).mirror().addBox(-0.6F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8044F, 0.239F, 3.0484F, 2.444F, 0.9451F, 0.5086F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(31, 105).mirror().addBox(-3.6F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2955F, 1.5051F, 3.328F, 1.9209F, -1.1588F, 2.2969F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(105, 22).mirror().addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.251F, 0.1099F, 1.456F, 1.3788F, -1.1956F, 2.9552F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(104, 51).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9291F, -1.1158F, -3.3734F, -1.6029F, -0.1893F, 1.3503F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(103, 32).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1041F, -1.2094F, -0.2426F, -1.6236F, -0.9305F, 1.3866F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(52, 114).addBox(0.0F, -2.4354F, -0.9789F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2109F, 0.1038F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(32, 56).addBox(0.0F, -2.7589F, -1.0042F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.053F, -3.7781F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(35, 50).addBox(0.0F, -2.5F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6693F, -1.8171F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-1.8F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6005F, -0.2507F, -0.2599F, -0.1556F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(116, 48).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8375F, -0.7612F, -4.3021F, -0.3209F, -0.1792F, -0.2322F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-2.2F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2595F, -0.2382F, -0.2482F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 28).addBox(-0.2F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6005F, -0.2507F, 0.2599F, 0.1556F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(116, 48).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8375F, -0.7612F, -4.3021F, -0.3209F, 0.1792F, 0.2322F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 72).addBox(-0.8F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2595F, 0.2382F, 0.2482F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.2358F, 0.0339F, -0.0082F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(49, 118).addBox(0.0F, -2.9408F, -0.9776F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0309F, -1.1576F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 121).addBox(0.0F, -2.6594F, -0.0811F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(113, 98).mirror().addBox(-1.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5457F, 0.4503F, -3.5037F, 0.2366F, 0.0489F, -0.3432F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-1.836F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2369F, -1.6803F, 0.1812F, -0.076F, -0.2985F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(113, 98).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5457F, 0.4503F, -3.5037F, 0.2366F, -0.0489F, 0.3432F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(111, 51).addBox(-0.164F, 0.1116F, -0.4114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2369F, -1.6803F, 0.1812F, 0.076F, 0.2985F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 42).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(116, 46).mirror().addBox(-1.2F, 0.3F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9724F, 0.1719F, -0.7506F, 0.266F, 0.218F, -0.3033F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(112, 44).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.3939F, 0.4873F, -1.3207F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.157F, 0.5987F, -0.8687F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, 0.0258F, 0.616F, -0.5501F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(116, 46).addBox(-0.8F, 0.3F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9724F, 0.1719F, -0.7506F, 0.266F, -0.218F, 0.3033F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(112, 44).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.3939F, -0.4873F, 1.3207F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(94, 27).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.157F, -0.5987F, 0.8687F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(93, 60).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, 0.0258F, -0.616F, 0.5501F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(73, 116).addBox(0.0F, -3.0611F, -1.0182F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3368F, 0.0319F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(70, 116).addBox(0.0F, -2.8088F, 0.0394F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.3316F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(53, 24).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(76, 116).addBox(0.0F, -2.9745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(26, 37).addBox(0.0F, -3.0501F, 0.0278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(64, 94).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.2535F, 0.442F, -0.6923F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.3604F, 0.3624F, -0.9636F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4156F, -0.4678F, 0.1988F, -1.3458F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.2386F, 0.4531F, -0.6858F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.3496F, 0.3767F, -0.9597F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-11.1256F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4156F, -0.4638F, 0.2158F, -1.345F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(64, 94).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.2535F, -0.442F, 0.6923F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(94, 33).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.3604F, -0.3624F, 0.9636F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(72, 45).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4156F, -0.4678F, -0.1988F, 1.3458F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(94, 31).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.2386F, -0.4531F, 0.6858F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(94, 29).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.3496F, -0.3767F, 0.9597F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(51, 16).addBox(5.1255F, -3.0192F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4156F, -0.4638F, -0.2158F, 1.345F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(35, 55).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(93, 116).addBox(0.0F, -2.8745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r218 = body5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(83, 116).addBox(0.0F, -2.7501F, 0.0278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.2974F, 0.4082F, -0.7104F));

		PartDefinition cube_r220 = body5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(94, 87).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.3918F, 0.3193F, -0.9741F));

		PartDefinition cube_r221 = body5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4796F, 0.1478F, -1.3478F));

		PartDefinition cube_r222 = body5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.2974F, 0.4082F, -0.7104F));

		PartDefinition cube_r223 = body5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(94, 74).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.3918F, 0.3193F, -0.9741F));

		PartDefinition cube_r224 = body5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4796F, 0.1478F, -1.3478F));

		PartDefinition cube_r225 = body5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(94, 89).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.2974F, -0.4082F, 0.7104F));

		PartDefinition cube_r226 = body5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(94, 87).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.3918F, -0.3193F, 0.9741F));

		PartDefinition cube_r227 = body5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(30, 30).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4796F, -0.1478F, 1.3478F));

		PartDefinition cube_r228 = body5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 76).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.2974F, -0.4082F, 0.7104F));

		PartDefinition cube_r229 = body5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(94, 74).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.3918F, -0.3193F, 0.9741F));

		PartDefinition cube_r230 = body5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(15, 24).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4796F, -0.1478F, 1.3478F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(46, 55).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.1136F, 0.052F, 0.0059F));

		PartDefinition cube_r231 = body6.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(96, 116).addBox(0.0F, -2.8745F, 0.0098F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r232 = body6.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(12, 74).addBox(0.0F, -3.2501F, 0.0278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r233 = body6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.3951F, 0.3269F, -0.7456F));

		PartDefinition cube_r234 = body6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.462F, 0.2175F, -0.9927F));

		PartDefinition cube_r235 = body6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(21, 10).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5065F, 0.0286F, -1.3502F));

		PartDefinition cube_r236 = body6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(96, 14).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4086F, 0.315F, -0.7498F));

		PartDefinition cube_r237 = body6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4717F, 0.2029F, -0.9948F));

		PartDefinition cube_r238 = body6.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-15.1256F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5104F, 0.0116F, -1.3503F));

		PartDefinition cube_r239 = body6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(96, 35).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.3951F, -0.3269F, 0.7456F));

		PartDefinition cube_r240 = body6.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(96, 16).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.462F, -0.2175F, 0.9927F));

		PartDefinition cube_r241 = body6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 10).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5065F, -0.0286F, 1.3502F));

		PartDefinition cube_r242 = body6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(96, 14).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4086F, -0.315F, 0.7498F));

		PartDefinition cube_r243 = body6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(12, 95).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4717F, -0.2029F, 0.9948F));

		PartDefinition cube_r244 = body6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 8).addBox(5.1255F, -3.0192F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5104F, -0.0116F, 1.3503F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(49, 30).addBox(-0.5F, -0.4312F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0436F, 0.0174F, 0.0008F));

		PartDefinition cube_r245 = body7.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(80, 112).addBox(0.0F, -3.4745F, 0.0098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -0.9471F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r246 = body7.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(39, 111).addBox(0.0F, -3.8501F, 0.0278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4312F, -2.9471F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r247 = body7.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(64, 96).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.4485F, 0.2791F, -0.7615F));

		PartDefinition cube_r248 = body7.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(96, 62).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5006F, 0.1589F, -1.0F));

		PartDefinition cube_r249 = body7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5218F, -0.0395F, -1.3501F));

		PartDefinition cube_r250 = body7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 96).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.4485F, 0.2791F, -0.7615F));

		PartDefinition cube_r251 = body7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5006F, 0.1589F, -1.0F));

		PartDefinition cube_r252 = body7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(15, 26).mirror().addBox(-14.1256F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5218F, -0.0395F, -1.3501F));

		PartDefinition cube_r253 = body7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(64, 96).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.4485F, -0.2791F, 0.7615F));

		PartDefinition cube_r254 = body7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(96, 62).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5006F, -0.1589F, 1.0F));

		PartDefinition cube_r255 = body7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(15, 28).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5218F, 0.0395F, 1.3501F));

		PartDefinition cube_r256 = body7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 96).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.4485F, -0.2791F, 0.7615F));

		PartDefinition cube_r257 = body7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(96, 37).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5006F, -0.1589F, 1.0F));

		PartDefinition cube_r258 = body7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(15, 26).addBox(5.1255F, -3.0192F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5218F, 0.0395F, 1.3501F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0536F, -3.8395F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(73, 104).addBox(0.0F, -4.6226F, -0.0168F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(7, 67).addBox(0.0F, -4.8222F, -0.0133F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.2235F, 0.4641F, -0.6791F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(96, 68).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.3388F, 0.391F, -0.9556F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(43, 40).mirror().addBox(-12.1256F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4598F, 0.2328F, -1.3441F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.2235F, 0.4641F, -0.6791F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.3388F, 0.391F, -0.9556F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(30, 34).mirror().addBox(-13.1256F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4598F, 0.2328F, -1.3441F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(57, 57).mirror().addBox(-5.5F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.001F, 13.9102F, 0.1935F, -0.0014F, 0.3022F, 0.4647F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-5.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1257F, 13.9972F, 1.9787F, 0.102F, 0.3639F, 0.452F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(16, 56).mirror().addBox(-5.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 12.9225F, -1.6082F, -0.1928F, 0.0929F, 0.5345F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-5.6F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5052F, 13.8315F, 3.109F, -0.0639F, 0.5357F, 0.3525F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-6.8F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4723F, 13.7919F, 3.2986F, -0.0807F, 0.7262F, 0.4454F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(29, 12).mirror().addBox(-8.5F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.345F, 13.8034F, 3.2694F, -0.2408F, 0.9146F, 0.32F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-13.1F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9773F, 14.096F, 2.6257F, -0.0125F, 1.0819F, 0.6428F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(21, 6).mirror().addBox(-11.2F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9773F, 14.096F, 2.6257F, -0.1751F, 1.0377F, 0.4457F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(96, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.2235F, -0.4641F, 0.6791F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(96, 68).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.3388F, -0.391F, 0.9556F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(43, 40).addBox(5.1255F, -3.0192F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4598F, -0.2328F, 1.3441F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(96, 66).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.2235F, -0.4641F, 0.6791F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(96, 64).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.3388F, -0.391F, 0.9556F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(30, 34).addBox(5.1255F, -3.0192F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4598F, -0.2328F, 1.3441F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(39, 43).addBox(-2.0856F, -1.0209F, 0.0041F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0856F, 14.3034F, -0.7201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.001F, 13.9102F, 0.1935F, -0.0014F, -0.3022F, -0.4647F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(57, 55).addBox(-0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1257F, 13.9972F, 1.9787F, 0.102F, -0.3639F, -0.452F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(15, 30).addBox(-2.1131F, -0.946F, -4.9459F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1131F, 13.119F, -2.4389F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(16, 56).addBox(-0.9F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 12.9225F, -1.6082F, -0.1928F, -0.0929F, -0.5345F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 58).addBox(-1.0F, -0.9035F, -1.5298F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 13.93F, -1.0767F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 28).addBox(-1.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5052F, 13.8315F, 3.109F, -0.0639F, -0.5357F, -0.3525F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 32).addBox(-1.2F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4723F, 13.7919F, 3.2986F, -0.0807F, -0.7262F, -0.4454F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(29, 12).addBox(-0.5F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.345F, 13.8034F, 3.2694F, -0.2408F, -0.9146F, -0.32F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 13).addBox(0.1F, 0.0F, -0.5F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9773F, 14.096F, 2.6257F, -0.0125F, -1.0819F, -0.6428F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(21, 6).addBox(-0.8F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9773F, 14.096F, 2.6257F, -0.1751F, -1.0377F, -0.4457F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3104F, -3.4549F, 0.3753F, 0.0162F, 0.0064F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(99, 116).addBox(0.0F, -2.5489F, -0.0609F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(10, 113).addBox(0.0F, -4.1489F, 0.0391F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.5647F, -0.2268F, -1.3444F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.6039F, -0.0032F, -1.008F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -0.4788F, -0.5885F, 0.1444F, -0.791F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 6).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.5647F, 0.2268F, 1.3444F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(92, 96).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.6039F, 0.0032F, 1.008F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(96, 82).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -0.4788F, -0.5885F, -0.1444F, 0.791F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(71, 35).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4957F, 5.6824F, -3.912F, -0.2731F, 0.1245F, -0.0407F));

		PartDefinition cube_r302 = leftarm.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(105, 62).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftarm.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(80, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6763F, 0.6456F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftarm.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(52, 105).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 9.6699F, 0.7588F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftarm.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(105, 43).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftarm.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(96, 78).addBox(-1.0F, -1.5306F, -0.7847F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(105, 40).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(38, 105).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftarm.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(24, 50).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.6022F, 0.0014F, -0.001F));

		PartDefinition cube_r308 = leftarm.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r309 = leftarm.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 78).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftarm.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(13, 115).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.327F, 0.4835F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftarm.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(73, 96).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftarm.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, -4.5F, 0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftarm.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(105, 35).addBox(-0.5F, -1.0F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9847F, 1.9985F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftarm.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(21, 94).addBox(-0.5F, -0.2F, 1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.9644F, 1.4704F, -1.0428F, -0.0964F, 0.0887F));

		PartDefinition cube_r315 = leftarm2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(80, 36).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, -2.12F, -1.2014F, 1.5708F, 0.5498F, -1.5708F));

		PartDefinition cube_r316 = leftarm2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(62, 18).addBox(-1.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1764F, -3.0396F, 0.0848F, 1.5708F, 0.9425F, -1.5708F));

		PartDefinition cube_r317 = leftarm2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(83, 106).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3236F, -1.2532F, 0.7182F, 1.5708F, 1.2043F, -1.5708F));

		PartDefinition cube_r318 = leftarm2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(76, 106).addBox(-0.6F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -0.1643F, -0.4018F, 1.5708F, -0.4102F, -1.5708F));

		PartDefinition cube_r319 = leftarm2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(59, 106).addBox(-0.5028F, -1.3199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3236F, 0.311F, 1.2776F, 1.5708F, -0.1047F, -1.5708F));

		PartDefinition cube_r320 = leftarm2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(45, 106).addBox(-0.9F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3206F, 0.6704F, 0.8146F, 1.5708F, 0.0698F, -1.5708F));

		PartDefinition cube_r321 = leftarm2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(80, 96).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2236F, 1.4712F, 0.8736F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r322 = leftarm2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(59, 73).addBox(-1.0F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2146F, 6.2387F, 2.331F, 1.5708F, -1.021F, -1.5708F));

		PartDefinition cube_r323 = leftarm2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(103, 26).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2146F, 4.4117F, 1.5175F, 1.5708F, -1.1519F, -1.5708F));

		PartDefinition cube_r324 = leftarm2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, -1.0F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 2.5565F, -1.6145F, -1.5708F, -0.576F, 1.5708F));

		PartDefinition cube_r325 = leftarm2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(29, 116).addBox(-1.0292F, -0.1611F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7764F, 0.5922F, -0.8512F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r326 = leftarm2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(108, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.2176F, 3.0995F, -0.3172F, 1.5708F, -1.0996F, -1.5708F));

		PartDefinition cube_r327 = leftarm2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(105, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2176F, 0.1597F, -0.9153F, 1.5708F, -1.3701F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 12.6547F, 5.6377F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftArm3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(60, 112).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1738F, 1.0204F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftArm3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 106).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3559F, -0.1912F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftArm4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(57, 65).addBox(-1.1F, -1.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1177F, 0.8219F, 0.252F, 0.0411F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7879F, 0.2121F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftArm5.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(118, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2141F, 3.2913F, 0.3536F, 0.0206F, 0.0356F, -1.0468F));

		PartDefinition cube_r332 = leftArm5.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(108, 82).addBox(-1.0F, 0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0177F, -0.1772F, 0.2108F, 0.0397F, 0.0106F, -0.2616F));

		PartDefinition cube_r333 = leftArm5.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(118, 95).addBox(0.0F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.3225F, 2.7295F, 0.3305F, 0.019F, -0.0365F, 1.0905F));

		PartDefinition cube_r334 = leftArm5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(108, 93).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9823F, 0.3223F, 0.2314F, 0.0392F, -0.0124F, 0.3052F));

		PartDefinition cube_r335 = leftArm5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(15, 122).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(10, 122).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2727F, 3.9611F, 0.4382F, -0.5455F, 0.4786F, 0.6491F));

		PartDefinition cube_r336 = leftArm5.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 92).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3082F, 3.9611F, 0.4382F, -0.5455F, 0.4786F, 0.6491F));

		PartDefinition cube_r337 = leftArm5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(37, 80).addBox(-1.1F, -1.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1177F, 0.8219F, 0.252F, 0.0411F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4957F, 5.6824F, -3.912F, -0.3603F, -0.1245F, 0.0407F));

		PartDefinition cube_r338 = rightarm.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(110, 11).addBox(-1.0F, -0.234F, -0.4311F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightarm.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(80, 83).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6763F, 0.6456F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightarm.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(7, 110).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 9.6699F, 0.7588F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightarm.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 110).addBox(-1.0F, -0.1534F, -0.7039F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightarm.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(12, 101).addBox(-1.0F, -1.5306F, -0.7847F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(109, 104).addBox(-1.0F, -1.1306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(109, 101).addBox(-1.0F, -0.7306F, -0.0847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 9.3436F, 1.9001F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightarm.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(51, 10).addBox(-1.0F, -1.5F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.6022F, -0.0014F, 0.001F));

		PartDefinition cube_r344 = rightarm.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(50, 49).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r345 = rightarm.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(73, 83).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3226F, -0.3972F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightarm.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(115, 85).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.327F, 0.4835F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightarm.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.4133F, -0.928F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightarm.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(7, 83).addBox(-0.5F, -4.5F, 0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightarm.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(88, 109).addBox(-0.5F, -1.0F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.9847F, 1.9985F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightarm.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 100).addBox(-0.5F, -0.2F, 1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.9644F, 1.4704F, -1.1737F, 0.0964F, -0.0887F));

		PartDefinition cube_r351 = rightarm2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(84, 10).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, -2.12F, -1.2014F, 1.5708F, -0.5498F, 1.5708F));

		PartDefinition cube_r352 = rightarm2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(32, 67).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1764F, -3.0396F, 0.0848F, 1.5708F, -0.9425F, 1.5708F));

		PartDefinition cube_r353 = rightarm2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(19, 110).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3236F, -1.2532F, 0.7182F, 1.5708F, -1.2043F, 1.5708F));

		PartDefinition cube_r354 = rightarm2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(110, 33).addBox(-1.4F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3236F, -0.1643F, -0.4018F, 1.5708F, 0.4102F, 1.5708F));

		PartDefinition cube_r355 = rightarm2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(110, 30).addBox(-1.4972F, -1.3199F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.3236F, 0.311F, 1.2776F, 1.5708F, 0.1047F, 1.5708F));

		PartDefinition cube_r356 = rightarm2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(110, 19).addBox(-1.1F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3206F, 0.6704F, 0.8146F, 1.5708F, -0.0698F, 1.5708F));

		PartDefinition cube_r357 = rightarm2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(26, 101).addBox(0.0F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2236F, 1.4712F, 0.8736F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition cube_r358 = rightarm2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(7, 74).addBox(0.0F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2146F, 6.2387F, 2.331F, 1.5708F, 1.021F, 1.5708F));

		PartDefinition cube_r359 = rightarm2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(103, 72).addBox(0.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2146F, 4.4117F, 1.5175F, 1.5708F, 1.1519F, 1.5708F));

		PartDefinition cube_r360 = rightarm2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(21, 3).addBox(-12.0F, -1.0F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7764F, 2.5565F, -1.6145F, -1.5708F, 0.576F, -1.5708F));

		PartDefinition cube_r361 = rightarm2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(34, 116).addBox(0.0292F, -0.1611F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7764F, 0.5922F, -0.8512F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r362 = rightarm2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(110, 14).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2176F, 3.0995F, -0.3172F, 1.5708F, 1.0996F, 1.5708F));

		PartDefinition cube_r363 = rightarm2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(14, 110).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2176F, 0.1597F, -0.9153F, 1.5708F, 1.3701F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 12.6547F, 5.6377F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightArm3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(65, 112).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.1738F, 1.0204F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightArm3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(110, 36).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3559F, -0.1912F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightArm4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 67).addBox(-0.9F, -1.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1177F, 0.8219F, 0.252F, 0.0411F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7879F, 0.2121F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightArm5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(122, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2141F, 3.2913F, 0.3536F, 0.0206F, -0.0356F, 1.0468F));

		PartDefinition cube_r368 = rightArm5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(110, 107).addBox(0.0F, 0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0177F, -0.1772F, 0.2108F, 0.0397F, -0.0106F, 0.2616F));

		PartDefinition cube_r369 = rightArm5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(122, 36).addBox(-1.0F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3225F, 2.7295F, 0.3305F, 0.019F, 0.0365F, -1.0905F));

		PartDefinition cube_r370 = rightArm5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(110, 65).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9823F, 0.3223F, 0.2314F, 0.0392F, 0.0124F, -0.3052F));

		PartDefinition cube_r371 = rightArm5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(122, 33).addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(122, 30).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2727F, 3.9611F, 0.4382F, -0.5455F, -0.4786F, -0.6491F));

		PartDefinition cube_r372 = rightArm5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(122, 16).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3082F, 3.9611F, 0.4382F, -0.5455F, -0.4786F, -0.6491F));

		PartDefinition cube_r373 = rightArm5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(12, 84).addBox(-0.9F, -1.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1177F, 0.8219F, 0.252F, 0.0411F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3061F, 1.2485F, -1.0873F, -0.0028F, -0.084F, 0.0066F));

		PartDefinition cube_r374 = bone2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(79, 47).addBox(-0.5F, -2.0F, -1.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.3166F, 0.169F, -0.3803F));

		PartDefinition cube_r375 = bone2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(87, 74).addBox(-0.5F, -2.0F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.9711F, 0.169F, -0.3803F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(71, 89).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0351F, 1.5321F, 2.6315F, 3.0389F, 0.169F, -0.3803F));

		PartDefinition cube_r377 = bone2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(103, 78).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0611F, 1.169F, 3.5629F, 1.9044F, 0.169F, -0.3803F));

		PartDefinition cube_r378 = bone2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(64, 24).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1755F, -0.5485F, 6.0112F, 0.5954F, 0.169F, -0.3803F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(89, 67).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4349F, -1.8753F, 7.4851F, -0.8444F, 0.169F, -0.3803F));

		PartDefinition cube_r380 = bone2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(5, 113).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7136F, -2.7523F, 7.8763F, -1.9789F, 0.169F, -0.3803F));

		PartDefinition cube_r381 = bone2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 15).addBox(-0.1F, 0.0F, -8.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2589F, 0.8412F, -0.4381F, -2.4976F, -0.3605F, 0.1675F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9144F, -5.0949F, 6.4373F, -2.6334F, 0.169F, -0.3803F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(60, 116).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2282F, -5.4814F, 5.5701F, 2.6462F, 0.169F, -0.3803F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(89, 62).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5839F, -5.4664F, 3.602F, 1.5117F, 0.169F, -0.3803F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(21, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.671F, -4.8156F, 1.7128F, 0.29F, 0.169F, -0.3803F));

		PartDefinition cube_r386 = bone2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(16, 64).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5132F, -3.6706F, 0.0806F, -0.9753F, 0.169F, -0.3803F));

		PartDefinition cube_r387 = bone2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(89, 35).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0949F, -2.0928F, -1.0749F, -2.1971F, 0.169F, -0.3803F));

		PartDefinition cube_r388 = bone2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(19, 89).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5127F, -0.3131F, -1.7777F, 2.7771F, 0.169F, -0.3803F));

		PartDefinition cube_r389 = bone2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1205F, 0.604F, -1.7065F, -3.0697F, 0.169F, -0.3803F));

		PartDefinition cube_r390 = bone2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(85, 96).addBox(-2.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8383F, 1.4405F, -2.4F, 1.6098F, 0.169F, -0.3803F));

		PartDefinition cube_r391 = bone2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(86, 57).addBox(-1.5272F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition bone3 = neck2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3061F, 1.2485F, -1.0873F, -0.0028F, 0.084F, -0.0066F));

		PartDefinition cube_r392 = bone3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.5F, -2.0F, -1.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.3166F, -0.169F, 0.3803F));

		PartDefinition cube_r393 = bone3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.5F, -2.0F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.9711F, -0.169F, 0.3803F));

		PartDefinition cube_r394 = bone3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0351F, 1.5321F, 2.6315F, 3.0389F, -0.169F, 0.3803F));

		PartDefinition cube_r395 = bone3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(103, 78).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0611F, 1.169F, 3.5629F, 1.9044F, -0.169F, 0.3803F));

		PartDefinition cube_r396 = bone3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1755F, -0.5485F, 6.0112F, 0.5954F, -0.169F, 0.3803F));

		PartDefinition cube_r397 = bone3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(89, 67).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4349F, -1.8753F, 7.4851F, -0.8444F, -0.169F, 0.3803F));

		PartDefinition cube_r398 = bone3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 113).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7136F, -2.7523F, 7.8763F, -1.9789F, -0.169F, 0.3803F));

		PartDefinition cube_r399 = bone3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.9F, 0.0F, -8.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2589F, 0.8412F, -0.4381F, -2.4976F, 0.3605F, -0.1675F));

		PartDefinition cube_r400 = bone3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9144F, -5.0949F, 6.4373F, -2.6334F, -0.169F, 0.3803F));

		PartDefinition cube_r401 = bone3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(60, 116).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2282F, -5.4814F, 5.5701F, 2.6462F, -0.169F, 0.3803F));

		PartDefinition cube_r402 = bone3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(89, 62).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.5839F, -5.4664F, 3.602F, 1.5117F, -0.169F, 0.3803F));

		PartDefinition cube_r403 = bone3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.671F, -4.8156F, 1.7128F, 0.29F, -0.169F, 0.3803F));

		PartDefinition cube_r404 = bone3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.5132F, -3.6706F, 0.0806F, -0.9753F, -0.169F, 0.3803F));

		PartDefinition cube_r405 = bone3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(89, 35).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0949F, -2.0928F, -1.0749F, -2.1971F, -0.169F, 0.3803F));

		PartDefinition cube_r406 = bone3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5127F, -0.3131F, -1.7777F, 2.7771F, -0.169F, 0.3803F));

		PartDefinition cube_r407 = bone3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1205F, 0.604F, -1.7065F, -3.0697F, -0.169F, 0.3803F));

		PartDefinition cube_r408 = bone3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(85, 96).mirror().addBox(0.1F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8383F, 1.4405F, -2.4F, 1.6098F, -0.169F, 0.3803F));

		PartDefinition cube_r409 = bone3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-0.4728F, -3.2929F, -3.6175F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r410 = neck.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(62, 12).addBox(0.0F, -1.7828F, -0.0159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r411 = neck.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(64, 71).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r412 = neck3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(116, 100).addBox(0.0F, -2.9F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0217F, -2.8628F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r413 = neck4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -0.5F, -2.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.388F, -1.7721F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(21, 15).addBox(-0.5F, -0.3751F, -7.0256F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(63, 42).addBox(0.0F, -1.3751F, -6.4256F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1776F, -3.7861F, -0.2533F, 0.0422F, -0.0109F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(38, 14).addBox(-0.5F, -0.3751F, -5.0256F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F))
				.texOffs(89, 14).addBox(0.0F, -1.2751F, -3.8256F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0684F, -6.8121F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(16, 58).addBox(-0.5F, -0.375F, -4.0256F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0087F, -4.9508F, 0.0435F, -0.0038F, 0.0872F));

		PartDefinition cube_r414 = neck7.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(13, 44).addBox(0.0F, -0.7F, -2.8F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.375F, -1.5256F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, -0.3751F, -4.0256F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0194F, -3.9276F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r415 = neck8.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(108, 25).mirror().addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8674F, -1.2431F, 0.121F, -0.05F, 0.3897F));

		PartDefinition cube_r416 = neck8.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(108, 25).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8674F, -1.2431F, 0.121F, 0.05F, -0.3897F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.137F, -2.9973F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(78, 75).addBox(0.0F, -1.0F, -2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.004F, -2.0761F, -2.7407F, 2.6442F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(72, 40).addBox(-1.5F, -2.0F, -0.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.5254F, -0.0919F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(0, 97).addBox(-1.5F, -0.7F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0876F, -1.3552F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(50, 78).addBox(-1.5F, 0.075F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.6704F, -1.7919F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 5.1948F, -1.9086F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, -1.3F, 1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.5F, 6.2627F, -1.8289F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(18, 115).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.004F, 5.6787F, -5.7974F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(115, 14).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.004F, 6.6777F, -5.7538F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(120, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.004F, 7.6692F, -5.8843F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(107, 116).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.004F, 7.09F, -5.3037F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(82, 23).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 10.7358F, -4.5864F, -1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(120, 65).addBox(-1.55F, -1.0543F, -1.0486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.996F, 12.6881F, -4.8871F, -3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(52, 120).addBox(-1.55F, -1.4249F, -0.146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.996F, 12.6881F, -4.8871F, -2.2602F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(66, 109).addBox(-1.996F, -0.7903F, 0.0569F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 120).addBox(-1.55F, -0.7903F, -0.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.996F, 12.6881F, -4.8871F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(81, 53).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 9.1514F, -3.3667F, -1.692F, 0.0112F, 0.0017F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(81, 40).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 8.8515F, -3.9986F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(59, 109).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 6.8794F, -5.402F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(81, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.8856F, -5.5589F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(89, 19).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 3.8856F, -5.5502F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.8902F, -5.4543F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(117, 119).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.907F, -5.2721F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(112, 119).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.9559F, -4.9631F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(107, 119).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0192F, -4.6128F, 2.7838F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(119, 103).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.8468F, -4.1128F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(102, 119).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6401F, -3.5041F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(102, 116).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.428F, -3.0091F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 8.7298F, -8.5083F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 117).addBox(2.5884F, -1.6304F, 3.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.488F, -4.809F, 5.2933F, 0.5196F, 0.6906F, -0.8391F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(113, 94).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8007F, -10.0072F, 5.3885F, 0.9576F, 0.0439F, -0.0567F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(120, 75).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1782F, -5.6412F, 3.1019F, 1.6698F, -0.0486F, -2.3655F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(112, 116).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.922F, -6.2686F, 3.7203F, 1.4099F, -0.0679F, -0.3959F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(66, 12).addBox(-0.925F, -1.875F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.9337F, -9.062F, 4.2823F, -0.6054F, 0.285F, -0.1971F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(64, 65).addBox(-0.925F, -1.875F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8766F, -7.3559F, 3.7111F, -0.345F, 0.3529F, -0.0901F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -1.125F, -1.55F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3366F, -3.2395F, 5.3485F, -0.1643F, 0.3588F, -0.0726F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(61, 48).addBox(-0.7399F, -2.2637F, -1.9511F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.363F, -4.959F, 5.0683F, -0.2079F, 0.3588F, -0.0726F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(30, 120).addBox(-0.85F, -1.0543F, -1.0486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.421F, 3.9582F, 3.6212F, -3.0456F, 0.0F, 0.1745F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(120, 72).addBox(-1.0594F, -1.4044F, -0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.421F, 3.9582F, 3.6212F, -2.2426F, -0.0292F, -0.0265F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(80, 121).addBox(0.2F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 121).addBox(0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.425F, -0.8641F, 3.2714F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(63, 98).addBox(0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.425F, 0.104F, 3.5218F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(92, 98).addBox(0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.425F, 0.4234F, 3.7625F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(99, 91).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.825F, 1.106F, 3.9297F, -1.5785F, 0.004F, 0.48F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(98, 43).addBox(0.2F, -0.8F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.425F, 1.206F, 3.9288F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(20, 120).addBox(-0.85F, -1.4249F, -0.146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.421F, 3.9582F, 3.6212F, -2.2602F, 0.0F, 0.1745F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(25, 120).addBox(-0.85F, -0.7903F, 0.0569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 120).addBox(-0.85F, -0.7903F, -0.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.421F, 3.9582F, 3.6212F, -1.5097F, 0.0F, 0.1745F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 8.7298F, -8.5083F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(0, 117).mirror().addBox(-3.5884F, -1.6304F, 3.9207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.488F, -4.809F, 5.2933F, 0.5196F, -0.6906F, 0.8391F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8007F, -10.0072F, 5.3885F, 0.9576F, -0.0439F, 0.0567F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(120, 75).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1782F, -5.6412F, 3.1019F, 1.6698F, 0.0486F, 2.3655F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(112, 116).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.922F, -6.2686F, 3.7203F, 1.4099F, 0.0679F, 0.3959F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(-0.075F, -1.875F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.9337F, -9.062F, 4.2823F, -0.6054F, -0.285F, 0.1971F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.075F, -1.875F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -7.3559F, 3.7111F, -0.345F, -0.3529F, 0.0901F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -1.125F, -1.55F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3366F, -3.2395F, 5.3485F, -0.1643F, -0.3588F, 0.0726F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(61, 48).mirror().addBox(-0.2601F, -2.2637F, -1.9511F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.363F, -4.959F, 5.0683F, -0.2079F, -0.3588F, 0.0726F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(30, 120).mirror().addBox(-0.15F, -1.0543F, -1.0486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.421F, 3.9582F, 3.6212F, -3.0456F, 0.0F, -0.1745F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(120, 72).mirror().addBox(0.0594F, -1.4044F, -0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.421F, 3.9582F, 3.6212F, -2.2426F, 0.0292F, 0.0265F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(80, 121).mirror().addBox(-1.2F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 121).mirror().addBox(-1.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.425F, -0.8641F, 3.2714F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(-1.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.425F, 0.104F, 3.5218F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-1.2F, -0.8F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.425F, 0.4234F, 3.7625F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.106F, 3.9297F, -1.5785F, -0.004F, -0.48F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-1.2F, -0.8F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.425F, 1.206F, 3.9288F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(20, 120).mirror().addBox(-0.15F, -1.4249F, -0.146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.421F, 3.9582F, 3.6212F, -2.2602F, 0.0F, -0.1745F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(25, 120).mirror().addBox(-0.15F, -0.7903F, 0.0569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 120).mirror().addBox(-0.15F, -0.7903F, -0.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.421F, 3.9582F, 3.6212F, -1.5097F, 0.0F, -0.1745F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4019F, 8.0129F, -5.8635F, -0.0522F, 0.0046F, 0.0871F));

		PartDefinition cube_r477 = leftOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(106, 98).addBox(-1.8779F, -0.5512F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1923F, -8.3438F, 3.5205F, -1.6233F, 0.2253F, 0.9168F));

		PartDefinition cube_r478 = leftOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(95, 106).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2061F, -7.5106F, 4.6333F, -1.7006F, 0.1679F, -0.279F));

		PartDefinition cube_r479 = leftOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(70, 121).addBox(-0.7454F, -1.2468F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.8169F, -5.5474F, 2.9075F, -1.7439F, 0.0548F, -0.3098F));

		PartDefinition cube_r480 = leftOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(40, 121).addBox(-0.7454F, 0.1549F, -1.617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8169F, -5.5474F, 2.9075F, -2.4857F, 0.0548F, -0.3098F));

		PartDefinition cube_r481 = leftOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(47, 98).addBox(-0.8267F, -0.4143F, -2.3586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(117, 116).addBox(-0.8267F, -0.4143F, -3.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8169F, -5.5474F, 2.9075F, -1.83F, 0.0727F, -0.2665F));

		PartDefinition cube_r482 = leftOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(106, 90).addBox(-2.0081F, -0.5743F, -0.0682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1923F, -8.3438F, 3.5205F, -1.6324F, -0.1975F, 0.9685F));

		PartDefinition cube_r483 = leftOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(117, 78).addBox(-0.8267F, -0.4665F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.8169F, -5.5474F, 2.9075F, -1.6991F, 0.0727F, -0.2665F));

		PartDefinition cube_r484 = leftOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(55, 117).addBox(-0.4565F, -0.4095F, -1.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -1.4665F, 0.0441F, 0.0329F));

		PartDefinition cube_r485 = leftOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(5, 123).addBox(-0.3266F, -0.3972F, -1.9379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 2.2408F, -0.0732F, 0.2146F));

		PartDefinition cube_r486 = leftOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(26, 97).addBox(-0.3495F, 0.9716F, -0.6102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 1.1723F, 0.0143F, 0.3048F));

		PartDefinition cube_r487 = leftOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(117, 39).addBox(-0.86F, 1.1597F, -1.6357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4374F, -1.3054F, 2.5561F, -3.0547F, 0.0441F, 0.1332F));

		PartDefinition cube_r488 = leftOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(117, 36).addBox(-0.5546F, -0.2803F, -0.7464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -2.8802F, 0.0441F, 0.1725F));

		PartDefinition cube_r489 = leftOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(117, 33).addBox(-0.4565F, 0.3697F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -2.9849F, 0.0441F, 0.0329F));

		PartDefinition cube_r490 = leftOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(120, 84).addBox(-0.4565F, 0.3663F, 1.085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, 2.1376F, 0.0441F, 0.0329F));

		PartDefinition cube_r491 = leftOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(75, 15).addBox(-0.4565F, 0.8451F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, 3.1412F, 0.0441F, 0.0329F));

		PartDefinition cube_r492 = leftOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(117, 30).addBox(-0.8642F, -2.1508F, 0.6237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.4374F, -1.3054F, 2.5561F, 0.148F, 0.0441F, 0.1332F));

		PartDefinition cube_r493 = leftOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(120, 106).addBox(-0.4565F, -0.4976F, -1.4004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -1.3792F, 0.0441F, 0.0329F));

		PartDefinition cube_r494 = leftOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(23, 117).addBox(-0.5546F, -0.6453F, -0.821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -1.161F, 0.0441F, 0.1725F));

		PartDefinition cube_r495 = leftOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(117, 18).addBox(-0.2996F, -0.5434F, -2.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4374F, -3.4054F, 3.2561F, -1.3788F, 0.05F, -0.0609F));

		PartDefinition cube_r496 = leftOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(35, 121).addBox(-0.7239F, -1.2331F, -0.53F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5687F, -3.75F, 0.7038F, -1.4163F, -0.001F, 0.2421F));

		PartDefinition cube_r497 = leftOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(117, 10).addBox(-0.8156F, -0.6944F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5687F, -3.75F, 0.7038F, -1.2209F, 0.2059F, 0.2748F));

		PartDefinition cube_r498 = leftOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(117, 7).addBox(-0.8156F, -0.3812F, -0.7882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5687F, -3.75F, 0.7038F, 0.8298F, 0.2059F, 0.2748F));

		PartDefinition cube_r499 = leftOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(12, 97).addBox(-0.3773F, -1.813F, -0.211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 1.4427F, 0.1502F, 0.2263F));

		PartDefinition cube_r500 = leftOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(70, 48).addBox(-1.0F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.198F, -1.0675F, 1.3746F, 1.8769F, 0.0179F, 0.4219F));

		PartDefinition cube_r501 = leftOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(0, 92).addBox(-0.2675F, -1.2534F, -1.4968F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4056F, -0.869F, 1.5639F, 3.0132F, 0.0895F, 0.4755F));

		PartDefinition cube_r502 = leftOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(80, 87).addBox(-0.2656F, -1.2153F, -0.5806F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2604F, -0.3093F, 1.7926F, 1.8774F, 0.0047F, 0.2105F));

		PartDefinition cube_r503 = leftOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(53, 82).addBox(-1.0F, -0.525F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5332F, -3.4871F, 0.4592F, 1.6327F, 0.0005F, 0.1185F));

		PartDefinition cube_r504 = leftOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(76, 109).addBox(-1.4204F, -1.5867F, -1.2951F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 82).addBox(-1.4204F, -1.7617F, -1.3201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 1.7542F, 0.1224F, 0.0954F));

		PartDefinition cube_r505 = leftOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(75, 121).addBox(-0.3424F, -1.4701F, -0.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 117).addBox(-0.3424F, -1.4701F, -0.7308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 2.2798F, 0.1973F, 0.1528F));

		PartDefinition cube_r506 = leftOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(97, 4).addBox(-0.3193F, -1.7593F, -1.3687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, -2.0185F, 0.0379F, 0.2944F));

		PartDefinition cube_r507 = leftOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(117, 4).addBox(-0.388F, -1.663F, -0.7205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, -2.7371F, 0.0203F, 0.1877F));

		PartDefinition cube_r508 = leftOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(12, 90).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3541F, 0.7494F, 2.2516F, -3.0431F, -0.0041F, -0.0742F));

		PartDefinition cube_r509 = leftOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(7, 98).addBox(-0.7F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6476F, 2.1054F, 2.3798F, 2.9509F, 0.0303F, -0.0353F));

		PartDefinition cube_r510 = leftOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(90, 51).addBox(-0.5F, -0.2558F, -0.7459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(115, 65).addBox(-0.5F, -1.3558F, -0.7459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.351F, 0.9753F, 2.501F, 2.8274F, 0.0204F, -0.0868F));

		PartDefinition cube_r511 = leftOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(19, 100).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5544F, 5.5205F, 2.0218F, 2.7118F, 0.1353F, -0.0539F));

		PartDefinition cube_r512 = leftOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(100, 8).addBox(-0.5F, -0.5508F, -1.0087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(99, 98).addBox(-0.5F, 0.1992F, -1.1087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5452F, 4.8488F, 2.2443F, 2.9708F, 0.1749F, -0.0723F));

		PartDefinition cube_r513 = leftOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(91, 22).addBox(-0.3004F, -4.2638F, -0.104F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.074F, -0.0686F, 4.048F, 2.9802F, 0.0444F, -0.0713F));

		PartDefinition cube_r514 = leftOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(33, 86).addBox(-0.3004F, -2.6877F, -0.3056F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.074F, -0.0686F, 4.048F, 2.8493F, 0.0444F, -0.0713F));

		PartDefinition cube_r515 = leftOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(82, 68).addBox(-0.1F, -0.3F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 62).addBox(-0.1F, -0.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1684F, -0.4272F, 2.7042F, 2.9715F, 0.0444F, 0.0509F));

		PartDefinition cube_r516 = leftOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(90, 5).addBox(-0.2584F, -1.0691F, -1.2208F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2604F, -0.3093F, 1.7926F, 3.0132F, 0.0895F, 0.2224F));

		PartDefinition cube_r517 = leftOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(97, 0).addBox(-0.388F, -1.4903F, -1.4328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9786F, -2.4375F, 1.7697F, 3.0137F, 0.0203F, 0.1877F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4019F, 8.0129F, -5.8635F, -0.0522F, -0.0046F, -0.0871F));

		PartDefinition cube_r518 = rightOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-0.1221F, -0.5512F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1923F, -8.3438F, 3.5205F, -1.6233F, -0.2253F, -0.9168F));

		PartDefinition cube_r519 = rightOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(95, 106).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2061F, -7.5106F, 4.6333F, -1.7006F, -0.1679F, 0.279F));

		PartDefinition cube_r520 = rightOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(70, 121).mirror().addBox(-0.2546F, -1.2468F, -1.866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.8169F, -5.5474F, 2.9075F, -1.7439F, -0.0548F, 0.3098F));

		PartDefinition cube_r521 = rightOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(40, 121).mirror().addBox(-0.2546F, 0.1549F, -1.617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8169F, -5.5474F, 2.9075F, -2.4857F, -0.0548F, 0.3098F));

		PartDefinition cube_r522 = rightOrbit.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(-0.1733F, -0.4143F, -2.3586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(117, 116).mirror().addBox(-0.1733F, -0.4143F, -3.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8169F, -5.5474F, 2.9075F, -1.83F, -0.0727F, 0.2665F));

		PartDefinition cube_r523 = rightOrbit.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(106, 90).mirror().addBox(0.0081F, -0.5743F, -0.0682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1923F, -8.3438F, 3.5205F, -1.6324F, 0.1975F, -0.9685F));

		PartDefinition cube_r524 = rightOrbit.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-0.1733F, -0.4665F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.8169F, -5.5474F, 2.9075F, -1.6991F, -0.0727F, 0.2665F));

		PartDefinition cube_r525 = rightOrbit.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(55, 117).mirror().addBox(-0.5435F, -0.4095F, -1.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -1.4665F, -0.0441F, -0.0329F));

		PartDefinition cube_r526 = rightOrbit.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(-0.6735F, -0.3972F, -1.9379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 2.2408F, 0.0732F, -0.2146F));

		PartDefinition cube_r527 = rightOrbit.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(-0.6505F, 0.9716F, -0.6102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 1.1723F, -0.0143F, -0.3048F));

		PartDefinition cube_r528 = rightOrbit.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(117, 39).mirror().addBox(-0.14F, 1.1597F, -1.6357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -1.3054F, 2.5561F, -3.0547F, -0.0441F, -0.1332F));

		PartDefinition cube_r529 = rightOrbit.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(117, 36).mirror().addBox(-0.4454F, -0.2803F, -0.7464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -2.8802F, -0.0441F, -0.1725F));

		PartDefinition cube_r530 = rightOrbit.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(117, 33).mirror().addBox(-0.5435F, 0.3697F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -2.9849F, -0.0441F, -0.0329F));

		PartDefinition cube_r531 = rightOrbit.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(120, 84).mirror().addBox(-0.5435F, 0.3663F, 1.085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, 2.1376F, -0.0441F, -0.0329F));

		PartDefinition cube_r532 = rightOrbit.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(75, 15).mirror().addBox(-0.5435F, 0.8451F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, 3.1412F, -0.0441F, -0.0329F));

		PartDefinition cube_r533 = rightOrbit.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(117, 30).mirror().addBox(-0.1358F, -2.1508F, 0.6237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -1.3054F, 2.5561F, 0.148F, -0.0441F, -0.1332F));

		PartDefinition cube_r534 = rightOrbit.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(120, 106).mirror().addBox(-0.5435F, -0.4976F, -1.4004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -1.3792F, -0.0441F, -0.0329F));

		PartDefinition cube_r535 = rightOrbit.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(23, 117).mirror().addBox(-0.4454F, -0.6453F, -0.821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -1.161F, -0.0441F, -0.1725F));

		PartDefinition cube_r536 = rightOrbit.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(117, 18).mirror().addBox(-0.7004F, -0.5434F, -2.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4374F, -3.4054F, 3.2561F, -1.3788F, -0.05F, 0.0609F));

		PartDefinition cube_r537 = rightOrbit.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(35, 121).mirror().addBox(-0.2761F, -1.2331F, -0.53F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5687F, -3.75F, 0.7038F, -1.4163F, 0.001F, -0.2421F));

		PartDefinition cube_r538 = rightOrbit.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(117, 10).mirror().addBox(-0.1844F, -0.6944F, -0.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5687F, -3.75F, 0.7038F, -1.2209F, -0.2059F, -0.2748F));

		PartDefinition cube_r539 = rightOrbit.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(117, 7).mirror().addBox(-0.1844F, -0.3812F, -0.7882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5687F, -3.75F, 0.7038F, 0.8298F, -0.2059F, -0.2748F));

		PartDefinition cube_r540 = rightOrbit.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(12, 97).mirror().addBox(-0.6227F, -1.813F, -0.211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 1.4427F, -0.1502F, -0.2263F));

		PartDefinition cube_r541 = rightOrbit.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-1.0F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.198F, -1.0675F, 1.3746F, 1.8769F, -0.0179F, -0.4219F));

		PartDefinition cube_r542 = rightOrbit.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.7325F, -1.2534F, -1.4968F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4056F, -0.869F, 1.5639F, 3.0132F, -0.0895F, -0.4755F));

		PartDefinition cube_r543 = rightOrbit.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.7344F, -1.2153F, -0.5806F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2604F, -0.3093F, 1.7926F, 1.8774F, -0.0047F, -0.2105F));

		PartDefinition cube_r544 = rightOrbit.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(53, 82).mirror().addBox(-1.0F, -0.525F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5332F, -3.4871F, 0.4592F, 1.6327F, -0.0005F, -0.1185F));

		PartDefinition cube_r545 = rightOrbit.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(76, 109).mirror().addBox(-0.5796F, -1.5867F, -1.2951F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 82).mirror().addBox(-0.5796F, -1.7617F, -1.3201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 1.7542F, -0.1224F, -0.0954F));

		PartDefinition cube_r546 = rightOrbit.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(75, 121).mirror().addBox(-0.6576F, -1.4701F, -0.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 117).mirror().addBox(-0.6576F, -1.4701F, -0.7308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 2.2798F, -0.1973F, -0.1528F));

		PartDefinition cube_r547 = rightOrbit.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(97, 4).mirror().addBox(-0.6807F, -1.7593F, -1.3687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, -2.0185F, -0.0379F, -0.2944F));

		PartDefinition cube_r548 = rightOrbit.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(117, 4).mirror().addBox(-0.612F, -1.663F, -0.7205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, -2.7371F, -0.0203F, -0.1877F));

		PartDefinition cube_r549 = rightOrbit.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(12, 90).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3541F, 0.7494F, 2.2516F, -3.0431F, 0.0041F, 0.0742F));

		PartDefinition cube_r550 = rightOrbit.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(7, 98).mirror().addBox(-0.3F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6476F, 2.1054F, 2.3798F, 2.9509F, -0.0303F, 0.0353F));

		PartDefinition cube_r551 = rightOrbit.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-0.5F, -0.2558F, -0.7459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(115, 65).mirror().addBox(-0.5F, -1.3558F, -0.7459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.351F, 0.9753F, 2.501F, 2.8274F, -0.0204F, 0.0868F));

		PartDefinition cube_r552 = rightOrbit.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(19, 100).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5544F, 5.5205F, 2.0218F, 2.7118F, -0.1353F, 0.0539F));

		PartDefinition cube_r553 = rightOrbit.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(100, 8).mirror().addBox(-0.5F, -0.5508F, -1.0087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(99, 98).mirror().addBox(-0.5F, 0.1992F, -1.1087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5452F, 4.8488F, 2.2443F, 2.9708F, -0.1749F, 0.0723F));

		PartDefinition cube_r554 = rightOrbit.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.6995F, -4.2638F, -0.104F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -0.0686F, 4.048F, 2.9802F, -0.0444F, 0.0713F));

		PartDefinition cube_r555 = rightOrbit.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.6995F, -2.6877F, -0.3056F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -0.0686F, 4.048F, 2.8493F, -0.0444F, 0.0713F));

		PartDefinition cube_r556 = rightOrbit.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-0.9F, -0.3F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(82, 62).mirror().addBox(-0.9F, -0.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1684F, -0.4272F, 2.7042F, 2.9715F, -0.0444F, -0.0509F));

		PartDefinition cube_r557 = rightOrbit.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(90, 5).mirror().addBox(-0.7416F, -1.0691F, -1.2208F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2604F, -0.3093F, 1.7926F, 3.0132F, -0.0895F, -0.2224F));

		PartDefinition cube_r558 = rightOrbit.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.612F, -1.4903F, -1.4328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9786F, -2.4375F, 1.7697F, 3.0137F, -0.0203F, -0.1877F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.352F, -2.1324F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(104, 47).mirror().addBox(-0.5011F, 0.0278F, -1.3375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2794F, -2.2759F, -10.4012F, -1.482F, -0.1562F, -0.2395F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-0.5011F, -0.4894F, -1.1009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(78, 92).mirror().addBox(-0.5011F, -1.0894F, -0.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2794F, -2.2759F, -10.4012F, -1.7874F, -0.1562F, -0.2395F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-0.5757F, -0.2153F, -1.2734F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.0276F, -0.07F, -0.0198F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(122, 9).mirror().addBox(-0.7962F, 1.4842F, -3.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 118).mirror().addBox(-0.7962F, 1.4842F, -3.0889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -0.9445F, -0.0732F, 0.0667F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(122, 6).mirror().addBox(-0.5972F, -1.3407F, 0.037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.2078F, -0.0698F, 0.0175F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(100, 54).mirror().addBox(1.9537F, -3.7918F, -2.3859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, 2.4955F, -0.2094F, 0.0175F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(122, 3).mirror().addBox(1.9537F, -0.6096F, -4.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, 1.6228F, -0.2094F, 0.0175F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(1.9537F, 3.1171F, -1.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, 0.532F, -0.2094F, 0.0175F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(115, 74).mirror().addBox(1.9537F, -0.6375F, 1.2191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -1.2569F, -0.2094F, 0.0175F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(95, 121).mirror().addBox(1.9537F, -1.3979F, 1.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, 0.1829F, -0.2094F, 0.0175F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(90, 121).mirror().addBox(1.9537F, -1.4446F, -0.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -1.0388F, -0.2094F, 0.0175F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(105, 107).mirror().addBox(-0.5787F, -4.2655F, -0.9538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -1.9226F, -0.0668F, -0.0288F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(88, 114).mirror().addBox(-0.5757F, -1.6617F, -1.2196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.1061F, -0.07F, -0.0198F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(118, 69).mirror().addBox(-0.475F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3118F, -0.9935F, -8.9097F, -1.9303F, -0.1188F, 0.0359F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(-0.5972F, 0.0712F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -1.8239F, -0.0698F, 0.0175F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(114, 61).mirror().addBox(-0.5972F, -1.7818F, -0.5321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.0595F, -0.0698F, 0.0175F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(1.9296F, 0.9864F, 2.646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -1.9376F, -0.2094F, 0.0175F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(1.9537F, -1.3278F, 1.785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -2.1994F, -0.2094F, 0.0175F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(114, 53).mirror().addBox(-0.5972F, -3.1281F, 0.233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.042F, -0.0698F, 0.0175F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(16, 52).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3892F, -1.4845F, -9.7088F, -0.4471F, -0.0732F, 0.0667F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(20, 123).mirror().addBox(-0.7962F, -0.9461F, -3.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -0.29F, -0.0732F, 0.0667F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(47, 114).mirror().addBox(-0.7962F, 1.1499F, 0.1936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.1488F, -0.0732F, 0.0667F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(39, 118).mirror().addBox(-0.7962F, 1.9939F, 0.8068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.2535F, -0.0732F, 0.0667F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(118, 27).mirror().addBox(-0.6962F, 1.5583F, 0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.1139F, -0.0732F, 0.0667F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(118, 24).mirror().addBox(-0.55F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2621F, -0.5363F, -8.9295F, -2.0307F, -0.069F, 0.0885F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(42, 114).mirror().addBox(-0.5972F, -1.0377F, 0.1401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -2.0333F, -0.0698F, 0.0175F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(100, 107).mirror().addBox(1.932F, -0.2916F, -0.4404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -0.8063F, -0.6657F, 0.2646F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(114, 0).mirror().addBox(1.9537F, 1.9317F, 0.3012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -1.318F, -0.2094F, 0.0175F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(24, 107).mirror().addBox(-0.5972F, -4.7431F, -0.4035F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, -0.4678F, -7.3984F, -1.9722F, -0.0698F, 0.0175F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(118, 21).mirror().addBox(1.9537F, -0.3807F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -1.0824F, -0.2094F, 0.0175F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(1.9537F, 2.0285F, -0.8973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, 0.0957F, -0.2094F, 0.0175F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(1.9537F, 0.5049F, -0.5525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -0.9079F, -0.2094F, 0.0175F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(1.9287F, 0.5491F, -1.4171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -0.0789F, -0.2094F, 0.0175F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(113, 112).mirror().addBox(1.9537F, -0.7133F, -0.7836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7951F, -0.3357F, -1.6059F, -0.7333F, -0.2094F, 0.0175F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(105, 107).addBox(-0.4213F, -4.2655F, -0.9538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -1.9226F, 0.0668F, 0.0288F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(104, 47).addBox(-0.4989F, 0.0278F, -1.3375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2794F, -2.2759F, -10.4012F, -1.482F, 0.1562F, 0.2395F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(70, 100).addBox(-0.4989F, -0.4894F, -1.1009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 92).addBox(-0.4989F, -1.0894F, -0.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2794F, -2.2759F, -10.4012F, -1.7874F, 0.1562F, 0.2395F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(83, 4).addBox(-0.4243F, -0.2153F, -1.2734F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.0276F, 0.07F, 0.0198F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(88, 114).addBox(-0.4243F, -1.6617F, -1.2196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.1061F, 0.07F, 0.0198F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(118, 69).addBox(-0.525F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3118F, -0.9935F, -8.9097F, -1.9303F, 0.1188F, -0.0359F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(118, 50).addBox(-0.4028F, 0.0712F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -1.8239F, 0.0698F, -0.0175F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(114, 61).addBox(-0.4028F, -1.7818F, -0.5321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.0595F, 0.0698F, -0.0175F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(114, 57).addBox(-2.9296F, 0.9864F, 2.646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -1.9376F, 0.2094F, -0.0175F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(64, 88).addBox(-2.9537F, -1.3278F, 1.785F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -2.1994F, 0.2094F, -0.0175F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(114, 53).addBox(-0.4028F, -3.1281F, 0.233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.042F, 0.0698F, -0.0175F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(16, 52).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3892F, -1.4845F, -9.7088F, -0.4471F, 0.0732F, -0.0667F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(20, 123).addBox(-0.2038F, -0.9461F, -3.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -0.29F, 0.0732F, -0.0667F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(122, 9).addBox(-0.2038F, 1.4842F, -3.6889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 118).addBox(-0.2038F, 1.4842F, -3.0889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -0.9445F, 0.0732F, -0.0667F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(47, 114).addBox(-0.2038F, 1.1499F, 0.1936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.1488F, 0.0732F, -0.0667F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(39, 118).addBox(-0.2038F, 1.9939F, 0.8068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.2535F, 0.0732F, -0.0667F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(118, 27).addBox(-0.3038F, 1.5583F, 0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.1139F, 0.0732F, -0.0667F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(118, 24).addBox(-0.45F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2621F, -0.5363F, -8.9295F, -2.0307F, 0.069F, -0.0885F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(122, 6).addBox(-0.4028F, -1.3407F, 0.037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.2078F, 0.0698F, -0.0175F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(42, 114).addBox(-0.4028F, -1.0377F, 0.1401F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -2.0333F, 0.0698F, -0.0175F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(100, 107).addBox(-2.932F, -0.2916F, -0.4404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -0.8063F, 0.6657F, -0.2646F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(114, 0).addBox(-2.9537F, 1.9317F, 0.3012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -1.318F, 0.2094F, -0.0175F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(24, 107).addBox(-0.4028F, -4.7431F, -0.4035F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3293F, -0.4678F, -7.3984F, -1.9722F, 0.0698F, -0.0175F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(118, 21).addBox(-2.9537F, -0.3807F, -0.2067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -1.0824F, 0.2094F, -0.0175F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(115, 74).addBox(-2.9537F, -0.6375F, 1.2191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -1.2569F, 0.2094F, -0.0175F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(100, 54).addBox(-2.9537F, -3.7918F, -2.3859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, 2.4955F, 0.2094F, -0.0175F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(122, 3).addBox(-2.9537F, -0.6096F, -4.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, 1.6228F, 0.2094F, -0.0175F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(123, 19).addBox(-2.9537F, 3.1171F, -1.7031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, 0.532F, 0.2094F, -0.0175F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(57, 88).addBox(-2.9537F, 2.0285F, -0.8973F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, 0.0957F, 0.2094F, -0.0175F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(107, 6).addBox(-2.9537F, 0.5049F, -0.5525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -0.9079F, 0.2094F, -0.0175F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(87, 87).addBox(-2.9287F, 0.5491F, -1.4171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -0.0789F, 0.2094F, -0.0175F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(95, 121).addBox(-2.9537F, -1.3979F, 1.0285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, 0.1829F, 0.2094F, -0.0175F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(90, 121).addBox(-2.9537F, -1.4446F, -0.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -1.0388F, 0.2094F, -0.0175F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(113, 112).addBox(-2.9537F, -0.7133F, -0.7836F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7951F, -0.3357F, -1.6059F, -0.7333F, 0.2094F, -0.0175F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(72, 53).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(83, 44).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.5498F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 97).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(47, 93).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(73, 23).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.1658F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(32, 73).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, -0.1839F, 0.0858F, -0.0159F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(50, 73).addBox(-0.5F, -0.0943F, -0.024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2316F, 2.8957F, -0.088F, 0.1304F, -0.0115F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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