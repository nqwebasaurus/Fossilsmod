package fossils.fossils.client.blockentity.model.morenelaphus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MorenelaphusFossilModel extends SkullModelBase {
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
	private final ModelPart neck5;
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

	public MorenelaphusFossilModel(ModelPart root) {
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
		this.neck5 = this.neck3.getChild("neck5");
		this.neck2 = this.neck5.getChild("neck2");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.9402F, 11.3534F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 63).addBox(0.0F, -0.7F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.52F, 0.2575F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 104).addBox(0.0F, -1.0201F, -1.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7434F, -2.3032F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1566F, -0.8294F, -0.5442F, -0.2404F, -0.6718F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-0.8F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6233F, -3.2027F, -0.0749F, -0.2093F, -0.0028F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 18).addBox(-0.2F, 0.3F, -0.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6233F, -3.2027F, -0.0749F, 0.2093F, 0.0028F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1566F, -0.8294F, -0.5442F, 0.2404F, 0.6718F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 38).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5958F, -0.8547F, -2.9575F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 103).addBox(0.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7F, 4.9F, -1.7719F, 0.2709F, 0.8218F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 101).addBox(-2.3184F, 2.9241F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, 3.2918F, 2.0986F, 1.2539F, 0.4172F, 0.7562F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 98).addBox(-2.3383F, 2.9241F, 0.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7884F, 3.2918F, 2.0986F, 1.1809F, 0.3505F, 0.562F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(99, 102).addBox(-1.3351F, 0.8093F, -0.5194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7884F, 2.6918F, 4.8986F, 1.0396F, 0.2512F, 0.1346F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 102).addBox(-1.3351F, 0.2627F, 1.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7884F, 2.6918F, 4.8986F, 0.3851F, 0.2512F, 0.1346F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(80, 102).addBox(-1.3351F, 0.1809F, 0.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7884F, 2.6918F, 4.8986F, 0.6032F, 0.2512F, 0.1346F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 77).addBox(-1.3351F, -0.2281F, -0.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7884F, 2.6918F, 4.8986F, 0.2105F, 0.2512F, 0.1346F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 26).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3652F, 4.6517F, 5.6935F, -0.5704F, 0.2903F, 1.1684F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 58).addBox(-0.9721F, -0.9596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 3.2918F, 2.1986F, -0.5993F, -0.1007F, 0.6811F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 102).addBox(-0.9721F, -2.2281F, 0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7884F, 3.1918F, 1.9986F, -0.9369F, -0.139F, 0.1137F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 21).addBox(-0.9721F, -1.1596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 3.1918F, 1.9986F, -0.0643F, -0.139F, 0.1137F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 54).addBox(-0.9721F, -0.9596F, -0.0797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7884F, 3.2918F, 2.1986F, -0.0643F, -0.139F, 0.1137F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(29, 60).addBox(-0.7096F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 1.0753F, 0.1768F, -0.6728F, 0.2171F, 0.561F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 60).addBox(-0.7096F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7884F, 1.0753F, 0.1768F, -0.6228F, 0.2103F, 0.3213F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 102).addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(63, 74).addBox(-1.0F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6221F, 0.4142F, 0.3076F, -2.3074F, -0.5919F, 3.0987F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(102, 59).addBox(-0.525F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3639F, 0.3586F, -0.3709F, -1.1139F, -0.8162F, 1.486F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(102, 56).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3639F, 0.3586F, -0.3709F, -0.9361F, -0.7022F, 1.2287F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(99, 50).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9417F, -0.2207F, -1.3811F, -0.7458F, -0.4373F, 0.8816F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 79).addBox(-0.6663F, -0.494F, -1.92F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7884F, 1.0753F, 0.1768F, -0.6639F, -0.0684F, 0.5622F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5958F, -0.8547F, -2.9575F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-1.1156F, -0.1514F, 0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7F, 4.9F, -1.7719F, -0.2709F, -0.8218F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(104, 101).mirror().addBox(1.3184F, 2.9241F, -1.2309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.2918F, 2.0986F, 1.2539F, -0.4172F, -0.7562F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(104, 98).mirror().addBox(1.3383F, 2.9241F, 0.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.2918F, 2.0986F, 1.1809F, -0.3505F, -0.562F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(99, 102).mirror().addBox(0.3351F, 0.8093F, -0.5194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 2.6918F, 4.8986F, 1.0396F, -0.2512F, -0.1346F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 102).mirror().addBox(0.3351F, 0.2627F, 1.0335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 2.6918F, 4.8986F, 0.3851F, -0.2512F, -0.1346F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 102).mirror().addBox(0.3351F, 0.1809F, 0.8332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 2.6918F, 4.8986F, 0.6032F, -0.2512F, -0.1346F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(0.3351F, -0.2281F, -0.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 2.6918F, 4.8986F, 0.2105F, -0.2512F, -0.1346F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 26).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3652F, 4.6517F, 5.6935F, -0.5704F, -0.2903F, -1.1684F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(-0.0279F, -0.9596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.2918F, 2.1986F, -0.5993F, 0.1007F, -0.6811F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(75, 102).mirror().addBox(-0.0279F, -2.2281F, 0.3505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.1918F, 1.9986F, -0.9369F, 0.139F, -0.1137F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(76, 21).mirror().addBox(-0.0279F, -1.1596F, -0.0797F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.1918F, 1.9986F, -0.0643F, 0.139F, -0.1137F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(42, 54).mirror().addBox(-0.0279F, -0.9596F, -0.0797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 3.2918F, 2.1986F, -0.0643F, 0.139F, -0.1137F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 60).mirror().addBox(-0.2904F, -0.49F, 0.1717F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 1.0753F, 0.1768F, -0.6728F, -0.2171F, -0.561F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.2904F, -0.49F, -0.1283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 1.0753F, 0.1768F, -0.6228F, -0.2103F, -0.3213F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(63, 74).mirror().addBox(0.0F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6221F, 0.4142F, 0.3076F, -2.3074F, 0.5919F, -3.0987F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(102, 59).mirror().addBox(-0.475F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3639F, 0.3586F, -0.3709F, -1.1139F, 0.8162F, -1.486F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3639F, 0.3586F, -0.3709F, -0.9361F, 0.7022F, -1.2287F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(99, 50).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9417F, -0.2207F, -1.3811F, -0.7458F, 0.4373F, -0.8816F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-0.3337F, -0.494F, -1.92F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7884F, 1.0753F, 0.1768F, -0.6639F, 0.0684F, -0.5622F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 2.9961F, 0.519F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 61).addBox(-1.0F, -1.5F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(87, 88).addBox(-1.0F, 0.0F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(88, 0).addBox(-1.0F, -0.7047F, -0.3174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(5, 95).addBox(-1.0F, -1.7026F, -1.2104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 104).addBox(-0.5F, 2.74F, 0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, 0.7386F, -0.3186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(77, 25).addBox(-1.0F, 0.062F, 0.0121F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(14, 77).addBox(-1.0F, -1.4F, 0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.8663F, -0.5987F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(87, 48).addBox(-1.0F, -0.325F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4874F, 0.7693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(87, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.2882F, 0.0264F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0189F, 0.3797F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 12).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 92).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(7, 89).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 84).addBox(-0.5F, -4.0F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4414F, 0.0653F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 29).addBox(-1.9F, 0.0521F, -1.0729F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 5.428F, 0.2695F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(89, 98).addBox(-0.5F, -2.7974F, 0.0769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.1311F, -1.251F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftLeg3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 74).addBox(-1.0F, -4.0136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r64 = leftLeg3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.7545F, -0.6771F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftLeg4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 81).addBox(-1.0425F, -0.6391F, -1.4511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.082F, 0.9449F, 1.1382F, 0.0589F, 0.1267F));

		PartDefinition cube_r66 = leftLeg4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5517F, -0.6391F, -1.3676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.082F, 0.9449F, 1.1382F, -0.0589F, -0.1267F));

		PartDefinition cube_r67 = leftLeg4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.4093F, -1.2013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3142F, -1.2932F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.6921F, -2.2676F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftLeg5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(77, 71).addBox(8.011F, 0.9327F, 0.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-9.7F, -0.8103F, 0.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r69 = leftLeg5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(80, 46).addBox(8.011F, 0.5674F, 1.196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-9.7F, -0.8103F, 0.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition cube_r70 = leftLeg5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(84, 24).addBox(-0.5108F, 0.0979F, -1.3004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.1F, -0.8103F, 0.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r71 = leftLeg5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 16).addBox(-0.5108F, 0.4284F, -1.0773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.8103F, 0.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 2.9961F, 0.519F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(9, 62).addBox(-1.0F, -1.5F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(90, 57).addBox(-1.0F, 0.0F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 4.2783F, -1.2539F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 42).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.4221F, 0.1786F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(26, 90).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2597F, 0.3056F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(90, 20).addBox(-1.0F, -0.7047F, -0.3174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.4255F, -0.7647F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(97, 57).addBox(0.0F, -1.7026F, -1.2104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(104, 74).addBox(-0.5F, 2.74F, 0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(57, 89).addBox(-1.0F, 0.7386F, -0.3186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, 0.062F, 0.0121F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.0684F, -1.0302F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 67).addBox(-1.0F, -1.4F, 0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.8663F, -0.5987F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(87, 82).addBox(-1.0F, -0.325F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4874F, 0.7693F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 87).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.2882F, 0.0264F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0189F, 0.3797F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(39, 74).addBox(-1.0F, -0.2F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.204F, -0.4567F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 39).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9422F, 0.9959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 90).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.577F, 0.5199F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(31, 84).addBox(-0.5F, -4.0F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4414F, 0.0653F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(21, 80).addBox(0.9F, 0.0521F, -1.0729F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 5.428F, 0.2695F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(28, 99).addBox(-0.5F, -2.7974F, 0.0769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.1226F, -0.1905F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.1311F, -1.251F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(58, 74).addBox(0.0F, -4.0136F, -0.9894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.4236F, 0.4388F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(5, 33).addBox(0.0F, -0.1857F, -1.0115F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.1764F, 0.3388F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.7545F, -0.6771F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(38, 82).addBox(0.0425F, -0.6391F, -1.4511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.082F, 0.9449F, 1.1382F, -0.0589F, -0.1267F));

		PartDefinition cube_r92 = rightLeg4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 29).addBox(-0.4483F, -0.6391F, -1.3676F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.082F, 0.9449F, 1.1382F, 0.0589F, 0.1267F));

		PartDefinition cube_r93 = rightLeg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 56).addBox(-0.5F, -0.4093F, -1.2013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3142F, -1.2932F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.6921F, -2.2676F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(80, 37).addBox(-9.011F, 0.9327F, 0.8187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(9.7F, -0.8103F, 0.0647F, -0.7125F, -0.1238F, 0.2313F));

		PartDefinition cube_r95 = rightLeg5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 50).addBox(-9.011F, 0.5674F, 1.196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(9.7F, -0.8103F, 0.0647F, -1.0267F, -0.1238F, 0.2313F));

		PartDefinition cube_r96 = rightLeg5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(14, 85).addBox(-0.4892F, 0.0979F, -1.3004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1F, -0.8103F, 0.0647F, -0.7125F, 0.1238F, -0.2313F));

		PartDefinition cube_r97 = rightLeg5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 41).addBox(-0.4892F, 0.4284F, -1.0773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -0.8103F, 0.0647F, -1.0267F, 0.1238F, -0.2313F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 51).addBox(0.0F, -1.2001F, -1.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4817F, -0.9002F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(32, 40).addBox(0.0F, -1.1327F, -1.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6061F, -2.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, -0.0726F, 0.2302F, -1.4981F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(69, 58).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.0439F, 0.2372F, -1.0045F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, -0.2107F, -7.3974F, 0.1047F, 0.2176F, -0.7365F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(28, 106).mirror().addBox(-0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5753F, -0.602F, -5.4552F, -2.8972F, 0.0F, -1.885F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 106).mirror().addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4675F, 0.0075F, -3.308F, -2.8807F, 0.0491F, -1.8803F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 106).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -1.2198F, -2.9452F, 0.0829F, -1.8741F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(88, 106).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -1.2198F, -2.9452F, -0.0829F, 1.8741F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(58, 106).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4675F, 0.0075F, -3.308F, -2.8807F, -0.0491F, 1.8803F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(28, 106).addBox(0.3078F, -0.3036F, -0.6209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, -2.8972F, 0.0F, 1.885F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(95, 0).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.1047F, -0.2176F, 0.7365F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 58).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, 0.0439F, -0.2372F, 1.0045F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(71, 40).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, -0.2107F, -7.3974F, -0.0726F, -0.2302F, 1.4981F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 105).addBox(-0.5753F, -1.2245F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5753F, -0.602F, -5.4552F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(38, 55).addBox(-0.4485F, -1.3641F, -0.1492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4485F, -0.6806F, -7.7242F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8925F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-0.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5596F, 9.8711F, -3.5471F, -0.4875F, -0.2009F, -2.9263F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 35).mirror().addBox(-0.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2975F, 9.1006F, -1.6286F, -0.5378F, -0.2097F, -2.7428F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.098F, 0.2749F, -0.8534F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-9.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, -0.0437F, 0.2882F, -1.3533F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.0707F, -5.4048F, 0.1667F, 0.2401F, -0.585F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, -0.0357F, 0.3223F, -1.3509F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.122F, 0.3011F, -0.8466F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(31, 95).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.6707F, -3.4048F, 0.1968F, 0.2593F, -0.5776F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, -0.0324F, 0.3573F, -1.402F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.1427F, 0.3302F, -0.8924F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3707F, -1.4048F, 0.2246F, 0.282F, -0.6224F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(38, 95).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.2246F, -0.282F, 0.6224F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 36).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, 0.1427F, -0.3302F, 0.8924F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 40).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.3707F, -1.4048F, -0.0324F, -0.3573F, 1.402F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 95).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.1968F, -0.2593F, 0.5776F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(91, 26).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, 0.122F, -0.3011F, 0.8466F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 37).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.6707F, -3.4048F, -0.0357F, -0.3223F, 1.3509F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(10, 95).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.1667F, -0.2401F, 0.585F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(36, 6).addBox(3.0551F, -2.1982F, -0.4625F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, -0.0437F, -0.2882F, 1.3533F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 60).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.0707F, -5.4048F, 0.098F, -0.2749F, 0.8534F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.3F, -7.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(44, 35).addBox(-4.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2975F, 9.1006F, -1.6286F, -0.5378F, 0.2097F, 2.7428F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 41).addBox(-4.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5596F, 9.8711F, -3.5471F, -0.4875F, 0.2009F, 2.9263F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.8415F, -0.0624F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0209F, -5.149F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(53, 107).addBox(0.0F, -1.4188F, -0.146F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1832F, -1.8045F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(101, 105).addBox(0.0F, -1.5188F, -0.046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1865F, -3.8596F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(5, 106).addBox(0.0F, -1.8198F, -0.0541F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5865F, -5.9596F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(107, 59).addBox(0.0F, 0.3523F, -4.7623F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3529F, -6.8577F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(13, 19).addBox(0.0F, -2.498F, -0.0557F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2437F, -0.9064F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(25, 98).addBox(0.0F, -3.7213F, -0.1497F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9735F, -2.7877F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(95, 103).addBox(-0.005F, -2.9237F, -0.0854F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2985F, -4.6627F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2586F, 9.6028F, -0.354F, -0.3878F, -0.2167F, -3.0538F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3982F, 9.1019F, 1.8031F, -0.3157F, -0.2592F, -3.0334F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-1.7864F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.1482F, 0.2355F, -0.6151F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 90).mirror().addBox(-3.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, 0.0813F, 0.2656F, -0.8836F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 38).mirror().addBox(-9.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4485F, -3.7877F, -0.0538F, 0.2724F, -1.3818F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.184F, 0.2461F, -0.5286F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(97, 92).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.1131F, 0.2851F, -0.797F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0354F, 0.3042F, -1.2986F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(31, 97).mirror().addBox(-2.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.2074F, 0.2592F, -0.5228F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-10.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.028F, 0.3294F, -1.2963F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-4.0432F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.1323F, 0.3038F, -0.7914F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(98, 12).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.1323F, -0.3038F, 0.7914F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(26, 24).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, -0.028F, -0.3294F, 1.2963F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(31, 97).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3485F, -0.6877F, 0.2074F, -0.2592F, 0.5228F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(19, 7).addBox(3.1393F, -2.68F, -0.1571F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, -0.0354F, -0.3042F, 1.2986F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(97, 92).addBox(2.0433F, -0.9109F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.1131F, -0.2851F, 0.797F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(97, 21).addBox(0.2094F, -0.3511F, -0.1571F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9485F, -2.6877F, 0.184F, -0.2461F, 0.5286F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(21, 38).addBox(3.0866F, -2.1114F, -0.7263F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, -0.0538F, -0.2724F, 1.3818F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(97, 90).addBox(1.734F, -0.431F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.0813F, -0.2656F, 0.8836F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(97, 19).addBox(-0.2136F, 0.0325F, -0.7263F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4485F, -3.7877F, 0.1482F, -0.2355F, 0.6151F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 21).addBox(-5.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3982F, 9.1019F, 1.8031F, -0.3157F, 0.2592F, 3.0334F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(45, 20).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2586F, 9.6028F, -0.354F, -0.3878F, 0.2167F, 3.0538F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0935F, -0.8312F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(22, 32).addBox(-0.5F, -0.6015F, 0.9082F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.393F, -2.2913F, 0.2356F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2485F, -4.5877F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(106, 32).addBox(-0.005F, -4.0235F, -0.4903F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(8, 107).addBox(0.0F, -2.0848F, -0.0505F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r171 = chest2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(16, 62).addBox(-0.005F, -2.9642F, -0.0672F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.15F, -1.525F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r172 = chest2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(91, 106).addBox(0.0F, -1.9529F, -0.1234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -2.025F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r173 = chest2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-8.0781F, -2.659F, -0.4744F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0909F, 0.0219F, -1.4484F));

		PartDefinition cube_r174 = chest2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-0.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4765F, 8.4241F, -1.5359F, 0.0408F, -0.1822F, -3.119F));

		PartDefinition cube_r175 = chest2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3366F, 9.1533F, -0.0823F, 0.0524F, -0.294F, -3.0502F));

		PartDefinition cube_r176 = chest2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-3.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0706F, 0.0614F, -0.9696F));

		PartDefinition cube_r177 = chest2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(95, 62).mirror().addBox(-2.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0523F, 0.0775F, -0.7077F));

		PartDefinition cube_r178 = chest2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 96).mirror().addBox(-2.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0059F, 0.091F, -0.7534F));

		PartDefinition cube_r179 = chest2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 97).mirror().addBox(-4.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0294F, 0.0863F, -1.0162F));

		PartDefinition cube_r180 = chest2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-5.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0659F, 0.063F, -1.497F));

		PartDefinition cube_r181 = chest2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-3.0F, 0.0F, 0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9683F, 5.5431F, -3.4932F, 0.3799F, -0.2119F, -2.5073F));

		PartDefinition cube_r182 = chest2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(77, 35).addBox(0.0F, 0.0F, 0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9683F, 5.5431F, -3.4932F, 0.3799F, 0.2119F, 2.5073F));

		PartDefinition cube_r183 = chest2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(96, 28).addBox(3.1867F, -2.6424F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0659F, -0.063F, 1.497F));

		PartDefinition cube_r184 = chest2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 97).addBox(2.0679F, -0.8557F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0294F, -0.0863F, 1.0162F));

		PartDefinition cube_r185 = chest2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(17, 96).addBox(0.2189F, -0.2914F, -0.3998F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.5F, -0.0059F, -0.091F, 0.7534F));

		PartDefinition cube_r186 = chest2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(95, 62).addBox(0.1501F, -0.377F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0523F, -0.0775F, 0.7077F));

		PartDefinition cube_r187 = chest2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(55, 95).addBox(1.9792F, -0.9206F, -0.4744F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0706F, -0.0614F, 0.9696F));

		PartDefinition cube_r188 = chest2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(58, 20).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3366F, 9.1533F, -0.0823F, 0.0524F, 0.294F, 3.0502F));

		PartDefinition cube_r189 = chest2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(61, 12).addBox(-3.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4765F, 8.4241F, -1.5359F, 0.0408F, 0.1822F, 3.119F));

		PartDefinition cube_r190 = chest2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(47, 39).addBox(3.0781F, -2.659F, -0.4744F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.4F, -0.0909F, -0.0219F, 1.4484F));

		PartDefinition cube_r191 = chest2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(58, 60).addBox(-1.0F, 7.7989F, 1.8569F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 8.447F, -1.8193F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r193 = chest2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.7357F, -5.7122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.8F, 0.192F, 0.0F, 0.0F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7136F, -0.0033F, -2.1652F, 0.2394F, 0.204F, -0.264F));

		PartDefinition cube_r194 = bone.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(13, 24).addBox(1.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.7401F, -0.3548F, 0.2451F));

		PartDefinition cube_r195 = bone.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 26).addBox(2.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r196 = bone.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(104, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.041F, 3.7775F, -2.9711F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r197 = bone.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(43, 99).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, 3.8085F, -2.315F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r198 = bone.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.041F, -2.3304F, 2.1935F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(33, 99).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, -2.705F, 1.2663F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r200 = bone.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 105).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.041F, -2.0894F, 0.4783F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r201 = bone.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.041F, -1.3761F, -0.2226F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(67, 97).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, -2.0894F, 0.4783F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(78, 16).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.041F, 0.92F, -1.3558F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -0.65F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, 2.5726F, -1.6366F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(26, 26).addBox(2.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(104, 86).addBox(-0.5F, -1.5F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(104, 83).addBox(-0.5F, -1.0F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(104, 14).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.041F, 1.0196F, 2.9868F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(77, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.041F, 1.6624F, 2.2208F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(29, 55).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.041F, 2.7339F, -0.3661F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(30, 9).addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.041F, 1.3734F, -0.1392F, 0.6458F, 0.0F, 0.0F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7136F, -0.0033F, -2.1652F, 0.2394F, -0.204F, 0.264F));

		PartDefinition cube_r210 = bone3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-2.4374F, -3.0434F, -6.583F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.7401F, 0.3548F, -0.2451F));

		PartDefinition cube_r211 = bone3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-3.4F, -2.8259F, -3.1985F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(104, 17).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 3.7775F, -2.9711F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r213 = bone3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(43, 99).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, 3.8085F, -2.315F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r214 = bone3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.3304F, 2.1935F, -2.426F, 0.0F, 0.0F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(33, 99).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.705F, 1.2663F, 2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r216 = bone3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(20, 105).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.0894F, 0.4783F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r217 = bone3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.041F, -1.3761F, -0.2226F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r218 = bone3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, -2.0894F, 0.4783F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r219 = bone3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.041F, 0.92F, -1.3558F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r220 = bone3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(33, 32).mirror().addBox(-0.5F, -0.65F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, 2.5726F, -1.6366F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r221 = bone3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(-3.4F, -3.0499F, -6.8635F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.941F, 0.261F, 3.5512F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r222 = bone3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(104, 86).mirror().addBox(-0.5F, -1.5F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(104, 83).mirror().addBox(-0.5F, -1.0F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(104, 14).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.0196F, 2.9868F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r223 = bone3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(77, 75).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.6624F, 2.2208F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.041F, 2.7339F, -0.3661F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(30, 9).mirror().addBox(-0.5F, -0.05F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.041F, 1.3734F, -0.1392F, 0.6458F, 0.0F, 0.0F));

		PartDefinition leftarm = chest2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 5.1668F, -4.1942F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(98, 68).addBox(-0.0018F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5117F, -0.4761F, 0.052F, 1.2216F, 0.0012F, -0.0013F));

		PartDefinition cube_r227 = leftarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0122F, -0.4915F, 0.9714F, -1.5971F, 0.0014F, -0.001F));

		PartDefinition cube_r228 = leftarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(45, 95).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0113F, 0.1026F, 1.1883F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r229 = leftarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(94, 49).addBox(0.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5144F, 0.2216F, -1.1013F, 0.4537F, 0.0014F, -0.001F));

		PartDefinition cube_r230 = leftarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(103, 23).addBox(-0.5F, -0.9F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(45, 80).addBox(0.0F, -4.0461F, -1.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 4.5051F, 2.7331F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(28, 78).addBox(0.0F, 0.0539F, -0.1384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.572F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(36, 86).addBox(-0.5F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(86, 33).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 4.4848F, 2.6757F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(86, 66).addBox(0.0F, 0.3086F, -0.7046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.2542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1384F, 6.4641F, 1.4871F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(21, 86).addBox(0.05F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1064F, 4.7908F, 0.6293F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r236 = leftarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(50, 95).addBox(0.0053F, -0.0363F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 2.9029F, 0.1716F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r237 = leftarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 93).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6064F, 2.8804F, 0.2036F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r238 = leftarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(33, 78).addBox(0.157F, -3.5634F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.164F, -0.0437F, 1.296F, -1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r239 = leftarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(5, 99).addBox(-0.187F, -0.4145F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1236F, 0.1144F, 1.0517F, 1.5708F, 1.3788F, -1.5708F));

		PartDefinition cube_r240 = leftarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(83, 91).addBox(0.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1236F, 0.1144F, 1.0517F, 1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r241 = leftarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 46).addBox(-1.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(104, 43).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, -2.4558F, 1.8574F, 1.5708F, -1.0385F, -1.5708F));

		PartDefinition cube_r242 = leftarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(91, 75).addBox(0.6935F, -0.981F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1236F, 0.1144F, 1.0517F, 1.5708F, -0.2967F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(32, 44).addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.768F, 2.3316F, 1.1083F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(21, 91).addBox(-0.5F, -0.1455F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8405F, -0.093F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftArm4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3233F, 2.9573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r244 = leftArm4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(74, 63).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3233F, 2.9573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r245 = leftArm4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(7, 73).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 2.9573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r246 = leftArm4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 72).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 2.9573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r247 = leftArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(84, 94).addBox(-0.2918F, -1.488F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.395F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition cube_r248 = leftArm4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 98).addBox(5.6378F, -2.8948F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.8233F, 0.395F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition rightarm = chest2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8F, 5.1668F, -4.1942F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightarm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 72).addBox(-0.9982F, -0.9179F, -0.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5117F, -0.4761F, 0.052F, 1.2216F, -0.0012F, 0.0013F));

		PartDefinition cube_r250 = rightarm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(104, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0122F, -0.4915F, 0.9714F, -1.5971F, -0.0014F, 0.001F));

		PartDefinition cube_r251 = rightarm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(38, 97).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0113F, 0.1026F, 1.1883F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r252 = rightarm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 82).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5144F, 0.2216F, -1.1013F, 0.4537F, -0.0014F, 0.001F));

		PartDefinition cube_r253 = rightarm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(103, 65).addBox(-0.5F, -0.9F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6839F, 0.5183F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightarm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(58, 80).addBox(-1.0F, -4.0461F, -1.0384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.5051F, 2.7331F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(70, 79).addBox(-1.0F, 0.0539F, -0.1384F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.572F, -0.3025F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(57, 86).addBox(-1.5F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(50, 86).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 4.4848F, 2.6757F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(87, 36).addBox(-2.0F, 0.3086F, -0.7046F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.2542F, 2.6206F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1384F, 6.4641F, 1.4871F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightarm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(64, 86).addBox(-1.05F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 4.7908F, 0.6293F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r259 = rightarm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(55, 97).addBox(-1.0053F, -0.0363F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6064F, 2.9029F, 0.1716F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r260 = rightarm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(93, 31).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6064F, 2.8804F, 0.2036F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r261 = rightarm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(75, 79).addBox(-1.157F, -3.5634F, -0.4596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.164F, -0.0437F, 1.296F, -1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r262 = rightarm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(99, 14).addBox(-0.813F, -0.4145F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1236F, 0.1144F, 1.0517F, 1.5708F, -1.3788F, 1.5708F));

		PartDefinition cube_r263 = rightarm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(14, 92).addBox(-2.2889F, -1.2392F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1236F, 0.1144F, 1.0517F, 1.5708F, -0.0785F, 1.5708F));

		PartDefinition cube_r264 = rightarm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(63, 104).addBox(0.7F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(53, 104).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, -2.4558F, 1.8574F, 1.5708F, 1.0385F, 1.5708F));

		PartDefinition cube_r265 = rightarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(7, 92).addBox(-2.6935F, -0.981F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1236F, 0.1144F, 1.0517F, 1.5708F, 0.2967F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(37, 44).addBox(-0.5F, -0.2044F, -0.4286F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 7.768F, 2.3316F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(64, 91).addBox(-0.5F, -0.1455F, -0.6306F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.8405F, -0.093F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightArm4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(21, 76).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3233F, 2.9573F, -0.2036F, 1.0547F, -0.1344F, -0.1117F));

		PartDefinition cube_r267 = rightArm4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3233F, 2.9573F, -0.2036F, 0.7057F, -0.1344F, -0.1117F));

		PartDefinition cube_r268 = rightArm4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(32, 74).addBox(-0.5F, -0.6107F, -0.9276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 2.9573F, -0.2036F, 1.0547F, 0.1344F, 0.1117F));

		PartDefinition cube_r269 = rightArm4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -0.3712F, -1.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3F, 2.9573F, -0.2036F, 0.7057F, 0.1344F, 0.1117F));

		PartDefinition cube_r270 = rightArm4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(89, 94).addBox(-0.7082F, -1.488F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.395F, 0.6472F, 0.6343F, -0.1306F, 0.1752F));

		PartDefinition cube_r271 = rightArm4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(98, 23).addBox(-6.6378F, -2.8948F, -0.5131F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.8233F, 0.395F, 0.6472F, 0.6343F, 0.1306F, -0.1752F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.6F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(38, 107).addBox(0.0F, -1.7069F, 0.0627F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7935F, -0.7153F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(51, 74).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.6149F, -0.1071F, 0.0754F));

		PartDefinition cube_r274 = neck5.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(21, 73).addBox(0.0F, -0.6F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6935F, 0.3847F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 8).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -1.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(61, 92).addBox(0.0F, -0.6617F, -1.0262F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(45, 62).addBox(0.0F, -0.8681F, -0.0721F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, -2.1F, -0.5668F, -0.0234F, -0.0368F));

		PartDefinition cube_r278 = neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(11, 107).addBox(0.0F, -0.5F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2928F, -1.1967F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, -0.3753F, -0.4709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(62, 96).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9365F, -2.1677F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(61, 107).addBox(0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 55).mirror().addBox(0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r281 = neck4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(107, 55).addBox(-0.1832F, -0.9424F, -1.3195F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.7F, 0.0F, -0.48F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0541F, 0.7024F, -0.7274F, -0.1641F, 0.1444F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(20, 51).addBox(-1.0F, 0.4F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.734F, -3.5932F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(45, 65).addBox(-0.5F, 0.0F, -2.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.734F, -3.5932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(11, 54).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3F, 2.2004F, -8.483F, 0.4141F, 0.5865F, -0.8112F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(53, 43).addBox(-0.7F, -0.3F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 1.8964F, -8.1512F, 0.4839F, 0.5865F, -0.8112F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(14, 73).addBox(-0.5F, -0.5F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.1176F, -7.9485F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(99, 85).addBox(-0.5F, -0.5542F, 1.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(99, 53).addBox(-0.5F, -0.5542F, 1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2664F, -9.1221F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, -0.5542F, 1.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.7764F, -9.4537F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(104, 40).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 4.3898F, -8.4101F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(42, 49).addBox(-0.5F, -0.2094F, -2.3112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.5716F, -7.2164F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(48, 99).addBox(0.0F, -1.525F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.2033F, -8.026F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -1.35F, -0.675F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 3.2527F, -6.4834F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(51, 55).addBox(-0.5F, -1.1F, -0.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.1887F, -7.2948F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(9, 68).addBox(-0.5F, -0.6115F, -0.6521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.65F, -5.8F, 0.7025F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(10, 42).addBox(-1.0F, -0.925F, -1.725F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.059F, -2.5026F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(63, 5).addBox(-1.0F, 0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.2871F, -1.218F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, 0.8F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2871F, -1.218F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(65, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.9542F, -3.3838F, -2.81F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, -0.2F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.01F, -2.5857F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(42, 44).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.01F, -2.5857F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(79, 98).addBox(-1.0F, 0.0168F, -1.0042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.487F, -1.629F, -4.3319F, 0.7096F, 0.2224F, 0.1435F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(11, 48).addBox(-1.0F, 0.0168F, -3.0042F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2282F, -1.0082F, -5.0718F, 0.8841F, 0.2224F, 0.1435F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 20).addBox(-2.0F, 0.0168F, -1.0042F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.987F, -1.629F, -4.3319F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(84, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.9717F, -5.1016F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -1.7019F, -0.8729F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.4F, 0.3F, 0.6196F, 0.0F, 0.0F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1363F, -0.9065F, -2.7726F, -0.2611F, -0.3567F, -0.851F));

		PartDefinition cube_r306 = leftHorn.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(92, 54).addBox(0.0889F, -0.5963F, 0.8483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2214F, -0.0121F, -0.2295F, -2.1726F, -0.8411F, -0.5549F));

		PartDefinition cube_r307 = leftHorn.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 28).addBox(2.7879F, -1.0935F, 0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.8213F, 0.2879F, 2.8704F, -2.8317F, 0.5433F, 0.2361F));

		PartDefinition cube_r308 = leftHorn.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(14, 89).addBox(1.3349F, -0.4714F, -0.1108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.8213F, 0.2879F, 2.8704F, -2.6773F, 0.6263F, 0.5471F));

		PartDefinition cube_r309 = leftHorn.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(87, 79).addBox(-0.2469F, -0.1833F, -0.4792F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.8213F, 0.2879F, 2.8704F, -2.4258F, 0.7366F, 0.9238F));

		PartDefinition cube_r310 = leftHorn.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(68, 34).addBox(0.5111F, -0.1296F, -0.9504F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(13.0213F, -2.2121F, 10.1704F, -2.0402F, -0.4075F, -0.3443F));

		PartDefinition cube_r311 = leftHorn.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(21, 40).addBox(-0.9215F, -0.1296F, 0.914F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(12.8463F, -2.2121F, 10.1704F, -1.0956F, 0.2008F, -3.1358F));

		PartDefinition cube_r312 = leftHorn.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(81, 62).addBox(0.9797F, -0.1296F, 3.6438F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(12.8463F, -2.2121F, 10.1704F, -1.058F, 0.0127F, -2.7886F));

		PartDefinition cube_r313 = leftHorn.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(58, 103).addBox(0.2888F, -0.1383F, -0.3124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(72, 4).addBox(-0.1112F, -0.1383F, -0.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(12.8463F, -6.8121F, 12.5704F, -1.2589F, 0.0111F, -2.5497F));

		PartDefinition cube_r314 = leftHorn.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(104, 52).addBox(1.1696F, -0.1383F, 0.9307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(12.8463F, -6.8121F, 12.5704F, -1.2627F, 0.0511F, -2.6744F));

		PartDefinition cube_r315 = leftHorn.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(90, 91).addBox(-0.0301F, -0.1383F, -1.4598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(12.8463F, -6.8121F, 12.5704F, -1.3787F, -0.2475F, -1.6155F));

		PartDefinition cube_r316 = leftHorn.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(16, 67).addBox(2.4717F, -0.1296F, -0.0474F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(43, 0).addBox(-0.1163F, -0.1296F, 0.1799F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(12.8463F, -2.2121F, 10.1704F, -1.2658F, -0.419F, -1.8537F));

		PartDefinition cube_r317 = leftHorn.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(52, 71).addBox(-0.1393F, -0.1296F, -0.4721F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(12.8463F, -2.2121F, 10.1704F, -1.3373F, -0.4609F, -1.6863F));

		PartDefinition cube_r318 = leftHorn.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(57, 25).addBox(-0.2235F, -0.4116F, -0.8379F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(10.6213F, -1.2121F, 7.4704F, -2.0548F, -0.7482F, -0.4707F));

		PartDefinition cube_r319 = leftHorn.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(63, 9).addBox(-0.175F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(12.5126F, -0.4303F, 7.7238F, -2.5928F, 0.527F, 0.1757F));

		PartDefinition cube_r320 = leftHorn.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(36, 89).addBox(-0.097F, -0.097F, -0.903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(10.9144F, -1.3014F, 8.1973F, -2.4155F, 0.4574F, 0.6106F));

		PartDefinition cube_r321 = leftHorn.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(99, 38).addBox(-0.0815F, -0.1311F, -0.2428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(18.2214F, -3.8121F, 11.6704F, -2.0637F, -0.3652F, -0.922F));

		PartDefinition cube_r322 = leftHorn.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 52).addBox(0.0301F, -0.1311F, -0.8661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(18.2214F, -3.8121F, 11.6704F, -2.175F, -0.0143F, -0.3558F));

		PartDefinition cube_r323 = leftHorn.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(103, 62).addBox(1.3855F, -0.1311F, -0.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(18.2214F, -3.8121F, 11.6704F, -1.8932F, 0.5204F, 0.644F));

		PartDefinition cube_r324 = leftHorn.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(43, 89).addBox(-0.3184F, -0.1311F, -0.2145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(18.2214F, -3.8121F, 11.6704F, -2.0347F, 0.4023F, 0.3288F));

		PartDefinition cube_r325 = leftHorn.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(52, 68).addBox(-0.283F, -0.105F, -0.4615F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(36, 68).addBox(-0.283F, -0.105F, -1.2615F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(15.9213F, -3.0121F, 11.3704F, -2.1031F, -0.0617F, -0.2084F));

		PartDefinition cube_r326 = leftHorn.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(57, 31).addBox(-0.024F, -0.7802F, -0.042F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(57, 28).addBox(-0.024F, -0.7802F, 0.458F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(14.5213F, -4.1121F, 10.8454F, -1.6238F, -0.3994F, -1.0479F));

		PartDefinition cube_r327 = leftHorn.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(50, 89).addBox(6.1881F, -0.7802F, 0.2409F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(14.5213F, -4.1121F, 10.8454F, -1.7467F, -0.3642F, -0.7208F));

		PartDefinition cube_r328 = leftHorn.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(52, 17).addBox(2.4907F, -0.7802F, -0.8683F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(14.5213F, -4.1121F, 10.8454F, -1.8085F, -0.3283F, -0.5392F));

		PartDefinition cube_r329 = leftHorn.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(86, 7).addBox(3.5072F, -0.7802F, -1.4829F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(14.5213F, -4.1121F, 10.8454F, -1.7301F, -0.3715F, -0.7669F));

		PartDefinition cube_r330 = leftHorn.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(43, 23).addBox(-1.041F, -0.7802F, -0.328F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(14.5213F, -4.1121F, 10.8454F, -1.6054F, -0.4013F, -1.0953F));

		PartDefinition cube_r331 = leftHorn.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(51, 49).addBox(-0.2905F, -0.1296F, -0.3313F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(13.0213F, -2.2121F, 10.1704F, -2.0435F, -0.4035F, -0.3358F));

		PartDefinition cube_r332 = leftHorn.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(56, 22).addBox(-0.325F, -0.4116F, -0.8135F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(10.6213F, -1.2121F, 7.4704F, -2.1588F, -0.6767F, -0.312F));

		PartDefinition cube_r333 = leftHorn.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(68, 31).addBox(4.8274F, -0.5888F, 0.2052F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(5.7214F, -0.4121F, 1.3704F, -2.244F, -0.9626F, -0.3506F));

		PartDefinition cube_r334 = leftHorn.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(68, 25).addBox(1.9011F, -0.5888F, 1.0389F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(5.7214F, -0.4121F, 1.3704F, -2.0072F, -1.0553F, -0.6296F));

		PartDefinition cube_r335 = leftHorn.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 45).addBox(-0.1308F, -0.823F, -0.6457F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(5.7214F, -0.4121F, 1.3704F, -2.4766F, -0.5268F, 0.032F));

		PartDefinition cube_r336 = leftHorn.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(71, 48).addBox(0.9623F, -0.5963F, -0.0847F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.2214F, -0.0121F, -0.2295F, -2.4274F, -0.5755F, -0.1694F));

		PartDefinition cube_r337 = leftHorn.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 102).addBox(2.8426F, -0.2754F, 2.8011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 3.1226F, -0.0059F, 0.0732F));

		PartDefinition cube_r338 = leftHorn.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(65, 101).addBox(1.5965F, -0.2754F, 3.2659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 3.1213F, -0.3549F, 0.0801F));

		PartDefinition cube_r339 = leftHorn.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 101).addBox(3.3998F, -0.2754F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 101).addBox(2.7998F, -0.2754F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 3.1169F, 0.6921F, 0.0573F));

		PartDefinition cube_r340 = leftHorn.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(85, 54).addBox(1.1361F, -0.2754F, 0.5042F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 3.1214F, 0.3431F, 0.0663F));

		PartDefinition cube_r341 = leftHorn.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(103, 29).addBox(3.0751F, -0.7725F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 34).addBox(2.4751F, -0.7725F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 0.2106F, 1.2969F, 0.2138F));

		PartDefinition cube_r342 = leftHorn.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(104, 49).addBox(1.6239F, -0.7725F, 0.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 2.5307F, 1.4721F, 2.5439F));

		PartDefinition cube_r343 = leftHorn.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(49, 60).addBox(-0.6035F, -0.7725F, -2.8123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(4.6214F, 1.7379F, -1.5296F, 0.0742F, -0.7031F, -0.0371F));

		PartDefinition cube_r344 = leftHorn.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(28, 103).addBox(-0.1301F, -0.9373F, -0.3291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(3.8213F, 1.7379F, -1.3296F, 0.3423F, 0.5017F, 0.3087F));

		PartDefinition cube_r345 = leftHorn.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(93, 6).addBox(-0.4171F, -0.7373F, -0.415F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(3.4214F, 0.8379F, -0.3296F, 0.7212F, 0.8439F, 0.9273F));

		PartDefinition cube_r346 = leftHorn.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(47, 92).addBox(-0.0794F, -0.446F, -0.6507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.2214F, -0.0121F, -0.2295F, 0.5966F, -0.206F, 0.1535F));

		PartDefinition cube_r347 = leftHorn.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(40, 92).addBox(0.0336F, -0.446F, -0.5535F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2214F, -0.0121F, -0.2295F, 0.6088F, -0.2779F, 0.1026F));

		PartDefinition cube_r348 = leftHorn.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(16, 70).addBox(-2.6F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, 0.3F, 0.15F, 0.009F, -0.3445F, -0.1821F));

		PartDefinition cube_r349 = leftHorn.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(69, 55).addBox(-2.2F, -0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, 0.3052F, 0.0999F, 0.0086F, -0.17F, -0.1805F));

		PartDefinition cube_r350 = leftHorn.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(69, 45).addBox(-2.2F, -0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, 0.2302F, 0.0999F, -0.0257F, -0.1746F, -0.0547F));

		PartDefinition cube_r351 = leftHorn.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(69, 42).addBox(-2.5F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, 0.225F, 0.15F, -0.0269F, -0.349F, -0.0499F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1363F, -0.9065F, -2.7726F, -0.2611F, 0.3567F, 0.851F));

		PartDefinition cube_r352 = rightHorn.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(93, 3).addBox(-2.0889F, -0.5963F, 0.8483F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2214F, -0.0121F, -0.2295F, -2.1726F, 0.8411F, 0.5549F));

		PartDefinition cube_r353 = rightHorn.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(91, 72).addBox(-4.7879F, -1.0935F, 0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-7.8213F, 0.2879F, 2.8704F, -2.8317F, -0.5433F, -0.2361F));

		PartDefinition cube_r354 = rightHorn.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(91, 69).addBox(-3.3349F, -0.4714F, -0.1108F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-7.8213F, 0.2879F, 2.8704F, -2.6773F, -0.6263F, -0.5471F));

		PartDefinition cube_r355 = rightHorn.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(87, 85).addBox(-1.7531F, -0.1833F, -0.4792F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-7.8213F, 0.2879F, 2.8704F, -2.4258F, -0.7366F, -0.9238F));

		PartDefinition cube_r356 = rightHorn.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(25, 69).addBox(-3.5111F, -0.1296F, -0.9504F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-13.0213F, -2.2121F, 10.1704F, -2.0402F, 0.4075F, 0.3443F));

		PartDefinition cube_r357 = rightHorn.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(41, 8).addBox(-0.0785F, -0.1296F, 0.914F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-12.8463F, -2.2121F, 10.1704F, -1.0956F, -0.2008F, 3.1358F));

		PartDefinition cube_r358 = rightHorn.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(50, 82).addBox(-1.9797F, -0.1296F, 3.6438F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-12.8463F, -2.2121F, 10.1704F, -1.058F, -0.0127F, 2.7886F));

		PartDefinition cube_r359 = rightHorn.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(10, 104).addBox(-1.2888F, -0.1383F, -0.3124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(72, 8).addBox(-0.8888F, -0.1383F, -0.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-12.8463F, -6.8121F, 12.5704F, -1.2589F, -0.0111F, 2.5497F));

		PartDefinition cube_r360 = rightHorn.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(104, 80).addBox(-2.1696F, -0.1383F, 0.9307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-12.8463F, -6.8121F, 12.5704F, -1.2627F, -0.0511F, 2.6744F));

		PartDefinition cube_r361 = rightHorn.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(92, 16).addBox(-1.9699F, -0.1383F, -1.4598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-12.8463F, -6.8121F, 12.5704F, -1.3787F, 0.2475F, 1.6155F));

		PartDefinition cube_r362 = rightHorn.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(67, 60).addBox(-5.4717F, -0.1296F, -0.0474F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(43, 3).addBox(-4.8837F, -0.1296F, 0.1799F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-12.8463F, -2.2121F, 10.1704F, -1.2658F, 0.419F, 1.8537F));

		PartDefinition cube_r363 = rightHorn.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(61, 71).addBox(-2.8607F, -0.1296F, -0.4721F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-12.8463F, -2.2121F, 10.1704F, -1.3373F, 0.4609F, 1.6863F));

		PartDefinition cube_r364 = rightHorn.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(60, 37).addBox(-3.7765F, -0.4116F, -0.8379F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-10.6213F, -1.2121F, 7.4704F, -2.0548F, 0.7482F, 0.4707F));

		PartDefinition cube_r365 = rightHorn.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(67, 22).addBox(-2.825F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-12.5126F, -0.4303F, 7.7238F, -2.5928F, -0.527F, -0.1757F));

		PartDefinition cube_r366 = rightHorn.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(91, 23).addBox(-1.903F, -0.097F, -0.903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-10.9144F, -1.3014F, 8.1973F, -2.4155F, -0.4574F, -0.6106F));

		PartDefinition cube_r367 = rightHorn.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(99, 41).addBox(-0.9185F, -0.1311F, -0.2428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-18.2214F, -3.8121F, 11.6704F, -2.0637F, 0.3652F, 0.922F));

		PartDefinition cube_r368 = rightHorn.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(52, 9).addBox(-4.0301F, -0.1311F, -0.8661F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-18.2214F, -3.8121F, 11.6704F, -2.175F, 0.0143F, 0.3558F));

		PartDefinition cube_r369 = rightHorn.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(90, 103).addBox(-2.3855F, -0.1311F, -0.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-18.2214F, -3.8121F, 11.6704F, -1.8932F, -0.5204F, -0.644F));

		PartDefinition cube_r370 = rightHorn.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 91).addBox(-1.6816F, -0.1311F, -0.2145F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-18.2214F, -3.8121F, 11.6704F, -2.0347F, -0.4023F, -0.3288F));

		PartDefinition cube_r371 = rightHorn.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(69, 18).addBox(-2.717F, -0.105F, -0.4615F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 69).addBox(-2.717F, -0.105F, -1.2615F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-15.9213F, -3.0121F, 11.3704F, -2.1031F, 0.0617F, 0.2084F));

		PartDefinition cube_r372 = rightHorn.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(38, 59).addBox(-3.9761F, -0.7802F, -0.042F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(9, 59).addBox(-3.9761F, -0.7802F, 0.458F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-14.5213F, -4.1121F, 10.8454F, -1.6238F, 0.3994F, 1.0479F));

		PartDefinition cube_r373 = rightHorn.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(76, 90).addBox(-8.1881F, -0.7802F, 0.2409F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-14.5213F, -4.1121F, 10.8454F, -1.7467F, 0.3642F, 0.7208F));

		PartDefinition cube_r374 = rightHorn.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(51, 52).addBox(-6.4907F, -0.7802F, -0.8683F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-14.5213F, -4.1121F, 10.8454F, -1.8085F, 0.3283F, 0.5392F));

		PartDefinition cube_r375 = rightHorn.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(86, 10).addBox(-5.5072F, -0.7802F, -1.4829F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-14.5213F, -4.1121F, 10.8454F, -1.7301F, 0.3715F, 0.7669F));

		PartDefinition cube_r376 = rightHorn.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(44, 32).addBox(-3.959F, -0.7802F, -0.328F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-14.5213F, -4.1121F, 10.8454F, -1.6054F, 0.4013F, 1.0953F));

		PartDefinition cube_r377 = rightHorn.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(52, 6).addBox(-3.7095F, -0.1296F, -0.3313F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-13.0213F, -2.2121F, 10.1704F, -2.0435F, 0.4035F, 0.3358F));

		PartDefinition cube_r378 = rightHorn.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(57, 34).addBox(-3.675F, -0.4116F, -0.8135F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-10.6213F, -1.2121F, 7.4704F, -2.1588F, 0.6767F, 0.312F));

		PartDefinition cube_r379 = rightHorn.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(61, 68).addBox(-7.8274F, -0.5888F, 0.2052F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-5.7214F, -0.4121F, 1.3704F, -2.244F, 0.9626F, 0.3506F));

		PartDefinition cube_r380 = rightHorn.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(68, 28).addBox(-4.9011F, -0.5888F, 1.0389F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-5.7214F, -0.4121F, 1.3704F, -2.0072F, 1.0553F, 0.6296F));

		PartDefinition cube_r381 = rightHorn.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(62, 52).addBox(-2.8692F, -0.823F, -0.6457F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-5.7214F, -0.4121F, 1.3704F, -2.4766F, 0.5268F, -0.032F));

		PartDefinition cube_r382 = rightHorn.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(71, 51).addBox(-3.9623F, -0.5963F, -0.0847F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.2214F, -0.0121F, -0.2295F, -2.4274F, 0.5755F, 0.1694F));

		PartDefinition cube_r383 = rightHorn.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(48, 102).addBox(-3.8426F, -0.2754F, 2.8011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 3.1226F, 0.0059F, -0.0732F));

		PartDefinition cube_r384 = rightHorn.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(43, 102).addBox(-2.5965F, -0.2754F, 3.2659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 3.1213F, 0.3549F, -0.0801F));

		PartDefinition cube_r385 = rightHorn.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(33, 102).addBox(-4.3998F, -0.2754F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 102).addBox(-3.7998F, -0.2754F, -0.5425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 3.1169F, -0.6921F, -0.0573F));

		PartDefinition cube_r386 = rightHorn.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(86, 4).addBox(-3.1361F, -0.2754F, 0.5042F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 3.1214F, -0.3431F, -0.0663F));

		PartDefinition cube_r387 = rightHorn.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(103, 71).addBox(-4.0751F, -0.7725F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 102).addBox(-3.4751F, -0.7725F, 0.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 0.2106F, -1.2969F, -0.2138F));

		PartDefinition cube_r388 = rightHorn.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(104, 77).addBox(-2.6239F, -0.7725F, 0.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 2.5307F, -1.4721F, -2.5439F));

		PartDefinition cube_r389 = rightHorn.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(60, 55).addBox(-0.3965F, -0.7725F, -2.8123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-4.6214F, 1.7379F, -1.5296F, 0.0742F, 0.7031F, 0.0371F));

		PartDefinition cube_r390 = rightHorn.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(103, 68).addBox(-0.8699F, -0.9373F, -0.3291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-3.8213F, 1.7379F, -1.3296F, 0.3423F, -0.5017F, -0.3087F));

		PartDefinition cube_r391 = rightHorn.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(93, 9).addBox(-1.5829F, -0.7373F, -0.415F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-3.4214F, 0.8379F, -0.3296F, 0.7212F, -0.8439F, -0.9273F));

		PartDefinition cube_r392 = rightHorn.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(54, 92).addBox(-1.9206F, -0.446F, -0.6507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.2214F, -0.0121F, -0.2295F, 0.5966F, 0.206F, -0.1535F));

		PartDefinition cube_r393 = rightHorn.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(92, 42).addBox(-2.0336F, -0.446F, -0.5535F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2214F, -0.0121F, -0.2295F, 0.6088F, 0.2779F, -0.1026F));

		PartDefinition cube_r394 = rightHorn.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(43, 71).addBox(-0.4F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, 0.3F, 0.15F, 0.009F, 0.3445F, 0.1821F));

		PartDefinition cube_r395 = rightHorn.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(71, 37).addBox(-0.8F, -0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6F, 0.3052F, 0.0999F, 0.0086F, 0.17F, 0.1805F));

		PartDefinition cube_r396 = rightHorn.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(34, 71).addBox(-0.8F, -0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6F, 0.2302F, 0.0999F, -0.0257F, 0.1746F, 0.0547F));

		PartDefinition cube_r397 = rightHorn.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7F, 0.225F, 0.15F, -0.0269F, 0.349F, 0.0499F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 2.9361F, -7.8986F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(99, 47).addBox(-0.7231F, -0.8703F, -0.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(99, 44).addBox(-0.7231F, -0.2953F, -0.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0355F, -0.0138F, -0.3026F, -3.0667F, 0.1338F, -0.0559F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(70, 71).addBox(-0.525F, -0.65F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(-0.1283F, 0.7146F, 0.0894F, 0.6637F, 0.2528F, 0.0816F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(51, 78).addBox(-0.6111F, -0.5705F, -0.1334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(1.0856F, -3.7649F, 7.4879F, -1.6969F, -0.588F, 0.0306F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 84).addBox(-0.6111F, -0.3653F, -0.3128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6641F, -3.5137F, 6.6091F, 0.0659F, -0.588F, 0.0306F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(14, 81).addBox(-0.6111F, -0.3541F, -0.4024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6641F, -3.5137F, 6.6091F, 0.3277F, -0.588F, 0.0306F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(80, 83).addBox(-0.5653F, -0.2715F, -0.423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6641F, -2.2387F, 4.5091F, 0.7163F, 0.037F, 0.037F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(15, 105).addBox(-0.5013F, -0.3823F, 0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 9).addBox(-0.5013F, -0.3823F, 0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 105).addBox(-0.5013F, -0.3823F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6641F, -3.0387F, 5.6091F, 0.4703F, -0.1031F, 0.0182F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(78, 42).addBox(-0.7F, 0.021F, -2.1052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8641F, -2.3387F, 4.4091F, 0.4284F, 0.4799F, 0.4094F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(7, 85).addBox(-0.7F, -0.1221F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(84, 75).addBox(-0.7F, -0.2971F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8641F, -2.3387F, 4.4091F, 0.8211F, 0.4799F, 0.4094F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(38, 78).addBox(-0.5F, -0.4384F, -0.3447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6641F, -2.2387F, 4.5091F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(94, 86).addBox(-0.6432F, -0.7739F, -2.3707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9062F, -3.1221F, 3.6999F, 0.8058F, 0.4257F, 0.1427F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(21, 46).addBox(-1.1515F, 0.1185F, 0.4468F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9062F, -3.1221F, 3.6999F, -2.2882F, 0.2404F, 0.4823F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(27, 65).addBox(-0.9325F, 0.2693F, -0.5513F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9062F, -3.1221F, 3.5749F, -1.5401F, 0.4468F, 0.6014F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(0, 65).addBox(-0.9895F, 0.1833F, -1.1748F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9062F, -3.1221F, 3.5749F, -2.2341F, 0.357F, 0.3656F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(63, 14).addBox(-1.05F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.998F, -4.4619F, 4.5517F, -2.7549F, 0.0327F, -0.1266F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(104, 104).addBox(-0.9251F, -1.8018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(103, 26).addBox(-0.9251F, -1.4018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6891F, -0.4433F, 3.314F, -0.8626F, 0.0744F, 0.0489F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(99, 82).addBox(-0.9251F, -0.3127F, -0.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6891F, -0.4433F, 3.314F, 0.4901F, 0.0744F, 0.0489F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 0.0827F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2891F, -0.8433F, 3.314F, 0.2827F, 0.2423F, 0.1F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 101).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8715F, -1.8619F, 3.8207F, -1.0907F, -0.7098F, 1.0133F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(94, 100).addBox(-0.9251F, -1.899F, -0.5826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6891F, -0.4433F, 3.314F, -0.7404F, 0.0744F, 0.0489F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(86, 13).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.807F, -1.3942F, 3.2634F, 0.3153F, -0.4866F, 1.1264F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 79).addBox(-0.9251F, -0.8295F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6891F, -0.4433F, 3.314F, 0.5686F, 0.0744F, 0.0489F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(99, 76).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1359F, -0.3982F, 1.5132F, 2.7506F, 0.2363F, -0.0222F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(60, 100).addBox(-0.5F, -1.7897F, -0.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2891F, -0.8433F, 3.314F, 1.8884F, 0.2423F, 0.1F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(52, 12).addBox(-1.0F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6431F, -1.0541F, 2.5704F, 0.361F, -0.2427F, 1.2328F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(72, 99).addBox(-0.5F, -0.4564F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2891F, -0.8433F, 3.314F, 0.3613F, 0.2423F, 0.1F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(79, 12).addBox(-0.7737F, 0.2983F, -1.4658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F))
				.texOffs(41, 14).addBox(-0.7737F, -0.2266F, -3.4658F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.214F)), PartPose.offsetAndRotation(0.2054F, -2.6761F, 2.0368F, 0.7009F, 0.1581F, -0.0674F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(30, 15).addBox(-0.5F, -1.1F, -1.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F))
				.texOffs(11, 30).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0094F, -0.4049F, 1.4706F, 0.57F, 0.1581F, -0.0674F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(104, 95).addBox(-0.5577F, -0.1258F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F))
				.texOffs(104, 92).addBox(-0.5577F, -0.7258F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.097F))
				.texOffs(104, 89).addBox(-0.5577F, -0.7258F, -0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F))
				.texOffs(33, 105).addBox(-0.5577F, -0.1258F, -0.3663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(78, 105).addBox(-0.5577F, -0.3258F, -1.1663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(0.6986F, -2.9055F, 3.8488F, 0.6418F, 0.365F, 0.2607F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(58, 64).addBox(-0.4712F, 0.0512F, -1.3531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9062F, -3.1221F, 3.5749F, -2.4472F, -0.2748F, -0.5245F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(10, 36).addBox(-0.125F, -0.225F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9834F, -4.1987F, 3.2747F, 0.8988F, -0.024F, 0.6451F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(48, 26).addBox(-1.0F, 0.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0561F, -4.2382F, 3.181F, 0.8678F, 0.2743F, 0.4004F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(83, 58).addBox(-0.25F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1359F, -3.518F, 2.6252F, 0.5829F, -0.4958F, 0.6251F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(84, 71).addBox(-0.5538F, -0.2836F, -0.2798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6519F, -2.2593F, 4.5565F, 1.8065F, 0.1745F, -0.0106F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(94, 96).addBox(-0.5538F, -1.2916F, 1.2688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 105).addBox(-0.5538F, -0.2916F, 1.0688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.6519F, -2.2593F, 4.5565F, 1.7978F, 0.1745F, -0.0106F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(100, 2).addBox(-0.5538F, 0.4976F, 0.7796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(99, 99).addBox(-0.5538F, 0.4976F, 0.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6519F, -2.2593F, 4.5565F, 2.5832F, 0.1745F, -0.0106F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 2.9361F, -7.8986F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(99, 47).mirror().addBox(-0.2769F, -0.8703F, -0.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(99, 44).mirror().addBox(-0.2769F, -0.2953F, -0.7858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0355F, -0.0138F, -0.3026F, -3.0667F, -0.1338F, 0.0559F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.475F, -0.65F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(0.1283F, 0.7146F, 0.0894F, 0.6637F, -0.2528F, -0.0816F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(51, 78).mirror().addBox(-0.3889F, -0.5705F, -0.1334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, -3.7649F, 7.4879F, -1.6969F, 0.588F, -0.0306F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.3889F, -0.3653F, -0.3128F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -3.5137F, 6.6091F, 0.0659F, 0.588F, -0.0306F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(14, 81).mirror().addBox(-0.3889F, -0.3541F, -0.4024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -3.5137F, 6.6091F, 0.3277F, 0.588F, -0.0306F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.4347F, -0.2715F, -0.423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -2.2387F, 4.5091F, 0.7163F, -0.037F, -0.037F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(-0.4987F, -0.3823F, 0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(105, 9).mirror().addBox(-0.4987F, -0.3823F, 0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 105).mirror().addBox(-0.4987F, -0.3823F, -0.34F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -3.0387F, 5.6091F, 0.4703F, 0.1031F, -0.0182F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-0.3F, 0.021F, -2.1052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8641F, -2.3387F, 4.4091F, 0.4284F, -0.4799F, -0.4094F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(-0.3F, -0.1221F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(84, 75).mirror().addBox(-0.3F, -0.2971F, -1.7397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8641F, -2.3387F, 4.4091F, 0.8211F, -0.4799F, -0.4094F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(38, 78).mirror().addBox(-0.5F, -0.4384F, -0.3447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6641F, -2.2387F, 4.5091F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(-0.3568F, -0.7739F, -2.3707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, -3.1221F, 3.6999F, 0.8058F, -0.4257F, -0.1427F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-0.8485F, 0.1185F, 0.4468F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, -3.1221F, 3.6999F, -2.2882F, -0.2404F, -0.4823F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-1.0675F, 0.2693F, -0.5513F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, -3.1221F, 3.5749F, -1.5401F, -0.4468F, -0.6014F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.0105F, 0.1833F, -1.1748F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, -3.1221F, 3.5749F, -2.2341F, -0.357F, -0.3656F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-0.95F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.998F, -4.4619F, 4.5517F, -2.7549F, -0.0327F, 0.1266F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(104, 104).mirror().addBox(-0.0749F, -1.8018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(103, 26).mirror().addBox(-0.0749F, -1.4018F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, -0.4433F, 3.314F, -0.8626F, -0.0744F, -0.0489F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(99, 82).mirror().addBox(-0.0749F, -0.3127F, -0.2558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, -0.4433F, 3.314F, 0.4901F, -0.0744F, -0.0489F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, 0.0827F, -1.9275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.8433F, 3.314F, 0.2827F, -0.2423F, -0.1F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8715F, -1.8619F, 3.8207F, -1.0907F, 0.7098F, -1.0133F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(94, 100).mirror().addBox(-0.0749F, -1.899F, -0.5826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, -0.4433F, 3.314F, -0.7404F, -0.0744F, -0.0489F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.807F, -1.3942F, 3.2634F, 0.3153F, 0.4866F, -1.1264F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-0.0749F, -0.8295F, -0.0236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6891F, -0.4433F, 3.314F, 0.5686F, -0.0744F, -0.0489F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(99, 76).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1359F, -0.3982F, 1.5132F, 2.7506F, -0.2363F, 0.0222F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.5F, -1.7897F, -0.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.8433F, 3.314F, 1.8884F, -0.2423F, -0.1F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(0.0F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6431F, -1.0541F, 2.5704F, 0.361F, 0.2427F, -1.2328F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(72, 99).mirror().addBox(-0.5F, -0.4564F, -1.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2891F, -0.8433F, 3.314F, 0.3613F, -0.2423F, -0.1F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.2263F, 0.2983F, -1.4658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.214F)).mirror(false)
				.texOffs(41, 14).mirror().addBox(-0.2263F, -0.2266F, -3.4658F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.214F)).mirror(false), PartPose.offsetAndRotation(-0.2054F, -2.6761F, 2.0368F, 0.7009F, -0.1581F, 0.0674F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(30, 15).mirror().addBox(-0.5F, -1.1F, -1.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(11, 30).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0094F, -0.4049F, 1.4706F, 0.57F, -0.1581F, 0.0674F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(104, 95).mirror().addBox(-0.4423F, -0.1258F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.106F)).mirror(false)
				.texOffs(104, 92).mirror().addBox(-0.4423F, -0.7258F, 0.0337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.097F)).mirror(false)
				.texOffs(104, 89).mirror().addBox(-0.4423F, -0.7258F, -0.9663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false)
				.texOffs(33, 105).mirror().addBox(-0.4423F, -0.1258F, -0.3663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(78, 105).mirror().addBox(-0.4423F, -0.3258F, -1.1663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6986F, -2.9055F, 3.8488F, 0.6418F, -0.365F, -0.2607F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(-1.5288F, 0.0512F, -1.3531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9062F, -3.1221F, 3.5749F, -2.4472F, 0.2748F, 0.5245F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(10, 36).mirror().addBox(-0.875F, -0.225F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9834F, -4.1987F, 3.2747F, 0.8988F, 0.024F, -0.6451F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(0.0F, 0.1F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0561F, -4.2382F, 3.181F, 0.8678F, -0.2743F, -0.4004F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(83, 58).mirror().addBox(-0.75F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1359F, -3.518F, 2.6252F, 0.5829F, 0.4958F, -0.6251F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-0.4463F, -0.2836F, -0.2798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6519F, -2.2593F, 4.5565F, 1.8065F, -0.1745F, 0.0106F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(94, 96).mirror().addBox(-0.4463F, -1.2916F, 1.2688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 105).mirror().addBox(-0.4463F, -0.2916F, 1.0688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.6519F, -2.2593F, 4.5565F, 1.7978F, -0.1745F, 0.0106F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(100, 2).mirror().addBox(-0.4463F, 0.4976F, 0.7796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(99, 99).mirror().addBox(-0.4463F, 0.4976F, 0.3796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6519F, -2.2593F, 4.5565F, 2.5832F, -0.1745F, 0.0106F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1643F, -1.7452F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(-0.05F, -3.1707F, 1.1809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.2128F, -1.4425F, 0.2531F, -0.0873F, -0.0698F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.05F, -4.471F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 3).mirror().addBox(-0.05F, -3.871F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.2128F, -1.4425F, -0.6632F, -0.0873F, -0.0698F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-0.5F, -1.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7694F, 3.351F, -3.7998F, -1.3362F, -0.1901F, -0.1117F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-0.5F, -1.2925F, -0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8829F, 2.6334F, -2.9428F, -1.1952F, -0.1654F, -0.146F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(99, 96).mirror().addBox(-0.5F, -0.9338F, -1.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8829F, 2.6334F, -2.9428F, -2.4169F, -0.1654F, -0.146F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(74, 93).mirror().addBox(-0.5F, 0.2647F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8829F, 2.6334F, -2.9428F, -1.2999F, -0.1654F, -0.146F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(79, 94).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 4.1254F, -4.9376F, -1.4235F, -0.1901F, -0.1117F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(69, 93).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1283F, 2.701F, -1.1526F, -1.213F, -0.0873F, -0.0698F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(100, 5).mirror().addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2764F, 1.8486F, -0.1435F, 0.8727F, -0.0873F, -0.0698F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, 2.2545F, 0.1618F, -0.3142F, -0.0873F, -0.0698F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(100, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2329F, 2.445F, -0.1179F, 0.1222F, -0.0873F, -0.0698F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1436F, 2.4286F, -1.1959F, -0.9076F, -0.0873F, -0.0698F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-0.5F, -1.175F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 3.5734F, -2.3771F, -1.2214F, -0.1679F, -0.1431F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.05F, -3.5755F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.2128F, -1.4425F, 0.0262F, -0.0873F, -0.0698F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(43, 105).mirror().addBox(-0.05F, -4.3152F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.2128F, -1.4425F, -0.0175F, -0.0873F, -0.0698F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(48, 105).mirror().addBox(-0.05F, -5.1538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.6128F, -1.5675F, -0.288F, -0.0873F, -0.0698F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(68, 105).mirror().addBox(-0.05F, -5.3816F, -2.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.6128F, -1.5675F, -0.5061F, -0.0873F, -0.0698F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(73, 105).mirror().addBox(-0.05F, -4.4032F, 3.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.65F, 4.6128F, -1.5675F, 0.6283F, -0.0873F, -0.0698F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.7339F, 1.6331F, -0.926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4764F, 4.0605F, -3.2473F, -1.5021F, -0.0866F, -0.0914F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(98, 64).mirror().addBox(-0.7339F, 1.3836F, -0.7655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4764F, 4.0605F, -3.2473F, -1.5544F, -0.0866F, -0.0914F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(98, 30).mirror().addBox(-0.7339F, 1.544F, -1.3402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4764F, 4.0605F, -3.2473F, -1.3799F, -0.0866F, -0.0914F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(98, 30).addBox(-0.2661F, 1.544F, -1.3402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4764F, 4.0605F, -3.2473F, -1.3799F, 0.0866F, 0.0914F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(98, 64).addBox(-0.2661F, 1.3836F, -0.7655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4764F, 4.0605F, -3.2473F, -1.5544F, 0.0866F, 0.0914F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(43, 86).addBox(-1.299F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 51).addBox(-1.299F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.299F, 3.8411F, -7.0848F, -1.7136F, 0.0F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(20, 98).addBox(-0.2661F, 1.6331F, -0.926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4764F, 4.0605F, -3.2473F, -1.5021F, 0.0866F, 0.0914F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(73, 105).addBox(-0.95F, -4.4032F, 3.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.6128F, -1.5675F, 0.6283F, 0.0873F, 0.0698F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(68, 105).addBox(-0.95F, -5.3816F, -2.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.65F, 4.6128F, -1.5675F, -0.5061F, 0.0873F, 0.0698F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(48, 105).addBox(-0.95F, -5.1538F, -1.3772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.6128F, -1.5675F, -0.288F, 0.0873F, 0.0698F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(43, 105).addBox(-0.95F, -4.3152F, -0.279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.2128F, -1.4425F, -0.0175F, 0.0873F, 0.0698F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(10, 97).addBox(-0.95F, -3.5755F, 0.0799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.45F, 4.2128F, -1.4425F, 0.0262F, 0.0873F, 0.0698F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(93, 12).addBox(-0.5F, -1.175F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8876F, 3.5734F, -2.3771F, -1.2214F, 0.1679F, 0.1431F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(94, 45).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1436F, 2.4286F, -1.1959F, -0.9076F, 0.0873F, 0.0698F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(100, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2329F, 2.445F, -0.1179F, 0.1222F, 0.0873F, 0.0698F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(105, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, 2.2545F, 0.1618F, -0.3142F, 0.0873F, 0.0698F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(100, 5).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2764F, 1.8486F, -0.1435F, 0.8727F, 0.0873F, 0.0698F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(69, 93).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1283F, 2.701F, -1.1526F, -1.213F, 0.0873F, 0.0698F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(79, 94).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4622F, 4.1254F, -4.9376F, -1.4235F, 0.1901F, 0.1117F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(74, 93).addBox(-0.5F, 0.2647F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8829F, 2.6334F, -2.9428F, -1.2999F, 0.1654F, 0.146F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(99, 96).addBox(-0.5F, -0.9338F, -1.6955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8829F, 2.6334F, -2.9428F, -2.4169F, 0.1654F, 0.146F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(93, 65).addBox(-0.5F, -1.2925F, -0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8829F, 2.6334F, -2.9428F, -1.1952F, 0.1654F, 0.146F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(70, 85).addBox(-0.5F, -1.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7694F, 3.351F, -3.7998F, -1.3362F, 0.1901F, 0.1117F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(105, 3).addBox(-0.95F, -3.871F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 0).addBox(-0.95F, -4.471F, -1.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.65F, 4.2128F, -1.4425F, -0.6632F, 0.0873F, 0.0698F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(94, 78).addBox(-0.95F, -3.1707F, 1.1809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.45F, 4.2128F, -1.4425F, 0.2531F, 0.0873F, 0.0698F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(78, 54).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4305F, 0.7086F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 78).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0186F, 1.919F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(79, 4).addBox(-0.5F, -0.1402F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

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