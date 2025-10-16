package fossils.fossils.client.blockentity.model.yi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftPelvis;
	private final ModelPart rightPelvis;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftScapula;
	private final ModelPart rightScapula;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightface;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
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

	public YiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftPelvis = this.hips.getChild("leftPelvis");
		this.rightPelvis = this.hips.getChild("rightPelvis");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftScapula = this.chest.getChild("leftScapula");
		this.rightScapula = this.chest.getChild("rightScapula");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightface = this.head.getChild("rightface");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.neck2.getChild("bone2");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, -0.1981F, -3.2716F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(36, 7).addBox(0.5F, 0.3019F, -2.2716F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(36, 7).mirror().addBox(-1.5F, 0.3019F, -2.2716F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 60).addBox(0.0F, -1.248F, -2.2716F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -29.825F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 80).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1981F, 1.7284F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 80).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1981F, -0.2716F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftPelvis = hips.addOrReplaceChild("leftPelvis", CubeListBuilder.create().texOffs(60, 0).addBox(-0.15F, -3.004F, -3.9642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.25F, 1.7079F, 0.4497F));

		PartDefinition cube_r3 = leftPelvis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 71).addBox(-0.5F, -0.537F, 0.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F))
				.texOffs(76, 48).addBox(-0.5F, -0.537F, -0.9743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.35F, -1.7234F, 1.8524F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftPelvis.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 60).addBox(-0.5F, -0.4281F, -1.4022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.35F, -1.7234F, 1.8524F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftPelvis.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 35).addBox(-0.5F, -3.0063F, -1.0065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.35F, -1.3955F, -2.3952F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftPelvis.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 68).addBox(-0.5F, -2.0063F, -1.0066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.35F, -1.179F, -3.3715F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftPelvis.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.0063F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.35F, -1.504F, -4.2642F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftPelvis.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 54).addBox(-0.5F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(77, 6).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.35F, -2.504F, -3.4642F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftPelvis.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 37).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, -1.9381F, 0.0601F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftPelvis.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 48).addBox(-0.5F, -1.225F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.35F, -1.529F, -1.2142F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftPelvis.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 72).addBox(-0.5F, -3.7612F, -0.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4462F, 2.8908F, 2.5665F, 0.6483F, -0.1156F, 0.1066F));

		PartDefinition cube_r12 = leftPelvis.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 71).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0871F, 4.5078F, 6.7767F, 1.6096F, -0.1417F, 0.0681F));

		PartDefinition cube_r13 = leftPelvis.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(47, 67).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8065F, 3.8869F, 5.1106F, 1.2082F, -0.1417F, 0.0681F));

		PartDefinition cube_r14 = leftPelvis.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(29, 68).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.525F, 3.1215F, 3.506F, 1.1209F, -0.1417F, 0.0681F));

		PartDefinition cube_r15 = leftPelvis.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 61).addBox(-0.2117F, -0.2108F, -0.1219F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2462F, 0.9158F, 0.5665F, 0.9289F, -0.1417F, 0.0681F));

		PartDefinition cube_r16 = leftPelvis.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 29).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7393F, 5.2683F, -1.8646F, -0.0185F, -0.0136F, 0.1565F));

		PartDefinition cube_r17 = leftPelvis.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 61).addBox(-0.5F, -0.125F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1596F, 1.5595F, -1.4661F, -0.1058F, -0.0136F, 0.1565F));

		PartDefinition cube_r18 = leftPelvis.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.021F, 0.6738F, -1.3867F, -0.0883F, -0.0136F, 0.1565F));

		PartDefinition cube_r19 = leftPelvis.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 68).addBox(-1.1F, -1.2813F, -2.2345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.3052F, 0.2473F, 0.5236F, 0.0F, 0.1571F));

		PartDefinition cube_r20 = leftPelvis.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 52).addBox(-1.1F, -0.1813F, -1.2845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.9F, -1.3052F, 0.2473F, -0.2182F, 0.0F, 0.1571F));

		PartDefinition rightPelvis = hips.addOrReplaceChild("rightPelvis", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.85F, -3.004F, -3.9642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.25F, 1.7079F, 0.4497F));

		PartDefinition cube_r21 = rightPelvis.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(-0.5F, -0.537F, 0.0257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false)
				.texOffs(76, 48).mirror().addBox(-0.5F, -0.537F, -0.9743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.7234F, 1.8524F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightPelvis.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(-0.5F, -0.4281F, -1.4022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.7234F, 1.8524F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightPelvis.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 35).mirror().addBox(-0.5F, -3.0063F, -1.0065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.3955F, -2.3952F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightPelvis.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 68).mirror().addBox(-0.5F, -2.0063F, -1.0066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.179F, -3.3715F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightPelvis.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -1.0063F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.504F, -4.2642F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightPelvis.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.5F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(77, 6).mirror().addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -2.504F, -3.4642F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightPelvis.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.9381F, 0.0601F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightPelvis.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.5F, -1.225F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.529F, -1.2142F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightPelvis.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 72).mirror().addBox(-0.5F, -3.7612F, -0.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4462F, 2.8908F, 2.5665F, 0.6483F, 0.1156F, -0.1066F));

		PartDefinition cube_r30 = rightPelvis.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(34, 71).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0871F, 4.5078F, 6.7767F, 1.6096F, 0.1417F, -0.0681F));

		PartDefinition cube_r31 = rightPelvis.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8065F, 3.8869F, 5.1106F, 1.2082F, 0.1417F, -0.0681F));

		PartDefinition cube_r32 = rightPelvis.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.525F, 3.1215F, 3.506F, 1.1209F, 0.1417F, -0.0681F));

		PartDefinition cube_r33 = rightPelvis.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 61).mirror().addBox(-0.7883F, -0.2108F, -0.1219F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2462F, 0.9158F, 0.5665F, 0.9289F, 0.1417F, -0.0681F));

		PartDefinition cube_r34 = rightPelvis.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(67, 29).mirror().addBox(-0.5F, -0.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7393F, 5.2683F, -1.8646F, -0.0185F, 0.0136F, -0.1565F));

		PartDefinition cube_r35 = rightPelvis.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-0.5F, -0.125F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1596F, 1.5595F, -1.4661F, -0.1058F, 0.0136F, -0.1565F));

		PartDefinition cube_r36 = rightPelvis.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.021F, 0.6738F, -1.3867F, -0.0883F, 0.0136F, -0.1565F));

		PartDefinition cube_r37 = rightPelvis.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(0.1F, -1.2813F, -2.2345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.3052F, 0.2473F, 0.5236F, 0.0F, -0.1571F));

		PartDefinition cube_r38 = rightPelvis.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(0.1F, -0.1813F, -1.2845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.3052F, 0.2473F, -0.2182F, 0.0F, -0.1571F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1847F, -3.0727F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 42).addBox(0.0F, -0.9981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4672F, -0.0364F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(20, 46).addBox(0.0F, -0.9981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8446F, -2.003F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 29).addBox(-0.5F, -0.9495F, 1.7912F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.2852F, -4.9123F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(-2.9205F, -0.3907F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0099F, -0.509F, -0.043F, 0.1405F, -1.2848F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0099F, -0.509F, 0.0157F, 0.1461F, -0.8792F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3901F, -2.409F, -0.0377F, 0.1839F, -1.6118F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3901F, -2.409F, 0.0413F, 0.1832F, -1.1857F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3901F, -2.409F, 0.11F, 0.1524F, -0.7796F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 27).addBox(0.9205F, -0.3907F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0099F, -0.509F, -0.043F, -0.1405F, 1.2848F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(50, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0099F, -0.509F, 0.0157F, -0.1461F, 0.8792F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 33).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3901F, -2.409F, -0.0377F, -0.1839F, 1.6118F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 45).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3901F, -2.409F, 0.0413F, -0.1832F, 1.1857F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3901F, -2.409F, 0.11F, -0.1524F, 0.7796F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.7371F, 1.0044F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 6.527F, -5.9116F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7316F, -2.9918F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 78).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1599F, -1.5409F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(23, 61).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1599F, -3.5409F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3371F, -1.4572F, 0.2884F, 0.2148F, -0.6232F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3371F, -1.4572F, 0.1821F, 0.3097F, -1.0274F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3371F, -1.4572F, 0.0358F, 0.3561F, -1.4684F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 13).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5371F, -3.4572F, 0.0446F, 0.3902F, -1.4129F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 20).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5371F, -3.4572F, 0.2053F, 0.3371F, -0.9678F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(34, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5371F, -3.4572F, 0.3201F, 0.2313F, -0.5639F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3371F, -1.4572F, 0.2884F, -0.2148F, 0.6232F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(10, 30).addBox(-2.0F, -0.9371F, 1.0544F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 7.942F, -4.5535F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 35).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3371F, -1.4572F, 0.1821F, -0.3097F, 1.0274F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(38, 35).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3371F, -1.4572F, 0.0358F, -0.3561F, 1.4684F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 13).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5371F, -3.4572F, 0.0446F, -0.3902F, 1.4129F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(47, 20).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5371F, -3.4572F, 0.2053F, -0.3371F, 0.9678F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5371F, -3.4572F, 0.3201F, -0.2313F, 0.5639F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 42).addBox(-0.5F, -0.9F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.042F, -4.9605F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.455F, -3.9354F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(34, 68).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3674F, -1.5553F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 61).addBox(0.0F, -2.05F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 30).addBox(-0.5F, -1.1F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.9334F, -7.7719F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5285F, -3.4686F, 0.4344F, 0.283F, -0.43F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5285F, -3.4686F, 0.2931F, 0.4279F, -0.8302F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5285F, -3.4686F, 0.0818F, 0.5075F, -1.292F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1286F, -1.5686F, 0.3707F, 0.2512F, -0.5F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1286F, -1.5686F, 0.0636F, 0.4402F, -1.3534F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1286F, -1.5686F, 0.2451F, 0.3746F, -0.9021F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5285F, -3.4686F, 0.4344F, -0.283F, 0.43F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 78).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5285F, -3.4686F, 0.2931F, -0.4279F, 0.8302F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(60, 12).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5285F, -3.4686F, 0.0818F, -0.5075F, 1.292F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1286F, -1.5686F, 0.3707F, -0.2512F, 0.5F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(40, 27).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1286F, -1.5686F, 0.0636F, -0.4402F, 1.3534F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 78).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1286F, -1.5686F, 0.2451F, -0.3746F, 0.9021F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(25, 24).addBox(-1.5F, -1.0298F, -3.9847F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 7.8255F, 0.4759F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftScapula = chest.addOrReplaceChild("leftScapula", CubeListBuilder.create(), PartPose.offset(2.0251F, 2.6259F, -3.6583F));

		PartDefinition cube_r84 = leftScapula.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(49, 72).addBox(-0.5F, -0.4F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4749F, -2.7317F, 2.7986F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftScapula.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(72, 30).addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.4749F, -2.9251F, 3.3346F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftScapula.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.675F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.4749F, -2.3842F, 2.3441F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftScapula.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(10, 35).addBox(-0.5F, -0.15F, -2.225F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0253F)), PartPose.offsetAndRotation(0.4749F, -1.4225F, 0.1445F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftScapula.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 27).addBox(-0.5F, -0.3751F, 0.3849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.4749F, -2.3225F, 1.8445F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftScapula.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 15).addBox(-0.3867F, -0.0895F, 1.3141F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2292F, 3.1113F, -1.8945F, -0.1817F, 0.474F, -1.0059F));

		PartDefinition cube_r90 = leftScapula.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(66, 45).addBox(-1.2103F, 0.0819F, 1.112F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2292F, 3.1113F, -1.8945F, -0.1407F, 1.1221F, -1.1334F));

		PartDefinition cube_r91 = leftScapula.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 60).addBox(-0.7F, -1.0324F, 0.0478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.2292F, 3.1113F, -1.8945F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftScapula.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 57).addBox(-1.0F, -1.0902F, -0.0438F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0204F)), PartPose.offsetAndRotation(-1.2292F, 1.9113F, -3.3945F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftScapula.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 63).addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(27, 72).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-0.0743F, 0.7812F, -2.244F, 1.0245F, 0.2632F, 0.3521F));

		PartDefinition cube_r94 = leftScapula.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(69, 18).addBox(-0.5F, 0.725F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.029F)), PartPose.offsetAndRotation(0.1595F, -0.0389F, -2.4792F, 0.9808F, 0.2632F, 0.3521F));

		PartDefinition cube_r95 = leftScapula.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 11).addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.1595F, -0.0389F, -2.4792F, 0.6318F, 0.2632F, 0.3521F));

		PartDefinition rightScapula = chest.addOrReplaceChild("rightScapula", CubeListBuilder.create(), PartPose.offset(-2.0251F, 2.6259F, -3.6583F));

		PartDefinition cube_r96 = rightScapula.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(49, 72).mirror().addBox(-0.5F, -0.4F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4749F, -2.7317F, 2.7986F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightScapula.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.4749F, -2.9251F, 3.3346F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightScapula.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.5F, -0.675F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.4749F, -2.3842F, 2.3441F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightScapula.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(10, 35).mirror().addBox(-0.5F, -0.15F, -2.225F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0253F)).mirror(false), PartPose.offsetAndRotation(-0.4749F, -1.4225F, 0.1445F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightScapula.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-0.5F, -0.3751F, 0.3849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.4749F, -2.3225F, 1.8445F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightScapula.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-0.6133F, -0.0895F, 1.3141F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2292F, 3.1113F, -1.8945F, -0.1817F, -0.474F, 1.0059F));

		PartDefinition cube_r102 = rightScapula.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(0.2103F, 0.0819F, 1.112F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2292F, 3.1113F, -1.8945F, -0.1407F, -1.1221F, 1.1334F));

		PartDefinition cube_r103 = rightScapula.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-0.3F, -1.0324F, 0.0478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.2292F, 3.1113F, -1.8945F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightScapula.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(48, 57).mirror().addBox(-1.0F, -1.0902F, -0.0438F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(1.2292F, 1.9113F, -3.3945F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightScapula.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(-0.5F, 0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(27, 72).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(0.0743F, 0.7812F, -2.244F, 1.0245F, -0.2632F, -0.3521F));

		PartDefinition cube_r106 = rightScapula.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-0.5F, 0.725F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.029F)).mirror(false), PartPose.offsetAndRotation(-0.1595F, -0.0389F, -2.4792F, 0.9808F, -0.2632F, -0.3521F));

		PartDefinition cube_r107 = rightScapula.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(69, 11).mirror().addBox(-0.5F, 0.05F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.1595F, -0.0389F, -2.4792F, 0.6318F, -0.2632F, -0.3521F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7848F, -4.819F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1575F, -1.3254F, 0.0647F, 0.6864F, -1.5597F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(75, 78).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1575F, -1.3254F, 0.3746F, 0.5927F, -1.0484F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1575F, -1.3254F, 0.5726F, 0.4067F, -0.6413F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(66, 58).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1575F, -1.3254F, 0.0647F, -0.6864F, 1.5597F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 78).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1575F, -1.3254F, 0.3746F, -0.5927F, 1.0484F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1575F, -1.3254F, 0.5726F, -0.4067F, 0.6413F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(18, 80).addBox(0.0F, -1.4477F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 20).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1473F, -2.8287F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3955F, -2.6983F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(79, 20).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3608F, 0.1815F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r116 = neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(79, 17).addBox(0.0F, -0.25F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 42).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0543F, -6.6105F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7704F, -3.7121F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(60, 29).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 79).addBox(0.0F, -0.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2839F, -2.7985F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(49, 4).addBox(-0.5F, -0.2475F, -2.9462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.8126F, -1.8065F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(79, 9).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4475F, -2.4462F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(79, 0).addBox(0.0F, -0.9F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2525F, 0.4538F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6418F, -2.6176F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(62, 23).addBox(-1.0F, -0.1898F, -0.1349F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.79F, -0.4453F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(57, 45).addBox(-1.5F, -0.1898F, -0.0099F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -1.79F, -0.4453F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 52).addBox(-1.5F, 0.9102F, 0.565F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(51, 9).addBox(-1.5F, -0.0898F, -0.01F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.2051F, -1.0529F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(18, 57).addBox(-1.5F, -1.15F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0504F, -0.4259F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(10, 74).addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 1.9197F, -6.5184F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 9).addBox(-1.0F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.1204F, -6.5533F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(12, 71).addBox(-1.0F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5F, 0.3954F, -6.2152F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(30, 77).addBox(-1.0F, 0.2145F, 0.1877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.2969F, -5.2957F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(62, 77).addBox(-1.0F, -0.1105F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.2969F, -5.2957F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(57, 56).addBox(-1.0F, -0.1105F, -0.1123F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(7, 66).addBox(-1.0F, 0.0895F, -0.1123F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(67, 0).addBox(-1.0F, 0.8895F, -0.1123F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.4659F, -3.9269F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-1.5F, -1.7105F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(53, 34).addBox(0.5F, -1.7105F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(58, 4).addBox(-1.5F, -0.9105F, -0.9123F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0F, 0.8687F, -1.5307F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5F, 0.1895F, -1.9123F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(48, 48).addBox(-1.5F, -0.1105F, -1.9123F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.9523F, -2.3263F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(53, 25).addBox(-1.5F, -1.9105F, -0.9123F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.9523F, -2.3263F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(40, 22).addBox(-1.5F, -0.1105F, -0.1123F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.9075F, -3.2598F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(38, 30).addBox(-1.5F, -0.1105F, -0.1123F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -2.2136F, -2.5207F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -0.1105F, -0.1123F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.0F, -2.4139F, -1.7462F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 37).addBox(-1.5F, -0.2105F, -0.1123F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -2.1918F, -1.0824F, -1.8937F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 31.9937F, 25.5533F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(77, 29).addBox(-0.5F, -0.2062F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.925F, -32.5639F, -26.9218F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(39, 71).addBox(-0.5F, 0.1094F, -0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.925F, -33.5639F, -27.1218F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(7, 69).addBox(-0.5F, -0.013F, -1.0362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.925F, -33.6033F, -27.2832F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(76, 51).addBox(-0.5F, -0.9784F, -1.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.925F, -31.1116F, -28.6232F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(77, 26).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.925F, -31.7441F, -28.6849F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(71, 39).addBox(-0.5F, -1.5065F, -0.9672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(71, 36).addBox(-0.5F, -1.0065F, -0.9672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.925F, -33.7836F, -28.2926F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5F, 0.331F, -0.3747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.925F, -33.0836F, -28.9926F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 7).addBox(-0.45F, -1.0F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(58, 14).addBox(-0.675F, -1.0F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.335F, -32.4496F, -27.9305F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(74, 23).addBox(-0.8148F, -0.2418F, -0.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8387F, -30.2503F, -30.6927F, -0.8791F, 0.3511F, 0.0527F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 20).addBox(-0.8961F, -0.1093F, -0.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1387F, -30.6503F, -30.0927F, -1.0733F, 0.3118F, 0.052F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(10, 77).addBox(-0.4F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(77, 3).addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8857F, -31.7205F, -29.7023F, -1.4835F, 0.2269F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(76, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8857F, -31.7205F, -29.7023F, -0.9599F, 0.2269F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(32, 74).addBox(-0.9F, -0.0439F, -1.7424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, -30.9838F, -28.9781F, -0.829F, 0.2269F, 0.0F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 17).addBox(-0.9F, 0.3872F, -0.9646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.4F, -30.9838F, -28.9781F, -1.213F, 0.2269F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 64).addBox(-0.9F, -0.3105F, -1.9123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, -30.9838F, -28.9781F, -1.3003F, 0.2269F, 0.0F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(77, 72).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.925F, -31.8548F, -26.8547F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 24).addBox(-0.475F, -0.6549F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(69, 21).addBox(-0.475F, -0.6549F, -1.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.15F, -31.6733F, -26.7975F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(62, 68).addBox(-0.7148F, -1.0745F, -0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8387F, -30.2503F, -30.6927F, 2.5156F, 0.3511F, 0.0527F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(59, 74).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(64, 74).addBox(-0.8F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -30.074F, -32.0717F, 2.9915F, 0.4977F, 0.096F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 66).addBox(-0.8118F, -0.3536F, -1.6303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 74).addBox(-0.8F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 74).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -30.074F, -32.0717F, 1.7697F, 0.4977F, 0.096F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5477F, 0.2729F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6285F, -29.9837F, -30.9256F, 2.1401F, 0.2718F, 0.0875F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5477F, -0.4316F, -0.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6285F, -29.9837F, -30.9256F, 2.2273F, 0.2718F, 0.0875F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(65, 14).addBox(-0.5F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.28F, -29.7813F, -31.4283F, 1.9006F, 0.4977F, 0.096F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(71, 42).addBox(-0.9F, -0.1105F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.2566F, -32.9646F, -30.0518F, -0.8573F, 0.1752F, 0.1044F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(35, 77).addBox(-0.9F, -0.1105F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0972F, -32.4548F, -30.6474F, -0.77F, 0.1752F, 0.1044F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 77).addBox(-0.725F, 0.0645F, -0.1873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.0722F, -32.4548F, -30.6474F, -0.77F, 0.1752F, 0.1044F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 77).addBox(-0.75F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9586F, -31.678F, -30.9719F, -0.7479F, 0.2684F, 0.205F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 63).addBox(-1.0291F, -0.1877F, -1.7795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(77, 66).addBox(-1.0291F, -0.3877F, -1.1795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.1387F, -30.6503F, -30.0927F, -0.7608F, 0.2597F, 0.1584F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(77, 69).addBox(-0.5F, -0.125F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.302F, -31.4341F, -31.6072F, -0.4793F, 0.3161F, 0.2302F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(64, 60).addBox(-0.9F, -0.1105F, -0.1123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, -33.4596F, -29.4802F, -0.8573F, 0.1381F, 0.1074F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(71, 48).addBox(-0.475F, -0.5308F, -0.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.15F, -31.8443F, -26.3277F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 64).addBox(-0.525F, -0.7598F, -1.7235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.15F, -31.6443F, -26.3527F, -1.5708F, 0.0F, 0.0F));

		PartDefinition rightface = head.addOrReplaceChild("rightface", CubeListBuilder.create(), PartPose.offset(0.0F, 31.9937F, 25.5533F));

		PartDefinition cube_r169 = rightface.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(77, 29).mirror().addBox(-0.5F, -0.2062F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -32.5639F, -26.9218F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightface.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-0.5F, 0.1094F, -0.1549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -33.5639F, -27.1218F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightface.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.5F, -0.013F, -1.0362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -33.6033F, -27.2832F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightface.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.5F, -0.9784F, -1.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -31.1116F, -28.6232F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightface.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -31.7441F, -28.6849F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightface.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-0.5F, -1.5065F, -0.9672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(71, 36).mirror().addBox(-0.5F, -1.0065F, -0.9672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -33.7836F, -28.2926F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightface.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.5F, 0.331F, -0.3747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -33.0836F, -28.9926F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightface.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 7).mirror().addBox(-0.55F, -1.0F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(58, 14).mirror().addBox(-0.325F, -1.0F, -1.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.335F, -32.4496F, -27.9305F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightface.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-0.1852F, -0.2418F, -0.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8387F, -30.2503F, -30.6927F, -0.8791F, -0.3511F, -0.0527F));

		PartDefinition cube_r178 = rightface.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-0.1039F, -0.1093F, -0.8837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1387F, -30.6503F, -30.0927F, -1.0733F, -0.3118F, -0.052F));

		PartDefinition cube_r179 = rightface.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.6F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(77, 3).mirror().addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8857F, -31.7205F, -29.7023F, -1.4835F, -0.2269F, 0.0F));

		PartDefinition cube_r180 = rightface.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8857F, -31.7205F, -29.7023F, -0.9599F, -0.2269F, 0.0F));

		PartDefinition cube_r181 = rightface.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.1F, -0.0439F, -1.7424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -30.9838F, -28.9781F, -0.829F, -0.2269F, 0.0F));

		PartDefinition cube_r182 = rightface.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-0.1F, 0.3872F, -0.9646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -30.9838F, -28.9781F, -1.213F, -0.2269F, 0.0F));

		PartDefinition cube_r183 = rightface.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-0.1F, -0.3105F, -1.9123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -30.9838F, -28.9781F, -1.3003F, -0.2269F, 0.0F));

		PartDefinition cube_r184 = rightface.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -31.8548F, -26.8547F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightface.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.525F, -0.6549F, -0.7585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(69, 21).mirror().addBox(-0.525F, -0.6549F, -1.2585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -31.6733F, -26.7975F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightface.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(62, 68).mirror().addBox(-0.2852F, -1.0745F, -0.1026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8387F, -30.2503F, -30.6927F, 2.5156F, -0.3511F, -0.0527F));

		PartDefinition cube_r187 = rightface.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(64, 74).mirror().addBox(-0.2F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -30.074F, -32.0717F, 2.9915F, -0.4977F, -0.096F));

		PartDefinition cube_r188 = rightface.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.1882F, -0.3536F, -1.6303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 74).mirror().addBox(-0.2F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 74).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -30.074F, -32.0717F, 1.7697F, -0.4977F, -0.096F));

		PartDefinition cube_r189 = rightface.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.4523F, 0.2729F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6285F, -29.9837F, -30.9256F, 2.1401F, -0.2718F, -0.0875F));

		PartDefinition cube_r190 = rightface.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.4523F, -0.4316F, -0.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6285F, -29.9837F, -30.9256F, 2.2273F, -0.2718F, -0.0875F));

		PartDefinition cube_r191 = rightface.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-0.5F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.28F, -29.7813F, -31.4283F, 1.9006F, -0.4977F, -0.096F));

		PartDefinition cube_r192 = rightface.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(71, 42).mirror().addBox(-0.1F, -0.1105F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.2566F, -32.9646F, -30.0518F, -0.8573F, -0.1752F, -0.1044F));

		PartDefinition cube_r193 = rightface.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.1F, -0.1105F, -0.1123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0972F, -32.4548F, -30.6474F, -0.77F, -0.1752F, -0.1044F));

		PartDefinition cube_r194 = rightface.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.275F, 0.0645F, -0.1873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.0722F, -32.4548F, -30.6474F, -0.77F, -0.1752F, -0.1044F));

		PartDefinition cube_r195 = rightface.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(-0.25F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -31.678F, -30.9719F, -0.7479F, -0.2684F, -0.205F));

		PartDefinition cube_r196 = rightface.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(0.0291F, -0.1877F, -1.7795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(77, 66).mirror().addBox(0.0291F, -0.3877F, -1.1795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.1387F, -30.6503F, -30.0927F, -0.7608F, -0.2597F, -0.1584F));

		PartDefinition cube_r197 = rightface.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-0.5F, -0.125F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.302F, -31.4341F, -31.6072F, -0.4793F, -0.3161F, -0.2302F));

		PartDefinition cube_r198 = rightface.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-0.1F, -0.1105F, -0.1123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -33.4596F, -29.4802F, -0.8573F, -0.1381F, -0.1074F));

		PartDefinition cube_r199 = rightface.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-0.525F, -0.5308F, -0.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -31.8443F, -26.3277F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightface.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-0.475F, -0.7598F, -1.7235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -31.6443F, -26.3527F, -1.5708F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.439F, -0.0835F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.225F, -0.0008F, -1.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(72, 3).mirror().addBox(-0.225F, -0.0008F, -0.8275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2685F, -1.8879F, 0.2443F, -0.0873F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.2288F, -0.1217F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.1315F, -2.9879F, 0.2443F, -0.2094F, -0.0349F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(52, 75).mirror().addBox(-0.198F, 0.0768F, -1.5291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2685F, -1.8879F, 0.2487F, -0.0873F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.198F, 0.1195F, -0.9281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 60).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2685F, -1.8879F, 0.192F, -0.0873F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.5F, -0.775F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(20, 75).addBox(1.5F, -0.775F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.0F, 0.4503F, -1.304F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(62, 71).addBox(1.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.0F, 0.0945F, -1.0729F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-0.2038F, -0.0384F, -1.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.1315F, -2.9879F, 0.2793F, -0.2094F, -0.0349F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(71, 33).mirror().addBox(-0.1891F, -1.1475F, -0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, 2.4729F, -0.3666F, -0.1054F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-0.1891F, -0.7007F, 0.6476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, -2.2395F, -0.3666F, -0.1054F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-0.1891F, -1.192F, 0.0579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, -2.5013F, -0.3666F, -0.1054F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(12, 62).mirror().addBox(-0.1891F, -0.891F, 0.5341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, -2.2831F, -0.3666F, -0.1054F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-0.1891F, 0.3164F, 0.779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.1891F, -0.1086F, 0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, -1.8468F, -0.3666F, -0.1054F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.1891F, 0.3502F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, -0.7996F, -0.3666F, -0.1054F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(-0.1891F, -0.1873F, -0.7662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.7315F, -4.4879F, 0.5094F, -0.3666F, -0.1054F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.2038F, -0.2827F, -1.8106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.1315F, -2.9879F, 0.4363F, -0.2094F, -0.0349F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(-0.2F, -0.3042F, -1.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.2685F, -1.8879F, 0.3665F, -0.0873F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 54).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 75).addBox(1.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 54).addBox(1.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.2475F, -0.6881F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(71, 51).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(76, 36).addBox(1.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(71, 51).addBox(1.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.0F, 0.247F, 0.0572F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 42).addBox(-0.775F, -0.0008F, -1.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(72, 3).addBox(-0.775F, -0.0008F, -0.8275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -0.2685F, -1.8879F, 0.2443F, 0.0873F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(76, 39).addBox(-0.7712F, -0.1217F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 0.1315F, -2.9879F, 0.2443F, 0.2094F, 0.0349F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(52, 75).addBox(-0.802F, 0.0768F, -1.5291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.3F, -0.2685F, -1.8879F, 0.2487F, 0.0873F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(67, 71).addBox(-0.802F, 0.1195F, -0.9281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 60).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.3F, -0.2685F, -1.8879F, 0.192F, 0.0873F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(53, 64).addBox(-0.7962F, -0.0384F, -1.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 0.1315F, -2.9879F, 0.2793F, 0.2094F, 0.0349F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(71, 33).addBox(-0.8109F, -1.1475F, -0.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, 2.4729F, 0.3666F, 0.1054F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(67, 68).addBox(-0.8109F, -0.7007F, 0.6476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, -2.2395F, 0.3666F, 0.1054F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(57, 68).addBox(-0.8109F, -1.192F, 0.0579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, -2.5013F, 0.3666F, 0.1054F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(12, 62).addBox(-0.8109F, -0.891F, 0.5341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, -2.2831F, 0.3666F, 0.1054F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(76, 33).addBox(-0.8109F, 0.3164F, 0.779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 76).addBox(-0.8109F, -0.1086F, 0.729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, -1.8468F, 0.3666F, 0.1054F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(74, 75).addBox(-0.8109F, 0.3502F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, -0.7996F, 0.3666F, 0.1054F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 75).addBox(-0.8109F, -0.1873F, -0.7662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.875F, 0.7315F, -4.4879F, 0.5094F, 0.3666F, 0.1054F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(30, 64).addBox(-0.7962F, -0.2827F, -1.8106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.2F, 0.1315F, -2.9879F, 0.4363F, 0.2094F, 0.0349F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 75).addBox(-0.8F, -0.3042F, -1.3909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, -0.2685F, -1.8879F, 0.3665F, 0.0873F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 3.8919F, -4.6002F, -1.168F, -0.2449F, -1.6518F));

		PartDefinition cube_r233 = leftArm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(62, 19).addBox(0.0F, -0.65F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.292F, 0.1576F, -0.1423F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftArm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 62).addBox(0.0F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.292F, 0.1576F, -0.1423F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftArm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(72, 69).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(72, 66).addBox(-0.5F, -0.175F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.208F, 1.3114F, 14.8216F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftArm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.292F, 0.1576F, -0.1423F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.4F, 14.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 24).addBox(0.0F, 0.2F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 24).addBox(0.0F, 0.0F, -0.1F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.492F, -0.3001F, 0.4613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.0F, 0.0F, 0.5996F, -0.1245F, 0.1796F));

		PartDefinition cube_r238 = leftArm3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(13, 42).addBox(-0.91F, -0.01F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0014F, -0.3513F, 0.1866F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition cube_r239 = leftArm3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(28, 48).addBox(0.09F, 12.8446F, -2.062F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0014F, -0.3513F, -0.1134F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftArm3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(23, 37).addBox(0.09F, -0.01F, 0.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0014F, -0.3513F, -0.1134F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftArm3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(31, 0).addBox(0.09F, -0.01F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0014F, -0.3513F, 0.1866F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftArm4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(38, 59).addBox(0.09F, -0.01F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6986F, -5.3344F, 18.4468F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftArm4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(43, 48).addBox(0.09F, -0.01F, -1.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6986F, -3.7715F, 9.5836F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftArm4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 48).addBox(0.09F, -0.01F, -1.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.6986F, -0.3513F, 0.1866F, 1.9199F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.8919F, -4.6002F, -1.1209F, 0.144F, 1.6317F));

		PartDefinition cube_r245 = rightArm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(62, 19).mirror().addBox(-1.0F, -0.65F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.292F, 0.1576F, -0.1423F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightArm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-1.0F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.292F, 0.1576F, -0.1423F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightArm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(72, 66).mirror().addBox(-0.5F, -0.175F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.208F, 1.3114F, 14.8216F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, 0.0F, 0.5F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.292F, 0.1576F, -0.1423F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.4F, 14.9F, 0.219F, 0.1019F, -0.0214F));

		PartDefinition cube_r249 = rightArm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(5, 24).mirror().addBox(-1.0F, 0.2F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 24).mirror().addBox(-1.0F, 0.0F, -0.1F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.492F, -0.3001F, 0.4613F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.0F, 0.0F, 0.5996F, 0.1245F, -0.1796F));

		PartDefinition cube_r250 = rightArm3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(13, 42).mirror().addBox(-1.09F, -0.01F, -1.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0014F, -0.3513F, 0.1866F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition cube_r251 = rightArm3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-1.09F, 12.8446F, -2.062F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0014F, -0.3513F, -0.1134F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightArm3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(23, 37).mirror().addBox(-1.09F, -0.01F, 0.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0014F, -0.3513F, -0.1134F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightArm3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-1.09F, -0.01F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0014F, -0.3513F, 0.1866F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightArm4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(38, 59).mirror().addBox(-1.09F, -0.01F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6986F, -5.3344F, 18.4468F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightArm4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-1.09F, -0.01F, -1.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6986F, -3.7715F, 9.5836F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightArm4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(33, 48).mirror().addBox(-1.09F, -0.01F, -1.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6986F, -0.3513F, 0.1866F, 1.9199F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 52).addBox(-0.5F, -0.5444F, 0.0137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(79, 23).addBox(0.0F, -1.0694F, 1.0137F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3489F, 2.7038F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r257 = tail.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 58).addBox(0.0F, -0.9F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1556F, 1.5137F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r258 = tail.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0444F, 1.0137F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r259 = tail.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(78, 57).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0444F, 1.0137F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 52).addBox(-0.5F, -0.378F, -0.0201F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2027F, 2.9989F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r260 = tail2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(3, 80).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.378F, 1.9799F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r261 = tail2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(12, 80).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5898F, 1.5823F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r262 = tail2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(79, 75).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.378F, -0.0201F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r263 = tail2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 41).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.122F, -0.0201F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r264 = tail2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(57, 41).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.122F, -0.0201F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, -0.2667F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(6, 80).addBox(0.0F, -0.6667F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 80).addBox(0.0F, -0.5667F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1513F, 2.7914F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(9, 57).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2274F, 5.0732F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0116F, 2.9354F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.95F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.0909F, 0.156F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftLeg.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(17, 72).addBox(1.0F, 0.6448F, -0.6809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 8.1945F, 2.7936F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftLeg.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(72, 72).addBox(1.0F, 0.7236F, -0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(72, 14).addBox(1.0F, -0.0514F, -0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.5F, 8.1945F, 2.7936F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftLeg.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(66, 40).addBox(1.0F, 0.056F, 0.0389F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 5.6945F, 1.1186F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftLeg.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 64).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0089F, 0.6025F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftLeg.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3257F, -0.0699F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftLeg.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(5, 72).addBox(1.0F, -1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.9757F, -0.396F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftLeg.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(42, 66).addBox(1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 2.8874F, 0.2178F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftLeg.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(37, 66).addBox(1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.5F, 5.724F, 1.1945F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0385F, 10.0093F, 4.298F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftLeg2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(19, 68).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5385F, 1.1064F, 0.3879F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftLeg2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(74, 0).addBox(0.0F, 0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 57).addBox(0.0F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0385F, 12.4329F, 2.1598F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftLeg2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(66, 48).addBox(0.0F, -0.25F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0385F, 9.9363F, 2.029F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftLeg2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(43, 59).addBox(0.0F, -0.25F, -0.225F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0385F, 5.5915F, 0.7552F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftLeg2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -4.8F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(22, 72).addBox(-1.0F, -6.15F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0385F, 5.565F, 1.6312F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftLeg2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 7).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4615F, 0.5566F, -0.2123F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftLeg2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(73, 45).addBox(-1.0F, -0.95F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(0, 73).addBox(-1.0F, -0.25F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0385F, 12.7089F, 1.4891F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftLeg2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(66, 53).addBox(-1.0F, -0.175F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0385F, 10.675F, 2.0835F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftLeg2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, -0.175F, -0.15F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0385F, 2.1916F, 0.0311F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftLeg2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(67, 3).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4615F, 1.2895F, 0.3035F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(28, 37).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0385F, 13.8162F, 1.6812F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(35, 37).addBox(-1.5F, -0.5F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0081F, 9.0526F, 0.4857F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(10, 24).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offset(0.0F, 0.0052F, -2.6304F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 1.0909F, 0.156F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightLeg.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(-2.0F, 0.6448F, -0.6809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.5F, 8.1945F, 2.7936F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightLeg.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-2.0F, 0.7236F, -0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(72, 14).mirror().addBox(-2.0F, -0.0514F, -0.3643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.5F, 8.1945F, 2.7936F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightLeg.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-2.0F, 0.056F, 0.0389F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 5.6945F, 1.1186F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightLeg.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0089F, 0.6025F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightLeg.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(72, 6).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3257F, -0.0699F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightLeg.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-2.0F, -1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 0.9757F, -0.396F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightLeg.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(42, 66).mirror().addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5F, 2.8874F, 0.2178F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightLeg.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(37, 66).mirror().addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.5F, 5.724F, 1.1945F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0385F, 10.0093F, 4.298F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightLeg2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5385F, 1.1064F, 0.3879F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightLeg2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-1.0F, 0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(73, 57).mirror().addBox(-1.0F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 12.4329F, 2.1598F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightLeg2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-1.0F, -0.25F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 9.9363F, 2.029F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightLeg2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(43, 59).mirror().addBox(-1.0F, -0.25F, -0.225F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 5.5915F, 0.7552F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightLeg2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -4.8F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(22, 72).mirror().addBox(0.0F, -6.15F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 5.565F, 1.6312F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightLeg2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4615F, 0.5566F, -0.2123F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightLeg2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(0.0F, -0.95F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(0, 73).mirror().addBox(0.0F, -0.25F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 12.7089F, 1.4891F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightLeg2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(0.0F, -0.175F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 10.675F, 2.0835F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightLeg2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(0.0F, -0.175F, -0.15F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 2.1916F, 0.0311F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightLeg2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(67, 3).mirror().addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.4615F, 1.2895F, 0.3035F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-1.0F, -0.2F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 13.8162F, 1.6812F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(35, 37).mirror().addBox(-1.5F, -0.5F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0081F, 9.0526F, 0.4857F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(10, 24).mirror().addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offset(0.0F, 0.0052F, -2.6304F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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