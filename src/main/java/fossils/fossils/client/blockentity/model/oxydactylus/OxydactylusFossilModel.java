package fossils.fossils.client.blockentity.model.oxydactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OxydactylusFossilModel extends SkullModelBase {
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
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftEye;
	private final ModelPart rightEye;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;

	public OxydactylusFossilModel(ModelPart root) {
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
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftEye = this.head.getChild("leftEye");
		this.rightEye = this.head.getChild("rightEye");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.155F, 10.7159F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 19).addBox(0.0F, -0.4F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 55).addBox(0.0F, -0.9201F, -1.0189F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-2.5F, 0.3F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 64).addBox(0.5F, 0.3F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.091F, -2.0538F, -2.615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, 0.0679F, 0.1694F, -0.5426F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.091F, -2.1836F, -3.727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -0.2375F, 0.1694F, -0.5426F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-0.091F, 0.0545F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -0.892F, 0.1694F, -0.5426F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 42).mirror().addBox(-0.9326F, -0.9791F, -2.5742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -0.4387F, -0.1465F, -0.3541F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.4921F, -2.0335F, 1.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -0.3737F, 0.1935F, -1.2433F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-0.8201F, 0.4538F, -0.2599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -0.2157F, 0.4186F, -1.1475F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.1937F, -1.9103F, -0.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -1.9859F, 0.5873F, -1.3626F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 42).mirror().addBox(-0.6177F, -1.2051F, -0.0898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, 0.2644F, -0.2597F, -0.6484F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 44).mirror().addBox(-0.51F, -0.1039F, -1.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5493F, 0.8501F, 0.5725F, -1.2657F, -0.1304F, -0.9515F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(31, 44).addBox(-0.49F, -0.1039F, -1.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -1.2657F, 0.1304F, 0.9515F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(43, 42).addBox(-0.3823F, -1.2051F, -0.0898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, 0.2644F, 0.2597F, 0.6484F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 55).addBox(0.1937F, -1.9103F, -0.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -1.9859F, -0.5873F, 1.3626F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 55).addBox(-0.1799F, 0.4538F, -0.2599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -0.2157F, -0.4186F, 1.1475F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5079F, -2.0335F, 1.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -0.3737F, -0.1935F, 1.2433F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 42).addBox(-0.0674F, -0.9791F, -2.5742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -0.4387F, 0.1465F, 0.3541F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 0).addBox(-0.909F, -2.0538F, -2.615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, 0.0679F, -0.1694F, 0.5426F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 14).addBox(-0.909F, 0.0545F, -3.3954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -0.892F, -0.1694F, 0.5426F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 38).addBox(-0.909F, -2.1836F, -3.727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5493F, 0.8501F, 0.5725F, -0.2375F, -0.1694F, 0.5426F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 44).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 1.1013F, 1.6603F, 0.408F, -0.0974F, 0.0053F));

		PartDefinition cube_r24 = leftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 30).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 61).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.1318F, -1.223F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 38).addBox(-1.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 56).addBox(-1.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(32, 67).addBox(-1.0F, -6.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 15.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(31, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.8156F, -0.8455F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 39).addBox(-1.5F, 0.2897F, 0.5469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.6785F, -1.1766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 6).addBox(-1.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5016F, 0.7634F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 58).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0632F, 0.5069F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(57, 43).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 28).addBox(-1.9F, -1.0479F, -0.9979F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 64).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.7599F, 0.1537F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.6193F, -1.976F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 56).addBox(-1.0F, -3.5136F, -1.0894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 0.8414F, 0.2937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.7586F, 0.1937F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(14, 48).addBox(-0.6F, -0.6629F, -1.9144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 10.0449F, -0.5841F, 2.0944F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, -0.2629F, -4.5144F));

		PartDefinition cube_r40 = leftLeg5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 22).addBox(8.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r41 = leftLeg5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(55, 14).addBox(8.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r42 = leftLeg5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r43 = leftLeg5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 48).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 1.1013F, 1.6603F, 0.7232F, -0.1314F, -0.1152F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(48, 34).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 63).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.1318F, -1.223F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 55).addBox(0.0F, -0.0026F, -0.0104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.132F, -1.1969F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 50).addBox(0.0F, -0.6026F, -1.4104F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 32).addBox(0.0F, -6.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 15.928F, -1.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.8156F, -0.8455F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(39, 15).addBox(-0.5F, 0.2897F, 0.5469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.6785F, -1.1766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -0.3815F, -1.7559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.5785F, 1.1234F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.5016F, 0.7634F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(60, 3).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0632F, 0.5069F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 46).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 59).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 28).addBox(0.9F, -1.0479F, -0.9979F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 42).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.7599F, 0.1537F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.6193F, -1.976F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r58 = rightLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 56).addBox(0.0F, -3.5136F, -1.0894F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 0.8414F, 0.2937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 21).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.7586F, 0.1937F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(48, 14).addBox(-0.4F, -0.6629F, -1.9144F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 10.0449F, -0.5841F, 1.8762F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, -0.2629F, -4.5144F));

		PartDefinition cube_r60 = rightLeg5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(55, 26).addBox(-9.0001F, 0.2042F, 1.1491F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r61 = rightLeg5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(55, 18).addBox(-9.0001F, -0.2275F, 1.2852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r62 = rightLeg5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(21, 51).addBox(-0.5F, -0.6306F, -0.97F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r63 = rightLeg5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -0.3665F, -0.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4491F, -3.2653F, 0.2715F, 0.0841F, 0.0234F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 58).addBox(0.0F, -0.8751F, -1.017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 72).addBox(0.0F, -0.7577F, -1.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 0.6485F, -7.2659F, -3.012F, 0.4137F, -1.9041F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(23, 72).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 20).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(31, 56).mirror().addBox(0.0F, -0.8F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9891F, 0.3356F, -5.2905F, -2.9462F, 0.1493F, -1.8886F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(23, 72).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 20).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9891F, 0.6485F, -7.2659F, -3.012F, -0.4137F, 1.9041F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(31, 56).addBox(0.0F, -0.8F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9891F, 0.3356F, -5.2905F, -2.9462F, -0.1493F, 1.8886F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(73, 61).addBox(0.0F, -0.8289F, -1.0194F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4464F, -4.8932F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 48).addBox(0.0F, -0.6266F, -0.9788F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 38).addBox(-0.5F, -0.0266F, -1.9788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.9F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, 0.0048F, -3.0052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 22).addBox(-0.5F, 0.1F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6844F, -8.6012F, 0.2464F, 0.127F, 0.0318F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -0.5048F, -0.1123F, 0.0265F, -0.6751F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -0.5048F, -0.1154F, -0.0034F, -0.9352F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 10).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -0.5048F, -0.1008F, -0.0562F, -1.4125F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -2.5048F, 0.0056F, 0.1315F, -0.6149F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(44, 66).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -2.5048F, -0.0288F, 0.1284F, -0.8789F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -2.5048F, -0.0851F, 0.1006F, -1.3613F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -4.5048F, -0.0088F, 0.1214F, -0.6167F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -4.5048F, -0.0887F, 0.0835F, -1.3617F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(44, 64).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.9707F, -4.5048F, -0.0401F, 0.115F, -0.8803F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(62, 14).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -0.5048F, -0.1123F, -0.0265F, 0.6751F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 16).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -0.5048F, -0.1154F, 0.0034F, 0.9352F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(31, 10).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -0.5048F, -0.1008F, 0.0562F, 1.4125F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(61, 65).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -2.5048F, 0.0056F, -0.1315F, 0.6149F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(44, 66).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -2.5048F, -0.0288F, -0.1284F, 0.8789F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 66).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -2.5048F, -0.0851F, -0.1006F, 1.3613F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(63, 0).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -4.5048F, -0.0088F, -0.1214F, 0.6167F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(63, 6).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -4.5048F, -0.0887F, -0.0835F, 1.3617F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 64).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.9707F, -4.5048F, -0.0401F, -0.115F, 0.8803F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.3F, -6.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 1.0404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(26, 72).addBox(0.0F, -1.1938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -0.9045F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(51, 72).addBox(0.0F, -1.7938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -2.9596F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 67).addBox(0.0F, -2.3698F, 0.0459F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.0596F, -0.3054F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -4.8577F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 67).addBox(0.0F, -4.2966F, 3.4932F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.7F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 72).addBox(0.0F, -2.0854F, -0.9869F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 72).addBox(0.0F, -0.7854F, -2.6869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 31).addBox(0.0F, 0.084F, -4.3148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(62, 20).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.2468F, -0.0847F, -0.829F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 55).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.2172F, -0.1452F, -1.0855F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.5F, 0.6439F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(67, 60).addBox(5.3F, 0.6439F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, -0.4494F, -7.7571F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-0.5F, -0.0346F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(67, 57).addBox(5.3F, -0.0346F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, -0.0319F, -8.0506F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(67, 49).mirror().addBox(-0.5F, -0.0346F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 49).addBox(5.3F, -0.0346F, 0.0229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9F, 0.965F, -8.1291F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(-0.5F, -0.0346F, -1.1771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 30).addBox(5.3F, -0.0346F, -1.1771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 2.7496F, -7.8941F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 43).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.3313F, -6.5264F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.5F, -0.0561F, -0.9801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(62, 57).addBox(5.3F, -0.0561F, -0.9801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, 0.0867F, -5.7242F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(13, 20).mirror().addBox(-0.4F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3765F, 8.576F, -2.4092F, -0.0518F, -0.624F, -2.2312F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 18).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3765F, 8.576F, -2.4092F, -0.0072F, -0.4161F, -2.2972F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0504F, 0.1596F, -0.6781F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.007F, 0.1672F, -0.9434F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-5.1393F, -2.68F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0716F, 0.1514F, -1.4294F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(19, 62).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0315F, 0.0935F, -0.6885F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0546F, 0.0822F, -0.951F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-5.1393F, -2.68F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0864F, 0.0477F, -1.4308F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(13, 14).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2511F, 2.6507F, -7.5347F, 1.0607F, 0.4507F, -0.0552F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(34, 25).addBox(5.3F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.9F, 0.5277F, -5.9221F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.5F, -0.1346F, -0.1771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 34).addBox(5.3F, -0.1346F, -0.1771F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, 5.3572F, -8.9189F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6311F, 8.0103F, -5.1658F, 0.0939F, -0.0741F, -2.726F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-2.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0989F, 0.0379F, -0.6929F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-4.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.1053F, 0.011F, -0.9534F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(40, 4).mirror().addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4925F, 8.3742F, -3.3817F, 0.0975F, -0.2141F, -2.524F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-5.1795F, -2.6157F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0985F, -0.0387F, -1.4309F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(-0.5F, -0.2435F, -0.2146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 50).addBox(5.3F, -0.2435F, -0.2146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 5.4138F, -8.4221F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(13, 7).mirror().addBox(-0.5F, -0.942F, -0.7286F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(13, 7).addBox(5.3F, -0.942F, -0.7286F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.9F, 4.1006F, -7.2709F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2511F, 2.6507F, -7.5347F, 1.0607F, -0.4507F, 0.0552F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 43).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9F, 1.3313F, -6.5264F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(51, 4).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6311F, 8.0103F, -5.1658F, 0.0939F, 0.0741F, 2.726F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(60, 36).addBox(3.1393F, -2.68F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, -0.0716F, -0.1514F, 1.4294F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 62).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.007F, -0.1672F, 0.9434F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 12).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.8F, 0.0504F, -0.1596F, 0.6781F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(62, 28).addBox(3.1393F, -2.68F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0864F, -0.0477F, 1.4308F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(62, 53).addBox(2.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0546F, -0.0822F, 0.951F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(19, 62).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.5F, -0.0315F, -0.0935F, 0.6885F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(62, 55).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.2172F, 0.1452F, 1.0855F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 20).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -6.7F, -0.2468F, 0.0847F, 0.829F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(62, 18).addBox(0.1956F, -0.2765F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0989F, -0.0379F, 0.6929F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(62, 30).addBox(2.0492F, -0.8354F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.1053F, -0.011F, 0.9534F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(13, 20).addBox(-6.6F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3765F, 8.576F, -2.4092F, -0.0518F, 0.624F, 2.2312F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(26, 18).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3765F, 8.576F, -2.4092F, -0.0072F, 0.4161F, 2.2972F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(40, 4).addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4925F, 8.3742F, -3.3817F, 0.0975F, 0.2141F, 2.524F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(62, 26).addBox(3.1795F, -2.6157F, -0.785F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -4.7F, -0.0985F, 0.0387F, 1.4309F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(25, 28).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(25, 38).addBox(-1.6328F, -0.9931F, -2.141F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 8.0332F, -7.037F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1328F, 0.1305F, -1.1053F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6328F, 7.1332F, -5.737F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 54).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0648F, -8.1008F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.1855F, -4.9515F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 6.8509F, -8.6532F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(61, 67).addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5124F, 0.1552F, -0.1285F, 1.0907F, 0.0014F, -0.001F));

		PartDefinition cube_r152 = leftarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 17).addBox(0.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -0.0653F, 0.558F, 0.9511F, 0.0014F, -0.001F));

		PartDefinition cube_r153 = leftarm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(36, 63).addBox(0.0F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5119F, -0.1535F, 0.4938F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r154 = leftarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(45, 50).addBox(0.0F, -0.0389F, -0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4642F, 0.7901F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(50, 50).addBox(0.0F, -1.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.5957F, 2.2992F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftarm2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 71).addBox(-0.264F, -0.8149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.364F, 1.2298F, -0.0451F, 1.5708F, -1.1694F, -1.5708F));

		PartDefinition cube_r158 = leftarm2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 39).addBox(-0.2142F, -5.8646F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 9.4594F, 0.0842F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r159 = leftarm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(40, 54).addBox(-0.2F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, -1.5708F, -1.4486F, 1.5708F));

		PartDefinition cube_r160 = leftarm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 22).addBox(0.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.164F, -1.0702F, 1.8549F, 1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r161 = leftarm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 2).addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -0.8515F, 0.9635F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.7001F, 0.3382F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(26, 61).addBox(-0.5F, -0.0423F, -0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8517F, -0.0624F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftArm4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(24, 47).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 2.0605F, 0.0176F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r163 = leftArm4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(48, 18).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 2.0605F, 0.0176F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r164 = leftArm4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(46, 10).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 2.0605F, 0.0176F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r165 = leftArm4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(45, 46).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 2.0605F, 0.0176F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 6.8509F, -8.6532F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(66, 67).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5124F, 0.1552F, -0.1285F, 1.0907F, -0.0014F, 0.001F));

		PartDefinition cube_r167 = rightarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(22, 69).addBox(-1.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -0.0653F, 0.558F, 0.9511F, -0.0014F, 0.001F));

		PartDefinition cube_r168 = rightarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5119F, -0.1535F, 0.4938F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(14, 52).addBox(-1.0F, -0.0389F, -0.9208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.4642F, 0.7901F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 52).addBox(-1.0F, -1.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.9601F, 2.3498F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(5, 68).addBox(-1.0F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.5957F, 2.2992F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(43, 71).addBox(-0.736F, -0.8149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.364F, 1.2298F, -0.0451F, 1.5708F, 1.1694F, 1.5708F));

		PartDefinition cube_r173 = rightarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(5, 39).addBox(-0.7858F, -5.8646F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 9.4594F, 0.0842F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r174 = rightarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(55, 33).addBox(-0.8F, -2.9F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, -1.5708F, 1.4486F, -1.5708F));

		PartDefinition cube_r175 = rightarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(62, 49).addBox(-1.257F, -2.9067F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.164F, -1.0702F, 1.8549F, 1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r176 = rightarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(67, 22).addBox(-0.4F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -0.8515F, 0.9635F, 1.5708F, -0.2443F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(10, 28).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 9.7001F, 0.3382F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(52, 61).addBox(-0.5F, -0.0423F, -0.4094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8517F, -0.0624F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightArm4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(7, 48).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 2.0605F, 0.0176F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r178 = rightArm4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(48, 22).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 2.0605F, 0.0176F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r179 = rightArm4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 46).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 2.0605F, 0.0176F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r180 = rightArm4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 2.0605F, 0.0176F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7F, -9.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r181 = neck3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(24, 42).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2512F, -1.4247F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r182 = neck3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 12).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(17, 43).addBox(0.0F, -0.4681F, 0.5279F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 22).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.3167F, 0.2457F, -0.0914F));

		PartDefinition cube_r184 = neck.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(67, 8).addBox(0.0F, -4.3753F, -0.5709F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3352F, 0.2488F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r185 = neck.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(43, 31).addBox(-0.5F, -2.3753F, -0.4709F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(43, 24).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 63).addBox(0.0F, -4.4F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2087F, -3.7109F, 1.0048F, 0.1344F, -0.1117F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(35, 54).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -4.9F, 0.0F, 0.2277F, 0.1862F, -0.1135F));

		PartDefinition cube_r186 = neck5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(40, 69).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9034F, 0.0259F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck6.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(48, 72).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9055F, -0.1071F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(56, 6).addBox(-1.0F, -1.0278F, 0.0377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4791F, -2.4982F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -1.0278F, -0.2623F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.7526F, -3.1426F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 38).mirror().addBox(0.0F, -1.0974F, -1.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.9171F, -3.1432F, 0.5457F, -0.2093F, -0.0531F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(50, 38).addBox(-1.0F, -1.0974F, -1.4372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.9171F, -3.1432F, 0.5457F, 0.2093F, 0.0531F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -1.0278F, -0.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5687F, -4.6373F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(0.0F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.78F, 3.6168F, -6.4451F, 0.277F, -0.036F, 0.1259F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.219F, 2.8998F, -5.5064F, 0.4864F, -0.036F, 0.1259F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2182F, 2.7534F, -5.0179F, 0.5562F, -0.036F, 0.1259F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(0.0F, -0.6147F, -1.8473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.9171F, -3.1432F, 0.4061F, -0.2093F, -0.0531F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-1.0F, -0.5982F, -0.0143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(55, 30).addBox(-1.0F, -0.5982F, -0.0143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.0811F, -3.0344F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(25, 33).addBox(-0.5F, 0.0391F, -2.0143F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.5364F, -4.2018F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(48, 26).addBox(-1.0F, -0.6147F, -1.8473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 1.9171F, -3.1432F, 0.4061F, 0.2093F, 0.0531F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(69, 70).addBox(-1.0F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.78F, 3.6168F, -6.4451F, 0.277F, 0.036F, -0.1259F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2182F, 2.7534F, -5.0179F, 0.5562F, 0.036F, -0.1259F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.219F, 2.8998F, -5.5064F, 0.4864F, 0.036F, -0.1259F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(37, 10).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 2.2811F, -5.2344F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(70, 5).addBox(-0.5F, -0.168F, -0.6589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 1.8524F, -5.7174F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(40, 0).addBox(0.5F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, -0.4871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(60, 73).addBox(0.0F, -0.0454F, -1.0101F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0468F, -2.7568F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(32, 73).addBox(-0.004F, -0.0454F, -1.0101F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5618F, -1.8997F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(45, 61).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.6352F, -3.1245F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(38, 60).addBox(0.5F, -0.2019F, -0.898F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.3787F, -0.4208F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 61).addBox(-1.0F, 1.9079F, -1.7229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(37, 72).addBox(-0.003F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8093F, -0.9403F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(72, 35).addBox(0.0F, -1.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftEye = head.addOrReplaceChild("leftEye", CubeListBuilder.create(), PartPose.offset(1.0F, -0.003F, -3.0725F));

		PartDefinition cube_r213 = leftEye.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5379F, 0.509F, 0.3859F));

		PartDefinition cube_r214 = leftEye.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(69, 25).addBox(-1.2986F, -0.5F, -1.1018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.92F, 0.3032F, 0.0147F, 0.7923F, 0.4867F, 0.4428F));

		PartDefinition cube_r215 = leftEye.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(28, 52).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2591F, 0.8688F, 0.4474F, 0.9393F, 0.509F, 0.4732F));

		PartDefinition cube_r216 = leftEye.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(17, 68).addBox(-0.4408F, -0.5941F, -0.7214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5219F, 0.3181F, 0.7997F, 1.1252F, 0.4042F, 0.1843F));

		PartDefinition cube_r217 = leftEye.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(49, 6).addBox(0.0F, -1.4278F, 0.3377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4515F, 2.7734F, -1.5101F, 0.5702F, 0.1919F, 0.1217F));

		PartDefinition cube_r218 = leftEye.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5195F, -0.4416F, -0.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5219F, 0.3181F, 0.5997F, 0.9086F, 0.181F, 0.1741F));

		PartDefinition cube_r219 = leftEye.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(72, 47).addBox(-0.003F, -0.1F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0601F, -1.4871F, 2.9637F, -1.8145F, 1.1994F, -1.4018F));

		PartDefinition cube_r220 = leftEye.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7121F, -0.5004F, 1.2717F, 0.2048F, 0.4469F, -1.1227F));

		PartDefinition cube_r221 = leftEye.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(59, 70).addBox(-1.2F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4386F, -1.0693F, 0.9692F, 0.1961F, 0.3442F, -1.1453F));

		PartDefinition cube_r222 = leftEye.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(64, 70).addBox(-1.2F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4795F, -1.4513F, 1.8925F, -0.0872F, -0.1288F, -1.15F));

		PartDefinition cube_r223 = leftEye.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(68, 63).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6548F, -0.2321F, 1.197F, 0.6144F, -0.0539F, -0.013F));

		PartDefinition cube_r224 = leftEye.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 46).addBox(0.2F, -0.368F, -1.5589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 2.0109F, -2.5191F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftEye.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(69, 28).addBox(-1.0F, 0.0443F, -1.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1411F, -0.7248F, 1.0409F, 0.14F, 0.2017F));

		PartDefinition cube_r226 = leftEye.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(67, 38).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 3.4749F, -3.3794F, 0.7498F, 0.2739F, 0.2467F));

		PartDefinition cube_r227 = leftEye.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(32, 20).addBox(0.2F, -0.4F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.4F, 2.2842F, -2.162F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftEye.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(70, 11).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4353F, -0.4832F, 1.5453F, 0.5311F, -0.3388F, -0.1668F));

		PartDefinition cube_r229 = leftEye.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(53, 10).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5777F, -0.6072F, 1.8644F, 0.0478F, -0.6924F, -0.1923F));

		PartDefinition rightEye = head.addOrReplaceChild("rightEye", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.003F, -3.0725F));

		PartDefinition cube_r230 = rightEye.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5379F, -0.509F, -0.3859F));

		PartDefinition cube_r231 = rightEye.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(0.2986F, -0.5F, -1.1018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.92F, 0.3032F, 0.0147F, 0.7923F, -0.4867F, -0.4428F));

		PartDefinition cube_r232 = rightEye.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2591F, 0.8688F, 0.4474F, 0.9393F, -0.509F, -0.4732F));

		PartDefinition cube_r233 = rightEye.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(-0.5592F, -0.5941F, -0.7214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5219F, 0.3181F, 0.7997F, 1.1252F, -0.4042F, -0.1843F));

		PartDefinition cube_r234 = rightEye.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-1.0F, -1.4278F, 0.3377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4515F, 2.7734F, -1.5101F, 0.5702F, -0.1919F, -0.1217F));

		PartDefinition cube_r235 = rightEye.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-0.4805F, -0.4416F, -0.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5219F, 0.3181F, 0.5997F, 0.9086F, -0.181F, -0.1741F));

		PartDefinition cube_r236 = rightEye.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(0.003F, -0.1F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0601F, -1.4871F, 2.9637F, -1.8145F, -1.1994F, 1.4018F));

		PartDefinition cube_r237 = rightEye.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7121F, -0.5004F, 1.2717F, 0.2048F, -0.4469F, 1.1227F));

		PartDefinition cube_r238 = rightEye.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(0.2F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4386F, -1.0693F, 0.9692F, 0.1961F, -0.3442F, 1.1453F));

		PartDefinition cube_r239 = rightEye.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(0.2F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4795F, -1.4513F, 1.8925F, -0.0872F, 0.1288F, 1.15F));

		PartDefinition cube_r240 = rightEye.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(68, 63).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6548F, -0.2321F, 1.197F, 0.6144F, 0.0539F, 0.013F));

		PartDefinition cube_r241 = rightEye.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-1.2F, -0.368F, -1.5589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.0109F, -2.5191F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightEye.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(0.0F, 0.0443F, -1.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1411F, -0.7248F, 1.0409F, -0.14F, -0.2017F));

		PartDefinition cube_r243 = rightEye.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.4749F, -3.3794F, 0.7498F, -0.2739F, -0.2467F));

		PartDefinition cube_r244 = rightEye.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-1.2F, -0.4F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.2842F, -2.162F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightEye.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4353F, -0.4832F, 1.5453F, 0.5311F, 0.3388F, 0.1668F));

		PartDefinition cube_r246 = rightEye.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(53, 10).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5777F, -0.6072F, 1.8644F, 0.0478F, 0.6924F, 0.1923F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2123F, -1.7648F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(24, 65).addBox(0.6F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 0.5F, -0.4F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.1971F, -1.0525F, -0.9559F, -0.1071F, -0.0754F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-0.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.8514F, -2.4178F, -1.145F, -0.1752F, -0.0789F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-1.0F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(71, 66).addBox(0.6F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3F, 2.527F, -0.6584F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2973F, 3.3971F, -4.0582F, 0.2748F, 0.0503F, -0.1763F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 44).addBox(1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 1.2436F, 0.5245F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-1.0F, 0.0205F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(66, 46).addBox(0.6F, 0.0205F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, 2.5337F, 0.4684F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(-1.0F, 0.0205F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(10, 40).addBox(0.6F, 0.0205F, -0.9888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 1.7145F, 1.0419F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(51, 65).mirror().addBox(-0.1F, 0.0711F, -0.9856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5421F, -0.1993F, -1.0821F, -0.192F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.1F, 1.9447F, -0.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5421F, -0.1993F, -1.2217F, -0.192F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-0.1F, 0.2269F, -0.5774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 2.5421F, -0.1993F, -1.2915F, -0.192F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(54, 69).addBox(0.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.5F, 4.0171F, -4.6308F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(69, 52).addBox(0.0F, 0.1258F, -0.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(49, 69).addBox(0.0F, -0.2742F, -0.7993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 3.9613F, -3.6965F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(57, 73).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.1971F, -1.0525F, -0.9559F, 0.1071F, 0.0754F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 61).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 2.8514F, -2.4178F, -1.145F, 0.1752F, 0.0789F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(5, 71).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2973F, 3.3971F, -4.0582F, 0.2748F, -0.0503F, 0.1763F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 65).addBox(-0.9F, 0.0711F, -0.9856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 2.5421F, -0.1993F, -1.0821F, 0.192F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(56, 65).addBox(-0.9F, 1.9447F, -0.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1F, 2.5421F, -0.1993F, -1.2217F, 0.192F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(12, 65).addBox(-0.9F, 0.2269F, -0.5774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1F, 2.5421F, -0.1993F, -1.2915F, 0.192F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 5).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 35).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.4974F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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