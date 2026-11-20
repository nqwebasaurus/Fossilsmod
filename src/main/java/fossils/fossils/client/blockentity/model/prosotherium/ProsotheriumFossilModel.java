package fossils.fossils.client.blockentity.model.prosotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProsotheriumFossilModel extends SkullModelBase {
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
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ProsotheriumFossilModel(ModelPart root) {
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
		this.chest = this.body4.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck2 = this.chest2.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone3 = this.neck2.getChild("bone3");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.489F, 16.4842F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 87).addBox(0.0F, -1.6986F, 0.0389F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 68).addBox(0.0F, -1.5986F, 2.0389F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5057F, -3.1864F, -0.4451F, -0.2618F, -0.1657F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6447F, -1.3812F, -0.3815F, -0.1179F, 0.2741F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6447F, -1.3812F, -0.3815F, 0.1179F, -0.2741F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5057F, -3.1864F, -0.4451F, 0.2618F, 0.1657F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 1.1863F, 0.597F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -4.6F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 42).addBox(0.5F, -4.8653F, -1.0619F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.9046F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 76).addBox(0.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 84).addBox(4.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 72).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 11.1335F, -0.6522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(67, 43).addBox(-1.0F, 0.9683F, -1.2245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 9.1586F, -0.4965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 51).addBox(0.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 9.2768F, -0.9186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1196F, -0.6083F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 84).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2412F, 0.4294F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 37).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(86, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6305F, -0.3804F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2454F, 0.2127F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 33).addBox(-1.5F, -1.2F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.7023F, -0.1869F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 33).addBox(-0.2F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(22, 37).addBox(-2.3F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, 10.9236F, -1.293F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(88, 16).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1754F, -0.0452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 4).addBox(-1.4F, -0.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9246F, 0.5716F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(37, 24).addBox(-2.8F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.925F, 0.475F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(37, 19).addBox(-2.8F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.0103F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 1.1863F, 0.597F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.0F, -4.6F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(-1.5F, -4.8653F, -1.0619F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.9046F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(-5.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.1335F, -0.6522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.0F, 0.9683F, -1.2245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1586F, -0.4965F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-1.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.2768F, -0.9186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1196F, -0.6083F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(0.0F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2412F, 0.4294F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 37).mirror().addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(86, 34).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6305F, -0.3804F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2454F, 0.2127F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(5, 33).mirror().addBox(0.5F, -1.2F, -0.4F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7023F, -0.1869F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.8F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-1.7F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 10.9236F, -1.293F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(88, 16).mirror().addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1754F, -0.0452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.6F, -0.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.9246F, 0.5716F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-1.2F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.925F, 0.475F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 19).mirror().addBox(-1.2F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.0103F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4869F, 0.9421F, 1.6344F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 14).addBox(0.0851F, -0.1223F, -1.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, 0.0943F, 0.437F, 2.0973F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(47, 6).addBox(0.0851F, -0.2667F, -4.0802F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, 0.871F, 0.437F, 2.0973F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 39).addBox(0.0851F, 0.2056F, -2.2822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, 0.3474F, 0.437F, 2.0973F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 13).addBox(-0.1587F, 0.3575F, -1.4724F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, -2.5535F, 0.1417F, -2.4874F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(73, 52).addBox(1.6252F, 0.3575F, -0.8996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, -1.7097F, 0.983F, -1.1769F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 38).addBox(1.701F, 0.3575F, -1.5932F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7149F, -1.5504F, -1.1799F, -2.1469F, 0.8568F, -1.7205F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 11).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1195F, 0.9188F, 0.0565F, -2.9119F, 0.279F, -0.4248F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 70).addBox(-0.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6991F, 0.3212F, 0.1348F, 3.0197F, 0.339F, -1.4816F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 33).addBox(-0.9F, -0.325F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9459F, 0.1037F, 0.4846F, 2.9655F, 0.8573F, -1.5746F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 72).addBox(-0.65F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 22).addBox(-0.75F, -0.5F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0318F, 0.5133F, 2.3146F, 2.7156F, -0.4266F, -0.9197F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(55, 19).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1524F, 1.9246F, 2.8109F, 2.5487F, -0.0266F, -0.2198F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 55).addBox(-3.3748F, -0.5F, -1.1981F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 0.8995F, 1.1109F, 2.9479F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(73, 13).addBox(-1.0998F, -0.5F, -1.4481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 1.5885F, 1.2158F, -2.5911F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(7, 73).addBox(-0.925F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7992F, 0.6905F, 1.9985F, 2.011F, 1.1419F, -2.1982F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 56).addBox(-4.5765F, 0.4729F, -0.642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5649F, -2.4004F, -2.0549F, -1.4596F, 1.2268F, -1.2404F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4869F, 0.9421F, 1.6344F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(39, 14).mirror().addBox(-1.0851F, -0.1223F, -1.8151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, 0.0943F, -0.437F, -2.0973F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(-1.0851F, -0.2667F, -4.0802F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, 0.871F, -0.437F, -2.0973F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 39).mirror().addBox(-1.0851F, 0.2056F, -2.2822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, 0.3474F, -0.437F, -2.0973F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.8413F, 0.3575F, -1.4724F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, -2.5535F, -0.1417F, 2.4874F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-3.6252F, 0.3575F, -0.8996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, -1.7097F, -0.983F, 1.1769F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(-3.701F, 0.3575F, -1.5932F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7149F, -1.5504F, -1.1799F, -2.1469F, -0.8568F, 1.7205F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 11).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1195F, 0.9188F, 0.0565F, -2.9119F, -0.279F, 0.4248F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(61, 70).mirror().addBox(-1.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6991F, 0.3212F, 0.1348F, 3.0197F, -0.339F, 1.4816F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-2.1F, -0.325F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 0.1037F, 0.4846F, 2.9655F, -0.8573F, 1.5746F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-1.35F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 22).mirror().addBox(-2.25F, -0.5F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0318F, 0.5133F, 2.3146F, 2.7156F, 0.4266F, 0.9197F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(55, 19).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1524F, 1.9246F, 2.8109F, 2.5487F, 0.0266F, 0.2198F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(0.3748F, -0.5F, -1.1981F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 0.8995F, -1.1109F, -2.9479F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-0.9002F, -0.5F, -1.4481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 1.5885F, -1.2158F, 2.5911F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-1.075F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7992F, 0.6905F, 1.9985F, 2.011F, -1.1419F, 2.1982F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(1.5765F, 0.4729F, -0.642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5649F, -2.4004F, -2.0549F, -1.4596F, -1.2268F, 1.2404F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(19, 38).addBox(0.0F, -1.6354F, -0.1789F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6549F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -1.9589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(22, 32).addBox(0.0F, -1.7945F, -0.5572F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8144F, -2.2389F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5076F, -0.3722F, -2.4718F, -0.2571F, -0.1961F, -0.2596F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.9F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5152F, 0.0256F, -0.6005F, -0.2507F, -0.2599F, -0.1556F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-1.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7725F, -4.4268F, -0.0672F, -0.1093F, -0.2615F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 33).addBox(-0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7725F, -4.4268F, -0.0672F, 0.1093F, 0.2615F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 74).addBox(-0.1F, 0.0F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5152F, 0.0256F, -0.6005F, -0.2507F, 0.2599F, 0.1556F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 73).addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5076F, -0.3722F, -2.4718F, -0.2571F, 0.1961F, 0.2596F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(13, 13).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9395F, -4.5739F, -0.1136F, 0.0434F, -0.0049F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 87).addBox(0.0F, -1.7408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.157F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(87, 79).addBox(0.0F, -1.5844F, -0.0811F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.057F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.567F, -3.6528F, -0.0996F, 0.2402F, -0.4068F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(75, 33).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.367F, -1.6528F, 0.0442F, 0.0383F, -0.3343F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(75, 33).addBox(-0.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.367F, -1.6528F, 0.0442F, -0.0383F, 0.3343F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(74, 7).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -3.6528F, -0.0996F, -0.2402F, 0.4068F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6019F, -4.966F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(26, 19).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.1771F, 0.4966F, -0.6577F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.3055F, 0.4336F, -0.9423F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7651F, -2.2868F, -0.4475F, 0.2839F, -1.3409F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.1454F, 0.5177F, -0.6423F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1651F, -0.4868F, -0.2826F, 0.4617F, -0.9324F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(59, 33).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.2826F, -0.4617F, 0.9324F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(59, 31).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1651F, -0.4868F, -0.1454F, -0.5177F, 0.6423F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(74, 35).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.4475F, -0.2839F, 1.3409F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 36).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.3055F, -0.4336F, 0.9423F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 29).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7651F, -2.2868F, -0.1771F, -0.4966F, 0.6577F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(76, 86).addBox(0.0F, -1.4611F, -0.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, -0.857F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 86).addBox(0.0F, -1.3088F, 0.0394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.304F, -2.957F, 0.2443F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, -0.4311F, -3.9471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9506F, -3.8712F, 0.4192F, 0.0399F, 0.0178F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(10, 87).addBox(0.0F, -1.4745F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(87, 75).addBox(0.0F, -1.6501F, 0.0278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.541F, -0.1247F, -1.2613F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5479F, 0.0853F, -0.9185F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -2.4155F, -0.5131F, 0.2184F, -0.6902F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.541F, -0.1247F, -1.3485F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5479F, 0.0853F, -1.0057F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 59).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1145F, -0.4155F, -0.5131F, 0.2184F, -0.7774F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(50, 59).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5131F, -0.2184F, 0.7774F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(59, 48).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.5479F, -0.0853F, 1.0057F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 64).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -0.4155F, -0.541F, 0.1247F, 1.3485F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(59, 46).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5131F, -0.2184F, 0.6902F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 9).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.5479F, -0.0853F, 0.9185F));

		PartDefinition cube_r117 = body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(48, 31).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1145F, -2.4155F, -0.541F, 0.1247F, 1.2613F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0534F, -3.8819F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(33, 87).addBox(0.0F, -2.3226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(30, 87).addBox(0.0F, -2.0222F, -0.0133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(33, 37).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4835F, 0.1308F, -1.2611F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(59, 50).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4021F, 0.3048F, -0.89F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.3118F, 0.3968F, -0.6288F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(39, 4).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4835F, 0.1308F, -1.2611F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4021F, 0.3048F, -0.89F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(59, 56).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.3118F, 0.3968F, -0.6288F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 56).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.3118F, -0.3968F, 0.6288F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(59, 54).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4021F, -0.3048F, 0.89F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(39, 4).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4835F, -0.1308F, 1.2611F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(59, 52).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.3118F, -0.3968F, 0.6288F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(59, 50).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4021F, -0.3048F, 0.89F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(33, 37).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4835F, -0.1308F, 1.2611F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.337F, -3.76F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 87).addBox(0.0F, -2.0226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 87).addBox(0.0F, -1.6222F, -0.0133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(37, 34).mirror().addBox(-10.1256F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.5027F, 0.0456F, -1.2977F));

		PartDefinition cube_r136 = chest2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.4522F, 0.2321F, -0.9382F));

		PartDefinition cube_r137 = chest2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(28, 62).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2611F, -0.3337F, -0.3815F, 0.3387F, -0.6888F));

		PartDefinition cube_r138 = chest2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-9.1256F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.5027F, 0.0456F, -1.2977F));

		PartDefinition cube_r139 = chest2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.4522F, 0.2321F, -0.9382F));

		PartDefinition cube_r140 = chest2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(63, 4).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9611F, -2.3337F, -0.3815F, 0.3387F, -0.6888F));

		PartDefinition cube_r141 = chest2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-10.4F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3022F, 10.7575F, 2.3325F, 0.323F, 0.8341F, 1.0742F));

		PartDefinition cube_r142 = chest2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 2).mirror().addBox(-9.1F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2412F, 10.8998F, 2.0645F, 0.2037F, 0.7275F, 0.8652F));

		PartDefinition cube_r143 = chest2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-7.4F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 11.002F, 1.8293F, 0.0556F, 0.6244F, 0.6248F));

		PartDefinition cube_r144 = chest2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(-6.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9994F, 11.0002F, 1.3367F, 0.0186F, 0.4866F, 0.5239F));

		PartDefinition cube_r145 = chest2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(39, 12).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1221F, 11.0369F, 0.4169F, 0.0788F, 0.2632F, 0.4056F));

		PartDefinition cube_r146 = chest2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-4.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 10.1971F, -2.5653F, -0.096F, 0.0756F, 0.3305F));

		PartDefinition cube_r147 = chest2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0167F, 9.4908F, -4.2686F, -0.3643F, -0.0881F, 0.4005F));

		PartDefinition cube_r148 = chest2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(39, 2).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.957F, 10.9611F, -0.6607F, -0.0063F, 0.0317F, 0.4482F));

		PartDefinition cube_r149 = chest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 4).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.3815F, -0.3387F, 0.6888F));

		PartDefinition cube_r150 = chest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(37, 62).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.4522F, -0.2321F, 0.9382F));

		PartDefinition cube_r151 = chest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(46, 36).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.9611F, -2.3337F, -0.5027F, -0.0456F, 1.2977F));

		PartDefinition cube_r152 = chest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(28, 62).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.3815F, -0.3387F, 0.6888F));

		PartDefinition cube_r153 = chest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 11).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.4522F, -0.2321F, 0.9382F));

		PartDefinition cube_r154 = chest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(37, 34).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2611F, -0.3337F, -0.5027F, -0.0456F, 1.2977F));

		PartDefinition cube_r155 = chest2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(13, 20).addBox(-2.71F, 1.9469F, -2.1592F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.71F, 8.5221F, 0.5969F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(39, 2).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.957F, 10.9611F, -0.6607F, -0.0063F, -0.0317F, -0.4482F));

		PartDefinition cube_r157 = chest2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1221F, 11.0369F, 0.4169F, 0.0788F, -0.2632F, -0.4056F));

		PartDefinition cube_r158 = chest2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 4).addBox(-2.71F, 2.7702F, -7.3571F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.71F, 8.5221F, 0.5969F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 6).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0167F, 9.4908F, -4.2686F, -0.3643F, 0.0881F, -0.4005F));

		PartDefinition cube_r160 = chest2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(39, 0).addBox(-0.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 10.1971F, -2.5653F, -0.096F, -0.0756F, -0.3305F));

		PartDefinition cube_r161 = chest2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(43, 49).addBox(-2.71F, 2.4069F, -2.8497F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.71F, 8.5221F, 0.5969F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(19, 11).addBox(-0.6F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9994F, 11.0002F, 1.3367F, 0.0186F, -0.4866F, -0.5239F));

		PartDefinition cube_r163 = chest2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 11).addBox(-0.6F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 11.002F, 1.8293F, 0.0556F, -0.6244F, -0.6248F));

		PartDefinition cube_r164 = chest2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 2).addBox(-0.9F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2412F, 10.8998F, 2.0645F, 0.2037F, -0.7275F, -0.8652F));

		PartDefinition cube_r165 = chest2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, 0.0F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3022F, 10.7575F, 2.3325F, 0.323F, -0.8341F, -1.0742F));

		PartDefinition cube_r166 = chest2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(36, 6).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3707F, -3.5804F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 88).addBox(0.0F, -1.2489F, -0.0609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.842F, -2.9765F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r168 = neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(36, 87).addBox(0.0F, -1.2489F, 0.0391F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r169 = neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.7717F, -0.0432F, -0.8004F));

		PartDefinition cube_r170 = neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.746F, -0.2239F, -0.9918F));

		PartDefinition cube_r171 = neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-8.1256F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0507F, -0.4788F, -0.6303F, -0.4813F, -1.3215F));

		PartDefinition cube_r172 = neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 60).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.6558F, -0.5657F, -1.4309F));

		PartDefinition cube_r173 = neck2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(64, 13).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.7959F, -0.2966F, -1.1011F));

		PartDefinition cube_r174 = neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1493F, -2.4788F, -0.8327F, -0.1057F, -0.918F));

		PartDefinition cube_r175 = neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(64, 15).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.8327F, 0.1057F, 0.918F));

		PartDefinition cube_r176 = neck2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(64, 13).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.7959F, 0.2966F, 1.1011F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(37, 60).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1493F, -2.4788F, -0.6558F, 0.5657F, 1.4309F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 8).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.6303F, 0.4813F, 1.3215F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(28, 60).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.746F, 0.2239F, 0.9918F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(59, 58).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0507F, -0.4788F, -0.7717F, 0.0432F, 0.8004F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(48, 14).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.5473F, -5.4543F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(55, 76).addBox(-0.475F, -1.225F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0062F, 0.7723F, 0.3562F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(14, 69).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.2272F, 0.0936F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, 1.3F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(21, 67).addBox(-0.5F, -2.4F, -0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(66, 84).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5708F, -0.9613F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(85, 56).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3751F, -0.4596F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(85, 53).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6537F, 0.9051F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(85, 50).addBox(-0.5F, -1.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -1.0996F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.6682F, 1.7944F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(67, 39).addBox(0.1F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, -0.2877F, 0.5559F, 1.5708F, 0.7679F, -1.5708F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(60, 77).addBox(0.3F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3236F, -1.6819F, 0.9729F, 1.5708F, 1.3352F, -1.5708F));

		PartDefinition cube_r191 = leftarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 73).addBox(-1.0F, -0.775F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3236F, -0.7795F, 0.4478F, 1.5708F, 0.0698F, -1.5708F));

		PartDefinition cube_r192 = leftarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(87, 9).addBox(-0.4929F, 0.5785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(87, 6).addBox(-0.4929F, 0.0785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 5.1133F, 0.6225F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition cube_r193 = leftarm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(23, 56).addBox(-0.6285F, -2.2225F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7764F, 2.4922F, 0.2488F, 1.5708F, -1.3788F, -1.5708F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(24, 47).addBox(-0.4335F, -0.0622F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 0.211F, 0.0776F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(-0.2F, 6.5969F, 1.1286F));

		PartDefinition cube_r195 = leftArm3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(61, 82).addBox(0.2F, -1.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftArm3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(73, 59).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(67, 35).addBox(-1.0F, -0.2399F, -0.3908F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.0435F, -0.2403F, -0.1658F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(51, 42).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.7601F, 0.6092F, -0.8203F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.5473F, -5.4543F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r197 = rightarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 76).mirror().addBox(-0.525F, -1.225F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0062F, 0.7723F, 0.3562F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r198 = rightarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(14, 69).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2272F, 0.0936F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-0.5F, 1.3F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(21, 67).mirror().addBox(-0.5F, -2.4F, -0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.7412F, 0.5344F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5708F, -0.9613F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(85, 56).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3751F, -0.4596F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6537F, 0.9051F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-0.5F, -1.35F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0216F, -0.4226F, -1.0996F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.6682F, 1.7944F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-1.1F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2236F, -0.2877F, 0.5559F, 1.5708F, -0.7679F, 1.5708F));

		PartDefinition cube_r205 = rightarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-1.3F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -1.6819F, 0.9729F, 1.5708F, -1.3352F, 1.5708F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-1.0F, -0.775F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, -0.7795F, 0.4478F, 1.5708F, -0.0698F, 1.5708F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.5071F, 0.5785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(87, 6).mirror().addBox(-0.5071F, 0.0785F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7764F, 5.1133F, 0.6225F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 56).mirror().addBox(-0.3715F, -2.2225F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7764F, 2.4922F, 0.2488F, 1.5708F, 1.3788F, 1.5708F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(24, 47).mirror().addBox(-0.5665F, -0.0622F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 0.211F, 0.0776F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(0.2F, 6.5969F, 1.1286F));

		PartDefinition cube_r210 = rightArm3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(61, 82).mirror().addBox(-1.2F, -1.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightArm3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-1.0F, -0.2399F, -0.3908F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0435F, -0.2403F, -0.1658F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-2.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.7601F, 0.6092F, -0.8552F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-2.0F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.7082F, 1.1445F, -3.2377F));

		PartDefinition cube_r212 = bone2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(43, 53).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0252F, 1.9197F, 1.3709F, 1.9065F, 0.169F, -0.3803F));

		PartDefinition cube_r213 = bone2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(29, 55).addBox(-0.5F, -0.9521F, -1.5811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9729F, -1.0104F, 2.8594F, -1.1009F, 0.1857F, -0.3986F));

		PartDefinition cube_r214 = bone2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(10, 38).addBox(-0.5F, -0.9716F, -0.9176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9729F, -1.0104F, 2.8594F, -0.97F, 0.1857F, -0.3986F));

		PartDefinition cube_r215 = bone2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(9, 49).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4237F, 0.6747F, 1.9104F, 0.3881F, 0.169F, -0.3803F));

		PartDefinition cube_r216 = bone2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(11, 32).addBox(-1.5272F, -1.3788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F))
				.texOffs(28, 0).addBox(-1.5272F, -1.9788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 0.7982F, 0.169F, -0.3803F));

		PartDefinition cube_r217 = bone2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.5011F, -0.8609F, -0.6122F, -0.7377F, 0.169F, -0.3803F));

		PartDefinition cube_r218 = bone2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 41).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2427F, -0.0069F, -1.0638F, -2.0467F, 0.169F, -0.3803F));

		PartDefinition cube_r219 = bone2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(52, 46).addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.81F, 0.7275F, -0.3065F, 2.9711F, 0.169F, -0.3803F));

		PartDefinition cube_r220 = bone2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 79).addBox(-0.5F, -1.162F, -0.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4313F, -1.599F, 1.6361F, -1.5527F, 0.144F, -0.4485F));

		PartDefinition cube_r221 = bone2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(45, 74).addBox(-0.5F, -1.1373F, -0.4864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4313F, -1.599F, 1.6361F, -2.7745F, 0.144F, -0.4485F));

		PartDefinition cube_r222 = bone2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(66, 60).addBox(-0.5F, -1.3147F, -1.0466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4313F, -1.599F, 1.6361F, 2.1561F, 0.144F, -0.4485F));

		PartDefinition cube_r223 = bone2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(14, 74).addBox(-1.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5698F, 0.4149F, 1.7751F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r224 = bone2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(26, 13).addBox(0.0F, 0.3F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6157F, 0.5002F, 0.3011F, 0.7397F, -0.2656F, -0.2024F));

		PartDefinition bone3 = neck2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.7082F, 1.1445F, -3.2377F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(43, 53).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0252F, 1.9197F, 1.3709F, 1.9065F, -0.169F, 0.3803F));

		PartDefinition cube_r226 = bone3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.5F, -0.9521F, -1.5811F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9729F, -1.0104F, 2.8594F, -1.1009F, -0.1857F, 0.3986F));

		PartDefinition cube_r227 = bone3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(10, 38).mirror().addBox(-0.5F, -0.9716F, -0.9176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.9729F, -1.0104F, 2.8594F, -0.97F, -0.1857F, 0.3986F));

		PartDefinition cube_r228 = bone3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4237F, 0.6747F, 1.9104F, 0.3881F, -0.169F, 0.3803F));

		PartDefinition cube_r229 = bone3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(0.5272F, -1.3788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(28, 0).mirror().addBox(0.5272F, -1.9788F, -3.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 0.7982F, -0.169F, 0.3803F));

		PartDefinition cube_r230 = bone3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.5011F, -0.8609F, -0.6122F, -0.7377F, -0.169F, 0.3803F));

		PartDefinition cube_r231 = bone3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.2427F, -0.0069F, -1.0638F, -2.0467F, -0.169F, 0.3803F));

		PartDefinition cube_r232 = bone3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-0.5F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.81F, 0.7275F, -0.3065F, 2.9711F, -0.169F, 0.3803F));

		PartDefinition cube_r233 = bone3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(82, 79).mirror().addBox(-0.5F, -1.162F, -0.977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4313F, -1.599F, 1.6361F, -1.5527F, -0.144F, 0.4485F));

		PartDefinition cube_r234 = bone3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-0.5F, -1.1373F, -0.4864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4313F, -1.599F, 1.6361F, -2.7745F, -0.144F, 0.4485F));

		PartDefinition cube_r235 = bone3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-0.5F, -1.3147F, -1.0466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4313F, -1.599F, 1.6361F, 2.1561F, -0.144F, 0.4485F));

		PartDefinition cube_r236 = bone3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(0.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5698F, 0.4149F, 1.7751F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 13).mirror().addBox(-1.0F, 0.3F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6157F, 0.5002F, 0.3011F, 0.7397F, 0.2656F, 0.2024F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1796F, -3.1233F, -0.6062F, 0.1078F, -0.0744F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(39, 87).addBox(0.0F, -1.2828F, -1.0159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.873F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-1.2F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0303F, -1.3555F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 37).addBox(-0.8F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0303F, -1.3555F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -2.3993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(42, 87).addBox(0.0F, -1.8F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -2.6688F, -0.0961F, 0.0434F, -0.0042F));

		PartDefinition cube_r242 = neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-0.9F, 0.2F, -3.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.055F, 1.3133F, -0.0341F, 0.1287F, -0.9069F));

		PartDefinition cube_r243 = neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 39).addBox(-1.1F, 0.2F, -3.2F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.055F, 1.3133F, -0.0341F, -0.1287F, 0.9069F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 69).addBox(0.0F, -2.3F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0124F, -2.9567F, -0.4276F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(60, 42).addBox(-0.5F, -0.1069F, -1.9175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(87, 31).addBox(0.0F, -0.7069F, -1.9175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5033F, -2.0069F, 0.576F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1522F, -1.63F, 0.114F, -0.1459F, 0.114F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(70, 10).addBox(-1.0F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9926F, -0.2462F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(13, 26).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6382F, -2.7113F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(19, 73).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8294F, -2.2079F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(33, 68).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 6.8203F, -5.1783F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(68, 29).addBox(-0.5F, -0.161F, -0.152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 7.1136F, -6.5455F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(85, 62).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1F, 5.4327F, -6.3031F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(77, 9).addBox(0.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.4457F, -6.0641F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(42, 44).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 5.2631F, -3.8567F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(68, 46).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.4509F, -5.8482F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(29, 49).addBox(0.0F, -0.2393F, -2.9782F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.51F, 0.1937F, -4.209F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(40, 68).addBox(0.0F, -0.0189F, -1.0013F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.51F, 0.1937F, -4.209F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5F, -0.1132F, -1.9823F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.3063F, -2.934F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, 0.0F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.1671F, -1.3729F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(59, 60).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.8256F, -2.0873F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(7, 70).addBox(0.0F, -0.0098F, -1.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, -1.3063F, -2.934F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(68, 56).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -2.1561F, -1.3516F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.7791F, 4.4615F, -4.0745F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8304F, -6.2137F, 3.4627F, 1.7222F, -0.6333F, -1.0926F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(82, 76).addBox(-0.45F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4064F, -5.7787F, 3.4074F, 0.9522F, -0.3799F, -0.2833F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(82, 82).addBox(-0.525F, -0.9F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1962F, 1.9688F, -1.7932F, 2.9984F, 0.1734F, 0.1443F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5061F, -0.3592F, 0.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2862F, 3.1595F, -1.2071F, 2.5192F, 0.1389F, 0.1494F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 72).addBox(-0.5061F, -0.625F, -0.0571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2862F, 3.1595F, -1.2071F, 2.0393F, 0.1389F, 0.1494F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 83).addBox(-0.3352F, 0.9034F, 0.5853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(5, 83).addBox(-0.3352F, 0.9034F, 0.7853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(67, 75).addBox(-0.3352F, -0.0966F, -0.1147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(5, 83).addBox(0.3636F, 0.9197F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(0, 83).addBox(0.3636F, 0.9197F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 75).addBox(0.3636F, -0.0803F, -0.0789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.3742F, -1.5969F, -0.0272F, 0.9333F, 0.0492F, 0.0271F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(75, 83).addBox(-0.3352F, -0.5003F, 3.8872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(75, 83).addBox(0.3637F, -0.4803F, 3.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5612F, 3.1595F, -1.2071F, 1.038F, 0.0492F, 0.0271F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 80).addBox(-0.0471F, -0.1653F, -2.5473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -2.7225F, 0.9791F, -1.2432F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 28).addBox(0.9074F, -0.1653F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -2.9125F, -0.0263F, -1.6035F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(15, 80).addBox(1.0196F, -0.1653F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -2.908F, -0.1962F, -1.6437F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(80, 62).addBox(-0.5547F, -0.1653F, -1.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -2.4557F, 1.2043F, -0.9449F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 28).addBox(-0.5008F, -0.4988F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7625F, -2.8018F, 2.0744F, 3.1101F, -0.8984F, -1.3512F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(25, 85).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6571F, -2.5038F, 1.7501F, 3.0349F, -0.8753F, -1.1709F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(80, 44).addBox(-0.2765F, -0.1768F, -0.1453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1436F, -2.9793F, 2.1455F, -0.1771F, -0.7895F, 1.7936F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(80, 59).addBox(-0.7878F, -0.1653F, -0.2722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -0.2499F, 0.408F, 1.4433F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(41, 78).addBox(-0.8732F, -0.1653F, -1.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -2.1642F, 1.2934F, -0.6382F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 22).addBox(-0.922F, -0.1653F, -0.5351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(2.1436F, -3.3793F, 2.5455F, -0.2508F, 0.4165F, 1.4409F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(15, 83).addBox(-0.433F, -0.1768F, -0.1742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1436F, -2.9793F, 2.1455F, -0.2329F, -1.0033F, 1.8646F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(80, 53).addBox(-0.4919F, -0.5004F, -0.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7625F, -2.8018F, 2.0744F, -3.1314F, -0.7284F, -1.3821F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 13).addBox(0.0056F, -0.1227F, -0.5494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.9021F, -2.0681F, 1.2752F, 3.0446F, -0.7885F, -1.1841F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(80, 56).addBox(-0.5748F, -0.1204F, -1.5138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4771F, -1.4681F, 0.3752F, 2.9164F, 0.7034F, -1.344F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 76).addBox(-0.89F, -0.1204F, -0.8789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4035F, -1.2139F, 0.5163F, 0.6527F, 1.0467F, 2.2484F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 80).addBox(-0.89F, -0.1204F, -0.5789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4771F, -1.4681F, 0.3752F, 0.3473F, 1.0467F, 2.2484F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(48, 26).addBox(-0.1719F, -0.2885F, -2.8745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6106F, -0.5672F, -1.0663F, -0.1799F, -1.1173F, 2.1979F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(43, 58).addBox(-0.7219F, -0.2885F, -1.7495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0021F, -1.4681F, 0.2752F, -0.1108F, -0.9615F, 2.1584F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 54).addBox(-0.65F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.221F, -1.6453F, 0.2163F, 1.0614F, 0.4328F, 2.0145F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(75, 69).addBox(-0.85F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4401F, -1.2605F, 0.5526F, 0.6013F, -0.1011F, 1.6254F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(84, 41).addBox(-0.7219F, -0.4135F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0021F, -1.4681F, 0.2752F, 0.5858F, -0.304F, 1.916F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(26, 75).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.939F, -4.4984F, 0.4892F, -1.1401F, 0.795F, -1.5852F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(75, 0).addBox(-0.85F, -1.825F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.3499F, -3.425F, -0.7713F, -2.122F, 0.9285F, -1.5224F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(74, 73).addBox(-0.85F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3499F, -3.425F, -0.7713F, -1.5984F, 0.9285F, -1.5224F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(57, 14).addBox(-0.5393F, -0.3435F, -1.2283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2569F, -2.9994F, -0.3352F, -1.5825F, -0.2138F, -1.592F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(80, 50).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1451F, -2.7463F, -0.5835F, 0.0284F, -1.2678F, 2.6223F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(7, 58).addBox(-0.8648F, -1.1911F, -1.623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2569F, -2.9994F, -0.3352F, -0.7906F, -1.2347F, 3.1162F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(49, 65).addBox(-0.85F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.7158F, -1.4339F, -0.5911F, 1.3271F, -0.508F, 0.7959F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(14, 65).addBox(-0.9604F, -0.4135F, -1.3837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.0021F, -1.4681F, 0.2752F, 1.1906F, -0.9667F, 0.9933F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 47).addBox(-1.275F, -0.85F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3414F, -2.5263F, -1.1472F, -0.1737F, 0.4164F, 1.5706F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(78, 25).addBox(-0.1F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 78).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0765F, -0.7515F, -1.6168F, -0.1113F, 0.2443F, 1.6015F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(80, 0).addBox(-0.7F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 80).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3934F, -1.8303F, -1.1082F, 1.129F, 0.2007F, -0.1105F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(57, 25).addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1202F, -1.9491F, -1.3752F, 0.9732F, -0.7308F, 0.41F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(79, 73).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.156F, -2.787F, -0.9819F, -0.1177F, -0.1742F, 1.6286F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 79).addBox(-0.3F, -0.95F, 0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(16, 57).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2768F, -1.9639F, -1.4215F, -0.2693F, -1.1211F, 1.8517F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(29, 79).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1215F, -1.7621F, -1.4462F, 0.7487F, 0.3631F, 1.5638F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(24, 79).addBox(-1.325F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 4).addBox(-1.1F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(78, 66).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2701F, -1.0057F, -1.7855F, -0.124F, 0.3631F, 1.5638F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(31, 75).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 29).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(50, 74).addBox(-0.1F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.396F, -1.4496F, -1.2522F, 1.7784F, 0.3631F, 1.5638F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(79, 41).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.123F, -1.5518F, -1.5262F, 0.7487F, 0.3631F, 1.5638F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(80, 69).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1269F, -0.9909F, -1.7392F, 0.7487F, 0.3631F, 1.5638F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(82, 31).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3767F, -0.1284F, -1.6549F, 1.4902F, 0.3178F, 0.6015F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(25, 82).addBox(-0.1F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 73).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3946F, -0.7103F, -1.5098F, 1.7911F, 0.2443F, 1.6015F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 19).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.103F, -0.2069F, -1.9359F, 0.2979F, 0.7455F, 0.7043F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(78, 16).addBox(-0.1F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 78).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1209F, -0.7888F, -1.7908F, 0.7614F, 0.2443F, 1.6015F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 22).addBox(-0.15F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1553F, -0.1313F, -2.0921F, 0.2336F, -1.0237F, 1.2456F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 71).addBox(-1.3F, -0.5F, -1.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3357F, 1.0397F, -1.2904F, 0.24F, 0.1288F, 1.8684F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(37, 29).addBox(-0.7F, -0.55F, -1.375F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1485F, -0.3366F, -0.1207F, 0.0112F, -0.8914F, 1.9585F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(64, 25).addBox(-1.05F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4672F, 0.89F, -0.367F, 0.7666F, -0.5703F, 0.963F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(64, 21).addBox(-0.8322F, -0.9518F, -1.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2112F, 0.8845F, 0.0929F, 0.645F, -0.6689F, 0.916F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(68, 70).addBox(-1.85F, -0.15F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.8446F, -0.5033F, 0.5308F, 0.705F, -0.7769F, 0.751F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 50).addBox(-1.85F, -0.15F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6559F, 0.1934F, 0.0819F, 0.794F, -0.7176F, 0.8383F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(57, 64).addBox(-0.8F, -0.8F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6846F, 0.1338F, 1.4922F, 1.2063F, 0.1002F, 0.0799F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(56, 81).addBox(-0.5F, -0.4485F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.485F, 3.938F, -1.2967F, 1.7696F, 0.2058F, 0.8939F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(44, 81).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.485F, 3.938F, -1.2967F, 1.5951F, 0.2058F, 0.8939F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(39, 81).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.335F, 3.738F, -1.2967F, 1.5951F, 0.2058F, 0.4139F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(81, 38).addBox(-0.5F, -0.5235F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.335F, 3.738F, -1.2967F, 1.7696F, 0.2058F, 0.4139F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(20, 82).addBox(-0.45F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4881F, 3.7048F, -1.2866F, 1.4599F, 0.1583F, 0.3686F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(82, 10).addBox(-0.45F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4881F, 3.7048F, -1.2866F, 1.809F, 0.1583F, 0.3686F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(82, 7).addBox(-0.425F, -0.5985F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.435F, 3.413F, -1.2467F, 1.7696F, 0.2058F, 0.1521F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(70, 81).addBox(-0.425F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.435F, 3.413F, -1.2467F, 1.5951F, 0.2058F, 0.1521F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(81, 35).addBox(-0.5F, -0.5985F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.235F, 3.413F, -1.2967F, 1.7696F, 0.2058F, 0.1521F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(34, 81).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.235F, 3.413F, -1.2967F, 1.5951F, 0.2058F, 0.1521F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(83, 19).addBox(-0.55F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0575F, 1.5567F, 0.2255F, 0.8969F, 0.2058F, 0.2917F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(42, 64).addBox(-0.4867F, -0.1636F, 2.3821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(64, 17).addBox(-0.3617F, -0.6636F, 2.3821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5612F, 3.1595F, -1.2071F, 1.0085F, 0.137F, 0.1787F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(21, 63).addBox(-0.1526F, -0.5257F, -1.7714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2112F, 0.8845F, 0.0929F, 0.8763F, 0.1021F, 0.1305F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(73, 49).addBox(-1.841F, -0.841F, -0.841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0954F, 2.0762F, -1.8658F, 2.2789F, 0.231F, 1.552F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(73, 46).addBox(-1.841F, -0.841F, -0.841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0954F, 2.0762F, -1.8658F, -2.9571F, 0.231F, 1.552F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.4135F, 2.3664F, -1.9406F, 1.3854F, 0.7193F, -0.0348F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(26, 68).addBox(-0.85F, -0.161F, -1.852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2541F, 0.9686F, -2.2344F, 1.4271F, 0.2541F, 0.0518F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(28, 64).addBox(-0.525F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.285F, -4.7045F, 3.287F, 0.0589F, 0.8791F, -1.4466F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 85).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8964F, -5.8341F, 2.7482F, 0.0415F, 0.4432F, -1.4742F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(80, 85).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2209F, -6.4995F, 2.4308F, 0.3382F, 0.2951F, -0.691F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(71, 66).addBox(-2.0F, -0.975F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8739F, -4.4319F, 0.7984F, 0.5288F, 0.0101F, -0.9206F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(71, 23).addBox(-2.0F, -0.975F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8964F, -5.1443F, 1.4998F, 0.6235F, 0.5276F, -0.5791F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(35, 64).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8739F, -4.4319F, 0.7984F, 0.9531F, 0.7915F, -1.4507F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(71, 20).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8964F, -5.1443F, 1.4998F, 0.063F, 0.7915F, -1.4507F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(71, 17).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8964F, -5.398F, 1.9306F, 0.0513F, 0.5301F, -1.4696F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(71, 26).addBox(-2.0F, -0.0098F, -1.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2209F, -5.7678F, 1.1405F, 0.6346F, 0.5075F, -0.5669F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 16).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2209F, -6.0333F, 1.5564F, 0.4097F, 0.35F, -0.6683F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(68, 0).addBox(-0.85F, -0.161F, -1.852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2541F, 0.9686F, -2.2344F, 1.4317F, 0.0121F, 0.0864F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(85, 44).addBox(-0.5061F, -0.59F, 0.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(85, 13).addBox(-0.5061F, -0.59F, -0.2904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.2862F, 3.1595F, -1.2071F, 1.2539F, 0.1389F, 0.1494F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(54, 84).addBox(-0.5061F, -0.6352F, -0.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2862F, 3.1595F, -1.2071F, 1.472F, 0.1389F, 0.1494F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.7791F, 4.4615F, -4.0745F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(52, 51).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8304F, -6.2137F, 3.4627F, 1.7222F, 0.6333F, 1.0926F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-0.55F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4064F, -5.7787F, 3.4074F, 0.9522F, 0.3799F, 0.2833F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-0.475F, -0.9F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1962F, 1.9688F, -1.7932F, 2.9984F, -0.1734F, -0.1443F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.4939F, -0.3592F, 0.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.2862F, 3.1595F, -1.2071F, 2.5192F, -0.1389F, -0.1494F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-0.4939F, -0.625F, -0.0571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2862F, 3.1595F, -1.2071F, 2.0393F, -0.1389F, -0.1494F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.6648F, 0.9034F, 0.5853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-0.6648F, 0.9034F, 0.7853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(67, 75).mirror().addBox(-0.6648F, -0.0966F, -0.1147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-1.3637F, 0.9197F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(0, 83).mirror().addBox(-1.3637F, 0.9197F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(67, 75).mirror().addBox(-1.3637F, -0.0803F, -0.0789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.3742F, -1.5969F, -0.0272F, 0.9333F, -0.0492F, -0.0271F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.6648F, -0.5003F, 3.8872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(75, 83).mirror().addBox(-1.3637F, -0.4803F, 3.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5612F, 3.1595F, -1.2071F, 1.038F, -0.0492F, -0.0271F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.9529F, -0.1653F, -2.5473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -2.7225F, -0.9791F, 1.2432F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-1.9074F, -0.1653F, -1.0059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -2.9125F, 0.0263F, 1.6035F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-2.0196F, -0.1653F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -2.908F, 0.1962F, 1.6437F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-0.4453F, -0.1653F, -1.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -2.4557F, -1.2043F, 0.9449F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(85, 28).mirror().addBox(-0.4992F, -0.4988F, -0.5434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7625F, -2.8018F, 2.0744F, 3.1101F, 0.8984F, 1.3512F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6571F, -2.5038F, 1.7501F, 3.0349F, 0.8753F, 1.1709F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(80, 44).mirror().addBox(-0.7235F, -0.1768F, -0.1453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -2.9793F, 2.1455F, -0.1771F, 0.7895F, -1.7936F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-0.2122F, -0.1653F, -0.2722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -0.2499F, -0.408F, -1.4433F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(41, 78).mirror().addBox(-0.1268F, -0.1653F, -1.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -2.1642F, -1.2934F, 0.6382F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.078F, -0.1653F, -0.5351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -3.3793F, 2.5455F, -0.2508F, -0.4165F, -1.4409F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.567F, -0.1768F, -0.1742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1436F, -2.9793F, 2.1455F, -0.2329F, 1.0033F, -1.8646F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 53).mirror().addBox(-0.5081F, -0.5004F, -0.4574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7625F, -2.8018F, 2.0744F, -3.1314F, 0.7284F, 1.3821F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-1.0056F, -0.1227F, -0.5494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.9021F, -2.0681F, 1.2752F, 3.0446F, 0.7885F, 1.1841F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-0.4252F, -0.1204F, -1.5138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4771F, -1.4681F, 0.3752F, 2.9164F, -0.7034F, 1.344F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.11F, -0.1204F, -0.8789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4035F, -1.2139F, 0.5163F, 0.6527F, -1.0467F, -2.2484F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.11F, -0.1204F, -0.5789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4771F, -1.4681F, 0.3752F, 0.3473F, -1.0467F, -2.2484F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-0.8281F, -0.2885F, -2.8745F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6106F, -0.5672F, -1.0663F, -0.1799F, 1.1173F, -2.1979F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(43, 58).mirror().addBox(-0.2781F, -0.2885F, -1.7495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0021F, -1.4681F, 0.2752F, -0.1108F, 0.9615F, -2.1584F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.35F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.221F, -1.6453F, 0.2163F, 1.0614F, -0.4328F, -2.0145F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.15F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4401F, -1.2605F, 0.5526F, 0.6013F, 0.1011F, -1.6254F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-0.2781F, -0.4135F, -0.3745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0021F, -1.4681F, 0.2752F, 0.5858F, 0.304F, -1.916F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(26, 75).mirror().addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.939F, -4.4984F, 0.4892F, -1.1401F, -0.795F, 1.5852F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.15F, -1.825F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.3499F, -3.425F, -0.7713F, -2.122F, -0.9285F, 1.5224F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-0.15F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3499F, -3.425F, -0.7713F, -1.5984F, -0.9285F, 1.5224F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(-0.4607F, -0.3435F, -1.2283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2569F, -2.9994F, -0.3352F, -1.5825F, 0.2138F, 1.592F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1451F, -2.7463F, -0.5835F, 0.0284F, 1.2678F, -2.6223F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.1352F, -1.1911F, -1.623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2569F, -2.9994F, -0.3352F, -0.7906F, 1.2347F, -3.1162F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-0.15F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.7158F, -1.4339F, -0.5911F, 1.3271F, 0.508F, -0.7959F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-0.0396F, -0.4135F, -1.3837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.0021F, -1.4681F, 0.2752F, 1.1906F, 0.9667F, -0.9933F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(0.275F, -0.85F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3414F, -2.5263F, -1.1472F, -0.1737F, -0.4164F, -1.5706F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.9F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 78).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0765F, -0.7515F, -1.6168F, -0.1113F, -0.2443F, -1.6015F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.3F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3934F, -1.8303F, -1.1082F, 1.129F, -0.2007F, 0.1105F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(57, 25).mirror().addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1202F, -1.9491F, -1.3752F, 0.9732F, 0.7308F, -0.41F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.156F, -2.787F, -0.9819F, -0.1177F, 0.1742F, -1.6286F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(65, 79).mirror().addBox(-0.7F, -0.95F, 0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(16, 57).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2768F, -1.9639F, -1.4215F, -0.2693F, 1.1211F, -1.8517F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1215F, -1.7621F, -1.4462F, 0.7487F, -0.3631F, -1.5638F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(0.325F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 4).mirror().addBox(0.1F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(78, 66).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2701F, -1.0057F, -1.7855F, -0.124F, -0.3631F, -1.5638F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 29).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(50, 74).mirror().addBox(-0.9F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.396F, -1.4496F, -1.2522F, 1.7784F, -0.3631F, -1.5638F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.123F, -1.5518F, -1.5262F, 0.7487F, -0.3631F, -1.5638F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(80, 69).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1269F, -0.9909F, -1.7392F, 0.7487F, -0.3631F, -1.5638F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3767F, -0.1284F, -1.6549F, 1.4902F, -0.3178F, -0.6015F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.9F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 73).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3946F, -0.7103F, -1.5098F, 1.7911F, -0.2443F, -1.6015F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(78, 19).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.103F, -0.2069F, -1.9359F, 0.2979F, -0.7455F, -0.7043F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-0.9F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 78).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1209F, -0.7888F, -1.7908F, 0.7614F, -0.2443F, -1.6015F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.85F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1553F, -0.1313F, -2.0921F, 0.2336F, 1.0237F, -1.2456F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.7F, -0.5F, -1.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3357F, 1.0397F, -1.2904F, 0.24F, -0.1288F, -1.8684F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-1.3F, -0.55F, -1.375F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1485F, -0.3366F, -0.1207F, 0.0112F, 0.8914F, -1.9585F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(0.05F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, 0.89F, -0.367F, 0.7666F, 0.5703F, -0.963F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-0.1678F, -0.9518F, -1.8521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2112F, 0.8845F, 0.0929F, 0.645F, 0.6689F, -0.916F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-0.15F, -0.15F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.8446F, -0.5033F, 0.5308F, 0.705F, 0.7769F, -0.751F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.15F, -0.15F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6559F, 0.1934F, 0.0819F, 0.794F, 0.7176F, -0.8383F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(-0.2F, -0.8F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6846F, 0.1338F, 1.4922F, 1.2063F, -0.1002F, -0.0799F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-0.5F, -0.4485F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.485F, 3.938F, -1.2967F, 1.7696F, -0.2058F, -0.8939F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(44, 81).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.485F, 3.938F, -1.2967F, 1.5951F, -0.2058F, -0.8939F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(39, 81).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.335F, 3.738F, -1.2967F, 1.5951F, -0.2058F, -0.4139F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(81, 38).mirror().addBox(-0.5F, -0.5235F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.335F, 3.738F, -1.2967F, 1.7696F, -0.2058F, -0.4139F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.55F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4881F, 3.7048F, -1.2866F, 1.4599F, -0.1583F, -0.3686F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-0.55F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.4881F, 3.7048F, -1.2866F, 1.809F, -0.1583F, -0.3686F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-0.575F, -0.5985F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.435F, 3.413F, -1.2467F, 1.7696F, -0.2058F, -0.1521F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.575F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.435F, 3.413F, -1.2467F, 1.5951F, -0.2058F, -0.1521F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.5F, -0.5985F, -0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.235F, 3.413F, -1.2967F, 1.7696F, -0.2058F, -0.1521F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(34, 81).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.235F, 3.413F, -1.2967F, 1.5951F, -0.2058F, -0.1521F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(83, 19).mirror().addBox(-0.45F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0575F, 1.5567F, 0.2255F, 0.8969F, -0.2058F, -0.2917F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(42, 64).mirror().addBox(-0.5133F, -0.1636F, 2.3821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(64, 17).mirror().addBox(-0.6383F, -0.6636F, 2.3821F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5612F, 3.1595F, -1.2071F, 1.0085F, -0.137F, -0.1787F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.8474F, -0.5257F, -1.7714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2112F, 0.8845F, 0.0929F, 0.8763F, -0.1021F, -0.1305F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(-0.159F, -0.841F, -0.841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0954F, 2.0762F, -1.8658F, 2.2789F, -0.231F, -1.552F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.159F, -0.841F, -0.841F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0954F, 2.0762F, -1.8658F, -2.9571F, -0.231F, -1.552F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.4135F, 2.3664F, -1.9406F, 1.3854F, -0.7193F, 0.0348F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(26, 68).mirror().addBox(-0.15F, -0.161F, -1.852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.2541F, 0.9686F, -2.2344F, 1.4271F, -0.2541F, -0.0518F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(-0.475F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.285F, -4.7045F, 3.287F, 0.0589F, -0.8791F, 1.4466F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8964F, -5.8341F, 2.7482F, 0.0415F, -0.4432F, 1.4742F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2209F, -6.4995F, 2.4308F, 0.3382F, -0.2951F, 0.691F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(0.0F, -0.975F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8739F, -4.4319F, 0.7984F, 0.5288F, -0.0101F, 0.9206F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(0.0F, -0.975F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8964F, -5.1443F, 1.4998F, 0.6235F, -0.5276F, 0.5791F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8739F, -4.4319F, 0.7984F, 0.9531F, -0.7915F, 1.4507F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8964F, -5.1443F, 1.4998F, 0.063F, -0.7915F, 1.4507F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8964F, -5.398F, 1.9306F, 0.0513F, -0.5301F, 1.4696F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(0.0F, -0.0098F, -1.002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2209F, -5.7678F, 1.1405F, 0.6346F, -0.5075F, 0.5669F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2209F, -6.0333F, 1.5564F, 0.4097F, -0.35F, 0.6683F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.15F, -0.161F, -1.852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.2541F, 0.9686F, -2.2344F, 1.4317F, -0.0121F, -0.0864F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-0.4939F, -0.59F, 0.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(85, 13).mirror().addBox(-0.4939F, -0.59F, -0.2904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.2862F, 3.1595F, -1.2071F, 1.2539F, -0.1389F, -0.1494F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(54, 84).mirror().addBox(-0.4939F, -0.6352F, -0.3078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2862F, 3.1595F, -1.2071F, 1.472F, -0.1389F, -0.1494F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -0.6797F, -0.6789F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.6709F, 1.1613F, 0.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -0.7679F, -0.2094F, 0.1047F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.6709F, -0.2737F, -0.9532F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -1.213F, -0.2094F, 0.1047F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.6709F, 0.294F, -2.3465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -0.2967F, -0.2094F, 0.1047F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(56, 4).mirror().addBox(-0.6709F, 0.0008F, -0.8366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -0.2531F, -0.2094F, 0.1047F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.6709F, 0.861F, 0.8154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -1.3003F, -0.2094F, 0.1047F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-0.0365F, -0.8136F, -0.4746F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(48, 19).mirror().addBox(-0.0365F, -0.7136F, -0.9746F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -1.9732F, -0.1917F, 0.0529F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-0.6709F, -1.6663F, -1.078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -1.0559F, -0.2094F, 0.1047F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-0.0926F, 1.9076F, 3.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(45, 86).mirror().addBox(-0.1926F, 2.6076F, 3.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 86).mirror().addBox(-0.1926F, 3.2076F, 3.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.835F, -0.1856F, 0.0513F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(19, 76).mirror().addBox(-0.1926F, 2.8983F, 2.1001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.5907F, -0.1856F, 0.0513F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.0926F, 3.4001F, 3.4351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 47).mirror().addBox(-0.0926F, 3.7751F, 3.4351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.8961F, -0.1856F, 0.0513F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(36, 77).mirror().addBox(-0.0365F, 0.3348F, 1.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.3659F, -0.1917F, 0.0529F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-0.6459F, 0.4239F, 1.3327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -1.7628F, -0.2094F, 0.1047F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.6459F, 0.5088F, 1.6038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -2.0246F, -0.2094F, 0.1047F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-0.6709F, -0.8268F, 0.4018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(49, 83).mirror().addBox(-0.6709F, -1.2268F, 0.4018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -0.733F, -0.2094F, 0.1047F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-0.6709F, -0.8194F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, -1.4748F, -0.2094F, 0.1047F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-0.0365F, -0.5447F, 1.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.3135F, -0.1917F, 0.0529F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(75, 55).mirror().addBox(-0.371F, -3.8207F, 1.0598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2375F, 0.2652F, -1.5271F, 2.5615F, -0.0871F, 0.0522F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.0365F, 1.9811F, -0.2121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.0954F, -0.1917F, 0.0529F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(-0.0365F, 2.7443F, -0.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.1652F, -0.1917F, 0.0529F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(72, 77).mirror().addBox(-0.0365F, 2.0286F, 0.9549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.1914F, -0.1917F, 0.0529F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.1926F, 4.2809F, 0.2345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.198F, -0.1856F, 0.0513F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.1926F, -0.0395F, 3.796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, 2.7762F, -0.1856F, 0.0513F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-0.1926F, -4.1074F, -0.3481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, 1.3799F, -0.1856F, 0.0513F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-0.0365F, 2.9395F, -0.174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3375F, 0.2652F, -4.2271F, -2.235F, -0.1917F, 0.0529F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(50, 61).addBox(-0.3541F, 0.5088F, 1.6038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -2.0246F, 0.2094F, -0.1047F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(14, 61).addBox(-0.3541F, 0.4239F, 1.3327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -1.7628F, 0.2094F, -0.1047F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(75, 55).addBox(-0.629F, -3.8207F, 1.0598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, 2.5615F, 0.0871F, -0.0522F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(85, 59).addBox(-0.9635F, -0.5447F, 1.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.3135F, 0.1917F, -0.0529F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(72, 77).addBox(-0.9635F, 2.0286F, 0.9549F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.1914F, 0.1917F, -0.0529F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(36, 77).addBox(-0.9635F, 0.3348F, 1.3104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.3659F, 0.1917F, -0.0529F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(85, 47).addBox(-0.9073F, 3.7751F, 3.4351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(59, 85).addBox(-0.9073F, 3.4001F, 3.4351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.8961F, 0.1856F, -0.0513F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(7, 66).addBox(-0.8074F, -4.1074F, -0.3481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, 1.3799F, 0.1856F, -0.0513F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(35, 84).addBox(-0.8074F, -0.0395F, 3.796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, 2.7762F, 0.1856F, -0.0513F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(30, 84).addBox(-0.8074F, 4.2809F, 0.2345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.198F, 0.1856F, -0.0513F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(19, 76).addBox(-0.8074F, 2.8983F, 2.1001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.5907F, 0.1856F, -0.0513F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(71, 86).addBox(-0.8074F, 3.2076F, 3.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 86).addBox(-0.8074F, 2.6076F, 3.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 68).addBox(-0.9073F, 1.9076F, 3.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.835F, 0.1856F, -0.0513F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(50, 69).addBox(-0.3291F, -1.6663F, -1.078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -1.0559F, 0.2094F, -0.1047F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(84, 3).addBox(-0.9635F, 2.7443F, -0.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.1652F, 0.1917F, -0.0529F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(77, 80).addBox(-0.9635F, 1.9811F, -0.2121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.0954F, 0.1917F, -0.0529F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(64, 66).addBox(-0.9635F, 2.9395F, -0.174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -2.235F, 0.1917F, -0.0529F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(48, 19).addBox(-0.9635F, -0.7136F, -0.9746F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(16, 51).addBox(-0.9635F, -0.8136F, -0.4746F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1375F, 0.2652F, -4.2271F, -1.9732F, 0.1917F, -0.0529F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(61, 0).addBox(-0.3291F, 0.861F, 0.8154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -1.3003F, 0.2094F, -0.1047F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(49, 83).addBox(-0.3291F, -1.2268F, 0.4018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 25).addBox(-0.3291F, -0.8268F, 0.4018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -0.733F, 0.2094F, -0.1047F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(83, 65).addBox(-0.3291F, -0.8194F, -0.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -1.4748F, 0.2094F, -0.1047F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(56, 4).addBox(-0.3291F, 0.0008F, -0.8366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -0.2531F, 0.2094F, -0.1047F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(36, 55).addBox(-0.3291F, 0.294F, -2.3465F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -0.2967F, 0.2094F, -0.1047F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(40, 73).addBox(-0.3291F, -0.2737F, -0.9532F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -1.213F, 0.2094F, -0.1047F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(10, 81).addBox(-0.3291F, 1.1613F, 0.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0375F, 0.2652F, -1.5271F, -0.7679F, 0.2094F, -0.1047F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(42, 39).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(33, 44).addBox(-0.5F, 2.4F, 2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2964F, 0.0845F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(36, 49).addBox(0.0F, -0.5F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 2.5F, -0.2531F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 62).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offset(0.0F, 0.031F, 2.9564F));

		PartDefinition cube_r487 = tail2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(88, 20).addBox(0.0F, -0.6F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(10, 44).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0513F, 2.0655F, -0.3142F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1095F, 2.7879F, 0.2094F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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