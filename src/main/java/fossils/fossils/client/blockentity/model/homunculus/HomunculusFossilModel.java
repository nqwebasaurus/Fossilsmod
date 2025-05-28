package fossils.fossils.client.blockentity.model.homunculus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HomunculusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart thumbToe;
	private final ModelPart thumbToe2;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart thumbToe3;
	private final ModelPart thumbToe4;
	private final ModelPart rightLeg4;
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
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
	private final ModelPart tail11;

	public HomunculusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.thumbToe = this.leftLeg3.getChild("thumbToe");
		this.thumbToe2 = this.thumbToe.getChild("thumbToe2");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.thumbToe3 = this.rightLeg3.getChild("thumbToe3");
		this.thumbToe4 = this.thumbToe3.getChild("thumbToe4");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
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
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
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
		this.tail11 = this.tail10.getChild("tail11");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.0F, -12.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.6965F, 10.1261F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 16).addBox(0.0F, -0.8937F, -1.4061F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 24).addBox(0.0F, -1.2201F, -0.5189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(0.163F, -0.3321F, -0.3004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3974F, -2.5198F, -2.6766F, 0.1319F, -2.0518F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 37).mirror().addBox(-2.0F, -1.0206F, -2.94F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.0737F, 2.0339F, -0.7645F, 0.4513F, 0.4268F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 76).mirror().addBox(-0.3F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6529F, 0.9408F, 2.8582F, 0.1345F, -0.9832F, -1.4203F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-0.3247F, -0.7061F, -4.0766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -0.1836F, -0.4697F, -0.8846F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(-0.2286F, -0.7061F, -4.0492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -0.1673F, -0.2119F, -0.933F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.0735F, -0.6898F, -3.3081F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -0.0547F, 0.8935F, -0.4074F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(-0.6652F, -0.634F, -3.8497F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -0.1665F, 0.1878F, -0.7237F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-1.6216F, -0.722F, -0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -1.9908F, -1.4265F, 0.954F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(-1.5009F, -0.722F, -0.4897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -1.0748F, -1.421F, 0.0294F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-1.8254F, -0.722F, -0.974F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 1.7305F, 2.1345F, -2.786F, -1.1841F, 1.7696F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-2.0752F, -1.3437F, -2.336F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1874F, 1.2379F, 4.4525F, 0.2979F, -0.1961F, -1.3518F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(-1.0586F, -1.1437F, -0.5555F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1874F, 1.2379F, 4.4525F, 2.3315F, -1.468F, 2.6409F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(16, 42).mirror().addBox(-1.8591F, -0.9679F, -0.5656F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5476F, 1.9073F, 4.144F, 0.5364F, -1.2417F, -1.7166F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(0.8488F, 0.7335F, 0.2739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1874F, 1.2379F, 4.4525F, 1.0576F, -0.297F, 0.7833F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-0.1938F, 0.7335F, 0.3601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1874F, 1.2379F, 4.4525F, 1.0324F, -0.2444F, 0.8773F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-1.7488F, -0.3596F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 52).mirror().addBox(-0.9488F, -0.3596F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5476F, 1.9073F, 4.144F, 2.6903F, 1.0376F, -2.7716F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.4882F, -0.3596F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5476F, 1.9073F, 4.144F, 0.829F, 1.2654F, 1.5708F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(-0.0202F, -0.3596F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5476F, 1.9073F, 4.144F, 0.2739F, 0.6099F, 0.925F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.7177F, -0.1668F, -2.6071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1874F, 1.2379F, 4.4525F, 0.6094F, -0.5952F, 0.5015F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(46, 38).addBox(-0.6753F, -0.7061F, -4.0766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -0.1836F, 0.4697F, 0.8846F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 46).addBox(-0.7714F, -0.7061F, -4.0492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -0.1673F, 0.2119F, 0.933F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 38).addBox(-1.9265F, -0.6898F, -3.3081F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -0.0547F, -0.8935F, 0.4074F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 51).addBox(-1.3348F, -0.634F, -3.8497F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -0.1665F, -0.1878F, 0.7237F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 66).addBox(-0.3785F, -0.722F, -0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -1.9908F, 1.4265F, -0.954F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 66).addBox(-0.4991F, -0.722F, -0.4897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -1.0748F, 1.421F, -0.0294F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 6).addBox(-0.1746F, -0.722F, -0.974F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.63F, 1.7305F, 2.1345F, -2.786F, 1.1841F, -1.7696F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(50, 22).addBox(0.0752F, -1.3437F, -2.336F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1874F, 1.2379F, 4.4525F, 0.2979F, 0.1961F, 1.3518F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(56, 76).addBox(-0.7F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6529F, 0.9408F, 2.8582F, 0.1345F, 0.9832F, 1.4203F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 6).addBox(-1.9414F, -1.1437F, -0.5555F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1874F, 1.2379F, 4.4525F, 2.3315F, 1.468F, -2.6409F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(16, 42).addBox(-2.1409F, -0.9679F, -0.5656F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5476F, 1.9073F, 4.144F, 0.5364F, 1.2417F, 1.7166F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(73, 68).addBox(-1.8488F, 0.7335F, 0.2739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1874F, 1.2379F, 4.4525F, 1.0576F, 0.297F, -0.7833F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 65).addBox(-0.8062F, 0.7335F, 0.3601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1874F, 1.2379F, 4.4525F, 1.0324F, 0.2444F, -0.8773F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(60, 73).addBox(0.7488F, -0.3596F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 52).addBox(-0.0512F, -0.3596F, -0.9642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5476F, 1.9073F, 4.144F, 2.6903F, -1.0376F, 2.7716F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5118F, -0.3596F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5476F, 1.9073F, 4.144F, 0.829F, -1.2654F, -1.5708F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(74, 42).addBox(-0.9798F, -0.3596F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5476F, 1.9073F, 4.144F, 0.2739F, -0.6099F, -0.925F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 76).addBox(-0.163F, -0.3321F, -0.3004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3974F, -2.5198F, -2.6766F, -0.1319F, 2.0518F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 33).addBox(-1.2823F, -0.1668F, -2.6071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1874F, 1.2379F, 4.4525F, 0.6094F, 0.5952F, -0.5015F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(60, 36).addBox(-0.5F, -0.9903F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7648F, 6.4175F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(37, 41).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6648F, 5.2175F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(16, 37).addBox(0.0F, -1.0206F, -2.94F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 4.0737F, 2.0339F, -0.7645F, -0.4513F, -0.4268F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 33).addBox(-0.5F, -1.0206F, -2.94F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.0737F, 2.0339F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 28).addBox(-2.13F, -0.8832F, -1.7952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(20, 76).addBox(-2.13F, -0.8832F, -0.7952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.63F, 4.3305F, 3.8345F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 1.7524F, 4.3792F, -1.0223F, -0.2174F, -0.0135F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 6).addBox(-1.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 66).addBox(-1.0F, -1.8292F, -0.7664F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 9.1959F, -3.7199F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(32, 41).addBox(-1.0F, -0.5026F, -1.0104F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.5801F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 77).addBox(-1.0F, -2.6F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 13.028F, -2.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 28).addBox(-1.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 8.7785F, -4.7766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 55).addBox(-1.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.6785F, -2.4766F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3777F, -3.3907F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(57, 15).addBox(-1.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 9).addBox(-1.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(32, 55).addBox(-1.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 18).addBox(-1.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(10, 68).addBox(-1.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(11, 36).addBox(0.275F, -5.5F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 6.0555F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(27, 37).addBox(-1.9F, -0.0561F, 0.0321F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(26, 29).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -1.3801F, -0.1029F, -0.1974F));

		PartDefinition cube_r58 = leftLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 69).addBox(-1.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition thumbToe = leftLeg3.addOrReplaceChild("thumbToe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r59 = thumbToe.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(27, 48).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition thumbToe2 = thumbToe.addOrReplaceChild("thumbToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 3.3F, -0.4F, -0.037F, 0.151F, 0.0879F));

		PartDefinition cube_r60 = thumbToe2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 61).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.1F, 2.2F, 0.4F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(15, 10).addBox(-1.6F, -0.6629F, -3.9144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 5.3749F, 0.0205F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 1.7524F, 4.3792F, -1.0223F, 0.2174F, 0.0135F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 6).mirror().addBox(-0.5F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 66).mirror().addBox(0.0F, -1.8292F, -0.7664F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.1959F, -3.7199F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(32, 41).mirror().addBox(0.0F, -0.5026F, -1.0104F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.5801F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(0.0F, -2.6F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.028F, -2.3838F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(55, 28).mirror().addBox(-0.5F, 0.5897F, -0.0531F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.7785F, -4.7766F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-0.5F, 0.0185F, -2.2559F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.6785F, -2.4766F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.3777F, -3.3907F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(-0.5F, -0.0469F, 0.3654F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 9).mirror().addBox(-0.5F, -0.0469F, 0.0654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-0.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.5F, -0.4F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1517F, 0.8022F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(0.9F, -0.1589F, 0.5196F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(11, 36).mirror().addBox(-1.275F, -5.5F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0555F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(27, 37).mirror().addBox(0.9F, -0.0561F, 0.0321F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.7051F, -1.8679F, -1.3801F, 0.1029F, 0.1974F));

		PartDefinition cube_r73 = rightLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(0.0F, -1.6185F, -0.9027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4586F, 0.2937F, 0.0175F, 0.0F, 0.0F));

		PartDefinition thumbToe3 = rightLeg3.addOrReplaceChild("thumbToe3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.4557F, -0.1179F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r74 = thumbToe3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(0.2F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition thumbToe4 = thumbToe3.addOrReplaceChild("thumbToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 3.3F, -0.4F, -0.037F, -0.151F, -0.0879F));

		PartDefinition cube_r75 = thumbToe4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 61).mirror().addBox(0.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.2F, 0.4F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(15, 10).mirror().addBox(-1.4F, -0.6629F, -3.9144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 5.3749F, 0.0205F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 62).addBox(0.0F, -1.1751F, -0.317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 13).addBox(0.0F, -1.1577F, -0.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -0.3198F, -2.8511F, 0.1319F, -2.0518F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, -3.0275F, 0.0437F, -1.9348F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, -1.7802F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(47, 6).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -0.3198F, -2.8511F, -0.1319F, 2.0518F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 78).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, -3.0275F, -0.0437F, 1.9348F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 32).addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -4.3198F, -3.1416F, 0.0F, 1.7802F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(32, 37).addBox(0.0F, -1.1852F, -0.5263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, -0.0523F, -0.0023F, -0.0436F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(70, 61).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0452F, 0.1518F, 0.2305F, -0.5885F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0452F, 0.0861F, 0.2617F, -0.8566F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0452F, -0.0476F, 0.2712F, -1.3544F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, -0.0151F, 0.0731F, -0.7164F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, -0.0336F, 0.0667F, -0.9788F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 51).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, -0.0606F, 0.0436F, -1.4589F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4452F, 0.0388F, 0.1457F, -0.662F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4452F, -0.0005F, 0.1508F, -0.9267F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4452F, -0.0705F, 0.1334F, -1.4114F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2452F, 0.1073F, 0.2012F, -0.598F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2452F, 0.0509F, 0.222F, -0.865F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2452F, -0.0591F, 0.22F, -1.3572F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(-0.6985F, -0.4352F, -0.5588F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7636F, 8.0225F, -8.7117F, 0.4007F, -0.139F, -2.485F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(15, 8).mirror().addBox(-0.4458F, -0.6718F, -0.6517F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1538F, 8.8261F, -4.8908F, -0.7272F, -0.6827F, -1.9635F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-0.0458F, -0.6718F, -0.6517F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1538F, 8.8261F, -4.8908F, -0.5507F, -0.532F, -2.116F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-1.1458F, -0.6718F, -0.6517F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1538F, 8.8261F, -4.8908F, -0.3104F, -0.4806F, -2.5337F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.7458F, -0.6718F, -0.6517F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1538F, 8.8261F, -4.8908F, -0.1004F, -0.3019F, -2.9057F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 26).mirror().addBox(-0.5151F, -0.6594F, -0.6873F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.243F, 8.7237F, -6.4771F, -0.099F, -0.2714F, -2.945F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(71, 16).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, -0.0151F, -0.0731F, 0.7164F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 63).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, -0.0336F, -0.0667F, 0.9788F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 51).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, -0.0606F, -0.0436F, 1.4589F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(39, 72).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4452F, 0.0388F, -0.1457F, 0.662F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 72).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4452F, -0.0005F, -0.1508F, 0.9267F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 72).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4452F, -0.0705F, -0.1334F, 1.4114F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(34, 8).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0452F, -0.0476F, -0.2712F, 1.3544F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(55, 69).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0452F, 0.0861F, -0.2617F, 0.8566F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(70, 61).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0452F, 0.1518F, -0.2305F, 0.5885F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(66, 55).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2452F, 0.1073F, -0.2012F, 0.598F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -1.0006F, 0.072F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6805F, -7.3744F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(9, 48).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2452F, 0.0509F, -0.222F, 0.865F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(48, 20).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2452F, -0.0591F, -0.22F, 1.3572F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 23).addBox(-2.3015F, -0.4352F, -0.5588F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7636F, 8.0225F, -8.7117F, 0.4007F, 0.139F, 2.485F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(15, 8).addBox(-7.5542F, -0.6718F, -0.6517F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1538F, 8.8261F, -4.8908F, -0.7272F, 0.6827F, 1.9635F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(30, 6).addBox(-5.9542F, -0.6718F, -0.6517F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1538F, 8.8261F, -4.8908F, -0.5507F, 0.532F, 2.116F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 30).addBox(-4.8542F, -0.6718F, -0.6517F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1538F, 8.8261F, -4.8908F, -0.3104F, 0.4806F, 2.5337F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 0).addBox(-4.2542F, -0.6718F, -0.6517F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1538F, 8.8261F, -4.8908F, -0.1004F, 0.3019F, 2.9057F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(50, 26).addBox(-3.4849F, -0.6594F, -0.6873F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.243F, 8.7237F, -6.4771F, -0.099F, 0.2714F, 2.945F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 15).addBox(-0.5F, -0.0745F, -3.0935F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(78, 9).addBox(0.0F, -1.2612F, -0.94F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(67, 78).addBox(0.0F, -0.9972F, -1.0008F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.9F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 59).addBox(0.0F, -0.8551F, -1.0502F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(50, 78).addBox(0.0F, -0.938F, 0.0788F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -6.8F, 0.1658F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -6.6F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-0.1601F, -0.0979F, 0.9347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.5927F, -0.0426F, 0.2184F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.1661F, -1.1209F, -2.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.9432F, 0.3903F, 0.079F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-0.1601F, -2.2647F, -0.329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 2.1984F, -0.0426F, 0.2184F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-0.1601F, -1.6432F, 0.2986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 1.9453F, -0.0426F, 0.2184F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 10).mirror().addBox(-0.1601F, -1.3356F, 0.1249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.2F, -0.0426F, 0.2184F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-0.1601F, -1.9881F, -2.388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 1.2734F, -0.0426F, 0.2184F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 26).mirror().addBox(-5.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2452F, -0.0983F, -0.0204F, -1.5367F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2452F, -0.0967F, 0.0272F, -1.0591F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2452F, -0.0864F, 0.0513F, -0.7982F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, -0.0922F, 0.0434F, -0.6926F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, -0.1002F, 0.0182F, -0.9533F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, -0.0973F, -0.0301F, -1.4309F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(46, 28).mirror().addBox(-0.1601F, -0.6714F, -2.1377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.6014F, -0.0426F, 0.2184F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(61, 2).mirror().addBox(-0.1601F, -0.4041F, -2.5988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.741F, -0.0426F, 0.2184F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 53).mirror().addBox(-0.1601F, -0.2439F, -0.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7399F, 1.6671F, -2.4399F, 0.4618F, -0.0426F, 0.2184F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-2.2F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.9269F, -4.3752F, -0.8653F, -0.1141F, 0.8713F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(40, 66).addBox(-0.8339F, -1.1209F, -2.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.9432F, -0.3903F, -0.079F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 44).addBox(-0.8399F, -2.2647F, -0.329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 2.1984F, 0.0426F, -0.2184F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(50, 69).addBox(-0.8399F, -1.6432F, 0.2986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 1.9453F, 0.0426F, -0.2184F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 25).addBox(-0.8399F, -0.0979F, 0.9347F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.5927F, 0.0426F, -0.2184F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(41, 10).addBox(-0.8399F, -1.3356F, 0.1249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.2F, 0.0426F, -0.2184F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(60, 40).addBox(-0.8399F, -1.9881F, -2.388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 1.2734F, 0.0426F, -0.2184F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(71, 26).addBox(3.0551F, -2.1982F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2452F, -0.0983F, 0.0204F, 1.5367F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 14).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2452F, -0.0967F, -0.0272F, 1.0591F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(71, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2452F, -0.0864F, -0.0513F, 0.7982F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 50).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, -0.0922F, -0.0434F, 0.6926F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 48).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, -0.1002F, -0.0182F, 0.9533F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(54, 0).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, -0.0973F, 0.0301F, 1.4309F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(46, 28).addBox(-0.8399F, -0.6714F, -2.1377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.6014F, 0.0426F, -0.2184F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(61, 2).addBox(-0.8399F, -0.4041F, -2.5988F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.741F, 0.0426F, -0.2184F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(59, 53).addBox(-0.8399F, -0.2439F, -0.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7399F, 1.6671F, -2.4399F, 0.4618F, 0.0426F, -0.2184F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(55, 50).addBox(-0.8F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.9269F, -4.3752F, -0.8653F, 0.1141F, -0.8713F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(41, 2).addBox(-1.5F, -1.0587F, 1.7738F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3431F, -5.6378F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(39, 23).addBox(-1.0F, -0.913F, 1.1021F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5805F, -4.0744F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(78, 51).addBox(0.0F, -0.7476F, 0.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(78, 64).addBox(0.0F, -0.9815F, 0.0453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(61, 25).addBox(0.0F, -0.9617F, -0.0648F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -5.6F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.9889F, -0.0323F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3395F, 4.0799F, -4.3078F, 0.0172F, 0.003F, -0.1745F));

		PartDefinition cube_r167 = leftarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6507F, 0.6343F, 0.4798F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r168 = leftarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 45).addBox(-0.5F, -2.6F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1389F, 7.5529F, 6.0082F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(21, 59).addBox(0.0F, -5.0389F, -0.1208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6389F, 5.9977F, 2.542F, 0.5149F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0851F, 6.2406F, 3.7013F, -1.4137F, -0.2123F, 1.5781F));

		PartDefinition cube_r170 = leftarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 57).addBox(-0.1196F, -1.0378F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(55, 43).addBox(-0.1196F, -1.0378F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4064F, -0.152F, 0.0989F, 1.5708F, -1.5097F, -1.5708F));

		PartDefinition cube_r171 = leftarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 56).addBox(-0.4858F, -0.6529F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 36).addBox(-0.4858F, -0.6529F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4064F, -0.152F, 0.0989F, 1.5708F, -1.4224F, -1.5708F));

		PartDefinition cube_r172 = leftarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 60).addBox(-0.82F, -0.1166F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(60, 60).addBox(-0.82F, -0.1166F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1064F, 3.848F, 0.999F, -1.5708F, -1.4486F, 1.5708F));

		PartDefinition cube_r173 = leftarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(74, 36).addBox(-0.564F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.464F, 1.2298F, -0.0451F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition cube_r174 = leftarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(32, 59).addBox(-0.2142F, -0.1646F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7064F, 3.8149F, -0.7091F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r175 = leftarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 64).addBox(-0.9F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7064F, 1.2149F, 0.1909F, -1.5708F, -1.501F, 1.5708F));

		PartDefinition cube_r176 = leftarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(25, 74).addBox(-0.4189F, -1.1702F, -0.3172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4064F, -0.152F, 0.0989F, -1.5708F, -1.5446F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 7.8183F, -0.0529F, 0.6984F, 0.0417F, -0.2023F));

		PartDefinition cube_r177 = leftArm3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(5, 66).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r178 = leftArm3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(46, 43).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftArm4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(20, 72).addBox(-0.8F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r180 = leftArm4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(9, 50).addBox(-0.8F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3395F, 4.0799F, -4.3078F, 0.0172F, -0.003F, 0.1745F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.0F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6507F, 0.6343F, 0.4798F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 45).mirror().addBox(-0.5F, -2.6F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1389F, 7.5529F, 6.0082F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(21, 59).mirror().addBox(-1.0F, -5.0389F, -0.1208F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6389F, 5.9977F, 2.542F, 0.5149F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0851F, 6.2406F, 3.7013F, -1.4583F, 0.2136F, -1.5876F));

		PartDefinition cube_r184 = rightarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.8804F, -1.0378F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(55, 43).mirror().addBox(-0.8804F, -1.0378F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.152F, 0.0989F, 1.5708F, 1.5097F, 1.5708F));

		PartDefinition cube_r185 = rightarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(27, 56).mirror().addBox(-0.5142F, -0.6529F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(55, 36).mirror().addBox(-0.5142F, -0.6529F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.152F, 0.0989F, 1.5708F, 1.4224F, 1.5708F));

		PartDefinition cube_r186 = rightarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(55, 60).mirror().addBox(-0.18F, -0.1166F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(60, 60).mirror().addBox(-0.18F, -0.1166F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, 3.848F, 0.999F, -1.5708F, 1.4486F, -1.5708F));

		PartDefinition cube_r187 = rightarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.436F, -1.0149F, -0.2424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.464F, 1.2298F, -0.0451F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition cube_r188 = rightarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-0.7858F, -0.1646F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7064F, 3.8149F, -0.7091F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.1F, -0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7064F, 1.2149F, 0.1909F, -1.5708F, 1.501F, -1.5708F));

		PartDefinition cube_r190 = rightarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(25, 74).mirror().addBox(-0.5811F, -1.1702F, -0.3172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.152F, 0.0989F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 7.8183F, -0.0529F, 0.6984F, -0.0417F, 0.2023F));

		PartDefinition cube_r191 = rightArm3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r192 = rightArm3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7399F, -0.0221F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightArm4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.2F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r194 = rightArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(-2.2F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.685F, -5.5851F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r195 = neck3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(75, 3).addBox(-0.5F, -0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2907F, -0.6886F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r196 = neck2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 78).addBox(-0.1221F, 0.206F, -0.6656F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5775F, 0.6258F, -0.9F, -0.4247F, -0.3161F));

		PartDefinition cube_r197 = neck2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(18, 50).addBox(-0.5F, -0.1681F, 0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -1.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(12, 64).addBox(-1.0F, -0.7F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6428F, -4.5231F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(15, 69).addBox(-1.0F, -0.9276F, -0.045F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 3.5811F, -3.1344F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(68, 3).addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6945F, 4.1306F, -5.3026F, -0.1593F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.0632F, -4.9156F, 0.277F, -0.036F, 0.1259F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 31).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 4.0632F, -4.9156F, 0.277F, 0.036F, -0.1259F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, 0.175F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.5811F, -7.1344F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(55, 32).addBox(-1.0F, -0.9638F, -0.0514F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.7811F, -2.6344F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 0).addBox(-1.0F, -1.1264F, -1.6963F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.4811F, -3.4594F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(54, 66).addBox(-1.0F, -1.0264F, -0.9713F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 3.4811F, -3.4594F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(66, 52).addBox(-1.0F, -0.9639F, -1.0514F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.7811F, -2.6344F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(22, 69).addBox(-1.0F, -0.525F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 3.5281F, -5.1284F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 45).addBox(-1.0F, -0.75F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, 3.1526F, -5.1182F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(68, 21).addBox(-1.0F, -0.4874F, 1.2313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.3811F, -6.8344F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.7F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(10, 77).addBox(-0.3F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.478F, -5.1838F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.0814F, -5.236F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, 0.0115F, -0.3089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.7F, -5.8F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, 0.1865F, 0.0411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7F, -5.8F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(75, 75).addBox(-0.5F, 0.0003F, -1.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.7F, -4.7F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5F, -0.0249F, -1.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.3F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, 0.0359F, -1.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.9F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(46, 48).addBox(-0.5F, -1.0193F, -3.0244F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3131F, -0.8092F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(50, 53).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.254F, -4.3431F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(26, 23).addBox(-1.0F, 0.3F, -2.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.213F, -1.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(77, 61).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.0F, 0.168F, 0.4404F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 57).addBox(-1.0F, -0.9031F, -1.7718F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(46, 73).addBox(-1.0F, 0.3586F, 0.2408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.6494F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -0.3056F, -0.3658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.7494F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(41, 57).addBox(-1.0F, -0.3373F, -1.6362F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.1566F, 1.7506F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(72, 57).addBox(-1.0F, -0.3935F, 0.1127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.7566F, 0.3506F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(72, 71).addBox(-1.0F, -0.3204F, -0.2731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.7566F, 0.3506F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -0.3201F, -0.2608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.0494F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 9).addBox(-1.0F, -0.3108F, -0.2658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.4494F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(15, 72).addBox(-1.0F, -0.3414F, -0.8592F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(14, 59).addBox(-1.0F, -0.3414F, -2.2592F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.5F, -2.8566F, -0.6494F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 32).addBox(-1.0F, -0.3233F, -0.6833F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.3566F, -3.6494F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(59, 9).addBox(-1.0F, -0.3563F, -1.7251F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -2.1566F, -2.4494F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 4.2418F, -10.1604F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(66, 12).addBox(-0.8163F, 0.0798F, -1.0668F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1816F, -3.5823F, 9.6902F, 0.6915F, 0.6752F, 0.6508F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 20).addBox(-2.5447F, -0.52F, -0.2155F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1816F, -3.5323F, 9.6902F, 0.3893F, 0.2578F, 0.4543F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(36, 69).addBox(-0.4827F, -0.5062F, -0.2282F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1816F, -3.5323F, 9.6902F, 0.7808F, 1.0258F, 1.1334F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(77, 55).addBox(-1.2349F, -0.9668F, -0.3754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 69).addBox(-0.6349F, -0.9668F, -0.3754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.0511F, -2.1164F, 8.1242F, 0.7196F, 0.8213F, 1.7004F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(75, 21).addBox(-0.55F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3968F, -1.755F, 6.3998F, 0.7063F, 0.4802F, 1.2232F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(75, 18).addBox(-0.575F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.06F, -1.4412F, 6.782F, 0.8088F, 0.2309F, 1.1799F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(44, 62).addBox(-0.5817F, -0.5F, -0.7585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3968F, -1.755F, 6.3998F, 0.8246F, 0.6698F, 1.4391F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(67, 42).addBox(-0.7666F, -1.1551F, -0.6028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2167F, -2.9782F, 6.7313F, -0.636F, 1.3558F, 0.0733F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(41, 53).addBox(-0.8352F, -0.8831F, -0.1965F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2917F, -2.8782F, 6.7313F, -1.9051F, 1.2471F, 0.3319F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 53).addBox(-0.8352F, -0.8513F, -0.4375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.2917F, -2.8782F, 6.7313F, -2.3851F, 1.2471F, 0.3319F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 59).addBox(-1.7852F, -0.8216F, -0.4404F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3667F, -2.9532F, 6.7313F, -1.4324F, 1.3338F, 0.3697F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(55, 57).addBox(-1.625F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6685F, -3.3461F, 6.9531F, -1.0833F, 1.3268F, 0.4606F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 36).addBox(-1.7057F, -0.587F, -1.8771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8142F, -3.795F, 5.7966F, -1.1915F, 1.3873F, -1.2643F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(61, 66).addBox(-0.7982F, -1.3078F, -0.777F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2167F, -2.9782F, 6.7313F, -0.2395F, 1.5128F, -0.3165F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 39).addBox(-1.4982F, -1.2399F, -0.5101F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1591F, -3.0177F, 6.0276F, -0.2339F, 1.4315F, 0.0395F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(37, 62).addBox(0.0F, -0.0522F, -0.0417F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5359F, -6.6491F, 10.5774F, -0.7521F, 0.2083F, 0.6459F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(43, 69).addBox(0.0F, 0.0297F, -0.1358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5359F, -6.8927F, 9.7492F, -0.1724F, 0.1195F, 0.6005F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(16, 45).addBox(0.0F, 0.0173F, 0.0069F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1024F, -5.1581F, 8.191F, -0.0317F, -0.3477F, 1.6636F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(50, 11).addBox(0.0F, 0.0173F, 0.0069F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5359F, -6.2361F, 7.7986F, 0.2898F, -0.1975F, 0.582F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(64, 48).addBox(0.0335F, 0.0212F, -1.0126F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8916F, -4.6225F, 7.4286F, 0.2886F, -0.8824F, 1.6315F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(52, 2).addBox(-0.1664F, 0.1212F, -2.0126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5359F, -5.6361F, 6.9986F, 0.9006F, -0.1975F, 0.582F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(64, 29).addBox(0.0F, 0.0173F, -0.9931F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1024F, -5.1581F, 8.191F, 0.1543F, -0.649F, 1.6427F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(47, 66).addBox(0.0F, 0.0173F, -0.9931F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5359F, -6.2361F, 7.7986F, 0.6388F, -0.1975F, 0.582F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 6).addBox(-0.7527F, -0.552F, -0.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.2167F, -2.9782F, 6.7313F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 4.2418F, -10.1604F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(-1.1837F, 0.0798F, -1.0668F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1816F, -3.5823F, 9.6902F, 0.6915F, -0.6752F, -0.6508F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-0.4553F, -0.52F, -0.2155F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1816F, -3.5323F, 9.6902F, 0.3893F, -0.2578F, -0.4543F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-1.5173F, -0.5062F, -0.2282F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1816F, -3.5323F, 9.6902F, 0.7808F, -1.0258F, -1.1334F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(0.2349F, -0.9668F, -0.3754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 69).mirror().addBox(-1.3651F, -0.9668F, -0.3754F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.0511F, -2.1164F, 8.1242F, 0.7196F, -0.8213F, -1.7004F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-0.45F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3968F, -1.755F, 6.3998F, 0.7063F, -0.4802F, -1.2232F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.425F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.06F, -1.4412F, 6.782F, 0.8088F, -0.2309F, -1.1799F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(44, 62).mirror().addBox(-0.4183F, -0.5F, -0.7585F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3968F, -1.755F, 6.3998F, 0.8246F, -0.6698F, -1.4391F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-1.2334F, -1.1551F, -0.6028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2167F, -2.9782F, 6.7313F, -0.636F, -1.3558F, -0.0733F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(41, 53).mirror().addBox(-1.1648F, -0.8831F, -0.1965F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2917F, -2.8782F, 6.7313F, -1.9051F, -1.2471F, -0.3319F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-1.1648F, -0.8513F, -0.4375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.2917F, -2.8782F, 6.7313F, -2.3851F, -1.2471F, -0.3319F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-1.2148F, -0.8216F, -0.4404F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3667F, -2.9532F, 6.7313F, -1.4324F, -1.3338F, -0.3697F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(-1.375F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6685F, -3.3461F, 6.9531F, -1.0833F, -1.3268F, -0.4606F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-0.2943F, -0.587F, -1.8771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8142F, -3.795F, 5.7966F, -1.1915F, -1.3873F, 1.2643F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(-1.2018F, -1.3078F, -0.777F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2167F, -2.9782F, 6.7313F, -0.2395F, -1.5128F, 0.3165F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-0.5018F, -1.2399F, -0.5101F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1591F, -3.0177F, 6.0276F, -0.2339F, -1.4315F, -0.0395F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-2.0F, -0.0522F, -0.0417F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -6.6491F, 10.5774F, -0.7521F, -0.2083F, -0.6459F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(-2.0F, 0.0297F, -0.1358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -6.8927F, 9.7492F, -0.1724F, -0.1195F, -0.6005F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(16, 45).mirror().addBox(-2.0F, 0.0173F, 0.0069F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1024F, -5.1581F, 8.191F, -0.0317F, 0.3477F, -1.6636F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-2.0F, 0.0173F, 0.0069F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -6.2361F, 7.7986F, 0.2898F, 0.1975F, -0.582F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-2.0335F, 0.0212F, -1.0126F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8916F, -4.6225F, 7.4286F, 0.2886F, 0.8824F, -1.6315F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(52, 2).mirror().addBox(-1.8336F, 0.1212F, -2.0126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -5.6361F, 6.9986F, 0.9006F, 0.1975F, -0.582F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-2.0F, 0.0173F, -0.9931F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1024F, -5.1581F, 8.191F, 0.1543F, 0.649F, -1.6427F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(47, 66).mirror().addBox(-2.0F, 0.0173F, -0.9931F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5359F, -6.2361F, 7.7986F, 0.6388F, 0.1975F, -0.582F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(75, 6).mirror().addBox(-0.2473F, -0.552F, -0.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2167F, -2.9782F, 6.7313F, 0.1658F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3379F, -1.3581F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-1.0F, -1.435F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(74, 39).mirror().addBox(-1.0F, -0.935F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 74).addBox(1.2F, -1.435F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 39).addBox(1.2F, -0.935F, -0.1093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.9434F, -1.7968F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-1.0F, -1.5649F, -0.1351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(64, 14).addBox(1.2F, -1.5649F, -0.1351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.6F, 2.3434F, -1.9968F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.3F, 0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(75, 0).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 77).addBox(0.3F, 0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 0).addBox(0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.6226F, -4.8943F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 58).addBox(0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.2107F, -4.9084F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(0.0F, -0.525F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 74).addBox(0.6F, -0.525F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 1.8492F, -5.3481F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 48).addBox(1.6F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.4167F, -4.7755F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.002F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 67).addBox(1.602F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 2.3209F, -3.6797F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(64, 78).mirror().addBox(0.1F, -1.3F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 78).addBox(1.7F, -1.3F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 3.0008F, -3.4194F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.5F, -0.8278F, 0.019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 71).addBox(0.5F, -0.8278F, 0.019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1723F, -3.4585F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.5F, -1.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(65, 75).addBox(0.5F, -1.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 2.9474F, -3.5335F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(-1.0F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(65, 57).addBox(1.2F, -0.4F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6F, 2.4704F, -1.1552F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-1.0F, 0.0051F, -1.0192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(35, 77).addBox(1.2F, 0.0051F, -1.0192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6F, 2.6341F, 0.5601F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-1.0F, -0.6175F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(30, 77).addBox(1.2F, -0.6175F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6F, 2.4341F, 0.1601F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-1.0F, -0.0163F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(77, 71).addBox(1.2F, -0.0163F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6F, 3.6341F, 0.2601F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(-0.5F, 0.0084F, -0.9944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(71, 28).addBox(0.5F, 0.0084F, -0.9944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 3.8168F, -3.2154F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.5F, -0.3F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(5, 71).addBox(0.5F, -0.3F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 3.5168F, -1.5154F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-0.5F, -1.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(30, 74).addBox(1.5F, -1.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 3.5168F, -1.5154F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(51, 75).mirror().addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(51, 75).addBox(1.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 2.3859F, -2.1538F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 71).addBox(1.9F, -0.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 1.0152F, -0.2938F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(26, 65).mirror().addBox(-1.0F, 1.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(26, 65).addBox(1.2F, 1.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6F, -0.0566F, -0.4968F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3448F, 1.4809F, 0.3503F, 0.082F, 0.0299F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4299F, 3.1744F, 0.0056F, 0.3477F, 0.0317F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 10).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3885F, 4.5405F, 0.5579F, 0.2051F, 0.4511F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0334F, 3.7642F, 0.1509F, 0.5187F, 0.0752F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0133F, 3.9051F, -0.1295F, 0.6461F, -0.1129F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0413F, 3.9106F, 0.0037F, 0.7412F, 0.032F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0022F, 3.8968F, -0.0175F, 0.6981F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.0148F, 4.9669F, -0.0381F, 0.5671F, -0.0111F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, -0.5017F, -0.007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4148F, 4.6791F, 0.0134F, 0.2618F, 0.0023F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(26, 16).addBox(-0.5F, -0.5017F, -0.007F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0061F, 4.776F, 0.0003F, -0.1745F, -0.0031F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(35, 29).addBox(-0.5F, -0.5017F, -0.007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0061F, 4.8083F, 0.0209F, -0.6109F, 0.0031F));

		return LayerDefinition.create(meshdefinition, 82, 82);
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