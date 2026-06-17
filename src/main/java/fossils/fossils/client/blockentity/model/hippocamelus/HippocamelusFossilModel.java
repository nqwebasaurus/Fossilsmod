package fossils.fossils.client.blockentity.model.hippocamelus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HippocamelusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart chest2;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HippocamelusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
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
		this.chest2 = this.chest.getChild("chest2");
		this.bone = this.chest2.getChild("bone");
		this.bone3 = this.chest2.getChild("bone3");
		this.leftarm = this.chest2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.9473F, 11.5338F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(0.0F, -0.7F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(82, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.588F, 0.0518F, 0.3744F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 38).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.588F, -0.0518F, -0.3744F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(11, 34).mirror().addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5958F, 1.3453F, 1.9425F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-1.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 67).mirror().addBox(1.3184F, 2.9241F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.8014F, 1.2539F, -0.4172F, -0.7562F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(1.3383F, 2.9241F, 0.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.8014F, 1.1809F, -0.3505F, -0.562F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(0.3351F, 0.8092F, -0.5194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -0.0082F, -0.0014F, 1.0396F, -0.2512F, -0.1346F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(0.3351F, 0.2627F, 1.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -0.0082F, -0.0014F, 0.3851F, -0.2512F, -0.1346F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(0.3351F, 0.1808F, 0.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -0.0082F, -0.0014F, 0.6032F, -0.2512F, -0.1346F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 73).mirror().addBox(0.3351F, -0.2281F, -0.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -0.0082F, -0.0014F, 0.2105F, -0.2512F, -0.1346F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 28).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3652F, 1.9518F, 0.7935F, -0.5704F, -0.2903F, -1.1684F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(61, 73).mirror().addBox(-0.0279F, -0.9596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.7014F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 89).mirror().addBox(-0.0279F, -2.2281F, 0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.4918F, -2.9014F, -0.9369F, 0.139F, -0.1137F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.0279F, -1.1596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.4918F, -2.9014F, -0.0643F, 0.139F, -0.1137F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-0.0279F, -0.9596F, -0.0797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 0.5918F, -2.7014F, -0.0643F, 0.139F, -0.1137F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 5).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.6728F, -0.2171F, -0.561F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(70, 0).mirror().addBox(0.0F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6221F, -2.2858F, -4.5924F, -2.3074F, 0.5919F, -3.0987F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.475F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3639F, -2.3414F, -5.2709F, -1.1139F, 0.8162F, -1.486F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(87, 11).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3639F, -2.3414F, -5.2709F, -0.9361F, 0.7022F, -1.2287F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9417F, -2.9207F, -6.2811F, -0.7458F, 0.4373F, -0.8816F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-0.3337F, -0.494F, -1.92F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, -1.6247F, -4.7232F, -0.6639F, 0.0684F, -0.5622F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.5958F, 1.3453F, 1.9425F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 93).addBox(0.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(90, 67).addBox(-2.3184F, 2.9241F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.8014F, 1.2539F, 0.4172F, 0.7562F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 49).addBox(-2.3383F, 2.9241F, 0.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.8014F, 1.1809F, 0.3505F, 0.562F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 90).addBox(-1.3351F, 0.8092F, -0.5194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7884F, -0.0082F, -0.0014F, 1.0396F, 0.2512F, 0.1346F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 79).addBox(-1.3351F, 0.2627F, 1.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, -0.0082F, -0.0014F, 0.3851F, 0.2512F, 0.1346F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 90).addBox(-1.3351F, 0.1808F, 0.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7884F, -0.0082F, -0.0014F, 0.6032F, 0.2512F, 0.1346F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 73).addBox(-1.3351F, -0.2281F, -0.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7884F, -0.0082F, -0.0014F, 0.2105F, 0.2512F, 0.1346F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 28).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3652F, 1.9518F, 0.7935F, -0.5704F, 0.2903F, 1.1684F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(61, 73).addBox(-0.9721F, -0.9596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.7014F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 89).addBox(-0.9721F, -2.2281F, 0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7884F, 0.4918F, -2.9014F, -0.9369F, -0.139F, 0.1137F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 73).addBox(-0.9721F, -1.1596F, -0.0796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 0.4918F, -2.9014F, -0.0643F, -0.139F, 0.1137F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 52).addBox(-0.9721F, -0.9596F, -0.0797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7884F, 0.5918F, -2.7014F, -0.0643F, -0.139F, 0.1137F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 5).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.6728F, 0.2171F, 0.561F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 49).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 70).addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(70, 0).addBox(-1.0F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6221F, -2.2858F, -4.5924F, -2.3074F, -0.5919F, 3.0987F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 17).addBox(-0.525F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3639F, -2.3414F, -5.2709F, -1.1139F, -0.8162F, 1.486F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 11).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3639F, -2.3414F, -5.2709F, -0.9361F, -0.7022F, 1.2287F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 87).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9417F, -2.9207F, -6.2811F, -0.7458F, -0.4373F, 0.8816F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(61, 65).addBox(-0.6663F, -0.494F, -1.92F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7884F, -1.6247F, -4.7232F, -0.6639F, -0.0684F, 0.5622F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 2.933F, 1.2639F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 46).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-1.0F, -0.7047F, -0.3173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(0.0F, -1.7026F, -1.2104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.5F, -0.1181F, -0.162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(33, 64).mirror().addBox(-1.0F, 0.4977F, -0.1755F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 36).mirror().addBox(-1.0F, 0.2977F, 0.1245F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(41, 18).mirror().addBox(-1.0F, -0.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3402F, 0.115F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-1.0F, 0.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6684F, 0.4198F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-1.0F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6684F, 0.4198F, -0.7156F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.762F, 1.102F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-1.0F, -0.2F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 77).mirror().addBox(-1.0F, -0.9955F, -0.4315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4414F, 0.0653F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(16, 61).mirror().addBox(0.9F, 2.9521F, -1.1979F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(22, 85).mirror().addBox(-0.5F, -1.9974F, -0.4231F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1261F, -1.6647F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(0.0F, -4.0136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.7545F, -0.6771F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftLeg4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-7.5017F, -0.4683F, 0.9145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(7.6F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r67 = leftLeg4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.6282F, -0.4683F, -0.0876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r68 = leftLeg4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(27, 34).mirror().addBox(-0.5F, -0.4093F, -2.2013F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.3142F, -1.2932F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2143F, -4.7932F));

		PartDefinition cube_r69 = leftLeg5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-9.011F, 0.9327F, 0.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r70 = leftLeg5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-9.011F, 0.5674F, 1.196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(9.7F, -0.1103F, 2.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r71 = leftLeg5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.4892F, 0.0979F, -1.3004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r72 = leftLeg5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-0.4892F, 0.4284F, -1.0773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.1103F, 2.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 2.933F, 1.2639F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-1.0F, -0.7047F, -0.3173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-1.0F, -1.7026F, -1.2104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.5F, -0.1181F, -0.162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5182F, -1.2666F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-1.0F, 0.4977F, -0.1755F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-1.0F, 0.2977F, 0.1245F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0156F, -1.1455F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-1.0F, -0.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3402F, 0.115F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-1.0F, 0.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6684F, 0.4198F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-1.0F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6684F, 0.4198F, -0.7156F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.762F, 1.102F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-1.0F, -0.2F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-1.0F, -0.9955F, -0.4315F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.235F, -0.4494F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(77, 61).mirror().addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4414F, 0.0653F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(-1.9F, 2.9521F, -1.1979F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.5813F, 0.8228F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 85).mirror().addBox(-0.5F, -1.9974F, -0.4231F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.1261F, -1.6647F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(-1.0F, -4.0136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 40).mirror().addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.7545F, -0.6771F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(6.5017F, -0.4683F, 0.9145F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-7.6F, 1.318F, -0.2551F, 0.703F, 0.1068F, 0.0901F));

		PartDefinition cube_r94 = rightLeg4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(63, 28).mirror().addBox(-0.3718F, -0.4683F, -0.0876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.318F, -0.2551F, 0.703F, -0.1068F, -0.0901F));

		PartDefinition cube_r95 = rightLeg4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(41, 8).mirror().addBox(-0.5F, -0.4093F, -2.2013F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3142F, -1.2932F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.9143F, -2.7932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(8.011F, 0.9327F, 0.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-9.7F, -0.8103F, 0.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r97 = rightLeg5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(8.011F, 0.5674F, 1.196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-9.7F, -0.8103F, 0.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r98 = rightLeg5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-0.5108F, 0.0979F, -1.3004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.8103F, 0.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r99 = rightLeg5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(47, 65).mirror().addBox(-0.5108F, 0.4284F, -1.0773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.8103F, 0.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.0263F, 0.0872F, -0.0023F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(0.0F, -1.0751F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(0.0F, -1.1077F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 44).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0726F, -0.2302F, 1.4981F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 34).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.0439F, -0.2372F, 1.0045F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.1047F, -0.2176F, 0.7365F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(94, 45).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 95).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(33, 95).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 95).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4552F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.1047F, 0.2176F, -0.7365F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.0439F, 0.2372F, -1.0045F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0726F, 0.2302F, -1.4981F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 41).mirror().addBox(0.5753F, -1.0995F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4552F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(36, 95).mirror().addBox(0.4485F, -1.1641F, -0.1492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4485F, -0.6806F, -7.7242F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.3494F, 0.041F, -0.0149F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(80, 81).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.098F, -0.2749F, 0.8534F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(19, 7).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0437F, -0.2882F, 1.3533F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 82).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1667F, -0.2401F, 0.585F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 24).addBox(3.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0357F, -0.3223F, 1.3509F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 82).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.122F, -0.3011F, 0.8466F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(12, 83).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1968F, -0.2593F, 0.5776F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(30, 23).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0324F, -0.3573F, 1.402F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(82, 9).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.1427F, -0.3302F, 0.8924F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 83).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2246F, -0.282F, 0.6224F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(36, 6).addBox(-0.1F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7261F, 10.1061F, -2.8978F, -0.2591F, 0.3355F, 2.7233F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(41, 16).addBox(-5.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3821F, 11.6532F, -1.8605F, -0.275F, 0.3229F, 2.6744F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 28).addBox(-6.2F, -0.025F, -0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3821F, 11.6532F, -1.8605F, -0.4671F, 0.6047F, 2.3499F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(19, 83).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2246F, 0.282F, -0.6224F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 9).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.1427F, 0.3302F, -0.8924F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 23).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0324F, 0.3573F, -1.402F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(12, 83).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1968F, 0.2593F, -0.5776F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.122F, 0.3011F, -0.8466F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0357F, 0.3223F, -1.3509F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1667F, 0.2401F, -0.585F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-10.0551F, -2.1982F, -0.4625F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0437F, 0.2882F, -1.3533F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.098F, 0.2749F, -0.8534F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.8F, -0.025F, -0.2F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3821F, 11.6532F, -1.8605F, -0.4671F, -0.6047F, -2.3499F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-0.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3821F, 11.6532F, -1.8605F, -0.275F, -0.3229F, -2.6744F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-5.9F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7261F, 10.1061F, -2.8978F, -0.2591F, -0.3355F, -2.7233F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(17, 17).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.5611F, -5.8954F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(0.0F, -1.1938F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(0.0F, -1.3938F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(65, 94).mirror().addBox(0.0F, -1.7698F, -0.0541F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0837F, 0.0907F, 0.036F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(13, 19).mirror().addBox(0.0F, -2.198F, -0.0557F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2437F, -0.9064F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(13, 95).mirror().addBox(0.005F, -3.2427F, -0.5115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(42, 95).mirror().addBox(0.0F, -1.3463F, -0.1497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(0.005F, -3.9427F, -0.5115F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4485F, -4.6377F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 95).mirror().addBox(0.0F, -1.0463F, -0.1997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4485F, -4.6377F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(45, 23).addBox(0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1911F, 9.7884F, -0.4723F, -0.2649F, 0.1926F, 2.9489F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(34, 25).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1912F, 9.0833F, 1.9111F, -0.2198F, 0.229F, 2.8437F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(52, 83).addBox(-0.2136F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0614F, -0.1743F, 0.6328F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 15).addBox(1.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0138F, -0.1842F, 0.8987F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 14).addBox(3.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, -0.0737F, -0.1695F, 1.3862F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(78, 83).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.1071F, -0.2014F, 0.5457F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(84, 62).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.0507F, -0.2222F, 0.8127F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 26).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0594F, -0.22F, 1.3049F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 84).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.1454F, -0.2239F, 0.5376F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(17, 26).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.0475F, -0.2621F, 1.302F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(27, 85).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.0817F, -0.2538F, 0.8054F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.0817F, 0.2538F, -0.8054F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(17, 26).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.0475F, 0.2621F, -1.302F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.1454F, 0.2239F, -0.5376F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0594F, 0.22F, -1.3049F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.0507F, 0.2222F, -0.8127F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.1071F, 0.2014F, -0.5457F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 14).mirror().addBox(-9.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, -0.0737F, 0.1695F, -1.3862F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-3.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0138F, 0.1842F, -0.8987F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(52, 83).mirror().addBox(-1.7864F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0614F, 0.1743F, -0.6328F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1912F, 9.0833F, 1.9111F, -0.2198F, -0.229F, -2.8437F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(45, 23).mirror().addBox(-5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1911F, 9.7884F, -0.4723F, -0.2649F, -0.1926F, -2.9489F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.1328F, -0.4006F, 3.1937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6328F, 11.1115F, -5.2831F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2485F, -4.5877F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(0.005F, -3.0235F, -0.4903F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r176 = chest2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(16, 95).mirror().addBox(0.0F, -2.0848F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r177 = chest2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.005F, -3.8245F, -0.6989F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -1.8F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r178 = chest2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(39, 95).mirror().addBox(0.0F, -1.9529F, -0.1234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -1.8F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r179 = chest2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 30).addBox(3.0781F, -2.659F, -0.4744F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0973F, 0.0301F, 1.4484F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(56, 46).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5358F, 7.4859F, -1.8266F, 0.0095F, 0.0613F, 2.6771F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(57, 52).addBox(0.325F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3858F, 8.8525F, 1.2396F, 0.0147F, 0.1934F, 2.9209F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 83).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1002F, -0.0182F, 0.9708F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(33, 83).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0922F, -0.0434F, 0.7101F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 83).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1648F, 0.0588F, 0.756F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(84, 0).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1441F, 0.0993F, 1.0154F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(83, 44).addBox(3.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0821F, 0.1545F, 1.4962F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(67, 46).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9683F, 6.1431F, -3.4932F, 0.3799F, 0.2119F, 2.5073F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9683F, 6.1431F, -3.4932F, 0.3799F, -0.2119F, -2.5073F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-5.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0821F, -0.1545F, -1.4962F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1441F, -0.0993F, -1.0154F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.1648F, -0.0588F, -0.756F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(33, 83).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0922F, 0.0434F, -0.7101F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(26, 83).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.1002F, 0.0182F, -0.9708F));

		PartDefinition cube_r194 = chest2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-4.325F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3858F, 8.8525F, 1.2396F, 0.0147F, -0.1934F, -2.9209F));

		PartDefinition cube_r195 = chest2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5358F, 7.4859F, -1.8266F, 0.0095F, -0.0613F, -2.6771F));

		PartDefinition cube_r196 = chest2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-7.0781F, -2.659F, -0.4744F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0973F, -0.0301F, -1.4484F));

		PartDefinition cube_r197 = chest2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-1.0F, 7.7989F, 1.8569F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r198 = chest2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(17, 10).mirror().addBox(-0.5F, 8.447F, -1.8193F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r199 = chest2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7335F, 0.6514F, -0.9238F, 0.2394F, -0.204F, 0.264F));

		PartDefinition cube_r200 = bone.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(17, 28).mirror().addBox(-2.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r201 = bone.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-3.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-0.5F, 0.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 2.5902F, -2.2292F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, 3.8085F, -2.315F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.3304F, 2.1935F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.705F, 1.2663F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.0894F, 0.4783F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, -1.2653F, -0.0881F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 0.62F, -0.7557F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(61, 69).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.511F, -1.2097F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-3.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(-0.5F, -1.5F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(74, 89).mirror().addBox(-0.5F, -1.0F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(62, 89).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.0196F, 2.9868F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(54, 69).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.6624F, 2.2208F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.041F, 2.7339F, -0.3661F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.3734F, -0.1392F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7335F, 0.6514F, -0.9238F, 0.2394F, 0.204F, -0.264F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(17, 28).addBox(1.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r216 = bone3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 30).addBox(2.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r217 = bone3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 32).addBox(-0.5F, 0.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.041F, 2.5902F, -2.2292F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r218 = bone3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(89, 57).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, 3.8085F, -2.315F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r219 = bone3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(84, 46).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.041F, -2.3304F, 2.1935F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r220 = bone3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, -2.705F, 1.2663F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r221 = bone3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(89, 8).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.041F, -2.0894F, 0.4783F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r222 = bone3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, -1.2653F, -0.0881F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r223 = bone3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(68, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.041F, 0.62F, -0.7557F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(61, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, 1.511F, -1.2097F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 43).addBox(2.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r226 = bone3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(79, 89).addBox(-0.5F, -1.5F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(74, 89).addBox(-0.5F, -1.0F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(62, 89).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.041F, 1.0196F, 2.9868F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r227 = bone3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(54, 69).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.041F, 1.6624F, 2.2208F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r228 = bone3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(21, 52).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.041F, 2.7339F, -0.3661F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r229 = bone3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(41, 27).addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.041F, 1.3734F, -0.1392F, 0.6458F, 0.0F, 0.0F));

		PartDefinition leftarm = chest2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8F, 6.7742F, -2.6723F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-0.9982F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5117F, -1.1761F, 0.052F, 1.2216F, -0.0012F, 0.0013F));

		PartDefinition cube_r231 = leftarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0122F, -1.1915F, 0.9714F, -1.5971F, -0.0014F, 0.001F));

		PartDefinition cube_r232 = leftarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0113F, -0.5974F, 1.1883F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r233 = leftarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-1.0F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5118F, -0.1534F, 0.4938F, 0.541F, -0.0014F, 0.001F));

		PartDefinition cube_r234 = leftarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(77, 92).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9839F, 0.5183F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-1.0F, -3.7461F, -0.9384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5933F, 2.4983F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.0F, 0.0539F, -0.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.872F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(72, 92).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(92, 63).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7848F, 2.6757F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftarm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(60, 92).mirror().addBox(-1.0F, 0.5086F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.8191F, 3.1231F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, 7.7302F, 0.6026F, 1.5708F, 1.1345F, 1.5708F));

		PartDefinition cube_r240 = leftarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6064F, 3.9029F, -0.4284F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r241 = leftarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6064F, 3.8804F, -0.3964F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r242 = leftarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(-1.282F, -2.9884F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.164F, 0.9563F, 0.696F, -1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r243 = leftarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-1.088F, -0.4145F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 1.1144F, 0.4517F, 1.5708F, -1.4835F, 1.5708F));

		PartDefinition cube_r244 = leftarm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-2.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 1.1144F, 0.4517F, 1.5708F, -0.0785F, 1.5708F));

		PartDefinition cube_r245 = leftarm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(89, 35).mirror().addBox(-1.9935F, -1.406F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1236F, 1.1144F, 0.4517F, 1.5708F, 0.2967F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(11, 46).mirror().addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.7375F, 1.9966F, 1.501F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(61, 80).mirror().addBox(-0.5F, -0.1455F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.8945F, 0.3509F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftArm4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3233F, 2.9573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r247 = leftArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3233F, 2.9573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r248 = leftArm4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.9573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r249 = leftArm4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.9573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r250 = leftArm4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(76, 85).mirror().addBox(-0.7082F, -1.488F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.395F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r251 = leftArm4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-6.6378F, -2.8948F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(6.8233F, 0.395F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition rightarm = chest2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 6.7742F, -2.6723F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightarm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(71, 84).mirror().addBox(-0.0018F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5117F, -1.1761F, 0.052F, 1.2216F, 0.0012F, -0.0013F));

		PartDefinition cube_r253 = rightarm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0122F, -1.1915F, 0.9714F, -1.5971F, 0.0014F, -0.001F));

		PartDefinition cube_r254 = rightarm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(49, 85).mirror().addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0113F, -0.5974F, 1.1883F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r255 = rightarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(0.0F, -1.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5118F, -0.1534F, 0.4938F, 0.541F, 0.0014F, -0.001F));

		PartDefinition cube_r256 = rightarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(82, 93).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9839F, 0.5183F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(0.0F, -3.7461F, -0.9384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5933F, 2.4983F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(0.0F, 0.0539F, -0.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.872F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7848F, 2.6757F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightarm.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(0.0F, 0.5086F, -0.3046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.5542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.8191F, 3.1231F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightarm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1064F, 7.7302F, 0.6026F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition cube_r262 = rightarm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6064F, 3.9029F, -0.4284F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r263 = rightarm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6064F, 3.8804F, -0.3964F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r264 = rightarm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 50).mirror().addBox(0.282F, -2.9884F, -0.4596F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.164F, 0.9563F, 0.696F, -1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r265 = rightarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(0.088F, -0.4145F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1236F, 1.1144F, 0.4517F, 1.5708F, 1.4835F, -1.5708F));

		PartDefinition cube_r266 = rightarm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(0.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1236F, 1.1144F, 0.4517F, 1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r267 = rightarm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(0.9935F, -1.406F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1236F, 1.1144F, 0.4517F, 1.5708F, -0.2967F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(16, 46).mirror().addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.7375F, 1.9966F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-0.5F, -0.1455F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.8945F, 0.3509F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightArm4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3233F, 2.9573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r269 = rightArm4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3233F, 2.9573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r270 = rightArm4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.9573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r271 = rightArm4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.9573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r272 = rightArm4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.2918F, -1.488F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.395F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r273 = rightArm4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(12, 85).mirror().addBox(5.6378F, -2.8948F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.8233F, 0.395F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(0.0F, -1.7069F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2935F, -1.5153F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r276 = neck3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(0.0F, -0.6617F, -1.0262F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(48, 95).mirror().addBox(0.0F, -0.8681F, -0.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 34).mirror().addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(19, 95).mirror().addBox(0.0F, -0.5F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(84, 36).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9365F, -2.1677F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r281 = neck4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(22, 95).addBox(-0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r282 = neck4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(22, 95).mirror().addBox(0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8012F, 0.5025F, -0.4F, 0.1777F, -0.0281F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(48, 52).mirror().addBox(-1.0F, 0.4F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.734F, -3.5932F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.734F, -3.5932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1176F, -7.9485F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.5F, -0.2542F, -0.1586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2664F, -9.1221F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-0.5F, -0.3542F, -0.1586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7764F, -9.4537F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3148F, -9.6351F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-0.5F, -0.2094F, -2.3112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4966F, -8.4414F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-1.0F, -0.4F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.2033F, -8.026F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(37, 89).mirror().addBox(-0.5F, 0.7944F, -0.2813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.75F, -9.1F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-1.0F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.2527F, -6.4834F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-0.5F, -0.875F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.1887F, -7.2948F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-0.5F, -0.3615F, -1.4021F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.65F, -5.8F, 0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(11, 40).mirror().addBox(-1.0F, -0.925F, -1.725F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.059F, -2.5026F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-1.0F, 0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-1.5F, 0.8F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2871F, -1.218F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9542F, -3.3838F, -2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-1.5F, -0.2F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.01F, -2.5857F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(43, 40).mirror().addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.01F, -2.5857F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(16, 57).mirror().addBox(-0.5F, 0.0168F, -1.0042F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.992F, -1.5514F, -4.3061F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 40).mirror().addBox(-0.5F, -0.975F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.008F, 0.0874F, -4.4095F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-1.5F, -1.7019F, -0.8729F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4F, 0.3F, 0.6196F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5126F, -1.6743F, -3.644F, -0.1793F, 0.096F, 1.0921F));

		PartDefinition cube_r304 = leftHorn.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(91, 85).mirror().addBox(-0.6726F, -0.4879F, -0.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, -0.0293F, -0.4797F, 0.2264F));

		PartDefinition cube_r305 = leftHorn.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(91, 82).mirror().addBox(-0.4896F, -0.4879F, -0.8809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, -0.0266F, 0.2181F, 0.2071F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(43, 45).mirror().addBox(-10.7712F, -1.483F, -2.3946F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 3.1061F, -0.2158F, 0.427F));

		PartDefinition cube_r307 = leftHorn.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-6.4279F, -0.8666F, -1.0253F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 3.1295F, -0.0001F, 0.3171F));

		PartDefinition cube_r308 = leftHorn.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-2.1711F, -0.5575F, 0.9812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 3.1252F, 0.7416F, 0.2188F));

		PartDefinition cube_r309 = leftHorn.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(33, 61).mirror().addBox(-3.7984F, -0.5575F, -0.224F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 3.1292F, 0.218F, 0.2272F));

		PartDefinition cube_r310 = leftHorn.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(92, 11).mirror().addBox(-1.0849F, -0.5891F, 6.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 2.9875F, -0.9F, -2.8904F));

		PartDefinition cube_r311 = leftHorn.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-2.2535F, -0.5891F, 5.7109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 2.9409F, -1.0718F, -2.8347F));

		PartDefinition cube_r312 = leftHorn.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-3.4791F, -0.5891F, 4.4802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 2.7993F, -1.2826F, -2.6822F));

		PartDefinition cube_r313 = leftHorn.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-3.567F, 0.1668F, 3.6349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 2.7993F, -1.2826F, -2.4641F));

		PartDefinition cube_r314 = leftHorn.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-4.7045F, 0.1668F, -2.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 0.1139F, -0.5748F, 0.2862F));

		PartDefinition cube_r315 = leftHorn.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(19, 80).mirror().addBox(-4.5749F, -0.589F, -0.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 0.3571F, -0.9063F, -0.0753F));

		PartDefinition cube_r316 = leftHorn.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-2.7705F, -0.589F, 0.5025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, 0.8458F, -1.2787F, -0.6139F));

		PartDefinition cube_r317 = leftHorn.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-1.9008F, -0.4879F, -0.7334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, -0.0266F, -0.218F, 0.2186F));

		PartDefinition cube_r318 = leftHorn.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(-1.841F, -0.4879F, -0.5193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6214F, 0.3129F, -0.1296F, -0.0262F, -0.1308F, 0.2163F));

		PartDefinition cube_r319 = leftHorn.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-0.4F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.125F, -0.0266F, 0.2181F, 0.2595F));

		PartDefinition cube_r320 = leftHorn.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-0.8F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.3249F, -0.026F, 0.0437F, 0.2641F));

		PartDefinition cube_r321 = leftHorn.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-0.8F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.3249F, -0.026F, 0.0437F, 0.0023F));

		PartDefinition cube_r322 = leftHorn.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, 0.125F, -0.0266F, 0.2181F, -0.0023F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5126F, -1.6743F, -3.644F, -0.1793F, -0.096F, -1.0921F));

		PartDefinition cube_r323 = rightHorn.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(91, 85).addBox(-0.3274F, -0.4879F, -0.3217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, -0.0293F, 0.4797F, -0.2264F));

		PartDefinition cube_r324 = rightHorn.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(91, 82).addBox(-0.5104F, -0.4879F, -0.8809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, -0.0266F, -0.2181F, -0.2071F));

		PartDefinition cube_r325 = rightHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(43, 45).addBox(5.7712F, -1.483F, -2.3946F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 3.1061F, 0.2158F, -0.427F));

		PartDefinition cube_r326 = rightHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(57, 54).addBox(3.4279F, -0.8666F, -1.0253F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 3.1295F, 0.0001F, -0.3171F));

		PartDefinition cube_r327 = rightHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(80, 55).addBox(0.171F, -0.5575F, 0.9812F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 3.1252F, -0.7416F, -0.2188F));

		PartDefinition cube_r328 = rightHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(33, 61).addBox(0.7984F, -0.5575F, -0.224F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 3.1292F, -0.218F, -0.2272F));

		PartDefinition cube_r329 = rightHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(92, 11).addBox(0.0849F, -0.5891F, 6.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 2.9875F, 0.9F, 2.8904F));

		PartDefinition cube_r330 = rightHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(10, 92).addBox(1.2535F, -0.5891F, 5.7109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 2.9409F, 1.0718F, 2.8347F));

		PartDefinition cube_r331 = rightHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(92, 3).addBox(2.4791F, -0.5891F, 4.4802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 2.7993F, 1.2826F, 2.6822F));

		PartDefinition cube_r332 = rightHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(92, 52).addBox(2.567F, 0.1668F, 3.6349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 2.7993F, 1.2826F, 2.4641F));

		PartDefinition cube_r333 = rightHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(92, 0).addBox(3.7045F, 0.1668F, -2.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 0.1139F, 0.5748F, -0.2862F));

		PartDefinition cube_r334 = rightHorn.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(19, 80).addBox(2.5749F, -0.589F, -0.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 0.3571F, 0.9063F, 0.0753F));

		PartDefinition cube_r335 = rightHorn.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(80, 64).addBox(0.7705F, -0.589F, 0.5025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, 0.8458F, 1.2787F, 0.6139F));

		PartDefinition cube_r336 = rightHorn.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(40, 77).addBox(-0.0992F, -0.4879F, -0.7334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, -0.0266F, 0.218F, -0.2186F));

		PartDefinition cube_r337 = rightHorn.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(54, 80).addBox(-0.159F, -0.4879F, -0.5193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6214F, 0.3129F, -0.1296F, -0.0262F, 0.1308F, -0.2163F));

		PartDefinition cube_r338 = rightHorn.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(33, 80).addBox(-1.6F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.125F, -0.0266F, -0.2181F, -0.2595F));

		PartDefinition cube_r339 = rightHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(26, 80).addBox(-1.2F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.3249F, -0.026F, -0.0437F, -0.2641F));

		PartDefinition cube_r340 = rightHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(80, 6).addBox(-1.2F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4052F, 0.3249F, -0.026F, -0.0437F, -0.0023F));

		PartDefinition cube_r341 = rightHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(80, 3).addBox(-1.5F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.4F, 0.125F, -0.0266F, -0.2181F, 0.0023F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(87, 2).mirror().addBox(-0.2769F, -0.7203F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0355F, -0.0138F, -0.3026F, 2.6493F, -0.1338F, 0.0559F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 61).mirror().addBox(-0.3699F, -0.2092F, -2.2384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0355F, -0.0138F, -0.3026F, 1.1524F, -0.2528F, -0.0816F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(87, 5).mirror().addBox(-0.3699F, -0.3897F, -1.2504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0355F, -0.0138F, -0.3026F, 1.3269F, -0.2528F, -0.0816F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(49, 61).mirror().addBox(-0.5F, -0.425F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(0.1965F, 0.9328F, -0.1049F, 0.8383F, -0.2528F, -0.0816F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-0.5F, -1.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -3.954F, 7.273F, -1.3679F, 0.5256F, 0.2787F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.3012F, -3.954F, 7.273F, 0.6393F, 0.5256F, 0.2787F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(68, 65).mirror().addBox(-0.6587F, -0.8468F, -0.3468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1661F, -3.7771F, 7.2644F, 0.9011F, 0.5256F, 0.2787F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-0.4263F, -0.6767F, -1.6931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5374F, -3.3744F, 6.0597F, 0.8733F, -0.0308F, -0.0424F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-0.5022F, -0.3611F, -0.2451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.6021F, 5.857F, 0.4703F, 0.1031F, -0.0182F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-0.3F, -0.129F, -2.1052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -2.7637F, 4.8341F, 0.4284F, -0.4799F, -0.4094F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.3F, -0.1221F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(70, 60).mirror().addBox(-0.3F, -0.2971F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -2.7637F, 4.8341F, 0.8211F, -0.4799F, -0.4094F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(28, 68).mirror().addBox(-0.5F, -0.394F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4641F, -3.5637F, 5.8341F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(-0.4068F, -0.2989F, -3.3457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, 0.8058F, -0.4257F, -0.1427F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-0.8484F, 0.1185F, 0.4469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, -2.2882F, -0.2404F, -0.4823F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-1.0675F, 0.2693F, -0.5512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, -1.5401F, -0.4468F, -0.6014F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(43, 57).mirror().addBox(-1.0105F, 0.1833F, -1.1748F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, -2.2341F, -0.357F, -0.3656F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-1.2697F, 0.148F, -2.4245F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, -2.5803F, -0.0327F, 0.2487F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-0.0749F, -1.8018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(87, 64).mirror().addBox(-0.0749F, -1.4018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, 0.0567F, 3.314F, -0.8626F, -0.0744F, -0.0489F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(87, 54).mirror().addBox(-0.0749F, -0.3127F, -0.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, 0.0567F, 3.314F, 0.4901F, -0.0744F, -0.0489F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(61, 57).mirror().addBox(-0.5F, 0.0827F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.3433F, 3.314F, 0.2827F, -0.2423F, -0.1F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8715F, -1.3619F, 3.8207F, -1.0907F, 0.7098F, -1.0133F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.0749F, -1.899F, -0.5826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, 0.0567F, 3.314F, -0.7404F, -0.0744F, -0.0489F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.807F, -0.8942F, 3.2634F, 0.3153F, 0.4866F, -1.1264F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.0749F, -0.8295F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, 0.0567F, 3.314F, 0.5686F, -0.0744F, -0.0489F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(94, 26).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1359F, 0.1018F, 1.5132F, 2.7506F, -0.2363F, 0.0222F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.5F, -1.7897F, -0.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.3433F, 3.314F, 1.8884F, -0.2423F, -0.1F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(0.0F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6431F, -0.5541F, 2.5704F, 0.361F, 0.2427F, -1.2328F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-0.5F, -0.4564F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.3433F, 3.314F, 0.3613F, -0.2423F, -0.1F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(-0.2263F, -0.2266F, -3.7658F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.2054F, -2.6761F, 2.0368F, 0.7009F, -0.1581F, 0.0674F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(30, 9).mirror().addBox(-0.2263F, 0.7078F, -3.5916F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.2054F, -2.6761F, 2.0368F, 0.4827F, -0.1581F, 0.0674F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 36).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -1.7185F, 0.6501F, 0.25F, -0.6741F, 1.0589F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -1.7185F, 0.6501F, 0.3373F, -0.6741F, 1.0589F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(90, 73).mirror().addBox(-0.3F, -0.3042F, -0.3086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(70, 26).mirror().addBox(-0.3F, -0.3042F, -0.1086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3359F, -0.6403F, -0.5204F, 0.3373F, -0.6741F, 1.0589F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(84, 90).mirror().addBox(-0.266F, -0.463F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.097F)).mirror(false)
				.texOffs(90, 76).mirror().addBox(-0.266F, 0.137F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(89, 41).mirror().addBox(-0.266F, -0.063F, -1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, 0.6746F, -0.4617F, -0.3422F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-1.5288F, 0.0512F, -1.3531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7062F, -3.5471F, 4.1249F, -2.4472F, 0.2748F, 0.5245F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(70, 48).mirror().addBox(-0.2F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8561F, -4.6632F, 3.606F, -0.2539F, -1.0715F, 1.31F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(21, 61).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8561F, -4.6632F, 3.606F, 1.0685F, -0.2743F, -0.4004F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-0.8F, -0.2F, -1.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1359F, -3.518F, 2.6252F, 0.5829F, 0.4958F, -0.6251F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-0.4463F, -0.4892F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4519F, -2.6843F, 4.8815F, 1.1711F, -0.1747F, -0.0079F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(-0.4463F, -0.2836F, -0.2798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4519F, -2.6843F, 4.8815F, 1.9128F, -0.1747F, -0.0079F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-0.4463F, -0.2916F, 1.2688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(89, 90).mirror().addBox(-0.4463F, -0.2916F, 1.0688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.4519F, -2.6843F, 4.8815F, 1.9041F, -0.1747F, -0.0079F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(67, 91).mirror().addBox(-0.4463F, 0.5976F, 0.8796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(89, 38).mirror().addBox(-0.4463F, 0.5976F, 0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.4519F, -2.6843F, 4.8815F, 2.6895F, -0.1747F, -0.0079F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.8361F, -8.5986F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(87, 2).addBox(-0.7231F, -0.7203F, -0.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0355F, -0.0138F, -0.3026F, 2.6493F, 0.1338F, -0.0559F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(56, 61).addBox(-0.6301F, -0.2092F, -2.2384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.0355F, -0.0138F, -0.3026F, 1.1524F, 0.2528F, 0.0816F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(87, 5).addBox(-0.6301F, -0.3897F, -1.2504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0355F, -0.0138F, -0.3026F, 1.3269F, 0.2528F, 0.0816F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, -0.425F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(-0.1965F, 0.9328F, -0.1049F, 0.8383F, 0.2528F, 0.0816F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(52, 25).addBox(-0.5F, -1.3F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.3012F, -3.954F, 7.273F, -1.3679F, -0.5256F, -0.2787F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.3012F, -3.954F, 7.273F, 0.6393F, -0.5256F, -0.2787F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(68, 65).addBox(-0.3413F, -0.8468F, -0.3468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1661F, -3.7771F, 7.2644F, 0.9011F, -0.5256F, -0.2787F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(68, 56).addBox(-0.5737F, -0.6767F, -1.6931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5374F, -3.3744F, 6.0597F, 0.8733F, 0.0308F, 0.0424F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(68, 52).addBox(-0.4978F, -0.3611F, -0.2451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.6021F, 5.857F, 0.4703F, -0.1031F, 0.0182F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(61, 23).addBox(-0.7F, -0.129F, -2.1052F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6641F, -2.7637F, 4.8341F, 0.4284F, 0.4799F, 0.4094F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(7, 71).addBox(-0.7F, -0.1221F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(70, 60).addBox(-0.7F, -0.2971F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6641F, -2.7637F, 4.8341F, 0.8211F, 0.4799F, 0.4094F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, -0.394F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4641F, -3.5637F, 5.8341F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(42, 61).addBox(-0.5932F, -0.2989F, -3.3457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, 0.8058F, 0.4257F, 0.1427F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(54, 38).addBox(-1.1515F, 0.1185F, 0.4469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, -2.2882F, 0.2404F, 0.4823F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(54, 0).addBox(-0.9325F, 0.2693F, -0.5512F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, -1.5401F, 0.4468F, 0.6014F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(43, 57).addBox(-0.9895F, 0.1833F, -1.1748F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, -2.2341F, 0.357F, 0.3656F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(52, 10).addBox(-0.7303F, 0.148F, -2.4245F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, -2.5803F, 0.0327F, -0.2487F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(87, 79).addBox(-0.9251F, -1.8018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(87, 64).addBox(-0.9251F, -1.4018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6891F, 0.0567F, 3.314F, -0.8626F, 0.0744F, 0.0489F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(87, 54).addBox(-0.9251F, -0.3127F, -0.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6891F, 0.0567F, 3.314F, 0.4901F, 0.0744F, 0.0489F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(61, 57).addBox(-0.5F, 0.0827F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2891F, -0.3433F, 3.314F, 0.2827F, 0.2423F, 0.1F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(89, 20).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8715F, -1.3619F, 3.8207F, -1.0907F, -0.7098F, 1.0133F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(20, 89).addBox(-0.9251F, -1.899F, -0.5826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6891F, 0.0567F, 3.314F, -0.7404F, 0.0744F, 0.0489F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(12, 80).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.807F, -0.8942F, 3.2634F, 0.3153F, -0.4866F, 1.1264F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(10, 89).addBox(-0.9251F, -0.8295F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6891F, 0.0567F, 3.314F, 0.5686F, 0.0744F, 0.0489F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(94, 26).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.1018F, 1.5132F, 2.7506F, 0.2363F, -0.0222F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -1.7897F, -0.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2891F, -0.3433F, 3.314F, 1.8884F, 0.2423F, 0.1F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6431F, -0.5541F, 2.5704F, 0.361F, -0.2427F, 1.2328F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(94, 20).addBox(-0.5F, -0.4564F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2891F, -0.3433F, 3.314F, 0.3613F, 0.2423F, 0.1F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(30, 16).addBox(-0.7737F, -0.2266F, -3.7658F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.2054F, -2.6761F, 2.0368F, 0.7009F, 0.1581F, -0.0674F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(30, 9).addBox(-0.7737F, 0.7078F, -3.5916F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.2054F, -2.6761F, 2.0368F, 0.4827F, 0.1581F, -0.0674F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(70, 36).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3359F, -1.7185F, 0.6501F, 0.25F, 0.6741F, -1.0589F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(68, 18).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3359F, -1.7185F, 0.6501F, 0.3373F, 0.6741F, -1.0589F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(90, 73).addBox(-0.7F, -0.3042F, -0.3086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(70, 26).addBox(-0.7F, -0.3042F, -0.1086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3359F, -0.6403F, -0.5204F, 0.3373F, 0.6741F, -1.0589F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(84, 90).addBox(-0.734F, -0.463F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.097F))
				.texOffs(90, 76).addBox(-0.734F, 0.137F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(89, 41).addBox(-0.734F, -0.063F, -1.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, 0.6746F, 0.4617F, 0.3422F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(58, 32).addBox(-0.4712F, 0.0512F, -1.3531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7062F, -3.5471F, 4.1249F, -2.4472F, -0.2748F, -0.5245F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(70, 48).addBox(-0.8F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8561F, -4.6632F, 3.606F, -0.2539F, 1.0715F, -1.31F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(21, 61).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8561F, -4.6632F, 3.606F, 1.0685F, 0.2743F, 0.4004F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(27, 40).addBox(-0.2F, -0.2F, -1.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1359F, -3.518F, 2.6252F, 0.5829F, -0.4958F, 0.6251F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(91, 14).addBox(-0.5537F, -0.4892F, -0.4665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4519F, -2.6843F, 4.8815F, 1.1711F, 0.1747F, 0.0079F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(68, 22).addBox(-0.5537F, -0.2836F, -0.2798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4519F, -2.6843F, 4.8815F, 1.9128F, 0.1747F, 0.0079F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(91, 60).addBox(-0.5537F, -0.2916F, 1.2688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 90).addBox(-0.5537F, -0.2916F, 1.0688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.4519F, -2.6843F, 4.8815F, 1.9041F, 0.1747F, 0.0079F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(67, 91).addBox(-0.5537F, 0.5976F, 0.8796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 38).addBox(-0.5537F, 0.5976F, 0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.4519F, -2.6843F, 4.8815F, 2.6895F, 0.1747F, 0.0079F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3576F, -1.8783F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(7, 82).addBox(-0.95F, -3.1707F, 1.1809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, 0.2531F, 0.0873F, 0.0698F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(42, 89).addBox(-0.95F, -4.471F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 46).addBox(-0.95F, -3.871F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.1128F, -1.5675F, -0.6632F, 0.0873F, 0.0698F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(11, 30).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.75F, 4.1622F, -2.5234F, -1.1952F, 0.1679F, 0.1431F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(81, 85).addBox(-0.95F, -1.9197F, -0.8436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, -0.7767F, 0.0873F, 0.0698F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(89, 23).addBox(-0.95F, -1.5916F, 1.9316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, 0.6545F, 0.0873F, 0.0698F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(89, 26).addBox(-0.954F, -2.185F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, 0.0349F, 0.0873F, 0.0698F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(82, 11).addBox(-0.95F, -2.4461F, -0.9219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, -0.4712F, 0.0873F, 0.0698F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(47, 81).addBox(-0.5F, -1.175F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7376F, 4.2734F, -2.5021F, -1.0905F, 0.1679F, 0.1431F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(82, 18).addBox(-0.95F, -3.5755F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, 0.0262F, 0.0873F, 0.0698F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(47, 89).addBox(-0.95F, -4.3152F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.1128F, -1.5675F, -0.0175F, 0.0873F, 0.0698F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(52, 89).addBox(-0.95F, -4.7538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(57, 89).addBox(-0.95F, -5.1538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.1128F, -1.5675F, -0.288F, 0.0873F, 0.0698F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(75, 76).addBox(-0.7F, -0.1594F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.55F, 4.872F, -5.057F, -1.3279F, 0.0694F, 0.105F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(15, 92).addBox(-0.95F, -5.3816F, -2.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.65F, 4.1128F, -1.5675F, -0.5061F, 0.0873F, 0.0698F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(92, 17).addBox(-0.95F, -4.4032F, 3.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.1128F, -1.5675F, 0.6283F, 0.0873F, 0.0698F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(89, 29).addBox(-0.954F, -1.5174F, 1.2996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, 4.1128F, -1.5675F, 0.3403F, 0.0873F, 0.0698F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(86, 83).addBox(-0.5F, -0.175F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3705F, 4.4249F, -5.4143F, -1.2057F, 0.0694F, 0.105F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(77, 10).addBox(-0.5F, -2.825F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2264F, 4.4105F, -5.3723F, -1.2476F, 0.1679F, 0.1431F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(59, 85).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5117F, 4.8931F, -3.3002F, -1.3348F, 0.1679F, 0.1431F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(64, 85).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3123F, 5.2647F, -4.9821F, -1.3802F, 0.0694F, 0.105F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(20, 92).addBox(-0.4F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 92).addBox(-0.4F, -0.775F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0067F, 5.6392F, -8.7876F, -1.6333F, 0.0694F, 0.105F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(80, 77).addBox(-0.5F, -1.2925F, -0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6579F, 3.6584F, -3.3928F, -1.1952F, 0.1654F, 0.146F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(84, 58).addBox(-0.5F, 0.2647F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6579F, 3.6584F, -3.3928F, -1.2999F, 0.1654F, 0.146F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(69, 88).addBox(-0.5F, -0.9338F, -1.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6579F, 3.6584F, -3.3928F, -2.4169F, 0.1654F, 0.146F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(86, 83).mirror().addBox(-0.5F, -0.175F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3705F, 4.4249F, -5.4143F, -1.2057F, -0.0694F, -0.105F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3123F, 5.2647F, -4.9821F, -1.3802F, -0.0694F, -0.105F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(30, 92).mirror().addBox(-0.6F, -0.775F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 92).mirror().addBox(-0.6F, -0.375F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.6392F, -8.7876F, -1.6333F, -0.0694F, -0.105F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-0.3F, -0.1594F, -0.457F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 4.872F, -5.057F, -1.3279F, -0.0694F, -0.105F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.05F, -4.4032F, 3.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.1128F, -1.5675F, 0.6283F, -0.0873F, -0.0698F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(-0.05F, -5.3816F, -2.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.1128F, -1.5675F, -0.5061F, -0.0873F, -0.0698F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(57, 89).mirror().addBox(-0.05F, -5.1538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 89).mirror().addBox(-0.05F, -4.7538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.1128F, -1.5675F, -0.288F, -0.0873F, -0.0698F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-0.05F, -4.3152F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.1128F, -1.5675F, -0.0175F, -0.0873F, -0.0698F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.05F, -3.5755F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, 0.0262F, -0.0873F, -0.0698F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(-0.5F, -1.175F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7376F, 4.2734F, -2.5021F, -1.0905F, -0.1679F, -0.1431F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(82, 11).mirror().addBox(-0.05F, -2.4461F, -0.9219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, -0.4712F, -0.0873F, -0.0698F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(89, 29).mirror().addBox(-0.046F, -1.5174F, 1.2996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, 0.3403F, -0.0873F, -0.0698F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-0.046F, -2.185F, 1.0375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, 0.0349F, -0.0873F, -0.0698F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-0.05F, -1.5916F, 1.9316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, 0.6545F, -0.0873F, -0.0698F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(81, 85).mirror().addBox(-0.05F, -1.9197F, -0.8436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, -0.7767F, -0.0873F, -0.0698F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5117F, 4.8931F, -3.3002F, -1.3348F, -0.1679F, -0.1431F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.5F, 0.2647F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6579F, 3.6584F, -3.3928F, -1.2999F, -0.1654F, -0.146F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(69, 88).mirror().addBox(-0.5F, -0.9338F, -1.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6579F, 3.6584F, -3.3928F, -2.4169F, -0.1654F, -0.146F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.5F, -1.2925F, -0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6579F, 3.6584F, -3.3928F, -1.1952F, -0.1654F, -0.146F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-0.5F, -2.825F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2264F, 4.4105F, -5.3723F, -1.2476F, -0.1679F, -0.1431F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(11, 30).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 4.1622F, -2.5234F, -1.1952F, -0.1679F, -0.1431F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.05F, -3.871F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 89).mirror().addBox(-0.05F, -4.471F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.1128F, -1.5675F, -0.6632F, -0.0873F, -0.0698F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.05F, -3.1707F, 1.1809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.1128F, -1.5675F, 0.2531F, -0.0873F, -0.0698F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4305F, 0.7086F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0186F, 1.919F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6109F, 0.0F, 0.0F));

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